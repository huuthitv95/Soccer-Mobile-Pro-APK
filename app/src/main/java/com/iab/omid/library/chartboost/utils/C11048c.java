package com.iab.omid.library.chartboost.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.chartboost.adsession.OutputDeviceStatus;
import com.iab.omid.library.chartboost.internal.C11033e;
import com.iab.omid.library.chartboost.walking.C11058a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11048c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23027a;

    /* JADX INFO: renamed from: b */
    private static String[] f23028b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23029c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23030a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23030a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23031a;

        /* JADX INFO: renamed from: b */
        final float f23032b;

        b(float f, float f2) {
            this.f23031a = f;
            this.f23032b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m23825a(int i) {
        return i / f23029c;
    }

    /* JADX INFO: renamed from: a */
    private static b m23826a(JSONObject jSONObject) {
        float fM23825a;
        float fM23825a2;
        if (f23027a != null) {
            Point point = new Point(0, 0);
            f23027a.getDefaultDisplay().getRealSize(point);
            fM23825a = m23825a(point.x);
            fM23825a2 = m23825a(point.y);
        } else {
            fM23825a = 0.0f;
            fM23825a2 = 0.0f;
        }
        return new b(fM23825a, fM23825a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m23827a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m23825a(i));
            jSONObject.put("y", m23825a(i2));
            jSONObject.put("width", m23825a(i3));
            jSONObject.put("height", m23825a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11049d.m23848a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23828a(Context context) {
        if (context != null) {
            f23029c = context.getResources().getDisplayMetrics().density;
            f23027a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23829a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m23835a(outputDeviceStatus));
        } catch (JSONException e) {
            C11049d.m23848a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23830a(JSONObject jSONObject, C11058a.a aVar) {
        C11033e c11033eM23912a = aVar.m23912a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m23914b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11033eM23912a.m23742d());
            jSONObject.put("friendlyObstructionPurpose", c11033eM23912a.m23740b());
            jSONObject.put("friendlyObstructionReason", c11033eM23912a.m23739a());
        } catch (JSONException e) {
            C11049d.m23848a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23831a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11049d.m23848a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23832a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11049d.m23848a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23833a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11049d.m23848a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m23834a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m23835a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23030a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m23836a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m23837b(JSONObject jSONObject) {
        b bVarM23826a = m23826a(jSONObject);
        try {
            jSONObject.put("width", bVarM23826a.f23031a);
            jSONObject.put("height", bVarM23826a.f23032b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23838b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C11049d.m23848a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23839b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11049d.m23848a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m23840b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23836a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m23846h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m23841c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m23836a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m23842d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m23843e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m23844f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23028b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m23845g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23846h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m23844f(jSONObject, jSONObject2) && m23845g(jSONObject, jSONObject2) && m23843e(jSONObject, jSONObject2) && m23842d(jSONObject, jSONObject2) && m23841c(jSONObject, jSONObject2) && m23840b(jSONObject, jSONObject2);
    }
}
