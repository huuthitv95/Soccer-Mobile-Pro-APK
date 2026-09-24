package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzift extends zzicn {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzicn zzd;
    private final zzicn zze;
    private final int zzf;
    private final int zzg;

    private zzift(zzicn zzicnVar, zzicn zzicnVar2) {
        this.zzd = zzicnVar;
        this.zze = zzicnVar2;
        int iZzb = zzicnVar.zzb();
        this.zzf = iZzb;
        this.zzc = iZzb + zzicnVar2.zzb();
        this.zzg = Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1;
    }

    /* synthetic */ zzift(zzicn zzicnVar, zzicn zzicnVar2, byte[] bArr) {
        this(zzicnVar, zzicnVar2);
    }

    private static zzicn zzG(zzicn zzicnVar, zzicn zzicnVar2) {
        int iZzb = zzicnVar.zzb();
        int iZzb2 = zzicnVar2.zzb();
        byte[] bArr = new byte[iZzb + iZzb2];
        zzicnVar.zzz(bArr, 0, 0, iZzb);
        zzicnVar2.zzz(bArr, 0, iZzb, iZzb2);
        return zzicn.zzv(bArr);
    }

    static zzicn zzk(zzicn zzicnVar, zzicn zzicnVar2) {
        if (zzicnVar2.zzb() == 0) {
            return zzicnVar;
        }
        if (zzicnVar.zzb() == 0) {
            return zzicnVar2;
        }
        int iZzb = zzicnVar.zzb() + zzicnVar2.zzb();
        if (iZzb < 128) {
            return zzG(zzicnVar, zzicnVar2);
        }
        if (zzicnVar instanceof zzift) {
            zzift zziftVar = (zzift) zzicnVar;
            zzicn zzicnVar3 = zziftVar.zze;
            if (zzicnVar3.zzb() + zzicnVar2.zzb() < 128) {
                return new zzift(zziftVar.zzd, zzG(zzicnVar3, zzicnVar2));
            }
            zzicn zzicnVar4 = zziftVar.zzd;
            if (zzicnVar4.zzp() > zzicnVar3.zzp() && zziftVar.zzg > zzicnVar2.zzp()) {
                return new zzift(zzicnVar4, new zzift(zzicnVar3, zzicnVar2));
            }
        }
        return iZzb >= zzn(Math.max(zzicnVar.zzp(), zzicnVar2.zzp()) + 1) ? new zzift(zzicnVar, zzicnVar2) : zzifr.zza(zzicnVar, zzicnVar2, new ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzicn, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzifq(this);
    }

    final /* synthetic */ zzicn zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final byte zza(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zza(i) : this.zze.zza(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzc(int i, int i2) {
        return zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicn zzd(int i, int i2) {
        int i3 = this.zzc;
        int iZzD = zzD(i, i2, i3);
        if (iZzD == 0) {
            return zzicn.zza;
        }
        if (iZzD == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzc(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzc(i - i4, i5);
        }
        zzicn zzicnVar = this.zzd;
        return new zzift(zzicnVar.zzc(i, zzicnVar.zzb()), this.zze.zzc(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    final void zzg(zzice zziceVar) throws IOException {
        this.zzd.zzg(zziceVar);
        this.zze.zzg(zziceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzi() {
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            if (!zzifsVar.next().zzi()) {
                return zzigt.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final boolean zzj(zzicn zzicnVar) {
        zzick zzickVarZza;
        byte[] bArr = null;
        zzifs zzifsVar = new zzifs(this, bArr);
        zzick zzickVarZza2 = zzifsVar.next();
        zzifs zzifsVar2 = new zzifs(zzicnVar, bArr);
        zzick zzickVarZza3 = zzifsVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzb = zzickVarZza2.zzb() - i;
            int iZzb2 = zzickVarZza3.zzb() - i2;
            int iMin = Math.min(iZzb, iZzb2);
            if (!(i == 0 ? zzickVarZza2.zzk(zzickVarZza3, i2, iMin) : zzickVarZza3.zzk(zzickVarZza2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzb) {
                zzickVarZza = zzifsVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iZzb2) {
                zzickVarZza2 = zzickVarZza2;
                zzickVarZza2 = zzickVarZza;
                zzickVarZza3 = zzifsVar2.next();
                i2 = 0;
            } else {
                zzickVarZza2 = zzickVarZza2;
                zzickVarZza2 = zzickVarZza;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final int zzl(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzl(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzl(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzl(this.zzd.zzl(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    public final zzicr zzm() {
        ArrayList arrayList = new ArrayList();
        zzifs zzifsVar = new zzifs(this, null);
        while (zzifsVar.hasNext()) {
            arrayList.add(zzifsVar.next().zzf());
        }
        int i = zzicr.zze;
        return zzicr.zzH(new zzieh(arrayList), 4096);
    }

    final /* synthetic */ zzicn zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzicn
    /* JADX INFO: renamed from: zzr */
    public final zzici iterator() {
        return new zzifq(this);
    }
}
