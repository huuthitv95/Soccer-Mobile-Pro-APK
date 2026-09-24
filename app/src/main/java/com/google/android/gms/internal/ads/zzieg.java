package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzieg extends IOException {
    private boolean zza;

    public zzieg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void zza() {
        this.zza = true;
    }

    final boolean zzb() {
        return this.zza;
    }

    public zzieg(String str) {
        super(str);
    }

    public zzieg(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
