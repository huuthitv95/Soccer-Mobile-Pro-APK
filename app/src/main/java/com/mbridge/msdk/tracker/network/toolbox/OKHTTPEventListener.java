package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13781q;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13719h;
import com.mbridge.msdk.tracker.network.C13846p;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class OKHTTPEventListener extends AbstractC13779o implements NoProGuard {
    private static String TAG = "OKHTTPEventListener";
    private final C13846p monitor;

    public OKHTTPEventListener(C13846p c13846p) {
        this.monitor = c13846p;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callEnd(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41167a((IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callFailed(InterfaceC13714d interfaceC13714d, IOException iOException) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41167a(iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void callStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41162a(interfaceC13714d);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectEnd(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC13787w enumC13787w) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("connection_end");
        this.monitor.m41165a(enumC13787w, (IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectFailed(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC13787w enumC13787w, IOException iOException) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41165a(enumC13787w, iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectStart(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("connection_start");
        this.monitor.m41170a(inetSocketAddress, proxy);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectionAcquired(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41163a(interfaceC13719h);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void connectionReleased(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41175b(interfaceC13719h);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void dnsEnd(InterfaceC13714d interfaceC13714d, String str, List<InetAddress> list) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("dns_end");
        this.monitor.m41171a(list);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void dnsStart(InterfaceC13714d interfaceC13714d, String str) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("dns_start");
        this.monitor.m41158a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("request_body_end");
        this.monitor.m41174b(j);
        this.monitor.m41182d("transmission_start");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestBodyStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("request_body_start");
        this.monitor.m41153R();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestHeadersEnd(InterfaceC13714d interfaceC13714d, C13789y c13789y) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("request_header_end");
        this.monitor.m41166a(c13789y);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void requestHeadersStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("request_header_start");
        this.monitor.m41154S();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("response_body_end");
        this.monitor.m41192h(j);
        this.monitor.m41181d(j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseBodyStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("response_body_start");
        this.monitor.m41155U();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseHeadersEnd(InterfaceC13714d interfaceC13714d, C13709a0 c13709a0) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("response_header_end");
        this.monitor.m41161a(c13709a0);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void responseHeadersStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("response_header_start");
        this.monitor.m41156V();
        this.monitor.m41182d("transmission_end");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void secureConnectEnd(InterfaceC13714d interfaceC13714d, C13781q c13781q) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("secure_connect_end");
        this.monitor.m41164a(c13781q);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o
    public void secureConnectStart(InterfaceC13714d interfaceC13714d) {
        C13846p c13846p = this.monitor;
        if (c13846p == null) {
            return;
        }
        c13846p.m41182d("secure_connect_start");
        this.monitor.m41157W();
    }
}
