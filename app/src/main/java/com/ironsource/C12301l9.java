package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.l9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12301l9 {

    /* JADX INFO: renamed from: a */
    private final String f30853a;

    /* JADX INFO: renamed from: b */
    private final int f30854b;

    /* JADX INFO: renamed from: c */
    private final String f30855c;

    public C12301l9() {
        this(null, 0, null, 7, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m32066a() {
        return this.f30853a;
    }

    /* JADX INFO: renamed from: b */
    public final int m32067b() {
        return this.f30854b;
    }

    /* JADX INFO: renamed from: c */
    public final String m32068c() {
        return this.f30855c;
    }

    /* JADX INFO: renamed from: d */
    public final String m32069d() {
        return this.f30855c;
    }

    /* JADX INFO: renamed from: e */
    public final String m32070e() {
        return this.f30853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12301l9)) {
            return false;
        }
        C12301l9 c12301l9 = (C12301l9) obj;
        return Intrinsics.areEqual(this.f30853a, c12301l9.f30853a) && this.f30854b == c12301l9.f30854b && Intrinsics.areEqual(this.f30855c, c12301l9.f30855c);
    }

    /* JADX INFO: renamed from: f */
    public final int m32071f() {
        return this.f30854b;
    }

    public int hashCode() {
        int iHashCode = ((this.f30853a.hashCode() * 31) + this.f30854b) * 31;
        String str = this.f30855c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstanceInformation(instanceId=" + this.f30853a + ", instanceType=" + this.f30854b + ", dynamicDemandSourceId=" + this.f30855c + ")";
    }

    public C12301l9(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f30853a = instanceId;
        this.f30854b = i;
        this.f30855c = str;
    }

    /* JADX INFO: renamed from: a */
    public final C12301l9 m32065a(String instanceId, int i, String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C12301l9(instanceId, i, str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12301l9 m32064a(C12301l9 c12301l9, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c12301l9.f30853a;
        }
        if ((i2 & 2) != 0) {
            i = c12301l9.f30854b;
        }
        if ((i2 & 4) != 0) {
            str2 = c12301l9.f30855c;
        }
        return c12301l9.m32065a(str, i, str2);
    }

    public /* synthetic */ C12301l9(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }
}
