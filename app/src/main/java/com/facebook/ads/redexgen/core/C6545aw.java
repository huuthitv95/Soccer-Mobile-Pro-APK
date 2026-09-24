package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6545aw extends RelativeLayout {
    public static InterfaceC6406Yh A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC6950hU A00;
    public C6902gi A01;
    public C43520w A02;
    public C5632M1 A03;
    public C6594bj A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, Ascii.f22499SI, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = AbstractC6332XV.A0v;
        A07 = A08 * 10;
        A09 = (int) (AbstractC6334XX.A02 * 15.0f);
        A05 = new C5626Lv();
    }

    public C6545aw(C6902gi c6902gi) {
        super(c6902gi);
        this.A01 = c6902gi;
        this.A02 = new C43520w(c6902gi);
        AbstractC6374YB.A0K(this.A02);
        this.A00 = new C47467N();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C6740e5> A01(AbstractC7077jd abstractC7077jd) {
        if (abstractC7077jd == null) {
            return new ArrayList<>();
        }
        List<C5719NR> listA2G = abstractC7077jd.A2G();
        ArrayList<C6740e5> arrayList = new ArrayList<>(listA2G.size());
        for (int i = 0; i < listA2G.size(); i++) {
            arrayList.add(new C6740e5(i, listA2G.size(), listA2G.get(i)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C6140UK c6140uk, int i) {
        ArrayList<C6740e5> arrayListA01 = A01(c6140uk.A13());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new C5632M1(this.A01, arrayListA01, c6140uk.A13(), this.A01.A02().A0A(), c6140uk, A05, c6140uk.A13().A2E(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i == 0) {
            i = AbstractC6334XX.A04.widthPixels;
        }
        this.A03.A0O(i - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c6140uk, arrayListA01);
    }

    public final void A06(C6847fp c6847fp) {
        if (this.A03 != null) {
            this.A03.A0P(c6847fp);
        } else {
            this.A01.A08().ABC(A00(51, 7, 24), AbstractC6098Td.A1v, new C6099Te(A00(0, 51, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
        }
        this.A02.A20(c6847fp);
    }

    public static InterfaceC6406Yh getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.A03 != null) {
            this.A03.A0O((i3 - i) - A07, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        if (this.A04 != null) {
            this.A04.A00(i);
        }
    }

    private void setupDotsLayout(C6140UK c6140uk, ArrayList<C6740e5> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new C5623Ls(this));
        this.A04 = new C6594bj(this.A01, c6140uk.A13().A28().A01(), arrayList.size());
        AbstractC6374YB.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}
