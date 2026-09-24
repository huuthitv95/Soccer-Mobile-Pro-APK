package com.mbridge.msdk.config.component.pipeline;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.base.C12710b;
import com.mbridge.msdk.config.component.base.InterfaceC12711c;
import com.mbridge.msdk.config.component.base.InterfaceC12712d;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.pipeline.util.C12835a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.C12903e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.pipeline.a */
/* JADX INFO: compiled from: PipelineManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12834a implements InterfaceC12711c {

    /* JADX INFO: renamed from: b */
    private final String f34374b;

    /* JADX INFO: renamed from: c */
    private Map<String, Object> f34375c;

    /* JADX INFO: renamed from: e */
    private Handler f34377e;

    /* JADX INFO: renamed from: g */
    private Handler f34379g;

    /* JADX INFO: renamed from: h */
    private C12894a f34380h;

    /* JADX INFO: renamed from: i */
    private C12717d f34381i;

    /* JADX INFO: renamed from: a */
    private final String f34373a = "PipMg";

    /* JADX INFO: renamed from: d */
    private final HandlerThread f34376d = new HandlerThread("FilterPipelineThread");

    /* JADX INFO: renamed from: f */
    private final HandlerThread f34378f = new HandlerThread("ComponentThread");

    public C12834a(String str, C12894a c12894a) {
        if (TextUtils.isEmpty(str)) {
            C13219q0.m37816b("PipMg", "Pipeline can not be null");
        }
        this.f34380h = c12894a;
        this.f34374b = C12835a.m35697a();
        this.f34381i = new C12717d();
        this.f34375c = new C12903e().m36162a(str);
        m35685a();
    }

    /* JADX INFO: renamed from: a */
    public void m35694a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            C13219q0.m37816b("PipMg", "Pipeline can not be null");
        } else {
            this.f34375c.putAll(map);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m35693d(C12710b c12710b) {
        try {
            String strM34839a = c12710b.m34839a();
            String strM34844c = c12710b.m34844c();
            if (!TextUtils.isEmpty(strM34839a) && !TextUtils.isEmpty(strM34844c) && this.f34375c != null) {
                String strM34846d = c12710b.m34846d();
                if (!m35689a(c12710b, strM34846d, strM34839a)) {
                    m35687a(c12710b, (Map<String, Object>) this.f34375c.get(strM34846d), strM34846d);
                    return;
                }
                for (Map.Entry<String, Object> entry : this.f34375c.entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof Map) {
                        m35687a(c12710b, (Map<String, Object>) value, key);
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("PipMg", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: c */
    private C12894a m35691c(C12710b c12710b) {
        C12894a c12894a = new C12894a();
        c12894a.m36045a(C12770c.m35209b("50"), c12710b.m34842b().containsKey(C12770c.m35209b("50")) ? c12710b.m34842b().get(C12770c.m35209b("50")) : c12710b.m34842b());
        c12894a.m36045a(C12770c.m35209b("51"), c12710b.m34842b().containsKey(C12770c.m35209b("51")) ? c12710b.m34842b().get(C12770c.m35209b("51")) : new C12894a());
        c12894a.m36045a("g0", this.f34380h);
        c12894a.m36045a(C12770c.m35209b("52"), c12710b.m34842b().containsKey(C12770c.m35209b("52")) ? c12710b.m34842b().get(C12770c.m35209b("52")) : new HashMap());
        c12894a.m36045a(C12770c.m35209b("sdk_context"), c12710b.m34842b().containsKey(C12770c.m35209b("sdk_context")) ? c12710b.m34842b().get(C12770c.m35209b("sdk_context")) : new HashMap());
        return c12894a;
    }

    /* JADX INFO: renamed from: a */
    private void m35685a() {
        this.f34376d.start();
        this.f34377e = new Handler(this.f34376d.getLooper());
        this.f34378f.start();
        this.f34379g = new Handler(this.f34378f.getLooper());
    }

    /* JADX INFO: renamed from: a */
    private boolean m35689a(C12710b c12710b, String str, String str2) {
        if (TextUtils.isEmpty(str) || str2.equals("_")) {
            return true;
        }
        try {
            if (c12710b.m34842b().containsKey(C12770c.m35209b("50"))) {
                Object obj = c12710b.m34842b().get(C12770c.m35209b("50"));
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (map.containsKey(C12770c.m35209b("18"))) {
                        Object obj2 = map.get(C12770c.m35209b("18"));
                        if (obj2 instanceof String) {
                            return obj2.equals("1");
                        }
                        return (obj2 instanceof Integer) && ((Integer) obj2).intValue() == 1;
                    }
                }
            }
        } catch (Throwable th) {
            C13219q0.m37817b("PipMg", th.getMessage(), th);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private void m35687a(C12710b c12710b, Map<String, Object> map, String str) {
        Object obj = map.get(c12710b.m34844c());
        List<Map> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return;
        }
        final C12894a c12894aM35691c = m35691c(c12710b);
        String strValueOf = "";
        for (Map map2 : list) {
            Object obj2 = map2.get(C12770c.m35209b("11"));
            Object obj3 = map2.get(C12770c.m35209b("12"));
            boolean zEquals = true;
            if (obj2 != null) {
                strValueOf = String.valueOf(obj2);
                if (!TextUtils.isEmpty(strValueOf)) {
                    Object objM34892a = this.f34381i.m34892a(strValueOf, c12894aM35691c);
                    if (objM34892a instanceof Integer) {
                        if (((Integer) objM34892a).intValue() != 1) {
                            zEquals = false;
                        }
                    } else if (objM34892a instanceof String) {
                        zEquals = String.valueOf(objM34892a).equals("1");
                    }
                }
            }
            final String str2 = strValueOf;
            if (zEquals && obj3 != null && (obj3 instanceof List)) {
                List list2 = (List) obj3;
                if (!list2.isEmpty()) {
                    for (Object obj4 : list2) {
                        if (obj4 instanceof Map) {
                            final Map<?, ?> mapM35684a = m35684a((Map) obj4, c12894aM35691c);
                            long jM35696a = C12835a.m35696a(String.valueOf(mapM35684a.get(C12770c.m35209b("14"))));
                            if (jM35696a > 0) {
                                final C12710b c12710b2 = c12710b;
                                final String str3 = str;
                                this.f34379g.postDelayed(new Runnable() { // from class: com.mbridge.msdk.config.component.pipeline.a$$ExternalSyntheticLambda1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f$0.m35690b(c12710b2, mapM35684a, c12894aM35691c, str2, str3);
                                    }
                                }, jM35696a);
                            } else {
                                final C12710b c12710b3 = c12710b;
                                final String str4 = str;
                                this.f34379g.post(new Runnable() { // from class: com.mbridge.msdk.config.component.pipeline.a$$ExternalSyntheticLambda2
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f$0.m35692c(c12710b3, mapM35684a, c12894aM35691c, str2, str4);
                                    }
                                });
                                c12710b = c12710b3;
                            }
                        }
                    }
                }
            }
            c12710b = c12710b;
            strValueOf = str2;
            str = str;
        }
    }

    /* JADX INFO: renamed from: a */
    private Map<?, ?> m35684a(Map<?, ?> map, C12894a c12894a) {
        Map<String, Object> mapM35204a = (map == null || map.isEmpty()) ? null : C12770c.m35204a((Map<String, Object>) map, c12894a);
        return mapM35204a == null ? new LinkedHashMap() : mapM35204a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m35692c(C12710b c12710b, Map<?, ?> map, C12894a c12894a, String str, String str2) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String strValueOf = String.valueOf(map.get(C12770c.m35209b("15")));
                String strConcat = this.f34374b.concat(".").concat(strValueOf.toLowerCase()).concat(".").concat(strValueOf).concat("Cpt");
                C12709a c12709aM35683a = m35683a(strConcat, map, c12894a);
                if (c12709aM35683a == null) {
                    c12709aM35683a = (C12709a) Class.forName(strConcat).getDeclaredConstructor(null).newInstance(null);
                    m35688a(strConcat, c12709aM35683a, c12894a);
                }
                c12709aM35683a.m34830a(this);
                c12709aM35683a.m34832a(map, c12894a, str2);
                c12709aM35683a.mo34836d();
            } catch (Throwable th) {
                C13219q0.m37817b("PipMg", th.getMessage(), th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private C12709a m35683a(String str, Map<?, ?> map, C12894a c12894a) {
        Map map2;
        Map map3;
        List<C12709a> list;
        try {
            if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty() && (map2 = (Map) c12894a.m36051b(C12770c.m35209b("sdk_context"))) != null && !map2.isEmpty() && (map3 = (Map) map2.get(C12770c.m35209b("component_cache"))) != null && !map3.isEmpty() && map3.containsKey(str) && (list = (List) map3.get(str)) != null && !list.isEmpty()) {
                for (C12709a c12709a : list) {
                    if ((c12709a instanceof InterfaceC12712d) && ((InterfaceC12712d) c12709a).mo34848a(map)) {
                        return c12709a;
                    }
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            C13219q0.m37817b("PipMg", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35688a(String str, C12709a c12709a, C12894a c12894a) {
        Map map;
        try {
            if ((c12709a instanceof InterfaceC12712d) && (map = (Map) c12894a.m36051b(C12770c.m35209b("sdk_context"))) != null && !map.isEmpty()) {
                Map map2 = (Map) map.get(C12770c.m35209b("component_cache"));
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(C12770c.m35209b("component_cache"), map2);
                }
                if (map2.containsKey(str)) {
                    List list = (List) map2.get(str);
                    if (list != null) {
                        list.add(c12709a);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c12709a);
                    map2.put(str, arrayList);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c12709a);
                map2.put(str, arrayList2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("PipMg", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.InterfaceC12711c
    /* JADX INFO: renamed from: a */
    public void mo34847a(final C12710b c12710b) {
        this.f34377e.post(new Runnable() { // from class: com.mbridge.msdk.config.component.pipeline.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m35693d(c12710b);
            }
        });
    }
}
