package com.mbridge.msdk.config.component.info;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.C12709a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.component.info.model.C12776a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class InfoCpt extends C12709a {

    /* JADX INFO: renamed from: h */
    private C12776a f34018h;

    /* JADX INFO: renamed from: a */
    private Object m35232a(String str, Context context) {
        C12776a c12776a = this.f34018h;
        if (c12776a == null || context == null) {
            return null;
        }
        return c12776a.m35238b(str);
    }

    /* JADX INFO: renamed from: g */
    private Map<String, Object> m35233g() {
        HashMap map = new HashMap();
        C12776a c12776a = this.f34018h;
        return c12776a != null ? c12776a.m35240c() : map;
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: b */
    public void mo34834b(Map<String, Object> map) {
        super.mo34834b(map);
        this.f33808f = "918001";
        this.f34018h = new C12776a(map);
    }

    @Override // com.mbridge.msdk.config.component.base.C12709a
    /* JADX INFO: renamed from: d */
    public void mo34836d() {
        super.mo34836d();
        m34829a(m34827a("918001", new HashMap<>()));
        String strM35243f = this.f34018h.m35243f();
        List<String> listM35241d = this.f34018h.m35241d();
        Map<String, Object> map = new HashMap<>();
        Context contextM36542d = C13008c.m36588n().m36542d();
        HashMap map2 = new HashMap();
        if (strM35243f != null) {
            if (TextUtils.isEmpty(strM35243f)) {
                if (listM35241d != null && !listM35241d.isEmpty()) {
                    for (String str : listM35241d) {
                        map2.put(str, m35232a(str, contextM36542d));
                    }
                }
            } else if (strM35243f.equals(C12770c.m35209b("330"))) {
                map2.putAll(m35233g());
            } else {
                map2.put(strM35243f, m35232a(strM35243f, contextM36542d));
            }
        }
        if (this.f34018h.m35242e() != null && !this.f34018h.m35242e().isEmpty()) {
            int size = this.f34018h.m35242e().size();
            int[] iArr = new int[size];
            for (int i = 0; i < this.f34018h.m35242e().size(); i++) {
                iArr[i] = C13229v0.m37915c(contextM36542d, this.f34018h.m35242e().get(i)) ? 1 : 0;
            }
            try {
                List<String> listM35239b = this.f34018h.m35239b();
                List<String> listM35236a = this.f34018h.m35236a();
                if (listM35239b != null && listM35239b.size() == this.f34018h.m35242e().size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < size; i2++) {
                        HashMap map3 = new HashMap();
                        map3.put(C12770c.m35209b("ind"), Integer.valueOf(iArr[i2]));
                        map3.put(C12770c.m35209b("cid"), listM35239b.get(i2));
                        map3.put(C12770c.m35209b(CampaignEx.JSON_KEY_RETARGET_OFFER), listM35236a.get(i2));
                        arrayList.add(map3);
                    }
                    map2.put(C12770c.m35209b("filter_list"), arrayList);
                }
            } catch (Exception e) {
                C13219q0.m37813a("InfoCpt", e.getMessage());
            }
            map2.put(C12770c.m35209b("575"), iArr);
        }
        map.put(C12770c.m35209b("500"), map2);
        m34829a(m34827a("918002", map));
    }
}
