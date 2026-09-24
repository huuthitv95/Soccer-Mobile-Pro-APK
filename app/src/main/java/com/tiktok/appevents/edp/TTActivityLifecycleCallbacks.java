package com.tiktok.appevents.edp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.iap.TTInAppPurchaseWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class TTActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private WeakReference<Activity> activityWeakReference;
    private boolean mIsBackground = true;
    private int mRefCount = 0;
    private int index = 0;
    public boolean hasSendPageShow = false;

    private void registerEDPListener(final WeakReference<Activity> activity, final int index, final boolean isBackground) {
        Window window;
        if (EDPConfig.enable_sdk) {
            try {
                final Activity activity2 = activity.get();
                if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed() && (window = activity2.getWindow()) != null) {
                    final View decorView = window.getDecorView();
                    decorView.post(new Runnable() { // from class: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Activity activity3 = activity2;
                            if (activity3 == null || activity3.isFinishing() || activity2.isDestroyed()) {
                                return;
                            }
                            try {
                                if (EDPConfig.enable_sdk && EDPConfig.enable_page_show_track) {
                                    if (TTEDPEventTrack.pageShowIsSending) {
                                        return;
                                    } else {
                                        TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks.1.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                if (TTEDPEventTrack.pageShowIsSending) {
                                                    return;
                                                }
                                                try {
                                                    TTEDPEventTrack.pageShowIsSending = true;
                                                    TTEDPEventTrack.trackPageShow(activity2.getClass().getSimpleName(), index, isBackground, TTHierarchyHelper.getViewHierarchy(new WeakReference(decorView), EDPConfig.page_detail_upload_deep_count), TTHierarchyHelper.getViewHierarchyCountAndRegisterOnTouch(new WeakReference(decorView), activity));
                                                    TTEDPEventTrack.pageShowIsSending = false;
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        });
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            try {
                                if (EDPConfig.enable_sdk && EDPConfig.enable_click_track) {
                                    TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks.1.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            try {
                                                TTHierarchyHelper.getViewHierarchyCountAndRegisterOnTouch(new WeakReference(decorView), activity);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    });
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        if (weakReference == null || weakReference.get() == null || this.activityWeakReference.get() != activity) {
            this.index++;
        }
        this.activityWeakReference = new WeakReference<>(activity);
        TTInAppPurchaseWrapper.tryReportIapEvent(activity);
        if (EDPConfig.enable_sdk && EDPConfig.enable_app_launch_track && this.mIsBackground && activity.getReferrer() != null) {
            try {
                TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTActivityLifecycleCallbacks.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EDPConfig.enable_sdk && EDPConfig.enable_app_launch_track) {
                            try {
                                TTEDPEventTrack.trackAppLaunch(((Activity) TTActivityLifecycleCallbacks.this.activityWeakReference.get()).getReferrer().toString(), (((Activity) TTActivityLifecycleCallbacks.this.activityWeakReference.get()).getIntent() == null || ((Activity) TTActivityLifecycleCallbacks.this.activityWeakReference.get()).getIntent().getData() == null) ? "" : ((Activity) TTActivityLifecycleCallbacks.this.activityWeakReference.get()).getIntent().getData().toString());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
        boolean z = this.mIsBackground;
        if (TikTokBusinessSdk.isInitialized()) {
            this.hasSendPageShow = true;
            registerEDPListener(this.activityWeakReference, this.index, z);
        }
        this.mRefCount++;
        this.mIsBackground = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.mRefCount - 1;
        this.mRefCount = i;
        if (i <= 0) {
            this.mRefCount = 0;
            this.mIsBackground = true;
        }
    }

    public void registerFirstActivity() {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        if (weakReference == null || weakReference.get() == null || this.hasSendPageShow) {
            return;
        }
        registerEDPListener(this.activityWeakReference, this.index, this.mIsBackground);
    }
}
