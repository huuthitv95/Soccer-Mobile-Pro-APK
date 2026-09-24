package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import com.facebook.share.internal.MessengerShareContentUtility;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdb {
    public static boolean zza(boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Build.FINGERPRINT.contains(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE) || Build.FINGERPRINT.contains("emulator") || Build.HARDWARE.contains("ranchu");
        }
        return Build.DEVICE.startsWith(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE);
    }
}
