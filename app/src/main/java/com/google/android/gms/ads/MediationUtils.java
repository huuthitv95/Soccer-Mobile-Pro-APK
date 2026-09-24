package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbie;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MediationUtils {
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static AdSize findClosestSize(Context context, AdSize adSize, List<AdSize> list) {
        AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzc() && !adSize.zzg()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new AdSize(Math.round(adSize.getWidthInPixels(context) / f), Math.round(adSize.getHeightInPixels(context) / f));
            }
            float fFloatValue = ((Float) zzba.zzc().zzd(zzbie.zzpQ)).floatValue();
            float fFloatValue2 = ((Float) zzba.zzc().zzd(zzbie.zzpR)).floatValue();
            int iIntValue = ((Integer) zzba.zzc().zzd(zzbie.zzjb)).intValue();
            int iIntValue2 = ((Integer) zzba.zzc().zzd(zzbie.zzjc)).intValue();
            for (AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    float f2 = width * fFloatValue;
                    float f3 = width2;
                    int height2 = adSize3.getHeight();
                    if (f2 <= f3 && width >= width2) {
                        if (adSize.zzg()) {
                            int iZzi = adSize.zzi();
                            if (iIntValue <= width2 && iIntValue2 <= height2 && iZzi >= height2) {
                                if (adSize2 != null || adSize2.getWidth() * adSize2.getHeight() <= adSize3.getWidth() * adSize3.getHeight()) {
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.zzc()) {
                            if (adSize.zzf() >= height2) {
                                if (adSize2 != null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if (height * fFloatValue2 <= height2 && height >= height2) {
                            if (adSize2 != null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
