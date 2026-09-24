package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AdPlayerError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m43475d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/LoadWebViewError;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public abstract class AdPlayerError extends Exception {
    private AdPlayerError(String str) {
        super(str);
    }

    public /* synthetic */ AdPlayerError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
