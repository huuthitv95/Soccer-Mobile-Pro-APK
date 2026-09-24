package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5206F7 extends LinearLayout implements InterfaceC6774ee {
    public final NativeBannerAd A00;
    public final C6902gi A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (AbstractC6334XX.A02 * 42.0f);
    public static final int A03 = (int) (AbstractC6334XX.A02 * 48.0f);
    public static final int A05 = (int) (AbstractC6334XX.A02 * 54.0f);
    public static final int A07 = (int) (AbstractC6334XX.A02 * 4.0f);
    public static final int A06 = (int) (AbstractC6334XX.A02 * 8.0f);

    public C5206F7(C6902gi c6902gi, NativeBannerAd nativeBannerAd, C6221Vd c6221Vd, EnumC6222Ve enumC6222Ve, MediaView mediaView, AdOptionsView adOptionsView, C6492a5 c6492a5) {
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams commonLayoutParams;
        super(c6902gi);
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c6902gi;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int iA00 = A00(enumC6222Ve);
        C6596bl c6596bl = new C6596bl(this.A01);
        c6596bl.setFullCircleCorners(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA00, iA00);
        c6596bl.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        relativeLayout.addView(c6596bl, layoutParams2);
        if (c6492a5 != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(10);
            layoutParams4.setMargins(AbstractC6332XV.A0A, AbstractC6332XV.A0A, AbstractC6332XV.A00, AbstractC6332XV.A00);
            relativeLayout.addView(c6492a5, layoutParams4);
        }
        linearLayout.addView(relativeLayout, layoutParams3);
        View c6771eb = new C6771eb(c6902gi, this.A00, enumC6222Ve, c6221Vd, adOptionsView);
        c6771eb.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 16;
        linearLayout.addView(c6771eb, layoutParams5);
        if (enumC6222Ve == EnumC6222Ve.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            commonLayoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            commonLayoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c6221Vd.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, commonLayoutParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC6222Ve enumC6222Ve) {
        switch (enumC6222Ve) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6774ee
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6774ee
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6774ee
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
