package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeot {
    private final zzflf zza;
    private final zzdwn zzb;
    private final zzdyz zzc;

    public zzeot(zzflf zzflfVar, zzdwn zzdwnVar, zzdyz zzdyzVar) {
        this.zza = zzflfVar;
        this.zzb = zzdwnVar;
        this.zzc = zzdyzVar;
    }

    public final void zza(zzfjw zzfjwVar, zzfjt zzfjtVar, int i, @Nullable zzelk zzelkVar, long j) {
        zzdwm zzdwmVarZzc;
        zzdyy zzdyyVarZza = this.zzc.zza();
        zzdyyVarZza.zza(zzfjwVar);
        zzdyyVarZza.zzb(zzfjtVar);
        zzdyyVarZza.zzc("action", "adapter_status");
        zzdyyVarZza.zzc("adapter_l", String.valueOf(j));
        zzdyyVarZza.zzc("sc", Integer.toString(i));
        if (zzelkVar != null) {
            zzdyyVarZza.zzc("arec", Integer.toString(zzelkVar.zzb().zza));
            String strZza = this.zza.zza(zzelkVar.getMessage());
            if (strZza != null) {
                zzdyyVarZza.zzc("areec", strZza);
            }
        }
        zzdwn zzdwnVar = this.zzb;
        Iterator it = zzfjtVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdwmVarZzc = null;
                break;
            }
            zzdwmVarZzc = zzdwnVar.zzc((String) it.next());
        } while (zzdwmVarZzc == null);
        if (zzdwmVarZzc != null) {
            zzdyyVarZza.zzc("ancn", zzdwmVarZzc.zza);
            zzbxe zzbxeVar = zzdwmVarZzc.zzb;
            if (zzbxeVar != null) {
                zzdyyVarZza.zzc("adapter_v", zzbxeVar.toString());
            }
            zzbxe zzbxeVar2 = zzdwmVarZzc.zzc;
            if (zzbxeVar2 != null) {
                zzdyyVarZza.zzc("adapter_sv", zzbxeVar2.toString());
            }
        }
        zzdyyVarZza.zzd();
    }
}
