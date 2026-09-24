package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbanner.common.data.C13278a;
import com.mbridge.msdk.mbbanner.common.data.C13279b;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13283b;
import com.mbridge.msdk.mbbanner.common.listener.InterfaceC13285d;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbbanner.common.util.C13294a;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a */
/* JADX INFO: compiled from: BannerLoadManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13287a {

    /* JADX INFO: renamed from: g */
    private static final String f36633g = "a";

    /* JADX INFO: renamed from: h */
    private static volatile C13287a f36634h;

    /* JADX INFO: renamed from: a */
    private Context f36635a = C13008c.m36588n().m36542d();

    /* JADX INFO: renamed from: b */
    private C13294a f36636b = new C13294a();

    /* JADX INFO: renamed from: c */
    private Map<String, C13279b> f36637c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f36638d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    private Map<String, Handler> f36639e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    private Map<String, Integer> f36640f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a */
    /* JADX INFO: compiled from: BannerLoadManager.java */
    class a implements InterfaceC13285d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13278a f36641a;

        a(C13278a c13278a) {
            this.f36641a = c13278a;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.InterfaceC13285d
        /* JADX INFO: renamed from: a */
        public void mo38186a(String str) {
            synchronized (C13287a.m38190b()) {
                this.f36641a.m38154a("");
                C13287a.this.f36638d.put(str, Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.manager.a$b */
    /* JADX INFO: compiled from: BannerLoadManager.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f36643a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MBridgeIds f36644b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC13283b f36645c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f36646d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C13278a f36647e;

        b(String str, MBridgeIds mBridgeIds, InterfaceC13283b interfaceC13283b, String str2, C13278a c13278a) {
            this.f36643a = str;
            this.f36644b = mBridgeIds;
            this.f36645c = interfaceC13283b;
            this.f36646d = str2;
            this.f36647e = c13278a;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (C13287a.this.f36638d == null || !C13287a.this.f36638d.containsKey(this.f36643a) || (bool = (Boolean) C13287a.this.f36638d.get(this.f36643a)) == null || !bool.booleanValue()) {
                if (C13287a.this.f36640f.containsKey(this.f36643a)) {
                    Integer num = (Integer) C13287a.this.f36640f.get(this.f36643a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        C13219q0.m37816b(C13287a.f36633g, "doUnitRotation: autoRotationStatus=" + iIntValue + " && unitId=" + this.f36643a);
                        if (C13287a.this.f36636b != null) {
                            C13082b c13082b = new C13082b(880026);
                            c13082b.m37018a(this.f36644b);
                            C13287a.this.f36636b.m38298a(this.f36645c, c13082b);
                            return;
                        }
                        return;
                    }
                }
                C13287a.this.m38196b(this.f36646d, this.f36643a, this.f36647e, this.f36645c);
            }
        }
    }

    private C13287a() {
    }

    /* JADX INFO: renamed from: b */
    public static C13287a m38190b() {
        if (f36634h == null) {
            synchronized (C13287a.class) {
                if (f36634h == null) {
                    f36634h = new C13287a();
                }
            }
        }
        return f36634h;
    }

    /* JADX INFO: renamed from: c */
    public void m38197c() {
        Map<String, C13279b> map = this.f36637c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f36638d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f36639e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f36639e.clear();
        }
        Map<String, Integer> map4 = this.f36640f;
        if (map4 != null) {
            map4.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private C13279b m38187a(String str) {
        if (this.f36637c.containsKey(str)) {
            return this.f36637c.get(str);
        }
        C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), str);
        if (c13640lM39720e == null) {
            c13640lM39720e = C13640l.m39753i(str);
        }
        C13279b c13279b = new C13279b(str, "", 0, c13640lM39720e.m39678y());
        this.f36637c.put(str, c13279b);
        return c13279b;
    }

    /* JADX INFO: renamed from: b */
    public void m38196b(String str, String str2, C13278a c13278a, InterfaceC13283b interfaceC13283b) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strM38156b = c13278a.m38156b();
        C13154c c13154cM38282a = C13291a.m38282a(str2, strM38156b);
        c13154cM38282a.m37444h(!TextUtils.isEmpty(c13278a.m38153a()) ? "1" : "0");
        c13154cM38282a.m37443g(c13278a.m38153a());
        c13154cM38282a.m37440f(c13278a.m38162f() ? "1" : "2");
        c13154cM38282a.m37427b(c13278a.m38162f() ? 1 : 2);
        c13154cM38282a.m37432c(c13278a.m38160d());
        C13291a.m38291a("2000123", c13154cM38282a, (C13157e) null);
        if (this.f36635a == null) {
            C13082b c13082b = new C13082b(880025);
            c13082b.m37018a(mBridgeIds);
            c13082b.m37023b(strM38156b);
            this.f36636b.m38298a(interfaceC13283b, c13082b);
            return;
        }
        if (interfaceC13283b == null) {
            C13082b c13082b2 = new C13082b(880001);
            c13082b2.m37018a(mBridgeIds);
            c13082b2.m37023b(strM38156b);
            this.f36636b.m38298a(interfaceC13283b, c13082b2);
            return;
        }
        Map<String, Boolean> map = this.f36638d;
        if (map != null && map.containsKey(str2) && (bool = this.f36638d.get(str2)) != null && bool.booleanValue()) {
            C13082b c13082b3 = new C13082b(880016, "Current unit is loading!");
            c13082b3.m37018a(mBridgeIds);
            c13082b3.m37023b(strM38156b);
            this.f36636b.m38298a(interfaceC13283b, c13082b3);
            return;
        }
        this.f36638d.put(str2, Boolean.TRUE);
        C13279b c13279bM38187a = m38187a(str2);
        c13279bM38187a.m38165a(strM38156b);
        new C13288b(this.f36635a, c13279bM38187a, interfaceC13283b, this.f36636b).m38221a(str, str2, c13278a, new a(c13278a));
        C13291a.m38291a("2000125", c13154cM38282a, (C13157e) null);
    }

    /* JADX INFO: renamed from: a */
    public void m38194a(String str, String str2, C13278a c13278a, InterfaceC13283b interfaceC13283b) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (c13278a != null && c13278a.m38160d() > 0) {
            if (TextUtils.isEmpty(c13278a.m38156b())) {
                c13278a.m38157b(C13291a.m38292b(""));
            }
            if (this.f36639e.containsKey(str2)) {
                handler = this.f36639e.get(str2);
            } else {
                handler = new Handler();
                this.f36639e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar = new b(str2, mBridgeIds, interfaceC13283b, str, c13278a);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar, c13278a.m38160d());
                return;
            }
            return;
        }
        C13219q0.m37816b(f36633g, "doUnitRotation: Illegal banner request parameters! && unitId=" + str2);
    }

    /* JADX INFO: renamed from: a */
    public void m38193a(int i, String str, String str2, C13278a c13278a, InterfaceC13283b interfaceC13283b) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f36640f.containsKey(str2) || (num = this.f36640f.get(str2)) == null) ? 0 : num.intValue();
        if (i == 1) {
            if (this.f36639e.containsKey(str2) && (handler = this.f36639e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f36640f.put(str2, Integer.valueOf(i));
            return;
        }
        if (i == 2) {
            if (iIntValue == 1) {
                if (this.f36639e.containsKey(str2) && (handler2 = this.f36639e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f36640f.put(str2, Integer.valueOf(i));
                return;
            }
            return;
        }
        if (i == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f36640f.put(str2, 1);
                m38194a(str, str2, c13278a, interfaceC13283b);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f36640f.put(str2, 0);
            return;
        }
        if (this.f36639e.containsKey(str2) && (handler3 = this.f36639e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f36640f.put(str2, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b */
    public void m38195b(String str) {
        if (this.f36639e.containsKey(str)) {
            Handler handler = this.f36639e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f36639e.remove(str);
        }
    }
}
