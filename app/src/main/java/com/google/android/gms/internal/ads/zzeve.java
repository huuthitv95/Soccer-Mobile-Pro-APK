package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzeve implements zzgsn {
    static final /* synthetic */ zzeve zza = new zzeve();

    private /* synthetic */ zzeve() {
    }

    @Override // com.google.android.gms.internal.ads.zzgsn
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzevg(arrayList);
    }
}
