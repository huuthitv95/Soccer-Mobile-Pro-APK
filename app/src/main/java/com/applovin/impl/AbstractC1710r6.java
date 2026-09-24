package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.r6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1710r6 extends AbstractC1779t6 {

    /* JADX INFO: renamed from: com.applovin.impl.r6$a */
    class a implements C1704r0.e {
        a() {
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1710r6.this.mo3882a(i);
        }

        @Override // com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            AbstractC1710r6.this.mo3884b(jSONObject);
        }
    }

    protected AbstractC1710r6(String str, C1748l c1748l) {
        super(str, c1748l);
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m4210a(C1698q4 c1698q4) {
        JSONObject jSONObjectM5243e = m5243e();
        JsonUtils.putString(jSONObjectM5243e, "result", c1698q4.m4012b());
        Map mapM4011a = c1698q4.m4011a();
        if (mapM4011a != null) {
            JsonUtils.putJSONObject(jSONObjectM5243e, "params", new JSONObject(mapM4011a));
        }
        return jSONObjectM5243e;
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo3884b(JSONObject jSONObject);

    @Override // com.applovin.impl.AbstractC1779t6
    /* JADX INFO: renamed from: g */
    protected int mo4211g() {
        return ((Integer) this.f1969a.m4801a(C1831z4.f3941h1)).intValue();
    }

    /* JADX INFO: renamed from: h */
    protected abstract C1698q4 mo3886h();

    /* JADX INFO: renamed from: i */
    protected abstract void mo3887i();

    @Override // java.lang.Runnable
    public void run() {
        C1698q4 c1698q4Mo3886h = mo3886h();
        if (c1698q4Mo3886h == null) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Pending reward not found");
            }
            mo3887i();
            return;
        }
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Reporting pending reward: " + c1698q4Mo3886h + "...");
        }
        m5242a(m4210a(c1698q4Mo3886h), new a());
    }
}
