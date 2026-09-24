package com.mbridge.msdk.mbnative.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.out.Campaign;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.cache.a */
/* JADX INFO: compiled from: APICache.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13307a extends AbstractC13308b<String, List<Campaign>> {

    /* JADX INFO: renamed from: a */
    private C13015e f36820a = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));

    /* JADX INFO: renamed from: b */
    private int f36821b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.cache.a$a */
    /* JADX INFO: compiled from: APICache.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36822a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f36823b;

        a(List list, String str) {
            this.f36822a = list;
            this.f36823b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f36822a.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) this.f36822a.get(i);
                campaignEx.setCacheLevel(1);
                C13307a.this.f36820a.m36647a(campaignEx, this.f36823b, 1);
            }
        }
    }

    public C13307a(int i) {
        this.f36821b = i;
    }

    @Override // com.mbridge.msdk.mbnative.cache.AbstractC13308b
    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public List<Campaign> mo38389b(String str, int i) {
        List<CampaignEx> listM36649a = this.f36820a.m36649a(str, i, 2, this.f36821b);
        if (listM36649a == null) {
            return null;
        }
        if (m38388a(listM36649a, 2)) {
            this.f36820a.m36654a(str, 2, this.f36821b);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listM36649a);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m38387a(List<CampaignEx> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            campaignEx.setCacheLevel(2);
            this.f36820a.m36647a(campaignEx, str, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m38388a(List<CampaignEx> list, int i) {
        long jM38390a;
        if (list != null && list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long timestamp = list.get(0).getTimestamp();
            if (i != 1) {
                jM38390a = i != 2 ? 0L : m38391b();
            } else {
                jM38390a = m38390a();
            }
            if (jCurrentTimeMillis - timestamp > jM38390a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbnative.cache.AbstractC13308b
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo38384a(String str, List<Campaign> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f36820a.m36655a(str, 1, this.f36821b, false);
        this.f36820a.m36655a(str, 2, this.f36821b, false);
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = (CampaignEx) list.get(i);
            campaignEx.setCacheLevel(1);
            this.f36820a.m36647a(campaignEx, str, 1);
        }
    }

    @Override // com.mbridge.msdk.mbnative.cache.AbstractC13308b
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo38385a(String str, List<Campaign> list, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        this.f36820a.m36655a(str, 1, this.f36821b, z);
        this.f36820a.m36655a(str, 2, this.f36821b, z);
        C13167a.m37543b().execute(new a(list, str));
    }

    @Override // com.mbridge.msdk.mbnative.cache.AbstractC13308b
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public List<Campaign> mo38383a(String str, int i) {
        List<CampaignEx> listM36649a = this.f36820a.m36649a(str, i, 1, this.f36821b);
        if (listM36649a == null) {
            return null;
        }
        if (m38388a(listM36649a, 1)) {
            m38387a(listM36649a, str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listM36649a);
        return arrayList;
    }

    @Override // com.mbridge.msdk.mbnative.cache.AbstractC13308b
    /* JADX INFO: renamed from: a */
    public void mo38386a(String str, Campaign campaign, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (campaign == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CampaignEx campaignEx = (CampaignEx) campaign;
            if (this.f36820a.m36669a(campaignEx.getId(), campaignEx.getTab(), str, campaignEx.getCacheLevel(), campaignEx.getType(), z)) {
                this.f36820a.m36659a(campaignEx.getId(), str, campaignEx.getCacheLevel(), this.f36821b, z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
