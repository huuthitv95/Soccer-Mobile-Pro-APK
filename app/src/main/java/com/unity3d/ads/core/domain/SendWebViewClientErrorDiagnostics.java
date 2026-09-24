package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SendWebViewClientErrorDiagnostics.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH¦\u0002¨\u0006\t"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/SendWebViewClientErrorDiagnostics;", "", "invoke", "", "errors", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface SendWebViewClientErrorDiagnostics {
    void invoke(List<WebViewClientError> errors, AdObject adObject);
}
