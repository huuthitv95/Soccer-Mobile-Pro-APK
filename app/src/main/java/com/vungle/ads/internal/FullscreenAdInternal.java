package com.vungle.ads.internal;

import android.content.Context;
import com.ironsource.C11744X3;
import com.vungle.ads.VungleAdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FullscreenAdInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\n"}, m43475d2 = {"Lcom/vungle/ads/internal/FullscreenAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAdSizeForAdRequest", "Lcom/vungle/ads/VungleAdSize;", "isValidAdSize", "", C11744X3.i.f26343O, "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public abstract class FullscreenAdInternal extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize adSize) {
        return true;
    }
}
