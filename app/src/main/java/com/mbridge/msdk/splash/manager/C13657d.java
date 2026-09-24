package com.mbridge.msdk.splash.manager;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.nativeview.InterfaceC13705a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.d */
/* JADX INFO: compiled from: ResManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13657d {

    /* JADX INFO: renamed from: a */
    private static int f38242a = 1;

    /* JADX INFO: renamed from: b */
    public static C13015e f38243b = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.d$a */
    /* JADX INFO: compiled from: ResManager.java */
    class a implements InterfaceC14217a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MBSplashView f38244a;

        a(MBSplashView mBSplashView) {
            this.f38244a = mBSplashView;
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34468a(String str) {
            this.f38244a.setVideoReady(true);
        }

        @Override // com.mbridge.msdk.videocommon.listener.InterfaceC14217a
        /* JADX INFO: renamed from: a */
        public void mo34469a(String str, String str2) {
            this.f38244a.setVideoReady(false);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.d$b */
    /* JADX INFO: compiled from: ResManager.java */
    class b implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC13705a f38245a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MBSplashView f38246b;

        b(InterfaceC13705a interfaceC13705a, MBSplashView mBSplashView) {
            this.f38245a = interfaceC13705a;
            this.f38246b = mBSplashView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
            InterfaceC13705a interfaceC13705a = this.f38245a;
            if (interfaceC13705a != null) {
                interfaceC13705a.mo39945b();
            }
            MBSplashView mBSplashView = this.f38246b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(false);
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            InterfaceC13705a interfaceC13705a = this.f38245a;
            if (interfaceC13705a != null) {
                interfaceC13705a.mo39944a();
            }
            MBSplashView mBSplashView = this.f38246b;
            if (mBSplashView != null) {
                mBSplashView.setImageReady(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.d$c */
    /* JADX INFO: compiled from: ResManager.java */
    class c implements InterfaceC13101c {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static CampaignEx m39876a(CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(campaignEx.getAdZip()) || (!TextUtils.isEmpty(campaignEx.getAdHtml()) && campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
            return campaignEx;
        }
        campaignEx.setHasMBTplMark(false);
        campaignEx.setIsMraid(true);
        return campaignEx;
    }

    /* JADX INFO: renamed from: a */
    public static CampaignEx m39877a(MBSplashView mBSplashView, String str, String str2, String str3, boolean z, int i, boolean z2, boolean z3) {
        if (f38243b == null) {
            f38243b = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
        if (c13635gM39718d == null) {
            c13635gM39718d = C13636h.m39706b().m39708a();
        }
        long jM39477b0 = c13635gM39718d.m39477b0() * 1000;
        long jM39486c0 = c13635gM39718d.m39486c0() * 1000;
        m39879a(jM39486c0, str2);
        List<CampaignEx> listM36651a = f38243b.m36651a(str2, 0, 0, f38242a, !TextUtils.isEmpty(str3));
        if (listM36651a != null && listM36651a.size() > 0) {
            CampaignEx campaignEx = listM36651a.get(0);
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - jM39477b0;
            if (z2) {
                if ((campaignEx.getPlct() <= 0 || (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() < jCurrentTimeMillis) && (campaignEx.getPlct() > 0 || campaignEx.getTimestamp() < j)) {
                    if (m39885a(mBSplashView, campaignEx, str, str2, z, i, z3) && campaignEx.isSpareOffer(jM39477b0, jM39486c0)) {
                        return m39876a(campaignEx);
                    }
                } else if (m39885a(mBSplashView, campaignEx, str, str2, z, i, z3)) {
                    return m39876a(campaignEx);
                }
            } else if (((campaignEx.getPlct() > 0 && (campaignEx.getPlct() * 1000) + campaignEx.getTimestamp() >= jCurrentTimeMillis) || (campaignEx.getPlct() <= 0 && campaignEx.getTimestamp() >= j)) && m39885a(mBSplashView, campaignEx, str, str2, z, i, z3)) {
                return m39876a(campaignEx);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m39878a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                return "";
            }
            return "file:///" + file.getAbsolutePath();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m39879a(long j, String str) {
        if (f38243b == null) {
            f38243b = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f38243b.m36652a(j, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m39880a(CampaignEx campaignEx, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        if (f38243b == null) {
            f38243b = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f38243b.m36667a(arrayList, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m39881a(MBSplashView mBSplashView, CampaignEx campaignEx, InterfaceC13705a interfaceC13705a) {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(campaignEx.getImageUrl(), new b(interfaceC13705a, mBSplashView));
        if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
            return;
        }
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(campaignEx.getIconUrl(), new c());
    }

    /* JADX INFO: renamed from: a */
    private static void m39882a(MBSplashView mBSplashView, CampaignEx campaignEx, String str) {
        a aVar = new a(mBSplashView);
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        C14203b.getInstance().createUnitCache(C13008c.m36588n().m36542d(), str, copyOnWriteArrayList, 297, aVar);
        if (C14203b.getInstance().m42526b(297, str, campaignEx.isBidCampaign())) {
            mBSplashView.setVideoReady(true);
        } else {
            C14203b.getInstance().load(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m39883a(MBSplashView mBSplashView, String str, CampaignEx campaignEx, String str2, String str3, boolean z, int i) {
        C13660g.d dVar = new C13660g.d();
        dVar.m39960c(str3);
        dVar.m39958b(str2);
        dVar.m39954a(campaignEx);
        dVar.m39955a(str);
        dVar.m39956a(z);
        dVar.m39953a(i);
        C13660g.m39946a().m39949a(mBSplashView, dVar, null);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m39884a(MBSplashView mBSplashView, CampaignEx campaignEx) {
        if (mBSplashView == null) {
            return false;
        }
        boolean zIsVideoReady = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? mBSplashView.isVideoReady() : true;
        if (zIsVideoReady && !TextUtils.isEmpty(campaignEx.getAdZip())) {
            zIsVideoReady = mBSplashView.isH5Ready();
        }
        if (zIsVideoReady && TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zIsVideoReady = mBSplashView.isH5Ready();
        }
        if (TextUtils.isEmpty(campaignEx.getAdZip()) && TextUtils.isEmpty(campaignEx.getAdHtml())) {
            zIsVideoReady = false;
        }
        if (!campaignEx.isDynamicView()) {
            return zIsVideoReady;
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return false;
        }
        return mBSplashView.isImageReady();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m39885a(MBSplashView mBSplashView, CampaignEx campaignEx, String str, String str2, boolean z, int i, boolean z2) {
        boolean z3;
        if (campaignEx != null) {
            mBSplashView.clearResState();
            if (TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                z3 = true;
            } else {
                boolean z4 = mBSplashView.isVideoReady() || C14203b.getInstance().m42526b(297, str2, campaignEx.isBidCampaign());
                if (z4) {
                    mBSplashView.setVideoReady(true);
                } else {
                    m39882a(mBSplashView, campaignEx, str2);
                }
                z3 = z4;
            }
            if (!TextUtils.isEmpty(campaignEx.getAdZip()) && !mBSplashView.isH5Ready()) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(campaignEx.getAdZip());
                if (TextUtils.isEmpty(h5ResAddress)) {
                    z3 = false;
                } else if (!z2) {
                    m39883a(mBSplashView, h5ResAddress, campaignEx, str, str2, z, i);
                }
            }
            if (TextUtils.isEmpty(campaignEx.getAdZip()) && !TextUtils.isEmpty(campaignEx.getAdHtml()) && !mBSplashView.isH5Ready()) {
                String strM39878a = m39878a(campaignEx.getAdHtml());
                if (TextUtils.isEmpty(strM39878a)) {
                    z3 = false;
                } else if (!z2) {
                    m39883a(mBSplashView, strM39878a, campaignEx, str, str2, z, i);
                }
            }
            if (!campaignEx.isDynamicView()) {
                return z3;
            }
            if (!TextUtils.isEmpty(campaignEx.getImageUrl()) && !mBSplashView.isImageReady()) {
                if (C13100b.m37152a(C13008c.m36588n().m36542d()).m37158c(campaignEx.getImageUrl())) {
                    mBSplashView.setImageReady(true);
                    return true;
                }
                m39881a(mBSplashView, campaignEx, (InterfaceC13705a) null);
                return z3;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m39886b(String str) {
        if (f38243b == null) {
            f38243b = C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d()));
        }
        f38243b.m36654a(str, 0, f38242a);
    }
}
