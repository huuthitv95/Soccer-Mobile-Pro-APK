package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.gg */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12218gg {

    /* JADX INFO: renamed from: com.ironsource.gg$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(InterfaceC12218gg _this, boolean z, Function0 lazyError) {
            Intrinsics.checkNotNullParameter(lazyError, "lazyError");
            if (!z) {
                throw new C12172ee((IronSourceError) lazyError.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo26555a() throws C12172ee;

    /* JADX INFO: renamed from: a */
    void mo26556a(boolean z, Function0<? extends IronSourceError> function0);
}
