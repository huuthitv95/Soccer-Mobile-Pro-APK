package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C11744X3;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzve {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;
    private int zzj;
    private int zzk;
    private float zzl;

    public static zzve zza(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new zzve(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback"), codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface") || Build.MANUFACTURER.equals("Xiaomi") || Build.MANUFACTURER.equals("OPPO") || Build.MANUFACTURER.equals("realme") || Build.MANUFACTURER.equals("motorola") || Build.MANUFACTURER.equals("LENOVO")) ? false : true);
    }

    private final boolean zzj(zzv zzvVar) {
        String str = this.zzb;
        return str.equals(zzvVar.zzp) || str.equals(zzvx.zzg(zzvVar));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187  */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7 A[PHI: r7
  0x00b7: PHI (r7v4 int) = (r7v3 int), (r7v3 int), (r7v5 int) binds: [B:42:0x00a8, B:44:0x00b0, B:47:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016a  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172  */
    /* JADX WARN: Code duplicated, block: B:95:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    /* JADX WARN: Code duplicated, block: B:98:0x017c  */
    private final boolean zzk(Context context, zzv zzvVar, boolean z) {
        int iIntValue;
        int iIntValue2;
        int i;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzb;
        String str;
        int length;
        int i2;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue3;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        int i3;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        String str2;
        int iHashCode;
        Pair pairZze = zzdp.zze(zzvVar);
        String str3 = zzvVar.zzp;
        byte b = -1;
        if (str3 != null && str3.equals("video/mv-hevc")) {
            String strZzh = zzas.zzh(this.zzc);
            if (!strZzh.equals("video/mv-hevc")) {
                if (strZzh.equals("video/hevc")) {
                    int i4 = zzvx.zza;
                    String strZzk = zzgo.zzk(zzvVar.zzs);
                    if (strZzk == null) {
                        pairZze = null;
                    } else {
                        String strTrim = strZzk.trim();
                        String str4 = zzfk.zza;
                        pairZze = zzdp.zzf(strZzk, strTrim.split("\\.", -1), zzvVar.zzF);
                    }
                }
                if (pairZze != null) {
                    iIntValue = ((Integer) pairZze.first).intValue();
                    iIntValue2 = ((Integer) pairZze.second).intValue();
                    i = 8;
                    if ("video/dolby-vision".equals(str3)) {
                        str2 = this.zzb;
                        iHashCode = str2.hashCode();
                        if (iHashCode != -1662735862) {
                            if (iHashCode != -1662541442) {
                                if (iHashCode == 1331836730) {
                                    b = 0;
                                }
                            } else if (str2.equals("video/hevc")) {
                                b = 1;
                            }
                        } else if (str2.equals("video/av01")) {
                            b = 2;
                        }
                        if (b == 0) {
                            if (b != 1) {
                            }
                            iIntValue = 2;
                        } else {
                            iIntValue = 8;
                        }
                        iIntValue2 = 0;
                    }
                    if (this.zzi) {
                        codecProfileLevelArrZzb = zzb();
                        str = this.zzb;
                        if (str.equals("audio/ac4")) {
                            codecCapabilities2 = this.zzd;
                            if (codecCapabilities2 != null) {
                                i3 = 8;
                            } else {
                                i3 = 8;
                            }
                            if (zzfk.zzP(context)) {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i3)};
                            } else {
                                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i3), zzvx.zzf(InputDeviceCompat.SOURCE_DPAD, i3), zzvx.zzf(514, i3), zzvx.zzf(1026, i3), zzvx.zzf(1028, i3)};
                            }
                            codecProfileLevelArrZzb = codecProfileLevelArr;
                        }
                        if (Build.VERSION.SDK_INT == 23) {
                            codecCapabilities = this.zzd;
                            if (codecCapabilities != null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = 0;
                            }
                            if (iIntValue3 >= 180000000) {
                                i = 1024;
                            } else if (iIntValue3 >= 120000000) {
                                i = 512;
                            } else if (iIntValue3 >= 60000000) {
                                i = 256;
                            } else if (iIntValue3 >= 30000000) {
                                i = 128;
                            } else if (iIntValue3 >= 18000000) {
                                i = 64;
                            } else if (iIntValue3 >= 12000000) {
                                i = 32;
                            } else if (iIntValue3 >= 7200000) {
                                i = 16;
                            } else if (iIntValue3 < 3600000) {
                                if (iIntValue3 >= 1800000) {
                                    i = 4;
                                } else if (iIntValue3 >= 800000) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                            }
                            codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i)};
                        }
                        length = codecProfileLevelArrZzb.length;
                        for (i2 = 0; i2 < length; i2++) {
                            codecProfileLevel = codecProfileLevelArrZzb[i2];
                            if (codecProfileLevel.profile == iIntValue) {
                            }
                        }
                        String str5 = zzvVar.zzk;
                        String str6 = this.zzc;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 22 + str6.length());
                        sb.append("codec.profileLevel, ");
                        sb.append(str5);
                        sb.append(", ");
                        sb.append(str6);
                        zzm(sb.toString());
                        return false;
                    }
                    codecProfileLevelArrZzb = zzb();
                    str = this.zzb;
                    if (str.equals("audio/ac4")) {
                        codecCapabilities2 = this.zzd;
                        if (codecCapabilities2 != null) {
                            i3 = 8;
                        } else {
                            i3 = 8;
                        }
                        if (zzfk.zzP(context)) {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i3)};
                        } else {
                            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i3), zzvx.zzf(InputDeviceCompat.SOURCE_DPAD, i3), zzvx.zzf(514, i3), zzvx.zzf(1026, i3), zzvx.zzf(1028, i3)};
                        }
                        codecProfileLevelArrZzb = codecProfileLevelArr;
                    }
                    if (Build.VERSION.SDK_INT == 23) {
                        codecCapabilities = this.zzd;
                        if (codecCapabilities != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= 180000000) {
                            i = 1024;
                        } else if (iIntValue3 >= 120000000) {
                            i = 512;
                        } else if (iIntValue3 >= 60000000) {
                            i = 256;
                        } else if (iIntValue3 >= 30000000) {
                            i = 128;
                        } else if (iIntValue3 >= 18000000) {
                            i = 64;
                        } else if (iIntValue3 >= 12000000) {
                            i = 32;
                        } else if (iIntValue3 >= 7200000) {
                            i = 16;
                        } else if (iIntValue3 < 3600000) {
                            if (iIntValue3 >= 1800000) {
                                i = 4;
                            } else if (iIntValue3 >= 800000) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i)};
                    }
                    length = codecProfileLevelArrZzb.length;
                    while (i2 < length) {
                        codecProfileLevel = codecProfileLevelArrZzb[i2];
                        if (codecProfileLevel.profile == iIntValue) {
                        }
                    }
                    String str7 = zzvVar.zzk;
                    String str8 = this.zzc;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 22 + str8.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str7);
                    sb2.append(", ");
                    sb2.append(str8);
                    zzm(sb2.toString());
                    return false;
                }
            }
        } else if (pairZze != null) {
            iIntValue = ((Integer) pairZze.first).intValue();
            iIntValue2 = ((Integer) pairZze.second).intValue();
            i = 8;
            if ("video/dolby-vision".equals(str3)) {
                str2 = this.zzb;
                iHashCode = str2.hashCode();
                if (iHashCode != -1662735862) {
                    if (iHashCode != -1662541442) {
                        if (iHashCode == 1331836730 && str2.equals("video/avc")) {
                            b = 0;
                        }
                    } else if (str2.equals("video/hevc")) {
                        b = 1;
                    }
                } else if (str2.equals("video/av01")) {
                    b = 2;
                }
                if (b == 0) {
                    iIntValue = 8;
                } else if (b != 1 || b == 2) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.zzi || this.zzb.equals("audio/ac4")) {
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4") && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 != null || (audioCapabilities = codecCapabilities2.getAudioCapabilities()) == null || audioCapabilities.getMaxInputChannelCount() <= 18) {
                        i3 = 8;
                    } else {
                        i3 = 16;
                    }
                    if (zzfk.zzP(context)) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i3)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i3), zzvx.zzf(InputDeviceCompat.SOURCE_DPAD, i3), zzvx.zzf(514, i3), zzvx.zzf(1026, i3), zzvx.zzf(1028, i3)};
                    }
                    codecProfileLevelArrZzb = codecProfileLevelArr;
                }
                if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArrZzb.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue3 >= 180000000) {
                        i = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i = 4;
                        } else if (iIntValue3 >= 800000) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i2 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i2];
                    if (codecProfileLevel.profile == iIntValue || ((codecProfileLevel.level < iIntValue2 && z) || ("video/hevc".equals(str) && iIntValue == 2 && ("sailfish".equals(Build.DEVICE) || "marlin".equals(Build.DEVICE))))) {
                    }
                }
                String str9 = zzvVar.zzk;
                String str10 = this.zzc;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str9).length() + 22 + str10.length());
                sb3.append("codec.profileLevel, ");
                sb3.append(str9);
                sb3.append(", ");
                sb3.append(str10);
                zzm(sb3.toString());
                return false;
            }
            if (iIntValue == 42) {
                iIntValue = 42;
                codecProfileLevelArrZzb = zzb();
                str = this.zzb;
                if (str.equals("audio/ac4")) {
                    codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 != null) {
                        i3 = 8;
                    } else {
                        i3 = 8;
                    }
                    if (zzfk.zzP(context)) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1026, i3)};
                    } else {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(257, i3), zzvx.zzf(InputDeviceCompat.SOURCE_DPAD, i3), zzvx.zzf(514, i3), zzvx.zzf(1026, i3), zzvx.zzf(1028, i3)};
                    }
                    codecProfileLevelArrZzb = codecProfileLevelArr;
                }
                if (Build.VERSION.SDK_INT == 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue3 = 0;
                    } else {
                        iIntValue3 = 0;
                    }
                    if (iIntValue3 >= 180000000) {
                        i = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i = 16;
                    } else if (iIntValue3 < 3600000) {
                        if (iIntValue3 >= 1800000) {
                            i = 4;
                        } else if (iIntValue3 >= 800000) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                    codecProfileLevelArrZzb = new MediaCodecInfo.CodecProfileLevel[]{zzvx.zzf(1, i)};
                }
                length = codecProfileLevelArrZzb.length;
                while (i2 < length) {
                    codecProfileLevel = codecProfileLevelArrZzb[i2];
                    if (codecProfileLevel.profile == iIntValue) {
                    }
                }
                String str11 = zzvVar.zzk;
                String str12 = this.zzc;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str11).length() + 22 + str12.length());
                sb4.append("codec.profileLevel, ");
                sb4.append(str11);
                sb4.append(", ");
                sb4.append(str12);
                zzm(sb4.toString());
                return false;
            }
        }
        return true;
    }

    private final boolean zzl(zzv zzvVar) {
        return (Objects.equals(zzvVar.zzp, "audio/flac") && zzvVar.zzJ == 22 && Build.VERSION.SDK_INT < 34 && this.zza.equals("c2.android.flac.decoder")) ? false : true;
    }

    private final void zzm(String str) {
        String str2 = zzfk.zza;
        String str3 = this.zzb;
        int length = String.valueOf(str3).length();
        int length2 = String.valueOf(str2).length();
        int length3 = str.length();
        String str4 = this.zza;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 2 + length + 3 + length2 + 1);
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str2);
        sb.append(C11744X3.j.f26440e);
        zzef.zza("MediaCodecInfo", sb.toString());
    }

    private static boolean zzn(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        Point pointZzo = zzo(videoCapabilities, i, i2);
        int i3 = pointZzo.x;
        int i4 = pointZzo.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private static Point zzo(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        String str = zzfk.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final String toString() {
        return this.zza;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzb() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecCapabilities.profileLevels;
    }

    public final boolean zzc(Context context, zzv zzvVar) {
        int i;
        int i2;
        if (!zzj(zzvVar) || !zzk(context, zzvVar, true) || !zzl(zzvVar)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzvVar.zzw;
            if (i3 <= 0 || (i2 = zzvVar.zzx) <= 0) {
                return true;
            }
            return zzg(i3, i2, zzvVar.zzA);
        }
        int i4 = zzvVar.zzI;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzm("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzm("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i4)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                sb.append("sampleRate.support, ");
                sb.append(i4);
                zzm(sb.toString());
                return false;
            }
        }
        int i5 = zzvVar.zzH;
        if (i5 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzm("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                zzm("channelCount.aCaps");
                return false;
            }
            String str = this.zza;
            String str2 = this.zzb;
            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
            if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                if ("audio/ac3".equals(str2)) {
                    i = 6;
                } else {
                    i = "audio/eac3".equals(str2) ? 16 : 30;
                }
                StringBuilder sb2 = new StringBuilder(str.length() + 32 + String.valueOf(maxInputChannelCount).length() + 4 + String.valueOf(i).length() + 1);
                sb2.append("AssumedMaxChannelAdjustment: ");
                sb2.append(str);
                sb2.append(", [");
                sb2.append(maxInputChannelCount);
                sb2.append(" to ");
                sb2.append(i);
                sb2.append(C11744X3.j.f26440e);
                zzef.zzc("MediaCodecInfo", sb2.toString());
                maxInputChannelCount = i;
            }
            if (maxInputChannelCount < i5) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 22);
                sb3.append("channelCount.support, ");
                sb3.append(i5);
                zzm(sb3.toString());
                return false;
            }
        }
        return true;
    }

    public final boolean zzd(Context context, zzv zzvVar) {
        return zzj(zzvVar) && zzk(context, zzvVar, false) && zzl(zzvVar);
    }

    public final boolean zze(zzv zzvVar) {
        if (this.zzi) {
            return this.zze;
        }
        Pair pairZze = zzdp.zze(zzvVar);
        return pairZze != null && ((Integer) pairZze.first).intValue() == 42;
    }

    public final zziw zzf(zzv zzvVar, zzv zzvVar2) {
        zzv zzvVar3;
        zzv zzvVar4;
        int i;
        String str = zzvVar.zzp;
        String str2 = zzvVar2.zzp;
        int i2 = true != Objects.equals(str, str2) ? 8 : 0;
        if (this.zzi) {
            if (zzvVar.zzB != zzvVar2.zzB) {
                i2 |= 1024;
            }
            boolean z = (zzvVar.zzw == zzvVar2.zzw && zzvVar.zzx == zzvVar2.zzx) ? false : true;
            if (!this.zze && z) {
                i2 |= 512;
            }
            zzi zziVar = zzvVar.zzF;
            if ((!zzi.zza(zziVar) || !zzi.zza(zzvVar2.zzF)) && !Objects.equals(zziVar, zzvVar2.zzF)) {
                i2 |= 2048;
            }
            String str3 = this.zza;
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str3) && !zzvVar.zzd(zzvVar2)) {
                i2 |= 2;
            }
            int i3 = zzvVar.zzy;
            if (i3 != -1 && (i = zzvVar.zzz) != -1 && i3 == zzvVar2.zzy && i == zzvVar2.zzz && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(str2, "video/dolby-vision")) {
                Pair pairZze = zzdp.zze(zzvVar);
                Pair pairZze2 = zzdp.zze(zzvVar2);
                if (pairZze == null || pairZze2 == null || !((Integer) pairZze.first).equals(pairZze2.first)) {
                    i2 = 2;
                }
            }
            if (i2 == 0) {
                return new zziw(str3, zzvVar, zzvVar2, true == zzvVar.zzd(zzvVar2) ? 3 : 2, 0);
            }
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
        } else {
            zzvVar3 = zzvVar;
            zzvVar4 = zzvVar2;
            if (zzvVar3.zzH != zzvVar4.zzH) {
                i2 |= 4096;
            }
            if (zzvVar3.zzI != zzvVar4.zzI) {
                i2 |= 8192;
            }
            if (zzvVar3.zzJ != zzvVar4.zzJ) {
                i2 |= 16384;
            }
            if (i2 == 0) {
                String str4 = this.zzb;
                if (str4.equals("audio/mp4a-latm") || str4.equals("audio/ac4")) {
                    Pair pairZze3 = zzdp.zze(zzvVar3);
                    Pair pairZze4 = zzdp.zze(zzvVar4);
                    if (pairZze3 != null && pairZze4 != null) {
                        int iIntValue = ((Integer) pairZze3.first).intValue();
                        int iIntValue2 = ((Integer) pairZze4.first).intValue();
                        if (iIntValue == 42 && iIntValue2 == 42) {
                            return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                        if (str4.equals("audio/ac4") && pairZze3.equals(pairZze4)) {
                            return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                        }
                    }
                }
            }
            if (i2 == 0) {
                String str5 = this.zzb;
                if (str5.equals("audio/eac3-joc") || str5.equals("audio/eac3")) {
                    return new zziw(this.zza, zzvVar3, zzvVar4, 3, 0);
                }
            }
            if (!zzvVar3.zzd(zzvVar4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zziw(this.zza, zzvVar3, zzvVar4, 1, 0);
            }
        }
        return new zziw(this.zza, zzvVar3, zzvVar4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean zzg(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzm("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzm("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iZza = zzvg.zza(videoCapabilities, i, i2, d);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb.append("sizeAndRate.cover, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("@");
                    sb.append(d);
                    zzm(sb.toString());
                    return false;
                }
                if (!zzn(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.zza;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i);
                            sb2.append("x");
                            sb2.append(i2);
                            sb2.append("@");
                            sb2.append(d);
                            String string = sb2.toString();
                            String str2 = this.zzb;
                            int length = str.length();
                            String str3 = zzfk.zza;
                            int length2 = String.valueOf(str2).length();
                            StringBuilder sb3 = new StringBuilder(string.length() + 19 + length + 2 + length2 + 3 + String.valueOf(str3).length() + 1);
                            sb3.append("AssumedSupport [");
                            sb3.append(string);
                            sb3.append("] [");
                            sb3.append(str);
                            sb3.append(", ");
                            sb3.append(str2);
                            sb3.append("] [");
                            sb3.append(str3);
                            sb3.append(C11744X3.j.f26440e);
                            zzef.zza("MediaCodecInfo", sb3.toString());
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                            sb4.append("sizeAndRate.rotated, ");
                            sb4.append(i);
                            sb4.append("x");
                            sb4.append(i2);
                            sb4.append("@");
                            sb4.append(d);
                            String string2 = sb4.toString();
                            String str4 = this.zzb;
                            int length3 = str.length();
                            String str5 = zzfk.zza;
                            int length4 = String.valueOf(str4).length();
                            StringBuilder sb5 = new StringBuilder(string2.length() + 19 + length3 + 2 + length4 + 3 + String.valueOf(str5).length() + 1);
                            sb5.append("AssumedSupport [");
                            sb5.append(string2);
                            sb5.append("] [");
                            sb5.append(str);
                            sb5.append(", ");
                            sb5.append(str4);
                            sb5.append("] [");
                            sb5.append(str5);
                            sb5.append(C11744X3.j.f26440e);
                            zzef.zza("MediaCodecInfo", sb5.toString());
                        }
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb6.append("sizeAndRate.support, ");
                    sb6.append(i);
                    sb6.append("x");
                    sb6.append(i2);
                    sb6.append("@");
                    sb6.append(d);
                    zzm(sb6.toString());
                    return false;
                }
            }
        } else if (!zzn(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.zza;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && zzn(videoCapabilities, i2, i, d)) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
                    sb7.append("sizeAndRate.rotated, ");
                    sb7.append(i);
                    sb7.append("x");
                    sb7.append(i2);
                    sb7.append("@");
                    sb7.append(d);
                    String string3 = sb7.toString();
                    String str6 = this.zzb;
                    int length5 = str.length();
                    String str7 = zzfk.zza;
                    int length6 = String.valueOf(str6).length();
                    StringBuilder sb8 = new StringBuilder(string3.length() + 19 + length5 + 2 + length6 + 3 + String.valueOf(str7).length() + 1);
                    sb8.append("AssumedSupport [");
                    sb8.append(string3);
                    sb8.append("] [");
                    sb8.append(str);
                    sb8.append(", ");
                    sb8.append(str6);
                    sb8.append("] [");
                    sb8.append(str7);
                    sb8.append(C11744X3.j.f26440e);
                    zzef.zza("MediaCodecInfo", sb8.toString());
                }
            }
            StringBuilder sb9 = new StringBuilder(String.valueOf(i).length() + 22 + String.valueOf(i2).length() + 1 + String.valueOf(d).length());
            sb9.append("sizeAndRate.support, ");
            sb9.append(i);
            sb9.append("x");
            sb9.append(i2);
            sb9.append("@");
            sb9.append(d);
            zzm(sb9.toString());
            return false;
        }
        return true;
    }

    public final float zzh(int i, int i2) {
        if (!this.zzi) {
            return -3.4028235E38f;
        }
        float f = this.zzl;
        if (f != -3.4028235E38f && this.zzj == i && this.zzk == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!zzg(i, i2, 1024.0d)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                boolean zZzg = zzg(i, i2, f5);
                if (true == zZzg) {
                    f3 = f5;
                }
                if (true != zZzg) {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.zzl = f2;
        this.zzj = i;
        this.zzk = i2;
        return f2;
    }

    public final Point zzi(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzo(videoCapabilities, i, i2);
    }

    zzve(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzas.zzb(str2);
        this.zzl = -3.4028235E38f;
        this.zzj = -1;
        this.zzk = -1;
    }
}
