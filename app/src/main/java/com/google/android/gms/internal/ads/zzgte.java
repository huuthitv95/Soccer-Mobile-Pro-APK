package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzgte extends zzgtj {
    zzgte(zzgtl zzgtlVar, CharSequence charSequence, int i) {
        super(zzgtlVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i) {
        return i;
    }
}
