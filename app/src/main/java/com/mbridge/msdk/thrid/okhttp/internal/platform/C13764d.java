package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.d */
/* JADX INFO: compiled from: Jdk9Platform.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13764d extends C13767g {

    /* JADX INFO: renamed from: c */
    final Method f39104c;

    /* JADX INFO: renamed from: d */
    final Method f39105d;

    C13764d(Method method, Method method2) {
        this.f39104c = method;
        this.f39105d = method2;
    }

    /* JADX INFO: renamed from: h */
    public static C13764d m40620h() {
        try {
            return new C13764d(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    /* JADX INFO: renamed from: a */
    public void mo40597a(SSLSocket sSLSocket, String str, List<EnumC13787w> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> listM40631a = C13767g.m40631a(list);
            this.f39104c.invoke(sSLParameters, listM40631a.toArray(new String[listM40631a.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw C13723c.m40269a("unable to set ssl parameters", (Exception) e);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g
    @Nullable
    /* JADX INFO: renamed from: b */
    public String mo40598b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f39105d.invoke(sSLSocket, null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException e) {
            throw C13723c.m40269a("failed to get ALPN selected protocol", (Exception) e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw C13723c.m40269a("failed to get ALPN selected protocol", (Exception) e2);
        }
    }
}
