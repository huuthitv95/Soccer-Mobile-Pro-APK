package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdp {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgvz zza(byte b, byte b2, byte b3, byte b4) {
        return zzgvz.zzj(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzfk.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzgsw.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzgsw.zzd(b == 1, "Invalid APV CSD version: %s", b);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfk.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02a6 A[PHI: r21
  0x02a6: PHI (r21v15 int) = 
  (r21v1 int)
  (r21v2 int)
  (r21v3 int)
  (r21v4 int)
  (r21v5 int)
  (r21v6 int)
  (r21v7 int)
  (r21v8 int)
  (r21v9 int)
  (r21v10 int)
  (r21v11 int)
  (r21v12 int)
  (r21v13 int)
  (r21v16 int)
 binds: [B:149:0x02a1, B:146:0x0294, B:143:0x0288, B:140:0x027c, B:137:0x0270, B:134:0x0264, B:131:0x0258, B:128:0x024a, B:125:0x023c, B:122:0x022f, B:119:0x0222, B:116:0x0215, B:113:0x0208, B:111:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x036d  */
    /* JADX WARN: Code duplicated, block: B:355:0x066c  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v106 int, still in use, count: 1, list:
  (r1v106 int) from 0x0067: IF  (r1v106 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v106 int, still in use, count: 1, list:
  (r1v106 int) from 0x0067: IF  (r1v106 int) != (1567 int)  -> B:20:0x0069 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zze(zzv zzvVar) {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer numValueOf;
        int i8;
        int i9;
        int i10;
        int i11;
        Integer num;
        Integer num2;
        String str = zzvVar.zzk;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i12 = 16;
        int i13 = 8;
        int i14 = 3;
        int i15 = 2;
        if ("video/dolby-vision".equals(zzvVar.zzp)) {
            if (strArrSplit.length < 3) {
                zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            Matcher matcher = zzd.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                num = null;
            } else {
                if (strGroup.hashCode() != 1567) {
                    switch (strGroup) {
                        case "00":
                            num = 1;
                            break;
                        case "01":
                            num = 2;
                            break;
                        case "02":
                            num = 4;
                            break;
                        case "03":
                            num = 8;
                            break;
                        case "04":
                            num = 16;
                            break;
                        case "05":
                            num = 32;
                            break;
                        case "06":
                            num = 64;
                            break;
                        case "07":
                            num = 128;
                            break;
                        case "08":
                            num = 256;
                            break;
                        case "09":
                            num = 512;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = strGroup.equals("10") ? 1024 : null;
                }
            }
            if (num == null) {
                String.valueOf(strGroup);
                zzef.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            String str2 = strArrSplit[2];
            if (str2 != null) {
                str2.hashCode();
                switch (str2) {
                    case "01":
                        num2 = 1;
                        break;
                    case "02":
                        num2 = 2;
                        break;
                    case "03":
                        num2 = 4;
                        break;
                    case "04":
                        num2 = 8;
                        break;
                    case "05":
                        num2 = 16;
                        break;
                    case "06":
                        num2 = 32;
                        break;
                    case "07":
                        num2 = 64;
                        break;
                    case "08":
                        num2 = 128;
                        break;
                    case "09":
                        num2 = 256;
                        break;
                    default:
                        switch (str2) {
                            case 1567:
                                num2 = !str2.equals("10") ? null : 512;
                                break;
                            case 1568:
                                num2 = !str2.equals("11") ? null : 1024;
                                break;
                            case 1569:
                                num2 = !str2.equals("12") ? null : 2048;
                                break;
                            case 1570:
                                num2 = !str2.equals("13") ? null : 4096;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair(num, num2);
            }
            String.valueOf(str2);
            zzef.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str2)));
            return null;
        }
        int i16 = 0;
        String str3 = strArrSplit[0];
        byte b2 = -1;
        switch (str3.hashCode()) {
            case 2986313:
                i = 32;
                if (!str3.equals("ac-4")) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 3001066:
                i = 32;
                if (!str3.equals("apv1")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 3004662:
                i = 32;
                if (!str3.equals("av01")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 3006243:
                i = 32;
                if (!str3.equals("avc1")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3006244:
                i = 32;
                if (!str3.equals("avc2")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3199032:
                i = 32;
                if (!str3.equals("hev1")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 3214780:
                i = 32;
                if (!str3.equals("hvc1")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 3224753:
                i = 32;
                if (!str3.equals("iamf")) {
                    b = -1;
                } else {
                    b = Ascii.f22492FF;
                }
                break;
            case 3356560:
                i = 32;
                if (!str3.equals("mp4a")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 3475740:
                i = 32;
                if (!str3.equals("s263")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 3624515:
                i = 32;
                if (!str3.equals("vp09")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3631854:
                i = 32;
                if (!str3.equals("vvc1")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 3632040:
                i = 32;
                if (!str3.equals("vvi1")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            default:
                i = 32;
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                String str4 = zzvVar.zzk;
                Pair pair = new Pair(1, 1);
                if (strArrSplit.length < 3) {
                    String.valueOf(str4);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                    return pair;
                }
                try {
                    return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused) {
                    String.valueOf(str4);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str4)));
                    return pair;
                }
            case 1:
            case 2:
                String str5 = zzvVar.zzk;
                int length = strArrSplit.length;
                if (length < 2) {
                    String.valueOf(str5);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i3 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i2 = 4;
                        i4 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i2 = 4;
                        if (length < 3) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 37);
                            sb.append("Ignoring malformed AVC codec string: ");
                            sb.append(str5);
                            zzef.zzc("CodecSpecificDataUtil", sb.toString());
                            return null;
                        }
                        i3 = Integer.parseInt(strArrSplit[1]);
                        i4 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i3 == 66) {
                        i15 = 1;
                    } else if (i3 != 77) {
                        if (i3 == 88) {
                            i15 = i2;
                        } else if (i3 == 100) {
                            i15 = 8;
                        } else if (i3 == 110) {
                            i15 = 16;
                        } else if (i3 != 122) {
                            i15 = i3 != 244 ? -1 : 64;
                        } else {
                            i15 = i;
                        }
                    }
                    if (i15 == -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 21);
                        sb2.append("Unknown AVC profile: ");
                        sb2.append(i3);
                        zzef.zzc("CodecSpecificDataUtil", sb2.toString());
                        return null;
                    }
                    switch (i4) {
                        case 10:
                            i5 = 1;
                            break;
                        case 11:
                            i5 = i2;
                            break;
                        case 12:
                            i5 = 8;
                            break;
                        case 13:
                            i5 = 16;
                            break;
                        default:
                            switch (i4) {
                                case 20:
                                    i5 = i;
                                    break;
                                case 21:
                                    i5 = 64;
                                    break;
                                case 22:
                                    i5 = 128;
                                    break;
                                default:
                                    switch (i4) {
                                        case 30:
                                            i5 = 256;
                                            break;
                                        case 31:
                                            i5 = 512;
                                            break;
                                        case 32:
                                            i5 = 1024;
                                            break;
                                        default:
                                            switch (i4) {
                                                case 40:
                                                    i5 = 2048;
                                                    break;
                                                case 41:
                                                    i5 = 4096;
                                                    break;
                                                case 42:
                                                    i5 = 8192;
                                                    break;
                                                default:
                                                    switch (i4) {
                                                        case 50:
                                                            i5 = 16384;
                                                            break;
                                                        case 51:
                                                            i5 = 32768;
                                                            break;
                                                        case 52:
                                                            i5 = 65536;
                                                            break;
                                                        default:
                                                            i5 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i5 != -1) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i5));
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 19);
                    sb3.append("Unknown AVC level: ");
                    sb3.append(i4);
                    zzef.zzc("CodecSpecificDataUtil", sb3.toString());
                    return null;
                } catch (NumberFormatException unused2) {
                    String.valueOf(str5);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str5)));
                }
                break;
            case 3:
                String str6 = zzvVar.zzk;
                if (strArrSplit.length < 3) {
                    String.valueOf(str6);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                    return null;
                }
                try {
                    int i17 = Integer.parseInt(strArrSplit[1]);
                    int i18 = Integer.parseInt(strArrSplit[2]);
                    if (i17 == 0) {
                        i6 = 1;
                    } else if (i17 == 1) {
                        i6 = 2;
                    } else if (i17 != 2) {
                        i6 = i17 != 3 ? -1 : 8;
                    } else {
                        i6 = 4;
                    }
                    if (i6 == -1) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i17).length() + 21);
                        sb4.append("Unknown VP9 profile: ");
                        sb4.append(i17);
                        zzef.zzc("CodecSpecificDataUtil", sb4.toString());
                        return null;
                    }
                    if (i18 == 10) {
                        i15 = 1;
                    } else if (i18 != 11) {
                        if (i18 == 20) {
                            i15 = 4;
                        } else if (i18 == 21) {
                            i15 = 8;
                        } else if (i18 == 30) {
                            i15 = 16;
                        } else if (i18 == 31) {
                            i15 = i;
                        } else if (i18 == 40) {
                            i15 = 64;
                        } else if (i18 == 41) {
                            i15 = 128;
                        } else if (i18 == 50) {
                            i15 = 256;
                        } else if (i18 != 51) {
                            switch (i18) {
                                case 60:
                                    i15 = 2048;
                                    break;
                                case 61:
                                    i15 = 4096;
                                    break;
                                case 62:
                                    i15 = 8192;
                                    break;
                                default:
                                    i15 = -1;
                                    break;
                            }
                        } else {
                            i15 = 512;
                        }
                    }
                    if (i15 != -1) {
                        return new Pair(Integer.valueOf(i6), Integer.valueOf(i15));
                    }
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i18).length() + 19);
                    sb5.append("Unknown VP9 level: ");
                    sb5.append(i18);
                    zzef.zzc("CodecSpecificDataUtil", sb5.toString());
                    return null;
                } catch (NumberFormatException unused3) {
                    String.valueOf(str6);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str6)));
                }
                break;
            case 4:
            case 5:
                return zzf(zzvVar.zzk, strArrSplit, zzvVar.zzF);
            case 6:
            case 7:
                String str7 = zzvVar.zzk;
                zzi zziVar = zzvVar.zzF;
                if (strArrSplit.length < 3) {
                    String.valueOf(str7);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str7)));
                    return null;
                }
                try {
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    if (i19 == 1) {
                        i7 = (zziVar == null || zziVar.zzd != 6) ? (zziVar == null || zziVar.zzf != 8) ? 2 : 1 : 4096;
                    } else {
                        if (i19 != 65) {
                            String str8 = strArrSplit[1];
                            String.valueOf(str8);
                            zzef.zzc("CodecSpecificDataUtil", "Unknown VVC profile IDC: ".concat(String.valueOf(str8)));
                            return null;
                        }
                        i7 = 4;
                    }
                    String str9 = strArrSplit[2];
                    if (str9 != null) {
                        switch (str9.hashCode()) {
                            case 70918:
                                i14 = !str9.equals("H64") ? -1 : 6;
                                break;
                            case 70921:
                                i14 = !str9.equals("H67") ? -1 : 8;
                                break;
                            case 70976:
                                i14 = !str9.equals("H80") ? -1 : 10;
                                break;
                            case 70979:
                                i14 = !str9.equals("H83") ? -1 : 12;
                                break;
                            case 70982:
                                i14 = !str9.equals("H86") ? -1 : 14;
                                break;
                            case 71013:
                                i14 = !str9.equals("H96") ? -1 : 16;
                                break;
                            case 74609:
                                i14 = !str9.equals("L16") ? -1 : 0;
                                break;
                            case 74667:
                                i14 = !str9.equals("L32") ? -1 : 1;
                                break;
                            case 74670:
                                i14 = !str9.equals("L35") ? -1 : 2;
                                break;
                            case 74704:
                                if (!str9.equals("L48")) {
                                    i14 = -1;
                                }
                                break;
                            case 74728:
                                i14 = !str9.equals("L51") ? -1 : 4;
                                break;
                            case 74762:
                                i14 = !str9.equals("L64") ? -1 : 5;
                                break;
                            case 74765:
                                i14 = !str9.equals("L67") ? -1 : 7;
                                break;
                            case 74820:
                                i14 = !str9.equals("L80") ? -1 : 9;
                                break;
                            case 74823:
                                i14 = !str9.equals("L83") ? -1 : 11;
                                break;
                            case 74826:
                                i14 = !str9.equals("L86") ? -1 : 13;
                                break;
                            case 74857:
                                i14 = !str9.equals("L96") ? -1 : 15;
                                break;
                            case 2193610:
                                i14 = !str9.equals("H112") ? -1 : 18;
                                break;
                            case 2193647:
                                i14 = !str9.equals("H128") ? -1 : 20;
                                break;
                            case 2193705:
                                i14 = !str9.equals("H144") ? -1 : 22;
                                break;
                            case 2312774:
                                i14 = !str9.equals("L112") ? -1 : 17;
                                break;
                            case 2312811:
                                i14 = !str9.equals("L128") ? -1 : 19;
                                break;
                            case 2312869:
                                i14 = !str9.equals("L144") ? -1 : 21;
                                break;
                            default:
                                i14 = -1;
                                break;
                        }
                        switch (i14) {
                            case 0:
                                numValueOf = 1;
                                break;
                            case 1:
                                numValueOf = 2;
                                break;
                            case 2:
                                numValueOf = 4;
                                break;
                            case 3:
                                numValueOf = 8;
                                break;
                            case 4:
                                numValueOf = 16;
                                break;
                            case 5:
                                numValueOf = Integer.valueOf(i);
                                break;
                            case 6:
                                numValueOf = 64;
                                break;
                            case 7:
                                numValueOf = 128;
                                break;
                            case 8:
                                numValueOf = 256;
                                break;
                            case 9:
                                numValueOf = 512;
                                break;
                            case 10:
                                numValueOf = 1024;
                                break;
                            case 11:
                                numValueOf = 2048;
                                break;
                            case 12:
                                numValueOf = 4096;
                                break;
                            case 13:
                                numValueOf = 8192;
                                break;
                            case 14:
                                numValueOf = 16384;
                                break;
                            case 15:
                                numValueOf = 32768;
                                break;
                            case 16:
                                numValueOf = 65536;
                                break;
                            case 17:
                                numValueOf = 131072;
                                break;
                            case 18:
                                numValueOf = 262144;
                                break;
                            case 19:
                                numValueOf = 524288;
                                break;
                            case 20:
                                numValueOf = 1048576;
                                break;
                            case 21:
                                numValueOf = 2097152;
                                break;
                            case 22:
                                numValueOf = 4194304;
                                break;
                            default:
                                numValueOf = null;
                                break;
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        return new Pair(Integer.valueOf(i7), numValueOf);
                    }
                    String.valueOf(str9);
                    zzef.zzc("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(String.valueOf(str9)));
                    return null;
                } catch (NumberFormatException unused4) {
                    String.valueOf(str7);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str7)));
                }
                break;
            case 8:
                String str10 = zzvVar.zzk;
                zzi zziVar2 = zzvVar.zzF;
                if (strArrSplit.length < 4) {
                    String.valueOf(str10);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str10)));
                    return null;
                }
                try {
                    int i20 = Integer.parseInt(strArrSplit[1]);
                    int i21 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i22 = Integer.parseInt(strArrSplit[3]);
                    if (i20 != 0) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i20).length() + 21);
                        sb6.append("Unknown AV1 profile: ");
                        sb6.append(i20);
                        zzef.zzc("CodecSpecificDataUtil", sb6.toString());
                        return null;
                    }
                    if (i22 == 8) {
                        i8 = 1;
                    } else {
                        if (i22 != 10) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(i22).length() + 23);
                            sb7.append("Unknown AV1 bit depth: ");
                            sb7.append(i22);
                            zzef.zzc("CodecSpecificDataUtil", sb7.toString());
                            return null;
                        }
                        i8 = (zziVar2 == null || !(zziVar2.zze != null || (i9 = zziVar2.zzd) == 7 || i9 == 6)) ? 2 : 4096;
                    }
                    switch (i21) {
                        case 0:
                            i15 = 1;
                            break;
                        case 1:
                            break;
                        case 2:
                            i15 = 4;
                            break;
                        case 3:
                            i15 = 8;
                            break;
                        case 4:
                            i15 = 16;
                            break;
                        case 5:
                            i15 = i;
                            break;
                        case 6:
                            i15 = 64;
                            break;
                        case 7:
                            i15 = 128;
                            break;
                        case 8:
                            i15 = 256;
                            break;
                        case 9:
                            i15 = 512;
                            break;
                        case 10:
                            i15 = 1024;
                            break;
                        case 11:
                            i15 = 2048;
                            break;
                        case 12:
                            i15 = 4096;
                            break;
                        case 13:
                            i15 = 8192;
                            break;
                        case 14:
                            i15 = 16384;
                            break;
                        case 15:
                            i15 = 32768;
                            break;
                        case 16:
                            i15 = 65536;
                            break;
                        case 17:
                            i15 = 131072;
                            break;
                        case 18:
                            i15 = 262144;
                            break;
                        case 19:
                            i15 = 524288;
                            break;
                        case 20:
                            i15 = 1048576;
                            break;
                        case 21:
                            i15 = 2097152;
                            break;
                        case 22:
                            i15 = 4194304;
                            break;
                        case 23:
                            i15 = 8388608;
                            break;
                        default:
                            i15 = -1;
                            break;
                    }
                    if (i15 != -1) {
                        return new Pair(Integer.valueOf(i8), Integer.valueOf(i15));
                    }
                    StringBuilder sb8 = new StringBuilder(String.valueOf(i21).length() + 19);
                    sb8.append("Unknown AV1 level: ");
                    sb8.append(i21);
                    zzef.zzc("CodecSpecificDataUtil", sb8.toString());
                    return null;
                } catch (NumberFormatException unused5) {
                    String.valueOf(str10);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str10)));
                }
                break;
            case 9:
                String str11 = zzvVar.zzk;
                if (strArrSplit.length < 4) {
                    String.valueOf(str11);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str11)));
                    return null;
                }
                try {
                    int i23 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i24 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i25 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i23 == 33) {
                        i10 = 1;
                    } else {
                        if (i23 != 44) {
                            StringBuilder sb9 = new StringBuilder(String.valueOf(i23).length() + 30);
                            sb9.append("Ignoring invalid APV profile: ");
                            sb9.append(i23);
                            zzef.zzc("CodecSpecificDataUtil", sb9.toString());
                            return null;
                        }
                        i10 = 8192;
                    }
                    int i26 = i24 / 30;
                    int i27 = i26 + i26;
                    if (i24 % 30 == 0) {
                        i27--;
                    }
                    return new Pair(Integer.valueOf(i10), Integer.valueOf((256 << (i27 - 1)) | (1 << i25)));
                } catch (NumberFormatException e) {
                    String.valueOf(str11);
                    zzef.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str11)), e);
                }
                break;
            case 10:
                String str12 = zzvVar.zzk;
                if (strArrSplit.length != 3) {
                    String.valueOf(str12);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str12)));
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(zzas.zze(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i28 = Integer.parseInt(strArrSplit[2]);
                        if (i28 == 17) {
                            i14 = 17;
                        } else if (i28 == 20) {
                            i14 = 20;
                        } else if (i28 == 23) {
                            i14 = 23;
                        } else if (i28 == 29) {
                            i14 = 29;
                        } else if (i28 == 39) {
                            i14 = 39;
                        } else if (i28 != 42) {
                            switch (i28) {
                                case 1:
                                    i14 = 1;
                                    break;
                                case 2:
                                    i14 = 2;
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    i14 = 4;
                                    break;
                                case 5:
                                    i14 = 5;
                                    break;
                                case 6:
                                    i14 = 6;
                                    break;
                                default:
                                    i14 = -1;
                                    break;
                            }
                        } else {
                            i14 = 42;
                        }
                        if (i14 != -1) {
                            return new Pair(Integer.valueOf(i14), 0);
                        }
                    }
                    return null;
                } catch (NumberFormatException unused6) {
                    String.valueOf(str12);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str12)));
                }
                break;
            case 11:
                String str13 = zzvVar.zzk;
                if (strArrSplit.length != 4) {
                    String.valueOf(str13);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str13)));
                    return null;
                }
                try {
                    int i29 = Integer.parseInt(strArrSplit[1]);
                    int i30 = Integer.parseInt(strArrSplit[2]);
                    int i31 = Integer.parseInt(strArrSplit[3]);
                    if (i29 != 0) {
                        if (i29 != 1) {
                            if (i29 != 2) {
                                i16 = i30;
                                i11 = -1;
                            } else if (i30 == 1) {
                                i11 = 1026;
                                i16 = 1;
                            } else if (i30 == 2) {
                                i11 = 1028;
                                i16 = 2;
                            } else {
                                i16 = i30;
                                i11 = -1;
                            }
                        } else if (i30 == 0) {
                            i11 = InputDeviceCompat.SOURCE_DPAD;
                        } else if (i30 == 1) {
                            i11 = 514;
                            i16 = 1;
                        } else {
                            i16 = i30;
                            i11 = -1;
                        }
                    } else if (i30 == 0) {
                        i11 = 257;
                    } else {
                        i16 = i30;
                        i11 = -1;
                    }
                    if (i11 == -1) {
                        StringBuilder sb10 = new StringBuilder(String.valueOf(i29).length() + 23 + String.valueOf(i16).length());
                        sb10.append("Unknown AC-4 profile: ");
                        sb10.append(i29);
                        sb10.append(".");
                        sb10.append(i16);
                        zzef.zzc("CodecSpecificDataUtil", sb10.toString());
                        return null;
                    }
                    if (i31 == 0) {
                        i12 = 1;
                    } else if (i31 == 1) {
                        i12 = 2;
                    } else if (i31 == 2) {
                        i12 = 4;
                    } else if (i31 == 3) {
                        i12 = 8;
                    } else if (i31 != 4) {
                        i12 = -1;
                    }
                    if (i12 != -1) {
                        return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
                    }
                    StringBuilder sb11 = new StringBuilder(String.valueOf(i31).length() + 20);
                    sb11.append("Unknown AC-4 level: ");
                    sb11.append(i31);
                    zzef.zzc("CodecSpecificDataUtil", sb11.toString());
                    return null;
                } catch (NumberFormatException unused7) {
                    String.valueOf(str13);
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str13)));
                }
                break;
            case 12:
                if (strArrSplit.length < 4) {
                    zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                    return null;
                }
                try {
                    int i32 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str14 = strArrSplit[3];
                    switch (str14.hashCode()) {
                        case 2464863:
                            if (str14.equals("Opus")) {
                                b2 = 0;
                            }
                            break;
                        case 3114792:
                            if (str14.equals("fLaC")) {
                                b2 = 2;
                            }
                            break;
                        case 3238865:
                            if (str14.equals("ipcm")) {
                                b2 = 3;
                            }
                            break;
                        case 3356560:
                            if (str14.equals("mp4a")) {
                                b2 = 1;
                            }
                            break;
                    }
                    if (b2 == 0) {
                        i13 = 1;
                    } else if (b2 == 1) {
                        i13 = 2;
                    } else if (b2 == 2) {
                        i13 = 4;
                    } else if (b2 != 3) {
                        String.valueOf(str14);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str14)));
                        return null;
                    }
                    return new Pair(Integer.valueOf(i32 | 16777216 | i13), 0);
                } catch (NumberFormatException e2) {
                    String str15 = strArrSplit[1];
                    String.valueOf(str15);
                    zzef.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(str15)), e2);
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x019c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Pair zzf(String str, String[] strArr, zzi zziVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            String.valueOf(str);
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            String.valueOf(str);
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        byte b = 6;
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                String.valueOf(strGroup);
                zzef.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (!str2.equals("H30")) {
                        b = -1;
                    } else {
                        b = Ascii.f22490CR;
                    }
                    break;
                case 70914:
                    if (!str2.equals("H60")) {
                        b = -1;
                    } else {
                        b = Ascii.f22500SO;
                    }
                    break;
                case 70917:
                    if (!str2.equals("H63")) {
                        b = -1;
                    } else {
                        b = Ascii.f22499SI;
                    }
                    break;
                case 71007:
                    if (!str2.equals("H90")) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 71010:
                    if (!str2.equals("H93")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 74665:
                    if (!str2.equals("L30")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 74761:
                    if (!str2.equals("L63")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 74851:
                    if (!str2.equals("L90")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 74854:
                    if (!str2.equals("L93")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 2193639:
                    if (!str2.equals("H120")) {
                        b = -1;
                    } else {
                        b = Ascii.DC2;
                    }
                    break;
                case 2193642:
                    if (!str2.equals("H123")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 2193732:
                    if (!str2.equals("H150")) {
                        b = -1;
                    } else {
                        b = Ascii.DC4;
                    }
                    break;
                case 2193735:
                    if (!str2.equals("H153")) {
                        b = -1;
                    } else {
                        b = Ascii.NAK;
                    }
                    break;
                case 2193738:
                    if (!str2.equals("H156")) {
                        b = -1;
                    } else {
                        b = Ascii.SYN;
                    }
                    break;
                case 2193825:
                    if (!str2.equals("H180")) {
                        b = -1;
                    } else {
                        b = Ascii.ETB;
                    }
                    break;
                case 2193828:
                    if (!str2.equals("H183")) {
                        b = -1;
                    } else {
                        b = Ascii.CAN;
                    }
                    break;
                case 2193831:
                    if (!str2.equals("H186")) {
                        b = -1;
                    } else {
                        b = Ascii.f22491EM;
                    }
                    break;
                case 2312803:
                    if (!str2.equals("L120")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 2312806:
                    if (!str2.equals("L123")) {
                        b = -1;
                    }
                    break;
                case 2312896:
                    if (!str2.equals("L150")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 2312899:
                    if (!str2.equals("L153")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 2312902:
                    if (!str2.equals("L156")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 2312989:
                    if (!str2.equals("L180")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 2312992:
                    if (!str2.equals("L183")) {
                        b = -1;
                    } else {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 2312995:
                    if (!str2.equals("L186")) {
                        b = -1;
                    } else {
                        b = Ascii.f22492FF;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case 8:
                    num = 65536;
                    break;
                case 9:
                    num = 262144;
                    break;
                case 10:
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case 12:
                    num = 16777216;
                    break;
                case 13:
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case 21:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        String.valueOf(str2);
        zzef.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
        return null;
    }

    public static byte[] zzg(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
