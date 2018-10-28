package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.NTCDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class NTCDataSource {
    private static final String LOGTAG = "NTCDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public NTCDataSource(Context context) {
        dbhelper = new NTCDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + NTCDbHelper.TABLE_NAME + " WHERE " + NTCDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(NTCDbHelper._ID, id);
            values.put(NTCDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(NTCDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(NTCDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(NTCDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(NTCDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(NTCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(NTCDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(NTCDbHelper._ID, id);
            updatedValues.put(NTCDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(NTCDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(NTCDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(NTCDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(NTCDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(NTCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(NTCDbHelper.TABLE_NAME, updatedValues, NTCDbHelper._ID + "=" + id, null);
        }
    }
}
