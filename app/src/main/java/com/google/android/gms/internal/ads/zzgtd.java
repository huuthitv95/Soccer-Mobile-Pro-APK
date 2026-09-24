package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtd extends zzgtj {
    final /* synthetic */ zzgsl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtd(zzgtl zzgtlVar, CharSequence charSequence, zzgsl zzgslVar) {
        super(zzgtlVar, charSequence);
        this.zza = zzgslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i) {
        Matcher matcher = ((zzgso) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i) {
        return ((zzgso) this.zza).zza.end();
    }
}
