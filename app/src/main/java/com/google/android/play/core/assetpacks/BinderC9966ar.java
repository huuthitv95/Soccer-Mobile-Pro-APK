package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.ar */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class BinderC9966ar extends BinderC9960al {

    /* JADX INFO: renamed from: c */
    final int f22012c;

    /* JADX INFO: renamed from: d */
    final String f22013d;

    /* JADX INFO: renamed from: e */
    final int f22014e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C9971aw f22015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC9966ar(C9971aw c9971aw, TaskCompletionSource taskCompletionSource, int i, String str, int i2) {
        super(c9971aw, taskCompletionSource);
        this.f22015f = c9971aw;
        this.f22012c = i;
        this.f22013d = str;
        this.f22014e = i2;
    }

    @Override // com.google.android.play.core.assetpacks.BinderC9960al, com.google.android.play.core.assetpacks.internal.InterfaceC10109h
    /* JADX INFO: renamed from: d */
    public final void mo22485d(Bundle bundle) {
        this.f22015f.f22026f.m22779u(this.f22008a);
        C9971aw.f22021a.m22750b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i = this.f22014e;
        if (i > 0) {
            this.f22015f.m22499D(this.f22012c, this.f22013d, i - 1);
        }
    }
}
