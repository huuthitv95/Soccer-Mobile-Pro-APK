package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8683j {

    /* JADX INFO: renamed from: a */
    public static final Pattern f20247a;

    /* JADX INFO: renamed from: b */
    public static final HashMap f20248b;

    /* JADX INFO: renamed from: c */
    public static final SparseIntArray f20249c;

    /* JADX INFO: renamed from: d */
    public static final SparseIntArray f20250d;

    /* JADX INFO: renamed from: e */
    public static final HashMap f20251e;

    /* JADX INFO: renamed from: f */
    public static int f20252f;

    static {
        new C8674a("OMX.google.raw.decoder", null, null, false);
        f20247a = Pattern.compile("^\\D?(\\d+)$");
        f20248b = new HashMap();
        f20252f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20249c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f20250d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        f20251e = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
    }

    /* JADX INFO: renamed from: a */
    public static int m21239a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f20252f == -1) {
            int iMax = 0;
            C8674a c8674aM21240a = m21240a(false, "video/avc");
            if (c8674aM21240a != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c8674aM21240a.f20207e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC8827z.f20671a >= 21 ? 345600 : 172800);
            }
            f20252f = iMax;
        }
        return f20252f;
    }

    /* JADX INFO: renamed from: a */
    public static C8674a m21240a(boolean z, String str) {
        List listUnmodifiableList;
        synchronized (AbstractC8683j.class) {
            C8678e c8678e = new C8678e(z, str);
            listUnmodifiableList = (List) f20248b.get(c8678e);
            if (listUnmodifiableList == null) {
                int i = AbstractC8827z.f20671a;
                ArrayList arrayListM21241a = m21241a(c8678e, i >= 21 ? new C8682i(z) : new C8681h());
                if (z && arrayListM21241a.isEmpty() && 21 <= i && i <= 23) {
                    arrayListM21241a = m21241a(c8678e, new C8681h());
                    if (!arrayListM21241a.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C8674a) arrayListM21241a.get(0)).f20203a);
                    }
                }
                if (i < 26) {
                    if (arrayListM21241a.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((C8674a) arrayListM21241a.get(0)).f20203a)) {
                        for (int i2 = 1; i2 < arrayListM21241a.size(); i2++) {
                            C8674a c8674a = (C8674a) arrayListM21241a.get(i2);
                            if ("OMX.google.raw.decoder".equals(c8674a.f20203a)) {
                                arrayListM21241a.remove(i2);
                                arrayListM21241a.add(0, c8674a);
                                break;
                            }
                        }
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayListM21241a);
                f20248b.put(c8678e, listUnmodifiableList);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (C8674a) listUnmodifiableList.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX INFO: renamed from: a */
    public static ArrayList m21241a(C8678e c8678e, InterfaceC8680g interfaceC8680g) throws C8679f {
        boolean z;
        InterfaceC8680g interfaceC8680g2 = interfaceC8680g;
        try {
            ArrayList arrayList = new ArrayList();
            String str = c8678e.f20243a;
            int iMo21235a = interfaceC8680g2.mo21235a();
            boolean zMo21238b = interfaceC8680g2.mo21238b();
            int i = 0;
            loop0: while (i < iMo21235a) {
                MediaCodecInfo mediaCodecInfoMo21236a = interfaceC8680g2.mo21236a(i);
                String name = mediaCodecInfoMo21236a.getName();
                if (m21242a(mediaCodecInfoMo21236a, name, zMo21238b)) {
                    String[] supportedTypes = mediaCodecInfoMo21236a.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo21236a.getCapabilitiesForType(str2);
                                boolean zMo21237a = interfaceC8680g2.mo21237a(str, capabilitiesForType);
                                if (AbstractC8827z.f20671a <= 22) {
                                    String str3 = AbstractC8827z.f20674d;
                                    if ((str3.equals("ODROID-XU3") || str3.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if ((zMo21238b && c8678e.f20244b == zMo21237a) || (!zMo21238b && !c8678e.f20244b)) {
                                    arrayList.add(new C8674a(name, str, capabilitiesForType, z));
                                } else if (!zMo21238b && zMo21237a) {
                                    arrayList.add(new C8674a(name + ".secure", str, capabilitiesForType, z));
                                    break loop0;
                                }
                            } catch (Exception e) {
                                if (AbstractC8827z.f20671a > 23 || arrayList.isEmpty()) {
                                    Log.e("MediaCodecUtil", "Failed to query codec " + name + " (" + str2 + ")");
                                    throw e;
                                }
                                Log.e("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                            }
                        }
                        i2++;
                        interfaceC8680g2 = interfaceC8680g;
                    }
                }
                i++;
                interfaceC8680g2 = interfaceC8680g;
            }
            return arrayList;
        } catch (Exception e2) {
            throw new C8679f(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21242a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC8827z.f20671a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(AbstractC8827z.f20672b)) {
            return false;
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = AbstractC8827z.f20672b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = AbstractC8827z.f20672b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(AbstractC8827z.f20673c)) {
            String str4 = AbstractC8827z.f20672b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i <= 19 && AbstractC8827z.f20672b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
