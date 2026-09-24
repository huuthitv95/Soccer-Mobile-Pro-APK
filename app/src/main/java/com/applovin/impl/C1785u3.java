package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.u3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1785u3 {

    /* JADX INFO: renamed from: c */
    private static final Set f3403c = new HashSet();

    /* JADX INFO: renamed from: d */
    private static final Map f3404d = new HashMap();

    /* JADX INFO: renamed from: e */
    public static final C1785u3 f3405e;

    /* JADX INFO: renamed from: f */
    public static final C1785u3 f3406f;

    /* JADX INFO: renamed from: g */
    public static final C1785u3 f3407g;

    /* JADX INFO: renamed from: a */
    private String f3408a;

    /* JADX INFO: renamed from: b */
    private Set f3409b;

    /* JADX INFO: renamed from: com.applovin.impl.u3$a */
    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* JADX INFO: renamed from: a */
        private final String f3413a;

        a(String str) {
            this.f3413a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m5288b() {
            return this.f3413a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.u3$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Object mo5289a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f3405e = m5282a("ars", aVar, a.INSTALL);
        f3406f = m5282a("ar", aVar);
        f3407g = m5282a("ttdasi_ms", aVar);
    }

    private C1785u3(String str, Set set) {
        this.f3408a = str;
        this.f3409b = set;
    }

    /* JADX INFO: renamed from: a */
    public static C1785u3 m5281a(String str) {
        return (C1785u3) f3404d.get(str);
    }

    /* JADX INFO: renamed from: a */
    private static C1785u3 m5282a(String str, a... aVarArr) {
        Set set = f3403c;
        if (set.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
        C1785u3 c1785u3 = new C1785u3(str, new HashSet(Arrays.asList(aVarArr)));
        set.add(str);
        f3404d.put(str, c1785u3);
        return c1785u3;
    }

    /* JADX INFO: renamed from: a */
    public String m5283a() {
        return this.f3408a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5284a(a aVar) {
        return this.f3409b.contains(aVar);
    }

    /* JADX INFO: renamed from: a */
    protected boolean m5285a(Object obj) {
        return obj instanceof C1785u3;
    }

    /* JADX INFO: renamed from: b */
    public Set m5286b() {
        return this.f3409b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1785u3)) {
            return false;
        }
        C1785u3 c1785u3 = (C1785u3) obj;
        if (!c1785u3.m5285a(this)) {
            return false;
        }
        String strM5283a = m5283a();
        String strM5283a2 = c1785u3.m5283a();
        if (strM5283a != null ? !strM5283a.equals(strM5283a2) : strM5283a2 != null) {
            return false;
        }
        Set setM5286b = m5286b();
        Set setM5286b2 = c1785u3.m5286b();
        return setM5286b != null ? setM5286b.equals(setM5286b2) : setM5286b2 == null;
    }

    public int hashCode() {
        String strM5283a = m5283a();
        int iHashCode = strM5283a == null ? 43 : strM5283a.hashCode();
        Set setM5286b = m5286b();
        return ((iHashCode + 59) * 59) + (setM5286b != null ? setM5286b.hashCode() : 43);
    }

    public String toString() {
        return this.f3408a;
    }
}
