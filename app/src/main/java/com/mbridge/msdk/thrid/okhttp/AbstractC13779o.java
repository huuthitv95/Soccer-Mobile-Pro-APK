package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.o */
/* JADX INFO: compiled from: EventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13779o {
    public static final AbstractC13779o NONE = new a();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.o$a */
    /* JADX INFO: compiled from: EventListener.java */
    static class a extends AbstractC13779o {
        a() {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.o$b */
    /* JADX INFO: compiled from: EventListener.java */
    static class b implements c {
        b() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13779o.c
        /* JADX INFO: renamed from: a */
        public AbstractC13779o mo40690a(InterfaceC13714d interfaceC13714d) {
            return AbstractC13779o.this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.o$c */
    /* JADX INFO: compiled from: EventListener.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        AbstractC13779o mo40690a(InterfaceC13714d interfaceC13714d);
    }

    static c factory(AbstractC13779o abstractC13779o) {
        return abstractC13779o.new b();
    }

    public void callEnd(InterfaceC13714d interfaceC13714d) {
    }

    public void callFailed(InterfaceC13714d interfaceC13714d, IOException iOException) {
    }

    public void callStart(InterfaceC13714d interfaceC13714d) {
    }

    public void connectEnd(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable EnumC13787w enumC13787w) {
    }

    public void connectFailed(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable EnumC13787w enumC13787w, IOException iOException) {
    }

    public void connectStart(InterfaceC13714d interfaceC13714d, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
    }

    public void connectionReleased(InterfaceC13714d interfaceC13714d, InterfaceC13719h interfaceC13719h) {
    }

    public void dnsEnd(InterfaceC13714d interfaceC13714d, String str, List<InetAddress> list) {
    }

    public void dnsStart(InterfaceC13714d interfaceC13714d, String str) {
    }

    public void requestBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
    }

    public void requestBodyStart(InterfaceC13714d interfaceC13714d) {
    }

    public void requestHeadersEnd(InterfaceC13714d interfaceC13714d, C13789y c13789y) {
    }

    public void requestHeadersStart(InterfaceC13714d interfaceC13714d) {
    }

    public void responseBodyEnd(InterfaceC13714d interfaceC13714d, long j) {
    }

    public void responseBodyStart(InterfaceC13714d interfaceC13714d) {
    }

    public void responseHeadersEnd(InterfaceC13714d interfaceC13714d, C13709a0 c13709a0) {
    }

    public void responseHeadersStart(InterfaceC13714d interfaceC13714d) {
    }

    public void secureConnectEnd(InterfaceC13714d interfaceC13714d, @Nullable C13781q c13781q) {
    }

    public void secureConnectStart(InterfaceC13714d interfaceC13714d) {
    }
}
