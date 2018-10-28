package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.OOSEDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class OOSEDataSource {
    private static final String LOGTAG = "JavaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public OOSEDataSource(Context context) {
        dbhelper = new OOSEDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + OOSEDbHelper.TABLE_NAME + " WHERE " + OOSEDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(OOSEDbHelper._ID, id);
            values.put(OOSEDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(OOSEDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(OOSEDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(OOSEDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(OOSEDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(OOSEDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(OOSEDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(OOSEDbHelper._ID, id);
            updatedValues.put(OOSEDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(OOSEDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(OOSEDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(OOSEDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(OOSEDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(OOSEDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(OOSEDbHelper.TABLE_NAME, updatedValues, OOSEDbHelper._ID + "=" + id, null);
        }
    }
}
