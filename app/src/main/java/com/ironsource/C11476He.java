package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.He */
/* JADX INFO: loaded from: classes6.dex */
public final class C11476He {
    /* JADX INFO: renamed from: a */
    public final AbstractC12254ig m26011a(C11440Fe response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC12236hg abstractC12236hgM26009a = m26009a(response.m25800d(), response.m25801e());
        return abstractC12236hgM26009a == null ? AbstractC12254ig.b.f30597a : new AbstractC12254ig.a(abstractC12236hgM26009a);
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC12236hg m26009a(C11609P3 c11609p3, C12534td c12534td) {
        C11609P3.a aVarM26821e = c11609p3.m26821e();
        if (aVarM26821e == null) {
            return null;
        }
        AbstractC12236hg abstractC12236hgM26010a = m26010a(LevelPlay.AdFormat.REWARDED, c12534td.m33819h(), aVarM26821e.m26834h());
        if (abstractC12236hgM26010a != null) {
            return abstractC12236hgM26010a;
        }
        AbstractC12236hg abstractC12236hgM26010a2 = m26010a(LevelPlay.AdFormat.INTERSTITIAL, c12534td.m33817f(), aVarM26821e.m26832f());
        if (abstractC12236hgM26010a2 != null) {
            return abstractC12236hgM26010a2;
        }
        AbstractC12236hg abstractC12236hgM26010a3 = m26010a(LevelPlay.AdFormat.BANNER, c12534td.m33816e(), aVarM26821e.m26831e());
        if (abstractC12236hgM26010a3 != null) {
            return abstractC12236hgM26010a3;
        }
        AbstractC12236hg abstractC12236hgM26010a4 = m26010a(LevelPlay.AdFormat.NATIVE_AD, c12534td.m33818g(), aVarM26821e.m26833g());
        if (abstractC12236hgM26010a4 != null) {
            return abstractC12236hgM26010a4;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC12236hg m26010a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, C11609P3.a.InterfaceC15510a interfaceC15510a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((List) it.next()).isEmpty()) {
                    if (interfaceC15510a == null) {
                        break;
                    }
                    List<C11609P3.a.e> listMo26835a = interfaceC15510a.mo26835a();
                    if (listMo26835a != null) {
                        if (!listMo26835a.isEmpty()) {
                            break;
                        }
                        return new AbstractC12236hg.a(adFormat);
                    }
                    return new AbstractC12236hg.b(adFormat);
                }
            }
        }
        return null;
    }
}
