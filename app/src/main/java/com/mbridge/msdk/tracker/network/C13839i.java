package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.network.toolbox.C13856f;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.i */
/* JADX INFO: compiled from: MBridgeJsonRequest.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13839i extends AbstractC13838h<JSONObject> implements C13867v.a {

    /* JADX INFO: renamed from: C */
    private final InterfaceC13840j<JSONObject> f39458C;

    public C13839i(int i, String str, String str2, long j, InterfaceC13840j<JSONObject> interfaceC13840j) {
        super(i, str, 0, str2, j);
        this.f39458C = interfaceC13840j;
        m41222a((C13867v.a) this);
    }

    /* JADX INFO: renamed from: a */
    private void m41114a(C13867v<JSONObject> c13867v, C13847q c13847q) {
        InterfaceC13840j<JSONObject> interfaceC13840j = this.f39458C;
        if (interfaceC13840j != null) {
            try {
                interfaceC13840j.mo37271a(this, c13867v, c13847q);
            } catch (Exception e) {
                C13219q0.m37816b(AbstractC13838h.f39452B, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41115b(C13867v<JSONObject> c13867v) {
        InterfaceC13840j<JSONObject> interfaceC13840j = this.f39458C;
        if (interfaceC13840j != null) {
            try {
                interfaceC13840j.mo37272b(this, c13867v, c13867v.f39592c.f39434a);
            } catch (Exception e) {
                C13219q0.m37816b(AbstractC13838h.f39452B, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    protected C13867v<JSONObject> mo41116a(C13847q c13847q) {
        try {
            String str = new String(c13847q.f39515b, StandardCharsets.UTF_8);
            if (c13847q.f39514a == 204) {
                C13867v<JSONObject> c13867vM41335a = C13867v.m41335a(new JSONObject(), C13856f.m41264a(c13847q));
                m41114a(c13867vM41335a, c13847q);
                return c13867vM41335a;
            }
            C13867v<JSONObject> c13867vM41335a2 = C13867v.m41335a(new JSONObject(str), C13856f.m41264a(c13847q));
            m41114a(c13867vM41335a2, c13847q);
            return c13867vM41335a2;
        } catch (JSONException e) {
            C13219q0.m37816b(AbstractC13838h.f39452B, e.getMessage());
            C13867v<JSONObject> c13867vM41334a = C13867v.m41334a(new C13849s(e));
            m41115b(c13867vM41334a);
            return c13867vM41334a;
        } catch (Throwable th) {
            C13867v<JSONObject> c13867vM41334a2 = C13867v.m41334a(new C13829a0(th));
            m41115b(c13867vM41334a2);
            return c13867vM41334a2;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.C13867v.a
    /* JADX INFO: renamed from: a */
    public void mo41117a(AbstractC13831b0 abstractC13831b0) {
        m41115b(C13867v.m41334a(abstractC13831b0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo41118a(JSONObject jSONObject) {
    }
}
