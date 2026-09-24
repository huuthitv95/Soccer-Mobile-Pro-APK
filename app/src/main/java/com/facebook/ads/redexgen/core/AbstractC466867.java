package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.67 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC466867 extends AbstractC5487Jg implements InterfaceC6327XQ {
    public static byte[] A0L;
    public static String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public RelativeLayout A00;
    public C6443ZI A01;

    @Nullable
    public InterfaceC6663cq A02;
    public C5258Fy A03;
    public C6743e8 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C6902gi A0B;
    public final C6329XS A0C;
    public final InterfaceC6406Yh A0D;
    public final C6618c7 A0E;
    public final AbstractC5147EA A0F;
    public final AbstractC5141E4 A0G;
    public final AbstractC5139E2 A0H;
    public final AbstractC5137E0 A0I;
    public final AbstractC5128Dr A0J;
    public final String A0K;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A03() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1X(C6902gi c6902gi);

    static {
        A03();
        A0O = (int) (AbstractC6334XX.A02 * 1.0f);
        A0P = (int) (AbstractC6334XX.A02 * 4.0f);
        A0N = (int) (AbstractC6334XX.A02 * 6.0f);
    }

    public AbstractC466867(C6618c7 c6618c7, boolean z, String str, C5258Fy c5258Fy) {
        super(c6618c7, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0J = new AbstractC5128Dr() { // from class: com.facebook.ads.redexgen.X.6C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5129Ds c5129Ds) {
                this.A00.A03.A0P().setVolume(this.A00.getVideoView().getVolume());
            }
        };
        this.A0F = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.6B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A03.A0N().AGM(((Integer) this.A00.getTag(-1593835536)).intValue());
            }
        };
        this.A0H = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.6A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                this.A00.A03.A0O().AGY(this.A00);
            }
        };
        this.A0G = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.69
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                this.A00.A03.A0O().AGW(this.A00);
            }
        };
        this.A0I = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.68
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.A07 = true;
                this.A00.A02();
            }
        };
        this.A0D = c6618c7.A0C();
        this.A0E = c6618c7;
        this.A03 = c5258Fy;
        this.A0K = str;
        this.A0B = c6618c7.A06();
        this.A0C = C6329XS.A00(c6618c7.A06(), c6618c7.A05(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        AbstractC6374YB.A0N(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if ((A1V() && this.A07) || (!A1V() && this.A06)) {
            this.A02.ACz();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        AbstractC6374YB.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final void A1C() {
        super.A1C();
        this.A0C.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public final boolean A1O() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
    public final void A1R() {
        if (A1V()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
    public final void A1S() {
        if (A1V()) {
            A1T();
            C6743e8 c6743e8 = this.A04;
            EnumC6789et enumC6789et = EnumC6789et.A02;
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "GrzUS";
            c6743e8.A05(enumC6789et);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
    public final void A1T() {
        float volume = this.A03.A0P().getVolume();
        if (A1V()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                C6743e8 c6743e8 = this.A04;
                if (A0M[5].length() == 9) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c6743e8.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
    public final boolean A1U() {
        if (A1V()) {
            boolean zA06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (zA06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
    public final boolean A1V() {
        return this.A05;
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A01(0, 13, 44));
    }

    public final void A1Y(Map<String, String> extraParams) {
        this.A04.A02();
        if (A1V()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C6743e8 getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A04(str, str2, null, true, false);
    }

    public void setCTAInfo(C5730Nc c5730Nc, Map<String, String> extraData) {
        getCtaButton().setCta(c5730Nc, this.A0K, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC5591LM(this.A01, this.A0B).A04().A06(new C5486Jf(this)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC6663cq interfaceC6663cq) {
        this.A02 = interfaceC6663cq;
    }

    public void setUpImageView(C6902gi c6902gi) {
        this.A01 = new C6443ZI(c6902gi);
        if (C6171Up.A1J(c6902gi)) {
            AbstractC6561bC.A00(this.A01, C6171Up.A1K(c6902gi), new ViewOnClickListenerC6669cw(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(C6902gi c6902gi) {
        this.A00 = new RelativeLayout(c6902gi);
        A04(this.A00);
        C6328XR c6328xrA02 = this.A0C.A02(this.A0E.A05());
        this.A0E.A06().A0H().A00(c6328xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A05().A1e() && C6171Up.A2w(this.A0B)) {
            this.A00.setOnClickListener(new ViewOnClickListenerC6668cv(this));
        } else {
            if (!c6328xrA02.A00) {
                return;
            }
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.cu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1W(view);
                }
            });
        }
    }

    public void setUpVideoView(C6902gi c6902gi) {
        this.A04 = new C6743e8(c6902gi, new C6200VI(this.A0K, getAdEventManager()));
        if (C6171Up.A1L(c6902gi)) {
            AbstractC6561bC.A00(this.A04, C6171Up.A1M(c6902gi), new ViewOnClickListenerC6670cx(this));
        }
        A04(this.A04);
    }

    private void setUpView(C6902gi c6902gi) {
        setUpImageView(c6902gi);
        setUpVideoView(c6902gi);
        setUpMediaContainer(c6902gi);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1X(c6902gi);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
