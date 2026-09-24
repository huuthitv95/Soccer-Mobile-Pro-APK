package com.mbridge.msdk.foundation.same.report.net;

import com.mbridge.msdk.foundation.same.net.C13110c;
import com.mbridge.msdk.foundation.same.net.C13112e;
import com.mbridge.msdk.foundation.same.net.exception.C13113a;
import com.mbridge.msdk.foundation.same.net.utils.C13118a;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.net.b */
/* JADX INFO: compiled from: ReportResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC13161b extends C13110c<String> {

    /* JADX INFO: renamed from: a */
    private static final String f36188a = "b";

    /* JADX INFO: renamed from: a */
    public abstract void mo37352a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo37353b(String str);

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onError(C13113a c13113a) {
        C13219q0.m37816b(f36188a, "errorCode = " + c13113a.f35959a);
        mo37352a(C13118a.m37208a(c13113a));
    }

    @Override // com.mbridge.msdk.foundation.same.net.C13110c, com.mbridge.msdk.foundation.same.net.InterfaceC13109b
    public void onSuccess(C13112e<String> c13112e) {
        if (c13112e != null) {
            mo37353b(c13112e.f35958c);
        }
    }
}
