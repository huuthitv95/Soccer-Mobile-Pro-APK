package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C8709p;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C8520c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8530e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8730o implements InterfaceC8737v {

    /* JADX INFO: renamed from: a */
    public final int f20372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8731p f20373b;

    public C8730o(C8731p c8731p, int i) {
        this.f20373b = c8731p;
        this.f20372a = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final int mo21085a(C8709p c8709p, C8520c c8520c, boolean z) {
        C8731p c8731p = this.f20373b;
        int i = this.f20372a;
        if (c8731p.f20401u || c8731p.f20377D != -9223372036854775807L) {
            return -3;
        }
        return ((C8538g) c8731p.f20395o.valueAt(i)).m21047a(c8709p, c8520c, z, c8731p.f20379F, c8731p.f20376C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final void mo21086a() throws IOException {
        this.f20373b.f20389i.m21288b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    /* JADX INFO: renamed from: a */
    public final void mo21087a(long j) {
        C8731p c8731p = this.f20373b;
        C8538g c8538g = (C8538g) c8731p.f20395o.valueAt(this.f20372a);
        if (!c8731p.f20379F || j <= c8538g.m21058d()) {
            c8538g.m21055a(true, j);
        } else {
            c8538g.m21060f();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.InterfaceC8737v
    public final boolean isReady() {
        boolean z;
        C8731p c8731p = this.f20373b;
        int i = this.f20372a;
        if (!c8731p.f20379F) {
            if (c8731p.f20377D == -9223372036854775807L) {
                C8530e c8530e = ((C8538g) c8731p.f20395o.valueAt(i)).f19178c;
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
