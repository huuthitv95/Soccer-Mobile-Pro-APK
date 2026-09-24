package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ed */
/* JADX INFO: loaded from: classes6.dex */
public final class C12171ed implements InterfaceC11487I7, InterfaceC11487I7.a {

    /* JADX INFO: renamed from: a */
    private final C11411E3 f30312a;

    /* JADX INFO: renamed from: b */
    private final C11556M4 f30313b;

    /* JADX INFO: renamed from: com.ironsource.ed$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30314a;

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
            f30314a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12171ed() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC11487I7
    /* JADX INFO: renamed from: a */
    public synchronized C11447G3 mo26074a(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strM31954a = new C12287kd(placementName, adFormat).m31954a();
        C11447G3 c11447g3Mo25656a = this.f30313b.mo25656a(strM31954a);
        if (c11447g3Mo25656a.m25834d()) {
            return c11447g3Mo25656a;
        }
        return this.f30312a.mo25656a(strM31954a);
    }

    @Override // com.ironsource.InterfaceC11487I7.a
    /* JADX INFO: renamed from: b */
    public synchronized void mo26076b(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strM31954a = new C12287kd(placementName, adFormat).m31954a();
        if (!this.f30313b.mo25656a(strM31954a).m25834d()) {
            this.f30312a.mo25658b(strM31954a);
        }
    }

    public C12171ed(C11411E3 cappingService, C11556M4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f30312a = cappingService;
        this.f30313b = deliveryHandler;
    }

    public /* synthetic */ C12171ed(C11411E3 c11411e3, C11556M4 c11556m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C11411E3(null, null, null, 7, null) : c11411e3, (i & 2) != 0 ? new C11556M4() : c11556m4);
    }

    @Override // com.ironsource.InterfaceC11487I7.a
    /* JADX INFO: renamed from: a */
    public synchronized Object mo26075a(String placementName, LevelPlay.AdFormat adFormat, EnumC11483I3 cappingType, InterfaceC12320m7 cappingConfig) {
        Object objMo25657a;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        String strM31954a = new C12287kd(placementName, adFormat).m31954a();
        int i = a.f30314a[cappingType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objMo25657a = this.f30312a.mo25657a(strM31954a, cappingType, cappingConfig);
        } else {
            objMo25657a = this.f30313b.mo25657a(strM31954a, cappingType, cappingConfig);
        }
        return objMo25657a;
    }
}
