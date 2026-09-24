package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ch */
/* JADX INFO: loaded from: classes3.dex */
public final class C3691ch implements InterfaceC3946nj {

    /* JADX INFO: renamed from: a */
    public final String f13745a;

    /* JADX INFO: renamed from: b */
    public final String f13746b;

    public C3691ch(String str, String str2) {
        this.f13745a = str;
        this.f13746b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m17195a() {
        return this.f13745a;
    }

    /* JADX INFO: renamed from: b */
    public final String m17196b() {
        return this.f13746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3691ch)) {
            return false;
        }
        C3691ch c3691ch = (C3691ch) obj;
        return Intrinsics.areEqual(this.f13745a, c3691ch.f13745a) && Intrinsics.areEqual(this.f13746b, c3691ch.f13746b);
    }

    public int hashCode() {
        String str = this.f13745a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13746b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "StaticResource(creativeType=" + this.f13745a + ", url=" + this.f13746b + ")";
    }
}
