package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.A */
/* JADX INFO: loaded from: classes6.dex */
public final class C11335A implements InterfaceC12245i7 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11524K8 f23774a;

    public C11335A(InterfaceC11524K8 sessionDepthService) {
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        this.f23774a = sessionDepthService;
    }

    @Override // com.ironsource.InterfaceC12245i7
    /* JADX INFO: renamed from: a */
    public void mo25235a(Map<String, Object> output) {
        Intrinsics.checkNotNullParameter(output, "output");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C11540L6.f24923J0, Integer.valueOf(this.f23774a.mo26266a(LevelPlay.AdFormat.INTERSTITIAL)));
        output.put("interstitial", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(C11540L6.f24923J0, Integer.valueOf(this.f23774a.mo26266a(LevelPlay.AdFormat.REWARDED)));
        output.put(C11540L6.f24915G0, linkedHashMap2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(C11540L6.f24923J0, Integer.valueOf(this.f23774a.mo26266a(LevelPlay.AdFormat.BANNER)));
        output.put("banner", linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(C11540L6.f24923J0, Integer.valueOf(this.f23774a.mo26266a(LevelPlay.AdFormat.NATIVE_AD)));
        output.put("nativeAd", linkedHashMap4);
    }
}
