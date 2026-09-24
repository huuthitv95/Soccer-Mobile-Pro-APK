package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3637a9 implements InterfaceC3946nj {

    /* JADX INFO: renamed from: a */
    public final String f13458a;

    public C3637a9(String str) {
        this.f13458a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m16809a() {
        return this.f13458a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3637a9) && Intrinsics.areEqual(this.f13458a, ((C3637a9) obj).f13458a);
    }

    public int hashCode() {
        String str = this.f13458a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "HtmlResource(html=" + this.f13458a + ")";
    }
}
