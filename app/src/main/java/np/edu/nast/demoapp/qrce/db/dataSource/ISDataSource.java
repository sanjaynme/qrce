package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.ISDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class ISDataSource {
    private static final String LOGTAG = "ISDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public ISDataSource(Context context) {
        dbhelper = new ISDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + ISDbHelper.TABLE_NAME + " WHERE " + ISDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(ISDbHelper._ID, id);
            values.put(ISDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(ISDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(ISDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(ISDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(ISDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(ISDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(ISDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(ISDbHelper._ID, id);
            updatedValues.put(ISDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(ISDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(ISDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(ISDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(ISDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(ISDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(ISDbHelper.TABLE_NAME, updatedValues, ISDbHelper._ID + "=" + id, null);
        }
    }
}
