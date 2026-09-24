package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzegr {
    private final zzhbs zza;
    private final zzefw zzb;
    private final zzimc zzc;

    public zzegr(zzhbs zzhbsVar, zzefw zzefwVar, zzimc zzimcVar) {
        this.zza = zzhbsVar;
        this.zzb = zzefwVar;
        this.zzc = zzimcVar;
    }

    private final ListenableFuture zzg(final zzcar zzcarVar, zzegh zzeghVar, final zzegh zzeghVar2, final zzhaq zzhaqVar) {
        ListenableFuture listenableFutureZzh;
        String str = zzcarVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            listenableFutureZzh = zzhbi.zzc(new zzegf(1));
        } else {
            listenableFutureZzh = zzhbi.zzh(zzeghVar.zza(zzcarVar), ExecutionException.class, zzegq.zza, this.zza);
        }
        zzhbs zzhbsVar = this.zza;
        return (zzhba) zzhbi.zzh((zzhba) zzhbi.zzj((zzhba) zzhbi.zzj(zzhba.zzw(listenableFutureZzh), zzegj.zza, zzhbsVar), zzhaqVar, zzhbsVar), zzegf.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzeghVar2, zzcarVar, zzhaqVar, (zzegf) obj);
            }
        }, zzhbsVar);
    }

    public final ListenableFuture zza(final zzcar zzcarVar) {
        zzhaq zzhaqVar = new zzhaq() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str = new String(zzgyz.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzcar zzcarVar2 = zzcarVar;
                zzcarVar2.zzj = str;
                return zzhbi.zza(zzcarVar2);
            }
        };
        final zzefw zzefwVar = this.zzb;
        Objects.requireNonNull(zzefwVar);
        return zzg(zzcarVar, new zzegh() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // com.google.android.gms.internal.ads.zzegh
            public final /* synthetic */ ListenableFuture zza(zzcar zzcarVar2) {
                return zzefwVar.zza(zzcarVar2);
            }
        }, new zzegh() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // com.google.android.gms.internal.ads.zzegh
            public final /* synthetic */ ListenableFuture zza(zzcar zzcarVar2) {
                return this.zza.zzd(zzcarVar2);
            }
        }, zzhaqVar);
    }

    public final ListenableFuture zzb(zzcar zzcarVar) {
        return zzg(zzcarVar, new zzegh() { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzegh
            public final /* synthetic */ ListenableFuture zza(zzcar zzcarVar2) {
                return this.zza.zze(zzcarVar2);
            }
        }, new zzegh() { // from class: com.google.android.gms.internal.ads.zzegp
            @Override // com.google.android.gms.internal.ads.zzegh
            public final /* synthetic */ ListenableFuture zza(zzcar zzcarVar2) {
                return this.zza.zzf(zzcarVar2);
            }
        }, zzegn.zza);
    }

    final /* synthetic */ ListenableFuture zzc(zzegh zzeghVar, zzcar zzcarVar, zzhaq zzhaqVar, zzegf zzegfVar) {
        return zzhbi.zzj(zzeghVar.zza(zzcarVar), zzhaqVar, this.zza);
    }

    final /* synthetic */ ListenableFuture zzd(zzcar zzcarVar) {
        return ((zzehw) this.zzc.zzb()).zzc(zzcarVar, Binder.getCallingUid());
    }

    final /* synthetic */ ListenableFuture zze(zzcar zzcarVar) {
        return this.zzb.zzd(zzcarVar.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(zzcar zzcarVar) {
        return ((zzehw) this.zzc.zzb()).zzd(zzcarVar.zzh);
    }
}
