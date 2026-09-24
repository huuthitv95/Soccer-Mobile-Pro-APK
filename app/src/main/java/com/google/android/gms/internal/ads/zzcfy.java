package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfy implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcgf zzc;

    zzcfy(zzcgf zzcgfVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcgfVar);
        this.zzc = zzcgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgf zzcgfVar = this.zzc;
        if (zzcgfVar.zzt() != null) {
            zzcgfVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
