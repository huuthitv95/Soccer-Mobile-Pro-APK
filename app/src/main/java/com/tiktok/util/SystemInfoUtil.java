package com.tiktok.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.internal.AnalyticsEvents;
import com.tiktok.BuildConfig;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.ReferrerInfo;
import com.tiktok.appevents.edp.EDPConfig;
import com.tiktok.appevents.edp.Sensig;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class SystemInfoUtil {
    private static String sAPPName = "";
    private static String sAppSessionId = "";
    private static float sDensity = -1.0f;
    private static boolean sHasGetUnity = false;
    private static String sInstallSource = null;
    private static boolean sIsUnity = false;
    private static String sLibraryName = "";
    private static String sPackageName = "";
    private static ReferrerInfo sReferrerInfo = null;
    private static int sScreenHeight = -1;
    private static int sScreenWidth = -1;
    private static String sUserAgent = null;
    private static int sVerCode = 0;
    private static String sVerName = "";

    public static String getAndroidVersion() {
        return Build.VERSION.SDK_INT + "";
    }

    public static String getAppName() {
        if (TextUtils.isEmpty(sAPPName)) {
            initInfo();
        }
        String str = sAPPName;
        return str == null ? "" : str;
    }

    public static String getAppSessionId() {
        if (TextUtils.isEmpty(sAppSessionId)) {
            initAppSessionId();
        }
        return sAppSessionId;
    }

    public static int getAppVersionCode() {
        if (sVerCode == 0) {
            initInfo();
        }
        return sVerCode;
    }

    public static String getAppVersionName() {
        if (TextUtils.isEmpty(sVerName)) {
            initInfo();
        }
        String str = sVerName;
        return str == null ? "" : str;
    }

    public static String getBcp47Language() {
        try {
            return getCurrentLocale().toLanguageTag();
        } catch (Throwable unused) {
            return "-";
        }
    }

    private static Locale getCurrentLocale() {
        try {
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            if (applicationContext != null) {
                return Build.VERSION.SDK_INT >= 24 ? applicationContext.getResources().getConfiguration().getLocales().get(0) : applicationContext.getResources().getConfiguration().locale;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ReferrerInfo getInstallReferrer() {
        if (sReferrerInfo == null) {
            initInstallReferrer();
        }
        return sReferrerInfo;
    }

    public static String getInstallSource() {
        if (TextUtils.isEmpty(sInstallSource)) {
            initInstallSource();
        }
        return TextUtils.isEmpty(sInstallSource) ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : sInstallSource;
    }

    public static String getLibraryName() {
        if (TextUtils.isEmpty(sLibraryName)) {
            if (isUnity()) {
                sLibraryName = "tiktok-business-unity-android-sdk";
            } else {
                sLibraryName = "tiktok-business-android-sdk";
            }
        }
        return sLibraryName;
    }

    public static String getLocalIpAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getLocale() {
        return Locale.getDefault().getLanguage();
    }

    public static String getNetworkClass(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    return "WIFI";
                }
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return "2G";
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return "3G";
                        case 13:
                        case 18:
                        case 19:
                            return "4G";
                        case 20:
                            return "5G";
                        default:
                            return "?";
                    }
                }
                return "?";
            }
            return "-";
        } catch (Throwable unused) {
        }
    }

    public static String getPackageName() {
        if (TextUtils.isEmpty(sPackageName)) {
            initInfo();
        }
        String str = sPackageName;
        return str == null ? "" : str;
    }

    public static String getSDKVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static String getUserAgent() {
        if (TextUtils.isEmpty(sUserAgent)) {
            initUserAgent();
        }
        return sUserAgent;
    }

    public static float getsDensity() {
        if (sDensity <= 0.0f) {
            initScreenWidthAndHeight();
        }
        return Math.max(sDensity, 0.0f);
    }

    public static int getsScreenHeight() {
        if (sScreenHeight <= 0) {
            initScreenWidthAndHeight();
        }
        return Math.max(sScreenHeight, 0);
    }

    public static int getsScreenWidth() {
        if (sScreenWidth <= 0) {
            initScreenWidthAndHeight();
        }
        return Math.max(sScreenWidth, 0);
    }

    public static void initAppSessionId() {
        try {
            sAppSessionId = UUID.randomUUID().toString();
        } catch (Throwable unused) {
        }
    }

    private static void initInfo() {
        try {
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            sPackageName = applicationContext.getPackageName();
            PackageManager packageManager = applicationContext.getPackageManager();
            sAPPName = applicationContext.getApplicationInfo().loadLabel(packageManager).toString();
            PackageInfo packageInfo = packageManager.getPackageInfo(sPackageName, 0);
            sVerName = packageInfo.versionName;
            if (Build.VERSION.SDK_INT >= 28) {
                sVerCode = Long.valueOf(packageInfo.getLongVersionCode()).intValue();
            } else {
                sVerCode = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static void initInstallReferrer() {
        try {
            if (sReferrerInfo != null) {
                return;
            }
            final InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(TikTokBusinessSdk.getApplicationContext()).build();
            installReferrerClientBuild.startConnection(new InstallReferrerStateListener() { // from class: com.tiktok.util.SystemInfoUtil.1
                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerServiceDisconnected() {
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public void onInstallReferrerSetupFinished(final int responseCode) {
                    try {
                        TTHandlerUtil.getInstance().post(new Runnable() { // from class: com.tiktok.util.SystemInfoUtil.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (responseCode == 0) {
                                        try {
                                            ReferrerDetails installReferrer = installReferrerClientBuild.getInstallReferrer();
                                            ReferrerInfo unused = SystemInfoUtil.sReferrerInfo = new ReferrerInfo(installReferrer.getInstallReferrer(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getReferrerClickTimestampSeconds());
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    installReferrerClientBuild.endConnection();
                                } catch (Throwable unused3) {
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void initInstallSource() {
        try {
            Application applicationContext = TikTokBusinessSdk.getApplicationContext();
            if (applicationContext == null) {
                return;
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = getPackageName();
            if (packageManager != null && !TextUtils.isEmpty(packageName)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    sInstallSource = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                } else {
                    sInstallSource = packageManager.getInstallerPackageName(packageName);
                }
            }
        } catch (Throwable unused) {
            sInstallSource = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    private static void initScreenWidthAndHeight() {
        Application applicationContext = TikTokBusinessSdk.getApplicationContext();
        if (applicationContext != null) {
            try {
                try {
                    Display defaultDisplay = ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    sDensity = displayMetrics.density;
                    sScreenWidth = displayMetrics.widthPixels;
                    sScreenHeight = displayMetrics.heightPixels;
                } catch (Throwable unused) {
                    DisplayMetrics displayMetrics2 = applicationContext.getResources().getDisplayMetrics();
                    sDensity = displayMetrics2.density;
                    sScreenWidth = displayMetrics2.widthPixels;
                    sScreenHeight = displayMetrics2.heightPixels;
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static void initUserAgent() {
        if (TextUtils.isEmpty(sUserAgent)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("ua_init", TTUtil.getMetaWithTS(Long.valueOf(jCurrentTimeMillis)), null);
            TTKeyValueStore tTKeyValueStore = new TTKeyValueStore(TikTokBusinessSdk.getApplicationContext());
            String str = tTKeyValueStore.get(TTConst.TTSDK_USER_AGENT);
            sUserAgent = str;
            if (TextUtils.isEmpty(str)) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(TikTokBusinessSdk.getApplicationContext());
                sUserAgent = defaultUserAgent;
                tTKeyValueStore.set(TTConst.TTSDK_USER_AGENT, defaultUserAgent);
            }
            th = null;
            try {
                if (TextUtils.isEmpty(sUserAgent)) {
                    sUserAgent = System.getProperty("http.agent");
                }
            } catch (Throwable th) {
                th = th;
            }
            if (TextUtils.isEmpty(sUserAgent)) {
                sUserAgent = "";
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                JSONObject metaException = TTUtil.getMetaException(th, Long.valueOf(jCurrentTimeMillis2), 2);
                JSON.putLong(metaException, "latency", jCurrentTimeMillis2 - jCurrentTimeMillis);
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("ua_end", metaException, null);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean isUnity() {
        if (!sHasGetUnity) {
            try {
                Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                sIsUnity = true;
            } catch (Throwable unused) {
                sIsUnity = false;
            }
            sHasGetUnity = true;
        }
        return sIsUnity;
    }

    public static void updateSensigInfo() {
        try {
            Sensig sensigInfo = TTUtil.getSensigInfo(TikTokBusinessSdk.getApplicationContext());
            if (sensigInfo == null || TextUtils.isEmpty(sensigInfo.getRegexList())) {
                return;
            }
            EDPConfig.sensig_filtering_regex_version = sensigInfo.getVersion();
            EDPConfig.sensig_filtering_regex_list = sensigInfo.getRegexList();
        } catch (Throwable unused) {
        }
    }
}
