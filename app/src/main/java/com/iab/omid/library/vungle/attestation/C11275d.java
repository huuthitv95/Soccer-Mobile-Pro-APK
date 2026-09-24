package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.iab.omid.library.vungle.utils.C11313d;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11275d {
    /* JADX INFO: renamed from: a */
    public InterfaceC11273b m24956a(String str, Context context) {
        try {
            if (str == null) {
                C11313d.m25148b("Cannot create mechanism: Mechanism name cannot be null");
                return null;
            }
            if (context == null) {
                C11313d.m25148b("Cannot create mechanism: Context cannot be null");
                return null;
            }
            if ("FireTVFOSDAT".equals(str)) {
                return new C11280i(context);
            }
            return null;
        } catch (Exception e) {
            C11313d.m25147a("Error creating attestation mechanism: " + str, e);
            return null;
        }
    }
}
