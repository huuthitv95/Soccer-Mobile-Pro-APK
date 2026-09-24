package com.apm.insight.p014e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.p013d.C1389a;
import com.apm.insight.p014e.p015a.C1393b;

/* JADX INFO: renamed from: com.apm.insight.e.a */
/* JADX INFO: compiled from: NpthDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1391a {

    /* JADX INFO: renamed from: a */
    private static volatile C1391a f530a;

    /* JADX INFO: renamed from: b */
    private C1393b f531b;

    /* JADX INFO: renamed from: c */
    private SQLiteDatabase f532c;

    private C1391a() {
    }

    /* JADX INFO: renamed from: a */
    public static C1391a m1050a() {
        if (f530a == null) {
            synchronized (C1391a.class) {
                if (f530a == null) {
                    f530a = new C1391a();
                }
            }
        }
        return f530a;
    }

    /* JADX INFO: renamed from: b */
    private void m1051b() {
        if (this.f531b == null) {
            m1052a(C1390e.m1032g());
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1052a(Context context) {
        try {
            this.f532c = new C1394b(context).getWritableDatabase();
        } catch (Throwable th) {
            C1373a.m874b(th);
        }
        this.f531b = new C1393b();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1053a(C1389a c1389a) {
        m1051b();
        C1393b c1393b = this.f531b;
        if (c1393b != null) {
            c1393b.mo1058a(this.f532c, c1389a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m1054a(String str) {
        m1051b();
        C1393b c1393b = this.f531b;
        if (c1393b == null) {
            return false;
        }
        return c1393b.m1059a(this.f532c, str);
    }
}
