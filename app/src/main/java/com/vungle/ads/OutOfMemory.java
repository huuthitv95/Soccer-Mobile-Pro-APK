package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m43475d2 = {"Lcom/vungle/ads/OutOfMemory;", "Lcom/vungle/ads/VungleError;", "errorMessage", "", "(Ljava/lang/String;)V", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class OutOfMemory extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutOfMemory(String errorMessage) {
        super(Sdk.SDKError.Reason.OUT_OF_MEMORY, errorMessage, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
