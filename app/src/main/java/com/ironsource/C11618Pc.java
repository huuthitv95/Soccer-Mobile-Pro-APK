package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Pc */
/* JADX INFO: loaded from: classes6.dex */
class C11618Pc extends AbstractC12157e {

    /* JADX INFO: renamed from: i */
    private final String f25532i = C12117bd.f30133a;

    C11618Pc(int i) {
        this.f30271g = i;
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: a */
    public String mo27248a() {
        return C12117bd.f30133a;
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: c */
    public String mo27250c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC12157e
    /* JADX INFO: renamed from: a */
    public String mo27249a(ArrayList<C12580w5> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f30270f = new JSONObject();
        } else {
            this.f30270f = jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C12580w5> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectM31332a = m31332a(it.next());
                if (jSONObjectM31332a != null) {
                    jSONArray.put(jSONObjectM31332a);
                }
            }
        }
        return m31331a(jSONArray);
    }
}
