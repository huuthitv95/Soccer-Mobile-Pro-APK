package com.chartboost.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.C3662bb;
import com.chartboost.sdk.impl.C3678c4;
import com.chartboost.sdk.impl.C3773g7;
import com.chartboost.sdk.impl.C3794h5;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.C4172y3;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J(\u0010\u001a\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m43475d2 = {"Lcom/chartboost/sdk/Chartboost;", "", "()V", "INSTANCE_ID_KEY", "", "instanceId", "addDataUseConsent", "", "context", "Landroid/content/Context;", "dataUseConsent", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "clearDataUseConsent", "privacyStandard", "getBidderToken", "getDataUseConsent", "getInstanceId", "getInstanceId$ChartboostMonetization_9_11_1_productionRelease", "getSDKVersion", "initContainer", "isSdkStarted", "", "loadInstanceId", "setLoggingLevel", "level", "Lcom/chartboost/sdk/LoggingLevel;", "startWithAppId", RemoteConfigConstants.RequestFieldKey.APP_ID, "appSignature", "onStarted", "Lcom/chartboost/sdk/callbacks/StartCallback;", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public final class Chartboost {
    public static final Chartboost INSTANCE = new Chartboost();
    private static final String INSTANCE_ID_KEY = "ChartboostInstanceId";
    private static String instanceId;

    private Chartboost() {
    }

    @JvmStatic
    public static final void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataUseConsent, "dataUseConsent");
        INSTANCE.initContainer(context);
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (c3678c4.m17029i()) {
            c3678c4.m17031k().mo20056a().m19699a(dataUseConsent);
        }
    }

    @JvmStatic
    public static final void clearDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (c3678c4.m17029i()) {
            c3678c4.m17031k().mo20056a().m19701b(privacyStandard);
        }
    }

    @JvmStatic
    public static final String getBidderToken() {
        if (isSdkStarted()) {
            return C3678c4.f13658b.m17033m().mo18513c().m20018a();
        }
        C4048sb.m19411b("Chartboost getBidderToken failed due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
        return null;
    }

    @JvmStatic
    public static final DataUseConsent getDataUseConsent(Context context, String privacyStandard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(privacyStandard, "privacyStandard");
        INSTANCE.initContainer(context);
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (c3678c4.m17029i()) {
            return c3678c4.m17031k().mo20056a().m19697a(privacyStandard);
        }
        return null;
    }

    @JvmStatic
    public static final String getSDKVersion() {
        return "9.11.1";
    }

    private final void initContainer(final Context context) {
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (c3678c4.m17029i()) {
            return;
        }
        c3678c4.m17020a(context);
        c3678c4.m17027g().mo19461b().execute(new Runnable() { // from class: com.chartboost.sdk.Chartboost$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Chartboost.initContainer$lambda$0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initContainer$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        INSTANCE.loadInstanceId(context);
    }

    @JvmStatic
    public static final boolean isSdkStarted() {
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (!c3678c4.m17029i() || !c3678c4.m17034n()) {
            return false;
        }
        try {
            return c3678c4.m17033m().mo18512b().mo18802a();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void loadInstanceId(Context context) {
        synchronized (this) {
            if (instanceId == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
                String string = sharedPreferences.getString(INSTANCE_ID_KEY, null);
                if (string == null || string.length() == 0) {
                    string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNull(sharedPreferences);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(INSTANCE_ID_KEY, string);
                    editorEdit.apply();
                }
                instanceId = string;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void setLoggingLevel(LoggingLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        C4048sb.f16249b = level;
    }

    @JvmStatic
    public static final synchronized void startWithAppId(Context context, String appId, String appSignature, StartCallback onStarted) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        if (isSdkStarted()) {
            C4048sb.m19413c("Chartboost startWithAppId skipped due to SDK already being initialized. This method only needs to be called once per app session.", null, 2, null);
            onStarted.onStartCompleted(null);
            return;
        }
        INSTANCE.initContainer(context);
        C3662bb c3662bb = new C3662bb(context);
        Object objM16915d = c3662bb.m16915d();
        c3662bb.m16912a();
        if (Result.m44952isFailureimpl(objM16915d)) {
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM16915d);
            ChartboostError unknown = thM44949exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) thM44949exceptionOrNullimpl : null;
            if (unknown == null) {
                unknown = new ChartboostError.Initialization.Unknown("Precondition check failed.", null);
            }
            C4048sb.m19411b("Chartboost startWithAppId failed due to preconditions not being met. Check the logs for more information.", (Throwable) null, 2, (Object) null);
            C3678c4.f13658b.m17033m().mo18513c().m20019a(appId, appSignature, onStarted, unknown);
            return;
        }
        C3794h5.f14372a.m17856a(context);
        C3678c4 c3678c4 = C3678c4.f13658b;
        if (c3678c4.m17029i()) {
            if (!isSdkStarted()) {
                c3678c4.m17021a(appId, appSignature);
                C3773g7.f14286a.m17774a(c3678c4.mo17024d().mo18323g(), c3678c4.mo17024d().mo18326j());
            }
            c3678c4.mo17022b().mo19602a();
            C4172y3.m20017a(c3678c4.m17033m().mo18513c(), appId, appSignature, onStarted, null, 8, null);
        } else {
            c3678c4.m17033m().mo18513c().m20019a(appId, appSignature, onStarted, new ChartboostError.Initialization.Internal("Dependency Injection container not initialized.", null));
        }
    }
}
