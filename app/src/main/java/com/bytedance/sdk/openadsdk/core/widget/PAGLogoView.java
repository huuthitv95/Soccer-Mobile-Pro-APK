package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3284lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private C3193ka mAdLogo;
    private C3195mj mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, wjv wjvVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(wjvVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iM16589lr = C3583qd.m16589lr(context, 2.0f);
        this.containerHeight = C3583qd.m16589lr(getContext(), 12.0f);
        this.mAdLogo = new C3193ka(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C3583qd.m16589lr(context, 14.0f), C3583qd.m16589lr(context, 6.0f));
        layoutParams.leftMargin = iM16589lr;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iM16589lr;
        layoutParams2.rightMargin = iM16589lr;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iM16589lr);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(C3284lr c3284lr) {
        if (c3284lr == null) {
            return;
        }
        if (c3284lr.m14193fi()) {
            this.mAdLogo.setImageDrawable(C2729uq.m10303ik(C3299nr.m14642ri(), "tt_ad_logo"));
        } else {
            String strM14197ri = c3284lr.m14197ri();
            if (TextUtils.isEmpty(strM14197ri)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strM14197ri.contains("logo")) {
                    this.mAdLogo.setImageDrawable(C2729uq.m10303ik(C3299nr.m14642ri(), "tt_ad_logo"));
                } else {
                    C3491ka.m15834ri(strM14197ri).mo9652ik(1).mo9657ri(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strM14196lr = c3284lr.m14196lr();
        if (c3284lr.m14193fi()) {
            this.mAdText.setText(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strM14196lr)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strM14196lr);
            this.mAdText.setVisibility(0);
        }
    }

    public void initData(wjv wjvVar) {
        if (wjvVar == null) {
            return;
        }
        initData(wjvVar.ckl());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.p217di.jbs.m13330ri(this, layoutParams));
    }
}
