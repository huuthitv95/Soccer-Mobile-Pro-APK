package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.a5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1484a5 {

    /* JADX INFO: renamed from: a */
    protected final C1748l f1008a;

    /* JADX INFO: renamed from: b */
    protected final Context f1009b;

    /* JADX INFO: renamed from: c */
    protected final SharedPreferences f1010c;

    /* JADX INFO: renamed from: d */
    private final Map f1011d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Object f1012e = new Object();

    public C1484a5(C1748l c1748l) {
        this.f1008a = c1748l;
        Context contextM4756p = C1748l.m4756p();
        this.f1009b = contextM4756p;
        this.f1010c = contextM4756p.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C1831z4.class.getName());
            Class.forName(AbstractC1776t3.class.getName());
        } catch (Throwable unused) {
        }
        m1873d();
    }

    /* JADX INFO: renamed from: a */
    private static Object m1871a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* JADX INFO: renamed from: b */
    private String m1872b() {
        return "com.applovin.sdk." + AbstractC1701q7.m4106f(this.f1008a.m4839k0()) + ".";
    }

    /* JADX INFO: renamed from: d */
    private void m1873d() {
        String strM1872b = ((Boolean) C1521c5.m2201a(C1511b5.f1170j, Boolean.FALSE, C1748l.m4756p())).booleanValue() ? "" : m1872b();
        synchronized (this.f1012e) {
            for (C1831z4 c1831z4 : C1831z4.m5749c()) {
                try {
                    Object objM4802a = this.f1008a.m4802a(strM1872b + c1831z4.m5752b(), null, c1831z4.m5750a().getClass(), this.f1010c);
                    if (objM4802a != null) {
                        this.f1011d.put(c1831z4.m5752b(), objM4802a);
                    }
                } catch (Throwable th) {
                    C1768p.m5164c("SettingsManager", "Unable to load \"" + c1831z4.m5752b() + "\"", th);
                    this.f1008a.m4764E().m4329a("SettingsManager", "initSettings", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public Object m1874a(C1831z4 c1831z4) {
        if (c1831z4 == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f1012e) {
            Object obj = this.f1011d.get(c1831z4.m5752b());
            if (obj == null) {
                return c1831z4.m5750a();
            }
            return c1831z4.m5751a(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1875a() {
        synchronized (this.f1012e) {
            this.f1011d.clear();
        }
        this.f1008a.m4804a(this.f1010c);
    }

    /* JADX INFO: renamed from: a */
    public void m1876a(C1831z4 c1831z4, Object obj) {
        if (c1831z4 == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No new value specified");
        }
        synchronized (this.f1012e) {
            this.f1011d.put(c1831z4.m5752b(), obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1877a(JSONObject jSONObject) {
        synchronized (this.f1012e) {
            boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, C1831z4.f4050u.m5752b(), Boolean.FALSE).booleanValue();
            HashMap map = zBooleanValue ? new HashMap() : null;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && next.length() > 0) {
                    try {
                        try {
                            C1831z4 c1831z4M5747a = C1831z4.m5747a(next);
                            if (c1831z4M5747a != null) {
                                Object objM1874a = zBooleanValue ? m1874a(c1831z4M5747a) : null;
                                Object objM1871a = m1871a(next, jSONObject, c1831z4M5747a.m5750a());
                                this.f1011d.put(c1831z4M5747a.m5752b(), objM1871a);
                                if (c1831z4M5747a == C1831z4.f3756K5) {
                                    this.f1011d.put(C1831z4.f3764L5.m5752b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objM1871a.equals(objM1874a)) {
                                    map.put(c1831z4M5747a, objM1874a);
                                }
                            }
                        } catch (Throwable th) {
                            C1768p.m5164c("SettingsManager", "Unable to convert setting object ", th);
                            this.f1008a.m4764E().m4329a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    } catch (JSONException e) {
                        C1768p.m5164c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                        this.f1008a.m4764E().m4329a("SettingsManager", "loadSettingsException", e);
                    }
                }
            }
            if (zBooleanValue && map.size() > 0) {
                C1811x2 c1811x2 = new C1811x2();
                c1811x2.m5570a("========== UPDATED SETTINGS ==========");
                for (C1831z4 c1831z4 : map.keySet()) {
                    c1811x2.m5571a(c1831z4.m5752b(), m1874a(c1831z4) + " (" + map.get(c1831z4) + ")");
                }
                c1811x2.m5570a("========== END ==========");
                this.f1008a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1008a.m4782Q().m5171a("SettingsManager", c1811x2.toString());
                }
            }
            C1521c5.m2207b(C1511b5.f1170j, (Boolean) m1874a(C1831z4.f3837U6), C1748l.m4756p());
        }
    }

    /* JADX INFO: renamed from: b */
    public List m1878b(C1831z4 c1831z4) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = m1879c(c1831z4).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List m1879c(C1831z4 c1831z4) {
        return CollectionUtils.explode((String) m1874a(c1831z4));
    }

    /* JADX INFO: renamed from: c */
    public boolean m1880c() {
        return this.f1008a.m4847p0().isVerboseLoggingEnabled() || ((Boolean) m1874a(C1831z4.f3966k)).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public void m1881e() {
        Boolean bool = (Boolean) C1521c5.m2201a(C1511b5.f1170j, Boolean.FALSE, C1748l.m4756p());
        String strM1872b = m1872b();
        synchronized (this.f1012e) {
            SharedPreferences.Editor editorEdit = this.f1010c.edit();
            for (C1831z4 c1831z4 : C1831z4.m5749c()) {
                Object obj = this.f1011d.get(c1831z4.m5752b());
                if (obj != null) {
                    String strM5752b = c1831z4.m5752b();
                    this.f1008a.m4809a(strM1872b + c1831z4.m5752b(), obj, editorEdit);
                    if (bool.booleanValue()) {
                        this.f1008a.m4809a(strM5752b, obj, editorEdit);
                    }
                }
            }
            if (((Boolean) this.f1008a.m4801a(C1831z4.f3733H6)).booleanValue()) {
                C1521c5.m2205a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }
}
