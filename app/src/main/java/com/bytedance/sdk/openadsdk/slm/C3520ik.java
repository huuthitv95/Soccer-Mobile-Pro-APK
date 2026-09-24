package com.bytedance.sdk.openadsdk.slm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3520ik {

    /* JADX INFO: renamed from: fi */
    private static volatile boolean f12754fi;

    /* JADX INFO: renamed from: ik */
    private static volatile boolean f12755ik;

    /* JADX INFO: renamed from: ri */
    private static final HashMap<String, Integer> f12758ri = new HashMap<>();

    /* JADX INFO: renamed from: lr */
    private static volatile int f12757lr = 10000;

    /* JADX INFO: renamed from: ka */
    private static volatile boolean f12756ka = true;

    /* JADX INFO: renamed from: lr */
    public static int m15933lr(String str, int i) {
        if (f12755ik) {
            return 0;
        }
        if (!f12754fi) {
            return i;
        }
        Integer numValueOf = f12758ri.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m15934lr() {
        return f12755ik;
    }

    /* JADX INFO: renamed from: ri */
    public static void m15935ri() {
        String strM16707ri = C3606fi.m16707ri("stats_control", "");
        if (!TextUtils.isEmpty(strM16707ri)) {
            try {
                JSONObject jSONObject = new JSONObject(strM16707ri);
                f12757lr = jSONObject.optInt("sampling_def", 10000);
                String strOptString = jSONObject.optString("sampling");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        f12758ri.put(next, Integer.valueOf(jSONObject2.optInt(next, f12757lr)));
                    }
                }
            } catch (Exception unused) {
            }
        }
        f12756ka = false;
        f12755ik = false;
        if (f12757lr == 10000 && f12758ri.isEmpty()) {
            f12756ka = true;
        } else if (f12757lr == 0 && f12758ri.isEmpty()) {
            f12755ik = true;
        }
        f12754fi = true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m15936ri(String str, int i) {
        if (f12756ka || !f12754fi) {
            return true;
        }
        if (f12755ik) {
            return false;
        }
        if (i < 0) {
            i = f12757lr;
        }
        Integer numValueOf = f12758ri.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(i);
        }
        if (numValueOf.intValue() <= 0) {
            return false;
        }
        return numValueOf.intValue() >= 10000 || ((int) ((Math.random() * 10000.0d) + 1.0d)) <= numValueOf.intValue();
    }
}
