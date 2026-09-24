package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12314m1 implements InterfaceC12379n1 {

    /* JADX INFO: renamed from: a */
    private final String f30892a;

    /* JADX INFO: renamed from: b */
    private final String f30893b;

    /* JADX INFO: renamed from: c */
    private final IronSource.EnumC12328a f30894c;

    /* JADX INFO: renamed from: d */
    private final boolean f30895d;

    /* JADX INFO: renamed from: e */
    private final boolean f30896e;

    /* JADX INFO: renamed from: f */
    private final boolean f30897f;

    /* JADX INFO: renamed from: com.ironsource.m1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f30898a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f30899b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f30900c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f30901d = 1;

        private a() {
        }
    }

    public C12314m1(String version, String instanceId, IronSource.EnumC12328a adFormat, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f30892a = version;
        this.f30893b = instanceId;
        this.f30894c = adFormat;
        this.f30895d = z;
        this.f30896e = z2;
        this.f30897f = z3;
    }

    @Override // com.ironsource.InterfaceC12379n1
    /* JADX INFO: renamed from: a */
    public ArrayList<InterfaceC12415p1> mo32125a() {
        ArrayList<InterfaceC12415p1> arrayList = new ArrayList<>();
        arrayList.add(new C12397o1.v(this.f30892a));
        arrayList.add(new C12397o1.x(this.f30893b));
        arrayList.add(new C12397o1.a(this.f30894c));
        if (this.f30895d) {
            arrayList.add(new C12397o1.p(1));
        }
        if (this.f30896e) {
            arrayList.add(new C12397o1.e(1));
        }
        if (this.f30897f) {
            arrayList.add(new C12397o1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C12314m1(String str, String str2, IronSource.EnumC12328a enumC12328a, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC12328a, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
