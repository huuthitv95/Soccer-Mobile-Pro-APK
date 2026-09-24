package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtc extends zzgtj {
    final /* synthetic */ zzgsk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgtc(zzgtl zzgtlVar, CharSequence charSequence, zzgsk zzgskVar) {
        super(zzgtlVar, charSequence);
        this.zza = zzgskVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzgsw.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    final int zzd(int i) {
        return i + 1;
    }
}
