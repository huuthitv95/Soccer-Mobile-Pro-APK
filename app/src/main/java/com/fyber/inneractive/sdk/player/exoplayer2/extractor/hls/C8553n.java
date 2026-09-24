package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8672l;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8531f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8558c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8559d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.RunnableC8563h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8722g;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8713a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8715b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8716c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8719d;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC8717a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8761b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8797v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.HandlerC8800y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8825x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8553n implements InterfaceC8799x, InterfaceC8738w, InterfaceC8568j, InterfaceC8531f {

    /* JADX INFO: renamed from: a */
    public final int f19268a;

    /* JADX INFO: renamed from: b */
    public final C8548i f19269b;

    /* JADX INFO: renamed from: c */
    public final C8545f f19270c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8760b f19271d;

    /* JADX INFO: renamed from: e */
    public final C8708o f19272e;

    /* JADX INFO: renamed from: f */
    public final int f19273f;

    /* JADX INFO: renamed from: h */
    public final C8721f f19275h;

    /* JADX INFO: renamed from: n */
    public boolean f19281n;

    /* JADX INFO: renamed from: o */
    public boolean f19282o;

    /* JADX INFO: renamed from: p */
    public int f19283p;

    /* JADX INFO: renamed from: q */
    public C8708o f19284q;

    /* JADX INFO: renamed from: r */
    public int f19285r;

    /* JADX INFO: renamed from: s */
    public boolean f19286s;

    /* JADX INFO: renamed from: t */
    public C8741z f19287t;

    /* JADX INFO: renamed from: u */
    public int f19288u;

    /* JADX INFO: renamed from: v */
    public boolean[] f19289v;

    /* JADX INFO: renamed from: w */
    public long f19290w;

    /* JADX INFO: renamed from: x */
    public long f19291x;

    /* JADX INFO: renamed from: y */
    public boolean f19292y;

    /* JADX INFO: renamed from: g */
    public final C8761b0 f19274g = new C8761b0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: i */
    public final C8543d f19276i = new C8543d();

    /* JADX INFO: renamed from: j */
    public final SparseArray f19277j = new SparseArray();

    /* JADX INFO: renamed from: k */
    public final LinkedList f19278k = new LinkedList();

    /* JADX INFO: renamed from: l */
    public final RunnableC8552m f19279l = new RunnableC8552m(this);

    /* JADX INFO: renamed from: m */
    public final Handler f19280m = new Handler();

    public C8553n(int i, C8548i c8548i, C8545f c8545f, InterfaceC8760b interfaceC8760b, long j, C8708o c8708o, int i2, C8721f c8721f) {
        this.f19268a = i;
        this.f19269b = c8548i;
        this.f19270c = c8545f;
        this.f19271d = interfaceC8760b;
        this.f19272e = c8708o;
        this.f19273f = i2;
        this.f19275h = c8721f;
        this.f19290w = j;
        this.f19291x = j;
    }

    /* JADX INFO: renamed from: a */
    public static C8708o m21089a(C8708o c8708o, C8708o c8708o2) {
        String strM21090a;
        if (c8708o == null) {
            return c8708o2;
        }
        int iM21327c = AbstractC8810i.m21327c(c8708o2.f20295f);
        if (iM21327c == 1) {
            strM21090a = m21090a(c8708o.f20292c, 1);
        } else {
            strM21090a = iM21327c == 2 ? m21090a(c8708o.f20292c, 2) : null;
        }
        return new C8708o(c8708o.f20290a, c8708o2.f20294e, c8708o2.f20295f, strM21090a, c8708o.f20291b, c8708o2.f20296g, c8708o.f20299j, c8708o.f20300k, c8708o2.f20301l, c8708o2.f20302m, c8708o2.f20303n, c8708o2.f20305p, c8708o2.f20304o, c8708o2.f20306q, c8708o2.f20307r, c8708o2.f20308s, c8708o2.f20309t, c8708o2.f20310u, c8708o2.f20311v, c8708o.f20313x, c8708o.f20314y, c8708o2.f20315z, c8708o2.f20312w, c8708o2.f20297h, c8708o2.f20298i, c8708o2.f20293d);
    }

    /* JADX INFO: renamed from: a */
    public static String m21090a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i == AbstractC8810i.m21327c(AbstractC8810i.m21325a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final int mo21091a(InterfaceC8801z interfaceC8801z, long j, long j2, IOException iOException) {
        boolean z;
        C8721f c8721f;
        C8786k c8786k;
        int i;
        int i2;
        C8708o c8708o;
        int i3;
        Object obj;
        long j3;
        long j4;
        long jMo21063c;
        C8548i c8548i;
        boolean zM21282a;
        C8797v c8797v;
        int i4;
        AbstractC8717a abstractC8717a = (AbstractC8717a) interfaceC8801z;
        boolean z2 = abstractC8717a instanceof C8547h;
        boolean z3 = !z2 || abstractC8717a.mo21063c() == 0;
        C8545f c8545f = this.f19270c;
        if (z3) {
            AbstractC8748b abstractC8748b = c8545f.f19219p;
            int iM21279a = c8545f.f19209f.m21279a(abstractC8717a.f20335c);
            int i5 = 0;
            while (true) {
                if (i5 >= abstractC8748b.f20435b) {
                    i5 = -1;
                    break;
                }
                if (abstractC8748b.f20436c[i5] == iM21279a) {
                    break;
                }
                i5++;
            }
            if ((iOException instanceof C8797v) && ((i4 = (c8797v = (C8797v) iOException).f20597a) == 404 || i4 == 410)) {
                zM21282a = abstractC8748b.m21282a(i5);
                int i6 = c8797v.f20597a;
                if (zM21282a) {
                    StringBuilder sbM21088a = AbstractC8551l.m21088a("Blacklisted: duration=60000, responseCode=", i6, ", format=");
                    sbM21088a.append(abstractC8748b.f20437d[i5]);
                    Log.w("ChunkedTrackBlacklist", sbM21088a.toString());
                } else {
                    StringBuilder sbM21088a2 = AbstractC8551l.m21088a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i6, ", format=");
                    sbM21088a2.append(abstractC8748b.f20437d[i5]);
                    Log.w("ChunkedTrackBlacklist", sbM21088a2.toString());
                }
            } else {
                zM21282a = false;
            }
            if (zM21282a) {
                if (z2) {
                    if (!(((C8547h) this.f19278k.removeLast()) == abstractC8717a)) {
                        throw new IllegalStateException();
                    }
                    if (this.f19278k.isEmpty()) {
                        this.f19291x = this.f19290w;
                    }
                }
                z = true;
            }
            c8721f = this.f19275h;
            c8786k = abstractC8717a.f20333a;
            i = abstractC8717a.f20334b;
            i2 = this.f19268a;
            c8708o = abstractC8717a.f20335c;
            i3 = abstractC8717a.f20336d;
            obj = abstractC8717a.f20337e;
            j3 = abstractC8717a.f20338f;
            j4 = abstractC8717a.f20339g;
            jMo21063c = abstractC8717a.mo21063c();
            if (c8721f.f20351b != null) {
                c8721f.f20350a.post(new RunnableC8719d(c8721f, c8786k, i, i2, c8708o, i3, obj, j3, j4, j, j2, jMo21063c, iOException, z));
            }
            if (z) {
                return 0;
            }
            if (!this.f19282o) {
                mo21075b(this.f19290w);
                return 2;
            }
            c8548i = this.f19269b;
            c8548i.getClass();
            if (c8548i.f19256m == null) {
                return 2;
            }
            C8672l c8672l = (C8672l) c8548i.f19253j;
            c8672l.getClass();
            c8672l.f20182f.obtainMessage(9, c8548i).sendToTarget();
            return 2;
        }
        c8545f.getClass();
        z = false;
        c8721f = this.f19275h;
        c8786k = abstractC8717a.f20333a;
        i = abstractC8717a.f20334b;
        i2 = this.f19268a;
        c8708o = abstractC8717a.f20335c;
        i3 = abstractC8717a.f20336d;
        obj = abstractC8717a.f20337e;
        j3 = abstractC8717a.f20338f;
        j4 = abstractC8717a.f20339g;
        jMo21063c = abstractC8717a.mo21063c();
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8719d(c8721f, c8786k, i, i2, c8708o, i3, obj, j3, j4, j, j2, jMo21063c, iOException, z));
        }
        if (z) {
            return 0;
        }
        if (!this.f19282o) {
            mo21075b(this.f19290w);
            return 2;
        }
        c8548i = this.f19269b;
        c8548i.getClass();
        if (c8548i.f19256m == null) {
            return 2;
        }
        C8672l c8672l2 = (C8672l) c8548i.f19253j;
        c8672l2.getClass();
        c8672l2.f20182f.obtainMessage(9, c8548i).sendToTarget();
        return 2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: a */
    public final C8538g mo21092a(int i, int i2) {
        if (this.f19277j.indexOfKey(i) >= 0) {
            return (C8538g) this.f19277j.get(i);
        }
        C8538g c8538g = new C8538g(this.f19271d);
        c8538g.f19189n = this;
        c8538g.f19178c.f19150r = this.f19285r;
        this.f19277j.put(i, c8538g);
        return c8538g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: a */
    public final void mo21093a(InterfaceC8628q interfaceC8628q) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21094a(InterfaceC8801z interfaceC8801z, long j, long j2) {
        AbstractC8717a abstractC8717a = (AbstractC8717a) interfaceC8801z;
        C8545f c8545f = this.f19270c;
        c8545f.getClass();
        if (abstractC8717a instanceof C8542c) {
            C8542c c8542c = (C8542c) abstractC8717a;
            c8545f.f19212i = c8542c.f19195i;
            c8545f.m21068a(c8542c.f20333a.f20545a, c8542c.f19198l, c8542c.f19199m);
        }
        C8721f c8721f = this.f19275h;
        C8786k c8786k = abstractC8717a.f20333a;
        int i = abstractC8717a.f20334b;
        int i2 = this.f19268a;
        C8708o c8708o = abstractC8717a.f20335c;
        int i3 = abstractC8717a.f20336d;
        Object obj = abstractC8717a.f20337e;
        long j3 = abstractC8717a.f20338f;
        long j4 = abstractC8717a.f20339g;
        long jMo21063c = abstractC8717a.mo21063c();
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8715b(c8721f, c8786k, i, i2, c8708o, i3, obj, j3, j4, j, j2, jMo21063c));
        }
        if (!this.f19282o) {
            mo21075b(this.f19290w);
            return;
        }
        C8548i c8548i = this.f19269b;
        c8548i.getClass();
        if (c8548i.f19256m == null) {
            return;
        }
        C8672l c8672l = (C8672l) c8548i.f19253j;
        c8672l.getClass();
        c8672l.f20182f.obtainMessage(9, c8548i).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21095a(InterfaceC8801z interfaceC8801z, long j, long j2, boolean z) {
        AbstractC8717a abstractC8717a = (AbstractC8717a) interfaceC8801z;
        C8721f c8721f = this.f19275h;
        C8786k c8786k = abstractC8717a.f20333a;
        int i = abstractC8717a.f20334b;
        int i2 = this.f19268a;
        C8708o c8708o = abstractC8717a.f20335c;
        int i3 = abstractC8717a.f20336d;
        Object obj = abstractC8717a.f20337e;
        long j3 = abstractC8717a.f20338f;
        long j4 = abstractC8717a.f20339g;
        long jMo21063c = abstractC8717a.mo21063c();
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8716c(c8721f, c8786k, i, i2, c8708o, i3, obj, j3, j4, j, j2, jMo21063c));
        }
        if (z) {
            return;
        }
        int size = this.f19277j.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C8538g) this.f19277j.valueAt(i4)).m21054a(this.f19289v[i4]);
        }
        C8548i c8548i = this.f19269b;
        c8548i.getClass();
        if (c8548i.f19256m == null) {
            return;
        }
        C8672l c8672l = (C8672l) c8548i.f19253j;
        c8672l.getClass();
        c8672l.f20182f.obtainMessage(9, c8548i).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: b */
    public final void mo21096b() {
        this.f19281n = true;
        this.f19280m.post(this.f19279l);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x022a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0297  */
    /* JADX WARN: Code duplicated, block: B:110:0x029a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x029c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ca A[LOOP:0: B:118:0x02c2->B:120:0x02ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02db  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e4 A[LOOP:1: B:123:0x02dc->B:125:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0303  */
    /* JADX WARN: Code duplicated, block: B:131:0x0312  */
    /* JADX WARN: Code duplicated, block: B:133:0x0332  */
    /* JADX WARN: Code duplicated, block: B:135:0x0343  */
    /* JADX WARN: Code duplicated, block: B:137:0x0349  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:83:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0150  */
    /* JADX WARN: Code duplicated, block: B:86:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:90:0x016e  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: b */
    public final boolean mo21075b(long j) {
        C8556a c8556a;
        C8547h c8547h;
        int iMax;
        int size;
        C8556a c8556a2;
        int i;
        int i2;
        boolean z;
        C8558c c8558c;
        C8558c c8558c2;
        C8786k c8786k;
        int i3;
        C8554o c8554o;
        C8823v c8823v;
        long j2;
        boolean z2;
        Uri uriM21375a;
        int i4;
        boolean z3;
        AbstractC8717a abstractC8717a;
        C8556a c8556a3;
        C8761b0 c8761b0;
        int i5;
        Looper looperMyLooper;
        long jElapsedRealtime;
        HandlerC8800y handlerC8800y;
        C8721f c8721f;
        C8786k c8786k2;
        int i6;
        int i7;
        C8708o c8708o;
        int i8;
        Object obj;
        long j3;
        long j4;
        int i9;
        boolean z4;
        int i10;
        int i11;
        if (this.f19292y || this.f19274g.m21287a()) {
            return false;
        }
        C8545f c8545f = this.f19270c;
        C8547h c8547h2 = this.f19278k.isEmpty() ? null : (C8547h) this.f19278k.getLast();
        long j5 = this.f19291x;
        if (j5 == -9223372036854775807L) {
            j5 = j;
        }
        C8543d c8543d = this.f19276i;
        int iM21279a = c8547h2 == null ? -1 : c8545f.f19209f.m21279a(c8547h2.f20335c);
        c8545f.f19214k = null;
        if (c8547h2 != null) {
            Math.max(0L, c8547h2.f20338f - j5);
        }
        c8545f.f19219p.mo21067d();
        AbstractC8748b abstractC8748b = c8545f.f19219p;
        int i12 = abstractC8748b.f20436c[abstractC8748b.mo21064a()];
        boolean z5 = iM21279a != i12;
        C8556a c8556a4 = c8545f.f19207d[i12];
        RunnableC8563h runnableC8563h = (RunnableC8563h) c8545f.f19208e.f19372d.get(c8556a4);
        if (runnableC8563h.f19361d != null) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            C8547h c8547h3 = c8547h2;
            boolean z6 = z5;
            long jMax = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, AbstractC8515b.m21012a(runnableC8563h.f19361d.f19331o));
            C8559d c8559d = runnableC8563h.f19361d;
            if (!c8559d.f19326j && (i4 = c8559d.f19318b) != 2 && i4 != 1) {
                c8556a = c8556a4;
                if (runnableC8563h.f19362e + jMax > jElapsedRealtime2) {
                }
                j2 = -9223372036854775807L;
                z2 = true;
                C8543d c8543d2 = this.f19276i;
                z3 = c8543d2.f19201b;
                abstractC8717a = c8543d2.f19200a;
                c8556a3 = c8543d2.f19202c;
                c8543d2.f19200a = null;
                c8543d2.f19201b = false;
                c8543d2.f19202c = null;
                if (z3) {
                    this.f19292y = z2;
                    return z2;
                }
                if (abstractC8717a == null) {
                    if (c8556a3 != null) {
                        return false;
                    }
                    ((RunnableC8563h) this.f19269b.f19244a.f19372d.get(c8556a3)).m21107b();
                    return false;
                }
                if (abstractC8717a instanceof C8547h) {
                    this.f19291x = j2;
                    C8547h c8547h4 = (C8547h) abstractC8717a;
                    c8547h4.f19224D = this;
                    i9 = c8547h4.f19227j;
                    z4 = c8547h4.f19237t;
                    this.f19285r = i9;
                    for (i10 = 0; i10 < this.f19277j.size(); i10++) {
                        ((C8538g) this.f19277j.valueAt(i10)).f19178c.f19150r = i9;
                    }
                    if (z4) {
                        for (i11 = 0; i11 < this.f19277j.size(); i11++) {
                            ((C8538g) this.f19277j.valueAt(i11)).f19188m = z2;
                        }
                    }
                    this.f19278k.add(c8547h4);
                }
                c8761b0 = this.f19274g;
                i5 = this.f19273f;
                c8761b0.getClass();
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    throw new IllegalStateException();
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
                handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, abstractC8717a, this, i5, jElapsedRealtime);
                if (c8761b0.f20453b == null) {
                    throw new IllegalStateException();
                }
                c8761b0.f20453b = handlerC8800y;
                handlerC8800y.f20604e = null;
                c8761b0.f20452a.execute(handlerC8800y);
                c8721f = this.f19275h;
                c8786k2 = abstractC8717a.f20333a;
                i6 = abstractC8717a.f20334b;
                i7 = this.f19268a;
                c8708o = abstractC8717a.f20335c;
                i8 = abstractC8717a.f20336d;
                obj = abstractC8717a.f20337e;
                j3 = abstractC8717a.f20338f;
                j4 = abstractC8717a.f20339g;
                if (c8721f.f20351b != null) {
                    c8721f.f20350a.post(new RunnableC8713a(c8721f, c8786k2, i6, i7, c8708o, i8, obj, j3, j4, jElapsedRealtime));
                }
                return z2;
            }
            c8556a = c8556a4;
            C8559d c8559dM21108a = c8545f.f19208e.m21108a(c8556a);
            if (c8547h3 == null || z6) {
                c8547h = c8547h3;
                if (c8547h != null) {
                    j5 = c8547h.f20338f;
                }
                if (c8559dM21108a.f19326j || j5 <= c8559dM21108a.f19320d + c8559dM21108a.f19331o) {
                    List list = c8559dM21108a.f19329m;
                    Long lValueOf = Long.valueOf(j5 - c8559dM21108a.f19320d);
                    boolean z7 = !c8545f.f19208e.f19381m || c8547h == null;
                    int i13 = AbstractC8827z.f20671a;
                    int iBinarySearch = Collections.binarySearch(list, lValueOf);
                    if (iBinarySearch < 0) {
                        iMax = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i14 = iBinarySearch - 1;
                            if (i14 < 0 || ((Comparable) list.get(i14)).compareTo(lValueOf) != 0) {
                                break;
                            }
                            iBinarySearch = i14;
                        }
                        iMax = iBinarySearch;
                    }
                    if (z7) {
                        iMax = Math.max(0, iMax);
                    }
                    int i15 = c8559dM21108a.f19323g;
                    size = iMax + i15;
                    if (size < i15 && c8547h != null) {
                        C8556a c8556a5 = c8545f.f19207d[iM21279a];
                        c8559dM21108a = c8545f.f19208e.m21108a(c8556a5);
                        size = c8547h.f20341i + 1;
                        c8556a2 = c8556a5;
                    }
                    i = c8559dM21108a.f19323g;
                    if (size < i) {
                        c8545f.f19213j = new C8722g();
                        j2 = -9223372036854775807L;
                        z2 = true;
                    } else {
                        i2 = size - i;
                        if (i2 >= c8559dM21108a.f19329m.size()) {
                            z = true;
                            c8558c = (C8558c) c8559dM21108a.f19329m.get(i2);
                            if (c8558c.f19313e) {
                                uriM21375a = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c.f19314f);
                                if (!uriM21375a.equals(c8545f.f19215l)) {
                                    c8543d.f19200a = new C8542c(c8545f.f19205b, new C8786k(uriM21375a, 0L, 0L, -1L, null, 1), c8545f.f19207d[iM21279a].f19303b, c8545f.f19219p.mo21066c(), c8545f.f19219p.mo21065b(), c8545f.f19212i, c8558c.f19315g);
                                } else if (!AbstractC8827z.m21386a(c8558c.f19315g, c8545f.f19217n)) {
                                    c8545f.m21068a(uriM21375a, c8558c.f19315g, c8545f.f19216m);
                                }
                            } else {
                                c8545f.f19215l = null;
                                c8545f.f19216m = null;
                                c8545f.f19217n = null;
                                c8545f.f19218o = null;
                            }
                            c8558c2 = c8559dM21108a.f19328l;
                            if (c8558c2 != null) {
                                Uri uriM21375a2 = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c2.f19309a);
                                long j6 = c8558c2.f19316h;
                                c8786k = new C8786k(uriM21375a2, j6, j6, c8558c2.f19317i, null, 0);
                            } else {
                                c8786k = null;
                            }
                            long j7 = c8559dM21108a.f19320d + c8558c.f19312d;
                            i3 = c8559dM21108a.f19322f + c8558c.f19311c;
                            c8554o = c8545f.f19206c;
                            c8823v = (C8823v) c8554o.f19293a.get(i3);
                            if (c8823v == null) {
                                c8823v = new C8823v(Long.MAX_VALUE);
                                c8554o.f19293a.put(i3, c8823v);
                            }
                            C8823v c8823v2 = c8823v;
                            Uri uriM21375a3 = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c.f19309a);
                            long j8 = c8558c.f19316h;
                            C8786k c8786k3 = new C8786k(uriM21375a3, j8, j8, c8558c.f19317i, null, 0);
                            InterfaceC8783h interfaceC8783h = c8545f.f19204a;
                            List list2 = c8545f.f19210g;
                            int iMo21066c = c8545f.f19219p.mo21066c();
                            Object objMo21065b = c8545f.f19219p.mo21065b();
                            long j9 = j7 + c8558c.f19310b;
                            boolean z8 = c8545f.f19211h;
                            byte[] bArr = c8545f.f19216m;
                            byte[] bArr2 = c8545f.f19218o;
                            j2 = -9223372036854775807L;
                            z2 = true;
                            c8543d.f19200a = new C8547h(interfaceC8783h, c8786k3, c8786k, c8556a2, list2, iMo21066c, objMo21065b, j7, j9, size, i3, z8, c8823v2, c8547h, bArr, bArr2);
                        } else if (c8559dM21108a.f19326j) {
                            z = true;
                            c8543d.f19201b = true;
                        } else {
                            z = true;
                            c8543d.f19202c = c8556a2;
                            c8545f.f19214k = c8556a2;
                        }
                        z2 = z;
                        j2 = -9223372036854775807L;
                    }
                    C8543d c8543d3 = this.f19276i;
                    z3 = c8543d3.f19201b;
                    abstractC8717a = c8543d3.f19200a;
                    c8556a3 = c8543d3.f19202c;
                    c8543d3.f19200a = null;
                    c8543d3.f19201b = false;
                    c8543d3.f19202c = null;
                    if (z3) {
                        this.f19292y = z2;
                        return z2;
                    }
                    if (abstractC8717a == null) {
                        if (c8556a3 != null) {
                            return false;
                        }
                        ((RunnableC8563h) this.f19269b.f19244a.f19372d.get(c8556a3)).m21107b();
                        return false;
                    }
                    if (abstractC8717a instanceof C8547h) {
                        this.f19291x = j2;
                        C8547h c8547h5 = (C8547h) abstractC8717a;
                        c8547h5.f19224D = this;
                        i9 = c8547h5.f19227j;
                        z4 = c8547h5.f19237t;
                        this.f19285r = i9;
                        while (i10 < this.f19277j.size()) {
                            ((C8538g) this.f19277j.valueAt(i10)).f19178c.f19150r = i9;
                        }
                        if (z4) {
                            while (i11 < this.f19277j.size()) {
                                ((C8538g) this.f19277j.valueAt(i11)).f19188m = z2;
                            }
                        }
                        this.f19278k.add(c8547h5);
                    }
                    c8761b0 = this.f19274g;
                    i5 = this.f19273f;
                    c8761b0.getClass();
                    looperMyLooper = Looper.myLooper();
                    if (looperMyLooper != null) {
                        throw new IllegalStateException();
                    }
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, abstractC8717a, this, i5, jElapsedRealtime);
                    if (c8761b0.f20453b == null) {
                        throw new IllegalStateException();
                    }
                    c8761b0.f20453b = handlerC8800y;
                    handlerC8800y.f20604e = null;
                    c8761b0.f20452a.execute(handlerC8800y);
                    c8721f = this.f19275h;
                    c8786k2 = abstractC8717a.f20333a;
                    i6 = abstractC8717a.f20334b;
                    i7 = this.f19268a;
                    c8708o = abstractC8717a.f20335c;
                    i8 = abstractC8717a.f20336d;
                    obj = abstractC8717a.f20337e;
                    j3 = abstractC8717a.f20338f;
                    j4 = abstractC8717a.f20339g;
                    if (c8721f.f20351b != null) {
                        c8721f.f20350a.post(new RunnableC8713a(c8721f, c8786k2, i6, i7, c8708o, i8, obj, j3, j4, jElapsedRealtime));
                    }
                    return z2;
                }
                size = c8559dM21108a.f19323g + c8559dM21108a.f19329m.size();
            } else {
                c8547h = c8547h3;
                size = c8547h.f20341i + 1;
            }
            c8556a2 = c8556a;
            iM21279a = i12;
            i = c8559dM21108a.f19323g;
            if (size < i) {
                c8545f.f19213j = new C8722g();
                j2 = -9223372036854775807L;
                z2 = true;
            } else {
                i2 = size - i;
                if (i2 >= c8559dM21108a.f19329m.size()) {
                    z = true;
                    c8558c = (C8558c) c8559dM21108a.f19329m.get(i2);
                    if (c8558c.f19313e) {
                        uriM21375a = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c.f19314f);
                        if (!uriM21375a.equals(c8545f.f19215l)) {
                            c8543d.f19200a = new C8542c(c8545f.f19205b, new C8786k(uriM21375a, 0L, 0L, -1L, null, 1), c8545f.f19207d[iM21279a].f19303b, c8545f.f19219p.mo21066c(), c8545f.f19219p.mo21065b(), c8545f.f19212i, c8558c.f19315g);
                        } else if (!AbstractC8827z.m21386a(c8558c.f19315g, c8545f.f19217n)) {
                            c8545f.m21068a(uriM21375a, c8558c.f19315g, c8545f.f19216m);
                        }
                    } else {
                        c8545f.f19215l = null;
                        c8545f.f19216m = null;
                        c8545f.f19217n = null;
                        c8545f.f19218o = null;
                    }
                    c8558c2 = c8559dM21108a.f19328l;
                    if (c8558c2 != null) {
                        Uri uriM21375a4 = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c2.f19309a);
                        long j10 = c8558c2.f19316h;
                        c8786k = new C8786k(uriM21375a4, j10, j10, c8558c2.f19317i, null, 0);
                    } else {
                        c8786k = null;
                    }
                    long j11 = c8559dM21108a.f19320d + c8558c.f19312d;
                    i3 = c8559dM21108a.f19322f + c8558c.f19311c;
                    c8554o = c8545f.f19206c;
                    c8823v = (C8823v) c8554o.f19293a.get(i3);
                    if (c8823v == null) {
                        c8823v = new C8823v(Long.MAX_VALUE);
                        c8554o.f19293a.put(i3, c8823v);
                    }
                    C8823v c8823v3 = c8823v;
                    Uri uriM21375a5 = AbstractC8825x.m21375a(c8559dM21108a.f19332a, c8558c.f19309a);
                    long j12 = c8558c.f19316h;
                    C8786k c8786k4 = new C8786k(uriM21375a5, j12, j12, c8558c.f19317i, null, 0);
                    InterfaceC8783h interfaceC8783h2 = c8545f.f19204a;
                    List list3 = c8545f.f19210g;
                    int iMo21066c2 = c8545f.f19219p.mo21066c();
                    Object objMo21065b2 = c8545f.f19219p.mo21065b();
                    long j13 = j11 + c8558c.f19310b;
                    boolean z9 = c8545f.f19211h;
                    byte[] bArr3 = c8545f.f19216m;
                    byte[] bArr4 = c8545f.f19218o;
                    j2 = -9223372036854775807L;
                    z2 = true;
                    c8543d.f19200a = new C8547h(interfaceC8783h2, c8786k4, c8786k, c8556a2, list3, iMo21066c2, objMo21065b2, j11, j13, size, i3, z9, c8823v3, c8547h, bArr3, bArr4);
                } else if (c8559dM21108a.f19326j) {
                    z = true;
                    c8543d.f19201b = true;
                } else {
                    z = true;
                    c8543d.f19202c = c8556a2;
                    c8545f.f19214k = c8556a2;
                }
                z2 = z;
                j2 = -9223372036854775807L;
            }
            C8543d c8543d4 = this.f19276i;
            z3 = c8543d4.f19201b;
            abstractC8717a = c8543d4.f19200a;
            c8556a3 = c8543d4.f19202c;
            c8543d4.f19200a = null;
            c8543d4.f19201b = false;
            c8543d4.f19202c = null;
            if (z3) {
                this.f19292y = z2;
                return z2;
            }
            if (abstractC8717a == null) {
                if (c8556a3 != null) {
                    return false;
                }
                ((RunnableC8563h) this.f19269b.f19244a.f19372d.get(c8556a3)).m21107b();
                return false;
            }
            if (abstractC8717a instanceof C8547h) {
                this.f19291x = j2;
                C8547h c8547h6 = (C8547h) abstractC8717a;
                c8547h6.f19224D = this;
                i9 = c8547h6.f19227j;
                z4 = c8547h6.f19237t;
                this.f19285r = i9;
                while (i10 < this.f19277j.size()) {
                    ((C8538g) this.f19277j.valueAt(i10)).f19178c.f19150r = i9;
                }
                if (z4) {
                    while (i11 < this.f19277j.size()) {
                        ((C8538g) this.f19277j.valueAt(i11)).f19188m = z2;
                    }
                }
                this.f19278k.add(c8547h6);
            }
            c8761b0 = this.f19274g;
            i5 = this.f19273f;
            c8761b0.getClass();
            looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                throw new IllegalStateException();
            }
            jElapsedRealtime = SystemClock.elapsedRealtime();
            handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, abstractC8717a, this, i5, jElapsedRealtime);
            if (c8761b0.f20453b == null) {
                throw new IllegalStateException();
            }
            c8761b0.f20453b = handlerC8800y;
            handlerC8800y.f20604e = null;
            c8761b0.f20452a.execute(handlerC8800y);
            c8721f = this.f19275h;
            c8786k2 = abstractC8717a.f20333a;
            i6 = abstractC8717a.f20334b;
            i7 = this.f19268a;
            c8708o = abstractC8717a.f20335c;
            i8 = abstractC8717a.f20336d;
            obj = abstractC8717a.f20337e;
            j3 = abstractC8717a.f20338f;
            j4 = abstractC8717a.f20339g;
            if (c8721f.f20351b != null) {
                c8721f.f20350a.post(new RunnableC8713a(c8721f, c8786k2, i6, i7, c8708o, i8, obj, j3, j4, jElapsedRealtime));
            }
            return z2;
        }
        c8556a = c8556a4;
        c8543d.f19202c = c8556a;
        c8545f.f19214k = c8556a;
        j2 = -9223372036854775807L;
        z2 = true;
        C8543d c8543d5 = this.f19276i;
        z3 = c8543d5.f19201b;
        abstractC8717a = c8543d5.f19200a;
        c8556a3 = c8543d5.f19202c;
        c8543d5.f19200a = null;
        c8543d5.f19201b = false;
        c8543d5.f19202c = null;
        if (z3) {
            this.f19292y = z2;
            return z2;
        }
        if (abstractC8717a == null) {
            if (c8556a3 != null) {
                return false;
            }
            ((RunnableC8563h) this.f19269b.f19244a.f19372d.get(c8556a3)).m21107b();
            return false;
        }
        if (abstractC8717a instanceof C8547h) {
            this.f19291x = j2;
            C8547h c8547h7 = (C8547h) abstractC8717a;
            c8547h7.f19224D = this;
            i9 = c8547h7.f19227j;
            z4 = c8547h7.f19237t;
            this.f19285r = i9;
            while (i10 < this.f19277j.size()) {
                ((C8538g) this.f19277j.valueAt(i10)).f19178c.f19150r = i9;
            }
            if (z4) {
                while (i11 < this.f19277j.size()) {
                    ((C8538g) this.f19277j.valueAt(i11)).f19188m = z2;
                }
            }
            this.f19278k.add(c8547h7);
        }
        c8761b0 = this.f19274g;
        i5 = this.f19273f;
        c8761b0.getClass();
        looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            throw new IllegalStateException();
        }
        jElapsedRealtime = SystemClock.elapsedRealtime();
        handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, abstractC8717a, this, i5, jElapsedRealtime);
        if (c8761b0.f20453b == null) {
            throw new IllegalStateException();
        }
        c8761b0.f20453b = handlerC8800y;
        handlerC8800y.f20604e = null;
        c8761b0.f20452a.execute(handlerC8800y);
        c8721f = this.f19275h;
        c8786k2 = abstractC8717a.f20333a;
        i6 = abstractC8717a.f20334b;
        i7 = this.f19268a;
        c8708o = abstractC8717a.f20335c;
        i8 = abstractC8717a.f20336d;
        obj = abstractC8717a.f20337e;
        j3 = abstractC8717a.f20338f;
        j4 = abstractC8717a.f20339g;
        if (c8721f.f20351b != null) {
            c8721f.f20350a.post(new RunnableC8713a(c8721f, c8786k2, i6, i7, c8708o, i8, obj, j3, j4, jElapsedRealtime));
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m21097c(long j) {
        this.f19290w = j;
        this.f19291x = j;
        this.f19292y = false;
        this.f19278k.clear();
        if (this.f19274g.m21287a()) {
            this.f19274g.f20453b.m21318a(false);
            return;
        }
        int size = this.f19277j.size();
        for (int i = 0; i < size; i++) {
            ((C8538g) this.f19277j.valueAt(i)).m21054a(this.f19289v[i]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8531f
    /* JADX INFO: renamed from: e */
    public final void mo21032e() {
        this.f19280m.post(this.f19279l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: f */
    public final long mo21078f() {
        long j = this.f19291x;
        if (j != -9223372036854775807L) {
            return j;
        }
        if (this.f19292y) {
            return Long.MIN_VALUE;
        }
        return ((C8547h) this.f19278k.getLast()).f20339g;
    }

    /* JADX INFO: renamed from: h */
    public final void m21098h() {
        if (this.f19286s || this.f19282o || !this.f19281n) {
            return;
        }
        int size = this.f19277j.size();
        for (int i = 0; i < size; i++) {
            if (((C8538g) this.f19277j.valueAt(i)).m21059e() == null) {
                return;
            }
        }
        int size2 = this.f19277j.size();
        int i2 = 0;
        char c = 0;
        int i3 = -1;
        while (true) {
            char c2 = 3;
            if (i2 >= size2) {
                break;
            }
            String str = ((C8538g) this.f19277j.valueAt(i2)).m21059e().f20295f;
            if (!"video".equals(AbstractC8810i.m21326b(str))) {
                c2 = "audio".equals(AbstractC8810i.m21326b(str)) ? (char) 2 : "text".equals(AbstractC8810i.m21326b(str)) ? (char) 1 : (char) 0;
            }
            if (c2 > c) {
                i3 = i2;
                c = c2;
            } else if (c2 == c && i3 != -1) {
                i3 = -1;
            }
            i2++;
        }
        C8740y c8740y = this.f19270c.f19209f;
        int i4 = c8740y.f20422a;
        this.f19288u = -1;
        this.f19289v = new boolean[size2];
        C8740y[] c8740yArr = new C8740y[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            C8708o c8708oM21059e = ((C8538g) this.f19277j.valueAt(i5)).m21059e();
            if (i5 == i3) {
                C8708o[] c8708oArr = new C8708o[i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    c8708oArr[i6] = m21089a(c8740y.f20423b[i6], c8708oM21059e);
                }
                c8740yArr[i5] = new C8740y(c8708oArr);
                this.f19288u = i5;
            } else {
                c8740yArr[i5] = new C8740y(m21089a((c == 3 && "audio".equals(AbstractC8810i.m21326b(c8708oM21059e.f20295f))) ? this.f19272e : null, c8708oM21059e));
            }
        }
        this.f19287t = new C8741z(c8740yArr);
        this.f19282o = true;
        C8548i c8548i = this.f19269b;
        int i7 = c8548i.f19254k - 1;
        c8548i.f19254k = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (C8553n c8553n : c8548i.f19257n) {
            i8 += c8553n.f19287t.f20426a;
        }
        C8740y[] c8740yArr2 = new C8740y[i8];
        int i9 = 0;
        for (C8553n c8553n2 : c8548i.f19257n) {
            int i10 = c8553n2.f19287t.f20426a;
            int i11 = 0;
            while (i11 < i10) {
                c8740yArr2[i9] = c8553n2.f19287t.f20427b[i11];
                i11++;
                i9++;
            }
        }
        c8548i.f19256m = new C8741z(c8740yArr2);
        ((C8672l) c8548i.f19253j).f20182f.obtainMessage(8, c8548i).sendToTarget();
    }
}
