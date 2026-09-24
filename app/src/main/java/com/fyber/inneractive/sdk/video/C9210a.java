package com.fyber.inneractive.sdk.video;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.cache.C8452n;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.EnumC9204x;
import com.fyber.inneractive.sdk.util.InterfaceC9201w;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.video.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C9210a implements InterfaceC9201w {
    @Override // com.fyber.inneractive.sdk.util.InterfaceC9201w
    /* JADX INFO: renamed from: a */
    public final boolean mo20714a() {
        return TextUtils.equals("vid_cache", "vid_cache") && C8452n.f18811f.f18814c && AbstractC9186s.m22012a();
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9201w
    /* JADX INFO: renamed from: b */
    public final EnumC9204x mo20715b() {
        return EnumC9204x.Video;
    }
}
