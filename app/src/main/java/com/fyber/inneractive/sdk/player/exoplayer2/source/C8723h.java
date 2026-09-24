package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8723h implements InterfaceC8738w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8738w[] f20352a;

    public C8723h(InterfaceC8738w[] interfaceC8738wArr) {
        this.f20352a = interfaceC8738wArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: b */
    public final boolean mo21075b(long j) {
        boolean zMo21075b;
        boolean z = false;
        do {
            long jMo21078f = mo21078f();
            if (jMo21078f == Long.MIN_VALUE) {
                return z;
            }
            zMo21075b = false;
            for (InterfaceC8738w interfaceC8738w : this.f20352a) {
                if (interfaceC8738w.mo21078f() == jMo21078f) {
                    zMo21075b |= interfaceC8738w.mo21075b(j);
                }
            }
            z |= zMo21075b;
        } while (zMo21075b);
        return z;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: f */
    public final long mo21078f() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC8738w interfaceC8738w : this.f20352a) {
            long jMo21078f = interfaceC8738w.mo21078f();
            if (jMo21078f != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo21078f);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
