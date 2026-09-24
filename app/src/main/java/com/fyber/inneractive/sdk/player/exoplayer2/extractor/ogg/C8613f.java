package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8613f {

    /* JADX INFO: renamed from: a */
    public final C8614g f19815a = new C8614g();

    /* JADX INFO: renamed from: b */
    public final C8815n f19816b = new C8815n(0, new byte[65025]);

    /* JADX INFO: renamed from: c */
    public int f19817c = -1;

    /* JADX INFO: renamed from: d */
    public int f19818d;

    /* JADX INFO: renamed from: e */
    public boolean f19819e;

    /* JADX INFO: renamed from: a */
    public final void m21154a() {
        C8815n c8815n = this.f19816b;
        byte[] bArr = c8815n.f20643a;
        if (bArr.length == 65025) {
            return;
        }
        c8815n.f20643a = Arrays.copyOf(bArr, Math.max(65025, c8815n.f20645c));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21155a(C8527b c8527b) throws InterruptedException, EOFException {
        int i;
        int i2;
        int i3;
        if (this.f19819e) {
            this.f19819e = false;
            C8815n c8815n = this.f19816b;
            c8815n.f20644b = 0;
            c8815n.f20645c = 0;
        }
        while (true) {
            if (this.f19819e) {
                return true;
            }
            if (this.f19817c < 0) {
                if (!this.f19815a.m21156a(c8527b, true)) {
                    return false;
                }
                C8614g c8614g = this.f19815a;
                int i4 = c8614g.f19824d;
                if ((c8614g.f19821a & 1) == 1 && this.f19816b.f20645c == 0) {
                    this.f19818d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f19818d;
                        C8614g c8614g2 = this.f19815a;
                        if (i6 >= c8614g2.f19823c) {
                            break;
                        }
                        int[] iArr = c8614g2.f19826f;
                        this.f19818d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f19818d;
                } else {
                    i2 = 0;
                }
                c8527b.m21023a(i4);
                this.f19817c = i2;
            }
            int i7 = this.f19817c;
            this.f19818d = 0;
            int i8 = 0;
            do {
                int i9 = this.f19818d;
                int i10 = i7 + i9;
                C8614g c8614g3 = this.f19815a;
                if (i10 >= c8614g3.f19823c) {
                    break;
                }
                int[] iArr2 = c8614g3.f19826f;
                this.f19818d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.f19817c + this.f19818d;
            if (i8 > 0) {
                int iM21337a = this.f19816b.m21337a();
                C8815n c8815n2 = this.f19816b;
                int i12 = c8815n2.f20645c + i8;
                if (iM21337a < i12) {
                    c8815n2.f20643a = Arrays.copyOf(c8815n2.f20643a, i12);
                }
                C8815n c8815n3 = this.f19816b;
                c8527b.m21027b(c8815n3.f20643a, c8815n3.f20645c, i8, false);
                C8815n c8815n4 = this.f19816b;
                c8815n4.m21345d(c8815n4.f20645c + i8);
                this.f19819e = this.f19815a.f19826f[i11 + (-1)] != 255;
            }
            if (i11 == this.f19815a.f19823c) {
                i11 = -1;
            }
            this.f19817c = i11;
        }
    }
}
