package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3277co {

    /* JADX INFO: renamed from: aw */
    private final SparseArray<AbstractViewOnClickListenerC3218ik.ri> f11185aw;
    private final int bgr;

    /* JADX INFO: renamed from: bu */
    private final JSONObject f11186bu;

    /* JADX INFO: renamed from: co */
    private final int f11187co;

    /* JADX INFO: renamed from: di */
    private final float f11188di;

    /* JADX INFO: renamed from: fi */
    private final float f11189fi;

    /* JADX INFO: renamed from: ik */
    private final float f11190ik;
    private final int jbs;

    /* JADX INFO: renamed from: ka */
    private final float f11191ka;

    /* JADX INFO: renamed from: lr */
    private final int[] f11192lr;

    /* JADX INFO: renamed from: mj */
    private final long f11193mj;

    /* JADX INFO: renamed from: qt */
    private final int f11194qt;

    /* JADX INFO: renamed from: ri */
    private final int[] f11195ri;

    /* JADX INFO: renamed from: sf */
    private final int f11196sf;
    private final String slm;

    /* JADX INFO: renamed from: vr */
    private final JSONObject f11197vr;
    private final long xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.co$ri */
    public static class ri {

        /* JADX INFO: renamed from: ac */
        private JSONObject f11198ac;

        /* JADX INFO: renamed from: aw */
        private int f11199aw;
        private int bgr;

        /* JADX INFO: renamed from: bu */
        private String f11200bu;

        /* JADX INFO: renamed from: co */
        private int f11201co;

        /* JADX INFO: renamed from: di */
        private float f11202di;

        /* JADX INFO: renamed from: fi */
        private long f11203fi;

        /* JADX INFO: renamed from: ik */
        float f11204ik;
        private float jbs;

        /* JADX INFO: renamed from: ka */
        private long f11205ka;

        /* JADX INFO: renamed from: lr */
        int f11206lr;

        /* JADX INFO: renamed from: mj */
        private float f11207mj;

        /* JADX INFO: renamed from: nr */
        private int f11208nr;

        /* JADX INFO: renamed from: qt */
        private int[] f11209qt;

        /* JADX INFO: renamed from: ri */
        float f11210ri;

        /* JADX INFO: renamed from: sf */
        private int[] f11211sf;
        private int slm;
        private JSONObject tan;

        /* JADX INFO: renamed from: vr */
        private SparseArray<AbstractViewOnClickListenerC3218ik.ri> f11212vr;
        private float xha;

        /* JADX INFO: renamed from: di */
        public ri m14046di(float f) {
            this.jbs = f;
            return this;
        }

        /* JADX INFO: renamed from: di */
        public ri m14047di(int i) {
            this.bgr = i;
            return this;
        }

        /* JADX INFO: renamed from: fi */
        public ri m14048fi(float f) {
            this.f11207mj = f;
            return this;
        }

        /* JADX INFO: renamed from: fi */
        public ri m14049fi(int i) {
            this.f11199aw = i;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public ri m14050ik(float f) {
            this.f11202di = f;
            return this;
        }

        /* JADX INFO: renamed from: ik */
        public ri m14051ik(int i) {
            this.f11206lr = i;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public ri m14052ka(float f) {
            this.xha = f;
            return this;
        }

        /* JADX INFO: renamed from: ka */
        public ri m14053ka(int i) {
            this.f11201co = i;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m14054lr(float f) {
            this.f11204ik = f;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m14055lr(int i) {
            this.slm = i;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m14056lr(long j) {
            this.f11203fi = j;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m14057lr(JSONObject jSONObject) {
            this.f11198ac = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: lr */
        public ri m14058lr(int[] iArr) {
            this.f11211sf = iArr;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14059ri(float f) {
            this.f11210ri = f;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14060ri(int i) {
            this.f11208nr = i;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14061ri(long j) {
            this.f11205ka = j;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14062ri(SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray) {
            this.f11212vr = sparseArray;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14063ri(String str) {
            this.f11200bu = str;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14064ri(JSONObject jSONObject) {
            this.tan = jSONObject;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m14065ri(int[] iArr) {
            this.f11209qt = iArr;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C3277co m14066ri() {
            return new C3277co(this);
        }
    }

    private C3277co(ri riVar) {
        this.f11195ri = riVar.f11209qt;
        this.f11192lr = riVar.f11211sf;
        this.f11190ik = riVar.jbs;
        this.f11191ka = riVar.f11207mj;
        this.f11189fi = riVar.xha;
        this.f11188di = riVar.f11202di;
        this.xha = riVar.f11203fi;
        this.f11193mj = riVar.f11205ka;
        this.jbs = riVar.f11201co;
        this.f11194qt = riVar.f11199aw;
        this.f11196sf = riVar.bgr;
        this.f11187co = riVar.slm;
        this.f11185aw = riVar.f11212vr;
        this.slm = riVar.f11200bu;
        this.bgr = riVar.f11208nr;
        this.f11197vr = riVar.tan;
        this.f11186bu = riVar.f11198ac;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m14031ri(SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    AbstractViewOnClickListenerC3218ik.ri riVarValueAt = sparseArray.valueAt(i2);
                    if (riVarValueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(riVarValueAt.f10687ik)).putOpt("mr", Double.valueOf(riVarValueAt.f10689lr)).putOpt(TypedValues.CycleType.S_WAVE_PHASE, Integer.valueOf(riVarValueAt.f10690ri)).putOpt("ts", Long.valueOf(riVarValueAt.f10688ka));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m14032ri() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.f11186bu;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.putOpt(next, this.f11186bu.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.f11195ri;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.f11195ri[1]));
            }
            int[] iArr2 = this.f11192lr;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f11192lr[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f11190ik)).putOpt("down_y", Float.toString(this.f11191ka)).putOpt("up_x", Float.toString(this.f11189fi)).putOpt("up_y", Float.toString(this.f11188di)).putOpt("down_time", Long.valueOf(this.xha)).putOpt("up_time", Long.valueOf(this.f11193mj)).putOpt("toolType", Integer.valueOf(this.jbs)).putOpt("deviceId", Integer.valueOf(this.f11194qt)).putOpt("source", Integer.valueOf(this.f11196sf)).putOpt("ft", m14031ri(this.f11185aw, this.f11187co)).putOpt("click_area_type", this.slm);
            int i = this.bgr;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.f11197vr;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
