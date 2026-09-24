package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.O1 */
/* JADX INFO: loaded from: classes6.dex */
public class C11589O1 implements InterfaceC12263j7 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11397D7 f25268a;

    /* JADX INFO: renamed from: b */
    private InterfaceC11607P1 f25269b;

    /* JADX INFO: renamed from: com.ironsource.O1$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public final InterfaceC11607P1 m26716a(C11553M1 c11553m1, InterfaceC11397D7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.mo25606a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (c11553m1 != null ? Boolean.valueOf(c11553m1.m26459k()) : null));
            boolean z = false;
            if (featureAvailabilityService.mo25606a()) {
                C11686Td.m27533i().mo25281a(new C12580w5(EnumC12598x5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.m32751b(false)));
            }
            if ((c11553m1 != null ? c11553m1.m26459k() : false) && featureAvailabilityService.mo25606a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C12594x1() : new C11646R7();
        }
    }

    public C11589O1(InterfaceC11397D7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.f25268a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC12263j7
    /* JADX INFO: renamed from: a */
    public void mo26713a(C11553M1 c11553m1) {
        if (this.f25269b == null) {
            this.f25269b = new a().m26716a(c11553m1, this.f25268a);
        }
    }

    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: b */
    public void mo26715b(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        InterfaceC11607P1 interfaceC11607P1 = this.f25269b;
        if (interfaceC11607P1 != null) {
            interfaceC11607P1.mo26715b(observer);
        }
    }

    @Override // com.ironsource.InterfaceC11607P1
    /* JADX INFO: renamed from: a */
    public void mo26714a(InterfaceC12212ga observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        InterfaceC11607P1 interfaceC11607P1 = this.f25269b;
        if (interfaceC11607P1 != null) {
            interfaceC11607P1.mo26714a(observer);
        }
    }
}
