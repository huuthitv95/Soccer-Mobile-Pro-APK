package com.iab.omid.library.vungle.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.vungle.adsession.OutputDeviceStatus;
import com.iab.omid.library.vungle.internal.C11294e;
import com.iab.omid.library.vungle.walking.C11322a;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11312c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23725a;

    /* JADX INFO: renamed from: b */
    private static String[] f23726b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23727c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23728a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23728a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23729a;

        /* JADX INFO: renamed from: b */
        final float f23730b;

        b(float f, float f2) {
            this.f23729a = f;
            this.f23730b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m25123a(int i) {
        return i / f23727c;
    }

    /* JADX INFO: renamed from: a */
    private static b m25124a(JSONObject jSONObject) {
        float fM25123a;
        float fM25123a2;
        if (f23725a != null) {
            Point point = new Point(0, 0);
            f23725a.getDefaultDisplay().getRealSize(point);
            fM25123a = m25123a(point.x);
            fM25123a2 = m25123a(point.y);
        } else {
            fM25123a = 0.0f;
            fM25123a2 = 0.0f;
        }
        return new b(fM25123a, fM25123a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m25125a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m25123a(i));
            jSONObject.put("y", m25123a(i2));
            jSONObject.put("width", m25123a(i3));
            jSONObject.put("height", m25123a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11313d.m25147a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25126a(Context context) {
        if (context != null) {
            f23727c = context.getResources().getDisplayMetrics().density;
            f23725a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25127a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m25133a(outputDeviceStatus));
        } catch (JSONException e) {
            C11313d.m25147a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25128a(JSONObject jSONObject, C11322a.a aVar) {
        C11294e c11294eM25213a = aVar.m25213a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m25215b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11294eM25213a.m25021d());
            jSONObject.put("friendlyObstructionPurpose", c11294eM25213a.m25019b());
            jSONObject.put("friendlyObstructionReason", c11294eM25213a.m25018a());
        } catch (JSONException e) {
            C11313d.m25147a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25129a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11313d.m25147a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25130a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11313d.m25147a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25131a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11313d.m25147a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25132a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m25133a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23728a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m25134a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static Map<String, String> m25135b(JSONObject jSONObject) {
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    map.put(next, (String) obj);
                }
            }
            return map;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse JSON to Map", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25136b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C11313d.m25147a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25137b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11313d.m25147a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m25138b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m25134a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m25145h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m25139c(JSONObject jSONObject) {
        b bVarM25124a = m25124a(jSONObject);
        try {
            jSONObject.put("width", bVarM25124a.f23729a);
            jSONObject.put("height", bVarM25124a.f23730b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m25140c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m25134a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m25141d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m25142e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m25143f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23726b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m25144g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m25145h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m25143f(jSONObject, jSONObject2) && m25144g(jSONObject, jSONObject2) && m25142e(jSONObject, jSONObject2) && m25141d(jSONObject, jSONObject2) && m25140c(jSONObject, jSONObject2) && m25138b(jSONObject, jSONObject2);
    }
}
