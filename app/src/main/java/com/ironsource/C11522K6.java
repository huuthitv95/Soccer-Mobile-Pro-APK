package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.K6 */
/* JADX INFO: loaded from: classes6.dex */
public class C11522K6 {
    /* JADX INFO: renamed from: a */
    public static String m26259a(String str) {
        try {
            return new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    static String m26260b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
