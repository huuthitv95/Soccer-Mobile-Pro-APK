package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.p299v1.InitializationRequestOuterClass;
import gatewayprotocol.p299v1.InstallReferrerKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: AndroidInstallReferrerDataSource.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m43475d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidInstallReferrerDataSource;", "Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "appContext", "Landroid/content/Context;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidInstallReferrerDataSource implements InstallReferrerDataSource {
    private static final long TIME_OUT_MS = 500;
    private final Context appContext;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$1 */
    /* JADX INFO: compiled from: AndroidInstallReferrerDataSource.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource", m43504f = "AndroidInstallReferrerDataSource.kt", m43505i = {0}, m43506l = {31}, m43507m = "invoke", m43508n = {"this"}, m43509s = {"L$0"})
    static final class C144221 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C144221(Continuation<? super C144221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInstallReferrerDataSource.this.invoke(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2 */
    /* JADX INFO: compiled from: AndroidInstallReferrerDataSource.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", m43504f = "AndroidInstallReferrerDataSource.kt", m43505i = {}, m43506l = {95}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144232 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer>, Object> {
        Object L$0;
        int label;

        C144232(Continuation<? super C144232> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidInstallReferrerDataSource.this.new C144232(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation) {
            return ((C144232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = AndroidInstallReferrerDataSource.this;
            this.L$0 = androidInstallReferrerDataSource;
            this.label = 1;
            C144232 c144232 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c144232), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            try {
                final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(androidInstallReferrerDataSource.appContext).build();
                installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerServiceDisconnected() {
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m44946constructorimpl(null));
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                        }
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerSetupFinished(int responseCode) {
                        String strReplace;
                        if (responseCode != 0) {
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation = cancellableContinuationImpl2;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m44946constructorimpl(null));
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                                return;
                            }
                            return;
                        }
                        try {
                            ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            if (installReferrer2 != null) {
                                strReplace = new Regex("[^a-zA-Z0-9]").replace(installReferrer2, "");
                            } else {
                                strReplace = null;
                            }
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation2 = cancellableContinuationImpl2;
                                InstallReferrerKt.Dsl.Companion companion2 = InstallReferrerKt.Dsl.INSTANCE;
                                InitializationRequestOuterClass.InstallReferrer.Builder builderNewBuilder = InitializationRequestOuterClass.InstallReferrer.newBuilder();
                                Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                                InstallReferrerKt.Dsl dsl_create = companion2._create(builderNewBuilder);
                                if (strReplace != null) {
                                    dsl_create.setUrl(strReplace);
                                }
                                dsl_create.setClickTime(installReferrer.getReferrerClickTimestampSeconds());
                                dsl_create.setInstallTime(installReferrer.getInstallBeginTimestampServerSeconds());
                                dsl_create.setInstantExperienceLunch(installReferrer.getGooglePlayInstantParam());
                                cancellableContinuation2.resume(dsl_create._build(), new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }
                                });
                            }
                            installReferrerClientBuild.endConnection();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_completed", null, null, null, null, null, 62, null);
                        } catch (RemoteException unused) {
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<InitializationRequestOuterClass.InstallReferrer> cancellableContinuation3 = cancellableContinuationImpl2;
                                Result.Companion companion3 = Result.INSTANCE;
                                cancellableContinuation3.resumeWith(Result.m44946constructorimpl(null));
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                if (cancellableContinuationImpl2.isActive()) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl2.resumeWith(Result.m44946constructorimpl(null));
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_failed", null, null, null, null, null, 62, null);
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c144232);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }

    public AndroidInstallReferrerDataSource(Context appContext, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.appContext = appContext;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.data.datasource.InstallReferrerDataSource
    public Object invoke(Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation) throws Throwable {
        C144221 c144221;
        AndroidInstallReferrerDataSource androidInstallReferrerDataSource;
        if (continuation instanceof C144221) {
            c144221 = (C144221) continuation;
            if ((c144221.label & Integer.MIN_VALUE) != 0) {
                c144221.label -= Integer.MIN_VALUE;
            } else {
                c144221 = new C144221(continuation);
            }
        } else {
            c144221 = new C144221(continuation);
        }
        Object objWithTimeout = c144221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144221.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithTimeout);
            try {
                C144232 c144232 = new C144232(null);
                c144221.L$0 = this;
                c144221.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(500L, c144232, c144221);
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidInstallReferrerDataSource = this;
            } catch (TimeoutCancellationException unused) {
                androidInstallReferrerDataSource = this;
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_timed_out", null, null, null, null, null, 62, null);
                return null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidInstallReferrerDataSource = (AndroidInstallReferrerDataSource) c144221.L$0;
            try {
                ResultKt.throwOnFailure(objWithTimeout);
            } catch (TimeoutCancellationException unused2) {
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidInstallReferrerDataSource.sendDiagnosticEvent, "install_referral_fetch_timed_out", null, null, null, null, null, 62, null);
                return null;
            }
        }
        return (InitializationRequestOuterClass.InstallReferrer) objWithTimeout;
    }
}
