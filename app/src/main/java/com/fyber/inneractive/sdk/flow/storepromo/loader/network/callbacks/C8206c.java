package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.events.EnumC8188a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.C8195g;
import com.fyber.inneractive.sdk.flow.storepromo.loader.network.EnumC8201b;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8206c implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final C8195g f18289a;

    /* JADX INFO: renamed from: b */
    public boolean f18290b = false;

    /* JADX INFO: renamed from: c */
    public final String f18291c;

    public C8206c(C8195g c8195g, String str) {
        this.f18289a = c8195g;
        this.f18291c = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String message;
        boolean z2;
        String str = (String) obj;
        if (this.f18290b) {
            IAlog.m21945a("StorePromoTemplateCallback: onNetworkResult: the cached response was applied and this one being cached", new Object[0]);
            return;
        }
        IAlog.m21945a("StorePromoTemplateCallback: onNetworkResult: fromCache: " + z, new Object[0]);
        this.f18290b = true;
        if (str != null && exc == null) {
            C8195g c8195g = this.f18289a;
            c8195g.getClass();
            IAlog.m21945a("StorePromoResourcesLoader: onTemplateDownloaded", new Object[0]);
            c8195g.f18256d.f18297c = str;
            c8195g.m20616a(null, false, null, null);
            return;
        }
        if (exc != null) {
            message = exc.getMessage() != null ? exc.getMessage() : exc.toString();
        } else {
            message = "";
        }
        String str2 = "Unable download store promo template, error: " + message;
        C8195g c8195g2 = this.f18289a;
        EnumC8188a enumC8188a = EnumC8188a.DOWNLOAD_RESOURCE_ERROR;
        String str3 = this.f18291c;
        if (EnumC8201b.TEMPLATE_FAILURE == EnumC8201b.SCREENSHOT_FAILURE) {
            int i = c8195g2.f18258f;
            int i2 = c8195g2.f18259g + 1;
            c8195g2.f18259g = i2;
            z2 = i - i2 < 2;
        }
        c8195g2.m20616a(enumC8188a, z2, str2, str3);
    }
}
