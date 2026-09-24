package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8633b0 implements InterfaceC8567i {

    /* JADX INFO: renamed from: l */
    public static final long f19889l = AbstractC8827z.m21379a("AC-3");

    /* JADX INFO: renamed from: m */
    public static final long f19890m = AbstractC8827z.m21379a("EAC3");

    /* JADX INFO: renamed from: n */
    public static final long f19891n = AbstractC8827z.m21379a("HEVC");

    /* JADX INFO: renamed from: a */
    public final int f19892a;

    /* JADX INFO: renamed from: b */
    public final List f19893b;

    /* JADX INFO: renamed from: c */
    public final C8815n f19894c;

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f19895d;

    /* JADX INFO: renamed from: e */
    public final C8638e f19896e;

    /* JADX INFO: renamed from: f */
    public final SparseArray f19897f;

    /* JADX INFO: renamed from: g */
    public final SparseBooleanArray f19898g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8568j f19899h;

    /* JADX INFO: renamed from: i */
    public int f19900i;

    /* JADX INFO: renamed from: j */
    public boolean f19901j;

    /* JADX INFO: renamed from: k */
    public InterfaceC8641f0 f19902k;

    public C8633b0(int i, C8823v c8823v, C8638e c8638e) {
        this.f19896e = c8638e;
        this.f19892a = i;
        if (i == 1 || i == 2) {
            this.f19893b = Collections.singletonList(c8823v);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f19893b = arrayList;
            arrayList.add(c8823v);
        }
        this.f19894c = new C8815n(940);
        this.f19898g = new SparseBooleanArray();
        this.f19897f = new SparseArray();
        this.f19895d = new SparseIntArray();
        m21170a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, EOFException {
        InterfaceC8641f0 interfaceC8641f0;
        int iMin;
        C8527b c8527b2;
        C8815n c8815n = this.f19894c;
        byte[] bArr = c8815n.f20643a;
        int i = c8815n.f20644b;
        if (940 - i < 188) {
            int i2 = c8815n.f20645c - i;
            if (i2 > 0) {
                System.arraycopy(bArr, i, bArr, 0, i2);
            }
            C8815n c8815n2 = this.f19894c;
            c8815n2.f20643a = bArr;
            c8815n2.f20645c = i2;
            c8815n2.f20644b = 0;
        }
        while (true) {
            C8815n c8815n3 = this.f19894c;
            int i3 = c8815n3.f20645c;
            int i4 = c8815n3.f20644b;
            if (i3 - i4 >= 188) {
                while (i4 < i3 && bArr[i4] != 71) {
                    i4++;
                }
                this.f19894c.m21347e(i4);
                int i5 = i4 + 188;
                if (i5 > i3) {
                    return 0;
                }
                int iM21340b = this.f19894c.m21340b();
                if ((8388608 & iM21340b) != 0) {
                    this.f19894c.m21347e(i5);
                    return 0;
                }
                boolean z = true;
                boolean z2 = (4194304 & iM21340b) != 0;
                int i6 = (2096896 & iM21340b) >> 8;
                boolean z3 = (iM21340b & 32) != 0;
                boolean z4 = (iM21340b & 16) != 0;
                if (this.f19892a != 2) {
                    int i7 = iM21340b & 15;
                    int i8 = this.f19895d.get(i6, i7 - 1);
                    this.f19895d.put(i6, i7);
                    if (i8 == i7) {
                        if (z4) {
                            this.f19894c.m21347e(i5);
                            return 0;
                        }
                    } else if (i7 == ((i8 + 1) & 15)) {
                    }
                    z = false;
                } else {
                    z = false;
                }
                if (z3) {
                    int iM21352j = this.f19894c.m21352j();
                    C8815n c8815n4 = this.f19894c;
                    c8815n4.m21347e(c8815n4.f20644b + iM21352j);
                }
                if (z4 && (interfaceC8641f0 = (InterfaceC8641f0) this.f19897f.get(i6)) != null) {
                    if (z) {
                        interfaceC8641f0.mo21176a();
                    }
                    this.f19894c.m21345d(i5);
                    interfaceC8641f0.mo21177a(this.f19894c, z2);
                    this.f19894c.m21345d(i3);
                }
                this.f19894c.m21347e(i5);
                return 0;
            }
            int i9 = 940 - i3;
            int i10 = c8527b.f19127f;
            if (i10 == 0) {
                iMin = 0;
            } else {
                iMin = Math.min(i10, i9);
                System.arraycopy(c8527b.f19125d, 0, bArr, i3, iMin);
                c8527b.m21026b(iMin);
            }
            if (iMin == 0) {
                c8527b2 = c8527b;
                iMin = c8527b2.m21022a(bArr, i3, i9, 0, true);
            } else {
                c8527b2 = c8527b;
            }
            if (iMin != -1) {
                c8527b2.f19124c += (long) iMin;
            }
            if (iMin == -1) {
                return -1;
            }
            this.f19894c.m21345d(i3 + iMin);
            c8527b = c8527b2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21170a() {
        this.f19898g.clear();
        this.f19897f.clear();
        this.f19896e.getClass();
        SparseArray sparseArray = new SparseArray();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.f19897f.put(sparseArray.keyAt(i), (InterfaceC8641f0) sparseArray.valueAt(i));
        }
        this.f19897f.put(0, new C8658w(new C8661z(this)));
        this.f19902k = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        int size = this.f19893b.size();
        for (int i = 0; i < size; i++) {
            ((C8823v) this.f19893b.get(i)).f20669c = -9223372036854775807L;
        }
        C8815n c8815n = this.f19894c;
        c8815n.f20644b = 0;
        c8815n.f20645c = 0;
        this.f19895d.clear();
        m21170a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19899h = interfaceC8568j;
        interfaceC8568j.mo21093a(new C8627p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) throws InterruptedException, EOFException {
        byte[] bArr = this.f19894c.f20643a;
        c8527b.m21025a(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 == 5) {
                    c8527b.m21023a(i);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }
}
