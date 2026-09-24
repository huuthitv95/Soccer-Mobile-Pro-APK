package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.s0 */
/* JADX INFO: compiled from: SameOptimizedController.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C13223s0 {

    /* JADX INFO: renamed from: a */
    private final Object f36373a;

    /* JADX INFO: renamed from: b */
    private final Object f36374b;

    /* JADX INFO: renamed from: c */
    private final Object f36375c;

    /* JADX INFO: renamed from: d */
    private final Object f36376d;

    /* JADX INFO: renamed from: e */
    public volatile JSONObject f36377e;

    /* JADX INFO: renamed from: f */
    private String f36378f;

    /* JADX INFO: renamed from: g */
    private volatile ConcurrentHashMap<String, Boolean> f36379g;

    /* JADX INFO: renamed from: h */
    private volatile ConcurrentHashMap<String, Integer> f36380h;

    /* JADX INFO: renamed from: i */
    private volatile ConcurrentHashMap<String, String> f36381i;

    /* JADX INFO: renamed from: j */
    private volatile C13635g f36382j;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.s0$b */
    /* JADX INFO: compiled from: SameOptimizedController.java */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private static final C13223s0 f36383a = new C13223s0();
    }

    /* JADX INFO: renamed from: a */
    public static C13223s0 m37831a() {
        return b.f36383a;
    }

    /* JADX INFO: renamed from: b */
    private static Integer m37836b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m37838c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, String> m37840d() {
        synchronized (this.f36374b) {
            if (this.f36381i == null) {
                this.f36381i = new ConcurrentHashMap<>();
            }
        }
        return this.f36381i;
    }

    /* JADX INFO: renamed from: e */
    private boolean m37841e() {
        return this.f36382j.m39401E() == 1;
    }

    private C13223s0() {
        this.f36373a = new Object();
        this.f36374b = new Object();
        this.f36375c = new Object();
        this.f36376d = new Object();
    }

    /* JADX INFO: renamed from: a */
    private int m37830a(String str, String str2, int i) {
        if (!m37835a(true)) {
            try {
                String strOptString = this.f36377e.optString(str, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strM37712a = C13207k0.m37712a(strOptString);
                    if (!TextUtils.isEmpty(strM37712a)) {
                        return new JSONObject(strM37712a).optInt(str2, i);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, Integer> m37839c() {
        synchronized (this.f36373a) {
            if (this.f36380h == null) {
                this.f36380h = new ConcurrentHashMap<>();
            }
        }
        return this.f36380h;
    }

    /* JADX INFO: renamed from: b */
    public int m37843b(String str, int i) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapM37839c = m37839c();
            Integer numM37836b = m37836b(str, concurrentHashMapM37839c);
            if (numM37836b != null) {
                return numM37836b.intValue();
            }
            try {
                numValueOf = Integer.valueOf(m37829a(str, i));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i);
            }
            concurrentHashMapM37839c.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private int m37829a(String str, int i) {
        if (!m37835a(true)) {
            try {
                return this.f36377e.optInt(str, i);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public String m37845b(String str, String str2, boolean z) {
        String strM37833a;
        String strM37838c;
        try {
            if (!TextUtils.isEmpty(str)) {
                ConcurrentHashMap<String, String> concurrentHashMapM37840d = m37840d();
                if (z && (strM37838c = m37838c(str, concurrentHashMapM37840d)) != null) {
                    return strM37838c;
                }
                try {
                    strM37833a = m37833a(str, str2, z);
                } catch (Exception unused) {
                    strM37833a = str2;
                }
                concurrentHashMapM37840d.put(str, strM37833a);
                return strM37833a;
            }
        } catch (Exception unused2) {
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    private String m37833a(String str, String str2, boolean z) {
        if (!m37835a(z)) {
            try {
                return this.f36377e.optString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m37842a(String str, boolean z) {
        try {
            return m37846b(str, z, true);
        } catch (Exception unused) {
            return z;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Boolean m37832a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m37834a(String str, boolean z, boolean z2) {
        if (!m37835a(z2)) {
            try {
                return this.f36377e.optInt(str, z ? 1 : 0) != 0;
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[Catch: all -> 0x005d, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:18:0x0043, B:20:0x0047, B:21:0x004f, B:9:0x000f, B:11:0x0017, B:13:0x0027, B:14:0x0033, B:17:0x0041), top: B:35:0x0003, inners: #0 }] */
    /* JADX INFO: renamed from: a */
    private boolean m37835a(boolean z) {
        synchronized (this.f36376d) {
            if (this.f36382j == null || m37841e() || !z) {
                try {
                    if (TextUtils.isEmpty(this.f36378f)) {
                        String strM36533b = C13008c.m36588n().m36533b();
                        this.f36378f = strM36533b;
                        if (TextUtils.isEmpty(strM36533b)) {
                            this.f36378f = C12998a.m36460b().m36462a("app_id");
                        }
                    }
                    this.f36382j = C13636h.m39706b().m39714b(this.f36378f);
                } catch (Exception unused) {
                    this.f36382j = null;
                }
                if (this.f36382j != null) {
                    this.f36377e = this.f36382j.m39542n0();
                }
            } else if (this.f36382j != null) {
                this.f36377e = this.f36382j.m39542n0();
            }
            throw th;
        }
        return this.f36382j == null || this.f36377e == null;
    }

    /* JADX INFO: renamed from: b */
    public int m37844b(String str, String str2, int i) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapM37839c = m37839c();
                Integer numM37836b = m37836b(str3, concurrentHashMapM37839c);
                if (numM37836b != null) {
                    return numM37836b.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(m37830a(str, str2, i));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i);
                }
                concurrentHashMapM37839c.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return m37843b(str2, i);
        } catch (Exception unused2) {
            return i;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m37846b(String str, boolean z, boolean z2) {
        Boolean boolValueOf;
        Boolean boolM37832a;
        try {
            if (!TextUtils.isEmpty(str)) {
                ConcurrentHashMap<String, Boolean> concurrentHashMapM37837b = m37837b();
                if (z2 && (boolM37832a = m37832a(str, concurrentHashMapM37837b)) != null) {
                    return boolM37832a.booleanValue();
                }
                try {
                    boolValueOf = Boolean.valueOf(m37834a(str, z, z2));
                } catch (Exception unused) {
                    boolValueOf = Boolean.valueOf(z);
                }
                concurrentHashMapM37837b.put(str, boolValueOf);
                return boolValueOf.booleanValue();
            }
        } catch (Exception unused2) {
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, Boolean> m37837b() {
        synchronized (this.f36375c) {
            if (this.f36379g == null) {
                this.f36379g = new ConcurrentHashMap<>();
            }
        }
        return this.f36379g;
    }
}
