package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import gatewayprotocol.p299v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: GetAdPlayer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦\u0002¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/GetAdPlayer;", "", "invoke", "Lcom/unity3d/ads/adplayer/AdPlayer;", "webviewBridge", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "webviewContainer", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "opportunityId", "Lcom/google/protobuf/ByteString;", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface GetAdPlayer {
    AdPlayer invoke(WebViewBridge webviewBridge, AndroidWebViewContainer webviewContainer, ByteString opportunityId, DiagnosticEventRequestOuterClass.DiagnosticAdType adType);
}
