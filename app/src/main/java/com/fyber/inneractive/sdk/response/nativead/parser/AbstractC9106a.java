package com.fyber.inneractive.sdk.response.nativead.parser;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.response.nativead.C9101g;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.nativead.parser.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9106a {
    /* JADX INFO: renamed from: a */
    public static ArrayList m21901a(JSONArray jSONArray) {
        C9101g c9101g;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.names() == null) {
                    c9101g = null;
                } else {
                    c9101g = new C9101g();
                    c9101g.f21348a = jSONObjectOptJSONObject.optInt(NotificationCompat.CATEGORY_EVENT);
                    c9101g.f21349b = jSONObjectOptJSONObject.optInt("method");
                    c9101g.f21350c = AbstractC9195v.m22026a(jSONObjectOptJSONObject, "url");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("customdata");
                    HashMap map = c9101g.f21351d;
                    HashMap map2 = new HashMap();
                    if (jSONObjectOptJSONObject2 != null) {
                        HashMap map3 = new HashMap();
                        JSONArray jSONArrayNames = jSONObjectOptJSONObject2.names();
                        if (jSONArrayNames != null && jSONArrayNames.length() != 0) {
                            for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                                String strOptString = jSONArrayNames.optString(i2);
                                if (strOptString != null && !strOptString.isEmpty() && !jSONObjectOptJSONObject2.isNull(strOptString)) {
                                    String strOptString2 = jSONObjectOptJSONObject2.optString(strOptString);
                                    if (!strOptString2.isEmpty()) {
                                        map3.put(strOptString, strOptString2);
                                    }
                                }
                            }
                        }
                        map2.putAll(map3);
                    }
                    map.putAll(map2);
                }
                if (c9101g != null) {
                    arrayList.add(c9101g);
                }
            }
        }
        return arrayList;
    }
}
