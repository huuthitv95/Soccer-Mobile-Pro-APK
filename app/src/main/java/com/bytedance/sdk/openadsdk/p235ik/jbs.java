package com.bytedance.sdk.openadsdk.p235ik;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends C3192ik implements C3386qt.ik, C3386qt.ka, C3386qt.lr, C3386qt.ri {

    /* JADX INFO: renamed from: aw */
    private int f12015aw;
    private FilterWord bgr;

    /* JADX INFO: renamed from: co */
    private int f12016co;

    /* JADX INFO: renamed from: di */
    private TextView f12017di;

    /* JADX INFO: renamed from: fi */
    private C3195mj f12018fi;

    /* JADX INFO: renamed from: ik */
    private int f12019ik;
    private View jbs;

    /* JADX INFO: renamed from: ka */
    private final C3386qt f12020ka;

    /* JADX INFO: renamed from: lr */
    private int f12021lr;

    /* JADX INFO: renamed from: mj */
    private View f12022mj;

    /* JADX INFO: renamed from: qt */
    private C3193ka f12023qt;

    /* JADX INFO: renamed from: ri */
    C3375di f12024ri;

    /* JADX INFO: renamed from: sf */
    private C3195mj f12025sf;
    private C3388sf xha;

    public jbs(Context context, C3386qt c3386qt) {
        this(context, c3386qt, null);
    }

    public jbs(Context context, C3386qt c3386qt, List<FilterWord> list) {
        super(context);
        this.f12020ka = c3386qt;
        c3386qt.m15330ri((C3386qt.ik) this);
        c3386qt.m15332ri((C3386qt.lr) this);
        c3386qt.m15331ri((C3386qt.ka) this);
        c3386qt.m15333ri((C3386qt.ri) this);
        m15294ik();
        m15300ri(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        m15298lr(list);
    }

    /* JADX INFO: renamed from: ik */
    private View m15293ik(Context context) {
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c3191fi.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(C2729uq.m10311ri(context, "tt_like_this_ad"));
        textView.setTextSize(m15296ka() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        c3191fi.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(C2729uq.m10311ri(context, "tt_feel_hint"));
        textView2.setTextSize(m15296ka() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (m15296ka()) {
            layoutParams2.topMargin = C3583qd.m16589lr(context, 4.0f);
        }
        c3191fi.addView(textView2, layoutParams2);
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iM16589lr = C3583qd.m16589lr(context, 16.0f);
        int iM16589lr2 = C3583qd.m16589lr(context, 12.0f);
        int iM16589lr3 = C3583qd.m16589lr(context, 8.0f);
        if (m15296ka()) {
            layoutParams3.topMargin = iM16589lr;
            layoutParams3.bottomMargin = iM16589lr;
        } else {
            layoutParams3.topMargin = iM16589lr2;
            layoutParams3.bottomMargin = iM16589lr3;
        }
        c3191fi.addView(c3191fi2, layoutParams3);
        c3191fi2.addView(new ViewOnClickListenerC3376fi(context, 1, this.f12020ka));
        ViewOnClickListenerC3376fi viewOnClickListenerC3376fi = new ViewOnClickListenerC3376fi(context, 2, this.f12020ka);
        ViewGroup.LayoutParams layoutParams4 = viewOnClickListenerC3376fi.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iM16589lr;
        layoutParams7.rightMargin = iM16589lr;
        c3191fi2.addView(viewOnClickListenerC3376fi, layoutParams5);
        c3191fi2.addView(new ViewOnClickListenerC3376fi(context, 3, this.f12020ka));
        C3388sf c3388sf = new C3388sf(context);
        this.xha = c3388sf;
        c3191fi.addView(c3388sf);
        this.f12017di = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!m15296ka()) {
            iM16589lr = iM16589lr3;
        }
        layoutParams8.topMargin = iM16589lr;
        this.f12017di.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f12017di.setPadding(iM16589lr2, iM16589lr3, iM16589lr2, iM16589lr3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iM16589lr3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.f12017di.setBackground(gradientDrawable);
        this.f12017di.setText(C2729uq.m10311ri(context, "tt_report_this_ad"));
        this.f12017di.setTextSize(m15296ka() ? 14 : 12);
        Drawable drawableM10303ik = C2729uq.m10303ik(context, "tt_report_ad_arrow");
        drawableM10303ik.setBounds(0, 0, iM16589lr2, iM16589lr2);
        this.f12017di.setCompoundDrawables(null, null, drawableM10303ik, null);
        this.f12017di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.m15302ri();
            }
        });
        c3191fi.addView(this.f12017di, layoutParams8);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ik */
    private void m15294ik() {
        if (this.f12016co > 0) {
            return;
        }
        this.f12016co = C3583qd.m16580ik(getContext());
        int iM16578fi = C3583qd.m16578fi(getContext());
        this.f12015aw = iM16578fi;
        this.f12020ka.m15327ri(this.f12016co, iM16578fi);
    }

    /* JADX INFO: renamed from: ka */
    private View m15295ka(Context context) {
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setOrientation(1);
        c3191fi.setLayoutParams(new LinearLayout.LayoutParams(-1, !m15296ka() ? C3583qd.m16589lr(context, 200.0f) : C3583qd.m16589lr(context, 358.0f)));
        TextView textView = new TextView(context);
        textView.setText(C2729uq.m10311ri(context, "tt_select_reason"));
        textView.setTextSize(m15296ka() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = C3583qd.m16589lr(context, m15296ka() ? 24.0f : 4.0f);
        c3191fi.addView(textView, layoutParams);
        C3375di c3375di = new C3375di(context, this.f12020ka);
        this.f12024ri = c3375di;
        c3191fi.addView(c3375di);
        C3195mj c3195mj = new C3195mj(context);
        this.f12025sf = c3195mj;
        c3195mj.setId(slm.f13258cm);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = m15296ka() ? this.f12021lr : C3583qd.m16589lr(context, 6.0f);
        layoutParams2.gravity = 17;
        this.f12025sf.setLayoutParams(layoutParams2);
        this.f12025sf.setFocusable(false);
        this.f12025sf.setHint(C2729uq.m10311ri(context, "tt_add_bad_reason"));
        this.f12025sf.setHintTextColor(Color.parseColor("#57000000"));
        this.f12025sf.setTextColor(Color.rgb(22, 24, 35));
        this.f12025sf.setTextSize(15.0f);
        this.f12025sf.setGravity(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
        this.f12025sf.setVisibility(0);
        this.f12025sf.setPadding(0, C3583qd.m16589lr(context, 15.0f), 0, C3583qd.m16589lr(context, 14.0f));
        this.f12025sf.setEllipsize(TextUtils.TruncateAt.END);
        this.f12025sf.setSingleLine();
        this.f12025sf.setMaxLines(1);
        this.f12025sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.f12020ka.m15318di();
            }
        });
        c3191fi.addView(this.f12025sf, layoutParams2);
        c3191fi.addView(new C3388sf(context, Color.argb(128, 0, 0, 0)));
        c3191fi.setVisibility(8);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ka */
    private boolean m15296ka() {
        if (this.f12016co == 0) {
            m15294ik();
        }
        return this.f12016co < this.f12015aw;
    }

    /* JADX INFO: renamed from: lr */
    private C3195mj m15297lr(Context context) {
        C3195mj c3195mj = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m15296ka() ? this.f12021lr : C3583qd.m16589lr(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f12019ik);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.f12019ik);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.f12019ik;
        c3195mj.setPadding(0, i, 0, i);
        c3195mj.setGravity(17);
        c3195mj.setBackground(stateListDrawable);
        c3195mj.setTextColor(-1);
        c3195mj.setTextSize(16.0f);
        c3195mj.setText(C2729uq.m10311ri(context, "tt_suggestion_commit"));
        c3195mj.setEnabled(false);
        c3195mj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.f12020ka.m15322ka();
            }
        });
        c3195mj.setLayoutParams(layoutParams);
        return c3195mj;
    }

    /* JADX INFO: renamed from: lr */
    private void m15298lr(List<FilterWord> list) {
        this.f12024ri.m15278ri(list);
    }

    /* JADX INFO: renamed from: ri */
    private void m15300ri(Context context) {
        this.f12019ik = C3583qd.m16589lr(context, 8.0f);
        this.f12021lr = C3583qd.m16589lr(context, 20.0f);
        int iM16589lr = C3583qd.m16589lr(context, 56.0f);
        int iM16589lr2 = C3583qd.m16589lr(context, 30.0f);
        int iM16589lr3 = C3583qd.m16589lr(context, 12.0f);
        if (m15296ka()) {
            iM16589lr3 = this.f12021lr;
        }
        if (!m15296ka()) {
            iM16589lr = iM16589lr2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C3583qd.m16589lr(getContext(), 98.0f));
        view.setBackground(C2729uq.m10303ik(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f12019ik);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        C3193ka c3193ka = new C3193ka(context);
        int iM16589lr4 = C3583qd.m16589lr(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams3.setMargins(0, iM16589lr3, iM16589lr3, 0);
        layoutParams3.gravity = 8388661;
        c3193ka.setImageDrawable(C3586sf.m16645ri(context, "tt_titlebar_close_seletor"));
        addView(c3193ka, layoutParams3);
        c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jbs.this.f12020ka.m15319fi();
            }
        });
        C3193ka c3193ka2 = new C3193ka(context);
        this.f12023qt = c3193ka2;
        c3193ka2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jbs.this.m15301lr();
            }
        });
        this.f12023qt.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams4.setMargins(iM16589lr3, iM16589lr3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableM16645ri = C3586sf.m16645ri(context, "tt_leftbackicon_selector");
        drawableM16645ri.setAutoMirrored(true);
        this.f12023qt.setImageDrawable(drawableM16645ri);
        addView(this.f12023qt, layoutParams4);
        C3191fi c3191fi = new C3191fi(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iM16589lr3, iM16589lr, iM16589lr3, iM16589lr3);
        c3191fi.setOrientation(1);
        addView(c3191fi, layoutParams5);
        View viewM15293ik = m15293ik(context);
        this.f12022mj = viewM15293ik;
        c3191fi.addView(viewM15293ik);
        View viewM15295ka = m15295ka(context);
        this.jbs = viewM15295ka;
        c3191fi.addView(viewM15295ka);
        C3195mj c3195mjM15297lr = m15297lr(context);
        this.f12018fi = c3195mjM15297lr;
        c3191fi.addView(c3195mjM15297lr);
    }

    /* JADX INFO: renamed from: lr */
    public void m15301lr() {
        View view = this.jbs;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f12022mj;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        C3193ka c3193ka = this.f12023qt;
        if (c3193ka != null) {
            c3193ka.setVisibility(8);
        }
        C3386qt c3386qt = this.f12020ka;
        if (c3386qt != null) {
            FilterWord filterWord = this.bgr;
            if (filterWord != null) {
                c3386qt.m15328ri(filterWord);
            } else {
                c3386qt.m15328ri(C3386qt.f12042ri);
            }
            this.f12020ka.m15320ik(null);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15302ri() {
        View view = this.jbs;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f12022mj;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        C3193ka c3193ka = this.f12023qt;
        if (c3193ka != null) {
            c3193ka.setVisibility(0);
        }
        C3386qt c3386qt = this.f12020ka;
        if (c3386qt == null || !c3386qt.m15321ik()) {
            return;
        }
        this.bgr = this.f12020ka.m15323lr();
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.lr
    /* JADX INFO: renamed from: ri */
    public void mo11275ri(int i) {
        if (C3386qt.f12039ik == i) {
            this.bgr = null;
            m15301lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.ik
    /* JADX INFO: renamed from: ri */
    public void mo15282ri(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.f12018fi != null && TextUtils.isEmpty(this.f12020ka.xha())) {
            this.f12018fi.setEnabled(!C3386qt.f12042ri.equals(filterWord));
        }
        if (ViewOnClickListenerC3376fi.f12004ri.equals(filterWord) || ViewOnClickListenerC3376fi.f12003lr.equals(filterWord)) {
            this.f12017di.setVisibility(8);
            this.xha.setVisibility(8);
        }
        if (ViewOnClickListenerC3376fi.f12002ik.equals(filterWord) || C3386qt.f12042ri.equals(filterWord)) {
            this.f12017di.setVisibility(0);
            this.xha.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.ka
    /* JADX INFO: renamed from: ri */
    public void mo15303ri(String str) {
        C3195mj c3195mj;
        C3195mj c3195mj2 = this.f12025sf;
        if (c3195mj2 != null) {
            c3195mj2.setText(str);
        }
        if (!TextUtils.isEmpty(str)) {
            C3195mj c3195mj3 = this.f12018fi;
            if (c3195mj3 != null) {
                c3195mj3.setEnabled(true);
                return;
            }
            return;
        }
        C3386qt c3386qt = this.f12020ka;
        if (c3386qt == null || (c3195mj = this.f12018fi) == null) {
            return;
        }
        c3195mj.setEnabled(c3386qt.m15321ik());
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.ri
    /* JADX INFO: renamed from: ri */
    public void mo15304ri(List<FilterWord> list) {
        m15298lr(list);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p217di.C3192ik, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.f12016co == 0) {
                m15294ik();
            }
            layoutParams.width = Math.min(this.f12016co, this.f12015aw) - (C3583qd.m16589lr(getContext(), 16.0f) * 2);
        }
    }
}
