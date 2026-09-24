package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.C8672l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8530e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8531f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8761b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8796u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8797v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.HandlerC8800y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8760b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8801z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8806e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8731p implements InterfaceC8734s, InterfaceC8568j, InterfaceC8799x, InterfaceC8531f {

    /* JADX INFO: renamed from: A */
    public boolean f20374A;

    /* JADX INFO: renamed from: C */
    public long f20376C;

    /* JADX INFO: renamed from: E */
    public int f20378E;

    /* JADX INFO: renamed from: F */
    public boolean f20379F;

    /* JADX INFO: renamed from: G */
    public boolean f20380G;

    /* JADX INFO: renamed from: a */
    public final Uri f20381a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8783h f20382b;

    /* JADX INFO: renamed from: c */
    public final int f20383c;

    /* JADX INFO: renamed from: d */
    public final Handler f20384d;

    /* JADX INFO: renamed from: e */
    public final C8456b0 f20385e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8735t f20386f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8760b f20387g;

    /* JADX INFO: renamed from: j */
    public final C8729n f20390j;

    /* JADX INFO: renamed from: p */
    public InterfaceC8733r f20396p;

    /* JADX INFO: renamed from: q */
    public InterfaceC8628q f20397q;

    /* JADX INFO: renamed from: r */
    public boolean f20398r;

    /* JADX INFO: renamed from: s */
    public boolean f20399s;

    /* JADX INFO: renamed from: t */
    public boolean f20400t;

    /* JADX INFO: renamed from: u */
    public boolean f20401u;

    /* JADX INFO: renamed from: v */
    public int f20402v;

    /* JADX INFO: renamed from: w */
    public C8741z f20403w;

    /* JADX INFO: renamed from: x */
    public long f20404x;

    /* JADX INFO: renamed from: y */
    public boolean[] f20405y;

    /* JADX INFO: renamed from: z */
    public boolean[] f20406z;

    /* JADX INFO: renamed from: h */
    public final String f20388h = null;

    /* JADX INFO: renamed from: i */
    public final C8761b0 f20389i = new C8761b0("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: k */
    public final C8806e f20391k = new C8806e();

    /* JADX INFO: renamed from: l */
    public final RunnableC8724i f20392l = new RunnableC8724i(this);

    /* JADX INFO: renamed from: m */
    public final RunnableC8725j f20393m = new RunnableC8725j(this);

    /* JADX INFO: renamed from: n */
    public final Handler f20394n = new Handler();

    /* JADX INFO: renamed from: D */
    public long f20377D = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public final SparseArray f20395o = new SparseArray();

    /* JADX INFO: renamed from: B */
    public long f20375B = -1;

    public C8731p(Uri uri, InterfaceC8783h interfaceC8783h, InterfaceC8567i[] interfaceC8567iArr, int i, Handler handler, C8456b0 c8456b0, InterfaceC8735t interfaceC8735t, InterfaceC8760b interfaceC8760b) {
        this.f20381a = uri;
        this.f20382b = interfaceC8783h;
        this.f20383c = i;
        this.f20384d = handler;
        this.f20385e = c8456b0;
        this.f20386f = interfaceC8735t;
        this.f20387g = interfaceC8760b;
        this.f20390j = new C8729n(interfaceC8567iArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final int mo21091a(InterfaceC8801z interfaceC8801z, long j, long j2, IOException iOException) {
        InterfaceC8628q interfaceC8628q;
        C8728m c8728m = (C8728m) interfaceC8801z;
        if (this.f20375B == -1) {
            this.f20375B = c8728m.f20367i;
        }
        Handler handler = this.f20384d;
        if (handler != null && this.f20385e != null) {
            handler.post(new RunnableC8727l(this, iOException));
        }
        if ((iOException instanceof C8714a0) || (iOException instanceof C8797v)) {
            return 3;
        }
        if ((iOException instanceof C8796u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException))) {
            return 3;
        }
        int i = m21272h() > this.f20378E ? 1 : 0;
        if (this.f20375B == -1 && ((interfaceC8628q = this.f20397q) == null || interfaceC8628q.mo21021c() == -9223372036854775807L)) {
            this.f20376C = 0L;
            this.f20401u = this.f20399s;
            int size = this.f20395o.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C8538g) this.f20395o.valueAt(i2)).m21054a(!this.f20399s || this.f20405y[i2]);
            }
            c8728m.f20363e.f19793a = 0L;
            c8728m.f20366h = 0L;
            c8728m.f20365g = true;
        }
        this.f20378E = m21272h();
        return i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final long mo21071a(long j) {
        if (!this.f20397q.mo21020a()) {
            j = 0;
        }
        this.f20376C = j;
        int size = this.f20395o.size();
        boolean zM21055a = !(this.f20377D != -9223372036854775807L);
        for (int i = 0; zM21055a && i < size; i++) {
            if (this.f20405y[i]) {
                zM21055a = ((C8538g) this.f20395o.valueAt(i)).m21055a(false, j);
            }
        }
        if (!zM21055a) {
            this.f20377D = j;
            this.f20379F = false;
            if (this.f20389i.m21287a()) {
                this.f20389i.f20453b.m21318a(false);
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    ((C8538g) this.f20395o.valueAt(i2)).m21054a(this.f20405y[i2]);
                }
            }
        }
        this.f20401u = false;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final long mo21072a(AbstractC8748b[] abstractC8748bArr, boolean[] zArr, InterfaceC8737v[] interfaceC8737vArr, boolean[] zArr2, long j) {
        AbstractC8748b abstractC8748b;
        if (!this.f20399s) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < abstractC8748bArr.length; i++) {
            InterfaceC8737v interfaceC8737v = interfaceC8737vArr[i];
            if (interfaceC8737v != null && (abstractC8748bArr[i] == null || !zArr[i])) {
                int i2 = ((C8730o) interfaceC8737v).f20372a;
                boolean[] zArr3 = this.f20405y;
                if (!zArr3[i2]) {
                    throw new IllegalStateException();
                }
                this.f20402v--;
                zArr3[i2] = false;
                ((C8538g) this.f20395o.valueAt(i2)).m21056b();
                interfaceC8737vArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < abstractC8748bArr.length; i3++) {
            if (interfaceC8737vArr[i3] == null && (abstractC8748b = abstractC8748bArr[i3]) != null) {
                int[] iArr = abstractC8748b.f20436c;
                if (iArr.length != 1) {
                    throw new IllegalStateException();
                }
                if (iArr[0] != 0) {
                    throw new IllegalStateException();
                }
                C8741z c8741z = this.f20403w;
                C8740y c8740y = abstractC8748b.f20434a;
                int i4 = 0;
                while (true) {
                    if (i4 >= c8741z.f20426a) {
                        i4 = -1;
                        break;
                    }
                    if (c8741z.f20427b[i4] == c8740y) {
                        break;
                    }
                    i4++;
                }
                boolean[] zArr4 = this.f20405y;
                if (zArr4[i4]) {
                    throw new IllegalStateException();
                }
                this.f20402v++;
                zArr4[i4] = true;
                interfaceC8737vArr[i3] = new C8730o(this, i4);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f20400t) {
            int size = this.f20395o.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!this.f20405y[i5]) {
                    ((C8538g) this.f20395o.valueAt(i5)).m21056b();
                }
            }
        }
        if (this.f20402v == 0) {
            this.f20401u = false;
            if (this.f20389i.m21287a()) {
                this.f20389i.f20453b.m21318a(false);
            }
        } else if (!this.f20400t ? j != 0 : z) {
            j = mo21071a(j);
            for (int i6 = 0; i6 < interfaceC8737vArr.length; i6++) {
                if (interfaceC8737vArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f20400t = true;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: a */
    public final C8538g mo21092a(int i, int i2) {
        C8538g c8538g = (C8538g) this.f20395o.get(i);
        if (c8538g != null) {
            return c8538g;
        }
        C8538g c8538g2 = new C8538g(this.f20387g);
        c8538g2.f19189n = this;
        this.f20395o.put(i, c8538g2);
        return c8538g2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final C8741z mo21073a() {
        return this.f20403w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: a */
    public final void mo21093a(InterfaceC8628q interfaceC8628q) {
        this.f20397q = interfaceC8628q;
        this.f20394n.post(this.f20392l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: a */
    public final void mo21074a(InterfaceC8733r interfaceC8733r) {
        this.f20396p = interfaceC8733r;
        C8806e c8806e = this.f20391k;
        synchronized (c8806e) {
            if (!c8806e.f20616a) {
                c8806e.f20616a = true;
                c8806e.notifyAll();
            }
        }
        m21273i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21094a(InterfaceC8801z interfaceC8801z, long j, long j2) {
        C8728m c8728m = (C8728m) interfaceC8801z;
        if (this.f20375B == -1) {
            this.f20375B = c8728m.f20367i;
        }
        this.f20379F = true;
        if (this.f20404x == -9223372036854775807L) {
            int size = this.f20395o.size();
            long jMax = Long.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                jMax = Math.max(jMax, ((C8538g) this.f20395o.valueAt(i)).m21058d());
            }
            long j3 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f20404x = j3;
            this.f20386f.mo21207a(new C8739x(j3, j3, 0L, 0L, this.f20397q.mo21020a(), false), null);
        }
        C8672l c8672l = (C8672l) this.f20396p;
        c8672l.getClass();
        c8672l.f20182f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8799x
    /* JADX INFO: renamed from: a */
    public final void mo21095a(InterfaceC8801z interfaceC8801z, long j, long j2, boolean z) {
        C8728m c8728m = (C8728m) interfaceC8801z;
        if (this.f20375B == -1) {
            this.f20375B = c8728m.f20367i;
        }
        if (z || this.f20402v <= 0) {
            return;
        }
        int size = this.f20395o.size();
        for (int i = 0; i < size; i++) {
            ((C8538g) this.f20395o.valueAt(i)).m21054a(this.f20405y[i]);
        }
        C8672l c8672l = (C8672l) this.f20396p;
        c8672l.getClass();
        c8672l.f20182f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j
    /* JADX INFO: renamed from: b */
    public final void mo21096b() {
        this.f20398r = true;
        this.f20394n.post(this.f20392l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: b */
    public final boolean mo21075b(long j) {
        boolean z = false;
        if (this.f20379F || (this.f20399s && this.f20402v == 0)) {
            return false;
        }
        C8806e c8806e = this.f20391k;
        synchronized (c8806e) {
            if (!c8806e.f20616a) {
                c8806e.f20616a = true;
                c8806e.notifyAll();
                z = true;
            }
        }
        if (this.f20389i.m21287a()) {
            return z;
        }
        m21273i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: c */
    public final long mo21076c() {
        long jMax;
        if (this.f20379F) {
            return Long.MIN_VALUE;
        }
        long j = this.f20377D;
        if (j != -9223372036854775807L) {
            return j;
        }
        int i = 0;
        if (this.f20374A) {
            int size = this.f20395o.size();
            jMax = Long.MAX_VALUE;
            while (i < size) {
                if (this.f20406z[i]) {
                    jMax = Math.min(jMax, ((C8538g) this.f20395o.valueAt(i)).m21058d());
                }
                i++;
            }
        } else {
            int size2 = this.f20395o.size();
            jMax = Long.MIN_VALUE;
            while (i < size2) {
                jMax = Math.max(jMax, ((C8538g) this.f20395o.valueAt(i)).m21058d());
                i++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.f20376C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: d */
    public final void mo21077d() throws IOException {
        this.f20389i.m21288b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8531f
    /* JADX INFO: renamed from: e */
    public final void mo21032e() {
        this.f20394n.post(this.f20392l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8738w
    /* JADX INFO: renamed from: f */
    public final long mo21078f() {
        if (this.f20402v == 0) {
            return Long.MIN_VALUE;
        }
        return mo21076c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8734s
    /* JADX INFO: renamed from: g */
    public final long mo21079g() {
        if (!this.f20401u) {
            return -9223372036854775807L;
        }
        this.f20401u = false;
        return this.f20376C;
    }

    /* JADX INFO: renamed from: h */
    public final int m21272h() {
        int size = this.f20395o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C8530e c8530e = ((C8538g) this.f20395o.valueAt(i2)).f19178c;
            i += c8530e.f19142j + c8530e.f19141i;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final void m21273i() {
        InterfaceC8628q interfaceC8628q;
        C8728m c8728m = new C8728m(this, this.f20381a, this.f20382b, this.f20390j, this.f20391k);
        if (this.f20399s) {
            long j = this.f20377D;
            if (j == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j2 = this.f20404x;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f20379F = true;
                this.f20377D = -9223372036854775807L;
                return;
            }
            long jMo21019a = this.f20397q.mo21019a(j);
            long j3 = this.f20377D;
            c8728m.f20363e.f19793a = jMo21019a;
            c8728m.f20366h = j3;
            c8728m.f20365g = true;
            this.f20377D = -9223372036854775807L;
        }
        this.f20378E = m21272h();
        int i = this.f20383c;
        if (i == -1) {
            i = (this.f20399s && this.f20375B == -1 && ((interfaceC8628q = this.f20397q) == null || interfaceC8628q.mo21021c() == -9223372036854775807L)) ? 6 : 3;
        }
        int i2 = i;
        C8761b0 c8761b0 = this.f20389i;
        c8761b0.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        HandlerC8800y handlerC8800y = new HandlerC8800y(c8761b0, looperMyLooper, c8728m, this, i2, SystemClock.elapsedRealtime());
        if (c8761b0.f20453b != null) {
            throw new IllegalStateException();
        }
        c8761b0.f20453b = handlerC8800y;
        handlerC8800y.f20604e = null;
        c8761b0.f20452a.execute(handlerC8800y);
    }
}
