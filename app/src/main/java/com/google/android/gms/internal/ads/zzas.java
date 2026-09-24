package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzas {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzb(String str) {
        return "video".equals(zzj(str));
    }

    public static boolean zzc(String str) {
        return "image".equals(zzj(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean zzd(String str, String str2) {
        byte b;
        zzar zzarVarZzi;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -1354451219:
                if (!str.equals("application/vnd.dvb.ait")) {
                    b = -1;
                } else {
                    b = 16;
                }
                break;
            case -1348231605:
                if (!str.equals("application/x-icy")) {
                    b = -1;
                } else {
                    b = Ascii.f22499SI;
                }
                break;
            case -1265048566:
                if (!str.equals("application/x-camera-motion")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case -1248341703:
                if (!str.equals("application/id3")) {
                    b = -1;
                } else {
                    b = Ascii.f22492FF;
                }
                break;
            case -432837260:
                if (!str.equals("audio/mpeg-L1")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -432837259:
                if (!str.equals("audio/mpeg-L2")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm")) {
                    b = -1;
                } else {
                    b = Ascii.DC4;
                }
                break;
            case -43764892:
                if (!str.equals("application/meta")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 187078296:
                if (!str.equals("audio/ac3")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 187094639:
                if (!str.equals("audio/raw")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 469933706:
                if (!str.equals(MimeTypes.APPLICATION_MEDIA3_CUES)) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 1054472807:
                if (!str.equals("application/x-itut-t35")) {
                    b = -1;
                } else {
                    b = Ascii.DC2;
                }
                break;
            case 1154383568:
                if (!str.equals("application/x-emsg")) {
                    b = -1;
                } else {
                    b = Ascii.f22490CR;
                }
                break;
            case 1331836563:
                if (!str.equals("video/apv")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1504578661:
                if (!str.equals("audio/eac3")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1504619009:
                if (!str.equals("audio/flac")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1504831518:
                if (!str.equals("audio/mpeg")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1652648887:
                if (!str.equals("application/x-scte35")) {
                    b = -1;
                } else {
                    b = Ascii.f22500SO;
                }
                break;
            case 1903231877:
                if (!str.equals("audio/g711-alaw")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1903589369:
                if (!str.equals("audio/g711-mlaw")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return true;
            case 20:
                return (str2 == null || (zzarVarZzi = zzi(str2)) == null || (iZza = zzarVarZzi.zza()) == 0 || iZza == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String zze(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzj(str)) || MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zzaq zzaqVar = (zzaq) arrayList.get(i);
            String str2 = zzaqVar.zza;
            if (str.equals(null)) {
                int i2 = zzaqVar.zzb;
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int zzg(String str, String str2) {
        byte b;
        zzar zzarVarZzi;
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -1365340241:
                if (!str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -1095064472:
                if (!str.equals("audio/vnd.dts")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -53558318:
                if (!str.equals("audio/mp4a-latm")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 187078296:
                if (!str.equals("audio/ac3")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 187078297:
                if (!str.equals("audio/ac4")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 187081724:
                if (!str.equals("audio/dsd")) {
                    b = -1;
                } else {
                    b = Ascii.f22492FF;
                }
                break;
            case 550520934:
                if (!str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1504578661:
                if (!str.equals("audio/eac3")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1504831518:
                if (!str.equals("audio/mpeg")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1504891608:
                if (!str.equals("audio/opus")) {
                    b = -1;
                } else {
                    b = Ascii.f22503VT;
                }
                break;
            case 1505942594:
                if (!str.equals("audio/vnd.dts.hd")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1556697186:
                if (!str.equals("audio/true-hd")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzarVarZzi = zzi(str2)) == null) {
                    return 0;
                }
                return zzarVarZzi.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
            case 8:
                return 8;
            case 9:
                return 30;
            case 10:
                return 14;
            case 11:
                return 20;
            case 12:
                return 31;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strZza = zzgsf.zza(str);
        switch (strZza) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "audio/mp3":
                return "audio/mpeg";
            case "audio/x-wav":
                return "audio/wav";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            default:
                return strZza;
        }
    }

    static zzar zzi(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzar(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String zzj(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
