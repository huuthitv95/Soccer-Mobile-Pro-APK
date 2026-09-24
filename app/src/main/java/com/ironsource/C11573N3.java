package com.ironsource;

import com.ironsource.mediationsdk.adquality.C12330a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.N3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11573N3 {

    /* JADX INFO: renamed from: a */
    private final C11652Rd f25208a;

    /* JADX INFO: renamed from: b */
    private final C11363B9 f25209b;

    /* JADX INFO: renamed from: c */
    private final C11692U2 f25210c;

    /* JADX INFO: renamed from: d */
    private final C11545Lb f25211d;

    /* JADX INFO: renamed from: e */
    private final C11373C1 f25212e;

    /* JADX INFO: renamed from: f */
    private final C11531Kf f25213f;

    /* JADX INFO: renamed from: g */
    private final C12330a f25214g;

    /* JADX INFO: renamed from: com.ironsource.N3$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C11652Rd f25215a;

        /* JADX INFO: renamed from: b */
        private C11363B9 f25216b;

        /* JADX INFO: renamed from: c */
        private C11692U2 f25217c;

        /* JADX INFO: renamed from: d */
        private C11545Lb f25218d;

        /* JADX INFO: renamed from: e */
        private C11373C1 f25219e;

        /* JADX INFO: renamed from: f */
        private C11531Kf f25220f;

        /* JADX INFO: renamed from: g */
        private C12330a f25221g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX INFO: renamed from: a */
        public final a m26613a(C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a) {
            return new a(c11652Rd, c11363b9, c11692u2, c11545Lb, c11373c1, c11531Kf, c12330a);
        }

        /* JADX INFO: renamed from: b */
        public final C11652Rd m26619b() {
            return this.f25215a;
        }

        /* JADX INFO: renamed from: c */
        public final C11363B9 m26626c() {
            return this.f25216b;
        }

        /* JADX INFO: renamed from: d */
        public final C11692U2 m26627d() {
            return this.f25217c;
        }

        /* JADX INFO: renamed from: e */
        public final C11545Lb m26628e() {
            return this.f25218d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f25215a, aVar.f25215a) && Intrinsics.areEqual(this.f25216b, aVar.f25216b) && Intrinsics.areEqual(this.f25217c, aVar.f25217c) && Intrinsics.areEqual(this.f25218d, aVar.f25218d) && Intrinsics.areEqual(this.f25219e, aVar.f25219e) && Intrinsics.areEqual(this.f25220f, aVar.f25220f) && Intrinsics.areEqual(this.f25221g, aVar.f25221g);
        }

        /* JADX INFO: renamed from: f */
        public final C11373C1 m26629f() {
            return this.f25219e;
        }

        /* JADX INFO: renamed from: g */
        public final C11531Kf m26630g() {
            return this.f25220f;
        }

        /* JADX INFO: renamed from: h */
        public final C12330a m26631h() {
            return this.f25221g;
        }

        public int hashCode() {
            C11652Rd c11652Rd = this.f25215a;
            int iHashCode = (c11652Rd == null ? 0 : c11652Rd.hashCode()) * 31;
            C11363B9 c11363b9 = this.f25216b;
            int iHashCode2 = (iHashCode + (c11363b9 == null ? 0 : c11363b9.hashCode())) * 31;
            C11692U2 c11692u2 = this.f25217c;
            int iHashCode3 = (iHashCode2 + (c11692u2 == null ? 0 : c11692u2.hashCode())) * 31;
            C11545Lb c11545Lb = this.f25218d;
            int iHashCode4 = (iHashCode3 + (c11545Lb == null ? 0 : c11545Lb.hashCode())) * 31;
            C11373C1 c11373c1 = this.f25219e;
            int iHashCode5 = (iHashCode4 + (c11373c1 == null ? 0 : c11373c1.hashCode())) * 31;
            C11531Kf c11531Kf = this.f25220f;
            int iHashCode6 = (iHashCode5 + (c11531Kf == null ? 0 : c11531Kf.hashCode())) * 31;
            C12330a c12330a = this.f25221g;
            return iHashCode6 + (c12330a != null ? c12330a.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i */
        public final C12330a m26632i() {
            return this.f25221g;
        }

        /* JADX INFO: renamed from: j */
        public final C11373C1 m26633j() {
            return this.f25219e;
        }

        /* JADX INFO: renamed from: k */
        public final C11692U2 m26634k() {
            return this.f25217c;
        }

        /* JADX INFO: renamed from: l */
        public final C11363B9 m26635l() {
            return this.f25216b;
        }

        /* JADX INFO: renamed from: m */
        public final C11545Lb m26636m() {
            return this.f25218d;
        }

        /* JADX INFO: renamed from: n */
        public final C11652Rd m26637n() {
            return this.f25215a;
        }

        /* JADX INFO: renamed from: o */
        public final C11531Kf m26638o() {
            return this.f25220f;
        }

        public String toString() {
            return "Builder(rewardedVideoConfigurations=" + this.f25215a + ", interstitialConfigurations=" + this.f25216b + ", bannerConfigurations=" + this.f25217c + ", nativeAdConfigurations=" + this.f25218d + ", applicationConfigurations=" + this.f25219e + ", testSuiteSettings=" + this.f25220f + ", adQualityConfigurations=" + this.f25221g + ")";
        }

        public a(C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a) {
            this.f25215a = c11652Rd;
            this.f25216b = c11363b9;
            this.f25217c = c11692u2;
            this.f25218d = c11545Lb;
            this.f25219e = c11373c1;
            this.f25220f = c11531Kf;
            this.f25221g = c12330a;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m26608a(a aVar, C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a, int i, Object obj) {
            if ((i & 1) != 0) {
                c11652Rd = aVar.f25215a;
            }
            if ((i & 2) != 0) {
                c11363b9 = aVar.f25216b;
            }
            if ((i & 4) != 0) {
                c11692u2 = aVar.f25217c;
            }
            if ((i & 8) != 0) {
                c11545Lb = aVar.f25218d;
            }
            if ((i & 16) != 0) {
                c11373c1 = aVar.f25219e;
            }
            if ((i & 32) != 0) {
                c11531Kf = aVar.f25220f;
            }
            if ((i & 64) != 0) {
                c12330a = aVar.f25221g;
            }
            C11531Kf c11531Kf2 = c11531Kf;
            C12330a c12330a2 = c12330a;
            C11373C1 c11373c2 = c11373c1;
            C11692U2 c11692u3 = c11692u2;
            return aVar.m26613a(c11652Rd, c11363b9, c11692u3, c11545Lb, c11373c2, c11531Kf2, c12330a2);
        }

        /* JADX INFO: renamed from: b */
        public final void m26623b(C11652Rd c11652Rd) {
            this.f25215a = c11652Rd;
        }

        /* JADX INFO: renamed from: a */
        public final void m26617a(C11531Kf c11531Kf) {
            this.f25220f = c11531Kf;
        }

        /* JADX INFO: renamed from: b */
        public final void m26620b(C11363B9 c11363b9) {
            this.f25216b = c11363b9;
        }

        /* JADX INFO: renamed from: a */
        public final a m26612a(C11652Rd c11652Rd) {
            this.f25215a = c11652Rd;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m26624b(C11692U2 c11692u2) {
            this.f25217c = c11692u2;
        }

        /* JADX INFO: renamed from: a */
        public final a m26609a(C11363B9 c11363b9) {
            this.f25216b = c11363b9;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m26622b(C11545Lb c11545Lb) {
            this.f25218d = c11545Lb;
        }

        /* JADX INFO: renamed from: a */
        public final a m26614a(C11692U2 c11692u2) {
            this.f25217c = c11692u2;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m26621b(C11373C1 c11373c1) {
            this.f25219e = c11373c1;
        }

        /* JADX INFO: renamed from: a */
        public final a m26611a(C11545Lb c11545Lb) {
            this.f25218d = c11545Lb;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m26625b(C12330a c12330a) {
            this.f25221g = c12330a;
        }

        /* JADX INFO: renamed from: a */
        public final a m26610a(C11373C1 c11373c1) {
            this.f25219e = c11373c1;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final a m26618b(C11531Kf c11531Kf) {
            this.f25220f = c11531Kf;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final a m26615a(C12330a c12330a) {
            this.f25221g = c12330a;
            return this;
        }

        public /* synthetic */ a(C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : c11652Rd, (i & 2) != 0 ? null : c11363b9, (i & 4) != 0 ? null : c11692u2, (i & 8) != 0 ? null : c11545Lb, (i & 16) != 0 ? null : c11373c1, (i & 32) != 0 ? null : c11531Kf, (i & 64) != 0 ? null : c12330a);
        }

        /* JADX INFO: renamed from: a */
        public final C11573N3 m26616a() {
            return new C11573N3(this.f25215a, this.f25216b, this.f25217c, this.f25218d, this.f25219e, this.f25220f, this.f25221g, null);
        }
    }

    public /* synthetic */ C11573N3(C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11652Rd, c11363b9, c11692u2, c11545Lb, c11373c1, c11531Kf, c12330a);
    }

    /* JADX INFO: renamed from: a */
    public final C12330a m26601a() {
        return this.f25214g;
    }

    /* JADX INFO: renamed from: b */
    public final C11373C1 m26602b() {
        return this.f25212e;
    }

    /* JADX INFO: renamed from: c */
    public final C11692U2 m26603c() {
        return this.f25210c;
    }

    /* JADX INFO: renamed from: d */
    public final C11363B9 m26604d() {
        return this.f25209b;
    }

    /* JADX INFO: renamed from: e */
    public final C11545Lb m26605e() {
        return this.f25211d;
    }

    /* JADX INFO: renamed from: f */
    public final C11652Rd m26606f() {
        return this.f25208a;
    }

    /* JADX INFO: renamed from: g */
    public final C11531Kf m26607g() {
        return this.f25213f;
    }

    public String toString() {
        return "configurations(\n" + this.f25208a + "\n" + this.f25209b + "\n" + this.f25210c + "\n" + this.f25211d + ")";
    }

    private C11573N3(C11652Rd c11652Rd, C11363B9 c11363b9, C11692U2 c11692u2, C11545Lb c11545Lb, C11373C1 c11373c1, C11531Kf c11531Kf, C12330a c12330a) {
        this.f25208a = c11652Rd;
        this.f25209b = c11363b9;
        this.f25210c = c11692u2;
        this.f25211d = c11545Lb;
        this.f25212e = c11373c1;
        this.f25213f = c11531Kf;
        this.f25214g = c12330a;
    }
}
