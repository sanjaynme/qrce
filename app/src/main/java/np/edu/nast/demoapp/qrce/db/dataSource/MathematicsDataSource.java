package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.MathematicsDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class MathematicsDataSource {
    private static final String LOGTAG = "JavaDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public MathematicsDataSource(Context context) {
        dbhelper = new MathematicsDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + MathematicsDbHelper.TABLE_NAME + " WHERE " + MathematicsDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(MathematicsDbHelper._ID, id);
            values.put(MathematicsDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(MathematicsDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(MathematicsDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(MathematicsDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(MathematicsDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(MathematicsDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(MathematicsDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(MathematicsDbHelper._ID, id);
            updatedValues.put(MathematicsDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(MathematicsDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(MathematicsDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(MathematicsDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(MathematicsDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(MathematicsDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(MathematicsDbHelper.TABLE_NAME, updatedValues, MathematicsDbHelper._ID + "=" + id, null);
        }
    }
}
