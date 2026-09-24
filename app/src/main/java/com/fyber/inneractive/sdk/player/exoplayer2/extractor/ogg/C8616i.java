package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8616i extends AbstractC8619l {

    /* JADX INFO: renamed from: o */
    public static final int f19828o = AbstractC8827z.m21379a("Opus");

    /* JADX INFO: renamed from: p */
    public static final byte[] f19829p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: n */
    public boolean f19830n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final long mo21151a(C8815n c8815n) {
        int i;
        int i2;
        byte[] bArr = c8815n.f20643a;
        byte b = bArr[0];
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return (((long) this.f19841i) * ((long) (i * i2))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final void mo21152a(boolean z) {
        super.mo21152a(z);
        if (z) {
            this.f19830n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final boolean mo21153a(C8815n c8815n, long j, C8617j c8617j) {
        if (this.f19830n) {
            boolean z = c8815n.m21340b() == f19828o;
            c8815n.m21347e(0);
            return z;
        }
        byte[] bArrCopyOf = Arrays.copyOf(c8815n.f20643a, c8815n.f20645c);
        int i = bArrCopyOf[9] & 255;
        int i2 = ((bArrCopyOf[11] & 255) << 8) | (bArrCopyOf[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArrCopyOf);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i2) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) 3840) * 1000000000) / 48000).array());
        c8617j.f19831a = C8708o.m21263a(null, "audio/opus", -1, -1, i, 48000, arrayList, null, null);
        this.f19830n = true;
        return true;
    }
}
