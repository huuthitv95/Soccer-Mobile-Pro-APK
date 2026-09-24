package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzagi {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfk.zza;
            String str3 = strGroup;
            int i = Integer.parseInt(strGroup, 16);
            String strGroup2 = matcher.group(2);
            String str4 = strGroup2;
            int i2 = Integer.parseInt(strGroup2, 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.zza = i;
            this.zzb = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgvz zzgvzVarZze = zzapVar.zze(zzajb.class, zzagh.zza);
        int size = zzgvzVarZze.size();
        int i = 0;
        while (i < size) {
            boolean zZzc = zzc(((zzajb) zzgvzVarZze.get(i)).zzc);
            i++;
            if (zZzc) {
                return true;
            }
        }
        zzgvz zzgvzVarZze2 = zzapVar.zze(zzajj.class, zzagg.zza);
        int size2 = zzgvzVarZze2.size();
        int i2 = 0;
        while (i2 < size2) {
            boolean zZzc2 = zzc(((zzajj) zzgvzVarZze2.get(i2)).zzc);
            i2++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
