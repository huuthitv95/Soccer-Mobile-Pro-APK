package com.bytedance.sdk.openadsdk.p246nr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.bytedance.sdk.openadsdk.p246nr.p247ik.C3477ri;
import com.bytedance.sdk.openadsdk.p246nr.p248ka.C3479ri;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.p246nr.p250ri.C3483ri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3482ri {

    /* JADX INFO: renamed from: ka */
    private static Context f12588ka;

    /* JADX INFO: renamed from: di */
    private InterfaceC3480lr f12591di;

    /* JADX INFO: renamed from: mj */
    private Boolean f12593mj;
    private C3477ri xha;

    /* JADX INFO: renamed from: ri */
    public static final long f12590ri = C3479ri.m15767ri();

    /* JADX INFO: renamed from: lr */
    private static final String[] f12589lr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", ViewHierarchyConstants.TAG_KEY, "label", "timestamp", "mediation", "is_init", "extra"};

    /* JADX INFO: renamed from: ik */
    private static final long f12587ik = System.currentTimeMillis();

    /* JADX INFO: renamed from: fi */
    private final ArrayList<InterfaceC3478ka> f12592fi = new ArrayList<>();
    private final Runnable jbs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.1
        @Override // java.lang.Runnable
        public void run() {
            if (!C3482ri.this.m15797ka() || C3482ri.this.f12592fi.isEmpty()) {
                return;
            }
            C3482ri c3482ri = C3482ri.this;
            c3482ri.m15804ri(c3482ri.f12592fi);
            C3482ri.this.f12592fi.clear();
        }
    };

    /* JADX INFO: renamed from: qt */
    private int f12594qt = 0;

    /* JADX INFO: renamed from: sf */
    private final Runnable f12595sf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.4
        @Override // java.lang.Runnable
        public void run() {
            int i;
            try {
                SQLiteDatabase sQLiteDatabaseM15809lr = C3483ri.m15809lr();
                if (sQLiteDatabaseM15809lr != null) {
                    String[] strArr = {String.valueOf(C3482ri.this.f12591di.getOnceLogInterval() < 86400000 ? C3482ri.f12587ik : C3482ri.f12590ri)};
                    int iMax = Math.max(10, C3482ri.this.f12591di.getOnceLogCount());
                    int i2 = iMax > 100 ? 10 : iMax;
                    Cursor cursorQuery = sQLiteDatabaseM15809lr.query("monitor_table", C3482ri.f12589lr, "timestamp < ?", strArr, null, null, null, String.valueOf(i2));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex = cursorQuery.getColumnIndex("_id");
                        int columnIndex2 = cursorQuery.getColumnIndex("sdk_version");
                        int columnIndex3 = cursorQuery.getColumnIndex("scene");
                        int columnIndex4 = cursorQuery.getColumnIndex("start_count");
                        int columnIndex5 = cursorQuery.getColumnIndex("success_count");
                        int columnIndex6 = cursorQuery.getColumnIndex("fail_count");
                        int columnIndex7 = cursorQuery.getColumnIndex("rit");
                        int columnIndex8 = cursorQuery.getColumnIndex(ViewHierarchyConstants.TAG_KEY);
                        int columnIndex9 = cursorQuery.getColumnIndex("label");
                        int columnIndex10 = cursorQuery.getColumnIndex("timestamp");
                        int columnIndex11 = cursorQuery.getColumnIndex("mediation");
                        int i3 = i2;
                        int columnIndex12 = cursorQuery.getColumnIndex("is_init");
                        try {
                            int columnIndex13 = cursorQuery.getColumnIndex("extra");
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                C3481ri c3481ri = new C3481ri();
                                if (columnIndex >= 0) {
                                    long j = cursorQuery.getLong(columnIndex);
                                    c3481ri.m15789ri(j);
                                    arrayList2.add(String.valueOf(j));
                                }
                                if (columnIndex2 >= 0) {
                                    c3481ri.m15790ri(cursorQuery.getString(columnIndex2));
                                }
                                if (columnIndex3 >= 0) {
                                    c3481ri.m15784lr(cursorQuery.getString(columnIndex3));
                                }
                                if (columnIndex4 >= 0) {
                                    c3481ri.m15788ri(cursorQuery.getInt(columnIndex4));
                                }
                                if (columnIndex5 >= 0) {
                                    c3481ri.m15782lr(cursorQuery.getInt(columnIndex5));
                                }
                                if (columnIndex6 >= 0) {
                                    c3481ri.m15776ik(cursorQuery.getInt(columnIndex6));
                                }
                                if (columnIndex7 >= 0) {
                                    c3481ri.m15777ik(cursorQuery.getString(columnIndex7));
                                }
                                if (columnIndex8 >= 0) {
                                    c3481ri.m15780ka(cursorQuery.getString(columnIndex8));
                                }
                                if (columnIndex9 >= 0) {
                                    c3481ri.m15774fi(cursorQuery.getString(columnIndex9));
                                }
                                if (columnIndex10 >= 0) {
                                    c3481ri.m15783lr(cursorQuery.getLong(columnIndex10));
                                }
                                if (columnIndex11 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    i = columnIndex11;
                                    c3481ri.m15772di(cursorQuery.getString(i));
                                } else {
                                    columnIndex10 = columnIndex10;
                                    i = columnIndex11;
                                }
                                if (columnIndex12 >= 0) {
                                    columnIndex10 = columnIndex10;
                                    columnIndex10 = columnIndex10;
                                    c3481ri.m15779ka(cursorQuery.getInt(columnIndex12));
                                }
                                if (columnIndex13 >= 0) {
                                    c3481ri.xha(cursorQuery.getString(columnIndex13));
                                }
                                arrayList3.add(c3481ri);
                                columnIndex11 = i;
                                columnIndex = columnIndex;
                                arrayList = arrayList3;
                                columnIndex2 = columnIndex2;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                C3482ri.this.f12591di.onMonitorUpload(arrayList4);
                                SQLiteDatabase sQLiteDatabaseM15811ri = C3483ri.m15811ri();
                                if (sQLiteDatabaseM15811ri != null && sQLiteDatabaseM15811ri.isOpen()) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("_id IN (");
                                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                        sb.append("?");
                                        if (i4 < arrayList2.size() - 1) {
                                            sb.append(",");
                                        }
                                    }
                                    sb.append(")");
                                    sQLiteDatabaseM15811ri.delete("monitor_table", sb.toString(), (String[]) arrayList2.toArray(new String[0]));
                                    if (C3482ri.this.xha != null) {
                                        C3482ri.this.xha.m15766ri(C3482ri.f12587ik);
                                    }
                                }
                                if (arrayList4.size() < i3 || C3482ri.this.f12594qt > 1000) {
                                    return;
                                }
                                C3482ri.this.m15807ri(false);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    private C3482ri(InterfaceC3480lr interfaceC3480lr) {
        try {
            this.f12591di = new BusMonitorDependWrapper(interfaceC3480lr);
            this.xha = new C3477ri(interfaceC3480lr.getContext());
            f12588ka = interfaceC3480lr.getContext();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ka */
    static /* synthetic */ int m15796ka(C3482ri c3482ri) {
        int i = c3482ri.f12594qt;
        c3482ri.f12594qt = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public boolean m15797ka() {
        if (this.f12593mj == null) {
            InterfaceC3480lr interfaceC3480lr = this.f12591di;
            this.f12593mj = Boolean.valueOf((interfaceC3480lr == null || interfaceC3480lr.getContext() == null || !this.f12591di.isMonitorOpen() || this.f12591di.getHandler() == null) ? false : true);
        }
        return this.f12593mj.booleanValue();
    }

    /* JADX INFO: renamed from: ri */
    public static Context m15801ri() {
        Context context = f12588ka;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    /* JADX INFO: renamed from: ri */
    public static C3482ri m15802ri(InterfaceC3480lr interfaceC3480lr) {
        return new C3482ri(interfaceC3480lr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15804ri(List<InterfaceC3478ka> list) {
        C3481ri c3481riMo10650ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM15811ri = C3483ri.m15811ri();
                if (sQLiteDatabaseM15811ri != null) {
                    try {
                        sQLiteDatabaseM15811ri.beginTransaction();
                        for (int i = 0; i < list.size(); i++) {
                            InterfaceC3478ka interfaceC3478ka = list.get(i);
                            if (interfaceC3478ka != null && (c3481riMo10650ri = interfaceC3478ka.mo10650ri()) != null) {
                                Cursor cursorQuery = sQLiteDatabaseM15811ri.query("monitor_table", f12589lr, "sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?", new String[]{c3481riMo10650ri.m15781lr(), c3481riMo10650ri.m15775ik(), c3481riMo10650ri.xha(), c3481riMo10650ri.m15785mj(), c3481riMo10650ri.jbs(), c3481riMo10650ri.m15791sf(), String.valueOf(c3481riMo10650ri.m15770co()), String.valueOf(c3481riMo10650ri.m15786qt()), c3481riMo10650ri.m15769aw()}, null, null, null);
                                if (cursorQuery != null) {
                                    if (cursorQuery.moveToNext()) {
                                        int columnIndex = cursorQuery.getColumnIndex("_id");
                                        if (columnIndex >= 0) {
                                            c3481riMo10650ri.m15789ri(cursorQuery.getLong(columnIndex));
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                        if (columnIndex2 >= 0) {
                                            c3481riMo10650ri.m15788ri(cursorQuery.getInt(columnIndex2) + c3481riMo10650ri.m15778ka());
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                        if (columnIndex3 >= 0) {
                                            c3481riMo10650ri.m15782lr(cursorQuery.getInt(columnIndex3) + c3481riMo10650ri.m15773fi());
                                        }
                                        int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                        if (columnIndex4 >= 0) {
                                            c3481riMo10650ri.m15776ik(cursorQuery.getInt(columnIndex4) + c3481riMo10650ri.m15771di());
                                        }
                                    }
                                    cursorQuery.close();
                                }
                                ContentValues contentValues = new ContentValues();
                                if (c3481riMo10650ri.m15787ri() > 0) {
                                    contentValues.put("_id", Long.valueOf(c3481riMo10650ri.m15787ri()));
                                }
                                contentValues.put("sdk_version", c3481riMo10650ri.m15781lr());
                                contentValues.put("scene", c3481riMo10650ri.m15775ik());
                                contentValues.put("start_count", Integer.valueOf(c3481riMo10650ri.m15778ka()));
                                contentValues.put("success_count", Integer.valueOf(c3481riMo10650ri.m15773fi()));
                                contentValues.put("fail_count", Integer.valueOf(c3481riMo10650ri.m15771di()));
                                contentValues.put("rit", c3481riMo10650ri.xha());
                                contentValues.put(ViewHierarchyConstants.TAG_KEY, c3481riMo10650ri.m15785mj());
                                contentValues.put("label", c3481riMo10650ri.jbs());
                                contentValues.put("timestamp", Long.valueOf(c3481riMo10650ri.m15786qt()));
                                contentValues.put("mediation", c3481riMo10650ri.m15791sf());
                                contentValues.put("is_init", Integer.valueOf(c3481riMo10650ri.m15770co()));
                                contentValues.put("extra", c3481riMo10650ri.m15769aw());
                                sQLiteDatabaseM15811ri.insertWithOnConflict("monitor_table", null, contentValues, 5);
                            }
                        }
                        sQLiteDatabaseM15811ri.setTransactionSuccessful();
                    } catch (Throwable unused) {
                        sQLiteDatabase = sQLiteDatabaseM15811ri;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                            return;
                        }
                        return;
                    }
                }
                if (sQLiteDatabaseM15811ri != null) {
                    sQLiteDatabaseM15811ri.endTransaction();
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15806ri(final InterfaceC3478ka interfaceC3478ka) {
        if (interfaceC3478ka == null || !m15797ka()) {
            return;
        }
        final Handler handler = this.f12591di.getHandler();
        handler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.2
            @Override // java.lang.Runnable
            public void run() {
                C3482ri.this.f12592fi.add(interfaceC3478ka);
                if (C3482ri.this.f12592fi.size() >= 10) {
                    handler.removeCallbacks(C3482ri.this.jbs);
                    C3482ri c3482ri = C3482ri.this;
                    c3482ri.m15804ri(c3482ri.f12592fi);
                    C3482ri.this.f12592fi.clear();
                }
            }
        });
        handler.removeCallbacks(this.jbs);
        handler.postDelayed(this.jbs, 5000L);
    }

    /* JADX INFO: renamed from: ri */
    public void m15807ri(final boolean z) {
        final Handler handler = this.f12591di.getHandler();
        InterfaceC3480lr interfaceC3480lr = this.f12591di;
        if (interfaceC3480lr == null || handler == null || interfaceC3480lr.getContext() == null || this.xha == null || !m15797ka()) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nr.ri.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C3482ri.m15796ka(C3482ri.this);
                    if (z) {
                        long jM15765ri = C3482ri.this.xha.m15765ri();
                        if (jM15765ri == 0) {
                            C3482ri.this.xha.m15766ri(System.currentTimeMillis());
                            return;
                        } else if (C3479ri.m15768ri(jM15765ri) && System.currentTimeMillis() - jM15765ri < C3482ri.this.f12591di.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    handler.post(C3482ri.this.f12595sf);
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.f12591di.getOnceLogInterval(), 10000));
    }
}
