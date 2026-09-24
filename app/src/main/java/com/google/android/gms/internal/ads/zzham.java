package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0189xc40028dd;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzham extends zzhal {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhao.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhao.class, "remainingField");

    private zzham() {
        throw null;
    }

    /* synthetic */ zzham(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    final void zza(zzhao zzhaoVar, Set set, Set set2) {
        C0189xc40028dd.m89m(zza, zzhaoVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    final int zzb(zzhao zzhaoVar) {
        return zzb.decrementAndGet(zzhaoVar);
    }
}
