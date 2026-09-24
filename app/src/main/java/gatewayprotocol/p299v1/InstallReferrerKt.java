package gatewayprotocol.p299v1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InstallReferrerKt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m43475d2 = {"Lgatewayprotocol/v1/InstallReferrerKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class InstallReferrerKt {
    public static final InstallReferrerKt INSTANCE = new InstallReferrerKt();

    /* JADX INFO: compiled from: InstallReferrerKt.kt */
    @Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, m43475d2 = {"Lgatewayprotocol/v1/InstallReferrerKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;)V", "value", "", "clickTime", "getClickTime", "()J", "setClickTime", "(J)V", "installTime", "getInstallTime", "setInstallTime", "", "instantExperienceLunch", "getInstantExperienceLunch", "()Z", "setInstantExperienceLunch", "(Z)V", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "clearClickTime", "", "clearInstallTime", "clearInstantExperienceLunch", "clearUrl", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InitializationRequestOuterClass.InstallReferrer.Builder _builder;

        /* JADX INFO: compiled from: InstallReferrerKt.kt */
        @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, m43475d2 = {"Lgatewayprotocol/v1/InstallReferrerKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/InstallReferrerKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer$Builder;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InstallReferrer.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InstallReferrer _build() {
            InitializationRequestOuterClass.InstallReferrer installReferrerBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(installReferrerBuild, "_builder.build()");
            return installReferrerBuild;
        }

        public final void clearClickTime() {
            this._builder.clearClickTime();
        }

        public final void clearInstallTime() {
            this._builder.clearInstallTime();
        }

        public final void clearInstantExperienceLunch() {
            this._builder.clearInstantExperienceLunch();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final long getClickTime() {
            return this._builder.getClickTime();
        }

        public final long getInstallTime() {
            return this._builder.getInstallTime();
        }

        public final boolean getInstantExperienceLunch() {
            return this._builder.getInstantExperienceLunch();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "_builder.getUrl()");
            return url;
        }

        public final void setClickTime(long j) {
            this._builder.setClickTime(j);
        }

        public final void setInstallTime(long j) {
            this._builder.setInstallTime(j);
        }

        public final void setInstantExperienceLunch(boolean z) {
            this._builder.setInstantExperienceLunch(z);
        }

        public final void setUrl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUrl(value);
        }
    }

    private InstallReferrerKt() {
    }
}
