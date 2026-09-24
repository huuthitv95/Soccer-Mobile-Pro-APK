package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;

/* JADX INFO: renamed from: com.applovin.impl.r */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC1703r extends Dialog {

    /* JADX INFO: renamed from: a */
    private ViewGroup f2675a;

    /* JADX INFO: renamed from: b */
    private AppLovinSdkUtils.Size f2676b;

    /* JADX INFO: renamed from: c */
    private Activity f2677c;

    /* JADX INFO: renamed from: d */
    private RelativeLayout f2678d;

    public DialogC1703r(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f2675a = viewGroup;
        this.f2676b = size;
        this.f2677c = activity;
        requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m4129a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m4130b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f2678d.removeView(this.f2675a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f2677c, this.f2676b.getWidth()), AppLovinSdkUtils.dpToPx(this.f2677c, this.f2676b.getHeight()));
        layoutParams.addRule(13);
        this.f2675a.setLayoutParams(layoutParams);
        int iDpToPx = AppLovinSdkUtils.dpToPx(this.f2677c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f2677c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f2677c.getResources().getDrawable(C1846R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.r$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4129a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f2677c);
        this.f2678d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f2678d.setBackgroundColor(Integer.MIN_VALUE);
        this.f2678d.addView(imageButton);
        this.f2678d.addView(this.f2675a);
        this.f2678d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.r$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4130b(view);
            }
        });
        setContentView(this.f2678d);
    }
}
