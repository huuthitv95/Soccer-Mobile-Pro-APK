package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3863k5 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.k5$a */
    public static final class a extends AbstractC3863k5 {

        /* JADX INFO: renamed from: a */
        public final String f15018a;

        /* JADX INFO: renamed from: b */
        public final String f15019b;

        /* JADX INFO: renamed from: c */
        public final Integer f15020c;

        /* JADX INFO: renamed from: d */
        public final List f15021d;

        /* JADX INFO: renamed from: e */
        public final C4151x4 f15022e;

        /* JADX INFO: renamed from: f */
        public final List f15023f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Integer num, List universalAdIds, C4151x4 companionAds, List list) {
            super(null);
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(companionAds, "companionAds");
            this.f15018a = str;
            this.f15019b = str2;
            this.f15020c = num;
            this.f15021d = universalAdIds;
            this.f15022e = companionAds;
            this.f15023f = list;
        }

        /* JADX INFO: renamed from: a */
        public final C4151x4 m18350a() {
            return this.f15022e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f15018a, aVar.f15018a) && Intrinsics.areEqual(this.f15019b, aVar.f15019b) && Intrinsics.areEqual(this.f15020c, aVar.f15020c) && Intrinsics.areEqual(this.f15021d, aVar.f15021d) && Intrinsics.areEqual(this.f15022e, aVar.f15022e) && Intrinsics.areEqual(this.f15023f, aVar.f15023f);
        }

        public int hashCode() {
            String str = this.f15018a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f15019b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f15020c;
            int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.f15021d.hashCode()) * 31) + this.f15022e.hashCode()) * 31;
            List list = this.f15023f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "CompanionCreative(id=" + this.f15018a + ", adId=" + this.f15019b + ", sequence=" + this.f15020c + ", universalAdIds=" + this.f15021d + ", companionAds=" + this.f15022e + ", creativeExtensions=" + this.f15023f + ")";
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.k5$b */
    public static final class b extends AbstractC3863k5 {

        /* JADX INFO: renamed from: a */
        public final String f15024a;

        /* JADX INFO: renamed from: b */
        public final String f15025b;

        /* JADX INFO: renamed from: c */
        public final Integer f15026c;

        /* JADX INFO: renamed from: d */
        public final List f15027d;

        /* JADX INFO: renamed from: e */
        public final C3892lb f15028e;

        /* JADX INFO: renamed from: f */
        public final List f15029f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Integer num, List universalAdIds, C3892lb linear, List list) {
            super(null);
            Intrinsics.checkNotNullParameter(universalAdIds, "universalAdIds");
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f15024a = str;
            this.f15025b = str2;
            this.f15026c = num;
            this.f15027d = universalAdIds;
            this.f15028e = linear;
            this.f15029f = list;
        }

        /* JADX INFO: renamed from: a */
        public final C3892lb m18351a() {
            return this.f15028e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f15024a, bVar.f15024a) && Intrinsics.areEqual(this.f15025b, bVar.f15025b) && Intrinsics.areEqual(this.f15026c, bVar.f15026c) && Intrinsics.areEqual(this.f15027d, bVar.f15027d) && Intrinsics.areEqual(this.f15028e, bVar.f15028e) && Intrinsics.areEqual(this.f15029f, bVar.f15029f);
        }

        public int hashCode() {
            String str = this.f15024a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f15025b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f15026c;
            int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.f15027d.hashCode()) * 31) + this.f15028e.hashCode()) * 31;
            List list = this.f15029f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "LinearCreative(id=" + this.f15024a + ", adId=" + this.f15025b + ", sequence=" + this.f15026c + ", universalAdIds=" + this.f15027d + ", linear=" + this.f15028e + ", creativeExtensions=" + this.f15029f + ")";
        }
    }

    public AbstractC3863k5() {
    }

    public /* synthetic */ AbstractC3863k5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
