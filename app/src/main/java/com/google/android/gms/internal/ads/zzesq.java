package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzesq implements AppEventListener, zzdfl, zzddt, zzdci, zzdcz, com.google.android.gms.ads.internal.client.zza, zzdcf, zzdew, zzdcv, zzdkm {
    final zzdyz zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicReference zzk = new AtomicReference();
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkj)).intValue());

    public zzesq(zzdyz zzdyzVar) {
        this.zza = zzdyzVar;
    }

    private final void zzs() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue<Pair> blockingQueue = this.zzb;
            for (final Pair pair : blockingQueue) {
                zzfgz.zza(this.zzd, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzesa
                    @Override // com.google.android.gms.internal.ads.zzfgy
                    public final /* synthetic */ void zza(Object obj) throws RemoteException {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
            return;
        }
        zzfgz.zza(this.zzc, zzesf.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.zzh.get()) {
            zzfgz.zza(this.zzd, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzery
                @Override // com.google.android.gms.internal.ads.zzfgy
                public final /* synthetic */ void zza(Object obj) throws RemoteException {
                    ((com.google.android.gms.ads.internal.client.zzcl) obj).zzb(str, str2);
                }
            });
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The queue for app events is full, dropping the new event.");
            zzdyz zzdyzVar = this.zza;
            if (zzdyzVar != null) {
                zzdyy zzdyyVarZza = zzdyzVar.zza();
                zzdyyVarZza.zzc("action", "dae_action");
                zzdyyVarZza.zzc("dae_name", str);
                zzdyyVarZza.zzc("dae_data", str2);
                zzdyyVarZza.zzd();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzd(zzcbd zzcbdVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzdJ(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgy zzfgyVar = new zzfgy() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzd(zzeVar);
            }
        };
        AtomicReference atomicReference = this.zzc;
        zzfgz.zza(atomicReference, zzfgyVar);
        zzfgz.zza(atomicReference, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzerv
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbh) obj).zzc(zzeVar.zza);
            }
        });
        zzfgz.zza(this.zzf, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzerw
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzbk) obj).zzc(zzeVar);
            }
        });
        this.zzh.set(false);
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdK() {
        zzfgz.zza(this.zzc, zzesc.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdP(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfl
    public final void zzdQ(zzfke zzfkeVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdR() {
        zzfgz.zza(this.zzc, zzesg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdr() {
        zzfgz.zza(this.zzc, zzesi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzds() {
        zzfgz.zza(this.zzc, zzesj.zza);
        zzfgz.zza(this.zzg, zzeso.zza);
        zzfgz.zza(this.zzk, zzesp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzdt() {
        zzfgz.zza(this.zzc, zzese.zza);
        AtomicReference atomicReference = this.zzg;
        zzfgz.zza(atomicReference, zzesl.zza);
        zzfgz.zza(atomicReference, zzesm.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdkm
    public final void zzdu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzmf)).booleanValue()) {
            zzfgz.zza(this.zzc, zzesh.zza);
        }
        zzfgz.zza(this.zzg, zzesn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzg() {
        zzfgz.zza(this.zzc, zzesd.zza);
        zzfgz.zza(this.zzf, zzesk.zza);
        this.zzj.set(true);
        zzs();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbh zzi() {
        return (com.google.android.gms.ads.internal.client.zzbh) this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfgz.zza(this.zzg, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzerz
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzcs) obj).zzb(zzeVar);
            }
        });
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzcl zzk() {
        return (com.google.android.gms.ads.internal.client.zzcl) this.zzd.get();
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzc.set(zzbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzfgz.zza(this.zze, new zzfgy() { // from class: com.google.android.gms.internal.ads.zzerx
            @Override // com.google.android.gms.internal.ads.zzfgy
            public final /* synthetic */ void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdq) obj).zze(zztVar);
            }
        });
    }

    public final void zzn(zzfsk zzfskVar) {
        this.zzk.set(zzfskVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzd.set(zzclVar);
        this.zzi.set(true);
        zzs();
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zze.set(zzdqVar);
    }

    public final void zzq(com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.set(zzbkVar);
    }

    public final void zzr(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzg.set(zzcsVar);
    }
}
