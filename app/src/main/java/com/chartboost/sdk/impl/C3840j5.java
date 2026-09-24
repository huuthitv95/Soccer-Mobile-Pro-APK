package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.j5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3840j5 {

    /* JADX INFO: renamed from: c */
    public static final a f14871c = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f14872a;

    /* JADX INFO: renamed from: b */
    public final long f14873b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.j5$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3840j5 m18188a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new C3840j5(jsonObject.optLong("duration", 30L), jsonObject.optLong("delay"));
        }
    }

    public C3840j5(long j, long j2) {
        this.f14872a = j;
        this.f14873b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final long m18186a() {
        return this.f14873b;
    }

    /* JADX INFO: renamed from: b */
    public final long m18187b() {
        return this.f14872a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3840j5)) {
            return false;
        }
        C3840j5 c3840j5 = (C3840j5) obj;
        return this.f14872a == c3840j5.f14872a && this.f14873b == c3840j5.f14873b;
    }

    public int hashCode() {
        return (UByte$$ExternalSyntheticBackport0.m43485m(this.f14872a) * 31) + UByte$$ExternalSyntheticBackport0.m43485m(this.f14873b);
    }

    public String toString() {
        return "Countdown(duration=" + this.f14872a + ", delay=" + this.f14873b + ")";
    }
}
