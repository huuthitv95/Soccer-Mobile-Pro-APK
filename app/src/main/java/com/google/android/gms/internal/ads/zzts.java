package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzts implements Function {
    static final /* synthetic */ zzts zza = new zzts();

    private /* synthetic */ zzts() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
