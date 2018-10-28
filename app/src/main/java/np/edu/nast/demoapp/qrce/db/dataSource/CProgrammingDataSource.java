package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.CProgrammingDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.CProgrammingDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;

public class CProgrammingDataSource {
    private static final String LOGTAG = "CProgrammingDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public CProgrammingDataSource(Context context) {
        dbhelper = new CProgrammingDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + CProgrammingDbHelper.TABLE_NAME + " WHERE " + CProgrammingDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(CProgrammingDbHelper._ID, id);
            values.put(CProgrammingDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(CProgrammingDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(CProgrammingDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(CProgrammingDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(CProgrammingDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(CProgrammingDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(CProgrammingDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(CProgrammingDbHelper._ID, id);
            updatedValues.put(CProgrammingDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(CProgrammingDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(CProgrammingDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(CProgrammingDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(CProgrammingDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(CProgrammingDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(CProgrammingDbHelper.TABLE_NAME, updatedValues, CProgrammingDbHelper._ID + "=" + id, null);
        }
    }
}
