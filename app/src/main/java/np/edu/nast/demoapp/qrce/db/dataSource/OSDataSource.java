package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.OSDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class OSDataSource {
    private static final String LOGTAG = "JavaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public OSDataSource(Context context) {
        dbhelper = new OSDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + OSDbHelper.TABLE_NAME + " WHERE " + OSDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(OSDbHelper._ID, id);
            values.put(OSDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(OSDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(OSDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(OSDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(OSDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(OSDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(OSDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(OSDbHelper._ID, id);
            updatedValues.put(OSDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(OSDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(OSDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(OSDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(OSDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(OSDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(OSDbHelper.TABLE_NAME, updatedValues, OSDbHelper._ID + "=" + id, null);
        }
    }
}
