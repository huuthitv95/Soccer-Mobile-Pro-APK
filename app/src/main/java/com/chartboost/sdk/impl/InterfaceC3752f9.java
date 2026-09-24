package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f9 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3752f9 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.f9$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m17669a(InterfaceC3752f9 interfaceC3752f9, Context context, String str, C4058t c4058t, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load-BWLJW6A");
            }
            if ((i & 4) != 0) {
                c4058t = new C4058t(null, null, 3, null);
            }
            return interfaceC3752f9.mo17665a(context, str, c4058t, continuation);
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo17665a(Context context, String str, C4058t c4058t, Continuation continuation);

    /* JADX INFO: renamed from: a */
    Object mo17666a(Context context, Continuation continuation);

    /* JADX INFO: renamed from: a */
    boolean mo17667a();

    /* JADX INFO: renamed from: b */
    void mo17607b();

    /* JADX INFO: renamed from: c */
    void mo17668c();
}
