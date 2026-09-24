package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2382qt;
import com.bytedance.sdk.component.utils.C2716dw;
import com.bytedance.sdk.component.utils.C2729uq;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ik.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2466sf implements xha<ViewGroup> {

    /* JADX INFO: renamed from: lr */
    private final FrameLayout f6674lr;

    /* JADX INFO: renamed from: ri */
    private final C2382qt f6675ri;

    public C2466sf(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, String str, String str2) {
        C2382qt c2382qt = new C2382qt(context);
        this.f6675ri = c2382qt;
        c2382qt.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6674lr = frameLayout;
        frameLayout.addView(c2382qt, new FrameLayout.LayoutParams(-2, -2));
        double dAac = xhaVar.aac();
        dAac = dAac == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : dAac;
        double dM8729xe = xhaVar.m8729xe();
        double d = dM8729xe != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dM8729xe : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) abstractC2412fi.getDynamicWidth()) * 0.32d * dAac), (int) (((double) abstractC2412fi.getDynamicWidth()) * 0.32d * d));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            m8454ri(context, frameLayout, xhaVar);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.p124ka.xha.m8833ri(context, xhaVar.m8700fe() > 0 ? xhaVar.m8700fe() : C2490ka.m8810lr() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m8454ri(Context context, FrameLayout frameLayout, xha xhaVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -C2716dw.m10218ri(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(C2729uq.m10307lr(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, C2716dw.m10218ri(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(C2729uq.m10307lr(context, "tt_splash_brush_mask_hint")));
        if (xhaVar != null && !TextUtils.isEmpty(xhaVar.whw())) {
            textView2.setText(xhaVar.whw());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ik */
    public ViewGroup mo8425ik() {
        return this.f6674lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: lr */
    public void mo8427lr() {
        this.f6675ri.m6519di();
        ViewParent parent = this.f6674lr.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6674lr);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.xha
    /* JADX INFO: renamed from: ri */
    public void mo8428ri() {
        this.f6675ri.m8252mj();
    }
}
