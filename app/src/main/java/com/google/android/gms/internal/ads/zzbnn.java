package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzbnn extends zzbms {
    final /* synthetic */ zzbnp zza;

    /* synthetic */ zzbnn(zzbnp zzbnpVar, byte[] bArr) {
        Objects.requireNonNull(zzbnpVar);
        this.zza = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zze(zzbmj zzbmjVar, String str) {
        zzbnp zzbnpVar = this.zza;
        if (zzbnpVar.zzd() == null) {
            return;
        }
        zzbnpVar.zzd().zzc(zzbnpVar.zze(zzbmjVar), str);
    }
}
