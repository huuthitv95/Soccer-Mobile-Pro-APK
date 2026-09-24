package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgcv implements zzgcl {
    private ExecutorService zza;
    private Context zzb;
    private zzgco zzc;

    private zzgcv() {
        throw null;
    }

    /* synthetic */ zzgcv(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final zzgcm zza() {
        zzimq.zzc(this.zza, ExecutorService.class);
        zzimq.zzc(this.zzb, Context.class);
        zzimq.zzc(this.zzc, zzgco.class);
        return new zzgcu(new zzgit(), new zzgiv(), new zzgix(), this.zza, this.zzb, this.zzc);
    }

    public final zzgcv zzb(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final zzgcv zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzgcv zzd(zzgco zzgcoVar) {
        zzgcoVar.getClass();
        this.zzc = zzgcoVar;
        return this;
    }
}
