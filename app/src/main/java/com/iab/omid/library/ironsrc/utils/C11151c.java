package com.iab.omid.library.ironsrc.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.adsession.OutputDeviceStatus;
import com.iab.omid.library.ironsrc.internal.C11136e;
import com.iab.omid.library.ironsrc.walking.C11161a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11151c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23297a;

    /* JADX INFO: renamed from: b */
    private static String[] f23298b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23299c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23300a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23300a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23301a;

        /* JADX INFO: renamed from: b */
        final float f23302b;

        b(float f, float f2) {
            this.f23301a = f;
            this.f23302b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m24334a(int i) {
        return i / f23299c;
    }

    /* JADX INFO: renamed from: a */
    private static b m24335a(JSONObject jSONObject) {
        float fM24334a;
        float fM24334a2;
        if (f23297a != null) {
            Point point = new Point(0, 0);
            f23297a.getDefaultDisplay().getRealSize(point);
            fM24334a = m24334a(point.x);
            fM24334a2 = m24334a(point.y);
        } else {
            fM24334a = 0.0f;
            fM24334a2 = 0.0f;
        }
        return new b(fM24334a, fM24334a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m24336a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m24334a(i));
            jSONObject.put("y", m24334a(i2));
            jSONObject.put("width", m24334a(i3));
            jSONObject.put("height", m24334a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11152d.m24357a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24337a(Context context) {
        if (context != null) {
            f23299c = context.getResources().getDisplayMetrics().density;
            f23297a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24338a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m24344a(outputDeviceStatus));
        } catch (JSONException e) {
            C11152d.m24357a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24339a(JSONObject jSONObject, C11161a.a aVar) {
        C11136e c11136eM24421a = aVar.m24421a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m24423b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11136eM24421a.m24252d());
            jSONObject.put("friendlyObstructionPurpose", c11136eM24421a.m24250b());
            jSONObject.put("friendlyObstructionReason", c11136eM24421a.m24249a());
        } catch (JSONException e) {
            C11152d.m24357a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24340a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11152d.m24357a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24341a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11152d.m24357a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24342a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11152d.m24357a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24343a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m24344a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23300a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24345a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m24346b(JSONObject jSONObject) {
        b bVarM24335a = m24335a(jSONObject);
        try {
            jSONObject.put("width", bVarM24335a.f23301a);
            jSONObject.put("height", bVarM24335a.f23302b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24347b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C11152d.m24357a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24348b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11152d.m24357a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24349b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24345a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m24355h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m24350c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24345a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m24351d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m24352e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m24353f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23298b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m24354g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24355h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m24353f(jSONObject, jSONObject2) && m24354g(jSONObject, jSONObject2) && m24352e(jSONObject, jSONObject2) && m24351d(jSONObject, jSONObject2) && m24350c(jSONObject, jSONObject2) && m24349b(jSONObject, jSONObject2);
    }
}
