package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpo implements zzpx {
    public static final zzgto zza = zzpm.zza;
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpw zzf;
    private zzbf zzg;
    private String zzh;
    private long zzi;

    public zzpo() {
        throw null;
    }

    public zzpo(zzgto zzgtoVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    @RequiresNonNull({"listener"})
    private final void zzl(zznh zznhVar) {
        if (zznhVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpn zzpnVar = (zzpn) this.zze.get(str);
                zzpnVar.getClass();
                zzm(zzpnVar);
                return;
            }
            return;
        }
        zzpn zzpnVar2 = (zzpn) this.zze.get(this.zzh);
        int i = zznhVar.zzc;
        zzxc zzxcVar = zznhVar.zzd;
        this.zzh = zzo(i, zzxcVar).zze();
        zzc(zznhVar);
        if (zzxcVar == null || !zzxcVar.zzb()) {
            return;
        }
        if (zzpnVar2 != null) {
            if (zzpnVar2.zzg() == zzxcVar.zzd && zzpnVar2.zzh() != null) {
                zzxc zzxcVarZzh = zzpnVar2.zzh();
                if (zzxcVarZzh.zzb == zzxcVar.zzb) {
                    zzxc zzxcVarZzh2 = zzpnVar2.zzh();
                    if (zzxcVarZzh2.zzc == zzxcVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i, new zzxc(zzxcVar.zza, zzxcVar.zzd));
    }

    private final void zzm(zzpn zzpnVar) {
        if (zzpnVar.zzg() != -1 && zzpnVar.zzi()) {
            this.zzi = zzpnVar.zzg();
        }
        this.zzh = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpn zzpnVar = (zzpn) this.zze.get(this.zzh);
        return (zzpnVar == null || zzpnVar.zzg() == -1) ? this.zzi + 1 : zzpnVar.zzg();
    }

    private final zzpn zzo(int i, zzxc zzxcVar) {
        HashMap map = this.zze;
        long j = Long.MAX_VALUE;
        zzpn zzpnVar = null;
        for (zzpn zzpnVar2 : map.values()) {
            zzpnVar2.zzc(i, zzxcVar);
            if (zzpnVar2.zzb(i, zzxcVar)) {
                long jZzg = zzpnVar2.zzg();
                if (jZzg == -1 || jZzg < j) {
                    zzpnVar = zzpnVar2;
                    j = jZzg;
                } else if (jZzg == j) {
                    String str = zzfk.zza;
                    if (zzpnVar.zzh() != null && zzpnVar2.zzh() != null) {
                        zzpnVar = zzpnVar2;
                    }
                }
            }
        }
        if (zzpnVar != null) {
            return zzpnVar;
        }
        String strZzp = zzp();
        zzpn zzpnVar3 = new zzpn(this, strZzp, i, zzxcVar);
        map.put(strZzp, zzpnVar3);
        return zzpnVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final void zza(zzpw zzpwVar) {
        this.zzf = zzpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized String zzb(zzbf zzbfVar, zzxc zzxcVar) {
        return zzo(zzbfVar.zzo(zzxcVar.zza, this.zzd).zzc, zzxcVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:14:0x0023, B:16:0x002f, B:18:0x0037, B:20:0x003f, B:22:0x0049, B:25:0x0052, B:27:0x0058, B:29:0x006d, B:30:0x0086, B:32:0x008c, B:33:0x008f, B:35:0x009b, B:37:0x00a1, B:43:0x00b2), top: B:47:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzc(zznh zznhVar) {
        int i;
        zzpn zzpnVarZzo;
        Object obj;
        int i2;
        zzpn zzpnVarZzo2;
        zzpn zzpnVar;
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = zznhVar.zzb;
        if (!zzbfVar.zzg()) {
            zzxc zzxcVar = zznhVar.zzd;
            if (zzxcVar != null) {
                long j = zzxcVar.zzd;
                if ((j == -1 || j >= zzi()) && ((zzpnVar = (zzpn) this.zze.get(this.zzh)) == null || zzpnVar.zzg() != -1 || zzpnVar.zzf() == zznhVar.zzc)) {
                    i = zznhVar.zzc;
                    zzpnVarZzo = zzo(i, zzxcVar);
                    if (this.zzh == null) {
                        this.zzh = zzpnVarZzo.zze();
                    }
                    if (zzxcVar != null && zzxcVar.zzb()) {
                        obj = zzxcVar.zza;
                        long j2 = zzxcVar.zzd;
                        i2 = zzxcVar.zzb;
                        zzpnVarZzo2 = zzo(i, new zzxc(obj, j2, i2));
                        if (!zzpnVarZzo2.zzi()) {
                            zzpnVarZzo2.zzj(true);
                            zzbd zzbdVar = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar);
                            zzbdVar.zzc(i2);
                            Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                        }
                    }
                    if (!zzpnVarZzo.zzi()) {
                        zzpnVarZzo.zzj(true);
                    }
                    if (zzpnVarZzo.zze().equals(this.zzh) && !zzpnVarZzo.zzk()) {
                        zzpnVarZzo.zzl(true);
                        this.zzf.zzc(zznhVar, zzpnVarZzo.zze());
                    }
                }
            } else {
                i = zznhVar.zzc;
                zzpnVarZzo = zzo(i, zzxcVar);
                if (this.zzh == null) {
                    this.zzh = zzpnVarZzo.zze();
                }
                if (zzxcVar != null) {
                    obj = zzxcVar.zza;
                    long j3 = zzxcVar.zzd;
                    i2 = zzxcVar.zzb;
                    zzpnVarZzo2 = zzo(i, new zzxc(obj, j3, i2));
                    if (!zzpnVarZzo2.zzi()) {
                        zzpnVarZzo2.zzj(true);
                        zzbd zzbdVar2 = this.zzd;
                        zzbfVar.zzo(obj, zzbdVar2);
                        zzbdVar2.zzc(i2);
                        Math.max(0L, zzfk.zzr(0L) + zzfk.zzr(0L));
                    }
                }
                if (!zzpnVarZzo.zzi()) {
                    zzpnVarZzo.zzj(true);
                }
                if (zzpnVarZzo.zze().equals(this.zzh)) {
                    zzpnVarZzo.zzl(true);
                    this.zzf.zzc(zznhVar, zzpnVarZzo.zze());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzd(zznh zznhVar) {
        if (this.zzf == null) {
            throw null;
        }
        zzbf zzbfVar = this.zzg;
        this.zzg = zznhVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar = (zzpn) it.next();
            if (!zzpnVar.zza(zzbfVar, this.zzg) || zzpnVar.zzd(zznhVar)) {
                it.remove();
                if (zzpnVar.zze().equals(this.zzh)) {
                    zzm(zzpnVar);
                }
                if (zzpnVar.zzi()) {
                    this.zzf.zzd(zznhVar, zzpnVar.zze(), false);
                }
            }
        }
        zzl(zznhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zze(zznh zznhVar, int i) {
        if (this.zzf == null) {
            throw null;
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar = (zzpn) it.next();
            if (zzpnVar.zzd(zznhVar)) {
                it.remove();
                boolean zEquals = zzpnVar.zze().equals(this.zzh);
                if (zEquals) {
                    zzm(zzpnVar);
                }
                if (zzpnVar.zzi()) {
                    boolean z = false;
                    if (i == 0 && zEquals && zzpnVar.zzk()) {
                        z = true;
                    }
                    this.zzf.zzd(zznhVar, zzpnVar.zze(), z);
                }
            }
        }
        zzl(zznhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpx
    public final synchronized void zzg(zznh zznhVar) {
        zzpw zzpwVar;
        String str = this.zzh;
        if (str != null) {
            zzpn zzpnVar = (zzpn) this.zze.get(str);
            if (zzpnVar == null) {
                throw null;
            }
            zzm(zzpnVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpn zzpnVar2 = (zzpn) it.next();
            it.remove();
            if (zzpnVar2.zzi() && (zzpwVar = this.zzf) != null) {
                zzpwVar.zzd(zznhVar, zzpnVar2.zze(), false);
            }
        }
    }

    final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }
}
