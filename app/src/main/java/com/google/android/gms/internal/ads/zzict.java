package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzict extends zzicw {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    zzict(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzice
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzv(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzb(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzc(int i, int i2) throws IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzd(int i, int i2) throws IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zze(int i, int i2) throws IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzf(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzg(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzh(int i, boolean z) throws IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzi(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzj(int i, zzicn zzicnVar) throws IOException {
        zzr((i << 3) | 2);
        zzk(zzicnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzk(zzicn zzicnVar) throws IOException {
        zzr(zzicnVar.zzb());
        zzicnVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzm(int i, zzifc zzifcVar) throws IOException {
        zzr(11);
        zzd(2, i);
        zzr(26);
        zzo(zzifcVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzn(int i, zzicn zzicnVar) throws IOException {
        zzr(11);
        zzd(2, i);
        zzj(3, zzicnVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzo(zzifc zzifcVar) throws IOException {
        zzr(zzifcVar.zzbr());
        zzifcVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzp(byte b) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zzicu(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzs(int i) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzicu(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzu(long j) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzicu(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzicu(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzw(String str) throws IOException {
        int i = this.zze;
        try {
            int iZzF = zzF(str.length() * 3);
            int iZzF2 = zzF(str.length());
            if (iZzF2 != iZzF) {
                zzr(zzigt.zzc(str));
                byte[] bArr = this.zzc;
                int i2 = this.zze;
                this.zze = zzigt.zzd(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + iZzF2;
            this.zze = i3;
            byte[] bArr2 = this.zzc;
            int iZzd = zzigt.zzd(str, bArr2, i3, bArr2.length - i3);
            this.zze = i;
            zzr((iZzd - i) - iZzF2);
            this.zze = iZzd;
        } catch (IndexOutOfBoundsException e) {
            throw new zzicu(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final int zzy() {
        return this.zzd - this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzr(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zze;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zzc[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzicu(i3, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzicu(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zzc[i3] = (byte) i;
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzicw
    public final void zzt(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z = zzicw.zzc;
        int i2 = this.zze;
        if (!z || this.zzd - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zzc[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i3;
                        throw new zzicu(i2, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zzc[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new zzicu(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzigo.zzp(this.zzc, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzigo.zzp(this.zzc, i2, (byte) j);
        }
        this.zze = i;
    }
}
