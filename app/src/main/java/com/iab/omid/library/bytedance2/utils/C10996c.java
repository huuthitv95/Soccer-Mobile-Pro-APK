package com.iab.omid.library.bytedance2.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;
import com.iab.omid.library.bytedance2.internal.C10982e;
import com.iab.omid.library.bytedance2.walking.C11006a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10996c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f22887a;

    /* JADX INFO: renamed from: b */
    private static String[] f22888b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f22889c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22890a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f22890a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f22891a;

        /* JADX INFO: renamed from: b */
        final float f22892b;

        b(float f, float f2) {
            this.f22891a = f;
            this.f22892b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m23569a(int i) {
        return i / f22889c;
    }

    /* JADX INFO: renamed from: a */
    private static b m23570a(JSONObject jSONObject) {
        float fM23569a;
        float fM23569a2;
        if (f22887a != null) {
            Point point = new Point(0, 0);
            f22887a.getDefaultDisplay().getRealSize(point);
            fM23569a = m23569a(point.x);
            fM23569a2 = m23569a(point.y);
        } else {
            fM23569a = 0.0f;
            fM23569a2 = 0.0f;
        }
        return new b(fM23569a, fM23569a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m23571a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m23569a(i));
            jSONObject.put("y", m23569a(i2));
            jSONObject.put("width", m23569a(i3));
            jSONObject.put("height", m23569a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C10997d.m23591a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23572a(Context context) {
        if (context != null) {
            f22889c = context.getResources().getDisplayMetrics().density;
            f22887a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23573a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m23579a(outputDeviceStatus));
        } catch (JSONException e) {
            C10997d.m23591a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23574a(JSONObject jSONObject, C11006a.a aVar) {
        C10982e c10982eM23652a = aVar.m23652a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m23654b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c10982eM23652a.m23495d());
            jSONObject.put("friendlyObstructionPurpose", c10982eM23652a.m23493b());
            jSONObject.put("friendlyObstructionReason", c10982eM23652a.m23492a());
        } catch (JSONException e) {
            C10997d.m23591a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23575a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C10997d.m23591a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23576a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C10997d.m23591a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23577a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C10997d.m23591a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23578a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m23579a(OutputDeviceStatus outputDeviceStatus) {
        return a.f22890a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m23580a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m23581b(JSONObject jSONObject) {
        b bVarM23570a = m23570a(jSONObject);
        try {
            jSONObject.put("width", bVarM23570a.f22891a);
            jSONObject.put("height", bVarM23570a.f22892b);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23582b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C10997d.m23591a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m23583b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23580a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m23589h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m23584c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23580a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m23585d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m23586e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m23587f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f22888b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m23588g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23589h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m23587f(jSONObject, jSONObject2) && m23588g(jSONObject, jSONObject2) && m23586e(jSONObject, jSONObject2) && m23585d(jSONObject, jSONObject2) && m23584c(jSONObject, jSONObject2) && m23583b(jSONObject, jSONObject2);
    }
}
