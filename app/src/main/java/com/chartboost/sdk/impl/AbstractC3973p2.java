package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3973p2 {
    /* JADX INFO: renamed from: a */
    public static boolean m19010a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Invalid activity context passed during intitalization");
            }
            int iCheckSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
            boolean z = context.checkSelfPermission("android.permission.INTERNET") != 0;
            boolean z2 = iCheckSelfPermission != 0;
            if (z) {
                throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
            }
            if (z2) {
                throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m19011a(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new C3920mg(jSONObject));
            return true;
        } catch (Exception e) {
            C4048sb.m19410b("updateConfig: " + e, null);
            return false;
        }
    }
}
