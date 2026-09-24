package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzigl extends zzign {
    zzigl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zza(Object obj, long j, byte b) {
        if (zzigo.zzb) {
            zzigo.zzF(obj, j, b);
        } else {
            zzigo.zzG(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final boolean zzb(Object obj, long j) {
        return zzigo.zzb ? zzigo.zzw(obj, j) : zzigo.zzx(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zzc(Object obj, long j, boolean z) {
        if (zzigo.zzb) {
            zzigo.zzF(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzigo.zzG(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzign
    public final byte zzh(long j) {
        return Memory.peekByte((int) j);
    }
}
