package com.iab.omid.library.applovin.adsession;

import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.iab.omid.library.applovin.utils.C10950g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C10919a adSession;

    private AdEvents(C10919a c10919a) {
        this.adSession = c10919a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C10919a c10919a = (C10919a) adSession;
        C10950g.m23357a(adSession, "AdSession is null");
        C10950g.m23365g(c10919a);
        C10950g.m23360b(c10919a);
        AdEvents adEvents = new AdEvents(c10919a);
        c10919a.m23182d().m23294a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C10950g.m23360b(this.adSession);
        C10950g.m23363e(this.adSession);
        if (!this.adSession.m23186h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m23186h()) {
            this.adSession.m23191m();
        }
    }

    public void loaded() {
        C10950g.m23356a(this.adSession);
        C10950g.m23363e(this.adSession);
        this.adSession.m23192n();
    }

    public void loaded(VastProperties vastProperties) {
        C10950g.m23357a(vastProperties, "VastProperties is null");
        C10950g.m23356a(this.adSession);
        C10950g.m23363e(this.adSession);
        this.adSession.m23180a(vastProperties.m23193a());
    }
}
