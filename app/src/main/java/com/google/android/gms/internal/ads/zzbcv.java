package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbcv extends zzbcy {
    private final View zzh;

    public zzbcv(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, View view) {
        super(zzbblVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzaxfVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzen);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmq);
            zzbbp zzbbpVar = new zzbbp((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzayd zzaydVarZza = zzaye.zza();
            zzaydVarZza.zzb(zzbbpVar.zza.longValue());
            zzaydVarZza.zzc(zzbbpVar.zzb.longValue());
            zzaydVarZza.zzd(zzbbpVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaydVarZza.zza(zzbbpVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaydVarZza.zze(zzbbpVar.zzd.longValue());
            }
            this.zzd.zzM((zzaye) zzaydVarZza.zzbu());
        }
    }
}
