package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.CGDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class CGDataSource {
    private static final String LOGTAG = "AIDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public CGDataSource(Context context) {
        dbhelper = new CGDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + CGDbHelper.TABLE_NAME + " WHERE " + CGDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(CGDbHelper._ID, id);
            values.put(CGDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(CGDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(CGDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(CGDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(CGDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(CGDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(CGDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(CGDbHelper._ID, id);
            updatedValues.put(CGDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(CGDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(CGDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(CGDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(CGDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(CGDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(CGDbHelper.TABLE_NAME, updatedValues, CGDbHelper._ID + "=" + id, null);
        }
    }
}
