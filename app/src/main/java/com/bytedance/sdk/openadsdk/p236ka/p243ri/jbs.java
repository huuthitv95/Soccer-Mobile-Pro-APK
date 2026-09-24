package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p132di.C2537ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements InterfaceC3522lr {

    /* JADX INFO: renamed from: lr */
    private final boolean f12447lr;

    /* JADX INFO: renamed from: ri */
    private final C2537ka f12448ri;

    public jbs(boolean z, C2537ka c2537ka) {
        this.f12448ri = c2537ka;
        this.f12447lr = z;
    }

    @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
    /* JADX INFO: renamed from: ri */
    public InterfaceC3530ik mo11574ri() throws Exception {
        int i;
        if (this.f12448ri == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f12447lr);
        jSONObject.put("url", this.f12448ri.m9200lr());
        int iM9199ka = this.f12448ri.m9199ka();
        if (iM9199ka <= 0) {
            iM9199ka = 0;
        }
        jSONObject.put("retry_times", iM9199ka);
        jSONObject.put("ad_id", this.f12448ri.m9195di());
        jSONObject.put("track_type", this.f12448ri.m9196fi());
        if (!this.f12447lr) {
            i = 4;
        } else if (this.f12448ri.m9204qt()) {
            i = 3;
        } else {
            i = this.f12448ri.m9199ka() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String strXha = this.f12448ri.xha();
        if (!TextUtils.isEmpty(strXha)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strXha.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strJbs = this.f12448ri.jbs();
        if (!TextUtils.isEmpty(strJbs)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strJbs.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return C3531ka.m15967lr().m15985ri("track_link_result").m15980lr(jSONObject.toString());
    }
}
