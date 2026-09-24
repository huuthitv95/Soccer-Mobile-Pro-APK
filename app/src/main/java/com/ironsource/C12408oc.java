package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12408oc implements InterfaceC12155df<JSONObject>, InterfaceC12119bf<C12325mc> {

    /* JADX INFO: renamed from: a */
    private final Map<String, C12257j1> f31632a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC12129c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo26046a(EnumC12137cf mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C12257j1> entry : this.f31632a.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArrayMo26046a = entry.getValue().mo26046a(mode);
            if (jSONArrayMo26046a.length() > 0) {
                jSONObject.put(key, jSONArrayMo26046a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC12119bf
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26047a(C12325mc record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strM32228c = record.m32228c();
        Map<String, C12257j1> map = this.f31632a;
        C12257j1 c12257j1 = map.get(strM32228c);
        if (c12257j1 == null) {
            c12257j1 = new C12257j1();
            map.put(strM32228c, c12257j1);
        }
        c12257j1.m31777a(record.m32225a(new C12390nc()));
    }
}
