package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqh {
    private final Context zza;
    private final zzqg zzb;
    private final Handler zzc;
    private final zzqd zzd;
    private final BroadcastReceiver zze;
    private final zzqe zzf;
    private zzace zzg;
    private zzqb zzh;
    private AudioDeviceInfo zzi;
    private zzd zzj;
    private boolean zzk;

    /* JADX WARN: Multi-variable type inference failed */
    public zzqh(Context context, zzqg zzqgVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzqgVar;
        this.zzj = zzdVar;
        this.zzi = audioDeviceInfo;
        Handler handler = new Handler(zzfk.zzf(), null);
        this.zzc = handler;
        this.zzd = new zzqd(this, null);
        this.zze = new zzqf(this, 0 == true ? 1 : 0);
        Uri uriZzc = zzqb.zzc();
        this.zzf = uriZzc != null ? new zzqe(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final List zzg() {
        zzace zzaceVar;
        return (Build.VERSION.SDK_INT < 32 || (zzaceVar = this.zzg) == null) ? zzgvz.zzi() : zzaceVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzh(zzqb zzqbVar) {
        if (!this.zzk || zzqbVar.equals(this.zzh)) {
            return;
        }
        this.zzh = zzqbVar;
        this.zzb.zza(zzqbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzi() {
        zzh(zzqb.zza(this.zza, this.zzj, this.zzi, zzg()));
    }

    public final void zza(zzqb zzqbVar) {
        zzh(zzqbVar);
    }

    public final void zzb(zzd zzdVar) {
        if (Objects.equals(zzdVar, this.zzj)) {
            return;
        }
        this.zzj = zzdVar;
        zzh(zzqb.zza(this.zza, zzdVar, this.zzi, zzg()));
    }

    public final void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzi)) {
            return;
        }
        this.zzi = audioDeviceInfo;
        zzh(zzqb.zza(this.zza, this.zzj, audioDeviceInfo, zzg()));
    }

    public final void zze() {
        zzace zzaceVar;
        if (this.zzk) {
            this.zzh = null;
            Context context = this.zza;
            zzcj.zza(context).unregisterAudioDeviceCallback(this.zzd);
            if (Build.VERSION.SDK_INT >= 32 && (zzaceVar = this.zzg) != null) {
                zzaceVar.zzg();
                this.zzg = null;
            }
            context.unregisterReceiver(this.zze);
            zzqe zzqeVar = this.zzf;
            if (zzqeVar != null) {
                zzqeVar.zzb();
            }
            this.zzk = false;
        }
    }

    final /* synthetic */ AudioDeviceInfo zzj() {
        return this.zzi;
    }

    final /* synthetic */ void zzk(AudioDeviceInfo audioDeviceInfo) {
        this.zzi = null;
    }

    final /* synthetic */ zzd zzl() {
        return this.zzj;
    }

    public final zzqb zzd() {
        if (this.zzk) {
            zzqb zzqbVar = this.zzh;
            zzqbVar.getClass();
            return zzqbVar;
        }
        this.zzk = true;
        zzqe zzqeVar = this.zzf;
        if (zzqeVar != null) {
            zzqeVar.zza();
        }
        Context context = this.zza;
        zzqd zzqdVar = this.zzd;
        Handler handler = this.zzc;
        zzcj.zza(context).registerAudioDeviceCallback(zzqdVar, handler);
        if (Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzace(context, new Runnable() { // from class: com.google.android.gms.internal.ads.zzqc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf();
                }
            }, Boolean.valueOf(zzfk.zzO(context)));
        }
        zzqb zzqbVarZzb = zzqb.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzj, this.zzi, zzg());
        this.zzh = zzqbVarZzb;
        return zzqbVarZzb;
    }
}
