package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2516ka;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.jbs.p157lr.C2639ri;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import com.bytedance.sdk.openadsdk.core.p225ri.C3310ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2898lr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class wjv {

    /* JADX INFO: renamed from: ac */
    private int f11395ac;
    private String ajz;
    private int akr;
    private JSONObject amj;

    /* JADX INFO: renamed from: ar */
    private boolean f11396ar;

    /* JADX INFO: renamed from: aw */
    public long f11397aw;
    private String bbu;
    private JSONObject bfa;
    private String bnj;

    /* JADX INFO: renamed from: bu */
    private boolean f11399bu;
    private String bzf;
    private C3180ri cgm;
    private boolean che;

    /* JADX INFO: renamed from: de */
    private Map<String, Object> f11402de;

    /* JADX INFO: renamed from: du */
    private int f11404du;

    /* JADX INFO: renamed from: dw */
    private C3289ri f11405dw;
    private int dzy;

    /* JADX INFO: renamed from: eb */
    private C1997lr f11406eb;
    private AdSlot evm;

    /* JADX INFO: renamed from: fe */
    private C3286nr f11409fe;
    private int feb;

    /* JADX INFO: renamed from: fr */
    private C3275ay f11412fr;
    private String gcp;

    /* JADX INFO: renamed from: go */
    private String f11413go;

    /* JADX INFO: renamed from: gy */
    private String f11414gy;

    /* JADX INFO: renamed from: gz */
    private JSONObject f11415gz;
    private String hcw;

    /* JADX INFO: renamed from: hd */
    private boolean f11416hd;
    private C3104ri hqg;
    private long hws;
    private C1997lr iph;
    private ihz iyl;
    protected long jbs;

    /* JADX INFO: renamed from: jf */
    private C3293su f11422jf;
    private PAGBannerSize jfv;

    /* JADX INFO: renamed from: jg */
    private bgr f11423jg;
    private int jxw;
    private String klz;

    /* JADX INFO: renamed from: kt */
    private int f11426kt;
    private boolean kvj;
    private boolean ljo;

    /* JADX INFO: renamed from: mf */
    private C3180ri f11427mf;

    /* JADX INFO: renamed from: mj */
    protected int f11428mj;
    private boolean nbc;

    /* JADX INFO: renamed from: nd */
    private String f11430nd;

    /* JADX INFO: renamed from: nh */
    private int f11431nh;
    private String nhl;
    private int nlk;

    /* JADX INFO: renamed from: nq */
    private String f11432nq;

    /* JADX INFO: renamed from: nr */
    private C3280fi f11433nr;

    /* JADX INFO: renamed from: ny */
    private int f11434ny;

    /* JADX INFO: renamed from: oh */
    private int f11435oh;
    private String ory;
    private tan ovz;

    /* JADX INFO: renamed from: pc */
    private String f11436pc;

    /* JADX INFO: renamed from: pg */
    private int f11437pg;
    private int psd;

    /* JADX INFO: renamed from: pu */
    private boolean f11438pu;

    /* JADX INFO: renamed from: pv */
    private int f11439pv;
    private C3276bu pye;

    /* JADX INFO: renamed from: qa */
    private int f11440qa;

    /* JADX INFO: renamed from: qh */
    private String f11443qh;
    private String quz;
    private boolean rko;
    private C3287oh rmw;
    private String rzk;
    private int saa;
    private int sez;

    /* JADX INFO: renamed from: sh */
    private boolean f11447sh;
    private String siy;
    private String skk;

    /* JADX INFO: renamed from: sr */
    private String f11448sr;
    private int svc;

    /* JADX INFO: renamed from: sz */
    private int f11450sz;

    /* JADX INFO: renamed from: ta */
    private C3286nr f11451ta;
    private String tan;

    /* JADX INFO: renamed from: tq */
    private String f11453tq;

    /* JADX INFO: renamed from: tw */
    private String f11454tw;

    /* JADX INFO: renamed from: tx */
    private boolean f11455tx;
    private int tyz;
    private volatile boolean tzs;
    private String udw;
    private C3279dw ugd;

    /* JADX INFO: renamed from: uo */
    private C3298zf f11457uo;

    /* JADX INFO: renamed from: uq */
    private long f11458uq;

    /* JADX INFO: renamed from: ur */
    private C3285mj f11459ur;
    private ory vgs;

    /* JADX INFO: renamed from: vk */
    private String f11460vk;

    /* JADX INFO: renamed from: vt */
    private C1997lr f11462vt;
    private int vtj;

    /* JADX INFO: renamed from: vz */
    private int f11463vz;

    /* JADX INFO: renamed from: wd */
    private boolean f11464wd;
    private long wjv;

    /* JADX INFO: renamed from: xd */
    private boolean f11465xd;

    /* JADX INFO: renamed from: xe */
    private C3278di f11466xe;

    /* JADX INFO: renamed from: xh */
    private int f11467xh;
    private String xlq;

    /* JADX INFO: renamed from: yj */
    private String f11469yj;
    private int yjg;
    private C3274aw yjm;

    /* JADX INFO: renamed from: yw */
    private JSONObject f11471yw;

    /* JADX INFO: renamed from: zb */
    private int f11472zb;

    /* JADX INFO: renamed from: zf */
    private String f11473zf;

    /* JADX INFO: renamed from: zk */
    private String f11474zk;

    /* JADX INFO: renamed from: zv */
    private C3296ri f11475zv;
    private JSONObject zxp;
    private int zyn;
    private xha zyu;

    /* JADX INFO: renamed from: zz */
    private C3295vr f11476zz;

    /* JADX INFO: renamed from: lr */
    public static final String f11393lr = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{"is", C3571ig.m16438dw()});

    /* JADX INFO: renamed from: ik */
    public static final String f11391ik = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{"is", C3571ig.m16438dw(), "sample"});

    /* JADX INFO: renamed from: ka */
    public static final String f11392ka = UByte$$ExternalSyntheticBackport0.m43494m((CharSequence) "_", new CharSequence[]{C3571ig.m16438dw(), C11744X3.f.f26247e});

    /* JADX INFO: renamed from: sf */
    protected static int f11394sf = 330;
    private long slm = 0;

    /* JADX INFO: renamed from: ri */
    protected boolean f11446ri = false;

    /* JADX INFO: renamed from: fi */
    protected boolean f11410fi = C2897ik.f8637ri;

    /* JADX INFO: renamed from: di */
    protected int f11403di = C2897ik.f8636lr;
    protected String xha = C2897ik.f8635ik;
    private int ihz = 0;

    /* JADX INFO: renamed from: ay */
    private boolean f11398ay = false;

    /* JADX INFO: renamed from: su */
    private List<String> f11449su = new ArrayList();
    private int igq = -1;

    /* JADX INFO: renamed from: qt */
    protected int f11444qt = 0;

    /* JADX INFO: renamed from: ig */
    private final List<C3286nr> f11419ig = new ArrayList();

    /* JADX INFO: renamed from: qd */
    private final List<String> f11441qd = new ArrayList();
    private final List<FilterWord> srn = new ArrayList();

    /* JADX INFO: renamed from: jc */
    private final C3582pv f11421jc = C3582pv.m16566ik();

    /* JADX INFO: renamed from: co */
    public boolean f11401co = false;
    private int tnn = 0;
    private List<String> whw = new ArrayList();

    /* JADX INFO: renamed from: xm */
    private List<String> f11468xm = new ArrayList();
    private String aac = "0";
    private String luy = "";

    /* JADX INFO: renamed from: ud */
    private int f11456ud = 0;
    private int hpn = 2;
    private int qmx = -1;

    /* JADX INFO: renamed from: id */
    private int f11418id = 0;

    /* JADX INFO: renamed from: eu */
    private int f11407eu = 0;
    private int tpb = 1;

    /* JADX INFO: renamed from: jm */
    private C3290sf f11424jm = new C3290sf();
    private int adz = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int ezp = 0;

    /* JADX INFO: renamed from: fb */
    private int f11408fb = 1;
    private int smj = 0;
    private int rbz = 0;
    private int eqw = 0;

    /* JADX INFO: renamed from: fn */
    private int f11411fn = 1;

    /* JADX INFO: renamed from: tn */
    private int f11452tn = 1;
    private float tyc = 100.0f;
    private int lau = -1;

    /* JADX INFO: renamed from: ib */
    private int f11417ib = 2;
    private int mvf = 1;
    private int cem = 0;

    /* JADX INFO: renamed from: iq */
    private int f11420iq = -1;
    private long gqj = -1;

    /* JADX INFO: renamed from: cm */
    private int f11400cm = 0;

    /* JADX INFO: renamed from: ju */
    private int f11425ju = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: nb */
    private boolean f11429nb = false;

    /* JADX INFO: renamed from: qf */
    private int f11442qf = 0;
    private int ecl = -1;
    private long dvr = -1;
    private int lji = 50;
    private int wzs = -1;

    /* JADX INFO: renamed from: yv */
    private final C3284lr f11470yv = new C3284lr();
    private boolean rja = false;
    private C2898lr wzv = null;
    protected int bgr = -1;

    /* JADX INFO: renamed from: vr */
    protected int f11461vr = -1;

    /* JADX INFO: renamed from: qx */
    private float f11445qx = -1.0f;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.wjv$ri */
    public static class C3296ri {

        /* JADX INFO: renamed from: aw */
        private String f11477aw;
        private String bgr;

        /* JADX INFO: renamed from: co */
        private String f11478co;

        /* JADX INFO: renamed from: di */
        private String f11479di;

        /* JADX INFO: renamed from: fi */
        private String f11480fi;

        /* JADX INFO: renamed from: ik */
        private String f11481ik;
        private String jbs;

        /* JADX INFO: renamed from: ka */
        private String f11482ka;

        /* JADX INFO: renamed from: lr */
        private String f11483lr;

        /* JADX INFO: renamed from: mj */
        private List<Integer> f11484mj;

        /* JADX INFO: renamed from: qt */
        private String f11485qt;

        /* JADX INFO: renamed from: ri */
        private String f11486ri;

        /* JADX INFO: renamed from: sf */
        private String f11487sf;
        private String xha;

        /* JADX INFO: renamed from: lr */
        public static C3180ri m14577lr(C3296ri c3296ri, String str) {
            return new C3180ri().m13275ri(c3296ri.m14589ka()).m13273lr(c3296ri.bgr()).m13269ik(c3296ri.m14579aw()).m13271ka(c3296ri.m14602vr()).m13267fi(str);
        }

        /* JADX INFO: renamed from: ri */
        public static C2516ka m14578ri(C3296ri c3296ri, String str) {
            return C2516ka.m9014ri().m9020ri(c3296ri.m14589ka()).m9019lr(c3296ri.m14585fi()).m9017ik(c3296ri.m14583di()).m9018ka(c3296ri.xha()).m9016fi(c3296ri.m14587ik()).m9015di(str);
        }

        /* JADX INFO: renamed from: aw */
        public String m14579aw() {
            return this.f11478co;
        }

        /* JADX INFO: renamed from: aw */
        public void m14580aw(String str) {
            this.bgr = str;
        }

        public String bgr() {
            return this.f11477aw;
        }

        /* JADX INFO: renamed from: co */
        public void m14581co(String str) {
            this.f11477aw = str;
        }

        /* JADX INFO: renamed from: co */
        public boolean m14582co() {
            return !TextUtils.isEmpty(this.f11485qt) && this.f11485qt.equals("v3");
        }

        /* JADX INFO: renamed from: di */
        public String m14583di() {
            return this.f11481ik;
        }

        /* JADX INFO: renamed from: di */
        public void m14584di(String str) {
            this.f11482ka = str;
        }

        /* JADX INFO: renamed from: fi */
        public String m14585fi() {
            return this.f11483lr;
        }

        /* JADX INFO: renamed from: fi */
        public void m14586fi(String str) {
            this.f11481ik = str;
        }

        /* JADX INFO: renamed from: ik */
        public String m14587ik() {
            return this.f11479di;
        }

        /* JADX INFO: renamed from: ik */
        public void m14588ik(String str) {
            this.f11486ri = str;
        }

        public String jbs() {
            return this.xha;
        }

        public void jbs(String str) {
            this.f11487sf = str;
        }

        /* JADX INFO: renamed from: ka */
        public String m14589ka() {
            return this.f11486ri;
        }

        /* JADX INFO: renamed from: ka */
        public void m14590ka(String str) {
            this.f11483lr = str;
        }

        /* JADX INFO: renamed from: lr */
        public String m14591lr() {
            return this.jbs;
        }

        /* JADX INFO: renamed from: lr */
        public void m14592lr(String str) {
            this.f11479di = str;
        }

        /* JADX INFO: renamed from: mj */
        public String m14593mj() {
            return this.f11480fi;
        }

        /* JADX INFO: renamed from: mj */
        public void m14594mj(String str) {
            this.xha = str;
        }

        /* JADX INFO: renamed from: qt */
        public String m14595qt() {
            return this.f11487sf;
        }

        /* JADX INFO: renamed from: qt */
        public void m14596qt(String str) {
            this.f11485qt = str;
        }

        /* JADX INFO: renamed from: ri */
        public List<Integer> m14597ri() {
            return this.f11484mj;
        }

        /* JADX INFO: renamed from: ri */
        public void m14598ri(String str) {
            this.jbs = str;
        }

        /* JADX INFO: renamed from: ri */
        public void m14599ri(List<Integer> list) {
            this.f11484mj = list;
        }

        /* JADX INFO: renamed from: sf */
        public String m14600sf() {
            return this.f11485qt;
        }

        /* JADX INFO: renamed from: sf */
        public void m14601sf(String str) {
            this.f11478co = str;
        }

        /* JADX INFO: renamed from: vr */
        public String m14602vr() {
            return this.bgr;
        }

        public String xha() {
            return this.f11482ka;
        }

        public void xha(String str) {
            this.f11480fi = str;
        }
    }

    public wjv() {
        C3289ri c3289ri = new C3289ri();
        this.f11405dw = c3289ri;
        c3289ri.m14263ri(this);
    }

    /* JADX INFO: renamed from: di */
    public static boolean m14331di(wjv wjvVar) {
        Object obj;
        if (wjvVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapIyl = wjvVar.iyl();
            return (mapIyl == null || (obj = mapIyl.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    public static boolean m14332fi(wjv wjvVar) {
        if (wjvVar == null) {
            return false;
        }
        int iM14552vz = wjvVar.m14552vz();
        return wjvVar.m14576zz() || iM14552vz == 5 || iM14552vz == 15 || iM14552vz == 50;
    }

    /* JADX INFO: renamed from: ik */
    public static JSONObject m14333ik(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            C2707ac.m10196ik("MaterialMeta", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m14334ik(wjv wjvVar) {
        return (wjvVar == null || wjvVar.m14389eu() == null || wjvVar.m14389eu().m6348ka() != 7 || C3279dw.m14092lr(wjvVar)) ? false : true;
    }

    private static double jbs(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject.optDouble("pack_time", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: ka */
    public static int m14335ka(String str) {
        return m14343ri(m14333ik(str));
    }

    /* JADX INFO: renamed from: ka */
    public static boolean m14336ka(wjv wjvVar) {
        return (wjvVar == null || wjvVar.m14389eu() == null || wjvVar.m14389eu().m6359ri() != 1) ? false : true;
    }

    /* JADX INFO: renamed from: lr */
    public static double m14337lr(String str) {
        return jbs(m14333ik(str));
    }

    /* JADX INFO: renamed from: lr */
    public static String m14338lr(Context context, wjv wjvVar) {
        if (context != null && wjvVar != null) {
            try {
                if (wjvVar.adz() == 8 || wjvVar.m14401fr().m14212ri()) {
                    String strM14753ri = C3310ri.m14753ri(context);
                    if (TextUtils.isEmpty(strM14753ri)) {
                        return null;
                    }
                    return strM14753ri;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("MaterialMeta", th.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public static void m14339lr(wjv wjvVar, JSONObject jSONObject) throws JSONException {
        C3278di c3278diTyz = wjvVar.tyz();
        if (c3278diTyz != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, c3278diTyz.m14073lr());
            jSONObject2.put("package_name", c3278diTyz.m14069ik());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, c3278diTyz.m14077ri());
            jSONObject2.put("score", c3278diTyz.m14071ka());
            jSONObject2.put("comment_num", c3278diTyz.m14068fi());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, c3278diTyz.m14067di());
            jSONObject2.put("app_category", c3278diTyz.xha());
            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m14340lr(wjv wjvVar) {
        return (m14350ri(wjvVar) || m14334ik(wjvVar)) ? false : true;
    }

    /* JADX INFO: renamed from: mj */
    private static long m14341mj(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: qd */
    private String m14342qd(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return com.bytedance.sdk.component.utils.slm.m10282ri(str);
        } catch (Throwable th) {
            C2707ac.m10197ik("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static int m14343ri(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    public static long m14344ri(String str) {
        return m14341mj(m14333ik(str));
    }

    /* JADX INFO: renamed from: ri */
    public static C3126lr m14345ri(String str, wjv wjvVar) {
        wjvVar.bnj(0);
        int iLji = wjvVar.lji();
        int i = 3;
        if (iLji == 3) {
            i = 4;
        } else if (iLji == 7) {
            i = 1;
        } else if (iLji == 8) {
            i = 2;
        }
        C3126lr c3126lr = new C3126lr(str, wjvVar.m14539tx(), wjvVar.kvj(), wjvVar.m14476qf(), wjvVar.m14523sh(), i);
        c3126lr.m6325ri(C3606fi.m16703ri("video_error_conf", 0));
        c3126lr.m6313ik(C1979ri.m6216lr(c3126lr.slm()));
        return c3126lr;
    }

    /* JADX INFO: renamed from: ri */
    public static String m14346ri(Context context, wjv wjvVar) {
        if (context == null || wjvVar == null || !((wjvVar.lji() == 8 || wjvVar.lji() == 7) && wjvVar.che())) {
            return null;
        }
        String strM14338lr = m14338lr(context, wjvVar);
        if (TextUtils.isEmpty(strM14338lr) || C3310ri.m14752ri() != 1) {
            return null;
        }
        return strM14338lr;
    }

    /* JADX INFO: renamed from: ri */
    private void m14347ri(C3286nr c3286nr, int i) {
        if (c3286nr != null) {
            try {
                if (TextUtils.isEmpty(c3286nr.m14220ri())) {
                    return;
                }
                if (c3286nr.m14217lr() == 0 && c3286nr.m14215ik() == 0) {
                    c3286nr.m14221ri(i);
                    c3286nr.m14218lr(i);
                    return;
                }
                if (c3286nr.m14217lr() == 0) {
                    if (c3286nr.m14215ik() <= i) {
                        c3286nr.m14221ri(c3286nr.m14215ik());
                        return;
                    } else {
                        c3286nr.m14218lr(i);
                        c3286nr.m14221ri(i);
                        return;
                    }
                }
                if (c3286nr.m14215ik() == 0) {
                    if (c3286nr.m14217lr() <= i) {
                        c3286nr.m14218lr(c3286nr.m14217lr());
                        return;
                    } else {
                        c3286nr.m14218lr(i);
                        c3286nr.m14221ri(i);
                        return;
                    }
                }
                if (c3286nr.m14217lr() > c3286nr.m14215ik()) {
                    if (c3286nr.m14217lr() > i) {
                        c3286nr.m14218lr((int) (i / (c3286nr.m14217lr() / c3286nr.m14215ik())));
                        c3286nr.m14221ri(i);
                        return;
                    }
                    return;
                }
                if (c3286nr.m14215ik() > i) {
                    c3286nr.m14221ri((int) (i * (c3286nr.m14217lr() / c3286nr.m14215ik())));
                    c3286nr.m14218lr(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m14348ri(C3286nr c3286nr, int i, int i2) {
        try {
            if (c3286nr.m14215ik() >= i2) {
                c3286nr.m14221ri((int) ((c3286nr.m14217lr() / c3286nr.m14215ik()) * i2));
                c3286nr.m14218lr(i2);
            } else if (c3286nr.m14217lr() >= i) {
                c3286nr.m14221ri((int) ((i / i2) * c3286nr.m14215ik()));
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m14349ri(wjv wjvVar, JSONObject jSONObject) throws JSONException {
        List<C3286nr> listRbz = wjvVar.rbz();
        if (listRbz != null) {
            JSONArray jSONArray = new JSONArray();
            for (C3286nr c3286nr : listRbz) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", c3286nr.m14220ri());
                jSONObject2.put("height", c3286nr.m14215ik());
                jSONObject2.put("width", c3286nr.m14217lr());
                jSONObject2.put("image_preview", c3286nr.m14213di());
                jSONObject2.put("image_key", c3286nr.xha());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14350ri(wjv wjvVar) {
        return (wjvVar == null || wjvVar.m14389eu() == null || wjvVar.m14389eu().m6348ka() != 1) ? false : true;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m14351ri(wjv wjvVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (m14350ri(wjvVar) || z4 || wjvVar == null || wjvVar.m14389eu() == null || TextUtils.isEmpty(wjvVar.m14389eu().m6338co())) {
            return false;
        }
        if (m14334ik(wjvVar)) {
            return z3;
        }
        return (wjvVar.m14389eu() == null || wjvVar.m14389eu().m6359ri() != 1) ? z : z2;
    }

    /* JADX INFO: renamed from: tg */
    private C3180ri m14352tg() {
        C3287oh c3287ohM14575zv = m14575zv();
        if (c3287ohM14575zv == null) {
            return null;
        }
        return new C3180ri().m13275ri(c3287ohM14575zv.m14230ri()).m13273lr(c3287ohM14575zv.m14229lr()).m13269ik(c3287ohM14575zv.m14227ik()).m13271ka(c3287ohM14575zv.m14228ka()).m13267fi(m14545ur() + "_v3");
    }

    private C3180ri wbc() {
        C3296ri c3296riSez = sez();
        if (c3296riSez == null) {
            return null;
        }
        return C3296ri.m14577lr(c3296riSez, String.valueOf(m14545ur()));
    }

    /* JADX INFO: renamed from: zb */
    public static boolean m14353zb(int i) {
        return i == 44 || i == 43 || i == 30 || i == 40 || i == 41 || i == 39;
    }

    public int aac() {
        return this.tnn;
    }

    /* JADX INFO: renamed from: ac */
    public void m14354ac(int i) {
        this.rbz = i;
    }

    /* JADX INFO: renamed from: ac */
    public void m14355ac(String str) {
        this.rzk = str;
    }

    /* JADX INFO: renamed from: ac */
    public boolean m14356ac() {
        return this.che;
    }

    public int adz() {
        return this.f11426kt;
    }

    /* JADX INFO: renamed from: ae */
    public boolean m14357ae() {
        return this.f11401co;
    }

    public int ajz() {
        int i = this.feb;
        if (i == 5 || i == 6 || i == 33) {
            return 1;
        }
        if (vgs()) {
            return 2;
        }
        return this.hpn;
    }

    public int akr() {
        JSONObject jSONObject;
        int i = this.f11425ju;
        return (Integer.MIN_VALUE != i || (jSONObject = this.f11471yw) == null) ? i : jSONObject.optInt("click_trigger_type", 0);
    }

    /* JADX INFO: renamed from: am */
    public List<String> m14358am() {
        return this.f11449su;
    }

    public List<String> amj() {
        return this.whw;
    }

    /* JADX INFO: renamed from: ar */
    public void m14359ar() {
        this.tzs = true;
    }

    /* JADX INFO: renamed from: aw */
    public int m14360aw() {
        return this.f11435oh;
    }

    /* JADX INFO: renamed from: aw */
    public JSONObject m14361aw(boolean z) {
        try {
            String strM14536tt = m14536tt();
            if (TextUtils.isEmpty(strM14536tt)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("raw_response_info", strM14536tt);
            }
            JSONArray jSONArrayOptJSONArray = new JSONObject(strM14536tt).optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && m14414ik() >= 0 && m14414ik() < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(m14414ik());
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
                AdSlot adSlotM14388eb = m14388eb();
                if (adSlotM14388eb != null) {
                    jSONObject.put("adslot", adSlotM14388eb.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.quz)) {
                    jSONObject.put("gdid_encrypted", this.quz);
                }
                jSONObject.put("hasReportShow", this.f11464wd);
                jSONObject.put("isMrcReportFinish", this.tzs);
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            C2707ac.m10206ri("MaterialMeta", "toJsonObj error", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: aw */
    public void m14362aw(int i) {
        this.f11456ud = i;
    }

    /* JADX INFO: renamed from: aw */
    public void m14363aw(String str) {
        this.klz = str;
    }

    /* JADX INFO: renamed from: ay */
    public ihz m14364ay() {
        return this.iyl;
    }

    /* JADX INFO: renamed from: ay */
    public void m14365ay(int i) {
        this.adz = i;
    }

    /* JADX INFO: renamed from: ay */
    public void m14366ay(String str) {
        this.ajz = str;
    }

    public int bbu() {
        if (this.f11452tn != 2) {
            this.f11452tn = 1;
        }
        return this.f11452tn;
    }

    public List<String> bfa() {
        return this.f11468xm;
    }

    public void bgr(int i) {
        this.qmx = i;
    }

    public void bgr(String str) {
        this.f11453tq = str;
    }

    public void bgr(boolean z) {
        this.f11401co = z;
    }

    public boolean bgr() {
        return this.f11399bu;
    }

    public boolean biu() {
        int i = this.zyn;
        return i == 44 || i == 43;
    }

    /* JADX INFO: renamed from: bl */
    public boolean m14367bl() {
        return this.rja;
    }

    public int bnj() {
        if (this.wzs < 0) {
            try {
                JSONObject jSONObjectLjo = ljo();
                if (jSONObjectLjo != null) {
                    this.wzs = jSONObjectLjo.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.wzs = 0;
                }
            } catch (Throwable unused) {
                this.wzs = 0;
            }
        }
        return this.wzs;
    }

    public void bnj(int i) {
        this.cem = i;
    }

    /* JADX INFO: renamed from: bu */
    public long m14368bu() {
        return this.dvr;
    }

    /* JADX INFO: renamed from: bu */
    public void m14369bu(int i) {
        this.eqw = i;
    }

    /* JADX INFO: renamed from: bu */
    public void m14370bu(String str) {
        this.f11430nd = str;
    }

    /* JADX INFO: renamed from: bu */
    public void m14371bu(boolean z) {
        this.rja = z;
    }

    public C3286nr bzf() {
        return this.f11451ta;
    }

    public long cem() {
        return this.hws;
    }

    public boolean cgm() {
        return this.tzs;
    }

    public boolean che() {
        return iph() == 100 || this.feb == 20;
    }

    public C2898lr cie() {
        return this.wzv;
    }

    public C3284lr ckl() {
        return this.f11470yv;
    }

    /* JADX INFO: renamed from: cm */
    public JSONObject m14372cm() {
        return this.f11415gz;
    }

    public ory cmy() {
        return this.vgs;
    }

    /* JADX INFO: renamed from: co */
    public String m14373co() {
        return this.hcw;
    }

    /* JADX INFO: renamed from: co */
    public void m14374co(int i) {
        this.feb = i;
    }

    /* JADX INFO: renamed from: co */
    public void m14375co(String str) {
        this.luy = str;
    }

    /* JADX INFO: renamed from: co */
    public void m14376co(boolean z) {
        this.nbc = z;
    }

    /* JADX INFO: renamed from: de */
    public JSONObject m14377de() {
        return this.f11471yw;
    }

    /* JADX INFO: renamed from: di */
    public void m14378di(int i) {
        this.f11444qt = i;
    }

    /* JADX INFO: renamed from: di */
    public void m14379di(long j) {
        this.f11458uq = j;
    }

    /* JADX INFO: renamed from: di */
    public void m14380di(String str) {
        this.hcw = str;
    }

    /* JADX INFO: renamed from: di */
    public void m14381di(JSONObject jSONObject) {
        this.f11415gz = jSONObject;
    }

    /* JADX INFO: renamed from: di */
    public void m14382di(boolean z) {
        this.f11416hd = z;
    }

    /* JADX INFO: renamed from: di */
    public boolean m14383di() {
        C3293su c3293su;
        int iM14453nd = m14453nd();
        if (zyn() && C3279dw.m14090ik(this) && iM14453nd != 43 && iM14453nd != 44) {
            return false;
        }
        if (!zyn() && m14353zb(iM14453nd) && (c3293su = this.f11422jf) != null && c3293su.m14301ri() == 1) {
            return false;
        }
        boolean z = (iM14453nd == 33 || iM14453nd == 5 || iM14453nd == 6 || iM14453nd == 19 || iM14453nd == 12) ? false : true;
        if (m14576zz() || ajz() == 2 || !z || !C3137di.m13108ri(C3571ig.m16444ik(this.f11420iq))) {
            return ajz() == 2 && z;
        }
        return true;
    }

    public C3293su dob() {
        return this.f11422jf;
    }

    /* JADX INFO: renamed from: du */
    public boolean m14384du() {
        return this.nbc;
    }

    public boolean dvr() {
        C1997lr c1997lr = this.f11406eb;
        return c1997lr == null || c1997lr.tan() != 1;
    }

    /* JADX INFO: renamed from: dw */
    public String m14385dw() {
        return this.f11460vk;
    }

    /* JADX INFO: renamed from: dw */
    public void m14386dw(int i) {
        this.f11437pg = i;
    }

    /* JADX INFO: renamed from: dw */
    public void m14387dw(String str) {
        this.bbu = str;
    }

    public void dzy(int i) {
        this.jxw = i;
    }

    public void dzy(String str) {
        if (TextUtils.isEmpty(str)) {
            this.xha = C2897ik.f8635ik;
        } else {
            this.xha = str;
        }
    }

    public boolean dzy() {
        return this.f11396ar;
    }

    /* JADX INFO: renamed from: eb */
    public AdSlot m14388eb() {
        return this.evm;
    }

    public int ecl() {
        return this.f11472zb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wjv wjvVar = (wjv) obj;
            if (this.aac.equals(wjvVar.m14533tn()) && this.f11474zk.equals(wjvVar.yjg())) {
                return true;
            }
        }
        return false;
    }

    public String eqw() {
        return this.siy;
    }

    /* JADX INFO: renamed from: eu */
    public C1997lr m14389eu() {
        return this.f11406eb;
    }

    public boolean evm() {
        return this.svc == 1;
    }

    /* JADX INFO: renamed from: ex */
    public boolean m14390ex() {
        return this.f11410fi;
    }

    public boolean ezp() {
        return this.f11437pg == 1;
    }

    /* JADX INFO: renamed from: fb */
    public C3286nr m14391fb() {
        return this.f11409fe;
    }

    /* JADX INFO: renamed from: fe */
    public String m14392fe() {
        JSONObject jSONObjectLjo;
        if (this.f11413go == null && (jSONObjectLjo = ljo()) != null) {
            this.f11413go = jSONObjectLjo.optString("cid", "");
        }
        return this.f11413go;
    }

    /* JADX INFO: renamed from: fe */
    public void m14393fe(int i) {
        this.vtj = i;
    }

    public void feb(int i) {
        this.f11463vz = i;
    }

    public boolean feb() {
        return this.f11464wd;
    }

    /* JADX INFO: renamed from: fi */
    public String m14394fi() {
        int iM14404go = m14404go();
        if (iM14404go == 1) {
            return "banner_ad";
        }
        if (iM14404go == 3) {
            return "open_ad";
        }
        if (iM14404go == 5) {
            return "embeded_ad";
        }
        if (iM14404go != 7) {
            return iM14404go != 8 ? "unknown" : "fullscreen_interstitial_ad";
        }
        return "rewarded_video";
    }

    /* JADX INFO: renamed from: fi */
    public void m14395fi(int i) {
        this.ecl = i;
    }

    /* JADX INFO: renamed from: fi */
    public void m14396fi(long j) {
        this.jbs = j;
    }

    /* JADX INFO: renamed from: fi */
    public void m14397fi(String str) {
        this.ory = str;
    }

    /* JADX INFO: renamed from: fi */
    public void m14398fi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f11426kt = 4;
        this.aac = jSONObject.optString("id");
        this.f11436pc = jSONObject.optString("source");
        C3278di c3278di = new C3278di();
        this.f11466xe = c3278di;
        c3278di.m14070ik(jSONObject.optString("pkg_name"));
        this.f11466xe.m14075lr(jSONObject.optString("name"));
        this.f11466xe.m14080ri(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    /* JADX INFO: renamed from: fi */
    public void m14399fi(boolean z) {
        this.che = z;
    }

    /* JADX INFO: renamed from: fn */
    public List<String> m14400fn() {
        return this.f11441qd;
    }

    /* JADX INFO: renamed from: fr */
    public C3285mj m14401fr() {
        return this.f11459ur;
    }

    /* JADX INFO: renamed from: fr */
    public void m14402fr(int i) {
        this.f11411fn = i;
    }

    /* JADX INFO: renamed from: fr */
    public void m14403fr(String str) {
        this.tan = str;
    }

    public long gcp() {
        xha xhaVar = this.zyu;
        if (xhaVar == null) {
            return 0L;
        }
        return xhaVar.m14609ik();
    }

    public void gcp(int i) {
        this.bgr = i;
    }

    /* JADX INFO: renamed from: go */
    public int m14404go() {
        return this.f11420iq;
    }

    public int gqj() {
        return this.tyz;
    }

    /* JADX INFO: renamed from: gy */
    public int m14405gy() {
        int i = this.lau;
        if (i >= 0) {
            return i;
        }
        return 30;
    }

    /* JADX INFO: renamed from: gz */
    public float m14406gz() {
        if (this.tyc <= 0.0f) {
            this.tyc = 100.0f;
        }
        return (this.tyc * 1000.0f) / 1000.0f;
    }

    public String hcw(String str) {
        JSONObject jSONObjectLjo = ljo();
        return jSONObjectLjo != null ? jSONObjectLjo.optString("rit", str) : str;
    }

    public void hcw(int i) {
        this.svc = i;
    }

    public boolean hcw() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM14377de = m14377de();
        if (jSONObjectM14377de != null && (jSONArrayOptJSONArray = jSONObjectM14377de.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (jSONArrayOptJSONArray.optInt(i) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hd */
    public int m14407hd() {
        return this.akr;
    }

    /* JADX INFO: renamed from: hp */
    public long m14408hp() {
        return this.f11397aw;
    }

    public int hpn() {
        return this.f11407eu;
    }

    public JSONObject hqg() {
        return this.bfa;
    }

    public int hws() {
        return this.rbz;
    }

    /* JADX INFO: renamed from: ib */
    public List<FilterWord> m14409ib() {
        return this.srn;
    }

    /* JADX INFO: renamed from: id */
    public String m14410id() {
        return this.f11453tq;
    }

    /* JADX INFO: renamed from: ig */
    public C3180ri m14411ig() {
        return this.f11427mf;
    }

    /* JADX INFO: renamed from: ig */
    public void m14412ig(int i) {
        this.f11418id = i;
    }

    /* JADX INFO: renamed from: ig */
    public void m14413ig(String str) {
        this.f11473zf = str;
    }

    public void igq(int i) {
        this.f11431nh = i;
    }

    public void igq(String str) {
        this.skk = str;
    }

    public boolean igq() {
        return this.rko;
    }

    public String ihz() {
        return this.f11469yj;
    }

    public void ihz(int i) {
        this.f11408fb = i;
    }

    public void ihz(String str) {
        this.f11443qh = str;
    }

    /* JADX INFO: renamed from: ik */
    public int m14414ik() {
        return this.dzy;
    }

    /* JADX INFO: renamed from: ik */
    public void m14415ik(int i) {
        this.f11395ac = i;
    }

    /* JADX INFO: renamed from: ik */
    public void m14416ik(long j) {
        this.hws = j;
    }

    /* JADX INFO: renamed from: ik */
    public void m14417ik(C1997lr c1997lr) {
        this.f11462vt = c1997lr;
    }

    /* JADX INFO: renamed from: ik */
    public void m14418ik(C3286nr c3286nr) {
        PAGBannerSize pAGBannerSizeVkd = vkd();
        if (pAGBannerSizeVkd != null && pAGBannerSizeVkd.getWidth() > 0 && pAGBannerSizeVkd.getHeight() > 0) {
            m14348ri(c3286nr, C3583qd.m16589lr(C3299nr.m14642ri(), pAGBannerSizeVkd.getWidth()), C3583qd.m16589lr(C3299nr.m14642ri(), pAGBannerSizeVkd.getHeight()));
        }
        this.f11419ig.add(c3286nr);
    }

    /* JADX INFO: renamed from: ik */
    public void m14419ik(JSONObject jSONObject) {
        this.amj = jSONObject;
    }

    /* JADX INFO: renamed from: ik */
    public void m14420ik(boolean z) {
        this.kvj = z;
    }

    public boolean inh() {
        return this.f11398ay;
    }

    public int iph() {
        return this.f11431nh;
    }

    /* JADX INFO: renamed from: iq */
    public JSONObject m14421iq() {
        JSONObject jSONObjectM14361aw = m14361aw(false);
        JSONObject jSONObjectM14864nr = C3322sf.m14819lr().m14864nr(String.valueOf(m14545ur()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectM14361aw);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectM14864nr);
            return jSONObject;
        } catch (JSONException e) {
            C2707ac.m10197ik("MaterialMeta", "toJsonObjPlus", e.getMessage());
            return jSONObject;
        }
    }

    public Map<String, Object> iyl() {
        return this.f11402de;
    }

    public long jbs() {
        return this.slm;
    }

    public void jbs(int i) {
        this.f11440qa = i;
    }

    public void jbs(String str) {
        this.quz = str;
    }

    public void jbs(boolean z) {
        this.f11455tx = z;
    }

    /* JADX INFO: renamed from: jc */
    public void m14422jc(int i) {
        this.igq = i;
    }

    /* JADX INFO: renamed from: jc */
    public boolean m14423jc() {
        return this.f11455tx;
    }

    /* JADX INFO: renamed from: jf */
    public String m14424jf() {
        JSONObject jSONObjectLjo;
        String strOptString = this.f11414gy;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectLjo = ljo()) != null) {
            strOptString = jSONObjectLjo.optString("req_id", "");
            m14464oh(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public double jfv() {
        return jbs(ljo());
    }

    /* JADX INFO: renamed from: jg */
    public String m14425jg() {
        return this.gcp;
    }

    /* JADX INFO: renamed from: jm */
    public String m14426jm() {
        return this.f11430nd;
    }

    /* JADX INFO: renamed from: ju */
    public int m14427ju() {
        return this.sez;
    }

    public int jva() {
        return this.f11461vr;
    }

    public int jxw() {
        if (m14576zz()) {
            return 5;
        }
        if (m14406gz() != 100.0f || ajz() == 2) {
            return 0;
        }
        return this.ezp;
    }

    /* JADX INFO: renamed from: ka */
    public C3289ri m14428ka() {
        return this.f11405dw;
    }

    /* JADX INFO: renamed from: ka */
    public void m14429ka(int i) {
        this.f11435oh = i;
    }

    /* JADX INFO: renamed from: ka */
    public void m14430ka(long j) {
        this.f11397aw = j;
    }

    /* JADX INFO: renamed from: ka */
    public void m14431ka(JSONObject jSONObject) {
        this.bfa = jSONObject;
    }

    /* JADX INFO: renamed from: ka */
    public void m14432ka(boolean z) {
        this.f11438pu = z;
    }

    public long kcf() {
        return this.wjv;
    }

    /* JADX INFO: renamed from: kl */
    public float m14433kl() {
        float f = this.f11445qx;
        if (f > 0.0f) {
            return f;
        }
        C3287oh c3287oh = this.rmw;
        if (c3287oh != null) {
            String strM14228ka = c3287oh.m14228ka();
            if (TextUtils.isEmpty(strM14228ka)) {
                strM14228ka = C3183lr.m13301ri().m13308ri("adv3", this.rmw.m14230ri(), this.rmw.m14229lr());
            }
            if (strM14228ka != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(strM14228ka).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.f11445qx = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException unused) {
                }
            }
        }
        this.f11445qx = 0.0f;
        return 0.0f;
    }

    public String klz() {
        return this.tan;
    }

    /* JADX INFO: renamed from: kt */
    public int m14434kt() {
        try {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                return jSONObjectLjo.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: kt */
    public void m14435kt(int i) {
        this.yjg = i;
    }

    public C1997lr kvj() {
        return this.f11462vt;
    }

    public C3274aw lau() {
        return this.yjm;
    }

    public int lji() {
        if (this.f11420iq < 0) {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                this.f11420iq = jSONObjectLjo.optInt("ad_slot_type", 0);
            } else {
                this.f11420iq = 0;
            }
        }
        return this.f11420iq;
    }

    public JSONObject ljo() {
        if (this.zxp == null) {
            try {
                if (!TextUtils.isEmpty(this.f11474zk)) {
                    this.zxp = new JSONObject(this.f11474zk);
                }
            } catch (JSONException e) {
                C2707ac.m10196ik("MaterialMeta", e.getMessage());
            }
        }
        return this.zxp;
    }

    /* JADX INFO: renamed from: lr */
    public int m14436lr() {
        xha xhaVarM14560xm = m14560xm();
        if (xhaVarM14560xm != null) {
            return xhaVarM14560xm.m14613ri();
        }
        return -1;
    }

    /* JADX INFO: renamed from: lr */
    public void m14437lr(double d) {
        if (d == 2.0d || d == 1.0d) {
            this.f11417ib = (int) d;
        } else {
            this.f11417ib = 2;
        }
    }

    /* JADX INFO: renamed from: lr */
    public void m14438lr(int i) {
        this.f11439pv = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m14439lr(long j) {
        this.dvr = j;
    }

    /* JADX INFO: renamed from: lr */
    public void m14440lr(C1997lr c1997lr) {
        this.iph = c1997lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14441lr(C3180ri c3180ri) {
        this.f11427mf = c3180ri;
        C3183lr.m13301ri().m13310ri(c3180ri, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    /* JADX INFO: renamed from: lr */
    public void m14442lr(C3286nr c3286nr) {
        this.f11451ta = c3286nr;
    }

    /* JADX INFO: renamed from: lr */
    public void m14443lr(JSONObject jSONObject) {
        this.f11471yw = jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    public void m14444lr(boolean z) {
        this.f11465xd = z;
    }

    public List<wjv> lsq() {
        return this.f11405dw.m14252ka();
    }

    public boolean luy() {
        return this.smj == 1;
    }

    /* JADX INFO: renamed from: mf */
    public int m14445mf() {
        return this.psd;
    }

    public int mhp() {
        int i = this.bgr;
        return i >= 0 ? i : C3299nr.m14639ka().tan(String.valueOf(m14545ur()));
    }

    /* JADX INFO: renamed from: mj */
    public String m14446mj() {
        C3281fr c3281frM14258qt;
        C3289ri c3289riM14428ka = m14428ka();
        if (c3289riM14428ka == null || (c3281frM14258qt = c3289riM14428ka.m14258qt()) == null) {
            return null;
        }
        return c3281frM14258qt.xha();
    }

    /* JADX INFO: renamed from: mj */
    public void m14447mj(int i) {
        this.lji = i;
    }

    /* JADX INFO: renamed from: mj */
    public void m14448mj(String str) {
        this.f11448sr = str;
    }

    /* JADX INFO: renamed from: mj */
    public void m14449mj(boolean z) {
        this.f11447sh = z;
    }

    /* JADX INFO: renamed from: mm */
    public boolean m14450mm() {
        return this.f11446ri;
    }

    /* JADX INFO: renamed from: mn */
    public long m14451mn() {
        return this.f11458uq;
    }

    public String mvf() {
        return this.skk;
    }

    /* JADX INFO: renamed from: nb */
    public C2639ri m14452nb() {
        C2639ri c2639ri = new C2639ri();
        c2639ri.m9806ri(this.akr);
        c2639ri.m9804lr(this.aac);
        c2639ri.m9801ik(this.ajz);
        c2639ri.m9807ri(yjg());
        return c2639ri;
    }

    public boolean nbc() {
        C3296ri c3296ri = this.f11475zv;
        if (c3296ri != null) {
            return !TextUtils.isEmpty(c3296ri.m14600sf());
        }
        int i = this.f11407eu;
        return i == 9 || i == 10;
    }

    /* JADX INFO: renamed from: nd */
    public int m14453nd() {
        return this.feb;
    }

    /* JADX INFO: renamed from: nd */
    public void m14454nd(int i) {
        this.ihz = i;
    }

    /* JADX INFO: renamed from: nh */
    public C3290sf m14455nh() {
        return this.f11424jm;
    }

    public boolean nhl() {
        return this.f11421jc.f13204ri > 0;
    }

    public boolean nlk() {
        return !m14576zz() && tzs() == 1;
    }

    /* JADX INFO: renamed from: nm */
    public long m14456nm() {
        Map<String, Object> mapIyl = iyl();
        if (mapIyl == null) {
            return 0L;
        }
        try {
            Object obj = mapIyl.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: nq */
    public long m14457nq() {
        if (this.gqj < 0) {
            JSONObject jSONObjectLjo = ljo();
            if (jSONObjectLjo != null) {
                this.gqj = jSONObjectLjo.optLong("ad_id", 0L);
            } else {
                this.gqj = 0L;
            }
        }
        return this.gqj;
    }

    /* JADX INFO: renamed from: nr */
    public int m14458nr() {
        return this.f11444qt;
    }

    /* JADX INFO: renamed from: nr */
    public void m14459nr(int i) {
        this.f11407eu = i;
    }

    /* JADX INFO: renamed from: nr */
    public void m14460nr(String str) {
        this.bnj = str;
    }

    /* JADX INFO: renamed from: nr */
    public void m14461nr(boolean z) {
        this.f11410fi = z;
    }

    /* JADX INFO: renamed from: ny */
    public boolean m14462ny() {
        return lji() == 5;
    }

    public int ogw() {
        return this.f11428mj;
    }

    /* JADX INFO: renamed from: oh */
    public void m14463oh(int i) {
        this.f11434ny = i;
    }

    /* JADX INFO: renamed from: oh */
    public void m14464oh(String str) {
        this.f11414gy = str;
    }

    /* JADX INFO: renamed from: oh */
    public boolean m14465oh() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM14377de = m14377de();
        if (jSONObjectM14377de == null || (jSONArrayOptJSONArray = jSONObjectM14377de.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (jSONArrayOptJSONArray.optInt(i) == 186) {
                return true;
            }
        }
        return false;
    }

    public boolean ojh() {
        return this.f11429nb;
    }

    public void ory(int i) {
        this.f11426kt = i;
    }

    public void ory(String str) {
        this.f11454tw = str;
    }

    public boolean ory() {
        List<Integer> listM14597ri;
        return (sez() == null || (listM14597ri = sez().m14597ri()) == null || !listM14597ri.contains(57)) ? false : true;
    }

    public boolean ovz() {
        C3295vr c3295vr;
        return m14576zz() && !nhl() && (c3295vr = this.f11476zz) != null && c3295vr.m14330ri() == 1;
    }

    /* JADX INFO: renamed from: pc */
    public int m14466pc() {
        return this.f11456ud;
    }

    /* JADX INFO: renamed from: pg */
    public boolean m14467pg() {
        return lji() == 8;
    }

    public int plm() {
        int i = this.f11461vr;
        return i >= 0 ? i : C3299nr.m14639ka().m14872qt(String.valueOf(m14545ur()));
    }

    public String pnk() {
        return this.f11473zf;
    }

    public int psd() {
        return this.yjg;
    }

    /* JADX INFO: renamed from: pu */
    public String m14468pu() {
        return this.xlq;
    }

    /* JADX INFO: renamed from: pv */
    public C3180ri m14469pv() {
        return this.cgm;
    }

    /* JADX INFO: renamed from: pv */
    public void m14470pv(int i) {
        this.f11452tn = i;
    }

    /* JADX INFO: renamed from: pv */
    public void m14471pv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11449su.add(str);
    }

    public String pwf() {
        return this.xha;
    }

    public boolean pye() {
        if (this.f11419ig.isEmpty()) {
            return false;
        }
        if (this.saa == 4 && this.f11419ig.size() < 3) {
            return false;
        }
        Iterator<C3286nr> it = this.f11419ig.iterator();
        while (it.hasNext()) {
            if (!it.next().m14214fi()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: qa */
    public boolean m14472qa() {
        return lji() == 7;
    }

    /* JADX INFO: renamed from: qc */
    public C3283ka m14473qc() {
        C3283ka c3283kaM12531aw;
        C3280fi c3280fi = this.f11433nr;
        if (c3280fi != null) {
            c3283kaM12531aw = c3280fi.m14113lr();
        } else {
            C3104ri c3104ri = this.hqg;
            c3283kaM12531aw = c3104ri != null ? c3104ri.m12531aw() : null;
        }
        if (c3283kaM12531aw != null) {
            c3283kaM12531aw.m14190ri(this);
        }
        return c3283kaM12531aw;
    }

    /* JADX INFO: renamed from: qd */
    public int m14474qd() {
        return this.f11442qf;
    }

    /* JADX INFO: renamed from: qd */
    public void m14475qd(int i) {
        this.tyz = i;
    }

    /* JADX INFO: renamed from: qf */
    public int m14476qf() {
        return this.cem;
    }

    /* JADX INFO: renamed from: qh */
    public int m14477qh() {
        if (ory()) {
            return 5;
        }
        return zyu() ? 4 : 1;
    }

    /* JADX INFO: renamed from: qh */
    public void m14478qh(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.f11403di = i;
    }

    public int qhn() {
        return this.ihz;
    }

    public int qmx() {
        return this.tpb;
    }

    /* JADX INFO: renamed from: qt */
    public int m14479qt() {
        return this.f11395ac;
    }

    /* JADX INFO: renamed from: qt */
    public void m14480qt(int i) {
        m14488ri(i, -1);
    }

    /* JADX INFO: renamed from: qt */
    public void m14481qt(String str) {
        this.f11460vk = str;
    }

    /* JADX INFO: renamed from: qt */
    public void m14482qt(boolean z) {
        this.f11464wd = z;
    }

    public int quz() {
        JSONObject jSONObject = this.f11415gz;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: qx */
    public void m14483qx() {
        this.f11421jc.m16569fi();
        xha(false);
    }

    public boolean rbh() {
        C3293su c3293su = this.f11422jf;
        if (c3293su == null || c3293su.m14299lr() != 1) {
            return false;
        }
        C3275ay c3275ay = this.f11412fr;
        return c3275ay == null || c3275ay.m14021ri() <= 0;
    }

    public List<C3286nr> rbz() {
        return this.f11419ig;
    }

    /* JADX INFO: renamed from: ri */
    public C3275ay m14484ri() {
        return this.f11412fr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14485ri(double d) {
        if (d == 2.0d || d == 1.0d) {
            this.mvf = (int) d;
        } else {
            this.mvf = 1;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14486ri(float f) {
        this.tyc = f;
    }

    /* JADX INFO: renamed from: ri */
    public void m14487ri(int i) {
        this.dzy = i;
    }

    /* JADX INFO: renamed from: ri */
    public void m14488ri(int i, int i2) {
        this.zyn = i;
        this.feb = i;
        if (this.evm == null) {
            this.feb = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = lji();
        }
        if (this.evm.getDurationSlotType() == 3 || i2 == 3) {
            this.feb = 14;
            return;
        }
        if (this.evm.getDurationSlotType() != 7 && this.evm.getDurationSlotType() != 8 && i2 != 7 && i2 != 8) {
            if (!this.ljo && C3279dw.m14092lr(this)) {
                this.feb = 4;
                return;
            }
            if (this.zyn == 4 && !C3279dw.m14092lr(this)) {
                this.feb = 0;
            }
            int i3 = this.zyn;
            if (i3 == 41) {
                this.feb = 41;
                return;
            }
            if (i >= 5) {
                this.feb = 0;
                return;
            }
            if (i3 == 2 && adz() != 3) {
                this.feb = 0;
                return;
            } else {
                if (i == 0 || (i == 1 && adz() != 3)) {
                    this.feb = 0;
                    return;
                }
                return;
            }
        }
        if (!this.ljo) {
            if (C3279dw.m14090ik(this)) {
                this.feb = 12;
                return;
            } else if (C3279dw.m14092lr(this)) {
                this.feb = 9;
                return;
            }
        }
        if (this.zyn == 5 && !C3273ac.m13968ka(this)) {
            this.feb = 7;
        }
        if (this.zyn == 6 && !C3273ac.m13971lr(this)) {
            this.feb = 7;
        }
        if (this.zyn == 8 && iph() != 100) {
            this.feb = 7;
        }
        if (this.zyn == 19 && TextUtils.isEmpty(this.bnj)) {
            this.feb = 7;
        }
        if (this.zyn == 20 && TextUtils.isEmpty(this.bnj)) {
            this.feb = 7;
        }
        if (this.zyn == 38 && !C3273ac.m13965ik(this)) {
            this.feb = 7;
        }
        if (i < 5) {
            this.feb = 7;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14489ri(long j) {
        this.slm = j;
    }

    /* JADX INFO: renamed from: ri */
    public void m14490ri(C1997lr c1997lr) {
        this.f11406eb = c1997lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14491ri(AdSlot adSlot) {
        this.evm = adSlot;
    }

    /* JADX INFO: renamed from: ri */
    public void m14492ri(FilterWord filterWord) {
        this.srn.add(filterWord);
    }

    /* JADX INFO: renamed from: ri */
    public void m14493ri(PAGBannerSize pAGBannerSize) {
        this.jfv = pAGBannerSize;
    }

    /* JADX INFO: renamed from: ri */
    public void m14494ri(C2898lr c2898lr) {
        this.wzv = c2898lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14495ri(C3104ri c3104ri) {
        this.hqg = c3104ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m14496ri(C3180ri c3180ri) {
        this.cgm = c3180ri;
        C3183lr.m13301ri().m13310ri(c3180ri, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    /* JADX INFO: renamed from: ri */
    public void m14497ri(C3274aw c3274aw) {
        this.yjm = c3274aw;
    }

    /* JADX INFO: renamed from: ri */
    public void m14498ri(C3275ay c3275ay) {
        this.f11412fr = c3275ay;
    }

    /* JADX INFO: renamed from: ri */
    public void m14499ri(bgr bgrVar) {
        this.f11423jg = bgrVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14500ri(C3276bu c3276bu) {
        this.pye = c3276bu;
    }

    /* JADX INFO: renamed from: ri */
    public void m14501ri(C3278di c3278di) {
        this.f11466xe = c3278di;
    }

    /* JADX INFO: renamed from: ri */
    public void m14502ri(C3279dw c3279dw) {
        this.ugd = c3279dw;
    }

    /* JADX INFO: renamed from: ri */
    public void m14503ri(C3280fi c3280fi) {
        this.f11433nr = c3280fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m14504ri(ihz ihzVar) {
        this.iyl = ihzVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14505ri(C3285mj c3285mj) {
        this.f11459ur = c3285mj;
    }

    /* JADX INFO: renamed from: ri */
    public void m14506ri(C3286nr c3286nr) {
        m14347ri(c3286nr, f11394sf);
        String strM14342qd = m14342qd(c3286nr.m14220ri());
        if (!TextUtils.isEmpty(strM14342qd)) {
            c3286nr.m14219lr(strM14342qd);
        }
        this.f11409fe = c3286nr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14507ri(C3287oh c3287oh) {
        this.rmw = c3287oh;
        if (c3287oh == null || TextUtils.isEmpty(c3287oh.m14227ik())) {
            return;
        }
        C3183lr.m13301ri().m13310ri(m14352tg(), "adv3");
    }

    /* JADX INFO: renamed from: ri */
    public void m14508ri(ory oryVar) {
        this.vgs = oryVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14509ri(C3289ri c3289ri) {
        if (c3289ri != null) {
            this.f11405dw = c3289ri;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m14510ri(C3290sf c3290sf) {
        this.f11424jm = c3290sf;
    }

    /* JADX INFO: renamed from: ri */
    public void m14511ri(C3293su c3293su) {
        this.f11422jf = c3293su;
    }

    /* JADX INFO: renamed from: ri */
    public void m14512ri(tan tanVar) {
        this.ovz = tanVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14513ri(C3295vr c3295vr) {
        this.f11476zz = c3295vr;
    }

    /* JADX INFO: renamed from: ri */
    public void m14514ri(C3296ri c3296ri) {
        this.f11475zv = c3296ri;
        C2516ka c2516kaXlq = xlq();
        if (c2516kaXlq != null && !nbc()) {
            C2523lr.m9118ri(c2516kaXlq);
        }
        if (c3296ri == null || TextUtils.isEmpty(c3296ri.m14579aw())) {
            return;
        }
        C3183lr.m13301ri().m13310ri(wbc(), "ad");
    }

    /* JADX INFO: renamed from: ri */
    public void m14515ri(xha xhaVar) {
        this.zyu = xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m14516ri(C3298zf c3298zf) {
        this.f11457uo = c3298zf;
    }

    /* JADX INFO: renamed from: ri */
    public void m14517ri(Map<String, Object> map) {
        this.f11402de = map;
    }

    /* JADX INFO: renamed from: ri */
    public void m14518ri(boolean z) {
        this.f11399bu = z;
    }

    public boolean rja() {
        int i = this.feb;
        return (i == 2 || i == 1) && 3 == this.f11426kt;
    }

    public String rko() {
        return this.bbu;
    }

    public int rmw() {
        return this.vtj;
    }

    public int rzk() {
        xha xhaVar = this.zyu;
        if (xhaVar == null) {
            return 2;
        }
        return xhaVar.m14611lr();
    }

    public void rzk(int i) {
        this.f11428mj = i;
    }

    public String saa() {
        return this.luy;
    }

    public C3296ri sez() {
        return this.f11475zv;
    }

    /* JADX INFO: renamed from: sf */
    public String m14519sf() {
        return this.ory;
    }

    /* JADX INFO: renamed from: sf */
    public void m14520sf(int i) {
        this.tnn = i;
    }

    /* JADX INFO: renamed from: sf */
    public void m14521sf(String str) {
        this.f11432nq = str;
    }

    /* JADX INFO: renamed from: sf */
    public void m14522sf(boolean z) {
        this.ljo = z;
    }

    /* JADX INFO: renamed from: sh */
    public int m14523sh() {
        return this.f11404du;
    }

    public void siy(int i) {
        this.f11404du = i;
    }

    public boolean siy() {
        if (this.f11420iq <= 0) {
            this.f11420iq = lji();
        }
        int i = this.f11420iq;
        return (i == 7 || i == 8) && !m14332fi(this) && m14567zb() != 21 && this.f11440qa == 1;
    }

    public String skk() {
        if (!TextUtils.isEmpty(this.gcp)) {
            return this.gcp;
        }
        Context contextM14642ri = C3299nr.m14642ri();
        int iAdz = adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                return contextM14642ri != null ? C2729uq.m10311ri(contextM14642ri, "tt_video_download_apk") : this.gcp;
            }
            if (iAdz != 8) {
                return this.gcp;
            }
        }
        return contextM14642ri != null ? C2729uq.m10311ri(contextM14642ri, "tt_video_mobile_go_detail") : this.gcp;
    }

    public void slm(int i) {
        this.smj = i;
    }

    public void slm(String str) {
        this.f11436pc = str;
    }

    public void slm(boolean z) {
        this.f11446ri = z;
    }

    public boolean slm() {
        return this.kvj;
    }

    public String smj() {
        return this.bnj;
    }

    /* JADX INFO: renamed from: sp */
    public int m14524sp() {
        String strValueOf;
        C3289ri c3289riM14428ka = m14428ka();
        if (c3289riM14428ka != null && c3289riM14428ka.m14258qt() != null) {
            return c3289riM14428ka.m14258qt().jbs();
        }
        if (m14388eb() != null) {
            strValueOf = m14388eb().getCodeId();
        } else {
            int iM14545ur = m14545ur();
            strValueOf = iM14545ur != 0 ? String.valueOf(iM14545ur) : null;
        }
        if (strValueOf != null) {
            return C3299nr.m14639ka().tan(strValueOf);
        }
        return 5;
    }

    /* JADX INFO: renamed from: sr */
    public C3104ri m14525sr() {
        return this.hqg;
    }

    public void srn(int i) {
        this.lau = i;
    }

    public boolean srn() {
        return this.f11447sh;
    }

    /* JADX INFO: renamed from: su */
    public tan m14526su() {
        return this.ovz;
    }

    /* JADX INFO: renamed from: su */
    public void m14527su(int i) {
        this.f11467xh = i;
    }

    /* JADX INFO: renamed from: su */
    public void m14528su(String str) {
        this.f11474zk = str;
    }

    public boolean svc() {
        return lji() == 1;
    }

    /* JADX INFO: renamed from: sz */
    public int m14529sz() {
        return this.f11434ny;
    }

    /* JADX INFO: renamed from: ta */
    public String m14530ta() {
        return this.f11432nq;
    }

    /* JADX INFO: renamed from: ta */
    public void m14531ta(int i) {
        this.sez = i;
    }

    public void tan(int i) {
        this.tpb = i;
    }

    public void tan(String str) {
        this.siy = str;
    }

    public void tan(boolean z) {
        this.f11398ay = z;
    }

    public boolean tan() {
        return this.f11438pu;
    }

    /* JADX INFO: renamed from: tl */
    public boolean m14532tl() {
        C3275ay c3275ay = this.f11412fr;
        return c3275ay != null && c3275ay.m14021ri() > 0;
    }

    /* JADX INFO: renamed from: tn */
    public String m14533tn() {
        return this.aac;
    }

    public int tnn() {
        return this.lji;
    }

    public void tnn(int i) {
        this.psd = Math.max(0, i);
    }

    /* JADX INFO: renamed from: tp */
    public boolean m14534tp() {
        return true;
    }

    public String tpb() {
        return this.f11436pc;
    }

    /* JADX INFO: renamed from: tq */
    public String m14535tq() {
        return this.f11443qh;
    }

    /* JADX INFO: renamed from: tt */
    public String m14536tt() {
        return this.nhl;
    }

    /* JADX INFO: renamed from: tw */
    public C3279dw m14537tw() {
        return this.ugd;
    }

    /* JADX INFO: renamed from: tw */
    public void m14538tw(int i) {
        this.f11461vr = i;
    }

    /* JADX INFO: renamed from: tx */
    public C1997lr m14539tx() {
        return this.iph;
    }

    public String tyc() {
        return this.ajz;
    }

    public C3278di tyz() {
        return this.f11466xe;
    }

    public int tzs() {
        return this.f11418id;
    }

    /* JADX INFO: renamed from: ud */
    public int m14540ud() {
        return this.eqw;
    }

    public boolean udw() {
        return this.nlk == 1;
    }

    public JSONObject ugd() {
        return this.amj;
    }

    /* JADX INFO: renamed from: uo */
    public String m14541uo() {
        C3278di c3278diTyz = tyz();
        if (c3278diTyz == null || TextUtils.isEmpty(c3278diTyz.m14077ri())) {
            return null;
        }
        return c3278diTyz.m14077ri();
    }

    /* JADX INFO: renamed from: uq */
    public String m14542uq() {
        return this.f11448sr;
    }

    /* JADX INFO: renamed from: uq */
    public void m14543uq(int i) {
        this.ezp = i;
    }

    /* JADX INFO: renamed from: uq */
    public void m14544uq(String str) {
        this.gcp = str;
    }

    /* JADX INFO: renamed from: ur */
    public int m14545ur() {
        JSONObject jSONObjectLjo = ljo();
        if (jSONObjectLjo != null) {
            return jSONObjectLjo.optInt("rit", 0);
        }
        return 0;
    }

    public boolean vgs() {
        return m14388eb() != null && m14388eb().getDurationSlotType() == 8 && zyu();
    }

    /* JADX INFO: renamed from: vk */
    public C3276bu m14546vk() {
        return this.pye;
    }

    public PAGBannerSize vkd() {
        return this.jfv;
    }

    public int vnt() {
        String strValueOf;
        C3289ri c3289riM14428ka = m14428ka();
        if (c3289riM14428ka != null && c3289riM14428ka.m14258qt() != null) {
            return c3289riM14428ka.m14258qt().jbs();
        }
        if (m14388eb() != null) {
            strValueOf = m14388eb().getCodeId();
        } else {
            int iM14545ur = m14545ur();
            strValueOf = iM14545ur != 0 ? String.valueOf(iM14545ur) : null;
        }
        if (strValueOf != null) {
            return C3299nr.m14639ka().m14881sf(strValueOf);
        }
        return 30;
    }

    /* JADX INFO: renamed from: vr */
    public void m14547vr(int i) {
        this.hpn = i;
    }

    /* JADX INFO: renamed from: vr */
    public void m14548vr(String str) {
        this.xlq = str;
    }

    /* JADX INFO: renamed from: vr */
    public void m14549vr(boolean z) {
        this.f11429nb = z;
    }

    /* JADX INFO: renamed from: vr */
    public boolean m14550vr() {
        return this.f11465xd;
    }

    /* JADX INFO: renamed from: vt */
    public int m14551vt() {
        return this.adz;
    }

    public int vtj() {
        return this.f11463vz;
    }

    /* JADX INFO: renamed from: vz */
    public int m14552vz() {
        return this.saa;
    }

    /* JADX INFO: renamed from: wd */
    public String m14553wd() {
        return this.f11454tw;
    }

    public void whw() {
        C1997lr c1997lr = this.f11406eb;
        if (c1997lr == null || TextUtils.isEmpty(c1997lr.m6338co())) {
            return;
        }
        try {
            if (!this.f11406eb.m6338co().contains("style_id")) {
                this.f11396ar = false;
            } else {
                this.f11396ar = true;
                this.udw = Uri.parse(this.f11406eb.m6338co()).getQueryParameters("style_id").get(0);
            }
        } catch (Throwable th) {
            C2707ac.m10197ik(th.getMessage(), new Object[0]);
        }
    }

    public void whw(int i) {
        this.f11472zb = i;
    }

    public void wjv(int i) {
        this.f11450sz = i;
    }

    public void wjv(String str) {
        this.aac = str;
    }

    public boolean wjv() {
        return (TextUtils.isEmpty(ihz()) || TextUtils.isEmpty(m14542uq())) ? false : true;
    }

    /* JADX INFO: renamed from: wm */
    public boolean m14554wm() {
        tan tanVar;
        AdSlot adSlot = this.evm;
        if (adSlot == null || (tanVar = this.ovz) == null) {
            return false;
        }
        return tanVar.m14318ri(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public boolean wzs() {
        return lji() == 3 || lji() == 4;
    }

    public C3582pv wzv() {
        return this.f11421jc;
    }

    /* JADX INFO: renamed from: xd */
    public String m14555xd() {
        return this.udw;
    }

    /* JADX INFO: renamed from: xd */
    public void m14556xd(int i) {
        this.saa = i;
    }

    /* JADX INFO: renamed from: xd */
    public void m14557xd(String str) {
        this.nhl = str;
    }

    /* JADX INFO: renamed from: xe */
    public int m14558xe() {
        return this.mvf;
    }

    /* JADX INFO: renamed from: xh */
    public String m14559xh() {
        return this.rzk;
    }

    public int xha() {
        return this.f11439pv;
    }

    public void xha(int i) {
        this.f11442qf = i;
    }

    public void xha(long j) {
        this.wjv = j;
    }

    public void xha(String str) {
        this.f11469yj = str;
    }

    public void xha(JSONObject jSONObject) {
        this.f11470yv.m14198ri(jSONObject);
    }

    public void xha(boolean z) {
        this.rko = z;
    }

    public C2516ka xlq() {
        C3296ri c3296riSez = sez();
        if (c3296riSez == null) {
            return null;
        }
        return C3296ri.m14578ri(c3296riSez, String.valueOf(m14545ur()));
    }

    /* JADX INFO: renamed from: xm */
    public xha m14560xm() {
        return this.zyu;
    }

    /* JADX INFO: renamed from: xm */
    public void m14561xm(int i) {
        this.f11400cm = i;
    }

    /* JADX INFO: renamed from: xz */
    public C3298zf m14562xz() {
        return this.f11457uo;
    }

    /* JADX INFO: renamed from: ye */
    public int m14563ye() {
        int i = this.igq;
        if (i >= 0) {
            return i;
        }
        return m14472qa() ? 30 : 5;
    }

    /* JADX INFO: renamed from: yj */
    public boolean m14564yj() {
        return m14576zz() || this.f11433nr != null;
    }

    public String yjg() {
        return this.f11474zk;
    }

    public int yjm() {
        return this.f11417ib;
    }

    public C3280fi yub() {
        return this.f11433nr;
    }

    /* JADX INFO: renamed from: yv */
    public int m14565yv() {
        return this.f11400cm;
    }

    /* JADX INFO: renamed from: yw */
    public C3295vr m14566yw() {
        return this.f11476zz;
    }

    /* JADX INFO: renamed from: zb */
    public int m14567zb() {
        return this.zyn;
    }

    /* JADX INFO: renamed from: zf */
    public String m14568zf() {
        return this.quz;
    }

    /* JADX INFO: renamed from: zf */
    public void m14569zf(int i) {
        this.akr = i;
    }

    /* JADX INFO: renamed from: zf */
    public void m14570zf(String str) {
        this.bzf = str;
    }

    /* JADX INFO: renamed from: zh */
    public long m14571zh() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: zk */
    public int m14572zk() {
        return this.qmx;
    }

    /* JADX INFO: renamed from: zm */
    public int m14573zm() {
        Map<String, Object> map = this.f11402de;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: zp */
    public void m14574zp() {
        if (!TextUtils.isEmpty(m14410id())) {
            bgr("0");
        }
        Map<String, Object> mapIyl = iyl();
        if (mapIyl == null || !mapIyl.containsKey("price")) {
            return;
        }
        mapIyl.put("price", "0");
    }

    /* JADX INFO: renamed from: zv */
    public C3287oh m14575zv() {
        return this.rmw;
    }

    public int zxp() {
        bgr bgrVar = this.f11423jg;
        if (bgrVar == null) {
            return 0;
        }
        return bgrVar.m14022ri();
    }

    public int zyl() {
        return this.f11403di;
    }

    public void zyn(int i) {
        this.nlk = i;
    }

    public boolean zyn() {
        return this.ljo;
    }

    public boolean zyu() {
        return this.f11400cm == 2;
    }

    /* JADX INFO: renamed from: zz */
    public boolean m14576zz() {
        int i = this.f11400cm;
        return (i == 1 || i == 3) && m14525sr() != null;
    }
}
