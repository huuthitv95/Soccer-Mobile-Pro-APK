package com.mbridge.msdk.video.module.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.setting.C13636h;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.request.b */
/* JADX INFO: compiled from: VideoViewRequest.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14077b extends C14076a {
    public C14077b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.request.C14076a, com.mbridge.msdk.foundation.same.net.wrapper.C13124c
    public void addExtraParams(String str, C13126e c13126e) {
        super.addExtraParams(str, c13126e);
        if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strM37713b = C13207k0.m37713b(jSONObject.toString());
                if (TextUtils.isEmpty(strM37713b)) {
                    return;
                }
                c13126e.m37245a("dvi", strM37713b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
