package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ix */
/* JADX INFO: loaded from: classes6.dex */
public final class C12048ix {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29452 = 14;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29453 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static char[] f29454 = {'7', 'q', 's', 'J', 'I', 'k', 'k', 's', 'm', 'l', 's', 'W', '-', '2', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'I', 'l', 'i', 'i', 'f', 'k', 'j', 'C', 'H', '*', 'S', 'Q', 'O', '2', 'j', 't', 'f', '@', 'P', 'q', 'i', 'l', 'q', 'n', 'Y', Typography.greater, 'O'};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29455 = 1;

    /* JADX WARN: Code duplicated, block: B:12:0x0059 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:4:0x0010, B:12:0x0059, B:13:0x005d, B:14:0x0063, B:15:0x0064, B:7:0x0030), top: B:20:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:13:0x005d A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:4:0x0010, B:12:0x0059, B:13:0x005d, B:14:0x0063, B:15:0x0064, B:7:0x0030), top: B:20:0x000e }] */
    /* JADX INFO: renamed from: ｋ */
    public static C12045iu m30552(JSONObject jSONObject, String str) {
        HttpURLConnection httpURLConnectionM30550;
        long jM30750;
        String strM30549;
        int responseCode;
        String responseMessage;
        int i;
        int i2 = 2 % 2;
        int i3 = f29453 + 15;
        f29455 = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 == 0) {
                httpURLConnectionM30550 = m30550(str);
                byte[] bArrM30547 = m30547(httpURLConnectionM30550, jSONObject);
                jM30750 = C12072ju.m30750();
                m30556(httpURLConnectionM30550, bArrM30547);
                strM30549 = m30549(httpURLConnectionM30550);
                responseCode = httpURLConnectionM30550.getResponseCode();
                responseMessage = httpURLConnectionM30550.getResponseMessage();
                if (responseCode >= 19763) {
                    i = f29453 + 1;
                    f29455 = i % 128;
                    if (i % 2 != 0) {
                        httpURLConnectionM30550.disconnect();
                        super.hashCode();
                        throw null;
                    }
                    httpURLConnectionM30550.disconnect();
                }
            } else {
                httpURLConnectionM30550 = m30550(str);
                byte[] bArrM30548 = m30547(httpURLConnectionM30550, jSONObject);
                jM30750 = C12072ju.m30750();
                m30556(httpURLConnectionM30550, bArrM30548);
                strM30549 = m30549(httpURLConnectionM30550);
                responseCode = httpURLConnectionM30550.getResponseCode();
                responseMessage = httpURLConnectionM30550.getResponseMessage();
                if (responseCode >= 400) {
                    i = f29453 + 1;
                    f29455 = i % 128;
                    if (i % 2 != 0) {
                        httpURLConnectionM30550.disconnect();
                        super.hashCode();
                        throw null;
                    }
                    httpURLConnectionM30550.disconnect();
                }
            }
            return new C12045iu(strM30549, responseCode, responseMessage, C12072ju.m30750() - jM30750);
        } catch (Throwable th) {
            String strIntern = m30557("\uffe7\f\u0005\u0002\r￮\r\ufffe", MotionEvent.axisFromString("") + 9, true, TextUtils.getOffsetBefore("", 0) + 1, 117 - TextUtils.getCapsMode("", 0, 0)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30558(new int[]{0, 28, 0, 13}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false).intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30922(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static C12045iu m30546(String str) {
        int i = 2 % 2;
        int i2 = f29453 + 15;
        f29455 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            HttpURLConnection httpURLConnectionM30559 = m30559(str);
            long jM30750 = C12072ju.m30750();
            String strM30549 = m30549(httpURLConnectionM30559);
            int responseCode = httpURLConnectionM30559.getResponseCode();
            String responseMessage = httpURLConnectionM30559.getResponseMessage();
            if (responseCode >= 400) {
                int i4 = f29455 + 13;
                f29453 = i4 % 128;
                if (i4 % 2 != 0) {
                    httpURLConnectionM30559.disconnect();
                    throw null;
                }
                httpURLConnectionM30559.disconnect();
            }
            C12045iu c12045iu = new C12045iu(strM30549, responseCode, responseMessage, C12072ju.m30750() - jM30750);
            int i5 = f29455 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f29453 = i5 % 128;
            if (i5 % 2 == 0) {
                return c12045iu;
            }
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            String strIntern = m30557("\uffe7\f\u0005\u0002\r￮\r\ufffe", 8 - Color.green(0), true, 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 117 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30557("\u0007\u0010\u0006\u000b\u0010\tￂ\t\u0007\u0016ￂ\u0014\u0007\u0013\u0017\u0007\u0015\u0016ￜￂ\uffe7\u0014\u0014\u0011\u0014ￂ\u0015", 26 - ((byte) KeyEvent.getModifierMetaStateMask()), false, ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.NAK, TextUtils.indexOf("", "") + 108).intern());
            sb.append(th.getLocalizedMessage());
            C12085l.m30922(strIntern, sb.toString(), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30556(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        int i = 2 % 2;
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m30551(dataOutputStream);
        int i2 = f29453 + 15;
        f29455 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] m30547(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        int i = 2 % 2;
        int i2 = f29455 + 33;
        f29453 = i2 % 128;
        int i3 = i2 % 2;
        String strM30555 = m30555(jSONObject);
        byte[] bytes = strM30555.getBytes(m30557("\u0011\ufff4￩\u0002\u0010", Color.argb(0, 0, 0, 0) + 5, true, (-16777215) - Color.rgb(0, 0, 0), 83 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        if (!m30553(strM30555)) {
            return bytes;
        }
        int i4 = f29453 + 29;
        f29455 = i4 % 128;
        int i5 = i4 % 2;
        httpURLConnection.setRequestProperty(m30557("￡\r\f\u0012\u0003\f\u0012ￋ￣\f\u0001\r\u0002\u0007\f\u0005", TextUtils.lastIndexOf("", '0', 0) + 17, false, (Process.myTid() >> 22) + 16, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 112).intern(), m30557("\f\ufff9\u0002\ufffb", 4 - (KeyEvent.getMaxKeyCode() >> 16), true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, View.MeasureSpec.getSize(0) + 124).intern());
        byte[] bArrM30548 = m30548(bytes);
        int i6 = f29453 + 25;
        f29455 = i6 % 128;
        int i7 = i6 % 2;
        return bArrM30548;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static HttpURLConnection m30550(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m30558(new int[]{28, 4, 0, 0}, "\u0000\u0001\u0000\u0001", true).intern());
        httpURLConnection.setRequestProperty(m30558(new int[]{32, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", true).intern(), m30557("ￏ\u000e\u000f\t\u0014\u0001\u0003\t\f\u0010\u0010\u0001\uffd8ￍ\u0006\u0014\u0015\uffdd\u0014\u0005\u0013\u0012\u0001\b\u0003\uffc0ￛ\u000e\u000f\u0013\n", Color.red(0) + 31, true, 11 - Process.getGidForName(""), 110 - Color.blue(0)).intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        int i2 = f29453 + 83;
        f29455 = i2 % 128;
        int i3 = i2 % 2;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static HttpURLConnection m30559(String str) throws IOException {
        int i = 2 % 2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m30557("\ufffb�\n", (ViewConfiguration.getLongPressTimeout() >> 16) + 3, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, TextUtils.indexOf("", "") + 88).intern());
        int i2 = f29453 + 3;
        f29455 = i2 % 128;
        if (i2 % 2 != 0) {
            return httpURLConnection;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30549(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        int i = 2 % 2;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = stringBuffer.toString();
                            m30551(inputStream);
                            m30551(bufferedReader);
                            return string;
                        }
                        int i2 = f29455 + 25;
                        f29453 = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 91 / 0;
                            if (stringBuffer.length() > 0) {
                                stringBuffer.append('\r');
                                int i4 = f29455 + 9;
                                f29453 = i4 % 128;
                                int i5 = i4 % 2;
                            }
                        } else if (stringBuffer.length() > 0) {
                            stringBuffer.append('\r');
                            int i6 = f29455 + 9;
                            f29453 = i6 % 128;
                            int i7 = i6 % 2;
                        }
                        stringBuffer.append(line);
                        int i8 = f29455 + 67;
                        f29453 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C12085l.m30922(m30557("\uffe7\f\u0005\u0002\r￮\r\ufffe", (ViewConfiguration.getTouchSlop() >> 8) + 8, true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).intern(), m30557("￡\u000e\u000e\u000b\u000eﾼ\u0003\u0001\u0010\u0010\u0005\n\u0003ﾼ\u000e\u0001\u000f\f\u000b\n\u000f\u0001", 22 - (ViewConfiguration.getTapTimeout() >> 16), false, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), 114 - KeyEvent.keyCodeFromString("")).intern(), th);
                        return null;
                    } finally {
                        m30551(inputStream);
                        m30551(bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m30551(Closeable closeable) {
        int i = 2 % 2;
        int i2 = f29455 + 65;
        int i3 = i2 % 128;
        f29453 = i3;
        int i4 = i2 % 2;
        if (closeable != null) {
            int i5 = i3 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f29455 = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    closeable.close();
                } else {
                    closeable.close();
                    throw null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m30553(String str) {
        int i = 2 % 2;
        if (str.length() > 256) {
            int i2 = f29453 + 105;
            f29455 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = f29455 + 51;
        f29453 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static byte[] m30548(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    int i2 = f29453 + 113;
                    f29455 = i2 % 128;
                    int i3 = i2 % 2;
                    return byteArray;
                } catch (Exception e) {
                    e = e;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30555(JSONObject jSONObject) {
        int i = 2 % 2;
        String string = jSONObject.toString();
        String strM30753 = C12073jv.m30753(string);
        String strSubstring = string.substring(0, string.lastIndexOf(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE));
        StringBuilder sb = new StringBuilder();
        sb.append(strSubstring);
        sb.append(m30557("\ufff0￦,7￦\ufffe￦", (Process.myPid() >> 22) + 7, false, Color.rgb(0, 0, 0) + 16777223, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 75).intern());
        sb.append(strM30753);
        sb.append(m30558(new int[]{44, 2, 0, 0}, "\u0001\u0001", true).intern());
        String string2 = sb.toString();
        int i2 = f29455 + 17;
        f29453 = i2 % 128;
        if (i2 % 2 == 0) {
            return string2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static String m30554(C12045iu c12045iu) {
        int i = 2 % 2;
        int i2 = f29455;
        int i3 = i2 + 51;
        f29453 = i3 % 128;
        int i4 = i3 % 2;
        if (c12045iu == null) {
            int i5 = i2 + 27;
            f29453 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 8 / 0;
            }
            return null;
        }
        return c12045iu.m30526();
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30557(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f29452);
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

    /* JADX INFO: renamed from: ﾒ */
    private static String m30558(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
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
            System.arraycopy(f29454, i, cArr, 0, i2);
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
}
