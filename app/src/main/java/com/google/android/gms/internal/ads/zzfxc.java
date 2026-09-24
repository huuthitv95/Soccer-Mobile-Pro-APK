package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzfxc implements zzfxf {
    private static final zzayf zza;

    static {
        zzaxf zzaxfVarZzj = zzayf.zzj();
        zzaxfVarZzj.zzo(ExifInterface.LONGITUDE_EAST);
        zza = (zzayf) zzaxfVarZzj.zzbu();
    }

    zzfxc() {
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final zzayf zza() {
        return zza;
    }
}
