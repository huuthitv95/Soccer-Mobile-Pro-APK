package com.mbridge.msdk.config.component.inner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.inner.model.C12784a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class InnerCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    public final String f34058h = "InnerCpt";

    /* JADX INFO: renamed from: i */
    final String f34059i = "700001";

    /* JADX INFO: renamed from: j */
    C12784a f34060j;

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "901001";
        this.f34060j = new C12784a(map);
        if (m34837e() != null) {
            this.f34060j.m35321a(m34837e().getContext());
        } else {
            this.f34060j.m35321a(C13008c.m36588n().m36542d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        if (this.f34060j.m35332f().equals(C12770c.m35209b("336"))) {
            String strM35327c = this.f34060j.m35327c();
            if (TextUtils.isEmpty(strM35327c) || !strM35327c.equals(C12770c.m35209b("339"))) {
                return;
            }
            m35319g();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m35319g() {
        C12784a c12784a = this.f34060j;
        if (c12784a != null) {
            m35317a(c12784a.m35320a(), this.f34060j.m35329d(), this.f34060j.m35331e(), this.f34060j.m35324b());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35317a(Context context, String str, String str2, Map<String, Object> map) {
        String message;
        Intent intent;
        boolean z = false;
        try {
            message = "";
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                if (!TextUtils.isEmpty(scheme) && scheme.equals(SDKConstants.PARAM_INTENT)) {
                    intent = Intent.parseUri(str, 1);
                } else if (!TextUtils.isEmpty(scheme) && scheme.equals("android-app")) {
                    intent = Intent.parseUri(str, 2);
                } else {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                }
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.f34060j.m35324b().entrySet()) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (!TextUtils.isEmpty(str2)) {
                        intent.setPackage(str2);
                    }
                    if (context instanceof Activity) {
                        context.startActivity(intent);
                    } else {
                        intent.setFlags(268435456);
                        context.startActivity(intent);
                    }
                    z = true;
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("InnerCpt", th.getMessage(), th);
            message = th.getMessage();
        }
        m35318a(z, message);
    }

    /* JADX INFO: renamed from: a */
    private void m35318a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), String.valueOf(z ? 1 : 0));
        if (!z) {
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str);
            map.put(C12770c.m35209b("reason"), "700001");
        }
        m34829a(m34827a("901005", map));
    }
}
