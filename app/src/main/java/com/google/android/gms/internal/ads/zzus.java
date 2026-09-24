package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzus extends zzip {
    private long zzg;
    private int zzh;
    private int zzi;

    public zzus() {
        super(2, 0);
        this.zzi = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzip, com.google.android.gms.internal.ads.zzik
    public final void zza() {
        super.zza();
        this.zzh = 0;
    }

    public final void zzm(int i) {
        this.zzi = i;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final int zzo() {
        return this.zzh;
    }

    public final boolean zzp() {
        return this.zzh > 0;
    }

    public final boolean zzq(zzip zzipVar) {
        ByteBuffer byteBuffer;
        zzgsw.zza(!zzipVar.zzi(1073741824));
        zzgsw.zza(!zzipVar.zzi(268435456));
        zzgsw.zza(!zzipVar.zzi(4));
        if (zzp()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzipVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzipVar.zze;
            if (zzipVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zzipVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzipVar.zze;
        return true;
    }
}
