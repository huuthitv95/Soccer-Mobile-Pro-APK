package com.fyber.inneractive.sdk.player.exoplayer2.text.cea;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8744a {
    /* JADX INFO: renamed from: a */
    public static void m21280a(long j, C8815n c8815n, InterfaceC8629r[] interfaceC8629rArr) {
        int i;
        int iM21352j;
        while (c8815n.f20645c - c8815n.f20644b > 1) {
            int i2 = 0;
            while (true) {
                if (c8815n.f20645c - c8815n.f20644b == 0) {
                    i = -1;
                    break;
                }
                int iM21352j2 = c8815n.m21352j();
                i2 += iM21352j2;
                if (iM21352j2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c8815n.f20645c - c8815n.f20644b == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM21352j = c8815n.m21352j();
                    i3 += iM21352j;
                }
            } while (iM21352j == 255);
            if (i3 != -1) {
                int i4 = c8815n.f20645c;
                int i5 = c8815n.f20644b;
                if (i3 <= i4 - i5) {
                    if (i == 4 && i3 >= 8) {
                        int iM21352j3 = c8815n.m21352j();
                        int iM21357o = c8815n.m21357o();
                        int iM21340b = c8815n.m21340b();
                        int iM21352j4 = c8815n.m21352j();
                        c8815n.m21347e(i5);
                        if (iM21352j3 == 181 && iM21357o == 49 && iM21340b == 1195456820 && iM21352j4 == 3) {
                            c8815n.m21347e(c8815n.f20644b + 8);
                            int iM21352j5 = c8815n.m21352j() & 31;
                            c8815n.m21347e(c8815n.f20644b + 1);
                            int i6 = iM21352j5 * 3;
                            int i7 = c8815n.f20644b;
                            for (InterfaceC8629r interfaceC8629r : interfaceC8629rArr) {
                                c8815n.m21347e(i7);
                                interfaceC8629r.mo21049a(i6, c8815n);
                                interfaceC8629r.mo21051a(j, 1, i6, 0, null);
                            }
                            c8815n.m21347e(c8815n.f20644b + (i3 - (i6 + 10)));
                        }
                    }
                    c8815n.m21347e(c8815n.f20644b + i3);
                }
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            c8815n.m21347e(c8815n.f20645c);
        }
    }
}
