package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnk {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhnk() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzhnk zza(zzhlm zzhlmVar) throws GeneralSecurityException {
        zzhnm zzhnmVar = new zzhnm(zzhlmVar.zzb(), zzhlmVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhnmVar)) {
            map.put(zzhnmVar, zzhlmVar);
            return this;
        }
        zzhlm zzhlmVar2 = (zzhlm) map.get(zzhnmVar);
        if (zzhlmVar2.equals(zzhlmVar) && zzhlmVar.equals(zzhlmVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhnmVar.toString()));
    }

    public final zzhnk zzb(zzhlj zzhljVar) throws GeneralSecurityException {
        zzhnl zzhnlVar = new zzhnl(zzhljVar.zzc(), zzhljVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhnlVar)) {
            map.put(zzhnlVar, zzhljVar);
            return this;
        }
        zzhlj zzhljVar2 = (zzhlj) map.get(zzhnlVar);
        if (zzhljVar2.equals(zzhljVar) && zzhljVar.equals(zzhljVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhnlVar.toString()));
    }

    public final zzhnk zzc(zzhmq zzhmqVar) throws GeneralSecurityException {
        zzhnm zzhnmVar = new zzhnm(zzhmqVar.zzb(), zzhmqVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhnmVar)) {
            map.put(zzhnmVar, zzhmqVar);
            return this;
        }
        zzhmq zzhmqVar2 = (zzhmq) map.get(zzhnmVar);
        if (zzhmqVar2.equals(zzhmqVar) && zzhmqVar.equals(zzhmqVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhnmVar.toString()));
    }

    public final zzhnk zzd(zzhmn zzhmnVar) throws GeneralSecurityException {
        zzhnl zzhnlVar = new zzhnl(zzhmnVar.zzc(), zzhmnVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhnlVar)) {
            map.put(zzhnlVar, zzhmnVar);
            return this;
        }
        zzhmn zzhmnVar2 = (zzhmn) map.get(zzhnlVar);
        if (zzhmnVar2.equals(zzhmnVar) && zzhmnVar.equals(zzhmnVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhnlVar.toString()));
    }

    final /* synthetic */ Map zze() {
        return this.zza;
    }

    final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzhnk(zzhnn zzhnnVar) {
        this.zza = new HashMap(zzhnnVar.zzg());
        this.zzb = new HashMap(zzhnnVar.zzh());
        this.zzc = new HashMap(zzhnnVar.zzi());
        this.zzd = new HashMap(zzhnnVar.zzj());
    }
}
