package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.iab.omid.library.vungle.utils.C11316g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11271a adSession;

    private AdEvents(C11271a c11271a) {
        this.adSession = c11271a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11271a c11271a = (C11271a) adSession;
        C11316g.m25159a(adSession, "AdSession is null");
        C11316g.m25167g(c11271a);
        C11316g.m25162b(c11271a);
        AdEvents adEvents = new AdEvents(c11271a);
        c11271a.m24934d().m25085a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11316g.m25162b(this.adSession);
        C11316g.m25165e(this.adSession);
        if (!this.adSession.m24938h()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m24938h()) {
            this.adSession.m24943m();
        }
    }

    public void loaded() {
        C11316g.m25158a(this.adSession);
        C11316g.m25165e(this.adSession);
        this.adSession.m24944n();
    }

    public void loaded(VastProperties vastProperties) {
        C11316g.m25159a(vastProperties, "VastProperties is null");
        C11316g.m25158a(this.adSession);
        C11316g.m25165e(this.adSession);
        this.adSession.m24932a(vastProperties.m24945a());
    }
}
