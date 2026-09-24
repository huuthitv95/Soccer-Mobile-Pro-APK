package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.s */
/* JADX INFO: loaded from: classes9.dex */
public final class C8509s implements InterfaceC8493c {

    /* JADX INFO: renamed from: b */
    public int f19033b;

    /* JADX INFO: renamed from: c */
    public int f19034c;

    /* JADX INFO: renamed from: d */
    public int[] f19035d;

    /* JADX INFO: renamed from: e */
    public boolean f19036e;

    /* JADX INFO: renamed from: f */
    public int[] f19037f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f19038g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f19039h;

    /* JADX INFO: renamed from: i */
    public boolean f19040i;

    public C8509s() {
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19038g = byteBuffer;
        this.f19039h = byteBuffer;
        this.f19033b = -1;
        this.f19034c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo20976a() {
        ByteBuffer byteBuffer = this.f19039h;
        this.f19039h = InterfaceC8493c.f18943a;
        return byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final void mo20977a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int length = ((iLimit - iPosition) / (this.f19033b * 2)) * this.f19037f.length * 2;
        if (this.f19038g.capacity() < length) {
            this.f19038g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f19038g.clear();
        }
        while (iPosition < iLimit) {
            for (int i : this.f19037f) {
                this.f19038g.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f19033b * 2;
        }
        byteBuffer.position(iLimit);
        this.f19038g.flip();
        this.f19039h = this.f19038g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final boolean mo20978a(int i, int i2, int i3) throws C8492b {
        boolean zEquals = Arrays.equals(this.f19035d, this.f19037f);
        boolean z = !zEquals;
        int[] iArr = this.f19035d;
        this.f19037f = iArr;
        if (iArr == null) {
            this.f19036e = false;
            return z;
        }
        if (i3 != 2) {
            throw new C8492b(i, i2, i3);
        }
        if (zEquals && this.f19034c == i && this.f19033b == i2) {
            return false;
        }
        this.f19034c = i;
        this.f19033b = i2;
        this.f19036e = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f19037f;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new C8492b(i, i2, i3);
            }
            this.f19036e = (i5 != i4) | this.f19036e;
            i4++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: b */
    public final void mo20979b() {
        this.f19040i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: c */
    public final boolean mo20980c() {
        return this.f19040i && this.f19039h == InterfaceC8493c.f18943a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: d */
    public final boolean mo20981d() {
        return this.f19036e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: e */
    public final int mo20982e() {
        int[] iArr = this.f19037f;
        return iArr == null ? this.f19033b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: f */
    public final void mo20983f() {
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19039h = byteBuffer;
        this.f19040i = false;
        this.f19038g = byteBuffer;
        this.f19033b = -1;
        this.f19034c = -1;
        this.f19037f = null;
        this.f19036e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    public final void flush() {
        this.f19039h = InterfaceC8493c.f18943a;
        this.f19040i = false;
    }
}
