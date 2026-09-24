package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmk {
    public static final zziam zza = zziam.zza(new byte[0]);

    public static final zziam zza(int i) {
        return zziam.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zziam zzb(int i) {
        return zziam.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
