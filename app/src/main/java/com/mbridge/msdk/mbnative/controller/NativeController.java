package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.RoomMasterTable;
import androidx.work.WorkRequest;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.C13077k;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13145g;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a;
import com.mbridge.msdk.foundation.same.task.C13164b;
import com.mbridge.msdk.foundation.same.task.InterfaceC13166d;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbnative.cache.AbstractC13308b;
import com.mbridge.msdk.mbnative.cache.C13309c;
import com.mbridge.msdk.mbnative.common.C13310a;
import com.mbridge.msdk.mbnative.listener.C13339a;
import com.mbridge.msdk.mbnative.report.C13340a;
import com.mbridge.msdk.mbnative.report.C13341b;
import com.mbridge.msdk.mbnative.service.net.AbstractC13344b;
import com.mbridge.msdk.mbnative.service.net.C13343a;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C13384a;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.download.C14213l;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import com.mbridge.msdk.widget.dialog.InterfaceC14235b;
import com.unity3d.services.core.fid.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NativeController extends AbstractC13331a {

    /* JADX INFO: renamed from: c0 */
    private static final String f36826c0 = "NativeController";

    /* JADX INFO: renamed from: d0 */
    public static Map<String, Long> f36827d0 = new HashMap();

    /* JADX INFO: renamed from: e0 */
    private static boolean f36828e0;

    /* JADX INFO: renamed from: A */
    private int f36829A;

    /* JADX INFO: renamed from: B */
    private int f36830B;

    /* JADX INFO: renamed from: C */
    private C13164b f36831C;

    /* JADX INFO: renamed from: D */
    private List<C13333c> f36832D;

    /* JADX INFO: renamed from: E */
    private List<C13333c.d> f36833E;

    /* JADX INFO: renamed from: F */
    private CopyOnWriteArrayList<AbstractRunnableC13163a> f36834F;

    /* JADX INFO: renamed from: G */
    private Hashtable<String, AdSession> f36835G;

    /* JADX INFO: renamed from: H */
    private int f36836H;

    /* JADX INFO: renamed from: I */
    private int f36837I;

    /* JADX INFO: renamed from: J */
    private C13324n f36838J;

    /* JADX INFO: renamed from: K */
    private boolean f36839K;

    /* JADX INFO: renamed from: L */
    private boolean f36840L;

    /* JADX INFO: renamed from: M */
    private Timer f36841M;

    /* JADX INFO: renamed from: N */
    private String f36842N;

    /* JADX INFO: renamed from: O */
    private String f36843O;

    /* JADX INFO: renamed from: P */
    private ViewTreeObserver.OnGlobalLayoutListener f36844P;

    /* JADX INFO: renamed from: Q */
    private C13640l f36845Q;

    /* JADX INFO: renamed from: R */
    private long f36846R;

    /* JADX INFO: renamed from: S */
    private int f36847S;

    /* JADX INFO: renamed from: T */
    private int f36848T;

    /* JADX INFO: renamed from: U */
    private boolean f36849U;

    /* JADX INFO: renamed from: V */
    private int f36850V;

    /* JADX INFO: renamed from: W */
    private int f36851W;

    /* JADX INFO: renamed from: X */
    private boolean f36852X;

    /* JADX INFO: renamed from: Y */
    private List<Campaign> f36853Y;

    /* JADX INFO: renamed from: Z */
    private String f36854Z;

    /* JADX INFO: renamed from: a0 */
    private AdSession f36855a0;

    /* JADX INFO: renamed from: b */
    protected List<Integer> f36856b;

    /* JADX INFO: renamed from: b0 */
    private AdEvents f36857b0;

    /* JADX INFO: renamed from: c */
    protected List<Integer> f36858c;

    /* JADX INFO: renamed from: d */
    Map<String, Object> f36859d;

    /* JADX INFO: renamed from: e */
    private C13638j f36860e;

    /* JADX INFO: renamed from: f */
    private C13339a f36861f;

    /* JADX INFO: renamed from: g */
    private NativeListener.NativeTrackingListener f36862g;

    /* JADX INFO: renamed from: h */
    private Context f36863h;

    /* JADX INFO: renamed from: i */
    private String f36864i;

    /* JADX INFO: renamed from: j */
    private String f36865j;

    /* JADX INFO: renamed from: k */
    private Queue<Integer> f36866k;

    /* JADX INFO: renamed from: l */
    private Queue<Long> f36867l;

    /* JADX INFO: renamed from: m */
    private String f36868m;

    /* JADX INFO: renamed from: n */
    private C13146h f36869n;

    /* JADX INFO: renamed from: o */
    private String f36870o;

    /* JADX INFO: renamed from: p */
    private C12682a f36871p;

    /* JADX INFO: renamed from: q */
    private int f36872q;

    /* JADX INFO: renamed from: r */
    private int f36873r;

    /* JADX INFO: renamed from: s */
    private int f36874s;

    /* JADX INFO: renamed from: t */
    private int f36875t;

    /* JADX INFO: renamed from: u */
    private String f36876u;

    /* JADX INFO: renamed from: v */
    private boolean f36877v;

    /* JADX INFO: renamed from: w */
    private boolean f36878w;

    /* JADX INFO: renamed from: x */
    private boolean f36879x;

    /* JADX INFO: renamed from: y */
    private int f36880y;

    /* JADX INFO: renamed from: z */
    private int f36881z;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$a */
    class RunnableC13311a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36882a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ NativeListener.NativeAdListener f36883b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f36884c;

        RunnableC13311a(List list, NativeListener.NativeAdListener nativeAdListener, int i) {
            this.f36882a = list;
            this.f36883b = nativeAdListener;
            this.f36884c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f36882a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f36882a.get(0);
                NativeController.this.f36843O = campaignEx.getRequestId();
                NativeController.this.f36853Y = this.f36882a;
            }
            NativeController.this.f36877v = true;
            this.f36883b.onAdLoaded(this.f36882a, this.f36884c);
            C13340a.m38562a(NativeController.this.f36863h, (List<Campaign>) this.f36882a, NativeController.this.f36864i);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$b */
    class RunnableC13312b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13339a f36886a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36887b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f36888c;

        RunnableC13312b(C13339a c13339a, CampaignEx campaignEx, String str) {
            this.f36886a = c13339a;
            this.f36887b = campaignEx;
            this.f36888c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36886a.m38555a(this.f36887b, this.f36888c);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$c */
    class C13313c implements InterfaceC13101c {
        C13313c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$d */
    class C13314d extends TimerTask {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f36891a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC13325o f36892b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f36893c;

        C13314d(long j, InterfaceC13325o interfaceC13325o, List list) {
            this.f36891a = j;
            this.f36892b = interfaceC13325o;
            this.f36893c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z;
            if (System.currentTimeMillis() - this.f36891a >= 60000) {
                this.f36892b.mo38477a();
                NativeController.this.m38433c();
                return;
            }
            int iM37770s = C13211m0.m37770s(NativeController.this.f36863h);
            int iM39662q = NativeController.this.m38447h().m39662q();
            if (iM37770s != 9 && iM39662q == 2) {
                this.f36892b.mo38477a();
                NativeController.this.m38433c();
                return;
            }
            if (iM39662q == 3) {
                this.f36892b.mo38477a();
                NativeController.this.m38433c();
                return;
            }
            loop0: while (true) {
                z = false;
                for (Campaign campaign : this.f36893c) {
                    String id = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(id);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sb.append(campaignEx.getVideoUrlEncode());
                        sb.append(campaignEx.getBidToken());
                        id = sb.toString();
                    }
                    C14202a c14202aM42516a = C14203b.getInstance().m42516a(NativeController.this.f36864i, id);
                    if (c14202aM42516a != null && C14213l.m42590a(c14202aM42516a, NativeController.this.m38447h().m39606C())) {
                        z = true;
                    }
                }
                break loop0;
            }
            if (z) {
                this.f36892b.mo38477a();
                NativeController.this.m38433c();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$e */
    class ViewTreeObserverOnGlobalLayoutListenerC13315e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ImageView f36895a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f36896b;

        ViewTreeObserverOnGlobalLayoutListenerC13315e(ImageView imageView, View view) {
            this.f36895a = imageView;
            this.f36896b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f36895a != null) {
                this.f36895a.setLayoutParams(new FrameLayout.LayoutParams(this.f36896b.getWidth(), this.f36896b.getHeight()));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$f */
    class C13316f extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36898b;

        C13316f(CampaignEx campaignEx) {
            this.f36898b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            NativeController.this.m38425b(view.getContext(), this.f36898b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$g */
    class C13317g extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36900b;

        C13317g(CampaignEx campaignEx) {
            this.f36900b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            NativeController.this.m38425b(view.getContext(), this.f36900b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$h */
    class C13318h implements InterfaceC14235b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f36902a;

        C13318h(CampaignEx campaignEx) {
            this.f36902a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: a */
        public void mo37091a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: b */
        public void mo37092b() {
            NativeController.this.f36871p.m34634a(this.f36902a, NativeController.this.f36861f);
            NativeController.this.m38426b(this.f36902a);
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: c */
        public void mo37093c() {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$i */
    class C13319i extends AbstractViewOnClickListenerC14227a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f36904b;

        C13319i(CampaignEx campaignEx) {
            this.f36904b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            NativeController.this.m38425b(view.getContext(), this.f36904b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$j */
    class C13320j implements AbstractRunnableC13163a.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13329s f36906a;

        C13320j(C13329s c13329s) {
            this.f36906a = c13329s;
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a.a
        /* JADX INFO: renamed from: a */
        public void mo34752a(AbstractRunnableC13163a.b bVar) {
            if (bVar != AbstractRunnableC13163a.b.FINISH || NativeController.this.f36834F == null || NativeController.this.f36834F.size() <= 0 || !NativeController.this.f36834F.contains(this.f36906a)) {
                return;
            }
            NativeController.this.f36834F.remove(this.f36906a);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$k */
    class C13321k implements C13333c.d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f36908a;

        C13321k(CampaignEx campaignEx) {
            this.f36908a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.C13333c.d
        /* JADX INFO: renamed from: a */
        public void mo38476a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            C13341b.m38566a(this.f36908a, NativeController.this.f36863h, NativeController.this.f36864i, NativeController.this.f36861f);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$l */
    class C13322l implements InterfaceC13325o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36910a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f36911b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13339a f36912c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ List f36913d;

        C13322l(List list, int i, C13339a c13339a, List list2) {
            this.f36910a = list;
            this.f36911b = i;
            this.f36912c = c13339a;
            this.f36913d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.InterfaceC13325o
        /* JADX INFO: renamed from: a */
        public void mo38477a() {
            List listM38405a = NativeController.this.m38405a((List<Campaign>) this.f36910a, true);
            if (listM38405a == null || listM38405a.size() <= 0) {
                NativeController.this.m38417a(this.f36912c, "has no ads", (CampaignEx) this.f36913d.get(0));
            } else {
                NativeController.this.m38418a((List<Campaign>) listM38405a, this.f36911b, this.f36912c);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$m */
    class C13323m implements InterfaceC13325o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f36915a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f36916b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13339a f36917c;

        C13323m(List list, int i, C13339a c13339a) {
            this.f36915a = list;
            this.f36916b = i;
            this.f36917c = c13339a;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.InterfaceC13325o
        /* JADX INFO: renamed from: a */
        public void mo38477a() {
            List listM38405a = NativeController.this.m38405a((List<Campaign>) this.f36915a, false);
            if (listM38405a == null || listM38405a.size() <= 0) {
                NativeController.this.m38417a(this.f36917c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.m38418a((List<Campaign>) listM38405a, this.f36916b, this.f36917c);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$n */
    public class C13324n extends AbstractC13344b implements InterfaceC13166d {

        /* JADX INFO: renamed from: d */
        private Runnable f36920d;

        /* JADX INFO: renamed from: c */
        private boolean f36919c = false;

        /* JADX INFO: renamed from: e */
        private boolean f36921e = true;

        /* JADX INFO: renamed from: f */
        private List<String> f36922f = null;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$n$a */
        class a extends C13092c.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignEx f36924a;

            a(CampaignEx campaignEx, InterfaceC13155a interfaceC13155a) {
                this.f36924a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.C13092c.a
            /* JADX INFO: renamed from: a */
            public void mo34472a(String str, C13154c c13154c) {
                C13340a.m38563a(str, c13154c, this.f36924a, NativeController.this.f36863h, (InterfaceC13155a) null);
            }
        }

        public C13324n() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.InterfaceC13166d
        /* JADX INFO: renamed from: a */
        public void mo37541a(boolean z) {
            this.f36919c = z;
        }

        /* JADX INFO: renamed from: b */
        public void m38484b(boolean z) {
            this.f36921e = z;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38482a(List<C13837g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z = true;
            NativeController.this.f36849U = true;
            C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(NativeController.this.f36863h));
            c13020jM36706a.m36710d();
            Runnable runnable = this.f36920d;
            if (runnable != null) {
                NativeController.this.f36945a.removeCallbacks(runnable);
            }
            if (C13884b.m41421a()) {
                NativeController.this.m38487a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                C13334d.m38513b(NativeController.this.f36874s, this.unitId);
                NativeController.this.f36875t = 0;
                return;
            }
            NativeController.this.f36870o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i = 2;
            if (NativeController.this.f36847S <= 0) {
                if (NativeController.this.f36847S == -3) {
                    NativeController.this.f36847S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.f36847S = nativeController.f36873r;
                }
                if (NativeController.this.f36850V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.f36847S = nativeController2.f36850V;
                }
                if (NativeController.this.f36851W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.f36847S = nativeController3.f36851W;
                }
            }
            C13157e c13157e = new C13157e();
            c13157e.m37501a("adtp", 42);
            if (TextUtils.isEmpty(m38593b())) {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
            }
            C13154c c13154cM37478a = C13156d.m37475b().m37478a(true, m38593b(), c13157e, campaignUnit.getAds().get(0), this.unitId);
            int i2 = 0;
            while (i2 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i2);
                campaignEx.setLocalRequestId(c13154cM37478a.m37463t());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.f36842N)) {
                    campaignEx.setBidToken(NativeController.this.f36842N);
                    campaignEx.setIsBidCampaign(z);
                }
                if (NativeController.f36828e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zM37915c = C13229v0.m37915c(NativeController.this.f36863h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.m38486a(nativeController4.f36863h, campaignEx);
                if (i2 < NativeController.this.f36873r && campaignEx.getOfferType() != 99) {
                    if (C13229v0.m37916c(campaignEx)) {
                        campaignEx.setRtinsType(zM37915c ? 1 : i);
                    }
                    if (C13092c.m37123b(NativeController.this.f36863h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        C13229v0.m37896a(this.unitId, campaignEx, C13088a.f35882x);
                        NativeController.this.f36854Z = "APP ALREADY INSTALLED";
                    }
                    m38478a(campaignEx, null, null);
                }
                if (i2 < NativeController.this.f36847S && campaignEx.getOfferType() != 99) {
                    if (C13229v0.m37916c(campaignEx)) {
                        campaignEx.setRtinsType(zM37915c ? 1 : 2);
                    }
                    if (!zM37915c || C13229v0.m37916c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!c13020jM36706a.m36707a(campaignEx.getId())) {
                    C13073g c13073g = new C13073g();
                    c13073g.m36859a(campaignEx.getId());
                    c13073g.m36861b(campaignEx.getFca());
                    c13073g.m36863c(campaignEx.getFcb());
                    c13073g.m36857a(0);
                    c13073g.m36865d(0);
                    c13073g.m36858a(System.currentTimeMillis());
                    c13020jM36706a.m36708b(c13073g);
                }
                C12684c.m34654a(NativeController.this.f36863h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i2++;
                z = true;
                i = 2;
            }
            NativeController.this.m38440d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(type);
            if (abstractC13308bM38392a != null) {
                abstractC13308bM38392a.mo38385a(this.unitId, arrayList2, NativeController.this.f36842N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.f36854Z.contains("INSTALLED")) {
                    NativeController.this.m38463a("APP ALREADY INSTALLED", m38590a(), m38593b(), campaignUnit.getAds().get(0));
                    new C13082b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.m38463a("v3 response error", m38590a(), m38593b(), campaignUnit.getAds().get(0));
                    new C13082b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.m38437c((List<Campaign>) nativeController5.m38400a(type, (List<Campaign>) nativeController5.m38404a(arrayList)));
            if (C13334d.m38518g().containsKey(this.unitId) && Boolean.TRUE.equals(C13334d.m38518g().get(this.unitId))) {
                C13334d.m38507a(NativeController.this.f36874s, this.unitId);
                return;
            }
            int iIntValue = (!C13334d.m38515d().containsKey(this.unitId) || (num = C13334d.m38515d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i3 = NativeController.this.f36873r + NativeController.this.f36875t;
            NativeController.this.f36875t = i3 <= iIntValue ? i3 : 0;
        }

        /* JADX INFO: renamed from: b */
        public void m38483b(List<String> list) {
            this.f36922f = list;
        }

        /* JADX INFO: renamed from: a */
        private void m38478a(CampaignEx campaignEx, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
            try {
                C13092c.m37119a(campaignEx, NativeController.this.f36863h, c13154c, new a(campaignEx, interfaceC13155a));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38479a(int i, String str) {
            NativeController.this.f36849U = true;
            if (this.f36919c) {
                if (NativeController.this.f36877v || !this.f36921e) {
                    return;
                }
                NativeController.this.m38463a(str, m38590a(), m38593b(), (CampaignEx) null);
                return;
            }
            if (i == -1) {
                C13334d.m38513b(NativeController.this.f36874s, this.unitId);
                NativeController.this.f36875t = 0;
            }
            Runnable runnable = this.f36920d;
            if (runnable != null) {
                NativeController.this.f36945a.removeCallbacks(runnable);
            }
            if (NativeController.this.f36877v) {
                return;
            }
            if (m38590a() == 1 || this.f36921e) {
                NativeController.this.m38463a(str, m38590a(), m38593b(), (CampaignEx) null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m38480a(Runnable runnable) {
            this.f36920d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38481a(List<Frame> list) {
            if (this.f36919c) {
                return;
            }
            Runnable runnable = this.f36920d;
            if (runnable != null) {
                NativeController.this.f36945a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f36861f != null) {
                    NativeController.this.f36877v = true;
                    NativeController.this.f36861f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f36861f != null) {
                        NativeController.this.f36877v = true;
                        NativeController.this.f36861f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f36828e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f36861f != null) {
                NativeController.this.f36861f.onAdFramesLoaded(list);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$o */
    public interface InterfaceC13325o {
        /* JADX INFO: renamed from: a */
        void mo38477a();
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$p */
    public class RunnableC13326p implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f36926a;

        /* JADX INFO: renamed from: b */
        private InterfaceC13166d f36927b;

        /* JADX INFO: renamed from: c */
        private int f36928c;

        /* JADX INFO: renamed from: d */
        private String f36929d;

        public RunnableC13326p(int i, InterfaceC13166d interfaceC13166d, int i2, String str) {
            this.f36926a = i;
            this.f36927b = interfaceC13166d;
            this.f36928c = i2;
            this.f36929d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36927b.mo37541a(true);
            int i = this.f36926a;
            if (i == 1) {
                NativeController.this.f36849U = true;
                NativeController.this.m38463a("REQUEST_TIMEOUT", this.f36928c, this.f36929d, (CampaignEx) null);
            } else {
                if (i != 2) {
                    return;
                }
                if (!NativeController.this.f36877v || this.f36928c == 1) {
                    NativeController.this.m38463a("REQUEST_TIMEOUT", this.f36928c, this.f36929d, (CampaignEx) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$q */
    private static class C13327q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* JADX INFO: renamed from: a */
        private String f36931a;

        /* JADX INFO: renamed from: b */
        private CampaignEx f36932b;

        /* JADX INFO: renamed from: c */
        private long f36933c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d */
        private boolean f36934d;

        public C13327q(String str, CampaignEx campaignEx, boolean z) {
            this.f36934d = true;
            this.f36931a = str;
            this.f36932b = campaignEx;
            this.f36934d = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f36934d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f36933c;
                    C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                    C13080n c13080n = new C13080n("2000043", 3, jCurrentTimeMillis + "", str, this.f36932b.getId(), this.f36931a, str2, "2");
                    c13080n.m36990n(this.f36932b.getRequestId());
                    c13080n.m36984k(this.f36932b.getCurrentLocalRid());
                    c13080n.m36992o(this.f36932b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f36932b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        c13080n.m36962b(this.f36932b.getId());
                    }
                    CampaignEx campaignEx2 = this.f36932b;
                    if (campaignEx2 != null) {
                        c13080n.m36958a(campaignEx2.getAdSpaceT());
                    }
                    c13080n.m36959a("1");
                    C13145g.m37359a(c13080n, this.f36931a, this.f36932b);
                }
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.f36934d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f36933c;
                    C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                    C13080n c13080n = new C13080n("2000043", 1, jCurrentTimeMillis + "", str, this.f36932b.getId(), this.f36931a, "", "2");
                    CampaignEx campaignEx = this.f36932b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        c13080n.m36962b(this.f36932b.getId());
                    }
                    CampaignEx campaignEx2 = this.f36932b;
                    if (campaignEx2 != null) {
                        c13080n.m36990n(campaignEx2.getRequestId());
                        c13080n.m36992o(this.f36932b.getRequestIdNotice());
                        c13080n.m36984k(this.f36932b.getCurrentLocalRid());
                        c13080n.m36958a(this.f36932b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        c13080n.m36996q(str2);
                    }
                    c13080n.m36959a("1");
                    C13145g.m37359a(c13080n, this.f36931a, this.f36932b);
                }
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$r */
    protected static class HandlerC13328r extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference<NativeController> f36935a;

        public HandlerC13328r(NativeController nativeController) {
            this.f36935a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f36935a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f36869n.m37367a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.f36935a;
                    NativeController nativeController2 = (weakReference2 == null || weakReference2.get() == null) ? null : this.f36935a.get();
                    if (nativeController2 != null) {
                        nativeController2.f36878w = true;
                        List<Campaign> listM38458a = nativeController2.m38458a(nativeController2.f36864i, nativeController2.f36873r, nativeController2.f36842N);
                        if (nativeController2.f36877v) {
                            return;
                        }
                        nativeController2.m38437c(listM38458a);
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$s */
    private static class C13329s extends AbstractRunnableC13163a {

        /* JADX INFO: renamed from: a */
        private CampaignEx f36936a;

        /* JADX INFO: renamed from: b */
        private WeakReference<View> f36937b;

        /* JADX INFO: renamed from: c */
        private WeakReference<List<View>> f36938c;

        /* JADX INFO: renamed from: d */
        private WeakReference<NativeController> f36939d;

        /* JADX INFO: renamed from: e */
        private WeakReference<AdSession> f36940e;

        public C13329s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f36936a = campaignEx;
            this.f36937b = new WeakReference<>(view);
            this.f36938c = new WeakReference<>(list);
            this.f36939d = new WeakReference<>(nativeController);
            this.f36940e = new WeakReference<>(adSession);
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void pauseTask(boolean z) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.AbstractRunnableC13163a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f36939d == null || (weakReference = this.f36937b) == null || this.f36938c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f36938c.get();
                NativeController nativeController = this.f36939d.get();
                WeakReference<AdSession> weakReference2 = this.f36940e;
                AdSession adSession = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.m38411a(this.f36936a, view, list, adSession);
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.NativeController$t */
    private static final class C13330t implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a */
        String f36941a;

        /* JADX INFO: renamed from: b */
        CampaignEx f36942b;

        /* JADX INFO: renamed from: c */
        private long f36943c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d */
        private boolean f36944d;

        public C13330t(String str, CampaignEx campaignEx, boolean z) {
            this.f36944d = true;
            this.f36941a = str;
            this.f36942b = campaignEx;
            this.f36944d = z;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f36944d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f36943c;
                    C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                    C13080n c13080n = new C13080n("2000043", 3, jCurrentTimeMillis + "", str2, this.f36942b.getId(), this.f36941a, str, "1");
                    CampaignEx campaignEx = this.f36942b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        c13080n.m36962b(this.f36942b.getId());
                    }
                    CampaignEx campaignEx2 = this.f36942b;
                    if (campaignEx2 != null) {
                        c13080n.m36990n(campaignEx2.getRequestId());
                        c13080n.m36984k(this.f36942b.getCurrentLocalRid());
                        c13080n.m36992o(this.f36942b.getRequestIdNotice());
                        c13080n.m36958a(this.f36942b.getAdSpaceT());
                    }
                    c13080n.m36959a("2");
                    C13145g.m37359a(c13080n, this.f36941a, this.f36942b);
                }
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            try {
                if (this.f36944d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f36943c;
                    C13026n.m36744a(C13017g.m36693a(C13008c.m36588n().m36542d()));
                    C13080n c13080n = new C13080n("2000043", 1, jCurrentTimeMillis + "", str, this.f36942b.getId(), this.f36941a, "", "1");
                    CampaignEx campaignEx = this.f36942b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        c13080n.m36962b(this.f36942b.getId());
                    }
                    CampaignEx campaignEx2 = this.f36942b;
                    if (campaignEx2 != null) {
                        c13080n.m36990n(campaignEx2.getRequestId());
                        c13080n.m36984k(this.f36942b.getCurrentLocalRid());
                        c13080n.m36992o(this.f36942b.getRequestIdNotice());
                        c13080n.m36958a(this.f36942b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        c13080n.m36996q(str2);
                    }
                    c13080n.m36959a("2");
                    C13145g.m37359a(c13080n, this.f36941a, this.f36942b);
                }
            } catch (Exception e) {
                C13219q0.m37816b(NativeController.f36826c0, C13310a.m38393a(e));
            }
        }
    }

    public NativeController(C13339a c13339a, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f36872q = 1;
        this.f36873r = 1;
        this.f36874s = -1;
        this.f36875t = 0;
        this.f36877v = false;
        this.f36878w = false;
        this.f36879x = false;
        this.f36880y = 0;
        this.f36881z = 0;
        this.f36829A = 0;
        this.f36830B = 0;
        this.f36834F = new CopyOnWriteArrayList<>();
        this.f36835G = new Hashtable<>();
        this.f36836H = 1;
        this.f36837I = 2;
        this.f36842N = "";
        this.f36843O = "";
        this.f36854Z = "";
        this.f36863h = context;
        this.f36859d = map;
        this.f36860e = new C13638j();
        this.f36861f = c13339a;
        this.f36862g = nativeTrackingListener;
        this.f36832D = new ArrayList();
        this.f36833E = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f36864i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f36865j = "";
        } else {
            this.f36865j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f36828e0 = ((Boolean) obj).booleanValue();
        }
        this.f36866k = new LinkedList();
        this.f36867l = new LinkedList();
        this.f36831C = new C13164b(this.f36863h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f36945a = new HandlerC13328r(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f36876u = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = C13334d.m38518g().containsKey(this.f36864i) ? Boolean.TRUE.equals(C13334d.m38518g().get(this.f36864i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (zEquals) {
                if (C13334d.m38514c().containsKey(this.f36864i)) {
                    Integer num = C13334d.m38514c().get(this.f36864i);
                    if (num != null) {
                        this.f36873r = num.intValue();
                    }
                    if (map.containsKey("ad_num") && obj2 != null) {
                        int iIntValue2 = ((Integer) obj2).intValue();
                        this.f36880y = iIntValue2;
                        this.f36872q = iIntValue2;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                        int iIntValue3 = ((Integer) obj3).intValue();
                        this.f36881z = iIntValue3;
                        this.f36829A = iIntValue3;
                    }
                }
            } else if (map.containsKey("ad_num") && obj2 != null) {
                try {
                    iIntValue = ((Integer) obj2).intValue();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b(f36826c0, e.getMessage());
                    }
                    iIntValue = 1;
                }
                iIntValue = iIntValue < 1 ? 1 : iIntValue;
                iIntValue = iIntValue > 10 ? 10 : iIntValue;
                this.f36873r = iIntValue;
                this.f36872q = iIntValue;
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.f36829A = ((Integer) obj3).intValue();
                }
            } else if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                try {
                    this.f36829A = ((Integer) obj3).intValue();
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b(f36826c0, e2.getMessage());
                    }
                }
            }
        } catch (Exception e3) {
            C13219q0.m37816b(f36826c0, C13310a.m38393a(e3));
        }
        this.f36869n = new C13146h(this.f36863h);
        this.f36871p = new C12682a(this.f36863h, this.f36864i);
        try {
            int i = MBMediaView.f37294p0;
            this.f36840L = true;
            Map<String, Object> map2 = this.f36859d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f36859d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.f36839K = true;
            }
            C13335e.m38551a(this.f36863h, this.f36864i);
            C13215o0.m37791a();
            if (TextUtils.isEmpty(this.f36864i)) {
                return;
            }
            C13015e.m36643a(C13017g.m36693a(this.f36863h)).m36680d();
            int iM38395a = m38395a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listM38457a = m38457a(this.f36864i, iM38395a <= 0 ? this.f36872q : iM38395a);
            if (listM38457a != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < listM38457a.size(); i2++) {
                    CampaignEx campaignEx = (CampaignEx) listM38457a.get(i2);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = C14203b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    C14203b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, InterfaceC14217a.class).invoke(objInvoke, context, this.f36864i, new CopyOnWriteArrayList(arrayList), 1, null);
                    C14203b.class.getMethod("load", String.class).invoke(objInvoke, this.f36864i);
                }
            }
        } catch (Throwable unused) {
            C13219q0.m37816b(f36826c0, "please import the nativex aar");
        }
    }

    /* JADX INFO: renamed from: e */
    private List<Campaign> m38442e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    C13309c.m38392a(campaignEx.getType()).mo38386a(this.f36864i, campaignRemove, this.f36842N);
                    C13219q0.m37813a(f36826c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: f */
    private void m38444f() {
        try {
            if (this.f36868m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f36868m);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.f36850V = jSONObject.optInt("ad_num");
                        if (this.f36848T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.f36848T);
                        }
                    } else if (3 == iOptInt) {
                        this.f36851W = jSONObject.optInt("ad_num");
                        if (this.f36848T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.f36848T);
                        }
                    }
                }
            }
            this.f36836H = Math.max(this.f36850V, this.f36851W);
            this.f36868m = jSONArray.toString();
        } catch (JSONException e) {
            C13219q0.m37816b(f36826c0, C13310a.m38393a(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public C13640l m38447h() {
        C13640l c13640lM39720e = C13636h.m39706b().m39720e("", this.f36864i);
        this.f36845Q = c13640lM39720e;
        if (c13640lM39720e == null) {
            this.f36845Q = C13640l.m39753i(this.f36864i);
        }
        return this.f36845Q;
    }

    /* JADX INFO: renamed from: g */
    public String m38472g() {
        return this.f36843O;
    }

    /* JADX INFO: renamed from: i */
    public void m38473i() {
        AbstractRunnableC13163a next;
        C13164b c13164b = this.f36831C;
        if (c13164b != null) {
            c13164b.m37534a();
            this.f36831C = null;
        }
        Hashtable<String, AdSession> hashtable = this.f36835G;
        if (hashtable != null) {
            for (AdSession adSession : hashtable.values()) {
                if (adSession != null) {
                    adSession.finish();
                }
            }
            this.f36835G.clear();
        }
        Handler handler = this.f36945a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f36862g = null;
        this.f36871p.m34640c();
        try {
            Context context = this.f36863h;
            if (context != null) {
                C13100b.m37152a(context).m37157b();
            }
            List<C13333c> list = this.f36832D;
            if (list != null && list.size() > 0) {
                Iterator<C13333c> it = this.f36832D.iterator();
                while (it.hasNext()) {
                    it.next().m38503a();
                }
                this.f36832D.clear();
                this.f36832D = null;
            }
            List<C13333c.d> list2 = this.f36833E;
            if (list2 != null && list2.size() > 0) {
                for (C13333c.d dVar : this.f36833E) {
                }
                this.f36833E.clear();
                this.f36833E = null;
            }
            CopyOnWriteArrayList<AbstractRunnableC13163a> copyOnWriteArrayList = this.f36834F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<AbstractRunnableC13163a> it2 = this.f36834F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f36945a.removeCallbacks(next);
            }
            this.f36834F.clear();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public void m38474j() {
        List<Integer> list = this.f36856b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f36866k;
            if (queue != null && queue.size() > 0) {
                this.f36866k.clear();
            }
            for (Integer num : this.f36856b) {
                Queue<Integer> queue2 = this.f36866k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f36858c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.f36867l;
        if (queue3 != null && queue3.size() > 0) {
            this.f36867l.clear();
        }
        for (Integer num2 : this.f36858c) {
            Queue<Long> queue4 = this.f36867l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m38440d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i = MBMediaView.f37294p0;
                        Object objInvoke = C14203b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            C14203b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, InterfaceC14217a.class).invoke(objInvoke, this.f36863h, this.f36864i, new CopyOnWriteArrayList(list), 1, null);
                            C14203b.class.getMethod("load", String.class).invoke(objInvoke, this.f36864i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                C13100b.m37152a(C13008c.m36588n().m36542d()).m37155a(next.getImageUrl(), new C13313c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            C13154c c13154c = new C13154c();
                            c13154c.m37421a(next);
                            if (!TextUtils.isEmpty(str)) {
                                c13154c.m37439f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(c13154c, str, new C13330t(this.f36864i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(c13154c, str, new C13327q(this.f36864i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        C13219q0.m37816b(f36826c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m38437c(List<Campaign> list) {
        if (!TextUtils.isEmpty(this.f36842N) && list != null && list.size() == 0) {
            return false;
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        C13339a c13339a = this.f36861f;
        if (c13339a == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            AdSession adSessionM38396a = m38396a(campaignEx);
            this.f36855a0 = adSessionM38396a;
            if (adSessionM38396a != null) {
                adSessionM38396a.start();
                AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(this.f36855a0);
                this.f36857b0 = adEventsCreateAdEvents;
                adEventsCreateAdEvents.loaded();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(this.f36863h));
        c13020jM36706a.m36710d();
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i);
            if (!c13020jM36706a.m36707a(campaignEx2.getId())) {
                C13073g c13073g = new C13073g();
                c13073g.m36859a(campaignEx2.getId());
                c13073g.m36861b(campaignEx2.getFca());
                c13073g.m36863c(campaignEx2.getFcb());
                c13073g.m36857a(0);
                c13073g.m36865d(0);
                c13073g.m36858a(System.currentTimeMillis());
                c13020jM36706a.m36708b(c13073g);
            }
        }
        if (this.f36840L && this.f36839K) {
            if (m38447h().m39654m() == 3) {
                List<Campaign> listM38442e = m38442e(list);
                if (list.size() > 0) {
                    m38419a(list, new C13322l(listM38442e, template, c13339a, list));
                    return true;
                }
                m38417a(c13339a, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listM38424b = m38424b(list);
            if (listM38424b != null && listM38424b.size() > 0) {
                m38419a(listM38424b, new C13323m(list, template, c13339a));
                return true;
            }
            m38418a(list, template, c13339a);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            m38418a(list, template, c13339a);
            return true;
        }
        m38417a(c13339a, "has no ads", (CampaignEx) null);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m38431b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            return map.containsKey("app_id") && map.containsKey("app_key") && map.containsKey(MBridgeConstans.KEY_WORD) && map.get(MBridgeConstans.KEY_WORD) != null;
        } catch (Exception e) {
            C13219q0.m37816b(f36826c0, C13310a.m38393a(e));
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38467b(int i, String str) {
        C13339a c13339a;
        Long lPoll;
        Queue<Integer> queue = this.f36866k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.f36866k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.f36846R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f36867l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.f36867l.poll()) != null) {
                this.f36846R = lPoll.longValue();
            }
            m38466b(iIntValue, this.f36846R, i, str);
            return;
        }
        if (this.f36877v || (c13339a = this.f36861f) == null) {
            return;
        }
        this.f36877v = true;
        c13339a.onAdLoadError("no ad source");
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m38406a(Map<String, Object> map) {
        Exception e;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("p");
                        if (TextUtils.isEmpty(strOptString)) {
                            continue;
                        } else {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList2;
                }
            }
            return arrayList2;
        } catch (Exception e3) {
            e = e3;
        }
        C13219q0.m37816b(f36826c0, C13310a.m38393a(e));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public String m38471e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.f36853Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return C13092c.m37122b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public void m38466b(int i, long j, int i2, String str) {
        AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a;
        if (i2 == 0 && (abstractC13308bM38392a = C13309c.m38392a(i)) != null) {
            if ((i == 1 || i == 2) && this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f36873r = this.f36836H;
            } else {
                this.f36873r = this.f36872q;
            }
            if (m38437c(m38400a(i, m38404a(abstractC13308bM38392a.mo38383a(this.f36864i, this.f36873r))))) {
                return;
            }
        }
        if (i == 1) {
            m38485a(j, i2, true, this.f36864i, str);
        } else if (i != 2) {
            mo38459a(i, j, i2, str);
        } else {
            mo38459a(2, j, i2, str);
        }
    }

    /* JADX INFO: renamed from: a */
    public List<Campaign> m38457a(String str, int i) {
        AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a;
        C13640l c13640lM39720e = C13636h.m39706b().m39720e("", str);
        this.f36845Q = c13640lM39720e;
        if (c13640lM39720e == null) {
            this.f36845Q = C13640l.m39753i(str);
        }
        List<Integer> listM39622b = this.f36845Q.m39622b();
        this.f36856b = listM39622b;
        if (listM39622b == null || listM39622b.size() <= 0 || !this.f36856b.contains(1) || (abstractC13308bM38392a = C13309c.m38392a(1)) == null) {
            return null;
        }
        return abstractC13308bM38392a.mo38383a(str, i);
    }

    /* JADX INFO: renamed from: a */
    private int m38395a(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                        if (2 == jSONObject.optInt("id", 0)) {
                            return jSONObject.optInt("ad_num");
                        }
                    }
                }
            } catch (Exception e) {
                C13219q0.m37816b(f36826c0, C13310a.m38393a(e));
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38425b(Context context, CampaignEx campaignEx) {
        NativeController nativeController;
        CampaignEx campaignEx2;
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && C13884b.m41421a()) {
                    C13318h c13318h = new C13318h(campaignEx);
                    if (C12684c.m34657a(campaignEx) && campaignEx.needShowIDialog()) {
                        nativeController = this;
                        campaignEx2 = campaignEx;
                        try {
                            if (nativeController.m38489a(this.f36871p, context, campaignEx2, this.f36864i, c13318h)) {
                                return;
                            }
                            m38426b(campaignEx2);
                            nativeController.f36861f.onAdClick(campaignEx2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            C13219q0.m37813a(f36826c0, th.getMessage());
                            nativeController.f36871p.m34634a(campaignEx2, nativeController.f36861f);
                            m38426b(campaignEx2);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                nativeController = this;
                campaignEx2 = campaignEx;
            }
        }
        nativeController = this;
        campaignEx2 = campaignEx;
        nativeController.f36871p.m34634a(campaignEx2, nativeController.f36861f);
        m38426b(campaignEx2);
    }

    /* JADX INFO: renamed from: a */
    public void m38464a(String str, String str2) {
        this.f36860e.m39744a(this.f36863h, str, str2, this.f36864i);
    }

    /* JADX INFO: renamed from: a */
    public void m38460a(int i, String str) {
        boolean zEquals = false;
        this.f36877v = false;
        this.f36878w = false;
        this.f36879x = false;
        this.f36849U = false;
        this.f36842N = str;
        this.f36861f.m38557a(!TextUtils.isEmpty(str));
        this.f36838J = null;
        Map<String, Long> map = f36827d0;
        if (map != null && map.size() > 0) {
            f36827d0.clear();
        }
        if (C13334d.m38518g() != null && C13334d.m38518g().containsKey(this.f36864i)) {
            zEquals = Boolean.TRUE.equals(C13334d.m38518g().get(this.f36864i));
        }
        m38420a(zEquals, i);
    }

    /* JADX INFO: renamed from: d */
    public void m38470d() {
        C13215o0.m37798b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38433c() {
        Timer timer = this.f36841M;
        if (timer != null) {
            timer.cancel();
            this.f36841M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38426b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36901i() == null) {
            return;
        }
        C12682a.m34607a(this.f36863h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().m36901i(), false, false);
    }

    /* JADX INFO: renamed from: b */
    public void m38468b(Campaign campaign, View view) {
        m38469b(campaign, view, null);
    }

    /* JADX INFO: renamed from: b */
    public void m38469b(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        if (view != null && this.f36844P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f36844P);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i = MBMediaView.f37294p0;
                } catch (Throwable unused) {
                    cls = null;
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        m38408a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        m38408a(it.next(), cls);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private List<Campaign> m38424b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m38420a(boolean z, int i) {
        boolean zM38711b;
        NativeController nativeController;
        int i2;
        if (!z || i != 1 || !m38465a(i)) {
            String strM36533b = C13008c.m36588n().m36533b();
            String strM36538c = C13008c.m36588n().m36538c();
            if (this.f36859d.containsKey("app_id") && this.f36859d.containsKey("app_key") && this.f36859d.containsKey(MBridgeConstans.KEY_WORD)) {
                strM36533b = (String) this.f36859d.get("app_id");
                strM36538c = (String) this.f36859d.get("app_key");
            }
            m38464a(strM36533b, strM36538c);
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(strM36533b, this.f36864i);
            this.f36845Q = c13640lM39720e;
            if (c13640lM39720e == null) {
                this.f36845Q = C13640l.m39753i(this.f36864i);
            }
            C13334d.m38515d().put(this.f36864i, Integer.valueOf(this.f36845Q.m39678y() * this.f36873r));
            this.f36856b = this.f36845Q.m39622b();
            this.f36858c = this.f36845Q.m39627c();
            this.f36848T = this.f36845Q.m39638f();
            this.f36847S = this.f36845Q.m39635e();
            this.f36873r = this.f36872q;
            List<Integer> list = this.f36856b;
            if (list != null && list.size() != 0) {
                try {
                    zM38711b = C13384a.m38711b(C13008c.m36588n().m36542d());
                } catch (Exception unused) {
                    zM38711b = false;
                }
                if (!zM38711b) {
                    C13339a c13339a = this.f36861f;
                    if (c13339a != null) {
                        c13339a.onAdLoadError("webview is not available");
                    }
                } else {
                    if (this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f36868m == null) {
                        this.f36868m = (String) this.f36859d.get(MBridgeConstans.NATIVE_INFO);
                        m38444f();
                    }
                    if ((this.f36856b.contains(1) && this.f36856b.get(0).intValue() != 1) || i != 0 || !m38437c(m38458a(this.f36864i, this.f36873r, this.f36842N))) {
                        this.f36852X = true;
                        if (this.f36856b.contains(1) && i == 0 && this.f36856b.get(0).intValue() != 1) {
                            int iIntValue = this.f36856b.get(0).intValue();
                            AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(iIntValue);
                            if (iIntValue == 2 && this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                this.f36873r = this.f36836H;
                            } else {
                                this.f36873r = this.f36872q;
                            }
                            if (abstractC13308bM38392a == null || !m38437c(m38400a(iIntValue, m38404a(abstractC13308bM38392a.mo38383a(this.f36864i, this.f36873r))))) {
                                this.f36852X = false;
                                try {
                                    nativeController = this;
                                    i2 = i;
                                    try {
                                        nativeController.m38485a(this.f36858c.get(this.f36856b.indexOf(1)).intValue() * 1000, i2, false, this.f36864i, this.f36842N);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                    nativeController = this;
                                    i2 = i;
                                }
                            }
                        } else {
                            nativeController = this;
                            i2 = i;
                        }
                        nativeController.f36945a.sendEmptyMessageDelayed(1, nativeController.f36845Q.m39614K() * 1000);
                        m38474j();
                        m38467b(i2, nativeController.f36842N);
                    }
                }
            } else {
                C13339a c13339a2 = this.f36861f;
                if (c13339a2 != null) {
                    this.f36877v = true;
                    c13339a2.onAdLoadError("do not have sorceList");
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m38465a(int i) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        C13339a c13339a;
        int i2 = 0;
        if (C13334d.m38518g().containsKey(this.f36864i) && Boolean.TRUE.equals(C13334d.m38518g().get(this.f36864i))) {
            Map<String, Map<Long, Object>> mapM38517f = C13334d.m38517f();
            Map<Long, Object> map = mapM38517f.get(i + "_" + this.f36864i);
            Integer num = C13334d.m38514c().get(this.f36864i);
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (num != null) {
                this.f36873r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                if (jCurrentTimeMillis - next.longValue() >= c13635gM39718d.m39477b0() * 1000) {
                    mapM38517f.remove(i + "_" + this.f36864i);
                } else {
                    if (i == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (c13339a = this.f36861f) == null) {
                            return false;
                        }
                        if (this.f36829A >= list.size()) {
                            mapM38517f.remove(i + "_" + this.f36864i);
                            c13339a.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.f36829A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f36881z);
                        c13339a.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i2 >= this.f36829A) {
                                arrayList.add(frame);
                            }
                            i2++;
                        }
                        map.put(next, arrayList);
                        mapM38517f.put(i + "_" + this.f36864i, map);
                        c13339a.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        List<Campaign> arrayList2 = new ArrayList<>();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f36868m)) {
                                iMin = Math.min(this.f36880y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f36868m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i3);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    C13219q0.m37816b(f36826c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i2 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i2++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f36880y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i2 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i2++;
                                }
                            }
                        }
                        m38437c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public NativeController() {
        this.f36872q = 1;
        this.f36873r = 1;
        this.f36874s = -1;
        this.f36875t = 0;
        this.f36877v = false;
        this.f36878w = false;
        this.f36879x = false;
        this.f36880y = 0;
        this.f36881z = 0;
        this.f36829A = 0;
        this.f36830B = 0;
        this.f36834F = new CopyOnWriteArrayList<>();
        this.f36835G = new Hashtable<>();
        this.f36836H = 1;
        this.f36837I = 2;
        this.f36842N = "";
        this.f36843O = "";
        this.f36854Z = "";
    }

    /* JADX INFO: renamed from: a */
    public void m38463a(String str, int i, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f36866k;
        if ((queue != null && queue.size() <= 0) || this.f36866k == null) {
            C13339a c13339a = this.f36861f;
            if (c13339a == null || this.f36877v) {
                return;
            }
            this.f36877v = true;
            c13339a.m38555a(campaignEx, str);
            return;
        }
        m38467b(i, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.AbstractC13331a
    /* JADX INFO: renamed from: a */
    public synchronized void mo38459a(int i, long j, int i2, String str) {
        C13077k c13077k;
        try {
            if (this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f36873r = Math.max(this.f36850V, this.f36851W);
            }
            if (i2 == 0) {
                AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(i);
                if (abstractC13308bM38392a != null && m38437c(m38400a(1, m38404a(abstractC13308bM38392a.mo38383a(this.f36864i, this.f36873r))))) {
                    return;
                }
                C13324n c13324n = this.f36838J;
                if (c13324n != null && !this.f36849U) {
                    c13324n.m38484b(true);
                }
                if (this.f36849U && !this.f36877v) {
                    m38463a("mb load failed", i2, str, (CampaignEx) null);
                }
                if (!this.f36852X) {
                    return;
                }
            }
            int i3 = this.f36874s;
            if (i3 == -1) {
                this.f36874s = i;
            } else if (i3 != i) {
                this.f36875t = 0;
            }
            C13015e.m36643a(C13017g.m36693a(this.f36863h)).m36680d();
            C13343a c13343a = new C13343a(this.f36863h);
            C13126e c13126e = new C13126e();
            String strM36533b = C13008c.m36588n().m36533b();
            String strM36538c = C13008c.m36588n().m36538c();
            Map<String, Object> map = this.f36859d;
            if (map != null && map.containsKey("app_id") && this.f36859d.containsKey("app_key") && this.f36859d.containsKey(MBridgeConstans.KEY_WORD) && this.f36859d.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f36859d.get("app_id") instanceof String) {
                    strM36533b = (String) this.f36859d.get("app_id");
                }
                if (this.f36859d.get("app_key") instanceof String) {
                    strM36538c = (String) this.f36859d.get("app_key");
                }
                String str2 = this.f36859d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f36859d.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str2)) {
                    c13126e.m37245a("smart", C13207k0.m37713b(str2));
                }
            }
            c13126e.m37245a("app_id", strM36533b);
            c13126e.m37245a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f36864i);
            if (!TextUtils.isEmpty(this.f36865j)) {
                c13126e.m37245a(MBridgeConstans.PLACEMENT_ID, this.f36865j);
            }
            c13126e.m37245a("req_type", "2");
            if (!TextUtils.isEmpty(this.f36876u)) {
                c13126e.m37245a("category", this.f36876u);
            }
            c13126e.m37245a("sign", SameMD5.getMD5(strM36533b + strM36538c));
            if (this.f36848T > 0 && i2 == 0) {
                c13126e.m37245a("ad_num", this.f36848T + "");
            } else {
                c13126e.m37245a("ad_num", this.f36872q + "");
            }
            String strM37921d = C13229v0.m37921d(this.f36864i);
            if (!TextUtils.isEmpty(strM37921d)) {
                c13126e.m37245a("j", strM37921d);
            }
            c13126e.m37245a("only_impression", "1");
            c13126e.m37245a("ping_mode", "1");
            if (this.f36829A != 0) {
                c13126e.m37245a("frame_num", this.f36829A + "");
            }
            if (!TextUtils.isEmpty(this.f36868m)) {
                c13126e.m37245a(MBridgeConstans.NATIVE_INFO, this.f36868m);
                if (i == 1) {
                    c13126e.m37245a("tnum", this.f36836H + "");
                }
            } else if (i == 1) {
                c13126e.m37245a("tnum", this.f36872q + "");
            }
            m38488a(c13126e, i);
            String strM37102a = C13091b.m37102a(this.f36864i, "native");
            if (!TextUtils.isEmpty(strM37102a)) {
                c13126e.m37245a(C13126e.f36056g, strM37102a);
            }
            if (this.f36859d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                c13126e.m37245a("video_width", ((Integer) this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f36859d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                c13126e.m37245a("video_height", ((Integer) this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f36859d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f36859d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            c13126e.m37245a("video_version", "2.0");
            if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) == null) {
                C13636h.m39706b().m39708a();
            }
            if (!m38431b(this.f36859d)) {
                JSONArray jSONArrayM37908b = C13229v0.m37908b(this.f36863h, this.f36864i);
                if (jSONArrayM37908b.length() > 0) {
                    c13126e.m37245a(C13126e.f36057h, C13229v0.m37889a(jSONArrayM37908b));
                }
            }
            if (C13334d.m38518g().containsKey(this.f36864i) && C13334d.m38518g().get(this.f36864i).booleanValue() && C13334d.m38516e().get(this.f36864i) != null && (c13077k = C13334d.m38516e().get(this.f36864i)) != null) {
                if (i == 1) {
                    this.f36875t = c13077k.m36932a();
                } else if (i == 2) {
                    this.f36875t = c13077k.m36934b();
                }
            }
            c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, this.f36875t + "");
            c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
            c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
            if (!TextUtils.isEmpty(this.f36870o)) {
                c13126e.m37245a(C13126e.f36058i, this.f36870o);
            }
            C13324n c13324n2 = new C13324n();
            c13324n2.m38483b(m38406a(this.f36859d));
            c13324n2.setUnitId(this.f36864i);
            c13324n2.setPlacementId(this.f36865j);
            c13324n2.setAdType(42);
            c13324n2.m38484b(true);
            RunnableC13326p runnableC13326p = new RunnableC13326p(1, c13324n2, i2, str);
            c13324n2.m38480a(runnableC13326p);
            c13324n2.m38591a(i2);
            c13324n2.m38592a(str);
            if (i2 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    c13126e.m37245a("token", str);
                }
                c13343a.choiceV3OrV5BySetting(1, c13126e, c13324n2, str, C13092c.m37115a(j, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            }
            if (i2 == 1) {
                c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, c13324n2, "campaign", C13092c.m37115a(j, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            }
            this.f36945a.postDelayed(runnableC13326p, j);
        } catch (Exception e) {
            String str3 = f36826c0;
            C13219q0.m37816b(str3, C13310a.m38393a(e));
            C13219q0.m37816b(str3, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38407a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableM36524a;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableM36524a = C13008c.m36588n().m36524a(this.f36864i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i++;
            }
            if (imageView == null) {
                imageView = new ImageView(C13008c.m36588n().m36542d());
                imageView.setTag("mb_wm");
                C13229v0.m37880a(imageView, bitmapDrawableM36524a, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                AdSession adSession = this.f36855a0;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.f36844P = new ViewTreeObserverOnGlobalLayoutListenerC13315e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f36844P);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38462a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            m38407a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f36862g;
            if (nativeTrackingListener != null) {
                this.f36871p.m34636a(nativeTrackingListener);
            }
            C13309c.m38392a(campaign.getType()).mo38386a(this.f36864i, campaign, this.f36842N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i = MBMediaView.f37294p0;
            } catch (Throwable unused) {
                cls = null;
            }
            C13091b.m37104a(this.f36864i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                C13185b1.m37632a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new C13316f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    C13185b1.m37632a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new C13317g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            m38410a(campaignEx, view, list);
            Log.e(f36826c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            C13219q0.m37816b(f36826c0, "registerview exception!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38461a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f36862g;
            if (nativeTrackingListener != null) {
                this.f36871p.m34636a(nativeTrackingListener);
            }
            C13309c.m38392a(campaign.getType()).mo38386a(this.f36864i, campaign, this.f36842N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            C13091b.m37104a(this.f36864i, campaignEx, "native");
            C13185b1.m37632a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            C13319i c13319i = new C13319i(campaignEx);
            try {
                int i = MBMediaView.f37294p0;
                m38409a(campaignEx, view, c13319i, MBMediaView.class);
            } catch (Throwable unused) {
                m38409a(campaignEx, view, c13319i, (Class) null);
            }
            if (!C13884b.m41421a()) {
                m38407a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            m38410a(campaignEx, view, (List<View>) arrayList);
            C13219q0.m37818c(f36826c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            C13219q0.m37816b(f36826c0, "registerview exception!");
        }
    }

    /* JADX INFO: renamed from: a */
    private AdSession m38396a(CampaignEx campaignEx) {
        if (this.f36835G == null) {
            this.f36835G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSessionM38946a = this.f36835G.get(requestIdNotice);
        if (adSessionM38946a == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            adSessionM38946a = C13439b.m38946a(this.f36863h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f36864i, "", campaignEx.getRequestIdNotice());
        }
        if (adSessionM38946a != null) {
            this.f36835G.put(requestIdNotice, adSessionM38946a);
        }
        return adSessionM38946a;
    }

    /* JADX INFO: renamed from: a */
    private void m38410a(CampaignEx campaignEx, View view, List<View> list) {
        Exception exc;
        AdSession adSessionM38396a;
        try {
            if (this.f36863h == null || campaignEx == null) {
                adSessionM38396a = null;
            } else {
                try {
                    adSessionM38396a = m38396a(campaignEx);
                    if (adSessionM38396a != null) {
                        adSessionM38396a.registerAdView(view);
                        adSessionM38396a.start();
                    }
                } catch (Exception e) {
                    exc = e;
                    C13219q0.m37816b(f36826c0, C13310a.m38393a(exc));
                }
            }
            AdSession adSession = adSessionM38396a;
            C13640l c13640l = this.f36845Q;
            int iM39666s = c13640l != null ? c13640l.m39666s() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                iM39666s = 0;
            }
            try {
                C13329s c13329s = new C13329s(campaignEx, view, list, this, adSession);
                if (this.f36834F == null) {
                    this.f36834F = new CopyOnWriteArrayList<>();
                }
                this.f36834F.add(c13329s);
                c13329s.setOnStateChangeListener(new C13320j(c13329s));
                Handler handler = this.f36945a;
                if (handler != null) {
                    handler.postDelayed(c13329s, iM39666s * 1000);
                }
            } catch (Exception e2) {
                e = e2;
                exc = e;
                C13219q0.m37816b(f36826c0, C13310a.m38393a(exc));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38409a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        C13185b1.m37632a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m38409a(campaignEx, viewGroup.getChildAt(i), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38411a(CampaignEx campaignEx, View view, List<View> list, AdSession adSession) {
        try {
            C13321k c13321k = new C13321k(campaignEx);
            C13333c c13333c = new C13333c(list, c13321k, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            c13333c.m38504a(view);
            List<C13333c> list2 = this.f36832D;
            if (list2 != null) {
                list2.add(c13333c);
            }
            List<C13333c.d> list3 = this.f36833E;
            if (list3 != null) {
                list3.add(c13321k);
            }
            AdEvents adEvents = this.f36857b0;
            if (adEvents != null) {
                adEvents.impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38408a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m38408a(viewGroup.getChildAt(i), cls);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public List<Campaign> m38458a(String str, int i, String str2) {
        int i2;
        int i3;
        List<Campaign> listM38400a = null;
        if (this.f36856b != null) {
            ArrayList arrayList = new ArrayList(this.f36856b);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(((Integer) arrayList.get(i4)).intValue());
                if (abstractC13308bM38392a != null) {
                    if ((((Integer) arrayList.get(i4)).intValue() == 1 || ((Integer) arrayList.get(i4)).intValue() == 2) && this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i3 = this.f36836H;
                    } else {
                        i3 = this.f36872q;
                    }
                    listM38400a = m38400a(((Integer) arrayList.get(i4)).intValue(), abstractC13308bM38392a.mo38383a(str, i3));
                    if (listM38400a != null) {
                        break;
                    }
                }
            }
            if (listM38400a == null) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a2 = C13309c.m38392a(((Integer) arrayList.get(i5)).intValue());
                    if ((((Integer) arrayList.get(i5)).intValue() == 1 || ((Integer) arrayList.get(i5)).intValue() == 2) && this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i2 = this.f36836H;
                    } else {
                        i2 = this.f36872q;
                    }
                    listM38400a = m38400a(((Integer) arrayList.get(i5)).intValue(), abstractC13308bM38392a2.mo38389b(str, i2));
                    if (listM38400a != null) {
                        break;
                    }
                }
            }
        }
        return m38404a(listM38400a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38418a(List<Campaign> list, int i, NativeListener.NativeAdListener nativeAdListener) {
        this.f36945a.post(new RunnableC13311a(list, nativeAdListener, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38417a(C13339a c13339a, String str, CampaignEx campaignEx) {
        this.f36945a.post(new RunnableC13312b(c13339a, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List<Campaign> m38400a(int i, List<Campaign> list) {
        if (i == 1 && this.f36859d.containsKey(MBridgeConstans.NATIVE_INFO) && list != null && list.size() > 0) {
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            int template = campaignEx != null ? campaignEx.getTemplate() : 1;
            if (template == 2) {
                int size = list.size();
                int i2 = this.f36850V;
                if (size >= i2) {
                    return list.subList(0, i2);
                }
            } else if (template == 3) {
                int size2 = list.size();
                int i3 = this.f36851W;
                if (size2 >= i3) {
                    return list.subList(0, i3);
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: a */
    private void m38419a(List<Campaign> list, InterfaceC13325o interfaceC13325o) {
        m38433c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.f36841M = timer;
        timer.schedule(new C13314d(jCurrentTimeMillis, interfaceC13325o, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List<Campaign> m38405a(List<Campaign> list, boolean z) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id = campaign.getId();
                boolean z2 = campaign instanceof CampaignEx;
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb.append(campaignEx.getVideoUrlEncode());
                    sb.append(campaignEx.getBidToken());
                    id = sb.toString();
                }
                C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f36864i, id);
                if (z) {
                    if (c14202aM42516a == null || !C14213l.m42590a(c14202aM42516a, m38447h().m39606C())) {
                        C13309c.m38392a(campaign.getType()).mo38386a(this.f36864i, list.remove(size), this.f36842N);
                    }
                } else if (z2) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (c14202aM42516a == null || !C14213l.m42590a(c14202aM42516a, m38447h().m39606C()))) {
                        C13309c.m38392a(campaign.getType()).mo38386a(this.f36864i, list.remove(size), this.f36842N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List<Campaign> m38404a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.f36842N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.f36842N) && TextUtils.equals(campaignEx.getBidToken(), this.f36842N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.f36842N) ? arrayList2 : arrayList;
    }
}
