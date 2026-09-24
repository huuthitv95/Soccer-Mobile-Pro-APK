package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3846jb {

    /* JADX INFO: renamed from: a */
    public final String f14904a;

    /* JADX INFO: renamed from: b */
    public final Boolean f14905b;

    /* JADX INFO: renamed from: c */
    public final String f14906c;

    public C3846jb(String str, Boolean bool, String str2) {
        this.f14904a = str;
        this.f14905b = bool;
        this.f14906c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m18203a() {
        return this.f14904a;
    }

    /* JADX INFO: renamed from: b */
    public final String m18204b() {
        return this.f14906c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3846jb)) {
            return false;
        }
        C3846jb c3846jb = (C3846jb) obj;
        return Intrinsics.areEqual(this.f14904a, c3846jb.f14904a) && Intrinsics.areEqual(this.f14905b, c3846jb.f14905b) && Intrinsics.areEqual(this.f14906c, c3846jb.f14906c);
    }

    public int hashCode() {
        String str = this.f14904a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f14905b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f14906c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JavaScriptResource(apiFramework=" + this.f14904a + ", browserOptional=" + this.f14905b + ", uri=" + this.f14906c + ")";
    }
}
