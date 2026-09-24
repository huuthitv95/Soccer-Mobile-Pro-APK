package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3801hc {
    /* JADX INFO: renamed from: a */
    public static final String m17872a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            if (str == null || str.length() == 0) {
                return (str2 == null || str2.length() == 0) ? "" : str2;
            }
            return str;
        }
        return str + " " + str2;
    }

    /* JADX INFO: renamed from: a */
    public static final Map m17873a(InterfaceC3778gc interfaceC3778gc) {
        Intrinsics.checkNotNullParameter(interfaceC3778gc, "<this>");
        Pair[] pairArr = new Pair[3];
        Mediation mediation = interfaceC3778gc.getMediation();
        String str = mediation != null ? mediation.mediationType : null;
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.m43482to("CB_MEDIATOR_NAME", str);
        Mediation mediation2 = interfaceC3778gc.getMediation();
        String str2 = mediation2 != null ? mediation2.libraryVersion : null;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_MEDIATOR_SDK_VERSION", str2);
        Mediation mediation3 = interfaceC3778gc.getMediation();
        String str3 = mediation3 != null ? mediation3.adapterVersion : null;
        pairArr[2] = TuplesKt.m43482to("CB_MEDIATOR_ADAPTER_VERSION", str3 != null ? str3 : "");
        return MapsKt.mapOf(pairArr);
    }
}
