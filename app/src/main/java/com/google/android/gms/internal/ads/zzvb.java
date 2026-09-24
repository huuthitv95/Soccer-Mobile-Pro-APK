package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzvb {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzvb$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        public static boolean $default$zzm(zzvb _this, zzva zzvaVar) {
            return false;
        }
    }

    void zza(int i, int i2, int i3, long j, int i4);

    void zzb(int i, int i2, zzim zzimVar, long j, int i3);

    void zzc(int i, boolean z);

    void zzd(int i, long j);

    int zze();

    int zzf(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzg();

    ByteBuffer zzh(int i);

    void zzi(Runnable runnable);

    ByteBuffer zzj(int i);

    void zzk();

    void zzl();

    boolean zzm(zzva zzvaVar);

    void zzn(Surface surface);

    void zzo();

    void zzp(Bundle bundle);

    void zzq(int i);

    void zzr(List list);
}
