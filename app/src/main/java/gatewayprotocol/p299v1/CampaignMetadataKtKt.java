package gatewayprotocol.p299v1;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CampaignMetadataKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m43475d2 = {"campaignMetadata", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "block", "Lkotlin/Function1;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecampaignMetadata", "copy", "unity-ads_defaultRelease"}, m43476k = 2, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CampaignMetadataKtKt {
    /* JADX INFO: renamed from: -initializecampaignMetadata, reason: not valid java name */
    public static final CampaignMetadataOuterClass.CampaignMetadata m44889initializecampaignMetadata(Function1<? super CampaignMetadataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builderNewBuilder = CampaignMetadataOuterClass.CampaignMetadata.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        CampaignMetadataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignMetadataOuterClass.CampaignMetadata copy(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata, Function1<? super CampaignMetadataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(campaignMetadata, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        CampaignMetadataKt.Dsl.Companion companion = CampaignMetadataKt.Dsl.INSTANCE;
        CampaignMetadataOuterClass.CampaignMetadata.Builder builder = campaignMetadata.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        CampaignMetadataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
