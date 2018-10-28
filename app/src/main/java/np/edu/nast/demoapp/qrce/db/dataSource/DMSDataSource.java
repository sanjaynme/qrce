package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.DMSDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class DMSDataSource {
    private static final String LOGTAG = "DMSDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public DMSDataSource(Context context) {
        dbhelper = new DMSDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + DMSDbHelper.TABLE_NAME + " WHERE " + DMSDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(DMSDbHelper._ID, id);
            values.put(DMSDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(DMSDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(DMSDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(DMSDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(DMSDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(DMSDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(DMSDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(DMSDbHelper._ID, id);
            updatedValues.put(DMSDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(DMSDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(DMSDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(DMSDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(DMSDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(DMSDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(DMSDbHelper.TABLE_NAME, updatedValues, DMSDbHelper._ID + "=" + id, null);
        }
    }
}
