package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.BasicElectricalDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.JavaDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class BElectricalDataSource {
    private static final String LOGTAG = "BElectricalDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public BElectricalDataSource(Context context) {
        dbhelper = new BasicElectricalDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + BasicElectricalDbHelper.TABLE_NAME + " WHERE " + BasicElectricalDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(BasicElectricalDbHelper._ID, id);
            values.put(BasicElectricalDbHelper.COLUMN_QUESTION, question.getQuestion());
            values.put(BasicElectricalDbHelper.COLUMN_OPTION_A, question.getOptionA());
            values.put(BasicElectricalDbHelper.COLUMN_OPTION_B, question.getOptionB());
            values.put(BasicElectricalDbHelper.COLUMN_OPTION_C, question.getOptionC());
            values.put(BasicElectricalDbHelper.COLUMN_OPTION_D, question.getOptionD());
            values.put(BasicElectricalDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(BasicElectricalDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(BasicElectricalDbHelper._ID, id);
            updatedValues.put(BasicElectricalDbHelper.COLUMN_QUESTION, question.getQuestion());
            updatedValues.put(BasicElectricalDbHelper.COLUMN_OPTION_A, question.getOptionA());
            updatedValues.put(BasicElectricalDbHelper.COLUMN_OPTION_B, question.getOptionB());
            updatedValues.put(BasicElectricalDbHelper.COLUMN_OPTION_C, question.getOptionC());
            updatedValues.put(BasicElectricalDbHelper.COLUMN_OPTION_D, question.getOptionD());
            updatedValues.put(BasicElectricalDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(BasicElectricalDbHelper.TABLE_NAME, updatedValues, BasicElectricalDbHelper._ID + "=" + id, null);
        }
    }
}
