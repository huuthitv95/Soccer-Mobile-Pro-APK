package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.a2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3630a2 implements InterfaceC4192z1 {

    /* JADX INFO: renamed from: a */
    public final C4131w6 f13443a;

    /* JADX INFO: renamed from: b */
    public final C3921mh f13444b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3855jk f13445c;

    /* JADX INFO: renamed from: d */
    public AbstractC3628a0 f13446d;

    /* JADX INFO: renamed from: e */
    public final Mediation f13447e;

    public C3630a2(C4131w6 downloader, C3921mh timeSource, InterfaceC3855jk videoRepository, AbstractC3628a0 adType, Mediation mediation) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f13443a = downloader;
        this.f13444b = timeSource;
        this.f13445c = videoRepository;
        this.f13446d = adType;
        this.f13447e = mediation;
    }

    /* JADX INFO: renamed from: a */
    public static final void m16795a(C3630a2 this$0, C3950o1 appRequest, C3651b0 adUnit, InterfaceC3766g0 adUnitLoaderCallback, InterfaceC4104v1 assetDownloadedCallback, boolean z) {
        EnumC4126w1 enumC4126w1M16796a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(adUnit, "$adUnit");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "$adUnitLoaderCallback");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "$assetDownloadedCallback");
        if (z) {
            enumC4126w1M16796a = this$0.m16796a(appRequest, adUnit, adUnitLoaderCallback);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            enumC4126w1M16796a = EnumC4126w1.FAILURE;
        }
        assetDownloadedCallback.mo17430a(appRequest, enumC4126w1M16796a);
    }

    /* JADX INFO: renamed from: a */
    public final EnumC4126w1 m16796a(C3950o1 c3950o1, C3651b0 c3651b0, InterfaceC3766g0 interfaceC3766g0) {
        interfaceC3766g0.mo17428a(c3950o1, InterfaceC3807hi.a.FINISH_SUCCESS);
        if (!c3651b0.m16857D()) {
            return EnumC4126w1.READY_TO_SHOW;
        }
        if (!this.f13445c.mo18297a(c3651b0.m16855B())) {
            this.f13445c.mo18296a(c3651b0.m16856C(), c3651b0.m16855B(), false, null);
        }
        return EnumC4126w1.SUCCESS;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4192z1
    /* JADX INFO: renamed from: a */
    public void mo16797a(final C3950o1 appRequest, String adTypeTraitsName, final InterfaceC4104v1 assetDownloadedCallback, final InterfaceC3766g0 adUnitLoaderCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "assetDownloadedCallback");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "adUnitLoaderCallback");
        final C3651b0 c3651b0M18857a = appRequest.m18857a();
        if (c3651b0M18857a == null) {
            return;
        }
        InterfaceC4060t1 interfaceC4060t1 = new InterfaceC4060t1() { // from class: com.chartboost.sdk.impl.a2$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.InterfaceC4060t1
            /* JADX INFO: renamed from: a */
            public final void mo16798a(boolean z) {
                C3630a2.m16795a(this.f$0, appRequest, c3651b0M18857a, adUnitLoaderCallback, assetDownloadedCallback, z);
            }
        };
        this.f13443a.m19755c();
        this.f13443a.m19751a(EnumC4095ue.NORMAL, c3651b0M18857a.m16862d(), new AtomicInteger(), (InterfaceC4060t1) C3957o8.m18892a().m18893a(interfaceC4060t1), adTypeTraitsName);
    }
}
