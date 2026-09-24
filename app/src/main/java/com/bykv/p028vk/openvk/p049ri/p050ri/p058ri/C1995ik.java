package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2671sf;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C1995ik {

    /* JADX INFO: renamed from: fi */
    private static int f4605fi = 1;

    /* JADX INFO: renamed from: ik */
    private static String f4606ik;

    /* JADX INFO: renamed from: ka */
    private static AbstractC2671sf f4607ka;

    /* JADX INFO: renamed from: lr */
    private static Context f4608lr;

    /* JADX INFO: renamed from: ri */
    public static boolean f4609ri;

    /* JADX INFO: renamed from: fi */
    public static int m6291fi() {
        return f4605fi;
    }

    /* JADX INFO: renamed from: ik */
    public static AbstractC2671sf m6292ik() {
        if (f4607ka == null) {
            f4607ka = new AbstractC2671sf.ri("v_config").m10010ri(10000L, TimeUnit.MILLISECONDS).m10009lr(10000L, TimeUnit.MILLISECONDS).m10008ik(10000L, TimeUnit.MILLISECONDS).m10012ri();
        }
        return f4607ka;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m6293ka() {
        return f4609ri;
    }

    /* JADX INFO: renamed from: lr */
    public static String m6294lr() {
        if (TextUtils.isEmpty(f4606ik)) {
            try {
                File file = new File(m6295ri().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f4606ik = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f4606ik;
    }

    /* JADX INFO: renamed from: ri */
    public static Context m6295ri() {
        return f4608lr;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6296ri(int i) {
        f4605fi = i;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6297ri(Context context, String str) {
        f4608lr = context;
        f4606ik = str;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6298ri(AbstractC2671sf abstractC2671sf) {
        f4607ka = abstractC2671sf;
    }
}
