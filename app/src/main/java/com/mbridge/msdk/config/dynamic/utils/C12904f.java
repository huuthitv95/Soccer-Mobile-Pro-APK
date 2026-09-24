package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.touch.C12885a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.f */
/* JADX INFO: compiled from: ViewUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12904f {
    /* JADX INFO: renamed from: a */
    public static void m36164a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> mapM35978a;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        C12885a touchEventData = xMLView.getTouchEventData();
        HashMap map2 = new HashMap();
        if (touchEventData != null && (mapM35978a = touchEventData.m35978a()) != null) {
            C12885a.a aVarM35979b = touchEventData.m35979b();
            if (aVarM35979b != null) {
                mapM35978a.put("click_x", String.valueOf(aVarM35979b.f34650b));
                mapM35978a.put("click_y", String.valueOf(aVarM35979b.f34651c));
            }
            mapM35978a.put("click_time", String.valueOf(System.currentTimeMillis()));
            map2.putAll(mapM35978a);
        }
        if (map != null) {
            map2.putAll(map);
        }
        xMLView.getXmlViewActionListener().mo35771a(String.valueOf(obj), map2);
    }
}
