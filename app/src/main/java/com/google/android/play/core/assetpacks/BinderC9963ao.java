package com.google.android.play.core.assetpacks;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ao */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9963ao extends BinderC9960al {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C9971aw f22010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC9963ao(C9971aw c9971aw, TaskCompletionSource taskCompletionSource) {
        super(c9971aw, taskCompletionSource);
        this.f22010c = c9971aw;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: g */
    public final void mo22488g(List list) {
        super.mo22488g(list);
        this.f22008a.trySetResult(C9971aw.m22512w(this.f22010c, list));
    }
}
