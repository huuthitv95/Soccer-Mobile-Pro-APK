package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbvu extends zzbuv {
    private final Adapter zza;
    private final zzcbo zzb;

    zzbvu(Adapter adapter, zzcbo zzcboVar) {
        this.zza = adapter;
        this.zzb = zzcboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zze() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzl(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzf() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzg(int i) throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzm(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzi() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzh(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzj() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzg(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzk() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzl(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzm(zzbmj zzbmjVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzo() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzp(zzcbp zzcbpVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzq() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzr(zzcbt zzcbtVar) throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzk(ObjectWrapper.wrap(this.zza), new zzcbp(zzcbtVar.zze(), zzcbtVar.zzf()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzs(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzt() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzu() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzw(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbuw
    public final void zzz() throws RemoteException {
        zzcbo zzcboVar = this.zzb;
        if (zzcboVar != null) {
            zzcboVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }
}
