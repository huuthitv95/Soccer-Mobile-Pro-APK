package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: renamed from: com.applovin.impl.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1478a extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private final ProgressBar f943a;

    public C1478a(Context context, int i, int i2) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.f943a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    /* JADX INFO: renamed from: a */
    public void m1758a() {
        setVisibility(0);
    }

    /* JADX INFO: renamed from: b */
    public void m1759b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f943a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
