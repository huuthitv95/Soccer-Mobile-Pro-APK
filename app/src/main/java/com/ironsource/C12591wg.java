package com.ironsource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.ironsource.wg */
/* JADX INFO: loaded from: classes6.dex */
public final class C12591wg {

    /* JADX INFO: renamed from: a */
    private final List<AbstractC11353B> f32711a;

    /* JADX WARN: Multi-variable type inference failed */
    public C12591wg(List<? extends AbstractC11353B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        this.f32711a = instances;
    }

    /* JADX INFO: renamed from: a */
    public final List<AbstractC11353B> m34066a() {
        return this.f32711a;
    }

    /* JADX INFO: renamed from: b */
    public final List<AbstractC11353B> m34067b() {
        return this.f32711a;
    }

    /* JADX INFO: renamed from: c */
    public final int m34068c() {
        return this.f32711a.size();
    }

    /* JADX INFO: renamed from: d */
    public final String m34069d() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11353B abstractC11353B : this.f32711a) {
            arrayList.add(m34064a(abstractC11353B.m25348h(), abstractC11353B.m25357r()));
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12591wg) && Intrinsics.areEqual(this.f32711a, ((C12591wg) obj).f32711a);
    }

    public int hashCode() {
        return this.f32711a.hashCode();
    }

    public String toString() {
        return "WaterfallInstances(instances=" + this.f32711a + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12591wg m34065a(List<? extends AbstractC11353B> instances) {
        Intrinsics.checkNotNullParameter(instances, "instances");
        return new C12591wg(instances);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12591wg m34063a(C12591wg c12591wg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c12591wg.f32711a;
        }
        return c12591wg.m34065a(list);
    }

    /* JADX INFO: renamed from: a */
    private final String m34064a(C12434q2 c12434q2, int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c12434q2.m33143c()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
