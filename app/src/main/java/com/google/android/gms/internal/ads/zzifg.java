package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzifg implements zzifu {
    private final zzifc zza;
    private final zzigh zzb;
    private final boolean zzc;
    private final zzidc zzd;

    private zzifg(zzigh zzighVar, zzidc zzidcVar, zzifc zzifcVar) {
        this.zzb = zzighVar;
        this.zzc = zzifcVar instanceof zzidn;
        this.zzd = zzidcVar;
        this.zza = zzifcVar;
    }

    static zzifg zzh(zzigh zzighVar, zzidc zzidcVar, zzifc zzifcVar) {
        return new zzifg(zzighVar, zzidcVar, zzifcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final Object zza() {
        zzifc zzifcVar = this.zza;
        return zzifcVar instanceof zzidr ? ((zzidr) zzifcVar).zzbg() : zzifcVar.zzcY().zzbt();
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzb(Object obj, Object obj2) {
        if (!((zzidr) obj).zzt.equals(((zzidr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzidn) obj).zza.equals(((zzidn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zzc(Object obj) {
        int iHashCode = ((zzidr) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzidn) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzd(Object obj, Object obj2) {
        zzifw.zzI(this.zzb, obj, obj2);
        if (this.zzc) {
            zzifw.zzH(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final int zze(Object obj) {
        int iZzh = ((zzidr) obj).zzt.zzh();
        return this.zzc ? iZzh + ((zzidn) obj).zza.zzg() : iZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzf(Object obj, zzigw zzigwVar) throws IOException {
        Iterator itZzc = ((zzidn) obj).zza.zzc();
        while (itZzc.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzc.next();
            zzidf zzidfVar = (zzidf) entry.getKey();
            if (zzidfVar.zzc() != zzigv.MESSAGE || zzidfVar.zzd() || zzidfVar.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zziej) {
                zzigwVar.zzv(zzidfVar.zza(), ((zziej) entry).zza().zzc());
            } else {
                zzigwVar.zzv(zzidfVar.zza(), entry.getValue());
            }
        }
        ((zzidr) obj).zzt.zzf(zzigwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzg(Object obj, zzifp zzifpVar, zzidb zzidbVar) throws IOException {
        this.zzb.zzh(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzicb zzicbVar) throws IOException {
        zzidr zzidrVar = (zzidr) obj;
        if (zzidrVar.zzt == zzigi.zza()) {
            zzidrVar.zzt = zzigi.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final void zzk(Object obj) {
        this.zzb.zzj(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzifu
    public final boolean zzl(Object obj) {
        return ((zzidn) obj).zza.zze();
    }
}
