package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.C13774j;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.b */
/* JADX INFO: compiled from: ConnectionSpecSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13728b {

    /* JADX INFO: renamed from: a */
    private final List<C13774j> f38807a;

    /* JADX INFO: renamed from: b */
    private int f38808b = 0;

    /* JADX INFO: renamed from: c */
    private boolean f38809c;

    /* JADX INFO: renamed from: d */
    private boolean f38810d;

    public C13728b(List<C13774j> list) {
        this.f38807a = list;
    }

    /* JADX INFO: renamed from: b */
    private boolean m40313b(SSLSocket sSLSocket) {
        for (int i = this.f38808b; i < this.f38807a.size(); i++) {
            if (this.f38807a.get(i).m40655a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C13774j m40314a(SSLSocket sSLSocket) throws IOException {
        C13774j c13774j;
        int i = this.f38808b;
        int size = this.f38807a.size();
        while (true) {
            if (i >= size) {
                c13774j = null;
                break;
            }
            c13774j = this.f38807a.get(i);
            if (c13774j.m40655a(sSLSocket)) {
                this.f38808b = i + 1;
                break;
            }
            i++;
        }
        if (c13774j != null) {
            this.f38809c = m40313b(sSLSocket);
            AbstractC13721a.f38769a.mo40257a(c13774j, sSLSocket, this.f38810d);
            return c13774j;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f38810d + ", modes=" + this.f38807a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    /* JADX INFO: renamed from: a */
    public boolean m40315a(IOException iOException) {
        this.f38810d = true;
        if (!this.f38809c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
