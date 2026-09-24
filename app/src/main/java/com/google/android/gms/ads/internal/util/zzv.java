package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzcki;
import com.google.android.gms.internal.ads.zzckt;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzekf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final zzckt zzb(zzcki zzckiVar, zzbhd zzbhdVar, boolean z, zzekf zzekfVar) {
        return new zzclx(zzckiVar, zzbhdVar, z, zzekfVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final zzbhj.zzq zzf(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) {
            return zzbhj.zzq.ENUM_TRUE;
        }
        return zzbhj.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzg(Context context, String str, String str2) {
        Util$$ExternalSyntheticApiModelOutline0.m355m();
        NotificationChannel notificationChannelM15m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m15m("offline_notification_channel", "AdMob Offline Notifications", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzjK)).intValue());
        notificationChannelM15m.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelM15m);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzh(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final Intent zzi(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
