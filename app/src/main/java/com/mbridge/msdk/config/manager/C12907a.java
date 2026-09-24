package com.mbridge.msdk.config.manager;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.common.metrics.C12756b;
import com.mbridge.msdk.config.component.common.util.C12769b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.pipeline.C12834a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.AbstractC12896c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.InterfaceC12895b;
import com.mbridge.msdk.config.dynamic.utils.C12903e;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.system.AbstractC13706a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.config.manager.a */
/* JADX INFO: compiled from: ComponentManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12907a {

    /* JADX INFO: renamed from: f */
    private static volatile C12907a f34882f = null;

    /* JADX INFO: renamed from: g */
    private static final Object f34883g = new Object();

    /* JADX INFO: renamed from: h */
    public static int f34884h = 5000;

    /* JADX INFO: renamed from: i */
    public static int f34885i = 5000;

    /* JADX INFO: renamed from: b */
    private volatile C12834a f34887b;

    /* JADX INFO: renamed from: c */
    private Map<String, Object> f34888c = null;

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f34889d = new AtomicInteger(-1);

    /* JADX INFO: renamed from: e */
    private long f34890e = 0;

    /* JADX INFO: renamed from: a */
    private C12894a f34886a = new C12894a();

    /* JADX INFO: renamed from: com.mbridge.msdk.config.manager.a$a */
    /* JADX INFO: compiled from: ComponentManager.java */
    class a extends AbstractC12896c {
        a() {
        }

        @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.InterfaceC12895b
        /* JADX INFO: renamed from: a */
        public void mo36061a(String str, Object obj) {
            if (TextUtils.isEmpty(str) || !str.equals("g0.npc")) {
                return;
            }
            try {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                    C12907a.this.f34887b.m35694a(new C12903e().m36162a(strValueOf));
                    C12907a.this.m36195f();
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(System.currentTimeMillis() - C12907a.this.f34890e));
                map.put("result", Integer.valueOf(!TextUtils.isEmpty(strValueOf) ? 1 : 2));
                C12756b.m35099a("m_pipe_init_end", map);
            } catch (Throwable th) {
                C13219q0.m37816b("ComponentManager", th.getMessage());
            }
        }
    }

    private C12907a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m36195f() {
        if (AbstractC13706a.componentSDKInitFinish.get() || this.f34888c == null) {
            return;
        }
        m36201b(C12770c.m35199a(), "c0", this.f34888c);
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m36196g() {
        final Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            return;
        }
        final String strM36533b = C13008c.m36588n().m36533b();
        C13167a.m37543b().execute(new Runnable() { // from class: com.mbridge.msdk.config.manager.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m36189a(strM36533b, contextM36542d);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m36202d() {
        if (this.f34889d.get() == -1) {
            m36196g();
        }
        return this.f34889d.get() == 1 && AbstractC13706a.componentSDKInitFinish.get();
    }

    /* JADX INFO: renamed from: e */
    public void m36203e() {
        this.f34886a.m36048a("g0.npc", (InterfaceC12895b<String>) new a());
    }

    /* JADX INFO: renamed from: c */
    public static C12907a m36194c() {
        if (f34882f == null) {
            synchronized (f34883g) {
                if (f34882f == null) {
                    f34882f = new C12907a();
                }
            }
        }
        return f34882f;
    }

    /* JADX INFO: renamed from: a */
    public void m36199a(Map<String, Object> map) {
        if (map == null || m36202d()) {
            return;
        }
        this.f34888c = map;
    }

    /* JADX INFO: renamed from: b */
    public C12894a m36200b() {
        return this.f34886a;
    }

    /* JADX INFO: renamed from: b */
    public void m36201b(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put(C12770c.m35209b("577"), str2);
            HashMap map3 = new HashMap();
            map3.put("id", str);
            if (map.containsKey("sdk_context")) {
                map2.put("sdk_context", map.get("sdk_context"));
                map.remove("sdk_context");
            }
            map3.put("api_params", map);
            HashMap map4 = new HashMap();
            map4.put("context_id", str);
            map3.put("metrics", map4);
            map2.put(C12770c.m35209b("51"), map3);
            C12710b c12710b = new C12710b();
            c12710b.m34840a("_");
            c12710b.m34843b("922001");
            c12710b.m34841a(map2);
            if (this.f34887b != null) {
                this.f34887b.mo34847a(c12710b);
            }
        } catch (Exception e) {
            C13219q0.m37817b("ComponentManager", "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36197a() {
        this.f34888c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m36189a(String str, Context context) {
        Map<String, Object> mapM35202a;
        if (TextUtils.isEmpty(str)) {
            str = C12769b.m35186a(context).m35192a("app_id", "");
        }
        if (TextUtils.isEmpty(str) || (mapM35202a = C12770c.m35202a(str)) == null || mapM35202a.isEmpty()) {
            return;
        }
        if (C12770c.m35197a(mapM35202a.get("p_p_c_id")) == -1) {
            this.f34889d.set(0);
            return;
        }
        String strValueOf = String.valueOf(mapM35202a.get("p_p_c"));
        if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
            m36190a(strValueOf, str, mapM35202a);
        } else {
            this.f34889d.set(0);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36190a(String str, String str2, Map<String, Object> map) {
        m36192b(map);
        this.f34889d.set(1);
        if (this.f34887b == null) {
            this.f34890e = System.currentTimeMillis();
            C12756b.m35099a("m_pipe_init_start", new HashMap());
            m36203e();
            this.f34887b = new C12834a(str, this.f34886a);
            Map<String, Object> map2 = new HashMap<>();
            map2.put("app_id", str2);
            HashMap map3 = new HashMap();
            map3.put("app_setting", map);
            map3.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, C13211m0.m37754k());
            map2.put("info", map3);
            m36201b(C12770c.m35199a(), "c30", map2);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36192b(Map<String, Object> map) {
        try {
            if (map.containsKey("t_o_bi")) {
                String strValueOf = String.valueOf(map.get("t_o_bi"));
                if (!TextUtils.isEmpty(strValueOf) && TextUtils.isDigitsOnly(strValueOf)) {
                    f34884h = Integer.parseInt(strValueOf) * 1000;
                }
            }
            if (map.containsKey("t_o_ar")) {
                String strValueOf2 = String.valueOf(map.get("t_o_ar"));
                if (TextUtils.isEmpty(strValueOf2) || !TextUtils.isDigitsOnly(strValueOf2)) {
                    return;
                }
                f34885i = Integer.parseInt(strValueOf2) * 1000;
            }
        } catch (Throwable th) {
            C13219q0.m37817b("ComponentManager", "refreshTimeout error: " + th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36198a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m36196g();
        C12770c.m35211b(str, str2);
    }
}
