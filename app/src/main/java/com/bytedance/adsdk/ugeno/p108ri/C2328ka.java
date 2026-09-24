package com.bytedance.adsdk.ugeno.p108ri;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2328ka {
    /* JADX INFO: renamed from: ik */
    public static float[] m7981ik(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayM8038ri = C2346lr.m8038ri(str, (JSONArray) null);
        if (jSONArrayM8038ri != null && jSONArrayM8038ri.length() == 2) {
            fArr[0] = (float) jSONArrayM8038ri.optDouble(0);
            fArr[1] = (float) jSONArrayM8038ri.optDouble(1);
        }
        return fArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX INFO: renamed from: lr */
    public static Interpolator m7982lr(String str) {
        byte b;
        switch (str) {
            case "ease_in":
                b = 0;
                break;
            case "linear":
                b = 3;
                break;
            case "ease_out":
                b = 2;
                break;
            case "ease_in_out":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return new AccelerateInterpolator();
        }
        if (b != 1) {
            return b != 2 ? new LinearInterpolator() : new DecelerateInterpolator();
        }
        return new AccelerateDecelerateInterpolator();
    }

    /* JADX INFO: renamed from: lr */
    public static C2327ik.ri m7983lr(String str, JSONObject jSONObject) {
        JSONArray jSONArrayM8038ri;
        if (TextUtils.isEmpty(str) || (jSONArrayM8038ri = C2346lr.m8038ri(str, (JSONArray) null)) == null || jSONArrayM8038ri.length() != 2) {
            return null;
        }
        C2327ik.ri riVar = new C2327ik.ri();
        riVar.f6032ri = C2268lr.m7663ri(jSONArrayM8038ri.optString(0), jSONObject);
        riVar.f6031lr = C2268lr.m7663ri(jSONArrayM8038ri.optString(1), jSONObject);
        return riVar;
    }

    /* JADX INFO: renamed from: ri */
    public static int m7984ri(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    /* JADX INFO: renamed from: ri */
    public static int m7985ri(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals(Constants.NORMAL);
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ri */
    public static int m7986ri(String str, int i) {
        int i2 = i / 2;
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            switch (str) {
                case "bottom":
                case "right":
                    return i;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    try {
                        if (!str.endsWith("%")) {
                            return Integer.parseInt(str);
                        }
                        return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                    } catch (NumberFormatException unused) {
                        break;
                    }
                    break;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ri */
    public static C2327ik m7987ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        C2327ik c2327ik = new C2327ik();
        c2327ik.m7970lr(C2343ik.m8031ri(C2268lr.m7663ri(jSONObject.optString("delay"), jSONObject2), 0L));
        c2327ik.m7966ik(C2268lr.m7663ri(jSONObject.optString("name"), jSONObject2));
        c2327ik.m7969lr(C2343ik.m8030ri(C2268lr.m7663ri(jSONObject.optString("playState"), jSONObject2), 1));
        c2327ik.m7976ri(Math.max(C2343ik.m8031ri(C2268lr.m7663ri(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        c2327ik.m7975ri(C2343ik.m8030ri(C2268lr.m7663ri(jSONObject.optString("playCount"), jSONObject2), 1));
        c2327ik.m7978ri(C2268lr.m7663ri(jSONObject.optString("playDirection"), jSONObject2));
        c2327ik.m7977ri(m7983lr(jSONObject.optString("transformOrigin"), jSONObject2));
        c2327ik.m7971lr(C2268lr.m7663ri(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        c2327ik.m7980ri(jSONObject.optJSONObject("effect"));
        c2327ik.m7979ri(m7989ri(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return c2327ik;
    }

    /* JADX INFO: renamed from: ri */
    public static List<C2327ik> m7988ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(m7987ri(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Map<String, TreeMap<Float, String>> m7989ri(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(TypedValues.CycleType.S_WAVE_OFFSET);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, TypedValues.CycleType.S_WAVE_OFFSET)) {
                        if (!map.containsKey(next) || treeMap == null) {
                            TreeMap treeMap2 = new TreeMap();
                            treeMap2.put(Float.valueOf(fOptDouble), C2268lr.m7663ri(jSONObjectOptJSONObject.optString(next), jSONObject));
                            map.put(next, treeMap2);
                        } else {
                            treeMap.put(Float.valueOf(fOptDouble), C2268lr.m7663ri(jSONObjectOptJSONObject.optString(next), jSONObject));
                        }
                    }
                }
            }
        }
        return map;
    }
}
