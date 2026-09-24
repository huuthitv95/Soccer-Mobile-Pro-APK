package com.mbridge.msdk.videocommon.cache;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13069c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.cache.a */
/* JADX INFO: compiled from: VideoCampaignCache.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14201a {

    /* JADX INFO: renamed from: b */
    private static final String f40967b = "com.mbridge.msdk.videocommon.cache.a";

    /* JADX INFO: renamed from: c */
    private static C14201a f40968c;

    /* JADX INFO: renamed from: a */
    private C13015e f40969a;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.cache.a$a */
    /* JADX INFO: compiled from: VideoCampaignCache.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f40970a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f40971b;

        a(String str, CampaignEx campaignEx) {
            this.f40970a = str;
            this.f40971b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            C14201a.this.m42420a(this.f40970a, this.f40971b);
        }
    }

    private C14201a() {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d != null) {
                this.f40969a = C13015e.m36643a(C13017g.m36693a(contextM36542d));
            } else {
                C13219q0.m37816b(f40967b, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14201a m42411a() {
        if (f40968c == null) {
            synchronized (C14201a.class) {
                if (f40968c == null) {
                    f40968c = new C14201a();
                }
            }
        }
        return f40968c;
    }

    /* JADX INFO: renamed from: a */
    public int m42412a(String str, int i, boolean z, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            List<CampaignEx> listM36650a = z ? this.f40969a.m36650a(str, 0, 0, i, str2) : this.f40969a.m36651a(str, 0, 0, i, false);
            if (listM36650a == null) {
                return 0;
            }
            for (CampaignEx campaignEx : listM36650a) {
                if (campaignEx != null && campaignEx.getReadyState() == 0) {
                    arrayList.add(campaignEx);
                }
            }
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<C13069c> m42413a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f40969a.m36679d(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<CampaignEx> m42414a(String str, int i, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return this.f40969a.m36651a(str, 0, 0, i, z);
        } catch (Exception e) {
            C13219q0.m37816b(f40967b, e.getLocalizedMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public List<CampaignEx> m42415a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list != null) {
            try {
                C14221a c14221aM42670c = C14222b.m42658b().m42670c();
                long jM42647e = c14221aM42670c != null ? c14221aM42670c.m42647e() : 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (list.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : list) {
                            if (campaignEx != null) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jM42647e >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m42416a(long j, String str) {
        try {
            this.f40969a.m36672b(j, str);
        } catch (Exception e) {
            e.printStackTrace();
            C13219q0.m37816b(f40967b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42417a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getId())) {
                    return;
                }
                this.f40969a.m36681d(campaignEx.getId(), campaignEx.getRequestId());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42418a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (campaignEx.isBidCampaign()) {
                    C13091b.m37111c(str, campaignEx.getRequestId());
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (TextUtils.isEmpty(localRequestId)) {
                    this.f40969a.m36661a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                boolean z = true;
                if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                    z = false;
                }
                if (localRequestId.contains("label_second")) {
                    localRequestId = localRequestId.replace("label_second", "");
                }
                if (!z) {
                    this.f40969a.m36661a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f40969a.m36660a(str, localRequestId, localRequestId + "label_second");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42419a(String str, int i) {
        int size;
        try {
            List<C13069c> listM36679d = this.f40969a.m36679d(str);
            if (listM36679d == null || listM36679d.size() <= 0 || (size = listM36679d.size() - i) <= 0) {
                return;
            }
            for (int i2 = 0; i2 < size; i2++) {
                m42436d(str, listM36679d.get(i2).m36785a());
                C13091b.m37111c(str, listM36679d.get(i2).m36785a());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42420a(String str, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                String localRequestId = campaignEx.getLocalRequestId();
                if (TextUtils.isEmpty(localRequestId)) {
                    this.f40969a.m36661a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                boolean z = true;
                if (campaignEx.getSecondRequestIndex() != 1 && !localRequestId.contains("label_second")) {
                    z = false;
                }
                if (localRequestId.contains("label_second")) {
                    localRequestId = localRequestId.replace("label_second", "");
                }
                if (!z) {
                    this.f40969a.m36661a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                    return;
                }
                this.f40969a.m36660a(str, localRequestId, localRequestId + "label_second");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42421a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            List<C13069c> listM36679d = this.f40969a.m36679d(str);
            if (str2.contains("label_second")) {
                String strReplace = str2.replace("label_second", "");
                if (listM36679d == null || listM36679d.isEmpty() || TextUtils.isEmpty(strReplace)) {
                    return;
                }
                for (C13069c c13069c : listM36679d) {
                    if (strReplace.equals(c13069c.m36798d())) {
                        m42436d(str, c13069c.m36785a());
                        C13091b.m37111c(str, c13069c.m36785a());
                        return;
                    }
                }
                return;
            }
            String str3 = str2 + "label_second";
            if (listM36679d == null || listM36679d.isEmpty() || TextUtils.isEmpty(str3)) {
                return;
            }
            Iterator<C13069c> it = listM36679d.iterator();
            while (it.hasNext()) {
                if (str3.equals(it.next().m36798d())) {
                    for (C13069c c13069c2 : listM36679d) {
                        if (str2.equals(c13069c2.m36798d())) {
                            m42436d(str, c13069c2.m36785a());
                            C13091b.m37111c(str, c13069c2.m36785a());
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b("videoCache", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42422a(String str, String str2, List<CampaignEx> list) {
        try {
            if (TextUtils.isEmpty(str2) || list == null || list.size() <= 0) {
                return;
            }
            this.f40969a.m36668a(list, str, str2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42423a(String str, List<CampaignEx> list) {
        C13015e c13015e;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (c13015e = this.f40969a) == null) {
            return;
        }
        c13015e.m36675b(str, list);
    }

    /* JADX INFO: renamed from: a */
    public void m42424a(String str, List<CampaignEx> list, String str2) {
        C13015e c13015e;
        try {
            if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || (c13015e = this.f40969a) == null) {
                return;
            }
            c13015e.m36663a(str, list, str2);
        } catch (Exception e) {
            C13219q0.m37816b(f40967b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42425a(String str, List<CampaignEx> list, String str2, int i) {
        C13015e c13015e;
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || TextUtils.isEmpty(str2) || (c13015e = this.f40969a) == null) {
            return;
        }
        c13015e.m36664a(str, list, str2, i);
    }

    /* JADX INFO: renamed from: b */
    public List<CampaignEx> m42426b(String str, int i, boolean z) {
        return m42427b(str, i, z, "");
    }

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<CampaignEx> m42427b(String str, int i, boolean z, String str2) {
        Exception exc;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            long jM42647e = c14221aM42670c != null ? c14221aM42670c.m42647e() : 0L;
            if (!TextUtils.isEmpty(str)) {
                List<CampaignEx> listM36650a = z ? this.f40969a.m36650a(str, 0, 0, i, str2) : this.f40969a.m36651a(str, 0, 0, i, false);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listM36650a != null) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    try {
                        for (CampaignEx campaignEx : listM36650a) {
                            if (campaignEx != null && (campaignEx.getReadyState() == 0 || campaignEx.getLoadTimeoutState() == 1)) {
                                long plct = campaignEx.getPlct() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plct > 0 && plct >= timestamp) || (plct <= 0 && jM42647e >= timestamp)) {
                                    copyOnWriteArrayList2.add(campaignEx);
                                }
                            }
                        }
                        return copyOnWriteArrayList2;
                    } catch (Exception e) {
                        exc = e;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        exc.printStackTrace();
                        return copyOnWriteArrayList;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42428b(String str) {
        ConcurrentHashMap<String, C13069c> concurrentHashMapM36685f;
        try {
            if (TextUtils.isEmpty(str) || (concurrentHashMapM36685f = this.f40969a.m36685f(str)) == null || concurrentHashMapM36685f.size() <= 0) {
                return;
            }
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            long jM39486c0 = c13635gM39718d != null ? c13635gM39718d.m39486c0() : 0L;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (C13069c c13069c : concurrentHashMapM36685f.values()) {
                if (c13069c != null) {
                    long jM36799e = c13069c.m36799e();
                    if (jM36799e <= 0) {
                        jM36799e = jM39486c0;
                    }
                    if (c13069c.m36800f() + (jM36799e * 1000) < jCurrentTimeMillis && !TextUtils.isEmpty(c13069c.m36785a())) {
                        C13219q0.m37816b("HBOPTIMIZE", "不在有效期范围内 删除" + c13069c.m36785a());
                        m42436d(str, c13069c.m36785a());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m42429b(String str, int i) {
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            int iM39500f = c13635gM39718d.m39500f();
            if (iM39500f == 0) {
                return;
            }
            boolean z = true;
            List<CampaignEx> listM36671b = this.f40969a.m36671b(str, i, iM39500f == 2);
            if (listM36671b != null && listM36671b.size() > 0) {
                for (CampaignEx campaignEx : listM36671b) {
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    String id = campaignEx.getId();
                    C14200a.m42404e(campaignEx.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + campaignEx.getCMPTEntryUrl());
                }
            }
            C13015e c13015e = this.f40969a;
            if (iM39500f != 2) {
                z = false;
            }
            c13015e.m36656a(str, i, z);
        } catch (Exception e) {
            C13219q0.m37816b(f40967b, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42430b(String str, CampaignEx campaignEx) {
        C13167a.m37543b().execute(new a(str, campaignEx));
    }

    /* JADX INFO: renamed from: b */
    public void m42431b(String str, String str2) {
        if (this.f40969a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f40969a.m36658a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public List<CampaignEx> m42432c(String str, int i, boolean z) {
        return m42433c(str, i, z, "");
    }

    /* JADX INFO: renamed from: c */
    public List<CampaignEx> m42433c(String str, int i, boolean z, String str2) {
        ArrayList arrayList = null;
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            long jM39486c0 = (c13635gM39718d != null ? c13635gM39718d.m39486c0() : C13636h.m39706b().m39708a().m39486c0()) * 1000;
            if (!TextUtils.isEmpty(str)) {
                List<CampaignEx> listM36650a = z ? this.f40969a.m36650a(str, 0, 0, i, str2) : this.f40969a.m36651a(str, 0, 0, i, false);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (listM36650a != null) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (CampaignEx campaignEx : listM36650a) {
                            if (campaignEx != null && campaignEx.getReadyState() == 0) {
                                long plctb = campaignEx.getPlctb() * 1000;
                                long timestamp = jCurrentTimeMillis - campaignEx.getTimestamp();
                                if ((plctb <= 0 && jM39486c0 >= timestamp) || (plctb > 0 && plctb >= timestamp)) {
                                    arrayList2.add(campaignEx);
                                }
                            }
                        }
                        return arrayList2;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList2;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    public CopyOnWriteArrayList<CampaignEx> m42434c(String str, int i) {
        List<CampaignEx> listM36649a;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (listM36649a = this.f40969a.m36649a(str, 0, 0, i)) == null) {
                return null;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            try {
                for (CampaignEx campaignEx : listM36649a) {
                    if (campaignEx != null) {
                        copyOnWriteArrayList2.add(campaignEx);
                    }
                }
                return copyOnWriteArrayList2;
            } catch (Exception e) {
                e = e;
                copyOnWriteArrayList = copyOnWriteArrayList2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        e.printStackTrace();
        return copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: c */
    public void m42435c(String str, String str2) {
        C13015e c13015e = this.f40969a;
        if (c13015e != null) {
            c13015e.m36678c(str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m42436d(String str, String str2) {
        try {
            this.f40969a.m36684f(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
