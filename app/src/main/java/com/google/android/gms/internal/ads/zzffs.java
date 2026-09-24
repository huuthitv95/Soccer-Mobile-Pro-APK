package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzffs implements zzdci, zzdee, zzfhh, com.google.android.gms.ads.internal.overlay.zzr, zzdew, zzdcv, zzdkm {
    private final zzflx zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzffs zzi = null;

    public zzffs(zzflx zzflxVar) {
        this.zza = zzflxVar;
    }

    public static zzffs zzn(zzffs zzffsVar) {
        zzffs zzffsVar2 = new zzffs(zzffsVar.zza);
        zzffsVar2.zzi = zzffsVar;
        return zzffsVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzdT();
        } else {
            zzfgz.zza(this.zzf, zzffd.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(final int i) {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzdU(i);
        } else {
            zzfgz.zza(this.zzf, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffj
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdU(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzdu();
        } else {
            zzfgz.zza(this.zzd, zzffp.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzdv();
        } else {
            zzfgz.zza(this.zzf, zzffe.zza);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzh();
            return;
        }
        zzfgz.zza(this.zzf, zzfff.zza);
        AtomicReference atomicReference = this.zzd;
        zzfgz.zza(atomicReference, zzffn.zza);
        zzfgz.zza(atomicReference, zzffo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzj(zzeVar);
        } else {
            zzfgz.zza(this.zzd, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffk
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbge) obj).zze(zzeVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzl() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzl();
        } else {
            zzfgz.zza(this.zze, zzffc.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzm(zztVar);
        } else {
            zzfgz.zza(this.zzg, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffl
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    public final void zzo(zzbga zzbgaVar) {
        this.zzb.set(zzbgaVar);
    }

    public final void zzp(zzbge zzbgeVar) {
        this.zzd.set(zzbgeVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.zzf.set(zzrVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzg.set(zzdqVar);
    }

    public final void zzs(zzfsk zzfskVar) {
        this.zzh.set(zzfskVar);
    }

    public final void zzu() {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzu();
            return;
        }
        this.zza.zzb();
        zzfgz.zza(this.zzc, zzffm.zza);
        zzfgz.zza(this.zzd, zzffq.zza);
        zzfgz.zza(this.zzh, zzffr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final void zzv(zzfhh zzfhhVar) {
        this.zzi = (zzffs) zzfhhVar;
    }

    public final void zzt(final zzbfx zzbfxVar) {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzt(zzbfxVar);
        } else {
            zzfgz.zza(this.zzb, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffg
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((zzbga) obj).zzb(zzbfxVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzffs zzffsVar = this.zzi;
        if (zzffsVar != null) {
            zzffsVar.zzdJ(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffh
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbga) obj).zzd(zzeVar);
            }
        });
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzffi
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzbga) obj).zzc(zzeVar.zza);
            }
        });
    }
}
