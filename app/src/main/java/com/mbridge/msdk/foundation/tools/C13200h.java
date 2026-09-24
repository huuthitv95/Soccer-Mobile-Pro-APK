package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13078l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.h */
/* JADX INFO: compiled from: CheckUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13200h {

    /* JADX INFO: renamed from: a */
    private static final String f36307a = "com.mbridge.msdk.foundation.tools.h";

    /* JADX INFO: renamed from: b */
    public static int f36308b;

    /* JADX INFO: renamed from: b */
    public static int m37703b(Context context) {
        if (f36308b == 0) {
            f36308b = m37699a(context) ? 1 : -1;
        }
        return f36308b;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m37699a(Context context) {
        return context != null && Settings.canDrawOverlays(context);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37700a(CampaignEx campaignEx, Context context, View view, int i) {
        C13078l c13078lM37697a = m37697a(view, i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        m37698a(arrayList, c13078lM37697a);
        return m37701a(c13078lM37697a, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m37704b(CampaignEx campaignEx, Context context, View view, int i) {
        C13078l c13078lM37697a = m37697a(view, i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        return m37701a(c13078lM37697a, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37702a(List<CampaignEx> list, Context context, View view, int i) {
        C13078l c13078lM37697a = m37697a(view, i);
        m37698a(list, c13078lM37697a);
        return m37701a(c13078lM37697a, list);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m37701a(C13078l c13078l, List<CampaignEx> list) {
        return c13078l.m36937a() || list == null || list.isEmpty() || list.get(0).getLocalCheckShow() == 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m37698a(List<CampaignEx> list, C13078l c13078l) {
        C13154c c13154c;
        C13154c c13154cM37489b;
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("per", Integer.valueOf(m37703b(C13008c.m36588n().m36542d())));
            c13157e.m37501a("viewStatus", Integer.valueOf(c13078l.m36938b()));
            c13157e.m37501a("showe", Integer.valueOf(!c13078l.m36937a() ? 1 : 0));
            C13154c c13154c2 = null;
            try {
                c13154cM37489b = C13156d.m37475b().m37489b(list.get(0).getCurrentLocalRid());
                if (c13154cM37489b == null) {
                    try {
                        c13154c = new C13154c();
                        try {
                            C13156d.m37475b().m37495c().put(list.get(0).getCurrentLocalRid(), c13154c);
                            c13154cM37489b = c13154c;
                        } catch (Exception e) {
                            e = e;
                            C13219q0.m37816b(f36307a, e.getMessage());
                            c13154cM37489b = c13154c;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c13154c2 = c13154cM37489b;
                        c13154c = c13154c2;
                        C13219q0.m37816b(f36307a, e.getMessage());
                        c13154cM37489b = c13154c;
                        C13156d.m37475b().m37484a("m_show_env", c13154cM37489b);
                        C13156d.m37475b().m37486a("2000130", c13157e);
                        C13156d.m37475b().m37486a("2000131", c13157e);
                    }
                }
                c13154cM37489b.m37421a((CampaignEx) null);
                c13154cM37489b.m37429b(list);
                c13154cM37489b.m37423a("m_show_env", c13157e);
            } catch (Exception e3) {
                e = e3;
            }
            C13156d.m37475b().m37484a("m_show_env", c13154cM37489b);
            C13156d.m37475b().m37486a("2000130", c13157e);
            C13156d.m37475b().m37486a("2000131", c13157e);
        } catch (Throwable th) {
            C13219q0.m37816b(f36307a, th.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static C13078l m37697a(View view, int i) {
        C13078l c13078l = new C13078l();
        if (view != null) {
            c13078l.m36936a(C13194e1.m37670a(view, i) ? 1 : 0);
        }
        return c13078l;
    }
}
