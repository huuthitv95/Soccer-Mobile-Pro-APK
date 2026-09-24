package com.bytedance.adsdk.ugeno.p108ri.p110ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.ri */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2340ri {

    /* JADX INFO: renamed from: ik */
    private String f6090ik;

    /* JADX INFO: renamed from: lr */
    protected AbstractViewOnTouchListenerC2318ik f6091lr;

    /* JADX INFO: renamed from: ri */
    protected JSONObject f6092ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.ri$ri */
    /* JADX INFO: loaded from: classes3.dex */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static AbstractC2340ri m8024ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
            if (abstractViewOnTouchListenerC2318ik == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.hashCode();
            switch (strOptString) {
                case "stretch":
                    return new C2336fi(abstractViewOnTouchListenerC2318ik, jSONObject);
                case "ripple":
                    return new C2339lr(abstractViewOnTouchListenerC2318ik, jSONObject);
                case "rub_in":
                    return new C2337ik(abstractViewOnTouchListenerC2318ik, jSONObject);
                case "shine":
                    return new C2338ka(abstractViewOnTouchListenerC2318ik, jSONObject);
                default:
                    return null;
            }
        }
    }

    public AbstractC2340ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        this.f6092ri = jSONObject;
        this.f6091lr = abstractViewOnTouchListenerC2318ik;
        m8023ri();
    }

    /* JADX INFO: renamed from: ik */
    public abstract List<PropertyValuesHolder> mo8014ik();

    /* JADX INFO: renamed from: ka */
    public String m8022ka() {
        return this.f6090ik;
    }

    /* JADX INFO: renamed from: lr */
    public abstract void mo8015lr();

    /* JADX INFO: renamed from: lr */
    public abstract void mo8016lr(Canvas canvas);

    /* JADX INFO: renamed from: ri */
    public void m8023ri() {
        this.f6090ik = this.f6092ri.optString("type");
        mo8015lr();
    }

    /* JADX INFO: renamed from: ri */
    public abstract void mo8017ri(int i, int i2);

    /* JADX INFO: renamed from: ri */
    public abstract void mo8018ri(Canvas canvas);
}
