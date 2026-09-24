package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.WebViewAdsError;
import com.unity3d.scar.adapter.v2100.ScarAdapter;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;

/* JADX INFO: loaded from: classes7.dex */
public class ScarAdapterFactory {

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1 */
    static /* synthetic */ class C147511 {

        /* JADX INFO: renamed from: $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion */
        static final /* synthetic */ int[] f41819x776ad9a7;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            f41819x776ad9a7 = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41819x776ad9a7[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41819x776ad9a7[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, IAdsErrorHandler<WebViewAdsError> iAdsErrorHandler) {
        String str = String.format("SCAR version %s is not supported.", scarAdapterVersion.name());
        iAdsErrorHandler.handleError(GMAAdsError.AdapterCreationError(str));
        DeviceLog.debug(str);
    }

    public IScarAdapter createScarAdapter(ScarAdapterVersion scarAdapterVersion, IAdsErrorHandler<WebViewAdsError> iAdsErrorHandler) {
        int i = C147511.f41819x776ad9a7[scarAdapterVersion.ordinal()];
        if (i == 1) {
            return new ScarAdapter(iAdsErrorHandler, SdkProperties.getVersionName());
        }
        if (i == 2) {
            return new com.unity3d.scar.adapter.v2300.ScarAdapter(iAdsErrorHandler, SdkProperties.getVersionName());
        }
        reportAdapterFailure(scarAdapterVersion, iAdsErrorHandler);
        return null;
    }
}
