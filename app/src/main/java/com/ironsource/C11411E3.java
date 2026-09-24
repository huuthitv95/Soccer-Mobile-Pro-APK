package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.E3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11411E3 implements InterfaceC12403o7, InterfaceC12403o7.a {

    /* JADX INFO: renamed from: a */
    private final C11668Sc f24230a;

    /* JADX INFO: renamed from: b */
    private final C12271jf f24231b;

    /* JADX INFO: renamed from: com.ironsource.E3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24232a;

        static {
            int[] iArr = new int[EnumC11483I3.values().length];
            try {
                iArr[EnumC11483I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11483I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11483I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24232a = iArr;
        }
    }

    public C11411E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC12403o7
    /* JADX INFO: renamed from: a */
    public synchronized C11447G3 mo25656a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        C11447G3 c11447g3Mo25656a = this.f24230a.mo25656a(identifier);
        if (c11447g3Mo25656a.m25834d()) {
            return c11447g3Mo25656a;
        }
        return this.f24231b.mo25656a(identifier);
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: b */
    public synchronized void mo25658b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f24230a.mo25658b(identifier);
        this.f24231b.mo25658b(identifier);
    }

    public C11411E3(InterfaceC12400o4 currentTimeProvider, InterfaceC11469H7 pacingDataRepository, InterfaceC11596O8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f24230a = new C11668Sc(currentTimeProvider, pacingDataRepository);
        this.f24231b = new C12271jf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC12403o7.a
    /* JADX INFO: renamed from: a */
    public synchronized Object mo25657a(String identifier, EnumC11483I3 cappingType, InterfaceC12320m7 cappingConfig) {
        Object objMo25657a;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = a.f24232a[cappingType.ordinal()];
        if (i == 1) {
            objMo25657a = this.f24230a.mo25657a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            objMo25657a = this.f24231b.mo25657a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion = Result.INSTANCE;
            objMo25657a = Result.m44946constructorimpl(Unit.INSTANCE);
        }
        return objMo25657a;
    }

    public /* synthetic */ C11411E3(InterfaceC12400o4 interfaceC12400o4, InterfaceC11469H7 interfaceC11469H7, InterfaceC11596O8 interfaceC11596O8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC12400o4 = (i & 1) != 0 ? new InterfaceC12400o4.a() : interfaceC12400o4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            interfaceC11469H7 = new C11702Uc(new C12173ef(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            interfaceC11596O8 = new C12235hf(new C12173ef(applicationContext2, "capping_service", null, 4, null));
        }
        this(interfaceC12400o4, interfaceC11469H7, interfaceC11596O8);
    }
}
