package com.applovin.impl.mediation;

import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.C1519c3;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a */
    private final AbstractC1482a3 f2081a;

    /* JADX INFO: renamed from: b */
    private final String f2082b;

    /* JADX INFO: renamed from: c */
    private final String f2083c;

    /* JADX INFO: renamed from: d */
    private final List f2084d;

    /* JADX INFO: renamed from: e */
    private final long f2085e;

    /* JADX INFO: renamed from: f */
    private final C1519c3 f2086f;

    /* JADX INFO: renamed from: g */
    private final List f2087g;

    /* JADX INFO: renamed from: h */
    private final String f2088h;

    /* JADX INFO: renamed from: i */
    private final String f2089i;

    public MaxAdWaterfallInfoImpl(AbstractC1482a3 abstractC1482a3, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(abstractC1482a3, abstractC1482a3.m1837X(), abstractC1482a3.m1838Y(), j, list, abstractC1482a3.m1830Q(), abstractC1482a3.m1836W(), str, abstractC1482a3.m1833T());
    }

    public MaxAdWaterfallInfoImpl(AbstractC1482a3 abstractC1482a3, String str, String str2, long j, List<MaxNetworkResponseInfo> list, C1519c3 c1519c3, List<String> list2, String str3, String str4) {
        this.f2081a = abstractC1482a3;
        this.f2082b = str;
        this.f2083c = str2;
        this.f2085e = j;
        this.f2084d = list;
        this.f2086f = c1519c3;
        this.f2087g = list2;
        this.f2088h = str3;
        this.f2089i = str4;
    }

    public String getEventId() {
        return this.f2089i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f2085e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f2081a;
    }

    public String getMCode() {
        return this.f2088h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f2082b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f2084d;
    }

    public List<String> getPostbackUrls() {
        return this.f2087g;
    }

    public C1519c3 getRequestParameters() {
        return this.f2086f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f2083c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f2082b + ", testName=" + this.f2083c + ", networkResponses=" + this.f2084d + ", latencyMillis=" + this.f2085e + AbstractJsonLexerKt.END_OBJ;
    }
}
