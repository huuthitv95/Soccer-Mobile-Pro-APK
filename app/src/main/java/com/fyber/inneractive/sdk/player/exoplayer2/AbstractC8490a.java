package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8520c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8490a {

    /* JADX INFO: renamed from: a */
    public final int f18923a;

    /* JADX INFO: renamed from: b */
    public C8742t f18924b;

    /* JADX INFO: renamed from: c */
    public int f18925c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8737v f18926d;

    /* JADX INFO: renamed from: e */
    public long f18927e;

    /* JADX INFO: renamed from: f */
    public boolean f18928f = true;

    /* JADX INFO: renamed from: g */
    public boolean f18929g;

    public AbstractC8490a(int i) {
        this.f18923a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m20951a(C8709p c8709p, C8520c c8520c, boolean z) {
        int iMo21085a = this.f18926d.mo21085a(c8709p, c8520c, z);
        if (iMo21085a == -4) {
            if (c8520c.m21018b(4)) {
                this.f18928f = true;
                return this.f18929g ? -4 : -3;
            }
            c8520c.f19105d += this.f18927e;
            return iMo21085a;
        }
        if (iMo21085a == -5) {
            C8708o c8708o = c8709p.f20316a;
            long j = c8708o.f20312w;
            if (j != Long.MAX_VALUE) {
                c8709p.f20316a = new C8708o(c8708o.f20290a, c8708o.f20294e, c8708o.f20295f, c8708o.f20292c, c8708o.f20291b, c8708o.f20296g, c8708o.f20299j, c8708o.f20300k, c8708o.f20301l, c8708o.f20302m, c8708o.f20303n, c8708o.f20305p, c8708o.f20304o, c8708o.f20306q, c8708o.f20307r, c8708o.f20308s, c8708o.f20309t, c8708o.f20310u, c8708o.f20311v, c8708o.f20313x, c8708o.f20314y, c8708o.f20315z, j + this.f18927e, c8708o.f20297h, c8708o.f20298i, c8708o.f20293d);
            }
        }
        return iMo21085a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20952a(int i, Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo20953a(long j, long j2);

    /* JADX INFO: renamed from: a */
    public abstract void mo20954a(boolean z, long j);

    /* JADX INFO: renamed from: a */
    public void mo20955a(C8708o[] c8708oArr) {
    }

    /* JADX INFO: renamed from: c */
    public final void m20956c() {
        if (this.f18925c != 1) {
            throw new IllegalStateException();
        }
        this.f18925c = 0;
        this.f18926d = null;
        this.f18929g = false;
        mo20960g();
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC8809h mo20957d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo20958e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo20959f();

    /* JADX INFO: renamed from: g */
    public abstract void mo20960g();

    /* JADX INFO: renamed from: h */
    public abstract void mo20961h();

    /* JADX INFO: renamed from: i */
    public abstract void mo20962i();

    /* JADX INFO: renamed from: j */
    public abstract void mo20963j();
}
