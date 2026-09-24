package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2946ka extends C2932co {
    public C2946ka(Context context) {
        super(context);
        this.f8783lr = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.C2932co
    /* JADX INFO: renamed from: ri */
    public void mo11286ri() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ka.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2946ka.this.f8785ri != null) {
                    C2946ka.this.setVisibility(0);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m11356ri(wjv wjvVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            C3414ik.m15540ri(wjvVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.m11285lr();
        }
    }
}
