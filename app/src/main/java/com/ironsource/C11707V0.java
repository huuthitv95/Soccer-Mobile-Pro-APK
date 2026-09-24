package com.ironsource;

import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.V0 */
/* JADX INFO: loaded from: classes6.dex */
public class C11707V0 extends C12414p0 {

    /* JADX INFO: renamed from: g */
    private final C12414p0 f25992g;

    /* JADX INFO: renamed from: h */
    private final C11656S0 f25993h;

    /* JADX INFO: renamed from: i */
    private InterfaceC12276k2 f25994i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11707V0(C12414p0 adTools, AbstractC12593x0 adUnitData, C11426F0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f25992g = adTools;
        C11656S0 c11656s0M33673a = C12518sf.m33673a(adUnitData, adUnitData.m34076e().m33277c());
        Intrinsics.checkNotNullExpressionValue(c11656s0M33673a, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f25993h = c11656s0M33673a;
    }

    /* JADX INFO: renamed from: a */
    public final void m27635a(InterfaceC12276k2 interfaceC12276k2) {
        this.f25994i = interfaceC12276k2;
    }

    /* JADX INFO: renamed from: c */
    public final void m27636c(AbstractRunnableC11754Xd task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C12536tf.m33823a(C12536tf.f32480a, task, 0L, 2, null);
    }

    /* JADX INFO: renamed from: e */
    public final String m27637e(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String strM32342c = C12333d.m32333b().m32342c(serverData);
        Intrinsics.checkNotNullExpressionValue(strM32342c, "getInstance().getDynamic…romServerData(serverData)");
        return strM32342c;
    }

    /* JADX INFO: renamed from: h */
    public final C11656S0 m27638h() {
        return this.f25993h;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC12276k2 m27639i() {
        return this.f25994i;
    }

    /* JADX INFO: renamed from: j */
    public final String m27640j() {
        return C12367p.m32628h().m32666g();
    }

    /* JADX INFO: renamed from: k */
    public final C11767Y9 m27641k() {
        return C12518sf.m33674a();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC11524K8.a m27642l() {
        return C11455Gb.f24351s.m25903a().mo25775i();
    }

    /* JADX INFO: renamed from: a */
    public final BaseAdAdapter<?, ?> m27632a(C11371C instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return C12332c.m32303b().m32319a(instanceData.m25539u(), instanceData.m25526h(), instanceData.m25527i().mo26467b().m31569b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11707V0(C11707V0 adUnitTools, C11426F0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f25992g = adUnitTools.f25992g;
        this.f25993h = adUnitTools.f25993h;
        this.f25994i = adUnitTools.f25994i;
    }

    /* JADX INFO: renamed from: a */
    public final BaseAdAdapter<?, ?> m27633a(NetworkSettings providerSettings, IronSource.EnumC12328a adFormat, UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return C12332c.m32303b().m32319a(providerSettings, adFormat, adId);
    }

    /* JADX INFO: renamed from: a */
    public final String m27634a(long j, String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String strM32732a = IronSourceUtils.m32732a(j, instanceName);
        Intrinsics.checkNotNullExpressionValue(strM32732a, "getTransId(timeStamp, instanceName)");
        return strM32732a;
    }
}
