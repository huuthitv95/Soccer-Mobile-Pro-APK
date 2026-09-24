package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzctu implements zzbee, zzdda, com.google.android.gms.ads.internal.overlay.zzr, zzdcz {
    private final zzctp zza;
    private final zzctq zzb;
    private final zzbui zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzctt zzh = new zzctt();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzctu(zzbuf zzbufVar, zzctq zzctqVar, Executor executor, zzctp zzctpVar, Clock clock) {
        this.zza = zzctpVar;
        zzbtq zzbtqVar = zzbtt.zza;
        this.zzd = zzbufVar.zza("google.afma.activeView.handleUpdate", zzbtqVar, zzbtqVar);
        this.zzb = zzctqVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcki) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbee
    public final synchronized void zzdj(zzbed zzbedVar) {
        zzctt zzcttVar = this.zzh;
        zzcttVar.zza = zzbedVar.zzj;
        zzcttVar.zzf = zzbedVar;
        zzl();
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

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    public final synchronized void zzl() {
        if (this.zzj.get() == null) {
            zzm();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            zzctt zzcttVar = this.zzh;
            zzcttVar.zzd = this.zzf.elapsedRealtime();
            final JSONObject jSONObjectZza = this.zzb.zzb(zzcttVar);
            for (final zzcki zzckiVar : this.zzc) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcts
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        JSONObject jSONObject = jSONObjectZza;
                        String string = jSONObject.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 31);
                        sb.append("Calling AFMA_updateActiveView(");
                        sb.append(string);
                        sb.append(")");
                        String string2 = sb.toString();
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(string2);
                        zzckiVar.zzb("AFMA_updateActiveView", jSONObject);
                    }
                });
            }
            zzcfi.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcki zzckiVar) {
        this.zzc.add(zzckiVar);
        this.zza.zzb(zzckiVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
