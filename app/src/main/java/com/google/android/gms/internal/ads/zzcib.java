package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzcib extends zzaue {
    static final zzcib zzb = new zzcib();

    zzcib() {
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final zzaui zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzauk();
        }
        return "mvhd".equals(str) ? new zzaul() : new zzaum(str);
    }
}
