package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.SPITDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class SPITDataSource {
    private static final String LOGTAG = "SPITDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public SPITDataSource(Context context) {
        dbhelper = new SPITDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + SPITDbHelper.TABLE_NAME + " WHERE " + SPITDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(SPITDbHelper._ID, id);
            values.put(SPITDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(SPITDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(SPITDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(SPITDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(SPITDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(SPITDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(SPITDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(SPITDbHelper._ID, id);
            updatedValues.put(SPITDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(SPITDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(SPITDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(SPITDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(SPITDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(SPITDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(SPITDbHelper.TABLE_NAME, updatedValues, SPITDbHelper._ID + "=" + id, null);
        }
    }
}
