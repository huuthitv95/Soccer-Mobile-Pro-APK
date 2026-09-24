package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ap */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9964ap extends BinderC9960al {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f22011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC9964ap(C9971aw c9971aw, TaskCompletionSource taskCompletionSource) {
        super(c9971aw, taskCompletionSource);
        this.f22011c = c9971aw;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: d */
    public final void mo22485d(Bundle bundle) {
        this.f22011c.f22027g.m22779u(this.f22008a);
        int i = bundle.getInt("error_code");
        C9971aw.f22021a.m22750b("onError(%d)", Integer.valueOf(i));
        this.f22008a.trySetException(new AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: h */
    public final void mo22489h(Bundle bundle, Bundle bundle2) {
        super.mo22489h(bundle, bundle2);
        if (!this.f22011c.f22028h.compareAndSet(true, false)) {
            C9971aw.f22021a.m22753e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f22011c.mo22521f();
        }
    }
}
