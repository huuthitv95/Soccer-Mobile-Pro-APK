package com.fyber.inneractive.sdk.flow.nativead.mainasset;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.nativead.C8142f;
import com.fyber.inneractive.sdk.response.nativead.C9097c;
import com.fyber.inneractive.sdk.response.nativead.C9100f;
import com.fyber.inneractive.sdk.response.nativead.C9103i;
import com.fyber.inneractive.sdk.response.nativead.C9104j;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.nativead.mainasset.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8154e {
    /* JADX INFO: renamed from: a */
    public static InterfaceC8153d m20569a(C8006r c8006r, C9104j c9104j, InneractiveAdRequest inneractiveAdRequest, C9103i c9103i, String str, C8142f c8142f) {
        C9097c c9097c;
        String str2;
        ArrayList arrayList = c9103i.f21355a;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C9100f c9100f : c9103i.f21355a) {
                if (c9100f.f21342a == 3 && c9104j.f21360Q.m21900d()) {
                    return new C8155f(c9100f, c8006r, c9104j, inneractiveAdRequest, str, c8142f);
                }
                C8006r c8006r2 = c8006r;
                C9104j c9104j2 = c9104j;
                InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest;
                String str3 = str;
                C8142f c8142f2 = c8142f;
                if (c9100f.f21342a == 2 && (c9097c = c9100f.f21345d) != null && (str2 = c9097c.f21339a) != null && !str2.trim().isEmpty()) {
                    return new C8151b(c9100f, c8142f2, c9104j2, c8006r2);
                }
                c8006r = c8006r2;
                c9104j = c9104j2;
                inneractiveAdRequest = inneractiveAdRequest2;
                str = str3;
                c8142f = c8142f2;
            }
        }
        return null;
    }
}
