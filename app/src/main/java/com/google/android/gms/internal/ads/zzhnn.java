package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnn {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzhnn(zzhnk zzhnkVar, byte[] bArr) {
        this.zza = new HashMap(zzhnkVar.zze());
        this.zzb = new HashMap(zzhnkVar.zzf());
        this.zzc = new HashMap(zzhnkVar.zzg());
        this.zzd = new HashMap(zzhnkVar.zzh());
    }

    public final boolean zza(zzhnj zzhnjVar) {
        return this.zzb.containsKey(new zzhnl(zzhnjVar.getClass(), zzhnjVar.zzf(), null));
    }

    public final zzhdc zzb(zzhnj zzhnjVar, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        zzhnl zzhnlVar = new zzhnl(zzhnjVar.getClass(), zzhnjVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhnlVar)) {
            return ((zzhlj) map.get(zzhnlVar)).zza(zzhnjVar, zzhdxVar);
        }
        String string = zzhnlVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhnj zzc(zzhdc zzhdcVar, Class cls, @Nullable zzhdx zzhdxVar) throws GeneralSecurityException {
        zzhnm zzhnmVar = new zzhnm(zzhdcVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhnmVar)) {
            return ((zzhlm) map.get(zzhnmVar)).zza(zzhdcVar, zzhdxVar);
        }
        String string = zzhnmVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(zzhnj zzhnjVar) {
        return this.zzd.containsKey(new zzhnl(zzhnjVar.getClass(), zzhnjVar.zzf(), null));
    }

    public final zzhdt zze(zzhnj zzhnjVar) throws GeneralSecurityException {
        zzhnl zzhnlVar = new zzhnl(zzhnjVar.getClass(), zzhnjVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhnlVar)) {
            return ((zzhmn) map.get(zzhnlVar)).zza(zzhnjVar);
        }
        String string = zzhnlVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhnj zzf(zzhdt zzhdtVar, Class cls) throws GeneralSecurityException {
        zzhnm zzhnmVar = new zzhnm(zzhdtVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhnmVar)) {
            return ((zzhmq) map.get(zzhnmVar)).zza(zzhdtVar);
        }
        String string = zzhnmVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map zzg() {
        return this.zza;
    }

    final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
