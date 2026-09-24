package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ze */
/* JADX INFO: loaded from: classes6.dex */
public final class C12643ze implements InterfaceC11488I8 {
    @Override // com.ironsource.InterfaceC11488I8
    /* JADX INFO: renamed from: a */
    public void mo26077a(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.m32752b(context, key, i);
    }

    @Override // com.ironsource.InterfaceC11488I8
    /* JADX INFO: renamed from: b */
    public int mo26079b(Context context, String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.m32729a(context, key, i);
    }

    @Override // com.ironsource.InterfaceC11488I8
    /* JADX INFO: renamed from: a */
    public void mo26078a(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.m32753b(context, key, j);
    }

    @Override // com.ironsource.InterfaceC11488I8
    /* JADX INFO: renamed from: b */
    public long mo26080b(Context context, String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.m32730a(context, key, j);
    }
}
