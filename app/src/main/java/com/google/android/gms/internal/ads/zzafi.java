package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzafi implements zzafj {
    static final /* synthetic */ zzafi zza = new zzafi();

    private /* synthetic */ zzafi() {
    }

    @Override // com.google.android.gms.internal.ads.zzafj
    public final /* synthetic */ Constructor zza() {
        int i = zzafl.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzafp.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
