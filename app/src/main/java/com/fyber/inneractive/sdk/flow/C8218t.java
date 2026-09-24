package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.C8376g;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.network.events.EnumC8372b;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8898d;
import com.fyber.inneractive.sdk.player.p277ui.remote.C8901g;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8218t implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8220u f18320a;

    public C8218t(C8220u c8220u) {
        this.f18320a = c8220u;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        IAlog.m21945a("IAVideoContentLoader : Remote ui template callback onNetworkResult from cache: %s", Boolean.valueOf(z));
        if (exc instanceof C8376g) {
            return;
        }
        C8220u c8220u = this.f18320a;
        c8220u.getClass();
        if (TextUtils.isEmpty(str) && z) {
            c8220u.m20624a(exc, "Fetched cached template is ".concat(str == null ? AbstractJsonLexerKt.NULL : "empty"), true);
            return;
        }
        C8901g c8901gM20625i = c8220u.m20625i();
        if (c8901gM20625i == null) {
            c8220u.m20624a(null, "Flow Manager is null", z);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            boolean z2 = c8901gM20625i.f20953a.f20932i;
            StringBuilder sb = new StringBuilder("Unknown error while receiving template: templateContent is: ");
            sb.append(TextUtils.isEmpty(str) ? "null or empty" : "not null and not empty");
            sb.append(" isFromCache: ");
            sb.append(z2);
            c8220u.m20624a(exc, sb.toString(), z2);
            return;
        }
        C8898d c8898d = c8901gM20625i.f20953a;
        c8898d.f20932i = z;
        IAlog.m21945a("%s : schedule UI load timeout task with delay: %d", "RemoteUIWebviewController", 10000);
        AbstractC9183r.f21478b.postDelayed(c8898d.f20934k, 10000);
        try {
            c8898d.f20925b.loadData(str, "text/html", "UTF-8");
        } catch (Throwable th) {
            IAlog.m21945a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
            AbstractC9183r.f21478b.removeCallbacks(c8898d.f20934k);
            c8898d.mo21463a(EnumC8372b.WEB_VIEW_CRASH_ERROR, "Unable load data: " + th.getMessage(), true, null);
        }
    }
}
