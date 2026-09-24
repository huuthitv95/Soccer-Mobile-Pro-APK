package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C8606n {

    /* JADX INFO: renamed from: h */
    public static final String[] f19779h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: i */
    public static final int[] f19780i = {44100, 48000, 32000};

    /* JADX INFO: renamed from: j */
    public static final int[] f19781j = {32, 64, 96, 128, 160, 192, 224, 256, 288, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 352, 384, 416, 448};

    /* JADX INFO: renamed from: k */
    public static final int[] f19782k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* JADX INFO: renamed from: l */
    public static final int[] f19783l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384};

    /* JADX INFO: renamed from: m */
    public static final int[] f19784m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE};

    /* JADX INFO: renamed from: n */
    public static final int[] f19785n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* JADX INFO: renamed from: a */
    public int f19786a;

    /* JADX INFO: renamed from: b */
    public String f19787b;

    /* JADX INFO: renamed from: c */
    public int f19788c;

    /* JADX INFO: renamed from: d */
    public int f19789d;

    /* JADX INFO: renamed from: e */
    public int f19790e;

    /* JADX INFO: renamed from: f */
    public int f19791f;

    /* JADX INFO: renamed from: g */
    public int f19792g;

    /* JADX INFO: renamed from: a */
    public static int m21145a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f19780i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f19781j[i4 - 1] : f19782k[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f19783l[i4 - 1] : f19784m[i4 - 1];
        } else {
            i6 = f19785n[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        return (((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i7) + i8;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21146a(int i, C8606n c8606n) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = f19780i[i5];
        if (i2 == 2) {
            i10 /= 2;
        } else if (i2 == 0) {
            i10 /= 4;
        }
        int i11 = (i >>> 9) & 1;
        if (i3 == 3) {
            i6 = i2 == 3 ? f19781j[i4 - 1] : f19782k[i4 - 1];
            i8 = (((i6 * 12000) / i10) + i11) * 4;
            i9 = 384;
        } else {
            int i12 = 1152;
            if (i2 == 3) {
                i6 = i3 == 2 ? f19783l[i4 - 1] : f19784m[i4 - 1];
                i7 = (144000 * i6) / i10;
            } else {
                i6 = f19785n[i4 - 1];
                i12 = i3 == 1 ? 576 : 1152;
                i7 = ((i3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * i6) / i10;
            }
            i8 = i7 + i11;
            i9 = i12;
        }
        String str = f19779h[3 - i3];
        int i13 = ((i >> 6) & 3) == 3 ? 1 : 2;
        c8606n.f19786a = i2;
        c8606n.f19787b = str;
        c8606n.f19788c = i8;
        c8606n.f19789d = i10;
        c8606n.f19790e = i13;
        c8606n.f19791f = i6 * 1000;
        c8606n.f19792g = i9;
        return true;
    }
}
