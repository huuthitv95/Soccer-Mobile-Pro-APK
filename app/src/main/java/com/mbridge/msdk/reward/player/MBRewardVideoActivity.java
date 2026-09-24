package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.hbisoft.hbrecorder.Constants;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.threadpool.C13167a;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.reward.report.metrics.C13624a;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.dynview.constant.C13943a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13948a;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13951d;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.report.C14075b;
import com.mbridge.msdk.video.p291bt.module.MBTempContainer;
import com.mbridge.msdk.video.p291bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13933b;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.C14200a;
import com.mbridge.msdk.videocommon.cache.C14201a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.entity.C14216c;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.videocommon.setting.C14223c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";

    /* JADX INFO: renamed from: A */
    private MBTempContainer f37840A;

    /* JADX INFO: renamed from: B */
    private MBridgeBTContainer f37841B;

    /* JADX INFO: renamed from: C */
    private WindVaneWebView f37842C;

    /* JADX INFO: renamed from: D */
    private InterfaceC13930a f37843D;

    /* JADX INFO: renamed from: E */
    private String f37844E;

    /* JADX INFO: renamed from: F */
    private String f37845F;

    /* JADX INFO: renamed from: G */
    private boolean f37846G;

    /* JADX INFO: renamed from: O */
    private String f37854O;

    /* JADX INFO: renamed from: P */
    private C13154c f37855P;

    /* JADX INFO: renamed from: R */
    private boolean f37857R;

    /* JADX INFO: renamed from: g */
    private String f37872g;

    /* JADX INFO: renamed from: h */
    private String f37873h;

    /* JADX INFO: renamed from: i */
    private String f37874i;

    /* JADX INFO: renamed from: j */
    private C14216c f37875j;

    /* JADX INFO: renamed from: n */
    private int f37879n;

    /* JADX INFO: renamed from: o */
    private int f37880o;

    /* JADX INFO: renamed from: p */
    private int f37881p;

    /* JADX INFO: renamed from: s */
    private InterfaceC13939h f37884s;

    /* JADX INFO: renamed from: t */
    private C14223c f37885t;

    /* JADX INFO: renamed from: w */
    private C14202a f37888w;

    /* JADX INFO: renamed from: x */
    private CampaignEx f37889x;

    /* JADX INFO: renamed from: y */
    private List<C14202a> f37890y;

    /* JADX INFO: renamed from: z */
    private List<CampaignEx> f37891z;

    /* JADX INFO: renamed from: k */
    private int f37876k = 2;

    /* JADX INFO: renamed from: l */
    private boolean f37877l = false;

    /* JADX INFO: renamed from: m */
    private boolean f37878m = false;

    /* JADX INFO: renamed from: q */
    private boolean f37882q = false;

    /* JADX INFO: renamed from: r */
    private boolean f37883r = false;

    /* JADX INFO: renamed from: u */
    private boolean f37886u = false;

    /* JADX INFO: renamed from: v */
    private boolean f37887v = false;

    /* JADX INFO: renamed from: H */
    private int f37847H = 1;

    /* JADX INFO: renamed from: I */
    private int f37848I = 0;

    /* JADX INFO: renamed from: J */
    private int f37849J = 0;

    /* JADX INFO: renamed from: K */
    private int f37850K = 0;

    /* JADX INFO: renamed from: L */
    private int f37851L = 0;

    /* JADX INFO: renamed from: M */
    private int f37852M = 0;

    /* JADX INFO: renamed from: N */
    private int f37853N = 0;

    /* JADX INFO: renamed from: Q */
    private boolean f37856Q = false;

    /* JADX INFO: renamed from: S */
    private AdSession f37858S = null;

    /* JADX INFO: renamed from: T */
    private MediaEvents f37859T = null;

    /* JADX INFO: renamed from: U */
    private AdEvents f37860U = null;

    /* JADX INFO: renamed from: V */
    private long f37861V = 0;

    /* JADX INFO: renamed from: W */
    private String f37862W = "";

    /* JADX INFO: renamed from: X */
    private Boolean f37863X = null;

    /* JADX INFO: renamed from: Y */
    private int f37864Y = 0;

    /* JADX INFO: renamed from: Z */
    private boolean f37865Z = false;

    /* JADX INFO: renamed from: a0 */
    private boolean f37866a0 = false;

    /* JADX INFO: renamed from: b0 */
    private boolean f37867b0 = false;

    /* JADX INFO: renamed from: c0 */
    private int f37868c0 = -1;

    /* JADX INFO: renamed from: d0 */
    private String f37869d0 = AbstractJsonLexerKt.NULL;

    /* JADX INFO: renamed from: e0 */
    private InterfaceC13948a f37870e0 = new C13616a();

    /* JADX INFO: renamed from: f0 */
    private InterfaceC13951d f37871f0 = new C13617b();

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$a */
    class C13616a implements InterfaceC13948a {
        C13616a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13948a
        /* JADX INFO: renamed from: a */
        public void mo39337a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f37876k = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey(C11744X3.i.f26338L)) {
                int iIntValue = ((Integer) map.get(C11744X3.i.f26338L)).intValue();
                if (MBRewardVideoActivity.this.f37891z == null || MBRewardVideoActivity.this.f37891z.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f37889x = (CampaignEx) mBRewardVideoActivity.f37891z.get(iIntValue);
                MBRewardVideoActivity.m39335m(MBRewardVideoActivity.this);
                int i = iIntValue - 1;
                if (MBRewardVideoActivity.this.f37891z.get(i) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.m39309b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f37891z.get(i)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f37889x.setVideoCompleteTime(mBRewardVideoActivity3.m39299a(mBRewardVideoActivity3.f37889x.getVideoCompleteTime(), MBRewardVideoActivity.this.f37847H));
                MBRewardVideoActivity.this.f37889x.setShowIndex(MBRewardVideoActivity.this.f37847H);
                MBRewardVideoActivity.this.f37889x.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.m39316c(mBRewardVideoActivity4.f37889x);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$b */
    class C13617b implements InterfaceC13951d {
        C13617b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13951d
        /* JADX INFO: renamed from: a */
        public void mo39338a() {
            if (MBRewardVideoActivity.this.f37841B != null) {
                new C13975b().m41854b(MBRewardVideoActivity.this.f37841B, 500L);
            }
            MBRewardVideoActivity.this.f37882q = true;
            MBRewardVideoActivity.this.m39331j();
            if (MBRewardVideoActivity.this.f37840A != null) {
                MBRewardVideoActivity.this.f37840A.setNotchPadding(MBRewardVideoActivity.this.f37853N, MBRewardVideoActivity.this.f37849J, MBRewardVideoActivity.this.f37851L, MBRewardVideoActivity.this.f37850K, MBRewardVideoActivity.this.f37852M);
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.InterfaceC13951d
        /* JADX INFO: renamed from: a */
        public void mo39339a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.m39313b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.f37841B != null) {
                new C13975b().m41854b(MBRewardVideoActivity.this.f37841B, 500L);
            }
            MBRewardVideoActivity.this.f37889x = campaignEx;
            MBRewardVideoActivity.this.f37889x.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.m39316c(mBRewardVideoActivity.f37889x);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$c */
    class C13618c implements InterfaceC13930a {
        C13618c() {
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39340a() {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39290a(MBRewardVideoActivity.this.f37855P);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39341a(int i, String str, String str2) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39289a(i, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39342a(String str) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39291a(MBRewardVideoActivity.this.f37855P, str);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39343a(String str, String str2) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39293a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39344a(boolean z, int i) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39294a(z, i);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39345a(boolean z, C14216c c14216c) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39292a(MBRewardVideoActivity.this.f37855P, z, c14216c);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: a */
        public void mo39346a(boolean z, String str, String str2) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39295a(z, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13930a
        /* JADX INFO: renamed from: b */
        public void mo39347b(String str, String str2) {
            if (MBRewardVideoActivity.this.f37884s != null) {
                MBRewardVideoActivity.this.f37884s.mo39296b(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$d */
    class C13619d implements InterfaceC13083a {
        C13619d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$e */
    private static final class RunnableC13620e implements Runnable {

        /* JADX INFO: renamed from: a */
        private final List<C14202a> f37896a;

        /* JADX INFO: renamed from: b */
        private final String f37897b;

        /* JADX INFO: renamed from: c */
        private final String f37898c;

        public RunnableC13620e(List<C14202a> list, String str, String str2) {
            this.f37896a = list;
            this.f37897b = str;
            this.f37898c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<C14202a> list = this.f37896a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (C14202a c14202a : this.f37896a) {
                    if (c14202a != null && c14202a.m42497h() != null) {
                        CampaignEx campaignExM42497h = c14202a.m42497h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExM42497h);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                C13219q0.m37817b("MBRewardVideoActivity", "AppletModelManager remove error", e);
                            }
                        }
                        C14203b.getInstance().m42528c(this.f37897b, campaignExM42497h.getRequestId() + campaignExM42497h.getId() + campaignExM42497h.getVideoUrlEncode());
                        if (campaignExM42497h.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExM42497h.getRewardTemplateMode().m36781j())) {
                                C14200a.m42404e(this.f37897b + "_" + campaignExM42497h.getId() + "_" + this.f37898c + "_" + campaignExM42497h.getRewardTemplateMode().m36781j());
                                C14200a.m42400b(campaignExM42497h.getAdType(), campaignExM42497h);
                            }
                            if (!TextUtils.isEmpty(campaignExM42497h.getCMPTEntryUrl())) {
                                C14200a.m42404e(this.f37897b + "_" + this.f37898c + "_" + campaignExM42497h.getCMPTEntryUrl());
                            }
                            C14201a.m42411a().m42420a(this.f37897b, campaignExM42497h);
                        }
                    }
                }
            } catch (Exception e2) {
                C13219q0.m37813a("MBRewardVideoActivity", e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.player.MBRewardVideoActivity$f */
    private static final class RunnableC13621f implements Runnable {

        /* JADX INFO: renamed from: a */
        private final List<C14202a> f37899a;

        /* JADX INFO: renamed from: b */
        private final String f37900b;

        public RunnableC13621f(String str, List<C14202a> list) {
            this.f37899a = list;
            this.f37900b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<C14202a> list = this.f37899a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (C14202a c14202a : this.f37899a) {
                    if (c14202a != null && c14202a.m42497h() != null) {
                        C14201a.m42411a().m42418a(c14202a.m42497h(), this.f37900b);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public int m39299a(int i, int i2) {
        List<CampaignEx> list = this.f37891z;
        if (list != null && list.size() != 0) {
            int videoLength = 0;
            int videoCompleteTime = 0;
            for (int i3 = 0; i3 < this.f37891z.size(); i3++) {
                if (this.f37891z.get(0) != null) {
                    if (i3 == 0) {
                        videoCompleteTime = this.f37891z.get(0).getVideoCompleteTime();
                    }
                    videoLength += this.f37891z.get(i3).getVideoLength();
                }
            }
            if (i2 == 1) {
                if (i == 0) {
                    if (videoLength >= 45) {
                        return 45;
                    }
                } else if (videoLength > i) {
                    if (i > 45) {
                        return 45;
                    }
                }
                return videoLength;
            }
            int videoLength2 = 0;
            for (int i4 = 0; i4 < i2 - 1; i4++) {
                if (this.f37891z.get(i4) != null) {
                    videoLength2 += this.f37891z.get(i4).getVideoLength();
                }
            }
            if (videoCompleteTime > videoLength2) {
                return videoCompleteTime - videoLength2;
            }
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private WindVaneWebView m39303a(String str) {
        C14200a.a aVarM42399b = C14200a.m42399b(str);
        if (aVarM42399b != null) {
            return aVarM42399b.m42409b();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m39305a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                C13100b.m37152a(C13008c.m36588n().m36542d()).m37154a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            C13100b.m37152a(C13008c.m36588n().m36542d()).m37154a(campaignEx.getIconUrl());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m39307a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.f37857R) {
            return;
        }
        if (list == null) {
            try {
                if (this.f37882q) {
                    list = this.f37891z;
                } else {
                    list = new ArrayList<>();
                    List<C14202a> list2 = this.f37890y;
                    if (list2 != null && list2.get(0) != null && this.f37890y.get(0).m42497h() != null) {
                        list.add(this.f37890y.get(0).m42497h());
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            C13157e c13157e = new C13157e();
            c13157e.m37501a("context_status", Integer.valueOf(this.f37868c0));
            c13157e.m37501a("activity_name", this.f37869d0);
            C13154c c13154cM37489b = C13156d.m37475b().m37489b(currentLocalRid);
            this.f37855P = c13154cM37489b;
            c13154cM37489b.m37423a("2000129", c13157e);
        }
        if (this.f37855P == null) {
            this.f37855P = new C13154c();
            C13157e c13157e2 = new C13157e();
            c13157e2.m37501a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f37872g);
            c13157e2.m37501a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f37878m ? 1 : 0));
            c13157e2.m37501a("adtp", Integer.valueOf(this.f37877l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            c13157e2.m37501a("lrid", this.f37854O);
            c13157e2.m37501a("his_reason", "show campaign is null");
            c13157e2.m37501a("context_status", Integer.valueOf(this.f37868c0));
            c13157e2.m37501a("activity_name", this.f37869d0);
            this.f37855P.m37423a("2000129", c13157e2);
        }
        if (list != null) {
            this.f37855P.m37429b(list);
        }
        this.f37857R = true;
        C13624a.m39351a().m39354a("2000129", this.f37855P);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m39309b(MBRewardVideoActivity mBRewardVideoActivity, int i) {
        int i2 = mBRewardVideoActivity.f37848I - i;
        mBRewardVideoActivity.f37848I = i2;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    private void m39310b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.f37858S == null) {
                    AdSession adSessionM38946a = C13439b.m38946a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f37872g, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.f37858S = adSessionM38946a;
                    if (adSessionM38946a != null) {
                        this.f37860U = AdEvents.createAdEvents(adSessionM38946a);
                        this.f37859T = MediaEvents.createMediaEvents(this.f37858S);
                    }
                }
            } catch (Throwable th) {
                C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m39313b(String str) {
        C13219q0.m37816b("MBRewardVideoActivity", str);
        m39307a(this.f37891z);
        InterfaceC13939h interfaceC13939h = this.f37884s;
        if (interfaceC13939h != null) {
            interfaceC13939h.mo39291a(this.f37855P, str);
        }
        finish();
    }

    /* JADX INFO: renamed from: b */
    private void m39314b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            m39313b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            m39313b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.f37854O = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            m39333k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.f37848I += campaignEx.getVideoLength();
            }
        }
        m39321e(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m39316c(CampaignEx campaignEx) {
        CampaignEx campaignExM42497h;
        try {
            List<C14202a> list = this.f37890y;
            if (list != null && list.size() > 0) {
                for (C14202a c14202a : this.f37890y) {
                    if (c14202a != null && (campaignExM42497h = c14202a.m42497h()) != null && TextUtils.equals(campaignExM42497h.getId(), campaignEx.getId()) && TextUtils.equals(campaignExM42497h.getRequestId(), campaignEx.getRequestId())) {
                        this.f37888w = c14202a;
                    }
                }
            }
            this.f37882q = true;
            m39331j();
            MBTempContainer mBTempContainer = this.f37840A;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.f37853N, this.f37849J, this.f37851L, this.f37850K, this.f37852M);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBRewardVideoActivity", e.getMessage());
            m39313b("more offer to one offer exception");
        }
    }

    /* JADX INFO: renamed from: d */
    private void m39318d(CampaignEx campaignEx) {
        C13622a.m39348a(this, campaignEx, this.f37885t, this.f37872g);
    }

    /* JADX INFO: renamed from: e */
    private void m39320e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f37872g, this.f37877l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableM36524a != null) {
                ImageView imageView = new ImageView(C13008c.m36588n().m36542d());
                C13229v0.m37880a(imageView, bitmapDrawableM36524a, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                AdSession adSession = this.f37858S;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m39321e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            m39313b("campaign is less");
            return;
        }
        int iM39299a = m39299a(campaignEx.getVideoCompleteTime(), this.f37847H);
        this.f37889x = campaignEx;
        campaignEx.setCampaignIsFiltered(true);
        this.f37847H = 1;
        this.f37889x.setVideoCompleteTime(iM39299a);
        this.f37889x.setShowIndex(this.f37847H);
        this.f37889x.setShowType(1);
        m39316c(this.f37889x);
    }

    /* JADX INFO: renamed from: f */
    private void m39323f() {
        InterfaceC13939h interfaceC13939h = this.f37884s;
        if (interfaceC13939h == null || !(interfaceC13939h instanceof C13933b)) {
            return;
        }
        try {
            C13933b c13933b = (C13933b) interfaceC13939h;
            Boolean boolM41688d = c13933b.m41688d();
            Boolean boolM41687c = c13933b.m41687c();
            if (boolM41688d == null && boolM41687c == null) {
                this.f37863X = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.f37863X = Boolean.valueOf(bool.equals(boolM41688d) && bool.equals(boolM41687c));
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    private void m39325g() {
        InterfaceC13939h interfaceC13939h;
        try {
            Boolean bool = this.f37863X;
            if ((bool == null || bool.booleanValue()) && (interfaceC13939h = this.f37884s) != null) {
                interfaceC13939h.mo39291a(this.f37855P, "show fail : unexpected destroy");
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m39327h() {
        try {
            List<CampaignEx> list = this.f37891z;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f37891z.iterator();
                while (it.hasNext()) {
                    m39305a(it.next());
                }
            }
            CampaignEx campaignEx = this.f37889x;
            if (campaignEx != null) {
                m39305a(campaignEx);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    private InterfaceC13930a m39328i() {
        if (this.f37843D == null) {
            this.f37843D = new C13618c();
        }
        return this.f37843D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m39331j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!C13203i0.m37709a(iFindID)) {
            m39313b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.f37840A = mBTempContainer;
        if (mBTempContainer == null) {
            m39313b("env error");
        }
        List<CampaignEx> list3 = this.f37891z;
        if (list3 == null || list3.size() <= 0 || !this.f37891z.get(0).isDynamicView()) {
            this.f37840A.setVisibility(0);
        } else {
            new C13975b().m41850a(this.f37840A, 500L);
        }
        changeHalfScreenPadding(-1);
        this.f37840A.setActivity(this);
        this.f37840A.setBidCampaign(this.f37878m);
        this.f37840A.setBigOffer(this.f37882q);
        this.f37840A.setUnitId(this.f37872g);
        this.f37840A.setCampaign(this.f37889x);
        if (this.f37889x.getDynamicTempCode() == 5 && (list2 = this.f37891z) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            this.f37840A.removeAllViews();
            this.f37840A.setCampOrderViewData(this.f37891z, this.f37848I);
            this.f37840A.setCamPlayOrderCallback(this.f37870e0, this.f37847H);
        }
        this.f37840A.setCampaignDownLoadTask(this.f37888w);
        this.f37840A.setIV(this.f37877l);
        CampaignEx campaignEx2 = this.f37889x;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.f37840A.setIVRewardEnable(this.f37879n, this.f37880o, this.f37881p);
        } else {
            this.f37840A.setIVRewardEnable(0, 0, 0);
        }
        this.f37840A.setMute(this.f37876k);
        CampaignEx campaignEx3 = this.f37889x;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f37891z) != null && list.size() > 0 && this.f37891z.get(0) != null && (rewardPlus = this.f37891z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C14216c c14216c = new C14216c(rewardPlus.getName(), rewardPlus.getAmount());
            if (c14216c.m42623a() < 0) {
                c14216c.m42624a(1);
            }
            this.f37875j = c14216c;
        }
        this.f37840A.setReward(this.f37875j);
        this.f37840A.setRewardUnitSetting(this.f37885t);
        this.f37840A.setPlacementId(this.f37873h);
        this.f37840A.setUserId(this.f37874i);
        this.f37840A.setShowRewardListener(this.f37884s);
        this.f37840A.setDeveloperExtraData(this.f37845F);
        this.f37840A.init(this);
        this.f37840A.setAdSession(this.f37858S);
        this.f37840A.setAdEvents(this.f37860U);
        this.f37840A.setVideoEvents(this.f37859T);
        this.f37840A.onCreate();
        if (!C13884b.m41421a() || (campaignEx = this.f37889x) == null) {
            return;
        }
        m39318d(campaignEx);
    }

    /* JADX INFO: renamed from: k */
    private void m39333k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!C13203i0.m37709a(iFindID)) {
            m39313b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.f37841B = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            m39313b("env error");
        }
        this.f37841B.setVisibility(0);
        InterfaceC13930a interfaceC13930aM39328i = m39328i();
        this.f37843D = interfaceC13930aM39328i;
        this.f37841B.setBTContainerCallback(interfaceC13930aM39328i);
        this.f37841B.setShowRewardVideoListener(this.f37884s);
        this.f37841B.setChoiceOneCallback(this.f37871f0);
        this.f37841B.setCampaigns(this.f37891z);
        this.f37841B.setCampaignDownLoadTasks(this.f37890y);
        this.f37841B.setRewardUnitSetting(this.f37885t);
        this.f37841B.setUnitId(this.f37872g);
        this.f37841B.setPlacementId(this.f37873h);
        this.f37841B.setUserId(this.f37874i);
        this.f37841B.setActivity(this);
        CampaignEx campaignEx = this.f37889x;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f37891z.get(0) != null && (rewardPlus = this.f37891z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            C14216c c14216c = new C14216c(rewardPlus.getName(), rewardPlus.getAmount());
            if (c14216c.m42623a() < 0) {
                c14216c.m42624a(1);
            }
            this.f37875j = c14216c;
        }
        this.f37841B.setReward(this.f37875j);
        this.f37841B.setIVRewardEnable(this.f37879n, this.f37880o, this.f37881p);
        this.f37841B.setIV(this.f37877l);
        this.f37841B.setMute(this.f37876k);
        this.f37841B.setJSFactory((C14177b) this.jsFactory);
        this.f37841B.setDeveloperExtraData(this.f37845F);
        this.f37841B.init(this);
        this.f37841B.setAdSession(this.f37858S);
        this.f37841B.setVideoEvents(this.f37859T);
        this.f37841B.setAdEvents(this.f37860U);
        this.f37841B.onCreate(this.f37856Q);
        if (!C13884b.m41421a() || (list = this.f37891z) == null || list.size() <= 0 || this.f37891z.get(0) == null) {
            return;
        }
        m39318d(this.f37891z.get(0));
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ int m39335m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i = mBRewardVideoActivity.f37847H;
        mBRewardVideoActivity.f37847H = i + 1;
        return i;
    }

    public void changeHalfScreenPadding(int i) {
        int iM37927f;
        int iM37930g;
        int iM37930g2;
        float f;
        try {
            CampaignEx campaignEx = this.f37889x;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37840A.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f37889x.getRewardTemplateMode().m36778g() == 0) {
                if (i == 2) {
                    iM37927f = (int) (C13229v0.m37927f(this) * 0.6f);
                    iM37930g2 = C13229v0.m37930g(this);
                    f = iM37930g2 * 0.6f;
                } else {
                    iM37927f = (int) (C13229v0.m37927f(this) * 0.6f);
                    iM37930g = C13229v0.m37930g(this);
                    f = iM37930g * 0.7f;
                }
            } else if (this.f37889x.getRewardTemplateMode().m36778g() == 2) {
                iM37927f = (int) (C13229v0.m37927f(this) * 0.6f);
                iM37930g2 = C13229v0.m37930g(this);
                f = iM37930g2 * 0.6f;
            } else {
                iM37927f = (int) (C13229v0.m37927f(this) * 0.6f);
                iM37930g = C13229v0.m37930g(this);
                f = iM37930g * 0.7f;
            }
            layoutParams.height = iM37927f;
            layoutParams.width = (int) f;
            this.f37840A.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return C13203i0.m37707a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C13203i0.m37707a(getApplicationContext(), str, "layout");
    }

    @Override // android.app.Activity
    public void finish() {
        this.f37865Z = true;
        C13008c.m36588n().m36534b(0);
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f37840A = null;
        }
        C13084b.m37036b().m37054d(this.f37872g);
        if (this.f37858S != null) {
            C13219q0.m37816b("omsdk", "mbrewardvideoac finish");
            this.f37858S.removeAllFriendlyObstructions();
            this.f37858S.finish();
            this.f37858S = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f37841B = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
        this.f37867b0 = true;
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.f37866a0 = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f37840A != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.f37840A.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        List<C14202a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        if (C13008c.m36588n().m36546f() != null) {
            this.f37869d0 = C13008c.m36588n().m36546f().getClass().getSimpleName();
        }
        C13008c.m36588n().m36527a(this);
        this.f37861V = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onCreate";
        } else {
            str = this.f37862W + "_onCreate";
        }
        this.f37862W = str;
        try {
            Intent intent = getIntent();
            this.f37872g = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f37873h = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f37875j = C14216c.m42619a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f37874i = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f37876k = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.f37877l = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            C13008c c13008cM36588n = C13008c.m36588n();
            boolean z = this.f37877l;
            int i = MBSupportMuteAdType.INTERSTITIAL_VIDEO;
            c13008cM36588n.m36534b(z ? 287 : 94);
            this.f37878m = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.f37845F = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            this.f37856Q = intent.getBooleanExtra("is_refactor", false);
            if ((intent.getFlags() & 268435456) != 0) {
                this.f37868c0 = 0;
            } else {
                this.f37868c0 = 1;
            }
            if (this.f37856Q) {
                this.f37884s = MBridgeGlobalCommon.showRewardListenerMap.get(this.f37872g);
            } else {
                this.f37884s = C13613a.f37720f0.get(this.f37872g);
            }
            if (this.f37877l) {
                this.f37879n = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f37880o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f37881p = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f37882q = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f37890y = C14203b.getInstance().m42517a(this.f37872g);
            this.f37891z = C14203b.getInstance().m42524b(this.f37872g);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!C13203i0.m37709a(iFindLayout)) {
                m39313b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f37872g)) {
                m39313b("data empty error");
                return;
            }
            C14177b c14177b = new C14177b(this);
            this.jsFactory = c14177b;
            registerJsFactory(c14177b);
            InterfaceC13939h interfaceC13939h = this.f37884s;
            if (interfaceC13939h == null) {
                m39313b("showRewardListener is null");
                return;
            }
            this.f37864Y = interfaceC13939h.hashCode();
            C14223c c14223c = RewardUnitCacheManager.getInstance().get(this.f37873h, this.f37872g);
            this.f37885t = c14223c;
            if (c14223c == null) {
                C14223c c14223cM42671c = C14222b.m42658b().m42671c(C13008c.m36588n().m36533b(), this.f37872g);
                this.f37885t = c14223cM42671c;
                if (c14223cM42671c == null) {
                    this.f37885t = C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f37872g, this.f37877l);
                }
            }
            C14223c c14223c2 = this.f37885t;
            if (c14223c2 != null) {
                this.f37875j.m42624a(c14223c2.m42713d());
                this.f37875j.m42625b(this.f37885t.m42750s());
            }
            C14216c c14216c = this.f37875j;
            if (c14216c != null && c14216c.m42623a() <= 0) {
                this.f37875j.m42624a(1);
            }
            int iM37707a = C13203i0.m37707a(this, "mbridge_reward_activity_open", "anim");
            int iM37707a2 = C13203i0.m37707a(this, "mbridge_reward_activity_stay", "anim");
            if (C13203i0.m37709a(iM37707a) && C13203i0.m37709a(iM37707a2)) {
                overridePendingTransition(iM37707a, iM37707a2);
            }
            if (bundle != null) {
                try {
                    this.f37887v = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            C13219q0.m37813a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f37882q);
            if (!this.f37882q) {
                List<C14202a> list2 = this.f37890y;
                if (list2 != null && list2.size() > 0) {
                    this.f37888w = this.f37890y.get(0);
                }
                C14202a c14202a = this.f37888w;
                if (c14202a != null) {
                    this.f37889x = c14202a.m42497h();
                    this.f37888w.m42486b(true);
                    this.f37888w.m42491d(false);
                    CampaignEx campaignEx = this.f37889x;
                    if (campaignEx != null) {
                        this.f37854O = campaignEx.getCurrentLocalRid();
                        this.f37889x.setShowIndex(1);
                        this.f37889x.setShowType(1);
                        C13613a.f37716b0 = this.f37889x.getEcppv();
                        C12684c.m34654a(C13008c.m36588n().m36542d(), this.f37889x.getMaitve(), this.f37889x.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f37889x;
                if (campaignEx2 != null && !C13200h.m37700a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    m39313b("env is exception");
                    return;
                }
                if (this.f37888w != null && this.f37889x != null && this.f37875j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f37889x);
                    m39307a(arrayList);
                    m39310b(this.f37889x);
                    m39331j();
                    if (C13884b.m41421a()) {
                        return;
                    }
                    m39320e();
                    return;
                }
                m39313b("data empty error");
                return;
            }
            m39307a(this.f37891z);
            this.f37844E = "";
            List<CampaignEx> list3 = this.f37891z;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f37891z.get(0);
                if (!C13200h.m37702a(this.f37891z, this, (View) null, campaignEx3.getImpReportType())) {
                    m39313b("env is exception");
                    return;
                }
                m39310b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.f37844E = campaignEx3.getRequestId();
                this.f37854O = campaignEx3.getCurrentLocalRid();
                C13613a.f37716b0 = campaignEx3.getEcppv();
                C12684c.m34654a(C13008c.m36588n().m36542d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewM39303a = m39303a(this.f37872g + "_" + this.f37844E + "_" + cMPTEntryUrl);
            this.f37842C = windVaneWebViewM39303a;
            if (windVaneWebViewM39303a == null) {
                if (this.f37888w == null && (list = this.f37890y) != null && list.size() > 0) {
                    this.f37888w = this.f37890y.get(0);
                }
                if (this.f37888w == null) {
                    C14203b c14203b = C14203b.getInstance();
                    if (!this.f37877l) {
                        i = 94;
                    }
                    this.f37888w = c14203b.m42515a(i, this.f37872g, this.f37878m);
                }
                C14202a c14202a2 = this.f37888w;
                if (c14202a2 != null) {
                    this.f37889x = c14202a2.m42497h();
                    this.f37888w.m42486b(true);
                    this.f37888w.m42491d(false);
                }
                if (this.f37888w != null && this.f37889x != null && this.f37875j != null) {
                    this.f37882q = false;
                    List<CampaignEx> listM42415a = C14201a.m42411a().m42415a(this.f37891z);
                    if (listM42415a == null) {
                        m39313b("no available campaign");
                        return;
                    }
                    int size = listM42415a.size();
                    if (size == 0) {
                        m39313b("no available campaign");
                        return;
                    }
                    if (listM42415a.get(0) == null || !listM42415a.get(0).isDynamicView()) {
                        m39331j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listM42415a.get(0);
                        this.f37889x = campaignEx4;
                        if (campaignEx4 != null) {
                            this.f37854O = campaignEx4.getCurrentLocalRid();
                            this.f37889x.setCampaignIsFiltered(true);
                        }
                        m39316c(this.f37889x);
                    } else {
                        m39314b(listM42415a);
                    }
                }
                m39313b("data empty error");
                return;
            }
            m39310b(this.f37891z.get(0));
            WindVaneWebView windVaneWebView = this.f37842C;
            if (windVaneWebView != null) {
                C13185b1.m37632a(windVaneWebView, this.f37891z.get(0).getLocalRequestId(), this.f37891z.get(0).getLocalAllowTrackClick());
                try {
                    C14191k c14191k = (C14191k) this.f37842C.getObject();
                    c14191k.setAdEvents(this.f37860U);
                    c14191k.setAdSession(this.f37858S);
                    c14191k.setVideoEvents(this.f37859T);
                    this.f37842C.setObject(c14191k);
                } catch (Exception e2) {
                    C13219q0.m37816b("MBRewardVideoActivity", e2.getMessage());
                }
            }
            m39333k();
            if (C13884b.m41421a()) {
                return;
            }
            m39320e();
        } catch (Throwable th) {
            m39307a(this.f37891z);
            m39313b("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String str;
        int i;
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onDestroy";
        } else {
            str = this.f37862W + "_onDestroy";
        }
        this.f37862W = str;
        super.onDestroy();
        m39323f();
        C13157e c13157e = new C13157e();
        c13157e.m37501a("activity_life_cycle", TextUtils.isEmpty(this.f37862W) ? "unKnown" : this.f37862W);
        c13157e.m37501a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.f37861V));
        Boolean bool = this.f37863X;
        int i2 = 0;
        if (bool == null) {
            i = 0;
        } else {
            i = bool.booleanValue() ? 1 : 2;
        }
        c13157e.m37501a("is_unexpected_destroy", Integer.valueOf(i));
        c13157e.m37501a("is_listener_null", Integer.valueOf(this.f37884s == null ? 1 : 2));
        c13157e.m37501a("is_called_finish", Integer.valueOf(this.f37865Z ? 1 : 2));
        c13157e.m37501a("is_back_pressed", Integer.valueOf(this.f37866a0 ? 1 : 2));
        c13157e.m37501a("is_back_dispatcher_invoked", Integer.valueOf(this.f37867b0 ? 1 : 2));
        InterfaceC13939h interfaceC13939h = this.f37884s;
        if (interfaceC13939h != null) {
            i2 = interfaceC13939h.hashCode() == this.f37864Y ? 1 : 2;
        }
        c13157e.m37501a("is_listener_change", Integer.valueOf(i2));
        C13156d.m37475b().m37483a("2000151", this.f37889x, c13157e);
        m39325g();
        C14075b.m42201a(this.f37872g);
        m39327h();
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.f37840A = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.f37841B = null;
        }
        this.f37870e0 = null;
        this.f37871f0 = null;
        C13084b.m37036b().m37054d(this.f37872g + "_1");
        C13084b.m37036b().m37054d(this.f37872g + "_2");
        C13167a.m37543b().execute(new RunnableC13620e(this.f37890y, this.f37872g, this.f37844E));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onPause";
        } else {
            str = this.f37862W + "_onPause";
        }
        this.f37862W = str;
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        String str;
        super.onRestart();
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onRestart";
        } else {
            str = this.f37862W + "_onRestart";
        }
        this.f37862W = str;
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        String str;
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onResume";
        } else {
            str = this.f37862W + "_onResume";
        }
        this.f37862W = str;
        if (C13084b.f35793f) {
            MBTempContainer mBTempContainer = this.f37840A;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        C13008c.m36588n().m36527a(this);
        try {
            C13167a.m37543b().execute(new RunnableC13621f(this.f37872g, this.f37890y));
        } catch (Throwable th) {
            C13219q0.m37816b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.f37840A;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f37887v);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        String str;
        super.onStart();
        if (TextUtils.isEmpty(this.f37862W)) {
            str = Constants.ON_START_KEY;
        } else {
            str = this.f37862W + "_onStart";
        }
        this.f37862W = str;
        if (C13084b.f35793f) {
            return;
        }
        new C13619d();
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f37889x.setCampaignUnitId(this.f37872g);
            C13084b.m37036b().m37046a(this.f37872g + "_1", this.f37889x);
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f37891z;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f37891z.get(0);
                campaignEx.setCampaignUnitId(this.f37872g);
                C13084b.m37036b().m37046a(this.f37872g + "_1", campaignEx);
            }
        }
        if (this.f37846G) {
            return;
        }
        C13084b.m37036b().m37040a(this.f37872g + "_1", 1);
        C13084b.m37036b().m37054d(this.f37872g + "_2");
        this.f37846G = true;
    }

    @Override // android.app.Activity
    protected void onStop() {
        String str;
        if (TextUtils.isEmpty(this.f37862W)) {
            str = "onStop";
        } else {
            str = this.f37862W + "_onStop";
        }
        this.f37862W = str;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(C13203i0.m37707a(this, "mbridge_transparent_theme", "style"));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.f37849J = i2;
        this.f37851L = i3;
        this.f37850K = i4;
        this.f37852M = i5;
        this.f37853N = i;
        MBTempContainer mBTempContainer = this.f37840A;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i, i2, i3, i4, i5);
            i10 = i5;
            i9 = i4;
            i8 = i3;
            i7 = i2;
            i6 = i;
        } else {
            i6 = i;
            i7 = i2;
            i8 = i3;
            i9 = i4;
            i10 = i5;
        }
        MBridgeBTContainer mBridgeBTContainer = this.f37841B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i6, i7, i8, i9, i10);
        }
        C13943a.m41753a(i6, i7, i8, i9, i10);
    }
}
