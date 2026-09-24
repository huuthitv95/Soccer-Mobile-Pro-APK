package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7994v;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.p278ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.o */
/* JADX INFO: loaded from: classes4.dex */
public class C8891o extends AbstractC8888l {

    /* JADX INFO: renamed from: K */
    public ViewGroup f20903K;

    /* JADX INFO: renamed from: L */
    public TextView f20904L;

    /* JADX INFO: renamed from: M */
    public TextView f20905M;

    /* JADX INFO: renamed from: N */
    public ImageView f20906N;

    /* JADX INFO: renamed from: O */
    public ImageView f20907O;

    /* JADX INFO: renamed from: P */
    public IAsmoothProgressBar f20908P;

    /* JADX INFO: renamed from: Q */
    public View f20909Q;

    /* JADX INFO: renamed from: R */
    public View f20910R;

    /* JADX INFO: renamed from: S */
    public View f20911S;

    /* JADX INFO: renamed from: T */
    public TextView f20912T;

    /* JADX INFO: renamed from: U */
    public TextView f20913U;

    public C8891o(Context context, C8121g c8121g, InterfaceC8877a interfaceC8877a, C8006r c8006r, boolean z, String str) {
        super(context, c8121g, interfaceC8877a, c8006r, str);
        this.f20909Q = null;
        this.f20893A.inflate(C7809R.layout.ia_layout_video_view, (ViewGroup) this, true);
        mo21460q();
        C8121g c8121g2 = this.f20894B;
        if (c8121g2 != null) {
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = c8121g2.f18072d;
            iFyberAdIdentifier.f21412k = corner;
            iFyberAdIdentifier.mo21932a(this);
        }
        mo21457h(z);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l
    /* JADX INFO: renamed from: a */
    public final void mo21455a(int i) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f20908P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setProgress(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8888l, com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21432a(int i, int i2) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f20908P;
        if (iAsmoothProgressBar == null) {
            return;
        }
        iAsmoothProgressBar.setMax(i);
        super.mo21432a(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21435a(boolean z) {
        View view = this.f20910R;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21437a(boolean z, EnumC8253m enumC8253m) {
        String localizedCtaButtonText;
        Boolean boolMo20420c;
        TextView textView = this.f20905M;
        if (textView != null) {
            C8006r c8006r = this.f20967w;
            textView.setAllCaps((c8006r == null || c8006r.m20432a(C7994v.class) == null || (boolMo20420c = ((C7994v) this.f20967w.m20432a(C7994v.class)).mo20420c("cta_text_all_caps")) == null) ? false : boolMo20420c.booleanValue());
            TextView textView2 = this.f20905M;
            if (IAConfigManager.f17654M.f17660D.m20650n()) {
                enumC8253m.getClass();
                if (enumC8253m == EnumC8253m.TRUE_SINGLE_TAP) {
                    localizedCtaButtonText = getContext().getString(C7809R.string.ia_video_instant_install_text);
                } else {
                    localizedCtaButtonText = getLocalizedCtaButtonText();
                    if (TextUtils.isEmpty(localizedCtaButtonText)) {
                        localizedCtaButtonText = getContext().getString(C7809R.string.ia_video_install_now_text);
                    }
                }
            } else {
                localizedCtaButtonText = getLocalizedCtaButtonText();
                if (TextUtils.isEmpty(localizedCtaButtonText)) {
                    localizedCtaButtonText = getContext().getString(C7809R.string.ia_video_install_now_text);
                }
            }
            if (!TextUtils.isEmpty(this.f20968x)) {
                localizedCtaButtonText = this.f20968x;
            }
            textView2.setText(localizedCtaButtonText);
            this.f20905M.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: a */
    public final void mo21438a(boolean z, String str) {
        TextView textView;
        TextView textView2 = this.f20904L;
        if (textView2 != null) {
            textView2.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.f20904L);
            }
            if (z && (textView = this.f20905M) != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -2;
                this.f20905M.setLayoutParams(layoutParams);
                this.f20905M.setTextSize(0, getResources().getDimension(C7809R.dimen.ia_video_overlay_text_large_for_cta));
            }
            this.f20904L.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: a */
    public boolean mo21439a() {
        TextView textView = this.f20913U;
        return textView != null && textView.getVisibility() == 0 && this.f20913U.isEnabled();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: b */
    public final void mo21440b(boolean z) {
        TextView textView = this.f20912T;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: c */
    public final void mo21441c(boolean z) {
        ViewGroup viewGroup = this.f20903K;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    /* JADX INFO: renamed from: d */
    public final void mo21428d() {
        this.f20883h = true;
        mo21449j();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: d */
    public final void mo21442d(boolean z) {
        ImageView imageView = this.f20906N;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s, com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    public final void destroy() {
        super.destroy();
        RunnableC8887k runnableC8887k = this.f20897E;
        if (runnableC8887k != null) {
            removeCallbacks(runnableC8887k);
            this.f20897E = null;
        }
        m21458p();
        ViewGroup viewGroup = this.f20957m;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e
    /* JADX INFO: renamed from: e */
    public final void mo21429e() {
        this.f20883h = false;
        mo21450k();
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: e */
    public final void mo21443e(boolean z) {
        View view = this.f20911S;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: f */
    public final void mo21444f(boolean z) {
        IAsmoothProgressBar iAsmoothProgressBar = this.f20908P;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: g */
    public final void mo21446g(boolean z) {
        TextView textView = this.f20913U;
        if (textView != null) {
            textView.setVisibility(z ? 0 : 4);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyView() {
        return new View[]{this.f20905M, this.f20912T, this.f20913U, this.f20906N, this.f20908P, this.f20909Q, this.f20966v};
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return new View[]{this.f20904L, this.f20903K};
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: h */
    public final void mo21447h() {
        TextView textView = this.f20913U;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: i */
    public final void mo21448i() {
        mo21446g(false);
        mo21442d(false);
        mo21444f(false);
        TextView textView = this.f20905M;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.f20907O;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        mo21441c(false);
        mo21438a(false, (String) null);
        mo21440b(false);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: l */
    public final boolean mo21451l() {
        return this.f20912T == null && this.f20908P == null;
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: m */
    public final void mo21452m() {
        ImageView imageView = this.f20907O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f20907O.setSelected(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    /* JADX INFO: renamed from: n */
    public final void mo21453n() {
        ImageView imageView = this.f20907O;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.f20907O.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo21460q() {
        this.f20957m = (ViewGroup) findViewById(C7809R.id.ia_texture_view_host);
        this.f20962r = (ViewGroup) findViewById(C7809R.id.ia_default_endcard_video_overlay);
        this.f20963s = (ViewGroup) findViewById(C7809R.id.ia_endcard_video_overlay);
        this.f20958n = (Button) findViewById(C7809R.id.ia_b_end_card_call_to_action);
        TextView textView = (TextView) findViewById(C7809R.id.ia_endcard_tv_app_info_button);
        this.f20966v = textView;
        m21467a(textView, 10);
        m21467a(this.f20958n, 8);
        m21467a(this.f20957m, 7);
        m21467a(this.f20962r, -1);
        this.f20907O = (ImageView) findViewById(C7809R.id.ia_iv_expand_collapse_button);
        this.f20911S = findViewById(C7809R.id.ia_paused_video_overlay);
        this.f20904L = (TextView) findViewById(C7809R.id.ia_tv_app_info_button);
        this.f20905M = (TextView) findViewById(C7809R.id.ia_tv_call_to_action);
        this.f20908P = (IAsmoothProgressBar) findViewById(C7809R.id.ia_video_progressbar);
        this.f20903K = (ViewGroup) findViewById(C7809R.id.ia_identifier_overlay);
        this.f20909Q = findViewById(C7809R.id.ia_click_overlay);
        this.f20908P.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(C7809R.id.ia_iv_mute_button);
        this.f20906N = imageView;
        imageView.setVisibility(0);
        this.f20910R = findViewById(C7809R.id.ia_buffering_overlay);
        this.f20912T = (TextView) findViewById(C7809R.id.ia_tv_remaining_time);
        this.f20913U = (TextView) findViewById(C7809R.id.ia_tv_skip);
        m21467a(this, 7);
        m21467a(this.f20905M, 3);
        m21467a(this.f20906N, 1);
        m21467a(this.f20904L, 10);
        m21467a(this.f20907O, 5);
        m21467a(this.f20911S, 9);
        m21467a(this.f20913U, 6);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setAppInfoButtonRound(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(C7809R.drawable.ia_bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(C7809R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(C7809R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setMuteButtonState(boolean z) {
        ImageView imageView = this.f20906N;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setRemainingTime(String str) {
        TextView textView = this.f20912T;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s
    public void setSkipText(String str) {
        if (this.f20913U != null) {
            try {
                Integer.parseInt(str);
                int i = C7809R.string.ia_video_before_skip_format;
                str = String.format(Locale.US, IAConfigManager.f17654M.f17689u.m20436a().getString(i), Integer.valueOf(Integer.parseInt(str)));
            } catch (Exception unused) {
            }
            this.f20913U.setText(str);
        }
    }
}
