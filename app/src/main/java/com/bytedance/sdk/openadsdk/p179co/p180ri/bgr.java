package com.bytedance.sdk.openadsdk.p179co.p180ri;

import com.bytedance.sdk.component.p168ri.AbstractC2697ik;
import com.bytedance.sdk.component.p168ri.C2696fi;
import com.bytedance.sdk.component.p168ri.C2705vr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p174aw.InterfaceC2883lr;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bgr extends AbstractC2697ik<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: ik */
    private long f8706ik;

    /* JADX INFO: renamed from: ka */
    private HashSet<Integer> f8707ka = new HashSet<>();

    /* JADX INFO: renamed from: lr */
    private wjv f8708lr;

    /* JADX INFO: renamed from: ri */
    private WeakReference<dzy> f8709ri;

    public bgr(dzy dzyVar, wjv wjvVar) {
        this.f8709ri = new WeakReference<>(dzyVar);
        this.f8708lr = wjvVar;
    }

    /* JADX INFO: renamed from: ri */
    public static void m11203ri(C2705vr c2705vr, final dzy dzyVar, final wjv wjvVar) {
        c2705vr.m10185ri("requestDelayCallback", new AbstractC2697ik.lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.bgr.1
            @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik.lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2697ik mo10158ri() {
                return new bgr(dzyVar, wjvVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.p168ri.AbstractC2697ik
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo10155ri(JSONObject jSONObject, C2696fi c2696fi) throws Exception {
        dzy dzyVar = this.f8709ri.get();
        if (dzyVar == null || jSONObject == null) {
            m10151ik();
            return;
        }
        dzyVar.m13450ri(new InterfaceC2883lr() { // from class: com.bytedance.sdk.openadsdk.co.ri.bgr.2
            @Override // com.bytedance.sdk.openadsdk.p174aw.InterfaceC2883lr
            /* JADX INFO: renamed from: ri */
            public void mo11094ri(int i) {
                bgr.this.f8707ka.add(Integer.valueOf(i));
                if (bgr.this.f8707ka.size() >= bgr.this.f8706ik) {
                    try {
                        bgr.this.m10154ri(new JSONObject());
                        bgr.this.f8707ka.clear();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        });
        int iOptInt = jSONObject.optInt("delay", -1);
        if (iOptInt < 0) {
            return;
        }
        this.f8706ik = iOptInt / 1000;
    }
}
