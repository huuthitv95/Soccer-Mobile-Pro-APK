package com.fyber.inneractive.sdk.mraid;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.web.AbstractC9239i0;
import com.fyber.inneractive.sdk.web.InterfaceC9218b0;
import com.fyber.inneractive.sdk.web.InterfaceC9243j1;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C8342r extends AbstractC8326e {
    public C8342r(LinkedHashMap linkedHashMap, AbstractC9239i0 abstractC9239i0, C9152g1 c9152g1) {
        super(linkedHashMap, abstractC9239i0, c9152g1);
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8328f
    /* JADX INFO: renamed from: a */
    public final void mo20721a() {
        String str = (String) this.f18601b.get(ShareConstants.MEDIA_URI);
        if (TextUtils.isEmpty(str)) {
            this.f18602c.m22071a(EnumC8335k.PLAY_VIDEO, "Video can't be played with null or empty URL");
            return;
        }
        InterfaceC9243j1 interfaceC9243j1 = ((IAmraidWebViewController) this.f18602c).f21570g;
        if (interfaceC9243j1 != null) {
            ((InterfaceC9218b0) interfaceC9243j1).mo20925a(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8326e
    /* JADX INFO: renamed from: c */
    public final String mo20718c() {
        return (String) this.f18601b.get(ShareConstants.MEDIA_URI);
    }
}
