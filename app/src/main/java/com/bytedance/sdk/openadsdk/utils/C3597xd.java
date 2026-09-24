package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.ironsource.C12460ra;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.xd */
/* JADX INFO: loaded from: classes3.dex */
public class C3597xd {

    /* JADX INFO: renamed from: ri */
    private static String f13345ri;

    /* JADX INFO: renamed from: ik */
    public static boolean m16677ik() {
        return false;
    }

    /* JADX INFO: renamed from: lr */
    public static String m16678lr() {
        if (TextUtils.isEmpty(f13345ri)) {
            f13345ri = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return f13345ri;
    }

    /* JADX INFO: renamed from: ri */
    public static String m16679ri(String str) {
        try {
            if (!m16680ri()) {
                return str;
            }
            String strM14695nr = C3304qt.m14669lr().m14695nr();
            if (TextUtils.isEmpty(strM14695nr)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strM14695nr)));
            return Uri.parse(str).buildUpon().appendQueryParameter(m16678lr(), strM14695nr).appendQueryParameter(C12460ra.f31825b, "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16680ri() {
        return C2730vr.m10314ik() && C3304qt.m14669lr().m14703vr() && C3304qt.m14669lr().m14680bu();
    }
}
