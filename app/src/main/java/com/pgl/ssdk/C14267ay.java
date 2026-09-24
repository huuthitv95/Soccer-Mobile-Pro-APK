package com.pgl.ssdk;

/* JADX INFO: renamed from: com.pgl.ssdk.ay */
/* JADX INFO: loaded from: classes7.dex */
public class C14267ay {
    /* JADX INFO: renamed from: a */
    public static String m43030a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
