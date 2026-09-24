package com.fyber.inneractive.sdk.measurement.tracker;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9248m;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.tracker.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8276a extends AbstractC8280e {
    public C8276a(Partner partner, C9248m c9248m) {
        super(partner, c9248m);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: a */
    public final void mo20679a() {
        IAlog.m21950f("%s Unsupported functionality for non video MRAID ads", IAlog.m21943a(this));
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: a */
    public final void mo20680a(C9248m c9248m) {
        super.mo20680a(c9248m);
        try {
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f18458a);
            this.f18459b = adEventsCreateAdEvents;
            adEventsCreateAdEvents.loaded();
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: b */
    public final AdSessionConfiguration mo20681b() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: c */
    public final void mo20682c() {
        AdEvents adEvents;
        if (this.f18460c || this.f18458a == null || (adEvents = this.f18459b) == null) {
            return;
        }
        this.f18460c = true;
        try {
            adEvents.impressionOccurred();
        } catch (Throwable unused) {
        }
    }
}
