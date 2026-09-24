package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.au */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9969au extends BinderC9960al {

    /* JADX INFO: renamed from: c */
    private final C10017co f22016c;

    /* JADX INFO: renamed from: d */
    private final C10057ea f22017d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC9980be f22018e;

    BinderC9969au(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, C10017co c10017co, C10057ea c10057ea, InterfaceC9980be interfaceC9980be) {
        super(c9971aw, taskCompletionSource);
        this.f22016c = c10017co;
        this.f22017d = c10057ea;
        this.f22018e = interfaceC9980be;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: m */
    public final void mo22494m(Bundle bundle, Bundle bundle2) {
        super.mo22494m(bundle, bundle2);
        this.f22008a.trySetResult(AssetPackStates.m22478a(bundle, this.f22016c, this.f22017d, this.f22018e));
    }
}
