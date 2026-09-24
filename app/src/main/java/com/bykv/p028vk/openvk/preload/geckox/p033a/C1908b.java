package com.bykv.p028vk.openvk.preload.geckox.p033a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bykv.p028vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p028vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.p028vk.openvk.preload.geckox.utils.C1964a;
import com.bykv.p028vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.b */
/* JADX INFO: compiled from: AbandonChannelSQLiteHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class C1908b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    private static volatile C1908b f4320a;

    private C1908b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory, 1);
    }

    /* JADX INFO: renamed from: a */
    public static C1908b m5910a(Context context) {
        if (f4320a == null) {
            synchronized (C1908b.class) {
                if (f4320a == null) {
                    f4320a = new C1908b(context.getApplicationContext(), "geckox_clean_statistic" + C1964a.m6067a() + ".db", null);
                }
            }
        }
        return f4320a;
    }

    /* JADX INFO: renamed from: a */
    final List<StatisticModel.PackageStatisticModel> m5911a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorQuery = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
            if (cursorQuery == null) {
                return arrayList;
            }
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("access_key"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("channel"));
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_type"));
                    int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                    long j = cursorQuery.getInt(cursorQuery.getColumnIndex("pkg_id"));
                    int i3 = cursorQuery.getInt(cursorQuery.getColumnIndex("err_code"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("err_msg"));
                    int i4 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_strategy"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("clean_duration"));
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    packageStatisticModel.accessKey = string;
                    packageStatisticModel.channel = string2;
                    packageStatisticModel.statsType = Integer.valueOf(i2);
                    packageStatisticModel.f4452id = Long.valueOf(j);
                    packageStatisticModel.errCode = i3 == 0 ? null : String.valueOf(i3);
                    packageStatisticModel.errMsg = string3;
                    packageStatisticModel.cleanType = Integer.valueOf(i);
                    packageStatisticModel.cleanDuration = Long.valueOf(j2);
                    packageStatisticModel.cleanStrategy = Integer.valueOf(i4);
                    arrayList.add(packageStatisticModel);
                } catch (Exception e) {
                    e = e;
                    cursor = cursorQuery;
                    GeckoLogger.m6043w("clean-channel", "get all statistic failed!", e);
                    cursorQuery = cursor;
                }
            }
            getWritableDatabase().delete("geckox_clean_statistic", null, null);
            CloseableUtils.close(cursorQuery);
            return arrayList;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m5912a(String str, String str2, int i, int i2, long j, int i3, String str3, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put("channel", str2);
        contentValues.put("clean_type", Integer.valueOf(i));
        contentValues.put("status", Integer.valueOf(i2));
        contentValues.put("pkg_id", Long.valueOf(j));
        contentValues.put("err_code", Integer.valueOf(i3));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j2));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e) {
            GeckoLogger.m6043w("clean-channel", "insert failed", e);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
