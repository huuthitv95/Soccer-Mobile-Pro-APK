package gatewayprotocol.p299v1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class RequestUrlOverrideKt {
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
    @Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m43475d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;)V", "value", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", "requestType", "getRequestType", "()Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;", "setRequestType", "(Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestType;)V", "", "requestTypeValue", "getRequestTypeValue", "()I", "setRequestTypeValue", "(I)V", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "_build", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "clearRequestType", "", "clearUrl", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/RequestUrlOverrideKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverrideBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(requestUrlOverrideBuild, "_builder.build()");
            return requestUrlOverrideBuild;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            Intrinsics.checkNotNullExpressionValue(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(InitializationResponseOuterClass.RequestType value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRequestType(value);
        }

        public final void setRequestTypeValue(int i) {
            this._builder.setRequestTypeValue(i);
        }

        public final void setUrl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUrl(value);
        }
    }

    private RequestUrlOverrideKt() {
    }
}
