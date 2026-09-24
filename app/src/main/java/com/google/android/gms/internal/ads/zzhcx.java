package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhcx {
    private final OutputStream zza;

    private zzhcx(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhcx zzb(OutputStream outputStream) {
        return new zzhcx(outputStream);
    }

    public final void zza(zzhso zzhsoVar) throws IOException {
        try {
            zzhsoVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
