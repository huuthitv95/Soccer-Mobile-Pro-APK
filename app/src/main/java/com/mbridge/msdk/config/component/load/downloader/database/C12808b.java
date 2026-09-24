package com.mbridge.msdk.config.component.load.downloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.ironsource.C11661S5;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.b */
/* JADX INFO: compiled from: DownloadInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12808b {

    /* JADX INFO: renamed from: a */
    private String f34207a;

    /* JADX INFO: renamed from: b */
    private long f34208b;

    /* JADX INFO: renamed from: c */
    private long f34209c;

    /* JADX INFO: renamed from: d */
    private String f34210d;

    /* JADX INFO: renamed from: e */
    private long f34211e;

    /* JADX INFO: renamed from: f */
    private long f34212f;

    /* JADX INFO: renamed from: g */
    private String f34213g;

    /* JADX INFO: renamed from: h */
    private int f34214h;

    /* JADX INFO: renamed from: i */
    private String f34215i;

    private C12808b() {
    }

    /* JADX INFO: renamed from: a */
    public void m35457a(long j) {
        this.f34208b = j;
    }

    /* JADX INFO: renamed from: b */
    public long m35459b() {
        return this.f34208b;
    }

    /* JADX INFO: renamed from: c */
    public String m35462c() {
        return this.f34210d;
    }

    /* JADX INFO: renamed from: d */
    public void m35467d(String str) {
        this.f34207a = str;
    }

    /* JADX INFO: renamed from: e */
    public String m35468e() {
        return this.f34207a;
    }

    /* JADX INFO: renamed from: f */
    public int m35469f() {
        return this.f34214h;
    }

    /* JADX INFO: renamed from: g */
    public long m35470g() {
        return this.f34212f;
    }

    /* JADX INFO: renamed from: h */
    public long m35471h() {
        return this.f34211e;
    }

    /* JADX INFO: renamed from: i */
    public long m35472i() {
        return this.f34209c;
    }

    /* JADX INFO: renamed from: a */
    public void m35456a(int i) {
        this.f34214h = i;
    }

    /* JADX INFO: renamed from: b */
    public void m35461b(String str) {
        this.f34210d = str;
    }

    /* JADX INFO: renamed from: c */
    public void m35463c(long j) {
        this.f34211e = j;
    }

    /* JADX INFO: renamed from: d */
    public void m35466d(long j) {
        this.f34209c = j;
    }

    /* JADX INFO: renamed from: a */
    public String m35455a() {
        return this.f34215i;
    }

    /* JADX INFO: renamed from: b */
    public void m35460b(long j) {
        this.f34212f = j;
    }

    /* JADX INFO: renamed from: c */
    public void m35464c(String str) {
        this.f34213g = str;
    }

    /* JADX INFO: renamed from: d */
    public String m35465d() {
        return this.f34213g;
    }

    /* JADX INFO: renamed from: a */
    public void m35458a(String str) {
        this.f34215i = str;
    }

    /* JADX INFO: renamed from: a */
    public static C12808b m35454a(String str, String str2, long j, long j2, long j3, long j4, String str3, int i, String str4) {
        C12808b c12808b = new C12808b();
        c12808b.m35461b(str);
        c12808b.m35467d(str2);
        c12808b.m35460b(j4);
        c12808b.m35457a(j);
        c12808b.m35466d(j2);
        c12808b.m35463c(j3);
        c12808b.m35458a(str3);
        c12808b.m35456a(i);
        c12808b.m35464c(str4);
        return c12808b;
    }

    /* JADX INFO: renamed from: a */
    public static C12808b m35453a(Cursor cursor) {
        C12808b c12808b = new C12808b();
        cursor.moveToFirst();
        for (String str : cursor.getColumnNames()) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                str.hashCode();
                str.hashCode();
                switch (str) {
                    case "successTime":
                        c12808b.m35466d(cursor.getLong(columnIndex));
                        break;
                    case "status":
                        c12808b.m35456a(cursor.getInt(columnIndex));
                        break;
                    case "filePath":
                        c12808b.m35467d(cursor.getString(columnIndex));
                        break;
                    case "fileSize":
                        c12808b.m35460b(cursor.getLong(columnIndex));
                        break;
                    case "contentType":
                        c12808b.m35458a(cursor.getString(columnIndex));
                        break;
                    case "URL":
                        c12808b.m35461b(cursor.getString(columnIndex));
                        break;
                    case "md5":
                        c12808b.m35464c(cursor.getString(columnIndex));
                        break;
                    case "touchTime":
                        c12808b.m35463c(cursor.getLong(columnIndex));
                        break;
                    case "createTime":
                        c12808b.m35457a(cursor.getLong(columnIndex));
                        break;
                }
            }
        }
        return c12808b;
    }

    /* JADX INFO: renamed from: a */
    public static ContentValues m35452a(C12808b c12808b) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("URL", c12808b.m35462c());
        contentValues.put(C11661S5.c.f25654c, c12808b.m35468e());
        contentValues.put("fileSize", Long.valueOf(c12808b.m35470g()));
        contentValues.put("touchTime", Long.valueOf(c12808b.m35471h()));
        contentValues.put("createTime", Long.valueOf(c12808b.m35459b()));
        contentValues.put("successTime", Long.valueOf(c12808b.m35472i()));
        contentValues.put("md5", c12808b.m35465d());
        contentValues.put("status", Integer.valueOf(c12808b.m35469f()));
        return contentValues;
    }
}
