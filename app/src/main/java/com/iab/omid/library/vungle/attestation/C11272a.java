package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.a */
/* JADX INFO: loaded from: classes6.dex */
public class C11272a {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f23624a;

    public C11272a(Map<String, String> map) {
        this.f23624a = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m24946a() {
        return this.f23624a;
    }
}
