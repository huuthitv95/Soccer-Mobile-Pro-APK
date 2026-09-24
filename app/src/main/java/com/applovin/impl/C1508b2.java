package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.adview.C1498g;
import com.applovin.impl.adview.C1502k;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.b2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1508b2 extends C1518c2 {

    /* JADX INFO: renamed from: n0 */
    private final C1711r7 f1138n0;

    /* JADX INFO: renamed from: o0 */
    private final Set f1139o0;

    /* JADX INFO: renamed from: com.applovin.impl.b2$a */
    class a implements C1517c1.b {
        a() {
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: a */
        public void mo2092a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(C1508b2.this.f1256e0 - ((long) (C1508b2.this.f1241P.getDuration() - C1508b2.this.f1241P.getCurrentPosition())));
            int iM2179C = C1508b2.this.m2179C();
            HashSet hashSet = new HashSet();
            for (C1514b8 c1514b8 : new HashSet(C1508b2.this.f1139o0)) {
                if (c1514b8.m2139a(seconds, iM2179C)) {
                    hashSet.add(c1514b8);
                    C1508b2.this.f1139o0.remove(c1514b8);
                }
            }
            C1508b2.this.m2074a(hashSet);
            if (iM2179C >= 25 && iM2179C < 50) {
                C1508b2.this.f1138n0.getAdEventTracker().m3649x();
                return;
            }
            if (iM2179C >= 50 && iM2179C < 75) {
                C1508b2.this.f1138n0.getAdEventTracker().m3650y();
            } else if (iM2179C >= 75) {
                C1508b2.this.f1138n0.getAdEventTracker().m3642C();
            }
        }

        @Override // com.applovin.impl.C1517c1.b
        /* JADX INFO: renamed from: b */
        public boolean mo2093b() {
            return !C1508b2.this.f1259h0;
        }
    }

    public C1508b2(final AbstractC1736b abstractC1736b, final Activity activity, Map map, final C1748l c1748l, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(abstractC1736b, activity, map, c1748l, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f1139o0 = hashSet;
        C1711r7 c1711r7 = (C1711r7) abstractC1736b;
        this.f1138n0 = c1711r7;
        if (c1711r7.m4238l1()) {
            ImageView imageViewM5595a = C1816x7.m5595a(c1711r7.m4232f1().m5601e(), activity, c1748l);
            this.f1248W = imageViewM5595a;
            imageViewM5595a.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b2$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m2073a(abstractC1736b, c1748l, activity, view);
                }
            });
        }
        C1711r7.d dVar = C1711r7.d.VIDEO;
        hashSet.addAll(c1711r7.m4227a(dVar, AbstractC1524c8.f1297a));
        m2069a(C1711r7.d.IMPRESSION);
        m2071a(dVar, "creativeView");
        c1711r7.getAdEventTracker().m2811g();
    }

    /* JADX INFO: renamed from: U */
    private boolean m2065U() {
        return this.f1248W != null && this.f1138n0.m4238l1();
    }

    /* JADX INFO: renamed from: V */
    private void m2066V() {
        if (!m2181G() || this.f1139o0.isEmpty()) {
            return;
        }
        if (C1768p.m5160a()) {
            this.f3596c.m5178k("AppLovinFullscreenActivity", "Firing " + this.f1139o0.size() + " un-fired video progress trackers when video was completed.");
        }
        m2074a(this.f1139o0);
    }

    /* JADX INFO: renamed from: a */
    private void m2069a(C1711r7.d dVar) {
        m2070a(dVar, EnumC1807w7.UNSPECIFIED);
    }

    /* JADX INFO: renamed from: a */
    private void m2070a(C1711r7.d dVar, EnumC1807w7 enumC1807w7) {
        m2072a(dVar, "", enumC1807w7);
    }

    /* JADX INFO: renamed from: a */
    private void m2071a(C1711r7.d dVar, String str) {
        m2072a(dVar, str, EnumC1807w7.UNSPECIFIED);
    }

    /* JADX INFO: renamed from: a */
    private void m2072a(C1711r7.d dVar, String str, EnumC1807w7 enumC1807w7) {
        m2075a(this.f1138n0.m4226a(dVar, str), enumC1807w7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2073a(AbstractC1736b abstractC1736b, C1748l c1748l, Activity activity, View view) {
        Uri uriM5599c = this.f1138n0.m4232f1().m5599c();
        if (uriM5599c != null) {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriM5599c);
            }
            m2069a(C1711r7.d.INDUSTRY_ICON_CLICK);
            if (abstractC1736b.isCustomTabsEnabled()) {
                c1748l.m4757A().m2660a(uriM5599c, m5654b().getController(), activity);
            } else {
                AbstractC1664n7.m3689b(uriM5599c, abstractC1736b, activity, c1748l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2074a(Set set) {
        m2075a(set, EnumC1807w7.UNSPECIFIED);
    }

    /* JADX INFO: renamed from: a */
    private void m2075a(Set set, EnumC1807w7 enumC1807w7) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f1241P.getCurrentPosition());
        C1554f8 c1554f8M4237k1 = this.f1138n0.m4237k1();
        Uri uriM2631d = c1554f8M4237k1 != null ? c1554f8M4237k1.m2631d() : null;
        if (C1768p.m5160a()) {
            this.f3596c.m5171a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        AbstractC1534d8.m2439a(set, seconds, uriM2631d, enumC1807w7, this.f3595b);
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: D */
    public void mo2077D() {
        m2071a(C1711r7.d.VIDEO, "skip");
        this.f1138n0.getAdEventTracker().m3641B();
        super.mo2077D();
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: E */
    protected void mo2078E() {
        super.mo2078E();
        C1711r7 c1711r7 = this.f1138n0;
        if (c1711r7 != null) {
            c1711r7.getAdEventTracker().m3645i();
        }
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: N */
    protected void mo2079N() {
        long jM4499P;
        int iM4557r;
        long millis = 0;
        if (this.f1138n0.m4497O() >= 0 || this.f1138n0.m4499P() >= 0) {
            if (this.f1138n0.m4497O() >= 0) {
                jM4499P = this.f1138n0.m4497O();
            } else {
                C1711r7 c1711r7 = this.f1138n0;
                C1544e8 c1544e8M4236j1 = c1711r7.m4236j1();
                if (c1544e8M4236j1 == null || c1544e8M4236j1.m2519d() <= 0) {
                    long j = this.f1256e0;
                    if (j > 0) {
                        millis = j;
                    }
                } else {
                    millis = TimeUnit.SECONDS.toMillis(c1544e8M4236j1.m2519d());
                }
                if (c1711r7.m4502Q0() && (iM4557r = (int) c1711r7.m4557r()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iM4557r);
                }
                jM4499P = (long) (millis * (((double) this.f1138n0.m4499P()) / 100.0d));
            }
            m5656c(jM4499P);
        }
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: Q */
    protected void mo2080Q() {
        super.mo2080Q();
        C1711r7 c1711r7 = this.f1138n0;
        if (c1711r7 != null) {
            c1711r7.getAdEventTracker().m3646j();
        }
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: R */
    public void mo2081R() {
        m2066V();
        if (!AbstractC1534d8.m2443a(this.f1138n0)) {
            if (C1768p.m5160a()) {
                this.f3596c.m5171a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo2085a("no_valid_companion_ad");
        } else {
            if (this.f1259h0) {
                return;
            }
            m2071a(C1711r7.d.COMPANION, "creativeView");
            this.f1138n0.getAdEventTracker().m3648w();
            super.mo2081R();
        }
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: T */
    public void mo2082T() {
        super.mo2082T();
        m2071a(C1711r7.d.VIDEO, this.f1255d0 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        this.f1138n0.getAdEventTracker().m3644b(this.f1255d0);
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: a */
    public void mo2083a(MotionEvent motionEvent) {
        m2069a(C1711r7.d.VIDEO_CLICK);
        this.f1138n0.getAdEventTracker().m3647v();
        super.mo2083a(motionEvent);
    }

    @Override // com.applovin.impl.C1518c2, com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2084a(ViewGroup viewGroup) {
        super.mo2084a(viewGroup);
        if (m2065U()) {
            m2069a(C1711r7.d.INDUSTRY_ICON_IMPRESSION);
            this.f1248W.setVisibility(0);
        }
        this.f1252a0.m2152a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C1478a c1478a = this.f1242Q;
        if (c1478a != null) {
            arrayList.add(new C1590j4(c1478a, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        C1498g c1498g = this.f1243R;
        if (c1498g != null) {
            arrayList.add(new C1590j4(c1498g, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C1596k0 c1596k0 = this.f1244S;
        if (c1596k0 != null) {
            arrayList.add(new C1590j4(c1596k0, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f1246U;
        if (progressBar != null) {
            arrayList.add(new C1590j4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f1247V;
        if (progressBar2 != null) {
            arrayList.add(new C1590j4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f1245T;
        if (imageView != null) {
            arrayList.add(new C1590j4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        C1502k c1502k = this.f3603j;
        if (c1502k != null && c1502k.m2036a()) {
            C1502k c1502k2 = this.f3603j;
            arrayList.add(new C1590j4(c1502k2, FriendlyObstructionPurpose.NOT_VISIBLE, c1502k2.getIdentifier()));
        }
        this.f1138n0.getAdEventTracker().m2805b(this.f1241P, arrayList);
    }

    @Override // com.applovin.impl.C1518c2, com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: a */
    public void mo2085a(String str) {
        if (this.f1138n0 != null) {
            m2071a(C1711r7.d.VIDEO, "close");
            m2071a(C1711r7.d.COMPANION, "close");
        }
        super.mo2085a(str);
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: d */
    protected void mo2086d(long j) {
        super.mo2086d(j);
        this.f1138n0.getAdEventTracker().m3643b(TimeUnit.MILLISECONDS.toSeconds(j), AbstractC1701q7.m4103e(this.f3595b));
    }

    @Override // com.applovin.impl.C1518c2
    /* JADX INFO: renamed from: g */
    public void mo2087g(String str) {
        m2070a(C1711r7.d.ERROR, EnumC1807w7.MEDIA_FILE_ERROR);
        this.f1138n0.getAdEventTracker().m2806b(str);
        super.mo2087g(str);
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: s */
    public void mo2088s() {
        super.mo2088s();
        m2071a(this.f1259h0 ? C1711r7.d.COMPANION : C1711r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f1138n0.getAdEventTracker().m3651z();
    }

    @Override // com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: t */
    public void mo2089t() {
        super.mo2089t();
        m2071a(this.f1259h0 ? C1711r7.d.COMPANION : C1711r7.d.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f1138n0.getAdEventTracker().m3640A();
    }

    @Override // com.applovin.impl.C1518c2, com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: v */
    public void mo2090v() {
        this.f1252a0.m2154c();
        super.mo2090v();
    }

    @Override // com.applovin.impl.C1518c2, com.applovin.impl.AbstractC1819y1
    /* JADX INFO: renamed from: w */
    public void mo2091w() {
        mo2084a((ViewGroup) null);
    }
}
