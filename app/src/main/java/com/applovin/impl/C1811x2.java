package com.applovin.impl;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX INFO: renamed from: com.applovin.impl.x2 */
/* JADX INFO: loaded from: classes9.dex */
public class C1811x2 {

    /* JADX INFO: renamed from: a */
    private final StringBuilder f3555a = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public C1811x2 m5564a() {
        this.f3555a.append("\n========================================");
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5565a(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                m5571a(str, bundle.get(str));
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5566a(AppLovinAdView appLovinAdView) {
        return m5571a("Size", appLovinAdView.getSize().getWidth() + "x" + appLovinAdView.getSize().getHeight()).m5571a("Alpha", Float.valueOf(appLovinAdView.getAlpha())).m5571a("Visibility", AbstractC1564g8.m2751a(appLovinAdView.getVisibility()));
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5567a(AbstractC1482a3 abstractC1482a3) {
        return m5571a(AndroidInitializeBoldSDK.MSG_NETWORK, abstractC1482a3.m3200c()).m5571a("Adapter Version", abstractC1482a3.m1815A()).m5571a("Format", abstractC1482a3.getFormat().getLabel()).m5571a("Ad Unit ID", abstractC1482a3.getAdUnitId()).m5571a("Placement", abstractC1482a3.getPlacement()).m5571a("Network Placement", abstractC1482a3.m1834U()).m5571a("Serve ID", abstractC1482a3.m1833T()).m5571a("Creative ID", StringUtils.isValidString(abstractC1482a3.getCreativeId()) ? abstractC1482a3.getCreativeId() : "None").m5571a("Ad Domain", StringUtils.isValidString(abstractC1482a3.m1861v()) ? abstractC1482a3.m1861v() : "None").m5571a("DSP Name", StringUtils.isValidString(abstractC1482a3.getDspName()) ? abstractC1482a3.getDspName() : "None").m5571a("DSP ID", StringUtils.isValidString(abstractC1482a3.getDspId()) ? abstractC1482a3.getDspId() : "None").m5571a("Server Parameters", abstractC1482a3.m3216l());
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5568a(AbstractC1736b abstractC1736b) {
        boolean z = abstractC1736b instanceof C1711r7;
        m5571a("Format", abstractC1736b.getAdZone().m5263d() != null ? abstractC1736b.getAdZone().m5263d().getLabel() : null).m5571a("Ad ID", Long.valueOf(abstractC1736b.getAdIdNumber())).m5571a("Zone ID", abstractC1736b.getAdZone().m5264e()).m5571a("Ad Class", z ? "VastAd" : "AdServerAd");
        String dspName = abstractC1736b.getDspName();
        if (StringUtils.isValidString(dspName)) {
            m5571a("DSP Name", dspName);
        }
        if (z) {
            m5571a("VAST DSP", ((C1711r7) abstractC1736b).m4234h1());
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5569a(C1748l c1748l) {
        return m5571a("Muted", Boolean.valueOf(c1748l.m4847p0().isMuted()));
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5570a(String str) {
        StringBuilder sb = this.f3555a;
        sb.append("\n");
        sb.append(str);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5571a(String str, Object obj) {
        return m5572a(str, obj, "");
    }

    /* JADX INFO: renamed from: a */
    public C1811x2 m5572a(String str, Object obj, String str2) {
        StringBuilder sb = this.f3555a;
        sb.append("\n");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append(str2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C1811x2 m5573b(AbstractC1736b abstractC1736b) {
        m5571a("Target", abstractC1736b.m4513W()).m5571a("close_style", abstractC1736b.m4553p()).m5572a("close_delay_graphic", Long.valueOf(abstractC1736b.m4557r()), CmcdData.Factory.STREAMING_FORMAT_SS);
        if (abstractC1736b instanceof C1735a) {
            C1735a c1735a = (C1735a) abstractC1736b;
            m5571a("HTML", c1735a.m4440a1().substring(0, Math.min(c1735a.m4440a1().length(), 64)));
        }
        if (abstractC1736b.hasVideoUrl()) {
            m5572a("close_delay", Long.valueOf(abstractC1736b.m4524a0()), CmcdData.Factory.STREAMING_FORMAT_SS).m5571a("skip_style", abstractC1736b.m4509U()).m5571a("Streaming", Boolean.valueOf(abstractC1736b.mo4248y0())).m5571a("Video Location", abstractC1736b.mo4222I());
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C1811x2 m5574b(String str) {
        this.f3555a.append(str);
        return this;
    }

    public String toString() {
        return this.f3555a.toString();
    }
}
