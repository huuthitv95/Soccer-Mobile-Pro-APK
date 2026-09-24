package com.mbridge.msdk.config.component.common.network.listener;

import com.mbridge.msdk.config.component.nori.monitor.C12832a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13781q;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13719h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EventListenerOKHttp extends AbstractC13779o implements NoProGuard {
    private static final String TAG = "EventListenerOKHttp";
    private C12832a monitorLink;

    public EventListenerOKHttp(C12832a c12832a) {
        this.monitorLink = c12832a;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callEnd(InterfaceC13714d interfaceC13714d) {
        super.callEnd(interfaceC13714d);
        C13219q0.m37816b(TAG, "callEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35644a();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callFailed(InterfaceC13714d interfaceC13714d, IOException iOException) {
        super.callFailed(interfaceC13714d, iOException);
        C13219q0.m37816b(TAG, "callFailed");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35647a(iOException);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callStart(InterfaceC13714d interfaceC13714d) {
        super.callStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "callStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35650b();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectEnd(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC13787w enumC13787w) {
        super.connectEnd(interfaceC13714d, inetSocketAddress, proxy, enumC13787w);
        C13219q0.m37816b(TAG, "connectEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35652c();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectFailed(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC13787w enumC13787w, IOException iOException) {
        super.connectFailed(interfaceC13714d, inetSocketAddress, proxy, enumC13787w, iOException);
        C13219q0.m37816b(TAG, "connectFailed");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35653d();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectStart(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(interfaceC13714d, inetSocketAddress, proxy);
        C13219q0.m37816b(TAG, "connectStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35654e();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectionAcquired(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
        super.connectionAcquired(interfaceC13714d, interfaceC13719h);
        C13219q0.m37816b(TAG, "connectionAcquired");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35655f();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectionReleased(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
        super.connectionReleased(interfaceC13714d, interfaceC13719h);
        C13219q0.m37816b(TAG, "connectionReleased");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35656g();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void dnsEnd(InterfaceC13714d interfaceC13714d, String str, List<InetAddress> list) {
        super.dnsEnd(interfaceC13714d, str, list);
        C13219q0.m37816b(TAG, "dnsEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35657h();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void dnsStart(InterfaceC13714d interfaceC13714d, String str) {
        super.dnsStart(interfaceC13714d, str);
        C13219q0.m37816b(TAG, "dnsStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35658i();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
        super.requestBodyEnd(interfaceC13714d, j);
        C13219q0.m37816b(TAG, "requestBodyEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35646a(j);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestBodyStart(InterfaceC13714d interfaceC13714d) {
        super.requestBodyStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "requestBodyStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35663n();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestHeadersEnd(InterfaceC13714d interfaceC13714d, C13789y c13789y) {
        super.requestHeadersEnd(interfaceC13714d, c13789y);
        C13219q0.m37816b(TAG, "requestHeadersEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35664o();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestHeadersStart(InterfaceC13714d interfaceC13714d) {
        super.requestHeadersStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "requestHeadersStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35665p();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
        super.responseBodyEnd(interfaceC13714d, j);
        C13219q0.m37816b(TAG, "responseBodyEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35651b(j);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseBodyStart(InterfaceC13714d interfaceC13714d) {
        super.responseBodyStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "responseBodyStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35666q();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseHeadersEnd(InterfaceC13714d interfaceC13714d, C13709a0 c13709a0) {
        super.responseHeadersEnd(interfaceC13714d, c13709a0);
        C13219q0.m37816b(TAG, "responseHeadersEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35667r();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseHeadersStart(InterfaceC13714d interfaceC13714d) {
        super.responseHeadersStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "responseHeadersStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35668s();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void secureConnectEnd(InterfaceC13714d interfaceC13714d, C13781q c13781q) {
        super.secureConnectEnd(interfaceC13714d, c13781q);
        C13219q0.m37816b(TAG, "secureConnectEnd");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35669t();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void secureConnectStart(InterfaceC13714d interfaceC13714d) {
        super.secureConnectStart(interfaceC13714d);
        C13219q0.m37816b(TAG, "secureConnectStart");
        C12832a c12832a = this.monitorLink;
        if (c12832a != null) {
            c12832a.m35670u();
        }
    }
}
