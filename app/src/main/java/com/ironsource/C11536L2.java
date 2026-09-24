package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.ironsource.L2 */
/* JADX INFO: loaded from: classes6.dex */
public class C11536L2 extends AbstractC12432q0 {

    /* JADX INFO: renamed from: j */
    private final WeakReference<InterfaceC11590O2> f24879j;

    /* JADX INFO: renamed from: k */
    private final a f24880k;

    /* JADX INFO: renamed from: l */
    private final C11554M2 f24881l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11536L2(C12414p0 tools, C11554M2 adUnitData, InterfaceC11590O2 listener) {
        String str;
        int iM25368b;
        super(tools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f24879j = new WeakReference<>(listener);
        this.f24880k = new a();
        this.f24881l = adUnitData;
        C12135cd c12135cdM33132g = m33132g();
        IronLog.INTERNAL.verbose("placement = " + c12135cdM33132g);
        if (c12135cdM33132g == null || TextUtils.isEmpty(c12135cdM33132g.m32814c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{c12135cdM33132g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iM25368b = C11354B0.m25368b(adUnitData.mo26467b().m31567a());
        } else {
            str = null;
            iM25368b = 510;
        }
        if (str != null) {
            IronLog.API.error(m33122a(str));
            m33123a(iM25368b, str);
        }
    }

    /* JADX INFO: renamed from: l */
    private final ISBannerSize m26340l() {
        return m33131f().m33036a(this.f24881l.mo26467b().m26169i());
    }

    @Override // com.ironsource.AbstractC12432q0
    /* JADX INFO: renamed from: b */
    public C12468s0 mo26343b() {
        return new C11658S2(this.f24881l.mo26467b(), m26338a(m26340l()));
    }

    /* JADX INFO: renamed from: com.ironsource.L2$a */
    private final class a extends AbstractC12432q0.a implements InterfaceC11392D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.InterfaceC11392D2
        /* JADX INFO: renamed from: a */
        public void mo25595a(C11356B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C11536L2.this.m33122a(instance.m25356q()));
            InterfaceC11590O2 interfaceC11590O2 = (InterfaceC11590O2) C11536L2.this.f24879j.get();
            if (interfaceC11590O2 != null) {
                interfaceC11590O2.mo26398g();
            }
        }

        @Override // com.ironsource.AbstractC12432q0.a, com.ironsource.InterfaceC11425F
        /* JADX INFO: renamed from: b */
        public void mo25743b(AbstractC11353B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.mo25743b(instance);
            InterfaceC12629z0 interfaceC12629z0M33134i = C11536L2.this.m33134i();
            if (interfaceC12629z0M33134i != null) {
                interfaceC12629z0M33134i.mo26401a(instance.mo25345e());
            }
        }

        @Override // com.ironsource.InterfaceC11392D2
        /* JADX INFO: renamed from: c */
        public void mo25597c(C11356B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C11536L2.this.m33122a(instance.m25356q()));
            InterfaceC11590O2 interfaceC11590O2 = (InterfaceC11590O2) C11536L2.this.f24879j.get();
            if (interfaceC11590O2 != null) {
                interfaceC11590O2.mo26399h();
            }
        }

        @Override // com.ironsource.InterfaceC11392D2
        /* JADX INFO: renamed from: b */
        public void mo25596b(C11356B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(C11536L2.this.m33122a(instance.m25356q()));
            InterfaceC11590O2 interfaceC11590O2 = (InterfaceC11590O2) C11536L2.this.f24879j.get();
            if (interfaceC11590O2 != null) {
                interfaceC11590O2.mo26400j();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m26342a(InterfaceC12308lg interfaceC12308lg, InterfaceC12629z0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (interfaceC12308lg != null) {
            m33124a(new C11428F2(interfaceC12308lg), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC12432q0
    /* JADX INFO: renamed from: a */
    protected InterfaceC11407E mo26341a() {
        return new InterfaceC11407E() { // from class: com.ironsource.L2$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC11407E
            /* JADX INFO: renamed from: a */
            public final AbstractC11353B mo25641a(C11371C c11371c, C11479I c11479i) {
                return C11536L2.m26337a(this.f$0, c11371c, c11479i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final AbstractC11353B m26337a(C11536L2 this$0, C11371C instanceData, C11479I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C11356B2(new C11707V0(this$0.m33131f(), C11426F0.b.PROVIDER), instanceData, adInstancePayload, this$0.f24880k);
    }

    /* JADX INFO: renamed from: a */
    private final ISBannerSize m26338a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return C12357j.m32527a();
        }
        return ISBannerSize.BANNER;
    }
}
