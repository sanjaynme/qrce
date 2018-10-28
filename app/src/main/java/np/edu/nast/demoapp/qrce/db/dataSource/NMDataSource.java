package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.NMDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class NMDataSource {
    private static final String LOGTAG = "NMDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public NMDataSource(Context context) {
        dbhelper = new NMDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + NMDbHelper.TABLE_NAME + " WHERE " + NMDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(NMDbHelper._ID, id);
            values.put(NMDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(NMDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(NMDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(NMDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(NMDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(NMDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(NMDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(NMDbHelper._ID, id);
            updatedValues.put(NMDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(NMDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(NMDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(NMDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(NMDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(NMDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(NMDbHelper.TABLE_NAME, updatedValues, NMDbHelper._ID + "=" + id, null);
        }
    }
}
