package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3878kk implements InterfaceC3855jk, C3924mk.a {

    /* JADX INFO: renamed from: a */
    public final C4166xj f15135a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4154x7 f15136b;

    /* JADX INFO: renamed from: c */
    public final Function1 f15137c;

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f15138d;

    /* JADX INFO: renamed from: e */
    public final Lazy f15139e;

    /* JADX INFO: renamed from: f */
    public final Lazy f15140f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3682c8 f15141g;

    /* JADX INFO: renamed from: h */
    public Job f15142h;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kk$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f15143b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3705d8 invoke(Context c) {
            Intrinsics.checkNotNullParameter(c, "c");
            return new C3705d8(c, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kk$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final b f15144b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kk$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15145b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3878kk.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15145b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long jM19998i = C3878kk.this.f15135a.m19998i();
                this.f15145b = 1;
                if (DelayKt.delay(jM19998i, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C3878kk.this.f15142h = null;
            try {
                InterfaceC3855jk.a.m18299a(C3878kk.this, null, 0, false, 7, null);
            } catch (IllegalStateException e) {
                C4048sb.m19410b("Cannot start download", e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kk$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final d f15147b = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public C3878kk(C4166xj policy, InterfaceC4154x7 downloadManager, Function1 fileCachingFactory, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f15135a = policy;
        this.f15136b = downloadManager;
        this.f15137c = fileCachingFactory;
        this.f15138d = dispatcher;
        this.f15139e = LazyKt.lazy(b.f15144b);
        this.f15140f = LazyKt.lazy(d.f15147b);
    }

    public /* synthetic */ C3878kk(C4166xj c4166xj, InterfaceC4154x7 interfaceC4154x7, Function1 function1, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4166xj, interfaceC4154x7, (i & 4) != 0 ? a.f15143b : function1, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public int mo18293a(C4078tj c4078tj) {
        if (c4078tj != null) {
            return AbstractC4206zf.m20149a(this.f15136b.mo19929d(c4078tj.m19509d()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final C4078tj m18436a(File file, String str) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        C4078tj c4078tj = new C4078tj(str, name, file, file.getParentFile(), 0L, null, 0L, 112, null);
        file.setLastModified(c4078tj.m19505a());
        return c4078tj;
    }

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap m18437a() {
        return (ConcurrentHashMap) this.f15139e.getValue();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public void mo18294a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4048sb.m19408a("initialize()", (Throwable) null, 2, (Object) null);
        this.f15141g = (InterfaceC3682c8) this.f15137c.invoke(context);
        InterfaceC4154x7 interfaceC4154x7 = this.f15136b;
        interfaceC4154x7.mo19920a();
        interfaceC4154x7.mo19921a(this);
        interfaceC4154x7.mo19927b();
    }

    /* JADX INFO: renamed from: a */
    public final void m18438a(C4078tj c4078tj, EnumC4065t6 enumC4065t6) {
        C4048sb.m19408a("sendDownloadToDownloadManager() - " + c4078tj, (Throwable) null, 2, (Object) null);
        if (enumC4065t6 == EnumC4065t6.NONE) {
            this.f15135a.m19980a();
        }
        this.f15136b.mo19924a(c4078tj, enumC4065t6);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public void mo18295a(String str, int i, boolean z) {
        Unit unit;
        C4078tj c4078tj;
        C4048sb.m19408a("startDownloadIfPossible() - filename " + str + ", forceDownload " + z, (Throwable) null, 2, (Object) null);
        if (str == null || (c4078tj = (C4078tj) m18437a().get(str)) == null) {
            unit = null;
        } else {
            C4048sb.m19408a("startDownloadIfPossible() - asset: " + c4078tj, (Throwable) null, 2, (Object) null);
            if (z) {
                m18448d(c4078tj);
            } else {
                m18449e(c4078tj);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            C4048sb.m19408a("startDownloadIfPossible() - null asset, resume next download in Download Manager index", (Throwable) null, 2, (Object) null);
            m18446c();
        }
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18439a(String uri, String videoFileName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("onSuccess() - uri " + uri + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        m18443b().remove(uri);
        InterfaceC3855jk.a.m18299a(this, null, 0, false, 7, null);
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18440a(String url, String videoFileName, long j, InterfaceC4015r0 interfaceC4015r0) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("tempFileIsReady() - url " + url + ", videoFileName " + videoFileName, (Throwable) null, 2, (Object) null);
        if (interfaceC4015r0 == null) {
            interfaceC4015r0 = (InterfaceC4015r0) m18443b().get(url);
        }
        if (interfaceC4015r0 != null) {
            interfaceC4015r0.mo18619a(url);
        }
    }

    @Override // com.chartboost.sdk.impl.C3924mk.a
    /* JADX INFO: renamed from: a */
    public void mo18441a(String uri, String videoFileName, CBError cBError) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(videoFileName, "videoFileName");
        C4048sb.m19408a("onError() - uri " + uri + ", videoFileName " + videoFileName + ", error " + cBError, (Throwable) null, 2, (Object) null);
        m18443b().remove(uri);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public void mo18296a(String url, String filename, boolean z, InterfaceC4015r0 interfaceC4015r0) {
        C4078tj c4078tjM18436a;
        C4078tj c4078tjM18442b;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        C4048sb.m19408a("downloadVideoFile() - url: " + url + ", filename: " + filename + ", showImmediately: " + z + ", callback: " + interfaceC4015r0, (Throwable) null, 2, (Object) null);
        if (interfaceC4015r0 != null) {
            m18443b().put(url, interfaceC4015r0);
        }
        File fileM18445c = m18445c(filename);
        if (fileM18445c == null || (c4078tjM18436a = m18436a(fileM18445c, url)) == null || (c4078tjM18442b = m18442b(c4078tjM18436a)) == null || m18444c(c4078tjM18442b) == null) {
            C4048sb.m19408a("downloadVideoFile() - cache file is null", (Throwable) null, 2, (Object) null);
        }
        InterfaceC3855jk.a.m18299a(this, filename, 0, z, 2, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: a */
    public boolean mo18297a(String videoFilename) {
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        return this.f15136b.mo19925a(videoFilename);
    }

    /* JADX INFO: renamed from: b */
    public final C4078tj m18442b(C4078tj c4078tj) {
        m18437a().put(c4078tj.m19509d(), c4078tj);
        return c4078tj;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3855jk
    /* JADX INFO: renamed from: b */
    public C4078tj mo18298b(String filename) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        return (C4078tj) m18437a().get(filename);
    }

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap m18443b() {
        return (ConcurrentHashMap) this.f15140f.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final C4078tj m18444c(C4078tj c4078tj) {
        C4048sb.m19408a("queueDownload() - asset: " + c4078tj, (Throwable) null, 2, (Object) null);
        m18438a(c4078tj, EnumC4065t6.STOPPED_QUEUE);
        return c4078tj;
    }

    /* JADX INFO: renamed from: c */
    public final File m18445c(String str) {
        InterfaceC3682c8 interfaceC3682c8 = this.f15141g;
        if (interfaceC3682c8 != null) {
            return interfaceC3682c8.mo17047a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m18446c() {
        EnumC4065t6 enumC4065t6;
        if (this.f15135a.m19996g()) {
            m18447d();
            enumC4065t6 = EnumC4065t6.MAX_COUNT_TIME_WINDOW;
        } else {
            enumC4065t6 = EnumC4065t6.NONE;
        }
        if (enumC4065t6 == EnumC4065t6.NONE) {
            this.f15135a.m19980a();
        }
        this.f15136b.mo19922a(enumC4065t6);
    }

    /* JADX INFO: renamed from: d */
    public final void m18447d() {
        if (this.f15142h == null) {
            this.f15142h = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f15138d), null, null, new c(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m18448d(C4078tj c4078tj) {
        C4048sb.m19408a("startForcedDownload() - " + c4078tj, (Throwable) null, 2, (Object) null);
        this.f15135a.m19980a();
        this.f15136b.mo19923a(c4078tj);
    }

    /* JADX INFO: renamed from: e */
    public final void m18449e(C4078tj c4078tj) {
        EnumC4065t6 enumC4065t6;
        if (this.f15135a.m19996g()) {
            m18447d();
            enumC4065t6 = EnumC4065t6.MAX_COUNT_TIME_WINDOW;
        } else {
            enumC4065t6 = EnumC4065t6.NONE;
        }
        m18438a(c4078tj, enumC4065t6);
    }
}
