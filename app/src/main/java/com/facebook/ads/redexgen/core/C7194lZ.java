package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7194lZ implements InterfaceC5490Jj {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<C5548Kf> A00;
    public final long[] A01;
    public final long[] A02;

    public C7194lZ(List<C5548Kf> list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i = 0; i < cueIndex; i++) {
            C5548Kf c5548Kf = list.get(i);
            int i2 = i * 2;
            this.A01[i2] = c5548Kf.A01;
            int arrayIndex = i2 + 1;
            this.A01[arrayIndex] = c5548Kf.A00;
        }
        this.A02 = Arrays.copyOf(this.A01, this.A01.length);
        Arrays.sort(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final List<C7422pT> A7X(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.A00.size(); i++) {
            if (this.A01[i * 2] <= j) {
                long j2 = this.A01[(i * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j < j2) {
                        C5548Kf c5548Kf = this.A00.get(i);
                        if (c5548Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c5548Kf);
                        } else {
                            C7422pT c7422pT = c5548Kf.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c7422pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((C5548Kf) obj).A01, ((C5548Kf) obj2).A01);
            }
        });
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            arrayList.add(((C5548Kf) arrayList2.get(i2)).A02.A02().A07((-1) - i2, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final long A83(int i) {
        boolean z = true;
        AbstractC45353y.A07(i >= 0);
        if (i >= this.A02.length) {
            z = false;
        }
        AbstractC45353y.A07(z);
        return this.A02[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC5490Jj
    public final int A8a(long j) {
        int iA0K = AbstractC46115C.A0K(this.A02, j, false, false);
        int index = this.A02.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
