package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.C8517d;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8712s;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8683j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C8674a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C8677d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecAudioRenderer extends AbstractC8676c implements InterfaceC8809h {

    /* JADX INFO: renamed from: P */
    public final AudioRendererEventListener.EventDispatcher f18930P;

    /* JADX INFO: renamed from: Q */
    public final C8508r f18931Q;

    /* JADX INFO: renamed from: R */
    public boolean f18932R;

    /* JADX INFO: renamed from: S */
    public int f18933S;

    /* JADX INFO: renamed from: T */
    public int f18934T;

    /* JADX INFO: renamed from: U */
    public long f18935U;

    /* JADX INFO: renamed from: V */
    public boolean f18936V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.f18931Q = new C8508r(new InterfaceC8493c[0], new C8511u(this));
        this.f18930P = new AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final C8674a mo20964a(C8677d c8677d, C8708o c8708o) {
        String str = c8708o.f20295f;
        this.f18931Q.getClass();
        String str2 = c8708o.f20295f;
        c8677d.getClass();
        return AbstractC8683j.m21240a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: a */
    public final C8712s mo20965a() {
        return this.f18931Q.f19025s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: a */
    public final C8712s mo20966a(C8712s c8712s) {
        return this.f18931Q.m20992a(c8712s);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20952a(int i, Object obj) {
        if (i == 2) {
            C8508r c8508r = this.f18931Q;
            float fFloatValue = ((Float) obj).floatValue();
            if (c8508r.f18993P != fFloatValue) {
                c8508r.f18993P = fFloatValue;
                c8508r.m21005i();
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        C8508r c8508r2 = this.f18931Q;
        if (c8508r2.f19020n == iIntValue) {
            return;
        }
        c8508r2.f19020n = iIntValue;
        if (c8508r2.f19005a0) {
            return;
        }
        c8508r2.m21003g();
        c8508r2.f19003Z = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20967a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C8517d {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f18932R && integer == 6 && (i = this.f18934T) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f18934T; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.f18931Q.m20993a(integer, integer2, this.f18933S, iArr);
        } catch (C8503m e) {
            throw new C8517d(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20968a(C8674a c8674a, MediaCodec mediaCodec, C8708o c8708o) {
        boolean z;
        String str = c8674a.f20203a;
        if (AbstractC8827z.f20671a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(AbstractC8827z.f20673c)) {
            String str2 = AbstractC8827z.f20672b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f18932R = z;
        mediaCodec.configure(c8708o.m21268a(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20969a(C8708o c8708o) throws C8517d {
        super.mo20969a(c8708o);
        this.f18930P.inputFormatChanged(c8708o);
        this.f18933S = "audio/raw".equals(c8708o.f20295f) ? c8708o.f20309t : 2;
        this.f18934T = c8708o.f20307r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20970a(String str, long j, long j2) {
        this.f18930P.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20954a(boolean z, long j) throws C8517d {
        super.mo20954a(z, j);
        this.f18931Q.m21003g();
        this.f18935U = j;
        this.f18936V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final boolean mo20971a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z) throws C8517d {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f20222N.skippedOutputBufferCount++;
            C8508r c8508r = this.f18931Q;
            if (c8508r.f18989L == 1) {
                c8508r.f18989L = 2;
            }
            return true;
        }
        try {
            if (!this.f18931Q.m20996a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f20222N.renderedOutputBufferCount++;
            return true;
        } catch (C8504n | C8507q e) {
            throw new C8517d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: b */
    public final int mo20972b(C8677d c8677d, C8708o c8708o) {
        int i;
        int i2;
        String str = c8708o.f20295f;
        if (!"audio".equals(AbstractC8810i.m21326b(str))) {
            return 0;
        }
        int i3 = AbstractC8827z.f20671a;
        int i4 = i3 >= 21 ? 16 : 0;
        this.f18931Q.getClass();
        c8677d.getClass();
        C8674a c8674aM21240a = AbstractC8683j.m21240a(false, str);
        if (c8674aM21240a == null) {
            return 1;
        }
        return ((i3 < 21 || (((i = c8708o.f20308s) == -1 || c8674aM21240a.m21227b(i)) && ((i2 = c8708o.f20307r) == -1 || c8674aM21240a.m21223a(i2)))) ? 3 : 2) | i4 | 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC8809h
    /* JADX INFO: renamed from: b */
    public final long mo20973b() {
        long jM20991a = this.f18931Q.m20991a(mo20958e());
        if (jM20991a != Long.MIN_VALUE) {
            if (!this.f18936V) {
                jM20991a = Math.max(this.f18935U, jM20991a);
            }
            this.f18935U = jM20991a;
            this.f18936V = false;
        }
        return this.f18935U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: d */
    public final InterfaceC8809h mo20957d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: e */
    public final boolean mo20958e() {
        if (!this.f20220L) {
            return false;
        }
        C8508r c8508r = this.f18931Q;
        if (c8508r.m21000d()) {
            return c8508r.f19001X && !c8508r.m20999c();
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: f */
    public final boolean mo20959f() {
        return this.f18931Q.m20999c() || super.mo20959f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: g */
    public final void mo20960g() {
        try {
            C8508r c8508r = this.f18931Q;
            c8508r.m21003g();
            for (InterfaceC8493c interfaceC8493c : c8508r.f19008c) {
                interfaceC8493c.mo20983f();
            }
            c8508r.f19003Z = 0;
            c8508r.f19002Y = false;
            try {
                this.f20229n = null;
                m21233o();
            } finally {
                this.f20222N.ensureUpdated();
                this.f18930P.disabled(this.f20222N);
            }
        } catch (Throwable th) {
            try {
                this.f20229n = null;
                m21233o();
                throw th;
            } finally {
                this.f20222N.ensureUpdated();
                this.f18930P.disabled(this.f20222N);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: h */
    public final void mo20961h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f20222N = decoderCounters;
        this.f18930P.enabled(decoderCounters);
        int i = this.f18924b.f20430a;
        if (i == 0) {
            C8508r c8508r = this.f18931Q;
            if (c8508r.f19005a0) {
                c8508r.f19005a0 = false;
                c8508r.f19003Z = 0;
                c8508r.m21003g();
                return;
            }
            return;
        }
        C8508r c8508r2 = this.f18931Q;
        c8508r2.getClass();
        if (AbstractC8827z.f20671a < 21) {
            throw new IllegalStateException();
        }
        if (c8508r2.f19005a0 && c8508r2.f19003Z == i) {
            return;
        }
        c8508r2.f19005a0 = true;
        c8508r2.f19003Z = i;
        c8508r2.m21003g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: i */
    public final void mo20962i() {
        this.f18931Q.m21002f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: j */
    public final void mo20963j() {
        C8508r c8508r = this.f18931Q;
        c8508r.f19002Y = false;
        if (c8508r.m21000d()) {
            c8508r.f19032z = 0L;
            c8508r.f19031y = 0;
            c8508r.f19030x = 0;
            c8508r.f18978A = 0L;
            c8508r.f18979B = false;
            c8508r.f18980C = 0L;
            c8508r.f19013g.m20989d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: p */
    public final void mo20974p() throws C8517d {
        try {
            C8508r c8508r = this.f18931Q;
            if (!c8508r.f19001X && c8508r.m21000d() && c8508r.m20995a()) {
                c8508r.f19013g.m20985a(c8508r.m20997b());
                c8508r.f19029w = 0;
                c8508r.f19001X = true;
            }
        } catch (C8507q e) {
            throw new C8517d(e);
        }
    }
}
