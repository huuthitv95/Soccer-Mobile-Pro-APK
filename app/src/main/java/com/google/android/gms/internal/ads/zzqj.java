package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzqj implements Function {
    static final /* synthetic */ zzqj zza = new zzqj();

    private /* synthetic */ zzqj() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
