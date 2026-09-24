package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.w3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1803w3 {

    /* JADX INFO: renamed from: d */
    private static final HashMap f3506d = new HashMap();

    /* JADX INFO: renamed from: e */
    private static final Object f3507e = new Object();

    /* JADX INFO: renamed from: f */
    private static final HashMap f3508f = new HashMap();

    /* JADX INFO: renamed from: g */
    private static final Object f3509g = new Object();

    /* JADX INFO: renamed from: h */
    private static final HashMap f3510h = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    private static final Object f3511i = new Object();

    /* JADX INFO: renamed from: a */
    private final C1748l f3512a;

    /* JADX INFO: renamed from: b */
    private final JSONObject f3513b = m5515a(AbstractC1776t3.f3370t8);

    /* JADX INFO: renamed from: c */
    private final JSONObject f3514c = m5515a(AbstractC1776t3.f3368s8);

    public C1803w3(C1748l c1748l) {
        this.f3512a = c1748l;
        m5517a((String) C1521c5.m2201a(C1511b5.f1153K, (Object) null, C1748l.m4756p()), C1794v3.a.AD_UNIT_ID);
        m5517a((String) C1521c5.m2201a(C1511b5.f1154L, (Object) null, C1748l.m4756p()), C1794v3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m5508a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m5509a(Long l, Long l2) {
        return l;
    }

    /* JADX INFO: renamed from: a */
    private Object m5510a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    /* JADX INFO: renamed from: a */
    private String m5511a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                C1785u3 c1785u3 = (C1785u3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, c1785u3.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    private HashMap m5512a(C1794v3.a aVar) {
        if (aVar == C1794v3.a.AD_UNIT_ID) {
            return f3506d;
        }
        return aVar == C1794v3.a.AD_FORMAT ? f3508f : f3510h;
    }

    /* JADX INFO: renamed from: a */
    private HashMap m5513a(C1794v3 c1794v3) {
        HashMap map = new HashMap();
        HashMap mapM5512a = m5512a(c1794v3.m5462a());
        synchronized (m5519b(c1794v3.m5462a())) {
            for (Map.Entry entry : mapM5512a.entrySet()) {
                String str = (String) entry.getKey();
                HashMap map2 = (HashMap) entry.getValue();
                if (!CollectionUtils.isEmpty(map2)) {
                    HashMap map3 = (HashMap) map2.get(C1785u3.a.INSTALL.m5288b());
                    if (!CollectionUtils.isEmpty(map3)) {
                        map.put(str, new HashMap(map3));
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private Map m5514a(C1785u3 c1785u3, C1794v3.a aVar, C1785u3.a aVar2) {
        HashMap mapM5512a = m5512a(aVar);
        Object objM5519b = m5519b(aVar);
        HashMap map = new HashMap();
        synchronized (objM5519b) {
            for (String str : mapM5512a.keySet()) {
                HashMap map2 = (HashMap) mapM5512a.get(str);
                String strM5288b = aVar2.m5288b();
                if (map2 != null && map2.containsKey(strM5288b)) {
                    HashMap map3 = (HashMap) map2.get(strM5288b);
                    if (aVar == C1794v3.a.AD) {
                        map.put(C1609l3.m3119a(str).m3122b(), map3.get(c1785u3));
                    } else {
                        map.put(str, map3.get(c1785u3));
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m5515a(C1831z4 c1831z4) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f3512a.m4801a(c1831z4), new JSONObject());
    }

    /* JADX INFO: renamed from: a */
    private void m5516a(C1717s3 c1717s3, Map map) {
        MaxAdFormat maxAdFormatM3120a = c1717s3.m4342c().m3120a();
        Integer integer = JsonUtils.getInteger(this.f3514c, maxAdFormatM3120a.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C1609l3.m3119a((String) it.next()).m3120a().equals(maxAdFormatM3120a)) {
                i++;
            }
        }
        if (i < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i >= integer.intValue()) {
            if (C1609l3.m3119a((String) ((Map.Entry) it2.next()).getKey()).m3120a().equals(maxAdFormatM3120a)) {
                it2.remove();
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5517a(String str, C1794v3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapM5512a = m5512a(aVar);
            Object objM5519b = m5519b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objM5519b) {
                for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                    String key = entry.getKey();
                    HashMap map = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        C1785u3 c1785u3M5281a = C1785u3.m5281a((String) entry2.getKey());
                        if (c1785u3M5281a != null) {
                            map.put(c1785u3M5281a, m5510a(entry2.getValue()));
                        }
                    }
                    if (!CollectionUtils.isEmpty(map)) {
                        HashMap map2 = new HashMap();
                        map2.put(C1785u3.a.INSTALL.m5288b(), map);
                        mapM5512a.put(key, map2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m5518a(C1785u3 c1785u3, C1794v3 c1794v3, C1785u3.b bVar) {
        if (c1785u3 == null) {
            this.f3512a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3512a.m4782Q().m5174b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (c1794v3 == null) {
            this.f3512a.m4782Q();
            if (C1768p.m5160a()) {
                this.f3512a.m4782Q().m5174b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f3512a.m4782Q();
        if (C1768p.m5160a()) {
            this.f3512a.m4782Q().m5174b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private Object m5519b(C1794v3.a aVar) {
        if (aVar == C1794v3.a.AD_UNIT_ID) {
            return f3507e;
        }
        return aVar == C1794v3.a.AD_FORMAT ? f3509g : f3511i;
    }

    /* JADX INFO: renamed from: b */
    private Map m5520b(C1785u3 c1785u3, C1794v3 c1794v3, C1785u3.b bVar) {
        if (!m5518a(c1785u3, c1794v3, bVar) || !m5522b(c1785u3, c1794v3)) {
            return null;
        }
        String strM5463b = c1794v3.m5463b();
        HashMap mapM5512a = m5512a(c1794v3.m5462a());
        Object objM5519b = m5519b(c1794v3.m5462a());
        HashMap map = new HashMap();
        synchronized (objM5519b) {
            if (c1794v3 instanceof C1717s3) {
                m5516a((C1717s3) c1794v3, mapM5512a);
            }
            HashMap map2 = (HashMap) mapM5512a.get(strM5463b);
            if (map2 == null) {
                map2 = new HashMap();
                mapM5512a.put(strM5463b, map2);
            }
            Iterator it = c1785u3.m5286b().iterator();
            while (it.hasNext()) {
                String strM5288b = ((C1785u3.a) it.next()).m5288b();
                HashMap map3 = (HashMap) map2.get(strM5288b);
                if (map3 == null) {
                    map3 = new HashMap();
                    map2.put(strM5288b, map3);
                }
                Object objMo5289a = bVar.mo5289a(map3.get(c1785u3));
                map3.put(c1785u3, objMo5289a);
                map.put(strM5288b, objMo5289a);
            }
        }
        Boolean bool = (Boolean) this.f3512a.m4801a(AbstractC1776t3.f3374v8);
        if (c1785u3.m5284a(C1785u3.a.INSTALL) && bool.booleanValue()) {
            m5521b(c1794v3);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    private void m5521b(C1794v3 c1794v3) {
        C1511b5 c1511b5M5523c = m5523c(c1794v3.m5462a());
        if (c1511b5M5523c == null) {
            return;
        }
        C1521c5.m2207b(c1511b5M5523c, m5511a((Map) m5513a(c1794v3)), C1748l.m4756p());
    }

    /* JADX INFO: renamed from: b */
    private boolean m5522b(C1785u3 c1785u3, C1794v3 c1794v3) {
        Iterator<String> itKeys = this.f3513b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(c1794v3.m5462a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.f3513b, next, new JSONArray()), c1785u3.m5283a())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private C1511b5 m5523c(C1794v3.a aVar) {
        if (aVar == C1794v3.a.AD_UNIT_ID) {
            return C1511b5.f1153K;
        }
        if (aVar == C1794v3.a.AD_FORMAT) {
            return C1511b5.f1154L;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Map m5524a(C1785u3 c1785u3, C1794v3.a aVar) {
        return m5514a(c1785u3, aVar, C1785u3.a.SESSION);
    }

    /* JADX INFO: renamed from: a */
    public Map m5525a(C1785u3 c1785u3, C1794v3 c1794v3) {
        return m5520b(c1785u3, c1794v3, new C1785u3.b() { // from class: com.applovin.impl.w3$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.C1785u3.b
            /* JADX INFO: renamed from: a */
            public final Object mo5289a(Object obj) {
                return C1803w3.m5508a((Long) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m5526a(C1785u3 c1785u3, C1794v3 c1794v3, final Long l) {
        m5520b(c1785u3, c1794v3, new C1785u3.b() { // from class: com.applovin.impl.w3$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.C1785u3.b
            /* JADX INFO: renamed from: a */
            public final Object mo5289a(Object obj) {
                return C1803w3.m5509a(l, (Long) obj);
            }
        });
    }
}
