package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.ironsource.O5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11593O5 {

    /* JADX INFO: renamed from: a */
    public static final C11593O5 f25279a = new C11593O5();

    /* JADX INFO: renamed from: b */
    public static final String f25280b = "ext_";

    private C11593O5() {
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m26726a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setKeySet, 10)), 16));
        for (String str : setKeySet) {
            String str2 = f25280b + str;
            Object obj = bundle.get(str);
            Pair pairM43482to = TuplesKt.m43482to(str2, obj instanceof Iterable ? CollectionsKt.joinToString$default((Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        return linkedHashMap;
    }
}
