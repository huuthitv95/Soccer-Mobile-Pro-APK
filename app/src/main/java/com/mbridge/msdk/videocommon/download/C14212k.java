package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.k */
/* JADX INFO: compiled from: UnitCacheControllerRefactor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C14212k {

    /* JADX INFO: renamed from: a */
    private InterfaceC14217a f41042a;

    /* JADX INFO: renamed from: b */
    private ConcurrentHashMap<String, InterfaceC14217a> f41043b;

    /* JADX INFO: renamed from: c */
    private final Context f41044c;

    /* JADX INFO: renamed from: d */
    private final String f41045d;

    /* JADX INFO: renamed from: e */
    private C14223c f41046e;

    /* JADX INFO: renamed from: f */
    private final int f41047f;

    /* JADX INFO: renamed from: g */
    private final CopyOnWriteArrayList<CampaignEx> f41048g;

    /* JADX INFO: renamed from: h */
    private final ConcurrentHashMap<String, C14202a> f41049h;

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.download.k$a */
    /* JADX INFO: compiled from: UnitCacheControllerRefactor.java */
    private static final class a implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        private final String f41050a;

        /* JADX INFO: renamed from: b */
        private final ConcurrentHashMap<String, InterfaceC14217a> f41051b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC14217a f41052c;

        public a(String str, ConcurrentHashMap<String, InterfaceC14217a> concurrentHashMap, InterfaceC14217a interfaceC14217a) {
            this.f41050a = str;
            this.f41051b = concurrentHashMap;
            this.f41052c = interfaceC14217a;
        }

        /* JADX INFO: renamed from: b */
        private void m42582b(String str) {
            InterfaceC14217a interfaceC14217a = this.f41052c;
            if (interfaceC14217a != null) {
                try {
                    interfaceC14217a.mo34468a(str);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoRefactorManager", this.f41050a + " videoDownloadListener onDownLoadDone error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC14217a> concurrentHashMap = this.f41051b;
            if (concurrentHashMap != null) {
                Iterator<InterfaceC14217a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().mo34468a(str);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoRefactorManager", this.f41050a + " videoDownloadListener onDownLoadDone error: " + e2.getMessage());
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private void m42583b(String str, String str2) {
            InterfaceC14217a interfaceC14217a = this.f41052c;
            if (interfaceC14217a != null) {
                try {
                    interfaceC14217a.mo34469a(str, str2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardVideoRefactorManager", this.f41050a + " videoDownloadListener onDownLoadFailed error: " + e.getMessage());
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC14217a> concurrentHashMap = this.f41051b;
            if (concurrentHashMap != null) {
                Iterator<InterfaceC14217a> it = concurrentHashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().mo34469a(str, str2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardVideoRefactorManager", this.f41050a + " videoDownloadListener onDownLoadFailed error: " + e2.getMessage());
                        }
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            m42582b(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
            m42583b(str, str2);
        }
    }

    public C14212k(CampaignEx campaignEx, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f41048g = copyOnWriteArrayList;
        this.f41049h = new ConcurrentHashMap<>();
        this.f41044c = C13008c.m36588n().m36542d();
        this.f41045d = str;
        this.f41047f = i;
        if (campaignEx != null) {
            copyOnWriteArrayList.add(campaignEx);
        }
    }

    public C14212k(List<CampaignEx> list, String str, int i) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f41048g = copyOnWriteArrayList;
        this.f41049h = new ConcurrentHashMap<>();
        this.f41044c = C13008c.m36588n().m36542d();
        this.f41045d = str;
        this.f41047f = i;
        if (list != null) {
            copyOnWriteArrayList.addAll(list);
        }
    }

    /* JADX INFO: renamed from: a */
    private C14202a m42546a(CampaignEx campaignEx) {
        C14202a c14202a = null;
        try {
            C14202a c14202a2 = new C14202a(this.f41044c, campaignEx, m42577h(), m42563f());
            try {
                c14202a2.m42493e(campaignEx);
                c14202a2.m42476a(m42573b());
                c14202a2.m42490d(m42560c(campaignEx));
                c14202a2.m42483b(m42559c());
                c14202a2.m42492e(m42561d(campaignEx));
                c14202a2.m42479a((InterfaceC14204c) null);
                c14202a2.m42480a(new a(m42577h(), this.f41043b, this.f41042a));
                return c14202a2;
            } catch (Exception e) {
                e = e;
                c14202a = c14202a2;
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " createAndStartCampaignDownloadTask error " + e.getMessage());
                }
                return c14202a;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    private C14202a m42547a(CampaignEx campaignEx, String str, C14202a c14202a) {
        if (c14202a != null) {
            return c14202a;
        }
        C14202a c14202aM42546a = m42546a(campaignEx);
        c14202aM42546a.m42475C();
        this.f41049h.put(str, c14202aM42546a);
        return c14202aM42546a;
    }

    /* JADX INFO: renamed from: a */
    private String m42548a(int i) {
        if (i == 0) {
            return "DOWNLOAD_READY";
        }
        if (i == 1) {
            return "DOWNLOAD_RUN";
        }
        if (i == 2) {
            return "DOWNLOAD_PAUSE";
        }
        if (i != 4) {
            return i != 5 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "DOWNLOAD_DONE";
        }
        return "DOWNLOAD_STOP";
    }

    /* JADX INFO: renamed from: a */
    private void m42549a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " load campaignExes is null");
            return;
        }
        for (CampaignEx campaignEx : copyOnWriteArrayList) {
            if (campaignEx != null) {
                m42564f(campaignEx);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m42550a(boolean z, List<C14202a> list, int i, CampaignEx campaignEx) {
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            m42551a(z, list, campaignEx, m42547a(campaignEx, str, this.f41049h.get(str)), i);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " isReady error", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[Catch: Exception -> 0x0074, TryCatch #4 {Exception -> 0x0074, blocks: (B:29:0x0050, B:30:0x0053, B:32:0x0059), top: B:81:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0059 A[Catch: Exception -> 0x0074, TRY_LEAVE, TryCatch #4 {Exception -> 0x0074, blocks: (B:29:0x0050, B:30:0x0053, B:32:0x0059), top: B:81:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x008b, please report this as an issue */
    /* JADX INFO: renamed from: a */
    private void m42551a(boolean z, List<C14202a> list, CampaignEx campaignEx, C14202a c14202a, int i) {
        C14202a c14202a2;
        Exception exc;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ArrayList<Integer> rsIgnoreCheckRule;
        if (list == null || campaignEx == null || c14202a == null) {
            return;
        }
        try {
            int loadTimeoutState = campaignEx.getLoadTimeoutState();
            try {
                if (!c14202a.m42510w()) {
                    c14202a2 = c14202a;
                    try {
                        if (!m42552a(campaignEx, c14202a2, m42560c(campaignEx), z, m42563f())) {
                            z5 = false;
                        }
                        c14202a2.m42494e(z5);
                        if (!c14202a2.m42508u() || m42555a(m42557b(campaignEx), campaignEx, c14202a2)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (loadTimeoutState == 0 || !z3) {
                            if (!c14202a2.m42511x() || m42558b(campaignEx, m42562e(campaignEx), c14202a2)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (loadTimeoutState == 0 && z4) {
                                try {
                                    c14202a2.m42495f(true);
                                } catch (Exception e) {
                                    z2 = z5;
                                    exc = e;
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " checkResourceReadyState error", exc);
                                    }
                                    z5 = z2;
                                }
                            }
                        } else {
                            try {
                                c14202a2.m42489c(true);
                                if (c14202a2.m42511x()) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (loadTimeoutState == 0) {
                                    c14202a2.m42495f(true);
                                }
                            } catch (Exception e2) {
                                z2 = z5;
                                exc = e2;
                                z4 = false;
                                if (MBridgeConstans.DEBUG) {
                                    C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " checkResourceReadyState error", exc);
                                }
                                z5 = z2;
                                if (c14202a2.m42506s()) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                c14202a2.m42482a(z6);
                                if (z6) {
                                    list.add(c14202a2);
                                }
                                if (MBridgeConstans.DEBUG) {
                                    rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                                    if (rsIgnoreCheckRule == null) {
                                        rsIgnoreCheckRule = new ArrayList<>();
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(m42577h());
                                    sb.append("  campaign name = ");
                                    sb.append(campaignEx.getAppName());
                                    sb.append("\n\t\tcampaign id = ");
                                    sb.append(campaignEx.getId());
                                    sb.append("\n\t\trequest id = ");
                                    sb.append(campaignEx.getRequestId());
                                    sb.append("\n\t\tadType = ");
                                    sb.append(m42573b());
                                    sb.append("\n\t\tunitID = ");
                                    sb.append(m42577h());
                                    sb.append("\n\t\tisReady = ");
                                    sb.append(z6);
                                    sb.append("\n\t\tisDynamicView = ");
                                    sb.append(campaignEx.isDynamicView());
                                    sb.append("\n\t\tisTPL = ");
                                    sb.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                                    sb.append("\n\t\tcurrentSuccessSize = ");
                                    sb.append(list.size());
                                    sb.append("\n\t\tisReadyCheckSize = ");
                                    sb.append(i);
                                    sb.append("\n\t\ttotalCampaignSize = ");
                                    sb.append(this.f41048g.size());
                                    sb.append("\n\t\tlinkType = ");
                                    sb.append(campaignEx.getLinkType());
                                    sb.append("\n\t\tloadTimeoutState = ");
                                    sb.append(campaignEx.getLoadTimeoutState());
                                    sb.append("\n\t\tisVideoReady = ");
                                    sb.append(z5);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(0));
                                    sb.append("\n\t\t\treadyRate == ");
                                    sb.append(m42560c(campaignEx));
                                    sb.append("\n\t\t\tCDRate = ");
                                    sb.append(m42559c());
                                    sb.append("\n\t\t\tdlnet = ");
                                    sb.append(m42563f());
                                    sb.append("\n\t\t\tctn = ");
                                    sb.append(m42561d(campaignEx));
                                    sb.append("\n\t\t\tdownloadState = ");
                                    sb.append(m42548a(c14202a2.m42504o()));
                                    sb.append("\n\t\tisTemplateReady = ");
                                    sb.append(z4);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(1));
                                    sb.append("\n\t\tisEndCardReady = ");
                                    sb.append(z3);
                                    sb.append("\n\t\t\tisIgnore = ");
                                    sb.append(rsIgnoreCheckRule.contains(2));
                                    sb.append("\n\t\t\tisOnlyPlayable = ");
                                    sb.append(m42566g(campaignEx));
                                    sb.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                                    sb.append(C13229v0.m37945l(campaignEx.getendcard_url()));
                                    C13219q0.m37816b("RewardVideoRefactorManager", sb.toString());
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        z2 = false;
                        z3 = false;
                        z4 = z3;
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " checkResourceReadyState error", exc);
                        }
                        z5 = z2;
                        if (c14202a2.m42506s()) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        c14202a2.m42482a(z6);
                        if (z6) {
                            list.add(c14202a2);
                        }
                        if (MBridgeConstans.DEBUG) {
                            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                            if (rsIgnoreCheckRule == null) {
                                rsIgnoreCheckRule = new ArrayList<>();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m42577h());
                            sb2.append("  campaign name = ");
                            sb2.append(campaignEx.getAppName());
                            sb2.append("\n\t\tcampaign id = ");
                            sb2.append(campaignEx.getId());
                            sb2.append("\n\t\trequest id = ");
                            sb2.append(campaignEx.getRequestId());
                            sb2.append("\n\t\tadType = ");
                            sb2.append(m42573b());
                            sb2.append("\n\t\tunitID = ");
                            sb2.append(m42577h());
                            sb2.append("\n\t\tisReady = ");
                            sb2.append(z6);
                            sb2.append("\n\t\tisDynamicView = ");
                            sb2.append(campaignEx.isDynamicView());
                            sb2.append("\n\t\tisTPL = ");
                            sb2.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                            sb2.append("\n\t\tcurrentSuccessSize = ");
                            sb2.append(list.size());
                            sb2.append("\n\t\tisReadyCheckSize = ");
                            sb2.append(i);
                            sb2.append("\n\t\ttotalCampaignSize = ");
                            sb2.append(this.f41048g.size());
                            sb2.append("\n\t\tlinkType = ");
                            sb2.append(campaignEx.getLinkType());
                            sb2.append("\n\t\tloadTimeoutState = ");
                            sb2.append(campaignEx.getLoadTimeoutState());
                            sb2.append("\n\t\tisVideoReady = ");
                            sb2.append(z5);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(0));
                            sb2.append("\n\t\t\treadyRate == ");
                            sb2.append(m42560c(campaignEx));
                            sb2.append("\n\t\t\tCDRate = ");
                            sb2.append(m42559c());
                            sb2.append("\n\t\t\tdlnet = ");
                            sb2.append(m42563f());
                            sb2.append("\n\t\t\tctn = ");
                            sb2.append(m42561d(campaignEx));
                            sb2.append("\n\t\t\tdownloadState = ");
                            sb2.append(m42548a(c14202a2.m42504o()));
                            sb2.append("\n\t\tisTemplateReady = ");
                            sb2.append(z4);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(1));
                            sb2.append("\n\t\tisEndCardReady = ");
                            sb2.append(z3);
                            sb2.append("\n\t\t\tisIgnore = ");
                            sb2.append(rsIgnoreCheckRule.contains(2));
                            sb2.append("\n\t\t\tisOnlyPlayable = ");
                            sb2.append(m42566g(campaignEx));
                            sb2.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                            sb2.append(C13229v0.m37945l(campaignEx.getendcard_url()));
                            C13219q0.m37816b("RewardVideoRefactorManager", sb2.toString());
                        }
                    }
                    if (c14202a2.m42506s() || (z5 && z3 && z4)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c14202a2.m42482a(z6);
                    if (z6) {
                        list.add(c14202a2);
                    }
                    if (MBridgeConstans.DEBUG) {
                        rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                        if (rsIgnoreCheckRule == null) {
                            rsIgnoreCheckRule = new ArrayList<>();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m42577h());
                        sb3.append("  campaign name = ");
                        sb3.append(campaignEx.getAppName());
                        sb3.append("\n\t\tcampaign id = ");
                        sb3.append(campaignEx.getId());
                        sb3.append("\n\t\trequest id = ");
                        sb3.append(campaignEx.getRequestId());
                        sb3.append("\n\t\tadType = ");
                        sb3.append(m42573b());
                        sb3.append("\n\t\tunitID = ");
                        sb3.append(m42577h());
                        sb3.append("\n\t\tisReady = ");
                        sb3.append(z6);
                        sb3.append("\n\t\tisDynamicView = ");
                        sb3.append(campaignEx.isDynamicView());
                        sb3.append("\n\t\tisTPL = ");
                        sb3.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                        sb3.append("\n\t\tcurrentSuccessSize = ");
                        sb3.append(list.size());
                        sb3.append("\n\t\tisReadyCheckSize = ");
                        sb3.append(i);
                        sb3.append("\n\t\ttotalCampaignSize = ");
                        sb3.append(this.f41048g.size());
                        sb3.append("\n\t\tlinkType = ");
                        sb3.append(campaignEx.getLinkType());
                        sb3.append("\n\t\tloadTimeoutState = ");
                        sb3.append(campaignEx.getLoadTimeoutState());
                        sb3.append("\n\t\tisVideoReady = ");
                        sb3.append(z5);
                        sb3.append("\n\t\t\tisIgnore = ");
                        sb3.append(rsIgnoreCheckRule.contains(0));
                        sb3.append("\n\t\t\treadyRate == ");
                        sb3.append(m42560c(campaignEx));
                        sb3.append("\n\t\t\tCDRate = ");
                        sb3.append(m42559c());
                        sb3.append("\n\t\t\tdlnet = ");
                        sb3.append(m42563f());
                        sb3.append("\n\t\t\tctn = ");
                        sb3.append(m42561d(campaignEx));
                        sb3.append("\n\t\t\tdownloadState = ");
                        sb3.append(m42548a(c14202a2.m42504o()));
                        sb3.append("\n\t\tisTemplateReady = ");
                        sb3.append(z4);
                        sb3.append("\n\t\t\tisIgnore = ");
                        sb3.append(rsIgnoreCheckRule.contains(1));
                        sb3.append("\n\t\tisEndCardReady = ");
                        sb3.append(z3);
                        sb3.append("\n\t\t\tisIgnore = ");
                        sb3.append(rsIgnoreCheckRule.contains(2));
                        sb3.append("\n\t\t\tisOnlyPlayable = ");
                        sb3.append(m42566g(campaignEx));
                        sb3.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                        sb3.append(C13229v0.m37945l(campaignEx.getendcard_url()));
                        C13219q0.m37816b("RewardVideoRefactorManager", sb3.toString());
                    }
                }
                c14202a2 = c14202a;
                c14202a2.m42494e(z5);
                if (c14202a2.m42508u()) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (loadTimeoutState == 0) {
                    if (c14202a2.m42511x()) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (loadTimeoutState == 0) {
                        c14202a2.m42495f(true);
                    }
                } else {
                    if (c14202a2.m42511x()) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    if (loadTimeoutState == 0) {
                        c14202a2.m42495f(true);
                    }
                }
            } catch (Exception e4) {
                z2 = z5;
                exc = e4;
                z3 = false;
                z4 = z3;
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " checkResourceReadyState error", exc);
                }
                z5 = z2;
                if (c14202a2.m42506s()) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                c14202a2.m42482a(z6);
                if (z6) {
                    list.add(c14202a2);
                }
                if (MBridgeConstans.DEBUG) {
                    rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule == null) {
                        rsIgnoreCheckRule = new ArrayList<>();
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(m42577h());
                    sb4.append("  campaign name = ");
                    sb4.append(campaignEx.getAppName());
                    sb4.append("\n\t\tcampaign id = ");
                    sb4.append(campaignEx.getId());
                    sb4.append("\n\t\trequest id = ");
                    sb4.append(campaignEx.getRequestId());
                    sb4.append("\n\t\tadType = ");
                    sb4.append(m42573b());
                    sb4.append("\n\t\tunitID = ");
                    sb4.append(m42577h());
                    sb4.append("\n\t\tisReady = ");
                    sb4.append(z6);
                    sb4.append("\n\t\tisDynamicView = ");
                    sb4.append(campaignEx.isDynamicView());
                    sb4.append("\n\t\tisTPL = ");
                    sb4.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
                    sb4.append("\n\t\tcurrentSuccessSize = ");
                    sb4.append(list.size());
                    sb4.append("\n\t\tisReadyCheckSize = ");
                    sb4.append(i);
                    sb4.append("\n\t\ttotalCampaignSize = ");
                    sb4.append(this.f41048g.size());
                    sb4.append("\n\t\tlinkType = ");
                    sb4.append(campaignEx.getLinkType());
                    sb4.append("\n\t\tloadTimeoutState = ");
                    sb4.append(campaignEx.getLoadTimeoutState());
                    sb4.append("\n\t\tisVideoReady = ");
                    sb4.append(z5);
                    sb4.append("\n\t\t\tisIgnore = ");
                    sb4.append(rsIgnoreCheckRule.contains(0));
                    sb4.append("\n\t\t\treadyRate == ");
                    sb4.append(m42560c(campaignEx));
                    sb4.append("\n\t\t\tCDRate = ");
                    sb4.append(m42559c());
                    sb4.append("\n\t\t\tdlnet = ");
                    sb4.append(m42563f());
                    sb4.append("\n\t\t\tctn = ");
                    sb4.append(m42561d(campaignEx));
                    sb4.append("\n\t\t\tdownloadState = ");
                    sb4.append(m42548a(c14202a2.m42504o()));
                    sb4.append("\n\t\tisTemplateReady = ");
                    sb4.append(z4);
                    sb4.append("\n\t\t\tisIgnore = ");
                    sb4.append(rsIgnoreCheckRule.contains(1));
                    sb4.append("\n\t\tisEndCardReady = ");
                    sb4.append(z3);
                    sb4.append("\n\t\t\tisIgnore = ");
                    sb4.append(rsIgnoreCheckRule.contains(2));
                    sb4.append("\n\t\t\tisOnlyPlayable = ");
                    sb4.append(m42566g(campaignEx));
                    sb4.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
                    sb4.append(C13229v0.m37945l(campaignEx.getendcard_url()));
                    C13219q0.m37816b("RewardVideoRefactorManager", sb4.toString());
                }
            }
            z5 = true;
        } catch (Exception e5) {
            e = e5;
            c14202a2 = c14202a;
        }
        if (c14202a2.m42506s()) {
            z6 = true;
        } else {
            z6 = true;
        }
        c14202a2.m42482a(z6);
        if (z6) {
            list.add(c14202a2);
        }
        if (MBridgeConstans.DEBUG) {
            rsIgnoreCheckRule = campaignEx.getRsIgnoreCheckRule();
            if (rsIgnoreCheckRule == null) {
                rsIgnoreCheckRule = new ArrayList<>();
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m42577h());
            sb5.append("  campaign name = ");
            sb5.append(campaignEx.getAppName());
            sb5.append("\n\t\tcampaign id = ");
            sb5.append(campaignEx.getId());
            sb5.append("\n\t\trequest id = ");
            sb5.append(campaignEx.getRequestId());
            sb5.append("\n\t\tadType = ");
            sb5.append(m42573b());
            sb5.append("\n\t\tunitID = ");
            sb5.append(m42577h());
            sb5.append("\n\t\tisReady = ");
            sb5.append(z6);
            sb5.append("\n\t\tisDynamicView = ");
            sb5.append(campaignEx.isDynamicView());
            sb5.append("\n\t\tisTPL = ");
            sb5.append(!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()));
            sb5.append("\n\t\tcurrentSuccessSize = ");
            sb5.append(list.size());
            sb5.append("\n\t\tisReadyCheckSize = ");
            sb5.append(i);
            sb5.append("\n\t\ttotalCampaignSize = ");
            sb5.append(this.f41048g.size());
            sb5.append("\n\t\tlinkType = ");
            sb5.append(campaignEx.getLinkType());
            sb5.append("\n\t\tloadTimeoutState = ");
            sb5.append(campaignEx.getLoadTimeoutState());
            sb5.append("\n\t\tisVideoReady = ");
            sb5.append(z5);
            sb5.append("\n\t\t\tisIgnore = ");
            sb5.append(rsIgnoreCheckRule.contains(0));
            sb5.append("\n\t\t\treadyRate == ");
            sb5.append(m42560c(campaignEx));
            sb5.append("\n\t\t\tCDRate = ");
            sb5.append(m42559c());
            sb5.append("\n\t\t\tdlnet = ");
            sb5.append(m42563f());
            sb5.append("\n\t\t\tctn = ");
            sb5.append(m42561d(campaignEx));
            sb5.append("\n\t\t\tdownloadState = ");
            sb5.append(m42548a(c14202a2.m42504o()));
            sb5.append("\n\t\tisTemplateReady = ");
            sb5.append(z4);
            sb5.append("\n\t\t\tisIgnore = ");
            sb5.append(rsIgnoreCheckRule.contains(1));
            sb5.append("\n\t\tisEndCardReady = ");
            sb5.append(z3);
            sb5.append("\n\t\t\tisIgnore = ");
            sb5.append(rsIgnoreCheckRule.contains(2));
            sb5.append("\n\t\t\tisOnlyPlayable = ");
            sb5.append(m42566g(campaignEx));
            sb5.append("\n\t\t\tisPlayableEndCard(dynamicView) = ");
            sb5.append(C13229v0.m37945l(campaignEx.getendcard_url()));
            C13219q0.m37816b("RewardVideoRefactorManager", sb5.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m42552a(CampaignEx campaignEx, C14202a c14202a, int i, boolean z, int i2) {
        if (c14202a == null || campaignEx == null) {
            return false;
        }
        if (c14202a.m42510w() || m42566g(campaignEx) || TextUtils.isEmpty(c14202a.m42498i()) || i2 == 3) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
            return true;
        }
        if (campaignEx.getIsTimeoutCheckVideoStatus() == 1 && campaignEx.getVideoCheckType() == 1) {
            return true;
        }
        long jM42502m = c14202a.m42502m();
        long jM42499j = c14202a.m42499j();
        if (z && campaignEx.getVideoCheckType() == 1) {
            if (i == 0) {
                return true;
            }
            if ((jM42499j != 0 || jM42502m != 0) && jM42502m >= ((long) (i / 100)) * jM42499j) {
                campaignEx.setIsTimeoutCheckVideoStatus(1);
                return true;
            }
        }
        return m42553a(c14202a, i);
    }

    /* JADX INFO: renamed from: a */
    private boolean m42553a(C14202a c14202a, int i) {
        if (c14202a == null || TextUtils.isEmpty(c14202a.m42498i())) {
            return true;
        }
        if (i == 0) {
            return (c14202a.m42497h() == null || TextUtils.isEmpty(c14202a.m42497h().getVideoUrlEncode())) ? false : true;
        }
        return Utils.getDownloadRate(c14202a.m42499j(), c14202a.m42502m()) >= i;
    }

    /* JADX INFO: renamed from: a */
    private boolean m42554a(String str, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !m42566g(campaignEx)) {
            return true;
        }
        if ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) && !C13182a1.m37597b(C14208g.m42537a(str))) {
            return C13182a1.m37597b(C14208g.m42538b(str));
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m42555a(String str, CampaignEx campaignEx, C14202a c14202a) {
        if (campaignEx != null && c14202a != null) {
            try {
                if (c14202a.m42508u()) {
                    C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " checkEndCardZipOrSourceDownLoad endCard download success");
                    return true;
                }
                if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                    return true;
                }
                if ((campaignEx.isDynamicView() && !C13229v0.m37945l(str)) || C13182a1.m37596a(str) || m42554a(str, campaignEx)) {
                    return true;
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " checkEndCardDownload error " + th.getMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private C14223c m42556b(String str) {
        try {
            if (this.f41046e == null) {
                this.f41046e = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), str, m42573b() == 287);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " getRewardUnitSetting error " + e.getMessage());
            }
        }
        return this.f41046e;
    }

    /* JADX INFO: renamed from: b */
    private String m42557b(CampaignEx campaignEx) {
        return campaignEx == null ? "" : campaignEx.getendcard_url();
    }

    /* JADX INFO: renamed from: b */
    private boolean m42558b(CampaignEx campaignEx, String str, C14202a c14202a) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if ((c14202a == null || !c14202a.m42511x()) && !campaignEx.isDynamicView()) {
            return ((campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) && campaignEx.getLoadTimeoutState() == 0 && C14208g.m42537a(str) == null) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private int m42559c() {
        C14223c c14223cM42556b = m42556b(m42577h());
        if (c14223cM42556b == null) {
            return 0;
        }
        try {
            return c14223cM42556b.m42722g();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0;
            }
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " getCDRate error " + e.getMessage());
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    private int m42560c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        return campaignEx.getReady_rate() != -1 ? campaignEx.getReady_rate() : m42565g();
    }

    /* JADX INFO: renamed from: d */
    private int m42561d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 1;
        }
        try {
            return campaignEx.getVideoCtnType();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 1;
            }
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " getVideoCtnType error " + e.getMessage());
            return 1;
        }
    }

    /* JADX INFO: renamed from: e */
    private String m42562e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return "";
        }
        try {
            CampaignEx.C13066c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null) {
                return rewardTemplateMode.m36781j();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " getVideoTemplateUrl error", e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: f */
    private int m42563f() {
        if (TextUtils.isEmpty(m42577h())) {
            return 1;
        }
        try {
            C14223c c14223cM42556b = m42556b(m42577h());
            if (c14223cM42556b != null) {
                return c14223cM42556b.m42736l();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " getDlnet error " + e.getMessage());
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: f */
    private void m42564f(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String str = campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
            if (this.f41049h.containsKey(str)) {
                return;
            }
            m42547a(campaignEx, str, (C14202a) null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " handlerCampaignLoadEvent error", e);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private int m42565g() {
        try {
            return m42556b(this.f41045d).m42758w();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " getRewardReadyRate error:" + th.getMessage());
            return 100;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m42566g(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " isPlayerAbleAds error:" + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public C14202a m42567a(String str) {
        if (!TextUtils.isEmpty(str) && this.f41049h.containsKey(str)) {
            return this.f41049h.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public List<C14202a> m42568a(List<CampaignEx> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.size() == 0) {
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " isReady campaignExes is null");
            return arrayList;
        }
        int size = list.size();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                m42550a(z, arrayList, size, campaignEx);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m42569a() {
    }

    /* JADX INFO: renamed from: a */
    public void m42570a(InterfaceC14217a interfaceC14217a) {
        this.f41042a = interfaceC14217a;
    }

    /* JADX INFO: renamed from: a */
    public void m42571a(String str, InterfaceC14217a interfaceC14217a) {
        if (this.f41043b == null) {
            this.f41043b = new ConcurrentHashMap<>();
        }
        if (interfaceC14217a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f41043b.put(str, interfaceC14217a);
    }

    /* JADX INFO: renamed from: a */
    public void m42572a(List<CampaignEx> list) {
        if (list != null) {
            try {
                this.f41048g.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " update error", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public int m42573b() {
        return this.f41047f;
    }

    /* JADX INFO: renamed from: c */
    public void m42574c(String str) {
        C14202a c14202aRemove;
        CampaignEx campaignExM42497h;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (this.f41049h.containsKey(str) && (c14202aRemove = this.f41049h.remove(str)) != null && (campaignExM42497h = c14202aRemove.m42497h()) != null) {
                this.f41048g.remove(campaignExM42497h);
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " removeCampaignDownloadTask campaign name: " + campaignExM42497h.getAppName());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardVideoRefactorManager", m42577h() + " removeCampaignDownloadTask error:" + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C14202a m42575d() {
        try {
            return m42579i();
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            C13219q0.m37816b("RewardVideoRefactorManager", m42577h() + " getCampaignDownLoadTask error:" + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public CopyOnWriteArrayList<Map<String, C14202a>> m42576e() {
        try {
            CopyOnWriteArrayList<Map<String, C14202a>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList.add(this.f41049h);
            return copyOnWriteArrayList;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            C13219q0.m37816b("RewardVideoRefactorManager", m42577h() + " getCampaignDownLoadTaskList error:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public String m42577h() {
        return this.f41045d;
    }

    /* JADX INFO: renamed from: h */
    public void m42578h(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                this.f41048g.add(campaignEx);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " update error", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public C14202a m42579i() {
        List<C14202a> listM42568a;
        if (this.f41048g.size() == 0) {
            C13219q0.m37813a("RewardVideoRefactorManager", m42577h() + " isReady campaignExes is null");
            return null;
        }
        try {
            listM42568a = m42568a((List<CampaignEx>) this.f41048g, false);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37817b("RewardVideoRefactorManager", m42577h() + " isReady error", e);
            }
            listM42568a = null;
        }
        if (listM42568a == null || listM42568a.size() <= 0) {
            return null;
        }
        return listM42568a.get(0);
    }

    /* JADX INFO: renamed from: j */
    public void m42580j() {
        m42549a(this.f41048g);
    }

    /* JADX INFO: renamed from: k */
    public void m42581k() {
    }
}
