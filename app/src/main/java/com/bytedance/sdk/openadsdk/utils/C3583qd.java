package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2721ka;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p196ik.C3116ri;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.qd */
/* JADX INFO: loaded from: classes3.dex */
public class C3583qd {

    /* JADX INFO: renamed from: aw */
    private static boolean f13205aw = true;

    /* JADX INFO: renamed from: co */
    private static final Object f13206co = new Object();

    /* JADX INFO: renamed from: di */
    private static int f13207di = -1;

    /* JADX INFO: renamed from: fi */
    private static int f13208fi = -1;

    /* JADX INFO: renamed from: ik */
    private static float f13209ik = -1.0f;
    private static int jbs = -1;

    /* JADX INFO: renamed from: ka */
    private static int f13210ka = -1;

    /* JADX INFO: renamed from: lr */
    private static int f13211lr = -1;

    /* JADX INFO: renamed from: mj */
    private static ViewConfiguration f13212mj = null;

    /* JADX INFO: renamed from: qt */
    private static float f13213qt = -1.0f;

    /* JADX INFO: renamed from: ri */
    private static float f13214ri = -1.0f;

    /* JADX INFO: renamed from: sf */
    private static Boolean f13215sf;
    private static WindowManager xha;

    /* JADX INFO: renamed from: aw */
    public static int m16573aw(Context context) {
        return ((Integer) m16627sf(context).first).intValue();
    }

    public static boolean bgr(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: bu */
    public static boolean m16574bu(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            return (string == null || TextUtils.isEmpty(string)) ? false : true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: co */
    public static int m16575co(Context context) {
        return ((Integer) m16627sf(context).second).intValue();
    }

    /* JADX INFO: renamed from: di */
    public static int m16576di(Context context) {
        if (context == null) {
            C3299nr.m14642ri();
        }
        if (context == null) {
            return f13207di;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            f13207di = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return f13207di;
    }

    /* JADX INFO: renamed from: di */
    public static void m16577di(View view) {
        if (view == null) {
            return;
        }
        m16612ri(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.qd.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: fi */
    public static int m16578fi(Context context) {
        m16609ri(context);
        return f13208fi;
    }

    /* JADX INFO: renamed from: fi */
    public static void m16579fi(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.qd.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    C3583qd.m16612ri(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: ik */
    public static int m16580ik(Context context) {
        m16609ri(context);
        return f13210ka;
    }

    /* JADX INFO: renamed from: ik */
    public static int m16581ik(Context context, float f) {
        m16610ri(context, true);
        float fM16598mj = m16598mj(context);
        if (fM16598mj <= 0.0f) {
            fM16598mj = 1.0f;
        }
        return (int) ((f / fM16598mj) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m16582ik(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.utils.qd.4
                        @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                        /* JADX INFO: renamed from: ik */
                        public JSONObject mo11121ik() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iM16604ri = C3583qd.m16604ri(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iM16604ri == 100 ? 1 : 0);
                                jSONObject.put("is_playable", C3279dw.m14092lr(wjvVar) ? 1 : 0);
                                jSONObject.put("usecache", C3116ri.m12672ri().m12687ri(wjvVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    private static boolean m16583ik() {
        return f13214ri < 0.0f || f13211lr < 0 || f13209ik < 0.0f || f13210ka < 0 || f13208fi < 0;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m16584ik(Activity activity) {
        if (f13215sf == null) {
            synchronized (f13206co) {
                if (f13215sf == null) {
                    String strM16707ri = C3606fi.m16707ri("cutout_devices", "");
                    String str = Build.MODEL;
                    if (!TextUtils.isEmpty(strM16707ri) && !TextUtils.isEmpty(str)) {
                        try {
                            JSONArray jSONArray = new JSONArray(strM16707ri);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                if (str.equals(jSONArray.getString(i))) {
                                    f13215sf = Boolean.TRUE;
                                    return true;
                                }
                            }
                        } catch (Exception e) {
                            C2707ac.m10196ik("UIUtils", e.getMessage());
                        }
                    }
                    f13215sf = Boolean.valueOf(m16587ka(activity) || m16605ri("ro.miui.notch", activity) == 1 || bgr(activity) || m16599nr(activity) || m16628vr(activity) || slm(activity) || m16574bu(activity));
                }
            }
        }
        return f13215sf.booleanValue();
    }

    /* JADX INFO: renamed from: ik */
    public static int[] m16585ik(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static float jbs(Context context) {
        m16609ri(context);
        return f13209ik;
    }

    /* JADX INFO: renamed from: ka */
    public static int m16586ka(Context context) {
        m16609ri(context);
        return m16581ik(context, f13210ka);
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16587ka(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    f13205aw = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e) {
                C2707ac.m10196ik("UIUtils", e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m16588ka(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: lr */
    public static int m16589lr(Context context, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return Float.valueOf(m16603ri(context, f, true)).intValue();
    }

    /* JADX INFO: renamed from: lr */
    private static Bitmap m16590lr(C2634di c2634di) {
        if (c2634di == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c2634di.getWidth(), c2634di.getHeight(), Bitmap.Config.RGB_565);
            c2634di.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private static ArrayList<Integer> m16591lr(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m16592lr(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m16593lr(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.qd.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m16595lr() {
        return f13205aw && Build.VERSION.SDK_INT >= 28;
    }

    /* JADX INFO: renamed from: lr */
    public static int[] m16596lr(Context context) {
        if (context == null) {
            return null;
        }
        if (xha == null) {
            xha = (WindowManager) C3299nr.m14642ri().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = xha;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: lr */
    public static int[] m16597lr(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: mj */
    public static float m16598mj(Context context) {
        m16610ri(context, true);
        return f13214ri;
    }

    /* JADX INFO: renamed from: nr */
    public static boolean m16599nr(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* JADX INFO: renamed from: qt */
    public static int m16600qt(Context context) {
        m16609ri(context);
        return f13211lr;
    }

    /* JADX INFO: renamed from: ri */
    public static float m16601ri() {
        float f = f13213qt;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = C3299nr.m14642ri().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        f13213qt = dimensionPixelSize;
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: ri */
    public static float m16602ri(Context context, float f) {
        m16609ri(context);
        return f * jbs(context);
    }

    /* JADX INFO: renamed from: ri */
    public static float m16603ri(Context context, float f, boolean z) {
        m16609ri(context);
        return (f * m16598mj(context)) + (z ? 0.5f : 0.0f);
    }

    /* JADX INFO: renamed from: ri */
    public static int m16604ri(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListM16591lr = m16591lr(bitmap);
            if (arrayListM16591lr == null) {
                return -1;
            }
            HashMap map = new HashMap();
            for (Integer num : arrayListM16591lr) {
                if (map.containsKey(num)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(num)).intValue() + 1);
                    map.remove(num);
                    map.put(num, numValueOf);
                } else {
                    map.put(num, 1);
                }
            }
            int iIntValue = 0;
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m16605ri(String str, Activity activity) {
        if (igq.m16506fi()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                C2707ac.m10196ik("UIUtils", e.getMessage());
            } catch (IllegalAccessException e2) {
                C2707ac.m10196ik("UIUtils", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                C2707ac.m10196ik("UIUtils", e3.getMessage());
            } catch (NoSuchMethodException e4) {
                C2707ac.m10196ik("UIUtils", e4.getMessage());
            } catch (InvocationTargetException e5) {
                C2707ac.m10196ik("UIUtils", e5.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    private static Bitmap m16606ri(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            C2707ac.m10196ik("UIUtils", th.getMessage());
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Bitmap m16607ri(C2634di c2634di) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = c2634di.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapM16590lr = m16590lr(c2634di);
        if (bitmapM16590lr == null) {
            bitmapM16590lr = m16606ri(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapM16590lr == null) {
            return null;
        }
        return C2721ka.m10236ri(bitmapM16590lr, bitmapM16590lr.getWidth() / 6, bitmapM16590lr.getHeight() / 6);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16608ri(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            C2707ac.m10196ik("UIUtils", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16609ri(Context context) {
        m16610ri(context, false);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16610ri(Context context, boolean z) {
        Context contextM14642ri = context == null ? C3299nr.m14642ri() : context;
        if (contextM14642ri == null) {
            return;
        }
        xha = (WindowManager) contextM14642ri.getSystemService("window");
        if (m16583ik() || z) {
            DisplayMetrics displayMetrics = contextM14642ri.getResources().getDisplayMetrics();
            f13214ri = displayMetrics.density;
            f13211lr = displayMetrics.densityDpi;
            f13209ik = displayMetrics.scaledDensity;
            f13210ka = displayMetrics.widthPixels;
            f13208fi = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = f13210ka;
            int i2 = f13208fi;
            if (i > i2) {
                f13210ka = i2;
                f13208fi = i;
            }
        } else {
            int i3 = f13210ka;
            int i4 = f13208fi;
            if (i3 < i4) {
                f13210ka = i4;
                f13208fi = i3;
            }
        }
        f13207di = configuration.smallestScreenWidthDp;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16611ri(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16612ri(View view, int i) {
        if (view == null || view.getVisibility() == i || !m16625ri(i)) {
            return;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16613ri(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        m16616ri(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16614ri(View view, View.OnClickListener onClickListener, String str) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        C2707ac.m10196ik("OnclickListener ", str + " is null , can not set OnClickListener !!!");
    }

    /* JADX INFO: renamed from: ri */
    public static void m16615ri(View view, View.OnTouchListener onTouchListener, String str) {
        if (view != null) {
            view.setOnTouchListener(onTouchListener);
            return;
        }
        C2707ac.m10196ik("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
    }

    /* JADX INFO: renamed from: ri */
    private static void m16616ri(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16617ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            slmVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            m16622ri(slmVar, d, i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16618ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        m16619ri(textView, slmVar, wjvVar, 14);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16619ri(TextView textView, com.bytedance.sdk.openadsdk.core.widget.slm slmVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i) {
        m16617ri(textView, slmVar, (wjvVar == null || wjvVar.tyz() == null) ? -1.0d : wjvVar.tyz().m14071ka(), i);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16620ri(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16621ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        dzy.m16402lr(new AbstractRunnableC2676ik("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.qd.3
            @Override // java.lang.Runnable
            public void run() {
                C3583qd.m16582ik(wjvVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: renamed from: ri */
    public static void m16622ri(com.bytedance.sdk.openadsdk.core.widget.slm slmVar, double d, int i) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            slmVar.setVisibility(8);
        } else {
            slmVar.setVisibility(0);
            slmVar.m15098ri(d, i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m16623ri(boolean z) {
        f13215sf = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16624ri(float f, float f2, Context context) {
        Float.valueOf(f);
        Float.valueOf(f2);
        if (f != -1.0f && f2 != -1.0f) {
            if (f13212mj == null) {
                f13212mj = ViewConfiguration.get(context);
            }
            if (jbs == -1) {
                jbs = f13212mj.getScaledTouchSlop();
            }
            if (f - f2 > jbs) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m16625ri(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* JADX INFO: renamed from: ri */
    public static int[] m16626ri(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: sf */
    public static Pair<Integer, Integer> m16627sf(Context context) {
        if (context == null) {
            context = C3299nr.m14642ri();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static boolean slm(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    /* JADX INFO: renamed from: vr */
    public static boolean m16628vr(Context context) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int xha(Context context) {
        m16609ri(context);
        return m16581ik(context, f13208fi);
    }

    public static void xha(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
