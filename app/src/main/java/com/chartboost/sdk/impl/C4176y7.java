package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4176y7 {

    /* JADX INFO: renamed from: a */
    public final Context f17015a;

    /* JADX INFO: renamed from: b */
    public final C4166xj f17016b;

    /* JADX INFO: renamed from: c */
    public final Function1 f17017c;

    /* JADX INFO: renamed from: d */
    public final Function4 f17018d;

    /* JADX INFO: renamed from: e */
    public final Function2 f17019e;

    /* JADX INFO: renamed from: f */
    public final DefaultHttpDataSource.Factory f17020f;

    /* JADX INFO: renamed from: g */
    public final Function5 f17021g;

    /* JADX INFO: renamed from: h */
    public final Function1 f17022h;

    /* JADX INFO: renamed from: i */
    public final Function0 f17023i;

    /* JADX INFO: renamed from: j */
    public final Function1 f17024j;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final a f17025b = new a();

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

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$b */
    public static final class b extends Lambda implements Function4 {

        /* JADX INFO: renamed from: b */
        public static final b f17026b = new b();

        public b() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cache invoke(InterfaceC3682c8 fc, C4166xj vcp, DatabaseProvider dp, C4194z3.b c) {
            Intrinsics.checkNotNullParameter(fc, "fc");
            Intrinsics.checkNotNullParameter(vcp, "vcp");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(c, "c");
            return AbstractC3749f6.m17629a(fc, dp, vcp, c, (CacheEvictor) null, 16, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$c */
    /* JADX INFO: loaded from: classes9.dex */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: b */
        public static final c f17027b = new c();

        public c() {
            super(2, AbstractC3749f6.class, "cacheDataSourceFactory", "cacheDataSourceFactory(Lcom/google/android/exoplayer2/upstream/cache/Cache;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheDataSource.Factory invoke(Cache p0, HttpDataSource.Factory p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return AbstractC3749f6.m17630a(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$d */
    public static final class d extends Lambda implements Function5 {

        /* JADX INFO: renamed from: b */
        public static final d f17028b = new d();

        public d() {
            super(5);
        }

        @Override // kotlin.jvm.functions.Function5
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DownloadManager invoke(Context c, DatabaseProvider dp, Cache ca, HttpDataSource.Factory hf, DownloadManager.Listener l) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(dp, "dp");
            Intrinsics.checkNotNullParameter(ca, "ca");
            Intrinsics.checkNotNullParameter(hf, "hf");
            Intrinsics.checkNotNullParameter(l, "l");
            return AbstractC3749f6.m17624a(c, dp, ca, hf, l, 0, 0, 96, null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$e */
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final e f17029b = new e();

        public e() {
            super(1, AbstractC3749f6.class, "databaseProvider", "databaseProvider(Landroid/content/Context;)Lcom/google/android/exoplayer2/database/DatabaseProvider;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DatabaseProvider invoke(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return AbstractC3749f6.m17622a(p0);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$f */
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final f f17030b = new f();

        public f() {
            super(0, AbstractC3749f6.class, "setCookieHandler", "setCookieHandler()V", 1);
        }

        /* JADX INFO: renamed from: a */
        public final void m20043a() {
            AbstractC3749f6.m17631a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m20043a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y7$g */
    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final g f17031b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3979p8 invoke(InterfaceC3682c8 fc) {
            Intrinsics.checkNotNullParameter(fc, "fc");
            return new C3979p8(fc);
        }
    }

    public C4176y7(Context context, C4166xj videoCachePolicy, Function1 fileCachingFactory, Function4 cacheFactory, Function2 cacheDataSourceFactoryFactory, DefaultHttpDataSource.Factory httpDataSourceFactory, Function5 downloadManagerFactory, Function1 databaseProviderFactory, Function0 setCookieHandler, Function1 fakePrecacheFilesManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCachePolicy, "videoCachePolicy");
        Intrinsics.checkNotNullParameter(fileCachingFactory, "fileCachingFactory");
        Intrinsics.checkNotNullParameter(cacheFactory, "cacheFactory");
        Intrinsics.checkNotNullParameter(cacheDataSourceFactoryFactory, "cacheDataSourceFactoryFactory");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(downloadManagerFactory, "downloadManagerFactory");
        Intrinsics.checkNotNullParameter(databaseProviderFactory, "databaseProviderFactory");
        Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
        Intrinsics.checkNotNullParameter(fakePrecacheFilesManagerFactory, "fakePrecacheFilesManagerFactory");
        this.f17015a = context;
        this.f17016b = videoCachePolicy;
        this.f17017c = fileCachingFactory;
        this.f17018d = cacheFactory;
        this.f17019e = cacheDataSourceFactoryFactory;
        this.f17020f = httpDataSourceFactory;
        this.f17021g = downloadManagerFactory;
        this.f17022h = databaseProviderFactory;
        this.f17023i = setCookieHandler;
        this.f17024j = fakePrecacheFilesManagerFactory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4176y7(Context context, C4166xj c4166xj, Function1 function1, Function4 function4, Function2 function2, DefaultHttpDataSource.Factory factory, Function5 function5, Function1 function3, Function0 function0, Function1 function6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            context = C3678c4.f13658b.mo17024d().getContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
        }
        this(context, (i & 2) != 0 ? C3678c4.f13658b.mo17019a().mo19004r() : c4166xj, (i & 4) != 0 ? a.f17025b : function1, (i & 8) != 0 ? b.f17026b : function4, (i & 16) != 0 ? c.f17027b : function2, (i & 32) != 0 ? new DefaultHttpDataSource.Factory() : factory, (i & 64) != 0 ? d.f17028b : function5, (i & 128) != 0 ? e.f17029b : function3, (i & 256) != 0 ? f.f17030b : function0, (i & 512) != 0 ? g.f17031b : function6);
    }

    /* JADX INFO: renamed from: a */
    public final Function2 m20028a() {
        return this.f17019e;
    }

    /* JADX INFO: renamed from: b */
    public final Function4 m20029b() {
        return this.f17018d;
    }

    /* JADX INFO: renamed from: c */
    public final Context m20030c() {
        return this.f17015a;
    }

    /* JADX INFO: renamed from: d */
    public final Function1 m20031d() {
        return this.f17022h;
    }

    /* JADX INFO: renamed from: e */
    public final Function5 m20032e() {
        return this.f17021g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4176y7)) {
            return false;
        }
        C4176y7 c4176y7 = (C4176y7) obj;
        return Intrinsics.areEqual(this.f17015a, c4176y7.f17015a) && Intrinsics.areEqual(this.f17016b, c4176y7.f17016b) && Intrinsics.areEqual(this.f17017c, c4176y7.f17017c) && Intrinsics.areEqual(this.f17018d, c4176y7.f17018d) && Intrinsics.areEqual(this.f17019e, c4176y7.f17019e) && Intrinsics.areEqual(this.f17020f, c4176y7.f17020f) && Intrinsics.areEqual(this.f17021g, c4176y7.f17021g) && Intrinsics.areEqual(this.f17022h, c4176y7.f17022h) && Intrinsics.areEqual(this.f17023i, c4176y7.f17023i) && Intrinsics.areEqual(this.f17024j, c4176y7.f17024j);
    }

    /* JADX INFO: renamed from: f */
    public final Function1 m20033f() {
        return this.f17024j;
    }

    /* JADX INFO: renamed from: g */
    public final Function1 m20034g() {
        return this.f17017c;
    }

    /* JADX INFO: renamed from: h */
    public final DefaultHttpDataSource.Factory m20035h() {
        return this.f17020f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f17015a.hashCode() * 31) + this.f17016b.hashCode()) * 31) + this.f17017c.hashCode()) * 31) + this.f17018d.hashCode()) * 31) + this.f17019e.hashCode()) * 31) + this.f17020f.hashCode()) * 31) + this.f17021g.hashCode()) * 31) + this.f17022h.hashCode()) * 31) + this.f17023i.hashCode()) * 31) + this.f17024j.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final Function0 m20036i() {
        return this.f17023i;
    }

    /* JADX INFO: renamed from: j */
    public final C4166xj m20037j() {
        return this.f17016b;
    }

    public String toString() {
        return "ExoPlayerDownloadManagerDependencies(context=" + this.f17015a + ", videoCachePolicy=" + this.f17016b + ", fileCachingFactory=" + this.f17017c + ", cacheFactory=" + this.f17018d + ", cacheDataSourceFactoryFactory=" + this.f17019e + ", httpDataSourceFactory=" + this.f17020f + ", downloadManagerFactory=" + this.f17021g + ", databaseProviderFactory=" + this.f17022h + ", setCookieHandler=" + this.f17023i + ", fakePrecacheFilesManagerFactory=" + this.f17024j + ")";
    }
}
