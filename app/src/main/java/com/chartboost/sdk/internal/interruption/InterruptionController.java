package com.chartboost.sdk.internal.interruption;

import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.common.util.Util$$ExternalSyntheticApiModelOutline0;
import com.chartboost.sdk.impl.C3731eb;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.InterfaceC3754fb;
import com.chartboost.sdk.impl.InterfaceC4175y6;
import com.hbisoft.hbrecorder.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes3.dex */
public final class InterruptionController implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: g */
    public static Context f17252g;

    /* JADX INFO: renamed from: h */
    public static AudioManager f17253h;

    /* JADX INFO: renamed from: i */
    public static AudioFocusRequest f17254i;

    /* JADX INFO: renamed from: a */
    public static final InterruptionController f17246a = new InterruptionController();

    /* JADX INFO: renamed from: b */
    public static final Object f17247b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Set f17248c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public static final List f17249d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public static final List f17250e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static final List f17251f = new ArrayList();

    /* JADX INFO: renamed from: j */
    public static C3731eb f17255j = new C3731eb(0, 1, null);

    @Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, m43475d2 = {"Lcom/chartboost/sdk/internal/interruption/InterruptionController$AppProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", Constants.ON_START_KEY, "onStop", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
    public static final class AppProcessLifecycleObserver implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a */
        public static final AppProcessLifecycleObserver f17256a = new AppProcessLifecycleObserver();

        private AppProcessLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            synchronized (InterruptionController.f17247b) {
                Set set = InterruptionController.f17248c;
                C4232a.a aVar = C4232a.f17266b;
                if (!set.contains(aVar.m20252a()) && InterruptionController.f17248c.contains(aVar.m20253b())) {
                    InterruptionController.f17246a.m20239b(aVar.m20253b());
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f17246a.m20239b(C4232a.f17266b.m20252a());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f17246a.m20235a(C4232a.f17266b.m20252a());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$a */
    public static final class C4227a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17257b;

        public C4227a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C4227a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C4227a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17257b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(AppProcessLifecycleObserver.f17256a);
            C4048sb.m19413c("InterruptionController initialized with ProcessLifecycleOwner.", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$b */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class C4228b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17258b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f17259c;

        /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$b$a */
        /* JADX INFO: loaded from: classes3.dex */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public static final a f17260b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4228b(boolean z, Continuation continuation) {
            super(2, continuation);
            this.f17259c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C4228b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C4228b(this.f17259c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17258b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.f17247b;
            boolean z = this.f17259c;
            synchronized (obj2) {
                CollectionsKt.removeAll(InterruptionController.f17250e, (Function1) a.f17260b);
                Iterator it = InterruptionController.f17250e.iterator();
                while (it.hasNext()) {
                    InterfaceC4175y6 interfaceC4175y6 = (InterfaceC4175y6) ((WeakReference) it.next()).get();
                    if (interfaceC4175y6 != null) {
                        interfaceC4175y6.mo17338b(z);
                    }
                }
                C4048sb.m19413c((z ? "Ducking" : "Restoring") + " ad audio volume", null, 2, null);
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$c */
    public static final class C4229c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f17261b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set f17262c;

        /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$c$a */
        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: b */
            public static final a f17263b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4229c(Set set, Continuation continuation) {
            super(2, continuation);
            this.f17262c = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C4229c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C4229c(this.f17262c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17261b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.f17247b;
            Set set = this.f17262c;
            synchronized (obj2) {
                CollectionsKt.removeAll(InterruptionController.f17249d, (Function1) a.f17263b);
                Iterator it = InterruptionController.f17249d.iterator();
                while (it.hasNext()) {
                    InterfaceC3754fb interfaceC3754fb = (InterfaceC3754fb) ((WeakReference) it.next()).get();
                    if (interfaceC3754fb != null) {
                        interfaceC3754fb.mo17688a(set);
                    }
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$d */
    public static final class C4230d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4175y6 f17264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4230d(InterfaceC4175y6 interfaceC4175y6) {
            super(1);
            this.f17264b = interfaceC4175y6;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f17264b);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.InterruptionController$e */
    public static final class C4231e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3754fb f17265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4231e(InterfaceC3754fb interfaceC3754fb) {
            super(1);
            this.f17265b = interfaceC3754fb;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f17265b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20224a(InterruptionController interruptionController, Application application, C3731eb c3731eb, int i, Object obj) {
        if ((i & 2) != 0) {
            c3731eb = new C3731eb(0, 1, null);
        }
        interruptionController.m20232a(application, c3731eb);
    }

    /* JADX INFO: renamed from: a */
    public final void m20231a() {
        AudioManager audioManager = f17253h;
        if (audioManager == null) {
            C4048sb.m19411b("AudioManager is null, cannot abandon audio focus.", (Throwable) null, 2, (Object) null);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            C4048sb.m19413c("Abandoning audio focus (API < 26).", null, 2, null);
            audioManager.abandonAudioFocus(this);
            return;
        }
        AudioFocusRequest audioFocusRequest = f17254i;
        if (audioFocusRequest != null) {
            C4048sb.m19413c("Abandoning audio focus (API 26+).", null, 2, null);
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        f17254i = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20232a(Application application, C3731eb config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        f17252g = applicationContext;
        f17255j = config;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            C4048sb.m19411b("Failed to get AudioManager. Audio focus handling will be disabled.", (Throwable) null, 2, (Object) null);
            audioManager = null;
        }
        f17253h = audioManager;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C4227a(null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m20233a(InterfaceC3754fb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17247b) {
            f17249d.add(new WeakReference(listener));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20234a(InterfaceC4175y6 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17247b) {
            f17250e.add(new WeakReference(listener));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20235a(C4232a c4232a) {
        boolean z;
        synchronized (f17247b) {
            Set set = f17248c;
            z = set.isEmpty() || set.add(c4232a);
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            C4048sb.m19413c("Ad interruption began: " + c4232a, null, 2, null);
            m20241g();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20236a(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C4228b(z, null), 3, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m20237b(InterfaceC3754fb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17247b) {
            CollectionsKt.removeAll(f17249d, (Function1) new C4231e(listener));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20238b(InterfaceC4175y6 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17247b) {
            CollectionsKt.removeAll(f17250e, (Function1) new C4230d(listener));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20239b(C4232a c4232a) {
        boolean zRemove;
        synchronized (f17247b) {
            zRemove = f17248c.remove(c4232a);
            Unit unit = Unit.INSTANCE;
        }
        if (zRemove) {
            C4048sb.m19413c("Ad interruption ended: " + c4232a, null, 2, null);
            m20241g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final Set m20240f() {
        Set set;
        synchronized (f17247b) {
            set = CollectionsKt.toSet(f17248c);
        }
        return set;
    }

    /* JADX INFO: renamed from: g */
    public final void m20241g() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new C4229c(m20240f(), null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final int m20242h() {
        int iRequestAudioFocus;
        Unit unit;
        AudioManager audioManager = f17253h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                Util$$ExternalSyntheticApiModelOutline0.m43612m$1();
                AudioFocusRequest audioFocusRequestBuild = Util$$ExternalSyntheticApiModelOutline0.m313m(f17255j.m17537a()).setOnAudioFocusChangeListener(this).setWillPauseWhenDucked(true).build();
                f17254i = audioFocusRequestBuild;
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(this, 3, f17255j.m17537a());
            }
            if (iRequestAudioFocus == 0) {
                C4048sb.m19411b("Audio focus request FAILED.", (Throwable) null, 2, (Object) null);
            } else if (iRequestAudioFocus == 1) {
                C4048sb.m19413c("Audio focus request GRANTED.", null, 2, null);
            } else if (iRequestAudioFocus != 2) {
                C4048sb.m19417e("Audio focus request returned unknown result: " + iRequestAudioFocus, null, 2, null);
            } else {
                C4048sb.m19413c("Audio focus request DELAYED.", null, 2, null);
            }
            unit = Unit.INSTANCE;
        } else {
            iRequestAudioFocus = 0;
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19411b("AudioManager is null, cannot request audio focus.", (Throwable) null, 2, (Object) null);
        }
        return iRequestAudioFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -3) {
            m20236a(true);
            return;
        }
        if (i == -2 || i == -1) {
            m20235a(C4232a.f17266b.m20253b());
        } else {
            if (i != 1) {
                return;
            }
            m20236a(false);
            m20239b(C4232a.f17266b.m20253b());
        }
    }
}
