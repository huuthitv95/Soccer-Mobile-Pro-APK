package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3190di;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class ihz {

    /* JADX INFO: renamed from: ac */
    private View f8810ac;

    /* JADX INFO: renamed from: aw */
    private ImageView f8811aw;

    /* JADX INFO: renamed from: ay */
    private C3191fi f8812ay;

    /* JADX INFO: renamed from: bu */
    private C3347di.ri f8813bu;

    /* JADX INFO: renamed from: co */
    private ImageView f8814co;

    /* JADX INFO: renamed from: di */
    private final RelativeLayout f8815di;

    /* JADX INFO: renamed from: fi */
    C2927ac f8816fi;
    private ImageView jbs;

    /* JADX INFO: renamed from: lr */
    TTAdDislikeToast f8819lr;

    /* JADX INFO: renamed from: mj */
    private final Context f8820mj;

    /* JADX INFO: renamed from: nr */
    private final String f8821nr;

    /* JADX INFO: renamed from: qt */
    private C3190di f8822qt;

    /* JADX INFO: renamed from: ri */
    C2931bu f8823ri;

    /* JADX INFO: renamed from: sf */
    private ImageView f8824sf;
    private final C2634di slm;
    private boolean tan;

    /* JADX INFO: renamed from: uq */
    private TextView f8825uq;

    /* JADX INFO: renamed from: vr */
    private boolean f8826vr;
    private TextView wjv;
    private final wjv xha;

    /* JADX INFO: renamed from: ik */
    final AtomicBoolean f8817ik = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ka */
    final AtomicBoolean f8818ka = new AtomicBoolean(false);
    private boolean ihz = false;
    private final int bgr = C3583qd.m16589lr(C3299nr.m14642ri(), 44.0f);

    public ihz(Context context, RelativeLayout relativeLayout, wjv wjvVar, C2634di c2634di, String str, boolean z) {
        this.f8820mj = context;
        this.f8815di = relativeLayout;
        this.xha = wjvVar;
        this.slm = c2634di;
        this.f8821nr = str;
        this.tan = z;
        this.f8816fi = new C2927ac(context, this.tan);
        xha();
        m11326mj();
    }

    private void jbs() {
        try {
            if (this.f8823ri == null) {
                C2931bu c2931bu = new C2931bu(this.f8820mj, this.xha);
                this.f8823ri = c2931bu;
                c2931bu.setDislikeSource("landing_page");
                this.f8823ri.setCallback(new C2931bu.ri() { // from class: com.bytedance.sdk.openadsdk.common.ihz.2
                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: lr */
                    public void mo10546lr(View view) {
                        ihz.this.f8817ik.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10547ri(View view) {
                        ihz.this.f8817ik.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.C2931bu.ri
                    /* JADX INFO: renamed from: ri */
                    public void mo10548ri(FilterWord filterWord) {
                        if (ihz.this.f8818ka.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        ihz.this.f8818ka.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.f8815di.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.f8823ri);
            if (this.f8819lr == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.f8820mj);
                this.f8819lr = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    /* JADX INFO: renamed from: ka */
    private boolean m11323ka(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (Character.getDirectionality(c) == 1 || Character.getDirectionality(c) == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: mj */
    private void m11326mj() {
        View view = this.f8810ac;
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m11330ri(view2);
            }
        });
    }

    /* JADX INFO: renamed from: qt */
    private void m11327qt() {
        this.f8819lr.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11329ri(int i) {
        ImageView imageView = this.jbs;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        ImageView imageView2 = this.f8824sf;
        if (imageView2 != null) {
            imageView2.setVisibility(i);
        }
        ImageView imageView3 = this.f8814co;
        if (imageView3 != null) {
            imageView3.setVisibility(i);
        }
        ImageView imageView4 = this.f8811aw;
        if (imageView4 != null) {
            imageView4.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public /* synthetic */ void m11330ri(View view) {
        if (this.ihz) {
            m11343ri();
            this.ihz = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m11331ri(final C2927ac c2927ac, View view) {
        c2927ac.setOnMenuItemClickListener(new C2927ac.ri() { // from class: com.bytedance.sdk.openadsdk.common.ihz.6
            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ik */
            public void mo10652ik() {
                if (ihz.this.slm != null) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = ihz.this.slm.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        C2722lr.m10241ri(ihz.this.f8820mj, intent, null);
                    }
                    c2927ac.m11239ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ka */
            public void mo10653ka() {
                if (!ihz.this.tan) {
                    ihz.this.m11336di();
                }
                c2927ac.m11239ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: lr */
            public void mo10654lr() {
                ClipboardManager clipboardManager;
                if (ihz.this.slm != null) {
                    String url = ihz.this.slm.getWebView().getUrl();
                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) ihz.this.f8820mj.getSystemService("clipboard")) != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                    }
                }
                c2927ac.m11239ri();
            }

            @Override // com.bytedance.sdk.openadsdk.common.C2927ac.ri
            /* JADX INFO: renamed from: ri */
            public void mo10655ri() {
                if (ihz.this.slm != null) {
                    ihz.this.slm.m9778mj();
                    if (ihz.this.f8822qt != null) {
                        ihz.this.f8822qt.setVisibility(0);
                        ihz.this.f8822qt.setProgress(0);
                    }
                    c2927ac.m11239ri();
                }
            }
        });
        c2927ac.m11240ri(view);
    }

    /* JADX INFO: renamed from: sf */
    private boolean m11335sf() {
        return this.f8820mj.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void xha() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8815di.getLayoutParams();
        layoutParams.height = this.bgr;
        this.f8815di.setLayoutParams(layoutParams);
        int iM16589lr = C3583qd.m16589lr(this.f8820mj, 8.0f);
        this.f8815di.setPadding(iM16589lr, 0, iM16589lr, 0);
        this.jbs = (ImageView) this.f8815di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.saa);
        this.f8824sf = (ImageView) this.f8815di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13306ud);
        this.f8814co = (ImageView) this.f8815di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.hpn);
        this.f8811aw = (ImageView) this.f8815di.findViewById(520093740);
        C3191fi c3191fi = (C3191fi) this.f8815di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13291pc);
        this.f8812ay = c3191fi;
        this.f8825uq = (TextView) c3191fi.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13297ri);
        this.wjv = (TextView) this.f8812ay.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13284lr);
        if (m11335sf()) {
            this.f8825uq.setTextDirection(4);
            this.wjv.setTextDirection(4);
            this.f8825uq.setGravity(8388629);
            this.wjv.setGravity(8388629);
            this.f8824sf.setImageResource(C2729uq.m10305ka(this.f8820mj, "tt_titlebar_forward"));
            this.f8814co.setImageResource(C2729uq.m10305ka(this.f8820mj, "tt_titlebar_backward"));
        }
        this.f8822qt = (C3190di) this.f8815di.findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13313xe);
        this.f8814co.setVisibility(0);
        this.f8824sf.setVisibility(0);
        this.jbs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm != null) {
                    ihz.this.slm.xha();
                    ihz.this.slm.removeAllViews();
                    ViewGroup viewGroup = (ViewGroup) ihz.this.slm.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(ihz.this.slm);
                    }
                    ihz.this.slm.slm();
                }
                if (ihz.this.f8820mj instanceof Activity) {
                    ((Activity) ihz.this.f8820mj).finish();
                }
            }
        });
        this.f8824sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm == null || !ihz.this.slm.jbs()) {
                    return;
                }
                if (ihz.this.f8813bu != null) {
                    ihz.this.f8813bu.mo15059ri();
                }
                ihz.this.slm.m9780qt();
            }
        });
        this.f8814co.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ihz.this.slm == null || !ihz.this.slm.m9789sf()) {
                    return;
                }
                ihz.this.slm.m9771co();
            }
        });
        this.f8811aw.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ihz ihzVar = ihz.this;
                ihzVar.m11331ri(ihzVar.f8816fi, view);
            }
        });
        m11346ri(true);
        this.f8824sf.setClickable(false);
        this.f8814co.setClickable(false);
        this.f8824sf.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f8814co.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f8810ac = this.f8815di;
    }

    /* JADX INFO: renamed from: di */
    protected void m11336di() {
        if (this.f8818ka.get()) {
            m11327qt();
            return;
        }
        if (this.f8823ri == null) {
            jbs();
        }
        C2931bu c2931bu = this.f8823ri;
        if (c2931bu != null) {
            c2931bu.m11274ri();
        }
    }

    /* JADX INFO: renamed from: fi */
    public TextView m11337fi() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: ik */
    public ImageView m11338ik() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ik */
    public String m11339ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String host = Uri.parse(str).getHost();
            if (!TextUtils.isEmpty(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: ka */
    public TextView m11340ka() {
        return this.f8825uq;
    }

    /* JADX INFO: renamed from: lr */
    public void m11341lr() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8815di.getLayoutParams();
            if (this.f8826vr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.bgr;
            if (i == i2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i2 / 2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.9
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ihz.this.f8815di.setLayoutParams(layoutParams);
                        ihz.this.f8815di.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ihz.this.f8826vr = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ihz.this.f8826vr = true;
                        ihz.this.m11329ri(8);
                        ihz.this.m11346ri(false);
                        ihz.this.ihz = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m11342lr(String str) {
        String strM11339ik = m11339ik(str);
        TextView textView = this.wjv;
        if (!TextUtils.isEmpty(strM11339ik)) {
            str = strM11339ik;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m11343ri() {
        try {
            final RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f8815di.getLayoutParams();
            if (this.f8826vr) {
                return;
            }
            int i = layoutParams.height;
            int i2 = this.bgr;
            if (i == i2 / 2) {
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2 / 2, i2);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ihz.this.f8815di.setLayoutParams(layoutParams);
                        ihz.this.f8815di.requestLayout();
                    }
                });
                valueAnimatorOfInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.ihz.8
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        ihz.this.f8826vr = false;
                        ihz.this.m11329ri(0);
                        ihz.this.m11346ri(true);
                        ihz.this.ihz = false;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        ihz.this.f8826vr = true;
                    }
                });
                valueAnimatorOfInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11344ri(WebView webView, C3347di.ri riVar) {
        this.f8813bu = riVar;
        try {
            if (this.f8824sf != null) {
                if (webView.canGoBack()) {
                    this.f8824sf.setClickable(true);
                    this.f8824sf.clearColorFilter();
                } else {
                    this.f8824sf.setClickable(false);
                    this.f8824sf.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f8814co != null) {
                if (webView.canGoForward()) {
                    this.f8814co.setClickable(true);
                    this.f8814co.clearColorFilter();
                } else {
                    this.f8814co.setClickable(false);
                    this.f8814co.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11345ri(String str) {
        this.f8825uq.setText(str);
    }

    /* JADX INFO: renamed from: ri */
    void m11346ri(boolean z) {
        if (this.f8825uq == null || this.wjv == null) {
            return;
        }
        String string = m11340ka().getText().toString();
        String strReplaceAll = TextUtils.isEmpty(string) ? " " : string.replaceAll("[\n\r]+", " ");
        String string2 = m11337fi().getText().toString();
        this.f8825uq.setText(strReplaceAll);
        this.wjv.setText(string2);
        if (z) {
            this.f8825uq.setVisibility(0);
            C3191fi c3191fi = this.f8812ay;
            if (c3191fi != null) {
                ViewGroup.LayoutParams layoutParams = c3191fi.getLayoutParams();
                layoutParams.width = -2;
                this.f8812ay.setLayoutParams(layoutParams);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f8815di.getLayoutParams();
            layoutParams2.height = this.bgr;
            this.f8815di.setLayoutParams(layoutParams2);
            return;
        }
        this.f8825uq.setVisibility(8);
        C3191fi c3191fi2 = this.f8812ay;
        if (c3191fi2 != null) {
            ViewGroup.LayoutParams layoutParams3 = c3191fi2.getLayoutParams();
            layoutParams3.width = -1;
            this.f8812ay.setLayoutParams(layoutParams3);
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f8815di.getLayoutParams();
        layoutParams4.height = this.bgr / 2;
        this.f8815di.setLayoutParams(layoutParams4);
    }
}
