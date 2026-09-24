package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6743e8 extends FrameLayout {
    public static final int A08 = AbstractC6332XV.A0b;
    public C47016e A00;
    public C5193Eu A01;
    public C45584L A02;
    public C5116Df A03;
    public C45043S A04;
    public C448234 A05;
    public final C6902gi A06;
    public final C6200VI A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A04(InterfaceC6192VA interfaceC6192VA, String str, Map<String, String> map) {
        A02();
        this.A02 = new C45584L(this.A06, interfaceC6192VA, this.A00, str, null, map);
        if (C6171Up.A20(this.A06)) {
            this.A01 = new C5193Eu(this.A06, interfaceC6192VA, this.A00, str, false, this.A02, map);
        } else {
            this.A01 = null;
        }
    }

    public C6743e8(C6902gi c6902gi, C6200VI c6200vi) {
        super(c6902gi);
        this.A07 = c6200vi;
        this.A06 = c6902gi;
        setUpView(c6902gi);
    }

    public final void A01() {
        A0i(true, 10);
    }

    public final void A02() {
        if (this.A01 != null) {
            this.A01.A07();
            this.A01 = null;
        }
        if (this.A02 != null) {
            this.A02.A0p();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC6143UN abstractC6143UN) {
        getEventBus().A05(abstractC6143UN);
    }

    public final void A05(EnumC6789et enumC6789et) {
        A0e(enumC6789et, 13);
    }

    public final boolean A06() {
        return A0p();
    }

    public C5183Ek getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C6902gi c6902gi) {
        A0Y();
        this.A04 = new C45043S(c6902gi);
        A0f(this.A04);
        this.A03 = new C5116Df(c6902gi, this.A07);
        A0f(new C45273q(c6902gi));
        A0f(this.A03);
        this.A05 = new C448234(c6902gi, true, this.A07);
        A0f(this.A05);
        A0f(new C5118Dh(this.A05, EnumC6805f9.A02, true, true));
        if (!A0k()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        layoutParams.setMargins(A08, A08, A08, A08);
        this.A03.setLayoutParams(layoutParams);
        addView(this.A03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6e] */
    private void setUpVideo(final C6902gi c6902gi) {
        this.A00 = new C5183Ek(c6902gi) { // from class: com.facebook.ads.redexgen.X.6e
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int i, int i2) {
                int newWidthSpec = View.MeasureSpec.getMode(i);
                if (newWidthSpec == 1073741824) {
                    i2 = i;
                } else {
                    int newWidthSpec2 = View.MeasureSpec.getMode(i2);
                    if (newWidthSpec2 == 1073741824) {
                        i = i2;
                    }
                }
                super.onMeasure(i, i2);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AbstractC6374YB.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC6742e7(this));
    }

    private void setUpView(C6902gi c6902gi) {
        setUpVideo(c6902gi);
        setUpPlugins(c6902gi);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A03.A09();
    }
}
