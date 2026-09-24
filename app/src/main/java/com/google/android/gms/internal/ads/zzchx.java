package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzchx {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaul zzaulVar;
        zzauk zzaukVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzaug(new zzchw(byteBufferDuplicate), zzcib.zzb).zzc().iterator();
            while (true) {
                zzaulVar = null;
                if (!it.hasNext()) {
                    zzaukVar = null;
                    break;
                }
                zzaui zzauiVar = (zzaui) it.next();
                if (zzauiVar instanceof zzauk) {
                    zzaukVar = (zzauk) zzauiVar;
                    break;
                }
            }
            for (zzaui zzauiVar2 : zzaukVar.zzc()) {
                if (zzauiVar2 instanceof zzaul) {
                    zzaulVar = (zzaul) zzauiVar2;
                    break;
                }
            }
            long jZzd = (zzaulVar.zzd() * 1000) / zzaulVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
