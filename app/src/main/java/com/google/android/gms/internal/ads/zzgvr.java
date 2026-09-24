package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Queue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgvr extends zzgvo implements Queue {
    protected zzgvr() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return zza().element();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return zza().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return zza().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return zza().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return zza().remove();
    }

    protected abstract Queue zza();

    @Override // com.google.android.gms.internal.ads.zzgvo
    protected /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
