package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.n4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1661n4 extends AbstractC1570h4 {

    /* JADX INFO: renamed from: p */
    static final /* synthetic */ boolean f2401p = true;

    /* JADX INFO: renamed from: h */
    private final C1711r7 f2402h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f2403i;

    /* JADX INFO: renamed from: j */
    private MediaEvents f2404j;

    /* JADX INFO: renamed from: k */
    private final VastProperties f2405k;

    /* JADX INFO: renamed from: l */
    private final AtomicBoolean f2406l;

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f2407m;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f2408n;

    /* JADX INFO: renamed from: o */
    private final AtomicBoolean f2409o;

    public C1661n4(C1711r7 c1711r7) {
        super(c1711r7);
        this.f2403i = new AtomicBoolean();
        this.f2406l = new AtomicBoolean();
        this.f2407m = new AtomicBoolean();
        this.f2408n = new AtomicBoolean();
        this.f2409o = new AtomicBoolean();
        this.f2402h = c1711r7;
        float fM4233g1 = c1711r7.m4233g1();
        if (c1711r7.m4233g1() == -1) {
            this.f2405k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f2405k = VastProperties.createVastPropertiesForSkippableMedia(fM4233g1, true, Position.STANDALONE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3627a(float f, boolean z) {
        this.f2404j.start(f, z ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3628a(boolean z) {
        this.f2404j.volumeChange(z ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m3629k() {
        this.f2404j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m3630l() {
        this.f2404j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m3631m() {
        this.f2404j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m3632n() {
        this.f2404j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m3633o() {
        this.f2404j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m3634p() {
        this.f1758g.loaded(this.f2405k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m3635q() {
        this.f2404j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m3636r() {
        this.f2404j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m3637s() {
        this.f2404j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m3638t() {
        this.f2404j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m3639u() {
        this.f2404j.thirdQuartile();
    }

    /* JADX INFO: renamed from: A */
    public void m3640A() {
        m2807b("track resumed", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3637s();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m3641B() {
        m2807b("track skipped", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3638t();
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public void m3642C() {
        if (this.f2409o.compareAndSet(false, true)) {
            m2807b("track third quartile", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3639u();
                }
            });
        }
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: a */
    protected AdSessionConfiguration mo2801a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1754c.m5172a(this.f1755d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: a */
    protected AdSessionContext mo2802a(WebView webView) {
        if (!f2401p && this.f2402h.m4223Y0() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (C1721s7 c1721s7 : this.f2402h.m4223Y0().m5248b()) {
            List<C1825y7> listM4356c = c1721s7.m4356c();
            if (listM4356c.isEmpty()) {
                AbstractC1534d8.m2441a(c1721s7.m4355b(), EnumC1807w7.FAILED_TO_LOAD_RESOURCE, this.f1753b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (C1825y7 c1825y7 : listM4356c) {
                    if (CampaignEx.KEY_OMID.equalsIgnoreCase(c1825y7.m5726b())) {
                        arrayList2.add(c1825y7);
                    }
                }
                if (arrayList2.isEmpty()) {
                    AbstractC1534d8.m2441a(c1721s7.m4355b(), EnumC1807w7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f1753b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((C1825y7) it.next()).m5727c()));
                        } catch (Throwable th) {
                            if (C1768p.m5160a()) {
                                this.f1754c.m5172a(this.f1755d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        AbstractC1534d8.m2441a(c1721s7.m4355b(), EnumC1807w7.FAILED_TO_LOAD_RESOURCE, this.f1753b);
                    } else {
                        String strM4358e = c1721s7.m4358e();
                        String strM4357d = c1721s7.m4357d();
                        if (!StringUtils.isValidString(strM4358e) || StringUtils.isValidString(strM4357d)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strM4358e) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strM4357d, url, strM4358e) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            AbstractC1534d8.m2441a(c1721s7.m4355b(), EnumC1807w7.FAILED_TO_LOAD_RESOURCE, this.f1753b);
                        }
                    }
                }
            }
        }
        String strM3126a = this.f1753b.m4831g0().m3126a();
        if (TextUtils.isEmpty(strM3126a)) {
            if (C1768p.m5160a()) {
                this.f1754c.m5174b(this.f1755d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f1753b.m4831g0().m3128b(), strM3126a, arrayList, this.f2402h.getOpenMeasurementContentUrl(), this.f2402h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1754c.m5172a(this.f1755d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: a */
    protected void mo2804a(AdSession adSession) {
        try {
            this.f2404j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1754c.m5172a(this.f1755d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3643b(final float f, final boolean z) {
        if (this.f2406l.compareAndSet(false, true)) {
            m2807b("track started", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda12
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3627a(f, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3644b(final boolean z) {
        m2807b("track volume changed", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3628a(z);
            }
        });
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: h */
    public void mo2812h() {
        m2807b("track loaded", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3634p();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m3645i() {
        if (this.f2403i.compareAndSet(true, false)) {
            m2807b("buffer finished", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3629k();
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public void m3646j() {
        if (this.f2403i.compareAndSet(false, true)) {
            m2807b("buffer started", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3630l();
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public void m3647v() {
        m2807b("track clicked", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3631m();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m3648w() {
        m2807b("track completed", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3632n();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public void m3649x() {
        if (this.f2407m.compareAndSet(false, true)) {
            m2807b("track first quartile", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3633o();
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public void m3650y() {
        if (this.f2408n.compareAndSet(false, true)) {
            m2807b("track midpoint", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3635q();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public void m3651z() {
        m2807b("track paused", new Runnable() { // from class: com.applovin.impl.n4$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3636r();
            }
        });
    }
}
