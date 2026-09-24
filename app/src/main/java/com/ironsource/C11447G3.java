package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.G3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11447G3 {

    /* JADX INFO: renamed from: a */
    private final boolean f24337a;

    /* JADX INFO: renamed from: b */
    private final EnumC11483I3 f24338b;

    /* JADX INFO: renamed from: com.ironsource.G3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24339a;

        static {
            int[] iArr = new int[EnumC11483I3.values().length];
            try {
                iArr[EnumC11483I3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11483I3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11483I3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24339a = iArr;
        }
    }

    public C11447G3(boolean z, EnumC11483I3 enumC11483I3) {
        this.f24337a = z;
        this.f24338b = enumC11483I3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25831a() {
        return this.f24337a;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC11483I3 m25832b() {
        return this.f24338b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC11483I3 m25833c() {
        return this.f24338b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m25834d() {
        return this.f24337a;
    }

    /* JADX INFO: renamed from: e */
    public final String m25835e() {
        EnumC11483I3 enumC11483I3 = this.f24338b;
        int i = enumC11483I3 == null ? -1 : a.f24339a[enumC11483I3.ordinal()];
        if (i == 1) {
            return "Placement delivery is false";
        }
        if (i == 2) {
            return "In pacing mode";
        }
        if (i != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11447G3)) {
            return false;
        }
        C11447G3 c11447g3 = (C11447G3) obj;
        return this.f24337a == c11447g3.f24337a && this.f24338b == c11447g3.f24338b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f24337a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC11483I3 enumC11483I3 = this.f24338b;
        return i + (enumC11483I3 == null ? 0 : enumC11483I3.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f24337a + " reason=" + this.f24338b + ")";
    }

    public /* synthetic */ C11447G3(boolean z, EnumC11483I3 enumC11483I3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : enumC11483I3);
    }

    /* JADX INFO: renamed from: a */
    public final C11447G3 m25830a(boolean z, EnumC11483I3 enumC11483I3) {
        return new C11447G3(z, enumC11483I3);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11447G3 m25829a(C11447G3 c11447g3, boolean z, EnumC11483I3 enumC11483I3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c11447g3.f24337a;
        }
        if ((i & 2) != 0) {
            enumC11483I3 = c11447g3.f24338b;
        }
        return c11447g3.m25830a(z, enumC11483I3);
    }
}
