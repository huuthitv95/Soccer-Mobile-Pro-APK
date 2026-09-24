package com.ironsource;

import com.ironsource.mediationsdk.C12352e;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.l2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12294l2 extends C12352e.a {
    public C12294l2(InterfaceC11691U1 interfaceC11691U1, URL url, JSONObject jSONObject, boolean z, C12470s2 c12470s2) {
        super(interfaceC11691U1, url, jSONObject, z, c12470s2);
    }

    @Override // com.ironsource.mediationsdk.C12352e.a
    /* JADX INFO: renamed from: a */
    protected void mo32011a(boolean z, InterfaceC11691U1 interfaceC11691U1, long j) {
        try {
            if (z) {
                ((InterfaceC12160e2) interfaceC11691U1).mo31346a(this.f31225b, this.f31229f + 1, j, this.f31233j, this.f31232i);
            } else {
                interfaceC11691U1.mo27553a(this.f31226c, this.f31227d, this.f31229f + 1, this.f31230g, j);
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            interfaceC11691U1.mo27553a(1009, e.getMessage(), this.f31229f + 1, this.f31230g, j);
        }
    }
}
