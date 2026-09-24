package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.global.C8000l;
import com.fyber.inneractive.sdk.network.C8376g;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7962e0 implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAConfigManager f17723a;

    public C7962e0(IAConfigManager iAConfigManager) {
        this.f17723a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        C8000l c8000l = (C8000l) obj;
        if (c8000l != null) {
            IAlog.m21945a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            IAConfigManager iAConfigManager = this.f17723a;
            iAConfigManager.f17693y.f17742a = c8000l;
            if (!z) {
                iAConfigManager.f17667K.m20434a(true, "");
                IAConfigManager.f17654M.f17660D.m20646a(iAConfigManager.f17667K);
            }
            IAConfigManager iAConfigManager2 = this.f17723a;
            iAConfigManager2.f17664H.f21374f = iAConfigManager2.f17667K;
            return;
        }
        if (exc != null) {
            if (exc instanceof C8376g) {
                IAlog.m21945a("remote features config not modified", new Object[0]);
                IAConfigManager iAConfigManager3 = this.f17723a;
                iAConfigManager3.f17667K.m20434a(true, "");
                IAConfigManager.f17654M.f17660D.m20646a(iAConfigManager3.f17667K);
                return;
            }
            IAlog.m21945a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager4 = this.f17723a;
            IAConfigManager iAConfigManager5 = IAConfigManager.f17654M;
            iAConfigManager4.getClass();
            new C8428w(EnumC8415t.FATAL_FEATURES_CONFIG_ERROR).m20807a("exception", exc.getClass().getName(), "message", exc.getLocalizedMessage()).m20808a((String) null);
        }
    }
}
