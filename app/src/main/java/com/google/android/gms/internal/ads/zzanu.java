package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.internal.security.CertificateUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzanu implements zzane {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzant zzc;
    private final zzes zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzanu() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zzb(zzes zzesVar, Charset charset) {
        while (true) {
            String strZzN = zzesVar.zzN(charset);
            if (strZzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                while (true) {
                    String strZzN2 = zzesVar.zzN(charset);
                    if (strZzN2 == null || (zzesVar.zzd() != 0 && zzesVar.zzp(charset) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strZzN2.split(CertificateUtil.DELIMITER);
                    if (strArrSplit.length == 2) {
                        byte b = 0;
                        String strZza = zzgsf.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzanv zzanvVarZza = null;
                while (true) {
                    String strZzN3 = zzesVar.zzN(charset);
                    if (strZzN3 != null && (zzesVar.zzd() == 0 || zzesVar.zzp(charset) != 91)) {
                        if (strZzN3.startsWith("Format:")) {
                            zzanvVarZza = zzanv.zza(strZzN3);
                        } else if (strZzN3.startsWith("Style:")) {
                            if (zzanvVarZza == null) {
                                zzef.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                            } else {
                                zzanx zzanxVarZza = zzanx.zza(strZzN3, zzanvVarZza);
                                if (zzanxVarZza != null) {
                                    linkedHashMap.put(zzanxVarZza.zza, zzanxVarZza);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                zzef.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                return;
            }
        }
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = zzfk.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0316 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzant zzantVarZza;
        zzant zzantVar;
        int i3;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        Integer num;
        int i7;
        zzanu zzanuVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzes zzesVar = zzanuVar.zzd;
        zzesVar.zzb(bArr, i + i2);
        zzesVar.zzh(i);
        Charset charsetZzR = zzesVar.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        if (zzanuVar.zzb) {
            zzantVarZza = zzanuVar.zzc;
        } else {
            zzanuVar.zzb(zzesVar, charsetZzR);
            zzantVarZza = null;
        }
        while (true) {
            String strZzN = zzesVar.zzN(charsetZzR);
            if (strZzN == null) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    List list = (List) arrayList.get(i8);
                    if (!list.isEmpty()) {
                        if (i8 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i8)).longValue();
                        zzdsVar.zza(new zzamw(list, jLongValue, ((Long) arrayList2.get(i8 + 1)).longValue() - jLongValue));
                    } else if (i8 == 0) {
                        i8 = 0;
                        if (i8 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i8)).longValue();
                        zzdsVar.zza(new zzamw(list, jLongValue2, ((Long) arrayList2.get(i8 + 1)).longValue() - jLongValue2));
                    }
                    i8++;
                }
                return;
            }
            if (strZzN.startsWith("Format:")) {
                zzantVarZza = zzant.zza(strZzN);
            } else {
                if (strZzN.startsWith("Dialogue:")) {
                    if (zzantVarZza == null) {
                        zzef.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzN));
                    } else {
                        zzgsw.zza(strZzN.startsWith("Dialogue:"));
                        String strSubstring = strZzN.substring(9);
                        int i9 = zzantVarZza.zzf;
                        String[] strArrSplit = strSubstring.split(",", i9);
                        if (strArrSplit.length != i9) {
                            zzef.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzN));
                        } else {
                            int i10 = zzantVarZza.zza;
                            if (i10 != -1) {
                                try {
                                    i3 = Integer.parseInt(strArrSplit[i10].trim());
                                } catch (RuntimeException unused) {
                                    String str = strArrSplit[zzantVarZza.zza];
                                    String.valueOf(str);
                                    zzef.zzc("SsaParser", "Fail to parse layer: ".concat(String.valueOf(str)));
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jZzc = zzc(strArrSplit[zzantVarZza.zzb]);
                            if (jZzc == -9223372036854775807L) {
                                zzef.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                            } else {
                                long jZzc2 = zzc(strArrSplit[zzantVarZza.zzc]);
                                if (jZzc2 == -9223372036854775807L || jZzc2 <= jZzc) {
                                    zzantVar = zzantVarZza;
                                    zzesVar = zzesVar;
                                    zzef.zzc("SsaParser", "Skipping invalid timing: ".concat(strZzN));
                                } else {
                                    Map map = zzanuVar.zze;
                                    zzanx zzanxVar = (map == null || (i7 = zzantVarZza.zzd) == -1) ? null : (zzanx) map.get(strArrSplit[i7].trim());
                                    String str2 = strArrSplit[zzantVarZza.zze];
                                    zzanw zzanwVarZza = zzanw.zza(str2);
                                    String strReplace = zzanw.zzb(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzanuVar.zzf;
                                    float f2 = zzanuVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcw zzcwVar = new zzcw();
                                    zzcwVar.zza(spannableString);
                                    zzcwVar.zzq(i3);
                                    if (zzanxVar != null) {
                                        Integer num2 = zzanxVar.zzc;
                                        zzantVar = zzantVarZza;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzanxVar.zzj == 3 && (num = zzanxVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzanxVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzcwVar.zzl(f3 / f2, 1);
                                        }
                                        boolean z = zzanxVar.zzf;
                                        if (z && zzanxVar.zzg) {
                                            i5 = 0;
                                            i6 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i5 = 0;
                                            i6 = 33;
                                            if (z) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (zzanxVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (zzanxVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i6);
                                        }
                                        if (zzanxVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i6);
                                        }
                                    } else {
                                        zzantVar = zzantVarZza;
                                        zzesVar = zzesVar;
                                        f = f;
                                    }
                                    int i11 = zzanwVarZza.zza;
                                    if (i11 == -1) {
                                        i11 = zzanxVar != null ? zzanxVar.zzb : -1;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb.append("Unknown alignment: ");
                                            sb.append(i11);
                                            zzef.zzc("SsaParser", sb.toString());
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcwVar.zzd(alignment);
                                    int i12 = Integer.MIN_VALUE;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb2.append("Unknown alignment: ");
                                            sb2.append(i11);
                                            zzef.zzc("SsaParser", sb2.toString());
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    zzcwVar.zzj(i4);
                                    switch (i11) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 19);
                                            sb3.append("Unknown alignment: ");
                                            sb3.append(i11);
                                            zzef.zzc("SsaParser", sb3.toString());
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i12 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i12 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i12 = 0;
                                            break;
                                    }
                                    zzcwVar.zzg(i12);
                                    PointF pointF = zzanwVarZza.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                        zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                    } else {
                                        zzcwVar.zzi(pointF.x / f);
                                        zzcwVar.zzf(pointF.y / f2, 0);
                                    }
                                    zzcx zzcxVarZzr = zzcwVar.zzr();
                                    int iZze = zze(jZzc2, arrayList2, arrayList);
                                    for (int iZze2 = zze(jZzc, arrayList2, arrayList); iZze2 < iZze; iZze2++) {
                                        ((List) arrayList.get(iZze2)).add(zzcxVarZzr);
                                    }
                                }
                            }
                        }
                    }
                    zzantVar = zzantVarZza;
                    zzesVar = zzesVar;
                } else {
                    zzantVar = zzantVarZza;
                    zzesVar = zzesVar;
                }
                zzanuVar = this;
                charsetZzR = charsetZzR;
                zzantVarZza = zzantVar;
                zzesVar = zzesVar;
            }
        }
    }

    public zzanu(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzes();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzj = zzfk.zzj((byte[]) list.get(0));
        zzgsw.zza(strZzj.startsWith("Format:"));
        zzant zzantVarZza = zzant.zza(strZzj);
        zzantVarZza.getClass();
        this.zzc = zzantVarZza;
        zzb(new zzes((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
