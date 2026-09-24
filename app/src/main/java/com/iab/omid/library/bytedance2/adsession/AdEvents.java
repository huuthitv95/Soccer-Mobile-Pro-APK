package com.iab.omid.library.bytedance2.adsession;

import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.iab.omid.library.bytedance2.utils.C11000g;

/* JADX INFO: loaded from: classes6.dex */
public final class AdEvents {
    private final C10970a adSession;

    private AdEvents(C10970a c10970a) {
        this.adSession = c10970a;
    }

    public static AdEvents createAdEvents(AdSession adSession) {
        C10970a c10970a = (C10970a) adSession;
        C11000g.m23601a(adSession, "AdSession is null");
        C11000g.m23609g(c10970a);
        C11000g.m23604b(c10970a);
        AdEvents adEvents = new AdEvents(c10970a);
        c10970a.getAdSessionStatePublisher().m23540a(adEvents);
        return adEvents;
    }

    public void impressionOccurred() {
        C11000g.m23604b(this.adSession);
        C11000g.m23607e(this.adSession);
        if (!this.adSession.m23439f()) {
            try {
                this.adSession.start();
            } catch (Exception unused) {
            }
        }
        if (this.adSession.m23439f()) {
            this.adSession.m23444k();
        }
    }

    public void loaded() {
        C11000g.m23600a(this.adSession);
        C11000g.m23607e(this.adSession);
        this.adSession.m23445l();
    }

    public void loaded(VastProperties vastProperties) {
        C11000g.m23601a(vastProperties, "VastProperties is null");
        C11000g.m23600a(this.adSession);
        C11000g.m23607e(this.adSession);
        this.adSession.m23435a(vastProperties.m23446a());
    }
}
