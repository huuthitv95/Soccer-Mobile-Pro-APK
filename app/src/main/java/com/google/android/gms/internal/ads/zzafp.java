package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public interface zzafp {

    /* JADX INFO: renamed from: com.google.android.gms.internal.ads.zzafp$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
    public final /* synthetic */ class CC {
        @SideEffectFree
        public static zzafp $default$zzg(zzafp _this) {
            return _this;
        }
    }

    boolean zza(zzafq zzafqVar) throws IOException;

    List zzb();

    void zzc(zzafs zzafsVar);

    int zzd(zzafq zzafqVar, zzagp zzagpVar) throws IOException;

    void zze(long j, long j2);

    void zzf();

    @SideEffectFree
    zzafp zzg();
}
