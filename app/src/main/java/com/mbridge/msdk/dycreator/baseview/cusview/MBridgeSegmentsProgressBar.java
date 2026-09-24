package com.mbridge.msdk.dycreator.baseview.cusview;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private final String f35074a;

    /* JADX INFO: renamed from: b */
    private int f35075b;

    /* JADX INFO: renamed from: c */
    private int f35076c;

    /* JADX INFO: renamed from: d */
    private int f35077d;

    /* JADX INFO: renamed from: e */
    private int f35078e;

    /* JADX INFO: renamed from: f */
    private int f35079f;

    /* JADX INFO: renamed from: g */
    private int f35080g;

    /* JADX INFO: renamed from: h */
    private int f35081h;

    /* JADX INFO: renamed from: i */
    private List<ProgressBar> f35082i;

    /* JADX INFO: renamed from: j */
    private TextView f35083j;

    /* JADX INFO: renamed from: k */
    private String f35084k;

    /* JADX INFO: renamed from: l */
    private boolean f35085l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f35074a = "MBridgeSegmentsProgressBar";
        this.f35076c = 1;
        this.f35077d = 20;
        this.f35078e = 10;
        this.f35079f = 1;
        this.f35080g = -1711276033;
        this.f35081h = -1;
        this.f35082i = new ArrayList();
        this.f35085l = false;
    }

    /* JADX INFO: renamed from: a */
    private void m36257a() {
        Drawable drawable;
        try {
            this.f35085l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f35076c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f35084k)) {
                    this.f35084k = this.f35085l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f35076c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f35084k)) {
                    this.f35084k = this.f35085l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f35082i.clear();
            removeAllViews();
            setBackground(getBackgroundDrawable());
            TextView textView = new TextView(getContext());
            this.f35083j = textView;
            textView.setTextColor(-1);
            this.f35083j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f35083j.setLayoutParams(layoutParams);
            if (this.f35076c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f35083j;
                int i = this.f35077d;
                textView2.setPadding(i / 2, 15, i / 2, 5);
            }
            if (this.f35076c == 2) {
                this.f35083j.setGravity(16);
                TextView textView3 = this.f35083j;
                int i2 = this.f35077d;
                textView3.setPadding(i2 / 2, 0, i2 / 2, 0);
            }
            try {
                int iM37707a = C13203i0.m37707a(getContext(), "mbridge_reward_video_icon", "drawable");
                if (C13203i0.m37709a(iM37707a) && (drawable = getContext().getResources().getDrawable(iM37707a)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f35083j.setCompoundDrawables(drawable, null, null, null);
                    this.f35083j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                C13219q0.m37816b("MBridgeSegmentsProgressBar", th2.getMessage());
            }
            this.f35083j.setText(m36256a(this.f35079f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i3 = 0; i3 < this.f35075b; i3++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(getSegmentLayerDrawable());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i4 = this.f35077d;
                layoutParams3.leftMargin = i4 / 2;
                layoutParams3.rightMargin = i4 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f35082i.add(progressBar);
            }
            int i5 = this.f35076c;
            if (i5 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f35083j);
                addView(linearLayout);
            } else {
                if (i5 != 2) {
                    addView(linearLayout);
                    return;
                }
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f35083j);
            }
        } catch (Throwable th3) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th3.getMessage());
        }
    }

    private GradientDrawable getBackgroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    private LayerDrawable getSegmentLayerDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f35078e);
        gradientDrawable.setColor(this.f35080g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f35078e);
        gradientDrawable2.setColor(this.f35081h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i, int i2) {
        this.f35075b = i;
        this.f35076c = i2;
        m36257a();
    }

    public void setIndicatorText(String str) {
        this.f35084k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.f35082i.size() == 0) {
                return;
            }
            if (i2 < this.f35082i.size()) {
                this.f35082i.get(i2).setProgress(i);
            }
            int i3 = i2 + 1;
            if (i3 > this.f35079f) {
                this.f35079f = i3;
                TextView textView = this.f35083j;
                if (textView != null) {
                    textView.setText(m36256a(i3));
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i, int i2, int i3, int i4) {
        this.f35075b = i;
        this.f35076c = i2;
        this.f35081h = i3;
        this.f35080g = i4;
        m36257a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f35075b = i;
        this.f35076c = i2;
        this.f35081h = i3;
        this.f35080g = i4;
        this.f35077d = i5;
        this.f35078e = i6;
        m36257a();
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35074a = "MBridgeSegmentsProgressBar";
        this.f35076c = 1;
        this.f35077d = 20;
        this.f35078e = 10;
        this.f35079f = 1;
        this.f35080g = -1711276033;
        this.f35081h = -1;
        this.f35082i = new ArrayList();
        this.f35085l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35074a = "MBridgeSegmentsProgressBar";
        this.f35076c = 1;
        this.f35077d = 20;
        this.f35078e = 10;
        this.f35079f = 1;
        this.f35080g = -1711276033;
        this.f35081h = -1;
        this.f35082i = new ArrayList();
        this.f35085l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35074a = "MBridgeSegmentsProgressBar";
        this.f35076c = 1;
        this.f35077d = 20;
        this.f35078e = 10;
        this.f35079f = 1;
        this.f35080g = -1711276033;
        this.f35081h = -1;
        this.f35082i = new ArrayList();
        this.f35085l = false;
    }

    /* JADX INFO: renamed from: a */
    private StringBuilder m36256a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f35084k, Integer.valueOf(i), Integer.valueOf(this.f35075b)));
            return sb;
        } catch (Throwable th) {
            sb.append(this.f35075b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
            return sb;
        }
    }
}
