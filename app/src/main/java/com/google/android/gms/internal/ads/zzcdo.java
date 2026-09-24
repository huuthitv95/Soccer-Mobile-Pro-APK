package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzcdo {
    static zzcdo zzi;

    public static synchronized zzcdo zzb(Context context) {
        zzcdo zzcdoVar = zzi;
        if (zzcdoVar != null) {
            return zzcdoVar;
        }
        Context applicationContext = context.getApplicationContext();
        zzbie.zza(applicationContext);
        com.google.android.gms.ads.internal.util.zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
        zzgVarZzo.zza(applicationContext);
        zzcdi zzcdiVar = new zzcdi(null);
        zzcdiVar.zza(applicationContext);
        zzcdiVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
        zzcdiVar.zzc(zzgVarZzo);
        zzcdiVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
        zzcdo zzcdoVarZze = zzcdiVar.zze();
        zzi = zzcdoVarZze;
        ((zzcdc) ((zzcdj) zzcdoVarZze).zzc.zzb()).zza();
        final zzcdt zzcdtVar = (zzcdt) ((zzcdj) zzi).zzh.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbg)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map mapZzx = com.google.android.gms.ads.internal.util.zzs.zzx((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbh));
            Iterator it = mapZzx.keySet().iterator();
            while (it.hasNext()) {
                zzcdtVar.zzb((String) it.next());
            }
            zzcdtVar.zza(new zzcdr() { // from class: com.google.android.gms.internal.ads.zzcds
                @Override // com.google.android.gms.internal.ads.zzcdr
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                    zzcdtVar.zzc(mapZzx, sharedPreferences, str, str2);
                }
            });
        }
        return zzi;
    }

    abstract zzcdg zza();
}
