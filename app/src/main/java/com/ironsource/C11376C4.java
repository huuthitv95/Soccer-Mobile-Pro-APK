package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.C4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11376C4 {

    /* JADX INFO: renamed from: a */
    public static final a f24126a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Object f24127b = new Object();

    /* JADX INFO: renamed from: com.ironsource.C4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m25558a(SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return m25557a(this, false, sqliteOpenHelper, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SQLiteDatabase m25557a(C11376C4 c11376c4, boolean z, SQLiteOpenHelper sQLiteOpenHelper, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c11376c4.m25559a(z, sQLiteOpenHelper);
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m25559a(boolean z, SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f24127b) {
            try {
                if (z) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return readableDatabase;
    }
}
