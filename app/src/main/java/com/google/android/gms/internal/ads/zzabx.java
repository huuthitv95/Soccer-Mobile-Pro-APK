package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzabx implements Comparator {
    static final /* synthetic */ zzabx zza = new zzabx();

    private /* synthetic */ zzabx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((zzabw) obj).zzc, ((zzabw) obj2).zzc);
    }
}
