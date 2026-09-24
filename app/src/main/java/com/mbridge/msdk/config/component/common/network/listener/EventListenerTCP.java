package com.mbridge.msdk.config.component.common.network.listener;

import com.mbridge.msdk.config.component.nori.monitor.C12832a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.system.NoProGuard;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventListenerTCP implements NoProGuard {
    private static final String TAG = "EventListenerTCP";
    private C12832a monitorLink;

    public EventListenerTCP(C12832a c12832a) {
        this.monitorLink = c12832a;
    }

    public void callEnd() {
        C13219q0.m37816b(TAG, "callEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35644a();
        }
    }

    public void callFailed(IOException iOException) {
        C13219q0.m37816b(TAG, "callFailed");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35647a(iOException);
        }
    }

    public void callStart() {
        C13219q0.m37816b(TAG, "callStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35650b();
        }
    }

    public void connectEnd(InetSocketAddress inetSocketAddress) {
        C13219q0.m37816b(TAG, "connectEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35652c();
        }
    }

    public void connectFailed(InetSocketAddress inetSocketAddress, IOException iOException) {
        C13219q0.m37816b(TAG, "connectFailed");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35653d();
        }
    }

    public void connectStart(InetSocketAddress inetSocketAddress) {
        C13219q0.m37816b(TAG, "connectStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35654e();
        }
    }

    public void connectionAcquired() {
        C13219q0.m37816b(TAG, "connectionAcquired");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35655f();
        }
    }

    public void connectionReleased() {
        C13219q0.m37816b(TAG, "connectionReleased");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35656g();
        }
    }

    public void dnsEnd(String str, List<InetAddress> list) {
        C13219q0.m37816b(TAG, "dnsEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35657h();
        }
    }

    public void dnsStart() {
        C13219q0.m37816b(TAG, "dnsStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35658i();
        }
    }

    public void markParsingEnd() {
        C13219q0.m37816b(TAG, "markParsingEnd");
    }

    public void markParsingStart() {
        C13219q0.m37816b(TAG, "markParsingStart");
    }

    public void requestBodyEnd(long j) {
        C13219q0.m37816b(TAG, "requestBodyEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35646a(j);
        }
    }

    public void requestBodyStart() {
        C13219q0.m37816b(TAG, "requestBodyStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35663n();
        }
    }

    public void requestHeadersEnd() {
        C13219q0.m37816b(TAG, "requestHeadersEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35664o();
        }
    }

    public void requestHeadersStart() {
        C13219q0.m37816b(TAG, "requestHeadersStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35665p();
        }
    }

    public void responseBodyEnd(long j) {
        C13219q0.m37816b(TAG, "responseBodyEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35651b(j);
        }
    }

    public void responseBodyStart() {
        C13219q0.m37816b(TAG, "responseBodyStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35666q();
        }
    }

    public void responseHeadersEnd() {
        C13219q0.m37816b(TAG, "responseHeadersEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35667r();
        }
    }

    public void responseHeadersStart() {
        C13219q0.m37816b(TAG, "responseHeadersStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35668s();
        }
    }

    public void secureConnectEnd() {
        C13219q0.m37816b(TAG, "secureConnectEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35669t();
        }
    }

    public void secureConnectStart() {
        C13219q0.m37816b(TAG, "secureConnectStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35670u();
        }
    }
}
