package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzauy implements zzaux {
    @Override // com.google.android.gms.internal.ads.zzaux
    public final byte zza(zzavj zzavjVar, int i) {
        return zzavjVar.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final zzavj zzb(zzavj zzavjVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzavjVar.zza).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzavj(zzavj.zzh(bArr, i, i2 - i));
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final zzaux zzc() {
        return new zzauy();
    }
}
