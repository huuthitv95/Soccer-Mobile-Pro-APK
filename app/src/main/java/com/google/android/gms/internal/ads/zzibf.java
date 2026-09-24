package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzibf extends zzibh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzibf(zzibg zzibgVar) {
        super(zzibgVar.zza);
        Objects.requireNonNull(zzibgVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
