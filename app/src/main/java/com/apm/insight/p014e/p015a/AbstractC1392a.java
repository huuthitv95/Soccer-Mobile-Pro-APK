package com.apm.insight.p014e.p015a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.C1373a;
import com.apm.insight.C1386c;
import com.apm.insight.runtime.C1468j;
import java.util.HashMap;

/* JADX INFO: renamed from: com.apm.insight.e.a.a */
/* JADX INFO: compiled from: AbsDAO.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1392a<T> {

    /* JADX INFO: renamed from: a */
    protected final String f533a;

    /* JADX INFO: renamed from: b */
    private String f534b = "_id";

    protected AbstractC1392a(String str) {
        this.f533a = str;
    }

    /* JADX INFO: renamed from: a */
    protected abstract ContentValues mo1055a(T t);

    /* JADX INFO: renamed from: a */
    protected abstract HashMap<String, String> mo1056a();

    /* JADX INFO: renamed from: a */
    public final void m1057a(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(this.f533a);
            sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap<String, String> mapMo1056a = mo1056a();
            for (String str : mapMo1056a.keySet()) {
                sb.append(str);
                sb.append(" ");
                sb.append(mapMo1056a.get(str));
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(")");
            sQLiteDatabase.execSQL(sb.toString());
        } catch (Throwable th) {
            C1386c.m990a();
            C1468j.m1652a(th, "NPTH_CATCH");
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo1058a(SQLiteDatabase sQLiteDatabase, T t) {
        if (sQLiteDatabase == null || t == null) {
            return;
        }
        try {
            sQLiteDatabase.insert(this.f533a, null, mo1055a(t));
        } catch (Throwable th) {
            C1373a.m874b(th);
        }
    }
}
