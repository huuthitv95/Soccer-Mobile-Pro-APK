package com.mbridge.msdk.video.dynview.wrapper;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.dynview.C13942c;
import com.mbridge.msdk.video.dynview.constant.C13943a;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.dynview.util.drawable.C13978a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.b */
/* JADX INFO: compiled from: UIEnergizeWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13986b {

    /* JADX INFO: renamed from: a */
    private String f40172a = "mbridge_top_play_bg";

    /* JADX INFO: renamed from: b */
    private String f40173b = "mbridge_top_finger_bg";

    /* JADX INFO: renamed from: c */
    private String f40174c = "mbridge_bottom_play_bg";

    /* JADX INFO: renamed from: d */
    private String f40175d = "mbridge_bottom_finger_bg";

    /* JADX INFO: renamed from: e */
    private String f40176e = "mbridge_tv_count";

    /* JADX INFO: renamed from: f */
    private String f40177f = "mbridge_sound_switch";

    /* JADX INFO: renamed from: g */
    private String f40178g = "mbridge_top_control";

    /* JADX INFO: renamed from: h */
    private String f40179h = "mbridge_tv_title";

    /* JADX INFO: renamed from: i */
    private String f40180i = "mbridge_tv_desc";

    /* JADX INFO: renamed from: j */
    private String f40181j = "mbridge_tv_install";

    /* JADX INFO: renamed from: k */
    private String f40182k = "mbridge_sv_starlevel";

    /* JADX INFO: renamed from: l */
    private String f40183l = "mbridge_sv_heat_count_level";

    /* JADX INFO: renamed from: m */
    private String f40184m = "mbridge_tv_cta";

    /* JADX INFO: renamed from: n */
    private String f40185n = "mbridge_native_ec_controller";

    /* JADX INFO: renamed from: o */
    private String f40186o = "mbridge_reward_shape_choice_rl";

    /* JADX INFO: renamed from: p */
    private String f40187p = "#FFFFFF";

    /* JADX INFO: renamed from: q */
    private String f40188q = "#FF000000";

    /* JADX INFO: renamed from: r */
    private String f40189r = "#40000000";

    /* JADX INFO: renamed from: s */
    private String f40190s = "#CAEF79";

    /* JADX INFO: renamed from: t */
    private String f40191t = "#2196F3";

    /* JADX INFO: renamed from: u */
    private String f40192u = "#402196F3";

    /* JADX INFO: renamed from: v */
    private String f40193v = "#8FC31F";

    /* JADX INFO: renamed from: w */
    private String f40194w = "#03A9F4";

    /* JADX INFO: renamed from: x */
    private String f40195x = "#FF89C120";

    /* JADX INFO: renamed from: y */
    private String f40196y = "#FF2BAE5D";

    /* JADX INFO: renamed from: z */
    private boolean f40197z = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.wrapper.b$a */
    /* JADX INFO: compiled from: UIEnergizeWrapper.java */
    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41924a(Context context, View view, C13942c c13942c) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m41930b(this.f40185n));
        if (relativeLayout != null) {
            if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin + C13943a.f39977a, layoutParams.topMargin + C13943a.f39979c, layoutParams.rightMargin + C13943a.f39978b, layoutParams.bottomMargin + C13943a.f39980d);
                relativeLayout.setLayoutParams(layoutParams);
            }
            if (relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams2.setMargins(layoutParams2.leftMargin + C13943a.f39977a, layoutParams2.topMargin + C13943a.f39979c, layoutParams2.rightMargin + C13943a.f39978b, layoutParams2.bottomMargin + C13943a.f39980d);
                relativeLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41925a(View view) {
        RelativeLayout relativeLayout = this.f40197z ? (RelativeLayout) view.findViewById(m41926a(this.f40178g)) : (RelativeLayout) view.findViewById(m41930b(this.f40178g));
        if (relativeLayout != null) {
            if (C13943a.f39977a == 0 && C13943a.f39978b == 0 && C13943a.f39979c == 0 && C13943a.f39980d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m41926a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public void m41927a(View view, C13942c c13942c) {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX INFO: renamed from: a */
    public void m41928a(View view, C13942c c13942c, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        String str3;
        float f;
        RelativeLayout.LayoutParams layoutParams;
        Context context = view != null ? view.getContext() : null;
        if (context == null || c13942c == null) {
            return;
        }
        if (map == null || !map.containsKey("is_dy_success")) {
            textView = (TextView) view.findViewById(m41930b(this.f40176e));
            textView2 = (TextView) view.findViewById(m41930b("mbridge_reward_click_tv"));
        } else {
            boolean zBooleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
            this.f40197z = zBooleanValue;
            if (zBooleanValue) {
                textView = (TextView) view.findViewById(m41926a(this.f40176e));
                textView2 = (TextView) view.findViewById(m41926a("mbridge_reward_click_tv"));
            } else {
                textView = (TextView) view.findViewById(m41930b(this.f40176e));
                textView2 = (TextView) view.findViewById(m41930b("mbridge_reward_click_tv"));
            }
        }
        if (textView != null) {
            textView.setBackgroundResource(C13203i0.m37707a(context, "mbridge_reward_shape_progress", "drawable"));
            textView.setTextColor(Color.parseColor(this.f40187p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof MBridgeTextView) {
                ((MBridgeTextView) textView2).setObjectAnimator(new C13975b().m41847a(textView2));
            }
            if (textView2 instanceof MBTextView) {
                ((MBTextView) textView2).setAnimator(new C13975b().m41847a(textView2));
            }
        }
        String str4 = this.f40188q;
        String str5 = this.f40190s;
        int iM41716l = c13942c.m41716l();
        float f2 = 10.0f;
        float f3 = 1.0f;
        if (iM41716l != 302) {
            if (iM41716l == 802) {
                str = this.f40187p;
                str4 = this.f40188q;
                f3 = 0.5f;
                str3 = this.f40189r;
                f = 25.0f;
                str2 = str;
            } else if (iM41716l != 5002010) {
                str = this.f40193v;
                str2 = this.f40190s;
                f2 = 5.0f;
            } else {
                String str6 = this.f40193v;
                str4 = this.f40187p;
                str = str6;
                str2 = str;
                f = 10.0f;
                str3 = str2;
            }
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(str4));
                C13978a.m41869a(textView2, f3, f, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
            if (c13942c.m41713i() != null && (layoutParams = (RelativeLayout.LayoutParams) c13942c.m41713i().getLayoutParams()) != null) {
                layoutParams.setMargins(0, 0, 0, 0);
                c13942c.m41713i().setLayoutParams(layoutParams);
            }
            m41925a(view);
        }
        str = this.f40191t;
        str2 = this.f40194w;
        str4 = this.f40187p;
        str5 = this.f40192u;
        float f4 = f2;
        str3 = str5;
        f = f4;
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str4));
            C13978a.m41869a(textView2, f3, f, str3, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (c13942c.m41713i() != null) {
            layoutParams.setMargins(0, 0, 0, 0);
            c13942c.m41713i().setLayoutParams(layoutParams);
        }
        m41925a(view);
    }

    /* JADX INFO: renamed from: a */
    public void m41929a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f40197z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f40197z) {
                imageView = (ImageView) view.findViewById(m41926a(this.f40172a));
                imageView2 = (ImageView) view.findViewById(m41926a(this.f40173b));
                imageView3 = (ImageView) view.findViewById(m41926a(this.f40174c));
                imageView4 = (ImageView) view.findViewById(m41926a(this.f40175d));
            } else {
                imageView = (ImageView) view.findViewById(m41930b(this.f40172a));
                imageView2 = (ImageView) view.findViewById(m41930b(this.f40173b));
                imageView3 = (ImageView) view.findViewById(m41930b(this.f40174c));
                imageView4 = (ImageView) view.findViewById(m41930b(this.f40175d));
            }
            ObjectAnimator objectAnimatorM41853b = imageView != null ? new C13975b().m41853b(imageView) : null;
            ObjectAnimator objectAnimatorM41855c = imageView2 != null ? new C13975b().m41855c(imageView2) : null;
            ObjectAnimator objectAnimatorM41853b2 = imageView3 != null ? new C13975b().m41853b(imageView3) : null;
            ObjectAnimator objectAnimatorM41855c2 = imageView4 != null ? new C13975b().m41855c(imageView4) : null;
            if (objectAnimatorM41853b == null || objectAnimatorM41853b2 == null || objectAnimatorM41855c == null || objectAnimatorM41855c2 == null) {
                return;
            }
            animatorSet.playTogether(objectAnimatorM41853b, objectAnimatorM41853b2, objectAnimatorM41855c, objectAnimatorM41855c2);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m41930b(String str) {
        return C13203i0.m37707a(C13008c.m36588n().m36542d(), str, "id");
    }

    /* JADX INFO: renamed from: b */
    public void m41931b(View view, C13942c c13942c) {
        Context context;
        int iM37876a;
        if (view == null || c13942c == null || (context = view.getContext()) == null) {
            return;
        }
        if (c13942c.m41712h() == 1) {
            view.setBackground(context.getResources().getDrawable(C13203i0.m37707a(context, this.f40186o, "drawable")));
            TextView textView = (TextView) view.findViewById(m41930b(this.f40179h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f40188q));
            }
            TextView textView2 = (TextView) view.findViewById(m41930b(this.f40180i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f40188q));
            }
            iM37876a = C13229v0.m37876a(context, 2.0f);
        } else {
            iM37876a = C13229v0.m37876a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int iM37876a2 = C13229v0.m37876a(context, 8.0f);
        View viewFindViewById = view.findViewById(m41930b(this.f40181j));
        if (viewFindViewById != null) {
            if (c13942c.m41713i() != null && (c13942c.m41713i() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) c13942c.m41713i()).setObjectAnimator(new C13975b().m41847a(viewFindViewById));
            }
            if (viewFindViewById instanceof TextView) {
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTextColor(Color.parseColor(this.f40187p));
                textView3.setTextSize(15.0f);
                String str = this.f40193v;
                String str2 = this.f40190s;
                C13978a.m41869a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(iM37876a, iM37876a, iM37876a, iM37876a2);
            layoutParams.height = C13229v0.m37876a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41932b(View view, C13942c c13942c, Map<String, Object> map) {
        LinearLayout linearLayout;
        View viewFindViewById;
        if (view == null || c13942c == null) {
            return;
        }
        Context context = view.getContext();
        if (context != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f40197z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f40197z) {
                linearLayout = (LinearLayout) view.findViewById(m41926a(this.f40182k));
                viewFindViewById = view.findViewById(m41926a(this.f40184m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(m41930b(this.f40182k));
                viewFindViewById = view.findViewById(m41930b(this.f40184m));
            }
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (c13942c.m41712h() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            m41924a(context, view, c13942c);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof TextView) {
                    TextView textView = (TextView) viewFindViewById;
                    textView.setTextColor(Color.parseColor(this.f40187p));
                    textView.setTextSize(22.0f);
                    C13978a.m41869a(viewFindViewById, 1.0f, c13942c.m41716l() == 1302 ? 25 : 5, this.f40190s, new String[]{this.f40195x, this.f40196y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                try {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new C13975b().m41847a(viewFindViewById));
                    animatorSet.addListener(new a());
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
        new C13975b().m41850a(view, 500L);
    }
}
