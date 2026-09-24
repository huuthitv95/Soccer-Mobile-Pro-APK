package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3281fr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka.C3171ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.C3337di;
import com.bytedance.sdk.openadsdk.core.widget.C3341ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;

/* JADX INFO: loaded from: classes3.dex */
public class TopLayoutDislike2 extends C3191fi implements InterfaceC3062ri<TopLayoutDislike2> {
    C3191fi container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private C3193ka mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private C3191fi mPlayableNextAd;
    private C3171ri mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private C3171ri mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private InterfaceC3061lr mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        this.mProgressColor = C2348ri.m8053ri("#FFD813");
        this.mProgressBgColor = C2348ri.m8053ri("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }

    private ImageView getCommonRingBGImageView() {
        C3193ka c3193ka = new C3193ka(getContext());
        int iM16589lr = C3583qd.m16589lr(getContext(), 5.0f);
        c3193ka.setPadding(iM16589lr, iM16589lr, iM16589lr, iM16589lr);
        c3193ka.setScaleType(ImageView.ScaleType.CENTER);
        c3193ka.setBackground(C3341ka.m15010ri());
        return c3193ka;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mo10618lr(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable drawableM16645ri;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.mIsSoundMute = !topLayoutDislike2.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        drawableM16645ri = TopLayoutDislike2.this.mIsSoundMute ? C2729uq.m10303ik(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : C2729uq.m10303ik(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableM16645ri = TopLayoutDislike2.this.mIsSoundMute ? C3586sf.m16645ri(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : C3586sf.m16645ri(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableM16645ri);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.mo10620ri(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mo10619ri(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.mo10619ri(view2);
                        }
                    }
                });
            }
        }
        C3193ka c3193ka = this.mCloseBtn;
        if (c3193ka != null) {
            c3193ka.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mo10616ik(view2);
                    }
                }
            });
        }
        C3191fi c3191fi = this.mPlayableNextAd;
        if (c3191fi != null) {
            c3191fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mo10617ka(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(wjv wjvVar) {
        C3281fr c3281frM14258qt;
        C3281fr.lr lrVarM14123bu;
        if (wjvVar == null || wjvVar.m14428ka() == null || wjvVar.m14428ka().m14258qt() == null || (c3281frM14258qt = wjvVar.m14428ka().m14258qt()) == null || c3281frM14258qt.m14123bu() == null || (lrVarM14123bu = c3281frM14258qt.m14123bu()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(lrVarM14123bu.m14139lr())) {
            this.mProgressColor = C2348ri.m8053ri(lrVarM14123bu.m14139lr());
        }
        if (!TextUtils.isEmpty(lrVarM14123bu.m14137ik())) {
            this.mProgressBgColor = C2348ri.m8053ri(lrVarM14123bu.m14137ik());
        }
        if (lrVarM14123bu.m14138ka() <= 0.0f) {
            this.mProgressSize = C3583qd.m16589lr(getContext(), 1.0f);
        } else {
            this.mProgressSize = C3583qd.m16589lr(getContext(), lrVarM14123bu.m14138ka());
        }
        if (lrVarM14123bu.m14136fi() > 0.0f) {
            this.mProgressRadiusSize = C3583qd.m16589lr(getContext(), lrVarM14123bu.m14136fi());
        }
        this.mProgressType = lrVarM14123bu.m14140ri();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void initView(wjv wjvVar) {
        C3191fi c3191fi = new C3191fi(getContext());
        this.container = c3191fi;
        c3191fi.setOrientation(0);
        int iM16589lr = C3583qd.m16589lr(getContext(), 16.0f);
        int iM16589lr2 = C3583qd.m16589lr(getContext(), 12.0f);
        int iM16589lr3 = C3583qd.m16589lr(getContext(), 24.0f);
        int iM16589lr4 = C3583qd.m16589lr(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams.topMargin = iM16589lr3;
        layoutParams.leftMargin = iM16589lr;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams2.leftMargin = iM16589lr2;
        layoutParams2.topMargin = iM16589lr3;
        this.mImgSound.setId(slm.rmw);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        C3195mj c3195mj = new C3195mj(getContext());
        this.mTextViewCountDown = c3195mj;
        c3195mj.setBackground(C3341ka.m15009lr());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(getContext(), 28.0f));
        layoutParams4.topMargin = iM16589lr3;
        layoutParams4.rightMargin = iM16589lr;
        this.mTextViewCountDown.setPadding(iM16589lr2, 0, iM16589lr2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        C3191fi c3191fi2 = new C3191fi(getContext());
        this.mPlayableNextAd = c3191fi2;
        c3191fi2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iM16589lr4);
        layoutParams5.topMargin = iM16589lr3;
        if (wjvVar == null || !wjvVar.m14532tl()) {
            layoutParams5.rightMargin = iM16589lr;
        } else {
            layoutParams5.rightMargin = C3583qd.m16589lr(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(C3341ka.m15009lr());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new C3195mj(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, C3583qd.m16589lr(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iM16589lr2, 0, 0, 0);
        String strM14100uq = C3279dw.m14100uq(wjvVar);
        if (TextUtils.isEmpty(strM14100uq)) {
            this.mNextAdTextTv.setText(C2729uq.m10307lr(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strM14100uq);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        C3193ka c3193ka = new C3193ka(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iM16589lr2, iM16589lr2);
        layoutParams7.rightMargin = iM16589lr2;
        c3193ka.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        c3193ka.setLayoutParams(layoutParams7);
        c3193ka.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(c3193ka);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iM16589lr4, iM16589lr4);
        layoutParams8.topMargin = iM16589lr3;
        layoutParams8.rightMargin = iM16589lr;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C3193ka c3193kaM14999lr = C3337di.m14999lr(getContext());
        this.mCloseBtn = c3193kaM14999lr;
        c3193kaM14999lr.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iM16589lr3;
        layoutParams9.rightMargin = iM16589lr3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(C2729uq.m10311ri(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new C3171ri(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(C3583qd.m16589lr(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iM16589lr4, iM16589lr4);
            layoutParams10.topMargin = iM16589lr3;
            layoutParams10.rightMargin = iM16589lr;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.m13223ri("ring").m13221ri(this.mProgressSize).m13222ri(this.mProgressColor).m13220lr(this.mProgressBgColor).m13219lr(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        C3192ik c3192ik = new C3192ik(getContext());
        c3192ik.addView(this.mSkipIV);
        C3171ri c3171ri = this.mProgressRing;
        if (c3171ri != null) {
            c3192ik.addView(c3171ri);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new C3171ri(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.m13223ri("line").m13221ri(this.mProgressSize).m13222ri(this.mProgressColor).m13220lr(this.mProgressBgColor).m13219lr(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            c3192ik.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(c3192ik);
        this.container.addView(this.mCloseBtn);
        C3171ri c3171ri2 = this.mProgressBar;
        if (c3171ri2 != null) {
            addView(c3171ri2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    public TopLayoutDislike2 load(wjv wjvVar) {
        boolean z;
        initProgressBar(wjvVar);
        initView(wjvVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_reward_full_feedback"));
        if (!C3322sf.m14819lr().bgr(String.valueOf(wjvVar.m14545ur())) || wjvVar.m14453nd() == 5 || wjvVar.m14453nd() == 6) {
            this.mSkipIV.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(C2729uq.m10305ka(C3299nr.m14642ri(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = wjvVar.m14389eu() == null ? 0 : ((int) wjvVar.m14389eu().m6339di()) * wjvVar.m14389eu().m6365uq();
        if (C3273ac.m13968ka(wjvVar) && wjvVar.m14364ay() != null) {
            this.videoDuration = (int) wjvVar.m14364ay().m14167lr();
        } else if (C3273ac.xha(wjvVar) && wjvVar.m14364ay() != null) {
            this.videoDuration = (int) wjvVar.m14364ay().m14165ka();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (wjvVar.lji() != 8 || wjvVar.m14388eb() == null) {
            this.skipTime = wjvVar.plm();
        } else {
            this.skipTime = wjvVar.mhp();
        }
        if (!C3279dw.m14090ik(wjvVar)) {
            int i = this.skipTime;
            if (i != -1 && i < this.videoDuration) {
                z = false;
            }
            this.shouldShowSkipTime = z;
            if (wjvVar.m14576zz()) {
                this.mImgDislike.setVisibility(8);
                this.isVast = true;
            }
            this.mTextViewCountDown.setVisibility(4);
            this.mTextViewCountDown.setText("");
            this.mTextViewCountDown.setEnabled(false);
            this.mTextViewCountDown.setClickable(false);
            initListener();
            return this;
        }
        this.skipTime = wjvVar.m14563ye();
        this.videoDuration = wjvVar.m14405gy();
        z = true;
        this.shouldShowSkipTime = z;
        if (wjvVar.m14576zz()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        int i2 = this.mProgressType;
        if (i2 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i2 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setListener(InterfaceC3061lr interfaceC3061lr) {
        this.mTopListener = interfaceC3061lr;
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowDislike(boolean z) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowEndCardNextAd(boolean z, wjv wjvVar) {
        C3191fi c3191fi = this.mPlayableNextAd;
        if (c3191fi != null) {
            c3191fi.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z || wjvVar == null || wjvVar.dob() == null) {
                return;
            }
            String strM14296ik = wjvVar.dob().m14296ik();
            if (TextUtils.isEmpty(strM14296ik)) {
                return;
            }
            this.mNextAdTextTv.setText(strM14296ik);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowPlayableNextAd(boolean z, wjv wjvVar) {
        C3191fi c3191fi = this.mPlayableNextAd;
        if (c3191fi != null) {
            c3191fi.setVisibility(z ? 0 : 8);
            if (this.mNextAdTextTv == null || !z) {
                return;
            }
            String strM14100uq = C3279dw.m14100uq(wjvVar);
            if (TextUtils.isEmpty(strM14100uq)) {
                this.mNextAdTextTv.setText(C2729uq.m10307lr(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strM14100uq);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowSkip(boolean z) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setShowSound(boolean z) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setSoundMute(boolean z) {
        Drawable drawableM16645ri;
        this.mIsSoundMute = z;
        if (this.mSkipIV != null) {
            drawableM16645ri = z ? C2729uq.m10303ik(getContext(), "tt_reward_full_mute") : C2729uq.m10303ik(getContext(), "tt_reward_full_unmute");
        } else {
            drawableM16645ri = z ? C3586sf.m16645ri(getContext(), "tt_mute_wrapper") : C3586sf.m16645ri(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableM16645ri);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + CmcdData.Factory.STREAMING_FORMAT_SS);
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i = this.skipTime;
            int i2 = i == 0 ? Integer.parseInt(str) : i - (this.videoDuration - Integer.parseInt(str));
            if (i2 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + CmcdData.Factory.STREAMING_FORMAT_SS);
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i2 + CmcdData.Factory.STREAMING_FORMAT_SS);
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        C3171ri c3171ri = this.mProgressRing;
        if (c3171ri != null) {
            c3171ri.setVisibility(8);
        }
        C3171ri c3171ri2 = this.mProgressBar;
        if (c3171ri2 != null) {
            c3171ri2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3062ri
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        C3171ri c3171ri = this.mProgressRing;
        if (c3171ri != null) {
            c3171ri.setVisibility(8);
        }
        C3171ri c3171ri2 = this.mProgressBar;
        if (c3171ri2 != null) {
            c3171ri2.setVisibility(8);
        }
    }
}
