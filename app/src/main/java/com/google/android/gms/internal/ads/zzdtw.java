package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdtw extends zzbni {
    private final String zza;
    private final zzdpc zzb;
    private final zzdph zzc;
    private final zzdyz zzd;

    public zzdtw(String str, zzdpc zzdpcVar, zzdph zzdphVar, zzdyz zzdyzVar) {
        this.zza = str;
        this.zzb = zzdpcVar;
        this.zzc = zzdphVar;
        this.zzd = zzdyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzA() throws RemoteException {
        zzdph zzdphVar = this.zzc;
        return (zzdphVar.zzE().isEmpty() || zzdphVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        this.zzb.zzA(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        this.zzb.zzB(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzblp zzF() throws RemoteException {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhI)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        try {
            if (!zzdqVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzJ(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzov)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final long zzK() {
        zzdpc zzdpcVar = this.zzb;
        if (zzdpcVar == null || zzdpcVar.zzo() == null) {
            return 0L;
        }
        return zzdpcVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzL(long j) {
        zzdpc zzdpcVar = this.zzb;
        if (zzdpcVar == null || zzdpcVar.zzo() == null) {
            return;
        }
        zzdpcVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zze() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final List zzf() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzg() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbls zzh() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzi() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzj() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final double zzk() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzl() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzm() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzo() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzp() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbll zzq() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzt(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zzu() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zzv() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final Bundle zzw() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzx(zzbng zzbngVar) throws RemoteException {
        this.zzb.zzy(zzbngVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzy() throws RemoteException {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final List zzz() throws RemoteException {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
