package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzhan extends zzhal {
    private zzhan() {
        throw null;
    }

    /* synthetic */ zzhan(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    final void zza(zzhao zzhaoVar, Set set, Set set2) {
        synchronized (zzhaoVar) {
            if (zzhaoVar.seenExceptionsField == null) {
                zzhaoVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    final int zzb(zzhao zzhaoVar) {
        int i;
        synchronized (zzhaoVar) {
            i = zzhaoVar.remainingField - 1;
            zzhaoVar.remainingField = i;
        }
        return i;
    }
}
