package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.p299v1.AdFormatOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScarEligibleEffectiveUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦\u0002¨\u0006\u0007"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "", "invoke", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface ScarEligibleEffectiveUseCase {
    List<AdFormatOuterClass.AdFormat> invoke(TokenConfiguration tokenConfiguration);
}
