package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.metadata.a */
/* JADX INFO: loaded from: classes6.dex */
public class C12364a {

    /* JADX INFO: renamed from: a */
    public static final String f31315a = "do_not_sell";

    /* JADX INFO: renamed from: b */
    public static final String f31316b = "is_child_directed";

    /* JADX INFO: renamed from: c */
    public static final String f31317c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d */
    public static final String f31318d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e */
    public static final String f31319e = "iiqf";

    /* JADX INFO: renamed from: f */
    public static final String f31320f = "is_test_suite";

    /* JADX INFO: renamed from: g */
    public static final String f31321g = "true";

    /* JADX INFO: renamed from: h */
    protected static final String f31322h = "false";

    /* JADX INFO: renamed from: i */
    public static final String f31323i = "google_water_mark";

    /* JADX INFO: renamed from: j */
    public static final String f31324j = "enable";

    /* JADX INFO: renamed from: k */
    static final Set<String> f31325k;

    /* JADX INFO: renamed from: l */
    static final Set<String> f31326l;

    /* JADX INFO: renamed from: m */
    static final Set<String> f31327m;

    /* JADX INFO: renamed from: n */
    public static final int f31328n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f31316b, f31317c, f31320f, f31318d, f31319e));
        f31325k = hashSet;
        f31326l = new HashSet(Arrays.asList(f31317c, f31318d, f31320f, f31319e));
        HashSet hashSet2 = new HashSet(hashSet);
        f31327m = hashSet2;
        hashSet2.add(f31315a);
    }
}
