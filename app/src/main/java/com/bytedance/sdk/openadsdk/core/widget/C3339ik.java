package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3339ik extends C3193ka {
    public C3339ik(Context context) {
        super(context);
        m15002ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m15002ri() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.hqg);
    }

    /* JADX INFO: renamed from: ri */
    public void m15003ri(int i, wjv wjvVar) {
        if (wjvVar.m14576zz() || (wjvVar.zyu() && wjvVar.wjv())) {
            C3583qd.m16612ri((View) this, 0);
            C2751lr.m10463lr().m10469ri((int) C3583qd.m16603ri(getContext(), i, true), this, wjvVar);
        }
    }
}
