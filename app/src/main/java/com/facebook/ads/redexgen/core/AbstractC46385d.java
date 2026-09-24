package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5d */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC46385d {
    public static void A00(InterfaceC7408pF interfaceC7408pF) {
        if (interfaceC7408pF != null) {
            try {
                interfaceC7408pF.close();
            } catch (IOException unused) {
            }
        }
    }
}
