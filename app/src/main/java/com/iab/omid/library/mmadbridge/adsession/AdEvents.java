package com.iab.omid.library.mmadbridge.adsession;

import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.iab.omid.library.mmadbridge.utils.C11206g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11175a adSession;

    private AdEvents(C11175a c11175a) {
        this.adSession = c11175a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11175a c11175a = (C11175a) adSession;
        C11206g.m24620a(adSession, "AdSession is null");
        C11206g.m24628g(c11175a);
        C11206g.m24623b(c11175a);
        AdEvents adEvents = new AdEvents(c11175a);
        c11175a.getAdSessionStatePublisher().m24557a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11206g.m24623b(this.adSession);
        C11206g.m24626e(this.adSession);
        if (!this.adSession.m24449f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m24449f()) {
            this.adSession.m24454k();
        }
    }

    public void loaded() {
        C11206g.m24619a(this.adSession);
        C11206g.m24626e(this.adSession);
        this.adSession.m24455l();
    }

    public void loaded(VastProperties vastProperties) {
        C11206g.m24620a(vastProperties, "VastProperties is null");
        C11206g.m24619a(this.adSession);
        C11206g.m24626e(this.adSession);
        this.adSession.m24445a(vastProperties.m24456a());
    }
}
