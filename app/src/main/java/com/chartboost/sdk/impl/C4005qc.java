package com.chartboost.sdk.impl;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSession;
import com.iab.omid.library.chartboost.adsession.media.InteractionType;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qc */
/* JADX INFO: loaded from: classes3.dex */
public final class C4005qc extends C3961oc implements InterfaceC4167xk {

    /* JADX INFO: renamed from: k */
    public final MediaEvents f15914k;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qc$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15915b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC3968oj f15916c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4005qc f15917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3968oj abstractC3968oj, C4005qc c4005qc, Continuation continuation) {
            super(2, continuation);
            this.f15916c = abstractC3968oj;
            this.f15917d = c4005qc;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f15916c, this.f15917d, continuation);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15915b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                String strM18982a = this.f15916c.m18982a();
                switch (strM18982a.hashCode()) {
                    case -1638835128:
                        if (!strM18982a.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.midpoint();
                        }
                        break;
                    case -1337830390:
                        if (!strM18982a.equals("thirdQuartile")) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.thirdQuartile();
                        }
                        break;
                    case -934426579:
                        if (!strM18982a.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.resume();
                        }
                        break;
                    case -599445191:
                        if (!strM18982a.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.complete();
                        }
                        break;
                    case 3532159:
                        if (!strM18982a.equals("skip")) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.skipped();
                        }
                        break;
                    case 94750088:
                        if (!strM18982a.equals("click")) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.adUserInteraction(InteractionType.CLICK);
                        }
                        break;
                    case 106440182:
                        if (!strM18982a.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.pause();
                        }
                        break;
                    case 120623625:
                        if (!strM18982a.equals("impression")) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.mo18916c();
                        }
                        break;
                    case 560220243:
                        if (!strM18982a.equals("firstQuartile")) {
                            C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        } else {
                            this.f15917d.f15914k.firstQuartile();
                        }
                        break;
                    default:
                        C4048sb.m19408a("No viewability action taken on video " + this.f15916c.m18982a(), (Throwable) null, 2, (Object) null);
                        break;
                }
            } catch (Exception e) {
                C4048sb.m19410b("Viewability update for " + this.f15916c.m18982a() + " failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qc$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15918b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f15920d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, Continuation continuation) {
            super(2, continuation);
            this.f15920d = f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4005qc.this.new b(this.f15920d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15918b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C4005qc.this.f15914k.volumeChange(this.f15920d);
            } catch (Exception e) {
                C4048sb.m19410b("Viewability video player volume failed to update to " + this.f15920d + ".", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.qc$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15921b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f15923d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f15924e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f, float f2, Continuation continuation) {
            super(2, continuation);
            this.f15923d = f;
            this.f15924e = f2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C4005qc.this.new c(this.f15923d, this.f15924e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15921b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C4005qc.this.f15914k.start(this.f15923d, this.f15924e);
            } catch (Exception e) {
                C4048sb.m19410b("Start viewability media event failed.", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4005qc(InterfaceC4013qk manager, AdSession adSession, AdEvents adEvents, MediaEvents mediaEvents, View videoView) {
        super(manager, adSession, adEvents, videoView);
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        Intrinsics.checkNotNullParameter(adEvents, "adEvents");
        Intrinsics.checkNotNullParameter(mediaEvents, "mediaEvents");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        this.f15914k = mediaEvents;
    }

    @Override // com.chartboost.sdk.impl.C3961oc, com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: a */
    public void mo18911a(float f) {
        BuildersKt__Builders_commonKt.launch$default(m18917d(), null, null, new b(f, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4167xk
    /* JADX INFO: renamed from: a */
    public void mo19158a(float f, float f2) {
        if (m18918e()) {
            BuildersKt__Builders_commonKt.launch$default(m18917d(), null, null, new c(Math.max(f, 0.0f), Math.min(Math.max(f2, 0.0f), 1.0f), null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4167xk
    /* JADX INFO: renamed from: a */
    public void mo19159a(AbstractC3968oj videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (m18918e()) {
            BuildersKt__Builders_commonKt.launch$default(m18917d(), null, null, new a(videoEvent, this, null), 3, null);
        }
    }

    @Override // com.chartboost.sdk.impl.C3961oc, com.chartboost.sdk.impl.InterfaceC4101uk
    /* JADX INFO: renamed from: b */
    public void mo18915b() {
        m18914a(EnumC4145wk.STARTED_VIDEO);
    }
}
