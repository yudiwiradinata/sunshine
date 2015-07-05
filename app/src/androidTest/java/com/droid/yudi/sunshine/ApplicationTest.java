package com.droid.yudi.sunshine;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    private void test(){
        String dbPath = "C:\\sqlite\\sunshine.db";

        SQLiteDatabase db = null;

        try {

            /*
            ProviderDBHelper dbHelper = new ProviderDBHelper(getContext(), dbPath, version);

            db = dbHelper.getWritableDatabase();

            CProvider cProvider = getProvider();

            // a wrapper to method that iterates over cursor to populate objects, for example
            Collection<YourObjects> list = cProvider.getObjects(db);

*/

        } catch (Throwable t) {
            fail(t.getMessage());
        }
    }



}