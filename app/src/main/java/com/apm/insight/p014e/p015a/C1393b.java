package com.apm.insight.p014e.p015a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.p013d.C1389a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.apm.insight.e.a.b */
/* JADX INFO: compiled from: DuplicateLogDAO.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1393b extends AbstractC1392a<C1389a> {
    public C1393b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.p014e.p015a.AbstractC1392a
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ ContentValues mo1055a(C1389a c1389a) {
        C1389a c1389a2 = c1389a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", c1389a2.f501a);
        contentValues.put("insert_time", Long.valueOf(c1389a2.f502b));
        return contentValues;
    }

    @Override // com.apm.insight.p014e.p015a.AbstractC1392a
    /* JADX INFO: renamed from: a */
    protected final HashMap<String, String> mo1056a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("path", "TEXT");
        map.put("insert_time", "INTEGER");
        map.put(IronSourceConstants.EVENTS_EXT1, "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }

    @Override // com.apm.insight.p014e.p015a.AbstractC1392a
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void mo1058a(SQLiteDatabase sQLiteDatabase, C1389a c1389a) {
        if (c1389a == null || m1059a(sQLiteDatabase, c1389a.f501a)) {
            return;
        }
        super.mo1058a(sQLiteDatabase, c1389a);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f533a + " where _id in (select _id from " + this.f533a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            C1373a.m874b((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1059a(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        int count;
        if (sQLiteDatabase != null && !TextUtils.isEmpty(str)) {
            try {
                Cursor cursorQuery = sQLiteDatabase.query(this.f533a, null, "path=?", new String[]{str}, null, null, null);
                count = cursorQuery.getCount();
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th = th2;
                    C1373a.m874b(th);
                }
            } catch (Throwable th3) {
                th = th3;
                count = 0;
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }
}
