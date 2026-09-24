package com.iab.omid.library.chartboost.adsession;

import com.iab.omid.library.chartboost.adsession.media.VastProperties;
import com.iab.omid.library.chartboost.utils.C11052g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11021a adSession;

    private AdEvents(C11021a c11021a) {
        this.adSession = c11021a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11021a c11021a = (C11021a) adSession;
        C11052g.m23858a(adSession, "AdSession is null");
        C11052g.m23866g(c11021a);
        C11052g.m23861b(c11021a);
        AdEvents adEvents = new AdEvents(c11021a);
        c11021a.m23678d().m23794a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11052g.m23861b(this.adSession);
        C11052g.m23864e(this.adSession);
        if (!this.adSession.m23682h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m23682h()) {
            this.adSession.m23687m();
        }
    }

    public void loaded() {
        C11052g.m23857a(this.adSession);
        C11052g.m23864e(this.adSession);
        this.adSession.m23688n();
    }

    public void loaded(VastProperties vastProperties) {
        C11052g.m23858a(vastProperties, "VastProperties is null");
        C11052g.m23857a(this.adSession);
        C11052g.m23864e(this.adSession);
        this.adSession.m23676a(vastProperties.m23689a());
    }
}
