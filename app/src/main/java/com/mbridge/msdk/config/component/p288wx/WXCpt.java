package com.mbridge.msdk.config.component.p288wx;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.p288wx.model.C12860a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class WXCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    final String f34495h = "400001";

    /* JADX INFO: renamed from: i */
    final String f34496i = "400002";

    /* JADX INFO: renamed from: j */
    final String f34497j = "400003";

    /* JADX INFO: renamed from: k */
    private C12860a f34498k;

    /* JADX INFO: renamed from: a */
    private void m35872a(Context context, String str, String str2, String str3, String str4) {
        String message;
        int i = 0;
        boolean z = C13211m0.m37727G() == 1;
        boolean z2 = C13211m0.m37724E(context) == 1;
        if (!z || !z2) {
            m35871a(0, "400002", "Wechat environment error.");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = str4;
            }
            Object objM37739d = C13211m0.m37739d(str);
            Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
            Object objNewInstance = cls.newInstance();
            cls.getField("userName").set(objNewInstance, str2);
            cls.getField("path").set(objNewInstance, str3);
            cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objM37739d, objNewInstance);
            message = "";
            i = 1;
        } catch (Throwable th) {
            message = th.getMessage();
        }
        m35871a(i, i != 0 ? "" : "400003", i == 0 ? message : "");
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        super.mo34834b(map);
        this.f33808f = "907001";
        Object obj = map.get(C12770c.m35209b("144"));
        if (!(obj instanceof Map)) {
            m35871a(0, "400001", "WXInfo is empty");
            return;
        }
        this.f34498k = new C12860a((Map) obj);
        if (m34837e() != null) {
            this.f34498k.m35874a(m34837e().getContext());
        } else {
            this.f34498k.m35874a(C13008c.m36588n().m36542d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        C12860a c12860a = this.f34498k;
        if (c12860a != null) {
            m35872a(c12860a.m35877b(), this.f34498k.m35883e(), this.f34498k.m35879c(), this.f34498k.m35881d(), this.f34498k.m35873a());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35871a(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), String.valueOf(i));
        if (i == 0) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str);
            map.put(C12770c.m35209b("reason"), str2);
        }
        m34829a(m34827a("907002", map));
    }
}
