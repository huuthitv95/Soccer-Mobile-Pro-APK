package com.fyber.inneractive.sdk.measurement.tracker;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.AbstractC9181q0;
import com.fyber.inneractive.sdk.web.C9248m;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.tracker.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8277b extends AbstractC8280e {
    public C8277b(Partner partner, C9248m c9248m) {
        super(partner, c9248m);
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: a */
    public final void mo20679a() {
        WebView webView = this.f18462e;
        if (webView != null) {
            AbstractC9181q0.m22008a(webView, "FyberMraidVideoTracker.adUserInteraction();");
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: a */
    public final void mo20680a(C9248m c9248m) {
        super.mo20680a(c9248m);
        c9248m.loadUrl("javascript:FyberMraidVideoTracker.initOmid(\"" + this.f18461d.getName() + "\",\"" + this.f18461d.getVersion() + "\");");
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: b */
    public final AdSessionConfiguration mo20681b() {
        try {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e
    /* JADX INFO: renamed from: c */
    public final void mo20682c() {
        WebView webView;
        if (this.f18460c || this.f18458a == null || (webView = this.f18462e) == null) {
            return;
        }
        this.f18460c = true;
        AbstractC9181q0.m22008a(webView, "FyberMraidVideoTracker.impression();");
    }
}
