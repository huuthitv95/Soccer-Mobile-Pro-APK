package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdie {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfhh zzo;

    final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    final /* synthetic */ zzfhh zzC() {
        return this.zzo;
    }

    public final zzdie zza(zzdcf zzdcfVar, Executor executor) {
        this.zze.add(new zzdke(zzdcfVar, executor));
        return this;
    }

    public final zzdie zzb(zzddt zzddtVar, Executor executor) {
        this.zzh.add(new zzdke(zzddtVar, executor));
        return this;
    }

    public final zzdie zzc(zzdci zzdciVar, Executor executor) {
        this.zzi.add(new zzdke(zzdciVar, executor));
        return this;
    }

    public final zzdie zzd(zzdcv zzdcvVar, Executor executor) {
        this.zzl.add(new zzdke(zzdcvVar, executor));
        return this;
    }

    public final zzdie zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdke(appEventListener, executor));
        return this;
    }

    public final zzdie zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdke(zzaVar, executor));
        return this;
    }

    public final zzdie zzg(zzdkm zzdkmVar, Executor executor) {
        this.zzd.add(new zzdke(zzdkmVar, executor));
        return this;
    }

    public final zzdie zzh(zzdcz zzdczVar, Executor executor) {
        this.zzf.add(new zzdke(zzdczVar, executor));
        return this;
    }

    public final zzdie zzi(zzdee zzdeeVar, Executor executor) {
        this.zzg.add(new zzdke(zzdeeVar, executor));
        return this;
    }

    public final zzdie zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdke(zzrVar, executor));
        return this;
    }

    public final zzdie zzk(zzdew zzdewVar, Executor executor) {
        this.zzm.add(new zzdke(zzdewVar, executor));
        return this;
    }

    public final zzdie zzl(zzfhh zzfhhVar) {
        this.zzo = zzfhhVar;
        return this;
    }

    public final zzdie zzm(zzdfl zzdflVar, Executor executor) {
        this.zzb.add(new zzdke(zzdflVar, executor));
        return this;
    }

    public final zzdif zzn() {
        return new zzdif(this, null);
    }

    final /* synthetic */ Set zzo() {
        return this.zza;
    }

    final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    final /* synthetic */ Set zzs() {
        return this.zze;
    }

    final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    final /* synthetic */ Set zzz() {
        return this.zzl;
    }
}
