package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.C11778Z3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.C13236z;
import com.mbridge.msdk.mbsignalcommon.listener.C13376a;
import com.mbridge.msdk.mbsignalcommon.listener.C13377b;
import com.mbridge.msdk.mbsignalcommon.windvane.C13387a;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13932a;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b */
/* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13608b {

    /* JADX INFO: renamed from: g */
    private static ConcurrentHashMap<String, f> f37427g;

    /* JADX INFO: renamed from: a */
    private final m f37428a;

    /* JADX INFO: renamed from: b */
    private boolean f37429b;

    /* JADX INFO: renamed from: c */
    private final String f37430c;

    /* JADX INFO: renamed from: d */
    private final String f37431d;

    /* JADX INFO: renamed from: e */
    private final String f37432e;

    /* JADX INFO: renamed from: f */
    private volatile List<WindVaneWebView> f37433f;

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$a */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CopyOnWriteArrayList f37434a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f37435b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f37436c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f37437d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f37438e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f37439f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f37440g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ n f37441h;

        a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i, String str2, String str3, String str4, n nVar) {
            this.f37434a = copyOnWriteArrayList;
            this.f37435b = context;
            this.f37436c = str;
            this.f37437d = i;
            this.f37438e = str2;
            this.f37439f = str3;
            this.f37440g = str4;
            this.f37441h = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:115:0x02df  */
        /* JADX WARN: Code duplicated, block: B:121:0x02f5  */
        /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:125:0x030e  */
        /* JADX WARN: Code duplicated, block: B:145:0x0382  */
        /* JADX WARN: Code duplicated, block: B:191:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:193:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:195:0x0341 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:199:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0191  */
        /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
        @Override // java.lang.Runnable
        public void run() {
            CharSequence charSequence;
            String str;
            CampaignEx.C13066c c13066c;
            String str2;
            String str3;
            boolean zIsDynamicView;
            String iconUrl;
            String imageUrl;
            CampaignEx campaignEx;
            String strM36779h;
            List<CampaignEx.C13066c.a> listM36777d;
            List<String> list;
            int i;
            C13154c c13154c;
            int i2;
            String str4 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList = this.f37434a;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f37434a);
                C14203b.getInstance().createUnitCache(this.f37435b, this.f37436c, this.f37434a, this.f37437d, new k(C13608b.this.f37428a, this.f37438e, this.f37436c, this.f37439f, this.f37440g));
                C14203b.getInstance().load(this.f37436c);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
            Iterator it = this.f37434a.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it.next();
                if (campaignEx2 != null) {
                    try {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37436c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37438e);
                        bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37439f);
                        bundle.putString("key", this.f37436c + str4 + this.f37439f + str4 + campaignEx2.getSecondRequestIndex());
                        messageObtain.setData(bundle);
                        C13608b.this.f37428a.sendMessage(messageObtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.C13066c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String strM36781j = rewardTemplateMode.m36781j();
                        int iM36782k = rewardTemplateMode.m36782k();
                        if (campaignEx2.isDynamicView() && C13229v0.m37917c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, strM36781j)) {
                            C13608b.this.m38990a(1, campaignEx2, iM36782k + "", strM36781j);
                        } else if (!TextUtils.isEmpty(strM36781j) && !strM36781j.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            C13154c c13154cM38986a = C13608b.this.m38986a(campaignEx2, 2);
                            if (strM36781j.contains(".zip")) {
                                try {
                                    H5DownLoadManager h5DownLoadManager = H5DownLoadManager.getInstance();
                                    try {
                                        Context context = this.f37435b;
                                        String str5 = this.f37438e;
                                        try {
                                            String str6 = this.f37436c;
                                            try {
                                                String str7 = this.f37439f;
                                                m mVar = C13608b.this.f37428a;
                                                charSequence = ".zip";
                                                try {
                                                    n nVar = this.f37441h;
                                                    CopyOnWriteArrayList copyOnWriteArrayList2 = this.f37434a;
                                                    c13066c = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                    try {
                                                        h5DownLoadManager.downloadH5Res(c13154cM38986a, strM36781j, new l(context, str5, str6, str7, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList2));
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        if (MBridgeConstans.DEBUG) {
                                                            C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    c13066c = rewardTemplateMode;
                                                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                    str = "";
                                                    str4 = str4;
                                                    it = it;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                c13066c = rewardTemplateMode;
                                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                                str = "";
                                                str4 = str4;
                                                it = it;
                                                charSequence = ".zip";
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            charSequence = ".zip";
                                            str = "";
                                            c13066c = rewardTemplateMode;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            if (MBridgeConstans.DEBUG) {
                                                C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            str3 = campaignEx2.getendcard_url();
                                            zIsDynamicView = campaignEx2.isDynamicView();
                                            boolean zM37945l = C13229v0.m37945l(str3);
                                            if (!TextUtils.isEmpty(str3)) {
                                                if (zIsDynamicView) {
                                                    C13608b.this.m38992a(this.f37435b, this.f37438e, this.f37436c, this.f37439f, campaignEx2, str3, this.f37441h, (CopyOnWriteArrayList<CampaignEx>) this.f37434a);
                                                } else if (C13229v0.m37917c(str2, str3)) {
                                                    try {
                                                        i2 = Integer.parseInt(C13188c1.m37645a(str3, "ecid"));
                                                    } catch (Throwable th) {
                                                        C13219q0.m37816b("RewardCampaignsResourceManager", th.getMessage());
                                                        i2 = 404;
                                                    }
                                                    C13608b.this.m38990a(2, campaignEx2, i2 + str, str3);
                                                }
                                            }
                                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                                H5DownLoadManager.getInstance().download(C13608b.this.m38986a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                                            }
                                            iconUrl = campaignEx2.getIconUrl();
                                            if (!TextUtils.isEmpty(iconUrl)) {
                                                try {
                                                    C13100b c13100bM37152a = C13100b.m37152a(this.f37435b);
                                                    try {
                                                        j jVar = new j(C13608b.this.f37428a, 0, this.f37438e, this.f37436c, this.f37439f, campaignEx2);
                                                        campaignEx2 = campaignEx2;
                                                        c13100bM37152a.m37155a(iconUrl, jVar);
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        campaignEx2 = campaignEx2;
                                                        if (MBridgeConstans.DEBUG) {
                                                            C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e7) {
                                                    e = e7;
                                                }
                                            }
                                            imageUrl = campaignEx2.getImageUrl();
                                            if (!TextUtils.isEmpty(imageUrl)) {
                                                try {
                                                    campaignEx = campaignEx2;
                                                    try {
                                                        campaignEx2 = campaignEx;
                                                        C13100b.m37152a(this.f37435b).m37155a(imageUrl, new j(C13608b.this.f37428a, 0, this.f37438e, this.f37436c, this.f37439f, campaignEx));
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        campaignEx2 = campaignEx;
                                                        if (MBridgeConstans.DEBUG) {
                                                            C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                        }
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                }
                                            }
                                            if (c13066c != null) {
                                                strM36779h = c13066c.m36779h();
                                                if (!TextUtils.isEmpty(strM36779h)) {
                                                    if (campaignEx2.getAabEntity() != null) {
                                                        i = campaignEx2.getAabEntity().h3c;
                                                    } else {
                                                        i = 0;
                                                    }
                                                    c13154c = new C13154c(true);
                                                    c13154c.m37439f(i);
                                                    if (strM36779h.contains(charSequence)) {
                                                        C13219q0.m37813a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(c13154c, strM36779h, new l(this.f37435b, this.f37438e, this.f37436c, this.f37439f, campaignEx2, 313, C13608b.this.f37428a, this.f37441h, this.f37434a));
                                                        } catch (Exception e10) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                C13219q0.m37816b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                                                            }
                                                        }
                                                    } else {
                                                        try {
                                                            H5DownLoadManager.getInstance().downloadH5Res(c13154c, strM36779h, new i(313, this.f37438e, this.f37436c, this.f37439f, campaignEx2, this.f37441h, C13608b.this.f37428a, this.f37434a));
                                                        } catch (Exception e11) {
                                                            if (MBridgeConstans.DEBUG) {
                                                                C13219q0.m37816b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                                                            }
                                                        }
                                                    }
                                                }
                                                listM36777d = c13066c.m36777d();
                                                if (listM36777d != null) {
                                                    while (r2.hasNext()) {
                                                        if (aVar == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            it = it;
                                            str4 = str4;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        str = "";
                                        charSequence = ".zip";
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    charSequence = ".zip";
                                    str = "";
                                }
                            } else {
                                str4 = str4;
                                it = it;
                                charSequence = ".zip";
                                str = "";
                                c13066c = rewardTemplateMode;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                C13219q0.m37813a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(c13154cM38986a, strM36781j, new i(859, this.f37438e, this.f37436c, this.f37439f, campaignEx2, this.f37441h, C13608b.this.f37428a, this.f37434a));
                                } catch (Exception e14) {
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37816b("RewardCampaignsResourceManager", e14.getLocalizedMessage());
                                    }
                                }
                            }
                        }
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        c13066c = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    } else {
                        str4 = str4;
                        it = it;
                        charSequence = ".zip";
                        str = "";
                        c13066c = rewardTemplateMode;
                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    }
                    str3 = campaignEx2.getendcard_url();
                    zIsDynamicView = campaignEx2.isDynamicView();
                    boolean zM37945l2 = C13229v0.m37945l(str3);
                    if (!TextUtils.isEmpty(str3)) {
                        if (zIsDynamicView || zM37945l2) {
                            C13608b.this.m38992a(this.f37435b, this.f37438e, this.f37436c, this.f37439f, campaignEx2, str3, this.f37441h, (CopyOnWriteArrayList<CampaignEx>) this.f37434a);
                        } else if (C13229v0.m37917c(str2, str3)) {
                            i2 = Integer.parseInt(C13188c1.m37645a(str3, "ecid"));
                            C13608b.this.m38990a(2, campaignEx2, i2 + str, str3);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                        H5DownLoadManager.getInstance().download(C13608b.this.m38986a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                        C13100b c13100bM37152a2 = C13100b.m37152a(this.f37435b);
                        j jVar2 = new j(C13608b.this.f37428a, 0, this.f37438e, this.f37436c, this.f37439f, campaignEx2);
                        campaignEx2 = campaignEx2;
                        c13100bM37152a2.m37155a(iconUrl, jVar2);
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        campaignEx = campaignEx2;
                        campaignEx2 = campaignEx;
                        C13100b.m37152a(this.f37435b).m37155a(imageUrl, new j(C13608b.this.f37428a, 0, this.f37438e, this.f37436c, this.f37439f, campaignEx));
                    }
                    if (c13066c != null) {
                        strM36779h = c13066c.m36779h();
                        if (!TextUtils.isEmpty(strM36779h) && !campaignEx2.isDynamicView()) {
                            if (campaignEx2.getAabEntity() != null) {
                                i = campaignEx2.getAabEntity().h3c;
                            } else {
                                i = 0;
                            }
                            c13154c = new C13154c(true);
                            c13154c.m37439f(i);
                            if (strM36779h.contains(charSequence)) {
                                C13219q0.m37813a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                H5DownLoadManager.getInstance().downloadH5Res(c13154c, strM36779h, new l(this.f37435b, this.f37438e, this.f37436c, this.f37439f, campaignEx2, 313, C13608b.this.f37428a, this.f37441h, this.f37434a));
                            } else {
                                H5DownLoadManager.getInstance().downloadH5Res(c13154c, strM36779h, new i(313, this.f37438e, this.f37436c, this.f37439f, campaignEx2, this.f37441h, C13608b.this.f37428a, this.f37434a));
                            }
                        }
                        listM36777d = c13066c.m36777d();
                        if (listM36777d != null && listM36777d.size() > 0) {
                            for (CampaignEx.C13066c.a aVar : listM36777d) {
                                if (aVar == null && (list = aVar.f35640a) != null && list.size() > 0) {
                                    for (String str8 : aVar.f35640a) {
                                        if (!TextUtils.isEmpty(str8)) {
                                            try {
                                                CampaignEx campaignEx3 = campaignEx2;
                                                try {
                                                    campaignEx2 = campaignEx3;
                                                    C13100b.m37152a(this.f37435b).m37155a(str8, new j(C13608b.this.f37428a, 1, this.f37438e, this.f37436c, this.f37439f, campaignEx3));
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    campaignEx2 = campaignEx3;
                                                    if (MBridgeConstans.DEBUG) {
                                                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    it = it;
                    str4 = str4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$b */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    class b implements C13236z.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f37443a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f37444b;

        b(int i, CampaignEx campaignEx) {
            this.f37443a = i;
            this.f37444b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.C13236z.c
        /* JADX INFO: renamed from: a */
        public void mo37965a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            C13080n c13080n = new C13080n();
            int i = this.f37443a;
            if (i == 0) {
                c13080n.m36971e(1);
                c13080n.m36968d(3);
                c13080n.m36982j("m_download_end");
            } else if (i == 1) {
                c13080n.m36971e(2);
                c13080n.m36968d(3);
                c13080n.m36982j("m_download_end");
            } else if (i == 2) {
                c13080n.m36971e(3);
                c13080n.m36968d(3);
                c13080n.m36982j("m_download_end");
                c13080n.m36961b(this.f37444b.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                c13080n.m36974f("1");
            }
            C13608b.m39004b(c13080n, this.f37444b);
            c13080n.m36992o(this.f37444b.getRequestIdNotice());
            c13080n.m36988m(message);
            c13080n.m36963b("scenes", "1");
            c13080n.m36963b("url", str);
            C13156d.m37475b().m37481a(c13080n, this.f37444b);
        }

        @Override // com.mbridge.msdk.foundation.tools.C13236z.c
        /* JADX INFO: renamed from: a */
        public void mo37966a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            try {
                C13080n c13080n = new C13080n();
                int i = this.f37443a;
                if (i == 0) {
                    c13080n.m36971e(1);
                    c13080n.m36968d(1);
                    c13080n.m36982j("m_download_end");
                } else if (i == 1) {
                    c13080n.m36971e(2);
                    c13080n.m36968d(1);
                    c13080n.m36982j("m_download_end");
                } else if (i == 2) {
                    c13080n.m36971e(3);
                    c13080n.m36968d(1);
                    c13080n.m36982j("m_download_end");
                    c13080n.m36961b(this.f37444b.isMraid() ? C13080n.f35733N : C13080n.f35734O);
                    c13080n.m36974f("1");
                }
                c13080n.m36992o(this.f37444b.getRequestIdNotice());
                c13080n.m36963b("url", str);
                c13080n.m36963b("scenes", "1");
                C13156d.m37475b().m37481a(c13080n, this.f37444b);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$c */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    class c implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f37446a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f37447b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f37448c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CampaignEx f37449d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ n f37450e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Context f37451f;

        c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f37446a = str;
            this.f37447b = str2;
            this.f37448c = str3;
            this.f37449d = campaignEx;
            this.f37450e = nVar;
            this.f37451f = context;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            String str3;
            String str4;
            boolean z;
            Exception exc;
            String str5;
            char c;
            String str6 = "";
            String str7 = "message";
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                try {
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                    bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                    bundle.putString("url", str2);
                    bundle.putString("key", this.f37446a + "_" + this.f37448c + "_" + this.f37449d.getSecondRequestIndex());
                    bundle.putString("message", str);
                    messageObtain.setData(bundle);
                    C13608b.this.f37428a.sendMessage(messageObtain);
                    if (this.f37450e != null) {
                        try {
                            c = 28037;
                            try {
                                this.f37450e.mo39030a(str2, this.f37448c, C13608b.m39001b(880005, new MBridgeIds(this.f37447b, this.f37446a, this.f37448c), "", null, null));
                            } catch (Exception e) {
                                e = e;
                                try {
                                    C13219q0.m37816b("RewardCampaignsResourceManager", e.getMessage());
                                } catch (Exception e2) {
                                    str3 = "RewardCampaignsResourceManager";
                                    str6 = "";
                                    str7 = "message";
                                    z = false;
                                    exc = e2;
                                    str4 = "_";
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z);
                                    Message messageObtain2 = Message.obtain();
                                    messageObtain2.what = 105;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                                    bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                                    bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                                    bundle2.putString("key", this.f37446a + str4 + this.f37448c + str4 + this.f37449d.getSecondRequestIndex());
                                    bundle2.putString("url", str2);
                                    bundle2.putString(str7, exc.getMessage());
                                    messageObtain2.setData(bundle2);
                                    C13608b.this.f37428a.sendMessage(messageObtain2);
                                    if (this.f37450e != null) {
                                        try {
                                            this.f37450e.mo39030a(str2, this.f37448c, C13608b.m39001b(880005, new MBridgeIds(this.f37447b, this.f37446a, this.f37448c), str6, exc, null));
                                        } catch (Exception e3) {
                                            str5 = str3;
                                            C13219q0.m37816b(str5, e3.getMessage());
                                            C13219q0.m37816b(str5, exc.getLocalizedMessage());
                                        }
                                    }
                                    str5 = str3;
                                    C13219q0.m37816b(str5, exc.getLocalizedMessage());
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            c = 28037;
                        }
                    } else {
                        c = 28037;
                    }
                    try {
                        try {
                            try {
                                str4 = "_";
                                str3 = "RewardCampaignsResourceManager";
                                z = false;
                                try {
                                    C13608b.this.m38991a(this.f37451f, 3, this.f37449d, str2, str, this.f37446a, "");
                                } catch (Exception e5) {
                                    e = e5;
                                    exc = e;
                                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z);
                                    Message messageObtain3 = Message.obtain();
                                    messageObtain3.what = 105;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                                    bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                                    bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                                    bundle3.putString("key", this.f37446a + str4 + this.f37448c + str4 + this.f37449d.getSecondRequestIndex());
                                    bundle3.putString("url", str2);
                                    bundle3.putString(str7, exc.getMessage());
                                    messageObtain3.setData(bundle3);
                                    C13608b.this.f37428a.sendMessage(messageObtain3);
                                    if (this.f37450e != null) {
                                        this.f37450e.mo39030a(str2, this.f37448c, C13608b.m39001b(880005, new MBridgeIds(this.f37447b, this.f37446a, this.f37448c), str6, exc, null));
                                    }
                                    str5 = str3;
                                    C13219q0.m37816b(str5, exc.getLocalizedMessage());
                                }
                            } catch (Exception e6) {
                                e = e6;
                                str3 = "RewardCampaignsResourceManager";
                                str4 = "_";
                                z = false;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str3 = "RewardCampaignsResourceManager";
                            z = false;
                            str4 = "_";
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str3 = "RewardCampaignsResourceManager";
                        z = false;
                        str4 = "_";
                        exc = e;
                        ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, z);
                        Message messageObtain4 = Message.obtain();
                        messageObtain4.what = 105;
                        Bundle bundle4 = new Bundle();
                        bundle4.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                        bundle4.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                        bundle4.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                        bundle4.putString("key", this.f37446a + str4 + this.f37448c + str4 + this.f37449d.getSecondRequestIndex());
                        bundle4.putString("url", str2);
                        bundle4.putString(str7, exc.getMessage());
                        messageObtain4.setData(bundle4);
                        C13608b.this.f37428a.sendMessage(messageObtain4);
                        if (this.f37450e != null) {
                            this.f37450e.mo39030a(str2, this.f37448c, C13608b.m39001b(880005, new MBridgeIds(this.f37447b, this.f37446a, this.f37448c), str6, exc, null));
                        }
                        str5 = str3;
                        C13219q0.m37816b(str5, exc.getLocalizedMessage());
                    }
                } catch (Exception e9) {
                    e = e9;
                    str3 = "RewardCampaignsResourceManager";
                }
            } catch (Exception e10) {
                e = e10;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                z = false;
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            try {
                C13219q0.m37813a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                bundle.putString("key", this.f37446a + "_" + this.f37448c + "_" + this.f37449d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                C13608b.this.f37428a.sendMessage(messageObtain);
                n nVar = this.f37450e;
                if (nVar != null) {
                    nVar.mo39031a(this.f37447b, this.f37446a, this.f37448c, str);
                }
                if (z) {
                    return;
                }
                C13608b.this.m38991a(this.f37451f, 1, this.f37449d, str, "", this.f37446a, str2);
            } catch (Exception e) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37446a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37447b);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37448c);
                bundle2.putString("key", this.f37446a + "_" + this.f37448c + "_" + this.f37449d.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                C13608b.this.f37428a.sendMessage(messageObtain2);
                if (this.f37450e != null) {
                    try {
                        this.f37450e.mo39030a(str, this.f37448c, C13608b.m39001b(880005, new MBridgeIds(this.f37447b, this.f37446a, this.f37448c), "", e, null));
                    } catch (Exception e2) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e2.getMessage());
                    }
                }
                C13608b.this.m38991a(this.f37451f, 3, this.f37449d, str, e.getLocalizedMessage(), this.f37446a, str2);
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$d */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f37453a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f37454b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f37455c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f37456d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f37457e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f37458f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f37459g;

        d(CampaignEx campaignEx, Context context, int i, String str, String str2, String str3, String str4) {
            this.f37453a = campaignEx;
            this.f37454b = context;
            this.f37455c = i;
            this.f37456d = str;
            this.f37457e = str2;
            this.f37458f = str3;
            this.f37459g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37453a == null || this.f37454b == null) {
                return;
            }
            try {
                C13080n c13080n = new C13080n();
                c13080n.m36982j("m_download_end");
                Context context = this.f37454b;
                if (context != null) {
                    c13080n.m36965c(C13211m0.m37770s(context.getApplicationContext()));
                }
                c13080n.m36968d(this.f37455c);
                CampaignEx campaignEx = this.f37453a;
                if (campaignEx != null) {
                    c13080n.m36962b(campaignEx.getId());
                    c13080n.m36990n(this.f37453a.getRequestId());
                    c13080n.m36984k(this.f37453a.getCurrentLocalRid());
                    c13080n.m36992o(this.f37453a.getRequestIdNotice());
                }
                c13080n.m36963b("url", this.f37456d);
                c13080n.m37002t(this.f37456d);
                c13080n.m36988m(this.f37457e);
                c13080n.m37004u(this.f37458f);
                if (!TextUtils.isEmpty(this.f37459g)) {
                    c13080n.m36996q(this.f37459g);
                }
                c13080n.m36971e(1);
                c13080n.m36963b("scenes", "1");
                C13156d.m37475b().m37481a(c13080n, this.f37453a);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$e */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f37461a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WindVaneWebView f37462b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CampaignEx f37463c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f37464d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f37465e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C14223c f37466f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f37467g;

        e(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, C14223c c14223c, String str2) {
            this.f37461a = z;
            this.f37462b = windVaneWebView;
            this.f37463c = campaignEx;
            this.f37464d = copyOnWriteArrayList;
            this.f37465e = str;
            this.f37466f = c14223c;
            this.f37467g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13608b.this.m39000a(this.f37461a, this.f37462b, this.f37463c.getRewardTemplateMode().m36781j(), 0, this.f37463c, (CopyOnWriteArrayList<CampaignEx>) this.f37464d, H5DownLoadManager.getInstance().getH5ResAddress(this.f37463c.getRewardTemplateMode().m36781j()), this.f37465e, this.f37466f, this.f37467g, C13608b.this.f37429b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$f */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static class f {

        /* JADX INFO: renamed from: a */
        boolean f37469a;

        /* JADX INFO: renamed from: b */
        boolean f37470b;

        /* JADX INFO: renamed from: c */
        int f37471c;

        /* JADX INFO: renamed from: d */
        int f37472d;

        /* JADX INFO: renamed from: e */
        String f37473e;

        /* JADX INFO: renamed from: f */
        String f37474f;

        /* JADX INFO: renamed from: g */
        int f37475g;

        /* JADX INFO: renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f37476h;

        /* JADX INFO: renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f37477i;

        public f(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f37469a = z;
            this.f37470b = z2;
            this.f37471c = i;
            this.f37472d = i2;
            this.f37473e = str;
            this.f37474f = str2;
            this.f37475g = i3;
            this.f37476h = copyOnWriteArrayList;
            this.f37477i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$g */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static class g extends C13376a {

        /* JADX INFO: renamed from: a */
        private final Handler f37478a;

        /* JADX INFO: renamed from: b */
        private final Runnable f37479b;

        /* JADX INFO: renamed from: c */
        private final boolean f37480c;

        /* JADX INFO: renamed from: d */
        private final boolean f37481d;

        /* JADX INFO: renamed from: e */
        private int f37482e;

        /* JADX INFO: renamed from: f */
        private String f37483f;

        /* JADX INFO: renamed from: g */
        private String f37484g;

        /* JADX INFO: renamed from: h */
        private String f37485h;

        /* JADX INFO: renamed from: i */
        private String f37486i;

        /* JADX INFO: renamed from: j */
        private C14200a.a f37487j;

        /* JADX INFO: renamed from: k */
        private CampaignEx f37488k;

        /* JADX INFO: renamed from: l */
        private CopyOnWriteArrayList<CampaignEx> f37489l;

        /* JADX INFO: renamed from: m */
        private C14223c f37490m;

        /* JADX INFO: renamed from: n */
        private final o f37491n;

        /* JADX INFO: renamed from: o */
        private boolean f37492o;

        /* JADX INFO: renamed from: p */
        private boolean f37493p;

        /* JADX INFO: renamed from: q */
        private boolean f37494q;

        /* JADX INFO: renamed from: r */
        private int f37495r = 0;

        /* JADX INFO: renamed from: s */
        private boolean f37496s;

        /* JADX INFO: renamed from: t */
        private long f37497t;

        public g(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, C14200a.a aVar, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C14223c c14223c, o oVar, boolean z4, long j) {
            this.f37478a = handler;
            this.f37479b = runnable;
            this.f37480c = z2;
            this.f37481d = z3;
            this.f37482e = i;
            this.f37483f = str;
            this.f37485h = str2;
            this.f37484g = str3;
            this.f37486i = str4;
            this.f37487j = aVar;
            this.f37488k = campaignEx;
            this.f37489l = copyOnWriteArrayList;
            this.f37490m = c14223c;
            this.f37491n = oVar;
            this.f37492o = z4;
            this.f37496s = z;
            this.f37497t = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            Runnable runnable;
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 1);
                c13157e.m37501a("result", Integer.valueOf(i));
                C13156d.m37475b().m37483a("2000155", this.f37488k, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b("RVWindVaneWebView", th.getMessage());
            }
            if (this.f37494q) {
                return;
            }
            String str = this.f37484g + "_" + this.f37483f;
            if (i == 1) {
                if (this.f37492o) {
                    C14200a.m42403d(this.f37484g + "_" + this.f37486i);
                } else {
                    C14200a.m42402c(this.f37484g + "_" + this.f37486i);
                }
                C14200a.m42398a(this.f37484g + "_" + this.f37486i + "_" + this.f37483f, this.f37487j, true, this.f37492o);
                Handler handler = this.f37478a;
                if (handler != null && (runnable = this.f37479b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37484g + "_" + this.f37486i + "_" + this.f37483f, true);
                C14200a.a aVar = this.f37487j;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                o oVar = this.f37491n;
                if (oVar != null) {
                    oVar.mo39033a(str, this.f37485h, this.f37484g, this.f37486i, this.f37483f, this.f37487j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37484g + "_" + this.f37486i + "_" + this.f37483f, false);
                C14200a.a aVar2 = this.f37487j;
                if (aVar2 != null) {
                    aVar2.m42408a(false);
                }
                if (this.f37491n != null) {
                    this.f37491n.mo39032a(str, this.f37486i, this.f37483f, this.f37487j, C13608b.m39001b(880008, new MBridgeIds(this.f37485h, this.f37484g, this.f37486i), "readyState:" + i, null, this.f37488k));
                }
            }
            this.f37494q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a
        /* JADX INFO: renamed from: a */
        public void mo38671a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    C13613a c13613a = new C13613a();
                    c13613a.m39248e(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    c13613a.m39246d(z);
                    c13613a.m39244c(str, str2);
                    c13613a.m39237a(new C13932a(null));
                    c13613a.m39241a(false, C13156d.m37475b().m37479a(0, i2, str2, true, 1));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RVWindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a
        /* JADX INFO: renamed from: a */
        public void mo38673a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    C13893d.m41513c().m41467b(obj, strOptString);
                    String strM41480f = C13893d.m41513c().m41480f(strOptString);
                    CampaignEx campaignExM41471c = C13893d.m41513c().m41471c(strOptString);
                    C14223c c14223cM41475d = C13893d.m41513c().m41475d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExM41471c);
                    WindVaneWebView windVaneWebView = ((C13387a) obj).f37156b;
                    if (windVaneWebView != null) {
                        C13608b.m39002b().m38999a(this.f37496s, windVaneWebView, campaignExM41471c, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, c14223cM41475d, strM41480f, strOptString, this.f37495r == 0 ? 3 : 6);
                        this.f37495r++;
                    }
                } catch (Throwable th) {
                    C13219q0.m37816b("RVWindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f37493p) {
                return;
            }
            String str2 = this.f37484g + "_" + this.f37483f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37484g + "_" + this.f37486i + "_" + this.f37483f, true);
                Handler handler = this.f37478a;
                if (handler != null && (runnable = this.f37479b) != null) {
                    handler.removeCallbacks(runnable);
                }
                C14200a.a aVar = this.f37487j;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                o oVar = this.f37491n;
                if (oVar != null) {
                    oVar.mo39033a(str2, this.f37485h, this.f37484g, this.f37486i, this.f37483f, this.f37487j);
                }
            }
            C13392f.m38726a().m38727a(webView);
            this.f37493p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37484g + "_" + this.f37486i + "_" + this.f37483f, false);
            if (this.f37491n != null) {
                String str3 = this.f37484g + "_" + this.f37483f;
                C14200a.a aVar = this.f37487j;
                if (aVar != null) {
                    aVar.m42408a(false);
                }
                this.f37491n.mo39032a(str3, this.f37486i, this.f37483f, this.f37487j, C13608b.m39001b(880008, new MBridgeIds(this.f37485h, this.f37484g, this.f37486i), "onReceivedError： " + i + "  " + str, null, this.f37488k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13376a, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    C13893d.m41513c().m41474c(this.f37484g, this.f37486i);
                } catch (Throwable th) {
                    C13219q0.m37816b("RVWindVaneWebView", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$h */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo39013a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        /* JADX INFO: renamed from: a */
        void mo39014a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C13082b c13082b);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$i */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: b */
        private int f37499b;

        /* JADX INFO: renamed from: c */
        private final String f37500c;

        /* JADX INFO: renamed from: d */
        private final String f37501d;

        /* JADX INFO: renamed from: e */
        private final String f37502e;

        /* JADX INFO: renamed from: f */
        private CampaignEx f37503f;

        /* JADX INFO: renamed from: g */
        private n f37504g;

        /* JADX INFO: renamed from: h */
        private Handler f37505h;

        /* JADX INFO: renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f37506i;

        /* JADX INFO: renamed from: a */
        private boolean f37498a = false;

        /* JADX INFO: renamed from: j */
        private final long f37507j = System.currentTimeMillis();

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$i$a */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f37508a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f37509b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37510c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37511d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f37512e;

            a(int i, long j, String str, String str2, String str3) {
                this.f37508a = i;
                this.f37509b = j;
                this.f37510c = str;
                this.f37511d = str2;
                this.f37512e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f37503f == null) {
                    return;
                }
                try {
                    C13080n c13080n = new C13080n("m_download_end", this.f37508a, this.f37509b + "", this.f37510c, i.this.f37503f.getId(), i.this.f37501d, this.f37511d, "2");
                    c13080n.m36990n(i.this.f37503f.getRequestId());
                    c13080n.m36984k(i.this.f37503f.getCurrentLocalRid());
                    c13080n.m36992o(i.this.f37503f.getRequestIdNotice());
                    c13080n.m36962b(i.this.f37503f.getId());
                    c13080n.m36958a(i.this.f37503f.getAdSpaceT());
                    c13080n.m36963b("scenes", "1");
                    c13080n.m36963b("url", this.f37510c);
                    if (i.this.f37503f.getAdType() == 287) {
                        c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (i.this.f37503f.getAdType() == 94) {
                        c13080n.m36959a("1");
                    }
                    if (!TextUtils.isEmpty(this.f37512e)) {
                        c13080n.m36996q(this.f37512e);
                    }
                    C13608b.m39004b(c13080n, i.this.f37503f);
                    C13145g.m37359a(c13080n, i.this.f37501d, i.this.f37503f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f37499b = i;
            this.f37500c = str;
            this.f37501d = str2;
            this.f37502e = str3;
            this.f37503f = campaignEx;
            this.f37504g = nVar;
            this.f37505h = handler;
            this.f37506i = copyOnWriteArrayList;
        }

        /* JADX INFO: renamed from: a */
        private void m39016a(int i, long j, String str, String str2, String str3) {
            C13167a.m37546e().execute(new a(i, j, str, str2, str3));
        }

        /* JADX INFO: renamed from: a */
        public void m39018a(boolean z) {
            this.f37498a = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i = this.f37499b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString("message", str2);
                messageObtain.setData(bundle);
                this.f37505h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle2.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                messageObtain2.setData(bundle2);
                this.f37505h.sendMessage(messageObtain2);
                if (this.f37498a) {
                    m39016a(3, System.currentTimeMillis() - this.f37507j, str, "url download failed", "");
                }
            } else if (i == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 205;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle3.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                bundle3.putString("message", str2);
                messageObtain3.setData(bundle3);
                this.f37505h.sendMessage(messageObtain3);
                if (this.f37504g != null) {
                    try {
                        this.f37504g.mo39030a(str, this.f37502e, C13608b.m39001b(880006, new MBridgeIds(this.f37500c, this.f37501d, this.f37502e), str2, null, null));
                    } catch (Exception e) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i = this.f37499b;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f37505h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle2.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f37505h.sendMessage(messageObtain2);
                if (this.f37498a) {
                    m39016a(1, System.currentTimeMillis() - this.f37507j, str, "", str2);
                }
            } else if (i == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37501d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f37500c);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37502e);
                bundle3.putString("key", this.f37501d + "_" + this.f37502e + "_" + this.f37503f.getSecondRequestIndex());
                messageObtain3.setData(bundle3);
                this.f37505h.sendMessage(messageObtain3);
                n nVar = this.f37504g;
                if (nVar != null) {
                    nVar.mo39031a(this.f37500c, this.f37501d, this.f37502e, str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$j */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class j implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        private Handler f37514a;

        /* JADX INFO: renamed from: b */
        private int f37515b;

        /* JADX INFO: renamed from: c */
        private String f37516c;

        /* JADX INFO: renamed from: d */
        private String f37517d;

        /* JADX INFO: renamed from: e */
        private String f37518e;

        /* JADX INFO: renamed from: f */
        private CampaignEx f37519f;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$j$a */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37520a;

            a(String str) {
                this.f37520a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f37519f != null) {
                    try {
                        C13026n c13026nM36744a = C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                        C13219q0.m37813a("RewardCampaignsResourceManager", "campaign is null");
                        C13080n c13080n = new C13080n();
                        c13080n.m36982j("2000044");
                        c13080n.m36965c(C13211m0.m37770s(C13008c.m36588n().m36542d()));
                        c13080n.m36962b(j.this.f37519f.getId());
                        c13080n.m36980i(j.this.f37519f.getImageUrl());
                        c13080n.m36990n(j.this.f37519f.getRequestId());
                        c13080n.m36984k(j.this.f37519f.getCurrentLocalRid());
                        c13080n.m36992o(j.this.f37519f.getRequestIdNotice());
                        c13080n.m37004u(j.this.f37516c);
                        c13080n.m36988m(this.f37520a);
                        c13080n.m36963b("scenes", "1");
                        c13026nM36744a.m36745a(c13080n);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f37514a = handler;
            this.f37515b = i;
            this.f37517d = str;
            this.f37516c = str2;
            this.f37518e = str3;
            this.f37519f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f37515b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37516c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37517d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37518e);
            bundle.putString("key", this.f37516c + "_" + this.f37518e + "_" + this.f37519f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f37514a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (C13009d.m36589a().m36605e()) {
                C13167a.m37543b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f37515b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37516c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37517d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37518e);
            bundle.putString("key", this.f37516c + "_" + this.f37518e + "_" + this.f37519f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f37514a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$k */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class k implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        private Handler f37522a;

        /* JADX INFO: renamed from: b */
        private final String f37523b;

        /* JADX INFO: renamed from: c */
        private final String f37524c;

        /* JADX INFO: renamed from: d */
        private final String f37525d;

        /* JADX INFO: renamed from: e */
        private final String f37526e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f37522a = handler;
            this.f37524c = str;
            this.f37523b = str2;
            this.f37525d = str3;
            this.f37526e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37523b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37524c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37525d);
            bundle.putString("key", this.f37526e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f37522a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37523b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37524c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37525d);
            bundle.putString("url", str2);
            bundle.putString("key", this.f37526e);
            bundle.putString("message", str);
            messageObtain.setData(bundle);
            this.f37522a.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: b */
        private Context f37528b;

        /* JADX INFO: renamed from: c */
        private String f37529c;

        /* JADX INFO: renamed from: d */
        private String f37530d;

        /* JADX INFO: renamed from: e */
        private String f37531e;

        /* JADX INFO: renamed from: f */
        private CampaignEx f37532f;

        /* JADX INFO: renamed from: g */
        private int f37533g;

        /* JADX INFO: renamed from: h */
        private Handler f37534h;

        /* JADX INFO: renamed from: i */
        private n f37535i;

        /* JADX INFO: renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f37536j;

        /* JADX INFO: renamed from: a */
        private boolean f37527a = false;

        /* JADX INFO: renamed from: k */
        private long f37537k = System.currentTimeMillis();

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$a */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f37538a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ String f37539b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37540c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37541d;

            a(int i, String str, String str2, String str3) {
                this.f37538a = i;
                this.f37539b = str;
                this.f37540c = str2;
                this.f37541d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f37532f == null || l.this.f37528b == null) {
                    return;
                }
                try {
                    C13080n c13080n = new C13080n();
                    c13080n.m36982j("m_download_end");
                    if (l.this.f37528b != null) {
                        c13080n.m36965c(C13211m0.m37770s(l.this.f37528b.getApplicationContext()));
                    }
                    c13080n.m36968d(this.f37538a);
                    if (l.this.f37532f != null) {
                        c13080n.m36962b(l.this.f37532f.getId());
                        c13080n.m36990n(l.this.f37532f.getRequestId());
                        c13080n.m36984k(l.this.f37532f.getCurrentLocalRid());
                        c13080n.m36992o(l.this.f37532f.getRequestIdNotice());
                    }
                    c13080n.m37002t(this.f37539b);
                    c13080n.m36988m(this.f37540c);
                    c13080n.m37004u(l.this.f37529c);
                    if (!TextUtils.isEmpty(this.f37541d)) {
                        c13080n.m36996q(this.f37541d);
                    }
                    c13080n.m36971e(2);
                    c13080n.m36963b("scenes", "1");
                    c13080n.m36963b("url", this.f37539b);
                    C13608b.m39004b(c13080n, l.this.f37532f);
                    C13156d.m37475b().m37481a(c13080n, l.this.f37532f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$l$b */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f37543a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ long f37544b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37545c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37546d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f37547e;

            b(int i, long j, String str, String str2, String str3) {
                this.f37543a = i;
                this.f37544b = j;
                this.f37545c = str;
                this.f37546d = str2;
                this.f37547e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f37532f == null) {
                    return;
                }
                try {
                    C13080n c13080n = new C13080n("m_download_end", this.f37543a, this.f37544b + "", this.f37545c, l.this.f37532f.getId(), l.this.f37529c, this.f37546d, "1");
                    c13080n.m36990n(l.this.f37532f.getRequestId());
                    c13080n.m36984k(l.this.f37532f.getCurrentLocalRid());
                    c13080n.m36992o(l.this.f37532f.getRequestIdNotice());
                    c13080n.m36962b(l.this.f37532f.getId());
                    c13080n.m36958a(l.this.f37532f.getAdSpaceT());
                    c13080n.m36996q(this.f37547e);
                    c13080n.m36963b("scenes", "1");
                    if (l.this.f37532f.getAdType() == 287) {
                        c13080n.m36959a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (l.this.f37532f.getAdType() == 94) {
                        c13080n.m36959a("1");
                    }
                    c13080n.m36963b("url", this.f37545c);
                    c13080n.m36971e(3);
                    C13608b.m39004b(c13080n, l.this.f37532f);
                    C13145g.m37359a(c13080n, l.this.f37529c, l.this.f37532f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f37528b = context;
            this.f37530d = str;
            this.f37529c = str2;
            this.f37531e = str3;
            this.f37532f = campaignEx;
            this.f37533g = i;
            this.f37534h = handler;
            this.f37535i = nVar;
            this.f37536j = copyOnWriteArrayList;
        }

        /* JADX INFO: renamed from: a */
        private void m39022a(int i, long j, String str, String str2, String str3) {
            C13167a.m37546e().execute(new b(i, j, str, str2, str3));
        }

        /* JADX INFO: renamed from: a */
        private void m39023a(int i, String str, String str2, String str3) {
            C13167a.m37546e().execute(new a(i, str, str2, str3));
        }

        /* JADX INFO: renamed from: a */
        public void m39026a(boolean z) {
            this.f37527a = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f37537k;
            int i = this.f37533g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
                bundle.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString("message", str);
                messageObtain.setData(bundle);
                this.f37534h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
                bundle2.putString("message", str);
                messageObtain2.setData(bundle2);
                this.f37534h.sendMessage(messageObtain2);
                if (this.f37527a) {
                    m39022a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                }
            } else if (i == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 203;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
                bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
                bundle3.putString("url", str2);
                bundle3.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
                bundle3.putString("message", str);
                messageObtain3.setData(bundle3);
                this.f37534h.sendMessage(messageObtain3);
                if (this.f37535i != null) {
                    try {
                        this.f37535i.mo39030a(str2, this.f37531e, C13608b.m39001b(880006, new MBridgeIds(this.f37530d, this.f37529c, this.f37531e), "", null, null));
                    } catch (Exception e) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getMessage());
                    }
                }
                m39023a(3, str2, str, "");
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f37537k;
            int i = this.f37533g;
            if (i == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
                bundle.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f37534h.sendMessage(messageObtain);
                return;
            }
            if (i == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
                bundle2.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f37534h.sendMessage(messageObtain2);
                if (this.f37527a) {
                    m39022a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37529c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f37530d);
            bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f37531e);
            bundle3.putString("key", this.f37529c + "_" + this.f37531e + "_" + this.f37532f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f37534h.sendMessage(messageObtain3);
            n nVar = this.f37535i;
            if (nVar != null) {
                nVar.mo39031a(this.f37530d, this.f37529c, this.f37531e, str);
            }
            if (z) {
                return;
            }
            m39023a(1, str, "", str2);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$m */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class m extends Handler {

        /* JADX INFO: renamed from: a */
        private Context f37549a;

        /* JADX INFO: renamed from: b */
        private ConcurrentHashMap<String, h> f37550b;

        /* JADX INFO: renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f37551c;

        public m(Looper looper) {
            super(looper);
            this.f37550b = new ConcurrentHashMap<>();
            this.f37551c = new ConcurrentHashMap<>();
        }

        /* JADX INFO: renamed from: a */
        public void m39027a(Context context) {
            this.f37549a = context;
        }

        /* JADX INFO: renamed from: a */
        public void m39028a(String str, h hVar) {
            this.f37550b.put(str, hVar);
        }

        /* JADX INFO: renamed from: a */
        public void m39029a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f37551c.put(str, copyOnWriteArrayList);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
        
            if (r18.getRsIgnoreCheckRule().contains(0) != false) goto L265;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v23 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v33 */
        /* JADX WARN: Type inference failed for: r10v34 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v19 */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v32 */
        /* JADX WARN: Type inference failed for: r11v33 */
        /* JADX WARN: Type inference failed for: r11v34 */
        /* JADX WARN: Type inference failed for: r11v35 */
        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v12 */
        /* JADX WARN: Type inference failed for: r13v13 */
        /* JADX WARN: Type inference failed for: r13v14 */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v16 */
        /* JADX WARN: Type inference failed for: r13v17 */
        /* JADX WARN: Type inference failed for: r13v2, types: [int] */
        /* JADX WARN: Type inference failed for: r13v3 */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r13v8 */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v4, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.String] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r29) {
            /*
                Method dump skipped, instruction units count: 1192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C13608b.m.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$n */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface n {
        /* JADX INFO: renamed from: a */
        void mo39030a(String str, String str2, C13082b c13082b);

        /* JADX INFO: renamed from: a */
        void mo39031a(String str, String str2, String str3, String str4);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$o */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    public interface o {
        /* JADX INFO: renamed from: a */
        void mo39032a(String str, String str2, String str3, C14200a.a aVar, C13082b c13082b);

        /* JADX INFO: renamed from: a */
        void mo39033a(String str, String str2, String str3, String str4, String str5, C14200a.a aVar);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static class p extends C13377b {

        /* JADX INFO: renamed from: a */
        private Handler f37552a;

        /* JADX INFO: renamed from: b */
        private Runnable f37553b;

        /* JADX INFO: renamed from: c */
        private final boolean f37554c;

        /* JADX INFO: renamed from: d */
        private final boolean f37555d;

        /* JADX INFO: renamed from: e */
        private String f37556e;

        /* JADX INFO: renamed from: f */
        private final o f37557f;

        /* JADX INFO: renamed from: g */
        private final WindVaneWebView f37558g;

        /* JADX INFO: renamed from: h */
        private final String f37559h;

        /* JADX INFO: renamed from: i */
        private final String f37560i;

        /* JADX INFO: renamed from: j */
        private final String f37561j;

        /* JADX INFO: renamed from: k */
        private final C14200a.a f37562k;

        /* JADX INFO: renamed from: l */
        private final CampaignEx f37563l;

        /* JADX INFO: renamed from: m */
        private CopyOnWriteArrayList<CampaignEx> f37564m;

        /* JADX INFO: renamed from: n */
        private long f37565n;

        /* JADX INFO: renamed from: o */
        private boolean f37566o;

        /* JADX INFO: renamed from: p */
        private boolean f37567p;

        /* JADX INFO: renamed from: q */
        private final Runnable f37568q;

        /* JADX INFO: renamed from: r */
        private final Runnable f37569r;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$a */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ o f37570a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C14200a.a f37571b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37572c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37573d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f37574e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ String f37575f;

            a(o oVar, C14200a.a aVar, String str, String str2, String str3, String str4) {
                this.f37570a = oVar;
                this.f37571b = aVar;
                this.f37572c = str;
                this.f37573d = str2;
                this.f37574e = str3;
                this.f37575f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewM42409b;
                C14200a.a aVar;
                if (this.f37570a != null && (aVar = this.f37571b) != null) {
                    aVar.m42408a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37572c + "_" + this.f37573d + "_" + this.f37574e, true);
                    o oVar = this.f37570a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f37572c);
                    sb.append("_");
                    sb.append(this.f37574e);
                    oVar.mo39033a(sb.toString(), this.f37575f, this.f37572c, this.f37573d, this.f37574e, this.f37571b);
                }
                C14200a.a aVar2 = this.f37571b;
                if (aVar2 == null || (windVaneWebViewM42409b = aVar2.m42409b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewM42409b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$p$b */
        /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ o f37577a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C14200a.a f37578b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ String f37579c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ String f37580d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ String f37581e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ String f37582f;

            b(o oVar, C14200a.a aVar, String str, String str2, String str3, String str4) {
                this.f37577a = oVar;
                this.f37578b = aVar;
                this.f37579c = str;
                this.f37580d = str2;
                this.f37581e = str3;
                this.f37582f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewM42409b;
                C14200a.a aVar;
                if (this.f37577a != null && (aVar = this.f37578b) != null) {
                    aVar.m42408a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37579c + "_" + this.f37580d + "_" + this.f37581e, true);
                    o oVar = this.f37577a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f37579c);
                    sb.append("_");
                    sb.append(this.f37581e);
                    oVar.mo39033a(sb.toString(), this.f37582f, this.f37579c, this.f37580d, this.f37581e, this.f37578b);
                }
                C14200a.a aVar2 = this.f37578b;
                if (aVar2 == null || (windVaneWebViewM42409b = aVar2.m42409b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewM42409b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z, boolean z2, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, C14200a.a aVar, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            this.f37552a = handler;
            this.f37553b = runnable;
            this.f37554c = z;
            this.f37555d = z2;
            this.f37556e = str;
            this.f37557f = oVar;
            this.f37558g = windVaneWebView;
            this.f37559h = str2;
            this.f37560i = str4;
            this.f37561j = str3;
            this.f37562k = aVar;
            this.f37563l = campaignEx;
            this.f37564m = copyOnWriteArrayList;
            this.f37565n = j;
            a aVar2 = new a(oVar, aVar, str4, str, str2, str3);
            this.f37569r = aVar2;
            this.f37568q = new b(oVar, aVar, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar2, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.mo34467a(webView, i);
            Handler handler2 = this.f37552a;
            if (handler2 != null && (runnable2 = this.f37568q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f37552a;
            if (handler3 != null && (runnable = this.f37569r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 2);
                c13157e.m37501a("result", Integer.valueOf(i));
                C13156d.m37475b().m37483a("2000155", this.f37563l, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b("WindVaneWebView", th.getMessage());
            }
            if (this.f37567p) {
                return;
            }
            String str = this.f37560i + "_" + this.f37559h;
            if (i == 1) {
                Runnable runnable3 = this.f37553b;
                if (runnable3 != null && (handler = this.f37552a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37560i + "_" + this.f37556e + "_" + this.f37559h, true);
                C14200a.a aVar = this.f37562k;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                if (this.f37554c) {
                    if (this.f37555d) {
                        C14200a.m42396a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37563l.getRequestIdNotice(), this.f37562k);
                    } else {
                        C14200a.m42401b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37563l.getRequestIdNotice(), this.f37562k);
                    }
                } else if (this.f37555d) {
                    C14200a.m42396a(94, this.f37563l.getRequestIdNotice(), this.f37562k);
                } else {
                    C14200a.m42401b(94, this.f37563l.getRequestIdNotice(), this.f37562k);
                }
                o oVar = this.f37557f;
                if (oVar != null) {
                    oVar.mo39033a(str, this.f37561j, this.f37560i, this.f37556e, this.f37559h, this.f37562k);
                }
            } else if (this.f37557f != null) {
                this.f37557f.mo39032a(str, this.f37556e, this.f37559h, this.f37562k, C13608b.m39001b(880009, new MBridgeIds(this.f37561j, this.f37560i, this.f37556e), "readyState:" + i, null, this.f37563l));
            }
            this.f37567p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f37552a;
            if (handler2 != null && (runnable2 = this.f37569r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f37566o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f37552a;
                if (handler3 != null && (runnable = this.f37568q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f37560i + "_" + this.f37559h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37560i + "_" + this.f37556e + "_" + this.f37559h, true);
                Runnable runnable3 = this.f37553b;
                if (runnable3 != null && (handler = this.f37552a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                C14200a.a aVar = this.f37562k;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                if (this.f37554c) {
                    if (this.f37563l.isBidCampaign()) {
                        C14200a.m42396a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37563l.getRequestIdNotice(), this.f37562k);
                    } else {
                        C14200a.m42401b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37563l.getRequestIdNotice(), this.f37562k);
                    }
                } else if (this.f37563l.isBidCampaign()) {
                    C14200a.m42396a(94, this.f37563l.getRequestIdNotice(), this.f37562k);
                } else {
                    C14200a.m42401b(94, this.f37563l.getRequestIdNotice(), this.f37562k);
                }
                o oVar = this.f37557f;
                if (oVar != null) {
                    oVar.mo39033a(str2, this.f37561j, this.f37560i, this.f37556e, this.f37559h, this.f37562k);
                }
            }
            C13392f.m38726a().m38727a(webView);
            this.f37566o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37560i + "_" + this.f37556e + "_" + this.f37559h, false);
            Handler handler = this.f37552a;
            if (handler != null) {
                if (this.f37568q != null) {
                    handler.removeCallbacks(this.f37569r);
                }
                Runnable runnable = this.f37568q;
                if (runnable != null) {
                    this.f37552a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f37560i + "_" + this.f37559h;
                C14200a.a aVar = this.f37562k;
                if (aVar != null) {
                    aVar.m42408a(false);
                }
                if (this.f37557f != null) {
                    this.f37557f.mo39032a(str3, this.f37556e, str2, this.f37562k, C13608b.m39001b(880009, new MBridgeIds(this.f37561j, this.f37560i, this.f37556e), i + "#" + str, null, this.f37563l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37560i + "_" + this.f37556e + "_" + this.f37559h, false);
            Handler handler = this.f37552a;
            if (handler != null) {
                if (this.f37568q != null) {
                    handler.removeCallbacks(this.f37569r);
                }
                Runnable runnable = this.f37568q;
                if (runnable != null) {
                    this.f37552a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f37560i + "_" + this.f37559h;
                C14200a.a aVar = this.f37562k;
                if (aVar != null) {
                    aVar.m42408a(false);
                }
                if (this.f37557f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f37561j, this.f37560i, this.f37556e);
                    StringBuilder sb = new StringBuilder("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f37557f.mo39032a(str, this.f37556e, this.f37559h, this.f37562k, C13608b.m39001b(880009, mBridgeIds, sb.toString(), null, this.f37563l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$q */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static class q extends C13377b {

        /* JADX INFO: renamed from: a */
        private String f37584a;

        /* JADX INFO: renamed from: b */
        private final boolean f37585b;

        /* JADX INFO: renamed from: c */
        private final WindVaneWebView f37586c;

        /* JADX INFO: renamed from: d */
        private final String f37587d;

        /* JADX INFO: renamed from: e */
        private final String f37588e;

        /* JADX INFO: renamed from: f */
        private final C14200a.a f37589f;

        /* JADX INFO: renamed from: g */
        private final CampaignEx f37590g;

        /* JADX INFO: renamed from: h */
        private boolean f37591h;

        /* JADX INFO: renamed from: i */
        private String f37592i;

        /* JADX INFO: renamed from: j */
        private boolean f37593j;

        /* JADX INFO: renamed from: k */
        private boolean f37594k;

        public q(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, C14200a.a aVar, CampaignEx campaignEx, boolean z2, String str4) {
            this.f37585b = z;
            this.f37586c = windVaneWebView;
            this.f37587d = str2;
            this.f37588e = str3;
            this.f37589f = aVar;
            this.f37590g = campaignEx;
            this.f37584a = str;
            this.f37591h = z2;
            this.f37592i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        /* JADX INFO: renamed from: a */
        public void mo34467a(WebView webView, int i) {
            try {
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 2);
                c13157e.m37501a("result", Integer.valueOf(i));
                C13156d.m37475b().m37483a("2000155", this.f37590g, c13157e);
            } catch (Throwable th) {
                C13219q0.m37816b("WindVaneWebView", th.getMessage());
            }
            if (this.f37594k) {
                return;
            }
            if (this.f37586c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f37584a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a((WebView) this.f37586c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
            String str = this.f37588e + "_" + this.f37590g.getId() + "_" + this.f37590g.getRequestId() + "_" + this.f37587d;
            if (i == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37588e + "_" + this.f37592i + "_" + this.f37587d, true);
                C14200a.a aVar = this.f37589f;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                if (this.f37585b) {
                    if (this.f37590g.isBidCampaign()) {
                        C14200a.m42398a(str, this.f37589f, false, this.f37591h);
                    } else {
                        C14200a.m42398a(str, this.f37589f, false, this.f37591h);
                    }
                } else if (this.f37590g.isBidCampaign()) {
                    C14200a.m42398a(str, this.f37589f, false, this.f37591h);
                } else {
                    C14200a.m42398a(str, this.f37589f, false, this.f37591h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37588e + "_" + this.f37592i + "_" + this.f37587d, false);
                C14200a.a aVar2 = this.f37589f;
                if (aVar2 != null) {
                    aVar2.m42408a(false);
                }
            }
            this.f37594k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onPageFinished(WebView webView, String str) {
            if (this.f37593j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f37586c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f37584a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        C13392f.m38726a().m38728a((WebView) this.f37586c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37588e + "_" + this.f37592i + "_" + this.f37587d, true);
                C14200a.a aVar = this.f37589f;
                if (aVar != null) {
                    aVar.m42408a(true);
                }
                String str2 = this.f37588e + "_" + this.f37590g.getId() + "_" + this.f37590g.getRequestId() + "_" + this.f37587d;
                if (this.f37585b) {
                    if (this.f37590g.isBidCampaign()) {
                        C14200a.m42396a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f37590g.getRequestIdNotice(), this.f37589f);
                    } else {
                        C14200a.m42398a(str2, this.f37589f, false, this.f37591h);
                    }
                } else if (this.f37590g.isBidCampaign()) {
                    C14200a.m42396a(94, this.f37590g.getRequestIdNotice(), this.f37589f);
                } else {
                    C14200a.m42398a(str2, this.f37589f, false, this.f37591h);
                }
            }
            C13392f.m38726a().m38727a(webView);
            this.f37593j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.C13377b, com.mbridge.msdk.mbsignalcommon.windvane.InterfaceC13389c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f37588e + "_" + this.f37592i + "_" + this.f37587d, false);
            C14200a.a aVar = this.f37589f;
            if (aVar != null) {
                aVar.m42408a(false);
            }
            if (this.f37586c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f37584a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a((WebView) this.f37586c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.b$r */
    /* JADX INFO: compiled from: RewardCampaignsResourceManager.java */
    private static final class r {

        /* JADX INFO: renamed from: a */
        private static final C13608b f37595a = new C13608b(null);
    }

    private C13608b() {
        this.f37430c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f37431d = "down_type";
        this.f37432e = "h3c";
        this.f37433f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f37427g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f37428a = new m(handlerThread.getLooper());
    }

    /* synthetic */ C13608b(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    private int m38984a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            C13219q0.m37816b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C13154c m38986a(CampaignEx campaignEx, int i2) {
        C13154c c13154cM37489b = campaignEx != null ? C13156d.m37475b().m37489b(campaignEx.getCurrentLocalRid()) : null;
        if (c13154cM37489b == null) {
            c13154cM37489b = new C13154c();
        }
        c13154cM37489b.m37421a(campaignEx);
        c13154cM37489b.m37439f(m38984a(campaignEx));
        c13154cM37489b.m37437e(i2);
        return c13154cM37489b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38990a(int i2, CampaignEx campaignEx, String str, String str2) {
        C13236z.m37960a(i2, str, str2, new b(i2, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38991a(Context context, int i2, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        C13167a.m37546e().execute(new d(campaignEx, context, i2, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38992a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        C13154c c13154cM38986a = m38986a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f37428a, nVar, copyOnWriteArrayList);
                lVar.m39026a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(c13154cM38986a, str4, lVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f37428a, copyOnWriteArrayList);
            iVar.m39018a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(c13154cM38986a, str4, iVar);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38999a(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, C14223c c14223c, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (campaignEx == null || c14223c == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", "data is null");
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    return;
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        return;
                    }
                    return;
                }
            }
            if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j())) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().m36781j()) || !campaignEx.getRewardTemplateMode().m36781j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z, windVaneWebView, campaignEx, copyOnWriteArrayList, str, c14223c, str2), i2 * 1000);
                    return;
                } else {
                    C13219q0.m37813a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 1);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                C13392f.m38726a().m38728a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m39000a(boolean z, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, C14223c c14223c, String str4, boolean z2) {
        C14191k c14191k;
        String requestId;
        try {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", 2);
            C13156d.m37475b().m37483a("2000154", campaignEx, c13157e);
            C14200a.a aVar = new C14200a.a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C13008c.m36588n().m36542d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            aVar.m42406a(windVaneWebView2);
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                c14191k = new C14191k(null, campaignEx);
                requestId = campaignEx != null ? campaignEx.getRequestId() : "";
            } else {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42524b = C14203b.getInstance().m42524b(str3);
                if (copyOnWriteArrayListM42524b != null && copyOnWriteArrayListM42524b.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListM42524b) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                C14191k c14191k2 = new C14191k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                c14191k = c14191k2;
            }
            c14191k.mo42225g(i2);
            c14191k.setUnitId(str3);
            c14191k.m42378c(str4);
            c14191k.setRewardUnitSetting(c14223c);
            c14191k.m42381d(z);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, aVar, campaignEx, z2, requestId));
            windVaneWebView2.setObject(c14191k);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static C13082b m39001b(int i2, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        C13082b c13082b = new C13082b(i2);
        c13082b.m37018a(mBridgeIds);
        c13082b.m37021a(th);
        c13082b.m37024c(str);
        c13082b.m37017a(campaignEx);
        return c13082b;
    }

    /* JADX INFO: renamed from: b */
    public static C13608b m39002b() {
        return r.f37595a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m39004b(C13080n c13080n, CampaignEx campaignEx) {
        try {
            C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), campaignEx.getCampaignUnitId());
            if (c14223cM42671c != null) {
                c13080n.m37000s(c14223cM42671c.m42760x());
            }
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            if (c14221aM42670c != null) {
                c13080n.m36998r(c14221aM42670c.m42649f());
            }
        } catch (Exception e2) {
            C13219q0.m37816b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static int m39006c(int i2) {
        if (i2 == 200) {
            return 880004;
        }
        if (i2 == 201) {
            return 880007;
        }
        if (i2 != 203) {
            return i2 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public static synchronized String m39007d(int i2) {
        if (i2 == 200) {
            return "video";
        }
        if (i2 == 201) {
            return "zip/html";
        }
        if (i2 != 203) {
            return i2 != 205 ? "unknown" : "tpl";
        }
        return C11778Z3.f26659D;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m39008a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f37428a.m39027a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (C13229v0.m37917c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        m38990a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str3);
                    bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f37428a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.mo39031a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    C13154c c13154cM37489b = C13156d.m37475b().m37489b(campaignEx.getCurrentLocalRid());
                    if (c13154cM37489b == null) {
                        c13154cM37489b = new C13154c();
                    }
                    C13154c c13154c = c13154cM37489b;
                    c13154c.m37421a(campaignEx);
                    c13154c.m37437e(1);
                    c13154c.m37439f(m38984a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(c13154c, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e2) {
                    C13219q0.m37816b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m39009a(Context context, boolean z, int i2, boolean z2, int i3, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f37427g.put(str4, new f(z, z2, i2, copyOnWriteArrayList2.size(), str2, str3, i3, copyOnWriteArrayList2));
        this.f37428a.m39028a(str4, hVar);
        this.f37428a.m39027a(context);
        this.f37428a.m39029a(str4, copyOnWriteArrayList2);
        this.f37428a.post(new a(copyOnWriteArrayList2, context, str2, i3, str, str3, str4, nVar));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x017e A[Catch: all -> 0x01ab, TryCatch #4 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:56:0x017a, B:58:0x017e, B:60:0x0189, B:16:0x003d, B:22:0x0074, B:25:0x007a, B:27:0x0080, B:30:0x008b, B:32:0x00b9, B:34:0x00c0, B:29:0x0086, B:41:0x00e2, B:46:0x012b), top: B:71:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0189 A[Catch: all -> 0x01ab, TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0009, B:5:0x0021, B:9:0x0030, B:56:0x017a, B:58:0x017e, B:60:0x0189, B:16:0x003d, B:22:0x0074, B:25:0x007a, B:27:0x0080, B:30:0x008b, B:32:0x00b9, B:34:0x00c0, B:29:0x0086, B:41:0x00e2, B:46:0x012b), top: B:71:0x0009 }] */
    /* JADX INFO: renamed from: a */
    public synchronized void m39010a(boolean z, Handler handler, boolean z2, boolean z3, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, C14223c c14223c, o oVar) {
        String str7;
        String str8;
        String str9 = str4;
        synchronized (this) {
            String str10 = str9 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                if (C13229v0.m37938i(str)) {
                    if (oVar != null) {
                        try {
                            oVar.mo39033a(str10, str3, str9, str5, str, null);
                        } catch (Exception e2) {
                            e = e2;
                            str8 = str10;
                        }
                    }
                    return;
                }
                str8 = str10;
                try {
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("type", 2);
                    C13156d.m37475b().m37483a("2000154", campaignEx, c13157e);
                    C14200a.a aVar = new C14200a.a();
                    try {
                        try {
                            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C13008c.m36588n().m36542d());
                            if (campaignEx != null) {
                                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                            }
                            windVaneWebView2.setTempTypeForMetrics(2);
                            try {
                                aVar.m42406a(windVaneWebView2);
                                C14191k c14191k = (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) ? new C14191k(null, campaignEx) : new C14191k(null, campaignEx, copyOnWriteArrayList);
                                c14191k.mo42225g(i2);
                                c14191k.setUnitId(str9);
                                c14191k.setRewardUnitSetting(c14223c);
                                c14191k.m42381d(z);
                                str7 = str5;
                                try {
                                    windVaneWebView2.setWebViewListener(new p(handler, null, z2, z3, str7, oVar, windVaneWebView, str, str3, str9, aVar, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                    windVaneWebView2.setObject(c14191k);
                                    windVaneWebView2.loadUrl(str2);
                                    windVaneWebView2.setRid(str7);
                                } catch (Exception e3) {
                                    e = e3;
                                    str9 = str9;
                                    if (MBridgeConstans.DEBUG) {
                                        C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                    }
                                    if (oVar != null) {
                                        oVar.mo39032a(str8, str7, str, null, m39001b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
                                    }
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str7 = str5;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Exception unused) {
                        if (oVar != null) {
                            aVar.m42408a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str9);
                            sb.append("_");
                            sb.append(str);
                            oVar.mo39033a(sb.toString(), str3, str9, str5, str, aVar);
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        if (oVar != null) {
                            aVar.m42408a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str9);
                            sb2.append("_");
                            sb2.append(str);
                            oVar.mo39033a(sb2.toString(), str3, str9, str5, str, aVar);
                            return;
                        }
                        return;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
                str7 = str5;
            } catch (Exception e7) {
                e = e7;
                str7 = str5;
                str8 = str10;
            }
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
            if (oVar != null) {
                oVar.mo39032a(str8, str7, str, null, m39001b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m39011a(boolean z, Handler handler, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, C14223c c14223c, o oVar, boolean z4) {
        String str8;
        C14191k c14191k;
        String str9 = str4;
        synchronized (this) {
            this.f37429b = z4;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f37429b = z4;
            if (C13229v0.m37938i(str5)) {
                if (oVar != null) {
                    oVar.mo39033a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                C13219q0.m37813a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                C13157e c13157e = new C13157e();
                c13157e.m37501a("type", 1);
                C13156d.m37475b().m37483a("2000154", campaignEx, c13157e);
                C14200a.a aVar = new C14200a.a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C13008c.m36588n().m36542d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                aVar.m42406a(windVaneWebView);
                String strM41465b = C13893d.m41513c().m41465b();
                String strM41465b2 = C13893d.m41513c().m41465b();
                aVar.m42407a(strM41465b2);
                if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                    c14191k = new C14191k(null, campaignEx);
                } else {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListM42524b = C14203b.getInstance().m42524b(str9);
                    if (copyOnWriteArrayListM42524b != null && copyOnWriteArrayListM42524b.size() > 0) {
                        for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListM42524b) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i3, campaignEx2);
                                }
                            }
                        }
                    }
                    c14191k = new C14191k(null, campaignEx, copyOnWriteArrayList);
                }
                c14191k.mo42225g(i2);
                c14191k.setUnitId(str7);
                c14191k.m42378c(strM41465b2);
                c14191k.m42380d(strM41465b);
                c14191k.m42379c(true);
                c14191k.setRewardUnitSetting(c14223c);
                c14191k.m42381d(z);
                C14191k c14191k2 = c14191k;
                try {
                    str9 = str4;
                    str8 = str;
                    try {
                        windVaneWebView.setWebViewListener(new g(z, handler, null, z2, z3, i2, str5, str3, str4, str, aVar, campaignEx, copyOnWriteArrayList, c14223c, oVar, z4, jCurrentTimeMillis));
                        windVaneWebView.setObject(c14191k2);
                        windVaneWebView.loadUrl(str6);
                        windVaneWebView.setRid(str8);
                        MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(C13008c.m36588n().m36542d());
                        mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTRootLayout.setInstanceId(strM41465b);
                        mBridgeBTRootLayout.setUnitId(str9);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(C13008c.m36588n().m36542d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strM41465b2);
                        mBridgeBTLayout.setUnitId(str9);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        AbstractMap abstractMapM41466b = C13893d.m41513c().m41466b(str9, str8);
                        abstractMapM41466b.put(strM41465b2, mBridgeBTLayout);
                        abstractMapM41466b.put(strM41465b, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e2) {
                        e = e2;
                        if (oVar != null) {
                            oVar.mo39032a(str10, str8, str5, null, m39001b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            C13219q0.m37816b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e4) {
                e = e4;
                str8 = str;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39012c() {
    }
}
