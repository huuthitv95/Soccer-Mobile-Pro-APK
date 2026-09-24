package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzaoy implements Comparator {
    static final /* synthetic */ zzaoy zza = new zzaoy();

    private /* synthetic */ zzaoy() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((zzaop) obj).zzb, ((zzaop) obj2).zzb);
    }
}
