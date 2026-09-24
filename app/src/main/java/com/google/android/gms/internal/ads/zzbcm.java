package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcm extends zzbcy {
    public zzbcm(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2) {
        super(zzbblVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzaxfVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdN);
        bool.booleanValue();
        zzbar zzbarVar = new zzbar((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            zzaxfVar.zzc(zzbarVar.zza);
            zzaxfVar.zzP(zzbarVar.zzb);
        }
    }
}
