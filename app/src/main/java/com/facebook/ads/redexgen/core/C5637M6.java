package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.M6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5637M6 extends LinearLayout implements InterfaceC6544av {
    public static byte[] A0E;
    public static String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final Uri A0L;
    public static final View.OnTouchListener A0M;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public C6536an A05;
    public InterfaceC6543au A06;
    public String A07;
    public final WebView A08;
    public final C6902gi A09;
    public final InterfaceC6540ar A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, Ascii.DC2, -114, -73, -70, -66, -80, -22, 19, Ascii.SYN, Ascii.ESC, 5, Ascii.SYN, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, Ascii.f22500SO, Ascii.f22490CR, -45, -5, 5, -6, 7, 4, Ascii.ETB, 36, Ascii.SUB, 40, 37, Ascii.f22502US, Ascii.SUB, -28, Ascii.f22502US, 36, 42, Ascii.ESC, 36, 42, -28, Ascii.ETB, Ascii.f22491EM, 42, Ascii.f22502US, 37, 36, -28, Ascii.f22492FF, -1, -5, Ascii.f22490CR, Ascii.DC2, Ascii.f22498RS, Ascii.f22493FS, -35, Ascii.DLE, Ascii.f22494GS, 19, 33, Ascii.f22498RS, Ascii.CAN, 19, -35, Ascii.DC2, Ascii.ETB, 33, Ascii.f22498RS, Ascii.f22493FS, Ascii.DC4, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0I = Color.rgb(224, 224, 224);
        A0L = AbstractC6312XB.A00(A06(90, 23, 25));
        A0M = new ViewOnTouchListenerC6525ac();
        A0K = Color.argb(34, 0, 0, 0);
        A0G = AbstractC6332XV.A0P;
        A0H = AbstractC6332XV.A0I;
        A0J = AbstractC6332XV.A0A;
    }

    public C5637M6(C6902gi c6902gi, WebView webView) {
        this(c6902gi, webView, false, false);
    }

    public C5637M6(C6902gi c6902gi, WebView webView, boolean z, boolean z2) {
        super(c6902gi);
        this.A0A = new C5638M7(this);
        this.A08 = webView;
        this.A09 = c6902gi;
        this.A0B = AbstractC6172Uq.A06(c6902gi);
        this.A0D = z;
        this.A0C = z2;
        A08();
        if (z2) {
            A0C(false);
        }
    }

    private void A08() {
        float f;
        AbstractC6374YB.A0N(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A09);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(A0G, A0G);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0M);
        this.A01.setOnClickListener(new ViewOnClickListenerC6526ad(this));
        addView(this.A01, layoutParams);
        if (this.A0B && !C6171Up.A2w(this.A09)) {
            this.A00 = new ImageView(this.A09);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            ViewGroup.LayoutParams backButtonParams = new LinearLayout.LayoutParams(A0G, A0G);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.BACK_ARROW));
            this.A00.setOnTouchListener(A0M);
            this.A00.setOnClickListener(new ViewOnClickListenerC6527ae(this));
            addView(this.A00, backButtonParams);
        }
        this.A05 = new C6536an(this.A09);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A0B || C6171Up.A2w(this.A09)) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        layoutParams2.weight = f;
        this.A05.setGravity(17);
        if (C6171Up.A2w(this.A09) && !this.A0D) {
            this.A04 = new LinearLayout(this.A09);
            this.A04.setOrientation(1);
            this.A04.setPadding(0, A0J, 0, A0J);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A09);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(AbstractC6386YN.A01(EnumC6385YM.HANDLER));
            imageView.setPadding(0, A0H, 0, A0H);
            LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(imageView, closeButtonParams);
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A05, titleViewsParams);
        } else {
            addView(this.A05, layoutParams2);
        }
        if (this.A0B && !C6171Up.A2w(this.A09)) {
            this.A02 = new ImageView(this.A09);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            ViewGroup.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(A0G, A0G);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(AbstractC6386YN.A02(EnumC6385YM.BACK_ARROW));
            this.A02.setOnTouchListener(A0M);
            this.A02.setOnClickListener(new ViewOnClickListenerC6528af(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A09);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0M);
        this.A03.setOnClickListener(new ViewOnClickListenerC6529ag(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    private void A09() {
        PackageManager packageManager;
        Bitmap externalBrowserBitmap = null;
        boolean zA0k = C6171Up.A0k(this.A09);
        if (!zA0k && (packageManager = this.A09.getPackageManager()) != null) {
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(A06(46, 26, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), A0L), 65536);
            if (listQueryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else if (listQueryIntentActivities.size() == 1) {
                ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A0F[6] = "Y9G9nX";
                if (resolveInfo.activityInfo != null) {
                    ResolveInfo resolveInfo2 = listQueryIntentActivities.get(0);
                    if (A0F[2].length() != 9) {
                        String[] strArr2 = A0F;
                        strArr2[7] = "hqSHhnICOqiHaN8u87jsv4Qx8TBqcflH";
                        strArr2[3] = "kBU630hheaj535sYoezwG0Sk33mkxVnX";
                        if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                            externalBrowserBitmap = AbstractC6386YN.A01(EnumC6385YM.BROWSER_LAUNCH_CHROME);
                        } else {
                            externalBrowserBitmap = getExternalBrowserBitmap();
                        }
                    } else if (A06(72, 18, 116).equals(resolveInfo2.activityInfo.packageName)) {
                        externalBrowserBitmap = AbstractC6386YN.A01(EnumC6385YM.BROWSER_LAUNCH_CHROME);
                    } else {
                        externalBrowserBitmap = getExternalBrowserBitmap();
                    }
                } else {
                    externalBrowserBitmap = getExternalBrowserBitmap();
                }
            } else {
                externalBrowserBitmap = getExternalBrowserBitmap();
            }
        }
        if (C6171Up.A2w(this.A09) || zA0k) {
            this.A03.setVisibility(0);
            externalBrowserBitmap = getExternalBrowserBitmap();
        }
        this.A03.setImageBitmap(externalBrowserBitmap);
    }

    private void A0C(boolean z) {
        int i = z ? 0 : 8;
        ImageView imageView = this.A00;
        if (A0F[1].charAt(15) == 'W') {
            throw new RuntimeException();
        }
        A0F[2] = "nknH3C2";
        if (imageView != null) {
            this.A00.setVisibility(i);
        }
        if (this.A02 != null) {
            this.A02.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z) {
        if (z) {
            A0C(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6544av
    public InterfaceC6540ar getBrowserNavigationListener() {
        return this.A0A;
    }

    private Bitmap getExternalBrowserBitmap() {
        if (this.A0C) {
            return AbstractC6386YN.A01(EnumC6385YM.BROWSER_LAUNCH_NATIVE_V2);
        }
        return AbstractC6386YN.A01(EnumC6385YM.BROWSER_LAUNCH_NATIVE);
    }

    public void setCloseButtonVisibility(int i) {
        this.A01.setVisibility(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6544av
    public void setListener(InterfaceC6543au interfaceC6543au) {
        this.A06 = interfaceC6543au;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6544av
    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC6544av
    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0I, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(this.A07);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }
}
