package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2243ri {

    /* JADX INFO: renamed from: di */
    private String f5559di;

    /* JADX INFO: renamed from: fi */
    private long f5560fi;

    /* JADX INFO: renamed from: ik */
    private List<ri> f5561ik;

    /* JADX INFO: renamed from: ka */
    private long f5562ka;

    /* JADX INFO: renamed from: lr */
    private float f5563lr;

    /* JADX INFO: renamed from: ri */
    private String f5564ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ri$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        private float f5565di;

        /* JADX INFO: renamed from: fi */
        private String f5566fi;

        /* JADX INFO: renamed from: ik */
        private String f5567ik;
        private String jbs;

        /* JADX INFO: renamed from: ka */
        private long f5568ka;

        /* JADX INFO: renamed from: lr */
        private float f5569lr;

        /* JADX INFO: renamed from: mj */
        private float[] f5570mj;

        /* JADX INFO: renamed from: qt */
        private String f5571qt;

        /* JADX INFO: renamed from: ri */
        private long f5572ri;
        private float xha;

        /* JADX INFO: renamed from: ri */
        public static ri m7409ri(JSONObject jSONObject, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
            if (jSONObject == null) {
                return null;
            }
            ri riVar = new ri();
            riVar.m7425ri(jSONObject.optLong("duration"));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                riVar.m7424ri(-1.0f);
            } else {
                try {
                    riVar.m7424ri(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    riVar.m7424ri(0.0f);
                }
            }
            riVar.m7426ri(jSONObject.optString("loopMode"));
            riVar.m7420lr(jSONObject.optString("type"));
            if (TextUtils.equals(riVar.m7411fi(), "ripple")) {
                riVar.m7414ik(jSONObject.optString("rippleColor"));
            }
            View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
            Context context = viewM7879sf != null ? viewM7879sf.getContext() : null;
            if (TextUtils.equals(riVar.m7411fi(), "backgroundColor")) {
                String strM7663ri = C2268lr.m7663ri(jSONObject.optString("valueTo"), abstractViewOnTouchListenerC2318ik.m7834co());
                int iM8053ri = C2348ri.m8053ri(jSONObject.optString("valueFrom"));
                int iM8053ri2 = C2348ri.m8053ri(strM7663ri);
                riVar.m7418lr(iM8053ri);
                riVar.m7413ik(iM8053ri2);
            } else if ((TextUtils.equals(riVar.m7411fi(), "translateX") || TextUtils.equals(riVar.m7411fi(), "translateY")) && context != null) {
                try {
                    float fM8043ri = C2347mj.m8043ri(context, (float) jSONObject.optDouble("valueFrom"));
                    float fM8043ri2 = C2347mj.m8043ri(context, (float) jSONObject.optDouble("valueTo"));
                    riVar.m7418lr(fM8043ri);
                    riVar.m7413ik(fM8043ri2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                riVar.m7418lr((float) jSONObject.optDouble("valueFrom"));
                riVar.m7413ik((float) jSONObject.optDouble("valueTo"));
            }
            riVar.m7416ka(jSONObject.optString("interpolator"));
            String strM7663ri2 = C2268lr.m7663ri(jSONObject.optString("startDelay"), abstractViewOnTouchListenerC2318ik.m7834co());
            Log.d("TAG", "createAnimationModel: ");
            riVar.m7419lr(C2343ik.m8031ri(strM7663ri2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(riVar.m7411fi(), "translateX") || TextUtils.equals(riVar.m7411fi(), "translateY")) && context != null) {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = C2347mj.m8043ri(context, (float) C2243ri.m7393ri(jSONArrayOptJSONArray.optString(i), abstractViewOnTouchListenerC2318ik.m7834co()));
                        i++;
                    }
                } else {
                    while (i < jSONArrayOptJSONArray.length()) {
                        fArr[i] = (float) C2243ri.m7393ri(jSONArrayOptJSONArray.optString(i), abstractViewOnTouchListenerC2318ik.m7834co());
                        i++;
                    }
                }
                riVar.m7427ri(fArr);
            }
            return riVar;
        }

        /* JADX INFO: renamed from: di */
        public float m7410di() {
            return this.f5565di;
        }

        /* JADX INFO: renamed from: fi */
        public String m7411fi() {
            return this.f5566fi;
        }

        /* JADX INFO: renamed from: ik */
        public String m7412ik() {
            return this.f5567ik;
        }

        /* JADX INFO: renamed from: ik */
        public void m7413ik(float f) {
            this.xha = f;
        }

        /* JADX INFO: renamed from: ik */
        public void m7414ik(String str) {
            this.f5571qt = str;
        }

        public String jbs() {
            return this.jbs;
        }

        /* JADX INFO: renamed from: ka */
        public long m7415ka() {
            return this.f5568ka;
        }

        /* JADX INFO: renamed from: ka */
        public void m7416ka(String str) {
            this.jbs = str;
        }

        /* JADX INFO: renamed from: lr */
        public float m7417lr() {
            return this.f5569lr;
        }

        /* JADX INFO: renamed from: lr */
        public void m7418lr(float f) {
            this.f5565di = f;
        }

        /* JADX INFO: renamed from: lr */
        public void m7419lr(long j) {
            this.f5568ka = j;
        }

        /* JADX INFO: renamed from: lr */
        public void m7420lr(String str) {
            this.f5566fi = str;
        }

        /* JADX INFO: renamed from: mj */
        public float[] m7421mj() {
            return this.f5570mj;
        }

        /* JADX INFO: renamed from: qt */
        public String m7422qt() {
            return this.f5571qt;
        }

        /* JADX INFO: renamed from: ri */
        public long m7423ri() {
            return this.f5572ri;
        }

        /* JADX INFO: renamed from: ri */
        public void m7424ri(float f) {
            this.f5569lr = f;
        }

        /* JADX INFO: renamed from: ri */
        public void m7425ri(long j) {
            this.f5572ri = j;
        }

        /* JADX INFO: renamed from: ri */
        public void m7426ri(String str) {
            this.f5567ik = str;
        }

        /* JADX INFO: renamed from: ri */
        public void m7427ri(float[] fArr) {
            this.f5570mj = fArr;
        }

        public float xha() {
            return this.xha;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static double m7393ri(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return C2343ik.m8028ri(C2268lr.m7663ri((String) obj, jSONObject), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        return ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof Integer)) ? ((Double) obj).doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ri */
    public static C2243ri m7394ri(String str, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m7395ri(new JSONObject(str), abstractViewOnTouchListenerC2318ik);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C2243ri m7395ri(JSONObject jSONObject, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        return m7396ri(jSONObject, null, abstractViewOnTouchListenerC2318ik);
    }

    /* JADX INFO: renamed from: ri */
    public static C2243ri m7396ri(JSONObject jSONObject, JSONObject jSONObject2, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (jSONObject == null) {
            return null;
        }
        C2243ri c2243ri = new C2243ri();
        c2243ri.m7407ri(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            c2243ri.m7405ri(-1.0f);
        } else {
            try {
                c2243ri.m7405ri(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                c2243ri.m7405ri(0.0f);
            }
        }
        c2243ri.m7406ri(jSONObject.optLong("duration", 0L));
        c2243ri.m7402lr(C2343ik.m8031ri(C2268lr.m7663ri(jSONObject.optString("startDelay"), abstractViewOnTouchListenerC2318ik.m7834co()), 0L));
        c2243ri.m7403lr(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    C2346lr.m8041ri(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(ri.m7409ri(jSONObjectOptJSONObject, abstractViewOnTouchListenerC2318ik));
            }
            c2243ri.m7408ri(arrayList);
        }
        return c2243ri;
    }

    /* JADX INFO: renamed from: di */
    public String m7397di() {
        return this.f5559di;
    }

    /* JADX INFO: renamed from: fi */
    public long m7398fi() {
        return this.f5560fi;
    }

    /* JADX INFO: renamed from: ik */
    public List<ri> m7399ik() {
        return this.f5561ik;
    }

    /* JADX INFO: renamed from: ka */
    public long m7400ka() {
        return this.f5562ka;
    }

    /* JADX INFO: renamed from: lr */
    public float m7401lr() {
        return this.f5563lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m7402lr(long j) {
        this.f5560fi = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m7403lr(String str) {
        this.f5559di = str;
    }

    /* JADX INFO: renamed from: ri */
    public String m7404ri() {
        return this.f5564ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7405ri(float f) {
        this.f5563lr = f;
    }

    /* JADX INFO: renamed from: ri */
    public void m7406ri(long j) {
        this.f5562ka = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m7407ri(String str) {
        this.f5564ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m7408ri(List<ri> list) {
        this.f5561ik = list;
    }
}
