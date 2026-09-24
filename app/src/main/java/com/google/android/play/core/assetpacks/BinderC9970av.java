package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.av */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9970av extends BinderC9960al {

    /* JADX INFO: renamed from: c */
    private final C10017co f22019c;

    /* JADX INFO: renamed from: d */
    private final C10057ea f22020d;

    BinderC9970av(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, C10017co c10017co, C10057ea c10057ea) {
        super(c9971aw, taskCompletionSource);
        this.f22019c = c10017co;
        this.f22020d = c10057ea;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: n */
    public final void mo22495n(int i, Bundle bundle) {
        super.mo22495n(i, bundle);
        this.f22008a.trySetResult(AssetPackStates.m22478a(bundle, this.f22019c, this.f22020d, C9981bf.f22064a));
    }
}
