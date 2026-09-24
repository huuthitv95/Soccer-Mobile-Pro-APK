package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C8581c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C8596m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8630a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8633b0;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8634c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.C8638e;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC8700o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8699n;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8702q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC8718b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8547h extends AbstractC8718b {

    /* JADX INFO: renamed from: G */
    public static final AtomicInteger f19220G = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public int f19221A;

    /* JADX INFO: renamed from: B */
    public int f19222B;

    /* JADX INFO: renamed from: C */
    public boolean f19223C;

    /* JADX INFO: renamed from: D */
    public C8553n f19224D;

    /* JADX INFO: renamed from: E */
    public volatile boolean f19225E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f19226F;

    /* JADX INFO: renamed from: j */
    public final int f19227j;

    /* JADX INFO: renamed from: k */
    public final int f19228k;

    /* JADX INFO: renamed from: l */
    public final C8556a f19229l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC8783h f19230m;

    /* JADX INFO: renamed from: n */
    public final C8786k f19231n;

    /* JADX INFO: renamed from: o */
    public final boolean f19232o;

    /* JADX INFO: renamed from: p */
    public final boolean f19233p;

    /* JADX INFO: renamed from: q */
    public final C8823v f19234q;

    /* JADX INFO: renamed from: r */
    public final String f19235r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC8567i f19236s;

    /* JADX INFO: renamed from: t */
    public final boolean f19237t;

    /* JADX INFO: renamed from: u */
    public final boolean f19238u;

    /* JADX INFO: renamed from: v */
    public final List f19239v;

    /* JADX INFO: renamed from: w */
    public final boolean f19240w;

    /* JADX INFO: renamed from: x */
    public final C8699n f19241x;

    /* JADX INFO: renamed from: y */
    public final C8815n f19242y;

    /* JADX INFO: renamed from: z */
    public InterfaceC8567i f19243z;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8547h(InterfaceC8783h interfaceC8783h, C8786k c8786k, C8786k c8786k2, C8556a c8556a, List list, int i, Object obj, long j, long j2, int i2, int i3, boolean z, C8823v c8823v, C8547h c8547h, byte[] bArr, byte[] bArr2) {
        InterfaceC8783h c8540a = (bArr == null || bArr2 == null) ? interfaceC8783h : new C8540a(interfaceC8783h, bArr, bArr2);
        super(i, i2, j, j2, c8556a.f19303b, c8540a, c8786k, obj);
        this.f19228k = i3;
        this.f19231n = c8786k2;
        this.f19229l = c8556a;
        this.f19239v = list;
        this.f19233p = z;
        this.f19234q = c8823v;
        this.f19232o = c8540a instanceof C8540a;
        String lastPathSegment = c8786k.f20545a.getLastPathSegment();
        this.f19235r = lastPathSegment;
        boolean z2 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f19240w = z2;
        if (c8547h != null) {
            this.f19241x = c8547h.f19241x;
            this.f19242y = c8547h.f19242y;
            this.f19236s = c8547h.f19243z;
            boolean z3 = c8547h.f19229l != c8556a;
            this.f19237t = z3;
            this.f19238u = c8547h.f19228k != i3 || z3;
        } else {
            this.f19241x = z2 ? new C8699n() : null;
            this.f19242y = z2 ? new C8815n(10) : null;
            this.f19236s = null;
            this.f19237t = false;
            this.f19238u = true;
        }
        this.f19230m = interfaceC8783h;
        this.f19227j = f19220G.getAndIncrement();
    }

    /* JADX INFO: renamed from: a */
    public final long m21069a(C8527b c8527b) {
        C8685b c8685bM21261a;
        c8527b.f19126e = 0;
        if (!c8527b.m21025a(this.f19242y.f20643a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f19242y.m21343c(10);
        if (this.f19242y.m21354l() != C8699n.f20280b) {
            return -9223372036854775807L;
        }
        C8815n c8815n = this.f19242y;
        c8815n.m21347e(c8815n.f20644b + 3);
        int iM21351i = this.f19242y.m21351i();
        int i = iM21351i + 10;
        if (i > this.f19242y.m21337a()) {
            C8815n c8815n2 = this.f19242y;
            byte[] bArr = c8815n2.f20643a;
            c8815n2.m21343c(i);
            System.arraycopy(bArr, 0, this.f19242y.f20643a, 0, 10);
        }
        if (!c8527b.m21025a(this.f19242y.f20643a, 10, iM21351i, true) || (c8685bM21261a = this.f19241x.m21261a(iM21351i, this.f19242y.f20643a)) == null) {
            return -9223372036854775807L;
        }
        int length = c8685bM21261a.f20253a.length;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC8700o abstractC8700o = c8685bM21261a.f20253a[i2];
            if (abstractC8700o instanceof C8702q) {
                C8702q c8702q = (C8702q) abstractC8700o;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c8702q.f20283b)) {
                    System.arraycopy(c8702q.f20284c, 0, this.f19242y.f20643a, 0, 8);
                    this.f19242y.m21343c(8);
                    return this.f19242y.m21349g();
                }
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8567i m21070a(long j) {
        InterfaceC8567i c8630a;
        if (this.f19235r.endsWith(".aac")) {
            c8630a = new C8634c(j);
        } else if (this.f19235r.endsWith(".ac3") || this.f19235r.endsWith(".ec3")) {
            c8630a = new C8630a(j);
        } else {
            if (!this.f19235r.endsWith(".mp3")) {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f19235r);
            }
            c8630a = new C8581c(j);
        }
        c8630a.mo21037a(this.f19224D);
        return c8630a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: a */
    public final boolean mo21061a() {
        return this.f19225E;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    /* JADX INFO: renamed from: b */
    public final void mo21062b() {
        this.f19225E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC8717a
    /* JADX INFO: renamed from: c */
    public final long mo21063c() {
        return this.f19222B;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1 A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #2 {, blocks: (B:114:0x01bb, B:116:0x01c1), top: B:153:0x01bb }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ed A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:126:0x01dc, B:128:0x01ed, B:130:0x01f5, B:132:0x01fe, B:131:0x01fc, B:134:0x0206, B:143:0x0224, B:141:0x0219, B:142:0x0223, B:136:0x020d, B:138:0x0211), top: B:152:0x01dc, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x01f5 A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:126:0x01dc, B:128:0x01ed, B:130:0x01f5, B:132:0x01fe, B:131:0x01fc, B:134:0x0206, B:143:0x0224, B:141:0x0219, B:142:0x0223, B:136:0x020d, B:138:0x0211), top: B:152:0x01dc, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01fc A[Catch: all -> 0x0236, TryCatch #1 {all -> 0x0236, blocks: (B:126:0x01dc, B:128:0x01ed, B:130:0x01f5, B:132:0x01fe, B:131:0x01fc, B:134:0x0206, B:143:0x0224, B:141:0x0219, B:142:0x0223, B:136:0x020d, B:138:0x0211), top: B:152:0x01dc, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0206 A[Catch: all -> 0x0236, TRY_LEAVE, TryCatch #1 {all -> 0x0236, blocks: (B:126:0x01dc, B:128:0x01ed, B:130:0x01f5, B:132:0x01fe, B:131:0x01fc, B:134:0x0206, B:143:0x0224, B:141:0x0219, B:142:0x0223, B:136:0x020d, B:138:0x0211), top: B:152:0x01dc, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0211 A[Catch: all -> 0x0218, TRY_LEAVE, TryCatch #3 {all -> 0x0218, blocks: (B:136:0x020d, B:138:0x0211), top: B:155:0x020d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x01bb A[EXC_TOP_SPLITTER, LOOP:3: B:153:0x01bb->B:170:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x020d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0224 A[EDGE_INSN: B:172:0x0224->B:143:0x0224 BREAK  A[LOOP:4: B:135:0x020b->B:174:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z
    public final void load() {
        C8786k c8786k;
        boolean z;
        C8823v c8823v;
        C8527b c8527b;
        long jM21069a;
        long jM21371b;
        C8823v c8823v2;
        C8786k c8786k2;
        InterfaceC8567i c8555p;
        boolean z2;
        int i;
        String strM21325a;
        String strM21325a2;
        int iMo21035a = 0;
        if (this.f19243z == null && !this.f19240w) {
            if ("text/vtt".equals(this.f19229l.f19303b.f20295f) || this.f19235r.endsWith(".webvtt") || this.f19235r.endsWith(".vtt")) {
                c8555p = new C8555p(this.f20335c.f20314y, this.f19234q);
            } else {
                if (this.f19238u) {
                    if (!this.f19235r.endsWith(".mp4")) {
                        String str = this.f19235r;
                        if (!str.startsWith(".m4", str.length() - 4)) {
                            List list = this.f19239v;
                            if (list != null) {
                                i = 48;
                            } else {
                                list = Collections.EMPTY_LIST;
                                i = 16;
                            }
                            String str2 = this.f20335c.f20292c;
                            if (!TextUtils.isEmpty(str2)) {
                                if (str2 != null) {
                                    String[] strArrSplit = str2.split(",");
                                    int length = strArrSplit.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            strM21325a = AbstractC8810i.m21325a(strArrSplit[i2]);
                                            if (strM21325a != null && "audio".equals(AbstractC8810i.m21326b(strM21325a))) {
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        } else {
                                            strM21325a = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strM21325a = null;
                                    break;
                                }
                                if (!"audio/mp4a-latm".equals(strM21325a)) {
                                    i |= 2;
                                }
                                if (str2 != null) {
                                    String[] strArrSplit2 = str2.split(",");
                                    int length2 = strArrSplit2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length2) {
                                            strM21325a2 = AbstractC8810i.m21325a(strArrSplit2[i3]);
                                            if (strM21325a2 != null && "video".equals(AbstractC8810i.m21326b(strM21325a2))) {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            strM21325a2 = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strM21325a2 = null;
                                    break;
                                }
                                if (!"video/avc".equals(strM21325a2)) {
                                    i |= 4;
                                }
                            }
                            C8633b0 c8633b0 = new C8633b0(2, this.f19234q, new C8638e(i, list));
                            z2 = true;
                            c8555p = c8633b0;
                        }
                    }
                    c8555p = new C8596m(this.f19234q);
                } else {
                    c8555p = this.f19236s;
                    z2 = false;
                }
                if (z2) {
                    c8555p.mo21037a(this.f19224D);
                }
                this.f19243z = c8555p;
            }
            z2 = true;
            if (z2) {
                c8555p.mo21037a(this.f19224D);
            }
            this.f19243z = c8555p;
        }
        if (this.f19236s != this.f19243z && !this.f19223C && (c8786k2 = this.f19231n) != null) {
            int i4 = this.f19221A;
            int i5 = AbstractC8827z.f20671a;
            if (i4 != 0) {
                long j = c8786k2.f20548d;
                long j2 = j == -1 ? -1L : j - ((long) i4);
                Uri uri = c8786k2.f20545a;
                long j3 = ((long) i4) + c8786k2.f20547c;
                c8786k2 = new C8786k(uri, j3, j3, j2, c8786k2.f20549e, c8786k2.f20550f);
            }
            try {
                InterfaceC8783h interfaceC8783h = this.f19230m;
                C8527b c8527b2 = new C8527b(interfaceC8783h, c8786k2.f20546b, interfaceC8783h.mo20829a(c8786k2));
                int iMo21035a2 = 0;
                while (iMo21035a2 == 0) {
                    try {
                        if (this.f19225E) {
                            break;
                        } else {
                            iMo21035a2 = this.f19243z.mo21035a(c8527b2, (C8607o) null);
                        }
                    } catch (Throwable th) {
                        this.f19221A = (int) (c8527b2.f19124c - this.f19231n.f20546b);
                        throw th;
                    }
                }
                this.f19221A = (int) (c8527b2.f19124c - this.f19231n.f20546b);
                AbstractC8827z.m21383a(this.f20340h);
                this.f19223C = true;
            } catch (Throwable th2) {
                AbstractC8827z.m21383a(this.f20340h);
                throw th2;
            }
        }
        if (this.f19225E) {
            return;
        }
        try {
            if (this.f19232o) {
                c8786k = this.f20333a;
                if (this.f19222B != 0) {
                    z = true;
                }
                if (this.f19233p) {
                    c8823v = this.f19234q;
                    if (c8823v.f20667a == Long.MAX_VALUE) {
                        c8823v.m21372c(this.f20338f);
                    }
                } else {
                    c8823v2 = this.f19234q;
                    synchronized (c8823v2) {
                        while (c8823v2.f20669c == -9223372036854775807L) {
                            c8823v2.wait();
                        }
                    }
                }
                InterfaceC8783h interfaceC8783h2 = this.f20340h;
                c8527b = new C8527b(interfaceC8783h2, c8786k.f20546b, interfaceC8783h2.mo20829a(c8786k));
                if (this.f19243z == null) {
                    jM21069a = m21069a(c8527b);
                    if (jM21069a != -9223372036854775807L) {
                        jM21371b = this.f19234q.m21371b(jM21069a);
                    } else {
                        jM21371b = this.f20338f;
                    }
                    this.f19243z = m21070a(jM21371b);
                }
                if (z) {
                    c8527b.m21023a(this.f19222B);
                }
                while (iMo21035a == 0) {
                    try {
                        if (!this.f19225E) {
                            break;
                        } else {
                            iMo21035a = this.f19243z.mo21035a(c8527b, (C8607o) null);
                        }
                    } catch (Throwable th3) {
                        this.f19222B = (int) (c8527b.f19124c - this.f20333a.f20546b);
                        throw th3;
                    }
                }
                this.f19222B = (int) (c8527b.f19124c - this.f20333a.f20546b);
                AbstractC8827z.m21383a(this.f20340h);
                this.f19226F = true;
                return;
            }
            c8786k = this.f20333a;
            int i6 = this.f19222B;
            int i7 = AbstractC8827z.f20671a;
            if (i6 != 0) {
                long j4 = c8786k.f20548d;
                long j5 = j4 != -1 ? j4 - ((long) i6) : -1L;
                Uri uri2 = c8786k.f20545a;
                long j6 = ((long) i6) + c8786k.f20547c;
                c8786k = new C8786k(uri2, j6, j6, j5, c8786k.f20549e, c8786k.f20550f);
            }
            InterfaceC8783h interfaceC8783h3 = this.f20340h;
            c8527b = new C8527b(interfaceC8783h3, c8786k.f20546b, interfaceC8783h3.mo20829a(c8786k));
            if (this.f19243z == null) {
                jM21069a = m21069a(c8527b);
                if (jM21069a != -9223372036854775807L) {
                    jM21371b = this.f19234q.m21371b(jM21069a);
                } else {
                    jM21371b = this.f20338f;
                }
                this.f19243z = m21070a(jM21371b);
            }
            if (z) {
                c8527b.m21023a(this.f19222B);
            }
            while (iMo21035a == 0) {
                if (!this.f19225E) {
                    break;
                    break;
                }
                iMo21035a = this.f19243z.mo21035a(c8527b, (C8607o) null);
            }
            this.f19222B = (int) (c8527b.f19124c - this.f20333a.f20546b);
            AbstractC8827z.m21383a(this.f20340h);
            this.f19226F = true;
            return;
        } catch (Throwable th4) {
            AbstractC8827z.m21383a(this.f20340h);
            throw th4;
        }
        z = false;
        if (this.f19233p) {
            c8823v2 = this.f19234q;
            synchronized (c8823v2) {
                while (c8823v2.f20669c == -9223372036854775807L) {
                    c8823v2.wait();
                }
            }
        } else {
            c8823v = this.f19234q;
            if (c8823v.f20667a == Long.MAX_VALUE) {
                c8823v.m21372c(this.f20338f);
            }
        }
    }
}
