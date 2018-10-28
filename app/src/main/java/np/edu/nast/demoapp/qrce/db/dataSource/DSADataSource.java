package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.DSADbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class DSADataSource {
    private static final String LOGTAG = "DSADataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public DSADataSource(Context context) {
        dbhelper = new DSADbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + DSADbHelper.TABLE_NAME + " WHERE " + DSADbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(DSADbHelper._ID, id);
            values.put(DSADbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(DSADbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(DSADbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(DSADbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(DSADbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(DSADbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(DSADbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(DSADbHelper._ID, id);
            updatedValues.put(DSADbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(DSADbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(DSADbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(DSADbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(DSADbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(DSADbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(DSADbHelper.TABLE_NAME, updatedValues, DSADbHelper._ID + "=" + id, null);
        }
    }
}
