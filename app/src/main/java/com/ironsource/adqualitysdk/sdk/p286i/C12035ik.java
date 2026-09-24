package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ik */
/* JADX INFO: loaded from: classes6.dex */
public final class C12035ik {

    /* JADX INFO: renamed from: ᐱ */
    private static int f29354 = 1;

    /* JADX INFO: renamed from: ᔱ */
    private static char f29355;

    /* JADX INFO: renamed from: ᔲ */
    private static int f29356;

    /* JADX INFO: renamed from: ᔹ */
    private static char[] f29357;

    /* JADX INFO: renamed from: ᔺ */
    private static int[] f29358;

    /* JADX INFO: renamed from: ᔽ */
    public static final List<String> f29359;

    /* JADX INFO: renamed from: ᕂ */
    public static String f29360;

    /* JADX INFO: renamed from: ᕃ */
    public static String f29361;

    /* JADX INFO: renamed from: ᕄ */
    public static String f29362;

    /* JADX INFO: renamed from: ᕆ */
    public static String f29363;

    /* JADX INFO: renamed from: ᖅ */
    public static String f29364;

    /* JADX INFO: renamed from: ᖩ */
    public static String f29365;

    /* JADX INFO: renamed from: ᖫ */
    public static String f29366;

    /* JADX INFO: renamed from: ᖭ */
    public static String f29367;

    /* JADX INFO: renamed from: ᖸ */
    public static String f29368;

    /* JADX INFO: renamed from: ᖺ */
    public static String f29369;

    /* JADX INFO: renamed from: ᗀ */
    public static String f29370;

    /* JADX INFO: renamed from: ᘥ */
    public static String f29371;

    /* JADX INFO: renamed from: ᵆ */
    public static String f29372;

    /* JADX INFO: renamed from: Ḟ */
    public static String f29373;

    /* JADX INFO: renamed from: Ḹ */
    public static String f29374;

    /* JADX INFO: renamed from: Ḽ */
    public static String f29375;

    /* JADX INFO: renamed from: Ṿ */
    public static String f29376;

    /* JADX INFO: renamed from: Ὑ */
    public static String f29377;

    /* JADX INFO: renamed from: Ῠ */
    public static String f29378;

    /* JADX INFO: renamed from: Ῡ */
    public static String f29379;

    /* JADX INFO: renamed from: Ὺ */
    public static String f29380;

    /* JADX INFO: renamed from: Ύ */
    public static String f29381;

    /* JADX INFO: renamed from: K */
    public static String f29382;

    /* JADX INFO: renamed from: Ⅽ */
    public static String f29383;

    /* JADX INFO: renamed from: Ↄ */
    public static String f29384;

    /* JADX INFO: renamed from: く */
    public static String f29385;

    /* JADX INFO: renamed from: っ */
    public static String f29386;

    /* JADX INFO: renamed from: へ */
    public static String f29387;

    /* JADX INFO: renamed from: ゥ */
    public static String f29388;

    /* JADX INFO: renamed from: ト */
    public static String f29389;

    /* JADX INFO: renamed from: リ */
    public static String f29390;

    /* JADX INFO: renamed from: ヮ */
    public static String f29391;

    /* JADX INFO: renamed from: ヶ */
    public static String f29392;

    /* JADX INFO: renamed from: 丫 */
    public static String f29393;

    /* JADX INFO: renamed from: 乁 */
    public static String f29394;

    /* JADX INFO: renamed from: 爫 */
    public static String f29395;

    /* JADX INFO: renamed from: ﬤ */
    public static String f29396;

    /* JADX INFO: renamed from: טּ */
    public static String f29397;

    /* JADX INFO: renamed from: סּ */
    public static String f29398;

    /* JADX INFO: renamed from: ףּ */
    public static String f29399;

    /* JADX INFO: renamed from: ﭖ */
    public static String f29400;

    /* JADX INFO: renamed from: ﭴ */
    public static String f29401;

    /* JADX INFO: renamed from: ﭸ */
    public static String f29402;

    /* JADX INFO: renamed from: ﮉ */
    public static String f29403;

    /* JADX INFO: renamed from: ﮌ */
    public static String f29404;

    /* JADX INFO: renamed from: ﮐ */
    public static String f29405;

    /* JADX INFO: renamed from: ﱟ */
    public static String f29406;

    /* JADX INFO: renamed from: ﱡ */
    public static String f29407;

    /* JADX INFO: renamed from: ﺙ */
    public static String f29408;

    /* JADX INFO: renamed from: ﻏ */
    public static String f29409;

    /* JADX INFO: renamed from: ﻐ */
    public static String f29410;

    /* JADX INFO: renamed from: ﻛ */
    public static String f29411;

    /* JADX INFO: renamed from: ｋ */
    public static String f29412;

    /* JADX INFO: renamed from: ﾇ */
    public static String f29413;

    /* JADX INFO: renamed from: ﾒ */
    public static String f29414;

    /* JADX INFO: renamed from: ﾇ */
    static void m30519() {
        f29355 = (char) 6;
        f29357 = new char[]{'i', 'n', 't', 'e', 'g', 'r', 'a', 'o', 'd', 'T', 'y', 'p', 'H', 's', 'h', 'c', 'v', 'l', 'k', 'U', AbstractJsonLexerKt.UNICODE_ESC, 'q', 'm', 'A', 'S', 'E', 'R', 'C', 'I', 'f', 'N', 'j', 'w', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ};
        f29358 = new int[]{91112383, -736047824, 11706948, -406138701, 1722156309, 1469752583, 1274695613, 340552829, -1947088118, -350447718, 386307120, -651981865, -659693849, -2010639314, 404035274, 1289542939, 1503953163, -1124197593};
    }

    static {
        m30519();
        f29413 = m30517("\u0001\u0002\u0003\u0004\u0005\u0000\b\u0000\u0001\u0006p", 11 - TextUtils.getOffsetBefore("", 0), (byte) (2 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern();
        f29410 = m30517("\u0001\u0002\u0003\u0005", 4 - TextUtils.getOffsetBefore("", 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 66)).intern();
        f29414 = m30518(new int[]{-1970664738, 1802379709}, 4 - (ViewConfiguration.getTouchSlop() >> 8)).intern();
        f29412 = m30517("\u0007\t\n\u000b\t\u0005", 6 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 89)).intern();
        f29411 = m30517("\u0007\t\u0012\f\u000e\u000f", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, (byte) (68 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern();
        f29407 = m30518(new int[]{-2125156889, 320035754}, 2 - Color.green(0)).intern();
        f29408 = m30518(new int[]{-1631326104, 27240611, 807555288, -1838536441}, (ViewConfiguration.getTouchSlop() >> 8) + 6).intern();
        f29409 = m30517("\u0000\u0004\u0006\u0002\u0000\u0004\u000e\u0003", (ViewConfiguration.getTouchSlop() >> 8) + 8, (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24)).intern();
        f29406 = m30518(new int[]{822763109, 469827327, 128330421, -767606669, 1781970602, -506454901}, 9 - TextUtils.getTrimmedLength("")).intern();
        f29405 = m30518(new int[]{974813699, 933627219, -141221354, 215387137}, 7 - TextUtils.getTrimmedLength("")).intern();
        f29401 = m30518(new int[]{930637425, -1023354908, -856548478, 639381980}, Process.getGidForName("") + 7).intern();
        f29400 = m30518(new int[]{886166908, 1528580016, -1496081367, 326067189, -133417146, -9672967}, 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        f29403 = m30517("\u0007\t\f\u0004t", KeyEvent.getDeadChar(0, 0) + 5, (byte) (16 - TextUtils.getCapsMode("", 0, 0))).intern();
        f29402 = m30517("\u0007\t\f\u0004Ã", 5 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (Color.red(0) + 79)).intern();
        f29404 = m30518(new int[]{881752265, 121416524, 1781970602, -506454901}, (ViewConfiguration.getPressedStateDuration() >> 16) + 5).intern();
        f29395 = m30518(new int[]{-1733208609, 1665274306, -1791013856, -1416769618}, ExpandableListView.getPackedPositionGroup(0L) + 7).intern();
        f29397 = m30518(new int[]{-424738415, 1401399643, 2103861373, 1392040990}, ImageFormat.getBitsPerPixel(0) + 9).intern();
        f29396 = m30517("\u0010\f\u0003\f\u0013\u0014\u000b\u0017", 8 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((Process.myTid() >> 22) + 42)).intern();
        f29398 = m30517("\u0010\f\u0013\f\u0003\u0011", (Process.myPid() >> 22) + 6, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64)).intern();
        f29399 = m30517("\u000e\u0003\u000f\n\u000b\u0006\u0089", ExpandableListView.getPackedPositionChild(0L) + 8, (byte) (Color.rgb(0, 0, 0) + 16777252)).intern();
        f29394 = m30517("\t\u0015\n\u000b\t\u0005", 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 52)).intern();
        f29390 = m30517("\u000e\u0003\r\u0016\u000b\u0017«", (ViewConfiguration.getScrollBarSize() >> 8) + 7, (byte) ((-16777160) - Color.rgb(0, 0, 0))).intern();
        f29392 = m30518(new int[]{638594220, -587259539, -1200329811, -195012437}, 7 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
        f29391 = m30518(new int[]{268637985, 2026235314, -1200329811, -195012437}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6).intern();
        f29393 = m30517("\u0003\f\b\u0013\u000b\u0017Æ", AndroidCharacter.getMirror('0') - ')', (byte) (View.MeasureSpec.getSize(0) + 83)).intern();
        f29386 = m30518(new int[]{570928737, -417732873, -1200329811, -195012437}, 6 - Process.getGidForName("")).intern();
        f29388 = m30517("\t\u0015\u0017\u0002\f\u000e", (ViewConfiguration.getLongPressTimeout() >> 16) + 6, (byte) (65 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern();
        f29389 = m30517("\u0002\u0006\u000e\u0003¼", 5 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 70)).intern();
        f29387 = m30518(new int[]{1543523199, 1905132760, -742263876, 99751298}, (ViewConfiguration.getTapTimeout() >> 16) + 5).intern();
        f29385 = m30517("\u0002\u0006\u0005\u0000ë", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)).intern();
        f29384 = m30517("\u0002\u0006\u0000\u0004x", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 5, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8)).intern();
        f29381 = m30517("\u0002\u0006\u0007\t", 3 - ImageFormat.getBitsPerPixel(0), (byte) (Color.argb(0, 0, 0, 0) + 14)).intern();
        f29382 = m30517("\u0002\u0006\u0007\tæ", TextUtils.lastIndexOf("", '0', 0, 0) + 6, (byte) (113 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern();
        f29383 = m30518(new int[]{-542633187, -258069612}, 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern();
        f29380 = m30517("\u0002\u0006\u000e\u0003\u000e\n\u0011\u0007", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 1)).intern();
        f29375 = m30517("\u0002\u0006\u0011\t\u0002\u0007\u0011\u0007", TextUtils.lastIndexOf("", '0', 0, 0) + 9, (byte) (101 - Color.alpha(0))).intern();
        f29376 = m30517("\u0012\u0004\u0005\u0015\u0006\u001a\u0003\u0011\u0089", 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (22 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern();
        f29379 = m30517("\u001c\r\u0004\u0002\b \t\u0015\u0004\u0001\u000f\u0004\u0083", ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.f22500SO, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31)).intern();
        f29378 = m30518(new int[]{-1173203782, -690776882, 1291715188, -260229483, 651161582, -396366780}, TextUtils.indexOf("", "") + 10).intern();
        f29377 = m30518(new int[]{-1173203782, -690776882, 509912429, -885732490, 364166867, 1456768474}, TextUtils.getOffsetBefore("", 0) + 11).intern();
        f29374 = m30517("\u0011\u0012\u000e\u0003\u001d\u0003\u0000\t\u0003\u0004d", 10 - MotionEvent.axisFromString(""), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
        f29370 = m30517("\u0011\u0012\u000e\u0003\u001a\u0000\u000b\u0000\u0003\u0004¥", 11 - View.MeasureSpec.getMode(0), (byte) (65 - View.resolveSize(0, 0))).intern();
        f29372 = m30517("\u0011\u0012\u000e\u0003\u001a\u0000\b\u0006\t\u0005È", 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (100 - (KeyEvent.getMaxKeyCode() >> 16))).intern();
        f29373 = m30518(new int[]{-1173203782, -690776882, -18851722, 1533639623, 1815725235, 1926044597, -2097151092, -354383814}, 13 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        f29371 = m30518(new int[]{-1173203782, -690776882, -93444001, 1135955320, -855412886, -1406942742, -406766877, -635790404}, TextUtils.indexOf((CharSequence) "", '0', 0) + 15).intern();
        f29366 = m30517("\u0013\u000e\u0004\u0000\u0019\u0004\u0019\u000b", TextUtils.indexOf("", "", 0, 0) + 8, (byte) (ExpandableListView.getPackedPositionType(0L) + 59)).intern();
        f29367 = m30518(new int[]{648867848, -607309898, 825618807, -2096327953, 2077566296, 1951285087}, 9 - ImageFormat.getBitsPerPixel(0)).intern();
        f29369 = m30517("\u0004\u0011", View.MeasureSpec.makeMeasureSpec(0, 0) + 2, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 88)).intern();
        f29365 = m30518(new int[]{-1441161648, 654749231}, (-16777213) - Color.rgb(0, 0, 0)).intern();
        f29368 = m30518(new int[]{215417266, 863394696}, View.combineMeasuredStates(0, 0) + 3).intern();
        f29362 = m30517("\t\b\u001f\u0006\u0000\u001a\u0004\u0002\u0007\u001a\u000f\u0004\u0002\u0003", 13 - Process.getGidForName(""), (byte) (110 - Color.argb(0, 0, 0, 0))).intern();
        f29361 = m30518(new int[]{1501937334, 1529148316, -869388359, 1349429871}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern();
        f29364 = m30518(new int[]{-1530308678, -1038265618}, Process.getGidForName("") + 4).intern();
        f29360 = m30517("\u0011\u0017¡", (Process.myPid() >> 22) + 3, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62)).intern();
        f29363 = m30517("\u0003\f\u0004\u0014", 4 - KeyEvent.normalizeMetaState(0), (byte) (View.getDefaultSize(0, 0) + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)).intern();
        f29359 = Arrays.asList(m30518(new int[]{1199677446, 1868025107, -1041745013, -1590685990, -2097151092, -354383814}, (ViewConfiguration.getScrollBarSize() >> 8) + 9).intern());
        int i = f29354 + 39;
        f29356 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30517(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f29357;
            char c = f29355;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30518(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29358.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
