package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c4 */
/* JADX INFO: loaded from: classes6.dex */
public class C12126c4 {

    /* JADX INFO: renamed from: a */
    public static final String f30165a = "SSA_CORE.SDKController.runFunction";

    /* JADX INFO: renamed from: a */
    public static String m31256a(C12144d4 c12144d4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", f30165a, c12144d4.m31281b(), m31257a(c12144d4.m31282c()), m31258b(c12144d4));
    }

    /* JADX INFO: renamed from: b */
    private static String m31258b(C12144d4 c12144d4) {
        return (c12144d4.m31283d() == null || c12144d4.m31280a() == null) ? "" : String.format(", '%1$s', '%2$s'", c12144d4.m31283d(), c12144d4.m31280a());
    }

    /* JADX INFO: renamed from: a */
    private static String m31257a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
