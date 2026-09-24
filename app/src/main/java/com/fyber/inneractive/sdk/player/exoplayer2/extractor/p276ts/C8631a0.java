package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8814m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8631a0 implements InterfaceC8657v {

    /* JADX INFO: renamed from: a */
    public final C8814m f19872a = new C8814m(new byte[5]);

    /* JADX INFO: renamed from: b */
    public final SparseArray f19873b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f19874c = new SparseIntArray();

    /* JADX INFO: renamed from: d */
    public final int f19875d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8633b0 f19876e;

    public C8631a0(C8633b0 c8633b0, int i) {
        this.f19876e = c8633b0;
        this.f19875d = i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21163a(C8815n c8815n) {
        C8823v c8823v;
        char c;
        InterfaceC8641f0 interfaceC8641f0M21171a;
        int i;
        int i2;
        int i3;
        if (c8815n.m21352j() != 2) {
            return;
        }
        C8633b0 c8633b0 = this.f19876e;
        int i4 = c8633b0.f19892a;
        int i5 = 0;
        if (i4 == 1 || i4 == 2 || c8633b0.f19900i == 1) {
            c8823v = (C8823v) c8633b0.f19893b.get(0);
        } else {
            c8823v = new C8823v(((C8823v) c8633b0.f19893b.get(0)).f20667a);
            this.f19876e.f19893b.add(c8823v);
        }
        c8815n.m21347e(c8815n.f20644b + 2);
        int iM21357o = c8815n.m21357o();
        int i6 = 5;
        c8815n.m21347e(c8815n.f20644b + 5);
        C8814m c8814m = this.f19872a;
        c8815n.m21339a(c8814m.f20639a, 0, 2);
        c8814m.m21334b(0);
        int i7 = 4;
        this.f19872a.m21336c(4);
        int i8 = 12;
        c8815n.m21347e(c8815n.f20644b + this.f19872a.m21332a(12));
        C8633b0 c8633b1 = this.f19876e;
        if (c8633b1.f19892a == 2 && c8633b1.f19902k == null) {
            C8637d0 c8637d0 = new C8637d0(21, null, null, new byte[0]);
            C8633b0 c8633b2 = this.f19876e;
            c8633b2.f19902k = c8633b2.f19896e.m21171a(21, c8637d0);
            C8633b0 c8633b3 = this.f19876e;
            c8633b3.f19902k.mo21178a(c8823v, c8633b3.f19899h, new C8639e0(iM21357o, 21, 8192));
        }
        this.f19873b.clear();
        this.f19874c.clear();
        int i9 = c8815n.f20645c - c8815n.f20644b;
        while (i9 > 0) {
            C8814m c8814m2 = this.f19872a;
            c8815n.m21339a(c8814m2.f20639a, i5, i6);
            c8814m2.m21334b(i5);
            int iM21332a = this.f19872a.m21332a(8);
            int i10 = 3;
            this.f19872a.m21336c(3);
            int iM21332a2 = this.f19872a.m21332a(13);
            this.f19872a.m21336c(i7);
            int iM21332a3 = this.f19872a.m21332a(i8);
            int i11 = c8815n.f20644b;
            int i12 = i11 + iM21332a3;
            int i13 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (c8815n.f20644b < i12) {
                int iM21352j = c8815n.m21352j();
                int iM21352j2 = c8815n.f20644b + c8815n.m21352j();
                if (iM21352j == i6) {
                    long jM21353k = c8815n.m21353k();
                    if (jM21353k == C8633b0.f19889l) {
                        i3 = 129;
                    } else if (jM21353k == C8633b0.f19890m) {
                        i3 = 135;
                    } else {
                        if (jM21353k == C8633b0.f19891n) {
                            i3 = 36;
                        }
                        i = i9;
                        i2 = 4;
                    }
                    i13 = i3;
                    i = i9;
                    i2 = 4;
                } else {
                    if (iM21352j == 106) {
                        i3 = 129;
                    } else if (iM21352j == 122) {
                        i3 = 135;
                    } else if (iM21352j == 123) {
                        i3 = 138;
                    } else {
                        if (iM21352j == 10) {
                            strTrim = c8815n.m21341b(i10).trim();
                        } else if (iM21352j == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c8815n.f20644b < iM21352j2) {
                                String strTrim2 = c8815n.m21341b(i10).trim();
                                c8815n.m21352j();
                                byte[] bArr = new byte[4];
                                c8815n.m21339a(bArr, 0, 4);
                                arrayList2.add(new C8635c0(strTrim2, bArr));
                                i9 = i9;
                                i10 = 3;
                            }
                            i = i9;
                            i2 = 4;
                            arrayList = arrayList2;
                            i13 = 89;
                        }
                        i = i9;
                        i2 = 4;
                    }
                    i13 = i3;
                    i = i9;
                    i2 = 4;
                }
                int i14 = c8815n.f20644b;
                c8815n.m21347e((iM21352j2 - i14) + i14);
                i7 = i2;
                i9 = i;
                i6 = 5;
                i10 = 3;
            }
            int i15 = i9;
            int i16 = i7;
            c8815n.m21347e(i12);
            C8637d0 c8637d1 = new C8637d0(i13, strTrim, arrayList, Arrays.copyOfRange(c8815n.f20643a, i11, i12));
            if (iM21332a == 6) {
                iM21332a = i13;
            }
            i9 = i15 - (iM21332a3 + 5);
            C8633b0 c8633b4 = this.f19876e;
            int i17 = c8633b4.f19892a == 2 ? iM21332a : iM21332a2;
            if (c8633b4.f19898g.get(i17)) {
                c = 21;
            } else {
                C8633b0 c8633b5 = this.f19876e;
                if (c8633b5.f19892a == 2) {
                    c = 21;
                    if (iM21332a == 21) {
                        interfaceC8641f0M21171a = c8633b5.f19902k;
                    }
                    if (this.f19876e.f19892a == 2 || iM21332a2 < this.f19874c.get(i17, 8192)) {
                        this.f19874c.put(i17, iM21332a2);
                        this.f19873b.put(i17, interfaceC8641f0M21171a);
                    }
                } else {
                    c = 21;
                }
                interfaceC8641f0M21171a = c8633b5.f19896e.m21171a(iM21332a, c8637d1);
                if (this.f19876e.f19892a == 2) {
                    this.f19874c.put(i17, iM21332a2);
                    this.f19873b.put(i17, interfaceC8641f0M21171a);
                } else {
                    this.f19874c.put(i17, iM21332a2);
                    this.f19873b.put(i17, interfaceC8641f0M21171a);
                }
            }
            i7 = i16;
            i5 = 0;
            i6 = 5;
            i8 = 12;
        }
        int size = this.f19874c.size();
        for (int i18 = 0; i18 < size; i18++) {
            int iKeyAt = this.f19874c.keyAt(i18);
            this.f19876e.f19898g.put(iKeyAt, true);
            InterfaceC8641f0 interfaceC8641f0 = (InterfaceC8641f0) this.f19873b.valueAt(i18);
            if (interfaceC8641f0 != null) {
                C8633b0 c8633b6 = this.f19876e;
                if (interfaceC8641f0 != c8633b6.f19902k) {
                    interfaceC8641f0.mo21178a(c8823v, c8633b6.f19899h, new C8639e0(iM21357o, iKeyAt, 8192));
                }
                this.f19876e.f19897f.put(this.f19874c.valueAt(i18), interfaceC8641f0);
            }
        }
        C8633b0 c8633b7 = this.f19876e;
        if (c8633b7.f19892a == 2) {
            if (c8633b7.f19901j) {
                return;
            }
            c8633b7.f19899h.mo21096b();
            C8633b0 c8633b8 = this.f19876e;
            c8633b8.f19900i = 0;
            c8633b8.f19901j = true;
            return;
        }
        c8633b7.f19897f.remove(this.f19875d);
        C8633b0 c8633b9 = this.f19876e;
        int i19 = c8633b9.f19892a == 1 ? 0 : c8633b9.f19900i - 1;
        c8633b9.f19900i = i19;
        if (i19 == 0) {
            c8633b9.f19899h.mo21096b();
            this.f19876e.f19901j = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8657v
    /* JADX INFO: renamed from: a */
    public final void mo21164a(C8823v c8823v, InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
    }
}
