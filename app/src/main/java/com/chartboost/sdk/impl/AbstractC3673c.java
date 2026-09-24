package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3673c {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c$a */
    public static final class a extends AbstractC3673c {

        /* JADX INFO: renamed from: a */
        public final String f13624a;

        /* JADX INFO: renamed from: b */
        public final C4047sa f13625b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C4047sa inLine) {
            super(null);
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            this.f13624a = str;
            this.f13625b = inLine;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m16992a(a aVar, String str, C4047sa c4047sa, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f13624a;
            }
            if ((i & 2) != 0) {
                c4047sa = aVar.f13625b;
            }
            return aVar.m16993a(str, c4047sa);
        }

        /* JADX INFO: renamed from: a */
        public final a m16993a(String str, C4047sa inLine) {
            Intrinsics.checkNotNullParameter(inLine, "inLine");
            return new a(str, inLine);
        }

        /* JADX INFO: renamed from: a */
        public final C4047sa m16994a() {
            return this.f13625b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f13624a, aVar.f13624a) && Intrinsics.areEqual(this.f13625b, aVar.f13625b);
        }

        public int hashCode() {
            String str = this.f13624a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f13625b.hashCode();
        }

        public String toString() {
            return "InLineAd(id=" + this.f13624a + ", inLine=" + this.f13625b + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.c$b */
    public static final class b extends AbstractC3673c {

        /* JADX INFO: renamed from: a */
        public final String f13626a;

        /* JADX INFO: renamed from: b */
        public final C3879kl f13627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, C3879kl wrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            this.f13626a = str;
            this.f13627b = wrapper;
        }

        /* JADX INFO: renamed from: a */
        public final C3879kl m16995a() {
            return this.f13627b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f13626a, bVar.f13626a) && Intrinsics.areEqual(this.f13627b, bVar.f13627b);
        }

        public int hashCode() {
            String str = this.f13626a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f13627b.hashCode();
        }

        public String toString() {
            return "WrapperAd(id=" + this.f13626a + ", wrapper=" + this.f13627b + ")";
        }
    }

    public AbstractC3673c() {
    }

    public /* synthetic */ AbstractC3673c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
