package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.C11399D9;
import com.ironsource.C11663S7;
import com.ironsource.C12161e3;
import com.ironsource.C12317m4;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.InterfaceC12560v3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.j */
/* JADX INFO: loaded from: classes6.dex */
public class C12357j {

    /* JADX INFO: renamed from: a */
    public static final String f31263a = "BANNER";

    /* JADX INFO: renamed from: b */
    public static final String f31264b = "LARGE";

    /* JADX INFO: renamed from: c */
    public static final String f31265c = "RECTANGLE";

    /* JADX INFO: renamed from: d */
    public static final String f31266d = "LEADERBOARD";

    /* JADX INFO: renamed from: e */
    public static final String f31267e = "SMART";

    /* JADX INFO: renamed from: f */
    public static final String f31268f = "CUSTOM";

    /* JADX INFO: renamed from: g */
    public static final String f31269g = "MEDIUM_RECTANGLE";

    /* JADX INFO: renamed from: h */
    public static final String f31270h = "bannerAdSize";

    /* JADX INFO: renamed from: i */
    public static final int f31271i = 0;

    /* JADX INFO: renamed from: j */
    public static final int f31272j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f31273k = 2;

    /* JADX INFO: renamed from: l */
    public static final int f31274l = 3;

    /* JADX INFO: renamed from: m */
    public static final int f31275m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f31276n = 5;

    /* JADX INFO: renamed from: o */
    public static final int f31277o = 6;

    /* JADX INFO: renamed from: p */
    public static final int f31278p = -1;

    /* JADX INFO: renamed from: q */
    public static final String f31279q = "Adaptive=true";

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.j$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void m32546a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.j$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void m32547a();

        /* JADX INFO: renamed from: a */
        void m32548a(String str);
    }

    /* JADX INFO: renamed from: a */
    static void m32537a(C12366o c12366o, C12161e3 c12161e3, b bVar) {
        String str;
        if (m32545c(c12366o)) {
            str = null;
        } else {
            str = String.format("can't load banner - %s", c12366o == null ? "banner is null" : "banner is destroyed");
        }
        if (c12161e3 == null || TextUtils.isEmpty(c12161e3.m32814c())) {
            str = String.format("can't load banner - %s", c12161e3 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(str)) {
            bVar.m32547a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.m32548a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ISBannerSize m32543b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            m32528a(f31267e, 728, 90);
        }
        return m32528a(f31267e, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    }

    /* JADX INFO: renamed from: c */
    static boolean m32545c(C12366o c12366o) {
        return (c12366o == null || c12366o.m32581b()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static int m32542b(int i) {
        if (!C12367p.m32628h().m32642G()) {
            IronLog.API.error("The mediation must be successfully initiated before calling this API");
            return -1;
        }
        return m32523a(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m32544b(C12366o c12366o) {
        ISBannerSize size;
        if (c12366o == null || (size = c12366o.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeM32543b = m32543b();
        C12363m.f31310a.m32577a(iSBannerSizeM32543b, size.f30979e);
        iSBannerSizeM32543b.setAdaptive(size.isAdaptive());
        c12366o.setBannerSize(iSBannerSizeM32543b);
    }

    /* JADX INFO: renamed from: a */
    static void m32538a(C12366o c12366o, b bVar) {
        if (c12366o != null && !c12366o.m32581b()) {
            bVar.m32547a();
        } else {
            bVar.m32548a(String.format("can't destroy banner - %s", c12366o == null ? "banner is null" : "banner is destroyed"));
        }
    }

    /* JADX INFO: renamed from: a */
    static long m32526a(long j, long j2) {
        return j2 - (new Date().getTime() - j);
    }

    /* JADX INFO: renamed from: a */
    public static ISBannerSize m32528a(String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static ISBannerSize m32527a() {
        return new ISBannerSize(f31266d, 728, 90);
    }

    /* JADX INFO: renamed from: a */
    public static void m32532a(C12366o c12366o) {
        if (c12366o != null) {
            c12366o.m32580a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m32535a(final C12366o c12366o, final View view, final FrameLayout.LayoutParams layoutParams, final InterfaceC12560v3 interfaceC12560v3) {
        if (c12366o == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = c12366o.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.j$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12357j.m32536a(c12366o, view, size, applicationContext, layoutParams, interfaceC12560v3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m32536a(C12366o c12366o, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, InterfaceC12560v3 interfaceC12560v3) {
        try {
            c12366o.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    m32533a(c12366o, view, context, iSBannerSize);
                } else {
                    c12366o.addView(view, 0, layoutParams);
                }
            }
            if (interfaceC12560v3 != null) {
                interfaceC12560v3.m33924a();
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m32534a(C12366o c12366o, View view, FrameLayout.LayoutParams layoutParams) {
        m32535a(c12366o, view, layoutParams, (InterfaceC12560v3) null);
    }

    /* JADX INFO: renamed from: a */
    private static void m32533a(C12366o c12366o, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.f30979e.m27459d());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.f30979e.m27458c());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) c12366o.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        c12366o.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.f30979e.m27458c() + " width - " + iSBannerSize.f30979e.m27459d());
        c12366o.addView(relativeLayout, 0, layoutParams2);
    }

    /* JADX INFO: renamed from: a */
    public static int m32523a(int i) {
        int iM32525a = -1;
        try {
            iM32525a = m32525a(m32530a(C12332c.m32303b()), i);
            m32531a(i, iM32525a);
            IronLog.API.verbose("Maximal height - " + iM32525a + " for width - " + i);
            return iM32525a;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e.getMessage());
            return iM32525a;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Map<String, Object> m32530a(C12332c c12332c) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(c12332c.m32320a());
        concurrentHashMap.putAll(c12332c.m32326c());
        return concurrentHashMap;
    }

    /* JADX INFO: renamed from: a */
    private static int m32525a(Map<String, Object> map, int i) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, m32524a(obj, i));
            } catch (Throwable th) {
                m32539a(obj, th);
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    private static int m32524a(Object obj, int i) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static void m32539a(Object obj, Throwable th) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C12317m4.m32153d().m32155a(th);
        IronLog.INTERNAL.error("Exception while calling getAdaptiveHeight for adapter - " + simpleName + ": " + th.getMessage());
    }

    /* JADX INFO: renamed from: a */
    private static void m32531a(int i, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i2 == -1) {
                jSONObject.put("errorCode", 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i + ",h:" + i2);
            }
            C11399D9.m25613i().mo25281a(new C12580w5(EnumC12598x5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static void m32540a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        byte b2;
        if (iSBannerSize != null) {
            try {
                String description = iSBannerSize.getDescription();
                switch (description.hashCode()) {
                    case -387072689:
                        if (!description.equals(f31265c)) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 72205083:
                        if (!description.equals(f31264b)) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 79011241:
                        if (!description.equals(f31267e)) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case 446888797:
                        if (!description.equals(f31266d)) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 1951953708:
                        if (!description.equals(f31263a)) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 1999208305:
                        if (!description.equals("CUSTOM")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    map.put(f31270h, 1);
                } else if (b2 == 1) {
                    map.put(f31270h, 2);
                } else if (b2 == 2) {
                    map.put(f31270h, 3);
                } else if (b2 == 3) {
                    map.put(f31270h, 4);
                } else if (b2 == 4) {
                    map.put(f31270h, 5);
                } else if (b2 == 5) {
                    map.put(f31270h, 6);
                    map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                }
                if (iSBannerSize.isAdaptive()) {
                    String strM32529a = m32529a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        strM32529a = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + m32529a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, strM32529a);
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m32529a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.f30979e.m27459d() + "x" + iSBannerSize.f30979e.m27458c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m32541a(C11663S7 c11663s7, int i, int i2) {
        if (c11663s7 != null && c11663s7.m27459d() > 0 && c11663s7.m27458c() > 0) {
            if (c11663s7.m27459d() >= i && c11663s7.m27458c() >= i2) {
                return true;
            }
            IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        }
        IronLog.API.warning("Container size is invalid: Default banner size will be used.");
        return false;
    }
}
