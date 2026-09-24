package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgpx extends zzbds implements zzgpz {
    zzgpx(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zze(String str, Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbdu.zzc(parcelZza, bundle);
        zzbdu.zze(parcelZza, zzgqbVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zzf(Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, bundle);
        zzbdu.zze(parcelZza, zzgqbVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzgpz
    public final void zzg(Bundle bundle, zzgqb zzgqbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbdu.zzc(parcelZza, bundle);
        zzbdu.zze(parcelZza, zzgqbVar);
        zzdb(3, parcelZza);
    }
}
