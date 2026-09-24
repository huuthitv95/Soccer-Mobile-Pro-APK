package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ZX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6458ZX extends FrameLayout {
    public static byte[] A03;
    public RelativeLayout A00;
    public ScrollView A01;
    public final C6902gi A02;

    static {
        A04();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{98, 94, 83, Ascii.SYN, 119, 82, Ascii.SYN, 95, 69, Ascii.SYN, 94, 95, 82, 82, 83, 88, 94, 101, 111, 100};
    }

    public C6458ZX(C6902gi c6902gi) {
        super(c6902gi);
        this.A02 = c6902gi;
        this.A02.A0F().AB1();
        A03();
        A02();
    }

    private void A01() {
        AbstractC6374YB.A0I(this);
        AbstractC6374YB.A0J(this);
    }

    private void A02() {
        this.A00.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.A00.addView(getAdHideView(), layoutParams);
        AbstractC6374YB.A0W(this.A00);
        this.A01.fullScroll(33);
    }

    private void A03() {
        this.A01 = new ScrollView(this.A02);
        this.A01.setFillViewport(true);
        AbstractC6374YB.A0N(this.A01, -218103809);
        this.A00 = new RelativeLayout(this.A02);
        this.A00.setPadding(AbstractC6332XV.A0U, AbstractC6332XV.A0U, AbstractC6332XV.A0U, AbstractC6332XV.A0U);
        this.A01.addView(this.A00, new FrameLayout.LayoutParams(-1, -2));
        ScrollView scrollView = this.A01;
        FrameLayout.LayoutParams mainLayoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(scrollView, mainLayoutParams);
    }

    public final /* synthetic */ void A05(C6468Zh c6468Zh, View view) {
        this.A02.A0F().AB2();
        c6468Zh.A01();
        A01();
    }

    private LinearLayout getAdHideView() {
        LinearLayout linearLayout = new LinearLayout(this.A02);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this.A02);
        AbstractC6374YB.A0a(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(A00(0, 16, 17));
        textView.setGravity(17);
        LinearLayout.LayoutParams undoAdHideParams = new LinearLayout.LayoutParams(-2, -2);
        undoAdHideParams.setMargins(AbstractC6332XV.A00, AbstractC6332XV.A00, AbstractC6332XV.A00, AbstractC6332XV.A09);
        final C6468Zh c6468Zh = new C6468Zh(this.A02);
        c6468Zh.setData(A00(16, 4, 44), null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c6468Zh.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ZV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A05(c6468Zh, view);
            }
        });
        linearLayout.addView(textView, undoAdHideParams);
        linearLayout.addView(c6468Zh, layoutParams);
        return linearLayout;
    }
}
