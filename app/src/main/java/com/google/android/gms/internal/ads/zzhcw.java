package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhcw implements zzhdp {
    private final InputStream zza;

    private zzhcw(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhdp zza(byte[] bArr) {
        return new zzhcw(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhdp
    public final zzhso zzb() throws IOException {
        try {
            return zzhso.zzg(this.zza, zzidb.zza());
        } finally {
            this.zza.close();
        }
    }
}
