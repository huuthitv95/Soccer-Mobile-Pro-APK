package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.iab.omid.library.vungle.utils.C11313d;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11276e {

    /* JADX INFO: renamed from: a */
    private static final C11275d f23630a = new C11275d();

    /* JADX INFO: renamed from: a */
    public static void m24957a(Context context, String str, C11272a c11272a) {
        String str2;
        String str3;
        if (context == null) {
            str3 = "Attestation failed: Application Context cannot be null";
        } else if (str != null) {
            try {
                if (str.trim().isEmpty()) {
                    str3 = "Attestation failed: Mechanism name cannot be null or empty";
                } else {
                    if (c11272a != null) {
                        if (C11274c.m24951a(context).m24954a(str)) {
                            InterfaceC11273b interfaceC11273bM24956a = f23630a.m24956a(str, context);
                            if (interfaceC11273bM24956a != null) {
                                interfaceC11273bM24956a.mo24948a(c11272a);
                                return;
                            } else {
                                str2 = "Failed to create mechanism: " + str;
                            }
                        } else {
                            str2 = "Mechanism not supported on this device: " + str;
                        }
                        C11313d.m25150d(str2);
                        return;
                    }
                    str3 = "Attestation failed: Attestation arguments cannot be null";
                }
            } catch (Exception e) {
                C11313d.m25147a("Error during attestation with mechanism: " + str, e);
                return;
            }
        } else {
            str3 = "Attestation failed: Mechanism name cannot be null or empty";
        }
        C11313d.m25148b(str3);
    }
}
