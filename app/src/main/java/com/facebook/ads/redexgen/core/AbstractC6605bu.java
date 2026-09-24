package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bu */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6605bu {
    public static float A00(C5719NR c5719nr) {
        int height = c5719nr.A0H().A01();
        int width = c5719nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) (((double) (AbstractC6333XW.A00().widthPixels - (AbstractC6614c3.A08 * 2))) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC6374YB.A01(16);
        int ctaTextHeight = AbstractC6586bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC6614c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC6333XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC6604bt A03(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, String str) {
        return new ViewOnClickListenerC6604bt(viewOnClickListenerC5560Kr, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
