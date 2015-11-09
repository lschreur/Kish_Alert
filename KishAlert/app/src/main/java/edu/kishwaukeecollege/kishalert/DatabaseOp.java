package edu.kishwaukeecollege.kishalert;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Aaron on 11/4/2015.
 */
public class DatabaseOp extends SQLiteOpenHelper {
    //Building the database cols
    public static final int database_version = 1;
    public static final String CLASS = "class";
   /* public static final String W_DUE = "w_due";
    public static final String DUE_DATE = "due_date";
    public static final String REMINDER = "reminder";
    public static final String DID_REMIND = "did_remind";
*/    public static final String DATABASE_NAME = "kish_alert_database";
    public static final String TABLE_NAME = "user_info";
    //Query that is used to create the main table for the database
  //  public String CREATE_QUERY="CREATE TABLE"+TABLE_NAME+"("+CLASS+"TEXT, "+W_DUE+"DATE,"+DUE_DATE+"date"+REMINDER+"INTEGER,"+DID_REMIND+"CHAR);";
    public String CREATE_QUERY="CREATE TABLE " + TABLE_NAME + "("+CLASS+" TEXT);";

    public DatabaseOp(Context context) {
        super(context, DATABASE_NAME, null, database_version);
        Log.v("Databaseops", "Database Created");

    }

    @Override
    //runs when ever new table is created
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
        Log.v("Databaseops", "table Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //adding data into the database
    public void addInfo(DatabaseOp dop, String name ){
        SQLiteDatabase sql = dop.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(CLASS, name);
        long k = sql.insert(TABLE_NAME,null,cv);
        Log.v("inserted", "one row inserted");
    }
}
