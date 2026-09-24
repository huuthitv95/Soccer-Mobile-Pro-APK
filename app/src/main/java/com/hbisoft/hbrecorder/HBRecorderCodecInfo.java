package com.hbisoft.hbrecorder;

import android.content.Context;
import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class HBRecorderCodecInfo {
    private Context context;
    ArrayList<String> supportedVideoFormats = new ArrayList<>();
    ArrayList<String> supportedAudioFormats = new ArrayList<>();
    HashMap<String, String> mVideoMap = new HashMap<>();
    HashMap<String, String> mAudioMap = new HashMap<>();

    int getMaxSupportedWidth() {
        return getRecordingInfo().width;
    }

    int getMaxSupportedHeight() {
        return getRecordingInfo().height;
    }

    private RecordingInfo getRecordingInfo() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.densityDpi;
        boolean z = this.context.getResources().getConfiguration().orientation == 2;
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        return calculateRecordingInfo(i, i2, i3, z, camcorderProfile != null ? camcorderProfile.videoFrameWidth : -1, camcorderProfile != null ? camcorderProfile.videoFrameHeight : -1, camcorderProfile != null ? camcorderProfile.videoFrameRate : 30, 100);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    static final class RecordingInfo {
        final int density;
        final int frameRate;
        final int height;
        final int width;

        RecordingInfo(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.frameRate = i3;
            this.density = i4;
        }
    }

    static RecordingInfo calculateRecordingInfo(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        int i8 = (i * i7) / 100;
        int i9 = (i2 * i7) / 100;
        if (i4 == -1 && i5 == -1) {
            return new RecordingInfo(i8, i9, i6, i3);
        }
        int i10 = z ? i4 : i5;
        if (z) {
            i4 = i5;
        }
        if (i10 >= i8 && i4 >= i9) {
            return new RecordingInfo(i8, i9, i6, i3);
        }
        if (z) {
            i10 = (i8 * i4) / i9;
        } else {
            i4 = (i9 * i10) / i8;
        }
        return new RecordingInfo(i10, i4, i6, i3);
    }

    public final MediaCodecInfo selectVideoCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private String selectCodecByMime(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt.getName();
                    }
                }
            }
        }
        return "Mime not supported";
    }

    private MediaCodecInfo selectDefaultCodec() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    if (supportedTypes[i2].contains("video")) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(supportedTypes[i2]);
                        if (capabilitiesForType.isFormatSupported(capabilitiesForType.getDefaultFormat())) {
                            return codecInfoAt;
                        }
                    }
                }
            }
        }
        return null;
    }

    public String getDefaultVideoEncoderName(String str) {
        try {
            return selectCodecByMime(str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getDefaultVideoFormat() {
        try {
            MediaCodecInfo mediaCodecInfoSelectDefaultCodec = selectDefaultCodec();
            if (mediaCodecInfoSelectDefaultCodec != null) {
                for (String str : mediaCodecInfoSelectDefaultCodec.getSupportedTypes()) {
                    if (str.contains("video")) {
                        String string = mediaCodecInfoSelectDefaultCodec.getCapabilitiesForType(str).getDefaultFormat().toString();
                        return returnTypeFromMime(string.substring(string.indexOf(C11744X3.j.f26434b) + 1, string.indexOf(",")));
                    }
                }
                return "";
            }
            return AbstractJsonLexerKt.NULL;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String returnTypeFromMime(String str) {
        str.hashCode();
        switch (str) {
            case "video/3gpp":
                return "THREE_GPP";
            case "video/MP2T":
                return "MPEG_2_TS";
            case "video/mp4v":
                return "MPEG_4";
            case "video/webm":
                return "WEBM";
            case "video/mp4v-es":
            case "video/avc":
            case "video/mp4":
                return "MPEG_4";
            case "video/x-vnd.on2.vp8":
                return "WEBM";
            default:
                return "";
        }
    }

    public boolean isSizeAndFramerateSupported(int i, int i2, int i3, String str, int i4) {
        boolean z = false;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            boolean zAreSizeAndRateSupported = false;
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                try {
                    if (str2.contains("video")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities();
                        if (1 == i4) {
                            zAreSizeAndRateSupported = videoCapabilities.areSizeAndRateSupported(i2, i, i3);
                        } else {
                            zAreSizeAndRateSupported = videoCapabilities.areSizeAndRateSupported(i, i2, i3);
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    z = zAreSizeAndRateSupported;
                    e.printStackTrace();
                    return z;
                }
            }
            return zAreSizeAndRateSupported;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public boolean isMimeTypeSupported(String str) {
        try {
            for (String str2 : selectVideoCodec(str).getSupportedTypes()) {
                str2.contains("video");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isSizeSupported(int i, int i2, String str) {
        boolean z = false;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            boolean zIsSizeSupported = false;
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                try {
                    if (str2.contains("video")) {
                        zIsSizeSupported = mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().isSizeSupported(i2, i);
                    }
                } catch (Exception e) {
                    e = e;
                    z = zIsSizeSupported;
                    e.printStackTrace();
                    return z;
                }
            }
            return zIsSizeSupported;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public double getMaxSupportedFrameRate(int i, int i2, String str) {
        double dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            for (String str2 : mediaCodecInfoSelectVideoCodec.getSupportedTypes()) {
                if (str2.contains("video")) {
                    dDoubleValue = ((Double) mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().getSupportedFrameRatesFor(i2, i).getUpper()).doubleValue();
                }
            }
            return dDoubleValue;
        } catch (Exception e) {
            e.printStackTrace();
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    public int getMaxSupportedBitrate(String str) {
        int i = 0;
        try {
            MediaCodecInfo mediaCodecInfoSelectVideoCodec = selectVideoCodec(str);
            String[] supportedTypes = mediaCodecInfoSelectVideoCodec.getSupportedTypes();
            int length = supportedTypes.length;
            int iIntValue = 0;
            while (i < length) {
                try {
                    String str2 = supportedTypes[i];
                    if (str2.contains("video")) {
                        iIntValue = ((Integer) mediaCodecInfoSelectVideoCodec.getCapabilitiesForType(str2).getVideoCapabilities().getBitrateRange().getUpper()).intValue();
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    i = iIntValue;
                    e.printStackTrace();
                    return i;
                }
            }
            return iIntValue;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public ArrayList<String> getSupportedVideoFormats() {
        String[] strArr = {"video/MP2T", "video/mp4v-es", "video/m4v", "video/mp4", "video/avc", "video/3gpp", "video/webm", "video/x-vnd.on2.vp8"};
        for (int i = 0; i < 8; i++) {
            checkSupportedVideoFormats(strArr[i]);
        }
        return this.supportedVideoFormats;
    }

    private void checkSupportedVideoFormats(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.contains("video")) {
                        str.hashCode();
                        switch (str) {
                            case "video/3gpp":
                                this.supportedVideoFormats.add("THREE_GPP");
                                return;
                            case "video/MP2T":
                                this.supportedVideoFormats.add("MPEG_2_TS");
                                return;
                            case "video/mp4v":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/webm":
                                if (this.supportedVideoFormats.contains("WEBM")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("WEBM");
                                return;
                            case "video/video/x-vnd.on2.vp8":
                                if (this.supportedVideoFormats.contains("WEBM")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("WEBM");
                                return;
                            case "video/mp4v-es":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/avc":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                            case "video/mp4":
                                if (this.supportedVideoFormats.contains("MPEG_4")) {
                                    return;
                                }
                                this.supportedVideoFormats.add("MPEG_4");
                                return;
                        }
                    }
                }
            }
        }
    }

    public ArrayList<String> getSupportedAudioFormats() {
        String[] strArr = {"audio/amr_nb", "audio/amr_wb", "audio/x-hx-aac-adts", "audio/ogg"};
        for (int i = 0; i < 4; i++) {
            checkSupportedAudioFormats(strArr[i]);
        }
        return this.supportedAudioFormats;
    }

    private void checkSupportedAudioFormats(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.contains("audio")) {
                        str.hashCode();
                        switch (str) {
                            case "audio/x-hx-aac-adts":
                                this.supportedAudioFormats.add("AAC_ADTS");
                                return;
                            case "audio/amr_nb":
                                this.supportedAudioFormats.add("AMR_NB");
                                return;
                            case "audio/amr_wb":
                                this.supportedAudioFormats.add("AMR_WB");
                                return;
                            case "audio/ogg":
                                this.supportedAudioFormats.add("OGG");
                                return;
                        }
                    }
                }
            }
        }
    }

    public HashMap<String, String> getSupportedVideoMimeTypes() {
        checkIfSupportedVideoMimeTypes();
        return this.mVideoMap;
    }

    private void checkIfSupportedVideoMimeTypes() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.contains("video")) {
                        this.mVideoMap.put(codecInfoAt.getName(), str);
                    }
                }
            }
        }
    }

    public HashMap<String, String> getSupportedAudioMimeTypes() {
        checkIfSupportedAudioMimeTypes();
        return this.mAudioMap;
    }

    private void checkIfSupportedAudioMimeTypes() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.contains("audio")) {
                        this.mAudioMap.put(codecInfoAt.getName(), str);
                    }
                }
            }
        }
    }
}
