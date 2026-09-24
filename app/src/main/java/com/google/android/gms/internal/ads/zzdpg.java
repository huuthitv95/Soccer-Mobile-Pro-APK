package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdpg extends com.google.android.gms.ads.internal.client.zzdz {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzea zzb;

    @Nullable
    private final zzbvf zzc;

    public zzdpg(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, @Nullable zzbvf zzbvfVar) {
        this.zzb = zzeaVar;
        this.zzc = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() throws RemoteException {
        zzbvf zzbvfVar = this.zzc;
        if (zzbvfVar != null) {
            return zzbvfVar.zzA();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() throws RemoteException {
        zzbvf zzbvfVar = this.zzc;
        if (zzbvfVar != null) {
            return zzbvfVar.zzB();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(@Nullable com.google.android.gms.ads.internal.client.zzed zzedVar) throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar != null) {
                zzeaVar.zzl(zzedVar);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzed zzo() throws RemoteException {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzea zzeaVar = this.zzb;
            if (zzeaVar == null) {
                return null;
            }
            return zzeaVar.zzo();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
