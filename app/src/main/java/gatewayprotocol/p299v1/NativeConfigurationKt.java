package gatewayprotocol.p299v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeConfigurationKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* JADX INFO: compiled from: NativeConfigurationKt.kt */
    @Metadata(m43474d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0010\u001c\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0095\u00012\u00020\u0001:\u0006\u0094\u0001\u0095\u0001\u0096\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010a\u001a\u00020bH\u0001J\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020dJ\u0006\u0010f\u001a\u00020dJ\u0006\u0010g\u001a\u00020dJ\u0006\u0010h\u001a\u00020dJ\u0006\u0010i\u001a\u00020dJ\u0006\u0010j\u001a\u00020dJ\u0006\u0010k\u001a\u00020dJ\u0006\u0010l\u001a\u00020dJ\u0006\u0010m\u001a\u00020dJ\u0006\u0010n\u001a\u00020dJ\u0006\u0010o\u001a\u00020dJ\u0006\u0010p\u001a\u00020dJ\u0006\u0010q\u001a\u00020dJ\u0006\u0010r\u001a\u00020dJ\u0006\u0010s\u001a\u00020dJ\u0006\u0010t\u001a\u00020dJ\u0006\u0010u\u001a\u00020<J\u0006\u0010v\u001a\u00020<J\u0006\u0010w\u001a\u00020<J\u0006\u0010x\u001a\u00020<J\u0006\u0010y\u001a\u00020<J\u0006\u0010z\u001a\u00020<J\u0006\u0010{\u001a\u00020<J\u0006\u0010|\u001a\u00020<J\u0006\u0010}\u001a\u00020<J\u0006\u0010~\u001a\u00020<J\u0006\u0010\u007f\u001a\u00020<J'\u0010\u0080\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010\u0005\u001a\u00020UH\u0007¢\u0006\u0003\b\u0081\u0001J'\u0010\u0080\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0005\u001a\u00020\u0014H\u0007¢\u0006\u0003\b\u0082\u0001J/\u0010\u0083\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00132\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020U0\u0085\u0001H\u0007¢\u0006\u0003\b\u0086\u0001J/\u0010\u0083\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0085\u0001H\u0007¢\u0006\u0003\b\u0087\u0001J\u001f\u0010\u0088\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u0013H\u0007¢\u0006\u0003\b\u0089\u0001J\u001f\u0010\u0088\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007¢\u0006\u0003\b\u008a\u0001J(\u0010\u008b\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010\u0005\u001a\u00020UH\u0087\n¢\u0006\u0003\b\u008c\u0001J0\u0010\u008b\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00132\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020U0\u0085\u0001H\u0087\n¢\u0006\u0003\b\u008d\u0001J(\u0010\u008b\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0005\u001a\u00020\u0014H\u0087\n¢\u0006\u0003\b\u008e\u0001J0\u0010\u008b\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0085\u0001H\u0087\n¢\u0006\u0003\b\u008f\u0001J1\u0010\u0090\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00132\u0007\u0010\u0091\u0001\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020UH\u0087\u0002¢\u0006\u0003\b\u0092\u0001J1\u0010\u0090\u0001\u001a\u00020d*\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0007\u0010\u0091\u0001\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u0014H\u0087\u0002¢\u0006\u0003\b\u0093\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\u0005\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u00109\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u000f\"\u0004\b;\u0010\u0011R$\u0010=\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u00020<2\u0006\u0010\u0005\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010F\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020E8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u000f\"\u0004\bM\u0010\u0011R$\u0010N\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u00100\"\u0004\bP\u00102R$\u0010Q\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u00100\"\u0004\bS\u00102R\u001d\u0010T\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0\u00138F¢\u0006\u0006\u001a\u0004\bW\u0010\u0017R$\u0010X\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R$\u0010[\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R$\u0010^\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u00100\"\u0004\b`\u00102¨\u0006\u0097\u0001"}, m43475d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;)V", "value", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adOperations", "getAdOperations", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "setAdOperations", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "adPolicy", "getAdPolicy", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "setAdPolicy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;)V", "additionalStorePackages", "Lcom/google/protobuf/kotlin/DslList;", "", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "getAdditionalStorePackages", "()Lcom/google/protobuf/kotlin/DslList;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "cachedAssetsConfiguration", "getCachedAssetsConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "setCachedAssetsConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;)V", "cachedWebviewFilesConfiguration", "getCachedWebviewFilesConfiguration", "setCachedWebviewFilesConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettings", "getDebugSettings", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "setDebugSettings", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "defaultShowCompletionState", "getDefaultShowCompletionState", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "setDefaultShowCompletionState", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;)V", "", "defaultShowCompletionStateValue", "getDefaultShowCompletionStateValue", "()I", "setDefaultShowCompletionStateValue", "(I)V", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticEvents", "getDiagnosticEvents", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "setDiagnosticEvents", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "downloadPolicy", "getDownloadPolicy", "setDownloadPolicy", "", "enableIapEvent", "getEnableIapEvent", "()Z", "setEnableIapEvent", "(Z)V", "enableOm", "getEnableOm", "setEnableOm", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "setFeatureFlags", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;)V", "initPolicy", "getInitPolicy", "setInitPolicy", "maxExtrasSizeKb", "getMaxExtrasSizeKb", "setMaxExtrasSizeKb", "maxReceiptSizeMb", "getMaxReceiptSizeMb", "setMaxReceiptSizeMb", "observableAndroidActivities", "Lcom/google/protobuf/ByteString;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "getObservableAndroidActivities", "operativeEventPolicy", "getOperativeEventPolicy", "setOperativeEventPolicy", "otherPolicy", "getOtherPolicy", "setOtherPolicy", "overwriteIntentFlagActivity", "getOverwriteIntentFlagActivity", "setOverwriteIntentFlagActivity", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "clearAdOperations", "", "clearAdPolicy", "clearCachedAssetsConfiguration", "clearCachedWebviewFilesConfiguration", "clearDebugSettings", "clearDefaultShowCompletionState", "clearDiagnosticEvents", "clearDownloadPolicy", "clearEnableIapEvent", "clearEnableOm", "clearFeatureFlags", "clearInitPolicy", "clearMaxExtrasSizeKb", "clearMaxReceiptSizeMb", "clearOperativeEventPolicy", "clearOtherPolicy", "clearOverwriteIntentFlagActivity", "hasAdOperations", "hasAdPolicy", "hasCachedAssetsConfiguration", "hasCachedWebviewFilesConfiguration", "hasDebugSettings", "hasDiagnosticEvents", "hasDownloadPolicy", "hasFeatureFlags", "hasInitPolicy", "hasOperativeEventPolicy", "hasOtherPolicy", "add", "addObservableAndroidActivities", "addAdditionalStorePackages", "addAll", "values", "", "addAllObservableAndroidActivities", "addAllAdditionalStorePackages", "clear", "clearObservableAndroidActivities", "clearAdditionalStorePackages", "plusAssign", "plusAssignObservableAndroidActivities", "plusAssignAllObservableAndroidActivities", "plusAssignAdditionalStorePackages", "plusAssignAllAdditionalStorePackages", "set", "index", "setObservableAndroidActivities", "setAdditionalStorePackages", "AdditionalStorePackagesProxy", "Companion", "ObservableAndroidActivitiesProxy", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$AdditionalStorePackagesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m43475d2 = {"Lgatewayprotocol/v1/NativeConfigurationKt$Dsl$ObservableAndroidActivitiesProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addAdditionalStorePackages(value);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllAdditionalStorePackages(values);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllObservableAndroidActivities(values);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addObservableAndroidActivities(value);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final void clearMaxReceiptSizeMb() {
            this._builder.clearMaxReceiptSizeMb();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final void clearOverwriteIntentFlagActivity() {
            this._builder.clearOverwriteIntentFlagActivity();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            Intrinsics.checkNotNullExpressionValue(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            Intrinsics.checkNotNullExpressionValue(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            Intrinsics.checkNotNullExpressionValue(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            Intrinsics.checkNotNullExpressionValue(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            Intrinsics.checkNotNullExpressionValue(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            Intrinsics.checkNotNullExpressionValue(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            Intrinsics.checkNotNullExpressionValue(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            Intrinsics.checkNotNullExpressionValue(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            Intrinsics.checkNotNullExpressionValue(downloadPolicy, "_builder.getDownloadPolicy()");
            return downloadPolicy;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            Intrinsics.checkNotNullExpressionValue(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            Intrinsics.checkNotNullExpressionValue(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final int getMaxReceiptSizeMb() {
            return this._builder.getMaxReceiptSizeMb();
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            Intrinsics.checkNotNullExpressionValue(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            Intrinsics.checkNotNullExpressionValue(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            Intrinsics.checkNotNullExpressionValue(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final int getOverwriteIntentFlagActivity() {
            return this._builder.getOverwriteIntentFlagActivity();
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addAdditionalStorePackages(dslList, value);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllAdditionalStorePackages(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllObservableAndroidActivities(dslList, values);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addObservableAndroidActivities(dslList, value);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdOperations(value);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdPolicy(value);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdditionalStorePackages(i, value);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCachedAssetsConfiguration(value);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCachedWebviewFilesConfiguration(value);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDebugSettings(value);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDefaultShowCompletionState(value);
        }

        public final void setDefaultShowCompletionStateValue(int i) {
            this._builder.setDefaultShowCompletionStateValue(i);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDiagnosticEvents(value);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDownloadPolicy(value);
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFeatureFlags(value);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitPolicy(value);
        }

        public final void setMaxExtrasSizeKb(int i) {
            this._builder.setMaxExtrasSizeKb(i);
        }

        public final void setMaxReceiptSizeMb(int i) {
            this._builder.setMaxReceiptSizeMb(i);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i, ByteString value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setObservableAndroidActivities(i, value);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOperativeEventPolicy(value);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setOtherPolicy(value);
        }

        public final void setOverwriteIntentFlagActivity(int i) {
            this._builder.setOverwriteIntentFlagActivity(i);
        }
    }

    private NativeConfigurationKt() {
    }
}
