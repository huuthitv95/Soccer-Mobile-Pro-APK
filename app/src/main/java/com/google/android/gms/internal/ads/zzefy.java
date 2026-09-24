package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzefy implements zzdfl {
    private final Context zza;
    private final zzcdn zzb;

    zzefy(Context context, zzcdn zzcdnVar) {
        this.zza = context;
        this.zzb = zzcdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
        String str = zzfkeVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcdn zzcdnVar = this.zzb;
        Context context = this.zza;
        zzcdnVar.zzc(context, zzfkeVar.zza.zza.zzd);
        zzcdnVar.zzm(context, str);
    }
}
