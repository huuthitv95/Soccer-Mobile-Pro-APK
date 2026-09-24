package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C7985m;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.response.C9089g;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.metadata.C12364a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8437b {

    /* JADX INFO: renamed from: a */
    public final C8219t0 f18771a;

    /* JADX INFO: renamed from: b */
    public C8870n f18772b;

    public C8437b(C8219t0 c8219t0) {
        this.f18771a = c8219t0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: a */
    public final InterfaceC8436a m20814a() {
        C8271e c8271e;
        C8043t0 c8043t0;
        UnitDisplayType unitDisplayType;
        if (this.f18772b == null) {
            Application application = AbstractC9174o.f21470a;
            C8219t0 c8219t0 = this.f18771a;
            C9089g c9089g = (C9089g) c8219t0.f18374b;
            InterfaceC8041s0 interfaceC8041s0 = c8219t0.f18376d;
            InneractiveAdRequest inneractiveAdRequest = c8219t0.f18373a;
            if (interfaceC8041s0 != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f17654M;
                Boolean boolMo20420c = ((C7985m) iAConfigManager.f17667K.m20432a(C7985m.class)).mo20420c(C12364a.f31324j);
                boolean zBooleanValue = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
                IAlog.m21945a("OMSDK AB %s", String.valueOf(zBooleanValue));
                if (zBooleanValue && (c8043t0 = ((C8028r0) this.f18771a.f18376d).f17816f) != null && ((unitDisplayType = c8043t0.f17876j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                    c8271e = iAConfigManager.f17665I;
                } else {
                    c8271e = null;
                }
            } else {
                c8271e = null;
            }
            this.f18772b = new C8870n(application, c9089g, interfaceC8041s0, inneractiveAdRequest, c8219t0, c8271e);
        }
        return this.f18772b;
    }
}
