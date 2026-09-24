package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.b */
/* JADX INFO: compiled from: DownLoadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14203b {

    /* JADX INFO: renamed from: f */
    private static volatile C14203b f41021f;

    /* JADX INFO: renamed from: a */
    private boolean f41022a = false;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, C14213l> f41023b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, C14202a>>> f41024c;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f41025d;

    /* JADX INFO: renamed from: e */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<C14202a>> f41026e;

    private C14203b() {
    }

    /* JADX INFO: renamed from: a */
    private void m42513a(C14213l c14213l, String str) {
        try {
            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), str);
            if (c14223cM42671c == null) {
                return;
            }
            if (c14223cM42671c.m42736l() == 2) {
                c14213l.m42613e();
            } else {
                c14213l.m42612d();
            }
        } catch (Exception e) {
            C13219q0.m37816b("DownLoadManager", e.getMessage());
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), str);
                if (c13640lM39720e == null) {
                    c13640lM39720e = C13640l.m39754j(str);
                }
                if (c13640lM39720e.m39662q() == 2) {
                    c14213l.m42613e();
                } else {
                    c14213l.m42612d();
                }
            } catch (Exception e2) {
                C13219q0.m37816b("DownLoadManager", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42514a(String str, CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2, CopyOnWriteArrayList<C14202a> copyOnWriteArrayList3) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4;
        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayList2.get(0);
            if (campaignEx.getSecondRequestIndex() == 1 && (concurrentHashMap = this.f41025d) != null && (copyOnWriteArrayList4 = concurrentHashMap.get(str)) != null && copyOnWriteArrayList4.size() > 0 && copyOnWriteArrayList4.get(0).getLocalRequestId().equals(campaignEx.getLocalRequestId())) {
                return;
            }
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<Map<String, C14202a>>> concurrentHashMap2 = this.f41024c;
        if (concurrentHashMap2 == null) {
            this.f41024c = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap2.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<C14202a>> concurrentHashMap3 = this.f41026e;
        if (concurrentHashMap3 == null) {
            this.f41026e = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap3.remove(str);
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap4 = this.f41025d;
        if (concurrentHashMap4 == null) {
            this.f41025d = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap4.remove(str);
        }
        this.f41024c.put(str, copyOnWriteArrayList);
        this.f41025d.put(str, copyOnWriteArrayList2);
        this.f41026e.put(str, copyOnWriteArrayList3);
    }

    public static C14203b getInstance() {
        if (f41021f == null) {
            synchronized (C14203b.class) {
                if (f41021f == null) {
                    f41021f = new C14203b();
                }
            }
        }
        return f41021f;
    }

    /* JADX INFO: renamed from: a */
    public C14202a m42515a(int i, String str, boolean z) {
        C14213l c14213lM42527c = m42527c(str);
        if (c14213lM42527c != null) {
            return c14213lM42527c.m42601a(i, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public C14202a m42516a(String str, String str2) {
        C14213l c14213lM42527c = m42527c(str);
        if (c14213lM42527c != null) {
            return c14213lM42527c.m42602a(str2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<C14202a> m42517a(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<C14202a>> concurrentHashMap = this.f41026e;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f41026e.get(str);
    }

    /* JADX INFO: renamed from: a */
    public void m42518a() {
        ConcurrentHashMap<String, C14213l> concurrentHashMap = this.f41023b;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C14213l> entry : concurrentHashMap.entrySet()) {
                m42513a(entry.getValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m42519a(boolean z) {
        if (!z) {
            this.f41022a = false;
        } else if (this.f41022a) {
            return;
        }
        ConcurrentHashMap<String, C14213l> concurrentHashMap = this.f41023b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C14213l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().m42612d();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m42520a(int i, String str, List<CampaignEx> list) {
        String str2;
        C14213l c14213lM42527c = m42527c(str);
        if (c14213lM42527c == null) {
            str2 = str;
            c14213lM42527c = createUnitCache(C13008c.m36588n().m36542d(), str2, (CopyOnWriteArrayList<CampaignEx>) list, i, (InterfaceC14217a) null);
        } else {
            str2 = str;
        }
        if (c14213lM42527c != null) {
            return c14213lM42527c.m42606a(list, str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m42521a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return m42522a(i, str, z, i2, z2, i3, list, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX INFO: renamed from: a */
    public boolean m42522a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list, boolean z3, C13157e c13157e) {
        Exception exc;
        boolean z4;
        CampaignEx campaignEx;
        boolean z5 = false;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    C14213l c14213lM42527c = m42527c(str);
                    if (c14213lM42527c != null) {
                        List<C14202a> listM42603a = c14213lM42527c.m42603a(str, i, z, list, z3, c13157e);
                        if (listM42603a != null && listM42603a.size() != 0) {
                            if (z2) {
                                if (list.size() <= 0 || (campaignEx = list.get(0)) == null || campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                    z4 = false;
                                } else {
                                    C13219q0.m37818c("DownLoadManager", "Is not check video download status with TPL");
                                    z4 = true;
                                }
                                try {
                                    if (i3 == 0) {
                                        ArrayList arrayList = new ArrayList();
                                        for (C14202a c14202a : listM42603a) {
                                            for (CampaignEx campaignEx2 : list) {
                                                if (c14202a != null && c14202a.m42497h() != null && campaignEx2 != null && campaignEx2.getId().equals(c14202a.m42497h().getId()) && campaignEx2.getRequestId().equals(c14202a.m42497h().getRequestId())) {
                                                    arrayList.add(c14202a);
                                                }
                                            }
                                        }
                                        if (arrayList.size() > 0) {
                                            z5 = true;
                                        } else {
                                            z5 = z4;
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        for (C14202a c14202a2 : listM42603a) {
                                            for (CampaignEx campaignEx3 : list) {
                                                if (c14202a2 != null && c14202a2.m42497h() != null && campaignEx3 != null && campaignEx3.getId().equals(c14202a2.m42497h().getId()) && campaignEx3.getRequestId().equals(c14202a2.m42497h().getRequestId())) {
                                                    arrayList2.add(c14202a2);
                                                }
                                            }
                                        }
                                        if (arrayList2.size() >= i2) {
                                            z5 = true;
                                        }
                                    }
                                } catch (Exception e) {
                                    exc = e;
                                    z5 = z4;
                                }
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (C14202a c14202a3 : listM42603a) {
                                    for (CampaignEx campaignEx4 : list) {
                                        if (c14202a3 != null && c14202a3.m42497h() != null && campaignEx4 != null && campaignEx4.getId().equals(c14202a3.m42497h().getId()) && campaignEx4.getRequestId().equals(c14202a3.m42497h().getRequestId())) {
                                            arrayList3.add(c14202a3);
                                        }
                                    }
                                }
                                if (arrayList3.size() > 0) {
                                    z5 = true;
                                }
                            }
                        }
                        if (z5) {
                            if (this.f41024c == null) {
                                this.f41024c = new ConcurrentHashMap<>();
                            }
                            if (this.f41026e == null) {
                                this.f41026e = new ConcurrentHashMap<>();
                            }
                            if (this.f41025d == null) {
                                this.f41025d = new ConcurrentHashMap<>();
                            }
                            if (listM42603a != null && listM42603a.size() > 0) {
                                CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                                CopyOnWriteArrayList<C14202a> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                                for (C14202a c14202a4 : listM42603a) {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    CampaignEx campaignExM42497h = c14202a4.m42497h();
                                    concurrentHashMap.put(campaignExM42497h.getId() + campaignExM42497h.getVideoUrlEncode() + campaignExM42497h.getBidToken(), c14202a4);
                                    copyOnWriteArrayList.add(concurrentHashMap);
                                    copyOnWriteArrayList2.add(campaignExM42497h);
                                    copyOnWriteArrayList3.add(c14202a4);
                                }
                                m42514a(str, copyOnWriteArrayList, copyOnWriteArrayList2, copyOnWriteArrayList3);
                            }
                        }
                    }
                    return z5;
                }
            } catch (Exception e2) {
                exc = e2;
            }
            if (MBridgeConstans.DEBUG) {
                exc.printStackTrace();
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: b */
    public int m42523b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayListM42611c;
        C14202a value;
        CampaignEx campaignExM42497h;
        ConcurrentHashMap<String, C14213l> concurrentHashMap = this.f41023b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C14213l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                C14213l value2 = it.next().getValue();
                if (value2 != null && (copyOnWriteArrayListM42611c = value2.m42611c()) != null) {
                    int size = copyOnWriteArrayListM42611c.size();
                    for (int i = 0; i < size; i++) {
                        Map<String, C14202a> map = copyOnWriteArrayListM42611c.get(i);
                        if (map != null) {
                            Iterator<Map.Entry<String, C14202a>> it2 = map.entrySet().iterator();
                            if (it2.hasNext() && (value = it2.next().getValue()) != null && (campaignExM42497h = value.m42497h()) != null) {
                                String videoUrlEncode = campaignExM42497h.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return value.m42504o();
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<CampaignEx> m42524b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> concurrentHashMap = this.f41025d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f41025d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public void m42525b(boolean z) {
        this.f41022a = z;
        ConcurrentHashMap<String, C14213l> concurrentHashMap = this.f41023b;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, C14213l>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                C14213l value = it.next().getValue();
                if (value != null) {
                    value.m42613e();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m42526b(int i, String str, boolean z) {
        try {
            C14213l c14213lM42527c = m42527c(str);
            return (c14213lM42527c == null || c14213lM42527c.m42607b(i, z) == null) ? false : true;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public C14213l m42527c(String str) {
        ConcurrentHashMap<String, C14213l> concurrentHashMap = this.f41023b;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f41023b.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m42528c(String str, String str2) {
        C14213l c14213lM42527c = m42527c(str);
        if (c14213lM42527c != null) {
            try {
                c14213lM42527c.m42609b(str2);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("DownLoadManager", e.getMessage());
                }
            }
        }
    }

    public C14213l createUnitCache(Context context, String str, CampaignEx campaignEx, int i, InterfaceC14217a interfaceC14217a) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (!this.f41023b.containsKey(str)) {
            C14213l c14213l = new C14213l(context, campaignEx, str, i);
            if (i == 94 || i == 287) {
                c14213l.m42605a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), interfaceC14217a);
            } else {
                c14213l.m42604a(interfaceC14217a);
            }
            this.f41023b.put(str, c14213l);
            return c14213l;
        }
        C14213l c14213l2 = this.f41023b.get(str);
        if (c14213l2 == null) {
            c14213l2 = new C14213l(context, campaignEx, str, i);
            this.f41023b.put(str, c14213l2);
        }
        if (i == 94 || i == 287) {
            c14213l2.m42605a(campaignEx.getRequestId() + "_" + campaignEx.getSecondRequestIndex(), interfaceC14217a);
        } else {
            c14213l2.m42604a(interfaceC14217a);
        }
        c14213l2.m42614f(campaignEx);
        return c14213l2;
    }

    public C14213l createUnitCache(Context context, String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, int i, InterfaceC14217a interfaceC14217a) {
        if (TextUtils.isEmpty(str) || copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return null;
        }
        if (!this.f41023b.containsKey(str)) {
            C14213l c14213l = new C14213l(context, copyOnWriteArrayList, str, i);
            if (i == 94 || i == 287) {
                c14213l.m42605a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), interfaceC14217a);
            } else {
                c14213l.m42604a(interfaceC14217a);
            }
            this.f41023b.put(str, c14213l);
            return c14213l;
        }
        C14213l c14213l2 = this.f41023b.get(str);
        if (c14213l2 == null) {
            c14213l2 = new C14213l(context, copyOnWriteArrayList, str, i);
            this.f41023b.put(str, c14213l2);
        }
        if (i == 94 || i == 287) {
            c14213l2.m42605a(copyOnWriteArrayList.get(0).getRequestId() + "_" + copyOnWriteArrayList.get(0).getSecondRequestIndex(), interfaceC14217a);
        } else {
            c14213l2.m42604a(interfaceC14217a);
        }
        c14213l2.m42610b(copyOnWriteArrayList);
        return c14213l2;
    }

    public void load(String str) {
        C14213l c14213lM42527c = m42527c(str);
        if (c14213lM42527c != null) {
            c14213lM42527c.m42612d();
        }
    }
}
