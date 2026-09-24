package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class zzilq extends zzilt implements zzaui {
    protected final String zza = "moov";

    public zzilq(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final void zzb(zzilu zziluVar, ByteBuffer byteBuffer, long j, zzauf zzaufVar) throws IOException {
        zziluVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zziluVar;
        this.zze = zziluVar.zzc();
        zziluVar.zzd(zziluVar.zzc() + j);
        this.zzf = zziluVar.zzc();
        this.zzb = zzaufVar;
    }
}
