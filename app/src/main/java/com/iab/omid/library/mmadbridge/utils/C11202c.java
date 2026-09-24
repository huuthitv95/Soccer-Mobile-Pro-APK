package com.iab.omid.library.mmadbridge.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.iab.omid.library.mmadbridge.adsession.OutputDeviceStatus;
import com.iab.omid.library.mmadbridge.internal.C11187e;
import com.iab.omid.library.mmadbridge.walking.C11212a;
import com.ironsource.C11744X3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11202c {

    /* JADX INFO: renamed from: a */
    private static WindowManager f23432a;

    /* JADX INFO: renamed from: b */
    private static String[] f23433b = {"x", "y", "width", "height"};

    /* JADX INFO: renamed from: c */
    static float f23434c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f23435a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f23435a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.utils.c$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        final float f23436a;

        /* JADX INFO: renamed from: b */
        final float f23437b;

        b(float f, float f2) {
            this.f23436a = f;
            this.f23437b = f2;
        }
    }

    /* JADX INFO: renamed from: a */
    static float m24587a(int i) {
        return i / f23434c;
    }

    /* JADX INFO: renamed from: a */
    private static b m24588a(JSONObject jSONObject) {
        float fM24587a;
        float fM24587a2;
        if (f23432a != null) {
            Point point = new Point(0, 0);
            f23432a.getDefaultDisplay().getRealSize(point);
            fM24587a = m24587a(point.x);
            fM24587a2 = m24587a(point.y);
        } else {
            fM24587a = 0.0f;
            fM24587a2 = 0.0f;
        }
        return new b(fM24587a, fM24587a2);
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m24589a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m24587a(i));
            jSONObject.put("y", m24587a(i2));
            jSONObject.put("width", m24587a(i3));
            jSONObject.put("height", m24587a(i4));
            return jSONObject;
        } catch (JSONException e) {
            C11203d.m24610a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24590a(Context context) {
        if (context != null) {
            f23434c = context.getResources().getDisplayMetrics().density;
            f23432a = (WindowManager) context.getSystemService("window");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24591a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", m24597a(outputDeviceStatus));
        } catch (JSONException e) {
            C11203d.m24610a("Error with setting output device status", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24592a(JSONObject jSONObject, C11212a.a aVar) {
        C11187e c11187eM24674a = aVar.m24674a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.m24676b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", c11187eM24674a.m24505d());
            jSONObject.put("friendlyObstructionPurpose", c11187eM24674a.m24503b());
            jSONObject.put("friendlyObstructionReason", c11187eM24674a.m24502a());
        } catch (JSONException e) {
            C11203d.m24610a("Error with setting friendly obstruction", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24593a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C11203d.m24610a("Error with setting has window focus", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24594a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C11203d.m24610a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24595a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C11203d.m24610a("JSONException during JSONObject.put for name [" + str + C11744X3.j.f26440e, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24596a(JSONObject jSONObject, JSONObject jSONObject2) {
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
    private static boolean m24597a(OutputDeviceStatus outputDeviceStatus) {
        return a.f23435a[outputDeviceStatus.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m24598a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static void m24599b(JSONObject jSONObject) {
        b bVarM24588a = m24588a(jSONObject);
        try {
            jSONObject.put("width", bVarM24588a.f23436a);
            jSONObject.put("height", bVarM24588a.f23437b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24600b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e) {
                C11203d.m24610a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m24601b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C11203d.m24610a("Error with setting not visible reason", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m24602b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24598a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!m24608h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m24603c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!m24598a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
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
    private static boolean m24604d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m24605e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    /* JADX INFO: renamed from: f */
    private static boolean m24606f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f23433b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m24607g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m24608h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m24606f(jSONObject, jSONObject2) && m24607g(jSONObject, jSONObject2) && m24605e(jSONObject, jSONObject2) && m24604d(jSONObject, jSONObject2) && m24603c(jSONObject, jSONObject2) && m24602b(jSONObject, jSONObject2);
    }
}
