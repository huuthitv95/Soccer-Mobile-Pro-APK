package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: loaded from: classes3.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7971mj || !C3583qd.m16584ik((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) C3583qd.m16601ri(), 0, 0);
    }
}
