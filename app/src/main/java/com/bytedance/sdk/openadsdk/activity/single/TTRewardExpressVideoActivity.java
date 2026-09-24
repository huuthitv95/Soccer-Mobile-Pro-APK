package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void bgr() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: fr */
    public boolean mo10562fr() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout hcw() {
        return this.f8002lr.f9374ay.m12259lr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        igq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: pv */
    public Map<String, Object> mo10570pv() {
        return this.f8002lr.jbs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: ri */
    protected void mo10573ri(long j, long j2) {
        int iPlm = this.f8002lr.f9389lr.plm();
        boolean z = this.f8002lr.f9374ay.jbs() && iPlm >= 0;
        int i = (int) (j / 1000);
        m10693ik(j, j2);
        if (this.f8002lr.f9374ay != null && this.f8002lr.f9374ay.m12263ri() != null) {
            this.f8002lr.f9374ay.m12263ri().setTime(String.valueOf(this.f7999fi), i, 0, false);
            this.f8002lr.f9374ay.m12263ri().m12249ri(j, j2);
        }
        if (this.f7999fi > 0) {
            if (!z) {
                this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), null);
                return;
            }
            if (i < iPlm) {
                this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), null);
                return;
            }
            if (this.f8002lr.f9389lr.m14453nd() == 5 || this.f8002lr.f9389lr.m14453nd() == 33) {
                this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), null);
                return;
            }
            this.f8002lr.m12005ri(true);
            this.f8002lr.f9394oh.m11872ri(String.valueOf(this.f7999fi), TTAdDislikeToast.getSkipText());
            this.f8002lr.f9394oh.m11859fi(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /* JADX INFO: renamed from: su */
    public boolean mo10582su() {
        return true;
    }
}
