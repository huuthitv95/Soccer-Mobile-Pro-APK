package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommonAlternativeFlowReader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\rH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m43475d2 = {"Lcom/unity3d/ads/core/configuration/CommonAlternativeFlowReader;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "configurationReader", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "mediationMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "forceAlternativeFlow", "Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;", "(Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;Lcom/unity3d/ads/core/configuration/ForceAlternativeFlow;)V", "isAlternativeFlowEnabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isAlternativeFlowRead", "invoke", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonAlternativeFlowReader implements AlternativeFlowReader {
    private final ConfigurationReader configurationReader;
    private final ForceAlternativeFlow forceAlternativeFlow;
    private final MutableStateFlow<Boolean> isAlternativeFlowEnabled;
    private final MutableStateFlow<Boolean> isAlternativeFlowRead;
    private final MediationTraitsMetadataReader mediationMetadataReader;
    private final SessionRepository sessionRepository;

    public CommonAlternativeFlowReader(ConfigurationReader configurationReader, SessionRepository sessionRepository, MediationTraitsMetadataReader mediationMetadataReader, ForceAlternativeFlow forceAlternativeFlow) {
        Intrinsics.checkNotNullParameter(configurationReader, "configurationReader");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationMetadataReader, "mediationMetadataReader");
        Intrinsics.checkNotNullParameter(forceAlternativeFlow, "forceAlternativeFlow");
        this.configurationReader = configurationReader;
        this.sessionRepository = sessionRepository;
        this.mediationMetadataReader = mediationMetadataReader;
        this.forceAlternativeFlow = forceAlternativeFlow;
        this.isAlternativeFlowRead = StateFlowKt.MutableStateFlow(false);
        this.isAlternativeFlowEnabled = StateFlowKt.MutableStateFlow(true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    @Override // com.unity3d.ads.core.configuration.AlternativeFlowReader
    public boolean invoke() throws JSONException {
        if (this.isAlternativeFlowRead.getValue().booleanValue()) {
            return this.isAlternativeFlowEnabled.getValue().booleanValue();
        }
        if (this.forceAlternativeFlow.getForceAlternativeFlow()) {
            this.isAlternativeFlowEnabled.setValue(true);
            this.isAlternativeFlowRead.setValue(true);
            return true;
        }
        MediationTraitsMetadataReader mediationTraitsMetadataReader = this.mediationMetadataReader;
        Object obj = mediationTraitsMetadataReader.getJsonStorage().get(mediationTraitsMetadataReader.getKey());
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.has(MediationTraitsMetadataReader.BOLD_SDK_ENABLED) ? jSONObject : null;
            if (jSONObject2 != null) {
                this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(jSONObject2.optBoolean(MediationTraitsMetadataReader.BOLD_SDK_ENABLED)));
                this.isAlternativeFlowRead.setValue(true);
            }
        }
        if (!this.isAlternativeFlowRead.getValue().booleanValue()) {
            if (this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled()) {
                this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled()));
            } else {
                this.isAlternativeFlowEnabled.setValue(false);
            }
            this.isAlternativeFlowRead.setValue(true);
        }
        return this.isAlternativeFlowEnabled.getValue().booleanValue();
    }
}
