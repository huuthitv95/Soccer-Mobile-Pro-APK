package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4155x8 extends AbstractC3767g1 {

    /* JADX INFO: renamed from: b */
    public final Context f16908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155x8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16908b = context;
    }

    /* JADX INFO: renamed from: b */
    public C3744f1 m19931b() {
        String str = null;
        if (m17749a()) {
            return new C3744f1(EnumC3922mi.TRACKING_LIMITED, null);
        }
        EnumC3922mi enumC3922mi = EnumC3922mi.TRACKING_UNKNOWN;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f16908b);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                enumC3922mi = EnumC3922mi.TRACKING_LIMITED;
            } else {
                enumC3922mi = EnumC3922mi.TRACKING_ENABLED;
                String id = advertisingIdInfo.getId();
                try {
                    if (Intrinsics.areEqual("00000000-0000-0000-0000-000000000000", id)) {
                        enumC3922mi = EnumC3922mi.TRACKING_LIMITED;
                    } else {
                        str = id;
                    }
                } catch (GooglePlayServicesNotAvailableException e) {
                    e = e;
                    str = id;
                    C4048sb.m19410b("Google play service is not available.", e);
                } catch (GooglePlayServicesRepairableException e2) {
                    e = e2;
                    str = id;
                    C4048sb.m19410b("There was a recoverable error connecting to Google Play Services.", e);
                } catch (IOException e3) {
                    e = e3;
                    str = id;
                    C4048sb.m19410b("The connection to Google Play Services failed.", e);
                } catch (IllegalStateException e4) {
                    e = e4;
                    str = id;
                    C4048sb.m19410b("This should have been called off the main thread.", e);
                } catch (NoClassDefFoundError e5) {
                    e = e5;
                    str = id;
                    C4048sb.m19410b("Google play service is accessing a class that doesn't exist on this version of Android.", e);
                }
            }
        } catch (GooglePlayServicesNotAvailableException e6) {
            e = e6;
        } catch (GooglePlayServicesRepairableException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        } catch (IllegalStateException e9) {
            e = e9;
        } catch (NoClassDefFoundError e10) {
            e = e10;
        }
        return new C3744f1(enumC3922mi, str);
    }
}
