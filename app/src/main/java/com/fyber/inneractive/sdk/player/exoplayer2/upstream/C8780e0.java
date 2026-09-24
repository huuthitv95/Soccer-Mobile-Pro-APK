package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C8765b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C8766c;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8780e0 implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f20529a;

    /* JADX INFO: renamed from: b */
    public final C8766c f20530b;

    public C8780e0(InterfaceC8783h interfaceC8783h, C8766c c8766c) {
        interfaceC8783h.getClass();
        this.f20529a = interfaceC8783h;
        c8766c.getClass();
        this.f20530b = c8766c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws C8765b {
        long jMo20829a = this.f20529a.mo20829a(c8786k);
        if (c8786k.f20548d == -1 && jMo20829a != -1) {
            c8786k = new C8786k(c8786k.f20545a, c8786k.f20546b, c8786k.f20547c, jMo20829a, c8786k.f20549e, c8786k.f20550f);
        }
        C8766c c8766c = this.f20530b;
        c8766c.getClass();
        if (c8786k.f20548d == -1 && (c8786k.f20550f & 2) != 2) {
            c8766c.f20458d = null;
            return jMo20829a;
        }
        c8766c.f20458d = c8786k;
        c8766c.f20463i = 0L;
        try {
            c8766c.m21290b();
            return jMo20829a;
        } catch (IOException e) {
            throw new C8765b(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f20529a.mo20830a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() throws C8765b {
        try {
            this.f20529a.close();
            C8766c c8766c = this.f20530b;
            if (c8766c.f20458d == null) {
                return;
            }
            try {
                c8766c.m21289a();
            } catch (IOException e) {
                throw new C8765b(e);
            }
        } catch (Throwable th) {
            C8766c c8766c2 = this.f20530b;
            if (c8766c2.f20458d != null) {
                try {
                    c8766c2.m21289a();
                } catch (IOException e2) {
                    throw new C8765b(e2);
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws C8765b {
        int i3 = this.f20529a.read(bArr, i, i2);
        if (i3 > 0) {
            C8766c c8766c = this.f20530b;
            if (c8766c.f20458d != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (c8766c.f20462h == c8766c.f20456b) {
                            c8766c.m21289a();
                            c8766c.m21290b();
                        }
                        int iMin = (int) Math.min(i3 - i4, c8766c.f20456b - c8766c.f20462h);
                        c8766c.f20460f.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        c8766c.f20462h += j;
                        c8766c.f20463i += j;
                    } catch (IOException e) {
                        throw new C8765b(e);
                    }
                }
            }
        }
        return i3;
    }
}
