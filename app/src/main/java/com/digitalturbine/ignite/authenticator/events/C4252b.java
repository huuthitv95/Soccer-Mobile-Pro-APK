package com.digitalturbine.ignite.authenticator.events;

import com.digitalturbine.ignite.authenticator.logger.C4259a;
import com.digitalturbine.ignite.authenticator.utils.events.AbstractC4266a;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.events.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4252b {

    /* JADX INFO: renamed from: b */
    public static final C4252b f17341b = new C4252b();

    /* JADX INFO: renamed from: a */
    public InterfaceC4251a f17342a;

    /* JADX INFO: renamed from: a */
    public static void m20297a(EnumC4254d enumC4254d, Exception exc) {
        m20298a(enumC4254d, AbstractC4266a.m20312a(exc, null));
    }

    /* JADX INFO: renamed from: a */
    public static void m20298a(EnumC4254d enumC4254d, Object... objArr) {
        C4259a.m20308a("%s : dispatching event", "IgniteEventDispatcher");
        if (f17341b.f17342a != null) {
            EnumC8415t enumC8415tM20785a = EnumC8415t.m20785a(enumC4254d);
            if (enumC8415tM20785a == null) {
                IAlog.m21950f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", enumC4254d);
            } else {
                new C8428w(enumC8415tM20785a).m20807a(objArr).m20808a((String) null);
            }
        }
    }
}
