package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.c0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8917c0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC8911b0 f20990a;

    public C8917c0(AbstractC8911b0 abstractC8911b0) {
        Charset charset = AbstractC8972l1.f21064a;
        if (abstractC8911b0 == null) {
            throw new NullPointerException("output");
        }
        this.f20990a = abstractC8911b0;
        abstractC8911b0.f20985a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m21522a(int i, double d) {
        AbstractC8911b0 abstractC8911b0 = this.f20990a;
        abstractC8911b0.getClass();
        abstractC8911b0.mo21475a(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: a */
    public final void m21523a(int i, float f) {
        AbstractC8911b0 abstractC8911b0 = this.f20990a;
        abstractC8911b0.getClass();
        abstractC8911b0.mo21474a(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: a */
    public final void m21524a(int i, int i2) {
        this.f20990a.mo21491d(i, AbstractC8911b0.m21517d(i2));
    }

    /* JADX INFO: renamed from: a */
    public final void m21525a(int i, long j) {
        this.f20990a.mo21484b(i, AbstractC8911b0.m21515b(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m21526a(int i, Object obj, InterfaceC9019t2 interfaceC9019t2) {
        AbstractC8911b0 abstractC8911b0 = this.f20990a;
        abstractC8911b0.mo21489c(i, 3);
        interfaceC9019t2.mo21635a(obj, abstractC8911b0.f20985a);
        abstractC8911b0.mo21489c(i, 4);
    }
}
