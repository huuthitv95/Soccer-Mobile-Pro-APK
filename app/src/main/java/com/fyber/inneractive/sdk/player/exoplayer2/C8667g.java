package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8748b;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8755i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8750d;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C8754h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.ironsource.C11744X3;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C8667g {

    /* JADX INFO: renamed from: a */
    public final AbstractC8755i f20126a;

    /* JADX INFO: renamed from: b */
    public final C8754h f20127b;

    /* JADX INFO: renamed from: c */
    public final HandlerC8666f f20128c;

    /* JADX INFO: renamed from: d */
    public final C8672l f20129d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet f20130e;

    /* JADX INFO: renamed from: f */
    public final C8844w f20131f;

    /* JADX INFO: renamed from: g */
    public final C8828v f20132g;

    /* JADX INFO: renamed from: h */
    public boolean f20133h;

    /* JADX INFO: renamed from: i */
    public boolean f20134i;

    /* JADX INFO: renamed from: j */
    public int f20135j;

    /* JADX INFO: renamed from: k */
    public int f20136k;

    /* JADX INFO: renamed from: l */
    public int f20137l;

    /* JADX INFO: renamed from: m */
    public AbstractC8845x f20138m;

    /* JADX INFO: renamed from: n */
    public Object f20139n;

    /* JADX INFO: renamed from: o */
    public C8754h f20140o;

    /* JADX INFO: renamed from: p */
    public C8712s f20141p;

    /* JADX INFO: renamed from: q */
    public C8669i f20142q;

    /* JADX INFO: renamed from: r */
    public int f20143r;

    /* JADX INFO: renamed from: s */
    public long f20144s;

    public C8667g(AbstractC8490a[] abstractC8490aArr, C8750d c8750d, C8516c c8516c) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + AbstractC8827z.f20675e + C11744X3.j.f26440e);
        if (abstractC8490aArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f20126a = c8750d;
        this.f20134i = false;
        this.f20135j = 1;
        this.f20130e = new CopyOnWriteArraySet();
        C8754h c8754h = new C8754h(new AbstractC8748b[abstractC8490aArr.length]);
        this.f20127b = c8754h;
        this.f20138m = AbstractC8845x.f20771a;
        this.f20131f = new C8844w();
        this.f20132g = new C8828v();
        int i = C8741z.f20425d;
        this.f20140o = c8754h;
        this.f20141p = C8712s.f20317d;
        HandlerC8666f handlerC8666f = new HandlerC8666f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f20128c = handlerC8666f;
        C8669i c8669i = new C8669i(0, 0L);
        this.f20142q = c8669i;
        this.f20129d = new C8672l(abstractC8490aArr, c8750d, c8516c, this.f20134i, handlerC8666f, c8669i, this);
    }

    /* JADX INFO: renamed from: a */
    public final int m21188a() {
        return (this.f20138m.m21395c() || this.f20136k > 0) ? this.f20143r : this.f20138m.mo21276a(this.f20142q.f20164a, this.f20132g, false).f20681c;
    }

    /* JADX INFO: renamed from: a */
    public final void m21189a(int i, long j) {
        long j2;
        if (i < 0 || (!this.f20138m.m21395c() && i >= this.f20138m.mo21278b())) {
            throw new C8710q();
        }
        this.f20136k++;
        this.f20143r = i;
        if (this.f20138m.m21395c()) {
            j2 = 1000;
        } else {
            this.f20138m.mo21277a(i, this.f20131f, 0L);
            long j3 = j == -9223372036854775807L ? this.f20131f.f20768e : j;
            C8844w c8844w = this.f20131f;
            int i2 = c8844w.f20766c;
            long j4 = c8844w.f20770g;
            int i3 = AbstractC8515b.f19086a;
            long j5 = (j3 == -9223372036854775807L ? -9223372036854775807L : j3 * 1000) + j4;
            j2 = 1000;
            long j6 = this.f20138m.mo21276a(i2, this.f20132g, false).f20682d;
            while (j6 != -9223372036854775807L && j5 >= j6 && i2 < this.f20131f.f20767d) {
                j5 -= j6;
                i2++;
                j6 = this.f20138m.mo21276a(i2, this.f20132g, false).f20682d;
            }
        }
        if (j == -9223372036854775807L) {
            this.f20144s = 0L;
            this.f20129d.f20182f.obtainMessage(3, new C8670j(this.f20138m, i, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f20144s = j;
        C8672l c8672l = this.f20129d;
        AbstractC8845x abstractC8845x = this.f20138m;
        int i4 = AbstractC8515b.f19086a;
        c8672l.f20182f.obtainMessage(3, new C8670j(abstractC8845x, i, j != -9223372036854775807L ? j * j2 : -9223372036854775807L)).sendToTarget();
        Iterator it = this.f20130e.iterator();
        while (it.hasNext()) {
            ((C8456b0) it.next()).getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21190a(boolean z) {
        if (this.f20134i != z) {
            this.f20134i = z;
            this.f20129d.f20182f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f20130e.iterator();
            while (it.hasNext()) {
                ((C8456b0) it.next()).m20855a(this.f20135j, z);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21191a(C8525e... c8525eArr) {
        C8672l c8672l = this.f20129d;
        if (c8672l.f20193q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            c8672l.f20182f.obtainMessage(11, c8525eArr).sendToTarget();
        }
    }
}
