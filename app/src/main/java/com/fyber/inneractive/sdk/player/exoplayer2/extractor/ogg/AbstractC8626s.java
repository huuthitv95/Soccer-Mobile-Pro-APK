package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.s */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8626s {
    /* JADX INFO: renamed from: a */
    public static C8625r m21161a(C8815n c8815n) throws C8711r {
        m21162a(1, c8815n, false);
        c8815n.m21346e();
        int iM21352j = c8815n.m21352j();
        long jM21346e = c8815n.m21346e();
        c8815n.m21344d();
        int iM21344d = c8815n.m21344d();
        c8815n.m21344d();
        int iM21352j2 = c8815n.m21352j();
        int iPow = (int) Math.pow(2.0d, iM21352j2 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM21352j2 & 240) >> 4);
        c8815n.m21352j();
        return new C8625r(iM21352j, jM21346e, iM21344d, iPow, iPow2, Arrays.copyOf(c8815n.f20643a, c8815n.f20645c));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21162a(int i, C8815n c8815n, boolean z) throws C8711r {
        if (c8815n.f20645c - c8815n.f20644b < 7) {
            if (z) {
                return false;
            }
            throw new C8711r("too short header: " + (c8815n.f20645c - c8815n.f20644b));
        }
        if (c8815n.m21352j() != i) {
            if (z) {
                return false;
            }
            throw new C8711r("expected header type " + Integer.toHexString(i));
        }
        if (c8815n.m21352j() == 118 && c8815n.m21352j() == 111 && c8815n.m21352j() == 114 && c8815n.m21352j() == 98 && c8815n.m21352j() == 105 && c8815n.m21352j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new C8711r("expected characters 'vorbis'");
    }
}
