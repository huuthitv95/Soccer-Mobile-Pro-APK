package com.tiktok.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class TimeUtil {
    private static final DateFormat sFormate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static String dateStr(int dayDifference) {
        try {
            Calendar calendar = Calendar.getInstance();
            if (dayDifference != 0) {
                calendar.add(5, dayDifference);
            }
            return sdf.format(calendar.getTime());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getISO8601Timestamp() {
        try {
            return getISO8601Timestamp(new Date());
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getISO8601Timestamp(Date date) {
        try {
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            DateFormat dateFormat = sFormate;
            dateFormat.setTimeZone(timeZone);
            return dateFormat.format(date);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean isNowAfter(String referenceStr, int days) {
        try {
            return dateStr(-days).equals(referenceStr);
        } catch (Throwable unused) {
            return false;
        }
    }
}
