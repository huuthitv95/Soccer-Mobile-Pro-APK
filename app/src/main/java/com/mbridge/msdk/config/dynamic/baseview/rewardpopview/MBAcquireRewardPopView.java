package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes5.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a */
    private final String f34599a;

    /* JADX INFO: renamed from: b */
    private float f34600b;

    /* JADX INFO: renamed from: c */
    private float f34601c;

    /* JADX INFO: renamed from: d */
    private float f34602d;

    /* JADX INFO: renamed from: e */
    private float f34603e;

    /* JADX INFO: renamed from: f */
    private int f34604f;

    /* JADX INFO: renamed from: g */
    private boolean f34605g;

    /* JADX INFO: renamed from: h */
    private boolean f34606h;

    /* JADX INFO: renamed from: i */
    private final View.OnClickListener f34607i;

    /* JADX INFO: renamed from: j */
    private Runnable f34608j;

    /* JADX INFO: renamed from: k */
    private Runnable f34609k;

    /* JADX INFO: renamed from: l */
    private View.OnTouchListener f34610l;

    /* JADX INFO: renamed from: m */
    private final View.OnClickListener f34611m;

    /* JADX INFO: renamed from: n */
    private final View.OnClickListener f34612n;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$a */
    class ViewOnClickListenerC12877a implements View.OnClickListener {
        ViewOnClickListenerC12877a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$b */
    class ViewOnClickListenerC12878b implements View.OnClickListener {
        ViewOnClickListenerC12878b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34608j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$c */
    class RunnableC12879c implements Runnable {
        RunnableC12879c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f34604f <= 0) {
                MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.m35966j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f34608j, 1000L);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$d */
    class RunnableC12880d implements Runnable {

        /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$d$a */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.f34605g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        RunnableC12880d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$e */
    class ViewOnTouchListenerC12881e implements View.OnTouchListener {
        ViewOnTouchListenerC12881e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.f34600b = motionEvent.getX();
                MBAcquireRewardPopView.this.f34601c = motionEvent.getY();
            } else {
                if (action == 1) {
                    if (MBAcquireRewardPopView.this.f34602d <= MBAcquireRewardPopView.this.f34600b) {
                        MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (Math.abs(MBAcquireRewardPopView.this.f34602d - MBAcquireRewardPopView.this.f34600b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f34603e - MBAcquireRewardPopView.this.f34601c) >= 100.0f) {
                        MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.f34606h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f34608j);
                    MBAcquireRewardPopView.this.f34606h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.m35951a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.f34602d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f34603e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.rewardpopview.MBAcquireRewardPopView$f */
    class ViewOnClickListenerC12882f implements View.OnClickListener {
        ViewOnClickListenerC12882f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.m35963g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34599a = "MBAcquireRewardPopView";
        this.f34600b = 0.0f;
        this.f34601c = 0.0f;
        this.f34602d = 0.0f;
        this.f34603e = 0.0f;
        this.f34607i = new ViewOnClickListenerC12878b();
        this.f34608j = new RunnableC12879c();
        this.f34609k = new RunnableC12880d();
        this.f34610l = new ViewOnTouchListenerC12881e();
        this.f34611m = new ViewOnClickListenerC12882f();
        this.f34612n = new ViewOnClickListenerC12877a();
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ C12884a m35963g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.C12883a();
        throw null;
    }

    private View getSlidePopView() {
        int iM37876a = C13229v0.m37876a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.C12883a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.C12883a();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ int m35966j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i = mBAcquireRewardPopView.f34604f;
        mBAcquireRewardPopView.f34604f = i - 1;
        return i;
    }

    public void init(C12884a c12884a) {
        C13219q0.m37816b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f34608j);
    }

    public void onPause() {
        if (!this.f34605g || this.f34604f <= 0) {
            return;
        }
        removeCallbacks(this.f34608j);
    }

    public void onResume() {
        if (!this.f34605g || this.f34604f <= 0) {
            return;
        }
        post(this.f34608j);
    }

    public void onStop() {
        if (!this.f34605g || this.f34604f <= 0) {
            return;
        }
        removeCallbacks(this.f34608j);
    }

    public void onTimeLessThanReduce(int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35951a(View view, View view2) {
        removeView(view);
        addView(view2);
    }
}
