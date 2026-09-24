package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.i */
/* JADX INFO: loaded from: classes4.dex */
public final class C8849i implements InterfaceC8853m {
    @Override // com.fyber.inneractive.sdk.player.InterfaceC8853m
    /* JADX INFO: renamed from: a */
    public final String mo21402a(AbstractC8476q abstractC8476q, VideoClickOrigin videoClickOrigin) {
        return videoClickOrigin.name().toLowerCase(Locale.US);
    }
}
