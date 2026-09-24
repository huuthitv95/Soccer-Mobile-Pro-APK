package com.ironsource.sdk.controller;

import com.ironsource.C11419Eb;
import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.s */
/* JADX INFO: loaded from: classes6.dex */
final class C12510s {

    /* JADX INFO: renamed from: b */
    private static final String f32209b = "MD5";

    /* JADX INFO: renamed from: a */
    private String f32210a;

    C12510s(String str) {
        this.f32210a = str;
    }

    /* JADX INFO: renamed from: a */
    static String m33481a() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: b */
    private String m33484b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return m33483a(messageDigest.digest());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m33482a(String str) {
        try {
            return C11419Eb.m25707a(str);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return m33484b(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m33483a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    String m33486b() {
        return this.f32210a;
    }

    /* JADX INFO: renamed from: a */
    boolean m33485a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m33482a(str + str2 + this.f32210a));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }
}
