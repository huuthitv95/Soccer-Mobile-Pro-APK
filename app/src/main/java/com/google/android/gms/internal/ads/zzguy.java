package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzguy extends zzgvc {
    final /* synthetic */ zzgvg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguy(zzgvg zzgvgVar) {
        super(zzgvgVar, null);
        Objects.requireNonNull(zzgvgVar);
        this.zza = zzgvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    final Object zza(int i) {
        return this.zza.zzo(i);
    }
}
