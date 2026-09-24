package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagk {
    private final zzes zza = new zzes(10);

    private final boolean zzb(zzafq zzafqVar, int i) throws IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    zzes zzesVar = this.zza;
                    System.arraycopy(zzesVar.zzi(), 10, zzesVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                zzes zzesVar2 = this.zza;
                int i6 = i4 + 10;
                zzafqVar.zzi(zzesVar2.zzi(), i6 - i5, i5);
                zzesVar2.zzh(i2);
                zzesVar2.zzf(i6);
                if (zzesVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzagn.zza(zzesVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzesVar2.zzc(20);
                }
                i3++;
            } catch (EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final zzap zza(zzafq zzafqVar, zzajd zzajdVar, int i) throws IOException {
        zzap zzapVarZza = null;
        int i2 = 0;
        while (zzb(zzafqVar, i)) {
            zzes zzesVar = this.zza;
            int iZzg = zzesVar.zzg();
            zzesVar.zzk(6);
            int iZzG = zzesVar.zzG();
            int i3 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(zzesVar.zzi(), iZzg, bArr, 0, 10);
                zzafqVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzajg.zza(bArr, i3, zzajdVar, new zzair());
            } else {
                zzafqVar.zzk(iZzG);
            }
            i2 += i3;
        }
        zzafqVar.zzl();
        zzafqVar.zzk(i2);
        return zzapVarZza;
    }
}
