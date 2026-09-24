package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.utils.C3569fi;

/* JADX INFO: loaded from: classes3.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: lr */
    private long f7992lr;

    /* JADX INFO: renamed from: ri */
    private long f7993ri;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j = this.f7993ri;
        if (j > 0) {
            C3569fi.m16419ri(j);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f7992lr > 0) {
            this.f7993ri += SystemClock.elapsedRealtime() - this.f7992lr;
            this.f7992lr = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C3569fi.m16415ik()) {
            this.f7992lr = SystemClock.elapsedRealtime();
        }
    }
}
