package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.bv */
/* JADX INFO: loaded from: classes6.dex */
public final class C11857bv extends AbstractC11840be {

    /* JADX INFO: renamed from: ﻐ */
    private static int f27931 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27932 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27933 = 23;

    /* JADX INFO: renamed from: ﻐ */
    static /* synthetic */ void m29281(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f27931 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f27932 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m29283(maioAdsListenerInterface);
        if (i3 == 0) {
            super.hashCode();
            throw null;
        }
        int i4 = f27931 + 39;
        f27932 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    public C11857bv(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    public final String mo28809() {
        int i = 2 % 2;
        int i2 = f27931 + 29;
        f27932 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            MaioAds.getSdkVersion();
            super.hashCode();
            throw null;
        }
        String sdkVersion = MaioAds.getSdkVersion();
        int i3 = f27932 + 93;
        f27931 = i3 % 128;
        if (i3 % 2 == 0) {
            return sdkVersion;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x017c  */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ﾇ */
    final Class mo28808(String str) {
        byte b = 2;
        int i = 2 % 2;
        switch (str.hashCode()) {
            case -1799290762:
                if (!str.equals(m29282("￢\u0005\u0014￮\u0002\n\u0010", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, false, 3 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 118 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1455130644:
                if (!str.equals(m29282("\uffdf\f\u0003\u0003\u0010\u0001\u0011\n\n\u0013￤\u0002\uffdfￌ\u0002\u0007\r\u0010\u0002\f\uffffￌ\t\u0002\u0011ￌ\r\u0007\uffff\u000bￌ\u000e\b\u0017\u0012\u0007\u0014\u0007\u0012\u0001", 40 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 120 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b = -1;
                }
                break;
            case -1303622385:
                if (!str.equals(m29282("\u000f\u0000\uffdd\u000b\u0005�￩\u0001\uffff�\u0002\u000e\u0001\u0010\n￥\u000e\u0001\n\u0001\u0010\u000f\u0005￨", ExpandableListView.getPackedPositionChild(0L) + 25, true, 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE).intern())) {
                    b = -1;
                } else {
                    int i2 = f27932 + 25;
                    f27931 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 7;
                }
                break;
            case -1069735125:
                if (!str.equals(m29282("\u0002\u0000\u000b\ufffe\u0011\u0010\u000b￦\u0010\u0001\uffde\f\u0006\ufffe￪", View.getDefaultSize(0, 0) + 15, true, Process.getGidForName("") + 16, 122 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -278703286:
                if (!str.equals(m29282("\u0005�￩\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u000f\u0000\uffdd\u000b", Color.alpha(0) + 15, true, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 123 - KeyEvent.keyCodeFromString("")).intern())) {
                    b = -1;
                } else {
                    int i4 = f27931 + 109;
                    f27932 = i4 % 128;
                    b = i4 % 2 != 0 ? (byte) 6 : (byte) 67;
                }
                break;
            case 357386522:
                if (!str.equals(m29282("\u0006\u0011\u0000\uffde\u0001\uffde\u0001\u0002\u0010\ufffe\uffdf\t\n\u0011￥\u0016\u0011\u0006\u0013", (Process.myPid() >> 22) + 19, true, 15 - View.combineMeasuredStates(0, 0), 122 - TextUtils.indexOf("", "")).intern())) {
                    b = -1;
                } else {
                    int i5 = f27931 + 9;
                    int i6 = i5 % 128;
                    f27932 = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 7;
                    f27931 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 3;
                }
                break;
            case 1819361677:
                if (!str.equals(m29282("\u000e\u0013ￛ\ufffe￠\u000f\u0006\u0006\r�\f\uffff\uffff\bￛ�\u000e\u0003\u0010\u0003", View.MeasureSpec.getMode(0) + 20, false, 3 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 124 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 1914325723:
                if (!str.equals(m29282("ￎ\u000f\t\u0001\rￎ\u0010\n\u0019\u0014\t\u0016\t\u0014\u0003￡\u0004￡\u0004\u0005\u0013\u0001￢\f\r\u0014￨ￎ\u0004\t\u000f\u0012\u0004\u000e\u0001ￎ\u000b\u0004\u0013", 39 - (ViewConfiguration.getScrollBarSize() >> 8), true, TextUtils.lastIndexOf("", '0') + 9, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE).intern())) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return MaioAds.class;
            case 1:
            case 2:
                return AdFullscreenActivity.class;
            case 3:
            case 4:
                return HtmlBasedAdActivity.class;
            case 5:
                return MaioAdsInstance.class;
            case 6:
                return MaioAdsListener.class;
            case 7:
                return MaioAdsListenerInterface.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be
    /* JADX INFO: renamed from: ｋ */
    final Map<String, AbstractC11840be.b> mo28807() {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(m29282("\f\uffff\b\uffff\u000e\r\u0003￦\r\ufffeￛ\t\u0003\ufffb\uffe7\u000e\uffff\r", (ViewConfiguration.getTouchSlop() >> 8) + 18, true, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, TextUtils.indexOf("", "", 0, 0) + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE).intern(), new AbstractC11840be.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11840be.b
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo28810(List<Object> list, InterfaceC11874cl interfaceC11874cl) {
                C11857bv.m29281((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        int i2 = f27932 + 41;
        f27931 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static void m29283(MaioAdsListenerInterface maioAdsListenerInterface) {
        int i = 2 % 2;
        int i2 = f27931 + 107;
        f27932 = i2 % 128;
        int i3 = i2 % 2;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i4 = f27931 + 31;
        f27932 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m29282(String str, int i, boolean z, int i2, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                int i4 = C11889d.f28481;
                cArr2[i4] = (char) (cArr2[i4] - f27933);
                C11889d.f28481++;
            }
            if (i2 > 0) {
                C11889d.f28478 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
