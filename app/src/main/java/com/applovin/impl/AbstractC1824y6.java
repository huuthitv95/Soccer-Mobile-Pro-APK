package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1824y6 extends AbstractC1779t6 {

    /* JADX INFO: renamed from: com.applovin.impl.y6$a */
    class a implements C1704r0.e {
        a() {
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            if (AbstractC1824y6.this.mo5553h()) {
                C1768p c1768p = AbstractC1824y6.this.f1971c;
                if (C1768p.m5160a()) {
                    AbstractC1824y6 abstractC1824y6 = AbstractC1824y6.this;
                    abstractC1824y6.f1971c.m5174b(abstractC1824y6.f1970b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            C1768p c1768p2 = AbstractC1824y6.this.f1971c;
            if (C1768p.m5160a()) {
                AbstractC1824y6 abstractC1824y7 = AbstractC1824y6.this;
                abstractC1824y7.f1971c.m5174b(abstractC1824y7.f1970b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            AbstractC1824y6.this.mo3882a(i);
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            if (!AbstractC1824y6.this.mo5553h()) {
                C1768p c1768p = AbstractC1824y6.this.f1971c;
                if (C1768p.m5160a()) {
                    AbstractC1824y6 abstractC1824y6 = AbstractC1824y6.this;
                    abstractC1824y6.f1971c.m5171a(abstractC1824y6.f1970b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
                }
                AbstractC1824y6.this.m5721c(jSONObject);
                return;
            }
            C1768p c1768p2 = AbstractC1824y6.this.f1971c;
            if (C1768p.m5160a()) {
                AbstractC1824y6 abstractC1824y7 = AbstractC1824y6.this;
                abstractC1824y7.f1971c.m5174b(abstractC1824y7.f1970b, "Reward validation succeeded with code " + i + " but task was cancelled already");
            }
            C1768p c1768p3 = AbstractC1824y6.this.f1971c;
            if (C1768p.m5160a()) {
                AbstractC1824y6 abstractC1824y8 = AbstractC1824y6.this;
                abstractC1824y8.f1971c.m5174b(abstractC1824y8.f1970b, "Response: " + jSONObject);
            }
        }
    }

    protected AbstractC1824y6(String str, C1748l c1748l) {
        super(str, c1748l);
    }

    /* JADX INFO: renamed from: b */
    private C1698q4 m5720b(JSONObject jSONObject) {
        Map<String, String> stringMap;
        String string;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        AbstractC1714s0.m4323c(jSONObject2, this.f1969a);
        AbstractC1714s0.m4321b(jSONObject, this.f1969a);
        AbstractC1714s0.m4312a(jSONObject, this.f1969a);
        try {
            stringMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            stringMap = Collections.EMPTY_MAP;
        }
        try {
            string = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            string = "network_timeout";
        }
        return C1698q4.m4010a(string, stringMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m5721c(JSONObject jSONObject) {
        C1698q4 c1698q4M5720b = m5720b(jSONObject);
        mo5552a(c1698q4M5720b);
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Pending reward handled: " + c1698q4M5720b);
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo5552a(C1698q4 c1698q4);

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: g */
    protected int mo4211g() {
        return ((Integer) this.f1969a.m4801a(C1831z4.f3932g1)).intValue();
    }

    /* JADX INFO: renamed from: h */
    protected abstract boolean mo5553h();

    @Override // java.lang.Runnable
    public void run() {
        m5242a(m5243e(), new a());
    }
}
