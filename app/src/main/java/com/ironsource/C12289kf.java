package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12289kf extends C11430F4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12289kf(AbstractC12593x0 adUnitData, C12591wg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    /* JADX INFO: renamed from: b */
    private final int m31956b(AbstractC11353B abstractC11353B) {
        return abstractC11353B.m25348h().m33152l();
    }

    @Override // com.ironsource.AbstractC11461H
    /* JADX INFO: renamed from: a */
    protected boolean mo25955a(AbstractC11353B instance, C12591wg waterfallInstances) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        return m31955a(waterfallInstances) < m31956b(instance);
    }

    /* JADX INFO: renamed from: a */
    private final int m31955a(C12591wg c12591wg) {
        Integer num;
        List<AbstractC11353B> listM34067b = c12591wg.m34067b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM34067b) {
            if (((AbstractC11353B) obj).m25362w()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(m31956b((AbstractC11353B) it.next()));
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(m31956b((AbstractC11353B) it.next()));
                if (numValueOf.compareTo(numValueOf2) > 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
