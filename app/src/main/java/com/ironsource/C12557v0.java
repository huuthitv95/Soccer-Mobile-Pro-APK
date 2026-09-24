package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12557v0 implements InterfaceC11429F3 {

    /* JADX INFO: renamed from: a */
    private final C12461rb f32585a;

    /* JADX INFO: renamed from: b */
    private final Map<LevelPlay.AdFormat, C12538u> f32586b;

    public C12557v0(C12461rb tools, Map<LevelPlay.AdFormat, C12538u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f32585a = tools;
        this.f32586b = adFormatsConfigurations;
    }

    /* JADX INFO: renamed from: b */
    private final void m33921b(InterfaceC12403o7.a aVar, String str, C12538u.d dVar) throws JSONException {
        C11736Wc c11736WcM33837e = dVar.m33837e();
        if (c11736WcM33837e != null) {
            EnumC11483I3 enumC11483I3 = EnumC11483I3.Pacing;
            m33920a(aVar.mo25657a(str, enumC11483I3, new C12632z3(c11736WcM33837e.m27836a(), c11736WcM33837e.m27837b(), c11736WcM33837e.m27838c())), str, enumC11483I3);
        }
    }

    @Override // com.ironsource.InterfaceC11429F3
    /* JADX INFO: renamed from: a */
    public void mo25766a(InterfaceC12403o7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C12538u>> it = this.f32586b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C12538u.d> entry : it.next().getValue().m33828a().entrySet()) {
                String key = entry.getKey();
                C12538u.d value = entry.getValue();
                m33919a(cappingService, key, value);
                m33921b(cappingService, key, value);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33919a(InterfaceC12403o7.a aVar, String str, C12538u.d dVar) throws JSONException {
        C11375C3 c11375c3M33834b = dVar.m33834b();
        if (c11375c3M33834b != null) {
            EnumC11483I3 enumC11483I3 = EnumC11483I3.ShowCount;
            m33920a(aVar.mo25657a(str, enumC11483I3, new C12632z3(c11375c3M33834b.m25554a(), c11375c3M33834b.m25555b(), c11375c3M33834b.m25556c())), str, enumC11483I3);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33920a(Object obj, String str, EnumC11483I3 enumC11483I3) throws JSONException {
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(obj);
        if (thM44949exceptionOrNullimpl != null) {
            this.f32585a.m33235a(str, new C11393D3().m25598a(enumC11483I3), thM44949exceptionOrNullimpl.getMessage());
        }
    }
}
