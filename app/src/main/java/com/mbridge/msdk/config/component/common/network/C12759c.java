package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.config.component.common.network.connect.okhttp.C12760a;
import com.mbridge.msdk.config.component.common.network.connect.socket.C12761a;
import com.mbridge.msdk.config.component.common.network.result.C12764a;
import com.mbridge.msdk.config.component.nori.model.C12831a;
import com.mbridge.msdk.config.component.nori.monitor.C12833b;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.c */
/* JADX INFO: compiled from: NetworkRequest.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12759c {

    /* JADX INFO: renamed from: a */
    private InterfaceC12757a f33931a;

    /* JADX INFO: renamed from: b */
    private C12764a f33932b;

    /* JADX INFO: renamed from: c */
    private C12831a f33933c;

    /* JADX INFO: renamed from: d */
    private C12833b f33934d;

    /* JADX INFO: renamed from: e */
    private String f33935e;

    /* JADX INFO: renamed from: f */
    private String f33936f = "HTTP";

    /* JADX INFO: renamed from: g */
    private C12761a f33937g = null;

    /* JADX INFO: renamed from: h */
    private C12760a f33938h = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.c$a */
    /* JADX INFO: compiled from: NetworkRequest.java */
    class a implements InterfaceC12758b {
        a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12758b
        /* JADX INFO: renamed from: a */
        public void mo35105a() {
            if (C12759c.this.f33937g != null) {
                C12759c.this.f33937g.m35128a();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.c$b */
    /* JADX INFO: compiled from: NetworkRequest.java */
    class b implements InterfaceC12758b {
        b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.InterfaceC12758b
        /* JADX INFO: renamed from: a */
        public void mo35105a() {
            if (C12759c.this.f33938h != null) {
                C12759c.this.f33938h.m35122a();
            }
        }
    }

    public C12759c(C12831a c12831a, C12764a c12764a) {
        this.f33933c = c12831a;
        this.f33932b = c12764a;
        this.f33934d = c12764a.m35151a();
    }

    /* JADX INFO: renamed from: c */
    private void m35109c() {
        try {
            C12761a c12761a = new C12761a(this.f33933c, this.f33932b, this.f33931a);
            this.f33937g = c12761a;
            c12761a.m35127a(this.f33935e);
            this.f33934d.m35677a(new a());
        } catch (Exception e) {
            C13219q0.m37817b("NetworkRequestTask", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35110a(String str, InterfaceC12757a interfaceC12757a) {
        this.f33935e = str;
        this.f33931a = interfaceC12757a;
        this.f33936f = this.f33933c.m35640i();
    }

    /* JADX INFO: renamed from: b */
    public void m35111b() {
        InterfaceC12757a interfaceC12757a = this.f33931a;
        if (interfaceC12757a != null) {
            interfaceC12757a.mo35101a(this.f33932b);
        }
        if (this.f33936f.equals("TCP")) {
            m35109c();
        } else {
            m35107a();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35107a() {
        try {
            C12760a c12760a = new C12760a(this.f33933c, this.f33932b, this.f33931a);
            this.f33938h = c12760a;
            c12760a.m35121a(this.f33935e);
            this.f33934d.m35677a(new b());
        } catch (Exception e) {
            C13219q0.m37817b("NetworkRequestTask", e.getMessage(), e);
        }
    }
}
