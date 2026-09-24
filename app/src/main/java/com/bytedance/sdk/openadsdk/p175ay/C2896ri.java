package com.bytedance.sdk.openadsdk.p175ay;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2896ri {
    /* JADX INFO: renamed from: ri */
    private static int m11139ri(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ri */
    private static String m11140ri(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e) {
                C2707ac.m10196ik("TrackAdUrlUtils", e.getMessage());
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ri */
    public static List<String> m11141ri(List<String> list, boolean z) {
        String strM12377ri = C3089aw.m12377ri(C3299nr.m14642ri());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strM12377ri)) {
                next = next.replace("{UID}", strM12377ri).replace("__UID__", strM12377ri);
            }
            if (z) {
                next = m11140ri(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static List<String> m11142ri(List<String> list, boolean z, wjv wjvVar) {
        String strM12377ri = C3089aw.m12377ri(C3299nr.m14642ri());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strM12377ri)) {
                next = next.replace("{UID}", strM12377ri).replace("__UID__", strM12377ri);
            }
            if (next.contains("__CID__") && wjvVar != null && !TextUtils.isEmpty(wjvVar.m14533tn())) {
                next = next.replace("__CID__", wjvVar.m14533tn());
            }
            if (next.contains("__CTYPE__") && wjvVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(m11139ri(wjvVar.m14552vz())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", C3369ri.m15224ri().m15229lr());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(C3571ig.m16449ka()));
            }
            if (z) {
                next = m11140ri(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
