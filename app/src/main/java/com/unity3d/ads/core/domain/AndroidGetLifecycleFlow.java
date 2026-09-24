package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2 */
    /* JADX INFO: compiled from: AndroidGetLifecycleFlow.kt */
    @Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", m43504f = "AndroidGetLifecycleFlow.kt", m43505i = {}, m43506l = {64}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144912 extends SuspendLambda implements Function2<ProducerScope<? super LifecycleEvent>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C144912(Continuation<? super C144912> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144912 c144912 = AndroidGetLifecycleFlow.this.new C144912(continuation);
            c144912.L$0 = obj;
            return c144912;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ProducerScope<? super LifecycleEvent> producerScope, Continuation<? super Unit> continuation) {
            return ((C144912) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final ?? r1 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(producerScope, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C14492xc7e08ac0(producerScope, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(producerScope, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(producerScope, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C14493xc69cfa6(producerScope, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(producerScope, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(producerScope, activity, null), 3, null);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) r1);
                final AndroidGetLifecycleFlow androidGetLifecycleFlow = AndroidGetLifecycleFlow.this;
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((Application) androidGetLifecycleFlow.applicationContext).unregisterActivityLifecycleCallbacks(r1);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public AndroidGetLifecycleFlow(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final Flow<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return FlowKt.channelFlow(new C144912(null));
        }
        throw new IllegalArgumentException("Application context is required".toString());
    }
}
