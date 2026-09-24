package com.google.android.play.core.assetpacks.model;

import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.model.b */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10133b {
    /* JADX INFO: renamed from: a */
    public static String m22790a(String str, String str2) {
        return str + CertificateUtil.DELIMITER + str2;
    }

    /* JADX INFO: renamed from: b */
    public static String m22791b(String str, String str2, String str3) {
        return str + CertificateUtil.DELIMITER + str2 + CertificateUtil.DELIMITER + str3;
    }
}
