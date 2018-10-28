package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.DataComDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class DataComDataSource {
    private static final String LOGTAG = "DataComDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public DataComDataSource(Context context) {
        dbhelper = new DataComDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + DataComDbHelper.TABLE_NAME + " WHERE " + DataComDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(DataComDbHelper._ID, id);
            values.put(DataComDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(DataComDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(DataComDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(DataComDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(DataComDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(DataComDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(DataComDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(DataComDbHelper._ID, id);
            updatedValues.put(DataComDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(DataComDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(DataComDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(DataComDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(DataComDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(DataComDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(DataComDbHelper.TABLE_NAME, updatedValues, DataComDbHelper._ID + "=" + id, null);
        }
    }
}
