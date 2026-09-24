package com.google.android.gms.internal.ads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbbf implements zzfyk {
    private final zzfws zza;
    private final zzfxg zzb;
    private final zzbbs zzc;
    private final zzbbe zzd;
    private final zzbao zze;
    private final zzbbu zzf;
    private final zzbbm zzg;
    private final zzbbd zzh;

    zzbbf(zzfws zzfwsVar, zzfxg zzfxgVar, zzbbs zzbbsVar, zzbbe zzbbeVar, zzbao zzbaoVar, zzbbu zzbbuVar, zzbbm zzbbmVar, zzbbd zzbbdVar) {
        this.zza = zzfwsVar;
        this.zzb = zzfxgVar;
        this.zzc = zzbbsVar;
        this.zzd = zzbbeVar;
        this.zze = zzbaoVar;
        this.zzf = zzbbuVar;
        this.zzg = zzbbmVar;
        this.zzh = zzbbdVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfws zzfwsVar = this.zza;
        zzayf zzayfVarZzb = this.zzb.zzb();
        map.put("v", zzfwsVar.zza());
        map.put("gms", Boolean.valueOf(zzfwsVar.zzc()));
        map.put("gv", Long.valueOf(zzayfVarZzb.zzd()));
        map.put("int", zzayfVarZzb.zzb());
        map.put("attts", Long.valueOf(zzayfVarZzb.zzh().zzb()));
        map.put("att", zzayfVarZzb.zzh().zzd());
        map.put("attkid", zzayfVarZzb.zzh().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzbbm zzbbmVar = this.zzg;
        map.put("tcq", Long.valueOf(zzbbmVar.zze()));
        map.put("tpq", Long.valueOf(zzbbmVar.zzd()));
        map.put("tcv", Long.valueOf(zzbbmVar.zzf()));
        map.put("tpv", Long.valueOf(zzbbmVar.zzg()));
        map.put("tchv", Long.valueOf(zzbbmVar.zzi()));
        map.put("tphv", Long.valueOf(zzbbmVar.zzh()));
        map.put("tcc", Long.valueOf(zzbbmVar.zzj()));
        map.put("tpc", Long.valueOf(zzbbmVar.zzk()));
        zzbao zzbaoVar = this.zze;
        if (zzbaoVar != null) {
            map.put("nt", Long.valueOf(zzbaoVar.zzc()));
        }
        zzbbu zzbbuVar = this.zzf;
        map.put("vs", Long.valueOf(zzbbuVar.zzc()));
        map.put("vf", Long.valueOf(zzbbuVar.zzd()));
        return map;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzc() {
        Map mapZzf = zzf();
        mapZzf.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, this.zzh.zzb());
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zzd() {
        zzbbs zzbbsVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzbbsVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
