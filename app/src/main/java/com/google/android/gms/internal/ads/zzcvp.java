package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcvp implements zzimi {
    private final zzcvg zza;
    private final zzimr zzb;
    private final zzimr zzc;
    private final zzimr zzd;
    private final zzimr zze;

    private zzcvp(zzcvg zzcvgVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        this.zza = zzcvgVar;
        this.zzb = zzimrVar;
        this.zzc = zzimrVar2;
        this.zzd = zzimrVar3;
        this.zze = zzimrVar4;
    }

    public static zzcvp zza(zzcvg zzcvgVar, zzimr zzimrVar, zzimr zzimrVar2, zzimr zzimrVar3, zzimr zzimrVar4) {
        return new zzcvp(zzcvgVar, zzimrVar, zzimrVar2, zzimrVar3, zzimrVar4);
    }

    public static zzdke zzc(zzcvg zzcvgVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfjt zzfjtVar, final zzfkm zzfkmVar) {
        return new zzdke(new zzddt() { // from class: com.google.android.gms.internal.ads.zzcvf
            @Override // com.google.android.gms.internal.ads.zzddt
            public final /* synthetic */ void zzg() {
                zzfkm zzfkmVar2 = zzfkmVar;
                JSONObject jSONObject = zzfjtVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfkmVar2.zzg);
            }
        }, zzcff.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzimx, com.google.android.gms.internal.ads.zzimw
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcnw) this.zzc).zza(), ((zzcxy) this.zzd).zza(), ((zzdbw) this.zze).zza());
    }
}
