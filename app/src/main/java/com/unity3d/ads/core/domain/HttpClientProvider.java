package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.core.HttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: HttpClientProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/HttpClientProvider;", "", "invoke", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface HttpClientProvider {
    Object invoke(Continuation<? super HttpClient> continuation);
}
