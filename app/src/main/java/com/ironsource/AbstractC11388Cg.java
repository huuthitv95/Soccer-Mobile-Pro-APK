package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Cg */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11388Cg {

    /* JADX INFO: renamed from: c */
    public static final a f24182c = new a(null);

    /* JADX INFO: renamed from: a */
    private final C12414p0 f24183a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11635Qc f24184b;

    /* JADX INFO: renamed from: com.ironsource.Cg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC11388Cg m25593a(C11707V0 adTools, AbstractC12593x0 adUnitData, InterfaceC11635Qc outcomeReporter, C12591wg waterfallInstances, AbstractC11461H adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.m34087q() ? new C12307lf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new C11484I4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public AbstractC11388Cg(C12414p0 adTools, InterfaceC11635Qc outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f24183a = adTools;
        this.f24184b = outcomeReporter;
    }

    /* JADX INFO: renamed from: b */
    private final void m25586b(AbstractC11353B abstractC11353B, List<? extends AbstractC11353B> list) {
        for (AbstractC11353B abstractC11353B2 : list) {
            if (abstractC11353B2 == abstractC11353B) {
                abstractC11353B.m25341a(true);
                return;
            }
            abstractC11353B2.m25341a(false);
            IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f24183a, abstractC11353B2.m25356q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25587a();

    /* JADX INFO: renamed from: a */
    public abstract void mo25588a(AbstractC11353B abstractC11353B);

    /* JADX INFO: renamed from: a */
    public final void m25590a(AbstractC11353B instanceToShow, List<? extends AbstractC11353B> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        m25586b(instanceToShow, orderedInstances);
        mo25592c(instanceToShow);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo25591b(AbstractC11353B abstractC11353B);

    /* JADX INFO: renamed from: c */
    public abstract void mo25592c(AbstractC11353B abstractC11353B);

    /* JADX INFO: renamed from: a */
    public final void m25589a(AbstractC11353B instance, String str, C12266ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f24184b.mo27302a(instance, str, publisherDataHolder);
    }
}
