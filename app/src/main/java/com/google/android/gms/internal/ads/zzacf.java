package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzacf {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);
    private zzgs zzb;

    private final void zzd(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((zzgr) list.get(i)).zza == 1) {
                this.zzb = zzgs.zza((zzgr) list.get(i));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z) {
        zzgs zzgsVar;
        zzgp zzgpVarZzb;
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgt.zza(byteBuffer2));
            zze();
        }
        List listZza = zzgt.zza(byteBuffer);
        zzd(listZza);
        int size = listZza.size() - 1;
        int i = 0;
        while (size >= 0) {
            zzgr zzgrVar = (zzgr) listZza.get(size);
            int i2 = zzgrVar.zza;
            if (i2 != 2 && i2 != 15) {
                if (i2 == 3) {
                    if (!z) {
                        break;
                    }
                    i2 = 3;
                    if (i2 != 6) {
                        break;
                    }
                    break;
                }
                if ((i2 != 6 && i2 != 3) || (zzgsVar = this.zzb) == null || (zzgpVarZzb = zzgp.zzb(zzgsVar, zzgrVar)) == null || zzgpVarZzb.zza()) {
                    break;
                }
            }
            if (((zzgr) listZza.get(size)).zza == 6 || ((zzgr) listZza.get(size)).zza == 3) {
                i++;
            }
            size--;
        }
        if (i > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((zzgr) listZza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
