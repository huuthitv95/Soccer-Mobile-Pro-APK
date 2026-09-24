package com.bytedance.sdk.openadsdk.core.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3282ik {

    /* JADX INFO: renamed from: di */
    public String f11290di;

    /* JADX INFO: renamed from: fi */
    public AdSlot f11291fi;

    /* JADX INFO: renamed from: ik */
    public int f11292ik = 1;

    /* JADX INFO: renamed from: ka */
    public ArrayList<Integer> f11293ka;

    /* JADX INFO: renamed from: lr */
    public int f11294lr;

    /* JADX INFO: renamed from: ri */
    public String f11295ri;
    public int xha;

    /* JADX INFO: renamed from: ri */
    public static void m14172ri(C3282ik c3282ik) {
        int iM14177lr;
        if (c3282ik == null || c3282ik.m14176ka() == null || (iM14177lr = c3282ik.m14177lr()) >= 0 || iM14177lr == -8) {
            return;
        }
        C3521ka.m15952ri("rd_client_custom_error", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.core.model.ik.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypedValues.TransitionType.S_FROM, C3282ik.this.m14174ik());
                jSONObject.put("err_code", C3282ik.this.m14177lr());
                jSONObject.put("err_msg", C3282ik.this.f11290di);
                jSONObject.put("ext_from", C3282ik.this.xha);
                jSONObject.put("server_res_str", C3282ik.this.m14180ri());
                if (C3282ik.this.m14173fi() != null && C3282ik.this.m14173fi().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) C3282ik.this.m14173fi()).toString());
                }
                return C3531ka.m15967lr().m15985ri("rd_client_custom_error").m15984ri(C3282ik.this.m14176ka().getDurationSlotType()).m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: fi */
    public ArrayList<Integer> m14173fi() {
        return this.f11293ka;
    }

    /* JADX INFO: renamed from: ik */
    public int m14174ik() {
        return this.f11292ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m14175ik(int i) {
        this.xha = i;
    }

    /* JADX INFO: renamed from: ka */
    public AdSlot m14176ka() {
        return this.f11291fi;
    }

    /* JADX INFO: renamed from: lr */
    public int m14177lr() {
        return this.f11294lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14178lr(int i) {
        this.f11292ik = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14179lr(String str) {
        this.f11290di = str;
    }

    /* JADX INFO: renamed from: ri */
    public String m14180ri() {
        return this.f11295ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14181ri(int i) {
        this.f11294lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14182ri(AdSlot adSlot) {
        this.f11291fi = adSlot;
    }

    /* JADX INFO: renamed from: ri */
    public void m14183ri(String str) {
        this.f11295ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public void m14184ri(ArrayList<Integer> arrayList) {
        this.f11293ka = arrayList;
    }
}
