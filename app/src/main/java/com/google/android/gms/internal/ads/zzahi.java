package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahi {
    public final List zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    private zzahi(List list, int i, String str, int i2) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
        this.zzd = i2;
    }

    public static zzahi zza(zzes zzesVar) throws zzat {
        int iZzs;
        int iZzs2;
        int i;
        int i2;
        int i3;
        try {
            if (zzesVar.zzB() != 0) {
                throw zzat.zzb("Unsupported VVC version", null);
            }
            int iZzs3 = zzesVar.zzs();
            int i4 = iZzs3 >> 1;
            int i5 = 1;
            String str = "L";
            if ((iZzs3 & 1) != 0) {
                zzesVar.zzk(1);
                int iZzs4 = zzesVar.zzs() >> 4;
                iZzs = zzesVar.zzs() >> 5;
                int iZzs5 = zzesVar.zzs() & 63;
                int iZzs6 = zzesVar.zzs();
                i = iZzs6 >> 1;
                str = (iZzs6 & 1) != 0 ? "H" : "L";
                iZzs2 = zzesVar.zzs();
                zzesVar.zzk(iZzs5);
                int i6 = iZzs4 & 7;
                if (i6 > 1) {
                    int iZzs7 = zzesVar.zzs();
                    for (int i7 = 0; i7 < i6 - 1; i7++) {
                        if (((iZzs7 >> (7 - i7)) & 1) != 0) {
                            zzesVar.zzk(1);
                        }
                    }
                }
                zzesVar.zzk(zzesVar.zzs() * 4);
                zzesVar.zzk(6);
            } else {
                iZzs = 0;
                iZzs2 = 0;
                i = 0;
            }
            int iZzs8 = zzesVar.zzs();
            int iZzg = zzesVar.zzg();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                i2 = 12;
                i3 = 13;
                if (i8 >= iZzs8) {
                    break;
                }
                int iZzs9 = zzesVar.zzs() & 31;
                int iZzt = (iZzs9 == 13 || iZzs9 == 12) ? 1 : zzesVar.zzt();
                for (int i10 = 0; i10 < iZzt; i10++) {
                    int iZzt2 = zzesVar.zzt();
                    i9 += iZzt2 + 4;
                    zzesVar.zzk(iZzt2);
                }
                i8++;
            }
            zzesVar.zzh(iZzg);
            byte[] bArr = new byte[i9];
            int i11 = 0;
            int i12 = 0;
            while (i11 < iZzs8) {
                int iZzs10 = zzesVar.zzs() & 31;
                int iZzt3 = (iZzs10 == i3 || iZzs10 == i2) ? i5 : zzesVar.zzt();
                int i13 = i5;
                for (int i14 = 0; i14 < iZzt3; i14++) {
                    int iZzt4 = zzesVar.zzt();
                    System.arraycopy(zzgo.zza, 0, bArr, i12, 4);
                    int i15 = i12 + 4;
                    zzesVar.zzm(bArr, i15, iZzt4);
                    i12 = i15 + iZzt4;
                }
                i11++;
                i5 = i13;
                i2 = 12;
                i3 = 13;
            }
            int i16 = i5;
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(iZzs2);
            Object[] objArr = new Object[3];
            objArr[0] = numValueOf;
            objArr[i16] = str;
            objArr[2] = numValueOf2;
            return new zzahi(zzgvz.zzj(bArr), (i4 & 3) + 1, String.format(locale, "vvc1.%d.%s%d", objArr), iZzs + 8);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing VVC configuration", e);
        }
    }
}
