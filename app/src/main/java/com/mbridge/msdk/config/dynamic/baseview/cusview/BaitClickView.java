package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.common.C0684C;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a */
    private ImageView f34517a;

    /* JADX INFO: renamed from: b */
    private ImageView f34518b;

    /* JADX INFO: renamed from: c */
    private TextView f34519c;

    /* JADX INFO: renamed from: d */
    private String f34520d;

    /* JADX INFO: renamed from: e */
    private String f34521e;

    /* JADX INFO: renamed from: f */
    private String f34522f;

    /* JADX INFO: renamed from: g */
    private int f34523g;

    /* JADX INFO: renamed from: h */
    private int f34524h;

    /* JADX INFO: renamed from: i */
    private int f34525i;

    /* JADX INFO: renamed from: j */
    private Animation f34526j;

    /* JADX INFO: renamed from: k */
    private Animation f34527k;

    /* JADX INFO: renamed from: l */
    private Animation f34528l;

    /* JADX INFO: renamed from: m */
    private Animation f34529m;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$a */
    class C12863a implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f34530a;

        C12863a(int i) {
            this.f34530a = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f34518b.setImageResource(this.f34530a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f34518b.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$b */
    class C12864b implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f34532a;

        C12864b(int i) {
            this.f34532a = i;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f34517a.setImageResource(this.f34532a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f34517a.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$c */
    class AnimationAnimationListenerC12865c implements Animation.AnimationListener {
        AnimationAnimationListenerC12865c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f34518b != null) {
                BaitClickView.this.f34518b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f34518b != null) {
                BaitClickView.this.f34518b.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$d */
    class AnimationAnimationListenerC12866d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AnimationSet f34535a;

        /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$d$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f34518b != null) {
                    BaitClickView.this.f34518b.startAnimation(AnimationAnimationListenerC12866d.this.f34535a);
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$d$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f34517a != null) {
                    BaitClickView.this.f34517a.startAnimation(BaitClickView.this.f34526j);
                }
            }
        }

        AnimationAnimationListenerC12866d(AnimationSet animationSet) {
            this.f34535a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$e */
    class AnimationAnimationListenerC12867e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.BaitClickView$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f34517a != null) {
                    BaitClickView.this.f34517a.startAnimation(BaitClickView.this.f34526j);
                }
            }
        }

        AnimationAnimationListenerC12867e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34520d = "";
        this.f34521e = "";
        this.f34522f = "Click now for details";
        this.f34523g = 1;
        this.f34524h = C0684C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        this.f34525i = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m35915d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f34526j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f34526j.setRepeatCount(-1);
        this.f34526j.setRepeatMode(2);
        ImageView imageView = this.f34517a;
        if (imageView != null) {
            imageView.startAnimation(this.f34526j);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m35916e() {
        ImageView imageView = this.f34518b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f34526j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f34526j.setRepeatCount(1);
        this.f34526j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f34527k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f34527k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f34528l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f34528l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f34527k);
        animationSet.addAnimation(this.f34528l);
        this.f34527k.setAnimationListener(new AnimationAnimationListenerC12865c());
        this.f34526j.setAnimationListener(new AnimationAnimationListenerC12866d(animationSet));
        ImageView imageView2 = this.f34517a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f34526j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f34522f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            C13219q0.m37816b("BaitClickView", th.getMessage());
        }
    }

    public void init(int i) {
        this.f34523g = i;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f34526j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f34527k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f34528l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f34529m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f34525i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e) {
            C13219q0.m37816b("BaitClickView", e.getMessage());
        }
    }

    public void startAnimation() {
        int i = this.f34523g;
        if (i == 2) {
            this.f34518b.setVisibility(4);
            m35915d();
            return;
        }
        if (i == 3) {
            m35916e();
            return;
        }
        if (i == 4) {
            this.f34518b.setVisibility(4);
            m35910a();
        } else if (i != 5) {
            m35912b();
        } else {
            m35914c();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35910a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f34526j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f34526j.setRepeatCount(1);
        this.f34526j.setAnimationListener(new AnimationAnimationListenerC12867e());
        ImageView imageView = this.f34517a;
        if (imageView != null) {
            imageView.startAnimation(this.f34526j);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35912b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f34526j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f34526j.setRepeatCount(-1);
        this.f34526j.setRepeatMode(2);
        ImageView imageView = this.f34517a;
        if (imageView != null) {
            imageView.startAnimation(this.f34526j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f34527k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f34527k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f34528l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f34528l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f34527k);
        animationSet.addAnimation(this.f34528l);
        ImageView imageView2 = this.f34518b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m35914c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f34529m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f34529m.setRepeatMode(2);
        this.f34529m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f34527k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f34527k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f34528l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f34528l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f34527k);
        animationSet.addAnimation(this.f34528l);
        ImageView imageView = this.f34517a;
        if (imageView != null) {
            imageView.startAnimation(this.f34529m);
        }
        ImageView imageView2 = this.f34518b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    public void init(int i, int i2) {
        this.f34524h = i;
        this.f34523g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.f34524h = i;
        this.f34523g = i2;
        this.f34520d = str;
        this.f34521e = str2;
        this.f34522f = str3;
        init();
    }

    public void init() {
        try {
            if (this.f34525i == 0) {
                setBackgroundColor(this.f34524h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f34524h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(C13229v0.m37876a(getContext(), this.f34525i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iM37876a = C13229v0.m37876a(getContext(), 55.0f);
            int iM37876a2 = C13229v0.m37876a(getContext(), 33.0f);
            this.f34518b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a, iM37876a);
            layoutParams.setMargins(iM37876a2, iM37876a2, 0, 0);
            this.f34518b.setLayoutParams(layoutParams);
            int iM37707a = C13203i0.m37707a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f34521e)) {
                this.f34518b.setImageResource(iM37707a);
            } else {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f34520d, new C12863a(iM37707a));
            }
            int iM37876a3 = C13229v0.m37876a(getContext(), 108.0f);
            int iM37876a4 = C13229v0.m37876a(getContext(), 35.0f);
            int iM37876a5 = C13229v0.m37876a(getContext(), 43.0f);
            this.f34517a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iM37876a3, iM37876a3);
            layoutParams2.setMargins(iM37876a4, iM37876a5, 0, 0);
            this.f34517a.setLayoutParams(layoutParams2);
            int iM37707a2 = C13203i0.m37707a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f34520d)) {
                this.f34517a.setImageResource(iM37707a2);
            } else {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(this.f34520d, new C12864b(iM37707a2));
            }
            relativeLayout.addView(this.f34518b);
            relativeLayout.addView(this.f34517a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f34519c = new TextView(getContext());
            this.f34519c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f34519c.setText(this.f34522f);
            this.f34519c.setTextColor(-1);
            this.f34519c.setGravity(14);
            linearLayout.addView(this.f34519c);
            addView(linearLayout);
        } catch (Throwable th) {
            C13219q0.m37816b("BaitClickView", th.getMessage());
        }
    }
}
