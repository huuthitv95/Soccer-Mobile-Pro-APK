package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzigh {
    private static volatile int zza = 100;

    zzigh() {
    }

    abstract void zza(Object obj, int i, long j);

    abstract void zzb(Object obj, int i, int i2);

    abstract void zzc(Object obj, int i, long j);

    abstract void zzd(Object obj, int i, zzicn zzicnVar);

    abstract void zze(Object obj, int i, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzifp zzifpVar, int i) throws IOException {
        int iZzc = zzifpVar.zzc();
        int i2 = iZzc >>> 3;
        int i3 = iZzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzifpVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzifpVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzifpVar.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzieg("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzief("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzifpVar.zzk());
            return true;
        }
        Object objZzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zzieg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzifpVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzifpVar, i5)) {
        }
        if ((i4 | 4) != zzifpVar.zzc()) {
            throw new zzieg("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(objZzf));
        return true;
    }
}
