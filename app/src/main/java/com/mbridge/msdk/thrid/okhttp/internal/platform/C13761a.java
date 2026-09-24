package com.mbridge.msdk.thrid.okhttp.internal.platform;

import android.net.ssl.SSLSockets;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.a */
/* JADX INFO: compiled from: Android10Platform.java */
/* JADX INFO: loaded from: classes7.dex */
class C13761a extends C13762b {
    C13761a(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    private void m40595c(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static C13767g m40596h() {
        if (!C13767g.m40636f()) {
            return null;
        }
        try {
            if (C13762b.m40602i() >= 29) {
                return new C13761a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13762b, com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, String str, List<EnumC13787w> list) throws IOException {
        try {
            m40595c(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C13767g.m40631a(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13762b, com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
