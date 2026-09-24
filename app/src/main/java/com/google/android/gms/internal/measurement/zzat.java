package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0178  */
    /* JADX WARN: Code duplicated, block: B:105:0x018d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01da  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x0201  */
    /* JADX WARN: Code duplicated, block: B:118:0x021b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0225  */
    /* JADX WARN: Code duplicated, block: B:122:0x023d  */
    /* JADX WARN: Code duplicated, block: B:125:0x026c  */
    /* JADX WARN: Code duplicated, block: B:127:0x027e  */
    /* JADX WARN: Code duplicated, block: B:129:0x028e  */
    /* JADX WARN: Code duplicated, block: B:131:0x029a  */
    /* JADX WARN: Code duplicated, block: B:132:0x029f  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:146:0x0304  */
    /* JADX WARN: Code duplicated, block: B:149:0x030b  */
    /* JADX WARN: Code duplicated, block: B:151:0x030f A[LOOP:0: B:150:0x030d->B:151:0x030f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0322  */
    /* JADX WARN: Code duplicated, block: B:156:0x0336  */
    /* JADX WARN: Code duplicated, block: B:157:0x034a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0354  */
    /* JADX WARN: Code duplicated, block: B:161:0x0361  */
    /* JADX WARN: Code duplicated, block: B:164:0x0371  */
    /* JADX WARN: Code duplicated, block: B:165:0x0384  */
    /* JADX WARN: Code duplicated, block: B:168:0x0393  */
    /* JADX WARN: Code duplicated, block: B:169:0x039e  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:174:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:181:0x0405  */
    /* JADX WARN: Code duplicated, block: B:183:0x0417  */
    /* JADX WARN: Code duplicated, block: B:185:0x042d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0441  */
    /* JADX WARN: Code duplicated, block: B:190:0x0445  */
    /* JADX WARN: Code duplicated, block: B:193:0x0497  */
    /* JADX WARN: Code duplicated, block: B:195:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:201:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:203:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:206:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:209:0x0510  */
    /* JADX WARN: Code duplicated, block: B:210:0x0513  */
    /* JADX WARN: Code duplicated, block: B:213:0x052c  */
    /* JADX WARN: Code duplicated, block: B:214:0x052f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0543  */
    /* JADX WARN: Code duplicated, block: B:220:0x055a  */
    /* JADX WARN: Code duplicated, block: B:223:0x0571  */
    /* JADX WARN: Code duplicated, block: B:224:0x0573  */
    /* JADX WARN: Code duplicated, block: B:227:0x059a  */
    /* JADX WARN: Code duplicated, block: B:229:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:231:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:241:0x05df  */
    /* JADX WARN: Code duplicated, block: B:243:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:246:0x05f9 A[LOOP:1: B:244:0x05f3->B:246:0x05f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x0618  */
    /* JADX WARN: Code duplicated, block: B:252:0x062a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0643  */
    /* JADX WARN: Code duplicated, block: B:266:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:82:0x0129  */
    /* JADX WARN: Code duplicated, block: B:84:0x012f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x013d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Code duplicated, block: B:90:0x0148  */
    /* JADX WARN: Code duplicated, block: B:91:0x014b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0153  */
    /* JADX WARN: Code duplicated, block: B:95:0x0158  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0164 A[PHI: r3 r6
  0x0164: PHI (r3v50 java.lang.String) = (r3v2 java.lang.String), (r3v51 java.lang.String) binds: [B:96:0x0160, B:44:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r6v53 java.lang.String) = (r6v1 java.lang.String), (r6v54 java.lang.String) binds: [B:96:0x0160, B:44:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        String strZzi;
        String str5;
        int iZza;
        zzat zzatVar;
        StringBuilder sb;
        int i3;
        String str6;
        zzap zzapVarZzb;
        int i4;
        double dDoubleValue;
        int i5;
        double dDoubleValue2;
        double dZza;
        String strZzi2;
        zzap zzapVarZza;
        String str7;
        String str8;
        int iIndexOf;
        int i6;
        String str9;
        double dDoubleValue3;
        double dZza2;
        double dMin;
        double length;
        double dZza3;
        double dMin2;
        String str10;
        ArrayList arrayList;
        String strZzi3;
        long jZzd;
        String[] strArrSplit;
        int length2;
        int i7;
        int i8;
        boolean zIsEmpty;
        int i9;
        String str11;
        zzg zzgVar2;
        int iZza2;
        int length3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            i = 0;
            if (!str2.equals(str)) {
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str3 = "charAt";
                    str4 = r3;
                    if (str.equals(str4)) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                    break;
                case -1776922004:
                    str3 = "charAt";
                    if (str.equals("toString")) {
                        i2 = 14;
                        str4 = r3;
                    }
                    str4 = "hasOwnProperty";
                    i2 = -1;
                    break;
                case -1464939364:
                    str3 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        i2 = 12;
                        str4 = r3;
                    }
                    str4 = "hasOwnProperty";
                    i2 = -1;
                    break;
                case -1361633751:
                    str3 = "charAt";
                    if (str.equals(str3)) {
                        i2 = i;
                        str4 = r3;
                    }
                    str4 = "hasOwnProperty";
                    i2 = -1;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        str3 = "charAt";
                        str4 = r3;
                        i2 = 1;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        i2 = 13;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        i2 = 7;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        i2 = 11;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        i2 = 4;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        i2 = 15;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        i2 = 16;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        i2 = 5;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        i2 = 8;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        i2 = 9;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        i2 = 10;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        i2 = 6;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        i2 = 3;
                        str3 = "charAt";
                        str4 = r3;
                    } else {
                        str3 = "charAt";
                        str4 = "hasOwnProperty";
                        i2 = -1;
                    }
                    break;
                default:
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                    break;
            }
            strZzi = AdError.UNDEFINED_DOMAIN;
            str5 = str3;
            switch (i2) {
                case 0:
                    zzh.zzj(str5, 1, list);
                    if (list.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    String str12 = this.zza;
                    return (iZza >= 0 || iZza >= str12.length()) ? zzap.zzm : new zzat(String.valueOf(str12.charAt(iZza)));
                case 1:
                    zzatVar = this;
                    if (!list.isEmpty()) {
                        sb = new StringBuilder(zzatVar.zza);
                        for (i3 = 0; i3 < list.size(); i3++) {
                            sb.append(zzgVar.zzb((zzap) list.get(i3)).zzi());
                        }
                        return new zzat(sb.toString());
                    }
                    return zzatVar;
                case 2:
                    zzh.zzh(str4, 1, list);
                    str6 = this.zza;
                    zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                    if ("length".equals(zzapVarZzb.zzi())) {
                        return zzaf.zzk;
                    }
                    double dDoubleValue4 = zzapVarZzb.zzh().doubleValue();
                    return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i4 = (int) dDoubleValue4) < 0 || i4 >= str6.length()) ? zzaf.zzl : zzaf.zzk;
                case 3:
                    zzh.zzj("indexOf", 2, list);
                    String str13 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    String str14 = strZzi;
                    if (list.size() < 2) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    }
                    return new zzah(Double.valueOf(str13.indexOf(str14, (int) zzh.zza(dDoubleValue))));
                case 4:
                    i5 = i;
                    zzh.zzj("lastIndexOf", 2, list);
                    String str15 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(i5)).zzi();
                    }
                    String str16 = strZzi;
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dZza = Double.POSITIVE_INFINITY;
                    } else {
                        dZza = zzh.zza(dDoubleValue2);
                    }
                    return new zzah(Double.valueOf(str15.lastIndexOf(str16, (int) dZza)));
                case 5:
                    zzh.zzj("match", 1, list);
                    String str17 = this.zza;
                    if (list.size() <= 0) {
                        strZzi2 = "";
                    } else {
                        strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    Matcher matcher = Pattern.compile(strZzi2).matcher(str17);
                    return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
                case 6:
                    zzatVar = this;
                    zzh.zzj("replace", 2, list);
                    zzapVarZza = zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                        }
                    }
                    str7 = strZzi;
                    str8 = zzatVar.zza;
                    iIndexOf = str8.indexOf(str7);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof zzai) {
                            zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str7), new zzah(Double.valueOf(iIndexOf)), zzatVar));
                        }
                        return new zzat(str8.substring(0, iIndexOf) + zzapVarZza.zzi() + str8.substring(iIndexOf + str7.length()));
                    }
                    return zzatVar;
                case 7:
                    i6 = i;
                    zzh.zzj("search", 1, list);
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(i6)).zzi();
                    }
                    Matcher matcher2 = Pattern.compile(strZzi).matcher(this.zza);
                    return matcher2.find() ? new zzah(Double.valueOf(matcher2.start())) : new zzah(Double.valueOf(-1.0d));
                case 8:
                    zzh.zzj("slice", 2, list);
                    str9 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                    }
                    dZza2 = zzh.zza(dDoubleValue3);
                    if (dZza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dMin = Math.max(((double) str9.length()) + dZza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    } else {
                        dMin = Math.min(dZza2, str9.length());
                    }
                    if (list.size() > 1) {
                        length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                    } else {
                        length = str9.length();
                    }
                    dZza3 = zzh.zza(length);
                    if (dZza3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dMin2 = Math.max(((double) str9.length()) + dZza3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    } else {
                        dMin2 = Math.min(dZza3, str9.length());
                    }
                    int i10 = (int) dMin;
                    return new zzat(str9.substring(i10, Math.max(0, ((int) dMin2) - i10) + i10));
                case 9:
                    zzh.zzj("split", 2, list);
                    str10 = this.zza;
                    if (str10.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                        } else {
                            jZzd = 2147483647L;
                        }
                        if (jZzd == 0) {
                            return new zzae();
                        }
                        strArrSplit = str10.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                        length2 = strArrSplit.length;
                        if (strZzi3.isEmpty() || length2 <= 0) {
                            i7 = length2;
                            i8 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i7 = length2 - 1;
                            if (!strArrSplit[i7].isEmpty()) {
                                i8 = zIsEmpty;
                                i7 = length2;
                                i8 = zIsEmpty;
                            }
                        }
                        i8 = zIsEmpty;
                        if (length2 > jZzd) {
                            i7--;
                        }
                        while (i8 < i7) {
                            arrayList.add(new zzat(strArrSplit[i8]));
                            i8++;
                        }
                    }
                    return new zzae(arrayList);
                case 10:
                    i9 = i;
                    zzh.zzj("substring", 2, list);
                    str11 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZza2 = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(i9)).zzh().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        length3 = str11.length();
                    }
                    int iMin = Math.min(Math.max(iZza2, 0), str11.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str11.length());
                    return new zzat(str11.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 11:
                    zzh.zzh(str2, i, list);
                    return new zzat(this.zza.toUpperCase());
                case 12:
                    zzh.zzh("toLocaleLowerCase", i, list);
                    return new zzat(this.zza.toLowerCase());
                case 13:
                    zzh.zzh("toLowerCase", i, list);
                    return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzh.zzh("toString", i, list);
                    return this;
                case 15:
                    zzh.zzh("toUpperCase", i, list);
                    return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zzh("toUpperCase", i, list);
                    return new zzat(this.zza.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        i = 0;
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = r3;
                if (str.equals(str4)) {
                    i2 = 2;
                } else {
                    i2 = -1;
                }
                break;
            case -1776922004:
                str3 = "charAt";
                if (str.equals("toString")) {
                    i2 = 14;
                    str4 = r3;
                }
                str4 = "hasOwnProperty";
                i2 = -1;
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    i2 = 12;
                    str4 = r3;
                }
                str4 = "hasOwnProperty";
                i2 = -1;
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    i2 = i;
                    str4 = r3;
                }
                str4 = "hasOwnProperty";
                i2 = -1;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str3 = "charAt";
                    str4 = r3;
                    i2 = 1;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    i2 = 13;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case -906336856:
                if (str.equals("search")) {
                    i2 = 7;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case -726908483:
                if (str.equals(str2)) {
                    i2 = 11;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    i2 = 4;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    i2 = 15;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 3568674:
                if (str.equals("trim")) {
                    i2 = 16;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 103668165:
                if (str.equals("match")) {
                    i2 = 5;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    i2 = 8;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 109648666:
                if (str.equals("split")) {
                    i2 = 9;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 530542161:
                if (str.equals("substring")) {
                    i2 = 10;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    i2 = 6;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    i2 = 3;
                    str3 = "charAt";
                    str4 = r3;
                } else {
                    str3 = "charAt";
                    str4 = "hasOwnProperty";
                    i2 = -1;
                }
                break;
            default:
                str3 = "charAt";
                str4 = "hasOwnProperty";
                i2 = -1;
                break;
        }
        strZzi = AdError.UNDEFINED_DOMAIN;
        str5 = str3;
        switch (i2) {
            case 0:
                zzh.zzj(str5, 1, list);
                if (list.isEmpty()) {
                    iZza = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                } else {
                    iZza = 0;
                }
                String str18 = this.zza;
                if (iZza >= 0) {
                }
                break;
            case 1:
                zzatVar = this;
                if (!list.isEmpty()) {
                    sb = new StringBuilder(zzatVar.zza);
                    while (i3 < list.size()) {
                        sb.append(zzgVar.zzb((zzap) list.get(i3)).zzi());
                    }
                    return new zzat(sb.toString());
                }
                return zzatVar;
            case 2:
                zzh.zzh(str4, 1, list);
                str6 = this.zza;
                zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                if ("length".equals(zzapVarZzb.zzi())) {
                    return zzaf.zzk;
                }
                double dDoubleValue5 = zzapVarZzb.zzh().doubleValue();
                if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                }
                break;
            case 3:
                zzh.zzj("indexOf", 2, list);
                String str19 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                String str110 = strZzi;
                if (list.size() < 2) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                return new zzah(Double.valueOf(str19.indexOf(str110, (int) zzh.zza(dDoubleValue))));
            case 4:
                i5 = i;
                zzh.zzj("lastIndexOf", 2, list);
                String str111 = this.zza;
                if (list.size() > 0) {
                    strZzi = zzgVar.zzb((zzap) list.get(i5)).zzi();
                }
                String str112 = strZzi;
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dZza = Double.POSITIVE_INFINITY;
                } else {
                    dZza = zzh.zza(dDoubleValue2);
                }
                return new zzah(Double.valueOf(str111.lastIndexOf(str112, (int) dZza)));
            case 5:
                zzh.zzj("match", 1, list);
                String str113 = this.zza;
                if (list.size() <= 0) {
                    strZzi2 = "";
                } else {
                    strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                }
                Matcher matcher3 = Pattern.compile(strZzi2).matcher(str113);
                if (matcher3.find()) {
                }
            case 6:
                zzatVar = this;
                zzh.zzj("replace", 2, list);
                zzapVarZza = zzap.zzf;
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                    }
                }
                str7 = strZzi;
                str8 = zzatVar.zza;
                iIndexOf = str8.indexOf(str7);
                if (iIndexOf >= 0) {
                    if (zzapVarZza instanceof zzai) {
                        zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str7), new zzah(Double.valueOf(iIndexOf)), zzatVar));
                    }
                    return new zzat(str8.substring(0, iIndexOf) + zzapVarZza.zzi() + str8.substring(iIndexOf + str7.length()));
                }
                return zzatVar;
            case 7:
                i6 = i;
                zzh.zzj("search", 1, list);
                if (!list.isEmpty()) {
                    strZzi = zzgVar.zzb((zzap) list.get(i6)).zzi();
                }
                Matcher matcher4 = Pattern.compile(strZzi).matcher(this.zza);
                if (matcher4.find()) {
                }
            case 8:
                zzh.zzj("slice", 2, list);
                str9 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZza2 = zzh.zza(dDoubleValue3);
                if (dZza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dMin = Math.max(((double) str9.length()) + dZza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                } else {
                    dMin = Math.min(dZza2, str9.length());
                }
                if (list.size() > 1) {
                    length = zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue();
                } else {
                    length = str9.length();
                }
                dZza3 = zzh.zza(length);
                if (dZza3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dMin2 = Math.max(((double) str9.length()) + dZza3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                } else {
                    dMin2 = Math.min(dZza3, str9.length());
                }
                int i11 = (int) dMin;
                return new zzat(str9.substring(i11, Math.max(0, ((int) dMin2) - i11) + i11));
            case 9:
                zzh.zzj("split", 2, list);
                str10 = this.zza;
                if (str10.length() == 0) {
                    return new zzae(Arrays.asList(this));
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzi3 = zzgVar.zzb((zzap) list.get(0)).zzi();
                    if (list.size() > 1) {
                        jZzd = zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    } else {
                        jZzd = 2147483647L;
                    }
                    if (jZzd == 0) {
                        return new zzae();
                    }
                    strArrSplit = str10.split(Pattern.quote(strZzi3), ((int) jZzd) + 1);
                    length2 = strArrSplit.length;
                    if (strZzi3.isEmpty()) {
                        i7 = length2;
                        i8 = 0;
                    } else {
                        i7 = length2;
                        i8 = 0;
                    }
                    i8 = zIsEmpty;
                    if (length2 > jZzd) {
                        i7--;
                    }
                    while (i8 < i7) {
                        arrayList.add(new zzat(strArrSplit[i8]));
                        i8++;
                    }
                }
                return new zzae(arrayList);
            case 10:
                i9 = i;
                zzh.zzj("substring", 2, list);
                str11 = this.zza;
                if (list.isEmpty()) {
                    zzgVar2 = zzgVar;
                    iZza2 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(i9)).zzh().doubleValue());
                } else {
                    zzgVar2 = zzgVar;
                    iZza2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue());
                } else {
                    length3 = str11.length();
                }
                int iMin3 = Math.min(Math.max(iZza2, 0), str11.length());
                int iMin4 = Math.min(Math.max(length3, 0), str11.length());
                return new zzat(str11.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
            case 11:
                zzh.zzh(str2, i, list);
                return new zzat(this.zza.toUpperCase());
            case 12:
                zzh.zzh("toLocaleLowerCase", i, list);
                return new zzat(this.zza.toLowerCase());
            case 13:
                zzh.zzh("toLowerCase", i, list);
                return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
            case 14:
                zzh.zzh("toString", i, list);
                return this;
            case 15:
                zzh.zzh("toUpperCase", i, list);
                return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
            case 16:
                zzh.zzh("toUpperCase", i, list);
                return new zzat(this.zza.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
