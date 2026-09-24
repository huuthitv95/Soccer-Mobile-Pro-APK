package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8533b implements InterfaceC8567i, InterfaceC8628q {

    /* JADX INFO: renamed from: n */
    public static final int f19155n = AbstractC8827z.m21379a("FLV");

    /* JADX INFO: renamed from: e */
    public InterfaceC8568j f19160e;

    /* JADX INFO: renamed from: g */
    public int f19162g;

    /* JADX INFO: renamed from: h */
    public int f19163h;

    /* JADX INFO: renamed from: i */
    public int f19164i;

    /* JADX INFO: renamed from: j */
    public long f19165j;

    /* JADX INFO: renamed from: k */
    public C8532a f19166k;

    /* JADX INFO: renamed from: l */
    public C8537f f19167l;

    /* JADX INFO: renamed from: m */
    public C8534c f19168m;

    /* JADX INFO: renamed from: a */
    public final C8815n f19156a = new C8815n(4);

    /* JADX INFO: renamed from: b */
    public final C8815n f19157b = new C8815n(9);

    /* JADX INFO: renamed from: c */
    public final C8815n f19158c = new C8815n(11);

    /* JADX INFO: renamed from: d */
    public final C8815n f19159d = new C8815n();

    /* JADX INFO: renamed from: f */
    public int f19161f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        C8534c c8534c;
        C8537f c8537f;
        C8532a c8532a;
        while (true) {
            int i = this.f19161f;
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    c8527b.m21023a(this.f19162g);
                    this.f19162g = 0;
                    this.f19161f = 3;
                } else if (i != 3) {
                    if (i == 4) {
                        int i2 = this.f19163h;
                        if (i2 == 8 && (c8532a = this.f19166k) != null) {
                            C8815n c8815nM21039b = m21039b(c8527b);
                            long j = this.f19165j;
                            c8532a.m21034a(c8815nM21039b);
                            c8532a.m21033a(c8815nM21039b, j);
                        } else if (i2 == 9 && (c8537f = this.f19167l) != null) {
                            C8815n c8815nM21039b2 = m21039b(c8527b);
                            long j2 = this.f19165j;
                            if (c8537f.m21044a(c8815nM21039b2)) {
                                c8537f.m21043a(c8815nM21039b2, j2);
                            }
                        } else if (i2 != 18 || (c8534c = this.f19168m) == null) {
                            c8527b.m21023a(this.f19164i);
                            z = false;
                        } else {
                            c8534c.m21042a(m21039b(c8527b), this.f19165j);
                        }
                        this.f19162g = 4;
                        this.f19161f = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!c8527b.m21027b(this.f19158c.f20643a, 0, 11, true)) {
                        return -1;
                    }
                    this.f19158c.m21347e(0);
                    this.f19163h = this.f19158c.m21352j();
                    this.f19164i = this.f19158c.m21354l();
                    this.f19165j = this.f19158c.m21354l();
                    this.f19165j = (((long) (this.f19158c.m21352j() << 24)) | this.f19165j) * 1000;
                    C8815n c8815n = this.f19158c;
                    c8815n.m21347e(c8815n.f20644b + 3);
                    this.f19161f = 4;
                }
            } else {
                if (!c8527b.m21027b(this.f19157b.f20643a, 0, 9, true)) {
                    return -1;
                }
                this.f19157b.m21347e(0);
                C8815n c8815n2 = this.f19157b;
                c8815n2.m21347e(c8815n2.f20644b + 4);
                int iM21352j = this.f19157b.m21352j();
                boolean z2 = (iM21352j & 4) != 0;
                boolean z3 = (iM21352j & 1) != 0;
                if (z2 && this.f19166k == null) {
                    this.f19166k = new C8532a(this.f19160e.mo21092a(8, 1));
                }
                if (z3 && this.f19167l == null) {
                    this.f19167l = new C8537f(this.f19160e.mo21092a(9, 2));
                }
                if (this.f19168m == null) {
                    this.f19168m = new C8534c();
                }
                this.f19160e.mo21096b();
                this.f19160e.mo21093a(this);
                this.f19162g = this.f19157b.m21340b() - 5;
                this.f19161f = 2;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f19161f = 1;
        this.f19162g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19160e = interfaceC8568j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        c8527b.m21025a(this.f19156a.f20643a, 0, 3, false);
        this.f19156a.m21347e(0);
        if (this.f19156a.m21354l() != f19155n) {
            return false;
        }
        c8527b.m21025a(this.f19156a.f20643a, 0, 2, false);
        this.f19156a.m21347e(0);
        if ((this.f19156a.m21357o() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        c8527b.m21025a(this.f19156a.f20643a, 0, 4, false);
        this.f19156a.m21347e(0);
        int iM21340b = this.f19156a.m21340b();
        c8527b.f19126e = 0;
        c8527b.m21024a(iM21340b, false);
        c8527b.m21025a(this.f19156a.f20643a, 0, 4, false);
        this.f19156a.m21347e(0);
        return this.f19156a.m21340b() == 0;
    }

    /* JADX INFO: renamed from: b */
    public final C8815n m21039b(C8527b c8527b) throws InterruptedException, EOFException {
        if (this.f19164i > this.f19159d.m21337a()) {
            C8815n c8815n = this.f19159d;
            c8815n.f20643a = new byte[Math.max(c8815n.m21337a() * 2, this.f19164i)];
            c8815n.f20645c = 0;
            c8815n.f20644b = 0;
        } else {
            this.f19159d.m21347e(0);
        }
        this.f19159d.m21345d(this.f19164i);
        c8527b.m21027b(this.f19159d.f20643a, 0, this.f19164i, false);
        return this.f19159d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19168m.f19169b;
    }
}
