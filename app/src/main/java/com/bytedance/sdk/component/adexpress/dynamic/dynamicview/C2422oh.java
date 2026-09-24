package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.C2480ri;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2431fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2496lr;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.oh */
/* JADX INFO: loaded from: classes3.dex */
public class C2422oh extends C2410di implements InterfaceC2431fi {

    /* JADX INFO: renamed from: ac */
    boolean f6528ac;

    /* JADX INFO: renamed from: lr */
    FrameLayout f6529lr;

    /* JADX INFO: renamed from: ri */
    TextView f6530ri;

    public C2422oh(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6528ac = false;
        this.f6486vr = new View(context);
        this.f6486vr.setTag(Integer.valueOf(getClickArea()));
        this.f6530ri = new TextView(context);
        this.f6529lr = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f6530ri.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6530ri.setBackground(gradientDrawable);
        this.f6530ri.setTextSize(10.0f);
        this.f6530ri.setGravity(17);
        this.f6530ri.setTextColor(-1);
        this.f6530ri.setVisibility(8);
        if (C2490ka.m8810lr()) {
            addView(this.f6529lr, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.f6530ri);
        addView(this.f6486vr, getWidgetLayoutParams());
        if (!C2490ka.m8810lr()) {
            addView(this.f6529lr, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.f6529lr;
        dynamicRootView.setVideoListener(this);
    }

    /* JADX INFO: renamed from: ik */
    private void m8350ik(View view) {
        if (view == this.f6530ri || view == this.tan) {
            return;
        }
        try {
            if (((Integer) view.getTag(C2480ri.f6822di)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            m8350ik(viewGroup.getChildAt(i));
            i++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: fi */
    public boolean mo8326fi() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        super.jbs();
        double dM8614fi = 0.0d;
        double dM8619ka = 0.0d;
        for (C2475mj c2475mjM8611co = this.f6473aw; c2475mjM8611co != null; c2475mjM8611co = c2475mjM8611co.m8611co()) {
            double dM8612di = dM8619ka + ((double) c2475mjM8611co.m8612di());
            double dXha = dM8614fi + ((double) c2475mjM8611co.xha());
            dM8619ka = dM8612di - ((double) c2475mjM8611co.m8619ka());
            dM8614fi = dXha - ((double) c2475mjM8611co.m8614fi());
        }
        try {
            float f = (float) dM8619ka;
            int iM8833ri = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), f);
            int iM8833ri2 = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), f + this.f6477fi);
            if (C2496lr.m8822ri(getContext())) {
                C2421nr c2421nr = (C2421nr) this.bgr.getChildAt(0);
                int dynamicWidth = c2421nr.getDynamicWidth();
                int i = dynamicWidth - iM8833ri2;
                iM8833ri2 = dynamicWidth - iM8833ri;
                iM8833ri = i;
            }
            if ("open_ad".equals(this.bgr.getRenderRequest().m8884ka())) {
                this.bgr.videoView = this.f6529lr;
            } else {
                C2421nr c2421nr2 = (C2421nr) this.bgr.getChildAt(0);
                float f2 = (float) dM8614fi;
                c2421nr2.f6527ri.m8348ri(iM8833ri, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), f2), iM8833ri2, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(getContext(), f2 + this.f6476di));
            }
        } catch (Exception unused) {
        }
        this.bgr.updateRenderInfoForVideo(dM8619ka, dM8614fi, this.f6477fi, this.f6476di, this.f6475co.m8727vr());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2431fi
    /* JADX INFO: renamed from: ri */
    public void mo8351ri() {
        this.f6530ri.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2431fi
    public void setTimeUpdate(int i) {
        if (!this.f6473aw.m8627qt().m8592fi().evm() || i <= 0 || this.f6528ac) {
            this.f6528ac = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                m8350ik(getChildAt(i2));
            }
            this.f6530ri.setVisibility(8);
            return;
        }
        String str = (i >= 60 ? "0" + (i / 60) : "00") + CertificateUtil.DELIMITER;
        int i3 = i % 60;
        this.f6530ri.setText(i3 > 9 ? str + i3 : str + "0" + i3);
        this.f6530ri.setVisibility(0);
    }
}
