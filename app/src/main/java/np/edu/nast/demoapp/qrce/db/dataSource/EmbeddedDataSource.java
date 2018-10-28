package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.EmbeddedDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class EmbeddedDataSource {
    private static final String LOGTAG = "EmbeddedDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public EmbeddedDataSource(Context context) {
        dbhelper = new EmbeddedDbHelper(context);
    }

    public void open() {
        Log.d(LOGTAG, "Database opened!");
        database = dbhelper.getWritableDatabase();
    }

    public void close() {
        Log.d(LOGTAG, "Database closed!");
        dbhelper.close();
    }

    public void insertOrUpdateGkQuestion(QuestionModel question) {
        long id = Long.parseLong(question.getId());
        Cursor c = database.rawQuery("SELECT * FROM " + EmbeddedDbHelper.TABLE_NAME + " WHERE " + EmbeddedDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(EmbeddedDbHelper._ID, id);
            values.put(EmbeddedDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(EmbeddedDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(EmbeddedDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(EmbeddedDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(EmbeddedDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(EmbeddedDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(EmbeddedDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(EmbeddedDbHelper._ID, id);
            updatedValues.put(EmbeddedDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(EmbeddedDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(EmbeddedDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(EmbeddedDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(EmbeddedDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(EmbeddedDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(EmbeddedDbHelper.TABLE_NAME, updatedValues, EmbeddedDbHelper._ID + "=" + id, null);
        }
    }
}
