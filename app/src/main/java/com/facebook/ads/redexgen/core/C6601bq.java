package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6601bq extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"5HLU", "cJmhtdIbv5Y5xdwCDl3dT8HPvklAUmwI", "4stzzs6gVfUC8wPYX", "7o6tBFGKBnQKcZsvXBJ4ayd9LnRtCNJ", "BSijPHOaulEPVGa4U1fKlqwI", "TamflSlcNH2rcKEIo3f72qWopMk8DENN", "Hhh3HDuTgivrAf4KqreTZK2", "SugScFu"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.f22502US, Ascii.SUB, Ascii.SUB, Ascii.ESC, 10, Ascii.f22502US, Ascii.ETB, Ascii.DC2, Ascii.f22490CR};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().density;
        A08 = (int) (A06 * 6.0f);
        A07 = (int) (A06 * 8.0f);
    }

    public C6601bq(C6902gi c6902gi, C5728Na c5728Na, boolean z, int i, int i2, int i3) {
        super(c6902gi);
        setOrientation(1);
        this.A02 = new TextView(c6902gi);
        AbstractC6374YB.A0a(this.A02, true, i);
        this.A02.setEllipsize(TextUtils.TruncateAt.END);
        this.A02.setLineSpacing(A08, 1.0f);
        this.A01 = new TextView(c6902gi);
        this.A00 = new TextView(c6902gi);
        AbstractC6374YB.A0a(this.A00, false, i2);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setLineSpacing(A08, 1.0f);
        this.A03 = C6171Up.A17(c6902gi);
        int i4 = this.A03 ? -2 : -1;
        addView(this.A02, new LinearLayout.LayoutParams(i4, -2));
        addView(this.A01, new LinearLayout.LayoutParams(i4, -2));
        this.A01.setVisibility(8);
        A03(c5728Na, z);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, -2);
        layoutParams.setMargins(0, i3, 0, 0);
        addView(this.A00, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6601bq(C6902gi c6902gi, C5728Na c5728Na, boolean z, boolean z2, boolean z3) {
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A07;
        this(c6902gi, c5728Na, z, i, i2, z3 ? i3 / 2 : i3);
    }

    public final void A02() {
        this.A02.setTypeface(this.A02.getTypeface(), 1);
    }

    public final void A03(C5728Na c5728Na, boolean z) {
        this.A02.setTextColor(c5728Na.A07(z));
        this.A01.setTextColor(c5728Na.A05(z));
        this.A00.setTextColor(c5728Na.A06(z));
    }

    public final void A04(String str, String str2, String str3, boolean z, boolean z2) {
        int i = 1;
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z3) {
            str2 = A00(0, 0, 51);
        }
        textView2.setText(str2);
        int i2 = 3;
        String[] strArr = A05;
        if (strArr[6].length() != strArr[4].length()) {
            String[] strArr2 = A05;
            strArr2[3] = "nuTyQWYrKUsKt4wC014k9cpf4UiNlrc";
            strArr2[0] = "l7Wy";
            if (!z3 || !z4) {
                TextView textView3 = this.A02;
                if (A05[1].charAt(4) != 'F') {
                    String[] strArr3 = A05;
                    strArr3[3] = "qWmgL2iM9nfMb7yMq7CVR7HS6Guvx6S";
                    strArr3[0] = "mFhP";
                    if (z) {
                        i2 = 2;
                    } else if (z2) {
                        i2 = 4;
                    }
                    textView3.setMaxLines(i2);
                    return;
                }
            } else {
                this.A02.setMaxLines(z ? 1 : 2);
                TextView textView4 = this.A00;
                if (!z) {
                    i = z2 ? 3 : 2;
                }
                textView4.setMaxLines(i);
                return;
            }
        }
        throw new RuntimeException();
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        if (this.A03) {
            setGravity(i);
        }
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setCTAClickListener(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        ViewOnClickListenerC6604bt viewOnClickListenerC6604btA03 = AbstractC6605bu.A03(viewOnClickListenerC5560Kr, A00(0, 9, 20));
        this.A02.setOnClickListener(viewOnClickListenerC6604btA03);
        this.A00.setOnClickListener(viewOnClickListenerC6604btA03);
        this.A01.setOnClickListener(viewOnClickListenerC6604btA03);
    }

    public void setDescriptionTextSize(int i) {
        this.A00.setTextSize(i);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public void setTitleTextSize(int i) {
        this.A02.setTextSize(i);
    }
}
