package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzafm implements zzahb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzO(long j) {
        zzahb.CC.$default$zzO(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ int zza(zzj zzjVar, int i, boolean z) {
        return zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ void zzc(zzes zzesVar, int i) {
        zzd(zzesVar, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zzd(zzes zzesVar, int i, int i2) {
        zzesVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final void zze(long j, int i, int i2, int i3, zzaha zzahaVar) {
    }
}
