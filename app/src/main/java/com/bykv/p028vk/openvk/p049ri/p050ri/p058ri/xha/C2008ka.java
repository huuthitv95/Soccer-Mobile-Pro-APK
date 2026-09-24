package com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.ri.xha.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2008ka {
    /* JADX INFO: renamed from: ri */
    public static int m6441ri(File file) throws Throwable {
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= 0) {
                return -1;
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8];
                    long j = 0;
                    while (fileInputStream2.read(bArr) == 8) {
                        long j2 = ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]));
                        if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                            long j3 = j2 - 8;
                            if (j3 > 0 && fileInputStream2.skip(j3) < j3) {
                                break;
                            }
                            j += j2;
                        } else {
                            break;
                        }
                    }
                    int i = (int) ((j * 100.0f) / length);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused) {
                    }
                    return i;
                } catch (Exception unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ri */
    public static int m6442ri(String str) {
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    String string = trackFormat.getString("mime");
                    if (string != null && (("video/avc".equals(string) || "video/hevc".equals(string)) && trackFormat.containsKey("level"))) {
                        int integer = trackFormat.getInteger("level");
                        mediaExtractor.release();
                        return integer;
                    }
                }
            } catch (Throwable unused) {
                if (mediaExtractor == null) {
                    return -1;
                }
            }
        } catch (Throwable unused2) {
            mediaExtractor = null;
        }
        mediaExtractor.release();
        return -1;
    }

    /* JADX INFO: renamed from: ri */
    private static String m6443ri(int i) {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i) {
                        return name;
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return String.valueOf(i);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONArray m6444ri() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(m6443ri(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
