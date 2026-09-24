package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12081kc {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29798 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static char f29799 = 24960;

    /* JADX INFO: renamed from: ﻛ */
    private static char f29800 = 53513;

    /* JADX INFO: renamed from: ｋ */
    private static char f29801 = 16822;

    /* JADX INFO: renamed from: ﾇ */
    private static char f29802 = 23294;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29803;

    /* JADX INFO: renamed from: ﾇ */
    public static int m30858(String str, String str2) {
        Object obj;
        int i = 2 % 2;
        int i2 = f29798 + 3;
        f29803 = i2 % 128;
        int i3 = i2 % 2;
        String[] strArrSplit = str.replaceAll(m30856("ꇂ賚裥䔔滒絩ᴬ妲", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7).intern(), "").split(m30856("㹷툢", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2).intern());
        String[] strArrSplit2 = str2.replaceAll(m30856("ꇂ賚裥䔔滒絩ᴬ妲", 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), "").split(m30856("㹷툢", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1).intern());
        int i4 = 0;
        while (true) {
            obj = null;
            if (i4 >= strArrSplit.length || i4 >= strArrSplit2.length) {
                break;
            }
            int i5 = f29803 + 73;
            f29798 = i5 % 128;
            if (i5 % 2 == 0) {
                strArrSplit[i4].equals(strArrSplit2[i4]);
                super.hashCode();
                throw null;
            }
            if (!strArrSplit[i4].equals(strArrSplit2[i4])) {
                break;
            }
            int i6 = f29798 + 11;
            f29803 = i6 % 128;
            i4 = i6 % 2 != 0 ? i4 + 94 : i4 + 1;
        }
        if (i4 >= strArrSplit.length || i4 >= strArrSplit2.length) {
            return Integer.signum(strArrSplit.length - strArrSplit2.length);
        }
        int i7 = f29798 + 93;
        f29803 = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.signum(Integer.valueOf(strArrSplit[i4]).compareTo(Integer.valueOf(strArrSplit2[i4])));
        }
        Integer.signum(Integer.valueOf(strArrSplit[i4]).compareTo(Integer.valueOf(strArrSplit2[i4])));
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static List<String> m30860(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29798 + 37;
        f29803 = i2 % 128;
        return m30861(str, str2, i2 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﻐ */
    public static List<String> m30854(String str, JSONArray jSONArray) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < jSONArray.length()) {
            int i3 = f29798 + 45;
            f29803 = i3 % 128;
            int i4 = i3 % 2;
            arrayList.addAll(m30861(str, jSONArray.optString(i2), false));
            i2++;
            int i5 = f29798 + 95;
            f29803 = i5 % 128;
            int i6 = i5 % 2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static String m30853(String str, JSONArray jSONArray, boolean z) {
        int i = 2 % 2;
        int i2 = f29798;
        int i3 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29803 = i3 % 128;
        int i4 = i2 + 93;
        f29803 = i4 % 128;
        int i5 = i4 % 2;
        for (int i6 = i3 % 2 != 0 ? 1 : 0; i6 < jSONArray.length(); i6++) {
            String strM30852 = m30852(str, jSONArray.optString(i6), z);
            if (strM30852 != null) {
                int i7 = f29798 + 41;
                f29803 = i7 % 128;
                if (i7 % 2 == 0) {
                    return strM30852;
                }
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static String m30852(String str, String str2, boolean z) {
        int i = 2 % 2;
        int i2 = f29803 + 103;
        int i3 = i2 % 128;
        f29798 = i3;
        int i4 = i2 % 2;
        if (z) {
            int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f29803 = i5 % 128;
            int i6 = i5 % 2;
            str2 = m30850(str2);
        }
        List<String> listM30861 = m30861(str, str2, true);
        if (listM30861.size() > 0) {
            return listM30861.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static List<String> m30861(String str, String str2, boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            int i2 = f29798 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29803 = i2 % 128;
            if (i2 % 2 == 0) {
                if (matcher.groupCount() == 0) {
                    arrayList.add(matcher.group());
                    if (z) {
                        return arrayList;
                    }
                } else {
                    for (int i3 = 1; i3 <= matcher.groupCount(); i3++) {
                        int i4 = f29803 + 73;
                        f29798 = i4 % 128;
                        if (i4 % 2 == 0) {
                            arrayList.add(matcher.group(i3));
                            int i5 = 71 / 0;
                            if (z) {
                                return arrayList;
                            }
                        } else {
                            arrayList.add(matcher.group(i3));
                            if (z) {
                                break loop0;
                            }
                        }
                    }
                }
            } else {
                matcher.groupCount();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static String m30851(String str, String str2) {
        int i = 2 % 2;
        int i2 = f29803 + 45;
        f29798 = i2 % 128;
        int i3 = i2 % 2;
        String strSubstring = str.substring(0, str.length() - str2.length());
        int i4 = f29803 + 25;
        f29798 = i4 % 128;
        int i5 = i4 % 2;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static boolean m30862(String str) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i2 = f29798 + 47;
            f29803 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean zMatches = str.matches(m30856("䢦捇∁㻧ꄅ\ue470࣌쎁裥䔔꜍㩄窡즙", View.combineMeasuredStates(0, 0) + 14).intern());
        int i4 = f29803 + 55;
        f29798 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return zMatches;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r5 <= r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r5 <= r6) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29803 + 113;
        com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29798 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m30857(java.lang.String r5, int r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29798
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29803 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L45
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r3 = 0
            if (r1 != 0) goto L44
            int r1 = r5.length()
            if (r1 <= 0) goto L44
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29803
            int r1 = r1 + 65
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29798 = r4
            int r1 = r1 % r0
            int r5 = r5.length()
            if (r1 != 0) goto L31
            r1 = 97
            int r1 = r1 / r3
            if (r5 > r6) goto L44
            goto L33
        L31:
            if (r5 > r6) goto L44
        L33:
            int r5 = com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29803
            int r5 = r5 + 113
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12081kc.f29798 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L40
            r5 = 1
            return r5
        L40:
            super.hashCode()
            throw r2
        L44:
            return r3
        L45:
            android.text.TextUtils.isEmpty(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12081kc.m30857(java.lang.String, int):boolean");
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30850(String str) {
        int i = 2 % 2;
        int i2 = f29798 + 15;
        f29803 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith(m30856("ꄙ艪", KeyEvent.getDeadChar(0, 0) + 1).intern())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m30856("䢦捇\uee2a儌ﹱ䈎籙แ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 8).intern());
                    sb.append(str);
                    str = sb.toString();
                }
                if (!str.endsWith(m30856("\uec7f埌", 1 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m30856("鬵ⓥ杵㏉쵝曜\ue217ﰸ", 7 - KeyEvent.normalizeMetaState(0)).intern());
                    str = sb2.toString();
                }
            }
            int i3 = f29803 + 77;
            f29798 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        TextUtils.isEmpty(str);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static boolean m30859(String str) {
        int i = 2 % 2;
        int i2 = f29803 + 19;
        f29798 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!C12089p.m30936()) {
                try {
                    new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
            }
            int i3 = f29798 + 51;
            f29803 = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        C12089p.m30936();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static String m30855(String str) {
        int i = 2 % 2;
        if (str != null && !C12089p.m30936()) {
            int i2 = f29798 + 41;
            f29803 = i2 % 128;
            int i3 = i2 % 2;
            if (m30859(str)) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    int i4 = 0;
                    while (true) {
                        int i5 = gZIPInputStream.read(bArr, i4, 8192 - i4);
                        if (i5 == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m30856("쳷\udd94콾\udf74\uf633ల", 5 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                        }
                        i4 += i5;
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        int i6 = f29803 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29798 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30856(String str, int i) {
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
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f29802)) ^ ((c2 >>> 5) + f29799)));
                    cArr3[1] = c3;
                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f29800) ^ ((c3 + i2) ^ ((c3 << 4) + f29801))));
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
