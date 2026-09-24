package com.iab.omid.library.fyber.adsession;

import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.iab.omid.library.fyber.utils.C11104g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11073a adSession;

    private AdEvents(C11073a c11073a) {
        this.adSession = c11073a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11073a c11073a = (C11073a) adSession;
        C11104g.m24114a(adSession, "AdSession is null");
        C11104g.m24122g(c11073a);
        C11104g.m24117b(c11073a);
        AdEvents adEvents = new AdEvents(c11073a);
        c11073a.m23939d().m24051a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11104g.m24117b(this.adSession);
        C11104g.m24120e(this.adSession);
        if (!this.adSession.m23943h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m23943h()) {
            this.adSession.m23948m();
        }
    }

    public void loaded() {
        C11104g.m24113a(this.adSession);
        C11104g.m24120e(this.adSession);
        this.adSession.m23949n();
    }

    public void loaded(VastProperties vastProperties) {
        C11104g.m24114a(vastProperties, "VastProperties is null");
        C11104g.m24113a(this.adSession);
        C11104g.m24120e(this.adSession);
        this.adSession.m23937a(vastProperties.m23950a());
    }
}
