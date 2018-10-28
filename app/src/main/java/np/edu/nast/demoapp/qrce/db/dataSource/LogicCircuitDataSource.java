package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.LogicCircuitDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class LogicCircuitDataSource {
    private static final String LOGTAG = "LogicCircuitDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public LogicCircuitDataSource(Context context) {
        dbhelper = new LogicCircuitDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + LogicCircuitDbHelper.TABLE_NAME + " WHERE " + LogicCircuitDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(LogicCircuitDbHelper._ID, id);
            values.put(LogicCircuitDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(LogicCircuitDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(LogicCircuitDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(LogicCircuitDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(LogicCircuitDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(LogicCircuitDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(LogicCircuitDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(LogicCircuitDbHelper._ID, id);
            updatedValues.put(LogicCircuitDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(LogicCircuitDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(LogicCircuitDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(LogicCircuitDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(LogicCircuitDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(LogicCircuitDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(LogicCircuitDbHelper.TABLE_NAME, updatedValues, LogicCircuitDbHelper._ID + "=" + id, null);
        }
    }
}
