package com.bytedance.sdk.openadsdk.tan.p264lr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3189di;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.tan.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3536ri {

    /* JADX INFO: renamed from: ri */
    private static final ConcurrentHashMap<String, Object> f12844ri = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: ri */
    public static int m16081ri(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        int iM15133ri;
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (m16083ri(str)) {
                try {
                    iM15133ri = C3189di.m13325ri(context).mo13326ri().m15133ri(str, contentValues, str2, strArr);
                } catch (Throwable unused) {
                }
            }
            return iM15133ri;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    public static int m16082ri(Context context, String str, String str2, String[] strArr) {
        int iM15134ri;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (m16083ri(str)) {
            try {
                iM15134ri = C3189di.m13325ri(context).mo13326ri().m15134ri(str, str2, strArr);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return iM15134ri;
    }

    /* JADX INFO: renamed from: ri */
    private static Object m16083ri(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = f12844ri;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (C3536ri.class) {
            obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new Object();
                concurrentHashMap.put(str, obj);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ri */
    public static Map<String, List<String>> m16084ri(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Map<String, List<String>> mapM16085ri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (m16083ri(str)) {
            try {
                mapM16085ri = m16085ri(C3189di.m13325ri(context).mo13326ri().m15136ri(str, strArr, str2, strArr2, str3, str4, str5));
            } catch (Throwable unused) {
                return null;
            }
        }
        return mapM16085ri;
    }

    /* JADX INFO: renamed from: ri */
    public static Map<String, List<String>> m16085ri(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return map;
                }
            } catch (Throwable unused) {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16086ri(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (m16083ri(str)) {
            try {
                C3189di.m13325ri(context).mo13326ri().m15135ri(str, (String) null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }
}
