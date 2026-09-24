package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Lb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11545Lb {

    /* JADX INFO: renamed from: m */
    public static final a f25056m = new a(null);

    /* JADX INFO: renamed from: n */
    private static final int f25057n = 0;

    /* JADX INFO: renamed from: a */
    private final boolean f25058a;

    /* JADX INFO: renamed from: b */
    private C11499J1 f25059b;

    /* JADX INFO: renamed from: c */
    private int f25060c;

    /* JADX INFO: renamed from: d */
    private long f25061d;

    /* JADX INFO: renamed from: e */
    private boolean f25062e;

    /* JADX INFO: renamed from: f */
    private final ArrayList<C11735Wb> f25063f;

    /* JADX INFO: renamed from: g */
    private C11735Wb f25064g;

    /* JADX INFO: renamed from: h */
    private int f25065h;

    /* JADX INFO: renamed from: i */
    private C12470s2 f25066i;

    /* JADX INFO: renamed from: j */
    private long f25067j;

    /* JADX INFO: renamed from: k */
    private boolean f25068k;

    /* JADX INFO: renamed from: l */
    private boolean f25069l;

    /* JADX INFO: renamed from: com.ironsource.Lb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C11545Lb(int i, long j, boolean z, C11499J1 events, C12470s2 auctionSettings, int i2, long j2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f25058a = z4;
        this.f25063f = new ArrayList<>();
        this.f25060c = i;
        this.f25061d = j;
        this.f25062e = z;
        this.f25059b = events;
        this.f25065h = i2;
        this.f25066i = auctionSettings;
        this.f25067j = j2;
        this.f25068k = z2;
        this.f25069l = z3;
    }

    /* JADX INFO: renamed from: a */
    public final void m26406a(C11499J1 c11499j1) {
        Intrinsics.checkNotNullParameter(c11499j1, "<set-?>");
        this.f25059b = c11499j1;
    }

    /* JADX INFO: renamed from: b */
    public final int m26411b() {
        return this.f25060c;
    }

    /* JADX INFO: renamed from: c */
    public final long m26415c() {
        return this.f25061d;
    }

    /* JADX INFO: renamed from: d */
    public final C12470s2 m26417d() {
        return this.f25066i;
    }

    /* JADX INFO: renamed from: e */
    public final C11735Wb m26418e() {
        for (C11735Wb c11735Wb : this.f25063f) {
            if (c11735Wb.m32815d()) {
                return c11735Wb;
            }
        }
        return this.f25064g;
    }

    /* JADX INFO: renamed from: f */
    public final int m26419f() {
        return this.f25065h;
    }

    /* JADX INFO: renamed from: g */
    public final C11499J1 m26420g() {
        return this.f25059b;
    }

    /* JADX INFO: renamed from: h */
    public final long m26421h() {
        return this.f25067j;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m26422i() {
        return this.f25068k;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m26423j() {
        return this.f25058a;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m26424k() {
        return this.f25069l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f25060c + ", bidderExclusive=" + this.f25062e + "}";
    }

    /* JADX INFO: renamed from: a */
    public final void m26404a(int i) {
        this.f25060c = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m26412b(int i) {
        this.f25065h = i;
    }

    /* JADX INFO: renamed from: c */
    public final void m26416c(boolean z) {
        this.f25069l = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m26405a(long j) {
        this.f25061d = j;
    }

    /* JADX INFO: renamed from: b */
    public final void m26413b(long j) {
        this.f25067j = j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m26410a() {
        return this.f25062e;
    }

    /* JADX INFO: renamed from: b */
    public final void m26414b(boolean z) {
        this.f25068k = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m26409a(boolean z) {
        this.f25062e = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m26408a(C12470s2 c12470s2) {
        Intrinsics.checkNotNullParameter(c12470s2, "<set-?>");
        this.f25066i = c12470s2;
    }

    /* JADX INFO: renamed from: a */
    public final void m26407a(C11735Wb c11735Wb) {
        if (c11735Wb != null) {
            this.f25063f.add(c11735Wb);
            if (this.f25064g == null) {
                this.f25064g = c11735Wb;
            } else if (c11735Wb.m32813b() == 0) {
                this.f25064g = c11735Wb;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C11735Wb m26403a(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        for (C11735Wb c11735Wb : this.f25063f) {
            if (Intrinsics.areEqual(c11735Wb.m32814c(), placementName)) {
                return c11735Wb;
            }
        }
        return null;
    }
}
