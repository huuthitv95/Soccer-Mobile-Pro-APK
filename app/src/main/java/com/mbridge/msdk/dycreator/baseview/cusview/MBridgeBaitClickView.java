package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.common.C0684C;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a */
    private MBridgeDyImageView f35032a;

    /* JADX INFO: renamed from: b */
    private MBridgeDyImageView f35033b;

    /* JADX INFO: renamed from: c */
    private TextView f35034c;

    /* JADX INFO: renamed from: d */
    private String f35035d;

    /* JADX INFO: renamed from: e */
    private String f35036e;

    /* JADX INFO: renamed from: f */
    private String f35037f;

    /* JADX INFO: renamed from: g */
    private int f35038g;

    /* JADX INFO: renamed from: h */
    private int f35039h;

    /* JADX INFO: renamed from: i */
    private Animation f35040i;

    /* JADX INFO: renamed from: j */
    private Animation f35041j;

    /* JADX INFO: renamed from: k */
    private Animation f35042k;

    /* JADX INFO: renamed from: l */
    private Animation f35043l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f35035d = "";
        this.f35036e = "";
        this.f35037f = "Click now for details";
        this.f35038g = 1;
        this.f35039h = C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: d */
    private void m36247d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f35040i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f35040i.setRepeatCount(-1);
        this.f35040i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f35032a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f35040i);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m36248e() {
        MBridgeDyImageView mBridgeDyImageView = this.f35033b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f35040i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f35040i.setRepeatCount(1);
        this.f35040i.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f35041j = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f35041j.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f35042k = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f35042k.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f35041j);
        animationSet.addAnimation(this.f35042k);
        this.f35041j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f35033b != null) {
                    MBridgeBaitClickView.this.f35033b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f35033b != null) {
                    MBridgeBaitClickView.this.f35033b.setVisibility(0);
                }
            }
        });
        this.f35040i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f35032a != null) {
                            MBridgeBaitClickView.this.f35032a.startAnimation(MBridgeBaitClickView.this.f35040i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f35033b != null) {
                            MBridgeBaitClickView.this.f35033b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f35032a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f35040i);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f35037f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public void init(int i) {
        this.f35038g = i;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f35040i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f35041j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f35042k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f35043l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i = this.f35038g;
        if (i == 2) {
            this.f35033b.setVisibility(4);
            m36247d();
            return;
        }
        if (i == 3) {
            m36248e();
            return;
        }
        if (i == 4) {
            this.f35033b.setVisibility(4);
            m36242a();
        } else if (i != 5) {
            m36244b();
        } else {
            m36246c();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36242a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f35040i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f35040i.setRepeatCount(1);
        this.f35040i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f35032a != null) {
                            MBridgeBaitClickView.this.f35032a.startAnimation(MBridgeBaitClickView.this.f35040i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f35032a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f35040i);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36244b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f35040i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f35040i.setRepeatCount(-1);
        this.f35040i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f35032a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f35040i);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f35041j = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f35041j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f35042k = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f35042k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f35041j);
        animationSet.addAnimation(this.f35042k);
        MBridgeDyImageView mBridgeDyImageView2 = this.f35033b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m36246c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f35043l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f35043l.setRepeatMode(2);
        this.f35043l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f35041j = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f35041j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f35042k = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f35042k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f35041j);
        animationSet.addAnimation(this.f35042k);
        MBridgeDyImageView mBridgeDyImageView = this.f35032a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f35043l);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f35033b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i, int i2) {
        this.f35039h = i;
        this.f35038g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.f35039h = i;
        this.f35038g = i2;
        this.f35035d = str;
        this.f35036e = str2;
        this.f35037f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35035d = "";
        this.f35036e = "";
        this.f35037f = "Click now for details";
        this.f35038g = 1;
        this.f35039h = C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    public void init() {
        try {
            setBackgroundColor(this.f35039h);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iM37876a = C13229v0.m37876a(getContext(), 55.0f);
            int iM37876a2 = C13229v0.m37876a(getContext(), 33.0f);
            this.f35033b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a, iM37876a);
            layoutParams.setMargins(iM37876a2, iM37876a2, 0, 0);
            this.f35033b.setLayoutParams(layoutParams);
            final int iM37707a = C13203i0.m37707a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f35036e)) {
                this.f35033b.setImageResource(iM37707a);
            } else {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f35035d, new InterfaceC13101c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f35033b.setImageResource(iM37707a);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f35033b.setImageBitmap(bitmap);
                    }
                });
            }
            int iM37876a3 = C13229v0.m37876a(getContext(), 108.0f);
            int iM37876a4 = C13229v0.m37876a(getContext(), 35.0f);
            int iM37876a5 = C13229v0.m37876a(getContext(), 43.0f);
            this.f35032a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM37876a3, iM37876a3);
            layoutParams2.setMargins(iM37876a4, iM37876a5, 0, 0);
            this.f35032a.setLayoutParams(layoutParams2);
            final int iM37707a2 = C13203i0.m37707a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f35035d)) {
                this.f35032a.setImageResource(iM37707a2);
            } else {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f35035d, new InterfaceC13101c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f35032a.setImageResource(iM37707a2);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f35032a.setImageBitmap(bitmap);
                    }
                });
            }
            relativeLayout.addView(this.f35033b);
            relativeLayout.addView(this.f35032a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f35034c = new TextView(getContext());
            this.f35034c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f35034c.setText(this.f35037f);
            this.f35034c.setTextColor(-1);
            this.f35034c.setGravity(14);
            linearLayout.addView(this.f35034c);
            addView(linearLayout);
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeAnimationClickView", th.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35035d = "";
        this.f35036e = "";
        this.f35037f = "Click now for details";
        this.f35038g = 1;
        this.f35039h = C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35035d = "";
        this.f35036e = "";
        this.f35037f = "Click now for details";
        this.f35038g = 1;
        this.f35039h = C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN;
    }
}
