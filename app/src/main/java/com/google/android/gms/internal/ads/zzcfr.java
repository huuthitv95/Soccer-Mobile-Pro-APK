package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class zzcfr {
    private final zzcfk zza;
    private final AtomicInteger zzb;

    public zzcfr() {
        zzcfk zzcfkVar = new zzcfk();
        this.zza = zzcfkVar;
        this.zzb = new AtomicInteger(0);
        zzhbi.zzr(zzcfkVar, new zzcfp(this), zzcff.zzh);
    }

    @Deprecated
    public final void zze(zzcfo zzcfoVar, zzcfm zzcfmVar) {
        zzhbi.zzr(this.zza, new zzcfq(this, zzcfoVar, zzcfmVar), zzcff.zzh);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zziF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
