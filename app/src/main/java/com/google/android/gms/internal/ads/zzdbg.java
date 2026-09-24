package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdbg implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfke zzc;
    private final zzfjt zzd;
    private final Clock zze;
    private final zzdyz zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfqo zza = zzfqp.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    zzdbg(zzfke zzfkeVar, zzfjt zzfjtVar, Clock clock, zzdyz zzdyzVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfkeVar;
        this.zzd = zzfjtVar;
        this.zze = clock;
        this.zzf = zzdyzVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            zzdyz zzdyzVar = this.zzf;
            String str = this.zzc.zzb.zzb.zzb;
            String strEncodeToString = Base64.encodeToString(((zzfqp) this.zza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzoo)).booleanValue()) {
                zzdyy zzdyyVarZza = zzdyzVar.zza();
                zzdyyVarZza.zzc("action", "pclma");
                zzdyyVarZza.zzc("pclmd", strEncodeToString);
                zzdyyVarZza.zzc("gqi", str);
                zzdyyVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzo(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final void zzl() {
        synchronized (this.zzb) {
            int i = this.zzd.zzaE;
            if (i > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, i, TimeUnit.MILLISECONDS);
            }
        }
    }

    final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            if (this.zzi) {
                return;
            }
            this.zzi = true;
            zzn();
        }
    }

    private final void zzo(int i) {
        synchronized (this.zzb) {
            if (!this.zzi && this.zzh) {
                zzfqo zzfqoVar = this.zza;
                zzfpg zzfpgVarZza = zzfph.zza();
                zzfpgVarZza.zzb(i);
                zzfpgVarZza.zza(this.zze.currentTimeMillis());
                zzfqoVar.zza((zzfph) zzfpgVarZza.zzbu());
                if (i == 10) {
                    zzn();
                    this.zzi = true;
                }
            }
        }
    }
}
