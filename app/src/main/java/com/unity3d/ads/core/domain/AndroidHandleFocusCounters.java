package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.ComparableTimeMark;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000fH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "focusRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "isAdActivity", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "timeSource", "Lkotlin/time/TimeSource$WithComparableMarks;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/time/TimeSource$WithComparableMarks;)V", "focusTimesPerActivity", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/time/ComparableTimeMark;", "latestKnownActivityResumed", "getLatestKnownActivityResumed$annotations", "()V", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "(Ljava/lang/String;)V", "previousFocusState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "invoke", "", "onFocusStateChange", "newState", "onPause", "activityName", "onResume", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidHandleFocusCounters {
    private final CoroutineDispatcher defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, ComparableTimeMark> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final MutableStateFlow<FocusState> previousFocusState;
    private final SessionRepository sessionRepository;
    private final TimeSource.WithComparableMarks timeSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1 */
    /* JADX INFO: compiled from: AndroidHandleFocusCounters.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Lcom/unity3d/ads/core/data/repository/FocusState;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", m43504f = "AndroidHandleFocusCounters.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C144981 extends SuspendLambda implements Function2<FocusState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C144981(Continuation<? super C144981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C144981 c144981 = AndroidHandleFocusCounters.this.new C144981(continuation);
            c144981.L$0 = obj;
            return c144981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FocusState focusState, Continuation<? super Unit> continuation) {
            return ((C144981) create(focusState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String qualifiedName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (qualifiedName = Reflection.getOrCreateKotlinClass(activity.getClass()).getQualifiedName()) == null) {
                qualifiedName = "unknown_activity_name";
            }
            if (!AndroidHandleFocusCounters.this.isAdActivity.invoke(qualifiedName)) {
                return Unit.INSTANCE;
            }
            AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
            if (focusState instanceof FocusState.Focused) {
                AndroidHandleFocusCounters.this.onResume(qualifiedName);
            } else if (focusState instanceof FocusState.Unfocused) {
                AndroidHandleFocusCounters.this.onPause(qualifiedName);
            }
            return Unit.INSTANCE;
        }
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, CoroutineDispatcher defaultDispatcher, TimeSource.WithComparableMarks timeSource) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(focusRepository, "focusRepository");
        Intrinsics.checkNotNullParameter(isAdActivity, "isAdActivity");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = StateFlowKt.MutableStateFlow(null);
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, CoroutineDispatcher coroutineDispatcher, TimeSource.Monotonic monotonic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, coroutineDispatcher, (i & 16) != 0 ? TimeSource.Monotonic.INSTANCE : monotonic);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState newState) {
        FocusState value;
        FocusState focusState;
        MutableStateFlow<FocusState> mutableStateFlow = this.previousFocusState;
        do {
            value = mutableStateFlow.getValue();
            focusState = value;
        } while (!mutableStateFlow.compareAndSet(value, newState));
        if (focusState == null || newState.getClass() == focusState.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String activityName) {
        String str = this.latestKnownActivityResumed;
        if (str == null || Intrinsics.areEqual(str, activityName)) {
            ComparableTimeMark comparableTimeMarkRemove = this.focusTimesPerActivity.remove(activityName);
            if (comparableTimeMarkRemove == null) {
                comparableTimeMarkRemove = this.timeSource.markNow();
            }
            Intrinsics.checkNotNullExpressionValue(comparableTimeMarkRemove, "focusTimesPerActivity.re…) ?: timeSource.markNow()");
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) Duration.m46302getInWholeMillisecondsimpl(comparableTimeMarkRemove.mo46281elapsedNowUwyO8pc()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.markNow());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        FlowKt.launchIn(FlowKt.onEach(this.focusRepository.getFocusState(), new C144981(null)), CoroutineScopeKt.CoroutineScope(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }
}
