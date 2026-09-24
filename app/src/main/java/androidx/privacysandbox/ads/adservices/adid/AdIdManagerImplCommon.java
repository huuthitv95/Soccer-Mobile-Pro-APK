package androidx.privacysandbox.ads.adservices.adid;

import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.exoplayer.offline.DefaultDownloaderFactory$$ExternalSyntheticLambda0;
import androidx.media3.p008ui.DefaultTimeBar$$ExternalSyntheticApiModelOutline0;
import com.ironsource.C11494Ie;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: AdIdManagerImplCommon.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u0006H\u0097@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH\u0083@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m43475d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "mAdIdManager", "Landroid/adservices/adid/AdIdManager;", "(Landroid/adservices/adid/AdIdManager;)V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", C11494Ie.f24627n, "Landroid/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdIdAsyncInternal", "ads-adservices_release"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public class AdIdManagerImplCommon extends AdIdManager {
    private final android.adservices.adid.AdIdManager mAdIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 */
    /* JADX INFO: compiled from: AdIdManagerImplCommon.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon", m43504f = "AdIdManagerImplCommon.kt", m43505i = {}, m43506l = {40}, m43507m = "getAdId$suspendImpl", m43508n = {}, m43509s = {})
    static final class C09521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C09521(Continuation<? super C09521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdIdManagerImplCommon.getAdId$suspendImpl(AdIdManagerImplCommon.this, this);
        }
    }

    @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
    public Object getAdId(Continuation<? super AdId> continuation) {
        return getAdId$suspendImpl(this, continuation);
    }

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        Intrinsics.checkNotNullParameter(mAdIdManager, "mAdIdManager");
        this.mAdIdManager = mAdIdManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    static /* synthetic */ Object getAdId$suspendImpl(AdIdManagerImplCommon adIdManagerImplCommon, Continuation<? super AdId> continuation) throws Throwable {
        C09521 c09521;
        if (continuation instanceof C09521) {
            c09521 = (C09521) continuation;
            if ((c09521.label & Integer.MIN_VALUE) != 0) {
                c09521.label -= Integer.MIN_VALUE;
            } else {
                c09521 = adIdManagerImplCommon.new C09521(continuation);
            }
        } else {
            c09521 = adIdManagerImplCommon.new C09521(continuation);
        }
        Object adIdAsyncInternal = c09521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c09521.label;
        if (i == 0) {
            ResultKt.throwOnFailure(adIdAsyncInternal);
            c09521.L$0 = adIdManagerImplCommon;
            c09521.label = 1;
            adIdAsyncInternal = adIdManagerImplCommon.getAdIdAsyncInternal(c09521);
            if (adIdAsyncInternal == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adIdManagerImplCommon = (AdIdManagerImplCommon) c09521.L$0;
            ResultKt.throwOnFailure(adIdAsyncInternal);
        }
        return adIdManagerImplCommon.convertResponse(DefaultTimeBar$$ExternalSyntheticApiModelOutline0.m564m(adIdAsyncInternal));
    }

    private final AdId convertResponse(android.adservices.adid.AdId response) {
        String adId = response.getAdId();
        Intrinsics.checkNotNullExpressionValue(adId, "response.adId");
        return new AdId(adId, response.isLimitAdTrackingEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAdIdAsyncInternal(Continuation<? super android.adservices.adid.AdId> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        this.mAdIdManager.getAdId(new DefaultDownloaderFactory$$ExternalSyntheticLambda0(), OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
