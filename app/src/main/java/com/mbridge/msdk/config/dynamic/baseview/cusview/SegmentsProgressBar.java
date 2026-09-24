package com.mbridge.msdk.config.dynamic.baseview.cusview;

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
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class SegmentsProgressBar extends ComponentLinearLayout {

    /* JADX INFO: renamed from: a */
    private final String f34581a;

    /* JADX INFO: renamed from: b */
    private int f34582b;

    /* JADX INFO: renamed from: c */
    private int f34583c;

    /* JADX INFO: renamed from: d */
    private int f34584d;

    /* JADX INFO: renamed from: e */
    private int f34585e;

    /* JADX INFO: renamed from: f */
    private int f34586f;

    /* JADX INFO: renamed from: g */
    private int f34587g;

    /* JADX INFO: renamed from: h */
    private int f34588h;

    /* JADX INFO: renamed from: i */
    private final List<ProgressBar> f34589i;

    /* JADX INFO: renamed from: j */
    private TextView f34590j;

    /* JADX INFO: renamed from: k */
    private String f34591k;

    /* JADX INFO: renamed from: l */
    private boolean f34592l;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.SegmentsProgressBar$a */
    class AnimationAnimationListenerC12874a implements Animation.AnimationListener {
        AnimationAnimationListenerC12874a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SegmentsProgressBar.this.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public SegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34581a = "MBridgeSegmentsProgressBar";
        this.f34583c = 1;
        this.f34584d = 20;
        this.f34585e = 10;
        this.f34586f = 1;
        this.f34587g = -1711276033;
        this.f34588h = -1;
        this.f34589i = new ArrayList();
        this.f34592l = false;
    }

    /* JADX INFO: renamed from: a */
    private void m35946a() {
        Drawable drawable;
        try {
            this.f34592l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        int i = this.f34583c;
        if (i == 1) {
            setOrientation(1);
            if (TextUtils.isEmpty(this.f34591k)) {
                this.f34591k = this.f34592l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
            }
        } else if (i == 2) {
            setOrientation(0);
            if (TextUtils.isEmpty(this.f34591k)) {
                this.f34591k = this.f34592l ? "广告 %s/%s" : "ADS %s/%s";
            }
        }
        this.f34589i.clear();
        removeAllViews();
        setBackground(getBackgroundDrawable());
        TextView textView = new TextView(getContext());
        this.f34590j = textView;
        textView.setTextColor(-1);
        this.f34590j.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f34590j.setLayoutParams(layoutParams);
        int i2 = this.f34583c;
        if (i2 == 1) {
            layoutParams.gravity = 5;
            TextView textView2 = this.f34590j;
            int i3 = this.f34584d / 2;
            textView2.setPadding(i3, 15, i3, 5);
        } else if (i2 == 2) {
            this.f34590j.setGravity(16);
            TextView textView3 = this.f34590j;
            int i4 = this.f34584d / 2;
            textView3.setPadding(i4, 0, i4, 0);
        }
        try {
            int iM37707a = C13203i0.m37707a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (C13203i0.m37709a(iM37707a) && (drawable = getContext().getResources().getDrawable(iM37707a)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f34590j.setCompoundDrawables(drawable, null, null, null);
                this.f34590j.setCompoundDrawablePadding(5);
            }
        } catch (Throwable th2) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
        linearLayout.setLayoutParams(layoutParams2);
        for (int i5 = 0; i5 < this.f34582b; i5++) {
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setMax(100);
            progressBar.setProgress(0);
            progressBar.setProgressDrawable(getSegmentLayerDrawable());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
            int i6 = this.f34584d / 2;
            layoutParams3.leftMargin = i6;
            layoutParams3.rightMargin = i6;
            progressBar.setLayoutParams(layoutParams3);
            linearLayout.addView(progressBar);
            this.f34589i.add(progressBar);
        }
        int i7 = this.f34583c;
        if (i7 == 1) {
            setPadding(15, 10, 15, 25);
            addView(this.f34590j);
            addView(linearLayout);
        } else {
            if (i7 != 2) {
                addView(linearLayout);
                return;
            }
            setPadding(15, 0, 15, 25);
            layoutParams2.gravity = 16;
            layoutParams2.weight = 1.0f;
            addView(linearLayout);
            addView(this.f34590j);
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
        gradientDrawable.setCornerRadius(this.f34585e);
        gradientDrawable.setColor(this.f34587g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f34585e);
        gradientDrawable2.setColor(this.f34588h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC12874a());
        startAnimation(alphaAnimation);
    }

    public void init(int i, int i2) {
        this.f34582b = i;
        this.f34583c = i2;
        m35946a();
    }

    public void setIndicatorText(String str) {
        this.f34591k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.f34589i.isEmpty()) {
                return;
            }
            if (i2 < this.f34589i.size()) {
                this.f34589i.get(i2).setProgress(i);
            }
            int i3 = i2 + 1;
            if (i3 > this.f34586f) {
                this.f34586f = i3;
                TextView textView = this.f34590j;
                if (textView != null) {
                    textView.setText(m35945a(i3));
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            this.f34582b = Integer.parseInt(String.valueOf(map.get("count")));
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
            this.f34582b = 1;
        }
        try {
            this.f34583c = Integer.parseInt(String.valueOf(map.get("style")));
        } catch (Throwable th2) {
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th2.getMessage());
            this.f34583c = 0;
        }
        init(this.f34582b, this.f34583c);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        setProgress(str.contains("percent") ? Integer.parseInt(obj.toString()) : 0, str.contains("Index") ? Integer.parseInt(obj.toString()) : 0);
    }

    public void init(int i, int i2, int i3, int i4) {
        this.f34582b = i;
        this.f34583c = i2;
        this.f34588h = i3;
        this.f34587g = i4;
        m35946a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f34582b = i;
        this.f34583c = i2;
        this.f34588h = i3;
        this.f34587g = i4;
        this.f34584d = i5;
        this.f34585e = i6;
        m35946a();
    }

    /* JADX INFO: renamed from: a */
    private StringBuilder m35945a(int i) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append(String.format(this.f34591k, Integer.valueOf(i), Integer.valueOf(this.f34582b)));
            return sb;
        } catch (Throwable th) {
            sb.append(this.f34582b);
            sb.append("videos, the");
            sb.append(i);
            sb.append(" is playing.");
            C13219q0.m37816b("MBridgeSegmentsProgressBar", th.getMessage());
            return sb;
        }
    }
}
