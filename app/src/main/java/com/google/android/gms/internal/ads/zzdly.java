package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdly implements zzimi {
    private final zzimr zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;

    private zzdly(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzimrVar;
        this.zzb = zzimrVar2;
        this.zzc = zzimrVar3;
        this.zzd = zzimrVar4;
    }

    public static zzdly zza(zzdlr zzdlrVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzdly(zzdlrVar, zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcnw) this.zzb).zza();
        final zzfjt zzfjtVarZza = ((zzcxy) this.zzc).zza();
        final zzfkm zzfkmVarZza = ((zzdbw) this.zzd).zza();
        return new zzdke(new zzddt() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzg() {
                zzfkm zzfkmVar = zzfkmVarZza;
                JSONObject jSONObject = zzfjtVarZza.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcelZza.afmaVersion, jSONObject.toString(), zzfkmVar.zzg);
            }
        }, zzcff.zzh);
    }
}
