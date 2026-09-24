package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.bidder.C7855b;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.C7921g;
import com.fyber.inneractive.sdk.cache.session.C7924j;
import com.fyber.inneractive.sdk.cache.session.C7925k;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.x0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8051x0 {

    /* JADX INFO: renamed from: a */
    public C7916e f17888a;

    /* JADX INFO: renamed from: b */
    public C7961e f17889b;

    /* JADX INFO: renamed from: e */
    public InterfaceC8047v0 f17892e;

    /* JADX INFO: renamed from: c */
    public final HashMap f17890c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f17891d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f17893f = false;

    /* JADX INFO: renamed from: a */
    public final String m20456a(UnitDisplayType unitDisplayType, String str) {
        Map map = (Map) this.f17890c.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : (String) map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public final JSONArray m20457a(UnitDisplayType unitDisplayType) {
        int i;
        C7916e c7916e = this.f17888a;
        if (c7916e == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (EnumC7919c enumC7919c : EnumC7919c.values()) {
                if (enumC7919c != EnumC7919c.NONE && (unitDisplayType == null || enumC7919c.m20359a() == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", enumC7919c.m20359a().value());
                    jSONObject.put("subType", enumC7919c.name().toLowerCase(Locale.US).contains("video") ? "video" : "display");
                    C7925k c7925k = (C7925k) c7916e.f17596b.get(enumC7919c);
                    try {
                        i = Integer.parseInt(IAConfigManager.f17654M.f17688t.f17862b.m20445a("number_of_sessions", Integer.toString(5)));
                    } catch (Throwable unused) {
                        i = 5;
                    }
                    int i2 = i >= 0 ? i : 5;
                    if (i2 > 0 && c7925k != null && c7925k.size() >= i2) {
                        boolean zM20360b = enumC7919c.m20360b();
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = new ArrayList(c7925k);
                        Collections.sort(arrayList, new C7924j());
                        Iterator it = arrayList.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((C7921g) it.next()).m20362a(false, zM20360b));
                            i3++;
                            if (i3 >= i2) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public final void m20458a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = (Map) this.f17890c.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f17890c.put(unitDisplayType, map);
        }
        map.put(str, str2);
        InterfaceC8047v0 interfaceC8047v0 = this.f17892e;
        if (interfaceC8047v0 == null || !this.f17893f) {
            return;
        }
        ((C7855b) interfaceC8047v0).m20342d();
    }
}
