package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcdj extends zzcdo {
    final zzimr zza;
    final zzimr zzb;
    final zzimr zzc;
    final zzimr zzd;
    final zzimr zze;
    final zzimr zzf;
    final zzimr zzg;
    final zzimr zzh;
    private final Clock zzj;

    zzcdj(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zzj = clock;
        zzimi zzimiVarZza = zzimj.zza(context);
        this.zza = zzimiVarZza;
        zzimi zzimiVarZza2 = zzimj.zza(zzgVar);
        this.zzb = zzimiVarZza2;
        this.zzc = zzimh.zza(zzcdd.zza(zzimiVarZza, zzimiVarZza2));
        zzimi zzimiVarZza3 = zzimj.zza(clock);
        this.zzd = zzimiVarZza3;
        zzimi zzimiVarZza4 = zzimj.zza(zzcdnVar);
        this.zze = zzimiVarZza4;
        zzimr zzimrVarZza = zzimh.zza(zzcdf.zza(zzimiVarZza3, zzimiVarZza2, zzimiVarZza4));
        this.zzf = zzimrVarZza;
        zzcdh zzcdhVarZzc = zzcdh.zzc(zzimiVarZza3, zzimrVarZza);
        this.zzg = zzcdhVarZzc;
        this.zzh = zzimh.zza(zzcdu.zza(zzimiVarZza, zzcdhVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    final zzcdg zza() {
        return new zzcdg(this.zzj, (zzcde) this.zzf.zzb());
    }
}
