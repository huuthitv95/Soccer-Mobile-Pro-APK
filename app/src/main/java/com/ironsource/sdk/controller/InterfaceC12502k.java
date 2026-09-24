package com.ironsource.sdk.controller;

import android.content.Context;
import android.content.Intent;
import com.ironsource.InterfaceC12201g;
import com.ironsource.InterfaceC12219h;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.k */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12502k {

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.k$a */
    public static final class a implements InterfaceC12201g {
        @Override // com.ironsource.InterfaceC12201g
        /* JADX INFO: renamed from: a */
        public Intent mo31514a() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.k$b */
    public static final class b implements InterfaceC12219h {
        @Override // com.ironsource.InterfaceC12219h
        /* JADX INFO: renamed from: a */
        public Intent mo31566a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) InlineStoreActivity.class);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.k$c */
    public static final class c implements InterfaceC12219h {
        @Override // com.ironsource.InterfaceC12219h
        /* JADX INFO: renamed from: a */
        public Intent mo31566a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) OpenUrlActivity.class);
        }
    }
}
