package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzzr implements Comparator {
    static final /* synthetic */ zzzr zza = new zzzr();

    private /* synthetic */ zzzr() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaab) ((List) obj).get(0)).compareTo((zzaab) ((List) obj2).get(0));
    }
}
