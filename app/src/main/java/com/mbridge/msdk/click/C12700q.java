package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.C12687a;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13227u0;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.mbridge.msdk.click.q */
/* JADX INFO: compiled from: WebViewSpiderLoaderDiff.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12700q {
    /* JADX INFO: renamed from: a */
    public static String m34765a(CampaignEx campaignEx, String str) {
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m34766a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, C12687a c12687a, String str, String str2, Context context, C12698o.f fVar, Semaphore semaphore) {
        if (m34767a(jumpLoaderResult.getUrl()) || 200 != c12687a.f33664f || TextUtils.isEmpty(jumpLoaderResult.getContent()) || jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            if (c12687a != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(c12687a.f33666h);
                jumpLoaderResult.setStatusCode(c12687a.f33664f);
                jumpLoaderResult.setHeader(c12687a.m34666a());
                jumpLoaderResult.setContent(c12687a.f33665g);
            }
            m34768a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
            return;
        }
        jumpLoaderResult.setType(2);
        if (TextUtils.isEmpty(jumpLoaderResult.getContent())) {
            try {
                new C12698o().m34743a(str, str2, context, jumpLoaderResult.getUrl(), fVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("WebViewSpiderLoaderDiff", e.getMessage());
                }
            }
        } else {
            new C12698o().m34744a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), fVar);
        }
        semaphore.acquireUninterruptibly();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m34767a(String str) {
        return C13227u0.a.m37868b(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m34768a(String str, CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult) {
        if (campaignEx != null) {
            campaignEx.getLinkType();
        }
        if (!m34767a(str)) {
            jumpLoaderResult.setCode(2);
            jumpLoaderResult.setUrl(str);
            return false;
        }
        jumpLoaderResult.setCode(1);
        jumpLoaderResult.setUrl(str);
        jumpLoaderResult.setjumpDone(true);
        return true;
    }
}
