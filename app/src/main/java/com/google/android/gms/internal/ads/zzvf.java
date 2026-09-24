package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import androidx.media3.exoplayer.drm.FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzvf {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m429m(i, i2, (int) d));
        boolean z = true;
        if (iZzc == 1 && zzvg.zza == null) {
            if (Build.VERSION.SDK_INT >= 37) {
                z = false;
            } else {
                int iZzb = zzb(true);
                if (Build.VERSION.SDK_INT < 35 ? !(zzb(false) != 2 || iZzb == 1) : iZzb != 1) {
                    z = false;
                }
            }
            zzvg.zza = Boolean.valueOf(z);
            if (zzvg.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo("video/avc");
            zzv zzvVarZzO = zztVar.zzO();
            if (zzvVarZzO.zzp != null) {
                List listZzc = zzvx.zzc(zzvn.zzb, zzvVarZzO, z, false);
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzve) listZzc.get(i)).zzd != null && (videoCapabilities = ((zzve) listZzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m$1();
                        return zzc(supportedPerformancePoints, FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m429m(1280, 720, 60));
                    }
                }
            }
        } catch (zzvp unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (FrameworkMediaDrm$$ExternalSyntheticApiModelOutline0.m430m(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
