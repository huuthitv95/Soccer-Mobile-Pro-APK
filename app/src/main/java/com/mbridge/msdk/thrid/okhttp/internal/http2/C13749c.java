package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13796f;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.c */
/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13749c {

    /* JADX INFO: renamed from: d */
    public static final C13796f f38923d = C13796f.m40911c(CertificateUtil.DELIMITER);

    /* JADX INFO: renamed from: e */
    public static final C13796f f38924e = C13796f.m40911c(":status");

    /* JADX INFO: renamed from: f */
    public static final C13796f f38925f = C13796f.m40911c(":method");

    /* JADX INFO: renamed from: g */
    public static final C13796f f38926g = C13796f.m40911c(":path");

    /* JADX INFO: renamed from: h */
    public static final C13796f f38927h = C13796f.m40911c(":scheme");

    /* JADX INFO: renamed from: i */
    public static final C13796f f38928i = C13796f.m40911c(":authority");

    /* JADX INFO: renamed from: a */
    public final C13796f f38929a;

    /* JADX INFO: renamed from: b */
    public final C13796f f38930b;

    /* JADX INFO: renamed from: c */
    final int f38931c;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.c$a */
    /* JADX INFO: compiled from: Header.java */
    interface a {
    }

    public C13749c(C13796f c13796f, C13796f c13796f2) {
        this.f38929a = c13796f;
        this.f38930b = c13796f2;
        this.f38931c = c13796f.mo40923j() + 32 + c13796f2.mo40923j();
    }

    public C13749c(C13796f c13796f, String str) {
        this(c13796f, C13796f.m40911c(str));
    }

    public C13749c(String str, String str2) {
        this(C13796f.m40911c(str), C13796f.m40911c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13749c) {
            C13749c c13749c = (C13749c) obj;
            if (this.f38929a.equals(c13749c.f38929a) && this.f38930b.equals(c13749c.f38930b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f38929a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f38930b.hashCode();
    }

    public String toString() {
        return C13723c.m40272a("%s: %s", this.f38929a.mo40926m(), this.f38930b.mo40926m());
    }
}
