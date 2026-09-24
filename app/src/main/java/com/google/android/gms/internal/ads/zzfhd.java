package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfhd implements zzgsn {
    final /* synthetic */ zzfhg zza;

    zzfhd(zzfhg zzfhgVar) {
        Objects.requireNonNull(zzfhgVar);
        this.zza = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcar zzcarVar = (zzcar) obj;
        zzfhe zzfheVar = new zzfhe(zzcarVar, new zzfmn(zzcarVar.zzj), null);
        zzfhg zzfhgVar = this.zza;
        zzfhgVar.zzd(zzfheVar);
        return zzfhgVar.zzc();
    }
}
