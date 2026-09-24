package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes7.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a */
    private final String f38527a;

    /* JADX INFO: renamed from: b */
    private final String f38528b;

    /* JADX INFO: renamed from: c */
    private final String f38529c;

    /* JADX INFO: renamed from: d */
    private final String f38530d;

    /* JADX INFO: renamed from: e */
    private final String f38531e;

    /* JADX INFO: renamed from: f */
    private final String f38532f;

    /* JADX INFO: renamed from: g */
    private final String f38533g;

    /* JADX INFO: renamed from: h */
    private final String f38534h;

    /* JADX INFO: renamed from: i */
    private final String f38535i;

    /* JADX INFO: renamed from: j */
    private final String f38536j;

    /* JADX INFO: renamed from: k */
    private final String f38537k;

    /* JADX INFO: renamed from: l */
    private String f38538l;

    /* JADX INFO: renamed from: m */
    private int f38539m;

    /* JADX INFO: renamed from: n */
    private ImageView f38540n;

    /* JADX INFO: renamed from: o */
    private ImageView f38541o;

    /* JADX INFO: renamed from: p */
    private final RectF f38542p;

    /* JADX INFO: renamed from: q */
    private final Paint f38543q;

    /* JADX INFO: renamed from: r */
    private final Paint f38544r;

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a */
    class AnimationAnimationListenerC13702a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ScaleAnimation f38545a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f38541o.startAnimation(AnimationAnimationListenerC13702a.this.f38545a);
            }
        }

        AnimationAnimationListenerC13702a(ScaleAnimation scaleAnimation) {
            this.f38545a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f38541o.setVisibility(4);
            MBSplashClickView.this.f38541o.postDelayed(new a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f38541o.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$b */
    class RunnableC13703b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ScaleAnimation f38548a;

        RunnableC13703b(ScaleAnimation scaleAnimation) {
            this.f38548a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f38541o.startAnimation(this.f38548a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$c */
    class AnimationAnimationListenerC13704c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$c$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Animation f38551a;

            a(Animation animation) {
                this.f38551a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f38540n.startAnimation(this.f38551a);
            }
        }

        AnimationAnimationListenerC13704c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f38540n.setVisibility(4);
            MBSplashClickView.this.f38540n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f38540n.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f38527a = "浏览第三方应用";
        this.f38528b = "View";
        this.f38529c = "打开第三方应用";
        this.f38530d = "Open";
        this.f38531e = "下载第三方应用";
        this.f38532f = "Install";
        this.f38533g = "mbridge_splash_btn_arrow_right";
        this.f38534h = "mbridge_splash_btn_circle";
        this.f38535i = "mbridge_splash_btn_finger";
        this.f38536j = "mbridge_splash_btn_go";
        this.f38537k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f38542p = new RectF();
        this.f38543q = new Paint();
        this.f38544r = new Paint();
        m40142a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38527a = "浏览第三方应用";
        this.f38528b = "View";
        this.f38529c = "打开第三方应用";
        this.f38530d = "Open";
        this.f38531e = "下载第三方应用";
        this.f38532f = "Install";
        this.f38533g = "mbridge_splash_btn_arrow_right";
        this.f38534h = "mbridge_splash_btn_circle";
        this.f38535i = "mbridge_splash_btn_finger";
        this.f38536j = "mbridge_splash_btn_go";
        this.f38537k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f38542p = new RectF();
        this.f38543q = new Paint();
        this.f38544r = new Paint();
        m40142a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38527a = "浏览第三方应用";
        this.f38528b = "View";
        this.f38529c = "打开第三方应用";
        this.f38530d = "Open";
        this.f38531e = "下载第三方应用";
        this.f38532f = "Install";
        this.f38533g = "mbridge_splash_btn_arrow_right";
        this.f38534h = "mbridge_splash_btn_circle";
        this.f38535i = "mbridge_splash_btn_finger";
        this.f38536j = "mbridge_splash_btn_go";
        this.f38537k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f38542p = new RectF();
        this.f38543q = new Paint();
        this.f38544r = new Paint();
        m40142a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f38527a = "浏览第三方应用";
        this.f38528b = "View";
        this.f38529c = "打开第三方应用";
        this.f38530d = "Open";
        this.f38531e = "下载第三方应用";
        this.f38532f = "Install";
        this.f38533g = "mbridge_splash_btn_arrow_right";
        this.f38534h = "mbridge_splash_btn_circle";
        this.f38535i = "mbridge_splash_btn_finger";
        this.f38536j = "mbridge_splash_btn_go";
        this.f38537k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f38542p = new RectF();
        this.f38543q = new Paint();
        this.f38544r = new Paint();
    }

    /* JADX INFO: renamed from: a */
    private void m40142a() {
        this.f38543q.setAntiAlias(true);
        this.f38543q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f38544r.setAntiAlias(true);
        this.f38544r.setColor(-1);
    }

    /* JADX INFO: renamed from: a */
    private boolean m40143a(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f38539m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f38539m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f38539m = 2;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m40145b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!m40143a(this.f38538l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f38538l)) {
                this.f38538l = zContains ? "浏览第三方应用" : "View";
            }
            this.f38539m = 2;
        }
        setBgDrawable(this.f38539m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f38538l);
        this.f38540n = new ImageView(getContext());
        int i = this.f38539m;
        if (i == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", C13008c.m36588n().m36550i());
            layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 35.0f), C13229v0.m37876a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = C13229v0.m37876a(getContext(), 10.0f);
        } else if (i == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", C13008c.m36588n().m36550i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = C13229v0.m37876a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", C13008c.m36588n().m36550i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", C13008c.m36588n().m36550i());
            layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 25.0f), C13229v0.m37876a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = C13229v0.m37876a(getContext(), 50.0f);
            layoutParams.topMargin = C13229v0.m37876a(getContext(), 18.0f);
            this.f38541o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 30.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = C13229v0.m37876a(getContext(), 50.0f);
            layoutParams4.topMargin = C13229v0.m37876a(getContext(), 5.0f);
            this.f38541o.setLayoutParams(layoutParams4);
            this.f38541o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", C13008c.m36588n().m36550i()));
            addView(this.f38541o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f38540n.setLayoutParams(layoutParams);
        this.f38540n.setImageResource(identifier);
        addView(textView);
        addView(this.f38540n);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    private void m40146c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnimationAnimationListenerC13702a(scaleAnimation2));
        this.f38541o.setVisibility(4);
        this.f38540n.startAnimation(scaleAnimation);
        this.f38541o.postDelayed(new RunnableC13703b(scaleAnimation2), 500L);
    }

    /* JADX INFO: renamed from: d */
    private void m40147d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f38540n.startAnimation(scaleAnimation);
    }

    /* JADX INFO: renamed from: e */
    private void m40148e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnimationAnimationListenerC13704c());
        this.f38540n.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f38542p, this.f38544r, 31);
        canvas.drawRoundRect(this.f38542p, 200.0f, 200.0f, this.f38544r);
        canvas.saveLayer(this.f38542p, this.f38543q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f38538l = str;
        m40145b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f38539m;
        if (i == 2) {
            m40147d();
        } else if (i == 1) {
            m40148e();
        } else if (i == 3) {
            m40146c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f38542p.set(0.0f, 0.0f, getWidth(), getHeight());
    }
}
