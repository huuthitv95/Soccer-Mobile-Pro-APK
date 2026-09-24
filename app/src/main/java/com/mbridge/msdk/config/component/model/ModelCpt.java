package com.mbridge.msdk.config.component.model;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.database.C12771a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ModelCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private String f34304h;

    /* JADX INFO: renamed from: i */
    private Map<String, Object> f34305i;

    /* JADX INFO: renamed from: j */
    private Map<String, Object> f34306j;

    /* JADX INFO: renamed from: k */
    private String f34307k;

    /* JADX INFO: renamed from: l */
    private int f34308l = 0;

    /* JADX INFO: renamed from: m */
    private String f34309m;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.model.ModelCpt$a */
    class RunnableC12828a implements Runnable {
        RunnableC12828a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, Object> mapM35217d;
            String strValueOf = String.valueOf(ModelCpt.this.f34309m);
            if (strValueOf.startsWith("SELECT") || strValueOf.startsWith("select")) {
                mapM35217d = C12771a.m35212a().m35217d(strValueOf);
            } else {
                mapM35217d = (strValueOf.startsWith("DELETE") || strValueOf.startsWith("delete")) ? C12771a.m35212a().m35214a(strValueOf) : C12771a.m35212a().m35216c(strValueOf);
            }
            Object obj = mapM35217d.get(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE));
            if ((obj instanceof Integer ? ((Integer) obj).intValue() : 0) == 1) {
                ModelCpt.this.m35602a(true, "", mapM35217d.get(C12770c.m35209b("data")));
            } else {
                ModelCpt.this.m35602a(false, String.valueOf(mapM35217d.get(C12770c.m35209b("reason"))), (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.model.ModelCpt$b */
    class RunnableC12829b implements Runnable {
        RunnableC12829b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : ModelCpt.this.f34306j.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String str = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        C12769b.m35186a(C13008c.m36588n().m36542d()).m35195b(str, String.valueOf(entry.getValue()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m35604g() {
        if (TextUtils.isEmpty(this.f34309m)) {
            return;
        }
        RunnableC12828a runnableC12828a = new RunnableC12828a();
        if (this.f34308l == 1) {
            C13167a.m37543b().execute(runnableC12828a);
        } else {
            runnableC12828a.run();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m35605h() {
        Map<String, Object> map = this.f34305i;
        if (map == null || this.f33806d == null || this.f34306j == null) {
            m35602a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = (String) map.get(C12770c.m35209b("120"));
        if (TextUtils.isEmpty(str)) {
            m35602a(false, "Scope name is empty", (Object) null);
            return;
        }
        Iterator<Map.Entry<String, Object>> it = this.f34306j.entrySet().iterator();
        String str2 = "";
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    m35602a(z, str2, (Object) null);
                    return;
                }
                Map.Entry<String, Object> next = it.next();
                if (next != null && !TextUtils.isEmpty(next.getKey()) && !C12770c.m35209b("120").equals(next.getKey())) {
                    try {
                        String key = next.getKey();
                        String str3 = str + "." + key;
                        C12894a c12894aM35198a = C12770c.m35198a(this.f33806d, str3);
                        if (c12894aM35198a != null) {
                            if (c12894aM35198a.m36046a(str3, key, next.getValue()).intValue() != 1) {
                                break;
                            } else {
                                z = true;
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e) {
                        str2 = "Failed to modify data in scope: " + e.getMessage();
                        C13219q0.m37816b("ModelCpt", str2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m35606i() {
        Map<String, Object> map;
        if (this.f34305i == null || this.f33806d == null || (map = this.f34306j) == null) {
            m35602a(false, "Config parameters is null", (Object) null);
            return;
        }
        String str = "";
        while (true) {
            boolean z = false;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                    try {
                        z = this.f33806d.m36045a(entry.getKey(), entry.getValue()).intValue() == 1;
                        if (!z) {
                            str = "Failed to modify data";
                        }
                    } catch (Exception e) {
                        str = "Failed to modify data without scope: " + e.getMessage();
                        C13219q0.m37816b("ModelCpt", str);
                    }
                }
            }
            m35602a(z, str, (Object) null);
            return;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m35607j() {
        RunnableC12829b runnableC12829b = new RunnableC12829b();
        if (this.f34308l == 1) {
            C13167a.m37543b().execute(runnableC12829b);
        } else {
            runnableC12829b.run();
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        try {
            if (C12770c.m35209b("313").equals(this.f34307k)) {
                m35604g();
                return;
            }
            if (C12770c.m35209b("314").equals(this.f34307k)) {
                m35607j();
            } else if (this.f34304h.equals("withScope")) {
                m35605h();
            } else {
                m35606i();
            }
        } catch (Exception e) {
            C13219q0.m37816b("ModelCpt", "Error during execution: " + e.getMessage());
            m35602a(false, "Execution failed: " + e.getMessage(), (Object) null);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "914001";
        this.f34305i = map;
        if (map.isEmpty()) {
            C13219q0.m37816b("ModelCpt", "Config parameters is null");
            return;
        }
        this.f34304h = map.containsKey(C12770c.m35209b("120")) ? "withScope" : "withoutScope";
        Object obj = map.get(C12770c.m35209b("121"));
        if (obj instanceof Map) {
            this.f34306j = (Map) obj;
        }
        Object obj2 = map.get(C12770c.m35209b("117"));
        if (obj2 != null) {
            this.f34307k = String.valueOf(obj2);
        }
        Object obj3 = map.get(C12770c.m35209b("background"));
        if (obj3 != null) {
            this.f34308l = Integer.parseInt(String.valueOf(obj3));
        }
        Object obj4 = map.get(C12770c.m35209b("118"));
        if (obj4 != null) {
            this.f34309m = String.valueOf(obj4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m35602a(boolean z, String str, Object obj) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b("500"), Integer.valueOf(z ? 1 : 2));
        map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "");
        map.put(C12770c.m35209b("reason"), str);
        if (obj != null) {
            map.put(C12770c.m35209b("data"), obj);
        }
        m34829a(m34827a("914002", map));
    }
}
