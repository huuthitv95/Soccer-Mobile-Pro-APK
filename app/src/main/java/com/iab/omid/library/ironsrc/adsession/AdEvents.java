package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.adsession.media.VastProperties;
import com.iab.omid.library.ironsrc.utils.C11155g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C11124a adSession;

    private AdEvents(C11124a c11124a) {
        this.adSession = c11124a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C11124a c11124a = (C11124a) adSession;
        C11155g.m24367a(adSession, "AdSession is null");
        C11155g.m24375g(c11124a);
        C11155g.m24370b(c11124a);
        AdEvents adEvents = new AdEvents(c11124a);
        c11124a.getAdSessionStatePublisher().m24304a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11155g.m24370b(this.adSession);
        C11155g.m24373e(this.adSession);
        if (!this.adSession.m24196f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m24196f()) {
            this.adSession.m24201k();
        }
    }

    public void loaded() {
        C11155g.m24366a(this.adSession);
        C11155g.m24373e(this.adSession);
        this.adSession.m24202l();
    }

    public void loaded(VastProperties vastProperties) {
        C11155g.m24367a(vastProperties, "VastProperties is null");
        C11155g.m24366a(this.adSession);
        C11155g.m24373e(this.adSession);
        this.adSession.m24192a(vastProperties.m24203a());
    }
}
