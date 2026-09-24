package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfxa {
    private final Context zza;
    private final Looper zzb;

    public zzfxa(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfxk zzfxkVarZza = zzfxm.zza();
        Context context = this.zza;
        zzfxkVarZza.zza(context.getPackageName());
        zzfxkVarZza.zzc(2);
        zzfxi zzfxiVarZza = zzfxj.zza();
        zzfxiVarZza.zza(str);
        zzfxiVarZza.zzb(2);
        zzfxkVarZza.zzb(zzfxiVarZza);
        new zzfxb(context, this.zzb, (zzfxm) zzfxkVarZza.zzbu()).zza();
    }
}
