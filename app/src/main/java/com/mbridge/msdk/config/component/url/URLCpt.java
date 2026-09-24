package com.mbridge.msdk.config.component.url;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.url.model.C12849a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class URLCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    final String f34448h = "600001";

    /* JADX INFO: renamed from: i */
    C12849a f34449i;

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "909001";
        this.f34449i = new C12849a(map);
        if (m34837e() != null) {
            this.f34449i.m35803a(m34837e().getContext());
        } else {
            this.f34449i.m35803a(C13008c.m36588n().m36542d());
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        m35801g();
    }

    /* JADX INFO: renamed from: g */
    public void m35801g() {
        C12849a c12849a = this.f34449i;
        if (c12849a != null) {
            m35799a(c12849a.m35802a(), this.f34449i.m35809c(), this.f34449i.m35810d(), this.f34449i.m35806b());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35799a(Context context, String str, String str2, Map<Object, Object> map) {
        String message;
        PackageInfo packageInfo;
        Intent launchIntentForPackage;
        ResolveInfo next;
        boolean z = false;
        try {
            Intent intent = new Intent();
            if (!TextUtils.isEmpty(str) && (packageInfo = context.getPackageManager().getPackageInfo(str, 1)) != null && str.equals(packageInfo.packageName) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (!listQueryIntentActivities.isEmpty() && (next = listQueryIntentActivities.iterator().next()) != null) {
                    ActivityInfo activityInfo = next.activityInfo;
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    intent.addFlags(268435456);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str2));
                intent.addFlags(268435456);
            }
            if (map != null) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    if (entry.getKey() instanceof String) {
                        intent.putExtra(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                }
            }
            context.startActivity(intent);
            message = "";
            z = true;
        } catch (Exception e) {
            C13219q0.m37816b("URLCpt", e.getMessage());
            message = e.getMessage();
        }
        m35800a(z, message);
    }

    /* JADX INFO: renamed from: a */
    private void m35800a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), String.valueOf(z ? 1 : 0));
        if (!z) {
            map.put(C12770c.m35209b("reason"), str);
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "600001");
        }
        m34829a(m34827a("909002", map));
    }
}
