package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zk */
/* JADX INFO: loaded from: classes3.dex */
public final class C4211zk {

    /* JADX INFO: renamed from: a */
    public final String f17155a;

    /* JADX INFO: renamed from: b */
    public final List f17156b;

    /* JADX INFO: renamed from: c */
    public final List f17157c;

    /* JADX INFO: renamed from: d */
    public final List f17158d;

    public C4211zk(String str, List viewableUrls, List notViewableUrls, List viewUndeterminedUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        Intrinsics.checkNotNullParameter(notViewableUrls, "notViewableUrls");
        Intrinsics.checkNotNullParameter(viewUndeterminedUrls, "viewUndeterminedUrls");
        this.f17155a = str;
        this.f17156b = viewableUrls;
        this.f17157c = notViewableUrls;
        this.f17158d = viewUndeterminedUrls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4211zk)) {
            return false;
        }
        C4211zk c4211zk = (C4211zk) obj;
        return Intrinsics.areEqual(this.f17155a, c4211zk.f17155a) && Intrinsics.areEqual(this.f17156b, c4211zk.f17156b) && Intrinsics.areEqual(this.f17157c, c4211zk.f17157c) && Intrinsics.areEqual(this.f17158d, c4211zk.f17158d);
    }

    public int hashCode() {
        String str = this.f17155a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f17156b.hashCode()) * 31) + this.f17157c.hashCode()) * 31) + this.f17158d.hashCode();
    }

    public String toString() {
        return "ViewableImpression(id=" + this.f17155a + ", viewableUrls=" + this.f17156b + ", notViewableUrls=" + this.f17157c + ", viewUndeterminedUrls=" + this.f17158d + ")";
    }
}
