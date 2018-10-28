package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.LokSewaDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class LokSewaDataSource {
    private static final String LOGTAG = "LokSewaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public LokSewaDataSource(Context context) {
        dbhelper = new LokSewaDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + LokSewaDbHelper.TABLE_NAME + " WHERE " + LokSewaDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(LokSewaDbHelper._ID, id);
            values.put(LokSewaDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(LokSewaDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(LokSewaDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(LokSewaDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(LokSewaDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(LokSewaDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(LokSewaDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(LokSewaDbHelper._ID, id);
            updatedValues.put(LokSewaDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(LokSewaDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(LokSewaDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(LokSewaDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(LokSewaDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(LokSewaDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(LokSewaDbHelper.TABLE_NAME, updatedValues, LokSewaDbHelper._ID + "=" + id, null);
        }
    }
}
