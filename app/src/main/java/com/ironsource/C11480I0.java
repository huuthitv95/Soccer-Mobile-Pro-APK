package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.I0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11480I0 implements InterfaceC12155df<JSONObject>, InterfaceC12119bf<C11444G0> {

    /* JADX INFO: renamed from: a */
    private final Map<String, C12408oc> f24453a = new LinkedHashMap();

    @Override // com.ironsource.InterfaceC12129c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo26046a(EnumC12137cf mode) throws JSONException {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C12408oc> entry : this.f24453a.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObjectMo26046a = entry.getValue().mo26046a(mode);
            if (jSONObjectMo26046a.length() > 0) {
                jSONObject.put(StringsKt.substringAfterLast$default(key, "_", (String) null, 2, (Object) null), jSONObjectMo26046a);
            }
        }
        return jSONObject;
    }

    @Override // com.ironsource.InterfaceC12119bf
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26047a(C11444G0 record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String strM25813d = record.m25813d();
        Map<String, C12408oc> map = this.f24453a;
        C12408oc c12408oc = map.get(strM25813d);
        if (c12408oc == null) {
            c12408oc = new C12408oc();
            map.put(strM25813d, c12408oc);
        }
        c12408oc.mo26047a(record.m25809a(new C11462H0()));
    }
}
