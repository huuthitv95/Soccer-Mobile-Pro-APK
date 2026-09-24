package com.iab.omid.library.unity3d.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.unity3d.adsession.OutputDeviceStatus;
import com.iab.omid.library.unity3d.internal.C11236e;
import com.iab.omid.library.unity3d.walking.C11258a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11249c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23561a;

    /* JADX INFO: renamed from: b */
    private static String[] f23562b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23563c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23564a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23564a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23565a;

        /* JADX INFO: renamed from: b */
        final float f23566b;

        b(float f, float f2) {
            this.f23565a = f;
            this.f23566b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m24828a(int i) {
        return i / f23563c;
    }

    /* JADX INFO: renamed from: a */
    private static b m24829a(JSONObject jSONObject) {
        float fM24828a;
        float fM24828a2;
        if (f23561a != null) {
            Point point = new Point(0, 0);
            f23561a.getDefaultDisplay().getRealSize(point);
            fM24828a = m24828a(point.x);
            fM24828a2 = m24828a(point.y);
        } else {
            fM24828a = 0.0f;
            fM24828a2 = 0.0f;
        }
        return new b(fM24828a, fM24828a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m24830a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m24828a(i));
            jSONObject.put("y", m24828a(i2));
            jSONObject.put("width", m24828a(i3));
            jSONObject.put("height", m24828a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11250d.m24850a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24831a(Context context) {
        if (context != null) {
            f23563c = context.getResources().getDisplayMetrics().density;
            f23561a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24832a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m24838a(outputDeviceStatus));
        } catch (JSONException e) {
            C11250d.m24850a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24833a(JSONObject jSONObject, C11258a.a aVar) {
        C11236e c11236eM24908a = aVar.m24908a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m24910b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11236eM24908a.m24761d());
            jSONObject.put("friendlyObstructionPurpose", c11236eM24908a.m24759b());
            jSONObject.put("friendlyObstructionReason", c11236eM24908a.m24758a());
        } catch (JSONException e) {
            C11250d.m24850a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24834a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11250d.m24850a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24835a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11250d.m24850a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24836a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11250d.m24850a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24837a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m24838a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23564a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24839a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m24840b(JSONObject jSONObject) {
        b bVarM24829a = m24829a(jSONObject);
        try {
            jSONObject.put("width", bVarM24829a.f23565a);
            jSONObject.put("height", bVarM24829a.f23566b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24841b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11250d.m24850a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24842b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24839a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m24848h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m24843c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24839a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m24844d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m24845e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m24846f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23562b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m24847g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24848h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m24846f(jSONObject, jSONObject2) && m24847g(jSONObject, jSONObject2) && m24845e(jSONObject, jSONObject2) && m24844d(jSONObject, jSONObject2) && m24843c(jSONObject, jSONObject2) && m24842b(jSONObject, jSONObject2);
    }
}
