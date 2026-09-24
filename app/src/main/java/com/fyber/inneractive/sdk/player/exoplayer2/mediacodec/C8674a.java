package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8810i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8674a {

    /* JADX INFO: renamed from: a */
    public final String f20203a;

    /* JADX INFO: renamed from: b */
    public final boolean f20204b;

    /* JADX INFO: renamed from: c */
    public final boolean f20205c;

    /* JADX INFO: renamed from: d */
    public final String f20206d;

    /* JADX INFO: renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f20207e;

    public C8674a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        str.getClass();
        this.f20203a = str;
        this.f20206d = str2;
        this.f20207e = codecCapabilities;
        this.f20204b = !z && codecCapabilities != null && AbstractC8827z.f20671a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f20205c = codecCapabilities != null && AbstractC8827z.f20671a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: renamed from: a */
    public final Point m21222a(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207e;
        if (codecCapabilities == null) {
            m21226b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m21226b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = AbstractC8827z.f20671a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21223a(int i) {
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207e;
        if (codecCapabilities == null) {
            m21226b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m21226b("channelCount.aCaps");
            return false;
        }
        String str = this.f20203a;
        String str2 = this.f20206d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((AbstractC8827z.f20671a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i2 = 6;
            } else {
                i2 = "audio/eac3".equals(str2) ? 16 : 30;
            }
            Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i2 + C11744X3.j.f26440e);
            maxInputChannelCount = i2;
        }
        if (maxInputChannelCount >= i) {
            return true;
        }
        m21226b("channelCount.support, " + i);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21224a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207e;
        if (codecCapabilities == null) {
            m21226b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m21226b("sizeAndRate.vCaps");
            return false;
        }
        if ((d == -1.0d || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d)) {
            return true;
        }
        if (i < i2) {
            if ((d == -1.0d || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) ? videoCapabilities.isSizeSupported(i2, i) : videoCapabilities.areSizeAndRateSupported(i2, i, d)) {
                Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f20203a + ", " + this.f20206d + "] [" + AbstractC8827z.f20675e + C11744X3.j.f26440e);
                return true;
            }
        }
        m21226b("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final boolean m21225a(String str) {
        String strM21325a;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        if (str == null || this.f20206d == null || (strM21325a = AbstractC8810i.m21325a(str)) == null) {
            return true;
        }
        if (!this.f20206d.equals(strM21325a)) {
            m21226b("codec.mime " + str + ", " + strM21325a);
            return false;
        }
        Pattern pattern = AbstractC8683j.f20247a;
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        str2.hashCode();
        int i = 2;
        byte b = -1;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    b = 0;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    b = 1;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    b = 2;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    b = 3;
                }
                break;
        }
        Pair pair = null;
        switch (b) {
            case 0:
            case 1:
                if (strArrSplit.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        } else {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                        }
                        pair = new Pair(Integer.valueOf(AbstractC8683j.f20249c.get(numValueOf.intValue())), Integer.valueOf(AbstractC8683j.f20250d.get(numValueOf2.intValue())));
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    }
                }
                break;
            case 2:
            case 3:
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                } else {
                    Matcher matcher = AbstractC8683j.f20247a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) AbstractC8683j.f20251e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                        } else {
                            pair = new Pair(Integer.valueOf(i), num);
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    }
                }
                break;
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        m21226b("codec.profileLevel, " + str + ", " + strM21325a);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m21226b(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f20203a + ", " + this.f20206d + "] [" + AbstractC8827z.f20675e + C11744X3.j.f26440e);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21227b(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207e;
        if (codecCapabilities == null) {
            m21226b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m21226b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        m21226b("sampleRate.support, " + i);
        return false;
    }
}
