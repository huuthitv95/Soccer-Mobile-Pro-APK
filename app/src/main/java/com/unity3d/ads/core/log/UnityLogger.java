package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnityLogger.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m43475d2 = {"Lcom/unity3d/ads/core/log/UnityLogger;", "Lcom/unity3d/ads/core/log/Logger;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/CreateFile;)V", "isForced", "", "value", "Lcom/unity3d/ads/core/log/LogLevelInternal;", "logLevel", "getLogLevel", "()Lcom/unity3d/ads/core/log/LogLevelInternal;", "setLogLevel", "(Lcom/unity3d/ads/core/log/LogLevelInternal;)V", "canLog", "targetLogLevel", "", "debug", "", "fb", "Lkotlin/Function0;", "", "message", "error", "e", "", "info", "trace", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class UnityLogger implements Logger {
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;
    private LogLevelInternal logLevel;

    public UnityLogger(SessionRepository sessionRepository, CreateFile createFile) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.logLevel = LogLevelInternal.INFO;
        File fileInvoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        boolean z = true;
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (fileInvoke.exists() || enableTracing) {
                    setLogLevel(LogLevelInternal.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
                this.isForced = getLogLevel() == LogLevelInternal.TRACE;
            } catch (Throwable unused) {
                Log.w("UnityAds", "An issue occurred while initializing the logger");
            }
        } finally {
            this.isForced = getLogLevel() == LogLevelInternal.TRACE;
        }
    }

    private final boolean canLog(int targetLogLevel) {
        return targetLogLevel >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(3)) {
            Log.d("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(Function0<String> fb) {
        Intrinsics.checkNotNullParameter(fb, "fb");
        if (canLog(3)) {
            debug(fb.invoke());
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(String message, Throwable e) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(6)) {
            Log.e("UnityAds", message, e);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public LogLevelInternal getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(4)) {
            Log.i("UnityAds", message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(LogLevelInternal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.isForced) {
            return;
        }
        this.logLevel = value;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(String message, Throwable e) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(2)) {
            Log.v("UnityAds", message, e);
        }
    }
}
