package com.bytedance.sdk.openadsdk.slm.p261ri;

import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3529fi {
    /* JADX INFO: renamed from: ri */
    public static void m15965ri(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        C3521ka.m15952ri(str, false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.slm.ri.fi.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                String str5 = str4;
                if (str5 != null) {
                    jSONObject.put("error_url", str5);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return C3531ka.m15967lr().m15985ri(str).m15980lr(jSONObject.toString());
            }
        });
    }
}
