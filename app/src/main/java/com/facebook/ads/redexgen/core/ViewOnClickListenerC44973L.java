package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3L */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC44973L extends AbstractC5150ED implements View.OnClickListener {
    public final AbstractC5147EA A00;
    public final AbstractC5141E4 A01;
    public final AbstractC5139E2 A02;
    public final AbstractC5137E0 A03;
    public final C6814fI A04;

    public ViewOnClickListenerC44973L(C6902gi c6902gi) {
        this(c6902gi, null);
    }

    public ViewOnClickListenerC44973L(C6902gi c6902gi, AttributeSet attributeSet) {
        this(c6902gi, attributeSet, 0);
    }

    public ViewOnClickListenerC44973L(C6902gi c6902gi, AttributeSet attributeSet, int i) {
        super(c6902gi, attributeSet, i);
        this.A03 = new AbstractC5137E0() { // from class: com.facebook.ads.redexgen.X.3R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5138E1 c5138e1) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new AbstractC5141E4() { // from class: com.facebook.ads.redexgen.X.3Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45484B c45484b) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new AbstractC5139E2() { // from class: com.facebook.ads.redexgen.X.3O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5140E3 c5140e3) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new AbstractC5147EA() { // from class: com.facebook.ads.redexgen.X.3M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C45574K c45574k) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C6814fI(c6902gi);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5150ED
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC5150ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC6271WU.A02(this)) {
            return;
        }
        try {
            C5183Ek videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC6844fm.A07 || videoView.getState() == EnumC6844fm.A05 || videoView.getState() == EnumC6844fm.A06) {
                videoView.A0e(EnumC6789et.A04, 11);
            } else if (videoView.getState() == EnumC6844fm.A0A) {
                videoView.A0i(true, 7);
            }
        } catch (Throwable th) {
            AbstractC6271WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
