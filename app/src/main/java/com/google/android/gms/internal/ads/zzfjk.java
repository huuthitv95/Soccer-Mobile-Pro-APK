package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfjk extends zzcbv {
    private final zzfjg zza;
    private final zzfix zzb;
    private final String zzc;
    private final zzfkf zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzbai zzg;
    private final zzdyz zzh;
    private zzdva zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbp)).booleanValue();

    public zzfjk(String str, zzfjg zzfjgVar, Context context, zzfix zzfixVar, zzfkf zzfkfVar, VersionInfoParcel versionInfoParcel, zzbai zzbaiVar, zzdyz zzdyzVar) {
        this.zzc = str;
        this.zza = zzfjgVar;
        this.zzb = zzfixVar;
        this.zzd = zzfkfVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzbaiVar;
        this.zzh = zzdyzVar;
    }

    private final synchronized void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar, int i) throws RemoteException {
        if (!zzmVar.zzb()) {
            boolean z = false;
            if (((Boolean) zzbkc.zzk.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmB)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmC)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        zzfix zzfixVar = this.zzb;
        zzfixVar.zzh(zzccdVar);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zze) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzfixVar.zzdJ(zzflo.zzd(4, null, null));
        } else {
            if (this.zzi != null) {
                return;
            }
            zzfiz zzfizVar = new zzfiz(null);
            zzfjg zzfjgVar = this.zza;
            zzfjgVar.zzj(i);
            zzfjgVar.zza(zzmVar, this.zzc, zzfizVar, new zzfjj(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        zzy(zzmVar, zzccdVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccd zzccdVar) throws RemoteException {
        zzy(zzmVar, zzccdVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zze(zzcbz zzcbzVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        if (zzdnVar == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfji(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdva zzdvaVar = this.zzi;
        return zzdvaVar != null ? zzdvaVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzh(zzcck zzcckVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfkf zzfkfVar = this.zzd;
        zzfkfVar.zza = zzcckVar.zza;
        zzfkfVar.zzb = zzcckVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdva zzdvaVar = this.zzi;
        return (zzdvaVar == null || zzdvaVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized String zzj() throws RemoteException {
        zzdva zzdvaVar = this.zzi;
        if (zzdvaVar == null || zzdvaVar.zzn() == null) {
            return null;
        }
        return zzdvaVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzflo.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdG)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final zzcbt zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdva zzdvaVar = this.zzi;
        if (zzdvaVar != null) {
            return zzdvaVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final com.google.android.gms.ads.internal.client.zzdx zzm() {
        zzdva zzdvaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhI)).booleanValue() && (zzdvaVar = this.zzi) != null) {
            return zzdvaVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzp(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized long zzq() {
        zzdva zzdvaVar = this.zzi;
        if (zzdvaVar == null || zzdvaVar.zzo() == null) {
            return 0L;
        }
        return zzdvaVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final synchronized void zzr(long j) {
        zzdva zzdvaVar = this.zzi;
        if (zzdvaVar == null || zzdvaVar.zzo() == null) {
            return;
        }
        zzdvaVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzs(zzcce zzcceVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzp(zzcceVar);
    }

    public final void zzu(zzfsk zzfskVar) {
        this.zzb.zzo(zzfskVar);
    }

    final /* synthetic */ zzfkf zzv() {
        return this.zzd;
    }

    final /* synthetic */ zzdva zzw() {
        return this.zzi;
    }

    final /* synthetic */ void zzx(zzdva zzdvaVar) {
        this.zzi = zzdvaVar;
    }
}
