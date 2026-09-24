package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import androidx.media3.extractor.p007ts.TsExtractor;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.a */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC8491a {

    /* JADX INFO: renamed from: a */
    public static final int[] f18937a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f18938b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f18939c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f18940d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f18941e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f18942f = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m20975a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f18938b;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f18942f;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = f18941e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
