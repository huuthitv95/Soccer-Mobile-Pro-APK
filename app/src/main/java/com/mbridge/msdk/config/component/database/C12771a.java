package com.mbridge.msdk.config.component.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.database.file.C12774a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.database.a */
/* JADX INFO: compiled from: ComponentDatabase.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12771a {

    /* JADX INFO: renamed from: b */
    private static C12771a f34010b;

    /* JADX INFO: renamed from: a */
    private final C12772b f34011a;

    private C12771a(Context context) {
        this.f34011a = new C12772b(context);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12771a m35212a() {
        if (f34010b == null) {
            f34010b = new C12771a(C13008c.m36588n().m36542d());
        }
        return f34010b;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, Object> m35215b(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), "SQL is null");
            return map;
        }
        try {
            m35213a(true).execSQL(str);
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
            return map;
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentDatabase", th.getMessage());
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), th.getMessage());
            return map;
        }
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m35216c(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), "SQL is null");
            return map;
        }
        try {
            return m35215b(str);
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentDatabase", th.getMessage());
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), th.getMessage());
            return map;
        }
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Object> m35217d(String str) {
        Object obj;
        HashMap map = new HashMap();
        int i = 2;
        if (TextUtils.isEmpty(str)) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), "SQL is null");
            return map;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        try {
            Object obj2 = null;
            Cursor cursorRawQuery = m35213a(false).rawQuery(str, null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        String[] columnNames = cursorRawQuery.getColumnNames();
                        while (cursorRawQuery.moveToNext()) {
                            HashMap map2 = new HashMap();
                            int length = columnNames.length;
                            int i3 = i2;
                            while (i3 < length) {
                                String str2 = columnNames[i3];
                                int columnIndex = cursorRawQuery.getColumnIndex(str2);
                                if (columnIndex != -1) {
                                    int type = cursorRawQuery.getType(columnIndex);
                                    if (type != 0) {
                                        if (type == 1) {
                                            map2.put(str2, String.valueOf(cursorRawQuery.getLong(columnIndex)));
                                        } else if (type == i) {
                                            map2.put(str2, String.valueOf(cursorRawQuery.getFloat(columnIndex)));
                                        } else if (type == 3) {
                                            map2.put(str2, cursorRawQuery.getString(columnIndex));
                                        } else if (type == 4) {
                                            map2.put(str2, new String(cursorRawQuery.getBlob(columnIndex)));
                                        }
                                        obj = null;
                                    } else {
                                        obj = null;
                                        map2.put(str2, null);
                                    }
                                } else {
                                    obj = null;
                                }
                                i3++;
                                obj2 = obj;
                                i = 2;
                            }
                            arrayList.add(map2);
                            obj2 = obj2;
                            i = 2;
                            i2 = 0;
                        }
                    }
                } catch (Throwable th) {
                    if (cursorRawQuery == null) {
                        throw th;
                    }
                    try {
                        cursorRawQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
            map.put(C12770c.m35209b("data"), arrayList);
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
                return map;
            }
        } catch (Throwable th3) {
            C13219q0.m37816b("ComponentDatabase", th3.getMessage());
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), th3.getMessage());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public SQLiteDatabase m35213a(boolean z) {
        try {
            return z ? this.f34011a.getWritableDatabase() : this.f34011a.getReadableDatabase();
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentDatabase", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Map<String, Object> m35214a(String str) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), "SQL is null");
            return map;
        }
        try {
            m35215b(str);
            if (str.contains(C12773c.TABLE_FILE_DB)) {
                new C12774a().m35223a(str);
            }
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 1);
            return map;
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentDatabase", th.getMessage());
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), 2);
            map.put(C12770c.m35209b("reason"), th.getMessage());
            return map;
        }
    }
}
