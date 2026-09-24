package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.C11394D4;

/* JADX INFO: loaded from: classes6.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a */
    Context f30325a;

    /* JADX INFO: renamed from: b */
    C11394D4 f30326b;

    /* JADX INFO: renamed from: c */
    String f30327c;

    /* JADX INFO: renamed from: e */
    Uri f30329e;

    /* JADX INFO: renamed from: h */
    String f30332h;

    /* JADX INFO: renamed from: i */
    String f30333i;

    /* JADX INFO: renamed from: d */
    UriMatcher f30328d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f */
    final int f30330f = 1;

    /* JADX INFO: renamed from: g */
    final int f30331g = 2;

    /* JADX INFO: renamed from: j */
    final String f30334j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f30328d.match(uri);
        if (iMatch == 1) {
            return this.f30332h;
        }
        if (iMatch == 2) {
            return this.f30333i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f30325a = getContext();
        this.f30326b = new C11394D4(this.f30325a);
        this.f30327c = this.f30325a.getPackageName();
        this.f30329e = Uri.parse("content://" + this.f30327c + "/REPORTS");
        this.f30332h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f30333i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f30328d.match(uri);
        if (iMatch == 1) {
            return C11394D4.m25604c();
        }
        if (iMatch == 2) {
            return C11394D4.m25599a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
