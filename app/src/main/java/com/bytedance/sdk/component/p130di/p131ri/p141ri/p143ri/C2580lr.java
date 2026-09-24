package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p134ik.C2548ri;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import com.bytedance.sdk.component.p130di.p131ri.xha;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
class C2580lr {

    /* JADX INFO: renamed from: lr */
    private Context f7215lr;

    /* JADX INFO: renamed from: ri */
    private lr f7216ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.lr$lr */
    public class lr {

        /* JADX INFO: renamed from: lr */
        private volatile SQLiteDatabase f7217lr = null;

        public lr() {
        }

        /* JADX INFO: renamed from: lr */
        private boolean m9476lr() {
            SQLiteDatabase sQLiteDatabase = this.f7217lr;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x003a */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: ri */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m9477ri() {
            /*
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.f7217lr     // Catch: java.lang.Throwable -> L3a
                if (r0 == 0) goto Lc
                android.database.sqlite.SQLiteDatabase r0 = r2.f7217lr     // Catch: java.lang.Throwable -> L3a
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L3a
                if (r0 != 0) goto L41
            Lc:
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L3a
                android.database.sqlite.SQLiteDatabase r0 = r2.f7217lr     // Catch: java.lang.Throwable -> L37
                if (r0 == 0) goto L19
                android.database.sqlite.SQLiteDatabase r0 = r2.f7217lr     // Catch: java.lang.Throwable -> L37
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L37
                if (r0 != 0) goto L35
            L19:
                com.bytedance.sdk.component.di.ri.xha r0 = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di()     // Catch: java.lang.Throwable -> L37
                com.bytedance.sdk.component.di.ri.ri.fi r0 = r0.m9530ik()     // Catch: java.lang.Throwable -> L37
                com.bytedance.sdk.component.di.ri.xha r1 = com.bytedance.sdk.component.p130di.p131ri.xha.m9524di()     // Catch: java.lang.Throwable -> L37
                android.content.Context r1 = r1.m9528fi()     // Catch: java.lang.Throwable -> L37
                android.database.sqlite.SQLiteDatabase r0 = r0.mo9458ri(r1)     // Catch: java.lang.Throwable -> L37
                r2.f7217lr = r0     // Catch: java.lang.Throwable -> L37
                android.database.sqlite.SQLiteDatabase r0 = r2.f7217lr     // Catch: java.lang.Throwable -> L37
                r1 = 0
                r0.setLockingEnabled(r1)     // Catch: java.lang.Throwable -> L37
            L35:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
                return
            L37:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
                throw r0     // Catch: java.lang.Throwable -> L3a
            L3a:
                r0 = move-exception
                boolean r1 = r2.m9476lr()
                if (r1 != 0) goto L42
            L41:
                return
            L42:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri.C2580lr.lr.m9477ri():void");
        }

        /* JADX INFO: renamed from: ri */
        public int m9478ri(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                m9477ri();
                return this.f7217lr.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (m9476lr()) {
                    throw e;
                }
                return 0;
            }
        }

        /* JADX INFO: renamed from: ri */
        public int m9479ri(String str, String str2, String[] strArr) throws Exception {
            try {
                m9477ri();
                return this.f7217lr.delete(str, str2, strArr);
            } catch (Exception e) {
                if (m9476lr()) {
                    throw e;
                }
                return 0;
            }
        }

        /* JADX INFO: renamed from: ri */
        public long m9480ri(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                m9477ri();
                return this.f7217lr.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (m9476lr()) {
                    throw e;
                }
                return -1L;
            }
        }

        /* JADX INFO: renamed from: ri */
        public Cursor m9481ri(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                m9477ri();
                return this.f7217lr.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                ri riVar = new ri();
                if (m9476lr()) {
                    throw th;
                }
                return riVar;
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m9482ri(String str) throws SQLException {
            try {
                m9477ri();
                this.f7217lr.execSQL(str);
            } catch (Throwable th) {
                if (m9476lr()) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: ri */
        public synchronized void m9483ri(String str, String str2, List<InterfaceC2552ri> list) {
            JSONObject jSONObjectMo9282di;
            try {
                try {
                    m9477ri();
                    this.f7217lr.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        InterfaceC2552ri interfaceC2552ri = list.get(i);
                        if (interfaceC2552ri != null && (jSONObjectMo9282di = interfaceC2552ri.mo9282di()) != null) {
                            contentValues.put("id", interfaceC2552ri.mo9284ik());
                            String strMo9219lr = xha.m9524di().m9549vr().mo9219lr(jSONObjectMo9282di.toString());
                            if (!TextUtils.isEmpty(strMo9219lr)) {
                                contentValues.put("value", strMo9219lr);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (C2548ri.m9254ka() && interfaceC2552ri.jbs() > 0 && (interfaceC2552ri.mo9286ka() == 0 || interfaceC2552ri.mo9286ka() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(interfaceC2552ri.jbs()));
                                }
                                this.f7217lr.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f7217lr.setTransactionSuccessful();
                    list.size();
                    if (this.f7217lr != null) {
                        this.f7217lr.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (m9476lr()) {
                        throw e;
                    }
                    if (this.f7217lr != null) {
                        this.f7217lr.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.f7217lr != null) {
                    this.f7217lr.endTransaction();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.lr$ri */
    /* JADX INFO: loaded from: classes9.dex */
    private class ri extends AbstractCursor {
        private ri() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }
    }

    C2580lr(Context context) {
        try {
            this.f7215lr = context.getApplicationContext();
            if (this.f7216ri == null) {
                this.f7216ri = new lr();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public lr mo9475ri() {
        return this.f7216ri;
    }
}
