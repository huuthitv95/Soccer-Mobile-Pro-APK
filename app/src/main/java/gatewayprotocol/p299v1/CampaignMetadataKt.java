package gatewayprotocol.p299v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CampaignMetadataKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CampaignMetadataKt {
    public static final CampaignMetadataKt INSTANCE = new CampaignMetadataKt();

    /* JADX INFO: compiled from: CampaignMetadataKt.kt */
    @Metadata(m43474d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\f\b\u0007\u0018\u0000 42\u00020\u0001:\u000234B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0001J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J%\u0010%\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0002\b&J+\u0010'\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0)H\u0007¢\u0006\u0002\b*J\u001d\u0010+\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0002\b,J&\u0010-\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0005\u001a\u00020\u000eH\u0087\n¢\u0006\u0002\b.J,\u0010-\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0)H\u0087\n¢\u0006\u0002\b/J.\u00100\u001a\u00020!*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0002\b2R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR$\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000b¨\u00065"}, m43475d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;)V", "value", "", "adDataRefreshDelayMs", "getAdDataRefreshDelayMs", "()I", "setAdDataRefreshDelayMs", "(I)V", "assetsToCache", "Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "getAssetsToCache", "()Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/ByteString;", "campaignStateData", "getCampaignStateData", "()Lcom/google/protobuf/ByteString;", "setCampaignStateData", "(Lcom/google/protobuf/ByteString;)V", "campaignStateDataVersion", "getCampaignStateDataVersion", "setCampaignStateDataVersion", "ttlSeconds", "getTtlSeconds", "setTtlSeconds", "_build", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "clearAdDataRefreshDelayMs", "", "clearCampaignStateData", "clearCampaignStateDataVersion", "clearTtlSeconds", "add", "addAssetsToCache", "addAll", "values", "", "addAllAssetsToCache", "clear", "clearAssetsToCache", "plusAssign", "plusAssignAssetsToCache", "plusAssignAllAssetsToCache", "set", "index", "setAssetsToCache", "AssetsToCacheProxy", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CampaignMetadataOuterClass.CampaignMetadata.Builder _builder;

        /* JADX INFO: compiled from: CampaignMetadataKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$AssetsToCacheProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class AssetsToCacheProxy extends DslProxy {
            private AssetsToCacheProxy() {
            }
        }

        /* JADX INFO: compiled from: CampaignMetadataKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/CampaignMetadataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/CampaignMetadataKt$Dsl;", "builder", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(CampaignMetadataOuterClass.CampaignMetadata.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ CampaignMetadataOuterClass.CampaignMetadata _build() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadataBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(campaignMetadataBuild, "_builder.build()");
            return campaignMetadataBuild;
        }

        public final /* synthetic */ void addAllAssetsToCache(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAssetsToCache(values);
        }

        public final /* synthetic */ void addAssetsToCache(DslList dslList, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAssetsToCache(value);
        }

        public final void clearAdDataRefreshDelayMs() {
            this._builder.clearAdDataRefreshDelayMs();
        }

        public final /* synthetic */ void clearAssetsToCache(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAssetsToCache();
        }

        public final void clearCampaignStateData() {
            this._builder.clearCampaignStateData();
        }

        public final void clearCampaignStateDataVersion() {
            this._builder.clearCampaignStateDataVersion();
        }

        public final void clearTtlSeconds() {
            this._builder.clearTtlSeconds();
        }

        public final int getAdDataRefreshDelayMs() {
            return this._builder.getAdDataRefreshDelayMs();
        }

        public final /* synthetic */ DslList getAssetsToCache() {
            List<CampaignMetadataOuterClass.CampaignAsset> assetsToCacheList = this._builder.getAssetsToCacheList();
            Intrinsics.checkNotNullExpressionValue(assetsToCacheList, "_builder.getAssetsToCacheList()");
            return new DslList(assetsToCacheList);
        }

        public final ByteString getCampaignStateData() {
            ByteString campaignStateData = this._builder.getCampaignStateData();
            Intrinsics.checkNotNullExpressionValue(campaignStateData, "_builder.getCampaignStateData()");
            return campaignStateData;
        }

        public final int getCampaignStateDataVersion() {
            return this._builder.getCampaignStateDataVersion();
        }

        public final int getTtlSeconds() {
            return this._builder.getTtlSeconds();
        }

        public final /* synthetic */ void plusAssignAllAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, Iterable<CampaignMetadataOuterClass.CampaignAsset> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAssetsToCache(dslList, values);
        }

        public final /* synthetic */ void plusAssignAssetsToCache(DslList<CampaignMetadataOuterClass.CampaignAsset, AssetsToCacheProxy> dslList, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAssetsToCache(dslList, value);
        }

        public final void setAdDataRefreshDelayMs(int i) {
            this._builder.setAdDataRefreshDelayMs(i);
        }

        public final /* synthetic */ void setAssetsToCache(DslList dslList, int i, CampaignMetadataOuterClass.CampaignAsset value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAssetsToCache(i, value);
        }

        public final void setCampaignStateData(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCampaignStateData(value);
        }

        public final void setCampaignStateDataVersion(int i) {
            this._builder.setCampaignStateDataVersion(i);
        }

        public final void setTtlSeconds(int i) {
            this._builder.setTtlSeconds(i);
        }
    }

    private CampaignMetadataKt() {
    }
}
