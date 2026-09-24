package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.D5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11395D5 implements InterfaceC11408E0 {
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m25605a(C12220h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String string = adProperties.m31567a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "adProperties.adFormat.toString()");
        map.put(C11683Ta.f25793f, string);
        map.put("adf", Integer.valueOf(C12518sf.m33684c(adProperties.m31567a())));
        String string2 = adProperties.m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "adProperties.adId.toString()");
        map.put(C11683Ta.f25796i, string2);
        map.put("mediationAdUnitId", adProperties.m31570c());
        map.put("isMultipleAdUnits", 1);
        return map;
    }
}
