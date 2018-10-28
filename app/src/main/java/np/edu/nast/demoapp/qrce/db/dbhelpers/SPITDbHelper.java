package np.edu.nast.demoapp.qrce.db.dbhelpers;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

import np.edu.nast.demoapp.qrce.model.QuestionModel;

/**
 * Created by Vikesh PC on 08-04-2016.
 */
public class SPITDbHelper extends SQLiteOpenHelper {

    private static final String Database_path = "/data/data/np.edu.nast.demoapp.qrce/databases/";
    private static final String Database_name = "social_and_professional_issues_in_it.db";//NAME of database stored in Assets folder
    public static final String TABLE_NAME = "social_and_professional_issues_in_it";//name of table
    public static final String _ID = "_id";//name of column1
    public static final String COLUMN_QUESTION = "Question";//name of column2
    public static final String COLUMN_OPTION_A = "OptionA";//name of column3
    public static final String COLUMN_OPTION_B = "OptionB";//name of column4
    public static final String COLUMN_OPTION_C = "OptionC";//name of column5
    public static final String COLUMN_OPTION_D = "OptionD";//name of column6
    public static final String COLUMN_ANSWER = "Answer";//name of column7
    private static final int version = 1;//version of database signifies if there is any upgradation or not
    private Context context;//Context object to get context from Question Activity
    private SQLiteDatabase db;

    public SPITDbHelper(Context context) {//constructor
        super(context, Database_name, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                TABLE_NAME + " ( " +
                _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_QUESTION + " TEXT, " +
                COLUMN_OPTION_A + " TEXT, " +
                COLUMN_OPTION_B + " TEXT, " +
                COLUMN_OPTION_C + " TEXT, " +
                COLUMN_OPTION_D + " TEXT, " +
                COLUMN_ANSWER + " INTEGER " +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        Toast.makeText(context, "Table " + TABLE_NAME + " is created successfully. ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public String readQuestion(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field  note that Ans is just a local string not related to Answer or Option...
        String[] columns = {SPITDbHelper._ID, SPITDbHelper.COLUMN_QUESTION};
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + COLUMN_QUESTION + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
//        Cursor c = this.db.query(QrceDbHelper.TABLE_NAME, columns, null, null, null, null, null);
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }

    public ArrayList<QuestionModel> readSize()//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        ArrayList<QuestionModel> qsnSize = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        if (cursor.moveToFirst()) {
            do {
                QuestionModel category = new QuestionModel();
                category.setId(String.valueOf(cursor.getInt(cursor.getColumnIndex(_ID))));
                category.setQuestion(cursor.getString(cursor.getColumnIndex(COLUMN_QUESTION)));
                qsnSize.add(category);

            } while (cursor.moveToNext());
        }
        cursor.close();
        return qsnSize;
    }

    public String readOptionA(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        db = getReadableDatabase();
        String Ans = "";//string that contains the required field  note that Ans is just a local string not related to Answer or Option...
        Cursor c = db.rawQuery("SELECT " + COLUMN_OPTION_A + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }

    public String readOptionB(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        db = getReadableDatabase();
        String Ans = "";//string that contains the required field  note that Ans is just a local string not related to Answer or Option...
        Cursor c = db.rawQuery("SELECT " + COLUMN_OPTION_B + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }

    public String readOptionC(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field  note that Ans is just a local string not related to Answer or Option...
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + COLUMN_OPTION_C + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }

    public String readOptionD(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field  note that Ans is just a local string not related to Answer or Option...
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + COLUMN_OPTION_D + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }

    public String readAnswer(int i)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + COLUMN_ANSWER + " FROM " + TABLE_NAME + " WHERE " + _ID + " = " + i + "", null);//cursor to that query
        if (c.moveToFirst())
            Ans = c.getString(0);
        else
            Ans = "";
        return Ans;
    }
}
