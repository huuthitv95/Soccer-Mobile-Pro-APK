package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
@ParametersAreNonnullByDefault
public final class zzcky {
    public static final zzcki zza(final Context context, final zzcms zzcmsVar, final String str, final boolean z, final boolean z2, final zzbai zzbaiVar, final zzbjl zzbjlVar, final VersionInfoParcel versionInfoParcel, zzbit zzbitVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbhd zzbhdVar, final zzfjt zzfjtVar, final zzfjw zzfjwVar, final zzekf zzekfVar, final zzfkq zzfkqVar, final zzdyz zzdyzVar) throws zzckx {
        zzbie.zza(context);
        try {
            final zzbit zzbitVar2 = null;
            zzgto zzgtoVar = new zzgto(context, zzcmsVar, str, z, z2, zzbaiVar, zzbjlVar, versionInfoParcel, zzbitVar2, zznVar, zzaVar, zzbhdVar, zzfjtVar, zzfjwVar, zzfkqVar, zzdyzVar, zzekfVar) { // from class: com.google.android.gms.internal.ads.zzcku
                private final /* synthetic */ Context zza;
                private final /* synthetic */ zzcms zzb;
                private final /* synthetic */ String zzc;
                private final /* synthetic */ boolean zzd;
                private final /* synthetic */ boolean zze;
                private final /* synthetic */ zzbai zzf;
                private final /* synthetic */ zzbjl zzg;
                private final /* synthetic */ VersionInfoParcel zzh;
                private final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                private final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                private final /* synthetic */ zzbhd zzk;
                private final /* synthetic */ zzfjt zzl;
                private final /* synthetic */ zzfjw zzm;
                private final /* synthetic */ zzfkq zzn;
                private final /* synthetic */ zzdyz zzo;
                private final /* synthetic */ zzekf zzp;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbhdVar;
                    this.zzl = zzfjtVar;
                    this.zzm = zzfjwVar;
                    this.zzn = zzfkqVar;
                    this.zzo = zzdyzVar;
                    this.zzp = zzekfVar;
                }

                @Override // com.google.android.gms.internal.ads.zzgto
                public final /* synthetic */ Object zza() {
                    zzcms zzcmsVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzekf zzekfVar2 = this.zzp;
                    zzdyz zzdyzVar2 = this.zzo;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzbhd zzbhdVar2 = this.zzk;
                    zzfjt zzfjtVar2 = this.zzl;
                    zzfjw zzfjwVar2 = this.zzm;
                    zzfkq zzfkqVar2 = this.zzn;
                    zzbai zzbaiVar2 = this.zzf;
                    zzbjl zzbjlVar2 = this.zzg;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    Context context2 = this.zza;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcll.zza;
                        zzcle zzcleVar = new zzcle(new zzcll(new zzcmk(context2), zzcmsVar2, str2, z3, z4, zzbaiVar2, zzbjlVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbhdVar2, zzfjtVar2, zzfjwVar2, zzfkqVar2), zzdyzVar2);
                        zzcleVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zzf().zzb(zzcleVar, zzbhdVar2, z4, zzekfVar2));
                        zzcleVar.setWebChromeClient(new zzckh(zzcleVar));
                        return zzcleVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzcki) zzgtoVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzckx("Webview initialization failed.", th);
        }
    }

    public static final ListenableFuture zzb(final Context context, final VersionInfoParcel versionInfoParcel, final String str, final zzbai zzbaiVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzekf zzekfVar, final zzfkq zzfkqVar, final zzdyz zzdyzVar) {
        return zzhbi.zzf(new zzhap() { // from class: com.google.android.gms.internal.ads.zzckw
            @Override // com.google.android.gms.internal.ads.zzhap
            public final /* synthetic */ ListenableFuture zza() throws zzckx {
                com.google.android.gms.ads.internal.zzt.zzd();
                Context context2 = context;
                zzcms zzcmsVarZzb = zzcms.zzb();
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzbhd zzbhdVarZza = zzbhd.zza();
                zzekf zzekfVar2 = zzekfVar;
                zzfkq zzfkqVar2 = zzfkqVar;
                zzdyz zzdyzVar2 = zzdyzVar;
                zzcki zzckiVarZza = zzcky.zza(context2, zzcmsVarZzb, "", false, false, zzbaiVar, null, versionInfoParcel, null, null, zzaVar2, zzbhdVarZza, null, null, zzekfVar2, zzfkqVar2, zzdyzVar2);
                final zzcfj zzcfjVarZza = zzcfj.zza(zzckiVarZza);
                zzckiVarZza.zzP().zzG(new zzcme() { // from class: com.google.android.gms.internal.ads.zzckv
                    @Override // com.google.android.gms.internal.ads.zzcme
                    public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                        zzcfjVarZza.zzb();
                    }
                });
                zzckiVarZza.loadUrl(str);
                return zzcfjVarZza;
            }
        }, zzcff.zzf);
    }
}
