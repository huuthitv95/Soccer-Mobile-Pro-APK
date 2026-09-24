package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C8662a implements InterfaceC8567i, InterfaceC8628q {

    /* JADX INFO: renamed from: a */
    public InterfaceC8568j f20110a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8629r f20111b;

    /* JADX INFO: renamed from: c */
    public C8663b f20112c;

    /* JADX INFO: renamed from: d */
    public int f20113d;

    /* JADX INFO: renamed from: e */
    public int f20114e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        if (this.f20112c == null) {
            C8663b c8663bM21187a = AbstractC8665d.m21187a(c8527b);
            this.f20112c = c8663bM21187a;
            if (c8663bM21187a == null) {
                throw new C8711r("Unsupported or unrecognized wav header.");
            }
            int i = c8663bM21187a.f20116b;
            int i2 = c8663bM21187a.f20119e * i;
            int i3 = c8663bM21187a.f20115a;
            this.f20111b.mo21053a(C8708o.m21262a(null, "audio/raw", i2 * i3, 32768, i3, i, c8663bM21187a.f20120f, -1, -1, null, null, 0, null, null));
            this.f20113d = this.f20112c.f20118d;
        }
        C8663b c8663b = this.f20112c;
        if (c8663b.f20121g == 0 || c8663b.f20122h == 0) {
            c8527b.f19126e = 0;
            C8815n c8815n = new C8815n(8);
            C8664c c8664cM21186a = C8664c.m21186a(c8527b, c8815n);
            while (c8664cM21186a.f20123a != AbstractC8827z.m21379a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + c8664cM21186a.f20123a);
                long j = c8664cM21186a.f20124b + 8;
                if (c8664cM21186a.f20123a == AbstractC8827z.m21379a("RIFF")) {
                    j = 12;
                }
                if (j > 2147483647L) {
                    throw new C8711r("Chunk is too large (~2GB+) to skip; id: " + c8664cM21186a.f20123a);
                }
                c8527b.m21023a((int) j);
                c8664cM21186a = C8664c.m21186a(c8527b, c8815n);
            }
            c8527b.m21023a(8);
            long j2 = c8527b.f19124c;
            long j3 = c8664cM21186a.f20124b;
            c8663b.f20121g = j2;
            c8663b.f20122h = j3;
            this.f20110a.mo21093a(this);
        }
        int iMo21046a = this.f20111b.mo21046a(c8527b, 32768 - this.f20114e, true);
        if (iMo21046a != -1) {
            this.f20114e += iMo21046a;
        }
        int i4 = this.f20114e;
        int i5 = this.f20113d;
        int i6 = i4 / i5;
        if (i6 > 0) {
            long j4 = ((c8527b.f19124c - ((long) i4)) * 1000000) / ((long) this.f20112c.f20117c);
            int i7 = i6 * i5;
            int i8 = i4 - i7;
            this.f20114e = i8;
            this.f20111b.mo21051a(j4, 1, i7, i8, null);
        }
        return iMo21046a == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        C8663b c8663b = this.f20112c;
        long j2 = (j * ((long) c8663b.f20117c)) / 1000000;
        long j3 = c8663b.f20118d;
        return Math.min((j2 / j3) * j3, c8663b.f20122h - j3) + c8663b.f20121g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f20114e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f20110a = interfaceC8568j;
        this.f20111b = interfaceC8568j.mo21092a(0, 1);
        this.f20112c = null;
        interfaceC8568j.mo21096b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        return AbstractC8665d.m21187a(c8527b) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        C8663b c8663b = this.f20112c;
        return ((c8663b.f20122h / ((long) c8663b.f20118d)) * 1000000) / ((long) c8663b.f20116b);
    }
}
