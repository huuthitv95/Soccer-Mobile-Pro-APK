package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.internal.C10931e;
import com.iab.omid.library.applovin.walking.C10956a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10946c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f22757a;

    /* JADX INFO: renamed from: b */
    private static String[] f22758b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f22759c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f22760a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f22760a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f22761a;

        /* JADX INFO: renamed from: b */
        final float f22762b;

        b(float f, float f2) {
            this.f22761a = f;
            this.f22762b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m23324a(int i) {
        return i / f22759c;
    }

    /* JADX INFO: renamed from: a */
    private static b m23325a(JSONObject jSONObject) {
        float fM23324a;
        float fM23324a2;
        if (f22757a != null) {
            Point point = new Point(0, 0);
            f22757a.getDefaultDisplay().getRealSize(point);
            fM23324a = m23324a(point.x);
            fM23324a2 = m23324a(point.y);
        } else {
            fM23324a = 0.0f;
            fM23324a2 = 0.0f;
        }
        return new b(fM23324a, fM23324a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m23326a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m23324a(i));
            jSONObject.put("y", m23324a(i2));
            jSONObject.put("width", m23324a(i3));
            jSONObject.put("height", m23324a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C10947d.m23347a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23327a(Context context) {
        if (context != null) {
            f22759c = context.getResources().getDisplayMetrics().density;
            f22757a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23328a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m23334a(outputDeviceStatus));
        } catch (JSONException e) {
            C10947d.m23347a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23329a(JSONObject jSONObject, C10956a.a aVar) {
        C10931e c10931eM23411a = aVar.m23411a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m23413b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c10931eM23411a.m23242d());
            jSONObject.put("friendlyObstructionPurpose", c10931eM23411a.m23240b());
            jSONObject.put("friendlyObstructionReason", c10931eM23411a.m23239a());
        } catch (JSONException e) {
            C10947d.m23347a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23330a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C10947d.m23347a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23331a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C10947d.m23347a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23332a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C10947d.m23347a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23333a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m23334a(OutputDeviceStatus outputDeviceStatus) {
        return a.f22760a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m23335a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m23336b(JSONObject jSONObject) {
        b bVarM23325a = m23325a(jSONObject);
        try {
            jSONObject.put("width", bVarM23325a.f22761a);
            jSONObject.put("height", bVarM23325a.f22762b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23337b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C10947d.m23347a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23338b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C10947d.m23347a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m23339b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23335a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m23345h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m23340c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23335a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m23341d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m23342e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m23343f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f22758b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m23344g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23345h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m23343f(jSONObject, jSONObject2) && m23344g(jSONObject, jSONObject2) && m23342e(jSONObject, jSONObject2) && m23341d(jSONObject, jSONObject2) && m23340c(jSONObject, jSONObject2) && m23339b(jSONObject, jSONObject2);
    }
}
