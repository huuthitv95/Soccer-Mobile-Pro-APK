package androidx.media3.common.util;

import androidx.media3.common.audio.SpeedProvider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public class SpeedProviderUtil {
    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j) {
        long j2 = 0;
        double dMin = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        while (j2 < j) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j2);
            if (nextSpeedChangeTimeUs == -9223372036854775807L) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j) - j2) / ((double) speedProvider.getSpeed(j2));
            j2 = nextSpeedChangeTimeUs;
        }
        return Math.round(dMin);
    }
}
