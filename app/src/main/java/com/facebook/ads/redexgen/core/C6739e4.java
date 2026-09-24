package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6739e4 extends LinearLayout {
    public static final int A04 = (int) (AbstractC6334XX.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC6334XX.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C6595bk A02;
    public final C6902gi A03;

    public C6739e4(C6902gi c6902gi) {
        super(c6902gi);
        this.A03 = c6902gi;
        A00(c6902gi);
    }

    private final void A00(C6902gi c6902gi) {
        setGravity(16);
        this.A02 = new C6595bk(c6902gi);
        this.A02.setFullCircleCorners(true);
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(A04, A04);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c6902gi);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c6902gi);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC6374YB.A0a(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c6902gi);
        AbstractC6374YB.A0a(this.A01, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C5740Nm c5740Nm) {
        AsyncTaskC5591LM asyncTaskC5591LM = new AsyncTaskC5591LM(this.A02, this.A03);
        asyncTaskC5591LM.A05(A04, A04);
        asyncTaskC5591LM.A07(c5740Nm.A01());
        this.A00.setText(c5740Nm.A02());
        this.A01.setText(c5740Nm.A03());
    }
}
