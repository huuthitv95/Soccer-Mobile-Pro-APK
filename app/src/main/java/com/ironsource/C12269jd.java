package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.jd */
/* JADX INFO: loaded from: classes6.dex */
public class C12269jd implements InterfaceC11408E0 {

    /* JADX INFO: renamed from: a */
    private final String f30699a;

    public C12269jd(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f30699a = placementName;
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        HashMap map = new HashMap();
        map.put("placement", this.f30699a);
        return map;
    }
}
