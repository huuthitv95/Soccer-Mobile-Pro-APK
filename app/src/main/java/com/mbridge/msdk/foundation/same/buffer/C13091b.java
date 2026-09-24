package com.mbridge.msdk.foundation.same.buffer;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13069c;
import com.mbridge.msdk.foundation.entity.C13070d;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.metadata.C13106a;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.buffer.b */
/* JADX INFO: compiled from: StaticDataPoll.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13091b {

    /* JADX INFO: renamed from: a */
    private static final String f35890a = "b";

    /* JADX INFO: renamed from: e */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, C13069c>> f35894e;

    /* JADX INFO: renamed from: f */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f35895f;

    /* JADX INFO: renamed from: g */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f35896g;

    /* JADX INFO: renamed from: b */
    public static Map<String, List<C13106a>> f35891b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static Map<String, List<C13106a>> f35892c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static Map<String, List<C13106a>> f35893d = new HashMap();

    /* JADX INFO: renamed from: h */
    public static Map<String, List<C13106a>> f35897h = new HashMap();

    /* JADX INFO: renamed from: i */
    public static Map<String, List<C13106a>> f35898i = new HashMap();

    /* JADX INFO: renamed from: j */
    public static Map<String, List<C13106a>> f35899j = new HashMap();

    /* JADX INFO: renamed from: k */
    public static Map<String, List<C13106a>> f35900k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static Map<String, Long> f35901l = new HashMap();

    /* JADX INFO: renamed from: m */
    public static Map<String, List<C13106a>> f35902m = new HashMap();

    /* JADX INFO: renamed from: n */
    public static Map<String, List<C13106a>> f35903n = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m37107a(String str, String str2, String str3, long j, long j2, long j3, String str4) {
        if (f35894e == null) {
            f35894e = new ConcurrentHashMap<>();
        }
        try {
            if (!f35894e.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str3);
                ConcurrentHashMap<String, C13069c> concurrentHashMap = new ConcurrentHashMap<>();
                C13069c c13069c = new C13069c();
                c13069c.m36789a(arrayList);
                c13069c.m36787a(j);
                c13069c.m36792b(j2);
                c13069c.m36796c(j3);
                c13069c.m36797c(str4);
                concurrentHashMap.put(str2, c13069c);
                f35894e.put(str, concurrentHashMap);
                return;
            }
            ConcurrentHashMap<String, C13069c> concurrentHashMap2 = f35894e.get(str);
            if (concurrentHashMap2 != null) {
                C13069c c13069c2 = concurrentHashMap2.get(str2);
                if (c13069c2 != null) {
                    if (c13069c2.m36794c() != null) {
                        c13069c2.m36787a(j);
                        c13069c2.m36792b(j2);
                        c13069c2.m36796c(j3);
                        c13069c2.m36794c().add(str3);
                        c13069c2.m36797c(str4);
                        return;
                    }
                    return;
                }
                C13069c c13069c3 = new C13069c();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                c13069c3.m36789a(arrayList2);
                c13069c3.m36787a(j);
                c13069c3.m36792b(j2);
                c13069c3.m36796c(j3);
                c13069c3.m36797c(str4);
                concurrentHashMap2.put(str2, c13069c3);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(f35890a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private static Map<String, List<C13106a>> m37109b(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "banner":
                return f35892c;
            case "native":
                return f35899j;
            case "reward":
                return f35900k;
            case "splash":
                return f35902m;
            case "h5_native":
                return f35893d;
            case "interstitial":
                return f35898i;
            case "interactive":
                return f35897h;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ConcurrentHashMap<String, C13069c> m37110c(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C13069c>> concurrentHashMap = f35894e;
        if (concurrentHashMap == null) {
            C13015e c13015eM36643a = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
            if (c13015eM36643a != null) {
                c13015eM36643a.m36674b(str, "");
                f35894e = new ConcurrentHashMap<>();
                return null;
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f35894e.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static void m37114e(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f35896g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f35896g.get(str)) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        copyOnWriteArrayList.remove(0);
    }

    /* JADX INFO: renamed from: d */
    public static String m37112d(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        return (TextUtils.isEmpty(str) || (concurrentHashMap = f35896g) == null || !concurrentHashMap.containsKey(str) || (copyOnWriteArrayList = f35896g.get(str)) == null || copyOnWriteArrayList.size() <= 0) ? "" : copyOnWriteArrayList.get(0);
    }

    /* JADX INFO: renamed from: d */
    public static void m37113d(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f35895f;
            if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str) || (concurrentHashMap = f35895f.get(str2)) == null || !concurrentHashMap.containsKey(str2)) {
                return;
            }
            concurrentHashMap.remove(str2);
        } catch (Exception e) {
            C13219q0.m37813a(f35890a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m37111c(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C13069c>> concurrentHashMap;
        C13069c c13069cRemove;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f35894e) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f35894e.remove(str);
            return;
        }
        ConcurrentHashMap<String, C13069c> concurrentHashMap2 = f35894e.get(str);
        if (concurrentHashMap2 == null || !concurrentHashMap2.containsKey(str2) || (c13069cRemove = concurrentHashMap2.remove(str2)) == null) {
            return;
        }
        try {
            String strM36798d = c13069cRemove.m36798d();
            if (TextUtils.isEmpty(strM36798d)) {
                return;
            }
            Iterator<Map.Entry<String, C13069c>> it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                if (strM36798d.equals(it.next().getValue().m36798d())) {
                    it.remove();
                }
            }
        } catch (Exception e) {
            C13219q0.m37813a(f35890a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37105a(String str, String str2, int i) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (f35896g == null) {
            f35896g = new ConcurrentHashMap<>();
        }
        try {
            if (f35896g.containsKey(str)) {
                copyOnWriteArrayList = f35896g.get(str);
                copyOnWriteArrayList.add(str2);
            } else {
                CopyOnWriteArrayList<String> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                copyOnWriteArrayList2.add(str2);
                f35896g.put(str, copyOnWriteArrayList2);
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
            int size = copyOnWriteArrayList.size() - i;
            if (size >= 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    copyOnWriteArrayList.remove(i2);
                }
            }
        } catch (Exception e) {
            C13219q0.m37813a(f35890a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static C13070d m37108b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        C13070d c13070d = new C13070d();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                ConcurrentHashMap<String, ConcurrentHashMap<String, String>> concurrentHashMap2 = f35895f;
                if (concurrentHashMap2 != null && concurrentHashMap2.containsKey(str) && (concurrentHashMap = f35895f.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                    c13070d.m36802a(1);
                    c13070d.m36808c(concurrentHashMap.get(str2));
                    return c13070d;
                }
            } catch (Exception e) {
                C13219q0.m37813a(f35890a, e.getMessage());
            }
        }
        return c13070d;
    }

    /* JADX INFO: renamed from: a */
    public static void m37106a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            if (f35895f == null) {
                f35895f = new ConcurrentHashMap<>();
            }
            if (f35895f.containsKey(str)) {
                if (f35895f.get(str) == null) {
                    ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                    concurrentHashMap.put(str2, str3);
                    f35895f.put(str, concurrentHashMap);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
            concurrentHashMap2.put(str2, str3);
            f35895f.put(str, concurrentHashMap2);
        } catch (Exception e) {
            C13219q0.m37813a(f35890a, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37102a(String str, String str2) {
        Map<String, List<C13106a>> mapM37109b;
        List<C13106a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            mapM37109b = m37103a(str);
        } else {
            mapM37109b = m37109b(str2);
        }
        if (mapM37109b != null) {
            try {
                if (C13182a1.m37597b(str) && mapM37109b.containsKey(str) && (list = mapM37109b.get(str)) != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", list.get(i).m37182a());
                        jSONObject.put("1", list.get(i).m37184c());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, List<C13106a>> m37103a(String str) {
        if (f35899j.containsKey(str)) {
            return f35899j;
        }
        if (f35900k.containsKey(str)) {
            return f35900k;
        }
        if (f35897h.containsKey(str)) {
            return f35897h;
        }
        if (f35903n.containsKey(str)) {
            return f35903n;
        }
        if (f35898i.containsKey(str)) {
            return f35898i;
        }
        if (f35892c.containsKey(str)) {
            return f35892c;
        }
        if (f35902m.containsKey(str)) {
            return f35902m;
        }
        if (f35893d.containsKey(str)) {
            return f35893d;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m37104a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<C13106a>> mapM37109b = m37109b(str2);
        if (campaignEx == null || mapM37109b == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(campaignEx.getId())) {
                return;
            }
            C13106a c13106a = new C13106a(campaignEx.getId(), campaignEx.getRequestIdNotice());
            if (mapM37109b.containsKey(str)) {
                List<C13106a> list = mapM37109b.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(c13106a);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c13106a);
            mapM37109b.put(str, arrayList);
        } catch (Throwable th) {
            C13219q0.m37817b(f35890a, th.getMessage(), th);
        }
    }
}
