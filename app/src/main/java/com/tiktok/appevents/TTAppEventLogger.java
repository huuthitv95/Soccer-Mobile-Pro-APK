package com.tiktok.appevents;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.adjust.sdk.Constants;
import com.ironsource.C11744X3;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.appevents.edp.TTEDPEventTrack;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import com.tiktok.unity.TTUnityBridge;
import com.tiktok.util.HttpRequestUtil;
import com.tiktok.util.JSON;
import com.tiktok.util.NetworkTimeout;
import com.tiktok.util.SystemInfoUtil;
import com.tiktok.util.TTConst;
import com.tiktok.util.TTHandlerUtil;
import com.tiktok.util.TTLogger;
import com.tiktok.util.TTUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTAppEventLogger {
    public static final String NETWORK_IS_TURNED_OFF = "SDK can't send tracking events to server, it will be cached locally, and will be sent in batches only after startTracking";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED = "Skip flushing because global config is not fetched";
    static final String SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF = "Skip flushing because global switch is turned off";
    static final String TAG = "TTAppEventLogger";
    static final int THRESHOLD = 100;
    private static int TIME_BUFFER = 0;
    public static volatile boolean autoTrackRetentionEnable = true;
    static int totalDumped;
    final TTAutoEventsManager autoEventsManager;
    int counter;
    final List<TTConst.AutoEvents> disabledEvents;
    private final Runnable heartRunnable;
    Lifecycle lifecycle;
    final boolean lifecycleTrackEnable;
    TTLogger logger;
    final Handler uiThreadHandler;
    static final ScheduledExecutorService eventLoop = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static final ScheduledExecutorService timerService = Executors.newSingleThreadScheduledExecutor(new TTThreadFactory());
    static boolean metricsEnabled = true;
    private static final TTLifecycleListener mLifecycleListener = new TTLifecycleListener();
    int flushId = 0;
    ScheduledFuture<?> future = null;
    ScheduledFuture<?> timeFuture = null;
    private final Runnable batchFlush = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.m44666lambda$new$0$comtiktokappeventsTTAppEventLogger();
        }
    };

    public enum FlushReason {
        THRESHOLD,
        TIMER,
        START_UP,
        FORCE_FLUSH,
        IDENTIFY,
        LOGOUT
    }

    public TTAppEventLogger(boolean lifecycleTrackEnable, List<TTConst.AutoEvents> disabledEvents, int flushTime, boolean monitorDisable) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.uiThreadHandler = handler;
        this.heartRunnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppEventLogger.this.startHeart();
                    if (!TTActivityLifecycleCallbacksListener.isBackground() && TikTokBusinessSdk.isGlobalConfigFetched().booleanValue() && TikTokBusinessSdk.isSystemActivated()) {
                        TikTokBusinessSdk.getAppEventLogger().monitorMetric("session_activity", TTUtil.getMetaWithTS(Long.valueOf(System.currentTimeMillis())), null);
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.logger = new TTLogger(TAG, TikTokBusinessSdk.getLogLevel());
        this.lifecycleTrackEnable = lifecycleTrackEnable;
        this.disabledEvents = disabledEvents;
        TIME_BUFFER = flushTime;
        this.counter = flushTime;
        this.lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        if (monitorDisable) {
            metricsEnabled = false;
        }
        Runnable runnable = new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppEventLogger.this.lifecycle.addObserver(new TTActivityLifecycleCallbacksListener(TTAppEventLogger.this));
                    TikTokBusinessSdk.getApplicationContext().registerActivityLifecycleCallbacks(TTAppEventLogger.mLifecycleListener);
                } catch (Throwable unused) {
                }
            }
        };
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } catch (Throwable unused) {
        }
        this.autoEventsManager = new TTAutoEventsManager(this);
    }

    private void activateSdk() {
        this.autoEventsManager.trackOnAppOpenEvents();
        startScheduler();
        m44664lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.START_UP);
        TTEDPEventTrack.trackFirstAppLaunch();
    }

    private void addToLater(Runnable task, int seconds) {
        try {
            eventLoop.schedule(task, seconds, TimeUnit.SECONDS);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addToTask(final TTAppEvent appEvent, final TTAppEvent.TTAppEventType type, final String event, final JSONObject props, final String eventId, final boolean edp) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44661lambda$addToTask$5$comtiktokappeventsTTAppEventLogger(appEvent, edp, props, type, event, eventId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllImmediately() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        TTAppEventStorage.clearAll();
    }

    private void doStartScheduler(final int interval, boolean immediate) {
        try {
            if (this.future == null) {
                this.future = eventLoop.scheduleWithFixedDelay(this.batchFlush, immediate ? 0L : interval, interval, TimeUnit.SECONDS);
            }
            if (this.timeFuture != null || TikTokBusinessSdk.nextTimeFlushListener == null) {
                return;
            }
            this.counter = interval;
            this.timeFuture = timerService.scheduleWithFixedDelay(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44662lambda$doStartScheduler$4$comtiktokappeventsTTAppEventLogger(interval);
                }
            }, 0L, 1L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
            TikTokBusinessSdk.setSdkGlobalSwitch(false);
        }
    }

    public static List<TTAppEvent> getSuccessfulEvents() {
        return TTRequest.getSuccessfullySentRequests();
    }

    static /* synthetic */ void lambda$fetchDeferredDeeplinkWithCompletion$9(final DeeplinkCallbackWrapper wrapper) {
        ErrorData errorData;
        String str = "";
        wrapper.markThread();
        try {
            HttpRequestUtil.HttpResponse httpResponseFetchDeferredDeeplinkWithCompletion = TTRequest.fetchDeferredDeeplinkWithCompletion();
            String string = JSON.getString(JSON.getJsonObject(httpResponseFetchDeferredDeeplinkWithCompletion.body, "data"), "ddl");
            wrapper.markRequest();
            if (!httpResponseFetchDeferredDeeplinkWithCompletion.isOK() || TextUtils.isEmpty(string)) {
                errorData = new ErrorData(httpResponseFetchDeferredDeeplinkWithCompletion.getErrCode(), httpResponseFetchDeferredDeeplinkWithCompletion.getErrMsg());
            } else {
                errorData = null;
                str = string;
            }
        } catch (Throwable th) {
            errorData = new ErrorData(-2, th.getMessage());
        }
        wrapper.markEnd();
        wrapper.completion(str, errorData);
    }

    static /* synthetic */ void lambda$monitorMetric$8(final String name, final JSONObject meta, final JSONObject extra) {
        JSONObject jSONObjectBuild;
        if (metricsEnabled) {
            try {
                jSONObjectBuild = TTRequestBuilder.getHealthMonitorBase();
            } catch (Throwable unused) {
                jSONObjectBuild = JSON.build();
            }
            JSONObject jSONObjectBuild2 = JSON.build();
            JSON.putObject(jSONObjectBuild2, "type", "metric");
            JSON.putObject(jSONObjectBuild2, "name", name);
            if (meta != null) {
                JSON.putObject(jSONObjectBuild2, Constants.REFERRER_API_META, meta);
            }
            if (extra != null) {
                JSON.putObject(jSONObjectBuild2, "extra", extra);
            }
            JSON.putObject(jSONObjectBuild, "monitor", jSONObjectBuild2);
            TTCrashHandler.retryLater(jSONObjectBuild);
        }
    }

    private void onExecuteFailed(Runnable runnable, Throwable e) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.logger.error(e, "Runnable execute error", new Object[0]);
        }
    }

    private void trackEvent(final TTAppEvent.TTAppEventType type, final String event, JSONObject props, final String eventId, final boolean edp) {
        if (!TikTokBusinessSdk.isSystemActivated() || TextUtils.isEmpty(TikTokBusinessSdk.getAppId())) {
            return;
        }
        try {
            if ("enhanced_data_postback".equals(JSON.getString(props, "monitor_type", ""))) {
                TTEDPEventTrack.trackUnityEvent(event, props);
                return;
            }
        } catch (Throwable unused) {
        }
        if (props == null) {
            props = JSON.build();
        }
        final JSONObject jSONObject = props;
        if (TikTokBusinessSdk.isEnableDebugMode().booleanValue()) {
            this.uiThreadHandler.post(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (edp) {
                            JSON.putObject(jSONObject, "track_source", "edp");
                        }
                        TTAppEvent tTAppEvent = new TTAppEvent(type, event, jSONObject.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
                        tTAppEvent.setScreenShot();
                        TTAppEventLogger.this.addToTask(tTAppEvent, null, null, null, null, edp);
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else {
            addToTask(null, type, event, jSONObject, eventId, edp);
        }
    }

    public void addToQ(Runnable task) {
        try {
            eventLoop.execute(task);
        } catch (Throwable th) {
            onExecuteFailed(task, th);
        }
    }

    public void clearAll() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.clearAllImmediately();
            }
        });
    }

    public void closeHeart() {
        TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
    }

    public void destroy() {
        TTAppEventsQueue.clearAll();
        TTEdpAppEventsQueue.clearAll();
        stopScheduler();
    }

    public void fetchDeferredDeeplinkWithCompletion(TikTokBusinessSdk.FetchDeferredDeeplinkCompletion callback) {
        final DeeplinkCallbackWrapper deeplinkCallbackWrapper = new DeeplinkCallbackWrapper(callback);
        deeplinkCallbackWrapper.markInit();
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventLogger.lambda$fetchDeferredDeeplinkWithCompletion$9(deeplinkCallbackWrapper);
            }
        });
    }

    public void fetchGlobalConfig(int delaySeconds) {
        addToLater(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44663lambda$fetchGlobalConfig$7$comtiktokappeventsTTAppEventLogger();
            }
        }, delaySeconds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: flush, reason: merged with bridge method [inline-methods] */
    public void m44664lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason reason) {
        int size;
        Throwable th;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TTUtil.checkThread(TAG);
        int i = 0;
        if (!TikTokBusinessSdk.isGlobalConfigFetched().booleanValue()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_CONFIG_IS_NOT_FETCHED, new Object[0]);
            return;
        }
        if (!TikTokBusinessSdk.isSystemActivated()) {
            this.logger.info(SKIP_FLUSHING_BECAUSE_GLOBAL_SWITCH_IS_TURNED_OFF, new Object[0]);
            return;
        }
        try {
            if (TikTokBusinessSdk.getNetworkSwitch()) {
                this.logger.debug("Start flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
                TTAppEventPersist fromDisk = TTAppEventStorage.readFromDisk();
                fromDisk.addEvents(TTAppEventsQueue.exportAllEvents());
                size = fromDisk.getAppEvents().size() + TTEdpAppEventsQueue.size();
                try {
                    List<TTAppEvent> listReportAppEvent = TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), fromDisk.getAppEvents(), false);
                    TTRequest.reportAppEvent(TTRequestBuilder.getBasePayloadWithTs(), TTEdpAppEventsQueue.exportAllEvents(), true);
                    if (listReportAppEvent != null && !listReportAppEvent.isEmpty()) {
                        this.logger.debug("Failed to send %d events, will save to disk", Integer.valueOf(listReportAppEvent.size()));
                        TTAppEventStorage.persist(listReportAppEvent);
                    }
                    this.logger.debug("END flush, version %d reason is %s", Integer.valueOf(this.flushId), reason.name());
                    this.flushId++;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TTEdpAppEventsQueue.clearAll();
                        TTCrashHandler.handleCrash(TAG, th, 2);
                    } catch (Throwable unused) {
                    }
                }
                i = size;
            } else {
                this.logger.info(NETWORK_IS_TURNED_OFF, new Object[0]);
                TTAppEventStorage.persist(null);
            }
        } catch (Throwable th3) {
            size = 0;
            th = th3;
        }
        if (i != 0) {
            try {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject metaWithTS = TTUtil.getMetaWithTS(Long.valueOf(jCurrentTimeMillis));
                JSON.putLong(metaWithTS, "latency", jCurrentTimeMillis2 - jCurrentTimeMillis);
                JSON.putObject(metaWithTS, "type", reason.name());
                JSON.putInt(metaWithTS, "interval", TIME_BUFFER);
                JSON.putInt(metaWithTS, "size", i);
                monitorMetric("flush", metaWithTS, null);
            } catch (Throwable unused2) {
            }
        }
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.initCrashReporter();
            }
        });
    }

    public void flushWithReason(final FlushReason reason) {
        this.logger.debug(reason.name() + " triggered flush", new Object[0]);
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44664lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(reason);
            }
        });
    }

    public void forceFlush() {
        flushWithReason(FlushReason.FORCE_FLUSH);
    }

    public boolean identify(String externalId, String externalUserName, String phoneNumber, String email) {
        try {
            TTUserInfo tTUserInfo = TTUserInfo.sharedInstance;
            if (tTUserInfo.isIdentified()) {
                this.logger.warn("SDK is already identified, if you want to switch to anotheruser account, plz call TiktokBusinessSDK.logout() first and then identify", new Object[0]);
                return false;
            }
            tTUserInfo.setIdentified();
            if (!TextUtils.isEmpty(externalId)) {
                tTUserInfo.setExternalId(externalId);
            }
            if (!TextUtils.isEmpty(externalUserName)) {
                tTUserInfo.setExternalUserName(externalUserName);
            }
            if (!TextUtils.isEmpty(phoneNumber)) {
                tTUserInfo.setPhoneNumber(phoneNumber);
            }
            if (!TextUtils.isEmpty(email)) {
                tTUserInfo.setEmail(email);
            }
            try {
                trackEvent(TTAppEvent.TTAppEventType.identify, null, null, null, false);
                flushWithReason(FlushReason.IDENTIFY);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public void initConfig(long initTimeMS, final TikTokBusinessSdk.TTInitCallback callback, final AtomicBoolean sdkInitialized) {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m44665lambda$initConfig$1$comtiktokappeventsTTAppEventLogger(sdkInitialized, callback);
            }
        });
        fetchGlobalConfig(0);
        monitorMetric("init_start", TTUtil.getMetaWithTS(Long.valueOf(initTimeMS)), null);
    }

    /* JADX INFO: renamed from: lambda$addToTask$5$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44661lambda$addToTask$5$comtiktokappeventsTTAppEventLogger(final TTAppEvent appEvent, final boolean edp, final JSONObject props, final TTAppEvent.TTAppEventType type, final String event, final String eventId) {
        if (appEvent == null) {
            if (edp) {
                try {
                    JSON.putObject(props, "track_source", "edp");
                } catch (Throwable unused) {
                    return;
                }
            }
            appEvent = new TTAppEvent(type, event, props == null ? "" : props.toString(), eventId, TikTokBusinessSdk.getTTAppIds());
        }
        if (edp) {
            TTEdpAppEventsQueue.addEvent(appEvent);
        } else {
            TTAppEventsQueue.addEvent(appEvent);
        }
        if (TTAppEventsQueue.size() + TTEdpAppEventsQueue.size() > 100) {
            m44664lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.THRESHOLD);
        }
    }

    /* JADX INFO: renamed from: lambda$doStartScheduler$4$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44662lambda$doStartScheduler$4$comtiktokappeventsTTAppEventLogger(final int interval) {
        TikTokBusinessSdk.nextTimeFlushListener.timeLeft(this.counter);
        if (this.counter == 0) {
            this.counter = interval;
        }
        this.counter--;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d A[Catch: all -> 0x00d5, PHI: r4
  0x003d: PHI (r4v3 org.json.JSONObject) = (r4v2 org.json.JSONObject), (r4v5 org.json.JSONObject) binds: [B:4:0x0013, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00d5, blocks: (B:3:0x0006, B:5:0x0015, B:7:0x0024, B:14:0x003d), top: B:60:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0074 A[Catch: all -> 0x00d3, TryCatch #1 {all -> 0x00d3, blocks: (B:15:0x0049, B:17:0x0074, B:18:0x0080), top: B:57:0x0049 }] */
    /* JADX INFO: renamed from: lambda$fetchGlobalConfig$7$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44663lambda$fetchGlobalConfig$7$comtiktokappeventsTTAppEventLogger() {
        boolean z;
        try {
            this.logger.info("Fetching global config....", new Object[0]);
            JSONObject businessSDKConfig = TTRequest.getBusinessSDKConfig();
            if (businessSDKConfig == null) {
                this.logger.info("config is null, api returns error", new Object[0]);
                businessSDKConfig = TTRequest.getBusinessSDKConfig();
                if (businessSDKConfig == null) {
                    this.logger.info("config is null, api returns error2", new Object[0]);
                    if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                        TikTokBusinessSdk.isActivatedLogicRun = true;
                        activateSdk();
                    }
                } else {
                    JSONObject jsonObject = JSON.getJsonObject(businessSDKConfig, "business_sdk_config");
                    z = JSON.getBoolean(jsonObject, EDPConfig.ConfigConst.ENABLE_SDK, false);
                    try {
                        String string = JSON.getString(jsonObject, "available_version");
                        String string2 = JSON.getString(jsonObject, C11744X3.j.f26410D);
                        NetworkTimeout.updateConfig(jsonObject);
                        TikTokBusinessSdk.setSdkGlobalSwitch(Boolean.valueOf(z));
                        this.logger.debug("enable_sdk=" + z, new Object[0]);
                        if (!z) {
                            this.logger.info("Clear all events and stop timers because global switch is not turned on", new Object[0]);
                            clearAllImmediately();
                        }
                        TikTokBusinessSdk.setApiAvailableVersion(string);
                        TikTokBusinessSdk.setApiTrackDomain(string2);
                        this.logger.debug("available_version=" + string, new Object[0]);
                        TikTokBusinessSdk.setGlobalConfigFetched();
                        autoTrackRetentionEnable = JSON.getBoolean(jsonObject, "auto_track_Retention_enable");
                        TTInAppPurchaseWrapper.updateConfig(jsonObject);
                        TTUnityBridge.setConfigCallback(businessSDKConfig);
                        EDPConfig.optConfig(JSON.getJsonObject(jsonObject, EDPConfig.ConfigConst.EDP_NATIVE_SDK_CONFIG));
                        if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                            TikTokBusinessSdk.isActivatedLogicRun = true;
                            activateSdk();
                        }
                        if (z && !DebugModeHelper.isSuccess()) {
                            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DebugModeHelper.tryRequestConfig();
                                }
                            });
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            this.logger.error(th, "Errors occurred during initGlobalConfig", new Object[0]);
                        } finally {
                            if (TikTokBusinessSdk.isSystemActivated() && !TikTokBusinessSdk.isActivatedLogicRun) {
                                TikTokBusinessSdk.isActivatedLogicRun = true;
                                activateSdk();
                            }
                            if (z && !DebugModeHelper.isSuccess()) {
                                addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DebugModeHelper.tryRequestConfig();
                                    }
                                });
                            }
                        }
                    }
                }
            } else {
                JSONObject jsonObject2 = JSON.getJsonObject(businessSDKConfig, "business_sdk_config");
                z = JSON.getBoolean(jsonObject2, EDPConfig.ConfigConst.ENABLE_SDK, false);
                String string3 = JSON.getString(jsonObject2, "available_version");
                String string4 = JSON.getString(jsonObject2, C11744X3.j.f26410D);
                NetworkTimeout.updateConfig(jsonObject2);
                TikTokBusinessSdk.setSdkGlobalSwitch(Boolean.valueOf(z));
                this.logger.debug("enable_sdk=" + z, new Object[0]);
                if (!z) {
                    this.logger.info("Clear all events and stop timers because global switch is not turned on", new Object[0]);
                    clearAllImmediately();
                }
                TikTokBusinessSdk.setApiAvailableVersion(string3);
                TikTokBusinessSdk.setApiTrackDomain(string4);
                this.logger.debug("available_version=" + string3, new Object[0]);
                TikTokBusinessSdk.setGlobalConfigFetched();
                autoTrackRetentionEnable = JSON.getBoolean(jsonObject2, "auto_track_Retention_enable");
                TTInAppPurchaseWrapper.updateConfig(jsonObject2);
                TTUnityBridge.setConfigCallback(businessSDKConfig);
                EDPConfig.optConfig(JSON.getJsonObject(jsonObject2, EDPConfig.ConfigConst.EDP_NATIVE_SDK_CONFIG));
                if (TikTokBusinessSdk.isSystemActivated()) {
                    TikTokBusinessSdk.isActivatedLogicRun = true;
                    activateSdk();
                }
                if (z) {
                    addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda8
                        @Override // java.lang.Runnable
                        public final void run() {
                            DebugModeHelper.tryRequestConfig();
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* JADX INFO: renamed from: lambda$initConfig$1$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44665lambda$initConfig$1$comtiktokappeventsTTAppEventLogger(final AtomicBoolean sdkInitialized, final TikTokBusinessSdk.TTInitCallback callback) {
        try {
            startHeart();
            SystemInfoUtil.initAppSessionId();
            SystemInfoUtil.initInstallReferrer();
            SystemInfoUtil.updateSensigInfo();
            SystemInfoUtil.initUserAgent();
            TTAppEventsQueue.clearAll();
            TTEdpAppEventsQueue.clearAll();
            sdkInitialized.set(true);
            if (callback != null) {
                callback.success();
            }
        } catch (Throwable th) {
            this.logger.error(th, "init error", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44666lambda$new$0$comtiktokappeventsTTAppEventLogger() {
        m44664lambda$flushWithReason$6$comtiktokappeventsTTAppEventLogger(FlushReason.TIMER);
    }

    /* JADX INFO: renamed from: lambda$trackPurchase$3$com-tiktok-appevents-TTAppEventLogger, reason: not valid java name */
    /* synthetic */ void m44667lambda$trackPurchase$3$comtiktokappeventsTTAppEventLogger(final List purchaseInfos, final boolean isHistory) {
        if (purchaseInfos.isEmpty()) {
            return;
        }
        Iterator it = purchaseInfos.iterator();
        while (it.hasNext()) {
            TTPurchaseInfo tTPurchaseInfo = (TTPurchaseInfo) it.next();
            JSONObject purchaseProps = TTInAppPurchaseManager.getPurchaseProps(tTPurchaseInfo);
            if (purchaseProps != null) {
                track(isHistory ? "__purchase_history" : TTContentsEventConstants.ContentsEventName.EVENT_NAME_PURCHASE, purchaseProps, tTPurchaseInfo.getEventId());
            }
        }
    }

    public void logout() {
        TTUserInfo.reset(TikTokBusinessSdk.getApplicationContext(), true);
        flushWithReason(FlushReason.LOGOUT);
    }

    public void monitorMetric(final String name, final JSONObject meta, final JSONObject extra) {
        if (metricsEnabled) {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    TTAppEventLogger.lambda$monitorMetric$8(name, meta, extra);
                }
            });
        }
    }

    void persistEvents() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                TTAppEventStorage.persist(null);
            }
        });
    }

    void persistMonitor() {
        addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                TTCrashHandler.persistToFile();
            }
        });
    }

    void restartScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, true);
        }
    }

    public void startHeart() {
        try {
            TTHandlerUtil.getInstance().removeCallbacks(this.heartRunnable);
            TTHandlerUtil.getInstance().postDelayed(this.heartRunnable, 60000L);
        } catch (Throwable unused) {
        }
    }

    void startScheduler() {
        int i = TIME_BUFFER;
        if (i != 0) {
            doStartScheduler(i, false);
        }
    }

    void stopScheduler() {
        try {
            ScheduledFuture<?> scheduledFuture = this.future;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.future = null;
            }
            ScheduledFuture<?> scheduledFuture2 = this.timeFuture;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.timeFuture = null;
            }
        } catch (Throwable th) {
            this.logger.error(th, "stop scheduler exception", new Object[0]);
        }
    }

    public void track(String event, JSONObject props) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, null, false);
    }

    public void track(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, false);
    }

    public void trackEdp(String event, JSONObject props, String eventId) {
        trackEvent(TTAppEvent.TTAppEventType.track, event, props, eventId, true);
    }

    public void trackPurchase(List<TTPurchaseInfo> purchaseInfos) {
        trackPurchase(false, purchaseInfos);
    }

    public void trackPurchase(final boolean isHistory, final List<TTPurchaseInfo> purchaseInfos) {
        if (TikTokBusinessSdk.isSystemActivated()) {
            addToQ(new Runnable() { // from class: com.tiktok.appevents.TTAppEventLogger$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m44667lambda$trackPurchase$3$comtiktokappeventsTTAppEventLogger(purchaseInfos, isHistory);
                }
            });
        } else {
            this.logger.info("Global switch is off, ignore track purchase", new Object[0]);
        }
    }
}
