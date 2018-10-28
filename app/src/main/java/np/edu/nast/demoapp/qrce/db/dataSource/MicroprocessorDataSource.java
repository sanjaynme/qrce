package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.MicroDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class MicroprocessorDataSource {
    private static final String LOGTAG = "MicroDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public MicroprocessorDataSource(Context context) {
        dbhelper = new MicroDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + MicroDbHelper.TABLE_NAME + " WHERE " + MicroDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(MicroDbHelper._ID, id);
            values.put(MicroDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(MicroDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(MicroDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(MicroDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(MicroDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(MicroDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(MicroDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(MicroDbHelper._ID, id);
            updatedValues.put(MicroDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(MicroDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(MicroDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(MicroDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(MicroDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(MicroDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(MicroDbHelper.TABLE_NAME, updatedValues, MicroDbHelper._ID + "=" + id, null);
        }
    }
}
