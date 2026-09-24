package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: f */
    private final String f34948f;

    /* JADX INFO: renamed from: g */
    private final String f34949g;

    /* JADX INFO: renamed from: h */
    private final String f34950h;

    /* JADX INFO: renamed from: i */
    private final String f34951i;

    /* JADX INFO: renamed from: j */
    private final String f34952j;

    /* JADX INFO: renamed from: k */
    private final String f34953k;

    /* JADX INFO: renamed from: l */
    private final String f34954l;

    /* JADX INFO: renamed from: m */
    private final String f34955m;

    /* JADX INFO: renamed from: n */
    private final String f34956n;

    /* JADX INFO: renamed from: o */
    private final String f34957o;

    /* JADX INFO: renamed from: p */
    private final String f34958p;

    /* JADX INFO: renamed from: q */
    private final String f34959q;

    /* JADX INFO: renamed from: r */
    private String f34960r;

    /* JADX INFO: renamed from: s */
    private int f34961s;

    /* JADX INFO: renamed from: t */
    private ImageView f34962t;

    /* JADX INFO: renamed from: u */
    private ImageView f34963u;

    /* JADX INFO: renamed from: v */
    private final RectF f34964v;

    /* JADX INFO: renamed from: w */
    private final Paint f34965w;

    /* JADX INFO: renamed from: x */
    private final Paint f34966x;

    public MBSplashClickView(Context context) {
        super(context);
        this.f34948f = "浏览第三方应用";
        this.f34949g = "View";
        this.f34950h = "打开第三方应用";
        this.f34951i = "Open";
        this.f34952j = "下载第三方应用";
        this.f34953k = "Install";
        this.f34954l = "mbridge_splash_btn_arrow_right";
        this.f34955m = "mbridge_splash_btn_circle";
        this.f34956n = "mbridge_splash_btn_finger";
        this.f34957o = "mbridge_splash_btn_go";
        this.f34958p = "mbridge_splash_btn_light";
        this.f34959q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f34964v = new RectF();
        this.f34965w = new Paint();
        this.f34966x = new Paint();
        m36212a();
    }

    /* JADX INFO: renamed from: c */
    private void m36217c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(400L);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBSplashClickView.this.f34963u.setVisibility(4);
                MBSplashClickView.this.f34963u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f34963u.startAnimation(scaleAnimation2);
                    }
                }, 1600L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f34963u.setVisibility(0);
            }
        });
        this.f34963u.setVisibility(4);
        this.f34962t.startAnimation(scaleAnimation);
        this.f34963u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.2
            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f34963u.startAnimation(scaleAnimation2);
            }
        }, 800L);
    }

    /* JADX INFO: renamed from: d */
    private void m36218d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f34962t.startAnimation(scaleAnimation);
    }

    /* JADX INFO: renamed from: e */
    private void m36219e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(final Animation animation) {
                MBSplashClickView.this.f34962t.setVisibility(4);
                MBSplashClickView.this.f34962t.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f34962t.startAnimation(animation);
                    }
                }, 2000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f34962t.setVisibility(0);
            }
        });
        this.f34962t.startAnimation(translateAnimation);
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
        canvas.saveLayer(this.f34964v, this.f34966x, 31);
        canvas.drawRoundRect(this.f34964v, 200.0f, 200.0f, this.f34966x);
        canvas.saveLayer(this.f34964v, this.f34965w, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f34960r = str;
        m36216b();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f34961s;
        if (i == 2) {
            m36218d();
        } else if (i == 1) {
            m36219e();
        } else if (i == 3) {
            m36217c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f34964v.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    /* JADX INFO: renamed from: a */
    private void m36212a() {
        this.f34965w.setAntiAlias(true);
        this.f34965w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f34966x.setAntiAlias(true);
        this.f34966x.setColor(-1);
    }

    /* JADX INFO: renamed from: b */
    private void m36216b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        View viewM36210a;
        if (!m36214a(this.f34960r)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f34960r)) {
                this.f34960r = zContains ? "浏览第三方应用" : "View";
            }
            this.f34961s = 2;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        String string = (viewGroup == null || (viewM36210a = m36210a(viewGroup, "mbridge_expand_data")) == null || !(viewM36210a instanceof TextView)) ? "" : ((TextView) viewM36210a).getText().toString();
        setBgDrawable(this.f34961s);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f34960r);
        this.f34962t = new ImageView(getContext());
        int i = this.f34961s;
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
            this.f34963u = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 30.0f), C13229v0.m37876a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = C13229v0.m37876a(getContext(), 50.0f);
            layoutParams4.topMargin = C13229v0.m37876a(getContext(), 5.0f);
            this.f34963u.setLayoutParams(layoutParams4);
            this.f34963u.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", C13008c.m36588n().m36550i()));
            addView(this.f34963u);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f34962t.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(string)) {
            this.f34962t.setImageResource(identifier);
        } else {
            m36213a(this.f34962t, string, identifier);
        }
        addView(textView);
        addView(this.f34962t);
        invalidate();
    }

    /* JADX INFO: renamed from: a */
    private boolean m36214a(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f34961s = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f34961s = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f34961s = 2;
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36213a(final ImageView imageView, String str, final int i) {
        if (imageView == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                imageView.setBackgroundResource(i);
            }
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(str, new InterfaceC13101c() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.4
                @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                public void onFailedLoad(String str2, String str3) {
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        imageView2.setBackgroundResource(i);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (imageView != null) {
                        if (bitmap == null || bitmap.isRecycled()) {
                            imageView.setBackgroundResource(i);
                            return;
                        }
                        if (MBSplashClickView.this.f34963u != null) {
                            MBSplashClickView mBSplashClickView = MBSplashClickView.this;
                            mBSplashClickView.removeView(mBSplashClickView.f34963u);
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        } catch (Exception e) {
            C13219q0.m37813a("MBSplashClickView", e.getMessage());
            imageView.setBackgroundResource(i);
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34948f = "浏览第三方应用";
        this.f34949g = "View";
        this.f34950h = "打开第三方应用";
        this.f34951i = "Open";
        this.f34952j = "下载第三方应用";
        this.f34953k = "Install";
        this.f34954l = "mbridge_splash_btn_arrow_right";
        this.f34955m = "mbridge_splash_btn_circle";
        this.f34956n = "mbridge_splash_btn_finger";
        this.f34957o = "mbridge_splash_btn_go";
        this.f34958p = "mbridge_splash_btn_light";
        this.f34959q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f34964v = new RectF();
        this.f34965w = new Paint();
        this.f34966x = new Paint();
        m36212a();
    }

    /* JADX INFO: renamed from: a */
    private View m36210a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            m36210a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e) {
                C13219q0.m37816b("MBSplashClickView", e.getMessage());
            }
        }
        return null;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34948f = "浏览第三方应用";
        this.f34949g = "View";
        this.f34950h = "打开第三方应用";
        this.f34951i = "Open";
        this.f34952j = "下载第三方应用";
        this.f34953k = "Install";
        this.f34954l = "mbridge_splash_btn_arrow_right";
        this.f34955m = "mbridge_splash_btn_circle";
        this.f34956n = "mbridge_splash_btn_finger";
        this.f34957o = "mbridge_splash_btn_go";
        this.f34958p = "mbridge_splash_btn_light";
        this.f34959q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f34964v = new RectF();
        this.f34965w = new Paint();
        this.f34966x = new Paint();
        m36212a();
    }
}
