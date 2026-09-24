package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.UserDataStore;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaoe implements zzane {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaoc zzh = new zzaoc(30.0f, 1, 1);

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfk.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Code duplicated, block: B:193:0x0359  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r6v90 */
    private static zzaoh zzd(XmlPullParser xmlPullParser, zzaoh zzaohVar) {
        ?? r6;
        Matcher matcher;
        byte b;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z = false;
        zzaoh zzaohVarZze = zzaohVar;
        int i = 0;
        while (i < attributeCount) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            ?? r10 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r11 = -1;
             = -1;
             = -1;
            ?? r12 = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
             = -1;
            ?? r13 = -1;
            r10 = -1;
            r10 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    r6 = !attributeName.equals("fontStyle") ? -1 : 6;
                    break;
                case -1289044182:
                    r6 = !attributeName.equals("extent") ? -1 : 16;
                    break;
                case -1224696685:
                    r6 = !attributeName.equals("fontFamily") ? -1 : 3;
                    break;
                case -1065511464:
                    r6 = !attributeName.equals("textAlign") ? -1 : 7;
                    break;
                case -1008619738:
                    r6 = !attributeName.equals("origin") ? -1 : 15;
                    break;
                case -879295043:
                    r6 = !attributeName.equals("textDecoration") ? -1 : 12;
                    break;
                case -734428249:
                    r6 = !attributeName.equals("fontWeight") ? -1 : 5;
                    break;
                case 3355:
                    r6 = !attributeName.equals("id") ? -1 : z;
                    break;
                case 3511770:
                    r6 = !attributeName.equals("ruby") ? -1 : 10;
                    break;
                case 94842723:
                    r6 = !attributeName.equals("color") ? -1 : 2;
                    break;
                case 109403361:
                    r6 = !attributeName.equals("shear") ? -1 : 14;
                    break;
                case 110138194:
                    r6 = !attributeName.equals("textCombine") ? -1 : 9;
                    break;
                case 365601008:
                    r6 = !attributeName.equals("fontSize") ? -1 : 4;
                    break;
                case 921125321:
                    r6 = !attributeName.equals("textEmphasis") ? -1 : 13;
                    break;
                case 1115953443:
                    r6 = !attributeName.equals("rubyPosition") ? -1 : 11;
                    break;
                case 1287124693:
                    r6 = !attributeName.equals("backgroundColor") ? -1 : 1;
                    break;
                case 1754920356:
                    r6 = !attributeName.equals("multiRowAlign") ? -1 : 8;
                    break;
                default:
                    r6 = -1;
                    break;
            }
            switch (r6) {
                case 0:
                    if ("style".equals(xmlPullParser.getName())) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzaohVarZze = zze(zzaohVarZze);
                    try {
                        zzaohVarZze.zzn(zzdq.zza(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        String.valueOf(attributeValue);
                        zzef.zzc("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 2:
                    zzaohVarZze = zze(zzaohVarZze);
                    try {
                        zzaohVarZze.zzk(zzdq.zza(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        String.valueOf(attributeValue);
                        zzef.zzc("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 3:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzi(attributeValue);
                    break;
                case 4:
                    try {
                        zzaohVarZze = zze(zzaohVarZze);
                        String str = zzfk.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 41);
                                sb.append("Invalid number of entries for fontSize: ");
                                sb.append(length);
                                sb.append(".");
                                throw new zzana(sb.toString());
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzef.zzc("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(attributeValue).length() + 36);
                            sb2.append("Invalid expression for fontSize: '");
                            sb2.append(attributeValue);
                            sb2.append("'.");
                            throw new zzana(sb2.toString());
                        }
                        String strGroup = matcher.group(3);
                        if (strGroup == null) {
                            throw null;
                        }
                        String str2 = strGroup;
                        int iHashCode = strGroup.hashCode();
                        if (iHashCode != 37) {
                            if (iHashCode != 3240) {
                                if (iHashCode == 3592 && strGroup.equals("px")) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                            } else if (strGroup.equals(UserDataStore.EMAIL)) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strGroup.equals("%")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            zzaohVarZze.zzH(1);
                        } else if (b == 1) {
                            zzaohVarZze.zzH(2);
                        } else {
                            if (b != 2) {
                                StringBuilder sb3 = new StringBuilder(strGroup.length() + 30);
                                sb3.append("Invalid unit for fontSize: '");
                                sb3.append(strGroup);
                                sb3.append("'.");
                                throw new zzana(sb3.toString());
                            }
                            zzaohVarZze.zzH(3);
                        }
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 == null) {
                            throw null;
                        }
                        String str3 = strGroup2;
                        zzaohVarZze.zzG(Float.parseFloat(strGroup2));
                    } catch (zzana unused3) {
                        String.valueOf(attributeValue);
                        zzef.zzc("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                    }
                    break;
                case 5:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzf("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzg("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzz(zzf(attributeValue));
                    break;
                case 8:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzB(zzf(attributeValue));
                    break;
                case 9:
                    String strZza = zzgsf.zza(attributeValue);
                    int iHashCode2 = strZza.hashCode();
                    if (iHashCode2 != 96673) {
                        if (iHashCode2 == 3387192 && strZza.equals("none")) {
                            r10 = z;
                        }
                    } else if (strZza.equals("all")) {
                        r10 = 1;
                    }
                    if (r10 == 0) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzD(z);
                    } else if (r10 == 1) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzD(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzgsf.zza(attributeValue);
                    switch (strZza2.hashCode()) {
                        case -618561360:
                            if (strZza2.equals("baseContainer")) {
                                r13 = 2;
                            }
                            break;
                        case -410956671:
                            if (strZza2.equals("container")) {
                                r13 = z;
                            }
                            break;
                        case -250518009:
                            if (strZza2.equals("delimiter")) {
                                r13 = 5;
                            }
                            break;
                        case -136074796:
                            if (strZza2.equals("textContainer")) {
                                r13 = 4;
                            }
                            break;
                        case 3016401:
                            if (strZza2.equals("base")) {
                                r13 = 1;
                            }
                            break;
                        case 3556653:
                            if (strZza2.equals("text")) {
                                r13 = 3;
                            }
                            break;
                    }
                    if (r13 == 0) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzu(1);
                    } else if (r13 == 1 || r13 == 2) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzu(2);
                    } else if (r13 == 3 || r13 == 4) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzu(3);
                    } else if (r13 == 5) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzu(4);
                    }
                    break;
                case 11:
                    String strZza3 = zzgsf.zza(attributeValue);
                    int iHashCode3 = strZza3.hashCode();
                    if (iHashCode3 != -1392885889) {
                        if (iHashCode3 == 92734940 && strZza3.equals("after")) {
                            r12 = 1;
                        }
                    } else if (strZza3.equals("before")) {
                        r12 = z;
                    }
                    if (r12 == 0) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzw(1);
                    } else if (r12 == 1) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzw(2);
                    }
                    break;
                case 12:
                    String strZza4 = zzgsf.zza(attributeValue);
                    switch (strZza4.hashCode()) {
                        case -1461280213:
                            if (strZza4.equals("nounderline")) {
                                r11 = 3;
                            }
                            break;
                        case -1026963764:
                            if (strZza4.equals("underline")) {
                                r11 = 2;
                            }
                            break;
                        case 913457136:
                            if (strZza4.equals("nolinethrough")) {
                                r11 = 1;
                            }
                            break;
                        case 1679736913:
                            if (strZza4.equals("linethrough")) {
                                r11 = z;
                            }
                            break;
                    }
                    if (r11 == 0) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzc(true);
                    } else if (r11 == 1) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zzc(z);
                    } else if (r11 == 2) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zze(true);
                    } else if (r11 == 3) {
                        zzaohVarZze = zze(zzaohVarZze);
                        zzaohVarZze.zze(z);
                    }
                    break;
                case 13:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzF(zzaoa.zza(attributeValue));
                    break;
                case 14:
                    zzaoh zzaohVarZze2 = zze(zzaohVarZze);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            String str4 = strGroup3;
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e) {
                            String.valueOf(attributeValue);
                            zzef.zzd("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        String.valueOf(attributeValue);
                        zzef.zzc("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                    }
                    zzaohVarZze2.zzp(fMin);
                    zzaohVarZze = zzaohVarZze2;
                    break;
                case 15:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzK(attributeValue);
                    break;
                case 16:
                    zzaohVarZze = zze(zzaohVarZze);
                    zzaohVarZze.zzM(attributeValue);
                    break;
            }
            i++;
            z = false;
        }
        return zzaohVarZze;
    }

    private static zzaoh zze(zzaoh zzaohVar) {
        return zzaohVar == null ? new zzaoh() : zzaohVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    private static Layout.Alignment zzf(String str) {
        byte b;
        switch (zzgsf.zza(str)) {
            case "center":
                b = 4;
                break;
            case "end":
                b = 3;
                break;
            case "left":
                b = 0;
                break;
            case "right":
                b = 2;
                break;
            case "start":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b == 2 || b == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    private static long zzg(String str, zzaoc zzaocVar) throws zzana {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        byte b = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaocVar.zza : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zzaocVar.zzb)) / ((double) zzaocVar.zza);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            String.valueOf(str);
            throw new zzana("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals("t")) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (!strGroup8.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                            b = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (strGroup8.equals(InneractiveMediationDefs.GENDER_MALE)) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strGroup8.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (strGroup8.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
            b = 4;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                if (b == 3) {
                    d2 = 1000.0d;
                } else if (b == 4) {
                    d2 = zzaocVar.zza;
                } else if (b == 5) {
                    d2 = zzaocVar.zzc;
                }
                d10 /= d2;
            } else {
                d = 60.0d;
            }
            return (long) (d10 * 1000000.0d);
        }
        d = 3600.0d;
        d10 *= d;
        return (long) (d10 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzamy.zza(zzb(bArr, i, i2), zzandVar, zzdsVar);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0308 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x031e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0327 A[Catch: NumberFormatException -> 0x0343, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #3 {NumberFormatException -> 0x0343, blocks: (B:146:0x0321, B:148:0x0327, B:150:0x0337, B:151:0x0341, B:152:0x0342), top: B:430:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0337 A[Catch: NumberFormatException -> 0x0343, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #3 {NumberFormatException -> 0x0343, blocks: (B:146:0x0321, B:148:0x0327, B:150:0x0337, B:151:0x0341, B:152:0x0342), top: B:430:0x0321 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x034b A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0355 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x035d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0364 A[Catch: NumberFormatException -> 0x0389, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #14 {NumberFormatException -> 0x0389, blocks: (B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388), top: B:445:0x035e }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0372 A[Catch: NumberFormatException -> 0x0389, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #14 {NumberFormatException -> 0x0389, blocks: (B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388), top: B:445:0x035e }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0391 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x039c  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ae A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x03c2 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:185:0x03db A[Catch: NumberFormatException -> 0x03fc, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #5 {NumberFormatException -> 0x03fc, blocks: (B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:188:0x03fa, B:189:0x03fb), top: B:433:0x03d5 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03eb A[Catch: NumberFormatException -> 0x03fc, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #5 {NumberFormatException -> 0x03fc, blocks: (B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:188:0x03fa, B:189:0x03fb), top: B:433:0x03d5 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x040b A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0411 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x0413 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0423  */
    /* JADX WARN: Code duplicated, block: B:199:0x042a A[Catch: NumberFormatException -> 0x0451, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #9 {NumberFormatException -> 0x0451, blocks: (B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450), top: B:439:0x0424 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x0438 A[Catch: NumberFormatException -> 0x0451, IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #9 {NumberFormatException -> 0x0451, blocks: (B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450), top: B:439:0x0424 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x0461 A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0471  */
    /* JADX WARN: Code duplicated, block: B:209:0x047d A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x048a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0490  */
    /* JADX WARN: Code duplicated, block: B:218:0x049a  */
    /* JADX WARN: Code duplicated, block: B:220:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:226:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:227:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:228:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:232:0x04cc A[Catch: IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #16 {IOException -> 0x077b, XmlPullParserException -> 0x0784, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0081, B:16:0x0089, B:18:0x0090, B:20:0x0098, B:24:0x00ae, B:26:0x00c9, B:28:0x00d3, B:29:0x00d7, B:31:0x00e3, B:32:0x00e7, B:62:0x0160, B:79:0x01b9, B:82:0x01d3, B:84:0x01d9, B:86:0x01e1, B:88:0x01e9, B:90:0x01f1, B:92:0x01f9, B:94:0x0201, B:96:0x0207, B:98:0x020f, B:100:0x0217, B:102:0x021d, B:104:0x0223, B:106:0x0229, B:108:0x0231, B:111:0x023a, B:409:0x075a, B:112:0x026a, B:114:0x0270, B:116:0x0279, B:118:0x0288, B:120:0x0295, B:122:0x02a9, B:124:0x02af, B:277:0x056f, B:126:0x02b9, B:129:0x02c5, B:261:0x0523, B:132:0x02e3, B:134:0x02eb, B:136:0x02f3, B:138:0x02fb, B:143:0x0308, B:146:0x0321, B:148:0x0327, B:150:0x0337, B:172:0x03a6, B:174:0x03ae, B:176:0x03b4, B:178:0x03bc, B:180:0x03c2, B:183:0x03d5, B:185:0x03db, B:187:0x03eb, B:207:0x0475, B:209:0x047d, B:230:0x04c4, B:232:0x04cc, B:259:0x0516, B:188:0x03fa, B:189:0x03fb, B:190:0x03fc, B:191:0x040b, B:194:0x0413, B:197:0x0424, B:199:0x042a, B:201:0x0438, B:202:0x044f, B:203:0x0450, B:204:0x0451, B:205:0x0461, B:151:0x0341, B:152:0x0342, B:153:0x0343, B:154:0x034b, B:157:0x0355, B:160:0x035e, B:162:0x0364, B:164:0x0372, B:165:0x0387, B:166:0x0388, B:167:0x0389, B:168:0x0391, B:263:0x0531, B:265:0x0540, B:267:0x054b, B:269:0x0551, B:271:0x055d, B:282:0x058d, B:285:0x05b0, B:339:0x0664, B:320:0x0620, B:323:0x0629, B:382:0x06e3, B:326:0x0633, B:329:0x063d, B:336:0x0651, B:337:0x0656, B:338:0x065d, B:345:0x067e, B:349:0x068a, B:353:0x0693, B:363:0x06a8, B:372:0x06bf, B:374:0x06cb, B:376:0x06d0, B:366:0x06af, B:65:0x016f, B:67:0x017b, B:70:0x0184, B:72:0x018a, B:74:0x0198, B:75:0x01a7, B:76:0x01a8, B:77:0x01a9, B:36:0x0100, B:38:0x010c, B:41:0x0116, B:43:0x011c, B:45:0x0127, B:47:0x012d, B:54:0x0144, B:61:0x0158, B:56:0x014e, B:58:0x0153, B:386:0x0703, B:388:0x0713, B:391:0x0717, B:393:0x0721, B:395:0x072b, B:399:0x0736, B:397:0x0733, B:402:0x074b, B:406:0x0753, B:412:0x0774, B:415:0x077a), top: B:446:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:237:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:240:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:243:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:245:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:246:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:248:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x0502  */
    /* JADX WARN: Code duplicated, block: B:251:0x0505  */
    /* JADX WARN: Code duplicated, block: B:257:0x050f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0512  */
    /* JADX WARN: Code duplicated, block: B:319:0x061e  */
    /* JADX WARN: Code duplicated, block: B:376:0x06d0 A[Catch: zzana -> 0x06db, IOException -> 0x077b, XmlPullParserException -> 0x0784, TRY_LEAVE, TryCatch #1 {zzana -> 0x06db, blocks: (B:374:0x06cb, B:376:0x06d0), top: B:426:0x06cb }] */
    /* JADX WARN: Code duplicated, block: B:452:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x044f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.google.android.gms.internal.ads.zzaof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.google.android.gms.internal.ads.zzaoh, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.zzaod] */
    public final zzamz zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        ArrayDeque arrayDeque;
        zzaoc zzaocVar;
        HashMap map;
        ?? r17;
        ?? r18;
        ?? zzaodVar;
        zzaoc zzaocVar2;
        int i3;
        zzaob zzaobVar;
        zzaob zzaobVar2;
        long j;
        zzaob zzaobVarZzb;
        long j2;
        Object obj;
        byte b;
        String str3;
        String str4;
        String strZzc;
        String str5;
        String strZzL;
        String str6;
        HashMap map2;
        String str7;
        float f;
        float f2;
        ?? zzaofVar;
        float f3;
        String strZzc2;
        float f4;
        float f5;
        String strZzc3;
        int i4;
        float f6;
        String strZzc4;
        int i5;
        String strZza;
        int iHashCode;
        byte b2;
        String strZza2;
        int iHashCode2;
        byte b3;
        Matcher matcher;
        Matcher matcher2;
        String strGroup;
        int i6;
        String strGroup2;
        String strGroup3;
        float f7;
        String strGroup4;
        String strZzc5;
        zzaoh zzaohVar;
        Matcher matcher3;
        Matcher matcher4;
        String strGroup5;
        int i7;
        String strGroup6;
        String strGroup7;
        String strGroup8;
        zzaoh zzaohVar2;
        float f8;
        boolean z;
        String str8 = "";
        String str9 = "http://www.w3.org/ns/ttml#parameter";
        String str10 = "Ignoring unsupported tag: ";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            map4.put("", new zzaof("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzaoc zzaocVar3 = zzh;
            zzaoi zzaoiVar = null;
            ?? r19 = 0;
            zzaoc zzaocVar4 = zzaocVar3;
            int i8 = 0;
            int i9 = 15;
            while (eventType != 1) {
                zzaob zzaobVar3 = (zzaob) arrayDeque2.peek();
                ?? r48 = obj2;
                if (i8 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str8;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str9, "frameRate");
                            int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str9, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                String str11 = zzfk.zza;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                zzgsw.zzb(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i11 = zzaocVar3.zzb;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str9, "subFrameRate");
                            if (attributeValue3 != null) {
                                i11 = Integer.parseInt(attributeValue3);
                            }
                            int i12 = zzaocVar3.zzc;
                            zzaocVar = zzaocVar3;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str9, "tickRate");
                            if (attributeValue4 != null) {
                                i12 = Integer.parseInt(attributeValue4);
                            }
                            zzaocVar4 = new zzaoc(i10 * f8, i11, i12);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str9, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str9;
                                zzaocVar4 = zzaocVar4;
                                i9 = 15;
                            } else {
                                Matcher matcher5 = zzg.matcher(attributeValue5);
                                if (matcher5.matches()) {
                                    try {
                                        String strGroup9 = matcher5.group(1);
                                        if (strGroup9 == null) {
                                            throw r48;
                                        }
                                        String str12 = strGroup9;
                                        int i13 = Integer.parseInt(strGroup9);
                                        str2 = str9;
                                        try {
                                            String strGroup10 = matcher5.group(2);
                                            if (strGroup10 == null) {
                                                throw r48;
                                            }
                                            String str13 = strGroup10;
                                            int i14 = Integer.parseInt(strGroup10);
                                            try {
                                                if (i13 != 0) {
                                                    if (i14 != 0) {
                                                        z = true;
                                                    } else {
                                                        i14 = 0;
                                                        z = false;
                                                    }
                                                    zzgsw.zzg(z, "Invalid cell resolution %s %s", i13, i14);
                                                    i9 = i14;
                                                } else {
                                                    z = false;
                                                }
                                                zzgsw.zzg(z, "Invalid cell resolution %s %s", i13, i14);
                                                i9 = i14;
                                            } catch (NumberFormatException unused) {
                                                zzef.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                                i9 = 15;
                                            }
                                        } catch (NumberFormatException unused2) {
                                            zzaocVar4 = zzaocVar4;
                                        }
                                    } catch (NumberFormatException unused3) {
                                        str2 = str9;
                                    }
                                    zzaocVar4 = zzaocVar4;
                                    zzef.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    i9 = 15;
                                } else {
                                    zzef.zzc("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str2 = str9;
                                    zzaocVar4 = zzaocVar4;
                                    i9 = 15;
                                }
                            }
                            String strZzc6 = zzfs.zzc(xmlPullParserNewPullParser, "extent");
                            if (strZzc6 == null) {
                                zzaodVar = r48;
                            } else {
                                Matcher matcher6 = zzf.matcher(strZzc6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup11 = matcher6.group(1);
                                        if (strGroup11 == null) {
                                            throw r48;
                                        }
                                        String str14 = strGroup11;
                                        int i15 = Integer.parseInt(strGroup11);
                                        String strGroup12 = matcher6.group(2);
                                        if (strGroup12 == null) {
                                            throw r48;
                                        }
                                        String str15 = strGroup12;
                                        zzaodVar = new zzaod(i15, Integer.parseInt(strGroup12));
                                    } catch (NumberFormatException unused4) {
                                        zzef.zzc("TtmlParser", "Ignoring malformed tts extent: ".concat(strZzc6));
                                        zzaodVar = r48;
                                    }
                                } else {
                                    zzef.zzc("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZzc6));
                                }
                                zzaodVar = r48;
                            }
                        } else {
                            str2 = str9;
                            zzaocVar = zzaocVar3;
                            zzaoiVar = zzaoiVar;
                            i8 = i8;
                            zzaodVar = r19;
                        }
                        zzaoc zzaocVar5 = zzaocVar4;
                        ?? r4 = zzaodVar;
                        int i16 = i9;
                        String str16 = "image";
                        String str17 = "metadata";
                        String str18 = "region";
                        ArrayDeque arrayDeque3 = arrayDeque2;
                        String str19 = "head";
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzfs.zzb(xmlPullParserNewPullParser, "style")) {
                                        String strZzc7 = zzfs.zzc(xmlPullParserNewPullParser, "style");
                                        zzaoh zzaohVarZzd = zzd(xmlPullParserNewPullParser, new zzaoh());
                                        if (strZzc7 != null) {
                                            String[] strArrZzc = zzc(strZzc7);
                                            int length = strArrZzc.length;
                                            int i17 = 0;
                                            while (i17 < length) {
                                                int i18 = i17;
                                                zzaohVarZzd.zzr((zzaoh) map3.get(strArrZzc[i18]));
                                                i17 = i18 + 1;
                                            }
                                        }
                                        String strZzt = zzaohVarZzd.zzt();
                                        if (strZzt != null) {
                                            map3.put(strZzt, zzaohVarZzd);
                                        }
                                        str4 = str19;
                                        str3 = str17;
                                        map = map5;
                                    } else {
                                        zzaocVar5 = zzaocVar5;
                                        str10 = str10;
                                        if (zzfs.zzb(xmlPullParserNewPullParser, str18)) {
                                            String str20 = str19;
                                            String strZzc8 = zzfs.zzc(xmlPullParserNewPullParser, "id");
                                            if (strZzc8 == null) {
                                                zzaofVar = r48;
                                                str6 = str16;
                                                map2 = map5;
                                                str7 = str17;
                                            } else {
                                                String strZzc9 = zzfs.zzc(xmlPullParserNewPullParser, "origin");
                                                if (strZzc9 == null) {
                                                    str5 = strZzc9;
                                                    String strZzc10 = zzfs.zzc(xmlPullParserNewPullParser, "style");
                                                    if (strZzc10 != null && (zzaohVar2 = (zzaoh) map3.get(strZzc10)) != null) {
                                                        strZzL = zzaohVar2.zzL();
                                                    }
                                                    if (strZzL != null) {
                                                        map2 = map5;
                                                        matcher3 = zzb.matcher(strZzL);
                                                        str6 = str16;
                                                        matcher4 = zzf.matcher(strZzL);
                                                        if (matcher3.matches()) {
                                                            str7 = str17;
                                                            try {
                                                                strGroup7 = matcher3.group(1);
                                                                if (strGroup7 != null) {
                                                                    throw r48;
                                                                }
                                                                String str21 = strGroup7;
                                                                f2 = Float.parseFloat(strGroup7) / 100.0f;
                                                                strGroup8 = matcher3.group(2);
                                                                if (strGroup8 != null) {
                                                                    throw r48;
                                                                }
                                                                String str22 = strGroup8;
                                                                f = Float.parseFloat(strGroup8) / 100.0f;
                                                            } catch (NumberFormatException unused5) {
                                                                zzef.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                            }
                                                        } else {
                                                            str7 = str17;
                                                            if (matcher4.matches()) {
                                                                zzef.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                            } else if (r4 == 0) {
                                                                zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                            } else {
                                                                try {
                                                                    strGroup5 = matcher4.group(1);
                                                                    if (strGroup5 != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str23 = strGroup5;
                                                                    i7 = Integer.parseInt(strGroup5);
                                                                    strGroup6 = matcher4.group(2);
                                                                    if (strGroup6 != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str24 = strGroup6;
                                                                    int i19 = Integer.parseInt(strGroup6);
                                                                    float f9 = i7 / r4.zza;
                                                                    f = i19 / r4.zzb;
                                                                    f3 = f9;
                                                                    strZzc2 = zzfs.zzc(xmlPullParserNewPullParser, "extent");
                                                                    if (strZzc2 == null && (strZzc5 = zzfs.zzc(xmlPullParserNewPullParser, "style")) != null && (zzaohVar = (zzaoh) map3.get(strZzc5)) != null) {
                                                                        strZzc2 = zzaohVar.zzN();
                                                                    }
                                                                    if (strZzc2 != null) {
                                                                        matcher = zzb.matcher(strZzc2);
                                                                        matcher2 = zzf.matcher(strZzc2);
                                                                        if (matcher.matches()) {
                                                                            try {
                                                                                strGroup3 = matcher.group(1);
                                                                                if (strGroup3 != null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str25 = strGroup3;
                                                                                f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                                                strGroup4 = matcher.group(2);
                                                                                if (strGroup4 != null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str26 = strGroup4;
                                                                                f4 = f7;
                                                                                f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                                            } catch (NumberFormatException unused6) {
                                                                                String.valueOf(strZzL);
                                                                                zzef.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                                zzaofVar = r48;
                                                                            }
                                                                        } else if (matcher2.matches()) {
                                                                            String.valueOf(strZzL);
                                                                            zzef.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                                        } else if (r4 == 0) {
                                                                            String.valueOf(strZzL);
                                                                            zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                                        } else {
                                                                            try {
                                                                                strGroup = matcher2.group(1);
                                                                                if (strGroup != null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str27 = strGroup;
                                                                                i6 = Integer.parseInt(strGroup);
                                                                                strGroup2 = matcher2.group(2);
                                                                                if (strGroup2 != null) {
                                                                                    throw r48;
                                                                                }
                                                                                String str28 = strGroup2;
                                                                                int i20 = Integer.parseInt(strGroup2);
                                                                                float f10 = i6 / r4.zza;
                                                                                f5 = i20 / r4.zzb;
                                                                                f4 = f10;
                                                                            } catch (NumberFormatException unused7) {
                                                                                String.valueOf(strZzL);
                                                                                zzef.zzc("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strZzL)));
                                                                                zzaofVar = r48;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        f4 = 1.0f;
                                                                        f5 = 1.0f;
                                                                    }
                                                                    strZzc3 = zzfs.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                                    if (strZzc3 != null) {
                                                                        strZza2 = zzgsf.zza(strZzc3);
                                                                        iHashCode2 = strZza2.hashCode();
                                                                        if (iHashCode2 != -1364013995) {
                                                                            if (iHashCode2 != 92734940 && strZza2.equals("after")) {
                                                                                b3 = 1;
                                                                            } else {
                                                                                b3 = -1;
                                                                            }
                                                                        } else if (strZza2.equals("center")) {
                                                                            b3 = 0;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        if (b3 != 0) {
                                                                            f6 = f + (f5 / 2.0f);
                                                                            i4 = 1;
                                                                        } else if (b3 != 1) {
                                                                            i4 = 0;
                                                                            f6 = f;
                                                                        } else {
                                                                            f6 = f + f5;
                                                                            i4 = 2;
                                                                        }
                                                                    } else {
                                                                        i4 = 0;
                                                                        f6 = f;
                                                                    }
                                                                    float f11 = 1.0f / i16;
                                                                    strZzc4 = zzfs.zzc(xmlPullParserNewPullParser, "writingMode");
                                                                    if (strZzc4 != null) {
                                                                        strZza = zzgsf.zza(strZzc4);
                                                                        iHashCode = strZza.hashCode();
                                                                        if (iHashCode != 3694) {
                                                                            if (iHashCode != 3553396) {
                                                                                if (iHashCode != 3553576 && strZza.equals("tbrl")) {
                                                                                    b2 = 2;
                                                                                } else {
                                                                                    b2 = -1;
                                                                                }
                                                                            } else if (strZza.equals("tblr")) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza.equals("tb")) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        if (b2 != 0 || b2 == 1) {
                                                                            i5 = 2;
                                                                        } else if (b2 != 2) {
                                                                            i5 = Integer.MIN_VALUE;
                                                                        } else {
                                                                            i5 = 1;
                                                                        }
                                                                    } else {
                                                                        i5 = Integer.MIN_VALUE;
                                                                    }
                                                                    zzaofVar = new zzaof(strZzc8, f3, f6, 0, i4, f4, f5, 1, f11, i5);
                                                                } catch (NumberFormatException unused8) {
                                                                    zzef.zzc("TtmlParser", "Ignoring region with malformed origin: ".concat(strZzL));
                                                                }
                                                            }
                                                        }
                                                        zzaofVar = r48;
                                                    } else {
                                                        str6 = str16;
                                                        map2 = map5;
                                                        str7 = str17;
                                                        f = 0.0f;
                                                        f2 = 0.0f;
                                                    }
                                                    f3 = f2;
                                                    strZzc2 = zzfs.zzc(xmlPullParserNewPullParser, "extent");
                                                    if (strZzc2 == null) {
                                                        strZzc2 = zzaohVar.zzN();
                                                    }
                                                    if (strZzc2 != null) {
                                                        matcher = zzb.matcher(strZzc2);
                                                        matcher2 = zzf.matcher(strZzc2);
                                                        if (matcher.matches()) {
                                                            strGroup3 = matcher.group(1);
                                                            if (strGroup3 != null) {
                                                                throw r48;
                                                            }
                                                            String str29 = strGroup3;
                                                            f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                            strGroup4 = matcher.group(2);
                                                            if (strGroup4 != null) {
                                                                throw r48;
                                                            }
                                                            String str210 = strGroup4;
                                                            f4 = f7;
                                                            f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                        } else {
                                                            if (matcher2.matches()) {
                                                                String.valueOf(strZzL);
                                                                zzef.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                            } else if (r4 == 0) {
                                                                String.valueOf(strZzL);
                                                                zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                            } else {
                                                                strGroup = matcher2.group(1);
                                                                if (strGroup != null) {
                                                                    throw r48;
                                                                }
                                                                String str211 = strGroup;
                                                                i6 = Integer.parseInt(strGroup);
                                                                strGroup2 = matcher2.group(2);
                                                                if (strGroup2 != null) {
                                                                    throw r48;
                                                                }
                                                                String str212 = strGroup2;
                                                                int i21 = Integer.parseInt(strGroup2);
                                                                float f12 = i6 / r4.zza;
                                                                f5 = i21 / r4.zzb;
                                                                f4 = f12;
                                                            }
                                                            zzaofVar = r48;
                                                        }
                                                    } else {
                                                        f4 = 1.0f;
                                                        f5 = 1.0f;
                                                    }
                                                    strZzc3 = zzfs.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                    if (strZzc3 != null) {
                                                        strZza2 = zzgsf.zza(strZzc3);
                                                        iHashCode2 = strZza2.hashCode();
                                                        if (iHashCode2 != -1364013995) {
                                                            if (iHashCode2 != 92734940) {
                                                                b3 = -1;
                                                            } else {
                                                                b3 = 1;
                                                            }
                                                        } else if (strZza2.equals("center")) {
                                                            b3 = 0;
                                                        } else {
                                                            b3 = -1;
                                                        }
                                                        if (b3 != 0) {
                                                            f6 = f + (f5 / 2.0f);
                                                            i4 = 1;
                                                        } else if (b3 != 1) {
                                                            i4 = 0;
                                                            f6 = f;
                                                        } else {
                                                            f6 = f + f5;
                                                            i4 = 2;
                                                        }
                                                    } else {
                                                        i4 = 0;
                                                        f6 = f;
                                                    }
                                                    float f13 = 1.0f / i16;
                                                    strZzc4 = zzfs.zzc(xmlPullParserNewPullParser, "writingMode");
                                                    if (strZzc4 != null) {
                                                        strZza = zzgsf.zza(strZzc4);
                                                        iHashCode = strZza.hashCode();
                                                        if (iHashCode != 3694) {
                                                            if (iHashCode != 3553396) {
                                                                if (iHashCode != 3553576) {
                                                                    b2 = -1;
                                                                } else {
                                                                    b2 = 2;
                                                                }
                                                            } else if (strZza.equals("tblr")) {
                                                                b2 = 1;
                                                            } else {
                                                                b2 = -1;
                                                            }
                                                        } else if (strZza.equals("tb")) {
                                                            b2 = 0;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                        if (b2 != 0) {
                                                            i5 = 2;
                                                        } else {
                                                            i5 = 2;
                                                        }
                                                    } else {
                                                        i5 = Integer.MIN_VALUE;
                                                    }
                                                    zzaofVar = new zzaof(strZzc8, f3, f6, 0, i4, f4, f5, 1, f13, i5);
                                                } else {
                                                    str5 = strZzc9;
                                                }
                                                strZzL = str5;
                                                if (strZzL != null) {
                                                    map2 = map5;
                                                    matcher3 = zzb.matcher(strZzL);
                                                    str6 = str16;
                                                    matcher4 = zzf.matcher(strZzL);
                                                    if (matcher3.matches()) {
                                                        str7 = str17;
                                                        strGroup7 = matcher3.group(1);
                                                        if (strGroup7 != null) {
                                                            throw r48;
                                                        }
                                                        String str213 = strGroup7;
                                                        f2 = Float.parseFloat(strGroup7) / 100.0f;
                                                        strGroup8 = matcher3.group(2);
                                                        if (strGroup8 != null) {
                                                            throw r48;
                                                        }
                                                        String str214 = strGroup8;
                                                        f = Float.parseFloat(strGroup8) / 100.0f;
                                                    } else {
                                                        str7 = str17;
                                                        if (matcher4.matches()) {
                                                            zzef.zzc("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZzL));
                                                        } else if (r4 == 0) {
                                                            zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZzL));
                                                        } else {
                                                            strGroup5 = matcher4.group(1);
                                                            if (strGroup5 != null) {
                                                                throw r48;
                                                            }
                                                            String str215 = strGroup5;
                                                            i7 = Integer.parseInt(strGroup5);
                                                            strGroup6 = matcher4.group(2);
                                                            if (strGroup6 != null) {
                                                                throw r48;
                                                            }
                                                            String str216 = strGroup6;
                                                            int i110 = Integer.parseInt(strGroup6);
                                                            float f14 = i7 / r4.zza;
                                                            f = i110 / r4.zzb;
                                                            f3 = f14;
                                                            strZzc2 = zzfs.zzc(xmlPullParserNewPullParser, "extent");
                                                            if (strZzc2 == null) {
                                                                strZzc2 = zzaohVar.zzN();
                                                            }
                                                            if (strZzc2 != null) {
                                                                matcher = zzb.matcher(strZzc2);
                                                                matcher2 = zzf.matcher(strZzc2);
                                                                if (matcher.matches()) {
                                                                    strGroup3 = matcher.group(1);
                                                                    if (strGroup3 != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str217 = strGroup3;
                                                                    f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                                    strGroup4 = matcher.group(2);
                                                                    if (strGroup4 != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str218 = strGroup4;
                                                                    f4 = f7;
                                                                    f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                                } else if (matcher2.matches()) {
                                                                    String.valueOf(strZzL);
                                                                    zzef.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                                } else if (r4 == 0) {
                                                                    String.valueOf(strZzL);
                                                                    zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                                } else {
                                                                    strGroup = matcher2.group(1);
                                                                    if (strGroup != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str219 = strGroup;
                                                                    i6 = Integer.parseInt(strGroup);
                                                                    strGroup2 = matcher2.group(2);
                                                                    if (strGroup2 != null) {
                                                                        throw r48;
                                                                    }
                                                                    String str2110 = strGroup2;
                                                                    int i22 = Integer.parseInt(strGroup2);
                                                                    float f15 = i6 / r4.zza;
                                                                    f5 = i22 / r4.zzb;
                                                                    f4 = f15;
                                                                }
                                                            } else {
                                                                f4 = 1.0f;
                                                                f5 = 1.0f;
                                                            }
                                                            strZzc3 = zzfs.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                            if (strZzc3 != null) {
                                                                strZza2 = zzgsf.zza(strZzc3);
                                                                iHashCode2 = strZza2.hashCode();
                                                                if (iHashCode2 != -1364013995) {
                                                                    if (iHashCode2 != 92734940) {
                                                                        b3 = -1;
                                                                    } else {
                                                                        b3 = 1;
                                                                    }
                                                                } else if (strZza2.equals("center")) {
                                                                    b3 = 0;
                                                                } else {
                                                                    b3 = -1;
                                                                }
                                                                if (b3 != 0) {
                                                                    f6 = f + (f5 / 2.0f);
                                                                    i4 = 1;
                                                                } else if (b3 != 1) {
                                                                    i4 = 0;
                                                                    f6 = f;
                                                                } else {
                                                                    f6 = f + f5;
                                                                    i4 = 2;
                                                                }
                                                            } else {
                                                                i4 = 0;
                                                                f6 = f;
                                                            }
                                                            float f16 = 1.0f / i16;
                                                            strZzc4 = zzfs.zzc(xmlPullParserNewPullParser, "writingMode");
                                                            if (strZzc4 != null) {
                                                                strZza = zzgsf.zza(strZzc4);
                                                                iHashCode = strZza.hashCode();
                                                                if (iHashCode != 3694) {
                                                                    if (iHashCode != 3553396) {
                                                                        if (iHashCode != 3553576) {
                                                                            b2 = -1;
                                                                        } else {
                                                                            b2 = 2;
                                                                        }
                                                                    } else if (strZza.equals("tblr")) {
                                                                        b2 = 1;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                } else if (strZza.equals("tb")) {
                                                                    b2 = 0;
                                                                } else {
                                                                    b2 = -1;
                                                                }
                                                                if (b2 != 0) {
                                                                    i5 = 2;
                                                                } else {
                                                                    i5 = 2;
                                                                }
                                                            } else {
                                                                i5 = Integer.MIN_VALUE;
                                                            }
                                                            zzaofVar = new zzaof(strZzc8, f3, f6, 0, i4, f4, f5, 1, f16, i5);
                                                        }
                                                    }
                                                    zzaofVar = r48;
                                                } else {
                                                    str6 = str16;
                                                    map2 = map5;
                                                    str7 = str17;
                                                    f = 0.0f;
                                                    f2 = 0.0f;
                                                }
                                                f3 = f2;
                                                strZzc2 = zzfs.zzc(xmlPullParserNewPullParser, "extent");
                                                if (strZzc2 == null) {
                                                    strZzc2 = zzaohVar.zzN();
                                                }
                                                if (strZzc2 != null) {
                                                    matcher = zzb.matcher(strZzc2);
                                                    matcher2 = zzf.matcher(strZzc2);
                                                    if (matcher.matches()) {
                                                        strGroup3 = matcher.group(1);
                                                        if (strGroup3 != null) {
                                                            throw r48;
                                                        }
                                                        String str2111 = strGroup3;
                                                        f7 = Float.parseFloat(strGroup3) / 100.0f;
                                                        strGroup4 = matcher.group(2);
                                                        if (strGroup4 != null) {
                                                            throw r48;
                                                        }
                                                        String str2112 = strGroup4;
                                                        f4 = f7;
                                                        f5 = Float.parseFloat(strGroup4) / 100.0f;
                                                    } else {
                                                        if (matcher2.matches()) {
                                                            String.valueOf(strZzL);
                                                            zzef.zzc("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strZzL)));
                                                        } else if (r4 == 0) {
                                                            String.valueOf(strZzL);
                                                            zzef.zzc("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strZzL)));
                                                        } else {
                                                            strGroup = matcher2.group(1);
                                                            if (strGroup != null) {
                                                                throw r48;
                                                            }
                                                            String str2113 = strGroup;
                                                            i6 = Integer.parseInt(strGroup);
                                                            strGroup2 = matcher2.group(2);
                                                            if (strGroup2 != null) {
                                                                throw r48;
                                                            }
                                                            String str2114 = strGroup2;
                                                            int i23 = Integer.parseInt(strGroup2);
                                                            float f17 = i6 / r4.zza;
                                                            f5 = i23 / r4.zzb;
                                                            f4 = f17;
                                                        }
                                                        zzaofVar = r48;
                                                    }
                                                } else {
                                                    f4 = 1.0f;
                                                    f5 = 1.0f;
                                                }
                                                strZzc3 = zzfs.zzc(xmlPullParserNewPullParser, "displayAlign");
                                                if (strZzc3 != null) {
                                                    strZza2 = zzgsf.zza(strZzc3);
                                                    iHashCode2 = strZza2.hashCode();
                                                    if (iHashCode2 != -1364013995) {
                                                        if (iHashCode2 != 92734940) {
                                                            b3 = -1;
                                                        } else {
                                                            b3 = 1;
                                                        }
                                                    } else if (strZza2.equals("center")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    if (b3 != 0) {
                                                        f6 = f + (f5 / 2.0f);
                                                        i4 = 1;
                                                    } else if (b3 != 1) {
                                                        i4 = 0;
                                                        f6 = f;
                                                    } else {
                                                        f6 = f + f5;
                                                        i4 = 2;
                                                    }
                                                } else {
                                                    i4 = 0;
                                                    f6 = f;
                                                }
                                                float f18 = 1.0f / i16;
                                                strZzc4 = zzfs.zzc(xmlPullParserNewPullParser, "writingMode");
                                                if (strZzc4 != null) {
                                                    strZza = zzgsf.zza(strZzc4);
                                                    iHashCode = strZza.hashCode();
                                                    if (iHashCode != 3694) {
                                                        if (iHashCode != 3553396) {
                                                            if (iHashCode != 3553576) {
                                                                b2 = -1;
                                                            } else {
                                                                b2 = 2;
                                                            }
                                                        } else if (strZza.equals("tblr")) {
                                                            b2 = 1;
                                                        } else {
                                                            b2 = -1;
                                                        }
                                                    } else if (strZza.equals("tb")) {
                                                        b2 = 0;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                    if (b2 != 0) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                } else {
                                                    i5 = Integer.MIN_VALUE;
                                                }
                                                zzaofVar = new zzaof(strZzc8, f3, f6, 0, i4, f4, f5, 1, f18, i5);
                                            }
                                            if (zzaofVar != 0) {
                                                map4.put(zzaofVar.zza, zzaofVar);
                                            }
                                            str4 = str20;
                                            map = map2;
                                            str16 = str6;
                                            str3 = str7;
                                        } else {
                                            String str30 = str16;
                                            HashMap map6 = map5;
                                            String str31 = str19;
                                            str3 = str17;
                                            if (zzfs.zzb(xmlPullParserNewPullParser, str3)) {
                                                while (true) {
                                                    xmlPullParserNewPullParser.next();
                                                    str16 = str30;
                                                    if (!zzfs.zzb(xmlPullParserNewPullParser, str16) || (strZzc = zzfs.zzc(xmlPullParserNewPullParser, "id")) == null) {
                                                        map = map6;
                                                    } else {
                                                        map = map6;
                                                        map.put(strZzc, xmlPullParserNewPullParser.nextText());
                                                    }
                                                    if (!zzfs.zza(xmlPullParserNewPullParser, str3)) {
                                                        str30 = str16;
                                                        map6 = map;
                                                    }
                                                }
                                            } else {
                                                map = map6;
                                                str16 = str30;
                                            }
                                            str4 = str31;
                                        }
                                    }
                                    if (zzfs.zza(xmlPullParserNewPullParser, str4)) {
                                        zzaocVar2 = zzaocVar5;
                                        arrayDeque = arrayDeque3;
                                    } else {
                                        str17 = str3;
                                        map5 = map;
                                        str18 = str18;
                                        str10 = str10;
                                        str19 = str4;
                                        zzaocVar5 = zzaocVar5;
                                    }
                                }
                            } else {
                                zzaoc zzaocVar6 = zzaocVar5;
                                str10 = str10;
                                map = map5;
                                Object obj3 = "region";
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    zzaoh zzaohVarZzd2 = zzd(xmlPullParserNewPullParser, r48);
                                    int i24 = 0;
                                    String str32 = str;
                                    long jZzg = -9223372036854775807L;
                                    long jZzg2 = -9223372036854775807L;
                                    long jZzg3 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    while (i24 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i24);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i24);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    obj = obj3;
                                                    b = !attributeName.equals(obj) ? (byte) -1 : (byte) 4;
                                                    break;
                                                case 99841:
                                                    if (!attributeName.equals("dur")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b = 2;
                                                    }
                                                    break;
                                                case 100571:
                                                    if (!attributeName.equals("end")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b = 1;
                                                    }
                                                    break;
                                                case 93616297:
                                                    if (!attributeName.equals("begin")) {
                                                        obj = obj3;
                                                    } else {
                                                        b = 0;
                                                        obj = obj3;
                                                    }
                                                    break;
                                                case 109780401:
                                                    if (!attributeName.equals("style")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b = 3;
                                                    }
                                                    break;
                                                case 1292595405:
                                                    if (!attributeName.equals("backgroundImage")) {
                                                        obj = obj3;
                                                    } else {
                                                        obj = obj3;
                                                        b = 5;
                                                    }
                                                    break;
                                                default:
                                                    obj = obj3;
                                                    break;
                                            }
                                            if (b != 0) {
                                                i3 = 1;
                                                if (b == 1) {
                                                    zzaocVar2 = zzaocVar6;
                                                    jZzg = zzg(attributeValue6, zzaocVar2);
                                                } else if (b != 2) {
                                                    if (b == 3) {
                                                        i3 = 1;
                                                        String[] strArrZzc2 = zzc(attributeValue6);
                                                        if (strArrZzc2.length > 0) {
                                                            strArr = strArrZzc2;
                                                        }
                                                    } else if (b == 4) {
                                                        i3 = 1;
                                                        if (map4.containsKey(attributeValue6)) {
                                                            str32 = attributeValue6;
                                                        }
                                                    } else if (b != 5) {
                                                        i3 = 1;
                                                    } else {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                i3 = 1;
                                                                try {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                } catch (zzana e) {
                                                                    e = e;
                                                                    zzaocVar2 = zzaocVar6;
                                                                    arrayDeque = arrayDeque3;
                                                                    zzef.zzd("TtmlParser", "Suppressing parser error", e);
                                                                    i8 = i3;
                                                                    r17 = r4;
                                                                    zzaocVar4 = zzaocVar2;
                                                                    i9 = i16;
                                                                    zzaoiVar = zzaoiVar;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    map5 = map;
                                                                    str8 = str;
                                                                    zzaocVar3 = zzaocVar;
                                                                    str9 = str2;
                                                                    obj2 = null;
                                                                    arrayDeque2 = arrayDeque;
                                                                    str10 = str10;
                                                                    r19 = r17;
                                                                }
                                                            } else {
                                                                i3 = 1;
                                                            }
                                                        } catch (zzana e2) {
                                                            e = e2;
                                                            i3 = 1;
                                                        }
                                                    }
                                                    zzaocVar2 = zzaocVar6;
                                                } else {
                                                    zzaocVar2 = zzaocVar6;
                                                    i3 = 1;
                                                    jZzg3 = zzg(attributeValue6, zzaocVar2);
                                                }
                                            } else {
                                                zzaocVar2 = zzaocVar6;
                                                i3 = 1;
                                                jZzg2 = zzg(attributeValue6, zzaocVar2);
                                            }
                                            try {
                                                i24++;
                                                obj3 = obj;
                                                zzaocVar6 = zzaocVar2;
                                            } catch (zzana e3) {
                                                e = e3;
                                                arrayDeque = arrayDeque3;
                                                zzef.zzd("TtmlParser", "Suppressing parser error", e);
                                                i8 = i3;
                                                r17 = r4;
                                                zzaocVar4 = zzaocVar2;
                                                i9 = i16;
                                                zzaoiVar = zzaoiVar;
                                                xmlPullParserNewPullParser.next();
                                                eventType = xmlPullParserNewPullParser.getEventType();
                                                map5 = map;
                                                str8 = str;
                                                zzaocVar3 = zzaocVar;
                                                str9 = str2;
                                                obj2 = null;
                                                arrayDeque2 = arrayDeque;
                                                str10 = str10;
                                                r19 = r17;
                                            }
                                        } catch (zzana e4) {
                                            e = e4;
                                            zzaocVar2 = zzaocVar6;
                                            i3 = 1;
                                        }
                                    }
                                    zzaocVar2 = zzaocVar6;
                                    i3 = 1;
                                    if (zzaobVar3 != null) {
                                        zzaobVar = zzaobVar3;
                                        long j3 = zzaobVar.zzd;
                                        if (j3 == -9223372036854775807L) {
                                            zzaobVar2 = zzaobVar;
                                        } else {
                                            jZzg2 = jZzg2 != -9223372036854775807L ? jZzg2 + j3 : -9223372036854775807L;
                                            if (jZzg != -9223372036854775807L) {
                                                jZzg += j3;
                                                zzaobVar2 = zzaobVar;
                                            } else {
                                                zzaobVar2 = zzaobVar;
                                                jZzg = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        zzaobVar = zzaobVar3;
                                        zzaobVar2 = null;
                                    }
                                    try {
                                        if (jZzg == -9223372036854775807L) {
                                            if (jZzg3 != -9223372036854775807L) {
                                                j2 = jZzg2 + jZzg3;
                                            } else {
                                                if (zzaobVar2 != null) {
                                                    j2 = zzaobVar2.zze;
                                                    if (j2 != -9223372036854775807L) {
                                                    }
                                                    zzaobVarZzb = zzaob.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzaohVarZzd2, strArr, str32, strSubstring, zzaobVar2);
                                                    arrayDeque = arrayDeque3;
                                                    arrayDeque.push(zzaobVarZzb);
                                                    if (zzaobVar != null) {
                                                        zzaobVar.zzd(zzaobVarZzb);
                                                    }
                                                }
                                                j = -9223372036854775807L;
                                                zzaobVarZzb = zzaob.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzaohVarZzd2, strArr, str32, strSubstring, zzaobVar2);
                                                arrayDeque = arrayDeque3;
                                                arrayDeque.push(zzaobVarZzb);
                                                if (zzaobVar != null) {
                                                    zzaobVar.zzd(zzaobVarZzb);
                                                }
                                            }
                                            j = j2;
                                        } else {
                                            j = jZzg;
                                        }
                                        arrayDeque.push(zzaobVarZzb);
                                        if (zzaobVar != null) {
                                            zzaobVar.zzd(zzaobVarZzb);
                                        }
                                    } catch (zzana e5) {
                                        e = e5;
                                        zzef.zzd("TtmlParser", "Suppressing parser error", e);
                                        i8 = i3;
                                        r17 = r4;
                                        zzaocVar4 = zzaocVar2;
                                        i9 = i16;
                                        zzaoiVar = zzaoiVar;
                                    }
                                    zzaobVarZzb = zzaob.zzb(xmlPullParserNewPullParser.getName(), jZzg2, j, zzaohVarZzd2, strArr, str32, strSubstring, zzaobVar2);
                                    arrayDeque = arrayDeque3;
                                } catch (zzana e6) {
                                    e = e6;
                                    zzaocVar2 = zzaocVar6;
                                    arrayDeque = arrayDeque3;
                                    i3 = 1;
                                }
                            }
                            r18 = r4;
                            zzaocVar4 = zzaocVar2;
                            i9 = i16;
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 26);
                            sb.append(str10);
                            sb.append(name2);
                            zzef.zzb("TtmlParser", sb.toString());
                            zzaocVar4 = zzaocVar5;
                            str10 = str10;
                            r17 = r4;
                            map = map5;
                            i9 = i16;
                            zzaoiVar = zzaoiVar;
                            arrayDeque = arrayDeque3;
                            i8 = 1;
                        }
                    } else {
                        str2 = str9;
                        str10 = str10;
                        arrayDeque = arrayDeque2;
                        zzaocVar = zzaocVar3;
                        zzaoiVar = zzaoiVar;
                        i8 = i8;
                        map = map5;
                        if (eventType != 4) {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    zzaob zzaobVar4 = (zzaob) arrayDeque.peek();
                                    if (zzaobVar4 == null) {
                                        r18 = r19;
                                        throw null;
                                    }
                                    r18 = r19;
                                    zzaoiVar = new zzaoi(zzaobVar4, map3, map4, map);
                                } else {
                                    r18 = r19;
                                    zzaoiVar = zzaoiVar;
                                }
                                arrayDeque.pop();
                                r17 = r19;
                            }
                            i8 = i8;
                        } else {
                            if (zzaobVar3 == null) {
                                throw null;
                            }
                            zzaobVar3.zzd(zzaob.zza(xmlPullParserNewPullParser.getText()));
                            r18 = r19;
                        }
                    }
                    r18 = r19;
                    r18 = r19;
                    zzaoiVar = zzaoiVar;
                    r17 = r18;
                    i8 = i8;
                } else {
                    str = str8;
                    str2 = str9;
                    str10 = str10;
                    arrayDeque = arrayDeque2;
                    zzaocVar = zzaocVar3;
                    zzaoiVar = zzaoiVar;
                    i8 = i8;
                    map = map5;
                    if (eventType == 2) {
                        i8++;
                        r17 = r19;
                    } else {
                        if (eventType == 3) {
                            r18 = r19;
                            i8--;
                            r17 = r19;
                        }
                        r18 = r19;
                        r18 = r19;
                        zzaoiVar = zzaoiVar;
                        r17 = r18;
                        i8 = i8;
                    }
                    zzaoiVar = zzaoiVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map5 = map;
                str8 = str;
                zzaocVar3 = zzaocVar;
                str9 = str2;
                obj2 = null;
                arrayDeque2 = arrayDeque;
                str10 = str10;
                r19 = r17;
            }
            zzaoi zzaoiVar2 = zzaoiVar;
            if (zzaoiVar2 != null) {
                return zzaoiVar2;
            }
            throw null;
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new IllegalStateException("Unable to decode source", e8);
        }
    }

    public zzaoe() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }
}
