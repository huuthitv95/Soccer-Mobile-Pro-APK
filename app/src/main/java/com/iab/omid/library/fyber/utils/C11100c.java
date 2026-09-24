package com.iab.omid.library.fyber.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.fyber.adsession.OutputDeviceStatus;
import com.iab.omid.library.fyber.internal.C11085e;
import com.iab.omid.library.fyber.walking.C11110a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11100c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23162a;

    /* JADX INFO: renamed from: b */
    private static String[] f23163b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23164c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23165a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23165a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23166a;

        /* JADX INFO: renamed from: b */
        final float f23167b;

        b(float f, float f2) {
            this.f23166a = f;
            this.f23167b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m24081a(int i) {
        return i / f23164c;
    }

    /* JADX INFO: renamed from: a */
    private static b m24082a(JSONObject jSONObject) {
        float fM24081a;
        float fM24081a2;
        if (f23162a != null) {
            Point point = new Point(0, 0);
            f23162a.getDefaultDisplay().getRealSize(point);
            fM24081a = m24081a(point.x);
            fM24081a2 = m24081a(point.y);
        } else {
            fM24081a = 0.0f;
            fM24081a2 = 0.0f;
        }
        return new b(fM24081a, fM24081a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m24083a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m24081a(i));
            jSONObject.put("y", m24081a(i2));
            jSONObject.put("width", m24081a(i3));
            jSONObject.put("height", m24081a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11101d.m24104a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24084a(Context context) {
        if (context != null) {
            f23164c = context.getResources().getDisplayMetrics().density;
            f23162a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24085a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m24091a(outputDeviceStatus));
        } catch (JSONException e) {
            C11101d.m24104a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24086a(JSONObject jSONObject, C11110a.a aVar) {
        C11085e c11085eM24168a = aVar.m24168a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m24170b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11085eM24168a.m23999d());
            jSONObject.put("friendlyObstructionPurpose", c11085eM24168a.m23997b());
            jSONObject.put("friendlyObstructionReason", c11085eM24168a.m23996a());
        } catch (JSONException e) {
            C11101d.m24104a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24087a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11101d.m24104a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24088a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11101d.m24104a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24089a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11101d.m24104a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24090a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m24091a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23165a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24092a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m24093b(JSONObject jSONObject) {
        b bVarM24082a = m24082a(jSONObject);
        try {
            jSONObject.put("width", bVarM24082a.f23166a);
            jSONObject.put("height", bVarM24082a.f23167b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24094b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C11101d.m24104a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24095b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11101d.m24104a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24096b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24092a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m24102h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m24097c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24092a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m24098d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m24099e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m24100f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23163b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m24101g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24102h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m24100f(jSONObject, jSONObject2) && m24101g(jSONObject, jSONObject2) && m24099e(jSONObject, jSONObject2) && m24098d(jSONObject, jSONObject2) && m24097c(jSONObject, jSONObject2) && m24096b(jSONObject, jSONObject2);
    }
}
