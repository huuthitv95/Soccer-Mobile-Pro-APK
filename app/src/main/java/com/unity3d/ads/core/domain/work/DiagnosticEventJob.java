package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.p295di.IServiceComponent;
import com.unity3d.services.core.p295di.ServiceProvider;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: DiagnosticEventJob.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0018\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/work/DiagnosticEventJob;", "Lcom/unity3d/ads/core/domain/work/UniversalRequestJob;", "Lcom/unity3d/services/core/di/IServiceComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "diagnosticEventRequestWorkModifier", "Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "getDiagnosticEventRequestWorkModifier", "()Lcom/unity3d/ads/core/domain/work/DiagnosticEventRequestWorkModifier;", "diagnosticEventRequestWorkModifier$delegate", "Lkotlin/Lazy;", "getDiagnosticRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getGetDiagnosticRequestPolicy", "()Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getDiagnosticRequestPolicy$delegate", "universalRequestEventSender", "Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "getUniversalRequestEventSender", "()Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "universalRequestEventSender$delegate", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {

    /* JADX INFO: renamed from: diagnosticEventRequestWorkModifier$delegate, reason: from kotlin metadata */
    private final Lazy diagnosticEventRequestWorkModifier;

    /* JADX INFO: renamed from: getDiagnosticRequestPolicy$delegate, reason: from kotlin metadata */
    private final Lazy getDiagnosticRequestPolicy;

    /* JADX INFO: renamed from: universalRequestEventSender$delegate, reason: from kotlin metadata */
    private final Lazy universalRequestEventSender;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1 */
    /* JADX INFO: compiled from: DiagnosticEventJob.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", m43504f = "DiagnosticEventJob.kt", m43505i = {0, 0, 1, 2}, m43506l = {27, 34, 36}, m43507m = "doWork", m43508n = {"this", UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID, "this", "this"}, m43509s = {"L$0", "L$1", "L$0", "L$0"})
    static final class C146211 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C146211(Continuation<? super C146211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        final DiagnosticEventJob diagnosticEventJob = this;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = diagnosticEventJob;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, Reflection.getOrCreateKotlinClass(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = diagnosticEventJob;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, Reflection.getOrCreateKotlinClass(DiagnosticEventRequestWorkModifier.class));
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final String str3 = ServiceProvider.DIAGNOSTICS_EVENT_SENDER;
        this.universalRequestEventSender = LazyKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = diagnosticEventJob;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str3, Reflection.getOrCreateKotlinClass(UniversalRequestEventSender.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) throws Throwable {
        C146211 c146211;
        DiagnosticEventJob diagnosticEventJob;
        String string;
        DiagnosticEventJob diagnosticEventJob2;
        Object objM44946constructorimpl;
        DiagnosticEventJob diagnosticEventJob3;
        if (continuation instanceof C146211) {
            c146211 = (C146211) continuation;
            if ((c146211.label & Integer.MIN_VALUE) != 0) {
                c146211.label -= Integer.MIN_VALUE;
            } else {
                c146211 = new C146211(continuation);
            }
        } else {
            c146211 = new C146211(continuation);
        }
        Object objDoWork = c146211.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c146211.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objDoWork);
            try {
                string = getWorkerParams().getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                if (string == null) {
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                    Intrinsics.checkNotNullExpressionValue(resultSuccess, "success()");
                    return resultSuccess;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    DiagnosticEventJob diagnosticEventJob4 = this;
                    UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                    c146211.L$0 = this;
                    c146211.L$1 = string;
                    c146211.label = 1;
                    objDoWork = universalRequestDataSource.get(c146211);
                    if (objDoWork != coroutine_suspended) {
                        diagnosticEventJob2 = this;
                    }
                } catch (Throwable th) {
                    th = th;
                    diagnosticEventJob2 = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                diagnosticEventJob = this;
                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry, "retry()");
                return resultRetry;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                diagnosticEventJob = (DiagnosticEventJob) c146211.L$0;
                try {
                    ResultKt.throwOnFailure(objDoWork);
                    return (ListenableWorker.Result) objDoWork;
                } catch (Throwable th3) {
                    th = th3;
                    diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                    ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
                    Intrinsics.checkNotNullExpressionValue(resultRetry2, "retry()");
                    return resultRetry2;
                }
            }
            diagnosticEventJob3 = (DiagnosticEventJob) c146211.L$0;
            try {
                ResultKt.throwOnFailure(objDoWork);
                diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                c146211.L$0 = diagnosticEventJob3;
                c146211.label = 3;
                objDoWork = super.doWork(c146211);
                if (objDoWork != coroutine_suspended) {
                    diagnosticEventJob = diagnosticEventJob3;
                    return (ListenableWorker.Result) objDoWork;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                diagnosticEventJob = diagnosticEventJob3;
                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                ListenableWorker.Result resultRetry3 = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry3, "retry()");
                return resultRetry3;
            }
        }
        string = (String) c146211.L$1;
        diagnosticEventJob2 = (DiagnosticEventJob) c146211.L$0;
        try {
            ResultKt.throwOnFailure(objDoWork);
        } catch (Throwable th5) {
            th = th5;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
            } catch (Throwable th6) {
                th = th6;
                diagnosticEventJob = diagnosticEventJob2;
                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                ListenableWorker.Result resultRetry4 = ListenableWorker.Result.retry();
                Intrinsics.checkNotNullExpressionValue(resultRetry4, "retry()");
                return resultRetry4;
            }
        }
        objM44946constructorimpl = Result.m44946constructorimpl(((UniversalRequestStoreOuterClass.UniversalRequestStore) objDoWork).getUniversalRequestMapOrThrow(string));
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) != null) {
            ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
            Intrinsics.checkNotNullExpressionValue(resultSuccess2, "success()");
            return resultSuccess2;
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest = UniversalRequestOuterClass.UniversalRequest.parseFrom((ByteString) objM44946constructorimpl);
        DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = diagnosticEventJob2.getDiagnosticEventRequestWorkModifier();
        Intrinsics.checkNotNullExpressionValue(universalRequest, "universalRequest");
        UniversalRequestOuterClass.UniversalRequest universalRequestInvoke = diagnosticEventRequestWorkModifier.invoke(universalRequest);
        UniversalRequestDataSource universalRequestDataSource2 = diagnosticEventJob2.getUniversalRequestDataSource();
        ByteString byteString = universalRequestInvoke.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString, "modifiedUniversalRequest.toByteString()");
        c146211.L$0 = diagnosticEventJob2;
        c146211.L$1 = null;
        c146211.label = 2;
        if (universalRequestDataSource2.set(string, byteString, c146211) != coroutine_suspended) {
            diagnosticEventJob3 = diagnosticEventJob2;
            diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
            c146211.L$0 = diagnosticEventJob3;
            c146211.label = 3;
            objDoWork = super.doWork(c146211);
            if (objDoWork != coroutine_suspended) {
                diagnosticEventJob = diagnosticEventJob3;
                return (ListenableWorker.Result) objDoWork;
            }
        }
        return coroutine_suspended;
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob
    protected UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender.getValue();
    }
}
