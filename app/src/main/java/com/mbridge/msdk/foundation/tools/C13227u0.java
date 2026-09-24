package com.mbridge.msdk.foundation.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.C13245a;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.u0 */
/* JADX INFO: compiled from: SameSDKTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13227u0 extends C13232x {

    /* JADX INFO: renamed from: a */
    public static char[] f36391a = {'a', 'n', 'd', 'r', 'o', 'i', 'd', 'c', 'o', 'n', 't', 'e', 'n', 't', 'p', 'm', 'g', 'e', 't', 'C', 'o', 'n', 't', 'e', 'x', 't'};

    /* JADX INFO: renamed from: b */
    public static boolean f36392b = false;

    /* JADX INFO: renamed from: c */
    public static LinearLayout f36393c;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.u0$a */
    /* JADX INFO: compiled from: SameSDKTool.java */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m37866a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
            try {
                List<ResolveInfo> listM37865a = m37865a(context);
                if (listM37865a != null && listM37865a.size() > 0) {
                    String strM37864a = m37864a(str);
                    if (TextUtils.isEmpty(strM37864a)) {
                        return false;
                    }
                    Intent intentM37867b = m37867b(context);
                    intentM37867b.setData(Uri.parse(strM37864a));
                    intentM37867b.addFlags(268435456);
                    Iterator<ResolveInfo> it = listM37865a.iterator();
                    while (it.hasNext()) {
                        if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                            intentM37867b.setPackage("com.android.vending");
                            break;
                        }
                    }
                    context.startActivity(intentM37867b);
                    C13227u0.m37859a(nativeTrackingListener);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                C13219q0.m37816b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public static Intent m37867b(Context context) {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.package.name"));
        }

        /* JADX INFO: renamed from: c */
        public static boolean m37869c(String str) {
            Uri uri;
            try {
                if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || TextUtils.isEmpty(uri.getHost())) {
                    return false;
                }
                return uri.getHost().equals("play.google.com") || uri.getHost().equals("market.android.com");
            } catch (Throwable th) {
                C13219q0.m37816b("SDKUtil", Log.getStackTraceString(th));
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public static boolean m37870d(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return Uri.parse(str).getScheme().equals("market");
            } catch (Throwable th) {
                C13219q0.m37816b("SDKUtil", Log.getStackTraceString(th));
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public static boolean m37868b(String str) {
            return m37870d(str) || m37869c(str);
        }

        /* JADX INFO: renamed from: a */
        public static List<ResolveInfo> m37865a(Context context) {
            try {
                return context.getPackageManager().queryIntentActivities(m37867b(context), 0);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static String m37864a(String str) {
            if (m37870d(str)) {
                return str;
            }
            if (!m37869c(str)) {
                return null;
            }
            return "market://" + str.substring(str.indexOf("details?id="));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37853a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(C13098e.m37145a(EnumC13096c.MBRIDGE_700_IMG), m37862b(str)).getAbsolutePath();
    }

    /* JADX INFO: renamed from: b */
    public static String m37862b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) == -1) {
            return str.hashCode() + "";
        }
        return (str.hashCode() + str.substring(str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING) + 1).hashCode()) + "";
    }

    /* JADX INFO: renamed from: a */
    public static void m37858a(Context context, String str, NativeListener.NativeTrackingListener nativeTrackingListener) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = listQueryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    m37858a(context, "market://details?id=" + str.replace("https://play.google.com/store/apps/details?id=", ""), nativeTrackingListener);
                    return;
                }
                return;
            }
            if (!z) {
                m37856a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
                return;
            }
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                    break;
                }
            }
            try {
                context.startActivity(intent);
                m37859a(nativeTrackingListener);
            } catch (Exception unused) {
                m37856a(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""), (BaseTrackingListener) nativeTrackingListener);
            }
        } catch (Exception e) {
            C13219q0.m37816b("SDKUtil", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37863b(Campaign campaign, ViewGroup viewGroup) {
        m37861a(campaign, viewGroup, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static void m37860a(Campaign campaign, ViewGroup viewGroup) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    C13219q0.m37820d("SDKUtil", "hide linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    LinearLayout linearLayout = f36393c;
                    if (linearLayout == null) {
                        return;
                    }
                    viewGroup.removeView(linearLayout);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37856a(Context context, String str, BaseTrackingListener baseTrackingListener) {
        m37857a(context, str, baseTrackingListener, (CampaignEx) null, new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public static void m37855a(Context context, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        if (context == null) {
            return;
        }
        C13157e c13157e = new C13157e();
        if (list != null) {
            list.add("web_view");
        }
        if (f36392b) {
            m37857a(context, str, nativeTrackingListener, campaignEx, list);
            return;
        }
        try {
            int i = MBCommonActivity.f33377e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (a.m37870d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            C13219q0.m37818c("url", "webview url = " + str);
            intent.setFlags(268435456);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
            c13157e.m37501a("result", 1);
        } catch (Exception unused) {
            c13157e.m37501a("result", 2);
            m37857a(context, str, nativeTrackingListener, campaignEx, list);
        }
        c13157e.m37501a("type", 9);
        if (list != null) {
            c13157e.m37501a("click_path", list.toString());
        }
        C13156d.m37475b().m37483a("2000150", campaignEx, c13157e);
    }

    /* JADX INFO: renamed from: a */
    public static void m37857a(Context context, String str, BaseTrackingListener baseTrackingListener, CampaignEx campaignEx, List<String> list) {
        if (str == null || context == null) {
            return;
        }
        if (list != null) {
            list.add("browser");
        }
        C13157e c13157e = new C13157e();
        try {
            if (a.m37870d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setComponent(null);
            intent.setSelector(null);
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
            m37859a(baseTrackingListener);
            c13157e.m37501a("result", 1);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268468224);
                context.startActivity(intent2);
                m37859a(baseTrackingListener);
                c13157e.m37501a("result", 1);
            } catch (Exception e2) {
                e2.printStackTrace();
                c13157e.m37501a("result", 2);
            }
        }
        try {
            c13157e.m37501a("type", 5);
            if (list != null) {
                c13157e.m37501a("click_path", list.toString());
            }
            C13156d.m37475b().m37483a("2000150", campaignEx, c13157e);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37859a(BaseTrackingListener baseTrackingListener) {
        if (baseTrackingListener instanceof NativeListener.TrackingExListener) {
            ((NativeListener.TrackingExListener) baseTrackingListener).onLeaveApp();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37854a(Context context, String str, CampaignEx campaignEx, C12682a c12682a, BaseTrackingListener baseTrackingListener, List<String> list) {
        CampaignEx campaignEx2;
        C13157e c13157e = new C13157e();
        c13157e.m37501a("type", 9);
        try {
            BrowserView browserView = new BrowserView(C13008c.m36588n().m36542d(), campaignEx);
            browserView.setLayoutParams(new LinearLayout.LayoutParams(C13211m0.m37760n(context), C13211m0.m37757m(context)));
            campaignEx2 = campaignEx;
            try {
                browserView.setListener(new C13245a(context, campaignEx2, c12682a, browserView, baseTrackingListener));
                browserView.loadUrl(str);
                c13157e.m37501a("result", "1");
            } catch (Exception e) {
                e = e;
                C13219q0.m37816b("SDKUtil", e.getMessage());
                c13157e.m37501a("result", "2");
            }
        } catch (Exception e2) {
            e = e2;
            campaignEx2 = campaignEx;
        }
        if (list != null) {
            c13157e.m37501a("click_path", list.toString());
        }
        C13156d.m37475b().m37483a("2000150", campaignEx2, c13157e);
    }

    /* JADX INFO: renamed from: a */
    public static void m37861a(Campaign campaign, ViewGroup viewGroup, int i, int i2) {
        if (campaign != null) {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (campaignEx.getLinkType() == 8 && campaignEx.getAabEntity() != null && campaignEx.getAabEntity().getHlp() == 1) {
                if (viewGroup == null) {
                    C13219q0.m37820d("SDKUtil", "show linkType==8 loading view failed. viewGroup is null");
                    return;
                }
                try {
                    if (f36393c == null) {
                        Context contextM36542d = C13008c.m36588n().m36542d();
                        if (contextM36542d instanceof Activity) {
                            f36393c = (LinearLayout) LayoutInflater.from(contextM36542d.getApplicationContext()).inflate(C13203i0.m37707a(contextM36542d.getApplicationContext(), "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        } else {
                            f36393c = (LinearLayout) LayoutInflater.from(contextM36542d).inflate(C13203i0.m37707a(contextM36542d, "mbridge_cm_loading_layout", "layout"), (ViewGroup) null);
                        }
                    }
                    int iMin = Math.min(viewGroup.getWidth(), viewGroup.getHeight());
                    int iMin2 = Math.min(Math.max(iMin / 4, 70), iMin);
                    if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin2, iMin2);
                        layoutParams.gravity = 17;
                        C13197f1.m37674a(f36393c);
                        viewGroup.addView(f36393c, layoutParams);
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMin2, iMin2);
                    if (i2 == 0 && i == 0) {
                        layoutParams2.addRule(13);
                    } else {
                        layoutParams2.leftMargin = i2;
                        layoutParams2.topMargin = i;
                    }
                    C13197f1.m37674a(f36393c);
                    viewGroup.addView(f36393c, layoutParams2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
