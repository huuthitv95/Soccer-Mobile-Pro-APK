package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefp extends zzcah {
    private final zzcfk zza;
    private final zzcar zzb;

    zzefp(zzcfk zzcfkVar, zzcar zzcarVar) {
        this.zza = zzcfkVar;
        this.zzb = zzcarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzegg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) {
        this.zza.zzc(new zzegg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcarVar));
    }
}
