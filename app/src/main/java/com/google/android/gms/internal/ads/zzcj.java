package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcj {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            zza = null;
        }
        AudioManager audioManager = zza;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            final zzdr zzdrVar = new zzdr(zzdo.zza);
            zzdh.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcj.zzb(applicationContext, zzdrVar);
                }
            });
            zzdrVar.zzd();
            AudioManager audioManager2 = zza;
            if (audioManager2 == null) {
                throw null;
            }
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        zza = audioManager3;
        if (audioManager3 == null) {
            throw null;
        }
        return audioManager3;
    }

    static /* synthetic */ void zzb(Context context, zzdr zzdrVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdrVar.zza();
    }
}
