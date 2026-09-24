package com.mbridge.msdk.config.component.info.provider;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.sdk.controller.InterfaceC12497f;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.info.provider.listener.InterfaceC12778a;
import com.mbridge.msdk.config.component.info.provider.subprovider.C12779a;
import com.mbridge.msdk.config.component.info.provider.subprovider.C12780b;
import com.mbridge.msdk.config.component.info.provider.subprovider.C12781c;
import com.mbridge.msdk.config.component.info.provider.subprovider.C12782d;
import com.mbridge.msdk.config.component.info.provider.subprovider.C12783e;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBConfiguration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.info.provider.a */
/* JADX INFO: compiled from: DeviceProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12777a {

    /* JADX INFO: renamed from: g */
    private static final Map<String, Object> f34028g = new HashMap();

    /* JADX INFO: renamed from: h */
    private static final Map<String, Object> f34029h = new HashMap();

    /* JADX INFO: renamed from: a */
    private int f34030a;

    /* JADX INFO: renamed from: b */
    private int f34031b;

    /* JADX INFO: renamed from: c */
    private int f34032c;

    /* JADX INFO: renamed from: d */
    private C12781c f34033d;

    /* JADX INFO: renamed from: e */
    private C12782d f34034e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC12778a f34035f = new InterfaceC12778a() { // from class: com.mbridge.msdk.config.component.info.provider.a$$ExternalSyntheticLambda0
        @Override // com.mbridge.msdk.config.component.info.provider.listener.InterfaceC12778a
        /* JADX INFO: renamed from: a */
        public final void mo35252a(Map map) {
            this.f$0.m35247b(map);
        }
    };

    public C12777a(int i, int i2, int i3) {
        this.f34030a = i;
        this.f34031b = i2;
        this.f34032c = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35247b(Map map) {
        if (map != null) {
            m35245a((Map<String, Object>) map);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m35248a(String str) {
        Map<String, Object> map = f34028g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f34029h;
            if (!map2.isEmpty()) {
                map.putAll(map2);
            }
        }
        if (map.containsKey(str)) {
            return String.valueOf(map.get(str));
        }
        Map<String, Object> map3 = f34029h;
        if (map3.containsKey(str)) {
            return String.valueOf(map3.get(str));
        }
        Map<String, Object> mapM35250d = m35250d();
        return mapM35250d.containsKey(str) ? String.valueOf(mapM35250d.get(str)) : "";
    }

    /* JADX INFO: renamed from: c */
    public Map<String, Object> m35249c() {
        String str = "";
        Context contextM36542d = C13008c.m36588n().m36542d();
        Map<String, Object> map = f34028g;
        if (!map.isEmpty()) {
            Map<String, Object> map2 = f34029h;
            if (map2.isEmpty()) {
                m35245a(C12779a.m35254b().m35259a(contextM36542d));
                return map;
            }
            map.putAll(map2);
            return map;
        }
        try {
            map.put(C12770c.m35209b("524"), MBConfiguration.SDK_VERSION);
            map.put(C12770c.m35209b("506"), "1");
            map.put(C12770c.m35209b("567"), contextM36542d.getPackageName());
            map.put(C12770c.m35209b("568"), this.f34033d.m35278d(contextM36542d));
            map.put(C12770c.m35209b("569"), Integer.valueOf(this.f34033d.m35275c(contextM36542d)));
            map.put(C12770c.m35209b("570"), "1");
            map.put(C12770c.m35209b("571"), "1");
            map.put(C12770c.m35209b("572"), this.f34033d.m35272a(contextM36542d, contextM36542d.getPackageName()));
            map.put(C12770c.m35209b("573"), "2");
            map.put(C12770c.m35209b("574"), Integer.valueOf(this.f34033d.m35289j()));
            if (this.f34031b == 1) {
                map.put(C12770c.m35209b("508"), this.f34033d.m35283g());
                map.put(C12770c.m35209b("579"), Integer.valueOf(this.f34033d.m35285h()));
                map.put(C12770c.m35209b("503"), this.f34033d.m35282f());
                map.put(C12770c.m35209b("552"), this.f34033d.m35270a());
                map.put(C12770c.m35209b("551"), this.f34033d.m35277d());
                if (C12783e.m35312d().f34057c.get()) {
                    map.put(C12770c.m35209b("522"), C12783e.m35312d().m35316e());
                } else {
                    map.put(C12770c.m35209b("522"), C12783e.m35312d().m35314a());
                }
                map.put(C12770c.m35209b("502"), this.f34033d.m35287i());
                map.put(C12770c.m35209b("532"), this.f34033d.m35286h(contextM36542d) + "x" + this.f34033d.m35281f(contextM36542d));
                map.put(C12770c.m35209b("631"), "");
                Map<String, Object> mapM35280e = this.f34033d.m35280e();
                if (mapM35280e != null && !mapM35280e.isEmpty()) {
                    map.put(C12770c.m35209b("505"), mapM35280e.get("totalMem"));
                    map.put(C12770c.m35209b("541"), mapM35280e.get(C11540L6.f25022w));
                }
                map.put(C12770c.m35209b("519"), Integer.valueOf(this.f34033d.m35299o()));
                map.put(C12770c.m35209b("518"), Integer.valueOf(this.f34033d.m35298n(contextM36542d)));
                map.put(C12770c.m35209b("520"), Integer.valueOf(this.f34033d.m35291k()));
                map.put(C12770c.m35209b("566"), Integer.valueOf(this.f34033d.m35269a(C13008c.m36588n().m36549h())));
                map.put(C12770c.m35209b("515"), Long.valueOf(this.f34033d.m35274b()));
                map.put(C12770c.m35209b("512"), Integer.valueOf(this.f34033d.m35293l()));
                Map<String, String> mapM35288i = this.f34033d.m35288i(contextM36542d);
                if (mapM35288i != null && !mapM35288i.isEmpty()) {
                    String str2 = mapM35288i.get("mnc");
                    String str3 = mapM35288i.get("mcc");
                    String strM35209b = C12770c.m35209b("564");
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    map.put(strM35209b, str2);
                    String strM35209b2 = C12770c.m35209b("565");
                    if (!TextUtils.isEmpty(str3)) {
                        str = str3;
                    }
                    map.put(strM35209b2, str);
                }
                map.put(C12770c.m35209b("563"), this.f34033d.m35276c());
                map.put(C12770c.m35209b("562"), Integer.valueOf(this.f34033d.m35295m(contextM36542d)));
                map.put(C12770c.m35209b("561"), this.f34033d.m35294l(contextM36542d));
                map.put(C12770c.m35209b("560"), Integer.valueOf(this.f34033d.m35273b(contextM36542d)));
            }
            if (this.f34032c == 1) {
                map.put(C12770c.m35209b("516"), Float.valueOf(this.f34034e.m35304c(contextM36542d)));
                map.put(C12770c.m35209b("510"), this.f34034e.m35302b());
                Map<String, Object> mapM35300a = this.f34034e.m35300a();
                if (mapM35300a != null && !mapM35300a.isEmpty()) {
                    map.put(C12770c.m35209b("555"), mapM35300a.get("totalSpace"));
                    map.put(C12770c.m35209b("542"), mapM35300a.get("freeExternalSize"));
                }
            }
            if (this.f34030a == 1) {
                Map<String, Object> map3 = f34029h;
                if (map3.isEmpty()) {
                    m35245a(C12779a.m35254b().m35259a(contextM36542d));
                }
                if (!map3.isEmpty()) {
                    map.putAll(map3);
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("DeviceInfoProvider", th.getMessage(), th);
        }
        return f34028g;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, Object> m35250d() {
        HashMap map = new HashMap();
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (this.f34031b == 1) {
                map.put(C12770c.m35209b("513"), this.f34033d.m35279e(contextM36542d));
                map.put(C12770c.m35209b("509"), this.f34033d.m35271a(contextM36542d));
                map.put(C12770c.m35209b("531"), Integer.valueOf(this.f34033d.m35290j(contextM36542d)));
                map.put(C12770c.m35209b("533"), this.f34033d.m35292k(contextM36542d));
                map.put(C12770c.m35209b("557"), Integer.valueOf(this.f34033d.m35297n()));
                HashMap<String, Object> mapM35296m = this.f34033d.m35296m();
                map.put(C12770c.m35209b("553"), mapM35296m.get("available"));
                map.put(C12770c.m35209b("580"), mapM35296m.get("versionName"));
                map.put(C12770c.m35209b("581"), mapM35296m.get("versionCode"));
                map.put(C12770c.m35209b("538"), Integer.valueOf(C13211m0.m37770s(contextM36542d)));
                map.put(C12770c.m35209b("517"), C12780b.m35263e().f34048d);
                map.put(C12770c.m35209b("559"), Integer.valueOf(C12780b.m35263e().f34049e));
                map.put(C12770c.m35209b("582"), Integer.valueOf(C12780b.m35263e().f34047c));
            }
            if (this.f34032c == 1) {
                map.put(C12770c.m35209b("534"), Integer.valueOf(this.f34034e.m35305d(contextM36542d)));
                map.put(C12770c.m35209b("535"), Integer.valueOf(this.f34034e.m35305d(contextM36542d)));
                Map<String, Object> mapM35301a = this.f34034e.m35301a(contextM36542d);
                map.put(C12770c.m35209b("536"), mapM35301a.get("charging"));
                map.put(C12770c.m35209b("535"), mapM35301a.get(C11744X3.j.f26431Y));
                map.put(C12770c.m35209b("544"), this.f34034e.m35303b(contextM36542d));
                return map;
            }
        } catch (Throwable th) {
            C13219q0.m37817b("DeviceInfoProvider", th.getMessage(), th);
        }
        return map;
    }

    /* JADX INFO: renamed from: e */
    public void m35251e() {
        if (this.f34030a == 1) {
            m35244a();
        }
        if (this.f34031b == 1) {
            m35246b();
        }
        this.f34033d = new C12781c();
        this.f34034e = new C12782d();
        C12780b.m35263e().m35265b();
    }

    /* JADX INFO: renamed from: b */
    private void m35246b() {
        if (!C12783e.m35312d().f34057c.get()) {
            C12783e.m35312d().m35315a(this.f34035f);
            return;
        }
        Map<String, Object> map = f34028g;
        if (map.containsKey(C12770c.m35209b("522"))) {
            return;
        }
        map.put(C12770c.m35209b("522"), C12783e.m35312d().m35316e());
    }

    /* JADX INFO: renamed from: a */
    private void m35244a() {
        if (C12779a.m35254b().f34043g.get()) {
            if (f34029h.isEmpty()) {
                m35245a(C12779a.m35254b().m35258a());
                return;
            }
            return;
        }
        C12779a.m35254b().m35260a(this.f34035f);
    }

    /* JADX INFO: renamed from: a */
    private void m35245a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(InterfaceC12497f.b.f32089c)) {
                f34029h.put(C12770c.m35209b("546"), map.get(InterfaceC12497f.b.f32089c));
            }
            if (map.containsKey("adIdB64")) {
                f34029h.put(C12770c.m35209b("547"), map.get("adIdB64"));
            }
            if (map.containsKey("adIdLimit")) {
                f34029h.put(C12770c.m35209b("548"), map.get("adIdLimit"));
            }
            if (map.containsKey("amazonIdInfo")) {
                Map<String, Object> map2 = f34029h;
                map2.put(C12770c.m35209b("549"), map.get("amazonIdInfoB64"));
                map2.put(C12770c.m35209b("550"), map.get("amazonIdInfo"));
            }
        }
    }
}
