package com.chartboost.sdk.impl;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3786gk implements InterfaceC3763fk {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3721e1 f14338a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3763fk.b f14339b;

    /* JADX INFO: renamed from: c */
    public final CoroutineDispatcher f14340c;

    /* JADX INFO: renamed from: d */
    public Job f14341d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.gk$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f14342b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f14343c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3786gk f14344d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, C3786gk c3786gk, Continuation continuation) {
            super(2, continuation);
            this.f14343c = j;
            this.f14344d = c3786gk;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f14343c, this.f14344d, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f14342b
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.ResultKt.throwOnFailure(r6)
            L1a:
                long r3 = r5.f14343c
                r5.f14342b = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                com.chartboost.sdk.impl.gk r6 = r5.f14344d
                com.chartboost.sdk.impl.e1 r6 = com.chartboost.sdk.impl.C3786gk.m17821a(r6)
                if (r6 == 0) goto L1a
                com.chartboost.sdk.impl.gk r1 = r5.f14344d
                com.chartboost.sdk.impl.fk$b r1 = com.chartboost.sdk.impl.C3786gk.m17822b(r1)
                long r3 = r1.mo16777a()
                r6.mo17464a(r3)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C3786gk.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3786gk(InterfaceC3721e1 interfaceC3721e1, InterfaceC3763fk.b videoProgress, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(videoProgress, "videoProgress");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f14338a = interfaceC3721e1;
        this.f14339b = videoProgress;
        this.f14340c = coroutineDispatcher;
    }

    public /* synthetic */ C3786gk(InterfaceC3721e1 interfaceC3721e1, InterfaceC3763fk.b bVar, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC3721e1, bVar, (i & 4) != 0 ? Dispatchers.getMain() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3763fk
    /* JADX INFO: renamed from: a */
    public void mo17746a() {
        C4048sb.m19408a("stopProgressUpdate()", (Throwable) null, 2, (Object) null);
        Job job = this.f14341d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f14341d = null;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3763fk
    /* JADX INFO: renamed from: a */
    public void mo17747a(long j) {
        C4048sb.m19408a("startProgressUpdate()", (Throwable) null, 2, (Object) null);
        if (this.f14341d != null) {
            return;
        }
        this.f14341d = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f14340c), null, null, new a(j, this, null), 3, null);
    }
}
