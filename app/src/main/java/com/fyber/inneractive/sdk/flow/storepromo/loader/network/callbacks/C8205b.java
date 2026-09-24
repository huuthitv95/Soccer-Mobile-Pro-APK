package com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks;

import com.fyber.inneractive.sdk.flow.storepromo.events.EnumC8188a;
import com.fyber.inneractive.sdk.flow.storepromo.loader.C8195g;
import com.fyber.inneractive.sdk.flow.storepromo.loader.network.EnumC8201b;
import com.fyber.inneractive.sdk.flow.storepromo.loader.network.exception.C8207a;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8208a;
import com.fyber.inneractive.sdk.flow.storepromo.model.C8210c;
import com.fyber.inneractive.sdk.flow.storepromo.model.EnumC8209b;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.loader.network.callbacks.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8205b implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final C8195g f18285a;

    /* JADX INFO: renamed from: b */
    public final EnumC8209b f18286b;

    /* JADX INFO: renamed from: c */
    public final String f18287c;

    /* JADX INFO: renamed from: d */
    public final int f18288d;

    public C8205b(EnumC8209b enumC8209b, String str, C8195g c8195g) {
        this.f18286b = enumC8209b;
        this.f18287c = str;
        this.f18285a = c8195g;
        this.f18288d = -1;
    }

    public C8205b(EnumC8209b enumC8209b, String str, C8195g c8195g, int i) {
        this.f18286b = enumC8209b;
        this.f18287c = str;
        this.f18285a = c8195g;
        this.f18288d = i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        String message;
        EnumC8201b enumC8201b;
        boolean z2;
        String str = (String) obj;
        if (str != null && exc == null) {
            C8195g c8195g = this.f18285a;
            EnumC8209b enumC8209b = this.f18286b;
            int i = this.f18288d;
            c8195g.getClass();
            IAlog.m21945a("StorePromoResourcesLoader: onAssetDownloaded: type: %s, sortIndex: %s", enumC8209b, Integer.valueOf(i));
            C8210c c8210c = c8195g.f18256d;
            c8210c.f18295a.add(new C8208a(str, enumC8209b, i));
            if (enumC8209b == EnumC8209b.SCREENSHOT) {
                c8210c.f18303i++;
            }
            c8195g.m20616a(null, false, null, null);
            return;
        }
        EnumC8188a enumC8188a = exc instanceof C8207a ? EnumC8188a.FILE_SIZE_EXCEEDS_LIMIT : EnumC8188a.DOWNLOAD_RESOURCE_ERROR;
        EnumC8209b enumC8209b2 = this.f18286b;
        if (exc != null) {
            message = exc.getMessage() != null ? exc.getMessage() : exc.toString();
        } else {
            message = "";
        }
        String str2 = "Unable download store promo asset type: " + enumC8209b2 + ", error: " + message;
        C8195g c8195g2 = this.f18285a;
        String str3 = this.f18287c;
        int i2 = AbstractC8204a.f18284a[this.f18286b.ordinal()];
        if (i2 == 1) {
            enumC8201b = EnumC8201b.APP_ICON_FAILURE;
        } else if (i2 == 2) {
            enumC8201b = EnumC8201b.SCREENSHOT_FAILURE;
        } else if (i2 != 3) {
            enumC8201b = i2 != 4 ? EnumC8201b.UNKNOWN_FAILURE : EnumC8201b.RATING_ICON_FAILURE;
        } else {
            enumC8201b = EnumC8201b.VIDEO_FAILURE;
        }
        if (enumC8201b == EnumC8201b.SCREENSHOT_FAILURE) {
            int i3 = c8195g2.f18258f;
            int i4 = c8195g2.f18259g + 1;
            c8195g2.f18259g = i4;
            z2 = i3 - i4 < 2;
        }
        c8195g2.m20616a(enumC8188a, z2, str2, str3);
    }
}
