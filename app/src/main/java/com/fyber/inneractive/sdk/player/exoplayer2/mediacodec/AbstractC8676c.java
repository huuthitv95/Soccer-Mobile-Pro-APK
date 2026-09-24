package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a;
import com.fyber.inneractive.sdk.player.exoplayer2.C8517d;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8709p;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8520c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8824w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8676c extends AbstractC8490a {

    /* JADX INFO: renamed from: O */
    public static final byte[] f20208O;

    /* JADX INFO: renamed from: A */
    public ByteBuffer[] f20209A;

    /* JADX INFO: renamed from: B */
    public long f20210B;

    /* JADX INFO: renamed from: C */
    public int f20211C;

    /* JADX INFO: renamed from: D */
    public int f20212D;

    /* JADX INFO: renamed from: E */
    public boolean f20213E;

    /* JADX INFO: renamed from: F */
    public boolean f20214F;

    /* JADX INFO: renamed from: G */
    public int f20215G;

    /* JADX INFO: renamed from: H */
    public int f20216H;

    /* JADX INFO: renamed from: I */
    public boolean f20217I;

    /* JADX INFO: renamed from: J */
    public boolean f20218J;

    /* JADX INFO: renamed from: K */
    public boolean f20219K;

    /* JADX INFO: renamed from: L */
    public boolean f20220L;

    /* JADX INFO: renamed from: M */
    public boolean f20221M;

    /* JADX INFO: renamed from: N */
    public DecoderCounters f20222N;

    /* JADX INFO: renamed from: h */
    public final C8677d f20223h;

    /* JADX INFO: renamed from: i */
    public final C8520c f20224i;

    /* JADX INFO: renamed from: j */
    public final C8520c f20225j;

    /* JADX INFO: renamed from: k */
    public final C8709p f20226k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f20227l;

    /* JADX INFO: renamed from: m */
    public final MediaCodec.BufferInfo f20228m;

    /* JADX INFO: renamed from: n */
    public C8708o f20229n;

    /* JADX INFO: renamed from: o */
    public MediaCodec f20230o;

    /* JADX INFO: renamed from: p */
    public boolean f20231p;

    /* JADX INFO: renamed from: q */
    public boolean f20232q;

    /* JADX INFO: renamed from: r */
    public boolean f20233r;

    /* JADX INFO: renamed from: s */
    public boolean f20234s;

    /* JADX INFO: renamed from: t */
    public boolean f20235t;

    /* JADX INFO: renamed from: u */
    public boolean f20236u;

    /* JADX INFO: renamed from: v */
    public boolean f20237v;

    /* JADX INFO: renamed from: w */
    public boolean f20238w;

    /* JADX INFO: renamed from: x */
    public boolean f20239x;

    /* JADX INFO: renamed from: y */
    public boolean f20240y;

    /* JADX INFO: renamed from: z */
    public ByteBuffer[] f20241z;

    static {
        int i = AbstractC8827z.f20671a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        f20208O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8676c(int i, boolean z) {
        super(i);
        C8677d c8677d = C8677d.f20242a;
        if (AbstractC8827z.f20671a < 16) {
            throw new IllegalStateException();
        }
        this.f20223h = c8677d;
        this.f20224i = new C8520c();
        this.f20225j = new C8520c();
        this.f20226k = new C8709p();
        this.f20227l = new ArrayList();
        this.f20228m = new MediaCodec.BufferInfo();
        this.f20215G = 0;
        this.f20216H = 0;
    }

    /* JADX INFO: renamed from: a */
    public C8674a mo20964a(C8677d c8677d, C8708o c8708o) {
        String str = c8708o.f20295f;
        c8677d.getClass();
        return AbstractC8683j.m21240a(false, str);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20953a(long j, long j2) throws C8517d {
        boolean zMo20971a;
        boolean z;
        boolean z2;
        if (this.f20220L) {
            mo20974p();
            return;
        }
        if (this.f20229n == null) {
            this.f20225j.m21017a();
            int iM20951a = m20951a(this.f20226k, this.f20225j, true);
            if (iM20951a != -5) {
                if (iM20951a == -4) {
                    if (!this.f20225j.m21018b(4)) {
                        throw new IllegalStateException();
                    }
                    this.f20219K = true;
                    m21232n();
                    return;
                }
                return;
            }
            mo20969a(this.f20226k.f20316a);
        }
        m21230l();
        if (this.f20230o != null) {
            AbstractC8824w.m21374a("drainAndFeed");
            do {
                if (this.f20212D >= 0) {
                    if (this.f20237v || !this.f20218J) {
                        MediaCodec mediaCodec = this.f20230o;
                        ByteBuffer[] byteBufferArr = this.f20209A;
                        int i = this.f20212D;
                        ByteBuffer byteBuffer = byteBufferArr[i];
                        MediaCodec.BufferInfo bufferInfo = this.f20228m;
                        int i2 = bufferInfo.flags;
                        zMo20971a = mo20971a(j, j2, mediaCodec, byteBuffer, i, bufferInfo.presentationTimeUs, this.f20213E);
                    } else {
                        try {
                            MediaCodec mediaCodec2 = this.f20230o;
                            ByteBuffer[] byteBufferArr2 = this.f20209A;
                            int i3 = this.f20212D;
                            ByteBuffer byteBuffer2 = byteBufferArr2[i3];
                            MediaCodec.BufferInfo bufferInfo2 = this.f20228m;
                            int i4 = bufferInfo2.flags;
                            zMo20971a = mo20971a(j, j2, mediaCodec2, byteBuffer2, i3, bufferInfo2.presentationTimeUs, this.f20213E);
                        } catch (IllegalStateException unused) {
                            m21232n();
                            if (this.f20220L) {
                                m21233o();
                            }
                        }
                    }
                    if (zMo20971a) {
                        long j3 = this.f20228m.presentationTimeUs;
                        this.f20212D = -1;
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    if (this.f20237v && this.f20218J) {
                        try {
                            this.f20212D = this.f20230o.dequeueOutputBuffer(this.f20228m, 0L);
                        } catch (IllegalStateException unused2) {
                            m21232n();
                            if (this.f20220L) {
                                m21233o();
                            }
                        }
                    } else {
                        this.f20212D = this.f20230o.dequeueOutputBuffer(this.f20228m, 0L);
                    }
                    int i5 = this.f20212D;
                    if (i5 >= 0) {
                        if (this.f20240y) {
                            this.f20240y = false;
                            this.f20230o.releaseOutputBuffer(i5, false);
                            this.f20212D = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo3 = this.f20228m;
                            if ((bufferInfo3.flags & 4) != 0) {
                                m21232n();
                                this.f20212D = -1;
                            } else {
                                ByteBuffer byteBuffer3 = this.f20209A[i5];
                                if (byteBuffer3 != null) {
                                    byteBuffer3.position(bufferInfo3.offset);
                                    MediaCodec.BufferInfo bufferInfo4 = this.f20228m;
                                    byteBuffer3.limit(bufferInfo4.offset + bufferInfo4.size);
                                }
                                long j4 = this.f20228m.presentationTimeUs;
                                int size = this.f20227l.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size) {
                                        z2 = false;
                                        break;
                                    } else {
                                        if (((Long) this.f20227l.get(i6)).longValue() == j4) {
                                            this.f20227l.remove(i6);
                                            z2 = true;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                this.f20213E = z2;
                                if (this.f20237v) {
                                    MediaCodec mediaCodec3 = this.f20230o;
                                    ByteBuffer[] byteBufferArr3 = this.f20209A;
                                    int i7 = this.f20212D;
                                    ByteBuffer byteBuffer4 = byteBufferArr3[i7];
                                    MediaCodec.BufferInfo bufferInfo5 = this.f20228m;
                                    int i8 = bufferInfo5.flags;
                                    zMo20971a = mo20971a(j, j2, mediaCodec3, byteBuffer4, i7, bufferInfo5.presentationTimeUs, this.f20213E);
                                    if (zMo20971a) {
                                        long j5 = this.f20228m.presentationTimeUs;
                                        this.f20212D = -1;
                                    }
                                } else {
                                    MediaCodec mediaCodec4 = this.f20230o;
                                    ByteBuffer[] byteBufferArr4 = this.f20209A;
                                    int i9 = this.f20212D;
                                    ByteBuffer byteBuffer5 = byteBufferArr4[i9];
                                    MediaCodec.BufferInfo bufferInfo6 = this.f20228m;
                                    int i10 = bufferInfo6.flags;
                                    zMo20971a = mo20971a(j, j2, mediaCodec4, byteBuffer5, i9, bufferInfo6.presentationTimeUs, this.f20213E);
                                    if (zMo20971a) {
                                        long j6 = this.f20228m.presentationTimeUs;
                                        this.f20212D = -1;
                                    }
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        if (i5 == -2) {
                            MediaFormat outputFormat = this.f20230o.getOutputFormat();
                            if (this.f20234s && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.f20240y = true;
                            } else {
                                if (this.f20238w) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                mo20967a(this.f20230o, outputFormat);
                            }
                        } else if (i5 == -3) {
                            this.f20209A = this.f20230o.getOutputBuffers();
                        } else {
                            if (this.f20235t && (this.f20219K || this.f20216H == 2)) {
                                m21232n();
                            }
                            z = false;
                        }
                        z = true;
                    }
                }
            } while (z);
            while (m21229k()) {
            }
            AbstractC8824w.m21373a();
        } else {
            this.f18926d.mo21087a(j - this.f18927e);
            this.f20225j.m21017a();
            int iM20951a2 = m20951a(this.f20226k, this.f20225j, false);
            if (iM20951a2 == -5) {
                mo20969a(this.f20226k.f20316a);
            } else if (iM20951a2 == -4) {
                if (!this.f20225j.m21018b(4)) {
                    throw new IllegalStateException();
                }
                this.f20219K = true;
                m21232n();
            }
        }
        this.f20222N.ensureUpdated();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20967a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: a */
    public abstract void mo20968a(C8674a c8674a, MediaCodec mediaCodec, C8708o c8708o);

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX INFO: renamed from: a */
    public void mo20969a(C8708o c8708o) throws C8517d {
        boolean z;
        C8708o c8708o2 = this.f20229n;
        this.f20229n = c8708o;
        if (!AbstractC8827z.m21386a(c8708o.f20298i, c8708o2 == null ? null : c8708o2.f20298i) && this.f20229n.f20298i != null) {
            throw new C8517d(new IllegalStateException("Media requires a DrmSessionManager"));
        }
        if (this.f20230o == null || !mo21228a(this.f20231p, c8708o2, this.f20229n)) {
            if (this.f20217I) {
                this.f20216H = 1;
                return;
            } else {
                m21233o();
                m21230l();
                return;
            }
        }
        this.f20214F = true;
        this.f20215G = 1;
        if (this.f20234s) {
            C8708o c8708o3 = this.f20229n;
            z = c8708o3.f20299j == c8708o2.f20299j && c8708o3.f20300k == c8708o2.f20300k;
        }
        this.f20239x = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo20970a(String str, long j, long j2);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public void mo20954a(boolean z, long j) throws C8517d {
        this.f20219K = false;
        this.f20220L = false;
        if (this.f20230o != null) {
            this.f20210B = -9223372036854775807L;
            this.f20211C = -1;
            this.f20212D = -1;
            this.f20221M = true;
            this.f20213E = false;
            this.f20227l.clear();
            this.f20239x = false;
            this.f20240y = false;
            if (this.f20233r || ((this.f20236u && this.f20218J) || this.f20216H != 0)) {
                m21233o();
                m21230l();
            } else {
                this.f20230o.flush();
                this.f20217I = false;
            }
            if (!this.f20214F || this.f20229n == null) {
                return;
            }
            this.f20215G = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo20971a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z);

    /* JADX INFO: renamed from: a */
    public boolean mo21228a(boolean z, C8708o c8708o, C8708o c8708o2) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo20972b(C8677d c8677d, C8708o c8708o);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: e */
    public boolean mo20958e() {
        return this.f20220L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: f */
    public boolean mo20959f() {
        if (this.f20229n == null) {
            return false;
        }
        if ((this.f18928f ? this.f18929g : this.f18926d.isReady()) || this.f20212D >= 0) {
            return true;
        }
        return this.f20210B != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f20210B;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21229k() throws C8517d {
        MediaCodec mediaCodec = this.f20230o;
        if (mediaCodec == null || this.f20216H == 2 || this.f20219K) {
            return false;
        }
        if (this.f20211C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.f20211C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            C8520c c8520c = this.f20224i;
            c8520c.f19104c = this.f20241z[iDequeueInputBuffer];
            c8520c.m21017a();
        }
        if (this.f20216H == 1) {
            if (!this.f20235t) {
                this.f20218J = true;
                this.f20230o.queueInputBuffer(this.f20211C, 0, 0, 0L, 4);
                this.f20211C = -1;
            }
            this.f20216H = 2;
            return false;
        }
        if (this.f20239x) {
            this.f20239x = false;
            ByteBuffer byteBuffer = this.f20224i.f19104c;
            byte[] bArr = f20208O;
            byteBuffer.put(bArr);
            this.f20230o.queueInputBuffer(this.f20211C, 0, bArr.length, 0L, 0);
            this.f20211C = -1;
            this.f20217I = true;
            return true;
        }
        if (this.f20215G == 1) {
            for (int i = 0; i < this.f20229n.f20297h.size(); i++) {
                this.f20224i.f19104c.put((byte[]) this.f20229n.f20297h.get(i));
            }
            this.f20215G = 2;
        }
        int iPosition = this.f20224i.f19104c.position();
        int iM20951a = m20951a(this.f20226k, this.f20224i, false);
        if (iM20951a == -3) {
            return false;
        }
        if (iM20951a == -5) {
            if (this.f20215G == 2) {
                this.f20224i.m21017a();
                this.f20215G = 1;
            }
            mo20969a(this.f20226k.f20316a);
            return true;
        }
        if (this.f20224i.m21018b(4)) {
            if (this.f20215G == 2) {
                this.f20224i.m21017a();
                this.f20215G = 1;
            }
            this.f20219K = true;
            if (!this.f20217I) {
                m21232n();
                return false;
            }
            try {
                if (!this.f20235t) {
                    this.f20218J = true;
                    this.f20230o.queueInputBuffer(this.f20211C, 0, 0, 0L, 4);
                    this.f20211C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw new C8517d(e);
            }
        }
        if (this.f20221M && !this.f20224i.m21018b(1)) {
            this.f20224i.m21017a();
            if (this.f20215G == 2) {
                this.f20215G = 1;
            }
            return true;
        }
        this.f20221M = false;
        boolean zM21018b = this.f20224i.m21018b(1073741824);
        if (this.f20232q && !zM21018b) {
            ByteBuffer byteBuffer2 = this.f20224i.f19104c;
            int iPosition2 = byteBuffer2.position();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i5 = byteBuffer2.get(i2) & 255;
                if (i3 == 3) {
                    if (i5 == 1 && (byteBuffer2.get(i4) & Ascii.f22502US) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i5 == 0) {
                    i3++;
                }
                if (i5 != 0) {
                    i3 = 0;
                }
                i2 = i4;
            }
            if (this.f20224i.f19104c.position() == 0) {
                return true;
            }
            this.f20232q = false;
        }
        try {
            C8520c c8520c2 = this.f20224i;
            long j = c8520c2.f19105d;
            if (c8520c2.m21018b(Integer.MIN_VALUE)) {
                this.f20227l.add(Long.valueOf(j));
            }
            this.f20224i.f19104c.flip();
            mo21231m();
            if (zM21018b) {
                MediaCodec.CryptoInfo cryptoInfo = this.f20224i.f19103b.f19100d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f20230o.queueSecureInputBuffer(this.f20211C, 0, cryptoInfo, j, 0);
            } else {
                this.f20230o.queueInputBuffer(this.f20211C, 0, this.f20224i.f19104c.limit(), j, 0);
            }
            this.f20211C = -1;
            this.f20217I = true;
            this.f20215G = 0;
            this.f20222N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw new C8517d(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX INFO: renamed from: l */
    public final void m21230l() throws C8517d {
        boolean z;
        AbstractC8676c abstractC8676c;
        if (!mo21234q()) {
            return;
        }
        C8708o c8708o = this.f20229n;
        String str = c8708o.f20295f;
        try {
            C8674a c8674aMo20964a = mo20964a(this.f20223h, c8708o);
            if (c8674aMo20964a == null) {
                throw new C8517d(new C8675b(this.f20229n, (C8679f) null, -49999));
            }
            String str2 = c8674aMo20964a.f20203a;
            this.f20231p = c8674aMo20964a.f20204b;
            C8708o c8708o2 = this.f20229n;
            int i = AbstractC8827z.f20671a;
            boolean z2 = false;
            this.f20232q = i < 21 && c8708o2.f20297h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.f20233r = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i == 19 && AbstractC8827z.f20674d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            if (i >= 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                z = false;
            } else {
                String str3 = AbstractC8827z.f20672b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.f20234s = z;
            this.f20235t = i <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.f20236u = (i <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (i <= 19 && "hb2000".equals(AbstractC8827z.f20672b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.f20237v = i == 21 && "OMX.google.aac.decoder".equals(str2);
            C8708o c8708o3 = this.f20229n;
            if (i <= 18 && c8708o3.f20307r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2)) {
                z2 = true;
            }
            this.f20238w = z2;
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                AbstractC8824w.m21374a("createCodec:" + str2);
                this.f20230o = MediaCodec.createByCodecName(str2);
                AbstractC8824w.m21373a();
                AbstractC8824w.m21374a("configureCodec");
                mo20968a(c8674aMo20964a, this.f20230o, this.f20229n);
                AbstractC8824w.m21373a();
                AbstractC8824w.m21374a("startCodec");
                this.f20230o.start();
                AbstractC8824w.m21373a();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                abstractC8676c = this;
                try {
                    abstractC8676c.mo20970a(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                    abstractC8676c.f20241z = abstractC8676c.f20230o.getInputBuffers();
                    abstractC8676c.f20209A = abstractC8676c.f20230o.getOutputBuffers();
                    abstractC8676c.f20210B = abstractC8676c.f18925c == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    abstractC8676c.f20211C = -1;
                    abstractC8676c.f20212D = -1;
                    abstractC8676c.f20221M = true;
                    abstractC8676c.f20222N.decoderInitCount++;
                } catch (Exception e) {
                    e = e;
                    throw new C8517d(new C8675b(abstractC8676c.f20229n, e, str2));
                }
            } catch (Exception e2) {
                e = e2;
                abstractC8676c = this;
            }
        } catch (C8679f e3) {
            throw new C8517d(new C8675b(this.f20229n, e3, -49998));
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo21231m() {
    }

    /* JADX INFO: renamed from: n */
    public final void m21232n() throws C8517d {
        if (this.f20216H == 2) {
            m21233o();
            m21230l();
        } else {
            this.f20220L = true;
            mo20974p();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m21233o() {
        if (this.f20230o != null) {
            this.f20210B = -9223372036854775807L;
            this.f20211C = -1;
            this.f20212D = -1;
            this.f20213E = false;
            this.f20227l.clear();
            this.f20241z = null;
            this.f20209A = null;
            this.f20214F = false;
            this.f20217I = false;
            this.f20231p = false;
            this.f20232q = false;
            this.f20233r = false;
            this.f20234s = false;
            this.f20235t = false;
            this.f20236u = false;
            this.f20238w = false;
            this.f20239x = false;
            this.f20240y = false;
            this.f20218J = false;
            this.f20215G = 0;
            this.f20216H = 0;
            this.f20222N.decoderReleaseCount++;
            this.f20224i.f19104c = null;
            try {
                this.f20230o.stop();
                try {
                    this.f20230o.release();
                } finally {
                    this.f20230o = null;
                }
            } catch (Throwable th) {
                try {
                    this.f20230o.release();
                    throw th;
                } finally {
                    this.f20230o = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo20974p() {
    }

    /* JADX INFO: renamed from: q */
    public boolean mo21234q() {
        return this.f20230o == null && this.f20229n != null;
    }
}
