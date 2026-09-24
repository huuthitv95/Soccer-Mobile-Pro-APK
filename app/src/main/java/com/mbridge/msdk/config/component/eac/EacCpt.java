package com.mbridge.msdk.config.component.eac;

import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.express.C12717d;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.eac.model.C12775a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class EacCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12775a f34013h;

    /* JADX INFO: renamed from: i */
    private C12717d f34014i;

    /* JADX INFO: renamed from: a */
    private void m35224a(Iterable<?> iterable, int i) {
        int i2 = 0;
        for (Object obj : iterable) {
            Object objM34892a = this.f34014i.m34892a(this.f34013h.m35229b(), this.f33806d);
            if (!(objM34892a instanceof Integer) || ((Integer) objM34892a).intValue() == 1) {
                Object objM34892a2 = this.f34014i.m34892a(this.f34013h.m35225a(), this.f33806d);
                if ((objM34892a2 instanceof Integer) && ((Integer) objM34892a2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put(C12770c.m35209b("count"), i + "");
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    map.put(C12770c.m35209b("key"), entry.getKey().toString());
                    map.put(C12770c.m35209b("value"), entry.getValue());
                } else {
                    map.put(C12770c.m35209b("key"), i2 + "");
                    map.put(C12770c.m35209b("value"), obj);
                }
                m34829a(m34827a("921002", map));
            }
            i2++;
        }
        HashMap map2 = new HashMap();
        map2.put(C12770c.m35209b("count"), Integer.valueOf(i));
        m34829a(m34827a("921003", map2));
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    protected void mo34834b(Map<String, Object> map) {
        this.f33808f = "921001";
        this.f34013h = new C12775a(map);
        this.f34014i = new C12717d();
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        Object objM35231c = this.f34013h.m35231c();
        if (objM35231c == null) {
            Map<String, Object> map = new HashMap<>();
            map.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "");
            map.put(C12770c.m35209b("reason"), "iterationData is null");
            map.put(C12770c.m35209b("count"), 0);
            m34829a(m34827a("921003", map));
            return;
        }
        if (objM35231c instanceof C12894a) {
            C12894a c12894a = (C12894a) objM35231c;
            m35224a(c12894a.m36047a(), c12894a.m36059f());
            return;
        }
        if (objM35231c instanceof Map) {
            Map map2 = (Map) objM35231c;
            m35224a(map2.entrySet(), map2.size());
        } else {
            if (objM35231c instanceof List) {
                List list = (List) objM35231c;
                m35224a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put(C12770c.m35209b(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), "");
            map3.put(C12770c.m35209b("reason"), "iterationData type not match");
            map3.put(C12770c.m35209b("count"), 0);
            m34829a(m34827a("921003", map3));
        }
    }
}
