package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.je */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC7078je extends AbstractC5926Qq<C5847PX> {
    public static String[] A05 = {"BofGdT", "Cb8B81bPHxSAbCDzy4", "tLXqRIVVg6Ax3ByQPtTHAjuCLXMkMIv2", "Awqy8gsEnlsE3SarczMGKLCzZdtyeG5w", "c95zYEegXXkMe1M4f4KrlDKZ96YYHdKl", "dzB1VPy83al1mBxHBTo", "7fXNgxpNBgLKECdM7L4CyN3WmxsqHAeT", "HUwJOtf8ZOX36MmDYBkOhN0MiSikj2Pg"};
    public static final int A06 = (int) (AbstractC6334XX.A02 * 4.0f);
    public InterfaceC5714NM A00;
    public final List<C6140UK> A01;
    public final int A02;
    public final C6902gi A03;
    public final AbstractC6846fo A04 = new C7080jg(this);

    public AbstractC7078je(C43530x c43530x, List<C6140UK> list, C6902gi c6902gi) {
        this.A03 = c6902gi;
        this.A02 = c43530x.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A01(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        int size = this.A01.size() - 1;
        String[] strArr = A05;
        if (strArr[3].charAt(2) == strArr[4].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "KlchvvVcsY9zV3e8wqzNtTZQscUuxnqD";
        strArr2[1] = "gQBYn2ao1l5plthpQQ";
        marginLayoutParams.setMargins(i2, 0, i >= size ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5926Qq
    public final int A0B() {
        return this.A01.size();
    }

    public final void A0O(ImageView imageView, int i) {
        C6140UK c6140uk = this.A01.get(i);
        C6219Vb adCoverImage = c6140uk.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC5591LM asyncTaskC5591LMA04 = new AsyncTaskC5591LM(imageView, this.A03).A04();
            asyncTaskC5591LMA04.A06(new C7079jf(this, i, c6140uk));
            asyncTaskC5591LMA04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0P(InterfaceC5714NM interfaceC5714NM) {
        this.A00 = interfaceC5714NM;
    }

    public void A0Q(C5847PX c5847px, int i) {
        c5847px.A0p().setLayoutParams(A01(i));
    }
}
