package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzilr extends zzilp implements zzaui {
    private int zzg;

    protected zzilr(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzauh.zzc(byteBuffer.get());
        zzauh.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
