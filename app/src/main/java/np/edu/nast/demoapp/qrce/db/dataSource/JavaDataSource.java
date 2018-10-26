package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.JavaDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class JavaDataSource {
    private static final String LOGTAG = "JavaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public JavaDataSource(Context context) {
        dbhelper = new JavaDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + JavaDbHelper.TABLE_NAME + " WHERE " + JavaDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(JavaDbHelper._ID, id);
            values.put(JavaDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(JavaDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(JavaDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(JavaDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(JavaDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(JavaDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(JavaDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(JavaDbHelper._ID, id);
            updatedValues.put(JavaDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(JavaDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(JavaDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(JavaDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(JavaDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(JavaDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(JavaDbHelper.TABLE_NAME, updatedValues, JavaDbHelper._ID + "=" + id, null);
        }
    }
}
