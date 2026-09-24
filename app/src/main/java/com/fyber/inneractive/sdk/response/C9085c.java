package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC8013k;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.C9187s0;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9085c extends AbstractC9084b {
    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final AbstractC9087e mo21885a() {
        C9088f c9088f = new C9088f();
        this.f21280a = c9088f;
        return c9088f;
    }

    @Override // com.fyber.inneractive.sdk.response.AbstractC9084b
    /* JADX INFO: renamed from: a */
    public final void mo21887a(String str, C8028r0 c8028r0) {
        C9088f c9088f = (C9088f) this.f21280a;
        if (str == null) {
            str = null;
        } else {
            C9187s0 c9187s0 = C9187s0.f21483c;
            c9187s0.getClass();
            int iIndexOf = str.indexOf(38);
            if (iIndexOf >= 0) {
                StringWriter stringWriter = new StringWriter((int) ((((double) str.length()) * 0.1d) + ((double) str.length())));
                try {
                    c9187s0.m22014a(stringWriter, str, iIndexOf);
                } catch (IOException unused) {
                }
                str = stringWriter.toString();
            }
        }
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String strM21999b = AbstractC9174o.m21999b(property);
            if (!TextUtils.isEmpty(strM21999b)) {
                str = strM21999b;
            }
        }
        c9088f.f21327K = str;
    }
}
