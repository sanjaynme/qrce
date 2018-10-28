package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.EDCDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class EDCDataSource {
    private static final String LOGTAG = "EDCDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public EDCDataSource(Context context) {
        dbhelper = new EDCDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + EDCDbHelper.TABLE_NAME + " WHERE " + EDCDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(EDCDbHelper._ID, id);
            values.put(EDCDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(EDCDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(EDCDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(EDCDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(EDCDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(EDCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(EDCDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(EDCDbHelper._ID, id);
            updatedValues.put(EDCDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(EDCDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(EDCDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(EDCDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(EDCDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(EDCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(EDCDbHelper.TABLE_NAME, updatedValues, EDCDbHelper._ID + "=" + id, null);
        }
    }
}
