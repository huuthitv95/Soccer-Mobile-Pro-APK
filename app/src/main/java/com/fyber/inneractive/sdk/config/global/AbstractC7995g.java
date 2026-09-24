package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.AbstractC7981i;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7995g {
    /* JADX INFO: renamed from: a */
    public static JSONArray m20428a(Map map, boolean z) {
        InterfaceC7970d interfaceC7970d;
        JSONArray jSONArray = new JSONArray();
        try {
            for (AbstractC7981i abstractC7981i : map.values()) {
                abstractC7981i.getClass();
                ArrayList<C7968b> arrayList = new ArrayList(abstractC7981i.f17758c.values());
                HashMap map2 = abstractC7981i.f17759d;
                for (C7968b c7968b : arrayList) {
                    JSONObject jSONObject = new JSONObject();
                    String str = c7968b != null ? c7968b.f17744a : null;
                    if (!TextUtils.isEmpty(str)) {
                        C7999k c7999k = (C7999k) map2.get(str);
                        jSONObject.put("id", str);
                        if (c7999k != null) {
                            jSONObject.put("v", c7999k.f17768b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            Iterator it = c7968b.f17747d.iterator();
                            do {
                                if (!it.hasNext()) {
                                    interfaceC7970d = null;
                                    break;
                                }
                                interfaceC7970d = (InterfaceC7970d) it.next();
                            } while (!C7969c.class.equals(interfaceC7970d.getClass()));
                            if (interfaceC7970d != null && ((C7969c) interfaceC7970d).f17749b) {
                                HashSet hashSet = ((C7969c) interfaceC7970d).f17748a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    jSONArray2.put((Long) it2.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m21945a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f21426a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
