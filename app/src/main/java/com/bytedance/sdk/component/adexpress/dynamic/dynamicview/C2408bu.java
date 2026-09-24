package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2408bu extends C2410di {

    /* JADX INFO: renamed from: ac */
    private TextView f6449ac;
    private TextView ihz;

    /* JADX INFO: renamed from: lr */
    private TextView f6450lr;

    /* JADX INFO: renamed from: ri */
    private TextView f6451ri;

    /* JADX INFO: renamed from: uq */
    private TextView f6452uq;
    private LinearLayout wjv;

    public C2408bu(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj) {
        super(context, dynamicRootView, c2475mj);
        this.f6451ri = new TextView(this.f6485sf);
        this.f6450lr = new TextView(this.f6485sf);
        this.f6449ac = new TextView(this.f6485sf);
        this.wjv = new LinearLayout(this.f6485sf);
        this.ihz = new TextView(this.f6485sf);
        this.f6452uq = new TextView(this.f6485sf);
        this.f6451ri.setTag(9);
        this.f6450lr.setTag(10);
        this.f6449ac.setTag(12);
        this.wjv.addView(this.f6449ac);
        this.wjv.addView(this.f6452uq);
        this.wjv.addView(this.f6450lr);
        this.wjv.addView(this.ihz);
        this.wjv.addView(this.f6451ri);
        addView(this.wjv, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.xha, this.f6481mj);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2410di, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.InterfaceC2429xd
    public boolean jbs() {
        this.f6449ac.setText("Function");
        this.f6450lr.setText("Permission list");
        this.ihz.setText(" | ");
        this.f6452uq.setText(" | ");
        this.f6451ri.setText("Privacy policy");
        if (this.f6475co != null) {
            this.f6449ac.setTextColor(this.f6475co.xha());
            this.f6449ac.setTextSize(this.f6475co.m8701fi());
            this.f6450lr.setTextColor(this.f6475co.xha());
            this.f6450lr.setTextSize(this.f6475co.m8701fi());
            this.ihz.setTextColor(this.f6475co.xha());
            this.f6452uq.setTextColor(this.f6475co.xha());
            this.f6451ri.setTextColor(this.f6475co.xha());
            this.f6451ri.setTextSize(this.f6475co.m8701fi());
            return false;
        }
        this.f6449ac.setTextColor(-1);
        this.f6449ac.setTextSize(12.0f);
        this.f6450lr.setTextColor(-1);
        this.f6450lr.setTextSize(12.0f);
        this.ihz.setTextColor(-1);
        this.f6452uq.setTextColor(-1);
        this.f6451ri.setTextColor(-1);
        this.f6451ri.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi
    /* JADX INFO: renamed from: ka */
    protected boolean mo8312ka() {
        this.f6451ri.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f6451ri.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f6450lr.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f6450lr.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f6449ac.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f6449ac.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }
}
