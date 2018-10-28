package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.OOPInCPPDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class OOPInCPPDataSource {
    private static final String LOGTAG = "OOPInCPPDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public OOPInCPPDataSource(Context context) {
        dbhelper = new OOPInCPPDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + OOPInCPPDbHelper.TABLE_NAME + " WHERE " + OOPInCPPDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(OOPInCPPDbHelper._ID, id);
            values.put(OOPInCPPDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(OOPInCPPDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(OOPInCPPDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(OOPInCPPDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(OOPInCPPDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(OOPInCPPDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(OOPInCPPDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(OOPInCPPDbHelper._ID, id);
            updatedValues.put(OOPInCPPDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(OOPInCPPDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(OOPInCPPDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(OOPInCPPDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(OOPInCPPDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(OOPInCPPDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(OOPInCPPDbHelper.TABLE_NAME, updatedValues, OOPInCPPDbHelper._ID + "=" + id, null);
        }
    }
}
