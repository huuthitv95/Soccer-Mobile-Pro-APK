package com.mbridge.msdk.config.component.common.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.database.C12771a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.C12903e;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13636h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.util.c */
/* JADX INFO: compiled from: ComponentUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12770c {
    /* JADX INFO: renamed from: a */
    public static String m35200a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        String str2 = "{" + key + "}";
                        if (str.contains(str2)) {
                            str = str.replace(str2, value);
                        } else {
                            continue;
                        }
                    }
                }
                return str;
            } catch (Exception e) {
                C13219q0.m37816b("ComponentUtil", "Macro replacement error: " + e.getMessage());
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m35208a(int i) {
        return i == 301 || i == 302 || i == 303 || i == 307 || i == 308;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, Object> m35210b(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                linkedHashMap.put(entry.getKey(), m35210b((Map<String, Object>) entry.getValue()));
            } else if (entry.getValue() instanceof List) {
                List list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                    if (obj instanceof Map) {
                        arrayList.add(m35210b((Map<String, Object>) obj));
                    }
                    linkedHashMap.put(entry.getKey(), arrayList);
                }
            } else {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static List<View> m35201a(ViewGroup viewGroup, String str) {
        ArrayList arrayList = new ArrayList();
        if (viewGroup == null) {
            return arrayList;
        }
        m35205a(viewGroup, arrayList, str);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static String m35209b(String str) {
        Object objM36051b;
        if (C12907a.m36194c().m36200b() != null && C12907a.m36194c().m36200b().m36051b("cml") != null && (objM36051b = C12907a.m36194c().m36200b().m36051b("cml")) != null && (objM36051b instanceof Map)) {
            String str2 = (String) ((Map) objM36051b).get(str);
            if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                return str2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    private static void m35205a(ViewGroup viewGroup, List<View> list, String str) {
        if (viewGroup == null) {
            return;
        }
        boolean z = false;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (str.equals(childAt.getTag())) {
                z = true;
            } else {
                if (z && childAt.getVisibility() == 0) {
                    list.add(childAt);
                }
                if (childAt instanceof ViewGroup) {
                    m35205a((ViewGroup) childAt, list, str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m35211b(final String str, final String str2) {
        C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.util.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12770c.m35206a(str2, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static int m35196a(Context context) {
        View viewFindViewById;
        View decorView;
        WindowInsets rootWindowInsets;
        try {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                C13219q0.m37813a("ComponentUtil", "通过资源ID获取状态栏高度: " + dimensionPixelSize + "px");
                return dimensionPixelSize;
            }
        } catch (Exception e) {
            C13219q0.m37813a("ComponentUtil", "通过资源ID获取状态栏高度失败: " + e.getMessage());
        }
        try {
            if ((context instanceof Activity) && (decorView = ((Activity) context).getWindow().getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null) {
                int systemWindowInsetTop = rootWindowInsets.getSystemWindowInsetTop();
                C13219q0.m37813a("ComponentUtil", "通过WindowInsets获取状态栏高度: " + systemWindowInsetTop + "px");
                return systemWindowInsetTop;
            }
        } catch (Exception e2) {
            C13219q0.m37813a("ComponentUtil", "通过WindowInsets获取状态栏高度失败: " + e2.getMessage());
        }
        try {
            if ((context instanceof Activity) && (viewFindViewById = ((Activity) context).findViewById(R.id.content)) != null) {
                int[] iArr = new int[2];
                viewFindViewById.getLocationInWindow(iArr);
                int i = iArr[1];
                C13219q0.m37813a("ComponentUtil", "通过content view获取状态栏高度: " + i + "px");
                return i;
            }
        } catch (Exception e3) {
            C13219q0.m37813a("ComponentUtil", "通过content view获取状态栏高度失败: " + e3.getMessage());
        }
        int i2 = (int) (context.getResources().getDisplayMetrics().density * 24.0f);
        C13219q0.m37820d("ComponentUtil", "所有方法都失败，使用默认状态栏高度: " + i2 + "px");
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static void m35207a(Map<String, Object> map, Map<String, Object> map2) {
        if (map2 == null) {
            return;
        }
        try {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (map.containsKey(key)) {
                    Object obj = map.get(key);
                    if ((obj instanceof Map) && (value instanceof Map)) {
                        m35207a((Map<String, Object>) obj, (Map<String, Object>) value);
                    } else {
                        map.put(key, value);
                    }
                } else {
                    map.put(key, value);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentUtil", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m35204a(Map<String, Object> map, C12894a c12894a) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C12717d c12717d = new C12717d();
        if (map != null && !map.isEmpty()) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getKey().equals(m35209b("13"))) {
                        if (entry.getValue() instanceof Map) {
                            linkedHashMap.put(entry.getKey(), m35210b((Map<String, Object>) entry.getValue()));
                        } else {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    } else if (entry.getValue() instanceof String) {
                        linkedHashMap.put(entry.getKey(), c12717d.m34892a((String) entry.getValue(), c12894a));
                    } else if (entry.getValue() instanceof Map) {
                        linkedHashMap.put(entry.getKey(), m35204a((Map<String, Object>) entry.getValue(), c12894a));
                    } else if (entry.getValue() instanceof List) {
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (obj instanceof String) {
                                arrayList.add(c12717d.m34892a((String) obj, c12894a));
                            }
                            if (obj instanceof Map) {
                                arrayList.add(m35204a((Map<String, Object>) obj, c12894a));
                            }
                            linkedHashMap.put(entry.getKey(), arrayList);
                        }
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37817b("ComponentUtil", th.getMessage(), th);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m35203a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() instanceof C12894a) {
                    map2.put(entry.getKey(), m35203a(((C12894a) entry.getValue()).m36052b()));
                } else if (entry.getValue() instanceof Map) {
                    map2.put(entry.getKey(), m35203a((Map<String, Object>) entry.getValue()));
                } else {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentUtil", th.getMessage(), th);
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static String m35199a() {
        String str;
        try {
            str = UUID.randomUUID().toString() + System.currentTimeMillis();
        } catch (Throwable th) {
            C13219q0.m37814a("ComponentUtil", th.getMessage(), th);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: renamed from: a */
    public static C12894a m35198a(C12894a c12894a, String str) {
        if (c12894a == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            if (!c12894a.m36050a((Object) strArrSplit[i])) {
                C12894a c12894a2 = new C12894a();
                c12894a2.m36054b(c12894a.m36056c());
                c12894a.m36045a(strArrSplit[i], c12894a2);
            }
            Object objM36051b = c12894a.m36051b(strArrSplit[i]);
            if (objM36051b instanceof C12894a) {
                c12894a = (C12894a) c12894a.m36051b(strArrSplit[i]);
            }
            if (objM36051b instanceof Map) {
                C12894a c12894a3 = new C12894a();
                c12894a3.m36049a((Map<? extends String, ?>) objM36051b);
                c12894a.m36045a(strArrSplit[i], c12894a3);
                c12894a = c12894a3;
            }
        }
        return c12894a;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m35202a(String str) {
        Map<String, Object> mapM35217d;
        Map<String, Object> mapM36162a;
        Map<String, Object> mapM36162a2;
        try {
            C12771a c12771aM35212a = C12771a.m35212a();
            if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                mapM35217d = c12771aM35212a.m35217d("SELECT * FROM settingDB WHERE appId = " + str);
            } else {
                mapM35217d = c12771aM35212a.m35217d("SELECT * FROM settingDB WHERE type = 1 ORDER BY timestamp DESC LIMIT 1");
            }
            C12903e c12903e = new C12903e();
            if (mapM35217d != null && !mapM35217d.isEmpty()) {
                Object obj = mapM35217d.get(m35209b("data"));
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        Object obj2 = list.get(0);
                        if (obj2 instanceof Map) {
                            String strValueOf = String.valueOf(((Map) obj2).get("jsonString"));
                            if (!TextUtils.isEmpty(strValueOf) && (mapM36162a2 = c12903e.m36162a(strValueOf)) != null && !mapM36162a2.isEmpty()) {
                                return mapM36162a2;
                            }
                        }
                    }
                }
            }
            String strM39721e = C13636h.m39706b().m39721e(str);
            if (TextUtils.isEmpty(strM39721e) || (mapM36162a = c12903e.m36162a(strM39721e)) == null || mapM36162a.isEmpty()) {
                return null;
            }
            return mapM36162a;
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentUtil", th.getMessage(), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m35206a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Object> mapM35217d = C12771a.m35212a().m35217d("SELECT * FROM settingDB WHERE appID = " + str2 + " AND type = 1");
            String strReplaceAll = str.replaceAll("'", "''");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (mapM35217d != null && !mapM35217d.isEmpty()) {
                Object obj = mapM35217d.get("data");
                if ((obj instanceof List) && ((List) obj).size() > 0) {
                    C12771a.m35212a().m35216c("UPDATE settingDB SET appID =" + str2 + ", unitID = '',  type = 1, timestamp = " + jCurrentTimeMillis + " , jsonString = '" + strReplaceAll + "' WHERE appID = " + str2);
                    return;
                }
            }
            C12771a.m35212a().m35216c("INSERT INTO settingDB (appID, unitID, type, timestamp, jsonString) VALUES (" + str2 + ",'',1," + jCurrentTimeMillis + ",'" + strReplaceAll + "')");
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentUtil", "update component appSetting error: " + th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m35197a(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                return -1;
            }
            try {
                return Integer.parseInt(strValueOf);
            } catch (Throwable th) {
                C13219q0.m37816b("ComponentUtil", th.getMessage());
                return -1;
            }
        } catch (Throwable th2) {
            C13219q0.m37816b("ComponentUtil", th2.getMessage());
            return -1;
        }
    }
}
