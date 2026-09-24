package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsq {
    private static final zzsq zza = new zzsq(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzsq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzsq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzsq zzc() {
        return zza;
    }

    static zzsq zze(zzsq zzsqVar, zzsq zzsqVar2) {
        int i = zzsqVar.zzb;
        int i2 = zzsqVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzsqVar.zzc, 0);
        int[] iArr = zzsqVar2.zzc;
        int i3 = zzsqVar.zzb;
        int i4 = zzsqVar2.zzb;
        System.arraycopy(iArr, 0, iArrCopyOf, 0, 0);
        Object[] objArrCopyOf = Arrays.copyOf(zzsqVar.zzd, 0);
        Object[] objArr = zzsqVar2.zzd;
        int i5 = zzsqVar.zzb;
        int i6 = zzsqVar2.zzb;
        System.arraycopy(objArr, 0, objArrCopyOf, 0, 0);
        return new zzsq(0, iArrCopyOf, objArrCopyOf, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzsq)) {
            return false;
        }
        zzsq zzsqVar = (zzsq) obj;
        int[] iArr = zzsqVar.zzc;
        Object[] objArr = zzsqVar.zzd;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        this.zze = 0;
        return 0;
    }

    final zzsq zzd(zzsq zzsqVar) {
        if (zzsqVar.equals(zza)) {
            return this;
        }
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i = zzsqVar.zzb;
        int[] iArr = this.zzc;
        int length = iArr.length;
        System.arraycopy(zzsqVar.zzc, 0, iArr, 0, 0);
        Object[] objArr = zzsqVar.zzd;
        Object[] objArr2 = this.zzd;
        int i2 = zzsqVar.zzb;
        System.arraycopy(objArr, 0, objArr2, 0, 0);
        this.zzb = 0;
        return this;
    }

    public final void zzf() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzg(StringBuilder sb, int i) {
    }

    final void zzh(zztb zztbVar) throws IOException {
    }
}
