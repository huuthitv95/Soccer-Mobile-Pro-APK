package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.DefaultDatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3749f6 {
    /* JADX INFO: renamed from: a */
    public static final LoadControl m17620a(int i, int i2) {
        DefaultLoadControl defaultLoadControlBuild = new DefaultLoadControl.Builder().setBufferDurationsMs(i, i2, i, i).build();
        Intrinsics.checkNotNullExpressionValue(defaultLoadControlBuild, "build(...)");
        return defaultLoadControlBuild;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LoadControl m17621a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 500;
        }
        if ((i3 & 2) != 0) {
            i2 = 50000;
        }
        return m17620a(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static final DatabaseProvider m17622a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultDatabaseProvider(new C3751f8(context, null, null, 0, 14, null));
    }

    /* JADX INFO: renamed from: a */
    public static final DownloadManager m17623a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpDataSourceFactory, DownloadManager.Listener listener, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DownloadManager downloadManager = new DownloadManager(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i));
        downloadManager.setMaxParallelDownloads(i2);
        downloadManager.addListener(listener);
        return downloadManager;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DownloadManager m17624a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, DownloadManager.Listener listener, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        return m17623a(context, databaseProvider, cache, factory, listener, i4, i2);
    }

    /* JADX INFO: renamed from: a */
    public static final Scheduler m17625a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Util.SDK_INT >= 21) {
            return new PlatformScheduler(context, i);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Scheduler m17626a(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m17625a(context, i);
    }

    /* JADX INFO: renamed from: a */
    public static final MediaSource.Factory m17627a(DataSource.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        return new DefaultMediaSourceFactory(factory);
    }

    /* JADX INFO: renamed from: a */
    public static final Cache m17628a(InterfaceC3682c8 fileCaching, DatabaseProvider databaseProvider, C4166xj cachePolicy, C4194z3.b evictorCallback, CacheEvictor evictor) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cachePolicy, "cachePolicy");
        Intrinsics.checkNotNullParameter(evictorCallback, "evictorCallback");
        Intrinsics.checkNotNullParameter(evictor, "evictor");
        return new SimpleCache(fileCaching.mo17048b(), evictor, databaseProvider);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Cache m17629a(InterfaceC3682c8 interfaceC3682c8, DatabaseProvider databaseProvider, C4166xj c4166xj, C4194z3.b bVar, CacheEvictor cacheEvictor, int i, Object obj) {
        C4194z3.b bVar2;
        if ((i & 16) != 0) {
            bVar2 = bVar;
            cacheEvictor = new C4194z3(c4166xj.m19984b(), bVar2, null, 4, null);
        } else {
            bVar2 = bVar;
        }
        return m17628a(interfaceC3682c8, databaseProvider, c4166xj, bVar2, cacheEvictor);
    }

    /* JADX INFO: renamed from: a */
    public static final CacheDataSource.Factory m17630a(Cache cache, HttpDataSource.Factory httpDataSourceFactory) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        CacheDataSource.Factory cacheWriteDataSinkFactory = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(httpDataSourceFactory).setCacheWriteDataSinkFactory(null);
        Intrinsics.checkNotNullExpressionValue(cacheWriteDataSinkFactory, "setCacheWriteDataSinkFactory(...)");
        return cacheWriteDataSinkFactory;
    }

    /* JADX INFO: renamed from: a */
    public static final void m17631a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    /* JADX INFO: renamed from: b */
    public static final File m17632b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheDir = new C4023r8(context.getCacheDir()).f16139h;
        Intrinsics.checkNotNullExpressionValue(precacheDir, "precacheDir");
        return precacheDir;
    }

    /* JADX INFO: renamed from: c */
    public static final File m17633c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheQueueDir = new C4023r8(context.getCacheDir()).f16140i;
        Intrinsics.checkNotNullExpressionValue(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }
}
