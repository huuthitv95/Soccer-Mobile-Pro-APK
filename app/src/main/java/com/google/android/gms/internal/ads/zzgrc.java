package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgrc extends zzgqa {
    final /* synthetic */ zzgre zza;
    private final zzgrj zzb;

    zzgrc(zzgre zzgreVar, zzgrj zzgrjVar) {
        Objects.requireNonNull(zzgreVar);
        this.zza = zzgreVar;
        this.zzb = zzgrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgrh zzgrhVarZzd = zzgri.zzd();
        zzgrhVarZzd.zza(i);
        if (string != null) {
            zzgrhVarZzd.zzb(string);
        }
        zzgrhVarZzd.zzc(i2);
        this.zzb.zza(zzgrhVarZzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
