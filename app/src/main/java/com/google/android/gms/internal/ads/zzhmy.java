package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmy {
    private final Map zza;
    private final Map zzb;

    private zzhmy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhmy zza(zzhmx zzhmxVar) throws GeneralSecurityException {
        if (zzhmxVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhmz zzhmzVar = new zzhmz(zzhmxVar.zzb(), zzhmxVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhmzVar)) {
            map.put(zzhmzVar, zzhmxVar);
            return this;
        }
        zzhmx zzhmxVar2 = (zzhmx) map.get(zzhmzVar);
        if (zzhmxVar2.equals(zzhmxVar) && zzhmxVar.equals(zzhmxVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhmzVar.toString()));
    }

    public final zzhmy zzb(zzhnd zzhndVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhndVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhndVar);
            return this;
        }
        zzhnd zzhndVar2 = (zzhnd) map.get(clsZza);
        if (zzhndVar2.equals(zzhndVar) && zzhndVar.equals(zzhndVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final zzhnb zzc() {
        return new zzhnb(this, null);
    }

    final /* synthetic */ Map zzd() {
        return this.zza;
    }

    final /* synthetic */ Map zze() {
        return this.zzb;
    }

    /* synthetic */ zzhmy(zzhnb zzhnbVar, byte[] bArr) {
        this.zza = new HashMap(zzhnbVar.zzd());
        this.zzb = new HashMap(zzhnbVar.zze());
    }

    /* synthetic */ zzhmy(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
