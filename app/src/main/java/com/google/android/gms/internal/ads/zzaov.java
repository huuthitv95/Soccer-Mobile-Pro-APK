package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaov {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzaop zza(zzes zzesVar, List list) {
        String strZzN = zzesVar.zzN(StandardCharsets.UTF_8);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzesVar, list);
            }
            String strZzN2 = zzesVar.zzN(StandardCharsets.UTF_8);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzesVar, list);
                }
            }
        }
        return null;
    }

    static zzcw zzb(String str) {
        zzaou zzaouVar = new zzaou();
        zze(str, zzaouVar);
        return zzaouVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    static SpannedString zzc(String str, String str2, List list) {
        byte b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        spannableStringBuilder.append(Typography.less);
                    } else if (b == 1) {
                        spannableStringBuilder.append(Typography.greater);
                    } else if (b == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b != 3) {
                        StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 33);
                        sb.append("ignoring unsupported entity: '&");
                        sb.append(strSubstring);
                        sb.append(";'");
                        zzef.zzc("WebvttCueParser", sb.toString());
                    } else {
                        spannableStringBuilder.append(Typography.amp);
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                boolean z = str2.charAt(i2) == '/';
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (!z) {
                    i2 = length - 1;
                }
                String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzgsw.zza(!strTrim.isEmpty());
                    String str3 = zzfk.zza;
                    String str4 = strTrim.split("[ \\.]", 2)[0];
                    switch (str4) {
                        case "b":
                        case "c":
                        case "i":
                        case "lang":
                        case "ruby":
                        case "rt":
                        case "u":
                        case "v":
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    zzaos zzaosVar = (zzaos) arrayDeque.pop();
                                    zzf(str, zzaosVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzaor(zzaosVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzaosVar.zza.equals(str4)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                if (!z) {
                                    arrayDeque.push(zzaos.zza(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            i = length;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (zzaos) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, zzaos.zzb(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static zzaop zzd(String str, Matcher matcher, zzes zzesVar, List list) {
        zzaou zzaouVar = new zzaou();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            String str2 = strGroup;
            zzaouVar.zza = zzaox.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            String str3 = strGroup2;
            zzaouVar.zzb = zzaox.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzaouVar);
            StringBuilder sb = new StringBuilder();
            String strZzN = zzesVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzN.trim());
                strZzN = zzesVar.zzN(StandardCharsets.UTF_8);
            }
            zzaouVar.zzc = zzc(str, sb.toString(), list);
            return new zzaop(zzaouVar.zza().zzr(), zzaouVar.zza, zzaouVar.zzb);
        } catch (IllegalArgumentException unused) {
            String strGroup4 = matcher.group();
            String.valueOf(strGroup4);
            zzef.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(strGroup4)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x016e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(String str, zzaou zzaouVar) {
        byte b;
        byte b2;
        byte b3;
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    byte b4 = -1;
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b4 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b4 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b4 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b4 = 0;
                                }
                                break;
                        }
                        if (b4 == 0) {
                            i2 = 0;
                        } else if (b4 == 1 || b4 == 2) {
                            i2 = 1;
                        } else if (b4 != 3) {
                            String.valueOf(strSubstring);
                            zzef.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzaouVar.zzg = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzaouVar.zze = zzaox.zzb(strGroup2);
                        zzaouVar.zzf = 0;
                    } else {
                        zzaouVar.zze = Integer.parseInt(strGroup2);
                        zzaouVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                            b = 2;
                            break;
                        case "middle":
                            b = 3;
                            break;
                        case "end":
                            b = 4;
                            break;
                        case "left":
                            b = 1;
                            break;
                        case "right":
                            b = 5;
                            break;
                        case "start":
                            b = 0;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            i = 4;
                        } else if (b == 2 || b == 3) {
                            i = 2;
                        } else if (b == 4) {
                            i = 3;
                        } else if (b != 5) {
                            zzef.zzc("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                        } else {
                            i = 5;
                        }
                    }
                    zzaouVar.zzd = i;
                } else if (C11744X3.i.f26338L.equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2) {
                            case "line-left":
                                b3 = 0;
                                break;
                            case "center":
                                b3 = 2;
                                break;
                            case "line-right":
                                b3 = 4;
                                break;
                            case "middle":
                                b3 = 3;
                                break;
                            case "end":
                                b3 = 5;
                                break;
                            case "start":
                                b3 = 1;
                                break;
                            default:
                                b3 = -1;
                                break;
                        }
                        if (b3 == 0 || b3 == 1) {
                            i = 0;
                        } else if (b3 != 2 && b3 != 3) {
                            if (b3 == 4 || b3 == 5) {
                                i = 2;
                            } else {
                                String.valueOf(strSubstring2);
                                zzef.zzc("WebvttCueParser", "Invalid anchor value: ".concat(String.valueOf(strSubstring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzaouVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzaouVar.zzh = zzaox.zzb(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzaouVar.zzj = zzaox.zzb(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                    if (b2 != 0) {
                        if (b2 != 1) {
                            zzef.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzaouVar.zzk = i;
                } else {
                    StringBuilder sb = new StringBuilder(strGroup.length() + 21 + strGroup2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(strGroup);
                    sb.append(CertificateUtil.DELIMITER);
                    sb.append(strGroup2);
                    zzef.zzc("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strGroup3 = matcher.group();
                String.valueOf(strGroup3);
                zzef.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(strGroup3)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    private static void zzf(String str, zzaos zzaosVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b;
        int i = zzaosVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzaosVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals("c")) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals(C11540L6.f25004q)) {
                    b = 6;
                } else {
                    b = -1;
                }
            } else if (str2.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals("")) {
            b = 7;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 2:
                int iZzg = zzg(list2, str, zzaosVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzaor.zza);
                int i3 = i;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((zzaor) arrayList.get(i4)).zzc().zza)) {
                        zzaor zzaorVar = (zzaor) arrayList.get(i4);
                        int iZzg2 = zzg(list2, str, zzaorVar.zzc());
                        if (iZzg2 == i2) {
                            iZzg2 = iZzg != i2 ? iZzg : 1;
                        }
                        int i5 = zzaorVar.zzc().zzb - length2;
                        int iZzd = zzaorVar.zzd() - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, iZzd);
                        spannableStringBuilder.delete(i5, iZzd);
                        spannableStringBuilder.setSpan(new zzdc(charSequenceSubSequence.toString(), iZzg2), i3, i5, 33);
                        length2 += charSequenceSubSequence.length();
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : zzaosVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzdf(zzaosVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzh = zzh(list2, str, zzaosVar);
        for (int i6 = 0; i6 < listZzh.size(); i6++) {
            zzaoo zzaooVar = ((zzaot) listZzh.get(i6)).zzb;
            if (zzaooVar != null) {
                if (zzaooVar.zzf() != -1) {
                    zzdd.zza(spannableStringBuilder, new StyleSpan(zzaooVar.zzf()), i, length, 33);
                }
                if (zzaooVar.zzg()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzaooVar.zzo()) {
                    zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaooVar.zzm()), i, length, 33);
                }
                if (zzaooVar.zzr()) {
                    zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaooVar.zzp()), i, length, 33);
                }
                if (zzaooVar.zzk() != null) {
                    zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaooVar.zzk()), i, length, 33);
                }
                int iZzu = zzaooVar.zzu();
                if (iZzu == 1) {
                    zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaooVar.zzv(), true), i, length, 33);
                } else if (iZzu == 2) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaooVar.zzv()), i, length, 33);
                } else if (iZzu == 3) {
                    zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaooVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzaooVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzdb(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzaos zzaosVar) {
        List listZzh = zzh(list, str, zzaosVar);
        for (int i = 0; i < listZzh.size(); i++) {
            zzaoo zzaooVar = ((zzaot) listZzh.get(i)).zzb;
            if (zzaooVar.zzx() != -1) {
                return zzaooVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzaos zzaosVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzaoo zzaooVar = (zzaoo) list.get(i);
            int iZze = zzaooVar.zze(str, zzaosVar.zza, zzaosVar.zzd, zzaosVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzaot(iZze, zzaooVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
