package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.NEADbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class NEADataSource {
    private static final String LOGTAG = "NEADataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public NEADataSource(Context context) {
        dbhelper = new NEADbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + NEADbHelper.TABLE_NAME + " WHERE " + NEADbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(NEADbHelper._ID, id);
            values.put(NEADbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(NEADbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(NEADbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(NEADbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(NEADbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(NEADbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(NEADbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(NEADbHelper._ID, id);
            updatedValues.put(NEADbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(NEADbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(NEADbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(NEADbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(NEADbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(NEADbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(NEADbHelper.TABLE_NAME, updatedValues, NEADbHelper._ID + "=" + id, null);
        }
    }
}
