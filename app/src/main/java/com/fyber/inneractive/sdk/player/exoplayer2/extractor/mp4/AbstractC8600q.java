package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.q */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8600q {
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX INFO: renamed from: a */
    public static UUID m21143a(byte[] bArr) {
        Pair pairCreate;
        C8815n c8815n = new C8815n(bArr);
        if (c8815n.f20645c < 32) {
            pairCreate = null;
        } else {
            c8815n.m21347e(0);
            if (c8815n.m21340b() == (c8815n.f20645c - c8815n.f20644b) + 4 && c8815n.m21340b() == AbstractC8586c.f19564V) {
                int iM21340b = (c8815n.m21340b() >> 24) & 255;
                if (iM21340b > 1) {
                    Log.w("PsshAtomUtil", "Unsupported pssh version: " + iM21340b);
                } else {
                    UUID uuid = new UUID(c8815n.m21349g(), c8815n.m21349g());
                    if (iM21340b == 1) {
                        c8815n.m21347e(c8815n.f20644b + (c8815n.m21355m() * 16));
                    }
                    int iM21355m = c8815n.m21355m();
                    if (iM21355m == c8815n.f20645c - c8815n.f20644b) {
                        byte[] bArr2 = new byte[iM21355m];
                        c8815n.m21339a(bArr2, 0, iM21355m);
                        pairCreate = Pair.create(uuid, bArr2);
                    }
                }
                pairCreate = null;
            } else {
                pairCreate = null;
            }
        }
        if (pairCreate == null) {
            return null;
        }
        return (UUID) pairCreate.first;
    }
}
