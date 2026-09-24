package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6564bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C6902gi A07;
    public final ViewOnClickListenerC5560Kr A08;
    public final C6595bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC6564bF(C6902gi c6902gi, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, int i, C5728Na c5728Na, boolean z, String str, InterfaceC6192VA interfaceC6192VA, InterfaceC6406Yh interfaceC6406Yh, C6847fp c6847fp, C6365Y2 c6365y2, C5734Ng c5734Ng, boolean z2, String str2) {
        super(c6902gi);
        this.A02 = A0h(0, 0, 37);
        AbstractC6374YB.A0K(this);
        this.A07 = c6902gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C6595bk(c6902gi);
        AbstractC6374YB.A0N(this.A09, 0);
        AbstractC6374YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c6902gi);
            this.A01 = new TextView(c6902gi);
            AbstractC6374YB.A0K(this.A01);
        }
        if (viewOnClickListenerC5560Kr == null) {
            this.A08 = new ViewOnClickListenerC5560Kr(c6902gi, str, c5728Na, z, interfaceC6192VA, interfaceC6406Yh, c6847fp, c6365y2, c5734Ng);
        } else {
            this.A08 = viewOnClickListenerC5560Kr;
        }
        AbstractC6374YB.A0G(1001, this.A08);
        this.A05 = AbstractC6605bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c6902gi);
        this.A06.setLayoutParams(A0B);
        AbstractC6374YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC5560Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C5726NY c5726ny, C5730Nc c5730Nc, String str, String str2, InterfaceC6344Xh interfaceC6344Xh, InterfaceC6579bU interfaceC6579bU) {
        this.A08.setCta(c5730Nc, str, new HashMap(), interfaceC6344Xh, interfaceC6579bU);
        new AsyncTaskC5591LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
