package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC11669Sd;

/* JADX INFO: renamed from: com.applovin.impl.c7 */
/* JADX INFO: loaded from: classes3.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC1523c7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    private final C1748l f1287a;

    /* JADX INFO: renamed from: b */
    private final SharedPreferences f1288b;

    /* JADX INFO: renamed from: c */
    private Integer f1289c;

    /* JADX INFO: renamed from: d */
    private Integer f1290d;

    /* JADX INFO: renamed from: e */
    private Integer f1291e;

    /* JADX INFO: renamed from: f */
    private String f1292f;

    /* JADX INFO: renamed from: g */
    private String f1293g;

    /* JADX INFO: renamed from: h */
    private String f1294h;

    /* JADX INFO: renamed from: i */
    private String f1295i;

    /* JADX INFO: renamed from: j */
    private String f1296j;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1523c7(C1748l c1748l) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1748l.m4756p());
        this.f1288b = defaultSharedPreferences;
        this.f1287a = c1748l;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f1289c = m2218a(C1511b5.f1181u.m2109a());
        this.f1290d = m2218a(C1511b5.f1182v.m2109a());
        this.f1291e = m2222h();
        this.f1292f = (String) C1521c5.m2202a(C1511b5.f1184x, (Object) null, defaultSharedPreferences, false);
        this.f1293g = (String) C1521c5.m2202a(C1511b5.f1185y, (Object) null, defaultSharedPreferences, false);
        this.f1294h = (String) C1521c5.m2202a(C1511b5.f1186z, (Object) null, defaultSharedPreferences, false);
        this.f1295i = (String) C1521c5.m2202a(C1511b5.f1144B, (Object) null, defaultSharedPreferences, false);
        this.f1296j = (String) C1521c5.m2202a(C1511b5.f1146D, (Object) null, defaultSharedPreferences, false);
        m2221b(this.f1293g);
    }

    /* JADX INFO: renamed from: a */
    private Integer m2218a(String str) {
        if (this.f1288b.contains(str)) {
            Integer num = (Integer) C1521c5.m2204a(str, null, Integer.class, this.f1288b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) C1521c5.m2204a(str, null, Long.class, this.f1288b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) C1521c5.m2204a(str, null, String.class, this.f1288b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f1287a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1287a.m4782Q().m5174b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private String m2219a(String str, Object obj) {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(str);
        sb.append(" - ");
        sb.append(obj != null ? obj.toString() : "No value set");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m2220a() {
        this.f1289c = null;
        this.f1291e = null;
        this.f1292f = null;
        this.f1293g = null;
        this.f1294h = null;
    }

    /* JADX INFO: renamed from: b */
    private void m2221b(String str) {
        this.f1287a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1287a.m4782Q().m5171a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolM2619a = AbstractC1553f7.m2619a(InterfaceC11669Sd.c.f25687e, str);
        if (boolM2619a == null) {
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
                return;
            }
            return;
        }
        if (boolM2619a.booleanValue()) {
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
            }
            AbstractC1694q0.m3954b(true, C1748l.m4756p());
        } else {
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
            }
            AbstractC1694q0.m3954b(false, C1748l.m4756p());
        }
        this.f1287a.m4786S0();
    }

    /* JADX INFO: renamed from: h */
    private Integer m2222h() {
        String strM2109a = C1511b5.f1183w.m2109a();
        if (this.f1288b.contains(strM2109a)) {
            Integer num = (Integer) C1521c5.m2204a(strM2109a, null, Integer.class, this.f1288b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f1287a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1287a.m4782Q().m5174b("TcfManager", "Integer value (" + num + ") for " + strM2109a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l = (Long) C1521c5.m2204a(strM2109a, null, Long.class, this.f1288b, false);
            if (l != null) {
                if (l.longValue() == 1 || l.longValue() == 0) {
                    return Integer.valueOf(l.intValue());
                }
                this.f1287a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1287a.m4782Q().m5174b("TcfManager", "Long value (" + l + ") for " + strM2109a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) C1521c5.m2204a(strM2109a, null, Boolean.class, this.f1288b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) C1521c5.m2204a(strM2109a, null, String.class, this.f1288b, false);
            if (str != null) {
                if ("1".equals(str) || "true".equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f1287a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1287a.m4782Q().m5174b("TcfManager", "String value (" + str + ") for " + strM2109a + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Boolean m2223a(int i) {
        return AbstractC1553f7.m2619a(i, this.f1293g);
    }

    /* JADX INFO: renamed from: b */
    public Boolean m2224b(int i) {
        String str = this.f1295i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1553f7.m2621a(str, i - 1));
    }

    /* JADX INFO: renamed from: b */
    public boolean m2225b() {
        return AbstractC1553f7.m2620a(this.f1293g);
    }

    /* JADX INFO: renamed from: c */
    public Boolean m2226c(int i) {
        String str = this.f1296j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1553f7.m2621a(str, i - 1));
    }

    /* JADX INFO: renamed from: c */
    public String m2227c() {
        return this.f1293g;
    }

    /* JADX INFO: renamed from: d */
    public Boolean m2228d(int i) {
        String str = this.f1294h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(AbstractC1553f7.m2621a(str, i - 1));
    }

    /* JADX INFO: renamed from: d */
    public String m2229d() {
        return AbstractC1486a7.m1886a(this.f1289c);
    }

    /* JADX INFO: renamed from: e */
    public Integer m2230e() {
        return this.f1289c;
    }

    /* JADX INFO: renamed from: f */
    public Integer m2231f() {
        return this.f1290d;
    }

    /* JADX INFO: renamed from: g */
    public Integer m2232g() {
        return this.f1291e;
    }

    /* JADX INFO: renamed from: i */
    public String m2233i() {
        return m2219a("CMP Name", m2229d()) + m2219a("CMP SDK ID", this.f1289c) + m2219a("CMP SDK Version", this.f1290d) + m2219a(C1511b5.f1183w.m2109a(), this.f1291e) + m2219a(C1511b5.f1184x.m2109a(), this.f1292f) + m2219a(C1511b5.f1185y.m2109a(), this.f1293g);
    }

    /* JADX INFO: renamed from: j */
    public String m2234j() {
        return this.f1292f;
    }

    /* JADX INFO: renamed from: k */
    public String m2235k() {
        return this.f1294h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            m2220a();
            return;
        }
        if (str.equals(C1511b5.f1181u.m2109a())) {
            this.f1289c = m2218a(str);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1289c);
            }
            this.f1287a.m4786S0();
            return;
        }
        if (str.equals(C1511b5.f1182v.m2109a())) {
            this.f1290d = m2218a(str);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1290d);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1183w.m2109a())) {
            this.f1291e = m2222h();
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1291e);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1184x.m2109a())) {
            this.f1292f = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1292f);
            }
            this.f1287a.m4786S0();
            return;
        }
        if (str.equals(C1511b5.f1185y.m2109a())) {
            this.f1293g = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1293g);
            }
            m2221b(this.f1293g);
            return;
        }
        if (str.equals(C1511b5.f1186z.m2109a())) {
            this.f1294h = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1294h);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1143A.m2109a())) {
            String str2 = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1144B.m2109a())) {
            this.f1295i = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1295i);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1145C.m2109a())) {
            String str3 = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(C1511b5.f1146D.m2109a())) {
            this.f1296j = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f1296j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) C1521c5.m2203a(str, (Object) null, String.class, sharedPreferences);
            this.f1287a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1287a.m4782Q().m5171a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }
}
