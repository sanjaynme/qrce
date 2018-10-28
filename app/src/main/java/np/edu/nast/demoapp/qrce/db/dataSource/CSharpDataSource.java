package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.CSharpDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class CSharpDataSource {
    private static final String LOGTAG = "JavaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public CSharpDataSource(Context context) {
        dbhelper = new CSharpDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + CSharpDbHelper.TABLE_NAME + " WHERE " + CSharpDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(CSharpDbHelper._ID, id);
            values.put(CSharpDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(CSharpDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(CSharpDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(CSharpDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(CSharpDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(CSharpDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(CSharpDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(CSharpDbHelper._ID, id);
            updatedValues.put(CSharpDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(CSharpDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(CSharpDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(CSharpDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(CSharpDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(CSharpDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(CSharpDbHelper.TABLE_NAME, updatedValues, CSharpDbHelper._ID + "=" + id, null);
        }
    }
}
