package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jz */
/* JADX INFO: loaded from: classes6.dex */
public final class C12077jz {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29772 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29774;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29773 = {'J', 30993, 62155, 27528, 58717, 24126, 55269, 20642, 51811, 'E', 31024, 62198, 27561, 58746, 24170, 55290, 20655, 51836, 17211, 48368, 13751, 44908, 10291, 41458, 6841, 37888, 3336, 34519, 65417, 31046, '.', 31084, 62122, 27630, 58748, 24120, 55289, 20640, 51827, 17203, 48352, 13747, 44924, 10355, 'x', 1072, 8916, AbstractJsonLexerKt.UNICODE_ESC, 'E', 31024, 62198, 27561, 58746, 24170, 55279, 20668, 51829, 17203, 48352, 13759, 44918, 10301, 41404, 6834, 37953, 3345, 34512, 65458, 31047, 61983, 27599, 58502, 24080, 55064, 20679, 51609, 17238};

    /* JADX INFO: renamed from: ﻐ */
    private static long f29771 = -3530121184334808766L;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jz$a */
    public interface a<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo28537(JSONArray jSONArray, int i);
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jz$c */
    public interface c<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo28541(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﾒ */
    public static JSONObject m30816(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f29772 + 23;
        f29774 = i2 % 128;
        int i3 = i2 % 2;
        return m30807(jSONObject, false);
    }

    /* JADX INFO: renamed from: ｋ */
    public static JSONObject m30807(JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!(!z)) {
                    int i2 = f29772 + 15;
                    f29774 = i2 % 128;
                    if (i2 % 2 != 0) {
                        jSONObject2.remove(C12035ik.f29407);
                        throw null;
                    }
                    jSONObject2.remove(C12035ik.f29407);
                }
                int i3 = f29774 + 115;
                f29772 = i3 % 128;
                int i4 = i3 % 2;
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30802(JSONObject jSONObject, JSONObject jSONObject2) {
        int i = 2 % 2;
        int i2 = f29772 + 93;
        f29774 = i2 % 128;
        int i3 = i2 % 2;
        m30803(jSONObject, jSONObject2, false);
        int i4 = f29772 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29774 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30803(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        Iterator<String> itKeys;
        int i = 2 % 2;
        int i2 = f29774;
        int i3 = i2 + 97;
        f29772 = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        int i5 = i2 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29772 = i5 % 128;
        if (i5 % 2 == 0) {
            itKeys = jSONObject2.keys();
            int i6 = 28 / 0;
        } else {
            itKeys = jSONObject2.keys();
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(C12035ik.f29407);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static List<String> m30815(JSONArray jSONArray) {
        int i = 2 % 2;
        int i2 = f29774;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29772 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (jSONArray != null) {
            return m30804(jSONArray);
        }
        int i4 = i2 + 67;
        f29772 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static <T> List<T> m30804(JSONArray jSONArray) {
        int i = 2 % 2;
        List<T> listM30805 = m30805(jSONArray, new a<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
            /* JADX INFO: renamed from: ﾒ */
            public final T mo28537(JSONArray jSONArray2, int i2) {
                return (T) jSONArray2.opt(i2);
            }
        });
        int i2 = f29774 + 71;
        f29772 = i2 % 128;
        if (i2 % 2 != 0) {
            return listM30805;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static <T> List<T> m30805(JSONArray jSONArray, a<T> aVar) {
        int i = 2 % 2;
        int i2 = f29774 + 53;
        f29772 = i2 % 128;
        int i3 = i2 % 2;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            int i5 = f29774 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f29772 = i5 % 128;
            int i6 = i5 % 2;
            T tMo28537 = aVar.mo28537(jSONArray, i4);
            if (tMo28537 != null) {
                arrayList.add(tMo28537);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static List<String> m30800(JSONObject jSONObject, String str, List<String> list) {
        int i = 2 % 2;
        int i2 = f29772 + 41;
        f29774 = i2 % 128;
        int i3 = i2 % 2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            int i4 = f29774 + 25;
            f29772 = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }
        List<String> listM30815 = m30815(jSONArrayOptJSONArray);
        int i6 = f29772 + 41;
        f29774 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return listM30815;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static void m30801(JSONObject jSONObject, int i) {
        int i2 = 2 % 2;
        int i3 = f29772 + 59;
        f29774 = i3 % 128;
        int i4 = i3 % 2;
        m30808(jSONObject, i, null);
        int i5 = f29774 + 11;
        f29772 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30808(JSONObject jSONObject, int i, List<String> list) {
        int i2 = 2 % 2;
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                int i3 = f29774 + 53;
                f29772 = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < jSONArrayNames.length(); i5++) {
                    int i6 = f29772 + 103;
                    f29774 = i6 % 128;
                    if (i6 % 2 != 0) {
                        jSONArrayNames.optString(i5);
                        try {
                            throw null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        String strOptString = jSONArrayNames.optString(i5);
                        if (list == null || !list.contains(strOptString)) {
                            m30813(jSONObject, strOptString, i);
                        }
                    }
                }
            }
        } catch (JSONException e) {
            C12085l.m30922(m30814(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.lastIndexOf("", '0', 0) + 10).intern(), m30814((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, (char) (ViewConfiguration.getScrollBarSize() >> 8), 20 - TextUtils.indexOf((CharSequence) "", '0')).intern(), e);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30813(JSONObject jSONObject, String str, int i) throws JSONException {
        int i2 = 2 % 2;
        int i3 = f29772 + 37;
        f29774 = i3 % 128;
        int i4 = i3 % 2;
        String strM30809 = m30809(jSONObject.opt(str), i);
        if (strM30809 != null) {
            if (strM30809.equals("")) {
                int i5 = f29772 + 81;
                f29774 = i5 % 128;
                int i6 = i5 % 2;
                strM30809 = null;
            }
            jSONObject.put(str, strM30809);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static void m30812(JSONArray jSONArray, int i) throws JSONException {
        int i2 = 2 % 2;
        int i3 = f29774 + 103;
        f29772 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        while (i4 < jSONArray.length()) {
            int i5 = f29772 + 73;
            f29774 = i5 % 128;
            int i6 = i5 % 2;
            m30817(jSONArray, i4, i);
            i4++;
            int i7 = f29774 + 99;
            f29772 = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f29774 + 7;
        f29772 = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m30817(JSONArray jSONArray, int i, int i2) throws JSONException {
        int i3 = 2 % 2;
        String strM30809 = m30809(jSONArray.opt(i), i2);
        if (strM30809 != null) {
            jSONArray.put(i, strM30809);
            int i4 = f29774 + 83;
            f29772 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = f29772 + 93;
        f29774 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30809(Object obj, int i) throws JSONException {
        int i2 = 2 % 2;
        if (obj instanceof JSONObject) {
            m30801((JSONObject) obj, i);
        } else if (obj instanceof JSONArray) {
            m30812((JSONArray) obj, i);
            int i3 = f29772 + 81;
            f29774 = i3 % 128;
            int i4 = i3 % 2;
        } else if (obj instanceof String) {
            int i5 = f29774 + 41;
            f29772 = i5 % 128;
            int i6 = i5 % 2;
            String str = (String) obj;
            if (str.length() <= i) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, i));
            sb.append(m30814(29 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14).intern());
            return sb.toString();
        }
        int i7 = f29774 + 113;
        f29772 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static Map<String, String> m30806(JSONObject jSONObject) {
        int i = 2 % 2;
        Map<String, String> mapM30810 = m30810(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.c
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo28541(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i2 = f29774 + 77;
        f29772 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 77 / 0;
        }
        return mapM30810;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static <T> Map<String, T> m30810(JSONObject jSONObject, c<T> cVar) {
        int i = 2 % 2;
        int i2 = f29774 + 103;
        int i3 = i2 % 128;
        f29772 = i3;
        int i4 = i2 % 2;
        if (jSONObject == null) {
            int i5 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29774 = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (!(!itKeys.hasNext())) {
            String next = itKeys.next();
            map.put(next, cVar.mo28541(jSONObject, next));
            int i7 = f29774 + 33;
            f29772 = i7 % 128;
            int i8 = i7 % 2;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static JSONObject m30811(int i, int i2, long j, long j2) {
        int i3 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (j <= -1) {
                jSONObject.put(m30814(44 - KeyEvent.keyCodeFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), -1);
                jSONObject.put(m30814(44 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (1096 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), -1);
                jSONObject.put(m30814((ViewConfiguration.getJumpTapTimeout() >> 16) + 46, (char) (8864 - View.getDefaultSize(0, 0)), -TextUtils.lastIndexOf("", '0', 0, 0)).intern(), -1);
                jSONObject.put(m30814(47 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern(), -1);
                int i4 = f29772 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f29774 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 % 2;
                }
                return jSONObject;
            }
            int i6 = f29772 + 75;
            f29774 = i6 % 128;
            int i7 = i6 % 2;
            jSONObject.put(m30814((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), -((byte) KeyEvent.getModifierMetaStateMask())).intern(), i);
            jSONObject.put(m30814(45 - Drawable.resolveOpacity(0, 0), (char) (1097 - ExpandableListView.getPackedPositionType(0L)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), i2);
            jSONObject.put(m30814((Process.myTid() >> 22) + 46, (char) (TextUtils.lastIndexOf("", '0', 0) + 8865), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern(), j);
            jSONObject.put(m30814(47 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) View.getDefaultSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern(), j2);
            return jSONObject;
        } catch (JSONException e) {
            C12085l.m30922(m30814(Color.red(0), (char) Color.argb(0, 0, 0, 0), 8 - Process.getGidForName("")).intern(), m30814(48 - View.combineMeasuredStates(0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 28 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30814(int i, char c2, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29773[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29771)) ^ ((long) c2));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
