package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfix implements OnAdMetadataChangedListener, zzddt, zzdci, zzdcf, zzdcv, zzdew, zzfhh, zzdkm {
    private final zzflx zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private final AtomicReference zzi = new AtomicReference();
    private zzfix zzj = null;

    public zzfix(zzflx zzflxVar) {
        this.zza = zzflxVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.onAdMetadataChanged();
        } else {
            zzfgz.zza(this.zzb, zzfiw.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzds();
            return;
        }
        this.zza.zzb();
        zzfgz.zza(this.zzd, zzfil.zza);
        zzfgz.zza(this.zze, zzfiq.zza);
        zzfgz.zza(this.zzi, zzfiv.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzdu();
        } else {
            zzfgz.zza(this.zzd, zzfim.zza);
        }
    }

    public final void zzh(zzccd zzccdVar) {
        this.zzc.set(zzccdVar);
    }

    public final void zzi(zzcbz zzcbzVar) {
        this.zzd.set(zzcbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzj(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfig
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbz) obj).zzi(zzeVar);
            }
        });
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfih
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbz) obj).zzh(zzeVar.zza);
            }
        });
    }

    public final void zzk(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzb.set(onAdMetadataChangedListener);
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzh.set(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzm(zztVar);
        } else {
            zzfgz.zza(this.zzh, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfii
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzcbj zzcbjVar) {
        this.zze.set(zzcbjVar);
    }

    public final void zzo(zzfsk zzfskVar) {
        this.zzi.set(zzfskVar);
    }

    public final void zzp(zzcce zzcceVar) {
        this.zzf.set(zzcceVar);
    }

    @Deprecated
    public final void zzq(zzcbe zzcbeVar) {
        this.zzg.set(zzcbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhh
    public final void zzv(zzfhh zzfhhVar) {
        this.zzj = (zzfix) zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzdK();
        } else {
            zzfgz.zza(this.zze, zzfir.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zze();
        } else {
            zzfgz.zza(this.zze, zzfis.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzf();
        } else {
            zzfgz.zza(this.zze, zzfit.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzg() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzg();
        } else {
            zzfgz.zza(this.zzc, zzfio.zza);
            zzfgz.zza(this.zze, zzfiu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzdt();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzfgz.zza(atomicReference, zzfin.zza);
        zzfgz.zza(this.zze, zzfip.zza);
        zzfgz.zza(atomicReference, zzfik.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(final zzcbd zzcbdVar, final String str, final String str2) {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzd(zzcbdVar, str, str2);
            return;
        }
        zzfgz.zza(this.zzd, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfic
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcbd zzcbdVar2 = zzcbdVar;
                ((zzcbz) obj).zzg(new zzccn(zzcbdVar2.zzb(), zzcbdVar2.zzc()));
            }
        });
        zzfgz.zza(this.zzf, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                zzcbd zzcbdVar2 = zzcbdVar;
                ((zzcce) obj).zze(new zzccn(zzcbdVar2.zzb(), zzcbdVar2.zzc()), str, str2);
            }
        });
        zzfgz.zza(this.zze, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfie
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbj) obj).zzi(zzcbdVar);
            }
        });
        zzfgz.zza(this.zzg, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfif
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbe) obj).zze(zzcbdVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfix zzfixVar = this.zzj;
        if (zzfixVar != null) {
            zzfixVar.zzdJ(zzeVar);
            return;
        }
        final int i = zzeVar.zza;
        AtomicReference atomicReference = this.zzc;
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfij
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccd) obj).zzg(zzeVar);
            }
        });
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfia
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzccd) obj).zzf(i);
            }
        });
        zzfgz.zza(this.zze, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzfib
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((zzcbj) obj).zzk(i);
            }
        });
    }
}
