package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3866k8 {

    /* JADX INFO: renamed from: a */
    public final String f15052a;

    /* JADX INFO: renamed from: b */
    public final Map f15053b;

    /* JADX INFO: renamed from: c */
    public final String f15054c;

    public C3866k8(String name, Map attributes, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f15052a = name;
        this.f15053b = attributes;
        this.f15054c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3866k8)) {
            return false;
        }
        C3866k8 c3866k8 = (C3866k8) obj;
        return Intrinsics.areEqual(this.f15052a, c3866k8.f15052a) && Intrinsics.areEqual(this.f15053b, c3866k8.f15053b) && Intrinsics.areEqual(this.f15054c, c3866k8.f15054c);
    }

    public int hashCode() {
        int iHashCode = ((this.f15052a.hashCode() * 31) + this.f15053b.hashCode()) * 31;
        String str = this.f15054c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExtensionChild(name=" + this.f15052a + ", attributes=" + this.f15053b + ", content=" + this.f15054c + ")";
    }
}
