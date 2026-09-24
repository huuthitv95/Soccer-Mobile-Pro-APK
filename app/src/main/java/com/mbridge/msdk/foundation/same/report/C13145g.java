package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13211m0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.g */
/* JADX INFO: compiled from: PlayableReportUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13145g {

    /* JADX INFO: renamed from: a */
    private static Handler f36119a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public static void m37360a(String str, CampaignEx campaignEx, String str2, String str3, String str4) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        C13080n c13080n = new C13080n(str, !TextUtils.isEmpty(campaignEx.getMraid()) ? 1 : 3, "0", "", campaignEx.getId(), str3, str2, String.valueOf(campaignEx.getKeyIaRst()));
        c13080n.m36962b(campaignEx.getId());
        c13080n.m36990n(campaignEx.getRequestId());
        c13080n.m36984k(campaignEx.getCurrentLocalRid());
        c13080n.m36992o(campaignEx.getRequestIdNotice());
        c13080n.m36958a(campaignEx.getAdSpaceT());
        c13080n.m36959a(str4);
        c13080n.m36971e(7);
        c13080n.m36965c(C13211m0.m37770s(C13008c.m36588n().m36542d()));
        c13080n.m36961b(campaignEx.isMraid() ? C13080n.f35733N : C13080n.f35734O);
        C13156d.m37475b().m37481a(c13080n, campaignEx);
    }

    /* JADX INFO: renamed from: b */
    public static void m37361b(C13080n c13080n, Context context, String str) {
        C13162o.m37521c(c13080n);
    }

    /* JADX INFO: renamed from: c */
    public static void m37363c(C13080n c13080n, Context context, String str) {
        C13162o.m37523d(c13080n);
    }

    /* JADX INFO: renamed from: d */
    public static void m37364d(C13080n c13080n, Context context, String str) {
        if (c13080n != null) {
            c13080n.m36982j("2000060");
            c13080n.m37004u(str);
            c13080n.m36965c(C13211m0.m37770s(context));
            C13162o.m37530h(c13080n);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m37362b(C13080n c13080n, String str, CampaignEx campaignEx) {
        if (c13080n != null) {
            c13080n.m36982j("2000059");
            c13080n.m37004u(str);
            c13080n.m36965c(C13211m0.m37770s(C13008c.m36588n().m36542d()));
            c13080n.m36969d(C13198g.m37689d());
            C13162o.m37529g(c13080n);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37359a(C13080n c13080n, String str, CampaignEx campaignEx) {
        int adType;
        if (c13080n != null) {
            c13080n.m36969d(C13198g.m37689d());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                C13156d.m37475b().m37481a(c13080n, campaignEx);
            } else {
                C13162o.m37528f(c13080n);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m37358a(C13080n c13080n, Context context, String str) {
        if (c13080n != null) {
            c13080n.m36982j("2000063");
            c13080n.m37004u(str);
            c13080n.m36965c(C13211m0.m37770s(context));
            C13162o.m37525e(c13080n);
        }
    }
}
