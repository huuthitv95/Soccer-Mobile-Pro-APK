package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.p123ik.C2489ri;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2372di extends ihz {

    /* JADX INFO: renamed from: ri */
    private tan f6269ri;

    public C2372di(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        m8213ri(context, i, i2, i3, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    private void m8213ri(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        tan tanVar = new tan(context, C2489ri.m8803ik(context), i, i2, i3, jSONObject);
        this.f6269ri = tanVar;
        addView(tanVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.f6269ri.setLayoutParams(layoutParams);
    }

    public tan getShakeView() {
        return this.f6269ri;
    }

    public void setShakeText(String str) {
        if (this.f6269ri == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f6269ri.setShakeText("");
        } else {
            this.f6269ri.setShakeText(str);
        }
    }
}
