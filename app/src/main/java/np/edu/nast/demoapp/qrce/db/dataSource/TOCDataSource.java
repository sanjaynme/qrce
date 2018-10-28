package np.edu.nast.demoapp.qrce.db.dataSource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import np.edu.nast.demoapp.qrce.db.dbhelpers.TOCDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;


public class TOCDataSource {
    private static final String LOGTAG = "TOCDataSource";
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase database;

    public TOCDataSource(Context context) {
        dbhelper = new TOCDbHelper(context);
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
        Cursor c = database.rawQuery("SELECT * FROM " + TOCDbHelper.TABLE_NAME + " WHERE " + TOCDbHelper._ID + "=" + id, null);
        if (c.getCount() == 0) {
            //if the row is not present,then insert the row
            ContentValues values = new ContentValues();
            values.put(TOCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.insert(TOCDbHelper.TABLE_NAME, null, values);
        } else {
            //else update the row
            ContentValues updatedValues = new ContentValues();
            updatedValues.put(TOCDbHelper.COLUMN_ANSWER, question.getAnswer());
            database.update(TOCDbHelper.TABLE_NAME, updatedValues, TOCDbHelper._ID + "=" + id, null);
        }
    }
}
