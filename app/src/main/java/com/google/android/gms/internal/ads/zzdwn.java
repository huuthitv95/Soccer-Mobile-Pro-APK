package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwn {
    private final Map zza = new HashMap();

    zzdwn() {
    }

    final synchronized void zza(String str, @Nullable zzflk zzflkVar) {
        zzbxe zzbxeVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbxe zzbxeVarZzC = null;
        if (zzflkVar == null) {
            zzbxeVarZzB = null;
        } else {
            try {
                zzbxeVarZzB = zzflkVar.zzB();
            } catch (zzfkt unused) {
                zzbxeVarZzB = null;
            }
        }
        if (zzflkVar != null) {
            try {
                zzbxeVarZzC = zzflkVar.zzC();
            } catch (zzfkt unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkJ)).booleanValue()) {
            if (zzflkVar == null) {
                z = false;
            } else {
                try {
                    zzflkVar.zzn();
                } catch (zzfkt unused3) {
                    z = false;
                }
            }
        }
        this.zza.put(str, new zzdwm(str, zzbxeVarZzB, zzbxeVarZzC, z));
    }

    final synchronized void zzb(String str, zzbwp zzbwpVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdwm(str, zzbwpVar.zzf(), zzbwpVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdwm zzc(String str) {
        return (zzdwm) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbxe zzbxeVar;
        zzdwm zzdwmVarZzc = zzc(str);
        return (zzdwmVarZzc == null || (zzbxeVar = zzdwmVarZzc.zzb) == null) ? "" : zzbxeVar.toString();
    }
}
