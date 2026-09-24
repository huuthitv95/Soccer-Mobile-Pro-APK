package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.tb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4070tb {

    /* JADX INFO: renamed from: b */
    public static final a f16330b = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f16331a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.tb$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19466a() {
            return new C4070tb("window.mraidbridge.notifyReadyEvent();");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19467a(C3687cd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            C3685cb c3685cbM17284b = screenMetrics.m17167c().m17284b();
            return new C4070tb("window.mraidbridge.notifySizeChangeEvent(" + c3685cbM17284b.m17064b() + ", " + c3685cbM17284b.m17062a() + ");");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19468a(EnumC4027rc orientation, boolean z) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            return m19473a("{orientation: '" + orientation.m19333b() + "', locked: " + z + "}");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19469a(EnumC4049sc placementType) {
            Intrinsics.checkNotNullParameter(placementType, "placementType");
            return new C4070tb("window.mraidbridge.setPlacementType('" + placementType.m19425b() + "');");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19470a(EnumC4071tc state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return m19473a("{state: '" + state.m19482b() + "'}");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19471a(EnumC4203zc command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new C4070tb("window.mraidbridge.nativeCallComplete({" + command.m20133b() + "});");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19472a(Float f) {
            String str;
            if (f != null) {
                float fFloatValue = f.floatValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = AbstractJsonLexerKt.NULL;
            }
            return new C4070tb("window.mraidbridge.notifyAudioVolumeChangeEvent(" + str + ");");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19473a(String str) {
            return new C4070tb("window.mraidbridge.fireChangeEvent(" + str + ");");
        }

        /* JADX INFO: renamed from: a */
        public final C4070tb m19474a(boolean z) {
            String lowerCase = String.valueOf(z).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return m19473a("{viewable: " + lowerCase + "}");
        }

        /* JADX INFO: renamed from: b */
        public final C4070tb m19475b() {
            return m19473a("{hostSDKName: 'Chartboost-Android-SDK'}");
        }

        /* JADX INFO: renamed from: b */
        public final C4070tb m19476b(C3687cd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            C3685cb c3685cbM17284b = screenMetrics.m17160a().m17284b();
            return new C4070tb("window.mraidbridge.setCurrentPosition(" + c3685cbM17284b.m17066c() + ", " + c3685cbM17284b.m17068d() + ", " + c3685cbM17284b.m17064b() + ", " + c3685cbM17284b.m17062a() + ");");
        }

        /* JADX INFO: renamed from: b */
        public final C4070tb m19477b(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return m19473a("{hostSDKVersion: '" + sdkVersion + "'}");
        }

        /* JADX INFO: renamed from: c */
        public final C4070tb m19478c(C3687cd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            C3685cb c3685cbM17284b = screenMetrics.m17164b().m17284b();
            return new C4070tb("window.mraidbridge.setDefaultPosition(" + c3685cbM17284b.m17066c() + ", " + c3685cbM17284b.m17068d() + ", " + c3685cbM17284b.m17064b() + ", " + c3685cbM17284b.m17062a() + ");");
        }

        /* JADX INFO: renamed from: d */
        public final C4070tb m19479d(C3687cd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            C3685cb c3685cbM17284b = screenMetrics.m17167c().m17284b();
            return new C4070tb("window.mraidbridge.setMaxSize(" + c3685cbM17284b.m17064b() + ", " + c3685cbM17284b.m17062a() + ");");
        }

        /* JADX INFO: renamed from: e */
        public final C4070tb m19480e(C3687cd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            C3685cb c3685cbM17284b = screenMetrics.m17168d().m17284b();
            return new C4070tb("window.mraidbridge.setScreenSize(" + c3685cbM17284b.m17064b() + ", " + c3685cbM17284b.m17062a() + ");");
        }
    }

    public C4070tb(String javascript) {
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        this.f16331a = javascript;
    }

    /* JADX INFO: renamed from: a */
    public final String m19465a() {
        return this.f16331a;
    }
}
