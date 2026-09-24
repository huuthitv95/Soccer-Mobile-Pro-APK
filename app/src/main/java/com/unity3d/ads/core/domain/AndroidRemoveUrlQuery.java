package com.unity3d.ads.core.domain;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidRemoveUrlQuery.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¨\u0006\u0006"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidRemoveUrlQuery;", "Lcom/unity3d/ads/core/domain/RemoveUrlQuery;", "()V", "invoke", "", "url", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String string = Uri.parse(url).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
