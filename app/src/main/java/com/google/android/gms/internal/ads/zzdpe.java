package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpe {
    private zzblp zza;

    public zzdpe(zzdop zzdopVar) {
        this.zza = zzdopVar;
    }

    public final synchronized zzblp zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzblp zzblpVar) {
        this.zza = zzblpVar;
    }
}
