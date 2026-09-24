package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzla {
    final /* synthetic */ zzlb zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzla(zzlb zzlbVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzlbVar);
        this.zza = zzlbVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzky
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                zzlb zzlbVar2 = this.zza.zza;
                if (zzlbVar2.zzae()) {
                    return;
                }
                zzlbVar2.zzT(1, 19, Integer.valueOf(i));
            }
        };
        this.zzc = intConsumer;
        final zzdy zzdyVarZzd = zzlbVar.zzX().zzd(zzlbVar.zzW(), null);
        Objects.requireNonNull(zzdyVarZzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzdyVarZzd.zzm(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
