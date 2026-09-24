package com.bytedance.adsdk.ugeno.core;

import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2226aw {

    /* JADX INFO: renamed from: fi */
    private C2226aw f5475fi;

    /* JADX INFO: renamed from: ik */
    private JSONObject f5476ik;

    /* JADX INFO: renamed from: ka */
    private C2226aw f5477ka;

    /* JADX INFO: renamed from: lr */
    private int f5478lr;

    /* JADX INFO: renamed from: ri */
    private AbstractViewOnTouchListenerC2318ik f5479ri;

    /* JADX INFO: renamed from: ik */
    public JSONObject m7320ik() {
        return this.f5476ik;
    }

    /* JADX INFO: renamed from: ka */
    public C2226aw m7321ka() {
        return this.f5477ka;
    }

    /* JADX INFO: renamed from: lr */
    public int m7322lr() {
        return this.f5478lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m7323lr(C2226aw c2226aw) {
        this.f5475fi = c2226aw;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik m7324ri() {
        return this.f5479ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m7325ri(int i) {
        this.f5478lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m7326ri(C2226aw c2226aw) {
        this.f5477ka = c2226aw;
    }

    /* JADX INFO: renamed from: ri */
    public void m7327ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5479ri = abstractViewOnTouchListenerC2318ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m7328ri(JSONObject jSONObject) {
        this.f5476ik = jSONObject;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.f5479ri + ", mEventType=" + this.f5478lr + ", mEvent=" + this.f5476ik + AbstractJsonLexerKt.END_OBJ;
    }
}
