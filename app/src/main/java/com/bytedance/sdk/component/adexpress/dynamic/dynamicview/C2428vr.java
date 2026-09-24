package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p113di.C2382qt;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vr */
/* JADX INFO: loaded from: classes9.dex */
public class C2428vr extends C2410di {

    /* JADX INFO: renamed from: lr */
    C2475mj f6548lr;

    /* JADX INFO: renamed from: ri */
    String f6549ri;

    public C2428vr(Context context, DynamicRootView dynamicRootView, C2475mj c2475mj, String str) {
        super(context, dynamicRootView, c2475mj);
        this.f6549ri = str;
        this.f6548lr = c2475mj;
        C2382qt lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private C2382qt getLottieView() {
        if (this.f6473aw == null || this.f6473aw.m8627qt() == null || this.f6485sf == null || TextUtils.isEmpty(this.f6549ri)) {
            return null;
        }
        C2470di c2470diM8592fi = this.f6473aw.m8627qt().m8592fi();
        String strYjm = c2470diM8592fi != null ? c2470diM8592fi.yjm() : "";
        if (TextUtils.isEmpty(strYjm)) {
            return null;
        }
        String str = this.f6549ri + "static/lotties/" + strYjm + ".json";
        C2382qt c2382qt = new C2382qt(this.f6485sf);
        c2382qt.setImageLottieTosPath(str);
        c2382qt.m8252mj();
        return c2382qt;
    }
}
