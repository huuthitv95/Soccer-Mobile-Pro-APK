package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgfp implements zzgem {
    private final zzgco zza;
    private final zzgfl zzb;
    private final zzgff zzc;
    private final ExecutorService zzd;
    private final zzgpu zze;
    private final AtomicReference zzf = new AtomicReference();

    zzgfp(zzgco zzgcoVar, zzgfl zzgflVar, zzgff zzgffVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgcoVar;
        this.zzb = zzgflVar;
        this.zzc = zzgffVar;
        this.zzd = executorService;
        this.zze = zzgpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final ListenableFuture zza() {
        zzgfl zzgflVar = this.zzb;
        zzgco zzgcoVar = this.zza;
        zzhba zzhbaVar = (zzhba) zzhbi.zzk(zzhba.zzw(zzgflVar.zzb(zzgcoVar.zzG(), zzgcoVar.zza())), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgfo
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgfe zzgfeVar = (zzgfe) obj;
                this.zza.zzf(zzgfeVar);
                return zzgfeVar;
            }
        }, zzhbz.zza());
        zzhbi.zzr(zzhbaVar, new zzgfn(this), this.zzd);
        return zzhbaVar;
    }

    public final ListenableFuture zzb(Context context) {
        return ((zzgfe) this.zzf.get()).zzc(context);
    }

    public final ListenableFuture zzc(Context context, String str, View view, Activity activity) {
        return ((zzgfe) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgfe) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgfe zzgfeVar = (zzgfe) this.zzf.get();
        if (zzgfeVar == null) {
            this.zze.zzb(54);
        } else {
            zzgfeVar.zzf(inputEvent);
        }
    }

    final /* synthetic */ zzgfe zzf(zzgfe zzgfeVar) {
        this.zzf.set(zzgfeVar);
        return zzgfeVar;
    }

    final /* synthetic */ zzgff zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzgfe zzgfeVar = (zzgfe) this.zzf.get();
        if (zzgfeVar == null) {
            return 1;
        }
        return zzgfeVar.zzg();
    }
}
