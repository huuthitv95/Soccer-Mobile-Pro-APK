package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzco {
    public static final ByteBuffer zza = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzco$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static long $default$zza(zzco _this, long j) {
            return j;
        }

        @Deprecated
        public static void $default$zzh(zzco _this) {
            throw new IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
        }
    }

    long zza(long j);

    zzcl zzb(zzcl zzclVar) throws zzcn;

    boolean zzc();

    void zzd(ByteBuffer byteBuffer);

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    @Deprecated
    void zzh();

    void zzi(zzcm zzcmVar);

    void zzj();
}
