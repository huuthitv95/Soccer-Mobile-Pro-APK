package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a */
/* JADX INFO: compiled from: TemplateWebviewCache.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14200a {

    /* JADX INFO: renamed from: a */
    private static ConcurrentHashMap<String, a> f40955a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private static ConcurrentHashMap<String, a> f40956b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    private static ConcurrentHashMap<String, a> f40957c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    private static ConcurrentHashMap<String, a> f40958d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    private static ConcurrentHashMap<String, a> f40959e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    private static ConcurrentHashMap<String, a> f40960f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    private static ConcurrentHashMap<String, a> f40961g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private static ConcurrentHashMap<String, a> f40962h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i */
    private static ConcurrentHashMap<String, a> f40963i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    private static ConcurrentHashMap<String, a> f40964j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a */
    /* JADX INFO: compiled from: TemplateWebviewCache.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        private WindVaneWebView f40965a;

        /* JADX INFO: renamed from: b */
        private boolean f40966b;

        /* JADX INFO: renamed from: a */
        public String m42405a() {
            WindVaneWebView windVaneWebView = this.f40965a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        /* JADX INFO: renamed from: a */
        public void m42406a(WindVaneWebView windVaneWebView) {
            this.f40965a = windVaneWebView;
        }

        /* JADX INFO: renamed from: a */
        public void m42407a(String str) {
            WindVaneWebView windVaneWebView = this.f40965a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m42408a(boolean z) {
            this.f40966b = z;
        }

        /* JADX INFO: renamed from: b */
        public WindVaneWebView m42409b() {
            return this.f40965a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m42410c() {
            return this.f40966b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m42394a(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i != 94) {
                if (i != 287) {
                    if (i != 288) {
                        ConcurrentHashMap<String, a> concurrentHashMap = f40955a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f40955a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, a> concurrentHashMap2 = f40958d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f40958d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, a> concurrentHashMap3 = f40957c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f40957c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, a> concurrentHashMap4 = f40960f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f40960f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, a> concurrentHashMap5 = f40956b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f40956b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, a> concurrentHashMap6 = f40959e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f40959e.get(requestIdNotice);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m42395a() {
        f40963i.clear();
        f40964j.clear();
    }

    /* JADX INFO: renamed from: a */
    public static void m42396a(int i, String str, a aVar) {
        try {
            if (i == 94) {
                if (f40956b == null) {
                    f40956b = new ConcurrentHashMap<>();
                }
                f40956b.put(str, aVar);
            } else {
                if (i != 287) {
                    return;
                }
                if (f40957c == null) {
                    f40957c = new ConcurrentHashMap<>();
                }
                f40957c.put(str, aVar);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42397a(String str) {
        if (TextUtils.isEmpty(str)) {
            f40961g.clear();
        } else {
            for (String str2 : f40961g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f40961g.remove(str2);
                }
            }
        }
        f40962h.clear();
    }

    /* JADX INFO: renamed from: a */
    public static void m42398a(String str, a aVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                f40962h.put(str, aVar);
                return;
            } else {
                f40961g.put(str, aVar);
                return;
            }
        }
        if (z2) {
            f40964j.put(str, aVar);
        } else {
            f40963i.put(str, aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m42399b(String str) {
        if (f40961g.containsKey(str)) {
            return f40961g.get(str);
        }
        if (f40962h.containsKey(str)) {
            return f40962h.get(str);
        }
        if (f40963i.containsKey(str)) {
            return f40963i.get(str);
        }
        if (f40964j.containsKey(str)) {
            return f40964j.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m42400b(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, a> concurrentHashMap = f40956b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, a> concurrentHashMap2 = f40959e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i != 287) {
                if (i != 288) {
                    ConcurrentHashMap<String, a> concurrentHashMap3 = f40955a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, a> concurrentHashMap4 = f40958d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, a> concurrentHashMap5 = f40957c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, a> concurrentHashMap6 = f40960f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m42401b(int i, String str, a aVar) {
        try {
            if (i == 94) {
                if (f40959e == null) {
                    f40959e = new ConcurrentHashMap<>();
                }
                f40959e.put(str, aVar);
            } else if (i == 287) {
                if (f40960f == null) {
                    f40960f = new ConcurrentHashMap<>();
                }
                f40960f.put(str, aVar);
            } else if (i != 288) {
                if (f40955a == null) {
                    f40955a = new ConcurrentHashMap<>();
                }
                f40955a.put(str, aVar);
            } else {
                if (f40958d == null) {
                    f40958d = new ConcurrentHashMap<>();
                }
                f40958d.put(str, aVar);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m42402c(String str) {
        for (Map.Entry<String, a> entry : f40961g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f40961g.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m42403d(String str) {
        for (Map.Entry<String, a> entry : f40962h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f40962h.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m42404e(String str) {
        if (f40961g.containsKey(str)) {
            f40961g.remove(str);
        }
        if (f40963i.containsKey(str)) {
            f40963i.remove(str);
        }
        if (f40962h.containsKey(str)) {
            f40962h.remove(str);
        }
        if (f40964j.containsKey(str)) {
            f40964j.remove(str);
        }
    }
}
