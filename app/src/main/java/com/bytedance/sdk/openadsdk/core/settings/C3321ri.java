package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.ihz;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3321ri extends AbstractC3320qt {
    public C3321ri() {
        super(new AbstractC3320qt.ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.ri.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: lr */
            public void mo14811lr() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt.ri
            /* JADX INFO: renamed from: ri */
            public void mo14812ri() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.AbstractC3320qt
    /* JADX INFO: renamed from: ri */
    protected String mo14792ri() {
        try {
            if (C3299nr.m14642ri() == null || ihz.m10229ri(C3299nr.m14642ri())) {
                return "tt_set_apm.prop";
            }
            return "tt_set_apm_" + ihz.m10225ik(C3299nr.m14642ri()) + ".prop";
        } catch (Throwable unused) {
            return "tt_set_apm";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC3312fi
    /* JADX INFO: renamed from: ri */
    public void mo14756ri(JSONObject jSONObject) {
        InterfaceC3312fi.ri riVarLr = m14803lr();
        if (jSONObject.has("apm_url")) {
            riVarLr.mo14764ri("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    riVarLr.mo14762ri("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        riVarLr.mo14766ri();
        m14800fi();
    }
}
