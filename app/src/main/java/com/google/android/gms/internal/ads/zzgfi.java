package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzgfi implements zzhaq {
    static final /* synthetic */ zzgfi zza = new zzgfi();

    private /* synthetic */ zzgfi() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        final zzgfe zzgfeVar = (zzgfe) obj;
        return zzhbi.zzk(zzgfeVar.zzb(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgfj
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj2) {
                return zzgfeVar;
            }
        }, zzhbz.zza());
    }
}
