package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.tracker.network.toolbox.C13856f;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.k */
/* JADX INFO: compiled from: MBridgeStringRequest.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13841k extends AbstractC13838h<String> implements C13867v.a {

    /* JADX INFO: renamed from: C */
    private final InterfaceC13840j<String> f39459C;

    public C13841k(int i, String str, String str2, long j, InterfaceC13840j<String> interfaceC13840j) {
        super(i, str, 0, str2, j);
        this.f39459C = interfaceC13840j;
        m41222a((C13867v.a) this);
    }

    /* JADX INFO: renamed from: a */
    private void m41120a(C13867v<String> c13867v, C13847q c13847q) {
        InterfaceC13840j<String> interfaceC13840j = this.f39459C;
        if (interfaceC13840j != null) {
            try {
                interfaceC13840j.mo37271a(this, c13867v, c13847q);
            } catch (Exception e) {
                C13219q0.m37817b(AbstractC13838h.f39452B, "parseNetworkResponse error: ", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41121b(C13867v<String> c13867v) {
        InterfaceC13840j<String> interfaceC13840j = this.f39459C;
        if (interfaceC13840j != null) {
            try {
                interfaceC13840j.mo37272b(this, c13867v, c13867v.f39592c.f39434a);
            } catch (Exception e) {
                C13219q0.m37817b(AbstractC13838h.f39452B, "parseNetworkResponse error: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: a */
    protected C13867v<String> mo41116a(C13847q c13847q) {
        try {
            C13867v<String> c13867vM41335a = C13867v.m41335a(new String(c13847q.f39515b, StandardCharsets.UTF_8), C13856f.m41264a(c13847q));
            m41120a(c13867vM41335a, c13847q);
            return c13867vM41335a;
        } catch (Throwable th) {
            C13219q0.m37817b(AbstractC13838h.f39452B, "parseNetworkResponse error: ", th);
            C13867v<String> c13867vM41334a = C13867v.m41334a(new C13829a0(th));
            m41121b(c13867vM41334a);
            return c13867vM41334a;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.C13867v.a
    /* JADX INFO: renamed from: a */
    public void mo41117a(AbstractC13831b0 abstractC13831b0) {
        m41121b(C13867v.m41334a(abstractC13831b0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.tracker.network.AbstractC13850t
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo41118a(String str) {
    }
}
