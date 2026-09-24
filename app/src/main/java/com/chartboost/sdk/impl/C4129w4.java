package com.chartboost.sdk.impl;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.w4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4129w4 {

    /* JADX INFO: renamed from: a */
    public static final C4129w4 f16683a = new C4129w4();

    /* JADX INFO: renamed from: a */
    public final double m19746a(C4140wf c4140wf, C4085u4 c4085u4) {
        double dM19803d = c4140wf.m19803d();
        double dM19801b = c4140wf.m19801b();
        Integer numM19559i = c4085u4.m19559i();
        if (numM19559i != null) {
            double dIntValue = numM19559i.intValue();
            Integer numM19554d = c4085u4.m19554d();
            if (numM19554d != null) {
                double dIntValue2 = numM19554d.intValue();
                float fM19800a = c4140wf.m19800a();
                if (dM19803d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dM19801b > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dIntValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dIntValue2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double dAbs = Math.abs((dM19803d / dM19801b) - (dIntValue / dIntValue2));
                    double d = dM19803d * ((double) fM19800a);
                    return dAbs + (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.abs(d - dIntValue) / d : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final double m19747a(Object obj) {
        String strM16809a;
        if (obj instanceof C3691ch) {
            String strM17195a = ((C3691ch) obj).m17195a();
            if (strM17195a == null) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            if (StringsKt.startsWith(strM17195a, "image", true)) {
                return 0.8d;
            }
            if (StringsKt.contains((CharSequence) strM17195a, (CharSequence) "javascript", true)) {
                return 1.0d;
            }
            StringsKt.contains((CharSequence) strM17195a, (CharSequence) "flash", true);
        } else if (obj instanceof C3798h9) {
            String strM17870a = ((C3798h9) obj).m17870a();
            if (strM17870a != null && !StringsKt.isBlank(strM17870a)) {
                return 1.0d;
            }
        } else if ((obj instanceof C3637a9) && (strM16809a = ((C3637a9) obj).m16809a()) != null && !StringsKt.isBlank(strM16809a)) {
            return 1.2d;
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: a */
    public final C4085u4 m19748a(List companionAds, C4140wf renderingContainer) {
        Object next;
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        ArrayList arrayList = new ArrayList();
        Iterator it = companionAds.iterator();
        while (true) {
            Pair pairM43482to = null;
            if (!it.hasNext()) {
                break;
            }
            C4085u4 c4085u4 = (C4085u4) it.next();
            double dM19746a = f16683a.m19746a(renderingContainer, c4085u4);
            InterfaceC3946nj interfaceC3946nj = null;
            double d = Double.NEGATIVE_INFINITY;
            for (InterfaceC3946nj interfaceC3946nj2 : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) c4085u4.m19557g(), (Iterable) c4085u4.m19556f()), (Iterable) c4085u4.m19555e())) {
                double dM19747a = f16683a.m19747a(interfaceC3946nj2);
                if (dM19747a > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double d2 = dM19747a / (1.0d + dM19746a);
                    if (d2 > d) {
                        interfaceC3946nj = interfaceC3946nj2;
                        d = d2;
                    }
                }
            }
            if (d != Double.NEGATIVE_INFINITY && interfaceC3946nj != null && CollectionsKt.contains(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) c4085u4.m19557g(), (Iterable) c4085u4.m19556f()), (Iterable) c4085u4.m19555e()), interfaceC3946nj)) {
                pairM43482to = TuplesKt.m43482to(C4085u4.m19549a(c4085u4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, interfaceC3946nj, 262143, null), Double.valueOf(d));
            }
            if (pairM43482to != null) {
                arrayList.add(pairM43482to);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                double dDoubleValue = ((Number) ((Pair) next).getSecond()).doubleValue();
                do {
                    Object next2 = it2.next();
                    double dDoubleValue2 = ((Number) ((Pair) next2).getSecond()).doubleValue();
                    if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                        next = next2;
                        dDoubleValue = dDoubleValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair = (Pair) next;
        if (pair != null) {
            return (C4085u4) pair.getFirst();
        }
        return null;
    }
}
