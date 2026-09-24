package com.mbridge.msdk.config.component.pipeline.util;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.pipeline.C12834a;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.pipeline.util.a */
/* JADX INFO: compiled from: PipelineUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12835a {
    /* JADX INFO: renamed from: a */
    public static long m35696a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return str.contains(".") ? Math.round(Float.parseFloat(str) * 1000.0f) : ((long) Integer.parseInt(str)) * 1000;
        } catch (Throwable unused) {
            C13219q0.m37816b("PipelineUtil", "Pipeline convert delay time error, will use 0");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m35697a() {
        int iLastIndexOf;
        Package r0 = C12834a.class.getPackage();
        if (r0 != null) {
            String name = r0.getName();
            if (!TextUtils.isEmpty(name) && (iLastIndexOf = name.lastIndexOf(".")) != 0) {
                String strSubstring = name.substring(0, iLastIndexOf);
                return !TextUtils.isEmpty(strSubstring) ? strSubstring : "com.mbridge.msdk.config.component";
            }
            return "com.mbridge.msdk.config.component";
        }
        return "com.mbridge.msdk.config.component";
    }
}
