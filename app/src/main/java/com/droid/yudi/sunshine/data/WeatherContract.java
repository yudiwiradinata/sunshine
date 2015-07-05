package com.droid.yudi.sunshine.data;


import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * Created by probook4420s on 7/5/2015.
 */
public class WeatherContract {

    public static final String CONTENT_AUTHORITY = "com.droid.yudi.sunshine";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_WEATHER = "weather";
    public static final String PATH_LOCATION = "location";


    public static long NORMALIZE_DATE(long startDate){
        /*
        Time time = new Time();
        time.setToNow();
        int julianDay = Time.getJulianDay(startDate, time.gmtoff);
        return time.setJulianDay(julianDay);
        */

        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.

        return d1.getTime();
    }

    public static final class LocationEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_LOCATION).build();

        public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_LOCATION;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_LOCATION;

        public static final String TABLE_NAME = "location";

        public static final String COLUMN_LOCATION_SETTING = "location_setting";
        public static final String COLUMN_CITY_NAME = "city_name";
        public static final String COLUMN_COORD_LAT = "coord_lat";
        public static final String COLUMN_COORD_LONG = "coord_long";

    }

    public static final class WeatherEntry implements BaseColumns {
        public static final String TABLE_NAME = "weather";

        public static final String COLUMN_LOC_KEY = "location_id";
        public static final String COLUMN_DATE = "date";
        public static final String COLUMN_WEATHER_ID = "weather_id";
        public static final String COLUMN_SHORT_DESC = "short_desc";

        public static final String COLUMN_MIN_TEMP  = "min";
        public static final String COLUMN_MAX_TEMP  = "max";
        public static final String COLUMN_HUMIDITY  = "humidity";
        public static final String COLUMN_PRESSURE  = "pressure";
        public static final String COLUMN_WIND_SPEED  = "wind";
        // Degrees are meteorological degrees (e.g, 0 is north, 180 is south).  Stored as floats.
        public static final String COLUMN_DEGREES = "degrees";

    }
}
