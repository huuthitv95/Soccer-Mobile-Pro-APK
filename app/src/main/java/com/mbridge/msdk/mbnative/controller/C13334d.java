package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.RoomMasterTable;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13077k;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.same.report.metrics.callback.InterfaceC13155a;
import com.mbridge.msdk.foundation.same.task.C13164b;
import com.mbridge.msdk.foundation.same.task.InterfaceC13166d;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbnative.cache.AbstractC13308b;
import com.mbridge.msdk.mbnative.cache.C13309c;
import com.mbridge.msdk.mbnative.common.C13310a;
import com.mbridge.msdk.mbnative.report.C13340a;
import com.mbridge.msdk.mbnative.service.net.AbstractC13344b;
import com.mbridge.msdk.mbnative.service.net.C13343a;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.preload.listenter.C13604a;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.listener.InterfaceC14217a;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d */
/* JADX INFO: compiled from: NativePreloadController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13334d extends AbstractC13332b {

    /* JADX INFO: renamed from: r */
    private static final String f36958r = "d";

    /* JADX INFO: renamed from: s */
    private static Map<String, Map<Long, Object>> f36959s = new HashMap();

    /* JADX INFO: renamed from: t */
    private static Map<String, Boolean> f36960t = new HashMap();

    /* JADX INFO: renamed from: u */
    private static Map<String, C13077k> f36961u = new HashMap();

    /* JADX INFO: renamed from: v */
    private static Map<String, Integer> f36962v = new HashMap();

    /* JADX INFO: renamed from: w */
    private static Map<String, Integer> f36963w = new HashMap();

    /* JADX INFO: renamed from: x */
    private static C13334d f36964x = null;

    /* JADX INFO: renamed from: y */
    private static int f36965y = -1;

    /* JADX INFO: renamed from: z */
    private static int f36966z = -2;

    /* JADX INFO: renamed from: b */
    private C13638j f36967b;

    /* JADX INFO: renamed from: c */
    private C12682a f36968c;

    /* JADX INFO: renamed from: d */
    private C13640l f36969d;

    /* JADX INFO: renamed from: e */
    private String f36970e;

    /* JADX INFO: renamed from: i */
    private Map<String, Object> f36974i;

    /* JADX INFO: renamed from: j */
    private List<Integer> f36975j;

    /* JADX INFO: renamed from: k */
    protected List<Integer> f36976k;

    /* JADX INFO: renamed from: l */
    private List<Integer> f36977l;

    /* JADX INFO: renamed from: m */
    private boolean f36978m;

    /* JADX INFO: renamed from: n */
    private boolean f36979n;

    /* JADX INFO: renamed from: o */
    private int f36980o;

    /* JADX INFO: renamed from: p */
    private int f36981p;

    /* JADX INFO: renamed from: f */
    Queue<Integer> f36971f = null;

    /* JADX INFO: renamed from: g */
    Queue<Long> f36972g = null;

    /* JADX INFO: renamed from: h */
    private int f36973h = 0;

    /* JADX INFO: renamed from: q */
    private C13164b f36982q = new C13164b(C13008c.m36588n().m36542d());

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$a */
    /* JADX INFO: compiled from: NativePreloadController.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b */
    /* JADX INFO: compiled from: NativePreloadController.java */
    public class b extends AbstractC13344b implements InterfaceC13166d {

        /* JADX INFO: renamed from: c */
        private int f36984c;

        /* JADX INFO: renamed from: d */
        private int f36985d;

        /* JADX INFO: renamed from: e */
        private int f36986e;

        /* JADX INFO: renamed from: f */
        private int f36987f;

        /* JADX INFO: renamed from: g */
        private int f36988g;

        /* JADX INFO: renamed from: j */
        private Runnable f36991j;

        /* JADX INFO: renamed from: l */
        private C13604a f36993l;

        /* JADX INFO: renamed from: h */
        private List<String> f36989h = null;

        /* JADX INFO: renamed from: i */
        private boolean f36990i = false;

        /* JADX INFO: renamed from: k */
        private boolean f36992k = true;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$a */
        /* JADX INFO: compiled from: NativePreloadController.java */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignUnit f36995a;

            a(CampaignUnit campaignUnit) {
                this.f36995a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (b.this.f36991j != null) {
                    b bVar = b.this;
                    C13334d.this.f36946a.removeCallbacks(bVar.f36991j);
                }
                if (C13884b.m41421a()) {
                    C13334d.this.m38493a(this.f36995a);
                }
                if (C13334d.f36959s.containsKey("0_" + b.this.unitId)) {
                    C13334d.f36959s.remove("0_" + b.this.unitId);
                }
                if (b.this.f36988g > 0) {
                    if (this.f36995a.ads.size() > b.this.f36988g) {
                        b bVar2 = b.this;
                        bVar2.f36985d = bVar2.f36988g;
                    } else {
                        b.this.f36985d = this.f36995a.ads.size();
                    }
                } else if (b.this.f36988g == -1) {
                    b.this.f36985d = 0;
                } else if (b.this.f36988g == -3) {
                    b.this.f36985d = this.f36995a.ads.size();
                } else if (b.this.f36988g == -2) {
                    if (this.f36995a.getTemplate() == 3) {
                        if (b.this.f36987f != 0) {
                            b bVar3 = b.this;
                            bVar3.f36985d = bVar3.f36987f;
                        }
                    } else if (b.this.f36986e != 0) {
                        b bVar4 = b.this;
                        bVar4.f36985d = bVar4.f36986e;
                    }
                    if (b.this.f36985d <= 0) {
                        b.this.f36985d = ((Integer) C13334d.f36962v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f36995a.ads.size() < b.this.f36985d) {
                    b.this.f36985d = this.f36995a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C13157e c13157e = new C13157e();
                c13157e.m37501a("adtp", 42);
                if (TextUtils.isEmpty(b.this.m38593b())) {
                    c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
                }
                C13154c c13154cM37478a = C13156d.m37475b().m37478a(true, b.this.m38593b(), c13157e, this.f36995a.getAds().get(0), b.this.unitId);
                for (int i = 0; i < this.f36995a.ads.size(); i++) {
                    CampaignEx campaignEx = this.f36995a.ads.get(i);
                    campaignEx.setLocalRequestId(c13154cM37478a.m37463t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zM37915c = C13229v0.m37915c(C13008c.m36588n().m36542d(), campaignEx.getPackageName());
                    C13334d.this.m38492a(C13008c.m36588n().m36542d(), campaignEx);
                    if (arrayList.size() < b.this.f36985d && campaignEx.getOfferType() != 99) {
                        if (C13229v0.m37916c(campaignEx)) {
                            campaignEx.setRtinsType(zM37915c ? 1 : 2);
                        }
                        if (C13092c.m37123b(C13008c.m36588n().m36542d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            C13229v0.m37896a(b.this.unitId, campaignEx, C13088a.f35882x);
                        }
                        b.this.m38530a(campaignEx, null, null);
                    }
                    C13334d c13334d = C13334d.this;
                    c13334d.m38526a(c13334d.f36978m, campaignEx);
                }
                b bVar5 = b.this;
                C13334d.this.m38509a(arrayList2, bVar5.unitId);
                AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(this.f36995a.getAds().get(0) != null ? this.f36995a.getAds().get(0).getType() : 1);
                if (abstractC13308bM38392a != null) {
                    abstractC13308bM38392a.mo38384a(b.this.unitId, arrayList);
                }
                C13334d.m38507a(b.this.f36984c, b.this.unitId);
                if (Looper.myLooper() != null && z) {
                    Looper.loop();
                }
                if (this.f36995a.getAds().get(0) != null) {
                    C12684c.m34654a(C13008c.m36588n().m36542d(), this.f36995a.getAds().get(0).getMaitve(), this.f36995a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativePreloadController.java */
        class C15555b extends C13092c.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CampaignEx f36997a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Context f36998b;

            C15555b(CampaignEx campaignEx, Context context, InterfaceC13155a interfaceC13155a) {
                this.f36997a = campaignEx;
                this.f36998b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.C13092c.a
            /* JADX INFO: renamed from: a */
            public void mo34472a(String str, C13154c c13154c) {
                C13340a.m38563a(str, c13154c, this.f36997a, this.f36998b, (InterfaceC13155a) null);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$c */
        /* JADX INFO: compiled from: NativePreloadController.java */
        class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f37000a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ int f37001b;

            c(String str, int i) {
                this.f37000a = str;
                this.f37001b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.f36990i) {
                    if (b.this.f36991j != null) {
                        b bVar = b.this;
                        C13334d.this.f36946a.removeCallbacks(bVar.f36991j);
                    }
                    if (b.this.m38590a() == 1 || b.this.f36992k) {
                        b bVar2 = b.this;
                        C13334d c13334d = C13334d.this;
                        String str = this.f37000a;
                        int iM38590a = bVar2.m38590a();
                        b bVar3 = b.this;
                        c13334d.m38522a(str, iM38590a, bVar3.unitId, bVar3.placementId, bVar3.f36993l);
                    }
                } else if (b.this.f36992k) {
                    b bVar4 = b.this;
                    C13334d c13334d2 = C13334d.this;
                    String str2 = this.f37000a;
                    int iM38590a2 = bVar4.m38590a();
                    b bVar5 = b.this;
                    c13334d2.m38522a(str2, iM38590a2, bVar5.unitId, bVar5.placementId, bVar5.f36993l);
                }
                if (this.f37001b == -1) {
                    C13334d.m38513b(b.this.f36984c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d */
        /* JADX INFO: compiled from: NativePreloadController.java */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ List f37003a;

            d(List list) {
                this.f37003a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.f36990i && b.this.f36991j != null) {
                    b bVar = b.this;
                    C13334d.this.f36946a.removeCallbacks(bVar.f36991j);
                }
                List list = this.f37003a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f37003a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            C13334d c13334d = C13334d.this;
                            c13334d.m38526a(c13334d.f36978m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f37003a);
                    if (C13334d.f36959s.containsKey("1_" + b.this.unitId)) {
                        C13334d.f36959s.remove("1_" + b.this.unitId);
                    }
                    C13334d.f36959s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i) {
            this.f36984c = i;
        }

        /* JADX INFO: renamed from: b */
        public void m38543b(List<String> list) {
            this.f36989h = list;
        }

        /* JADX INFO: renamed from: c */
        public void m38545c(int i) {
            this.f36986e = i;
        }

        /* JADX INFO: renamed from: d */
        public void m38546d(int i) {
            this.f36985d = i;
        }

        /* JADX INFO: renamed from: e */
        public void m38547e(int i) {
            this.f36987f = i;
        }

        /* JADX INFO: renamed from: b */
        public void m38542b(int i) {
            this.f36988g = i;
        }

        /* JADX INFO: renamed from: a */
        public void m38540a(C13604a c13604a) {
            this.f36993l = c13604a;
        }

        /* JADX INFO: renamed from: b */
        public void m38544b(boolean z) {
            this.f36992k = z;
        }

        @Override // com.mbridge.msdk.foundation.same.task.InterfaceC13166d
        /* JADX INFO: renamed from: a */
        public void mo37541a(boolean z) {
            this.f36990i = z;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38482a(List<C13837g> list, CampaignUnit campaignUnit) {
            C13334d.this.f36979n = true;
            C13334d.this.m38527a(true, this.f36993l, (String) null);
            C13334d.this.m38524a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m38530a(CampaignEx campaignEx, C13154c c13154c, InterfaceC13155a interfaceC13155a) {
            try {
                Context contextM36542d = C13008c.m36588n().m36542d();
                C13092c.m37119a(campaignEx, contextM36542d, c13154c, new C15555b(campaignEx, contextM36542d, interfaceC13155a));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38479a(int i, String str) {
            C13334d.this.m38524a(new Thread(new c(str, i)));
        }

        /* JADX INFO: renamed from: a */
        public void m38541a(Runnable runnable) {
            this.f36991j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.AbstractC13344b
        /* JADX INFO: renamed from: a */
        public void mo38481a(List<Frame> list) {
            C13334d.this.m38524a(new Thread(new d(list)));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$c */
    /* JADX INFO: compiled from: NativePreloadController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f37005a;

        /* JADX INFO: renamed from: b */
        private InterfaceC13166d f37006b;

        /* JADX INFO: renamed from: c */
        private int f37007c;

        /* JADX INFO: renamed from: d */
        private String f37008d;

        /* JADX INFO: renamed from: e */
        private String f37009e;

        /* JADX INFO: renamed from: f */
        private C13604a f37010f;

        /* JADX INFO: renamed from: g */
        private boolean f37011g = false;

        public c(int i, InterfaceC13166d interfaceC13166d, int i2, String str, String str2) {
            this.f37005a = i;
            this.f37006b = interfaceC13166d;
            this.f37007c = i2;
            this.f37008d = str;
            this.f37009e = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m38550a(boolean z) {
            this.f37011g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37006b.mo37541a(true);
            int i = this.f37005a;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C13334d.this.m38522a("REQUEST_TIMEOUT", this.f37007c, this.f37008d, this.f37009e, this.f37010f);
            } else {
                C13334d.this.f36979n = true;
                if (this.f37011g || this.f37007c == 1) {
                    C13334d.this.m38522a("REQUEST_TIMEOUT", this.f37007c, this.f37008d, this.f37009e, this.f37010f);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m38548a(C13604a c13604a) {
            this.f37010f = c13604a;
        }

        /* JADX INFO: renamed from: a */
        public void m38549a(String str) {
            this.f37008d = str;
        }
    }

    public C13334d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f36946a = new a();
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, Integer> m38514c() {
        return f36962v;
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, Integer> m38515d() {
        return f36963w;
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, C13077k> m38516e() {
        return f36961u;
    }

    /* JADX INFO: renamed from: f */
    public static Map<String, Map<Long, Object>> m38517f() {
        return f36959s;
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, Boolean> m38518g() {
        return f36960t;
    }

    /* JADX INFO: renamed from: b */
    public static void m38513b(int i, String str) {
        if (f36961u.containsKey(str)) {
            C13077k c13077k = f36961u.get(str);
            if (i == 1) {
                c13077k.m36933a(0);
            } else if (i == 2) {
                c13077k.m36935b(0);
            }
            f36961u.put(str, c13077k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX INFO: renamed from: a */
    public void m38525a(Map<String, Object> map, int i) {
        String str;
        String str2;
        C13604a c13604a;
        List<Campaign> listMo38383a;
        Object obj;
        try {
            this.f36974i = map;
            this.f36979n = false;
            if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                String str3 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                if (f36959s.containsKey(((i + 1) % 2) + "_" + str3)) {
                    if (!f36959s.containsKey(i + "_" + str3)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                    this.f36978m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
                }
                C12682a c12682a = this.f36968c;
                if (c12682a == null) {
                    this.f36968c = new C12682a(C13008c.m36588n().m36542d(), str3);
                } else {
                    c12682a.m34637a(str3);
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.f36973h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                    this.f36970e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                if (f36960t.containsKey(str3) && f36960t.get(str3).booleanValue()) {
                    Map<String, Map<Long, Object>> mapM38517f = m38517f();
                    Map<Long, Object> map2 = mapM38517f.get(i + "_" + str3);
                    C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                    if (map2 != null && map2.size() > 0) {
                        Long next = map2.keySet().iterator().next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (c13635gM39718d == null) {
                            c13635gM39718d = C13636h.m39706b().m39708a();
                        }
                        if (jCurrentTimeMillis - next.longValue() >= c13635gM39718d.m39477b0() * 1000) {
                            mapM38517f.remove(str3);
                        } else if (i == 1) {
                            return;
                        }
                    }
                }
                f36960t.put(str3, Boolean.TRUE);
                this.f36981p = 1;
                try {
                    if (map.containsKey("ad_num")) {
                        int iIntValue = ((Integer) map.get("ad_num")).intValue();
                        this.f36981p = iIntValue;
                        if (iIntValue < 1) {
                            this.f36981p = 1;
                        }
                        if (this.f36981p > 10) {
                            this.f36981p = 10;
                        }
                    }
                } catch (Exception unused) {
                    C13219q0.m37816b(f36958r, "ADNUM MUST BE INTEGER");
                }
                f36962v.put(str3, Integer.valueOf(this.f36981p));
                C13604a c13604a2 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new C13604a((PreloadListener) obj);
                String strM36533b = C13008c.m36588n().m36533b();
                String strM36538c = C13008c.m36588n().m36538c();
                if (map.containsKey("app_id") && map.containsKey("app_key") && map.containsKey(MBridgeConstans.KEY_WORD)) {
                    strM36533b = (String) map.get("app_id");
                    strM36538c = (String) map.get("app_key");
                }
                m38523a(strM36533b, strM36538c, str3);
                C13640l c13640lM39720e = C13636h.m39706b().m39720e(strM36533b, str3);
                this.f36969d = c13640lM39720e;
                if (c13640lM39720e == null) {
                    this.f36969d = C13640l.m39753i(str3);
                }
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                String str4 = str;
                this.f36975j = this.f36969d.m39622b();
                this.f36976k = this.f36969d.m39627c();
                this.f36977l = this.f36969d.m39627c();
                List<Integer> list = this.f36975j;
                if (list == null || list.size() <= 0) {
                    C13604a c13604a3 = c13604a2;
                    if (c13604a3 != null) {
                        c13604a3.onPreloadFaild("do not have sorceList");
                        return;
                    }
                    return;
                }
                this.f36971f = new LinkedList();
                Iterator<Integer> it = this.f36975j.iterator();
                while (it.hasNext()) {
                    this.f36971f.add(it.next());
                }
                List<Integer> list2 = this.f36977l;
                if (list2 != null && list2.size() > 0) {
                    this.f36972g = new LinkedList();
                    Iterator<Integer> it2 = this.f36977l.iterator();
                    while (it2.hasNext()) {
                        this.f36972g.add(Long.valueOf(it2.next().intValue() * 1000));
                    }
                }
                if (this.f36975j.contains(1) && i == 0) {
                    try {
                        str2 = str3;
                        c13604a = c13604a2;
                        try {
                            try {
                                m38491a(1, this.f36976k.get(this.f36975j.indexOf(1)).intValue() * 1000, i, this.f36969d, str2, str4, false, c13604a);
                                str4 = str4;
                                AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(1);
                                if (abstractC13308bM38392a != null && (listMo38383a = abstractC13308bM38392a.mo38383a(str2, 0)) != null && listMo38383a.size() > 0) {
                                    m38527a(true, c13604a, (String) null);
                                }
                            } catch (Exception unused2) {
                                str4 = str4;
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        str2 = str3;
                        c13604a = c13604a2;
                    }
                } else {
                    str2 = str3;
                    c13604a = c13604a2;
                }
                String str5 = str2;
                m38521a(i, this.f36969d, str5, str4, c13604a);
                C13640l c13640l = this.f36969d;
                m38515d().put(str5, Integer.valueOf(c13640l != null ? c13640l.m39678y() * this.f36981p : 1));
                try {
                    int i2 = MBMediaView.f37294p0;
                    C13335e.m38551a(C13008c.m36588n().m36542d(), str5);
                    C13215o0.m37791a();
                    if (TextUtils.isEmpty(str5)) {
                        return;
                    }
                    C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36680d();
                    int iM38505a = m38505a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                    if (iM38505a <= 0) {
                        iM38505a = this.f36981p;
                    }
                    List<Campaign> listM38519a = m38519a(str5, iM38505a);
                    if (listM38519a != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < listM38519a.size(); i3++) {
                            CampaignEx campaignEx = (CampaignEx) listM38519a.get(i3);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Object objInvoke = C14203b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                            C14203b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, InterfaceC14217a.class).invoke(objInvoke, C13008c.m36588n().m36542d(), str5, new CopyOnWriteArrayList(arrayList), 1, null);
                            C14203b.class.getMethod("load", String.class).invoke(objInvoke, str5);
                        }
                    }
                } catch (Throwable unused5) {
                    C13219q0.m37816b(f36958r, "init cam cache failed");
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(f36958r, C13310a.m38393a(e));
        }
    }

    /* JADX INFO: renamed from: a */
    private int m38505a(String str) {
        if (str == null) {
            return 0;
        }
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
            C13219q0.m37816b(f36958r, C13310a.m38393a(e));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public List<Campaign> m38519a(String str, int i) {
        AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a;
        C13640l c13640lM39720e = C13636h.m39706b().m39720e("", str);
        this.f36969d = c13640lM39720e;
        if (c13640lM39720e == null) {
            this.f36969d = C13640l.m39753i(str);
        }
        List<Integer> listM39622b = this.f36969d.m39622b();
        this.f36975j = listM39622b;
        if (listM39622b == null || listM39622b.size() <= 0 || !this.f36975j.contains(1) || (abstractC13308bM38392a = C13309c.m38392a(1)) == null) {
            return null;
        }
        return abstractC13308bM38392a.mo38383a(str, i);
    }

    /* JADX INFO: renamed from: a */
    public void m38521a(int i, C13640l c13640l, String str, String str2, C13604a c13604a) {
        Queue<Integer> queue = this.f36971f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f36971f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f36972g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f36972g.poll().longValue();
            }
            C13219q0.m37818c(f36958r, "preload start queue adsource = " + iIntValue);
            m38520a(iIntValue, jLongValue, str, str2, this.f36974i, i, c13640l, c13604a);
        } catch (Throwable unused) {
            C13219q0.m37816b(f36958r, "queue poll exception");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38520a(int i, long j, String str, String str2, Map<String, Object> map, int i2, C13640l c13640l, C13604a c13604a) {
        AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a;
        List<Campaign> listMo38383a;
        if (i != 1 && (abstractC13308bM38392a = C13309c.m38392a(i)) != null && (listMo38383a = abstractC13308bM38392a.mo38383a(str, this.f36981p)) != null && listMo38383a.size() > 0) {
            m38527a(true, c13604a, (String) null);
            return;
        }
        if (i == 1) {
            m38491a(i, j, i2, c13640l, str, str2, true, c13604a);
        } else if (i != 2) {
            mo38490a(i, j, i2, c13640l, str, str2, c13604a, false);
        } else {
            mo38490a(2, j, i2, c13640l, str, str2, c13604a, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x028a A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0299 A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02ab A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x02bf A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02df  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ed A[Catch: Exception -> 0x0463, TRY_ENTER, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0302  */
    /* JADX WARN: Code duplicated, block: B:143:0x0305 A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0354 A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0361 A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0393 A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x03ee A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x041d A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0431  */
    /* JADX WARN: Code duplicated, block: B:166:0x043a A[Catch: Exception -> 0x0463, TryCatch #3 {Exception -> 0x0463, blocks: (B:3:0x0018, B:6:0x0063, B:8:0x0069, B:10:0x0071, B:12:0x0079, B:14:0x0081, B:16:0x008b, B:17:0x0095, B:19:0x009f, B:20:0x00a9, B:22:0x00b3, B:24:0x00bd, B:26:0x00c3, B:27:0x00cc, B:29:0x00e5, B:30:0x00ec, B:32:0x00f2, B:33:0x00f7, B:35:0x011e, B:36:0x0123, B:43:0x013c, B:46:0x0144, B:48:0x014c, B:50:0x0152, B:52:0x0157, B:54:0x015b, B:59:0x0168, B:61:0x0170, B:63:0x0176, B:68:0x0182, B:69:0x0194, B:71:0x0198, B:73:0x01b3, B:75:0x01bb, B:77:0x01ca, B:78:0x01db, B:82:0x01ec, B:84:0x01f2, B:86:0x0206, B:88:0x020c, B:91:0x0213, B:93:0x0219, B:100:0x022a, B:107:0x024d, B:114:0x0261, B:116:0x028a, B:117:0x0291, B:119:0x0299, B:121:0x02ab, B:122:0x02b4, B:124:0x02bf, B:130:0x02cf, B:135:0x02e0, B:140:0x02ed, B:144:0x0319, B:146:0x0354, B:147:0x0359, B:149:0x0361, B:151:0x036b, B:152:0x038b, B:154:0x0393, B:156:0x039d, B:157:0x03bd, B:161:0x03f1, B:163:0x041d, B:167:0x0451, B:166:0x043a, B:160:0x03ee, B:143:0x0305, B:131:0x02d4, B:132:0x02d9, B:106:0x0242, B:108:0x0251, B:168:0x0457), top: B:179:0x0018 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x02ed, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x0305, please report this as an issue */
    @Override // com.mbridge.msdk.mbnative.controller.AbstractC13332b
    /* JADX INFO: renamed from: a */
    public void mo38490a(int i, long j, int i2, C13640l c13640l, String str, String str2, C13604a c13604a, boolean z) {
        int i3;
        int iOptInt;
        int iOptInt2;
        int i4;
        int i5;
        String strM37102a;
        b bVar;
        long j2;
        C13077k c13077k;
        int iM36932a;
        JSONArray jSONArrayM37908b;
        String str3;
        String string;
        int i6;
        List<Campaign> listMo38383a;
        List<Campaign> listMo38383a2;
        try {
            C13015e.m36643a(C13017g.m36693a(C13008c.m36588n().m36542d())).m36680d();
            int iM39638f = this.f36969d.m39638f();
            int iM39635e = this.f36969d.m39635e();
            C13343a c13343a = new C13343a(C13008c.m36588n().m36542d());
            C13126e c13126e = new C13126e();
            String strM36533b = C13008c.m36588n().m36533b();
            String strM36538c = C13008c.m36588n().m36538c();
            Map<String, Object> map = this.f36974i;
            if (map != null && map.containsKey("app_id") && this.f36974i.containsKey("app_key") && this.f36974i.containsKey(MBridgeConstans.KEY_WORD) && this.f36974i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f36974i.get("app_id") instanceof String) {
                    strM36533b = (String) this.f36974i.get("app_id");
                }
                if (this.f36974i.get("app_key") instanceof String) {
                    strM36538c = (String) this.f36974i.get("app_key");
                }
                String str4 = this.f36974i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f36974i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str4)) {
                    c13126e.m37245a("smart", C13207k0.m37713b(str4));
                }
            }
            String str5 = strM36533b;
            String str6 = strM36538c;
            c13126e.m37245a("app_id", str5);
            c13126e.m37245a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            c13126e.m37245a("req_type", "1");
            if (!TextUtils.isEmpty(this.f36970e)) {
                c13126e.m37245a("category", this.f36970e);
            }
            if (!TextUtils.isEmpty(str2)) {
                c13126e.m37245a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            c13126e.m37245a("sign", SameMD5.getMD5(str5 + str6));
            c13126e.m37245a("only_impression", "1");
            String strM37921d = C13229v0.m37921d(str);
            if (!TextUtils.isEmpty(strM37921d)) {
                c13126e.m37245a("j", strM37921d);
            }
            int iIntValue = f36962v.get(str).intValue();
            if (iM39638f != f36965y && iM39638f != 0 && iIntValue != 0) {
                if (i2 == 0) {
                    AbstractC13308b<String, List<Campaign>> abstractC13308bM38392a = C13309c.m38392a(i);
                    if (z) {
                        if (abstractC13308bM38392a != null && (listMo38383a2 = abstractC13308bM38392a.mo38383a(str, iIntValue)) != null && listMo38383a2.size() > 0) {
                            m38527a(true, c13604a, (String) null);
                            return;
                        } else {
                            if (this.f36979n) {
                                m38522a("", i2, str, str2, c13604a);
                                return;
                            }
                            return;
                        }
                    }
                    if (i != 1 && abstractC13308bM38392a != null && (listMo38383a = abstractC13308bM38392a.mo38383a(str, iIntValue)) != null && listMo38383a.size() > 0) {
                        m38527a(true, c13604a, (String) null);
                        return;
                    }
                }
                if (iIntValue != 0) {
                    c13126e.m37245a("ad_num", iIntValue + "");
                }
                if (this.f36973h != 0) {
                    c13126e.m37245a("frame_num", this.f36973h + "");
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str7 = (String) this.f36974i.get(MBridgeConstans.NATIVE_INFO);
                    if (!TextUtils.isEmpty(str7)) {
                        C13219q0.m37816b(f36958r, "nativeinfo" + str7);
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            str3 = str7;
                            if (jSONArray.length() > 0) {
                                int i7 = 0;
                                iOptInt = 0;
                                iOptInt2 = 0;
                                while (i7 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i7);
                                        JSONArray jSONArray2 = jSONArray;
                                        int i8 = i7;
                                        int iOptInt3 = jSONObject.optInt("id", 0);
                                        if (2 == iOptInt3) {
                                            iOptInt = jSONObject.optInt("ad_num");
                                            if (iM39638f > 0) {
                                                jSONObject.put("ad_num", iM39638f);
                                            }
                                        } else if (3 == iOptInt3) {
                                            iOptInt2 = jSONObject.optInt("ad_num");
                                            if (iM39638f > 0) {
                                                jSONObject.put("ad_num", iM39638f);
                                            }
                                        }
                                        i7 = i8 + 1;
                                        jSONArray = jSONArray2;
                                    } catch (JSONException e) {
                                        e = e;
                                        C13219q0.m37816b(f36958r, C13310a.m38393a(e));
                                        string = str3;
                                        c13126e.m37245a(MBridgeConstans.NATIVE_INFO, string);
                                        iM39638f = iIntValue;
                                        i3 = iOptInt2;
                                        c13126e.m37245a("ad_num", iM39638f + "");
                                        c13126e.m37245a("ping_mode", "1");
                                        if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) == null) {
                                            C13636h.m39706b().m39708a();
                                        }
                                        if (!NativeController.m38431b(this.f36974i)) {
                                            jSONArrayM37908b = C13229v0.m37908b(C13008c.m36588n().m36542d(), str);
                                            if (jSONArrayM37908b.length() > 0) {
                                                c13126e.m37245a(C13126e.f36057h, C13229v0.m37889a(jSONArrayM37908b));
                                            }
                                        }
                                        m38494a(c13126e, i);
                                        if (f36961u.containsKey(str)) {
                                            i4 = 0;
                                        } else {
                                            i4 = 0;
                                        }
                                        if (this.f36974i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                            i5 = 1;
                                            if (i == 1) {
                                                c13126e.m37245a("tnum", this.f36980o + "");
                                            }
                                            c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                                            c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                                            c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                            strM37102a = C13091b.m37102a(str, "native");
                                            if (!TextUtils.isEmpty(strM37102a)) {
                                                c13126e.m37245a(C13126e.f36056g, strM37102a);
                                            }
                                            if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                            }
                                            if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                            }
                                            c13126e.m37245a("video_version", "2.0");
                                            bVar = new b(i);
                                            bVar.setUnitId(str);
                                            bVar.setPlacementId(str2);
                                            bVar.setAdType(42);
                                            bVar.m38546d(iIntValue);
                                            bVar.m38545c(iOptInt);
                                            bVar.m38547e(i3);
                                            bVar.m38542b(iM39635e);
                                            bVar.m38540a(c13604a);
                                            if (i == 1) {
                                                bVar.m38544b(true);
                                            } else {
                                                bVar.m38544b(true);
                                            }
                                            bVar.m38543b(NativeController.m38406a(this.f36974i));
                                            c cVar = new c(1, bVar, i2, str, str2);
                                            bVar.m38541a(cVar);
                                            bVar.m38591a(i2);
                                            cVar.m38548a(c13604a);
                                            cVar.m38550a(z);
                                            cVar.m38549a(str);
                                            if (i2 == 0) {
                                                j2 = j;
                                                c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                            } else {
                                                j2 = j;
                                                if (i2 == 1) {
                                                    c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                                }
                                            }
                                            this.f36946a.postDelayed(cVar, j2);
                                            return;
                                        }
                                        i5 = 1;
                                        if (i == i5) {
                                            c13126e.m37245a("tnum", this.f36981p + "");
                                        }
                                        c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                                        c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                                        c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                        strM37102a = C13091b.m37102a(str, "native");
                                        if (!TextUtils.isEmpty(strM37102a)) {
                                            c13126e.m37245a(C13126e.f36056g, strM37102a);
                                        }
                                        if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                            c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                        }
                                        if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                            c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                        }
                                        c13126e.m37245a("video_version", "2.0");
                                        bVar = new b(i);
                                        bVar.setUnitId(str);
                                        bVar.setPlacementId(str2);
                                        bVar.setAdType(42);
                                        bVar.m38546d(iIntValue);
                                        bVar.m38545c(iOptInt);
                                        bVar.m38547e(i3);
                                        bVar.m38542b(iM39635e);
                                        bVar.m38540a(c13604a);
                                        if (i == 1) {
                                            bVar.m38544b(true);
                                        } else {
                                            bVar.m38544b(true);
                                        }
                                        bVar.m38543b(NativeController.m38406a(this.f36974i));
                                        c cVar2 = new c(1, bVar, i2, str, str2);
                                        bVar.m38541a(cVar2);
                                        bVar.m38591a(i2);
                                        cVar2.m38548a(c13604a);
                                        cVar2.m38550a(z);
                                        cVar2.m38549a(str);
                                        if (i2 == 0) {
                                            j2 = j;
                                            c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                        } else {
                                            j2 = j;
                                            if (i2 == 1) {
                                                c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                            }
                                        }
                                        this.f36946a.postDelayed(cVar2, j2);
                                        return;
                                    }
                                }
                                i6 = iOptInt2;
                            } else {
                                i6 = 0;
                                iOptInt = 0;
                            }
                            JSONArray jSONArray3 = jSONArray;
                            try {
                                this.f36980o = Math.max(iOptInt, i6);
                                iOptInt2 = i6;
                                string = jSONArray3.toString();
                            } catch (JSONException e2) {
                                e = e2;
                                iOptInt2 = i6;
                                C13219q0.m37816b(f36958r, C13310a.m38393a(e));
                                string = str3;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            str3 = str7;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                        c13126e.m37245a(MBridgeConstans.NATIVE_INFO, string);
                    }
                    iM39638f = iIntValue;
                    i3 = iOptInt2;
                    c13126e.m37245a("ad_num", iM39638f + "");
                    c13126e.m37245a("ping_mode", "1");
                    if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) == null) {
                        C13636h.m39706b().m39708a();
                    }
                    if (!NativeController.m38431b(this.f36974i)) {
                        jSONArrayM37908b = C13229v0.m37908b(C13008c.m36588n().m36542d(), str);
                        if (jSONArrayM37908b.length() > 0) {
                            c13126e.m37245a(C13126e.f36057h, C13229v0.m37889a(jSONArrayM37908b));
                        }
                    }
                    m38494a(c13126e, i);
                    if (f36961u.containsKey(str) || (c13077k = f36961u.get(str)) == null) {
                        i4 = 0;
                    } else {
                        if (i == 1 || i != 2) {
                            iM36932a = c13077k.m36932a();
                        } else {
                            iM36932a = c13077k.m36934b();
                        }
                        i4 = iM36932a;
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i5 = 1;
                        if (i == 1) {
                            c13126e.m37245a("tnum", this.f36980o + "");
                        }
                        c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                        c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                        c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                        strM37102a = C13091b.m37102a(str, "native");
                        if (!TextUtils.isEmpty(strM37102a)) {
                            c13126e.m37245a(C13126e.f36056g, strM37102a);
                        }
                        if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                            c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                            c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        c13126e.m37245a("video_version", "2.0");
                        bVar = new b(i);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.m38546d(iIntValue);
                        bVar.m38545c(iOptInt);
                        bVar.m38547e(i3);
                        bVar.m38542b(iM39635e);
                        bVar.m38540a(c13604a);
                        if (i == 1 || z) {
                            bVar.m38544b(true);
                        }
                        bVar.m38543b(NativeController.m38406a(this.f36974i));
                        c cVar3 = new c(1, bVar, i2, str, str2);
                        bVar.m38541a(cVar3);
                        bVar.m38591a(i2);
                        cVar3.m38548a(c13604a);
                        cVar3.m38550a(z);
                        cVar3.m38549a(str);
                        if (i2 == 0) {
                            j2 = j;
                            c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        } else {
                            j2 = j;
                            if (i2 == 1) {
                                c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                            }
                        }
                        this.f36946a.postDelayed(cVar3, j2);
                        return;
                    }
                    i5 = 1;
                    if (i == i5) {
                        c13126e.m37245a("tnum", this.f36981p + "");
                    }
                    c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                    c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                    c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strM37102a = C13091b.m37102a(str, "native");
                    if (!TextUtils.isEmpty(strM37102a)) {
                        c13126e.m37245a(C13126e.f36056g, strM37102a);
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    c13126e.m37245a("video_version", "2.0");
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.m38546d(iIntValue);
                    bVar.m38545c(iOptInt);
                    bVar.m38547e(i3);
                    bVar.m38542b(iM39635e);
                    bVar.m38540a(c13604a);
                    if (i == 1) {
                        bVar.m38544b(true);
                    } else {
                        bVar.m38544b(true);
                    }
                    bVar.m38543b(NativeController.m38406a(this.f36974i));
                    c cVar4 = new c(1, bVar, i2, str, str2);
                    bVar.m38541a(cVar4);
                    bVar.m38591a(i2);
                    cVar4.m38548a(c13604a);
                    cVar4.m38550a(z);
                    cVar4.m38549a(str);
                    if (i2 == 0) {
                        j2 = j;
                        c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f36946a.postDelayed(cVar4, j2);
                    return;
                }
                if (iM39638f != f36966z && iM39638f != 0) {
                    i3 = 0;
                    iOptInt = 0;
                }
                c13126e.m37245a("ad_num", iM39638f + "");
                c13126e.m37245a("ping_mode", "1");
                if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) == null) {
                    C13636h.m39706b().m39708a();
                }
                if (!NativeController.m38431b(this.f36974i)) {
                    jSONArrayM37908b = C13229v0.m37908b(C13008c.m36588n().m36542d(), str);
                    if (jSONArrayM37908b.length() > 0) {
                        c13126e.m37245a(C13126e.f36057h, C13229v0.m37889a(jSONArrayM37908b));
                    }
                }
                m38494a(c13126e, i);
                if (f36961u.containsKey(str)) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i5 = 1;
                    if (i == 1) {
                        c13126e.m37245a("tnum", this.f36980o + "");
                    }
                    c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                    c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                    c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strM37102a = C13091b.m37102a(str, "native");
                    if (!TextUtils.isEmpty(strM37102a)) {
                        c13126e.m37245a(C13126e.f36056g, strM37102a);
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    c13126e.m37245a("video_version", "2.0");
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.m38546d(iIntValue);
                    bVar.m38545c(iOptInt);
                    bVar.m38547e(i3);
                    bVar.m38542b(iM39635e);
                    bVar.m38540a(c13604a);
                    if (i == 1) {
                        bVar.m38544b(true);
                    } else {
                        bVar.m38544b(true);
                    }
                    bVar.m38543b(NativeController.m38406a(this.f36974i));
                    c cVar5 = new c(1, bVar, i2, str, str2);
                    bVar.m38541a(cVar5);
                    bVar.m38591a(i2);
                    cVar5.m38548a(c13604a);
                    cVar5.m38550a(z);
                    cVar5.m38549a(str);
                    if (i2 == 0) {
                        j2 = j;
                        c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f36946a.postDelayed(cVar5, j2);
                    return;
                }
                i5 = 1;
                if (i == i5) {
                    c13126e.m37245a("tnum", this.f36981p + "");
                }
                c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                strM37102a = C13091b.m37102a(str, "native");
                if (!TextUtils.isEmpty(strM37102a)) {
                    c13126e.m37245a(C13126e.f36056g, strM37102a);
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                c13126e.m37245a("video_version", "2.0");
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.m38546d(iIntValue);
                bVar.m38545c(iOptInt);
                bVar.m38547e(i3);
                bVar.m38542b(iM39635e);
                bVar.m38540a(c13604a);
                if (i == 1) {
                    bVar.m38544b(true);
                } else {
                    bVar.m38544b(true);
                }
                bVar.m38543b(NativeController.m38406a(this.f36974i));
                c cVar6 = new c(1, bVar, i2, str, str2);
                bVar.m38541a(cVar6);
                bVar.m38591a(i2);
                cVar6.m38548a(c13604a);
                cVar6.m38550a(z);
                cVar6.m38549a(str);
                if (i2 == 0) {
                    j2 = j;
                    c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                } else {
                    j2 = j;
                    if (i2 == 1) {
                        c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    }
                }
                this.f36946a.postDelayed(cVar6, j2);
                return;
                iOptInt = 0;
                iOptInt2 = 0;
                iM39638f = iIntValue;
                i3 = iOptInt2;
                c13126e.m37245a("ad_num", iM39638f + "");
                c13126e.m37245a("ping_mode", "1");
                if (C13636h.m39706b().m39718d(C13008c.m36588n().m36533b()) == null) {
                    C13636h.m39706b().m39708a();
                }
                if (!NativeController.m38431b(this.f36974i)) {
                    jSONArrayM37908b = C13229v0.m37908b(C13008c.m36588n().m36542d(), str);
                    if (jSONArrayM37908b.length() > 0) {
                        c13126e.m37245a(C13126e.f36057h, C13229v0.m37889a(jSONArrayM37908b));
                    }
                }
                m38494a(c13126e, i);
                if (f36961u.containsKey(str)) {
                    i4 = 0;
                } else {
                    i4 = 0;
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i5 = 1;
                    if (i == 1) {
                        c13126e.m37245a("tnum", this.f36980o + "");
                    }
                    c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                    c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                    c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strM37102a = C13091b.m37102a(str, "native");
                    if (!TextUtils.isEmpty(strM37102a)) {
                        c13126e.m37245a(C13126e.f36056g, strM37102a);
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    c13126e.m37245a("video_version", "2.0");
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.m38546d(iIntValue);
                    bVar.m38545c(iOptInt);
                    bVar.m38547e(i3);
                    bVar.m38542b(iM39635e);
                    bVar.m38540a(c13604a);
                    if (i == 1) {
                        bVar.m38544b(true);
                    } else {
                        bVar.m38544b(true);
                    }
                    bVar.m38543b(NativeController.m38406a(this.f36974i));
                    c cVar7 = new c(1, bVar, i2, str, str2);
                    bVar.m38541a(cVar7);
                    bVar.m38591a(i2);
                    cVar7.m38548a(c13604a);
                    cVar7.m38550a(z);
                    cVar7.m38549a(str);
                    if (i2 == 0) {
                        j2 = j;
                        c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f36946a.postDelayed(cVar7, j2);
                    return;
                }
                i5 = 1;
                if (i == i5) {
                    c13126e.m37245a("tnum", this.f36981p + "");
                }
                c13126e.m37245a(TypedValues.CycleType.S_WAVE_OFFSET, i4 + "");
                c13126e.m37245a("ad_type", RoomMasterTable.DEFAULT_ID);
                c13126e.m37245a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                strM37102a = C13091b.m37102a(str, "native");
                if (!TextUtils.isEmpty(strM37102a)) {
                    c13126e.m37245a(C13126e.f36056g, strM37102a);
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    c13126e.m37245a("video_width", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f36974i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    c13126e.m37245a("video_height", ((Integer) this.f36974i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                c13126e.m37245a("video_version", "2.0");
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.m38546d(iIntValue);
                bVar.m38545c(iOptInt);
                bVar.m38547e(i3);
                bVar.m38542b(iM39635e);
                bVar.m38540a(c13604a);
                if (i == 1) {
                    bVar.m38544b(true);
                } else {
                    bVar.m38544b(true);
                }
                bVar.m38543b(NativeController.m38406a(this.f36974i));
                c cVar8 = new c(1, bVar, i2, str, str2);
                bVar.m38541a(cVar8);
                bVar.m38591a(i2);
                cVar8.m38548a(c13604a);
                cVar8.m38550a(z);
                cVar8.m38549a(str);
                if (i2 == 0) {
                    j2 = j;
                    c13343a.choiceV3OrV5BySetting(1, c13126e, bVar, "", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                } else {
                    j2 = j;
                    if (i2 == 1) {
                        c13343a.getLoadOrSetting(1, C13121d.m37226h().f36021b0, c13126e, bVar, "campaign", C13092c.m37115a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    }
                }
                this.f36946a.postDelayed(cVar8, j2);
                return;
            }
            m38522a("The request was refused", i2, str, str2, c13604a);
        } catch (Exception e4) {
            String str8 = f36958r;
            C13219q0.m37816b(str8, C13310a.m38393a(e4));
            C13219q0.m37816b(str8, e4.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m38507a(int i, String str) {
        C13077k c13077k;
        if (f36961u.containsKey(str)) {
            c13077k = f36961u.get(str);
        } else {
            c13077k = new C13077k();
        }
        int iIntValue = f36962v.get(str).intValue();
        int iIntValue2 = m38515d().containsKey(str) ? m38515d().get(str).intValue() : 1;
        if (i == 1) {
            int iM36932a = iIntValue + c13077k.m36932a();
            c13077k.m36933a(iM36932a <= iIntValue2 ? iM36932a : 0);
        } else if (i == 2) {
            int iM36934b = iIntValue + c13077k.m36934b();
            c13077k.m36935b(iM36934b <= iIntValue2 ? iM36934b : 0);
        }
        f36961u.put(str, c13077k);
    }

    /* JADX INFO: renamed from: a */
    public void m38522a(String str, int i, String str2, String str3, C13604a c13604a) {
        Log.e(f36958r, str);
        try {
            Queue<Integer> queue = this.f36971f;
            if ((queue != null && queue.size() <= 0) || this.f36971f == null) {
                m38527a(false, c13604a, str);
            } else {
                m38521a(i, this.f36969d, str2, str3, c13604a);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38523a(String str, String str2, String str3) {
        if (this.f36967b == null) {
            this.f36967b = new C13638j();
        }
        this.f36967b.m39744a(C13008c.m36588n().m36542d(), str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public void m38527a(boolean z, C13604a c13604a, String str) {
        if (z) {
            if (c13604a == null || c13604a.m38978a()) {
                return;
            }
            c13604a.m38977a(true);
            c13604a.onPreloadSucceed();
            return;
        }
        if (c13604a == null || c13604a.m38978a()) {
            return;
        }
        c13604a.m38977a(true);
        c13604a.onPreloadFaild(str);
    }

    /* JADX INFO: renamed from: a */
    public void m38526a(boolean z, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38524a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m38509a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i = MBMediaView.f37294p0;
                        Object objInvoke = C14203b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            C14203b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, InterfaceC14217a.class).invoke(objInvoke, C13008c.m36588n().m36542d(), str, new CopyOnWriteArrayList(list), 1, null);
                            C14203b.class.getMethod("load", String.class).invoke(objInvoke, str);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        C13219q0.m37816b(f36958r, "please import the videocommon aar");
                        return;
                    }
                    C13219q0.m37816b(f36958r, C13310a.m38393a(e));
                }
            } catch (Exception e) {
                C13219q0.m37816b(f36958r, C13310a.m38393a(e));
            }
        }
    }
}
