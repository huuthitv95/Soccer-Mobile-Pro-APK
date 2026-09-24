package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzevo implements zzfby {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcyx zze;
    private final zzflu zzf;
    private final zzfkm zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final zzdyu zzi;
    private final zzczl zzj;

    public zzevo(Context context, String str, String str2, zzcyx zzcyxVar, zzflu zzfluVar, zzfkm zzfkmVar, zzdyu zzdyuVar, zzczl zzczlVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcyxVar;
        this.zzf = zzfluVar;
        this.zzg = zzfkmVar;
        this.zzi = zzdyuVar;
        this.zzj = zzczlVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        Bundle bundle = new Bundle();
        zzdyu zzdyuVar = this.zzi;
        Map mapZzc = zzdyuVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue()) {
            zzdyuVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdyuVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza) ? "1" : "0");
        }
        zzcyx zzcyxVar = this.zze;
        zzfkm zzfkmVar = this.zzg;
        zzcyxVar.zzi(zzfkmVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzhbi.zza(new zzevp(this.zza, bundle, str, this.zzc, this.zzh, zzfkmVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 12;
    }
}
