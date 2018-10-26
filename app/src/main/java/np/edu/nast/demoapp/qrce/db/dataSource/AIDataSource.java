package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.AIDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class AIDataSource {
    private static final String LOGTAG = "AIDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public AIDataSource(Context context) {
        dbhelper = new AIDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + AIDbHelper.TABLE_NAME + " WHERE " + AIDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(AIDbHelper._ID, id);
            values.put(AIDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(AIDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(AIDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(AIDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(AIDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(AIDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(AIDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(AIDbHelper._ID, id);
            updatedValues.put(AIDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(AIDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(AIDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(AIDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(AIDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(AIDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(AIDbHelper.TABLE_NAME, updatedValues, AIDbHelper._ID + "=" + id, null);
        }
    }
}
