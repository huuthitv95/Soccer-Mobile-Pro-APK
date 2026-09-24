package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ow */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5812Ow extends AbstractC6564bF {
    public final TextView A00;
    public final TextView A01;
    public static final int A02 = (int) (AbstractC6334XX.A02 * 36.0f);
    public static final int A05 = (int) (AbstractC6334XX.A02 * 4.0f);
    public static final int A03 = (int) (AbstractC6334XX.A02 * 8.0f);
    public static final int A04 = (int) (AbstractC6334XX.A02 * 4.0f);

    public C5812Ow(C6902gi c6902gi, int i, C5728Na c5728Na, boolean z, String str, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5734Ng c5734Ng) {
        super(c6902gi, null, i, c5728Na, z, str, interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, c5734Ng, false, "");
        setOrientation(0);
        setPadding(A05, A05, A05, A05);
        this.A01 = A01(-16448251, 13, true);
        this.A00 = A01(-10131605, 12, false);
        this.A06.addView(A00(i), new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        addView(this.A06, layoutParams);
        this.A08.setPadding(A03, 0, A03, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, A02);
        layoutParams2.gravity = 17;
        addView(this.A08, layoutParams2);
    }

    private LinearLayout A00(int i) {
        LinearLayout linearLayout = new LinearLayout(this.A07);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04, 0, A04, 0);
        linearLayout.addView(this.A01, AbstractC6564bF.A0B);
        linearLayout.addView(this.A00, AbstractC6564bF.A0B);
        LinearLayout linearLayout2 = new LinearLayout(this.A07);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(this.A09, new LinearLayout.LayoutParams(i, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout2.addView(linearLayout, layoutParams);
        return linearLayout2;
    }

    private TextView A01(int i, int i2, boolean z) {
        TextView textView = new TextView(this.A07);
        textView.setTextColor(i);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        AbstractC6374YB.A0a(textView, z, i2);
        return textView;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6564bF
    public final void A0k() {
        super.A0k();
        setOnClickListener(this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6564bF
    public final void A0l(int i) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6564bF
    public void setInfo(C5726NY c5726ny, C5730Nc c5730Nc, String str, String str2, InterfaceC6344Xh interfaceC6344Xh, InterfaceC6579bU interfaceC6579bU) {
        super.setInfo(c5726ny, c5730Nc, str, str2, interfaceC6344Xh, interfaceC6579bU);
        this.A01.setText(c5726ny.A0G());
        this.A00.setText(c5726ny.A0F());
        if (TextUtils.isEmpty(c5730Nc.A04())) {
            AbstractC6374YB.A0H(this.A08);
        }
    }
}
