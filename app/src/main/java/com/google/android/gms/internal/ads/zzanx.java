package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanx {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzanx(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static zzanx zza(String str, zzanv zzanvVar) {
        zzanx zzanxVar;
        boolean z;
        boolean z2;
        int i;
        zzgsw.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = zzanvVar.zzk;
        if (length != i2) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(length), str};
            String str2 = zzfk.zza;
            zzef.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String strTrim = strArrSplit[zzanvVar.zza].trim();
            int i3 = zzanvVar.zzb;
            int iZzd = i3 != -1 ? zzd(strArrSplit[i3].trim()) : -1;
            int i4 = zzanvVar.zzc;
            Integer numZzb = i4 != -1 ? zzb(strArrSplit[i4].trim()) : null;
            int i5 = zzanvVar.zzd;
            Integer numZzb2 = i5 != -1 ? zzb(strArrSplit[i5].trim()) : null;
            int i6 = zzanvVar.zze;
            float f = -3.4028235E38f;
            if (i6 != -1) {
                zzanxVar = null;
                try {
                    String strTrim2 = strArrSplit[i6].trim();
                    try {
                        f = Float.parseFloat(strTrim2);
                    } catch (NumberFormatException e) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                        sb.append("Failed to parse font size: '");
                        sb.append(strTrim2);
                        sb.append("'");
                        zzef.zzd("SsaStyle", sb.toString(), e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    StringBuilder sb2 = new StringBuilder(str.length() + 36);
                    sb2.append("Skipping malformed 'Style:' line: '");
                    sb2.append(str);
                    sb2.append("'");
                    zzef.zzd("SsaStyle", sb2.toString(), e);
                    return zzanxVar;
                }
            } else {
                zzanxVar = null;
            }
            int i7 = zzanvVar.zzf;
            boolean z3 = i7 != -1 && zze(strArrSplit[i7].trim());
            int i8 = zzanvVar.zzg;
            boolean z4 = i8 != -1 && zze(strArrSplit[i8].trim());
            int i9 = zzanvVar.zzh;
            if (i9 == -1 || !zze(strArrSplit[i9].trim())) {
                z = false;
                z2 = false;
            } else {
                z = false;
                z2 = true;
            }
            int i10 = zzanvVar.zzi;
            if (i10 != -1 && zze(strArrSplit[i10].trim())) {
                z = true;
            }
            int i11 = zzanvVar.zzj;
            if (i11 != -1) {
                String strTrim3 = strArrSplit[i11].trim();
                try {
                    int i12 = Integer.parseInt(strTrim3.trim());
                    if (i12 == 1 || i12 == 3) {
                        i = i12;
                    } else {
                        String.valueOf(strTrim3);
                        zzef.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                        i = -1;
                    }
                } catch (NumberFormatException unused) {
                }
            } else {
                i = -1;
            }
            new zzanx(strTrim, iZzd, numZzb, numZzb2, f, z3, z4, z2, z, i);
            return r5;
        } catch (RuntimeException e3) {
            e = e3;
            zzanxVar = null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgsw.zza(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgzt.zza(((j >> 24) & 255) ^ 255), zzgzt.zza(j & 255), zzgzt.zza((j >> 8) & 255), zzgzt.zza((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzef.zzd("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i;
                default:
                    String.valueOf(str);
                    zzef.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }

    private static boolean zze(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzef.zzd("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
