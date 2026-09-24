package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fa */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753fa {

    /* JADX INFO: renamed from: a */
    public final C4143wi f14190a;

    /* JADX INFO: renamed from: b */
    public final C3708db f14191b;

    /* JADX INFO: renamed from: c */
    public final C3839j4 f14192c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3908m4 f14193d;

    /* JADX INFO: renamed from: e */
    public final C4195z4 f14194e;

    /* JADX INFO: renamed from: f */
    public final EnumC3914ma f14195f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3642ae f14196g;

    /* JADX INFO: renamed from: h */
    public final C3950o1 f14197h;

    /* JADX INFO: renamed from: i */
    public final C4131w6 f14198i;

    /* JADX INFO: renamed from: j */
    public final AbstractC3930n3 f14199j;

    /* JADX INFO: renamed from: k */
    public final C3730ea f14200k;

    /* JADX INFO: renamed from: l */
    public final C3651b0 f14201l;

    /* JADX INFO: renamed from: m */
    public final AbstractC3628a0 f14202m;

    /* JADX INFO: renamed from: n */
    public final String f14203n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC3891la f14204o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC4178y9 f14205p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC3971p0 f14206q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC3911m7 f14207r;

    public C3753fa(C4143wi urlResolver, C3708db intentResolver, C3839j4 clickRequest, InterfaceC3908m4 clickTracking, C4195z4 completeRequest, EnumC3914ma mediaType, InterfaceC3642ae openMeasurementImpressionCallback, C3950o1 appRequest, C4131w6 downloader, AbstractC3930n3 viewProtocol, C3730ea impressionCounter, C3651b0 adUnit, AbstractC3628a0 adTypeTraits, String location, InterfaceC3891la impressionCallback, InterfaceC4178y9 impressionClickCallback, InterfaceC3971p0 adUnitRendererImpressionCallback, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(impressionCounter, "impressionCounter");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraits, "adTypeTraits");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f14190a = urlResolver;
        this.f14191b = intentResolver;
        this.f14192c = clickRequest;
        this.f14193d = clickTracking;
        this.f14194e = completeRequest;
        this.f14195f = mediaType;
        this.f14196g = openMeasurementImpressionCallback;
        this.f14197h = appRequest;
        this.f14198i = downloader;
        this.f14199j = viewProtocol;
        this.f14200k = impressionCounter;
        this.f14201l = adUnit;
        this.f14202m = adTypeTraits;
        this.f14203n = location;
        this.f14204o = impressionCallback;
        this.f14205p = impressionClickCallback;
        this.f14206q = adUnitRendererImpressionCallback;
        this.f14207r = eventTracker;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC3628a0 m17670a() {
        return this.f14202m;
    }

    /* JADX INFO: renamed from: b */
    public final C3651b0 m17671b() {
        return this.f14201l;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3971p0 m17672c() {
        return this.f14206q;
    }

    /* JADX INFO: renamed from: d */
    public final C3950o1 m17673d() {
        return this.f14197h;
    }

    /* JADX INFO: renamed from: e */
    public final C3839j4 m17674e() {
        return this.f14192c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3753fa)) {
            return false;
        }
        C3753fa c3753fa = (C3753fa) obj;
        return Intrinsics.areEqual(this.f14190a, c3753fa.f14190a) && Intrinsics.areEqual(this.f14191b, c3753fa.f14191b) && Intrinsics.areEqual(this.f14192c, c3753fa.f14192c) && Intrinsics.areEqual(this.f14193d, c3753fa.f14193d) && Intrinsics.areEqual(this.f14194e, c3753fa.f14194e) && this.f14195f == c3753fa.f14195f && Intrinsics.areEqual(this.f14196g, c3753fa.f14196g) && Intrinsics.areEqual(this.f14197h, c3753fa.f14197h) && Intrinsics.areEqual(this.f14198i, c3753fa.f14198i) && Intrinsics.areEqual(this.f14199j, c3753fa.f14199j) && Intrinsics.areEqual(this.f14200k, c3753fa.f14200k) && Intrinsics.areEqual(this.f14201l, c3753fa.f14201l) && Intrinsics.areEqual(this.f14202m, c3753fa.f14202m) && Intrinsics.areEqual(this.f14203n, c3753fa.f14203n) && Intrinsics.areEqual(this.f14204o, c3753fa.f14204o) && Intrinsics.areEqual(this.f14205p, c3753fa.f14205p) && Intrinsics.areEqual(this.f14206q, c3753fa.f14206q) && Intrinsics.areEqual(this.f14207r, c3753fa.f14207r);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC3908m4 m17675f() {
        return this.f14193d;
    }

    /* JADX INFO: renamed from: g */
    public final C4195z4 m17676g() {
        return this.f14194e;
    }

    /* JADX INFO: renamed from: h */
    public final C4131w6 m17677h() {
        return this.f14198i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f14190a.hashCode() * 31) + this.f14191b.hashCode()) * 31) + this.f14192c.hashCode()) * 31) + this.f14193d.hashCode()) * 31) + this.f14194e.hashCode()) * 31) + this.f14195f.hashCode()) * 31) + this.f14196g.hashCode()) * 31) + this.f14197h.hashCode()) * 31) + this.f14198i.hashCode()) * 31) + this.f14199j.hashCode()) * 31) + this.f14200k.hashCode()) * 31) + this.f14201l.hashCode()) * 31) + this.f14202m.hashCode()) * 31) + this.f14203n.hashCode()) * 31) + this.f14204o.hashCode()) * 31) + this.f14205p.hashCode()) * 31) + this.f14206q.hashCode()) * 31) + this.f14207r.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC3911m7 m17678i() {
        return this.f14207r;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC3891la m17679j() {
        return this.f14204o;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC4178y9 m17680k() {
        return this.f14205p;
    }

    /* JADX INFO: renamed from: l */
    public final C3730ea m17681l() {
        return this.f14200k;
    }

    /* JADX INFO: renamed from: m */
    public final C3708db m17682m() {
        return this.f14191b;
    }

    /* JADX INFO: renamed from: n */
    public final String m17683n() {
        return this.f14203n;
    }

    /* JADX INFO: renamed from: o */
    public final EnumC3914ma m17684o() {
        return this.f14195f;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3642ae m17685p() {
        return this.f14196g;
    }

    /* JADX INFO: renamed from: q */
    public final C4143wi m17686q() {
        return this.f14190a;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC3930n3 m17687r() {
        return this.f14199j;
    }

    public String toString() {
        return "ImpressionDependency(urlResolver=" + this.f14190a + ", intentResolver=" + this.f14191b + ", clickRequest=" + this.f14192c + ", clickTracking=" + this.f14193d + ", completeRequest=" + this.f14194e + ", mediaType=" + this.f14195f + ", openMeasurementImpressionCallback=" + this.f14196g + ", appRequest=" + this.f14197h + ", downloader=" + this.f14198i + ", viewProtocol=" + this.f14199j + ", impressionCounter=" + this.f14200k + ", adUnit=" + this.f14201l + ", adTypeTraits=" + this.f14202m + ", location=" + this.f14203n + ", impressionCallback=" + this.f14204o + ", impressionClickCallback=" + this.f14205p + ", adUnitRendererImpressionCallback=" + this.f14206q + ", eventTracker=" + this.f14207r + ")";
    }
}
