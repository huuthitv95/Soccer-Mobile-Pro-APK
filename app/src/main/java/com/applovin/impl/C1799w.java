package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.w */
/* JADX INFO: loaded from: classes3.dex */
public class C1799w implements DTBAdCallback {

    /* JADX INFO: renamed from: a */
    private final MaxAdFormat f3483a;

    /* JADX INFO: renamed from: b */
    private final a f3484b;

    /* JADX INFO: renamed from: c */
    private DTBAdRequest f3485c;

    /* JADX INFO: renamed from: com.applovin.impl.w$a */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public C1799w(C1808x c1808x, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(c1808x.m5558a()), maxAdFormat, context, aVar);
    }

    public C1799w(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f3483a = maxAdFormat;
        this.f3484b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i = 0; i < list.size(); i++) {
                Object obj = list.get(i);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i] = (DTBAdSize) obj;
                }
            }
            if (AbstractC1701q7.m4018a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f3485c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f3485c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f3485c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5489a() {
        DTBAdRequest dTBAdRequest = this.f3485c;
        if (dTBAdRequest == null) {
            this.f3484b.onAdLoadFailed(null, this.f3483a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f3484b.onAdLoadFailed(adError, this.f3483a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f3484b.onAdResponseLoaded(dTBAdResponse, this.f3483a);
    }
}
