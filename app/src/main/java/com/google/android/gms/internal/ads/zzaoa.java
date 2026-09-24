package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoa {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgwj zze = zzgwj.zzj("auto", "none");
    private static final zzgwj zzf = zzgwj.zzk("dot", "sesame", "circle");
    private static final zzgwj zzg = zzgwj.zzj("filled", "open");
    private static final zzgwj zzh = zzgwj.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaoa(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static zzaoa zza(String str) {
        byte b;
        int i;
        if (str == null) {
            return null;
        }
        String strZza = zzgsf.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzgwj zzgwjVarZzq = zzgwj.zzq(TextUtils.split(strZza, zzd));
        String str2 = (String) zzgwn.zzb(zzgyj.zza(zzh, zzgwjVarZzq), "outside");
        int iHashCode = str2.hashCode();
        int i2 = -1;
        int i3 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str2.equals("outside")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        zzgyi zzgyiVarZza = zzgyj.zza(zze, zzgwjVarZzq);
        if (zzgyiVarZza.isEmpty()) {
            zzgyi zzgyiVarZza2 = zzgyj.zza(zzg, zzgwjVarZzq);
            zzgyi zzgyiVarZza3 = zzgyj.zza(zzf, zzgwjVarZzq);
            if (!zzgyiVarZza2.isEmpty() || !zzgyiVarZza3.isEmpty()) {
                String str3 = (String) zzgwn.zzb(zzgyiVarZza2, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzgwn.zzb(zzgyiVarZza3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i2 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    i2 = 2;
                } else if (i2 != 1) {
                    i3 = i4;
                    i2 = 1;
                } else {
                    i2 = 3;
                }
                i3 = i4;
            }
        } else {
            String str5 = (String) zzgyiVarZza.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            }
        }
        return new zzaoa(i2, i3, i);
    }
}
