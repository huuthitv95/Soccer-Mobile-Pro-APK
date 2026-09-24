package com.tiktok.appevents.edp;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.edp.proxy.ITouchListener;
import com.tiktok.appevents.edp.proxy.TouchProxyHelper;
import com.tiktok.util.JSON;
import com.tiktok.util.RegexUtil;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TTHierarchyHelper {
    public static volatile Handler mHandler;

    /* JADX INFO: renamed from: com.tiktok.appevents.edp.TTHierarchyHelper$1 */
    static class C143081 implements ITouchListener {
        long touchDown = 0;
        final /* synthetic */ Activity val$act;
        final /* synthetic */ View val$view;

        C143081(final Activity val$view, final View val$act) {
            this.val$act = val$view;
            this.val$view = val$act;
        }

        @Override // com.tiktok.appevents.edp.proxy.ITouchListener
        public boolean onTouch(View v, final MotionEvent event) {
            Activity activity;
            if (!EDPConfig.enable_click_track || (activity = this.val$act) == null || activity.isFinishing() || this.val$act.isDestroyed() || this.val$view == null) {
                return false;
            }
            try {
                int action = event.getAction();
                if (action == 0) {
                    this.touchDown = System.currentTimeMillis();
                } else if (action == 1) {
                    Activity activity2 = this.val$act;
                    if (activity2 == null || activity2.isFinishing() || this.val$act.isDestroyed() || EDPConfig.button_black_list.contains(this.val$view.getClass().getCanonicalName()) || !TTEDPEventTrack.checkUpload() || TTEDPEventTrack.isSending || System.currentTimeMillis() - TTEDPEventTrack.LAST_CLICK_TS <= EDPConfig.time_diff_frequency_control * 1000.0d) {
                        return false;
                    }
                    TTEDPEventTrack.isSending = true;
                    final String canonicalName = v.getClass().getCanonicalName();
                    TikTokBusinessSdk.getAppEventLogger().addToQ(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            String string;
                            try {
                                if (EDPConfig.enable_click_track && C143081.this.val$act != null && !C143081.this.val$act.isFinishing() && !C143081.this.val$act.isDestroyed() && C143081.this.val$view != null) {
                                    View decorView = C143081.this.val$act.getWindow().getDecorView();
                                    String str = canonicalName;
                                    float rawX = event.getRawX();
                                    float rawY = event.getRawY();
                                    int measuredWidth = C143081.this.val$view.getMeasuredWidth();
                                    int measuredHeight = C143081.this.val$view.getMeasuredHeight();
                                    if (C143081.this.val$view instanceof TextView) {
                                        TextView textView = (TextView) C143081.this.val$view;
                                        string = textView.getText().toString();
                                    } else {
                                        string = "";
                                    }
                                    TTEDPEventTrack.trackClick(str, rawX, rawY, measuredWidth, measuredHeight, string, C143081.this.val$act.getClass().getSimpleName(), TTHierarchyHelper.getViewHierarchy(new WeakReference(decorView), EDPConfig.page_detail_upload_deep_count), TTHierarchyHelper.getViewHierarchyCount(new WeakReference(decorView)), System.currentTimeMillis() - C143081.this.touchDown);
                                    TTEDPEventTrack.isSending = false;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
            return false;
        }
    }

    public static Handler getHandler() {
        if (mHandler == null) {
            synchronized (TTHierarchyHelper.class) {
                if (mHandler == null) {
                    mHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return mHandler;
    }

    public static JSONObject getViewHierarchy(WeakReference<View> rootView, int hierarchy) {
        JSONObject jSONObjectBuild = JSON.build();
        if (hierarchy > 0) {
            try {
                View view = rootView.get();
                JSON.putObject(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME, view.getClass().getCanonicalName());
                if (view instanceof TextView) {
                    String string = ((TextView) view).getText() != null ? ((TextView) view).getText().toString() : "";
                    if (!TextUtils.isEmpty(string)) {
                        string = RegexUtil.replaceAllToHash(EDPConfig.sensig_filtering_regex_list, string);
                    }
                    JSON.putObject(jSONObjectBuild, "text", string);
                    JSON.putDouble(jSONObjectBuild, ViewHierarchyConstants.TEXT_SIZE, ((TextView) view).getTextSize());
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                JSON.putInt(jSONObjectBuild, "left", iArr[0]);
                JSON.putInt(jSONObjectBuild, ViewHierarchyConstants.DIMENSION_TOP_KEY, iArr[1]);
                JSON.putInt(jSONObjectBuild, "width", view.getMeasuredWidth());
                JSON.putInt(jSONObjectBuild, "height", view.getMeasuredHeight());
                JSON.putInt(jSONObjectBuild, "scroll_x", view.getScrollX());
                JSON.putInt(jSONObjectBuild, "scroll_y", view.getScrollY());
                if (view instanceof ViewGroup) {
                    JSONArray jSONArrayBuildArr = JSON.buildArr();
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        JSON.putArr(jSONArrayBuildArr, getViewHierarchy(new WeakReference(viewGroup.getChildAt(i)), hierarchy - 1));
                    }
                    JSON.putObject(jSONObjectBuild, "child_views", jSONArrayBuildArr);
                }
            } catch (Throwable unused) {
            }
        }
        return jSONObjectBuild;
    }

    public static int getViewHierarchyCount(WeakReference<View> rootView) {
        if (rootView == null) {
            return 0;
        }
        try {
            View view = rootView.get();
            if (view == null) {
                return 0;
            }
            if (!(view instanceof ViewGroup)) {
                return 1;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int iMax = 1;
            for (int i = 0; i < childCount; i++) {
                iMax = Math.max(getViewHierarchyCount(new WeakReference(viewGroup.getChildAt(i))) + 1, iMax);
            }
            return iMax;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int getViewHierarchyCountAndRegisterOnTouch(final WeakReference<View> rootView, final WeakReference<Activity> activity) {
        final View view;
        try {
            Activity activity2 = activity.get();
            if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed() || (view = rootView.get()) == null) {
                return 0;
            }
            if (EDPConfig.enable_click_track) {
                getHandler().post(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            TTHierarchyHelper.proxyOnTouch(rootView, activity);
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            if (EDPConfig.enable_webview_request_track && (view instanceof WebView)) {
                getHandler().post(new Runnable() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (EDPConfig.enable_webview_request_track) {
                                String originalUrl = ((WebView) view).getOriginalUrl();
                                if (TextUtils.isEmpty(originalUrl)) {
                                    return;
                                }
                                TTEDPEventTrack.trackWebviewRequest(originalUrl);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
            if (!(view instanceof ViewGroup)) {
                return 1;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int iMax = 1;
            for (int i = 0; i < childCount; i++) {
                iMax = Math.max(getViewHierarchyCountAndRegisterOnTouch(new WeakReference(viewGroup.getChildAt(i)), activity) + 1, iMax);
            }
            viewGroup.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.tiktok.appevents.edp.TTHierarchyHelper.4
                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(View parent, View child) {
                    try {
                        TTHierarchyHelper.getViewHierarchyCountAndRegisterOnTouch(new WeakReference(child), activity);
                    } catch (Throwable unused) {
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(View parent, View child) {
                }
            });
            return iMax;
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static void proxyOnTouch(WeakReference<View> rootView, WeakReference<Activity> activity) {
        View view;
        Activity activity2;
        try {
            if (EDPConfig.enable_click_track && rootView != null && (view = rootView.get()) != null && (activity2 = activity.get()) != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                TouchProxyHelper.proxy(rootView, new C143081(activity2, view));
            }
        } catch (Throwable unused) {
        }
    }
}
