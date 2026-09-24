package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdul {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdyz zzd;
    private final Executor zze;
    private final zzbai zzf;
    private final VersionInfoParcel zzg;
    private final zzeju zzi;
    private final zzfro zzj;
    private final zzekf zzk;
    private final zzfkq zzl;
    private ListenableFuture zzm;
    private final zzdtz zza = new zzdtz();
    private final zzbpv zzh = new zzbpv();

    zzdul(zzduj zzdujVar) {
        this.zzc = zzdujVar.zzb();
        this.zze = zzdujVar.zze();
        this.zzf = zzdujVar.zzf();
        this.zzg = zzdujVar.zzg();
        this.zzb = zzdujVar.zza();
        this.zzi = zzdujVar.zzd();
        this.zzj = zzdujVar.zzh();
        this.zzd = zzdujVar.zzc();
        this.zzk = zzdujVar.zzi();
        this.zzl = zzdujVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeF);
        zzbai zzbaiVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzekf zzekfVar = this.zzk;
        ListenableFuture listenableFutureZzk = zzhbi.zzk(zzcky.zzb(this.zzc, this.zzg, str, zzbaiVar, zzaVar, zzekfVar, this.zzl, this.zzd), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdui
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzcki zzckiVar = (zzcki) obj;
                this.zza.zzi(zzckiVar);
                return zzckiVar;
            }
        }, this.zze);
        this.zzm = listenableFutureZzk;
        zzcfi.zza(listenableFutureZzk, "NativeJavascriptExecutor.initializeEngine", zzcff.zzh);
    }

    public final synchronized void zzb() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhbi.zzr(listenableFuture, new zzdua(this), this.zze);
        this.zzm = null;
    }

    public final synchronized ListenableFuture zzc(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzhbi.zza(null);
        }
        return zzhbi.zzj(listenableFuture, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzduh
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcki) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbpe zzbpeVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhbi.zzr(listenableFuture, new zzdub(this, str, zzbpeVar), this.zze);
    }

    public final synchronized void zze(String str, zzbpe zzbpeVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhbi.zzr(listenableFuture, new zzduc(this, str, zzbpeVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhbi.zzr(listenableFuture, new zzdud(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfjt zzfjtVar, zzfjw zzfjwVar, zzcsx zzcsxVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzhbi.zzr(listenableFuture, new zzdue(this, zzfjtVar, zzfjwVar, zzcsxVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbpe zzbpeVar) {
        zzd(str, new zzduk(this, weakReference, str, zzbpeVar, null));
    }

    final /* synthetic */ zzcki zzi(zzcki zzckiVar) {
        zzckiVar.zzab("/result", this.zzh);
        zzcmg zzcmgVarZzP = zzckiVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzeju zzejuVar = this.zzi;
        zzfro zzfroVar = this.zzj;
        zzdyz zzdyzVar = this.zzd;
        zzdtz zzdtzVar = this.zza;
        zzcmgVarZzP.zzab(null, zzdtzVar, zzdtzVar, zzdtzVar, zzdtzVar, false, null, zzbVar, null, null, zzejuVar, zzfroVar, zzdyzVar, null, null, null, null, null, null, null, null, null);
        return zzckiVar;
    }

    final /* synthetic */ ListenableFuture zzj(String str, JSONObject jSONObject, zzcki zzckiVar) {
        return this.zzh.zzc(zzckiVar, str, jSONObject);
    }

    final /* synthetic */ zzdtz zzk() {
        return this.zza;
    }

    final /* synthetic */ zzdyz zzl() {
        return this.zzd;
    }

    final /* synthetic */ zzeju zzm() {
        return this.zzi;
    }

    final /* synthetic */ zzfro zzn() {
        return this.zzj;
    }
}
