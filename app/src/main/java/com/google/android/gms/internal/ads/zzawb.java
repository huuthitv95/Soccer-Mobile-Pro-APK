package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzawb implements Comparator {
    private final boolean zza;

    public zzawb(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 496612959;
        zzawf zzawfVar = (zzawf) obj;
        zzawf zzawfVar2 = (zzawf) obj2;
        int i11 = zzawfVar.zza;
        if (i11 != zzawfVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ i9;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzawfVar.zzl() != zzawfVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzawfVar.zzm(), zzawfVar2.zzm());
                case 3:
                    comparatorZza = zzavj.zzc;
                    objZzn = zzawfVar.zzn();
                    objZzn2 = zzawfVar2.zzn();
                    break;
                case 4:
                    objZzn = zzawfVar.zzo();
                    objZzn2 = zzawfVar2.zzo();
                    comparatorZza = zzgvj.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzawfVar.zzp() != zzawfVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzawfVar.zzq(), zzawfVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzawc e) {
            throw new AssertionError(zzavh.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
