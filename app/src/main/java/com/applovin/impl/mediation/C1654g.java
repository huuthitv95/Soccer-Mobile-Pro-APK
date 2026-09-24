package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.C1619m3;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.mediation.g */
/* JADX INFO: loaded from: classes3.dex */
public class C1654g {

    /* JADX INFO: renamed from: b */
    private final C1748l f2333b;

    /* JADX INFO: renamed from: c */
    private final C1768p f2334c;

    /* JADX INFO: renamed from: a */
    private final Map f2332a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d */
    private final Object f2335d = new Object();

    /* JADX INFO: renamed from: e */
    private final Map f2336e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Set f2337f = new HashSet();

    /* JADX INFO: renamed from: g */
    private final Object f2338g = new Object();

    /* JADX INFO: renamed from: h */
    private final Set f2339h = new HashSet();

    /* JADX INFO: renamed from: com.applovin.impl.mediation.g$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private final String f2340a;

        /* JADX INFO: renamed from: b */
        private final String f2341b;

        /* JADX INFO: renamed from: c */
        private final MaxAdFormat f2342c;

        /* JADX INFO: renamed from: d */
        private final JSONObject f2343d;

        a(String str, String str2, AbstractC1482a3 abstractC1482a3, C1748l c1748l) {
            this.f2340a = str;
            this.f2341b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f2343d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (abstractC1482a3 == null) {
                this.f2342c = null;
            } else {
                this.f2342c = abstractC1482a3.getFormat();
                JsonUtils.putString(jSONObject, "format", abstractC1482a3.getFormat().getLabel());
            }
        }

        /* JADX INFO: renamed from: a */
        JSONObject m3522a() {
            return this.f2343d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f2340a.equals(aVar.f2340a) || !this.f2341b.equals(aVar.f2341b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f2342c;
            MaxAdFormat maxAdFormat2 = aVar.f2342c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iHashCode = ((this.f2340a.hashCode() * 31) + this.f2341b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f2342c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f2340a + "', operationTag='" + this.f2341b + "', format=" + this.f2342c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public C1654g(C1748l c1748l) {
        if (c1748l == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2333b = c1748l;
        this.f2334c = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private C1655h m3514a(C1619m3 c1619m3, Class cls, boolean z) {
        try {
            return new C1655h(c1619m3, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f2333b.m4758A0()), z, this.f2333b);
        } catch (Throwable th) {
            C1768p.m5164c("MediationAdapterManager", "Failed to load adapter: " + c1619m3, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private Class m3515a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            C1768p.m5167h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    C1655h m3516a(C1619m3 c1619m3) {
        return m3517a(c1619m3, false);
    }

    /* JADX INFO: renamed from: a */
    C1655h m3517a(C1619m3 c1619m3, boolean z) {
        Class cls;
        C1655h c1655h;
        if (c1619m3 == null) {
            throw new IllegalArgumentException("No adapter spec specified");
        }
        String strM3200c = c1619m3.m3200c();
        String strM3196b = c1619m3.m3196b();
        if (TextUtils.isEmpty(strM3200c)) {
            if (C1768p.m5160a()) {
                this.f2334c.m5174b("MediationAdapterManager", "No adapter name provided for " + strM3196b + ", not loading the adapter ");
            }
            return null;
        }
        if (TextUtils.isEmpty(strM3196b)) {
            if (C1768p.m5160a()) {
                this.f2334c.m5174b("MediationAdapterManager", "Unable to find default className for '" + strM3200c + "'");
            }
            return null;
        }
        if (z && (c1655h = (C1655h) this.f2332a.get(strM3196b)) != null) {
            return c1655h;
        }
        synchronized (this.f2335d) {
            if (this.f2337f.contains(strM3196b)) {
                if (C1768p.m5160a()) {
                    this.f2334c.m5171a("MediationAdapterManager", "Not attempting to load " + strM3200c + " due to prior errors");
                }
                return null;
            }
            if (this.f2336e.containsKey(strM3196b)) {
                cls = (Class) this.f2336e.get(strM3196b);
            } else {
                Class clsM3515a = m3515a(strM3196b);
                if (clsM3515a == null) {
                    if (C1768p.m5160a()) {
                        this.f2334c.m5178k("MediationAdapterManager", "Adapter " + strM3200c + " could not be loaded, class " + strM3196b + " not found");
                    }
                    this.f2337f.add(strM3196b);
                    return null;
                }
                cls = clsM3515a;
            }
            C1655h c1655hM3514a = m3514a(c1619m3, cls, z);
            if (c1655hM3514a == null) {
                if (C1768p.m5160a()) {
                    this.f2334c.m5174b("MediationAdapterManager", "Failed to load " + strM3200c);
                }
                this.f2337f.add(strM3196b);
                return null;
            }
            if (C1768p.m5160a()) {
                this.f2334c.m5171a("MediationAdapterManager", "Loaded " + strM3200c);
            }
            this.f2336e.put(strM3196b, cls);
            if (z) {
                this.f2332a.put(c1619m3.m3196b(), c1655hM3514a);
            }
            return c1655hM3514a;
        }
    }

    /* JADX INFO: renamed from: a */
    public Collection m3518a() {
        ArrayList arrayList;
        synchronized (this.f2338g) {
            arrayList = new ArrayList(this.f2339h.size());
            Iterator it = this.f2339h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).m3522a());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m3519a(String str, String str2, AbstractC1482a3 abstractC1482a3) {
        synchronized (this.f2338g) {
            this.f2333b.m4782Q();
            if (C1768p.m5160a()) {
                this.f2333b.m4782Q().m5174b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f2339h.add(new a(str, str2, abstractC1482a3, this.f2333b));
        }
    }

    /* JADX INFO: renamed from: b */
    public Collection m3520b() {
        Set setUnmodifiableSet;
        synchronized (this.f2335d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f2337f);
        }
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: c */
    public Collection m3521c() {
        Set setUnmodifiableSet;
        synchronized (this.f2335d) {
            HashSet hashSet = new HashSet(this.f2336e.size());
            Iterator it = this.f2336e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }
}
