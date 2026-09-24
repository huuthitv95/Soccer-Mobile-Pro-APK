package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import com.ironsource.C11744X3;
import com.unity3d.services.core.p295di.ServiceProvider;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* JADX INFO: compiled from: AssetDownloader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J$\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002J\u001c\u0010$\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010%\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u001a\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010'\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m43475d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader;", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "(Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Lcom/vungle/ads/internal/util/PathProvider;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "transitioning", "", "Lcom/vungle/ads/internal/downloader/DownloadRequest;", "cancel", "", "request", "cancelAll", "checkSpaceAvailable", "", "downloadRequest", "decodeGzipIfNeeded", "Lokhttp3/ResponseBody;", "networkResponse", "Lokhttp3/Response;", "deliverError", "downloadListener", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener;", "downloadError", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$DownloadError;", "deliverSuccess", C11744X3.i.f26356b, "Ljava/io/File;", "listener", NativeAdPresenter.DOWNLOAD, "launchRequest", "launchRequestWithRetry", "onProgressChanged", "progress", "Lcom/vungle/ads/internal/downloader/AssetDownloadListener$Progress;", "shouldRetryDownload", "Companion", "OkHttpSingleton", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final long DOWNLOAD_RETRY_FAILURE = 2;
    private static final long DOWNLOAD_RETRY_SUCCESS = 1;
    private static final String GZIP = "gzip";
    private static final int MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 1;
    private static final String TAG = "AssetDownloader";
    private final VungleThreadPoolExecutor downloadExecutor;

    /* JADX INFO: renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy okHttpClient;
    private final PathProvider pathProvider;
    private final List<DownloadRequest> transitioning;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AssetDownloader.kt */
    @Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m43475d2 = {"Lcom/vungle/ads/internal/downloader/AssetDownloader$OkHttpSingleton;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "createOkHttpClient", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
    static final class OkHttpSingleton {
        public static final OkHttpSingleton INSTANCE = new OkHttpSingleton();
        private static OkHttpClient client;

        private OkHttpSingleton() {
        }

        public final OkHttpClient createOkHttpClient(PathProvider pathProvider) {
            Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
            OkHttpClient okHttpClient = client;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builderFollowSslRedirects = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).connectTimeout(60L, TimeUnit.SECONDS).cache(null).followRedirects(true).followSslRedirects(true);
            long cleverCacheDiskSize = ConfigManager.INSTANCE.getCleverCacheDiskSize();
            int cleverCacheDiskPercentage = ConfigManager.INSTANCE.getCleverCacheDiskPercentage();
            String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
            long jMin = Math.min(cleverCacheDiskSize, (pathProvider.getAvailableBytes(absolutePath) * ((long) cleverCacheDiskPercentage)) / ((long) 100));
            if (jMin > 0) {
                builderFollowSslRedirects.cache(new Cache(pathProvider.getCleverCacheDir(), jMin));
            } else {
                Logger.INSTANCE.m43471w(AssetDownloader.TAG, "cache disk capacity size <=0, no clever cache active.");
            }
            OkHttpClient okHttpClientBuild = builderFollowSslRedirects.build();
            client = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.downloadExecutor = downloadExecutor;
        this.pathProvider = pathProvider;
        this.okHttpClient = LazyKt.lazy(new Function0<OkHttpClient>() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$okHttpClient$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                return AssetDownloader.OkHttpSingleton.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
            }
        });
        this.transitioning = new ArrayList();
    }

    private final boolean checkSpaceAvailable(DownloadRequest downloadRequest) {
        PathProvider pathProvider = this.pathProvider;
        String absolutePath = pathProvider.getVungleDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long availableBytes = pathProvider.getAvailableBytes(absolutePath);
        if (availableBytes >= ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            return true;
        }
        new NoSpaceError("Insufficient space " + availableBytes).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        return false;
    }

    private final ResponseBody decodeGzipIfNeeded(Response networkResponse) {
        ResponseBody responseBodyBody = networkResponse.body();
        if (!StringsKt.equals(GZIP, Response.header$default(networkResponse, "Content-Encoding", null, 2, null), true) || responseBodyBody == null) {
            return responseBodyBody;
        }
        return new RealResponseBody(Response.header$default(networkResponse, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(responseBodyBody.getDelegateSource())));
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener downloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (downloadListener != null) {
            downloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener listener) {
        Logger.INSTANCE.m43467d(TAG, "On success " + downloadRequest);
        if (listener != null) {
            listener.onSuccess(file, downloadRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: download$lambda-0, reason: not valid java name */
    public static final void m44777download$lambda0(DownloadRequest downloadRequest, AssetDownloader this$0, AssetDownloadListener assetDownloadListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new OutOfMemory("Failed to execute download request: " + downloadRequest.getAsset().getServerPath()), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR()));
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) this.okHttpClient.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a8 A[Catch: Exception -> 0x0412, all -> 0x041f, TryCatch #23 {Exception -> 0x0412, blocks: (B:100:0x02a0, B:102:0x02a8, B:104:0x02ae, B:108:0x02bf, B:112:0x02de), top: B:265:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ae A[Catch: Exception -> 0x0412, all -> 0x041f, TRY_LEAVE, TryCatch #23 {Exception -> 0x0412, blocks: (B:100:0x02a0, B:102:0x02a8, B:104:0x02ae, B:108:0x02bf, B:112:0x02de), top: B:265:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02bf A[Catch: Exception -> 0x0412, all -> 0x041f, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x0412, blocks: (B:100:0x02a0, B:102:0x02a8, B:104:0x02ae, B:108:0x02bf, B:112:0x02de), top: B:265:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02d9 A[Catch: Exception -> 0x0285, all -> 0x0292, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x0292, blocks: (B:89:0x0276, B:91:0x0280, B:106:0x02b4, B:110:0x02d9), top: B:263:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x02de A[Catch: Exception -> 0x0412, all -> 0x041f, TRY_ENTER, TRY_LEAVE, TryCatch #23 {Exception -> 0x0412, blocks: (B:100:0x02a0, B:102:0x02a8, B:104:0x02ae, B:108:0x02bf, B:112:0x02de), top: B:265:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0318  */
    /* JADX WARN: Code duplicated, block: B:128:0x0320 A[Catch: all -> 0x040e, Exception -> 0x0410, TryCatch #27 {Exception -> 0x0410, all -> 0x040e, blocks: (B:122:0x02fb, B:128:0x0320, B:130:0x0328, B:132:0x0336, B:134:0x0350, B:135:0x0359, B:142:0x037a, B:143:0x03a8, B:144:0x03a9, B:146:0x03be), top: B:285:0x02fb }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0326  */
    /* JADX WARN: Code duplicated, block: B:132:0x0336 A[Catch: all -> 0x040e, Exception -> 0x0410, TryCatch #27 {Exception -> 0x0410, all -> 0x040e, blocks: (B:122:0x02fb, B:128:0x0320, B:130:0x0328, B:132:0x0336, B:134:0x0350, B:135:0x0359, B:142:0x037a, B:143:0x03a8, B:144:0x03a9, B:146:0x03be), top: B:285:0x02fb }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0350 A[Catch: all -> 0x040e, Exception -> 0x0410, TryCatch #27 {Exception -> 0x0410, all -> 0x040e, blocks: (B:122:0x02fb, B:128:0x0320, B:130:0x0328, B:132:0x0336, B:134:0x0350, B:135:0x0359, B:142:0x037a, B:143:0x03a8, B:144:0x03a9, B:146:0x03be), top: B:285:0x02fb }] */
    /* JADX WARN: Code duplicated, block: B:146:0x03be A[Catch: all -> 0x040e, Exception -> 0x0410, TRY_LEAVE, TryCatch #27 {Exception -> 0x0410, all -> 0x040e, blocks: (B:122:0x02fb, B:128:0x0320, B:130:0x0328, B:132:0x0336, B:134:0x0350, B:135:0x0359, B:142:0x037a, B:143:0x03a8, B:144:0x03a9, B:146:0x03be), top: B:285:0x02fb }] */
    /* JADX WARN: Code duplicated, block: B:148:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:186:0x046e  */
    /* JADX WARN: Code duplicated, block: B:216:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:217:0x0503  */
    /* JADX WARN: Code duplicated, block: B:219:0x0506  */
    /* JADX WARN: Code duplicated, block: B:223:0x0513  */
    /* JADX WARN: Code duplicated, block: B:228:0x054a  */
    /* JADX WARN: Code duplicated, block: B:233:0x055c  */
    /* JADX WARN: Code duplicated, block: B:234:0x057a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0583  */
    /* JADX WARN: Code duplicated, block: B:242:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:244:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:248:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:279:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x03a9 A[EDGE_INSN: B:290:0x03a9->B:144:0x03a9 BREAK  A[LOOP:0: B:87:0x0272->B:136:0x035d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x037a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a7 A[Catch: Exception -> 0x048e, all -> 0x0496, TRY_LEAVE, TryCatch #17 {Exception -> 0x048e, blocks: (B:40:0x01a1, B:42:0x01a7, B:50:0x01ca), top: B:260:0x01a1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01da A[Catch: all -> 0x01c2, Exception -> 0x01c5, TRY_ENTER, TryCatch #26 {Exception -> 0x01c5, all -> 0x01c2, blocks: (B:44:0x01ad, B:52:0x01da, B:54:0x01e7), top: B:286:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:54:0x01e7 A[Catch: all -> 0x01c2, Exception -> 0x01c5, TRY_LEAVE, TryCatch #26 {Exception -> 0x01c5, all -> 0x01c2, blocks: (B:44:0x01ad, B:52:0x01da, B:54:0x01e7), top: B:286:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x024b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0263  */
    /* JADX WARN: Code duplicated, block: B:88:0x0274  */
    /* JADX WARN: Code duplicated, block: B:99:0x0298  */
    /* JADX WARN: Instruction removed from duplicated block: B:233:0x055c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:236:0x0583, please report this as an issue */
    private final AssetDownloadListener.DownloadError launchRequest(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) throws Throwable {
        Call callNewCall;
        Response responseExecute;
        ResponseBody responseBodyBody;
        BufferedSource source;
        ResponseBody responseBodyBody2;
        AssetDownloadListener.DownloadError downloadError;
        int status;
        int currentRetryAttempt$vungle_ads_release;
        ResponseBody responseBodyBody3;
        ResponseBody responseBodyBody4;
        ResponseBody responseBodyDecodeGzipIfNeeded;
        String strHeader$default;
        long contentLength;
        Response response;
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        Response response2;
        ResponseBody responseBodyBody5;
        ResponseBody responseBodyBody6;
        long j3;
        Long rangeEnd;
        long rangeStart;
        int i4;
        AssetDownloader assetDownloader = this;
        AdAsset asset = downloadRequest.getAsset();
        Logger.INSTANCE.m43467d(TAG, "launch request in thread: " + Thread.currentThread().getId() + " request: " + asset.getServerPath());
        BufferedSink bufferedSinkBuffer = null;
        if (downloadRequest.isCancelled()) {
            Logger.INSTANCE.m43467d(TAG, "Request " + asset.getServerPath() + " is cancelled before starting");
            new AssetDownloadListener.Progress().setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
            return null;
        }
        AssetDownloadListener.Progress progress = new AssetDownloadListener.Progress();
        progress.setTimestampDownloadStart(System.currentTimeMillis());
        String serverPath = asset.getServerPath();
        String localPath = asset.getLocalPath();
        int iCode = -1;
        if (serverPath.length() == 0 || !FileUtility.INSTANCE.isValidUrl(serverPath)) {
            return new AssetDownloadListener.DownloadError(-1, new InvalidAssetUrlError("invalid url: " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getINTERNAL_ERROR());
        }
        if (localPath.length() == 0) {
            return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("invalid path: " + localPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getFILE_NOT_FOUND_ERROR());
        }
        if (!checkSpaceAvailable(downloadRequest)) {
            return new AssetDownloadListener.DownloadError(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
        }
        File file = new File(localPath);
        if (file.exists()) {
            Logger.INSTANCE.m43467d(TAG, "Deleting existing file before download: " + file.getAbsolutePath());
            if (!file.delete()) {
                return new AssetDownloadListener.DownloadError(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logError$vungle_ads_release(), AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getDISK_ERROR());
            }
        }
        try {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                callNewCall = assetDownloader.getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                responseExecute = callNewCall.execute();
                iCode = responseExecute.code();
                if (responseExecute.isSuccessful()) {
                    asset = asset;
                    throw new Downloader.RequestException(responseExecute.message());
                }
                if (responseExecute.cacheResponse() != null) {
                    AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                responseBodyDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(responseExecute);
                strHeader$default = Response.header$default(responseExecute, "Content-Type", null, 2, null);
                if (strHeader$default != null) {
                    downloadRequest.getAsset().setMimeType(strHeader$default);
                    Unit unit3 = Unit.INSTANCE;
                    Unit unit4 = Unit.INSTANCE;
                }
                if (responseBodyDecodeGzipIfNeeded != null) {
                    source = responseBodyDecodeGzipIfNeeded.getDelegateSource();
                } else {
                    source = null;
                }
                callNewCall = callNewCall;
                Logger.INSTANCE.m43467d(TAG, "Start download from url: " + serverPath + " mimeType=" + strHeader$default);
                bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
                if (responseBodyDecodeGzipIfNeeded != null) {
                    contentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                } else {
                    contentLength = 0;
                }
                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                progress.setSizeBytes(contentLength);
                progress.setReadBytes(0L);
                if (contentLength > 0) {
                    i = (int) (0 / contentLength);
                } else {
                    i = 0;
                }
                progress.setProgressPercent(i);
                asset.setContentLength(contentLength);
                assetDownloader = this;
                assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                i2 = 0;
                j = 0;
                while (true) {
                    if (source != null) {
                        i3 = iCode;
                        j2 = source.read(bufferedSinkBuffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                    } else {
                        i3 = iCode;
                        j2 = -1;
                    }
                    Unit unit5 = Unit.INSTANCE;
                    if (j2 <= 0) {
                        break;
                        break;
                    }
                    if (file.exists()) {
                        new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        throw new Downloader.RequestException("File is not existing");
                    }
                    if (downloadRequest.isCancelled()) {
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                        break;
                    }
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                    bufferedSinkBuffer.emit();
                    bufferedSinkBuffer.flush();
                    j3 = j + j2;
                    progress.setReadBytes(j3);
                    rangeEnd = asset.getRangeEnd();
                    if (rangeEnd != null) {
                        rangeStart = rangeEnd.longValue();
                    } else {
                        rangeStart = asset.getRangeStart();
                    }
                    response = responseExecute;
                    long j4 = rangeStart;
                    if (asset.isWaitingForDownload()) {
                        asset = asset;
                        source = source;
                    } else {
                        asset = asset;
                        source = source;
                    }
                    if (contentLength > 0) {
                        i4 = (int) ((((long) 100) * j3) / contentLength);
                    } else {
                        i4 = i2;
                    }
                    while (progress.getProgressPercent() + 1 <= Math.min(i4, 100)) {
                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                        if (progress.getProgressPercent() >= 100) {
                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                        }
                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                    }
                    i2 = i4;
                    asset = asset;
                    source = source;
                    responseExecute = response;
                    j = j3;
                    iCode = i3;
                    contentLength = contentLength;
                    iCode = i3;
                    responseExecute = response;
                    Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if (responseExecute != null) {
                        responseBodyBody3 = responseExecute.body();
                    } else {
                        responseBodyBody3 = null;
                    }
                    if (responseBodyBody3 != null) {
                        responseBodyBody4.close();
                        Unit unit6 = Unit.INSTANCE;
                    }
                    if (callNewCall != null) {
                        callNewCall.cancel();
                        Unit unit7 = Unit.INSTANCE;
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                    FileUtility.INSTANCE.closeQuietly(source);
                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                    status = progress.getStatus();
                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                            Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                            return null;
                        }
                        assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                        if (currentRetryAttempt$vungle_ads_release > 0) {
                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                        }
                        return null;
                    }
                    return downloadError;
                }
                BufferedSource bufferedSource = source;
                response2 = responseExecute;
                bufferedSinkBuffer.flush();
                if (progress.getStatus() == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS()) {
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                    assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                }
                if (response2 != null) {
                    responseBodyBody5 = response2.body();
                } else {
                    responseBodyBody5 = null;
                }
                if (responseBodyBody5 != null) {
                    responseBodyBody6.close();
                    Unit unit8 = Unit.INSTANCE;
                }
                if (callNewCall != null) {
                    callNewCall.cancel();
                    Unit unit9 = Unit.INSTANCE;
                }
                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                FileUtility.INSTANCE.closeQuietly(bufferedSource);
                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                downloadError = null;
                status = progress.getStatus();
                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                        Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                        return null;
                    }
                    assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                    if (currentRetryAttempt$vungle_ads_release > 0) {
                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                    }
                    return null;
                }
                return downloadError;
            }
            try {
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                callNewCall = assetDownloader.getOkHttpClient().newCall(new Request.Builder().url(serverPath).build());
                try {
                    responseExecute = callNewCall.execute();
                    try {
                        try {
                            iCode = responseExecute.code();
                            try {
                                if (responseExecute.isSuccessful()) {
                                    asset = asset;
                                    try {
                                        throw new Downloader.RequestException(responseExecute.message());
                                    } catch (Exception e) {
                                        e = e;
                                        callNewCall = callNewCall;
                                        iCode = iCode;
                                        responseExecute = responseExecute;
                                        bufferedSinkBuffer = null;
                                        source = null;
                                        Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                        downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                        if (responseExecute != null) {
                                            responseBodyBody3 = responseExecute.body();
                                        } else {
                                            responseBodyBody3 = null;
                                        }
                                        if (responseBodyBody3 != null) {
                                            responseBodyBody4.close();
                                            Unit unit10 = Unit.INSTANCE;
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                            Unit unit11 = Unit.INSTANCE;
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                        FileUtility.INSTANCE.closeQuietly(source);
                                        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                        status = progress.getStatus();
                                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                            if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                                Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                                assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                return null;
                                            }
                                            assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                            currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                            }
                                            return null;
                                        }
                                        return downloadError;
                                    } catch (Throwable th) {
                                        th = th;
                                        callNewCall = callNewCall;
                                        responseExecute = responseExecute;
                                        bufferedSinkBuffer = null;
                                        responseBodyBody = null;
                                        source = null;
                                        if (responseExecute != null) {
                                            responseBodyBody = responseExecute.body();
                                        }
                                        if (responseBodyBody != null) {
                                            responseBodyBody2.close();
                                            Unit unit12 = Unit.INSTANCE;
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                            Unit unit13 = Unit.INSTANCE;
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                        FileUtility.INSTANCE.closeQuietly(source);
                                        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                        throw th;
                                    }
                                }
                                if (responseExecute.cacheResponse() != null) {
                                    try {
                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), downloadRequest.getLogEntry(), serverPath);
                                        Unit unit14 = Unit.INSTANCE;
                                        Unit unit15 = Unit.INSTANCE;
                                    } catch (Exception e2) {
                                        e = e2;
                                        asset = asset;
                                        bufferedSinkBuffer = null;
                                        source = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedSinkBuffer = null;
                                        responseBodyBody = null;
                                        source = null;
                                        if (responseExecute != null) {
                                            responseBodyBody = responseExecute.body();
                                        }
                                        if (responseBodyBody != null) {
                                            responseBodyBody2.close();
                                            Unit unit16 = Unit.INSTANCE;
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                            Unit unit17 = Unit.INSTANCE;
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                        FileUtility.INSTANCE.closeQuietly(source);
                                        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                        throw th;
                                    }
                                }
                                responseBodyDecodeGzipIfNeeded = assetDownloader.decodeGzipIfNeeded(responseExecute);
                                strHeader$default = Response.header$default(responseExecute, "Content-Type", null, 2, null);
                                if (strHeader$default != null) {
                                    downloadRequest.getAsset().setMimeType(strHeader$default);
                                    Unit unit18 = Unit.INSTANCE;
                                    Unit unit19 = Unit.INSTANCE;
                                }
                                if (responseBodyDecodeGzipIfNeeded != null) {
                                    source = responseBodyDecodeGzipIfNeeded.getDelegateSource();
                                } else {
                                    source = null;
                                }
                                try {
                                    callNewCall = callNewCall;
                                    try {
                                        Logger.INSTANCE.m43467d(TAG, "Start download from url: " + serverPath + " mimeType=" + strHeader$default);
                                        bufferedSinkBuffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file, false, 1, null));
                                        if (responseBodyDecodeGzipIfNeeded != null) {
                                            try {
                                                contentLength = responseBodyDecodeGzipIfNeeded.getContentLength();
                                            } catch (Exception e3) {
                                                e = e3;
                                                assetDownloader = this;
                                                asset = asset;
                                                source = source;
                                                callNewCall = callNewCall;
                                                try {
                                                    Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                    if (responseExecute != null) {
                                                        responseBodyBody3 = responseExecute.body();
                                                    } else {
                                                        responseBodyBody3 = null;
                                                    }
                                                    if (responseBodyBody3 != null) {
                                                        responseBodyBody4.close();
                                                        Unit unit110 = Unit.INSTANCE;
                                                    }
                                                    if (callNewCall != null) {
                                                        callNewCall.cancel();
                                                        Unit unit111 = Unit.INSTANCE;
                                                    }
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                    FileUtility.INSTANCE.closeQuietly(source);
                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                    status = progress.getStatus();
                                                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                                            Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                            return null;
                                                        }
                                                        assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                        }
                                                        return null;
                                                    }
                                                    return downloadError;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    responseBodyBody = null;
                                                    if (responseExecute != null) {
                                                        responseBodyBody = responseExecute.body();
                                                    }
                                                    if (responseBodyBody != null) {
                                                        responseBodyBody2.close();
                                                        Unit unit112 = Unit.INSTANCE;
                                                    }
                                                    if (callNewCall != null) {
                                                        callNewCall.cancel();
                                                        Unit unit113 = Unit.INSTANCE;
                                                    }
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                    FileUtility.INSTANCE.closeQuietly(source);
                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                source = source;
                                                callNewCall = callNewCall;
                                                responseBodyBody = null;
                                                if (responseExecute != null) {
                                                    responseBodyBody = responseExecute.body();
                                                }
                                                if (responseBodyBody != null) {
                                                    responseBodyBody2.close();
                                                    Unit unit114 = Unit.INSTANCE;
                                                }
                                                if (callNewCall != null) {
                                                    callNewCall.cancel();
                                                    Unit unit115 = Unit.INSTANCE;
                                                }
                                                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                FileUtility.INSTANCE.closeQuietly(source);
                                                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                throw th;
                                            }
                                        } else {
                                            contentLength = 0;
                                        }
                                        try {
                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED());
                                            progress.setSizeBytes(contentLength);
                                            progress.setReadBytes(0L);
                                            if (contentLength > 0) {
                                                try {
                                                    i = (int) (0 / contentLength);
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    assetDownloader = this;
                                                    asset = asset;
                                                    source = source;
                                                    responseExecute = responseExecute;
                                                    callNewCall = callNewCall;
                                                    Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                    if (responseExecute != null) {
                                                        responseBodyBody3 = responseExecute.body();
                                                    } else {
                                                        responseBodyBody3 = null;
                                                    }
                                                    if (responseBodyBody3 != null) {
                                                        responseBodyBody4.close();
                                                        Unit unit116 = Unit.INSTANCE;
                                                    }
                                                    if (callNewCall != null) {
                                                        callNewCall.cancel();
                                                        Unit unit117 = Unit.INSTANCE;
                                                    }
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                    FileUtility.INSTANCE.closeQuietly(source);
                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                    status = progress.getStatus();
                                                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                                            Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                            return null;
                                                        }
                                                        assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                        if (currentRetryAttempt$vungle_ads_release > 0) {
                                                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                        }
                                                        return null;
                                                    }
                                                    return downloadError;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    source = source;
                                                    responseExecute = responseExecute;
                                                    callNewCall = callNewCall;
                                                    responseBodyBody = null;
                                                    if (responseExecute != null) {
                                                        responseBodyBody = responseExecute.body();
                                                    }
                                                    if (responseBodyBody != null) {
                                                        responseBodyBody2.close();
                                                        Unit unit118 = Unit.INSTANCE;
                                                    }
                                                    if (callNewCall != null) {
                                                        callNewCall.cancel();
                                                        Unit unit119 = Unit.INSTANCE;
                                                    }
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                    FileUtility.INSTANCE.closeQuietly(source);
                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                    throw th;
                                                }
                                            } else {
                                                i = 0;
                                            }
                                            progress.setProgressPercent(i);
                                            asset.setContentLength(contentLength);
                                            assetDownloader = this;
                                            try {
                                                try {
                                                    assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                    i2 = 0;
                                                    j = 0;
                                                    while (true) {
                                                        if (source != null) {
                                                            try {
                                                                try {
                                                                    i3 = iCode;
                                                                    try {
                                                                        j2 = source.read(bufferedSinkBuffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        asset = asset;
                                                                        source = source;
                                                                        bufferedSinkBuffer = bufferedSinkBuffer;
                                                                        responseExecute = responseExecute;
                                                                        callNewCall = callNewCall;
                                                                        iCode = i3;
                                                                        Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                                        downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                        if (responseExecute != null) {
                                                                            responseBodyBody3 = responseExecute.body();
                                                                        } else {
                                                                            responseBodyBody3 = null;
                                                                        }
                                                                        if (responseBodyBody3 != null) {
                                                                            responseBodyBody4.close();
                                                                            Unit unit1110 = Unit.INSTANCE;
                                                                        }
                                                                        if (callNewCall != null) {
                                                                            callNewCall.cancel();
                                                                            Unit unit1111 = Unit.INSTANCE;
                                                                        }
                                                                        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                                        FileUtility.INSTANCE.closeQuietly(source);
                                                                        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    asset = asset;
                                                                    source = source;
                                                                    responseExecute = responseExecute;
                                                                    callNewCall = callNewCall;
                                                                    Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                                    if (responseExecute != null) {
                                                                        responseBodyBody3 = responseExecute.body();
                                                                    } else {
                                                                        responseBodyBody3 = null;
                                                                    }
                                                                    if (responseBodyBody3 != null) {
                                                                        responseBodyBody4.close();
                                                                        Unit unit1112 = Unit.INSTANCE;
                                                                    }
                                                                    if (callNewCall != null) {
                                                                        callNewCall.cancel();
                                                                        Unit unit1113 = Unit.INSTANCE;
                                                                    }
                                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                                    FileUtility.INSTANCE.closeQuietly(source);
                                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                source = source;
                                                                responseExecute = responseExecute;
                                                                callNewCall = callNewCall;
                                                                responseBodyBody = null;
                                                                if (responseExecute != null) {
                                                                    responseBodyBody = responseExecute.body();
                                                                }
                                                                if (responseBodyBody != null) {
                                                                    responseBodyBody2.close();
                                                                    Unit unit1114 = Unit.INSTANCE;
                                                                }
                                                                if (callNewCall != null) {
                                                                    callNewCall.cancel();
                                                                    Unit unit1115 = Unit.INSTANCE;
                                                                }
                                                                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                                FileUtility.INSTANCE.closeQuietly(source);
                                                                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                                throw th;
                                                            }
                                                        } else {
                                                            i3 = iCode;
                                                            j2 = -1;
                                                        }
                                                        try {
                                                            Unit unit20 = Unit.INSTANCE;
                                                            if (j2 <= 0) {
                                                                break;
                                                            }
                                                            if (file.exists()) {
                                                                new AssetWriteError("Asset save error " + serverPath).setLogEntry$vungle_ads_release(downloadRequest.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                                                                throw new Downloader.RequestException("File is not existing");
                                                            }
                                                            if (downloadRequest.isCancelled()) {
                                                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED());
                                                                break;
                                                            }
                                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                                            bufferedSinkBuffer.emit();
                                                            bufferedSinkBuffer.flush();
                                                            j3 = j + j2;
                                                            progress.setReadBytes(j3);
                                                            rangeEnd = asset.getRangeEnd();
                                                            if (rangeEnd != null) {
                                                                rangeStart = rangeEnd.longValue();
                                                            } else {
                                                                rangeStart = asset.getRangeStart();
                                                            }
                                                            response = responseExecute;
                                                            long j5 = rangeStart;
                                                            try {
                                                                try {
                                                                    if (asset.isWaitingForDownload() || j3 < j5) {
                                                                        asset = asset;
                                                                        source = source;
                                                                    } else {
                                                                        Logger.Companion companion = Logger.INSTANCE;
                                                                        asset = asset;
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            source = source;
                                                                            try {
                                                                                sb.append("Downloader totalRead=");
                                                                                sb.append(j3);
                                                                                sb.append(" requiredBytes=");
                                                                                sb.append(j5);
                                                                                companion.m43468e(TAG, sb.toString());
                                                                                asset.notifyDownloadEnough();
                                                                            } catch (Exception e7) {
                                                                                e = e7;
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                bufferedSinkBuffer = bufferedSinkBuffer;
                                                                                callNewCall = callNewCall;
                                                                                responseExecute = response;
                                                                                responseBodyBody = null;
                                                                                if (responseExecute != null) {
                                                                                    responseBodyBody = responseExecute.body();
                                                                                }
                                                                                if (responseBodyBody != null) {
                                                                                    responseBodyBody2.close();
                                                                                    Unit unit1116 = Unit.INSTANCE;
                                                                                }
                                                                                if (callNewCall != null) {
                                                                                    callNewCall.cancel();
                                                                                    Unit unit1117 = Unit.INSTANCE;
                                                                                }
                                                                                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                                                FileUtility.INSTANCE.closeQuietly(source);
                                                                                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                                                throw th;
                                                                            }
                                                                        } catch (Exception e8) {
                                                                            e = e8;
                                                                            source = source;
                                                                        }
                                                                    }
                                                                    if (contentLength > 0) {
                                                                        i4 = (int) ((((long) 100) * j3) / contentLength);
                                                                    } else {
                                                                        i4 = i2;
                                                                    }
                                                                    while (progress.getProgressPercent() + 1 <= Math.min(i4, 100)) {
                                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS());
                                                                        progress.setProgressPercent(progress.getProgressPercent() + 1);
                                                                        if (progress.getProgressPercent() >= 100) {
                                                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                                                                        }
                                                                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                                    }
                                                                    i2 = i4;
                                                                    asset = asset;
                                                                    source = source;
                                                                    responseExecute = response;
                                                                    j = j3;
                                                                    iCode = i3;
                                                                    contentLength = contentLength;
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    asset = asset;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                source = source;
                                                            }
                                                            iCode = i3;
                                                            responseExecute = response;
                                                            Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                                            progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                                            downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                                            if (responseExecute != null) {
                                                                responseBodyBody3 = responseExecute.body();
                                                            } else {
                                                                responseBodyBody3 = null;
                                                            }
                                                            if (responseBodyBody3 != null && (responseBodyBody4 = responseExecute.body()) != null) {
                                                                responseBodyBody4.close();
                                                                Unit unit1118 = Unit.INSTANCE;
                                                            }
                                                            if (callNewCall != null) {
                                                                callNewCall.cancel();
                                                                Unit unit1119 = Unit.INSTANCE;
                                                            }
                                                            FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                            FileUtility.INSTANCE.closeQuietly(source);
                                                            Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                            status = progress.getStatus();
                                                            if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR() || status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getSTARTED()) {
                                                                return downloadError;
                                                            }
                                                            if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                                                Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                                                assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                                return null;
                                                            }
                                                            assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                                            currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                                            if (currentRetryAttempt$vungle_ads_release > 0) {
                                                                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                                            }
                                                            return null;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            asset = asset;
                                                            source = source;
                                                            response = responseExecute;
                                                        }
                                                    }
                                                    BufferedSource bufferedSource2 = source;
                                                    response2 = responseExecute;
                                                    bufferedSinkBuffer.flush();
                                                    if (progress.getStatus() == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getIN_PROGRESS()) {
                                                        progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getDONE());
                                                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                                    }
                                                    if (response2 != null) {
                                                        responseBodyBody5 = response2.body();
                                                    } else {
                                                        responseBodyBody5 = null;
                                                    }
                                                    if (responseBodyBody5 != null && (responseBodyBody6 = response2.body()) != null) {
                                                        responseBodyBody6.close();
                                                        Unit unit21 = Unit.INSTANCE;
                                                    }
                                                    if (callNewCall != null) {
                                                        callNewCall.cancel();
                                                        Unit unit22 = Unit.INSTANCE;
                                                    }
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                    FileUtility.INSTANCE.closeQuietly(bufferedSource2);
                                                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                    downloadError = null;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    asset = asset;
                                                    source = source;
                                                    response = responseExecute;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                source = source;
                                                response = responseExecute;
                                                bufferedSinkBuffer = bufferedSinkBuffer;
                                                callNewCall = callNewCall;
                                                responseExecute = response;
                                                responseBodyBody = null;
                                                if (responseExecute != null) {
                                                    responseBodyBody = responseExecute.body();
                                                }
                                                if (responseBodyBody != null) {
                                                    responseBodyBody2.close();
                                                    Unit unit11110 = Unit.INSTANCE;
                                                }
                                                if (callNewCall != null) {
                                                    callNewCall.cancel();
                                                    Unit unit11111 = Unit.INSTANCE;
                                                }
                                                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                                FileUtility.INSTANCE.closeQuietly(source);
                                                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                                throw th;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            assetDownloader = this;
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        callNewCall = callNewCall;
                                        bufferedSinkBuffer = null;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        callNewCall = callNewCall;
                                        bufferedSinkBuffer = null;
                                        responseBodyBody = null;
                                        if (responseExecute != null) {
                                            responseBodyBody = responseExecute.body();
                                        }
                                        if (responseBodyBody != null) {
                                            responseBodyBody2.close();
                                            Unit unit11112 = Unit.INSTANCE;
                                        }
                                        if (callNewCall != null) {
                                            callNewCall.cancel();
                                            Unit unit11113 = Unit.INSTANCE;
                                        }
                                        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                        FileUtility.INSTANCE.closeQuietly(source);
                                        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                        throw th;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                                status = progress.getStatus();
                                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                        Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                        return null;
                                    }
                                    assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                    }
                                    return null;
                                }
                                return downloadError;
                            } catch (Exception e15) {
                                e = e15;
                                bufferedSinkBuffer = null;
                                source = null;
                                Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                                progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                                downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                                if (responseExecute != null) {
                                    responseBodyBody3 = responseExecute.body();
                                } else {
                                    responseBodyBody3 = null;
                                }
                                if (responseBodyBody3 != null) {
                                    responseBodyBody4.close();
                                    Unit unit11114 = Unit.INSTANCE;
                                }
                                if (callNewCall != null) {
                                    callNewCall.cancel();
                                    Unit unit11115 = Unit.INSTANCE;
                                }
                                FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                                FileUtility.INSTANCE.closeQuietly(source);
                                Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                                status = progress.getStatus();
                                if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                                        Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                                        assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                                        return null;
                                    }
                                    assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                                    currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                                    if (currentRetryAttempt$vungle_ads_release > 0) {
                                        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                                    }
                                    return null;
                                }
                                return downloadError;
                            }
                        } catch (Exception e16) {
                            e = e16;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } catch (Exception e17) {
                    e = e17;
                    bufferedSinkBuffer = null;
                    responseExecute = null;
                    source = null;
                    Logger.INSTANCE.m43468e(TAG, "Download exception for " + asset.getServerPath() + ": " + e);
                    progress.setStatus(AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR());
                    downloadError = new AssetDownloadListener.DownloadError(iCode, e, AssetDownloadListener.DownloadError.ErrorReason.INSTANCE.getREQUEST_ERROR());
                    if (responseExecute != null) {
                        responseBodyBody3 = responseExecute.body();
                    } else {
                        responseBodyBody3 = null;
                    }
                    if (responseBodyBody3 != null) {
                        responseBodyBody4.close();
                        Unit unit11116 = Unit.INSTANCE;
                    }
                    if (callNewCall != null) {
                        callNewCall.cancel();
                        Unit unit11117 = Unit.INSTANCE;
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                    FileUtility.INSTANCE.closeQuietly(source);
                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                    status = progress.getStatus();
                    if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getERROR()) {
                        if (status == AssetDownloadListener.Progress.ProgressStatus.INSTANCE.getCANCELLED()) {
                            Logger.INSTANCE.m43467d(TAG, "On cancel " + downloadRequest);
                            assetDownloader.onProgressChanged(downloadRequest, progress, downloadListener);
                            return null;
                        }
                        assetDownloader.deliverSuccess(file, downloadRequest, downloadListener);
                        currentRetryAttempt$vungle_ads_release = downloadRequest.getCurrentRetryAttempt$vungle_ads_release();
                        if (currentRetryAttempt$vungle_ads_release > 0) {
                            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, downloadRequest.getLogEntry(), "retryCount=" + currentRetryAttempt$vungle_ads_release + " url=" + downloadRequest.getAsset().getServerPath());
                        }
                        return null;
                    }
                    return downloadError;
                } catch (Throwable th14) {
                    th = th14;
                    bufferedSinkBuffer = null;
                    responseExecute = null;
                    responseBodyBody = null;
                    source = null;
                    if (responseExecute != null) {
                        responseBodyBody = responseExecute.body();
                    }
                    if (responseBodyBody != null) {
                        responseBodyBody2.close();
                        Unit unit11118 = Unit.INSTANCE;
                    }
                    if (callNewCall != null) {
                        callNewCall.cancel();
                        Unit unit11119 = Unit.INSTANCE;
                    }
                    FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
                    FileUtility.INSTANCE.closeQuietly(source);
                    Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                asset = asset;
                callNewCall = null;
                responseExecute = null;
                source = null;
            } catch (Throwable th15) {
                th = th15;
                callNewCall = null;
                responseExecute = null;
                responseBodyBody = null;
                source = null;
            }
        } catch (Exception e19) {
            e = e19;
            bufferedSinkBuffer = null;
            callNewCall = null;
        } catch (Throwable th16) {
            th = th16;
            bufferedSinkBuffer = null;
            callNewCall = null;
        }
        if (responseExecute != null) {
            responseBodyBody = responseExecute.body();
        }
        if (responseBodyBody != null && (responseBodyBody2 = responseExecute.body()) != null) {
            responseBodyBody2.close();
            Unit unit111110 = Unit.INSTANCE;
        }
        if (callNewCall != null) {
            callNewCall.cancel();
            Unit unit111111 = Unit.INSTANCE;
        }
        FileUtility.INSTANCE.closeQuietly(bufferedSinkBuffer);
        FileUtility.INSTANCE.closeQuietly(source);
        Logger.INSTANCE.m43467d(TAG, "download status: " + progress.getStatus());
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchRequestWithRetry(DownloadRequest downloadRequest, AssetDownloadListener downloadListener) throws Throwable {
        if (downloadListener != null) {
            downloadListener.onStart(downloadRequest);
        }
        AssetDownloadListener.DownloadError downloadErrorLaunchRequest = launchRequest(downloadRequest, downloadListener);
        while (downloadErrorLaunchRequest != null && shouldRetryDownload(downloadRequest, downloadErrorLaunchRequest)) {
            downloadRequest.incrementRetryAttempt$vungle_ads_release();
            downloadRequest.recordRetryReason$vungle_ads_release("Error: " + downloadErrorLaunchRequest.getCause().getMessage() + ", Code: " + downloadErrorLaunchRequest.getServerCode() + ", Reason: " + downloadErrorLaunchRequest.getReason());
            Logger.INSTANCE.m43471w(TAG, "Download failed, retrying immediately. Attempt " + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + '/' + downloadRequest.getMaxRetries() + ". URL: " + downloadRequest.getAsset().getServerPath() + ", Error: " + downloadErrorLaunchRequest.getCause().getMessage());
            downloadErrorLaunchRequest = launchRequest(downloadRequest, downloadListener);
        }
        if (downloadErrorLaunchRequest != null) {
            Logger.INSTANCE.m43468e(TAG, "Download failed after " + (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + 1) + " attempts. URL: " + downloadRequest.getAsset().getServerPath() + ". Retry history: " + downloadRequest.getRetryReasons$vungle_ads_release());
            if (downloadRequest.getCurrentRetryAttempt$vungle_ads_release() > 0) {
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 2L, downloadRequest.getLogEntry(), "retryCount=" + downloadRequest.getCurrentRetryAttempt$vungle_ads_release() + " url=" + downloadRequest.getAsset().getServerPath());
            }
            deliverError(downloadRequest, downloadListener, downloadErrorLaunchRequest);
        }
    }

    private final void onProgressChanged(DownloadRequest downloadRequest, AssetDownloadListener.Progress progress, AssetDownloadListener downloadListener) {
        if (downloadListener != null) {
            downloadListener.onProgress(progress, downloadRequest);
        }
    }

    private final boolean shouldRetryDownload(DownloadRequest downloadRequest, AssetDownloadListener.DownloadError downloadError) {
        if (downloadRequest.isCancelled()) {
            Logger.INSTANCE.m43467d(TAG, "Download cancelled, not retrying");
            return false;
        }
        Integer percentage = downloadRequest.getAsset().getPercentage();
        if (percentage != null && percentage.intValue() < 100) {
            Logger.INSTANCE.m43467d(TAG, "Partial download asset (percentage=" + percentage + "), not retrying");
            return false;
        }
        if (!downloadRequest.canRetry$vungle_ads_release()) {
            Logger.INSTANCE.m43467d(TAG, "Max retry attempts reached (" + downloadRequest.getMaxRetries() + ')');
            return false;
        }
        if (AssetDownloadListener.DownloadError.INSTANCE.shouldRetry(downloadError)) {
            return true;
        }
        Logger.INSTANCE.m43467d(TAG, "Error reason " + downloadError.getReason() + " is not retryable");
        return false;
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest request) {
        if (request == null || request.isCancelled()) {
            return;
        }
        request.cancel();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener downloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader.download.1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                AssetDownloader.this.launchRequestWithRetry(downloadRequest, downloadListener);
            }
        }, new Runnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AssetDownloader.m44777download$lambda0(downloadRequest, this, downloadListener);
            }
        });
    }
}
