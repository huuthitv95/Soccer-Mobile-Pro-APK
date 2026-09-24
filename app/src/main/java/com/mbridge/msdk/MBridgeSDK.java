package com.mbridge.msdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.out.DeveloperTransferIdInfo;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface MBridgeSDK {

    @Deprecated
    public enum PLUGIN_LOAD_STATUS {
        INITIAL,
        INCOMPLETED,
        COMPLETED
    }

    boolean getConsentStatus(Context context);

    Map<String, String> getMBConfigurationMap(String str, String str2);

    Map<String, String> getMBConfigurationMap(String str, String str2, String str3);

    Map<String, String> getMBConfigurationMap(String str, String str2, String str3, boolean z);

    Map<String, String> getMBConfigurationMap(String str, String str2, boolean z);

    @Deprecated
    PLUGIN_LOAD_STATUS getStatus();

    @Deprecated
    void init(Map<String, String> map, Application application);

    @Deprecated
    void init(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener);

    void init(Map<String, String> map, Context context);

    void init(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener);

    @Deprecated
    void initAsync(Map<String, String> map, Application application);

    @Deprecated
    void initAsync(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener);

    @Deprecated
    void initAsync(Map<String, String> map, Context context);

    @Deprecated
    void initAsync(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener);

    void preload(Map<String, Object> map);

    @Deprecated
    void preloadFrame(Map<String, Object> map);

    void release();

    void setAllowAcquireIds(boolean z);

    void setAllowTransferIdsIfLimit(boolean z);

    void setConsentStatus(Context context);

    void setConsentStatus(Context context, int i);

    void setConsentStatus(Context context, OnCompletionListener onCompletionListener);

    void setCoppaStatus(Context context, boolean z);

    void setDeveloperIds(DeveloperTransferIdInfo developerTransferIdInfo);

    void setDoNotTrackStatus(Context context, boolean z);

    @Deprecated
    void setDoNotTrackStatus(boolean z);

    void setPlayVideoMute(int i, int i2);

    @Deprecated
    void setThirdPartyFeatures(Map<String, Object> map);

    void setUserPrivateInfoType(Context context, String str, int i);

    @Deprecated
    void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper);

    void updateDialogWeakActivity(WeakReference<Activity> weakReference);

    AuthorityInfoBean userPrivateInfo(Context context);
}
