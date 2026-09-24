package com.bytedance.sdk.openadsdk.p236ka;

import com.bytedance.sdk.openadsdk.p236ka.p240ik.C3415ri;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3423lr {

    /* JADX INFO: renamed from: ri */
    public static final String f12373ri = C3415ri.ri.f12359ri;

    /* JADX INFO: renamed from: lr */
    public static final String f12372lr = C3415ri.ri.f12358lr;

    /* JADX INFO: renamed from: ik */
    public static final String f12370ik = C3415ri.ri.f12356ik;

    /* JADX INFO: renamed from: ka */
    public static final String f12371ka = C3415ri.ri.f12357ka;

    /* JADX INFO: renamed from: fi */
    public static final String f12369fi = C3415ri.ri.f12355fi;

    /* JADX INFO: renamed from: di */
    public static final String f12368di = C3415ri.ri.f12354di;
    public static final Set<String> xha = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.lr$lr */
    public static class lr {

        /* JADX INFO: renamed from: ik */
        public static int f12374ik = 100;

        /* JADX INFO: renamed from: lr */
        public static int f12375lr = 2;

        /* JADX INFO: renamed from: ri */
        public static int f12376ri = 1;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.lr$ri */
    public static class ri {

        /* JADX INFO: renamed from: ik */
        public static String f12377ik = "direct";

        /* JADX INFO: renamed from: ka */
        public static String f12378ka = "saLandingPageLinks";

        /* JADX INFO: renamed from: lr */
        public static String f12379lr = "openAdLandPageLinks";

        /* JADX INFO: renamed from: ri */
        public static String f12380ri = "openDetailPage";
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15611ri(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
