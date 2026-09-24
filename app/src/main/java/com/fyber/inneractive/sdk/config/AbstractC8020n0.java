package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.n0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8020n0 {
    /* JADX INFO: renamed from: a */
    public static void m20441a(Context context, C8048w c8048w) {
        boolean zIsLimitAdTrackingEnabled;
        String id = null;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            try {
                IAlog.m21949e("limit ad tracking: %s", Boolean.valueOf(zIsLimitAdTrackingEnabled));
                if (zIsLimitAdTrackingEnabled) {
                    IAlog.m21949e("user has opt out of Ads Personalization. not accessing Advertising ID.", new Object[0]);
                } else {
                    id = advertisingIdInfo.getId();
                    IAlog.m21949e("advertising id: %s", id);
                }
            } catch (Throwable th) {
                th = th;
                IAlog.m21949e("Handled Exception:", new Object[0]);
                IAlog.m21949e(AbstractC9195v.m22032b(th), new Object[0]);
                IAlog.m21947c("Advertising ID is not available. Please add Google Play Services library to improve your ad targeting.", new Object[0]);
            }
        } catch (Throwable th2) {
            th = th2;
            zIsLimitAdTrackingEnabled = false;
        }
        synchronized (c8048w) {
            C8046v c8046v = c8048w.f17886b;
            c8046v.f17882a = id;
            c8046v.f17883b = zIsLimitAdTrackingEnabled;
            c8046v.f17884c = false;
        }
    }
}
