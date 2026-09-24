package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class MBAcquireRewardPopView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    private final String f35127a;

    /* JADX INFO: renamed from: b */
    private AcquireRewardPopViewParameters f35128b;

    /* JADX INFO: renamed from: c */
    private AnimationSet f35129c;

    /* JADX INFO: renamed from: d */
    private float f35130d;

    /* JADX INFO: renamed from: e */
    private float f35131e;

    /* JADX INFO: renamed from: f */
    private float f35132f;

    /* JADX INFO: renamed from: g */
    private float f35133g;

    /* JADX INFO: renamed from: h */
    private int f35134h;

    /* JADX INFO: renamed from: i */
    private boolean f35135i;

    /* JADX INFO: renamed from: j */
    private boolean f35136j;

    /* JADX INFO: renamed from: k */
    private TextView f35137k;

    /* JADX INFO: renamed from: l */
    private final View.OnClickListener f35138l;

    /* JADX INFO: renamed from: m */
    private Runnable f35139m;

    /* JADX INFO: renamed from: n */
    private Runnable f35140n;

    /* JADX INFO: renamed from: o */
    private View.OnTouchListener f35141o;

    /* JADX INFO: renamed from: p */
    private final View.OnClickListener f35142p;

    /* JADX INFO: renamed from: q */
    private final View.OnClickListener f35143q;

    public MBAcquireRewardPopView(Context context) {
        super(context);
        this.f35127a = "MBAcquireRewardPopView";
        this.f35130d = 0.0f;
        this.f35131e = 0.0f;
        this.f35132f = 0.0f;
        this.f35133g = 0.0f;
        this.f35138l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f35128b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
            }
        };
        this.f35139m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f35134h > 0) {
                    MBAcquireRewardPopView.m36287n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f35139m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f35135i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f35140n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f35135i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f35141o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f35130d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f35131e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f35132f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f35133g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f35132f <= MBAcquireRewardPopView.this.f35130d || Math.abs(MBAcquireRewardPopView.this.f35132f - MBAcquireRewardPopView.this.f35130d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f35133g - MBAcquireRewardPopView.this.f35131e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                } else {
                    if (MBAcquireRewardPopView.this.f35136j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                    MBAcquireRewardPopView.this.f35136j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
                }
                return false;
            }
        };
        this.f35142p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                }
            }
        };
        this.f35143q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f35135i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        String str;
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, C13229v0.m37876a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f35128b;
        int i = acquireRewardPopViewParameters2.viewType;
        if (i == 1) {
            str = acquireRewardPopViewParameters2.successTitle;
        } else {
            str = i == 2 ? acquireRewardPopViewParameters2.slideSuccessTitle : "";
        }
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setText(String.format(" %s ", str));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableM36261a = m36261a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f35128b.successTipTextColor);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f35128b;
        textView.setText(String.format(acquireRewardPopViewParameters3.successTip, Integer.valueOf(acquireRewardPopViewParameters3.reduceTime)));
        int iM37876a = C13229v0.m37876a(getContext(), 6.0f);
        int iM37876a2 = C13229v0.m37876a(getContext(), 32.0f);
        textView.setPadding(iM37876a2, iM37876a, iM37876a2, iM37876a);
        textView.setBackground(gradientDrawableM36261a);
        linearLayout.addView(textView);
        return linearLayout;
    }

    private View getSlidePopView() {
        int iM37876a = C13229v0.m37876a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM37876a, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.successTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.successTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.successTitleShadowColor;
        gradientAndShadowParameters.textSize = 30;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, C13229v0.m37876a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", this.f35128b.slideTitle));
        mBGradientAndShadowTextView.setGravity(17);
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableM36261a = m36261a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00FDB258, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_FFE39E4A, AcquireRewardPopViewConst.DEFAULT_COLOR_00F3A850}, GradientDrawable.Orientation.LEFT_RIGHT);
        this.f35137k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMargins(0, 0, 0, C13229v0.m37876a(getContext(), 25.0f));
        this.f35137k.setLayoutParams(layoutParams3);
        this.f35137k.setTextSize(12.0f);
        this.f35137k.setGravity(17);
        this.f35137k.setTextColor(this.f35128b.successTipTextColor);
        TextView textView = this.f35137k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f35128b;
        textView.setText(String.format(acquireRewardPopViewParameters2.slideTip, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        int iM37876a2 = C13229v0.m37876a(getContext(), 6.0f);
        int iM37876a3 = C13229v0.m37876a(getContext(), 32.0f);
        this.f35137k.setPadding(iM37876a3, iM37876a2, iM37876a3, iM37876a2);
        this.f35137k.setBackground(gradientDrawableM36261a);
        linearLayout.addView(this.f35137k);
        View imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        imageView.setLayoutParams(layoutParams4);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_slide_rightarrow", "drawable", C13008c.m36588n().m36550i()));
        linearLayout.addView(imageView);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView2.setBackgroundResource(getResources().getIdentifier("mbridge_slide_hand", "drawable", C13008c.m36588n().m36550i()));
        linearLayout.addView(imageView2);
        imageView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.m36266a(view);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (MBAcquireRewardPopView.this.f35129c != null) {
                    MBAcquireRewardPopView.this.f35129c.cancel();
                }
            }
        });
        linearLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MBAcquireRewardPopView.this.setLongClickable(true);
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.setOnTouchListener(mBAcquireRewardPopView.f35141o);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        MBGradientAndShadowTextView.GradientAndShadowParameters gradientAndShadowParameters = new MBGradientAndShadowTextView.GradientAndShadowParameters();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        gradientAndShadowParameters.gradientStartColor = acquireRewardPopViewParameters.failTitleGradientStartColor;
        gradientAndShadowParameters.gradientEndColor = acquireRewardPopViewParameters.failTitleGradientEndColor;
        gradientAndShadowParameters.shadowColor = acquireRewardPopViewParameters.failTitleShadowColor;
        MBGradientAndShadowTextView mBGradientAndShadowTextView = new MBGradientAndShadowTextView(getContext(), gradientAndShadowParameters);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, 0, 0, C13229v0.m37876a(getContext(), 12.0f));
        layoutParams2.gravity = 1;
        mBGradientAndShadowTextView.setGravity(17);
        mBGradientAndShadowTextView.setLayoutParams(layoutParams2);
        mBGradientAndShadowTextView.setText(String.format(" %s ", this.f35128b.failTitle));
        linearLayout.addView(mBGradientAndShadowTextView);
        GradientDrawable gradientDrawableM36261a = m36261a(new int[]{AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_FFB09A80, AcquireRewardPopViewConst.DEFAULT_COLOR_00B09A80}, GradientDrawable.Orientation.LEFT_RIGHT);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setLayoutParams(layoutParams3);
        textView.setTextSize(12.0f);
        textView.setGravity(17);
        textView.setTextColor(this.f35128b.failTipTextColor);
        textView.setText(String.format(this.f35128b.failTip, ""));
        int iM37876a = C13229v0.m37876a(getContext(), 6.0f);
        int iM37876a2 = C13229v0.m37876a(getContext(), 32.0f);
        textView.setPadding(iM37876a2, iM37876a, iM37876a2, iM37876a);
        textView.setBackground(gradientDrawableM36261a);
        linearLayout.addView(textView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: n */
    static /* synthetic */ int m36287n(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i = mBAcquireRewardPopView.f35134h;
        mBAcquireRewardPopView.f35134h = i - 1;
        return i;
    }

    public void init(AcquireRewardPopViewParameters acquireRewardPopViewParameters) {
        View slidePopView;
        if (acquireRewardPopViewParameters == null) {
            C13219q0.m37816b("MBAcquireRewardPopView", "Must generate parameters.");
            return;
        }
        this.f35128b = acquireRewardPopViewParameters;
        if (acquireRewardPopViewParameters.viewType == 1) {
            slidePopView = m36263a(m36265a());
            if (this.f35128b.canClickMaskArea) {
                setOnClickListener(this.f35142p);
            }
        } else {
            slidePopView = null;
        }
        if (this.f35128b.viewType == 2) {
            slidePopView = getSlidePopView();
        }
        if (slidePopView != null) {
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            setBackgroundColor(this.f35128b.containerBackgroundColor);
            addView(slidePopView);
            int i = this.f35128b.autoDismissTime;
            if (i > 0) {
                this.f35134h = i;
                post(this.f35139m);
                this.f35135i = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f35139m);
    }

    public void onPause() {
        if (!this.f35135i || this.f35134h <= 0) {
            return;
        }
        removeCallbacks(this.f35139m);
    }

    public void onResume() {
        if (!this.f35135i || this.f35134h <= 0) {
            return;
        }
        post(this.f35139m);
    }

    public void onStop() {
        if (!this.f35135i || this.f35134h <= 0) {
            return;
        }
        removeCallbacks(this.f35139m);
    }

    public void onTimeLessThanReduce(int i) {
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        acquireRewardPopViewParameters.reduceTime = i;
        TextView textView = this.f35137k;
        if (textView != null) {
            textView.setText(String.format(acquireRewardPopViewParameters.tips, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    private View m36263a(ArrayList<String> arrayList) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(getContext(), 290.0f), -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setClickable(true);
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        linearLayout.setBackground(m36262a(acquireRewardPopViewParameters.viewBackLayerTopColor, acquireRewardPopViewParameters.viewBackLayerBottomColor, acquireRewardPopViewParameters.viewForegroundTopColor, acquireRewardPopViewParameters.viewForegroundBottomColor));
        ImageView imageView = new ImageView(getContext());
        int iM37876a = C13229v0.m37876a(getContext(), 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM37876a, iM37876a);
        layoutParams2.gravity = GravityCompat.END;
        layoutParams2.setMargins(0, 13, 13, 0);
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(getResources().getIdentifier("mbridge_reward_popview_close", "drawable", C13008c.m36588n().m36550i()));
        imageView.setOnClickListener(this.f35143q);
        linearLayout.addView(imageView);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        int iM37876a2 = C13229v0.m37876a(getContext(), 18.0f);
        layoutParams3.setMargins(iM37876a2, 5, iM37876a2, C13229v0.m37876a(getContext(), 12.0f));
        textView.setLayoutParams(layoutParams3);
        textView.setText(this.f35128b.title);
        textView.setTextColor(this.f35128b.titleTextColor);
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (arrayList != null && arrayList.size() > 1) {
            int iM37876a3 = C13229v0.m37876a(getContext(), 8.0f);
            int iM37876a4 = C13229v0.m37876a(getContext(), 24.0f);
            int iM37876a5 = C13229v0.m37876a(getContext(), 30.0f);
            int iM37876a6 = C13229v0.m37876a(getContext(), 12.0f);
            int iM37876a7 = C13229v0.m37876a(getContext(), 40.0f);
            for (int i = 0; i < arrayList.size(); i++) {
                boolean zContains = this.f35128b.rightAnswerList.contains(arrayList.get(i));
                TextView textView2 = new TextView(getContext());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 1;
                layoutParams4.setMargins(iM37876a5, iM37876a6, iM37876a5, 0);
                textView2.setPadding(iM37876a4, iM37876a3, iM37876a4, iM37876a3);
                textView2.setLayoutParams(layoutParams4);
                textView2.setText(arrayList.get(i));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setTag(arrayList.get(i));
                textView2.setTextSize(17.0f);
                textView2.setGravity(17);
                textView2.setTextColor(zContains ? this.f35128b.buttonTextLightColor : this.f35128b.buttonTextDarkColor);
                textView2.setBackground(m36260a(zContains ? this.f35128b.buttonBackgroundLightColor : this.f35128b.buttonBackgroundDarkColor, iM37876a7));
                textView2.setOnClickListener(this.f35138l);
                linearLayout.addView(textView2);
            }
        }
        this.f35137k = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int iM37876a8 = C13229v0.m37876a(getContext(), 16.0f);
        int iM37876a9 = C13229v0.m37876a(getContext(), 18.0f);
        layoutParams5.setMargins(iM37876a9, iM37876a8, iM37876a9, iM37876a8);
        layoutParams5.gravity = 1;
        this.f35137k.setLayoutParams(layoutParams5);
        TextView textView3 = this.f35137k;
        AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f35128b;
        textView3.setText(String.format(acquireRewardPopViewParameters2.tips, Integer.valueOf(acquireRewardPopViewParameters2.reduceTime)));
        this.f35137k.setTextColor(this.f35128b.tipTextColor);
        this.f35137k.setGravity(17);
        this.f35137k.setTextSize(12.0f);
        linearLayout.addView(this.f35137k);
        return linearLayout;
    }

    /* JADX INFO: renamed from: a */
    private LayerDrawable m36262a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawableM36261a = m36261a(new int[]{i, i2}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableM36261a.setCornerRadius(C13229v0.m37876a(getContext(), 12.0f));
        GradientDrawable gradientDrawableM36261a2 = m36261a(new int[]{i3, i4}, GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawableM36261a2.setCornerRadius(C13229v0.m37876a(getContext(), 12.0f));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableM36261a, gradientDrawableM36261a2});
        layerDrawable.setLayerInset(1, 5, 5, 5, 5);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: a */
    private GradientDrawable m36260a(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i2);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: a */
    private GradientDrawable m36261a(int[] iArr, GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m36266a(final View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.8f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(1000L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        AnimationSet animationSet = new AnimationSet(true);
        this.f35129c = animationSet;
        animationSet.addAnimation(translateAnimation);
        this.f35129c.addAnimation(alphaAnimation);
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(1000L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(MBAcquireRewardPopView.this.f35129c);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.f35129c.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.startAnimation(alphaAnimation2);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(this.f35129c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m36267a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    /* JADX INFO: renamed from: a */
    private ArrayList<String> m36265a() {
        ArrayList<String> arrayList = new ArrayList<>();
        AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f35128b;
        if (acquireRewardPopViewParameters != null) {
            List<String> list = acquireRewardPopViewParameters.rightAnswerList;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (this.f35128b.wrongAnswerList != null) {
                int iNextInt = new Random().nextInt(this.f35128b.wrongAnswerList.size());
                if (iNextInt > this.f35128b.wrongAnswerList.size() - 1) {
                    iNextInt = 0;
                }
                arrayList.add(this.f35128b.wrongAnswerList.get(iNextInt));
            }
        }
        return arrayList;
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35127a = "MBAcquireRewardPopView";
        this.f35130d = 0.0f;
        this.f35131e = 0.0f;
        this.f35132f = 0.0f;
        this.f35133g = 0.0f;
        this.f35138l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f35128b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
            }
        };
        this.f35139m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f35134h > 0) {
                    MBAcquireRewardPopView.m36287n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f35139m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f35135i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f35140n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f35135i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f35141o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f35130d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f35131e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f35132f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f35133g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f35132f <= MBAcquireRewardPopView.this.f35130d || Math.abs(MBAcquireRewardPopView.this.f35132f - MBAcquireRewardPopView.this.f35130d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f35133g - MBAcquireRewardPopView.this.f35131e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                } else {
                    if (MBAcquireRewardPopView.this.f35136j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                    MBAcquireRewardPopView.this.f35136j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
                }
                return false;
            }
        };
        this.f35142p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                }
            }
        };
        this.f35143q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f35135i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35127a = "MBAcquireRewardPopView";
        this.f35130d = 0.0f;
        this.f35131e = 0.0f;
        this.f35132f = 0.0f;
        this.f35133g = 0.0f;
        this.f35138l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f35128b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
            }
        };
        this.f35139m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f35134h > 0) {
                    MBAcquireRewardPopView.m36287n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f35139m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f35135i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f35140n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f35135i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f35141o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f35130d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f35131e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f35132f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f35133g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f35132f <= MBAcquireRewardPopView.this.f35130d || Math.abs(MBAcquireRewardPopView.this.f35132f - MBAcquireRewardPopView.this.f35130d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f35133g - MBAcquireRewardPopView.this.f35131e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                } else {
                    if (MBAcquireRewardPopView.this.f35136j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                    MBAcquireRewardPopView.this.f35136j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
                }
                return false;
            }
        };
        this.f35142p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                }
            }
        };
        this.f35143q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f35135i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35127a = "MBAcquireRewardPopView";
        this.f35130d = 0.0f;
        this.f35131e = 0.0f;
        this.f35132f = 0.0f;
        this.f35133g = 0.0f;
        this.f35138l = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                String str = (String) view.getTag();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                boolean zContains = MBAcquireRewardPopView.this.f35128b.rightAnswerList.contains(str);
                View rightAnswerView = zContains ? MBAcquireRewardPopView.this.getRightAnswerView() : MBAcquireRewardPopView.this.getWrongAnswerView();
                View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                if (childAt != null) {
                    MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                }
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    if (zContains) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    } else {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_WRONG_ANSWER);
                    }
                }
                MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
            }
        };
        this.f35139m = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.6
            @Override // java.lang.Runnable
            public void run() {
                if (MBAcquireRewardPopView.this.f35134h > 0) {
                    MBAcquireRewardPopView.m36287n(MBAcquireRewardPopView.this);
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f35139m, 1000L);
                } else {
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_AUTO_DISMISS);
                    }
                    MBAcquireRewardPopView.this.f35135i = false;
                    MBAcquireRewardPopView.this.setVisibility(8);
                    MBAcquireRewardPopView.this.removeAllViews();
                }
            }
        };
        this.f35140n = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7
            @Override // java.lang.Runnable
            public void run() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.7.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBAcquireRewardPopView.this.f35135i = false;
                        MBAcquireRewardPopView.this.setVisibility(8);
                        MBAcquireRewardPopView.this.removeAllViews();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
            }
        };
        this.f35141o = new View.OnTouchListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.8
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    MBAcquireRewardPopView.this.f35130d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f35131e = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        MBAcquireRewardPopView.this.f35132f = motionEvent.getX();
                        MBAcquireRewardPopView.this.f35133g = motionEvent.getY();
                    }
                } else if (MBAcquireRewardPopView.this.f35132f <= MBAcquireRewardPopView.this.f35130d || Math.abs(MBAcquireRewardPopView.this.f35132f - MBAcquireRewardPopView.this.f35130d) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f35133g - MBAcquireRewardPopView.this.f35131e) >= 100.0f) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                } else {
                    if (MBAcquireRewardPopView.this.f35136j) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f35139m);
                    MBAcquireRewardPopView.this.f35136j = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.m36267a(childAt, rightAnswerView);
                    }
                    if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                        MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedSuccess(MBAcquireRewardPopView.this.f35128b.reduceTime);
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView2 = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView2.postDelayed(mBAcquireRewardPopView2.f35140n, 2000L);
                }
                return false;
            }
        };
        this.f35142p = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onOutOfContentClicked(MBAcquireRewardPopView.this.f35130d, MBAcquireRewardPopView.this.f35131e);
                }
            }
        };
        this.f35143q = new View.OnClickListener() { // from class: com.mbridge.msdk.dycreator.baseview.rewardpopview.MBAcquireRewardPopView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MBAcquireRewardPopView.this.f35128b.behaviourListener != null) {
                    MBAcquireRewardPopView.this.f35128b.behaviourListener.onReceivedFail(AcquireRewardPopViewConst.DEFAULT_REASON_CLICK_CLOSE);
                }
                MBAcquireRewardPopView.this.f35135i = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }
        };
    }
}
