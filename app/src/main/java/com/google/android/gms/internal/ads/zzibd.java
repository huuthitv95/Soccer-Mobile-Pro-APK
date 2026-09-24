package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzibd extends zzibh {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzibd(zzibe zzibeVar) {
        super(zzibeVar.zza);
        Objects.requireNonNull(zzibeVar);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return zza();
    }
}
