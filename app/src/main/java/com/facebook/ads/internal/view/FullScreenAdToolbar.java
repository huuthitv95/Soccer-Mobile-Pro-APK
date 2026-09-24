package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.redexgen.core.AbstractC6334XX;
import com.facebook.ads.redexgen.core.AbstractC6374YB;
import com.facebook.ads.redexgen.core.AbstractC6400Yb;
import com.facebook.ads.redexgen.core.AbstractC6605bu;
import com.facebook.ads.redexgen.core.C5728Na;
import com.facebook.ads.redexgen.core.C5740Nm;
import com.facebook.ads.redexgen.core.C5746Ns;
import com.facebook.ads.redexgen.core.C6200VI;
import com.facebook.ads.redexgen.core.C6398YZ;
import com.facebook.ads.redexgen.core.C6437ZC;
import com.facebook.ads.redexgen.core.C6445ZK;
import com.facebook.ads.redexgen.core.C6739e4;
import com.facebook.ads.redexgen.core.C6902gi;
import com.facebook.ads.redexgen.core.EnumC6385YM;
import com.facebook.ads.redexgen.core.InterfaceC6399Ya;
import com.facebook.ads.redexgen.core.InterfaceC6406Yh;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC5560Kr;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC6415Yq;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends AbstractC6400Yb {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C6398YZ A00;
    public InterfaceC6399Ya A01;
    public InterfaceC6399Ya A02;
    public C6437ZC A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C6200VI A07;
    public final InterfaceC6406Yh A08;
    public final C6445ZK A09;
    public final C6739e4 A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC6334XX.A02 * 10.0f);
        A0H = (int) (AbstractC6334XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC6334XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C6902gi c6902gi, InterfaceC6406Yh interfaceC6406Yh, C6200VI c6200vi, int i, int i2, boolean z) {
        super(c6902gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z;
        this.A08 = interfaceC6406Yh;
        this.A07 = c6200vi;
        setGravity(16);
        this.A09 = new C6445ZK(c6902gi, i, z);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC6415Yq(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c6902gi);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C6739e4(c6902gi);
            AbstractC6374YB.A0G(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i2 != -1) {
                A0G(c6902gi, i2);
                return;
            }
            return;
        }
        if (i2 != -1) {
            A0G(c6902gi, i2);
        }
        this.A06 = new RelativeLayout(c6902gi);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C6739e4(c6902gi);
        AbstractC6374YB.A0G(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A0C(float f, int i) {
        this.A09.A03(f, i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final void A0D(C5728Na c5728Na, boolean z) {
        boolean z2 = this.A04;
        int iA05 = c5728Na.A05(z2);
        this.A0A.A02(c5728Na.A0B(z2), iA05);
        boolean z3 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z3) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c5728Na, z2, z);
        if (z2) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            AbstractC6374YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        AbstractC6374YB.A0N(this, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(C5740Nm c5740Nm, String str, int i) {
        this.A09.setInitialUnskippableSeconds(i);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c5740Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c5740Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(C6902gi c6902gi, int i) {
        if (this.A00 != null) {
            AbstractC6374YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C6398YZ(c6902gi, i);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new C6437ZC(c6902gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public int getToolbarHeight() {
        return AbstractC6400Yb.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public InterfaceC6399Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setAdReportingVisible(boolean z) {
        A04(!this.A05 ? this.A00 : this.A03, z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setCTAClickListener(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        this.A0A.setOnClickListener(AbstractC6605bu.A03(viewOnClickListenerC5560Kr, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setFullscreen(boolean z) {
        this.A04 = z;
    }

    public void setOnlyPageDetails(C5740Nm c5740Nm) {
        if (c5740Nm != null) {
            this.A0A.setPageDetails(c5740Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setPageDetails(C5740Nm c5740Nm, String str, int i, C5746Ns c5746Ns) {
        this.A09.setInitialUnskippableSeconds(i);
        this.A0A.setPageDetails(c5740Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c5740Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c5740Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setPageDetailsVisible(boolean z) {
        this.A06.removeAllViews();
        if (z) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setProgress(float f) {
        this.A09.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setProgressImage(EnumC6385YM enumC6385YM) {
        this.A09.setProgressImage(enumC6385YM);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setProgressImmediate(float f) {
        this.A09.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setProgressSpinnerInvisible(boolean z) {
        this.A09.setProgressSpinnerInvisible(z);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            AbstractC6374YB.A0S(view, 0, ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setToolbarActionMode(int i) {
        this.A09.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6400Yb
    public void setToolbarListener(InterfaceC6399Ya interfaceC6399Ya) {
        this.A02 = interfaceC6399Ya;
    }
}
