package com.bykv.p028vk.openvk.preload.p029a;

import com.bykv.p028vk.openvk.preload.p029a.p031b.AbstractC1883a;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.d */
/* JADX INFO: compiled from: Interceptor.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1886d<IN, OUT> {

    /* JADX INFO: renamed from: d */
    private static AtomicLong f4255d = new AtomicLong();

    /* JADX INFO: renamed from: a */
    AbstractC1886d f4256a;

    /* JADX INFO: renamed from: b */
    IN f4257b;

    /* JADX INFO: renamed from: c */
    OUT f4258c;

    /* JADX INFO: renamed from: e */
    private AbstractC1883a f4259e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1882b f4260f;

    /* JADX INFO: renamed from: g */
    private long f4261g;

    /* JADX INFO: renamed from: a */
    public abstract Object mo5832a(InterfaceC1882b<OUT> interfaceC1882b, IN in) throws Throwable;

    /* JADX INFO: renamed from: a */
    final void m5847a(InterfaceC1882b interfaceC1882b, AbstractC1886d abstractC1886d, IN in, AbstractC1883a abstractC1883a, Object[] objArr) {
        this.f4260f = new C1895m(interfaceC1882b);
        this.f4256a = abstractC1886d;
        this.f4257b = in;
        this.f4259e = abstractC1883a;
        if (abstractC1886d != null) {
            this.f4261g = abstractC1886d.f4261g;
        } else {
            long andIncrement = f4255d.getAndIncrement();
            this.f4261g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        mo5848a(objArr);
    }

    /* JADX INFO: renamed from: a */
    protected void mo5848a(Object... objArr) {
    }

    /* JADX INFO: renamed from: b */
    public final long m5849b() {
        return this.f4261g;
    }

    /* JADX INFO: renamed from: b */
    final void m5850b(Throwable th) {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5839a(this.f4260f, this, th);
    }

    /* JADX INFO: renamed from: c */
    final void m5851c() {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5838a(this.f4260f, this);
    }

    /* JADX INFO: renamed from: c */
    final void m5852c(Throwable th) {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5841b(this.f4260f, this, th);
    }

    /* JADX INFO: renamed from: d */
    final void m5853d() {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5842c(this.f4260f, this);
    }

    /* JADX INFO: renamed from: d */
    protected final void m5854d(Throwable th) {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5843c(this.f4260f, this, th);
    }

    /* JADX INFO: renamed from: e */
    final void m5855e() {
        AbstractC1883a abstractC1883a = this.f4259e;
        if (abstractC1883a == null) {
            return;
        }
        abstractC1883a.mo5840b(this.f4260f, this);
    }

    /* JADX INFO: renamed from: f */
    public final OUT m5856f() {
        return this.f4258c;
    }
}
