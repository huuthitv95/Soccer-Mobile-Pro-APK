package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzefo extends zzcah {
    final /* synthetic */ zzefq zza;

    protected zzefo(zzefq zzefqVar) {
        Objects.requireNonNull(zzefqVar);
        this.zza = zzefqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzefq zzefqVar = this.zza;
        zzefqVar.zza.zzc(new zzegg(autoCloseInputStream, zzefqVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcai
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcar zzcarVar) {
        this.zza.zza.zzc(new zzegg(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcarVar));
    }
}
