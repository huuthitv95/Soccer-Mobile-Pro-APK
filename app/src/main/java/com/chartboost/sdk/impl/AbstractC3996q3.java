package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3996q3 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q3$a */
    public static final class a extends AbstractC3996q3 {

        /* JADX INFO: renamed from: a */
        public final EnumC3820i8 f15848a;

        /* JADX INFO: renamed from: b */
        public final URL f15849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC3820i8 reason, URL url) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f15848a = reason;
            this.f15849b = url;
        }

        /* JADX INFO: renamed from: a */
        public final EnumC3820i8 m19090a() {
            return this.f15848a;
        }

        /* JADX INFO: renamed from: b */
        public final URL m19091b() {
            return this.f15849b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15848a == aVar.f15848a && Intrinsics.areEqual(this.f15849b, aVar.f15849b);
        }

        public int hashCode() {
            return (this.f15848a.hashCode() * 31) + this.f15849b.hashCode();
        }

        public String toString() {
            return "Evicted(reason=" + this.f15848a + ", url=" + this.f15849b + ")";
        }
    }

    public AbstractC3996q3() {
    }

    public /* synthetic */ AbstractC3996q3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
