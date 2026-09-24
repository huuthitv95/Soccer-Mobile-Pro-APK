package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.x */
/* JADX INFO: loaded from: classes4.dex */
public final class C8514x implements InterfaceC8493c {

    /* JADX INFO: renamed from: d */
    public C8513w f19077d;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f19080g;

    /* JADX INFO: renamed from: h */
    public ShortBuffer f19081h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f19082i;

    /* JADX INFO: renamed from: j */
    public long f19083j;

    /* JADX INFO: renamed from: k */
    public long f19084k;

    /* JADX INFO: renamed from: l */
    public boolean f19085l;

    /* JADX INFO: renamed from: e */
    public float f19078e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f19079f = 1.0f;

    /* JADX INFO: renamed from: b */
    public int f19075b = -1;

    /* JADX INFO: renamed from: c */
    public int f19076c = -1;

    public C8514x() {
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19080g = byteBuffer;
        this.f19081h = byteBuffer.asShortBuffer();
        this.f19082i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo20976a() {
        ByteBuffer byteBuffer = this.f19082i;
        this.f19082i = InterfaceC8493c.f18943a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final void mo20977a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f19083j += (long) iRemaining;
            C8513w c8513w = this.f19077d;
            c8513w.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = c8513w.f19052b;
            int i2 = iRemaining2 / i;
            c8513w.m21009a(i2);
            shortBufferAsShortBuffer.get(c8513w.f19058h, c8513w.f19067q * c8513w.f19052b, ((i * i2) * 2) / 2);
            c8513w.f19067q += i2;
            c8513w.m21008a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i3 = this.f19077d.f19068r * this.f19075b * 2;
        if (i3 > 0) {
            if (this.f19080g.capacity() < i3) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f19080g = byteBufferOrder;
                this.f19081h = byteBufferOrder.asShortBuffer();
            } else {
                this.f19080g.clear();
                this.f19081h.clear();
            }
            C8513w c8513w2 = this.f19077d;
            ShortBuffer shortBuffer = this.f19081h;
            c8513w2.getClass();
            int iMin = Math.min(shortBuffer.remaining() / c8513w2.f19052b, c8513w2.f19068r);
            shortBuffer.put(c8513w2.f19060j, 0, c8513w2.f19052b * iMin);
            int i4 = c8513w2.f19068r - iMin;
            c8513w2.f19068r = i4;
            short[] sArr = c8513w2.f19060j;
            int i5 = c8513w2.f19052b;
            System.arraycopy(sArr, iMin * i5, sArr, 0, i4 * i5);
            this.f19084k += (long) i3;
            this.f19080g.limit(i3);
            this.f19082i = this.f19080g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final boolean mo20978a(int i, int i2, int i3) throws C8492b {
        if (i3 != 2) {
            throw new C8492b(i, i2, i3);
        }
        if (this.f19076c == i && this.f19075b == i2) {
            return false;
        }
        this.f19076c = i;
        this.f19075b = i2;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: b */
    public final void mo20979b() {
        int i;
        C8513w c8513w = this.f19077d;
        int i2 = c8513w.f19067q;
        float f = c8513w.f19065o;
        float f2 = c8513w.f19066p;
        int i3 = c8513w.f19068r + ((int) ((((i2 / (f / f2)) + c8513w.f19069s) / f2) + 0.5f));
        c8513w.m21009a((c8513w.f19055e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = c8513w.f19055e * 2;
            int i5 = c8513w.f19052b;
            if (i4 >= i * i5) {
                break;
            }
            c8513w.f19058h[(i5 * i2) + i4] = 0;
            i4++;
        }
        c8513w.f19067q = i + c8513w.f19067q;
        c8513w.m21008a();
        if (c8513w.f19068r > i3) {
            c8513w.f19068r = i3;
        }
        c8513w.f19067q = 0;
        c8513w.f19070t = 0;
        c8513w.f19069s = 0;
        this.f19085l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: c */
    public final boolean mo20980c() {
        if (!this.f19085l) {
            return false;
        }
        C8513w c8513w = this.f19077d;
        return c8513w == null || c8513w.f19068r == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: d */
    public final boolean mo20981d() {
        return Math.abs(this.f19078e - 1.0f) >= 0.01f || Math.abs(this.f19079f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: e */
    public final int mo20982e() {
        return this.f19075b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: f */
    public final void mo20983f() {
        this.f19077d = null;
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19080g = byteBuffer;
        this.f19081h = byteBuffer.asShortBuffer();
        this.f19082i = byteBuffer;
        this.f19075b = -1;
        this.f19076c = -1;
        this.f19083j = 0L;
        this.f19084k = 0L;
        this.f19085l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    public final void flush() {
        C8513w c8513w = new C8513w(this.f19076c, this.f19075b);
        this.f19077d = c8513w;
        c8513w.f19065o = this.f19078e;
        c8513w.f19066p = this.f19079f;
        this.f19082i = InterfaceC8493c.f18943a;
        this.f19083j = 0L;
        this.f19084k = 0L;
        this.f19085l = false;
    }
}
