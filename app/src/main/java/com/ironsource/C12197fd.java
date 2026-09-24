package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.fd */
/* JADX INFO: loaded from: classes6.dex */
public final class C12197fd {

    /* JADX INFO: renamed from: a */
    private final C12461rb f30406a;

    /* JADX INFO: renamed from: b */
    private final Map<LevelPlay.AdFormat, C12538u> f30407b;

    public C12197fd(C12461rb tools, Map<LevelPlay.AdFormat, C12538u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f30406a = tools;
        this.f30407b = adFormatsConfigurations;
    }

    /* JADX INFO: renamed from: b */
    private final void m31509b(InterfaceC11487I7.a aVar, String str, LevelPlay.AdFormat adFormat, C12538u.d dVar) throws JSONException {
        EnumC11483I3 enumC11483I3 = EnumC11483I3.Delivery;
        C11538L4 c11538l4M33835c = dVar.m33835c();
        m31508a(aVar.mo26075a(str, adFormat, enumC11483I3, new C12632z3(c11538l4M33835c != null ? Boolean.valueOf(c11538l4M33835c.m26349a()) : null, null, null, 6, null)), str, adFormat, enumC11483I3);
    }

    /* JADX INFO: renamed from: c */
    private final void m31510c(InterfaceC11487I7.a aVar, String str, LevelPlay.AdFormat adFormat, C12538u.d dVar) throws JSONException {
        C11736Wc c11736WcM33837e = dVar.m33837e();
        if (c11736WcM33837e != null) {
            EnumC11483I3 enumC11483I3 = EnumC11483I3.Pacing;
            m31508a(aVar.mo26075a(str, adFormat, enumC11483I3, new C12632z3(c11736WcM33837e.m27836a(), c11736WcM33837e.m27837b(), EnumC11465H3.Second)), str, adFormat, enumC11483I3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31511a(InterfaceC11487I7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C12538u> entry : this.f30407b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C12538u.d> entry2 : entry.getValue().m33830c().entrySet()) {
                String key2 = entry2.getKey();
                C12538u.d value = entry2.getValue();
                m31509b(cappingService, key2, key, value);
                m31507a(cappingService, key2, key, value);
                m31510c(cappingService, key2, key, value);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m31507a(InterfaceC11487I7.a aVar, String str, LevelPlay.AdFormat adFormat, C12538u.d dVar) throws JSONException {
        C11375C3 c11375c3M33834b = dVar.m33834b();
        if (c11375c3M33834b != null) {
            EnumC11483I3 enumC11483I3 = EnumC11483I3.ShowCount;
            m31508a(aVar.mo26075a(str, adFormat, enumC11483I3, new C12632z3(c11375c3M33834b.m25554a(), c11375c3M33834b.m25555b(), c11375c3M33834b.m25556c())), str, adFormat, enumC11483I3);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m31508a(Object obj, String str, LevelPlay.AdFormat adFormat, EnumC11483I3 enumC11483I3) throws JSONException {
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(obj);
        if (thM44949exceptionOrNullimpl != null) {
            this.f30406a.m33236a(str, adFormat, new C11393D3().m25598a(enumC11483I3), thM44949exceptionOrNullimpl.getMessage());
        }
    }
}
