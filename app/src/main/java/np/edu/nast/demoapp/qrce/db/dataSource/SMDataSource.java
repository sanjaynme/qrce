package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.SMDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class SMDataSource {
    private static final String LOGTAG = "SMDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public SMDataSource(Context context) {
        dbhelper = new SMDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + SMDbHelper.TABLE_NAME + " WHERE " + SMDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(SMDbHelper._ID, id);
            values.put(SMDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(SMDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(SMDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(SMDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(SMDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(SMDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(SMDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(SMDbHelper._ID, id);
            updatedValues.put(SMDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(SMDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(SMDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(SMDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(SMDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(SMDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(SMDbHelper.TABLE_NAME, updatedValues, SMDbHelper._ID + "=" + id, null);
        }
    }
}
