package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8709p;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8520c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8530e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C8556a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.RunnableC8563h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8721f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8722g;
import com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v;
import com.fyber.inneractive.sdk.player.exoplayer2.source.RunnableC8720e;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8550k implements InterfaceC8737v {

    /* JADX INFO: renamed from: a */
    public final int f19265a;

    /* JADX INFO: renamed from: b */
    public final C8553n f19266b;

    public C8550k(C8553n c8553n, int i) {
        this.f19266b = c8553n;
        this.f19265a = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final int mo21085a(C8709p c8709p, C8520c c8520c, boolean z) {
        C8553n c8553n = this.f19266b;
        int i = this.f19265a;
        if (c8553n.f19291x != -9223372036854775807L) {
            return -3;
        }
        loop0: while (c8553n.f19278k.size() > 1) {
            int i2 = ((C8547h) c8553n.f19278k.getFirst()).f19227j;
            for (int i3 = 0; i3 < c8553n.f19277j.size(); i3++) {
                if (c8553n.f19289v[i3]) {
                    C8530e c8530e = ((C8538g) c8553n.f19277j.valueAt(i3)).f19178c;
                    if ((c8530e.f19141i == 0 ? c8530e.f19150r : c8530e.f19134b[c8530e.f19143k]) == i2) {
                        break loop0;
                    }
                }
            }
            c8553n.f19278k.removeFirst();
        }
        C8547h c8547h = (C8547h) c8553n.f19278k.getFirst();
        C8708o c8708o = c8547h.f20335c;
        if (!c8708o.equals(c8553n.f19284q)) {
            C8721f c8721f = c8553n.f19275h;
            int i4 = c8553n.f19268a;
            int i5 = c8547h.f20336d;
            Object obj = c8547h.f20337e;
            long j = c8547h.f20338f;
            if (c8721f.f20351b != null) {
                c8721f.f20350a.post(new RunnableC8720e(c8721f, i4, c8708o, i5, obj, j));
            }
        }
        c8553n.f19284q = c8708o;
        return ((C8538g) c8553n.f19277j.valueAt(i)).m21047a(c8709p, c8520c, z, c8553n.f19292y, c8553n.f19290w);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final void mo21086a() throws IOException {
        C8553n c8553n = this.f19266b;
        c8553n.f19274g.m21288b();
        C8545f c8545f = c8553n.f19270c;
        C8722g c8722g = c8545f.f19213j;
        if (c8722g != null) {
            throw c8722g;
        }
        C8556a c8556a = c8545f.f19214k;
        if (c8556a != null) {
            RunnableC8563h runnableC8563h = (RunnableC8563h) c8545f.f19208e.f19372d.get(c8556a);
            runnableC8563h.f19359b.m21288b();
            IOException iOException = runnableC8563h.f19367j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final void mo21087a(long j) {
        C8553n c8553n = this.f19266b;
        C8538g c8538g = (C8538g) c8553n.f19277j.valueAt(this.f19265a);
        if (!c8553n.f19292y || j <= c8538g.m21058d()) {
            c8538g.m21055a(true, j);
        } else {
            c8538g.m21060f();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    public final boolean isReady() {
        boolean z;
        C8553n c8553n = this.f19266b;
        int i = this.f19265a;
        if (!c8553n.f19292y) {
            if (c8553n.f19291x == -9223372036854775807L) {
                C8530e c8530e = ((C8538g) c8553n.f19277j.valueAt(i)).f19178c;
                synchronized (c8530e) {
                    z = c8530e.f19141i == 0;
                }
                if (!z) {
                }
            }
            return false;
        }
        return true;
    }
}
