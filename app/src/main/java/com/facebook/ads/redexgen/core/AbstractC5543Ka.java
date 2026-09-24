package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.InterfaceC11381C9;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p300io.encoding.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ka */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5543Ka extends AbstractC6614c3 implements InterfaceC6327XQ {
    public static byte[] A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public C5123Dm A00;
    public C5102DR A01;
    public C5085DA A02;
    public final Handler A03;
    public final AbstractC7077jd A04;
    public final C5719NR A05;
    public final InterfaceC6406Yh A06;
    public final AbstractC6564bF A07;
    public final C6329XS A08;
    public final AtomicBoolean A09;

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0A = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, 63, 58, 60, 62, 59, 72, 72, 68, 7, 58, Base64.padSymbol, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, Base64.padSymbol, SignedBytes.MAX_POWER_OF_TWO, 76, 74, Ascii.f22503VT, 67, 62, SignedBytes.MAX_POWER_OF_TWO, 66, 63, 76, 76, 72, Ascii.f22503VT, 62, 65, 80, Ascii.f22503VT, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, Ascii.f22503VT, 67, 70, 75, 70, 80, 69, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 83, 70, 81, 86, Ascii.ETB, 10, Ascii.f22493FS, 6, Ascii.ETB, 9, 10, 9, 4, Ascii.ESC, Ascii.f22500SO, 9, 10, Ascii.DC4};
    }

    public abstract AbstractC6564bF A1R(C6618c7 c6618c7, C5719NR c5719nr, String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1U() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A1E());
        textView.setTextColor(-1);
        AbstractC6374YB.A0a(textView, true, 24);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC6332XV.A0q, 0, AbstractC6332XV.A0q, AbstractC6332XV.A0b);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C6595bk c6595bk = new C6595bk(super.A07.A06());
        c6595bk.setRadius(15);
        AbstractC6374YB.A0N(c6595bk, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0E, A0E);
        layoutParams3.gravity = 17;
        c6595bk.setLayoutParams(layoutParams3);
        new AsyncTaskC5591LM(c6595bk, super.A07.A06()).A05(A0E, A0E).A07(super.A07.A05().A2C().A01());
        TextView textView2 = new TextView(super.A07.A06());
        textView2.setText(String.format(Locale.US, super.A07.A05().A1F(), super.A07.A05().A29().A0I().A0G()));
        textView2.setTextColor(-1);
        AbstractC6374YB.A0a(textView2, false, 17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC6332XV.A0f, AbstractC6332XV.A0b, AbstractC6332XV.A0f, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c6595bk);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0J());
        if (this.A04.A2M() && this.A04.A2R()) {
            addView(A00(super.A07.A06(), super.A07.A05(), super.A07.A08(), EnumC6509aM.A07, super.A07.A0C()));
        }
        if (this.A04.A2W()) {
            addView(A01(super.A07.A06(), EnumC6509aM.A07));
        }
    }

    static {
        A0M();
        A0H = (int) (AbstractC6334XX.A02 * 48.0f);
        A0G = (int) (AbstractC6334XX.A02 * 80.0f);
        A0E = (int) (AbstractC6334XX.A02 * 120.0f);
        A0F = (int) (AbstractC6334XX.A02 * 128.0f);
        A0L = (int) (AbstractC6334XX.A02 * 16.0f);
        A0B = (int) (AbstractC6334XX.A02 * 4.0f);
        A0K = (int) (AbstractC6334XX.A02 * 44.0f);
        A0I = AbstractC6332XV.A0v;
        A0J = (int) (AbstractC6334XX.A02 * 12.0f);
        A0N = (int) (AbstractC6334XX.A02 * 12.0f);
        A0M = (int) (AbstractC6334XX.A02 * 26.0f);
        A0C = AbstractC5819P3.A02(-1, 77);
        A0D = AbstractC5819P3.A02(A0C, 90);
    }

    public AbstractC5543Ka(C6618c7 c6618c7, boolean z) {
        super(c6618c7, z);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A09 = new AtomicBoolean(false);
        this.A04 = c6618c7.A05();
        this.A08 = C6329XS.A00(c6618c7.A06(), this.A04, this);
        this.A05 = this.A04.A29();
        this.A07 = A0K(c6618c7);
        if (this.A04.A1w()) {
            this.A07.setVisibility(8);
        }
        AbstractC6400Yb abstractC6400YbA0B = c6618c7.A0B();
        this.A06 = c6618c7.A0C();
        if (abstractC6400YbA0B != null) {
            abstractC6400YbA0B.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC6400YbA0B.getToolbarHeight()));
            abstractC6400YbA0B.setPageDetailsVisible(false);
        }
    }

    private ImageView A0J() {
        ImageView imageView = new ImageView(super.A07.A06());
        imageView.setImageBitmap(Bitmap.createScaledBitmap(AbstractC6386YN.A01(EnumC6385YM.NAV_CROSS), AbstractC6332XV.A0e, AbstractC6332XV.A0e, true));
        imageView.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(AbstractC6332XV.A0Y, AbstractC6332XV.A0Y, AbstractC6332XV.A0Y, AbstractC6332XV.A0Y);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.by
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A1W(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC6332XV.A0r, AbstractC6332XV.A0b, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private AbstractC6564bF A0K(C6618c7 c6618c7) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A04.A1w()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c6618c7.A05().A10().equals(A0L(91, 14, 67))) {
            clickEvent = EnumC6795ez.A04.A03();
        } else {
            clickEvent = A0L(9, 37, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        }
        AbstractC6564bF abstractC6564bFA1R = A1R(c6618c7, this.A05, clickEvent);
        abstractC6564bFA1R.getCTAButton().getCtaActionHelper().A08(this.A04);
        abstractC6564bFA1R.getCTAButton().setCreativeAsCtaLoggingHelper(this.A08);
        this.A02 = new C5085DA(abstractC6564bFA1R, 400, 100, 0);
        AbstractC6374YB.A0K(abstractC6564bFA1R);
        abstractC6564bFA1R.A0l(c6618c7.A00());
        if (C6171Up.A17(c6618c7.A06())) {
            abstractC6564bFA1R.A0k();
            if (c6618c7.A0B() != null) {
                c6618c7.A0B().setCTAClickListener(getCtaButton());
            }
        }
        addView(abstractC6564bFA1R, layoutParams);
        abstractC6564bFA1R.getCTAButton().A0F(this.A04, c6618c7.A0B());
        return abstractC6564bFA1R;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public void A1C() {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        if (this.A04 != null && this.A04.A29().A0L() != null) {
            AbstractC6319XI.A06(super.A07.A06().A02(), this.A04.A29().A0L());
        }
        this.A08.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3
    public void A1H(C5719NR c5719nr, String str, double d, Bundle bundle) {
        super.A1H(c5719nr, str, d, bundle);
        this.A07.setInfo(c5719nr.A0I(), c5719nr.A0J(), str, this.A04.A2C().A01(), super.A07.A09(), null);
    }

    public final int A1Q(AbstractC6400Yb abstractC6400Yb) {
        return abstractC6400Yb == null ? AbstractC6400Yb.A00 : abstractC6400Yb.getToolbarHeight();
    }

    public void A1S() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C5123Dm(true, false);
            if (this.A01 != null) {
                this.A00.A0L(this.A01);
            }
            C5728Na c5728NaA01 = this.A04.A28().A01();
            this.A00.A0L(new C5086DB(getAdDetailsView().getCTAButton(), 300, -1, c5728NaA01.A0A(true)));
            Drawable startDrawable = AbstractC6374YB.A08(A0C, A0D, A0B);
            this.A00.A0L(new C5103DS(getAdDetailsView().getCTAButton(), 300, startDrawable, AbstractC6374YB.A05(c5728NaA01.A09(true), A0B)));
            this.A00.A0L(new C5101DQ(expandableLayout, 150, false));
            this.A00.A0K(InterfaceC11381C9.b.f24160g);
        }
    }

    public final void A1T() {
        LinearLayout linearLayout = new LinearLayout(super.A07.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A07.A06());
        textView.setText(super.A07.A05().A15());
        textView.setTextColor(-1);
        AbstractC6374YB.A0a(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0L, A0L, A0L, A0L);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C6589be c6589be = new C6589be(super.A07.A06(), 0, -13524404, EnumC6385YM.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0H, A0H);
        layoutParams3.gravity = 17;
        c6589be.setLayoutParams(layoutParams3);
        linearLayout.addView(c6589be);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1V(int i, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof AbstractC5589LK) {
            if ((getAdDetailsView() instanceof C46926V) || (getAdDetailsView() instanceof C46916U)) {
                AbstractC6374YB.A0J(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0l(i);
            ((AbstractC5589LK) getAdDetailsView()).A0y(viewGroup, relativeLayout, i);
        }
    }

    public final /* synthetic */ void A1W(View view) {
        this.A06.A4j(A0L(46, 45, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
    }

    public AbstractC7077jd getAdDataBundle() {
        return this.A04;
    }

    public C5085DA getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC6564bF getAdDetailsView() {
        return this.A07;
    }

    public C5719NR getAdInfo() {
        return this.A05;
    }

    public C5123Dm getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6614c3, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A09.get() && (this.A04.A29().A0K().A02().isEmpty() || this.A04.A29().A0K().A03() || this.A04.A1j())) {
            return;
        }
        getAdDetailsView().A0l(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View expandableLayout;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04.A29().A0K().A03() && !this.A04.A1j() && !this.A04.A1w() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z && this.A01 == null) {
            this.A01 = new C5102DR(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0L(this.A01);
            this.A00.A0J();
        }
    }
}
