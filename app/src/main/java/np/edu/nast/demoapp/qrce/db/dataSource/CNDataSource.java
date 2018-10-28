package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.CNDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class CNDataSource {
    private static final String LOGTAG = "CNDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public CNDataSource(Context context) {
        dbhelper = new CNDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + CNDbHelper.TABLE_NAME + " WHERE " + CNDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(CNDbHelper._ID, id);
            values.put(CNDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(CNDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(CNDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(CNDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(CNDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(CNDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(CNDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(CNDbHelper._ID, id);
            updatedValues.put(CNDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(CNDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(CNDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(CNDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(CNDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(CNDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(CNDbHelper.TABLE_NAME, updatedValues, CNDbHelper._ID + "=" + id, null);
        }
    }
}
