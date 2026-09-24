package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.h6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1572h6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: o */
    private static final AtomicBoolean f1761o = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    private final C1519c3 f1762g;

    /* JADX INFO: renamed from: h */
    private final JSONObject f1763h;

    /* JADX INFO: renamed from: i */
    private final List f1764i;

    /* JADX INFO: renamed from: j */
    private final AbstractC1644a.a f1765j;

    /* JADX INFO: renamed from: k */
    private final WeakReference f1766k;

    /* JADX INFO: renamed from: l */
    private final String f1767l;

    /* JADX INFO: renamed from: m */
    private long f1768m;

    /* JADX INFO: renamed from: n */
    private final List f1769n;

    /* JADX INFO: renamed from: com.applovin.impl.h6$b */
    private class b extends AbstractRunnableC1601k5 {

        /* JADX INFO: renamed from: g */
        private final long f1770g;

        /* JADX INFO: renamed from: h */
        private final int f1771h;

        /* JADX INFO: renamed from: i */
        private final AbstractC1482a3 f1772i;

        /* JADX INFO: renamed from: j */
        private final List f1773j;

        /* JADX INFO: renamed from: com.applovin.impl.h6$b$a */
        class a extends AbstractC1599k3 {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ MaxAdFormat f1775b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f1776c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC1644a.a aVar, MaxAdFormat maxAdFormat, String str) {
                super(aVar);
                this.f1775b = maxAdFormat;
                this.f1776c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f1770g;
                C1768p unused = b.this.f1971c;
                if (C1768p.m5160a()) {
                    b.this.f1971c.m5171a(b.this.f1970b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f1775b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.m2834b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.m2830a(bVar.f1772i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f1771h >= b.this.f1773j.size() - 1) {
                    C1572h6.this.m2823b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f1969a.m4853s0().m2604a((AbstractRunnableC1601k5) new b(bVar2.f1771h + 1, b.this.f1773j), C1552f6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.m2834b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f1770g;
                C1768p unused = b.this.f1971c;
                if (C1768p.m5160a()) {
                    b.this.f1971c.m5171a(b.this.f1970b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f1775b.getLabel() + " ad unit " + this.f1776c);
                }
                AbstractC1482a3 abstractC1482a3 = (AbstractC1482a3) maxAd;
                b.this.m2830a(abstractC1482a3, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i = b.this.f1771h;
                while (true) {
                    i++;
                    if (i >= b.this.f1773j.size()) {
                        C1572h6.this.m2822b(abstractC1482a3);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.m2830a((AbstractC1482a3) bVar.f1773j.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        private b(int i, List list) {
            super(C1572h6.this.f1970b, C1572h6.this.f1969a, C1572h6.this.f1762g.m2193b());
            this.f1770g = SystemClock.elapsedRealtime();
            this.f1771h = i;
            this.f1772i = (AbstractC1482a3) list.get(i);
            this.f1773j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m2830a(AbstractC1482a3 abstractC1482a3, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            C1572h6.this.f1769n.add(new MaxNetworkResponseInfoImpl(adLoadState, AbstractC1821y3.m5693a(abstractC1482a3.m3196b()), abstractC1482a3.m1820F(), abstractC1482a3.m1839Z(), j, abstractC1482a3.m1817C(), maxError));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public void m2834b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM2193b = C1572h6.this.f1762g.m2193b();
            MaxAdFormat maxAdFormatM2191a = C1572h6.this.f1762g.m2191a();
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Loading ad " + (this.f1771h + 1) + " of " + this.f1773j.size() + " from " + this.f1772i.m3200c() + " for " + maxAdFormatM2191a.getLabel() + " ad unit " + strM2193b);
            }
            m2834b("started to load ad");
            Context context = (Context) C1572h6.this.f1766k.get();
            Activity activityM4861w0 = context instanceof Activity ? (Activity) context : this.f1969a.m4861w0();
            this.f1969a.m4824c0().m5182b(this.f1772i);
            this.f1969a.m4797Z().loadThirdPartyMediatedAd(strM2193b, this.f1772i, activityM4861w0, new a(C1572h6.this.f1765j, maxAdFormatM2191a, strM2193b));
        }
    }

    public C1572h6(C1519c3 c1519c3, JSONObject jSONObject, Context context, C1748l c1748l, AbstractC1644a.a aVar) {
        super("TaskProcessMediationWaterfall", c1748l, c1519c3.m2193b());
        this.f1762g = c1519c3;
        this.f1763h = jSONObject;
        this.f1765j = aVar;
        this.f1766k = new WeakReference(context);
        this.f1767l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, AbstractC13068b.JSON_KEY_ADS, new JSONArray());
        this.f1764i = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f1764i.add(AbstractC1482a3.m1808a(c1519c3, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, c1748l));
        }
        this.f1769n = new ArrayList(this.f1764i.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m2823b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f1769n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f1769n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String strM2193b = this.f1762g.m2193b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1768m;
        if (C1768p.m5160a()) {
            this.f1971c.m5175d(this.f1970b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f1762g.m2191a().getLabel() + " ad unit " + strM2193b + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f1763h, "waterfall_name", ""), JsonUtils.getString(this.f1763h, "waterfall_test_name", ""), jElapsedRealtime, this.f1769n, this.f1762g, JsonUtils.optList(JsonUtils.getJSONArray(this.f1763h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f1767l, JsonUtils.getString(this.f1763h, "event_id", "")));
        AbstractC1793v2.m5376a(this.f1765j, strM2193b, maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m2822b(AbstractC1482a3 abstractC1482a3) {
        this.f1969a.m4824c0().m5184c(abstractC1482a3);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1768m;
        if (C1768p.m5160a()) {
            this.f1971c.m5175d(this.f1970b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + abstractC1482a3.m3200c() + " for " + this.f1762g.m2191a().getLabel() + " ad unit " + this.f1762g.m2193b());
        }
        abstractC1482a3.m1843a(new MaxAdWaterfallInfoImpl(abstractC1482a3, jElapsedRealtime, this.f1769n, this.f1767l));
        AbstractC1793v2.m5455f(this.f1765j, abstractC1482a3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m2827e() {
        AbstractC1701q7.m4057a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f1969a.m4861w0());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.f1768m = SystemClock.elapsedRealtime();
        int i = 0;
        if (this.f1763h.optBoolean("is_testing", false) && !this.f1969a.m4857u0().m2928c() && f1761o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.h6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2827e();
                }
            });
        }
        String strM2193b = this.f1762g.m2193b();
        MaxAdFormat maxAdFormatM2191a = this.f1762g.m2191a();
        if (this.f1764i.size() > 0) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "Starting waterfall for " + maxAdFormatM2191a.getLabel() + " ad unit " + strM2193b + " with " + this.f1764i.size() + " ad(s)...");
            }
            this.f1969a.m4853s0().m2603a(new b(i, this.f1764i));
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5178k(this.f1970b, "No ads were returned from the server for " + maxAdFormatM2191a.getLabel() + " ad unit " + strM2193b);
        }
        AbstractC1701q7.m4056a(strM2193b, maxAdFormatM2191a, this.f1763h, this.f1969a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f1763h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (AbstractC1821y3.m5702a(this.f1763h, strM2193b, this.f1969a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strM2193b + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (AbstractC1701q7.m4092c(this.f1969a) && ((Boolean) this.f1969a.m4801a(C1831z4.f3693C6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            m2823b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.h6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2823b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            C1576i0.m2851a(millis, this.f1969a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }
}
