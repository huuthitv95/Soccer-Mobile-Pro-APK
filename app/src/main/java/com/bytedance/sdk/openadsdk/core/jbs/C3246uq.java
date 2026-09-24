package com.bytedance.sdk.openadsdk.core.jbs;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.ironsource.C11744X3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C3246uq implements InterfaceC3185ik {

    /* JADX INFO: renamed from: di */
    private String f10904di;

    /* JADX INFO: renamed from: ri */
    private long f10909ri = 0;

    /* JADX INFO: renamed from: lr */
    private long f10908lr = 0;

    /* JADX INFO: renamed from: ik */
    private int f10906ik = 0;

    /* JADX INFO: renamed from: ka */
    private String f10907ka = null;

    /* JADX INFO: renamed from: fi */
    private String f10905fi = null;
    private final AtomicBoolean xha = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
    /* JADX INFO: renamed from: lr */
    public void mo11832lr(String str) {
        this.f10905fi = str;
        this.f10908lr = SystemClock.elapsedRealtime();
        this.xha.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
    /* JADX INFO: renamed from: ri */
    public void mo11835ri(int i, String str, String str2) {
        this.f10906ik = i;
        this.f10907ka = str;
        this.f10905fi = str2;
        this.f10908lr = SystemClock.elapsedRealtime();
        this.xha.set(false);
    }

    /* JADX INFO: renamed from: ri */
    public void m13742ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        if (this.xha.get()) {
            C3414ik.m15560ri(wjvVar, false, str, "success", this.f10908lr - this.f10909ri, this.f10905fi, this.f10904di, 0, null);
        } else {
            C3414ik.m15560ri(wjvVar, false, str, C11744X3.g.f26257e, this.f10908lr - this.f10909ri, this.f10905fi, this.f10904di, this.f10906ik, this.f10907ka);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik
    /* JADX INFO: renamed from: ri */
    public void mo11837ri(String str) {
        this.f10904di = str;
        this.f10909ri = SystemClock.elapsedRealtime();
    }
}
