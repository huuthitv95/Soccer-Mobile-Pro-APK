package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.hz */
/* JADX INFO: loaded from: classes6.dex */
public final class C12023hz {

    /* JADX INFO: renamed from: ﮌ */
    private static int f29258 = 1;

    /* JADX INFO: renamed from: ﮐ */
    private static int f29259 = -868275013;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29260 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29261 = 87;

    /* JADX INFO: renamed from: ﺙ */
    private static short[] f29262 = null;

    /* JADX INFO: renamed from: ﻏ */
    private static byte[] f29263 = {99, -93, -81, -97, -86, -71, -88, -15, 88, -83, -89, -86, -41, 78, 96, 67, 87, -111, -78, 5, 73, -72, -12, 19, -15, 80, -77, -2, -3, Ascii.f22492FF, 70, -68, -10, -7, 6, 9, 65, 6, 83, -25, 6, -28, 67, -90, -15, -16, -1, 57, -81, -21, -6, -17, Ascii.SYN, -59, 4, -15, -18, -5, 6, 34, -84, -20, -8, -24, -13, 2, -15, 58, -95, -10, -16, -13, 32, 47, 114, 98, -128, 119, 117, 113, 102, -59, 103, 47, -126, -121, -96, 33, 118, -62, 37, 114, 121, 104, -124, 113, 108, 115, 112, -97, -106, 47, 114, 100, -124, 113, 104, 107, -90, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻐ */
    private static int f29264 = 0;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29265 = -1361802393;

    /* JADX INFO: renamed from: ｋ */
    private static long f29266 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static char f29267 = 6423;

    /* JADX INFO: renamed from: ﾇ */
    private Map<C12020hw.d, C12015hr> f29268;

    public C12023hz() {
        m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) Color.red(0), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), "硜马엃ꂘ").intern();
        this.f29268 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻛ */
    public static <T> T m30435(Class cls, Object obj, C12010hm c12010hm, T t) {
        int i = 2 % 2;
        int i2 = f29260 + 9;
        f29258 = i2 % 128;
        Object obj2 = null;
        try {
            if (i2 % 2 != 0) {
                Field fieldM30310 = C12019hv.m30362().m30364().m30310(cls, c12010hm);
                if (fieldM30310 == null) {
                    return t;
                }
                int i3 = f29258 + 99;
                f29260 = i3 % 128;
                int i4 = i3 % 2;
                T t2 = (T) fieldM30310.get(obj);
                int i5 = f29258 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f29260 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 12 / 0;
                }
                return t2;
            }
            C12019hv.m30362().m30364().m30310(cls, c12010hm);
            super.hashCode();
            throw null;
        } catch (Throwable unused) {
            String strIntern = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", View.MeasureSpec.getSize(0), "硜马엃ꂘ").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30436(Color.rgb(0, 0, 0) + 1378579609, (short) (Drawable.resolveOpacity(0, 0) + 86), TextUtils.getOffsetBefore("", 0) + 868275082, (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 73).intern());
            sb.append(c12010hm.m30280());
            sb.append(m30437("嗮㭓ꈲ괻싣\uf2d8⡕熰≟\uf464ꦱ", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", 505466961 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "勑⃐\uf01e\uf53a").intern());
            sb.append(cls);
            sb.append(m30436(1361802406 - TextUtils.getTrimmedLength(""), (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 78), 868275046 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') - 80).intern());
            C12085l.m30929(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static List<Object> m30442(Class cls, Object obj, C12010hm c12010hm) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = C12019hv.m30362().m30364().m30309(cls, c12010hm).iterator();
            while (it.hasNext()) {
                int i2 = f29260 + 29;
                f29258 = i2 % 128;
                if (i2 % 2 != 0) {
                    arrayList.add(it.next().get(obj));
                } else {
                    arrayList.add(it.next().get(obj));
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
            }
        } catch (Throwable unused) {
            String strIntern = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", Process.myTid() >> 22, "硜马엃ꂘ").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30436(1361802392 - TextUtils.lastIndexOf("", '0', 0, 0), (short) (MotionEvent.axisFromString("") + 87), TextUtils.getOffsetBefore("", 0) + 868275082, (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) - 73).intern());
            sb.append(c12010hm.m30280());
            sb.append(m30437("嗮㭓ꈲ괻싣\uf2d8⡕熰≟\uf464ꦱ", (char) KeyEvent.getDeadChar(0, 0), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 505466963, "勑⃐\uf01e\uf53a").intern());
            sb.append(cls);
            sb.append(m30436((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1361802406, (short) ((-79) - TextUtils.indexOf((CharSequence) "", '0', 0)), 54165 - AndroidCharacter.getMirror('0'), (byte) (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.getDeadChar(0, 0) - 81).intern());
            C12085l.m30929(strIntern, sb.toString());
        }
        int i3 = f29258 + 91;
        f29260 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final <T> InterfaceC12018hu<T> m30450(Object obj, InterfaceC12021hx interfaceC12021hx, InterfaceC12011hn interfaceC12011hn, List<String> list, int i) {
        int i2 = 2 % 2;
        InterfaceC12018hu<T> interfaceC12018huM30455 = m30455(obj, new C12020hw.c().m30395(true).m30396(interfaceC12021hx, interfaceC12011hn, list, i));
        int i3 = f29260 + 79;
        f29258 = i3 % 128;
        if (i3 % 2 != 0) {
            return interfaceC12018huM30455;
        }
        Object obj2 = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final <T> InterfaceC12018hu<T> m30455(Object obj, C12020hw c12020hw) {
        long j;
        int i = 2 % 2;
        int i2 = f29258 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29260 = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C12020hw.d dVarM30376 = c12020hw.m30376(obj.getClass());
        C12015hr c12015hr = this.f29268.get(dVarM30376);
        Object obj2 = null;
        if (c12015hr != null) {
            int i4 = f29260 + 3;
            f29258 = i4 % 128;
            if (i4 % 2 == 0) {
                m30441(obj, c12015hr);
                super.hashCode();
                throw null;
            }
            InterfaceC12018hu<T> interfaceC12018huM30441 = m30441(obj, c12015hr);
            if (interfaceC12018huM30441 != null) {
                int i5 = f29260 + 37;
                f29258 = i5 % 128;
                if (i5 % 2 == 0) {
                    m30444(c12020hw.m30370(), interfaceC12018huM30441);
                    throw null;
                }
                if (m30444(c12020hw.m30370(), interfaceC12018huM30441)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m30436(1361802411 - View.MeasureSpec.getMode(0), (short) (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 868275116, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (-68) - Color.green(0)).intern());
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb.append(m30437("䞈ﴨ", (char) (View.resolveSizeAndState(0, 0, 0) + 8917), "\u0000\u0000\u0000\u0000", ViewConfiguration.getTapTimeout() >> 16, "蓼ꂛ헢\ue522").intern());
                    m30438(interfaceC12018huM30441, obj, sb.toString());
                    return interfaceC12018huM30441;
                }
            }
            j = 0;
            String strIntern = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), "硜马엃ꂘ").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m30437("\ue1f2兺\ufddf춫샰嬀戃異។肝픇", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), "\u0000\u0000\u0000\u0000", View.MeasureSpec.makeMeasureSpec(0, 0) + 1273541185, "䇎\ue8b2ꥋ踁").intern());
            C12085l.m30929(strIntern, sb2.toString());
            this.f29268.remove(dVarM30376);
        } else {
            j = 0;
        }
        C12022hy<T> c12022hy = new C12022hy<>(c12020hw);
        InterfaceC12018hu<T> interfaceC12018huM30448 = m30448(obj, c12022hy, 0, null);
        if (interfaceC12018huM30448 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m30437("億휙둴딙\uf73d㕤ՠ寳ퟰᖧℷ蘇ꩪ", (char) (31147 - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", Color.rgb(0, 0, 0) - 1319045285, "嬼惷결ᱹ").intern());
            sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb3.append(m30436(TextUtils.getOffsetAfter("", 0) + 1361802429, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 77), 868275121 - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-83) - View.MeasureSpec.getMode(0)).intern());
            sb3.append(c12022hy.m30427().size());
            sb3.append(m30437("臺뚇\ue33d瘦靷﹘囌龄鵞䟿䞆ᑖ搶竈Ɖ", (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 28459), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 17393512, "霗\uf698⯾뵯").intern());
            m30438((InterfaceC12018hu) null, obj, sb3.toString());
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m30437("覽ᣑ뢶氱벪\ue49b䨯ꙍ㒭", (char) (ImageFormat.getBitsPerPixel(0) + 1), "\u0000\u0000\u0000\u0000", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1827276862, "㷣\uea08\uf06c蓸").intern());
        sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb4.append(m30436(TextUtils.indexOf((CharSequence) "", '0') + 1361802430, (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 78), 868275122 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-83) - Gravity.getAbsoluteGravity(0, 0)).intern());
        sb4.append(c12022hy.m30427().size());
        sb4.append(m30437("臺뚇\ue33d瘦靷﹘囌龄鵞䟿䞆ᑖ搶竈Ɖ", (char) (28459 - ExpandableListView.getPackedPositionType(j)), "\u0000\u0000\u0000\u0000", (-17393513) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "霗\uf698⯾뵯").intern());
        m30438(interfaceC12018huM30448, obj, sb4.toString());
        this.f29268.put(dVarM30376, c12022hy.m30423());
        return interfaceC12018huM30448;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final List<InterfaceC12018hu> m30452(Object obj, C12020hw c12020hw) {
        int i = 2 % 2;
        C12022hy c12022hy = new C12022hy(c12020hw);
        c12022hy.m30426();
        m30448(obj, c12022hy, 0, null);
        ArrayList arrayList = new ArrayList(c12022hy.m30422());
        int i2 = f29258 + 35;
        f29260 = i2 % 128;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private <T> InterfaceC12018hu<T> m30441(Object obj, C12015hr c12015hr) {
        int i = 2 % 2;
        int i2 = f29258 + 55;
        f29260 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        try {
            InterfaceC12018hu<T> interfaceC12018huM30433 = m30433(m30434(obj, c12015hr.m30315().get(0), (InterfaceC12018hu) null), c12015hr, 1);
            int i4 = f29260 + 17;
            f29258 = i4 % 128;
            if (i4 % 2 != 0) {
                return interfaceC12018huM30433;
            }
            super.hashCode();
            throw null;
        } catch (Exception e) {
            C12085l.m30922(m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) Gravity.getAbsoluteGravity(0, 0), "\u0000\u0000\u0000\u0000", Color.blue(0), "硜马엃ꂘ").intern(), m30436(AndroidCharacter.getMirror('0') + 29840, (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13), 868275081 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) View.MeasureSpec.getMode(0), (-52) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private <T> InterfaceC12018hu<T> m30433(InterfaceC12018hu interfaceC12018hu, C12015hr c12015hr, int i) {
        int i2 = 2 % 2;
        int i3 = f29258 + 59;
        f29260 = i3 % 128;
        int i4 = i3 % 2;
        if (i >= c12015hr.m30315().size()) {
            return interfaceC12018hu;
        }
        int i5 = f29258 + 45;
        f29260 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            c12015hr.m30315().get(i);
            m30445(interfaceC12018hu.mo30359());
            super.hashCode();
            throw null;
        }
        List<Field> list = c12015hr.m30315().get(i);
        Object objMo30359 = interfaceC12018hu.mo30359();
        List listM30445 = m30445(objMo30359);
        if (listM30445 == null) {
            String strIntern = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, "硜马엃ꂘ").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m30436(1361802466 - Drawable.resolveOpacity(0, 0), (short) ((-16777331) - Color.rgb(0, 0, 0)), 868275082 - View.getDefaultSize(0, 0), (byte) KeyEvent.normalizeMetaState(0), (-50) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            sb.append(objMo30359.getClass());
            C12085l.m30929(strIntern, sb.toString());
            int i6 = f29260 + 81;
            f29258 = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
        for (Object obj2 : listM30445) {
            try {
                InterfaceC12018hu interfaceC12018huM30434 = m30434(obj2, list, m30449(objMo30359, obj2, interfaceC12018hu));
                if (interfaceC12018huM30434 != null) {
                    return m30433(interfaceC12018huM30434, c12015hr, i + 1);
                }
                continue;
            } catch (Exception unused) {
            }
        }
        int i7 = f29258 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29260 = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static <T> InterfaceC12018hu<T> m30434(Object obj, List<Field> list, InterfaceC12018hu interfaceC12018hu) throws IllegalAccessException {
        Object obj2;
        int i = 2 % 2;
        int i2 = f29260 + 33;
        f29258 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 % 3;
        }
        for (Field field : list) {
            if (!(!WeakReference.class.isAssignableFrom(field.getType()))) {
                obj2 = ((WeakReference) field.get(obj)).get();
            } else {
                obj2 = field.get(obj);
                int i4 = f29258 + 13;
                f29260 = i4 % 128;
                int i5 = i4 % 2;
            }
            interfaceC12018hu = m30430(field, obj, interfaceC12018hu);
            int i6 = f29258 + 43;
            f29260 = i6 % 128;
            int i7 = i6 % 2;
            obj = obj2;
        }
        return interfaceC12018hu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r12 instanceof android.app.Activity) != false) goto L37;
     */
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <T> com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12018hu<T> m30448(java.lang.Object r12, com.ironsource.adqualitysdk.sdk.p286i.C12022hy<T> r13, int r14, com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12018hu r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12023hz.m30448(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hy, int, com.ironsource.adqualitysdk.sdk.i.hu):com.ironsource.adqualitysdk.sdk.i.hu");
    }

    /* JADX INFO: renamed from: ｋ */
    private InterfaceC12018hu m30440(InterfaceC12018hu interfaceC12018hu, C12022hy c12022hy, int i) {
        int i2 = 2 % 2;
        int i3 = f29258 + 31;
        f29260 = i3 % 128;
        int i4 = i3 % 2;
        Object objMo30359 = interfaceC12018hu.mo30359();
        InterfaceC12018hu interfaceC12018huM30440 = null;
        if (!c12022hy.m30427().contains(objMo30359)) {
            int i5 = f29258 + 41;
            f29260 = i5 % 128;
            if (i5 % 2 != 0) {
                c12022hy.m30421().contains(objMo30359);
                throw null;
            }
            if (!c12022hy.m30421().contains(objMo30359)) {
                if (!(!c12022hy.m30429().m30373(i))) {
                    int i6 = f29260 + 65;
                    f29258 = i6 % 128;
                    int i7 = i6 % 2;
                    if (m30444(c12022hy.m30429().m30370(), interfaceC12018hu)) {
                        if (c12022hy.m30425()) {
                            c12022hy.m30428(interfaceC12018hu);
                            c12022hy.m30424(objMo30359);
                        }
                        return interfaceC12018hu;
                    }
                }
                if (objMo30359 instanceof WeakReference) {
                    int i8 = f29260 + 87;
                    f29258 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((WeakReference) objMo30359).get();
                        super.hashCode();
                        throw null;
                    }
                    if (((WeakReference) objMo30359).get() != null && c12022hy.m30429().m30380(i)) {
                        WeakReference weakReference = (WeakReference) objMo30359;
                        if (m30432(weakReference.get(), c12022hy.m30429().m30377())) {
                            int i9 = f29260 + 15;
                            f29258 = i9 % 128;
                            int i10 = i9 % 2;
                            return m30448(weakReference.get(), c12022hy, i + 1, interfaceC12018hu);
                        }
                    }
                }
                if (m30432(objMo30359, c12022hy.m30429().m30377())) {
                    int i11 = f29260 + 23;
                    f29258 = i11 % 128;
                    InterfaceC12018hu interfaceC12018huM30448 = m30448(objMo30359, c12022hy, i11 % 2 == 0 ? i % 1 : i + 1, interfaceC12018hu);
                    int i12 = f29258 + 69;
                    f29260 = i12 % 128;
                    int i13 = i12 % 2;
                    return interfaceC12018huM30448;
                }
                if (c12022hy.m30429().m30375() && objMo30359 != null) {
                    c12022hy.m30427().add(objMo30359);
                }
                List listM30443 = m30443(objMo30359, c12022hy.m30429(), i);
                C12015hr c12015hrM30423 = c12022hy.m30423();
                if (listM30443 != null) {
                    Iterator it = listM30443.iterator();
                    while (it.hasNext()) {
                        InterfaceC12018hu interfaceC12018huM30449 = m30449(objMo30359, it.next(), interfaceC12018hu);
                        c12015hrM30423.m30317();
                        interfaceC12018huM30440 = m30440(interfaceC12018huM30449, c12022hy, i);
                        if (interfaceC12018huM30440 != null && (!c12022hy.m30425())) {
                            return interfaceC12018huM30440;
                        }
                        c12015hrM30423.m30319();
                    }
                }
                return interfaceC12018huM30440;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final List<String> m30453(Object obj, List<String> list, int i) {
        int i2 = 2 % 2;
        C12022hy c12022hy = new C12022hy(new C12020hw.c().m30388(true).m30385(true).m30393(true).m30386(-1).m30391(new InterfaceC12021hx() { // from class: com.ironsource.adqualitysdk.sdk.i.hz.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12021hx
            /* JADX INFO: renamed from: ﻐ */
            public final boolean mo29895(InterfaceC12018hu interfaceC12018hu) {
                return interfaceC12018hu.mo30359() instanceof String;
            }
        }, list, i));
        c12022hy.m30426();
        Object obj2 = null;
        m30448(obj, c12022hy, 0, null);
        ArrayList arrayList = new ArrayList(c12022hy.m30421());
        int i3 = f29258 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29260 = i3 % 128;
        if (i3 % 2 == 0) {
            return arrayList;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m30444(InterfaceC12021hx interfaceC12021hx, InterfaceC12018hu interfaceC12018hu) {
        int i = 2 % 2;
        int i2 = f29258 + 47;
        f29260 = i2 % 128;
        int i3 = i2 % 2;
        try {
            boolean zMo29895 = interfaceC12021hx.mo29895(interfaceC12018hu);
            int i4 = f29258 + 111;
            f29260 = i4 % 128;
            if (i4 % 2 == 0) {
                return zMo29895;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static boolean m30432(Object obj, List<String> list) {
        int i = 2 % 2;
        if (obj == null) {
            return false;
        }
        int i2 = f29258 + 85;
        f29260 = i2 % 128;
        int i3 = i2 % 2;
        boolean zM30832 = C12079ka.m30832(obj.getClass(), list);
        int i4 = f29258 + 63;
        f29260 = i4 % 128;
        int i5 = i4 % 2;
        return zM30832;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static Field[] m30439(Class cls, int i) {
        int i2 = 2 % 2;
        Field[] declaredFields = cls.getDeclaredFields();
        int i3 = 0;
        while (cls != null) {
            int i4 = f29260 + 85;
            f29258 = i4 % 128;
            int i5 = i4 % 2;
            if (i3 == i) {
                break;
            }
            cls = cls.getSuperclass();
            if (cls != null) {
                declaredFields = C12079ka.m30834(declaredFields, cls.getDeclaredFields());
            }
            i3++;
            int i6 = f29258 + 97;
            f29260 = i6 % 128;
            int i7 = i6 % 2;
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static List m30445(Object obj) {
        int i = 2 % 2;
        int i2 = f29260 + 3;
        f29258 = i2 % 128;
        boolean z = i2 % 2 != 0;
        List listM30446 = m30446(obj, z, z, z);
        int i3 = f29260 + 3;
        f29258 = i3 % 128;
        if (i3 % 2 != 0) {
            return listM30446;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static List m30443(Object obj, C12020hw c12020hw, int i) {
        int i2 = 2 % 2;
        int i3 = f29260 + 37;
        f29258 = i3 % 128;
        int i4 = i3 % 2;
        List listM30446 = m30446(obj, c12020hw.m30369(i), c12020hw.m30371(i), c12020hw.m30378(i));
        int i5 = f29260 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29258 = i5 % 128;
        int i6 = i5 % 2;
        return listM30446;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r6 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r6 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return new java.util.ArrayList((java.util.Collection) r5);
     */
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List m30446(java.lang.Object r5, boolean r6, boolean r7, boolean r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12023hz.f29260
            int r2 = r1 + 53
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12023hz.f29258 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L6c
            if (r5 == 0) goto L6b
            boolean r2 = r5 instanceof java.util.Collection
            r4 = 0
            if (r2 == 0) goto L2e
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12023hz.f29258 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L24
            int r1 = r4 / r4
            if (r6 == 0) goto L2e
            goto L26
        L24:
            if (r6 == 0) goto L2e
        L26:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Collection r5 = (java.util.Collection) r5
            r6.<init>(r5)
            return r6
        L2e:
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L49
            if (r8 == 0) goto L49
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r4] = r5
            java.util.List r5 = java.util.Arrays.asList(r7)
            r6.<init>(r5)
            return r6
        L49:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L6b
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C12023hz.f29260
            int r6 = r6 + 91
            int r8 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12023hz.f29258 = r8
            int r6 = r6 % r0
            if (r7 == 0) goto L6b
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Map r5 = (java.util.Map) r5
            java.util.Collection r7 = r5.values()
            r6.<init>(r7)
            java.util.Set r5 = r5.keySet()
            r6.addAll(r5)
            return r6
        L6b:
            return r3
        L6c:
            super.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12023hz.m30446(java.lang.Object, boolean, boolean, boolean):java.util.List");
    }

    /* JADX INFO: renamed from: ﻐ */
    private static <T> InterfaceC12018hu<T> m30430(Field field, Object obj, InterfaceC12018hu interfaceC12018hu) {
        int i = 2 % 2;
        C12025ia c12025ia = new C12025ia(field, obj, interfaceC12018hu);
        int i2 = f29258 + 89;
        f29260 = i2 % 128;
        int i3 = i2 % 2;
        return c12025ia;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static <T> InterfaceC12018hu<T> m30449(Object obj, Object obj2, InterfaceC12018hu interfaceC12018hu) {
        int i = 2 % 2;
        Object obj3 = null;
        if (obj != null) {
            int i2 = f29258 + 35;
            f29260 = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = obj instanceof Collection;
                throw null;
            }
            if (obj instanceof Collection) {
                return new C12025ia((Collection) obj, obj2, interfaceC12018hu);
            }
            if (obj instanceof Map) {
                return new C12025ia((Map) obj, obj2, interfaceC12018hu);
            }
            if (obj.getClass().isArray()) {
                C12025ia c12025ia = new C12025ia(new ArrayList(Arrays.asList(obj)), obj2, interfaceC12018hu);
                int i3 = f29260 + 91;
                f29258 = i3 % 128;
                if (i3 % 2 != 0) {
                    return c12025ia;
                }
                super.hashCode();
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30451(Class cls, String str) {
        int i = 2 % 2;
        int i2 = f29260 + 105;
        f29258 = i2 % 128;
        int i3 = i2 % 2;
        String strM30431 = m30431((Object) null, cls, str);
        int i4 = f29260 + 79;
        f29258 = i4 % 128;
        int i5 = i4 % 2;
        return strM30431;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final String m30456(Object obj, String str) {
        int i = 2 % 2;
        int i2 = f29260 + 25;
        f29258 = i2 % 128;
        int i3 = i2 % 2;
        String strM30431 = m30431(obj, obj.getClass(), str);
        int i4 = f29260 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29258 = i4 % 128;
        int i5 = i4 % 2;
        return strM30431;
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m30454(Object obj, JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f29258;
        int i3 = i2 + 53;
        f29260 = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        if (jSONArray != null) {
            int i4 = i2 + 81;
            f29260 = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                String strM30456 = m30456(obj, jSONArray.optString(i6));
                if (strM30456 != null) {
                    int i7 = f29258 + 43;
                    f29260 = i7 % 128;
                    if (i7 % 2 == 0) {
                        return strM30456;
                    }
                    throw null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[Catch: Exception -> 0x0056, PHI: r6
  0x0046: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v9 java.lang.String) binds: [B:16:0x0044, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:11:0x0030, B:17:0x0046, B:15:0x003e), top: B:28:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0056 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ */
    private String m30431(Object obj, Class cls, String str) {
        String str2;
        int i = 2 % 2;
        while (cls != null) {
            int i2 = f29258 + 45;
            f29260 = i2 % 128;
            int i3 = i2 % 2;
            if (cls.equals(Object.class)) {
                break;
            }
            Field[] fieldArrM30447 = m30447(cls);
            int length = fieldArrM30447.length;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = f29260 + 51;
                f29258 = i5 % 128;
                if (i5 % 2 != 0) {
                    Field field = fieldArrM30447[i4];
                    field.setAccessible(true);
                    str2 = (String) field.get(obj);
                    if (str2 == null) {
                        continue;
                    } else if (!Pattern.compile(str).matcher(str2).matches()) {
                        return str2;
                    }
                } else {
                    Field field2 = fieldArrM30447[i4];
                    field2.setAccessible(false);
                    try {
                        str2 = (String) field2.get(obj);
                        if (str2 == null) {
                            continue;
                        } else if (!Pattern.compile(str).matcher(str2).matches()) {
                            return str2;
                        }
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        int i6 = f29258 + 93;
        f29260 = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static Field[] m30447(Class cls) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f29260 + 11;
            f29258 = i3 % 128;
            if (i3 % 2 == 0) {
                declaredFields[i2].getType().equals(String.class);
                throw null;
            }
            Field field = declaredFields[i2];
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
            i2++;
            int i4 = f29258 + 93;
            f29260 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX INFO: renamed from: ﻛ */
    private static void m30438(InterfaceC12018hu interfaceC12018hu, Object obj, String str) {
        int i = 2 % 2;
        int i2 = f29260 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29258 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (interfaceC12018hu != null) {
            String strIntern = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionGroup(0L), "硜马엃ꂘ").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(m30437("威澗", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 25736), "\u0000\u0000\u0000\u0000", ViewConfiguration.getScrollBarFadeDuration() >> 16, "囔崌袴\ue964").intern());
            sb.append(str);
            sb.append(m30437("鎙䝿쇲怒⽞﷽꽖櫚", (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", ViewConfiguration.getJumpTapTimeout() >> 16, "唞远\ue29f异").intern());
            sb.append(interfaceC12018hu.mo30359());
            C12085l.m30909(strIntern, sb.toString());
            return;
        }
        String strIntern2 = m30437("ꍆ浙柁䥕\uf556숛⌴迺ꅜ눣䮝ᢹ", (char) Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", (-1) - ExpandableListView.getPackedPositionChild(0L), "硜马엃ꂘ").intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(m30437("威澗", (char) (KeyEvent.keyCodeFromString("") + 25736), "\u0000\u0000\u0000\u0000", KeyEvent.getDeadChar(0, 0), "囔崌袴\ue964").intern());
        sb2.append(str);
        C12085l.m30909(strIntern2, sb2.toString());
        int i3 = f29258 + 17;
        f29260 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30437(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f29266) ^ ((long) f29264)) ^ ((long) f29267));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30436(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29261;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29263;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29265 + i] + i4);
                } else {
                    i5 = (short) (f29262[f29265 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29265 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29259);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29263;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29262;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
