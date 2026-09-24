package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jy */
/* JADX INFO: loaded from: classes6.dex */
public final class C12076jy {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29764 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29765;

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f29766 = {'K', 149, AbstractJsonLexerKt.UNICODE_ESC, 231, 226, 230, 220, 218, 232, 208, '7', 'j', 'j', 'k', 'D', 'B', 'V', 'W', 'h', 'h', 'i', 'q', 'k', 'A', 'B', 'd', 'b', '@', 'J', 'M', 'J', 'i', 'h', 'p', 'r', 'Y', 'X', 'n', 'q', 'n', 'E', 'G', 'q', 'J', '8', 'q', ';', 'l', 16, 'I', 'p', 'j', 'C', 'I', 'k', 'f', 'd', 'g', 'g', 'g', 'F', 'B', 'f', 'd', 'f', 'g', 'b', 'h', 'H', 'J', 'l', 'f', 'C', 'J', 'M', 'J', 'i', 'h', 'p', 'r', 'Y', 'l', 222, '!', 'Y', 'r', 'p', 'h', 'i', 'J', 'M', 'J', '@', 'b', 'd', 'B', '@', 'h', 'p', 'H', 'G', 'g', 'g', 'i', 'B', 'D', 'k', 'j', 'j', 'G', 'J', 'q', 'G', 'E', 'n', 'q', 'n', 'N', '\'', 'B', 'k', 'r', 'p', 'p', 'V', '-', '4', 'n', 'v', 'd', '^', 'f', 'm', 'o', 'k', 'j', 'i', 'n', 'M', 'Q', 'q', 'k', 'n', 'v', 'V', 'K', 'I', 'O', 'n', 'f', 'm', 'o', 'k', 'P', 'A', 'a'};

    /* JADX INFO: renamed from: ｋ */
    private static char f29768 = 26710;

    /* JADX INFO: renamed from: ﾇ */
    private static char f29769 = 38575;

    /* JADX INFO: renamed from: ﾒ */
    private static char f29770 = 3749;

    /* JADX INFO: renamed from: ﻛ */
    private static char f29767 = 45679;

    /* JADX INFO: renamed from: ﾒ */
    public static boolean m30799(Context context, String str) {
        int i = 2 % 2;
        int i2 = f29764 + 107;
        f29765 = i2 % 128;
        int i3 = i2 % 2;
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        int i4 = f29764 + 3;
        f29765 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30796(Context context, JSONObject jSONObject) {
        int i = 2 % 2;
        String strIntern = m30798(new int[]{2, 8, 120, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true).intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m30798(new int[]{0, 2, 38, 2}, "\u0000\u0000", false).intern(), packageName);
        } catch (JSONException e) {
            C12085l.m30922(strIntern, m30798(new int[]{10, 34, 0, 26}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", true).intern(), e);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m30798(new int[]{44, 2, 13, 2}, "\u0000\u0001", false).intern(), packageManager.getInstallerPackageName(packageName));
            int i2 = f29764 + 31;
            f29765 = i2 % 128;
            int i3 = i2 % 2;
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30797("伄О焘\ud815鳃谒㭺ꔖ\ue19d瑗ᴆ孕\uf1f3곑룐\ueace\uf3d9厸쯘ꕋ迺ݞ뗲䏗홽\udb4a膣콂㐌嬖䴇賯捴ᾫરＧẢ\ue113뼩呤䍣\udae4茉톈ᣎ澴긹ᖢ硌ࠧ桉嘔", 53 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb.append(e2.getLocalizedMessage());
            C12085l.m30909(strIntern, sb.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m30798(new int[]{46, 2, 0, 1}, "\u0000\u0001", true).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m30797("郎僧", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30798(new int[]{48, 33, 0, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", true).intern());
            sb2.append(packageName);
            sb2.append(m30797("䒕\uec66ᣎ澴긹ᖢ硌ࠧ桉嘔", 9 - Process.getGidForName("")).intern());
            sb2.append(e3.getLocalizedMessage());
            C12085l.m30909(strIntern, sb2.toString());
        } catch (JSONException e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m30797("伄О焘\ud815鳃谒㭺ꔖ\ue19d瑗ᴆ孕\ue19d瑗䣼볝櫹\uddc8迺ݞ瑻頦\ude3e爧\uf1f3곑冽薓냇뭏Ả\ue113뼩呤䍣\udae4茉톈ᣎ澴긹ᖢ硌ࠧ桉嘔", 46 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
            sb3.append(e4.getLocalizedMessage());
            C12085l.m30909(strIntern, sb3.toString());
        }
        try {
            jSONObject.put(m30798(new int[]{81, 2, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 2}, "\u0001\u0000", false).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            int i4 = f29764 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29765 = i4 % 128;
            int i5 = i4 % 2;
        } catch (PackageManager.NameNotFoundException e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m30798(new int[]{48, 33, 0, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", true).intern());
            sb4.append(packageName);
            sb4.append(m30797("䒕\uec66ᣎ澴긹ᖢ硌ࠧ桉嘔", TextUtils.indexOf("", "", 0) + 10).intern());
            sb4.append(e5.getLocalizedMessage());
            C12085l.m30909(strIntern, sb4.toString());
        } catch (JSONException e6) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m30798(new int[]{83, 43, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000", false).intern());
            sb5.append(e6.getLocalizedMessage());
            C12085l.m30909(strIntern, sb5.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﻛ */
    public static String m30795(Context context) {
        int i = 2 % 2;
        int i2 = f29764 + 29;
        f29765 = i2 % 128;
        try {
            return (i2 % 2 != 0 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 1) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            String strIntern = m30798(new int[]{2, 8, 120, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30798(new int[]{48, 33, 0, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", true).intern());
            sb.append((String) context);
            sb.append(m30797("䒕\uec66ᣎ澴긹ᖢ硌ࠧ桉嘔", 10 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            sb.append(e.getLocalizedMessage());
            C12085l.m30909(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static String m30794() {
        int i = 2 % 2;
        int i2 = f29765 + 77;
        f29764 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                Class.forName(m30798(new int[]{126, 30, 0, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001", false).intern());
                String strIntern = m30797("\u0ce4炰", -Process.getGidForName("")).intern();
                int i4 = f29764 + 81;
                f29765 = i4 % 128;
                int i5 = i4 % 2;
                return strIntern;
            } catch (ClassNotFoundException unused) {
                return m30797("\uf8f9뫁", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern();
            }
        } catch (ClassNotFoundException unused2) {
            Class.forName(m30797("\ue15e敕䄡嵾⫄\ue45e\ude3e爧䍣\udae4痩䴋푶賜樹근拯ꝡ⸬飧왆㤨혓㴕\udda2늩胄弼\udda2늩胄弼뾊둫䡏ừ䂳竤侄㑂빀䃝è໊홽\udb4a\ue24aସ홽\udb4a옉\uf2b0᧡ꂴ椎鮳瑻頦\ude3e爧", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 60).intern());
            return m30797("ﰲ븢", (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern();
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30798(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f29766, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30797(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12078k.f29776) {
            char[] cArr2 = new char[cArr.length];
            C12078k.f29775 = 0;
            char[] cArr3 = new char[2];
            while (C12078k.f29775 < cArr.length) {
                cArr3[0] = cArr[C12078k.f29775];
                cArr3[1] = cArr[C12078k.f29775 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29768)) ^ ((c2 >>> 5) + f29770)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29769) ^ ((c3 + i2) ^ ((c3 << 4) + f29767))));
                    i2 -= 40503;
                }
                cArr2[C12078k.f29775] = cArr3[0];
                cArr2[C12078k.f29775 + 1] = cArr3[1];
                C12078k.f29775 += 2;
            }
            str2 = new String(cArr2, 0, i);
        }
        return str2;
    }
}
