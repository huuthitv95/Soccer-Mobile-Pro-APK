package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* JADX INFO: renamed from: f */
    private final String f34978f;

    /* JADX INFO: renamed from: g */
    private final String f34979g;

    /* JADX INFO: renamed from: h */
    private final String f34980h;

    /* JADX INFO: renamed from: i */
    private final String f34981i;

    /* JADX INFO: renamed from: j */
    private final String f34982j;

    /* JADX INFO: renamed from: k */
    private final String f34983k;

    /* JADX INFO: renamed from: l */
    private ImageView f34984l;

    /* JADX INFO: renamed from: m */
    private Animation f34985m;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f34978f = "浏览第三方应用";
        this.f34979g = "View";
        this.f34980h = "打开第三方应用";
        this.f34981i = "Open";
        this.f34982j = "下载第三方应用";
        this.f34983k = "Install";
    }

    /* JADX INFO: renamed from: a */
    private String m36220a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            str.hashCode();
            switch (str) {
                case "Install":
                case "Open":
                case "View":
                case "下载第三方应用":
                case "打开第三方应用":
                case "浏览第三方应用":
                    return str;
            }
        }
        return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "浏览第三方应用" : "View";
    }

    private void setBgDrawable(View view) {
        int color = Color.parseColor("#60000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200);
        view.setBackground(gradientDrawable);
    }

    public void initView(String str) {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(C13229v0.m37876a(getContext(), 80.0f), C13229v0.m37876a(getContext(), 80.0f)));
        setBgDrawable(imageView);
        this.f34984l = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C13229v0.m37876a(getContext(), 40.0f), C13229v0.m37876a(getContext(), 40.0f));
        layoutParams.gravity = 17;
        this.f34984l.setLayoutParams(layoutParams);
        this.f34984l.setImageResource(getResources().getIdentifier("mbridge_cm_btn_shake", "drawable", C13008c.m36588n().m36550i()));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f34984l);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C13229v0.m37876a(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText("Shake your phone");
        textView.setTextSize(16.0f);
        textView.setTextColor(-1);
        String strM36220a = m36220a(str);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = C13229v0.m37876a(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(strM36220a);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(-1);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f34984l != null) {
            m36221a();
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34978f = "浏览第三方应用";
        this.f34979g = "View";
        this.f34980h = "打开第三方应用";
        this.f34981i = "Open";
        this.f34982j = "下载第三方应用";
        this.f34983k = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34978f = "浏览第三方应用";
        this.f34979g = "View";
        this.f34980h = "打开第三方应用";
        this.f34981i = "Open";
        this.f34982j = "下载第三方应用";
        this.f34983k = "Install";
    }

    /* JADX INFO: renamed from: a */
    private void m36221a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f34985m = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f34985m.setRepeatMode(2);
        this.f34985m.setRepeatCount(-1);
        this.f34984l.startAnimation(this.f34985m);
    }
}
