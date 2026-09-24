package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzcvg {
    private final zzcxf zza;
    private final View zzb;
    private final zzfju zzc;
    private final zzcki zzd;

    public zzcvg(View view, zzcki zzckiVar, zzcxf zzcxfVar, zzfju zzfjuVar) {
        this.zzb = view;
        this.zzd = zzckiVar;
        this.zza = zzcxfVar;
        this.zzc = zzfjuVar;
    }

    public final zzcki zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcxf zzc() {
        return this.zza;
    }

    public final zzfju zzd() {
        return this.zzc;
    }

    public zzddr zze(Set set) {
        return new zzddr(set);
    }
}
