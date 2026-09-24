package com.chartboost.sdk.internal.interruption;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4232a {

    /* JADX INFO: renamed from: b */
    public static final a f17266b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C4232a f17267c = new C4232a("APP_LIFECYCLE");

    /* JADX INFO: renamed from: d */
    public static final C4232a f17268d = new C4232a("AUDIO");

    /* JADX INFO: renamed from: e */
    public static final C4232a f17269e = new C4232a("CUSTOM");

    /* JADX INFO: renamed from: a */
    public final String f17270a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4232a m20252a() {
            return C4232a.f17267c;
        }

        /* JADX INFO: renamed from: b */
        public final C4232a m20253b() {
            return C4232a.f17268d;
        }
    }

    public C4232a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17270a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4232a) && Intrinsics.areEqual(this.f17270a, ((C4232a) obj).f17270a);
    }

    public int hashCode() {
        return this.f17270a.hashCode();
    }

    public String toString() {
        return "InterruptionType(name=" + this.f17270a + ")";
    }
}
