package com.mbridge.msdk.config.component.base;

import android.text.TextUtils;
import android.view.ViewGroup;
import bolts.MeasurementEvent;
import com.mbridge.msdk.config.component.common.metrics.C12755a;
import com.mbridge.msdk.config.component.common.metrics.C12756b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.p287vc.inter.InterfaceC12852a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.base.a */
/* JADX INFO: compiled from: BaseComponent.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12709a {

    /* JADX INFO: renamed from: a */
    public Map<?, ?> f33803a;

    /* JADX INFO: renamed from: b */
    public InterfaceC12711c f33804b;

    /* JADX INFO: renamed from: c */
    private String f33805c;

    /* JADX INFO: renamed from: d */
    public C12894a f33806d;

    /* JADX INFO: renamed from: e */
    protected boolean f33807e = false;

    /* JADX INFO: renamed from: f */
    protected String f33808f;

    /* JADX INFO: renamed from: g */
    private String f33809g;

    /* JADX INFO: renamed from: b */
    private Map<String, Object> m34824b(String str) {
        Map<?, ?> map = this.f33803a;
        if (map != null && !map.isEmpty()) {
            Object obj = this.f33803a.get(C12770c.m35209b("16"));
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get(C12770c.m35209b("13"));
                if (obj2 instanceof Map) {
                    Object obj3 = ((Map) obj2).get(str);
                    if (obj3 instanceof Map) {
                        Map<String, Object> map2 = (Map) obj3;
                        if (!map2.isEmpty()) {
                            Map<String, Object> mapM35204a = C12770c.m35204a(map2, this.f33806d);
                            return !mapM35204a.isEmpty() ? mapM35204a : map2;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m34825c() {
        Map<?, ?> map = this.f33803a;
        if (map == null) {
            C13219q0.m37816b("BaseComponent", "Execute config is null");
            return;
        }
        this.f33805c = String.valueOf(map.get(C12770c.m35209b("15")));
        Object obj = this.f33803a.get(C12770c.m35209b("16"));
        if (!(obj instanceof Map)) {
            C13219q0.m37816b("BaseComponent", "Component config is not instance of Map");
            return;
        }
        Map<String, Object> map2 = (Map) obj;
        mo34834b(map2);
        if (map2.containsKey(C12770c.m35209b("13"))) {
            Object obj2 = map2.get(C12770c.m35209b("13"));
            if (obj2 instanceof Map) {
                mo34835c((Map) obj2);
            } else {
                C13219q0.m37816b("BaseComponent", "Component event is not instance of Map");
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m34826d(Map<?, ?> map) {
        Map map2;
        Map map3;
        Map map4;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f33803a == null) {
            this.f33803a = map;
            return;
        }
        try {
            HashMap map5 = new HashMap();
            map5.putAll(map);
            HashMap map6 = new HashMap();
            Map map7 = (Map) map.get(C12770c.m35209b("16"));
            if ((map7 instanceof Map) && (map4 = (Map) map7.get(C12770c.m35209b("13"))) != null) {
                map6.putAll(map4);
            }
            if ((map.get(C12770c.m35209b("13")) instanceof Map) && (map3 = (Map) map.get(C12770c.m35209b("13"))) != null) {
                map6.putAll(map3);
            }
            HashMap map8 = new HashMap();
            Map map9 = (Map) this.f33803a.get(C12770c.m35209b("16"));
            if ((map9 instanceof Map) && (map2 = (Map) map9.get(C12770c.m35209b("13"))) != null) {
                map8.putAll(map2);
            }
            C12770c.m35207a(map8, map6);
            Object obj = map5.get(C12770c.m35209b("16"));
            if (obj instanceof Map) {
                Map map10 = (Map) obj;
                if (!map10.isEmpty()) {
                    map10.put(C12770c.m35209b("13"), map8);
                }
            } else {
                HashMap map11 = new HashMap();
                map11.put(C12770c.m35209b("13"), map8);
                map5.put(C12770c.m35209b("16"), map11);
            }
            this.f33803a = map5;
        } catch (Throwable th) {
            C13219q0.m37817b("BaseComponent", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo34828a() {
    }

    /* JADX INFO: renamed from: a */
    public void m34832a(Map<?, ?> map, C12894a c12894a, String str) {
        if (map == null) {
            return;
        }
        this.f33809g = str;
        this.f33806d = c12894a;
        m34826d(map);
        m34833b();
        m34825c();
        mo34828a();
    }

    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: c */
    protected void mo34835c(Map<String, Object> map) {
    }

    /* JADX INFO: renamed from: e */
    public ViewGroup m34837e() {
        C12894a c12894a = this.f33806d;
        if (c12894a == null) {
            return null;
        }
        Object objM36051b = c12894a.m36051b(C12770c.m35209b("sdk_context"));
        if (!(objM36051b instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objM36051b).get(C12770c.m35209b("rootView"));
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    protected void m34838f() {
        if (this.f33807e) {
            return;
        }
        m34829a(m34827a(this.f33808f, new HashMap()));
        this.f33807e = true;
    }

    /* JADX INFO: renamed from: a */
    public void m34830a(InterfaceC12711c interfaceC12711c) {
        this.f33804b = interfaceC12711c;
    }

    /* JADX INFO: renamed from: a */
    public void m34829a(C12710b c12710b) {
        InterfaceC12711c interfaceC12711c;
        if (c12710b == null) {
            C13219q0.m37816b("BaseComponent", "baseComponentOut cannot be null");
            return;
        }
        c12710b.m34840a(this.f33805c);
        c12710b.m34845c(this.f33809g);
        String strM34844c = c12710b.m34844c();
        if (strM34844c != null && !strM34844c.isEmpty()) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            if (c12710b.m34842b() != null) {
                map.putAll(c12710b.m34842b());
                map2.put("event_gen_data", new HashMap(c12710b.m34842b()));
            }
            Map<String, Object> mapM34824b = m34824b(strM34844c);
            if (mapM34824b != null && !mapM34824b.isEmpty()) {
                map.putAll(mapM34824b);
                map2.put("event_replace_data", mapM34824b);
            }
            c12710b.m34842b().clear();
            map.put(C12770c.m35209b(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY), strM34844c);
            c12710b.m34842b().put(C12770c.m35209b("50"), map);
            boolean zM34823a = m34823a(mapM34824b, C12770c.m35209b("17"));
            boolean zM34823a2 = m34823a(mapM34824b, C12770c.m35209b("19"));
            Map<?, ?> map3 = this.f33803a;
            if (map3 != null && !map3.isEmpty()) {
                c12710b.m34842b().put(C12770c.m35209b("52"), this.f33803a.get(C12770c.m35209b("16")));
            }
            if (this.f33806d != null) {
                c12710b.m34842b().put(C12770c.m35209b("51"), this.f33806d.m36051b(C12770c.m35209b("51")));
                c12710b.m34842b().put(C12770c.m35209b("sdk_context"), this.f33806d.m36051b(C12770c.m35209b("sdk_context")));
            }
            if (zM34823a2) {
                m34822a(c12710b, map2);
            }
            if (!zM34823a || (interfaceC12711c = this.f33804b) == null) {
                return;
            }
            interfaceC12711c.mo34847a(c12710b);
            return;
        }
        C13219q0.m37816b("BaseComponent", "eventName cannot be null or empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    protected void m34833b() {
        C12894a c12894a;
        if (!(this instanceof InterfaceC12852a) || (c12894a = this.f33806d) == null) {
            return;
        }
        try {
            Object objM36051b = c12894a.m36051b(C12770c.m35209b("sdk_context"));
            if (objM36051b instanceof Map) {
                Map map = (Map) objM36051b;
                if (map.containsKey("lifecycleListeners")) {
                    List list = (List) map.get("lifecycleListeners");
                    if (list == null || list.contains(this)) {
                        return;
                    }
                    list.add((InterfaceC12852a) this);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add((InterfaceC12852a) this);
                map.put("lifecycleListeners", arrayList);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("BaseComponent", "Error in addLifecycleListener", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        m34838f();
    }

    /* JADX INFO: renamed from: a */
    private boolean m34823a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return false;
        }
        return String.valueOf(obj).equals("1");
    }

    /* JADX INFO: renamed from: a */
    public C12710b m34827a(String str, Map<String, Object> map) {
        C12710b c12710b = new C12710b();
        c12710b.m34843b(str);
        if (map == null) {
            map = new HashMap<>();
        }
        c12710b.m34841a(map);
        return c12710b;
    }

    /* JADX INFO: renamed from: a */
    private void m34822a(C12710b c12710b, Map<String, Object> map) {
        try {
            Map<String, Object> mapM35096a = C12756b.m35096a(c12710b, map, this.f33806d);
            if (mapM35096a.isEmpty()) {
                return;
            }
            C12755a.m35087a().m35092a(mapM35096a);
        } catch (Throwable th) {
            C13219q0.m37816b("BaseComponent", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m34831a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), str2);
        map.put(C12770c.m35209b("reason"), str3);
        m34829a(m34827a(str, map));
    }
}
