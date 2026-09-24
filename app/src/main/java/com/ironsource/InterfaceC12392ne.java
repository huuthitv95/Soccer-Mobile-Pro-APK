package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ne */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12392ne {

    /* JADX INFO: renamed from: com.ironsource.ne$a */
    public static final class a implements InterfaceC12392ne {

        /* JADX INFO: renamed from: a */
        private final C12136ce f31563a;

        /* JADX INFO: renamed from: b */
        private final String f31564b;

        /* JADX INFO: renamed from: c */
        private final String f31565c;

        /* JADX INFO: renamed from: d */
        private final C12113b9 f31566d;

        public a(C12136ce error, String str, String str2, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f31563a = error;
            this.f31564b = str;
            this.f31565c = str2;
            this.f31566d = c12113b9;
        }

        /* JADX INFO: renamed from: a */
        public final C12136ce m32828a() {
            return this.f31563a;
        }

        /* JADX INFO: renamed from: b */
        public final String m32830b() {
            return this.f31564b;
        }

        /* JADX INFO: renamed from: c */
        public final String m32831c() {
            return this.f31565c;
        }

        /* JADX INFO: renamed from: d */
        public final C12113b9 m32832d() {
            return this.f31566d;
        }

        /* JADX INFO: renamed from: e */
        public final C12136ce m32833e() {
            return this.f31563a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f31563a, aVar.f31563a) && Intrinsics.areEqual(this.f31564b, aVar.f31564b) && Intrinsics.areEqual(this.f31565c, aVar.f31565c) && Intrinsics.areEqual(this.f31566d, aVar.f31566d);
        }

        /* JADX INFO: renamed from: f */
        public final String m32834f() {
            return this.f31565c;
        }

        /* JADX INFO: renamed from: g */
        public final C12113b9 m32835g() {
            return this.f31566d;
        }

        /* JADX INFO: renamed from: h */
        public final String m32836h() {
            return this.f31564b;
        }

        public int hashCode() {
            int iHashCode = this.f31563a.hashCode() * 31;
            String str = this.f31564b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f31565c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            C12113b9 c12113b9 = this.f31566d;
            return iHashCode3 + (c12113b9 != null ? c12113b9.hashCode() : 0);
        }

        public String toString() {
            return "Failure(error=" + this.f31563a + ", url=" + this.f31564b + ", json=" + this.f31565c + ", performanceMeasurer=" + this.f31566d + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m32829a(C12136ce error, String str, String str2, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new a(error, str, str2, c12113b9);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m32827a(a aVar, C12136ce c12136ce, String str, String str2, C12113b9 c12113b9, int i, Object obj) {
            if ((i & 1) != 0) {
                c12136ce = aVar.f31563a;
            }
            if ((i & 2) != 0) {
                str = aVar.f31564b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.f31565c;
            }
            if ((i & 8) != 0) {
                c12113b9 = aVar.f31566d;
            }
            return aVar.m32829a(c12136ce, str, str2, c12113b9);
        }

        public /* synthetic */ a(C12136ce c12136ce, String str, String str2, C12113b9 c12113b9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12136ce, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : c12113b9);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ne$b */
    public static final class b implements InterfaceC12392ne {

        /* JADX INFO: renamed from: a */
        private final C12270je f31567a;

        /* JADX INFO: renamed from: b */
        private final C12113b9 f31568b;

        public b(C12270je sdkInitResponse, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            this.f31567a = sdkInitResponse;
            this.f31568b = c12113b9;
        }

        /* JADX INFO: renamed from: a */
        public final C12270je m32838a() {
            return this.f31567a;
        }

        /* JADX INFO: renamed from: b */
        public final C12113b9 m32840b() {
            return this.f31568b;
        }

        /* JADX INFO: renamed from: c */
        public final C12113b9 m32841c() {
            return this.f31568b;
        }

        /* JADX INFO: renamed from: d */
        public final C12270je m32842d() {
            return this.f31567a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f31567a, bVar.f31567a) && Intrinsics.areEqual(this.f31568b, bVar.f31568b);
        }

        public int hashCode() {
            int iHashCode = this.f31567a.hashCode() * 31;
            C12113b9 c12113b9 = this.f31568b;
            return iHashCode + (c12113b9 == null ? 0 : c12113b9.hashCode());
        }

        public String toString() {
            return "Success(sdkInitResponse=" + this.f31567a + ", performanceMeasurer=" + this.f31568b + ")";
        }

        /* JADX INFO: renamed from: a */
        public final b m32839a(C12270je sdkInitResponse, C12113b9 c12113b9) {
            Intrinsics.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
            return new b(sdkInitResponse, c12113b9);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m32837a(b bVar, C12270je c12270je, C12113b9 c12113b9, int i, Object obj) {
            if ((i & 1) != 0) {
                c12270je = bVar.f31567a;
            }
            if ((i & 2) != 0) {
                c12113b9 = bVar.f31568b;
            }
            return bVar.m32839a(c12270je, c12113b9);
        }
    }
}
