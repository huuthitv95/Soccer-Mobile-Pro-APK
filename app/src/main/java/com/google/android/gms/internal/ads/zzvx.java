package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvx {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzve zza() throws zzvp {
        List listZzb = zzb("audio/raw", false, false);
        if (listZzb.isEmpty()) {
            return null;
        }
        return (zzve) listZzb.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zzvp {
        zzvo zzvoVar = new zzvo(str, z, z2);
        HashMap map = zzb;
        List list = (List) map.get(zzvoVar);
        if (list != null) {
            return list;
        }
        ArrayList arrayListZzh = zzh(zzvoVar, new zzvs(z, z2, str.equals("video/mv-hevc")));
        if (z && arrayListZzh.isEmpty() && Build.VERSION.SDK_INT == 23) {
            arrayListZzh = zzh(zzvoVar, new zzvr(null));
            if (!arrayListZzh.isEmpty()) {
                String str2 = ((zzve) arrayListZzh.get(0)).zza;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + str2.length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                zzef.zzc("MediaCodecUtil", sb.toString());
            }
        }
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzh.size() == 1 && ((zzve) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzve.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzj(arrayListZzh, zzvt.zza);
        }
        if (Build.VERSION.SDK_INT < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzve) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzve) arrayListZzh.remove(0));
        }
        zzgvz zzgvzVarZzq = zzgvz.zzq(arrayListZzh);
        map.put(zzvoVar, zzgvzVarZzq);
        return zzgvzVarZzq;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzc(zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        List listZza = zzvnVar.zza(zzvVar.zzp, z, z2);
        List listZzd = zzd(zzvnVar, zzvVar, z, z2);
        int i = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        zzgvwVar.zzh(listZza);
        zzgvwVar.zzh(listZzd);
        return zzgvwVar.zzi();
    }

    public static List zzd(zzvn zzvnVar, zzv zzvVar, boolean z, boolean z2) throws zzvp {
        String strZzg = zzg(zzvVar);
        return strZzg == null ? zzgvz.zzi() : zzvnVar.zza(strZzg, z, z2);
    }

    public static List zze(final Context context, List list, final zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzvw() { // from class: com.google.android.gms.internal.ads.zzvv
            @Override // com.google.android.gms.internal.ads.zzvw
            public final /* synthetic */ int zza(Object obj) {
                int i = zzvx.zza;
                return ((zzve) obj).zzd(context, zzvVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair pairZze;
        String str = zzvVar.zzp;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZze = zzdp.zze(zzvVar)) != null) {
            int iIntValue = ((Integer) pairZze.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zziVar.zzd == 6 && zziVar.zzc == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cb A[Catch: Exception -> 0x026c, TRY_LEAVE, TryCatch #2 {Exception -> 0x026c, blocks: (B:112:0x01c4, B:113:0x01cb), top: B:177:0x01c4 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6 A[Catch: Exception -> 0x0269, TryCatch #3 {Exception -> 0x0269, blocks: (B:118:0x01d8, B:120:0x01e6, B:121:0x01eb, B:123:0x01fb, B:125:0x0203), top: B:179:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01eb A[Catch: Exception -> 0x0269, TryCatch #3 {Exception -> 0x0269, blocks: (B:118:0x01d8, B:120:0x01e6, B:121:0x01eb, B:123:0x01fb, B:125:0x0203), top: B:179:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01fb A[Catch: Exception -> 0x0269, TryCatch #3 {Exception -> 0x0269, blocks: (B:118:0x01d8, B:120:0x01e6, B:121:0x01eb, B:123:0x01fb, B:125:0x0203), top: B:179:0x01d8 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x028b A[Catch: Exception -> 0x02f1, TRY_ENTER, TryCatch #6 {Exception -> 0x02f1, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:10:0x003d, B:14:0x004c, B:16:0x0052, B:18:0x005c, B:20:0x0064, B:22:0x006c, B:24:0x0078, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:32:0x00a0, B:34:0x00aa, B:36:0x00b4, B:38:0x00be, B:42:0x00cb, B:44:0x00d1, B:46:0x00d9, B:51:0x00eb, B:53:0x00f6, B:159:0x0285, B:162:0x028b, B:164:0x0291, B:165:0x02b2, B:166:0x02e0, B:56:0x0103, B:57:0x0106, B:59:0x010e, B:62:0x0119, B:64:0x0121, B:67:0x012c, B:69:0x0134, B:71:0x013c, B:76:0x014a, B:78:0x0152, B:81:0x015d, B:83:0x0165, B:86:0x0170, B:88:0x0178), top: B:185:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x02b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145 A[EDGE_INSN: B:74:0x0145->B:92:0x0184 BREAK  A[LOOP:1: B:52:0x00f4->B:56:0x0103]] */
    private static ArrayList zzh(zzvo zzvoVar, zzvq zzvqVar) throws zzvp {
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        int i3;
        boolean zZzd;
        boolean z;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        boolean z2;
        String strZza;
        boolean zIsVendor;
        boolean z3;
        zzvo zzvoVar2 = zzvoVar;
        zzvq zzvqVar2 = zzvqVar;
        String str4 = "secure-playback";
        String str5 = ")";
        try {
            ArrayList arrayList = new ArrayList();
            String str6 = zzvoVar2.zza;
            int iZza = zzvqVar2.zza();
            boolean zZzc = zzvqVar2.zzc();
            int i4 = 0;
            while (i4 < iZza) {
                MediaCodecInfo mediaCodecInfoZzb = zzvqVar2.zzb(i4);
                if (Build.VERSION.SDK_INT < 29 || !mediaCodecInfoZzb.isAlias()) {
                    int i5 = iZza;
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZzc && name.endsWith(".secure"))) {
                        str = str4;
                        i = i4;
                        i2 = i5;
                    } else {
                        int i6 = i4;
                        String str7 = str5;
                        if (Build.VERSION.SDK_INT < 24 && ("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name))) {
                            if (Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) && (Build.DEVICE.startsWith("zeroflte") || Build.DEVICE.startsWith("zerolte") || Build.DEVICE.startsWith("zenlte") || "SC-05G".equals(Build.DEVICE) || "marinelteatt".equals(Build.DEVICE) || "404SC".equals(Build.DEVICE) || "SC-04G".equals(Build.DEVICE) || "SCV31".equals(Build.DEVICE))) {
                                str = str4;
                                i2 = i5;
                                i = i6;
                            }
                            str5 = str7;
                        }
                        if (Build.VERSION.SDK_INT == 23 && "audio/eac3-joc".equals(str6) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                            str = str4;
                            i2 = i5;
                            i = i6;
                        } else {
                            String[] supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length) {
                                    int i8 = i7;
                                    str2 = supportedTypes[i8];
                                    if (!str2.equalsIgnoreCase(str6)) {
                                        i7 = i8 + 1;
                                    }
                                } else if (str6.equals("video/dolby-vision")) {
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if (!"OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str3 = null;
                                            break;
                                        }
                                        str2 = "video/dv_hevc";
                                    } else {
                                        str2 = "video/hevcdv";
                                    }
                                } else if (str6.equals("video/mv-hevc")) {
                                    if (!"c2.qti.mvhevc.decoder".equals(name) && !"c2.qti.mvhevc.decoder.secure".equals(name)) {
                                        str3 = null;
                                        break;
                                    }
                                    str2 = "video/x-mvhevc";
                                } else if (str6.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                    str2 = "audio/x-lg-alac";
                                } else if (str6.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                    str2 = "audio/x-lg-flac";
                                } else {
                                    if (!str6.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(name)) {
                                        str3 = null;
                                        break;
                                    }
                                    str2 = "audio/lg-ac3";
                                }
                                str3 = str2;
                                break;
                            }
                            if (str3 != null) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str3);
                                    boolean zZzd2 = zzvqVar2.zzd("tunneled-playback", str3, capabilitiesForType);
                                    boolean zZze = zzvqVar2.zze("tunneled-playback", str3, capabilitiesForType);
                                    try {
                                        if (zzvoVar2.zzc) {
                                            if (zZzd2) {
                                                zZzd = zzvqVar2.zzd(str4, str3, capabilitiesForType);
                                                boolean zZze2 = zzvqVar2.zze(str4, str3, capabilitiesForType);
                                                z = zzvoVar2.zzb;
                                                if (!z) {
                                                    if (z) {
                                                        if (zZzd) {
                                                            zZzd = true;
                                                        }
                                                    }
                                                    str = str4;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                        i = i6;
                                                    } else {
                                                        i = i6;
                                                        if (zzi(mediaCodecInfoZzb, str6)) {
                                                            zIsHardwareAccelerated = false;
                                                        } else {
                                                            zIsHardwareAccelerated = true;
                                                        }
                                                    }
                                                    zZzi = zzi(mediaCodecInfoZzb, str6);
                                                    z2 = zIsHardwareAccelerated;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzgsf.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZzc) {
                                                        z3 = zIsVendor;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (!zZzc) {
                                                            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 7);
                                                            sb.append(name);
                                                            sb.append(".secure");
                                                            String string = sb.toString();
                                                            name = name;
                                                            arrayList.add(zzve.zza(string, str6, str3, capabilitiesForType, z2, zZzi, z3, false, true));
                                                            break;
                                                            break;
                                                        }
                                                    } else {
                                                        z3 = zIsVendor;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (!zZzc) {
                                                            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 7);
                                                            sb2.append(name);
                                                            sb2.append(".secure");
                                                            String string2 = sb2.toString();
                                                            name = name;
                                                            arrayList.add(zzve.zza(string2, str6, str3, capabilitiesForType, z2, zZzi, z3, false, true));
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    if (z) {
                                                        if (zZzd) {
                                                            zZzd = true;
                                                        }
                                                    }
                                                    str = str4;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                        i = i6;
                                                    } else {
                                                        i = i6;
                                                        if (zzi(mediaCodecInfoZzb, str6)) {
                                                            zIsHardwareAccelerated = true;
                                                        } else {
                                                            zIsHardwareAccelerated = false;
                                                        }
                                                    }
                                                    zZzi = zzi(mediaCodecInfoZzb, str6);
                                                    z2 = zIsHardwareAccelerated;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzgsf.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = false;
                                                        }
                                                    }
                                                    if (zZzc) {
                                                        z3 = zIsVendor;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (!zZzc) {
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 7);
                                                            sb3.append(name);
                                                            sb3.append(".secure");
                                                            String string3 = sb3.toString();
                                                            name = name;
                                                            arrayList.add(zzve.zza(string3, str6, str3, capabilitiesForType, z2, zZzi, z3, false, true));
                                                            break;
                                                            break;
                                                        }
                                                    } else {
                                                        z3 = zIsVendor;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (!zZzc) {
                                                            StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 7);
                                                            sb4.append(name);
                                                            sb4.append(".secure");
                                                            String string4 = sb4.toString();
                                                            name = name;
                                                            arrayList.add(zzve.zza(string4, str6, str3, capabilitiesForType, z2, zZzi, z3, false, true));
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!zZze) {
                                            zZzd = zzvqVar2.zzd(str4, str3, capabilitiesForType);
                                            boolean zZze3 = zzvqVar2.zze(str4, str3, capabilitiesForType);
                                            z = zzvoVar2.zzb;
                                            if (!z || !zZze3) {
                                                if (z) {
                                                    if (zZzd) {
                                                        zZzd = true;
                                                    }
                                                }
                                                str = str4;
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    try {
                                                        zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                        i = i6;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        i = i6;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (Build.VERSION.SDK_INT == i3) {
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                        sb5.append("Failed to query codec ");
                                                        sb5.append(name);
                                                        sb5.append(" (");
                                                        sb5.append(str3);
                                                        sb5.append(str7);
                                                        zzef.zze("MediaCodecUtil", sb5.toString());
                                                        throw e;
                                                    }
                                                } else {
                                                    i = i6;
                                                    if (zzi(mediaCodecInfoZzb, str6)) {
                                                        zIsHardwareAccelerated = true;
                                                    } else {
                                                        zIsHardwareAccelerated = false;
                                                    }
                                                }
                                                try {
                                                    zZzi = zzi(mediaCodecInfoZzb, str6);
                                                    z2 = zIsHardwareAccelerated;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        zIsVendor = mediaCodecInfoZzb.isVendor();
                                                    } else {
                                                        strZza = zzgsf.zza(mediaCodecInfoZzb.getName());
                                                        if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                            zIsVendor = false;
                                                        } else {
                                                            zIsVendor = true;
                                                        }
                                                    }
                                                    if ((zZzc || z != zZzd) && (zZzc || z)) {
                                                        z3 = zIsVendor;
                                                        i2 = i5;
                                                        i3 = 23;
                                                        if (!zZzc && zZzd) {
                                                            StringBuilder sb6 = new StringBuilder(String.valueOf(name).length() + 7);
                                                            sb6.append(name);
                                                            sb6.append(".secure");
                                                            String string5 = sb6.toString();
                                                            name = name;
                                                            try {
                                                                arrayList.add(zzve.zza(string5, str6, str3, capabilitiesForType, z2, zZzi, z3, false, true));
                                                                break;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                if (Build.VERSION.SDK_INT == i3) {
                                                                }
                                                                StringBuilder sb7 = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                                sb7.append("Failed to query codec ");
                                                                sb7.append(name);
                                                                sb7.append(" (");
                                                                sb7.append(str3);
                                                                sb7.append(str7);
                                                                zzef.zze("MediaCodecUtil", sb7.toString());
                                                                throw e;
                                                            }
                                                        }
                                                    } else {
                                                        i2 = i5;
                                                        i3 = 23;
                                                        try {
                                                            arrayList.add(zzve.zza(name, str6, str3, capabilitiesForType, z2, zZzi, zIsVendor, false, false));
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            name = name;
                                                            if (Build.VERSION.SDK_INT == i3 || arrayList.isEmpty()) {
                                                                StringBuilder sb8 = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                                sb8.append("Failed to query codec ");
                                                                sb8.append(name);
                                                                sb8.append(" (");
                                                                sb8.append(str3);
                                                                sb8.append(str7);
                                                                zzef.zze("MediaCodecUtil", sb8.toString());
                                                                throw e;
                                                            }
                                                            StringBuilder sb9 = new StringBuilder(String.valueOf(name).length() + 46);
                                                            sb9.append("Skipping codec ");
                                                            sb9.append(name);
                                                            sb9.append(" (failed to query capabilities)");
                                                            zzef.zze("MediaCodecUtil", sb9.toString());
                                                        }
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    i2 = i5;
                                                    i3 = 23;
                                                    if (Build.VERSION.SDK_INT == i3) {
                                                    }
                                                    StringBuilder sb10 = new StringBuilder(String.valueOf(name).length() + 24 + str3.length() + 1);
                                                    sb10.append("Failed to query codec ");
                                                    sb10.append(name);
                                                    sb10.append(" (");
                                                    sb10.append(str3);
                                                    sb10.append(str7);
                                                    zzef.zze("MediaCodecUtil", sb10.toString());
                                                    throw e;
                                                }
                                            }
                                        }
                                        str = str4;
                                        i = i6;
                                        i2 = i5;
                                    } catch (Exception e5) {
                                        e = e5;
                                        str = str4;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    str = str4;
                                    name = name;
                                    i = i6;
                                    i2 = i5;
                                    i3 = 23;
                                }
                            } else {
                                str = str4;
                                i2 = i5;
                                i = i6;
                            }
                        }
                        str5 = str7;
                    }
                } else {
                    str = str4;
                    i2 = iZza;
                    i = i4;
                }
                i4 = i + 1;
                zzvqVar2 = zzvqVar;
                iZza = i2;
                str4 = str;
                zzvoVar2 = zzvoVar;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new zzvp(e7, null);
        }
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzas.zza(str)) {
            return true;
        }
        String strZza = zzgsf.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.") || ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google."))) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, final zzvw zzvwVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzvu
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                int i = zzvx.zza;
                zzvw zzvwVar2 = zzvwVar;
                return zzvwVar2.zza(obj2) - zzvwVar2.zza(obj);
            }
        });
    }
}
