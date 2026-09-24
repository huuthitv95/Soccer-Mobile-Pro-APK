package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public class TTAdDislikeToast extends C3192ik {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextM14642ri = C3299nr.m14642ri();
            sDislikeSendTip = C2729uq.m10311ri(contextM14642ri, "tt_feedback_thank_text") + "\n" + C2729uq.m10311ri(contextM14642ri, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = C2729uq.m10311ri(C3299nr.m14642ri(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = C2729uq.m10311ri(C3299nr.m14642ri(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = C3583qd.m16589lr(getContext(), 75.0f);
        int iM16589lr = C3583qd.m16589lr(C3299nr.m14642ri(), 16.0f);
        int iM16589lr2 = C3583qd.m16589lr(C3299nr.m14642ri(), 12.0f);
        this.mTextView.setPadding(iM16589lr, iM16589lr2, iM16589lr, iM16589lr2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(GravityCompat.START);
        Drawable drawableM10303ik = C2729uq.m10303ik(getContext(), "tt_dislike_toast");
        int iM16589lr3 = C3583qd.m16589lr(getContext(), 16.0f);
        drawableM10303ik.setBounds(0, 0, iM16589lr3, iM16589lr3);
        this.mTextView.setCompoundDrawablePadding(iM16589lr3 / 2);
        this.mTextView.setCompoundDrawables(drawableM10303ik, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 37, 37, 37));
        gradientDrawable.setCornerRadius(C3583qd.m16589lr(C3299nr.m14642ri(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextM14642ri = C3299nr.m14642ri();
        sSkipText = C2729uq.m10311ri(contextM14642ri, "tt_reward_screen_skip_tx");
        sDislikeTip = C2729uq.m10311ri(contextM14642ri, "tt_feedback_submit_text");
        sDislikeSendTip = C2729uq.m10311ri(contextM14642ri, "tt_feedback_thank_text") + "\n" + C2729uq.m10311ri(contextM14642ri, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }
}
