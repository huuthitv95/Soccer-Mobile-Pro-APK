package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tiktok.util.UrlConst;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.log.LogLevelInternal;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.core.cache.CacheDirectory;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.p299v1.ErrorOuterClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public class SdkProperties {
    private static final String CACHE_DIR_NAME = "UnityAdsCache";
    private static final String CHINA_CONFIG_HOSTNAME = "dW5pdHlhZHMudW5pdHljaGluYS5jbg==";
    private static final String CHINA_ISO_ALPHA_2_CODE = "CN";
    private static final String CHINA_ISO_ALPHA_3_CODE = "CHN";
    private static final String CONFIG_VERSION_METADATA_KEY = "com.unity3d.ads.configversion";
    private static final String DEFAULT_CONFIG_HOSTNAME = "unityads.unity3d.com";
    private static final String DEFAULT_CONFIG_VERSION = "configv2";
    private static final String LOCAL_CACHE_FILE_PREFIX = "UnityAdsCache-";
    private static final String LOCAL_STORAGE_FILE_PREFIX = "UnityAdsStorage-";
    private static final String WEBVIEW_CACHE_DIR_NAME = "UnityAdsWebViewCache";
    private static long _appInitializationTimeEpochMs;
    private static CacheDirectory _cacheDirectory;
    private static String _configUrl;
    private static long _initializationTime;
    private static long _initializationTimeEpochMs;
    private static Configuration _latestConfiguration;
    private static CacheDirectory _webviewCacheDirectory;
    private static final LinkedHashSet<IUnityAdsInitializationListener> _legacyInitializationListeners = new LinkedHashSet<>();
    private static final LinkedHashSet<InitializationListener> _initializationListeners = new LinkedHashSet<>();
    private static volatile boolean _initialized = false;
    private static boolean _reinitialized = false;
    private static boolean _testMode = false;
    private static boolean _previousTestMode = false;
    private static boolean _debugMode = false;
    private static final AtomicReference<InitializationState> _currentInitializationState = new AtomicReference<>(InitializationState.NOT_INITIALIZED);

    public enum InitializationState {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static void addInitializationListener(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }

    public static void addInitializationListener(InitializationListener initializationListener) {
        if (initializationListener == null) {
            return;
        }
        LinkedHashSet<InitializationListener> linkedHashSet = _initializationListeners;
        synchronized (linkedHashSet) {
            linkedHashSet.add(initializationListener);
        }
    }

    public static long getAppInitializationTimeSinceEpoch() {
        return _appInitializationTimeEpochMs;
    }

    public static File getCacheDirectory() {
        return getCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getCacheDirectory(Context context) {
        if (_cacheDirectory == null) {
            setCacheDirectory(new CacheDirectory("UnityAdsCache"));
        }
        return _cacheDirectory.getCacheDirectory(context);
    }

    public static String getCacheDirectoryName() {
        return "UnityAdsCache";
    }

    public static CacheDirectory getCacheDirectoryObject() {
        return _cacheDirectory;
    }

    public static String getCacheFilePrefix() {
        return LOCAL_CACHE_FILE_PREFIX;
    }

    public static String getConfigUrl() {
        if (_configUrl == null) {
            _configUrl = getDefaultConfigUrl("release");
        }
        return _configUrl;
    }

    public static String getConfigVersion(Context context) {
        if (context != null) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle != null) {
                    return bundle.getString(CONFIG_VERSION_METADATA_KEY, DEFAULT_CONFIG_VERSION);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                DeviceLog.warning("Failed to retrieve application info for current package");
            }
        }
        return DEFAULT_CONFIG_VERSION;
    }

    public static InitializationState getCurrentInitializationState() {
        return _currentInitializationState.get();
    }

    public static boolean getDebugMode() {
        return _debugMode;
    }

    public static String getDefaultConfigUrl(String str) {
        return UrlConst.HTTPS + getConfigVersion(ClientProperties.getApplicationContext()) + '.' + (isChinaLocale(Device.getNetworkCountryISO()) ? new String(Base64.decode(CHINA_CONFIG_HOSTNAME, 0)) : DEFAULT_CONFIG_HOSTNAME) + "/webview/" + getWebViewBranch() + RemoteSettings.FORWARD_SLASH_STRING + str + "/config.json";
    }

    public static long getInitializationTime() {
        return _initializationTime;
    }

    public static long getInitializationTimeEpoch() {
        return _initializationTimeEpochMs;
    }

    public static Configuration getLatestConfiguration() {
        return _latestConfiguration;
    }

    public static IUnityAdsInitializationListener[] getLegacyInitializationListeners() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static String getLocalConfigurationFilepath() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static String getLocalStorageFilePrefix() {
        return LOCAL_STORAGE_FILE_PREFIX;
    }

    public static String getLocalWebViewFile() {
        if (getWebViewCacheDirectory() == null) {
            return "";
        }
        return getWebViewCacheDirectory().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static boolean getPreviousTestMode() {
        return _previousTestMode;
    }

    public static int getVersionCode() {
        return 41700;
    }

    public static String getVersionName() {
        return "4.17.0";
    }

    private static String getWebViewBranch() {
        return getVersionName();
    }

    public static File getWebViewCacheDirectory() {
        return getWebViewCacheDirectory(ClientProperties.getApplicationContext());
    }

    public static File getWebViewCacheDirectory(Context context) {
        if (_webviewCacheDirectory == null) {
            setWebViewCacheDirectory(new CacheDirectory(WEBVIEW_CACHE_DIR_NAME, false));
        }
        return _webviewCacheDirectory.getCacheDirectory(context);
    }

    public static boolean isChinaLocale(String str) {
        return str.equalsIgnoreCase(CHINA_ISO_ALPHA_2_CODE) || str.equalsIgnoreCase(CHINA_ISO_ALPHA_3_CODE);
    }

    public static boolean isInitialized() {
        return _initialized;
    }

    public static boolean isReinitialized() {
        return _reinitialized;
    }

    public static boolean isTestMode() {
        return _testMode;
    }

    public static void notifyInitializationComplete() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                setInitializeState(InitializationState.INITIALIZED_SUCCESSFULLY);
                LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                linkedHashSet.clear();
                LinkedHashSet<InitializationListener> linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                linkedHashSet2.clear();
                for (final IUnityAdsInitializationListener iUnityAdsInitializationListener : linkedHashSet3) {
                    Objects.requireNonNull(iUnityAdsInitializationListener);
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            iUnityAdsInitializationListener.onInitializationComplete();
                        }
                    });
                }
                for (final InitializationListener initializationListener : linkedHashSet4) {
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            initializationListener.onInitializationComplete(null);
                        }
                    });
                }
            }
        }
    }

    public static void notifyInitializationFailed(final UnityAds.UnityAdsInitializationError unityAdsInitializationError, final String str) {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                setInitializeState(InitializationState.INITIALIZED_FAILED);
                LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                linkedHashSet.clear();
                LinkedHashSet<InitializationListener> linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                linkedHashSet2.clear();
                for (final IUnityAdsInitializationListener iUnityAdsInitializationListener : linkedHashSet3) {
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            iUnityAdsInitializationListener.onInitializationFailed(unityAdsInitializationError, str);
                        }
                    });
                }
                for (final InitializationListener initializationListener : linkedHashSet4) {
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            initializationListener.onInitializationComplete(new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED.getNumber(), str));
                        }
                    });
                }
            }
        }
    }

    public static void notifyInitializationFailed(InitializationException initializationException) {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                setInitializeState(InitializationState.INITIALIZED_FAILED);
                LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet3 = new LinkedHashSet(linkedHashSet);
                linkedHashSet.clear();
                LinkedHashSet<InitializationListener> linkedHashSet4 = new LinkedHashSet(linkedHashSet2);
                linkedHashSet2.clear();
                for (final IUnityAdsInitializationListener iUnityAdsInitializationListener : linkedHashSet3) {
                    final String message = initializationException.getMessage();
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, message);
                        }
                    });
                }
                for (final InitializationListener initializationListener : linkedHashSet4) {
                    final String message2 = initializationException.getMessage();
                    final int number = initializationException.getErrorCode() != null ? initializationException.getErrorCode().getNumber() : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED.getNumber();
                    Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.services.core.properties.SdkProperties$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            initializationListener.onInitializationComplete(new UnityAdsError(number, message2));
                        }
                    });
                }
            }
        }
    }

    public static void resetInitializationListeners() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = _legacyInitializationListeners;
        synchronized (linkedHashSet) {
            LinkedHashSet<InitializationListener> linkedHashSet2 = _initializationListeners;
            synchronized (linkedHashSet2) {
                linkedHashSet2.clear();
                linkedHashSet.clear();
            }
        }
    }

    public static void setAppInitializationTimeSinceEpoch(long j) {
        _appInitializationTimeEpochMs = j;
    }

    public static void setCacheDirectory(CacheDirectory cacheDirectory) {
        _cacheDirectory = cacheDirectory;
    }

    public static void setConfigUrl(String str) throws MalformedURLException, URISyntaxException {
        if (str == null) {
            throw new MalformedURLException();
        }
        if (!str.startsWith("http://") && !str.startsWith(UrlConst.HTTPS)) {
            throw new MalformedURLException();
        }
        new URL(str).toURI();
        _configUrl = str;
    }

    public static void setDebugMode(boolean z) {
        _debugMode = z;
        Logger logger = (Logger) Utilities.getService(Logger.class);
        if (z) {
            DeviceLog.setLogLevel(8);
            logger.setLogLevel(LogLevelInternal.DEBUG);
        } else {
            DeviceLog.setLogLevel(4);
            logger.setLogLevel(LogLevelInternal.INFO);
        }
    }

    public static void setInitializationTime(long j) {
        _initializationTime = j;
    }

    public static void setInitializationTimeSinceEpoch(long j) {
        _initializationTimeEpochMs = j;
    }

    public static void setInitializeState(InitializationState initializationState) {
        _currentInitializationState.set(initializationState);
    }

    public static void setInitialized(boolean z) {
        _initialized = z;
    }

    public static void setLatestConfiguration(Configuration configuration) {
        _latestConfiguration = configuration;
    }

    public static void setReinitialized(boolean z) {
        _reinitialized = z;
    }

    public static void setTestMode(boolean z) {
        _previousTestMode = _testMode;
        _testMode = z;
    }

    public static void setWebViewCacheDirectory(CacheDirectory cacheDirectory) {
        _webviewCacheDirectory = cacheDirectory;
    }
}
