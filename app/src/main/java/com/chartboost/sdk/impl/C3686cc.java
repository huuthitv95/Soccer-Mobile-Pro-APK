package com.chartboost.sdk.impl;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.cc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3686cc {

    /* JADX INFO: renamed from: a */
    public static final C3686cc f13697a = new C3686cc();

    /* JADX INFO: renamed from: b */
    public static final Map f13698b;

    static {
        Pair pairM43482to = TuplesKt.m43482to("video/mp4", Double.valueOf(1.5d));
        Double dValueOf = Double.valueOf(1.0d);
        f13698b = MapsKt.mapOf(pairM43482to, TuplesKt.m43482to("video/3gpp", dValueOf), TuplesKt.m43482to("video/webm", dValueOf), TuplesKt.m43482to("video/x-matroska", dValueOf));
    }

    /* JADX INFO: renamed from: a */
    public final double m17070a(double d, double d2, double d3) {
        return d * (1.0d / ((d2 + 1.0d) + d3));
    }

    /* JADX INFO: renamed from: a */
    public final double m17071a(C4140wf c4140wf, C3640ac c3640ac) {
        double dM19803d = c4140wf.m19803d();
        double dM19801b = c4140wf.m19801b();
        Integer numM16817e = c3640ac.m16817e();
        if (numM16817e != null) {
            double dIntValue = numM16817e.intValue();
            Integer numM16814b = c3640ac.m16814b();
            if (numM16814b != null) {
                double dIntValue2 = numM16814b.intValue();
                float fM19800a = c4140wf.m19800a();
                if (dM19803d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dM19801b > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dIntValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dIntValue2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    double d = ((double) fM19800a) * dM19803d;
                    return Math.abs((dM19803d / dM19801b) - (dIntValue / dIntValue2)) + (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.abs(d - dIntValue) / d : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    public final double m17072a(Integer num) {
        if (num == null) {
            return 0.5d;
        }
        if (num.intValue() < 0) {
            num = null;
        }
        if (num == null) {
            return 0.5d;
        }
        int iIntValue = num.intValue();
        return (700 > iIntValue || iIntValue >= 1501) ? Math.min(((double) Math.abs(700 - iIntValue)) / ((double) 700), ((double) Math.abs(1500 - iIntValue)) / ((double) 1500)) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: a */
    public final double m17073a(String str) {
        return ((Number) f13698b.getOrDefault(str, Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE))).doubleValue();
    }

    /* JADX INFO: renamed from: a */
    public final C3640ac m17074a(List mediaFiles, C4140wf renderingContainer) {
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(renderingContainer, "renderingContainer");
        Iterator it = mediaFiles.iterator();
        C3640ac c3640ac = null;
        double d = Double.NEGATIVE_INFINITY;
        while (it.hasNext()) {
            C3640ac c3640ac2 = (C3640ac) it.next();
            double dM17073a = m17073a(c3640ac2.m16815c());
            if (dM17073a != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                double dM17070a = m17070a(dM17073a, m17071a(renderingContainer, c3640ac2), m17072a(c3640ac2.m16813a()));
                if (dM17070a > d) {
                    c3640ac = c3640ac2;
                    d = dM17070a;
                }
            }
        }
        return c3640ac;
    }
}
