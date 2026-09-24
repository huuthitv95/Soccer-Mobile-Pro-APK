package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.exoplayer2.C8517d;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8683j;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C8674a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C8677d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8824w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.C11744X3;
import com.unity3d.services.core.p295di.ServiceProvider;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class MediaCodecVideoRenderer extends AbstractC8676c {

    /* JADX INFO: renamed from: q0 */
    public static final int[] f20684q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: P */
    public final C8836h f20685P;

    /* JADX INFO: renamed from: Q */
    public final VideoRendererEventListener.EventDispatcher f20686Q;

    /* JADX INFO: renamed from: R */
    public final long f20687R;

    /* JADX INFO: renamed from: S */
    public final int f20688S;

    /* JADX INFO: renamed from: T */
    public final boolean f20689T;

    /* JADX INFO: renamed from: U */
    public C8708o[] f20690U;

    /* JADX INFO: renamed from: V */
    public C8833e f20691V;

    /* JADX INFO: renamed from: W */
    public Surface f20692W;

    /* JADX INFO: renamed from: X */
    public int f20693X;

    /* JADX INFO: renamed from: Y */
    public boolean f20694Y;

    /* JADX INFO: renamed from: Z */
    public long f20695Z;

    /* JADX INFO: renamed from: a0 */
    public long f20696a0;

    /* JADX INFO: renamed from: b0 */
    public int f20697b0;

    /* JADX INFO: renamed from: c0 */
    public int f20698c0;

    /* JADX INFO: renamed from: d0 */
    public int f20699d0;

    /* JADX INFO: renamed from: e0 */
    public float f20700e0;

    /* JADX INFO: renamed from: f0 */
    public int f20701f0;

    /* JADX INFO: renamed from: g0 */
    public int f20702g0;

    /* JADX INFO: renamed from: h0 */
    public int f20703h0;

    /* JADX INFO: renamed from: i0 */
    public float f20704i0;

    /* JADX INFO: renamed from: j0 */
    public int f20705j0;

    /* JADX INFO: renamed from: k0 */
    public int f20706k0;

    /* JADX INFO: renamed from: l0 */
    public int f20707l0;

    /* JADX INFO: renamed from: m0 */
    public float f20708m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f20709n0;

    /* JADX INFO: renamed from: o0 */
    public int f20710o0;

    /* JADX INFO: renamed from: p0 */
    public C8834f f20711p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z = false;
        this.f20687R = 5000L;
        this.f20688S = -1;
        this.f20685P = new C8836h();
        this.f20686Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (AbstractC8827z.f20671a <= 22 && "foster".equals(AbstractC8827z.f20672b) && "NVIDIA".equals(AbstractC8827z.f20673c)) {
            z = true;
        }
        this.f20689T = z;
        this.f20695Z = -9223372036854775807L;
        this.f20701f0 = -1;
        this.f20702g0 = -1;
        this.f20704i0 = -1.0f;
        this.f20700e0 = -1.0f;
        this.f20693X = 1;
        this.f20705j0 = -1;
        this.f20706k0 = -1;
        this.f20708m0 = -1.0f;
        this.f20707l0 = -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m21388a(String str, int i, int i2) {
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.getClass();
        str.hashCode();
        int i4 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i3 = i2 * i;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i3 = i2 * i;
                return (i3 * 3) / (i4 * 2);
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(AbstractC8827z.f20674d)) {
                    return -1;
                }
                i3 = ((i2 + 15) / 16) * ((i + 15) / 16) * 256;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21389b(boolean z, C8708o c8708o, C8708o c8708o2) {
        if (c8708o.f20295f.equals(c8708o2.f20295f)) {
            int i = c8708o.f20302m;
            if (i == -1) {
                i = 0;
            }
            int i2 = c8708o2.f20302m;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i == i2) {
                if (z) {
                    return true;
                }
                if (c8708o.f20299j == c8708o2.f20299j && c8708o.f20300k == c8708o2.f20300k) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20952a(int i, Object obj) throws C8517d {
        if (i != 1) {
            if (i == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.f20693X = iIntValue;
                MediaCodec mediaCodec = this.f20230o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.f20692W == surface) {
            if (surface != null) {
                int i2 = this.f20705j0;
                if (i2 != -1 || this.f20706k0 != -1) {
                    this.f20686Q.videoSizeChanged(i2, this.f20706k0, this.f20707l0, this.f20708m0);
                }
                if (this.f20694Y) {
                    this.f20686Q.renderedFirstFrame(this.f20692W);
                    return;
                }
                return;
            }
            return;
        }
        this.f20692W = surface;
        int i3 = this.f18925c;
        if (i3 == 1 || i3 == 2) {
            MediaCodec mediaCodec2 = this.f20230o;
            if (AbstractC8827z.f20671a < 23 || mediaCodec2 == null || surface == null) {
                m21233o();
                m21230l();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface == null) {
            this.f20705j0 = -1;
            this.f20706k0 = -1;
            this.f20708m0 = -1.0f;
            this.f20707l0 = -1;
            m21390r();
            return;
        }
        int i4 = this.f20705j0;
        if (i4 != -1 || this.f20706k0 != -1) {
            this.f20686Q.videoSizeChanged(i4, this.f20706k0, this.f20707l0, this.f20708m0);
        }
        m21390r();
        if (i3 == 2) {
            this.f20695Z = this.f20687R > 0 ? SystemClock.elapsedRealtime() + this.f20687R : -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20967a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f20701f0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f20702g0 = integer;
        float f = this.f20700e0;
        this.f20704i0 = f;
        if (AbstractC8827z.f20671a >= 21) {
            int i = this.f20699d0;
            if (i == 90 || i == 270) {
                int i2 = this.f20701f0;
                this.f20701f0 = integer;
                this.f20702g0 = i2;
                this.f20704i0 = 1.0f / f;
            }
        } else {
            this.f20703h0 = this.f20699d0;
        }
        mediaCodec.setVideoScalingMode(this.f20693X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20968a(C8674a c8674a, MediaCodec mediaCodec, C8708o c8708o) {
        C8833e c8833e;
        Point point;
        boolean z;
        int i;
        C8708o[] c8708oArr = this.f20690U;
        int iMax = c8708o.f20299j;
        int iMax2 = c8708o.f20300k;
        int iMax3 = c8708o.f20296g;
        if (iMax3 == -1) {
            iMax3 = m21388a(c8708o.f20295f, iMax, iMax2);
        }
        if (c8708oArr.length == 1) {
            c8833e = new C8833e(iMax, iMax2, iMax3);
        } else {
            boolean z2 = false;
            for (C8708o c8708o2 : c8708oArr) {
                if (m21389b(c8674a.f20204b, c8708o, c8708o2)) {
                    int i2 = c8708o2.f20299j;
                    z2 |= i2 == -1 || c8708o2.f20300k == -1;
                    iMax = Math.max(iMax, i2);
                    iMax2 = Math.max(iMax2, c8708o2.f20300k);
                    int iM21388a = c8708o2.f20296g;
                    if (iM21388a == -1) {
                        iM21388a = m21388a(c8708o2.f20295f, c8708o2.f20299j, c8708o2.f20300k);
                    }
                    iMax3 = Math.max(iMax3, iM21388a);
                }
            }
            if (z2) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i3 = c8708o.f20300k;
                int i4 = c8708o.f20299j;
                boolean z3 = i3 > i4;
                int i5 = z3 ? i3 : i4;
                if (z3) {
                    i3 = i4;
                }
                float f = i3 / i5;
                int[] iArr = f20684q0;
                int i6 = 0;
                while (true) {
                    if (i6 < 9) {
                        int i7 = iArr[i6];
                        int i8 = i6;
                        int i9 = (int) (i7 * f);
                        if (i7 > i5 && i9 > i3) {
                            int i10 = i3;
                            if (AbstractC8827z.f20671a >= 21) {
                                point = c8674a.m21222a(z3 ? i9 : i7, z3 ? i7 : i9);
                                z = z3;
                                if (c8674a.m21224a(point.x, point.y, c8708o.f20301l)) {
                                    break;
                                }
                                i6 = i8 + 1;
                                i3 = i10;
                                f = f;
                                z3 = z;
                                i5 = i5;
                            } else {
                                z = z3;
                                int i11 = ((i7 + 15) / 16) * 16;
                                int i12 = ((i9 + 15) / 16) * 16;
                                if (i11 * i12 <= AbstractC8683j.m21239a()) {
                                    int i13 = z ? i12 : i11;
                                    if (!z) {
                                        i11 = i12;
                                    }
                                    point = new Point(i13, i11);
                                    break;
                                }
                                i6 = i8 + 1;
                                i3 = i10;
                                f = f;
                                z3 = z;
                                i5 = i5;
                            }
                        }
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, m21388a(c8708o.f20295f, iMax, iMax2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            c8833e = new C8833e(iMax, iMax2, iMax3);
        }
        this.f20691V = c8833e;
        boolean z4 = this.f20689T;
        int i14 = this.f20710o0;
        MediaFormat mediaFormatM21268a = c8708o.m21268a();
        mediaFormatM21268a.setInteger("max-width", c8833e.f20724a);
        mediaFormatM21268a.setInteger("max-height", c8833e.f20725b);
        int i15 = c8833e.f20726c;
        if (i15 != -1) {
            mediaFormatM21268a.setInteger("max-input-size", i15);
        }
        if (z4) {
            i = 0;
            mediaFormatM21268a.setInteger("auto-frc", 0);
        } else {
            i = 0;
        }
        if (i14 != 0) {
            mediaFormatM21268a.setFeatureEnabled("tunneled-playback", true);
            mediaFormatM21268a.setInteger("audio-session-id", i14);
        }
        mediaCodec.configure(mediaFormatM21268a, this.f20692W, (MediaCrypto) null, i);
        if (AbstractC8827z.f20671a < 23 || !this.f20709n0) {
            return;
        }
        this.f20711p0 = new C8834f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20969a(C8708o c8708o) throws C8517d {
        super.mo20969a(c8708o);
        this.f20686Q.inputFormatChanged(c8708o);
        float f = c8708o.f20303n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f20700e0 = f;
        int i = c8708o.f20302m;
        if (i == -1) {
            i = 0;
        }
        this.f20699d0 = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final void mo20970a(String str, long j, long j2) {
        this.f20686Q.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20954a(boolean z, long j) throws C8517d {
        super.mo20954a(z, j);
        m21390r();
        this.f20698c0 = 0;
        if (z) {
            this.f20695Z = this.f20687R > 0 ? SystemClock.elapsedRealtime() + this.f20687R : -9223372036854775807L;
        } else {
            this.f20695Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: a */
    public final void mo20955a(C8708o[] c8708oArr) {
        this.f20690U = c8708oArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:47:0x012f  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0190  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final boolean mo20971a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z) {
        String str;
        long j4;
        long j5;
        ChoreographerFrameCallbackC8835g choreographerFrameCallbackC8835g;
        long j6;
        long j7;
        int i2;
        long j8;
        long j9;
        long j10;
        if (z) {
            AbstractC8824w.m21374a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            AbstractC8824w.m21373a();
            this.f20222N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.f20694Y) {
            if (AbstractC8827z.f20671a >= 21) {
                long jNanoTime = System.nanoTime();
                m21391s();
                AbstractC8824w.m21374a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i, jNanoTime);
                AbstractC8824w.m21373a();
                this.f20222N.renderedOutputBufferCount++;
                this.f20698c0 = 0;
                if (!this.f20694Y) {
                    this.f20694Y = true;
                    this.f20686Q.renderedFirstFrame(this.f20692W);
                }
            } else {
                m21391s();
                AbstractC8824w.m21374a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i, true);
                AbstractC8824w.m21373a();
                this.f20222N.renderedOutputBufferCount++;
                this.f20698c0 = 0;
                if (!this.f20694Y) {
                    this.f20694Y = true;
                    this.f20686Q.renderedFirstFrame(this.f20692W);
                }
            }
            return true;
        }
        if (this.f18925c != 2) {
            return false;
        }
        long jElapsedRealtime = (j3 - j) - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long jNanoTime2 = System.nanoTime();
        long j11 = (jElapsedRealtime * 1000) + jNanoTime2;
        C8836h c8836h = this.f20685P;
        long j12 = j3 * 1000;
        if (c8836h.f20740h) {
            if (j3 != c8836h.f20737e) {
                c8836h.f20743k++;
                c8836h.f20738f = c8836h.f20739g;
            }
            long j13 = c8836h.f20743k;
            if (j13 >= 6) {
                str = "releaseOutputBuffer";
                long j14 = c8836h.f20742j;
                long j15 = c8836h.f20738f + ((j12 - j14) / j13);
                if (Math.abs((j11 - c8836h.f20741i) - (j15 - j14)) > 20000000) {
                    c8836h.f20740h = false;
                } else {
                    j4 = (c8836h.f20741i + j15) - c8836h.f20742j;
                    j5 = j15;
                }
                if (!c8836h.f20740h) {
                    c8836h.f20742j = j12;
                    c8836h.f20741i = j11;
                    c8836h.f20743k = 0L;
                    c8836h.f20740h = true;
                }
                c8836h.f20737e = j3;
                c8836h.f20739g = j5;
                choreographerFrameCallbackC8835g = c8836h.f20733a;
                if (choreographerFrameCallbackC8835g != null && choreographerFrameCallbackC8835g.f20729a != 0) {
                    long j16 = c8836h.f20733a.f20729a;
                    j8 = c8836h.f20735c;
                    j9 = (((j4 - j16) / j8) * j8) + j16;
                    if (j4 <= j9) {
                        j10 = j9 - j8;
                    } else {
                        j10 = j9;
                        j9 = j8 + j9;
                    }
                    if (j9 - j4 >= j4 - j10) {
                        j9 = j10;
                    }
                    j4 = j9 - c8836h.f20736d;
                }
                j6 = j4;
                j7 = (j6 - jNanoTime2) / 1000;
                if (j7 < -30000) {
                    AbstractC8824w.m21374a("dropVideoBuffer");
                    mediaCodec.releaseOutputBuffer(i, false);
                    AbstractC8824w.m21373a();
                    DecoderCounters decoderCounters = this.f20222N;
                    decoderCounters.droppedOutputBufferCount++;
                    this.f20697b0++;
                    int i3 = this.f20698c0 + 1;
                    this.f20698c0 = i3;
                    decoderCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(i3, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
                    i2 = this.f20697b0;
                    if (i2 != this.f20688S && i2 > 0) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        this.f20686Q.droppedFrames(this.f20697b0, jElapsedRealtime2 - this.f20696a0);
                        this.f20697b0 = 0;
                        this.f20696a0 = jElapsedRealtime2;
                        return true;
                    }
                }
                if (AbstractC8827z.f20671a >= 21) {
                    if (j7 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                        return false;
                    }
                    m21391s();
                    AbstractC8824w.m21374a(str);
                    mediaCodec.releaseOutputBuffer(i, j6);
                    AbstractC8824w.m21373a();
                    this.f20222N.renderedOutputBufferCount++;
                    this.f20698c0 = 0;
                    if (!this.f20694Y) {
                        this.f20694Y = true;
                        this.f20686Q.renderedFirstFrame(this.f20692W);
                    }
                    return true;
                }
                if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    return false;
                }
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                m21391s();
                AbstractC8824w.m21374a(str);
                mediaCodec.releaseOutputBuffer(i, true);
                AbstractC8824w.m21373a();
                this.f20222N.renderedOutputBufferCount++;
                this.f20698c0 = 0;
                if (!this.f20694Y) {
                    this.f20694Y = true;
                    this.f20686Q.renderedFirstFrame(this.f20692W);
                }
                return true;
            }
            str = "releaseOutputBuffer";
            if (Math.abs((j11 - c8836h.f20741i) - (j12 - c8836h.f20742j)) > 20000000) {
                c8836h.f20740h = false;
            }
        } else {
            str = "releaseOutputBuffer";
        }
        j5 = j12;
        j4 = j11;
        if (!c8836h.f20740h) {
            c8836h.f20742j = j12;
            c8836h.f20741i = j11;
            c8836h.f20743k = 0L;
            c8836h.f20740h = true;
        }
        c8836h.f20737e = j3;
        c8836h.f20739g = j5;
        choreographerFrameCallbackC8835g = c8836h.f20733a;
        if (choreographerFrameCallbackC8835g != null) {
            long j17 = c8836h.f20733a.f20729a;
            j8 = c8836h.f20735c;
            j9 = (((j4 - j17) / j8) * j8) + j17;
            if (j4 <= j9) {
                j10 = j9 - j8;
            } else {
                j10 = j9;
                j9 = j8 + j9;
            }
            if (j9 - j4 >= j4 - j10) {
                j9 = j10;
            }
            j4 = j9 - c8836h.f20736d;
        }
        j6 = j4;
        j7 = (j6 - jNanoTime2) / 1000;
        if (j7 < -30000) {
            AbstractC8824w.m21374a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            AbstractC8824w.m21373a();
            DecoderCounters decoderCounters2 = this.f20222N;
            decoderCounters2.droppedOutputBufferCount++;
            this.f20697b0++;
            int i4 = this.f20698c0 + 1;
            this.f20698c0 = i4;
            decoderCounters2.maxConsecutiveDroppedOutputBufferCount = Math.max(i4, decoderCounters2.maxConsecutiveDroppedOutputBufferCount);
            i2 = this.f20697b0;
            return i2 != this.f20688S ? true : true;
        }
        if (AbstractC8827z.f20671a >= 21) {
            if (j7 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                return false;
            }
            m21391s();
            AbstractC8824w.m21374a(str);
            mediaCodec.releaseOutputBuffer(i, j6);
            AbstractC8824w.m21373a();
            this.f20222N.renderedOutputBufferCount++;
            this.f20698c0 = 0;
            if (!this.f20694Y) {
                this.f20694Y = true;
                this.f20686Q.renderedFirstFrame(this.f20692W);
            }
            return true;
        }
        if (j7 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            return false;
        }
        if (j7 > 11000) {
            Thread.sleep((j7 - 10000) / 1000);
        }
        m21391s();
        AbstractC8824w.m21374a(str);
        mediaCodec.releaseOutputBuffer(i, true);
        AbstractC8824w.m21373a();
        this.f20222N.renderedOutputBufferCount++;
        this.f20698c0 = 0;
        if (!this.f20694Y) {
            this.f20694Y = true;
            this.f20686Q.renderedFirstFrame(this.f20692W);
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: a */
    public final boolean mo21228a(boolean z, C8708o c8708o, C8708o c8708o2) {
        if (!m21389b(z, c8708o, c8708o2)) {
            return false;
        }
        int i = c8708o2.f20299j;
        C8833e c8833e = this.f20691V;
        return i <= c8833e.f20724a && c8708o2.f20300k <= c8833e.f20725b && c8708o2.f20296g <= c8833e.f20726c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: b */
    public final int mo20972b(C8677d c8677d, C8708o c8708o) {
        boolean z;
        int i;
        int i2;
        String str = c8708o.f20295f;
        if (!"video".equals(AbstractC8810i.m21326b(str))) {
            return 0;
        }
        C8524d c8524d = c8708o.f20298i;
        if (c8524d != null) {
            z = false;
            for (int i3 = 0; i3 < c8524d.f19114c; i3++) {
                z |= c8524d.f19112a[i3].f19111e;
            }
        } else {
            z = false;
        }
        c8677d.getClass();
        C8674a c8674aM21240a = AbstractC8683j.m21240a(z, str);
        if (c8674aM21240a == null) {
            return 1;
        }
        boolean zM21225a = c8674aM21240a.m21225a(c8708o.f20292c);
        if (zM21225a && (i = c8708o.f20299j) > 0 && (i2 = c8708o.f20300k) > 0) {
            if (AbstractC8827z.f20671a >= 21) {
                zM21225a = c8674aM21240a.m21224a(i, i2, c8708o.f20301l);
            } else {
                boolean z2 = i * i2 <= AbstractC8683j.m21239a();
                if (!z2) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + c8708o.f20299j + "x" + c8708o.f20300k + "] [" + AbstractC8827z.f20675e + C11744X3.j.f26440e);
                }
                zM21225a = z2;
            }
        }
        return (zM21225a ? 3 : 2) | (c8674aM21240a.f20204b ? 8 : 4) | (c8674aM21240a.f20205c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c, com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: f */
    public final boolean mo20959f() {
        if ((this.f20694Y || super.mo21234q()) && super.mo20959f()) {
            this.f20695Z = -9223372036854775807L;
            return true;
        }
        if (this.f20695Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f20695Z) {
            return true;
        }
        this.f20695Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: g */
    public final void mo20960g() {
        this.f20701f0 = -1;
        this.f20702g0 = -1;
        this.f20704i0 = -1.0f;
        this.f20700e0 = -1.0f;
        this.f20705j0 = -1;
        this.f20706k0 = -1;
        this.f20708m0 = -1.0f;
        this.f20707l0 = -1;
        m21390r();
        C8836h c8836h = this.f20685P;
        if (c8836h.f20734b) {
            c8836h.f20733a.f20730b.sendEmptyMessage(2);
        }
        this.f20711p0 = null;
        try {
            this.f20229n = null;
            m21233o();
        } finally {
            this.f20222N.ensureUpdated();
            this.f20686Q.disabled(this.f20222N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: h */
    public final void mo20961h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f20222N = decoderCounters;
        int i = this.f18924b.f20430a;
        this.f20710o0 = i;
        this.f20709n0 = i != 0;
        this.f20686Q.enabled(decoderCounters);
        C8836h c8836h = this.f20685P;
        c8836h.f20740h = false;
        if (c8836h.f20734b) {
            c8836h.f20733a.f20730b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: i */
    public final void mo20962i() {
        this.f20697b0 = 0;
        this.f20696a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a
    /* JADX INFO: renamed from: j */
    public final void mo20963j() {
        this.f20695Z = -9223372036854775807L;
        if (this.f20697b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f20686Q.droppedFrames(this.f20697b0, jElapsedRealtime - this.f20696a0);
            this.f20697b0 = 0;
            this.f20696a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: m */
    public final void mo21231m() {
        if (AbstractC8827z.f20671a >= 23 || !this.f20709n0 || this.f20694Y) {
            return;
        }
        this.f20694Y = true;
        this.f20686Q.renderedFirstFrame(this.f20692W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c
    /* JADX INFO: renamed from: q */
    public final boolean mo21234q() {
        Surface surface;
        return super.mo21234q() && (surface = this.f20692W) != null && surface.isValid();
    }

    /* JADX INFO: renamed from: r */
    public final void m21390r() {
        MediaCodec mediaCodec;
        this.f20694Y = false;
        if (AbstractC8827z.f20671a < 23 || !this.f20709n0 || (mediaCodec = this.f20230o) == null) {
            return;
        }
        this.f20711p0 = new C8834f(this, mediaCodec);
    }

    /* JADX INFO: renamed from: s */
    public final void m21391s() {
        int i = this.f20701f0;
        if (i == -1 && this.f20702g0 == -1) {
            return;
        }
        if (this.f20705j0 == i && this.f20706k0 == this.f20702g0 && this.f20707l0 == this.f20703h0 && this.f20708m0 == this.f20704i0) {
            return;
        }
        this.f20686Q.videoSizeChanged(i, this.f20702g0, this.f20703h0, this.f20704i0);
        this.f20705j0 = this.f20701f0;
        this.f20706k0 = this.f20702g0;
        this.f20707l0 = this.f20703h0;
        this.f20708m0 = this.f20704i0;
    }
}
