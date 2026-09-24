package com.mbridge.msdk.interstitial.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.interstitial.cache.a */
/* JADX INFO: compiled from: InterstitialCamapignCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13249a {

    /* JADX INFO: renamed from: b */
    private static final String f36493b = "com.mbridge.msdk.interstitial.cache.a";

    /* JADX INFO: renamed from: c */
    private static C13249a f36494c;

    /* JADX INFO: renamed from: a */
    private C13015e f36495a;

    private C13249a() {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                this.f36495a = C13015e.m36643a(C13017g.m36693a(contextM36542d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C13249a m38034a() {
        if (f36494c == null) {
            f36494c = new C13249a();
        }
        return f36494c;
    }

    /* JADX INFO: renamed from: b */
    public void m38040b(CampaignEx campaignEx, String str) {
        try {
            if (this.f36495a == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f36495a.m36647a(campaignEx, str, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public List<CampaignEx> m38035a(String str, int i) {
        List<CampaignEx> listM36649a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listM36649a = this.f36495a.m36649a(str, i, 0, 1)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                Iterator<CampaignEx> it = listM36649a.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m38037a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.f36495a.m36683e(campaignEx.getId(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38039a(List<CampaignEx> list, String str) {
        if (list == null || list.size() <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<CampaignEx> it = list.iterator();
        while (it.hasNext()) {
            m38037a(it.next(), str);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38038a(String str, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
                return;
            }
            Iterator<CampaignEx> it = list.iterator();
            while (it.hasNext()) {
                m38040b(it.next(), str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m38036a(long j, String str) {
        try {
            if (this.f36495a != null && j != 0 && !TextUtils.isEmpty(str)) {
                this.f36495a.m36652a(j, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            C13219q0.m37816b(f36493b, e.getMessage());
        }
    }
}
