package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.w0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9032w0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8930e1 f21149a;

    /* JADX INFO: renamed from: b */
    public final int f21150b;

    /* JADX INFO: renamed from: c */
    public final EnumC8963j4 f21151c;

    /* JADX INFO: renamed from: d */
    public final boolean f21152d;

    /* JADX INFO: renamed from: e */
    public final boolean f21153e;

    public C9032w0(InterfaceC8930e1 interfaceC8930e1, int i, EnumC8963j4 enumC8963j4, boolean z, boolean z2) {
        this.f21149a = interfaceC8930e1;
        this.f21150b = i;
        this.f21151c = enumC8963j4;
        this.f21152d = z;
        this.f21153e = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21150b - ((C9032w0) obj).f21150b;
    }
}
