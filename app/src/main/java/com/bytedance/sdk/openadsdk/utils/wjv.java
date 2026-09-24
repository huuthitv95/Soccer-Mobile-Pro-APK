package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p225ri.C3310ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3373ri;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3532lr;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class wjv {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static C3532lr m16670lr(String str, int i, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        C3532lr c3532lr = new C3532lr();
        c3532lr.m15999ri(str);
        c3532lr.m15998ri(wjvVar);
        c3532lr.m15994lr(C3571ig.m16476ri(wjvVar));
        c3532lr.m15997ri(i);
        c3532lr.m16000ri(false);
        c3532lr.m15993lr(wjvVar.adz());
        return c3532lr;
    }

    /* JADX INFO: renamed from: lr */
    private static boolean m16671lr(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final String str2, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return C2722lr.m10244ri(context, intent, new C2722lr.lr() { // from class: com.bytedance.sdk.openadsdk.utils.wjv.1
                @Override // com.bytedance.sdk.component.utils.C2722lr.lr
                /* JADX INFO: renamed from: ri */
                public void mo10245ri() {
                    C3532lr c3532lrM16670lr = wjv.m16670lr(str2, 100, wjvVar);
                    c3532lrM16670lr.m16000ri(true);
                    c3532lrM16670lr.m15993lr(2);
                    C3414ik.m15561ri(c3532lrM16670lr);
                }

                @Override // com.bytedance.sdk.component.utils.C2722lr.lr
                /* JADX INFO: renamed from: ri */
                public void mo10246ri(Throwable th) {
                    String message = th.getMessage();
                    C3532lr c3532lrM16670lr = wjv.m16670lr(str2, 7, wjvVar);
                    c3532lrM16670lr.m15990ik(message);
                    c3532lrM16670lr.m15993lr(2);
                    C3414ik.m15561ri(c3532lrM16670lr);
                }
            }, z);
        } catch (Throwable th) {
            String message = th.getMessage();
            C3532lr c3532lrM16670lr = m16670lr(str2, 6, wjvVar);
            c3532lrM16670lr.m15990ik(message);
            c3532lrM16670lr.m15993lr(2);
            C3414ik.m15561ri(c3532lrM16670lr);
            return false;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16673ri(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16674ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2) {
        if (!(context instanceof Activity)) {
            Activity activityM16638lr = com.bytedance.sdk.openadsdk.core.slm.m14959ri().m14960fi().m16638lr();
            if (activityM16638lr != null && m16673ri(activityM16638lr)) {
                context = activityM16638lr;
            }
        } else if (!m16673ri((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = C3299nr.m14642ri();
        }
        Context context2 = context;
        if (context2 == null || !m16676ri(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        return C3373ri.m15260ri(context2, str, wjvVar, C3571ig.m16454lr(wjvVar), map, true);
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16675ri(Context context, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2, boolean z) {
        if (!(context instanceof Activity)) {
            Activity activityM16638lr = com.bytedance.sdk.openadsdk.core.slm.m14959ri().m14960fi().m16638lr();
            if (activityM16638lr != null && m16673ri(activityM16638lr)) {
                context = activityM16638lr;
            }
        } else if (!m16673ri((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = C3299nr.m14642ri();
        }
        if (context == null) {
            return false;
        }
        C3571ig.m16476ri(wjvVar);
        if (!C2724nr.m10260ri(str)) {
            C3414ik.m15561ri(m16670lr(str2, 5, wjvVar));
            return false;
        }
        String strM14338lr = com.bytedance.sdk.openadsdk.core.model.wjv.m14338lr(context, wjvVar);
        if (TextUtils.isEmpty(strM14338lr)) {
            return m16671lr(context, str, wjvVar, str2, z);
        }
        try {
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.setUrlBarHidingEnabled(false);
            builder.setShareState(2);
            try {
                CustomTabsIntent customTabsIntentBuild = builder.build();
                if (!(context instanceof Activity)) {
                    customTabsIntentBuild.intent.addFlags(268435456);
                }
                C3310ri.m14754ri(context, strM14338lr, customTabsIntentBuild, Uri.parse(str));
                if (context instanceof TTBaseActivity) {
                    ((TTBaseActivity) context).m10549ik(true);
                }
                C3532lr c3532lrM16670lr = m16670lr(str2, 100, wjvVar);
                c3532lrM16670lr.m16000ri(true);
                c3532lrM16670lr.m15993lr(8);
                C3414ik.m15561ri(c3532lrM16670lr);
            } catch (Throwable th) {
                String message = th.getMessage();
                C2707ac.m10196ik("OpenUtils", message);
                C3532lr c3532lrM16670lr2 = m16670lr(str2, 13, wjvVar);
                c3532lrM16670lr2.m15990ik(message);
                C3414ik.m15561ri(c3532lrM16670lr2);
                m16671lr(context, str, wjvVar, str2, true);
            }
            return true;
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            C2707ac.m10196ik("OpenUtils", message2);
            C3532lr c3532lrM16670lr3 = m16670lr(str2, 12, wjvVar);
            c3532lrM16670lr3.m15990ik(message2);
            C3414ik.m15561ri(c3532lrM16670lr3);
            return m16671lr(context, str, wjvVar, str2, z);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m16676ri(String str) {
        return !TextUtils.isEmpty(str);
    }
}
