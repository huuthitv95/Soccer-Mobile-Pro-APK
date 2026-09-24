package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8805d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8532a extends AbstractC8536e {

    /* JADX INFO: renamed from: e */
    public static final int[] f19151e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f19152b;

    /* JADX INFO: renamed from: c */
    public boolean f19153c;

    /* JADX INFO: renamed from: d */
    public int f19154d;

    public C8532a(InterfaceC8629r interfaceC8629r) {
        super(interfaceC8629r);
    }

    /* JADX INFO: renamed from: a */
    public final void m21033a(C8815n c8815n, long j) {
        if (this.f19154d == 2) {
            int i = c8815n.f20645c - c8815n.f20644b;
            this.f19170a.mo21049a(i, c8815n);
            this.f19170a.mo21051a(j, 1, i, 0, null);
            return;
        }
        int iM21352j = c8815n.m21352j();
        if (iM21352j != 0 || this.f19153c) {
            if (this.f19154d != 10 || iM21352j == 1) {
                int i2 = c8815n.f20645c - c8815n.f20644b;
                this.f19170a.mo21049a(i2, c8815n);
                this.f19170a.mo21051a(j, 1, i2, 0, null);
                return;
            }
            return;
        }
        int i3 = c8815n.f20645c - c8815n.f20644b;
        byte[] bArr = new byte[i3];
        c8815n.m21339a(bArr, 0, i3);
        Pair pairM21322a = AbstractC8805d.m21322a(bArr);
        this.f19170a.mo21053a(C8708o.m21263a(null, "audio/mp4a-latm", -1, -1, ((Integer) pairM21322a.second).intValue(), ((Integer) pairM21322a.first).intValue(), Collections.singletonList(bArr), null, null));
        this.f19153c = true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21034a(C8815n c8815n) throws C8535d {
        if (this.f19152b) {
            c8815n.m21347e(c8815n.f20644b + 1);
        } else {
            int iM21352j = c8815n.m21352j();
            int i = (iM21352j >> 4) & 15;
            this.f19154d = i;
            if (i == 2) {
                this.f19170a.mo21053a(C8708o.m21263a(null, "audio/mpeg", -1, -1, 1, f19151e[(iM21352j >> 2) & 3], null, null, null));
                this.f19153c = true;
            } else if (i == 7 || i == 8) {
                this.f19170a.mo21053a(C8708o.m21262a(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (iM21352j & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.f19153c = true;
            } else if (i != 10) {
                throw new C8535d("Audio format not supported: " + this.f19154d);
            }
            this.f19152b = true;
        }
        return true;
    }
}
