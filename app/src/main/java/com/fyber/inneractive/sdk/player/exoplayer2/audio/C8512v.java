package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C8512v implements InterfaceC8493c {

    /* JADX INFO: renamed from: b */
    public int f19045b = -1;

    /* JADX INFO: renamed from: c */
    public int f19046c = -1;

    /* JADX INFO: renamed from: d */
    public int f19047d = 0;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f19048e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f19049f;

    /* JADX INFO: renamed from: g */
    public boolean f19050g;

    public C8512v() {
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19048e = byteBuffer;
        this.f19049f = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo20976a() {
        ByteBuffer byteBuffer = this.f19049f;
        this.f19049f = InterfaceC8493c.f18943a;
        return byteBuffer;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[ADDED_TO_REGION, LOOP:0: B:19:0x0047->B:20:0x0049, LOOP_START, PHI: r0
  0x0047: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0045, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049 A[LOOP:0: B:19:0x0047->B:20:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[ADDED_TO_REGION, LOOP:1: B:23:0x0068->B:24:0x006a, LOOP_START, PHI: r0
  0x0068: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0043, B:24:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:23:0x0068->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
  0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0083 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_END] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final void mo20977a(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - iPosition;
        int i4 = this.f19047d;
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 3) {
                if (i4 != 1073741824) {
                    throw new IllegalStateException();
                }
                i = i3 / 2;
            }
            if (this.f19048e.capacity() < i) {
                this.f19048e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
            } else {
                this.f19048e.clear();
            }
            i2 = this.f19047d;
            if (i2 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f19048e.put(byteBuffer.get(iPosition + 1));
                    this.f19048e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i2 != 3) {
                while (iPosition < iLimit) {
                    this.f19048e.put((byte) 0);
                    this.f19048e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else {
                if (i2 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f19048e.put(byteBuffer.get(iPosition + 2));
                    this.f19048e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f19048e.flip();
            this.f19049f = this.f19048e;
        }
        i3 /= 3;
        i = i3 * 2;
        if (this.f19048e.capacity() < i) {
            this.f19048e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f19048e.clear();
        }
        i2 = this.f19047d;
        if (i2 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f19048e.put(byteBuffer.get(iPosition + 1));
                this.f19048e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i2 != 3) {
            while (iPosition < iLimit) {
                this.f19048e.put((byte) 0);
                this.f19048e.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else {
            if (i2 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f19048e.put(byteBuffer.get(iPosition + 2));
                this.f19048e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f19048e.flip();
        this.f19049f = this.f19048e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: a */
    public final boolean mo20978a(int i, int i2, int i3) throws C8492b {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C8492b(i, i2, i3);
        }
        if (this.f19045b == i && this.f19046c == i2 && this.f19047d == i3) {
            return false;
        }
        this.f19045b = i;
        this.f19046c = i2;
        this.f19047d = i3;
        if (i3 != 2) {
            return true;
        }
        this.f19048e = InterfaceC8493c.f18943a;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: b */
    public final void mo20979b() {
        this.f19050g = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: c */
    public final boolean mo20980c() {
        return this.f19050g && this.f19049f == InterfaceC8493c.f18943a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: d */
    public final boolean mo20981d() {
        int i = this.f19047d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: e */
    public final int mo20982e() {
        return this.f19046c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    /* JADX INFO: renamed from: f */
    public final void mo20983f() {
        ByteBuffer byteBuffer = InterfaceC8493c.f18943a;
        this.f19049f = byteBuffer;
        this.f19050g = false;
        this.f19048e = byteBuffer;
        this.f19045b = -1;
        this.f19046c = -1;
        this.f19047d = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.InterfaceC8493c
    public final void flush() {
        this.f19049f = InterfaceC8493c.f18943a;
        this.f19050g = false;
    }
}
