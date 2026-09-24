package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.md */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3917md {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.md$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m18645a(InterfaceC3917md interfaceC3917md, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            return interfaceC3917md.mo18644a(str, map, continuation);
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo18643a(String str, String str2, Map map, String str3, Continuation continuation);

    /* JADX INFO: renamed from: a */
    Object mo18644a(String str, Map map, Continuation continuation);
}
