package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.adsession.media.VastProperties;
import com.iab.omid.library.unity3d.utils.C11253g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11224a adSession;

    private AdEvents(C11224a c11224a) {
        this.adSession = c11224a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11224a c11224a = (C11224a) adSession;
        C11253g.m24859a(adSession, "AdSession is null");
        C11253g.m24867g(c11224a);
        C11253g.m24862b(c11224a);
        AdEvents adEvents = new AdEvents(c11224a);
        c11224a.getAdSessionStatePublisher().m24799a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11253g.m24862b(this.adSession);
        C11253g.m24865e(this.adSession);
        if (!this.adSession.m24705f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m24705f()) {
            this.adSession.m24710k();
        }
    }

    public void loaded() {
        C11253g.m24858a(this.adSession);
        C11253g.m24865e(this.adSession);
        this.adSession.m24711l();
    }

    public void loaded(VastProperties vastProperties) {
        C11253g.m24859a(vastProperties, "VastProperties is null");
        C11253g.m24858a(this.adSession);
        C11253g.m24865e(this.adSession);
        this.adSession.m24701a(vastProperties.m24712a());
    }
}
