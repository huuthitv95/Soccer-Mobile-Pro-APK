package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6630cJ {
    public static byte[] A0N;
    public static String[] A0O = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public C6506aJ A08;
    public C6506aJ A09;
    public ViewOnClickListenerC5560Kr A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public final int A0F;
    public final AbstractC7077jd A0G;
    public final C5715NN A0H;
    public final C5726NY A0I;
    public final C5731Nd A0J;
    public final C6902gi A0K;
    public final C6200VI A0L;
    public final InterfaceC6406Yh A0M;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;
    public boolean A0D = true;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0O[2].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, Ascii.f22491EM, 39, 37, 50, 47, 48, 47, 50, 63, 42, 50, 48, 41};
    }

    static {
        A04();
    }

    public C6630cJ(C6902gi c6902gi, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, Handler handler, InterfaceC6406Yh interfaceC6406Yh) {
        this.A0K = c6902gi;
        this.A0M = interfaceC6406Yh;
        this.A0I = abstractC7077jd.A29().A0I();
        this.A0J = abstractC7077jd.A29().A0K();
        this.A0H = abstractC7077jd.A28();
        this.A0E = abstractC7077jd.A2T();
        this.A0C = abstractC7077jd.A2P();
        this.A0F = AbstractC6765eU.A00(c6902gi.getResources().getDisplayMetrics());
        this.A0L = c6200vi;
        this.A0G = abstractC7077jd;
        A03();
    }

    private ImageView A00(final ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(AbstractC6386YN.A01(EnumC6385YM.OTHER_SKIP), this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0K);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A02(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6630cJ.A0B(viewOnClickListenerC5560Kr, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private TextView A01() {
        if (TextUtils.isEmpty(this.A0G.A29().A0I().A08())) {
            return null;
        }
        TextView textView = new TextView(this.A0K);
        textView.setText(this.A0G.A29().A0I().A08());
        textView.setTextColor(-1);
        textView.setTextSize(13.0f);
        textView.setGravity(17);
        return textView;
    }

    private void A03() {
        this.A03 *= this.A0F;
        this.A02 *= this.A0F;
        this.A01 *= this.A0F;
        this.A04 *= this.A0F;
        this.A05 *= this.A0F;
        this.A06 *= this.A0F;
        this.A00 *= this.A0F;
        this.A07 *= this.A0F;
    }

    private void A05(FrameLayout frameLayout) {
        View view = new View(this.A0K);
        view.setBackgroundColor(Color.parseColor(A02(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A06(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        this.A08 = AbstractC6511aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, EnumC6509aM.A02, AbstractC6508aL.A00(this.A0G));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
        layoutParams.setMargins(0, 0, this.A04, this.A03);
        frameLayout2.addView(this.A08, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A07(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        this.A09 = AbstractC6511aO.A01(this.A0K, false, this.A0G, this.A0L, this.A0M, EnumC6509aM.A02, EnumC6512aP.A04);
        AbstractC6374YB.A0K(this.A09);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(this.A09, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    private void A08(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        C6510aN c6510aNA02 = AbstractC6511aO.A02(this.A0K, EnumC6509aM.A02, this.A0G);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        layoutParams.setMargins(this.A04, 0, 0, this.A03);
        frameLayout2.addView(c6510aNA02, layoutParams);
        frameLayout.addView(frameLayout2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00de  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    private void A09(FrameLayout frameLayout, ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        ImageView imageViewA00;
        boolean z;
        String[] strArr;
        FrameLayout frameLayout2 = new FrameLayout(this.A0K);
        frameLayout2.setPadding(0, this.A06, this.A02, this.A02);
        if (this.A0E) {
            frameLayout2.setOnClickListener(new ViewOnClickListenerC6629cI(this, viewOnClickListenerC5560Kr));
        }
        Bitmap bitmap = AbstractC6386YN.A01(EnumC6385YM.NAV_CROSS);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.A04, this.A04, true);
        ImageView dubiousSkip = new ImageView(this.A0K);
        AbstractC6374YB.A0G(1002, dubiousSkip);
        dubiousSkip.setImageBitmap(bitmapCreateScaledBitmap);
        dubiousSkip.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A02(0, 9, 80)));
        dubiousSkip.setBackground(gradientDrawable);
        dubiousSkip.setPadding(this.A01, this.A01, this.A01, this.A01);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        dubiousSkip.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0G(view);
            }
        });
        long jA00 = this.A0J.A00();
        if (this.A0B) {
            C5731Nd c5731Nd = this.A0J;
            if (A0O[2].length() != 25) {
                throw new RuntimeException();
            }
            A0O[2] = "EDg5a4vgNKTBN5Vd4K7j2JAWQ";
            jA00 = c5731Nd.A01();
        }
        boolean z2 = this.A0D;
        if (A0O[2].length() != 25) {
            String[] strArr2 = A0O;
            strArr2[3] = "lPr3oecF17Vr0ETjxWpa6eT7xUG7TKGz";
            strArr2[1] = "pN0Dd6Okr1h1scp4h6gPnTJrQwG996nC";
            if (z2) {
                if (jA00 > 0) {
                    imageViewA00 = null;
                    z = this.A0C;
                    strArr = A0O;
                    if (strArr[0].charAt(31) != strArr[6].charAt(31)) {
                        String[] strArr3 = A0O;
                        strArr3[3] = "NBSSb5i8vB7h2DITQFZ0JVIGTEGpjtjm";
                        strArr3[1] = "r6oo3XDBH3cPwN6mP2aoTtDXeEGymFZK";
                        if (z) {
                            if (viewOnClickListenerC5560Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC5560Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    } else {
                        String[] strArr4 = A0O;
                        strArr4[0] = "LTYB5M4Mhdd1oprOtejFkg7YcKqdK9Vm";
                        strArr4[6] = "s8tsGyr3r09N1mPmkZSZvoZyMzIeZ0vJ";
                        if (z) {
                            if (viewOnClickListenerC5560Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC5560Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    }
                    AbstractC6765eU.A01(this.A0K, dubiousSkip, jA00, imageViewA00);
                }
            }
        } else {
            String[] strArr5 = A0O;
            strArr5[3] = "tzOwMkw7uDsuhpEAhy55DDXkTNG5R2eG";
            strArr5[1] = "LVlHDeBQ28ZWrMMDEXcUdCCcU9GvuA6m";
            if (z2) {
                if (jA00 > 0) {
                    imageViewA00 = null;
                    z = this.A0C;
                    strArr = A0O;
                    if (strArr[0].charAt(31) != strArr[6].charAt(31)) {
                        String[] strArr6 = A0O;
                        strArr6[3] = "NBSSb5i8vB7h2DITQFZ0JVIGTEGpjtjm";
                        strArr6[1] = "r6oo3XDBH3cPwN6mP2aoTtDXeEGymFZK";
                        if (z) {
                            if (viewOnClickListenerC5560Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC5560Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    } else {
                        String[] strArr7 = A0O;
                        strArr7[0] = "LTYB5M4Mhdd1oprOtejFkg7YcKqdK9Vm";
                        strArr7[6] = "s8tsGyr3r09N1mPmkZSZvoZyMzIeZ0vJ";
                        if (z) {
                            if (viewOnClickListenerC5560Kr != null) {
                                imageViewA00 = A00(viewOnClickListenerC5560Kr);
                                frameLayout2.addView(imageViewA00);
                            }
                        }
                    }
                    AbstractC6765eU.A01(this.A0K, dubiousSkip, jA00, imageViewA00);
                }
            }
        }
        frameLayout2.addView(dubiousSkip, layoutParams);
        if (!this.A0D) {
            String[] strArr8 = A0O;
            if (strArr8[4].charAt(0) != strArr8[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr9 = A0O;
            strArr9[3] = "Yzc02jbTluogikiQi2Wv962AcLGu9uF1";
            strArr9[1] = "JahYjLhPUhQBnUZY2LL7YeIOJlGmyCNi";
            dubiousSkip.setVisibility(8);
        }
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -2, 48));
    }

    private void A0A(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        viewOnClickListenerC5560Kr.setPadding(this.A04, this.A03, this.A04, this.A03);
        viewOnClickListenerC5560Kr.setTextSize(14.0f);
        viewOnClickListenerC5560Kr.A0D();
        viewOnClickListenerC5560Kr.setIncludeFontPadding(true);
        viewOnClickListenerC5560Kr.setLayoutParams(layoutParams);
        viewOnClickListenerC5560Kr.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        AbstractC6374YB.A0V(viewOnClickListenerC5560Kr, AbstractC6374YB.A06(-1, this.A00));
        viewOnClickListenerC5560Kr.setId(View.generateViewId());
        if (viewOnClickListenerC5560Kr.getParent() != null) {
            ((ViewGroup) viewOnClickListenerC5560Kr.getParent()).removeView(viewOnClickListenerC5560Kr);
        }
    }

    public static /* synthetic */ void A0B(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, View view) {
        viewOnClickListenerC5560Kr.A0E(A02(63, 4, 71));
        viewOnClickListenerC5560Kr.setVisibility(4);
    }

    public final View A0C(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr) {
        if (viewOnClickListenerC5560Kr != null) {
            viewOnClickListenerC5560Kr.setV2Design(true);
        }
        return A0D(viewOnClickListenerC5560Kr, null);
    }

    public final View A0D(ViewOnClickListenerC5560Kr viewOnClickListenerC5560Kr, ImageView imageView) {
        this.A0A = viewOnClickListenerC5560Kr;
        this.A0B = imageView != null;
        FrameLayout frameLayout = new FrameLayout(this.A0K);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C6601bq c6601bq = new C6601bq(this.A0K, this.A0H.A01(), true, false, false);
        c6601bq.A04(this.A0I.A0G(), this.A0I.A0E().toLowerCase(Locale.getDefault()), null, false, false);
        c6601bq.setAlignment(17);
        c6601bq.setTitleTextSize(28);
        c6601bq.setDescriptionTextSize(13);
        c6601bq.A02();
        c6601bq.setPadding(this.A05, 0, this.A05, 0);
        LinearLayout linearLayout = new LinearLayout(this.A0K);
        linearLayout.setClickable(true);
        if (C6171Up.A1D(this.A0K)) {
            linearLayout.setOnClickListener(new ViewOnClickListenerC6628cH(this, viewOnClickListenerC5560Kr));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A03, 0, this.A07);
        linearLayout.addView(c6601bq, layoutParams);
        TextView textViewA01 = A01();
        if (textViewA01 != null) {
            new LinearLayout.LayoutParams(-2, -2).setMargins(0, this.A07, 0, this.A03);
            linearLayout.addView(textViewA01);
        }
        if (viewOnClickListenerC5560Kr != null) {
            A0A(viewOnClickListenerC5560Kr);
            linearLayout.addView(viewOnClickListenerC5560Kr, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC5560Kr.getText())) {
                AbstractC6374YB.A0H(viewOnClickListenerC5560Kr);
            }
        }
        linearLayout.setAlpha(1.0f);
        A05(frameLayout);
        frameLayout.addView(linearLayout);
        A09(frameLayout, viewOnClickListenerC5560Kr);
        if (this.A0G.A2M()) {
            A06(frameLayout);
        }
        AbstractC7077jd abstractC7077jd = this.A0G;
        String[] strArr = A0O;
        if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
            throw new RuntimeException();
        }
        A0O[2] = "4iwGVt394BTmmSYCgqRVgc6es";
        if (abstractC7077jd.A2W()) {
            A08(frameLayout);
        } else if (this.A0G.A2V()) {
            A07(frameLayout);
        }
        return frameLayout;
    }

    public final ViewOnClickListenerC5560Kr A0E() {
        return this.A0A;
    }

    public final void A0F() {
        if (this.A08 != null) {
            this.A08.A0O();
        }
        C6506aJ c6506aJ = this.A09;
        String[] strArr = A0O;
        if (strArr[4].charAt(0) != strArr[7].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "2Z0HXqlllvltE4fpmlk2k5YgzqGJ81zY";
        strArr2[1] = "EMsyCAj6WMyQurvXYMEHBK7qX1GDVftC";
        if (c6506aJ != null) {
            this.A09.A0O();
        }
    }

    public final /* synthetic */ void A0G(View view) {
        this.A0K.A0F().AB0();
        this.A0M.A4j(A02(18, 45, 88));
    }

    public final void A0H(boolean z) {
        if (!z && this.A08 != null) {
            this.A08.A0P();
        }
        if (this.A09 != null) {
            this.A09.A0P();
        }
    }

    public final void A0I(boolean z) {
        this.A0D = z;
    }
}
