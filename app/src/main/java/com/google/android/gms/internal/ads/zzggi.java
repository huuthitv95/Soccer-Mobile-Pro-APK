package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzggi {
    private final zzhbs zza;
    private final zzggn zzb;
    private final Set zzc;
    private final String zzd;
    private final zzaxf zze;
    private final zzghg zzf;
    private final zzgpu zzg;

    zzggi(zzhbs zzhbsVar, zzggn zzggnVar, zzghg zzghgVar, zzgdl zzgdlVar, String str, zzaxf zzaxfVar, zzimx zzimxVar, zzimx zzimxVar2, zzimx zzimxVar3, zzgpu zzgpuVar) {
        this.zza = zzhbsVar;
        this.zzb = zzggnVar;
        this.zzd = str;
        this.zzf = zzghgVar;
        this.zze = zzaxfVar;
        this.zzg = zzgpuVar;
        int iOrdinal = zzgdlVar.ordinal();
        if (iOrdinal == 0) {
            this.zzc = ((zzimu) zzimxVar).zzb();
        } else if (iOrdinal == 1) {
            this.zzc = ((zzimu) zzimxVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzimu) zzimxVar3).zzb();
        }
    }

    final ListenableFuture zza() {
        if (!this.zzb.zzc()) {
            return zzhbi.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zzc((zzgij) it.next()));
        }
        return zzhbi.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzggf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzhbz.zza());
    }

    final /* synthetic */ String zzb() {
        return this.zzb.zzg(16384, this.zzd);
    }

    final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzggg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgps zzgpsVarZza = this.zzg.zza(101);
        try {
            zzgpsVarZza.zza();
            Object objCall = callable.call();
            zzgpsVarZza.zzc();
            return (String) objCall;
        } catch (Throwable th) {
            try {
                zzgpsVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgpsVarZza.zzc();
                throw th2;
            }
        }
    }

    final /* synthetic */ String zzd() {
        zzayf zzayfVar = (zzayf) this.zze.zzbu();
        String str = this.zzd;
        zzggn zzggnVar = this.zzb;
        try {
            return Base64.encodeToString(((zzayy) zzggnVar.zzf(zzayfVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzggnVar.zzg(4096, str);
        }
    }
}
