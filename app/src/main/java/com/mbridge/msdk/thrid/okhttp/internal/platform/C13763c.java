package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.c */
/* JADX INFO: compiled from: ConscryptPlatform.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13763c extends C13767g {
    private C13763c() {
    }

    /* JADX INFO: renamed from: h */
    public static C13763c m40617h() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C13763c();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private Provider m40618i() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, String str, List<EnumC13787w> list) throws IOException {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo40597a(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C13767g.m40631a(list).toArray(new String[0]));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40619a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo40598b(sSLSocket);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: e */
    public SSLContext mo40611e() {
        try {
            return SSLContext.getInstance("TLSv1.3", m40618i());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m40618i());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }
}
