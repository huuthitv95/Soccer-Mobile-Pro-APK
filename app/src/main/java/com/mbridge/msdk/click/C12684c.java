package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13196f0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13630b;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.util.C13884b;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.click.c */
/* JADX INFO: compiled from: CommonClickUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12684c {

    /* JADX INFO: renamed from: a */
    static Handler f33647a = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.click.c$a */
    /* JADX INFO: compiled from: CommonClickUtil.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            String string;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string2 = data.getString("rid");
                        String string3 = data.getString("rid_n");
                        string = data.getString("cid");
                        str = string2;
                        str2 = string3;
                    } else {
                        str = "";
                        str2 = str;
                        string = str2;
                    }
                    new C13146h(C13008c.m36588n().m36542d()).m37366a(i, i2, str, str2, string);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.c$b */
    /* JADX INFO: compiled from: CommonClickUtil.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f33648a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f33649b;

        b(Context context, String str) {
            this.f33648a = context;
            this.f33649b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C13196f0.class.getMethod("mia", Context.class, String.class);
                Context context = this.f33648a;
                if (context != null) {
                    method.invoke(null, context, this.f33649b);
                } else {
                    C13219q0.m37816b("CommonClickUtil", "Context is null");
                }
            } catch (Throwable th) {
                C13219q0.m37816b("CommonClickUtil", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m34652a(String str, String str2, String str3) {
        Map<String, C13630b.a> mapM39531l;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null || (mapM39531l = c13635gM39718d.m39531l()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            Iterator<Map.Entry<String, C13630b.a>> it = mapM39531l.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!TextUtils.isEmpty(key) && host.contains(key)) {
                    C13630b.a aVar = mapM39531l.get(key);
                    return aVar != null ? m34653a(m34653a(m34653a(m34653a(str, aVar.m39591a(), String.valueOf(C13211m0.m37757m(C13008c.m36588n().m36542d()))), aVar.m39593b(), String.valueOf(C13211m0.m37760n(C13008c.m36588n().m36542d()))), aVar.m39594c(), str2), aVar.m39595d(), str3) : str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m34653a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m34654a(Context context, int i, String str) {
        if (i == 0) {
            return;
        }
        try {
            C13167a.m37543b().execute(new b(context, str));
        } catch (Throwable th) {
            C13219q0.m37816b("CommonClickUtil", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34655a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                context.startActivity(intent);
                return true;
            }
            if (C13008c.m36588n().m36546f() != null) {
                Context contextM36546f = C13008c.m36588n().m36546f();
                if (!(contextM36546f instanceof Activity)) {
                    return false;
                }
                contextM36546f.startActivity(intent);
                return true;
            }
            return false;
        } catch (Throwable th) {
            C13219q0.m37817b("CommonClickUtil", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34656a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34657a(CampaignEx campaignEx) {
        return C12685d.m34662a(campaignEx);
    }

    /* JADX INFO: renamed from: b */
    public static void m34658b(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !m34656a(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || listQueryIntentActivities.size() <= 0 || (next = listQueryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            if (C13884b.m41421a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m34659c(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m34660d(Context context, String str) {
        Intent intent;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (uri.getScheme().equals(SDKConstants.PARAM_INTENT)) {
                intent = Intent.parseUri(str, 1);
            } else if (uri.getScheme().equals("android-app")) {
                intent = Intent.parseUri(str, 2);
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
                intent.setData(uri);
            }
            if (intent == null) {
                return false;
            }
            intent.setComponent(null);
            intent.setSelector(null);
            if (m34655a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            C13219q0.m37817b("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m34661e(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            int i = MBCommonActivity.f33377e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof ContextThemeWrapper)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            C13219q0.m37816b("CommonClickUtil", e.getMessage());
        } catch (Throwable th) {
            C13219q0.m37816b("CommonClickUtil", th.getMessage());
        }
    }
}
