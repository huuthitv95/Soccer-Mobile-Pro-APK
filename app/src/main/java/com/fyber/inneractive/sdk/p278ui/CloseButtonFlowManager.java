package com.fyber.inneractive.sdk.p278ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.ViewOnClickListenerC7814d;
import com.fyber.inneractive.sdk.flow.storepromo.observer.C8214b;
import com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: loaded from: classes4.dex */
public class CloseButtonFlowManager implements InterfaceC8213a, CloseButtonConfigurationChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f21383a;

    /* JADX INFO: renamed from: b */
    public final TextView f21384b;

    /* JADX INFO: renamed from: c */
    public final View f21385c;

    /* JADX INFO: renamed from: d */
    public final ImageView f21386d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f21387e;

    /* JADX INFO: renamed from: f */
    public boolean f21388f = false;

    /* JADX INFO: renamed from: g */
    public final CloseButtonConfiguration f21389g = new CloseButtonConfiguration(this);

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity, ViewOnClickListenerC7814d viewOnClickListenerC7814d) {
        View viewFindViewById = inneractiveFullscreenAdActivity.findViewById(C7809R.id.ia_fl_close_button);
        this.f21383a = viewFindViewById;
        this.f21384b = (TextView) inneractiveFullscreenAdActivity.findViewById(C7809R.id.ia_tv_close_button);
        View viewFindViewById2 = inneractiveFullscreenAdActivity.findViewById(C7809R.id.ia_clickable_close_button);
        this.f21385c = viewFindViewById2;
        this.f21386d = (ImageView) inneractiveFullscreenAdActivity.findViewById(C7809R.id.ia_iv_close_button);
        this.f21387e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(C7809R.id.close_button_container);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setOnClickListener(viewOnClickListenerC7814d);
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.InterfaceC8213a
    /* JADX INFO: renamed from: a */
    public final void mo20621a(C8214b c8214b) {
        CloseButtonConfiguration closeButtonConfiguration = this.f21389g;
        closeButtonConfiguration.f21381f = c8214b.f18307a;
        closeButtonConfiguration.f21382g.mo21929a(closeButtonConfiguration);
    }

    @Override // com.fyber.inneractive.sdk.p278ui.CloseButtonConfigurationChangeListener
    /* JADX INFO: renamed from: a */
    public final void mo21929a(CloseButtonConfiguration closeButtonConfiguration) {
        int i;
        int i2;
        if (closeButtonConfiguration.f21381f) {
            this.f21383a.setVisibility(8);
            this.f21384b.setVisibility(8);
            this.f21386d.setVisibility(8);
            this.f21385c.setVisibility(8);
            return;
        }
        CloseButtonConfiguration closeButtonConfiguration2 = this.f21389g;
        if (closeButtonConfiguration2.f21377b) {
            if (!closeButtonConfiguration2.f21378c || this.f21388f) {
                this.f21383a.setAlpha(1.0f);
                this.f21386d.setAlpha(1.0f);
            } else {
                this.f21383a.setAlpha(0.0f);
                this.f21386d.setAlpha(0.0f);
            }
            this.f21384b.setText("");
            this.f21384b.setVisibility(8);
            int i3 = closeButtonConfiguration2.f21379d;
            if (i3 >= 5) {
                int iM21988a = AbstractC9174o.m21988a(i3);
                this.f21386d.getLayoutParams().width = iM21988a;
                this.f21386d.getLayoutParams().height = iM21988a;
            }
            int i4 = closeButtonConfiguration2.f21380e;
            if (i4 >= 5) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21386d.getLayoutParams();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f21383a.getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f21385c.getLayoutParams();
                int iM21988a2 = AbstractC9174o.m21988a(i4);
                int i5 = layoutParams.width;
                int i6 = iM21988a2 - i5;
                if (iM21988a2 <= i5 || i6 <= (i2 = layoutParams2.rightMargin)) {
                    layoutParams3.width = iM21988a2;
                    layoutParams3.height = iM21988a2;
                    i = layoutParams2.rightMargin;
                    if (i6 < i) {
                        i -= i6 / 2;
                    }
                } else {
                    int i7 = (i5 / 2) + (iM21988a2 / 2) + i2;
                    layoutParams3.width = i7;
                    layoutParams3.height = i7;
                    layoutParams2.gravity = 53;
                    i = 0;
                }
                layoutParams3.setMargins(i, i, i, i);
                layoutParams3.gravity = 17;
            }
        }
        this.f21383a.setVisibility((closeButtonConfiguration.f21376a || closeButtonConfiguration.f21377b) ? 0 : 8);
        this.f21384b.setVisibility(closeButtonConfiguration.f21376a ? 0 : 8);
        int i8 = closeButtonConfiguration.f21377b ? 0 : 8;
        this.f21386d.setVisibility(i8);
        this.f21385c.setVisibility(i8);
        this.f21385c.setEnabled(closeButtonConfiguration.f21377b);
    }
}
