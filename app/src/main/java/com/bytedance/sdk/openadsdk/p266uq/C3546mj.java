package com.bytedance.sdk.openadsdk.p266uq;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C11744X3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C3546mj {
    private long aac;

    /* JADX INFO: renamed from: ac */
    private String f12949ac;
    private int adz;
    private ri ajz;
    private String akr;
    private boolean amj;

    /* JADX INFO: renamed from: aw */
    private Runnable f12950aw;

    /* JADX INFO: renamed from: ay */
    private boolean f12951ay;
    private boolean bfa;
    private Runnable bgr;
    private int bnj;

    /* JADX INFO: renamed from: bu */
    private boolean f12952bu;
    private int bzf;
    private boolean cem;
    private JSONObject che;

    /* JADX INFO: renamed from: co */
    private final Handler f12953co;

    /* JADX INFO: renamed from: de */
    private JSONObject f12954de;

    /* JADX INFO: renamed from: di */
    private final String f12955di;

    /* JADX INFO: renamed from: du */
    private boolean f12956du;

    /* JADX INFO: renamed from: dw */
    private long f12957dw;
    private long dzy;

    /* JADX INFO: renamed from: eb */
    private String f12958eb;
    private boolean eqw;

    /* JADX INFO: renamed from: eu */
    private int f12959eu;
    private int evm;
    private int ezp;

    /* JADX INFO: renamed from: fb */
    private int f12960fb;

    /* JADX INFO: renamed from: fe */
    private boolean f12961fe;
    private String feb;

    /* JADX INFO: renamed from: fi */
    public final String f12962fi;

    /* JADX INFO: renamed from: fn */
    private boolean f12963fn;

    /* JADX INFO: renamed from: fr */
    private String f12964fr;
    private int gcp;
    private long hcw;

    /* JADX INFO: renamed from: hd */
    private String f12965hd;
    private C3540di hpn;
    private int hws;

    /* JADX INFO: renamed from: ib */
    private ViewTreeObserver.OnGlobalLayoutListener f12966ib;

    /* JADX INFO: renamed from: id */
    private InterfaceC3542ik f12967id;

    /* JADX INFO: renamed from: ig */
    private long f12968ig;
    private long igq;
    private String ihz;

    /* JADX INFO: renamed from: ik */
    public final String f12969ik;
    private String iph;
    private Runnable jbs;

    /* JADX INFO: renamed from: jc */
    private String f12970jc;

    /* JADX INFO: renamed from: jg */
    private String f12971jg;

    /* JADX INFO: renamed from: jm */
    private int f12972jm;
    private int jxw;

    /* JADX INFO: renamed from: ka */
    public final String f12973ka;
    private boolean klz;

    /* JADX INFO: renamed from: kt */
    private String f12974kt;
    private boolean lau;

    /* JADX INFO: renamed from: lr */
    public final String f12975lr;
    private WebView luy;

    /* JADX INFO: renamed from: mj */
    private final Handler f12976mj;
    private int mvf;
    private String nbc;

    /* JADX INFO: renamed from: nd */
    private int f12977nd;

    /* JADX INFO: renamed from: nh */
    private JSONObject f12978nh;

    /* JADX INFO: renamed from: nr */
    private boolean f12979nr;

    /* JADX INFO: renamed from: oh */
    private long f12980oh;
    private long ory;

    /* JADX INFO: renamed from: pc */
    private int f12981pc;

    /* JADX INFO: renamed from: pu */
    private Map<String, String> f12982pu;

    /* JADX INFO: renamed from: pv */
    private long f12983pv;

    /* JADX INFO: renamed from: qd */
    private long f12984qd;

    /* JADX INFO: renamed from: qh */
    private boolean f12985qh;
    private AbstractC3548ri qmx;

    /* JADX INFO: renamed from: qt */
    private Runnable f12986qt;
    private String rbz;

    /* JADX INFO: renamed from: ri */
    public final String f12987ri;
    private String rzk;
    private int saa;
    private String sez;

    /* JADX INFO: renamed from: sf */
    private Runnable f12988sf;
    private int siy;
    private String skk;
    private boolean slm;
    private int smj;
    private String srn;

    /* JADX INFO: renamed from: su */
    private long f12989su;

    /* JADX INFO: renamed from: sz */
    private int f12990sz;

    /* JADX INFO: renamed from: ta */
    private int f12991ta;
    private Set<String> tan;

    /* JADX INFO: renamed from: tn */
    private String f12992tn;
    private int tnn;
    private int tpb;

    /* JADX INFO: renamed from: tq */
    private boolean f12993tq;

    /* JADX INFO: renamed from: tw */
    private int f12994tw;
    private String tyc;
    private List<JSONObject> tyz;

    /* JADX INFO: renamed from: ud */
    private WeakReference<View> f12995ud;

    /* JADX INFO: renamed from: uq */
    private boolean f12996uq;

    /* JADX INFO: renamed from: vr */
    private C3544lr f12997vr;

    /* JADX INFO: renamed from: vt */
    private String f12998vt;

    /* JADX INFO: renamed from: vz */
    private volatile boolean f12999vz;
    private int whw;
    private boolean wjv;

    /* JADX INFO: renamed from: xd */
    private long f13000xd;

    /* JADX INFO: renamed from: xe */
    private long f13001xe;

    /* JADX INFO: renamed from: xh */
    private boolean f13002xh;
    private final String xha;
    private float xlq;

    /* JADX INFO: renamed from: xm */
    private int f13003xm;
    private volatile boolean yjg;
    private JSONObject yjm;

    /* JADX INFO: renamed from: zb */
    private int f13004zb;

    /* JADX INFO: renamed from: zf */
    private int f13005zf;

    /* JADX INFO: renamed from: zk */
    private Context f13006zk;

    /* JADX INFO: renamed from: zv */
    private float f13007zv;
    private float zxp;
    private int zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.mj$ri */
    public enum ri {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private C3546mj(Context context, int i, InterfaceC3542ik interfaceC3542ik, AbstractC3548ri abstractC3548ri) {
        this.f12955di = "playable_stuck_check_ping";
        this.xha = "playable_apply_media_permission_callback";
        this.f12976mj = new Handler(Looper.getMainLooper());
        this.f12953co = new Handler(Looper.getMainLooper());
        this.slm = true;
        this.f12952bu = true;
        this.f12979nr = true;
        this.f12987ri = "PL_sdk_playable_global_viewable";
        this.f12975lr = "PL_sdk_page_screen_blank";
        this.f12969ik = "PL_sdk_playable_destroy_analyze_summary";
        this.f12973ka = "PL_sdk_playable_hardware_dialog_cancel";
        this.f12962fi = "PL_sdk_playable_hardware_dialog_setting";
        this.tan = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f12949ac = null;
        this.ihz = "embeded_ad";
        this.f12996uq = true;
        this.wjv = true;
        this.f12951ay = false;
        this.f12964fr = "";
        this.f12989su = 10L;
        this.igq = 10L;
        this.f13005zf = 700;
        this.f12957dw = 0L;
        this.ory = 0L;
        this.hcw = -1L;
        this.f12980oh = -1L;
        this.f13000xd = -1L;
        this.dzy = -1L;
        this.f12983pv = -1L;
        this.f12968ig = -1L;
        this.f12984qd = -1L;
        this.srn = "";
        this.f12970jc = "";
        this.f12974kt = "";
        this.feb = "";
        this.zyn = 0;
        this.tnn = 0;
        this.f12961fe = false;
        this.f12991ta = 0;
        this.bnj = -1;
        this.siy = 0;
        this.whw = 0;
        this.f13003xm = 0;
        this.rzk = null;
        this.f12985qh = false;
        this.gcp = 0;
        this.f12994tw = 0;
        this.f12977nd = 0;
        this.f13004zb = 0;
        this.aac = 0L;
        this.f13001xe = 0L;
        this.saa = -2;
        this.f12981pc = 0;
        this.hws = 0;
        this.jxw = 0;
        this.f12978nh = new JSONObject();
        this.f12982pu = new HashMap();
        this.che = new JSONObject();
        this.akr = "";
        this.f13007zv = 0.0f;
        this.xlq = 0.0f;
        this.bfa = false;
        this.f12993tq = false;
        this.klz = false;
        this.tyz = new ArrayList();
        this.lau = true;
        this.yjg = true;
        this.f12999vz = true;
        this.f12966ib = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.uq.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) C3546mj.this.f12995ud.get();
                    if (view == null) {
                        return;
                    }
                    C3546mj.this.m16154lr(view);
                } catch (Throwable th) {
                    xha.m16308ri("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.mvf = -1;
        this.saa = i;
        this.ajz = ri.LAND_PAGE;
        m16162ri(context, interfaceC3542ik, abstractC3548ri);
    }

    private C3546mj(Context context, WebView webView, InterfaceC3542ik interfaceC3542ik, AbstractC3548ri abstractC3548ri, ri riVar) {
        this.f12955di = "playable_stuck_check_ping";
        this.xha = "playable_apply_media_permission_callback";
        this.f12976mj = new Handler(Looper.getMainLooper());
        this.f12953co = new Handler(Looper.getMainLooper());
        this.slm = true;
        this.f12952bu = true;
        this.f12979nr = true;
        this.f12987ri = "PL_sdk_playable_global_viewable";
        this.f12975lr = "PL_sdk_page_screen_blank";
        this.f12969ik = "PL_sdk_playable_destroy_analyze_summary";
        this.f12973ka = "PL_sdk_playable_hardware_dialog_cancel";
        this.f12962fi = "PL_sdk_playable_hardware_dialog_setting";
        this.tan = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f12949ac = null;
        this.ihz = "embeded_ad";
        this.f12996uq = true;
        this.wjv = true;
        this.f12951ay = false;
        this.f12964fr = "";
        this.f12989su = 10L;
        this.igq = 10L;
        this.f13005zf = 700;
        this.f12957dw = 0L;
        this.ory = 0L;
        this.hcw = -1L;
        this.f12980oh = -1L;
        this.f13000xd = -1L;
        this.dzy = -1L;
        this.f12983pv = -1L;
        this.f12968ig = -1L;
        this.f12984qd = -1L;
        this.srn = "";
        this.f12970jc = "";
        this.f12974kt = "";
        this.feb = "";
        this.zyn = 0;
        this.tnn = 0;
        this.f12961fe = false;
        this.f12991ta = 0;
        this.bnj = -1;
        this.siy = 0;
        this.whw = 0;
        this.f13003xm = 0;
        this.rzk = null;
        this.f12985qh = false;
        this.gcp = 0;
        this.f12994tw = 0;
        this.f12977nd = 0;
        this.f13004zb = 0;
        this.aac = 0L;
        this.f13001xe = 0L;
        this.saa = -2;
        this.f12981pc = 0;
        this.hws = 0;
        this.jxw = 0;
        this.f12978nh = new JSONObject();
        this.f12982pu = new HashMap();
        this.che = new JSONObject();
        this.akr = "";
        this.f13007zv = 0.0f;
        this.xlq = 0.0f;
        this.bfa = false;
        this.f12993tq = false;
        this.klz = false;
        this.tyz = new ArrayList();
        this.lau = true;
        this.yjg = true;
        this.f12999vz = true;
        this.f12966ib = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.uq.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) C3546mj.this.f12995ud.get();
                    if (view == null) {
                        return;
                    }
                    C3546mj.this.m16154lr(view);
                } catch (Throwable th) {
                    xha.m16308ri("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.mvf = -1;
        this.saa = 0;
        this.ajz = riVar;
        this.luy = webView;
        jbs.m16120ri(webView);
        m16219ri(webView);
        m16162ri(context, interfaceC3542ik, abstractC3548ri);
    }

    /* JADX INFO: renamed from: aw */
    static /* synthetic */ int m16140aw(C3546mj c3546mj) {
        int i = c3546mj.tnn;
        c3546mj.tnn = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: co */
    static /* synthetic */ int m16141co(C3546mj c3546mj) {
        int i = c3546mj.zyn;
        c3546mj.zyn = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: co */
    private boolean m16142co(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    private void feb() {
        Runnable runnable;
        Runnable runnable2;
        this.f12997vr.m16129ri(System.currentTimeMillis());
        Handler handler = this.f12953co;
        if (handler != null) {
            int i = this.saa;
            if (i == 0 && (runnable2 = this.f12950aw) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.bgr) != null) {
                handler.post(runnable);
            }
            this.f12997vr.m16128ri(500);
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m16145fi(String str, JSONObject jSONObject) {
        try {
            int i = this.saa;
            if (i == 0) {
                if (this.ajz != ri.LAND_PAGE && !m16142co(this.f12965hd)) {
                    m16152kt();
                }
                jSONObject.put("playable_url", this.f12965hd);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", m16151ka(this.f12992tn, this.tyc));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", m16147ik(this.skk, this.f12971jg));
            }
            jSONObject.put("playable_render_type", this.saa);
            if (this.qmx != null) {
                if (this.saa == 0 && (this.ajz != ri.LAND_PAGE || m16142co(this.f12965hd))) {
                    this.qmx.mo16244ri(jSONObject);
                } else if (this.saa != 0) {
                    this.qmx.mo16244ri(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ik */
    private String m16147ik(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.nbc) && !TextUtils.isEmpty(this.akr)) {
            Uri uri = Uri.parse(this.akr);
            String host = uri.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.nbc = builderAppendQueryParameter.toString();
        }
        return this.nbc;
    }

    /* JADX INFO: renamed from: ik */
    private void m16148ik(int i, String str) {
        AbstractC3548ri abstractC3548ri = this.qmx;
        if (abstractC3548ri != null) {
            abstractC3548ri.mo16243ri(i, str);
        }
    }

    /* JADX INFO: renamed from: jc */
    private void m16149jc() {
        this.f12997vr = new C3544lr(this, this.f13005zf);
        this.jbs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.5
            @Override // java.lang.Runnable
            public void run() {
                if (C3546mj.this.f12996uq) {
                    C3546mj.this.f12996uq = false;
                    C3546mj.this.f12976mj.removeCallbacks(C3546mj.this.f12986qt);
                    C3546mj.this.m16217ri(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.f12986qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.6
            @Override // java.lang.Runnable
            public void run() {
                if (C3546mj.this.f12996uq) {
                    C3546mj.this.f12996uq = false;
                    C3546mj.this.yjg = false;
                    C3546mj.this.f12976mj.removeCallbacks(C3546mj.this.jbs);
                    C3546mj.this.m16217ri(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.f12950aw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (C3546mj.this.luy != null) {
                    C3546mj.this.luy.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (C3546mj.this.f12997vr != null) {
                                C3546mj.this.f12997vr.m16129ri(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (C3546mj.this.f12953co != null) {
                    C3546mj.this.f12953co.postDelayed(this, 500L);
                }
            }
        };
        this.bgr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                C3546mj.this.m16220ri("playable_stuck_check_ping", new JSONObject());
                if (C3546mj.this.f12953co != null) {
                    C3546mj.this.f12953co.postDelayed(this, 500L);
                }
            }
        };
        this.f12988sf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.9
            @Override // java.lang.Runnable
            public void run() {
                if (C3546mj.this.f13001xe <= 0) {
                    C3546mj.this.m16197lr(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (C3546mj.this.f13001xe - C3546mj.this.aac > C3546mj.this.f13005zf) {
                        C3546mj.this.m16197lr(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    C3546mj.this.m16205oh();
                    C3546mj.this.aac = 0L;
                    C3546mj.this.f13001xe = 0L;
                }
            }
        };
    }

    /* JADX INFO: renamed from: ka */
    private String m16151ka(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.f12965hd = str3;
        return str3;
    }

    /* JADX INFO: renamed from: kt */
    private void m16152kt() {
        String str;
        if (this.che == null || (str = this.f12965hd) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.che.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.f12965hd).getHost();
        if (TextUtils.isEmpty(host)) {
            this.f12965hd += "/cid_" + strOptString;
            return;
        }
        this.f12965hd = this.f12965hd.replace(host, host + "/cid_" + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m16154lr(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.hws == view.getWidth() && this.jxw == view.getHeight()) {
                return;
            }
            this.hws = view.getWidth();
            this.jxw = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.hws);
            jSONObject.put("height", this.jxw);
            m16220ri("resize", jSONObject);
            this.f12978nh = jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3546mj m16160ri(Context context, WebView webView, InterfaceC3542ik interfaceC3542ik, AbstractC3548ri abstractC3548ri) {
        if (interfaceC3542ik == null || abstractC3548ri == null) {
            return null;
        }
        return webView == null ? new C3546mj(context, 0, interfaceC3542ik, abstractC3548ri) : new C3546mj(context, webView, interfaceC3542ik, abstractC3548ri, ri.LAND_PAGE);
    }

    /* JADX INFO: renamed from: ri */
    private void m16162ri(Context context, InterfaceC3542ik interfaceC3542ik, AbstractC3548ri abstractC3548ri) {
        this.f12949ac = UUID.randomUUID().toString();
        this.f13006zk = context;
        this.qmx = abstractC3548ri;
        this.f12967id = interfaceC3542ik;
        C3547qt.m16238ri(abstractC3548ri);
        this.hpn = new C3540di(this);
        m16149jc();
        if (this.luy == null) {
            this.mvf = 4;
            this.f12976mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.4
                @Override // java.lang.Runnable
                public void run() {
                    C3546mj.this.m16217ri(5, "webview is null");
                }
            });
        }
    }

    /* JADX INFO: renamed from: ac */
    public JSONObject m16166ac() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.zxp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.f12959eu);
            jSONObject2.put("height", this.tpb);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.adz);
            jSONObject3.put("y", this.f12972jm);
            jSONObject3.put("width", this.ezp);
            jSONObject3.put("height", this.evm);
            jSONObject.put(C11744X3.i.f26336K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f12960fb);
            jSONObject4.put("y", this.f12990sz);
            jSONObject4.put("width", this.bzf);
            jSONObject4.put("height", this.smj);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: aw */
    public JSONObject m16167aw() {
        try {
            boolean zM16116ri = C3541fi.m16116ri(this.f13006zk, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zM16116ri);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ay */
    public void m16168ay() {
        this.bnj = 2;
    }

    public JSONObject bgr() {
        boolean zM16116ri;
        boolean zM16116ri2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zM16116ri = C3541fi.m16116ri(this.f13006zk, "android.permission.READ_MEDIA_IMAGES");
                zM16116ri2 = true;
            } else {
                zM16116ri = C3541fi.m16116ri(this.f13006zk, "android.permission.READ_EXTERNAL_STORAGE");
                zM16116ri2 = C3541fi.m16116ri(this.f13006zk, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zM16116ri);
            jSONObject.put("isHasWrite", zM16116ri2);
            if (!zM16116ri || !zM16116ri2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: bu */
    public AbstractC3548ri m16169bu() {
        return this.qmx;
    }

    /* JADX INFO: renamed from: co */
    public JSONObject m16170co() {
        try {
            boolean zM16116ri = C3541fi.m16116ri(this.f13006zk, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zM16116ri);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: di */
    public C3546mj m16171di(String str) {
        this.ihz = str;
        return this;
    }

    /* JADX INFO: renamed from: di */
    public String m16172di() {
        return this.iph;
    }

    /* JADX INFO: renamed from: di */
    public void m16173di(JSONObject jSONObject) {
        m16197lr(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    /* JADX INFO: renamed from: di */
    public void m16174di(boolean z) {
        this.cem = z;
    }

    /* JADX INFO: renamed from: dw */
    public void m16175dw() {
        C3544lr c3544lr;
        this.f13001xe = System.currentTimeMillis();
        int i = this.saa;
        if ((i == 1 || i == 2) && (c3544lr = this.f12997vr) != null) {
            c3544lr.m16129ri(System.currentTimeMillis());
        }
    }

    public void dzy() {
        this.hws = 0;
        this.jxw = 0;
        this.zxp = 0.0f;
        this.f12959eu = 0;
        this.tpb = 0;
        this.f12972jm = 0;
        this.adz = 0;
        this.ezp = 0;
        this.evm = 0;
        this.f12990sz = 0;
        this.f12960fb = 0;
        this.bzf = 0;
        this.smj = 0;
    }

    /* JADX INFO: renamed from: fi */
    public C3546mj m16176fi(String str) {
        this.rbz = str;
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public C3546mj m16177fi(boolean z) {
        this.lau = z;
        return this;
    }

    /* JADX INFO: renamed from: fi */
    public String m16178fi() {
        return this.f12958eb;
    }

    /* JADX INFO: renamed from: fi */
    public void m16179fi(JSONObject jSONObject) {
        this.yjm = jSONObject;
        this.f13003xm++;
        m16228xd();
        this.f12976mj.removeCallbacks(this.f12988sf);
        if (this.wjv) {
            this.f12968ig = System.currentTimeMillis();
            this.aac = System.currentTimeMillis();
            this.f13001xe = 0L;
            int i = this.saa;
            if (i == 0) {
                WebView webView = this.luy;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            C3546mj.this.f13001xe = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                m16220ri("playable_stuck_check_ping", new JSONObject());
            }
            this.f12976mj.postDelayed(this.f12988sf, this.f13005zf);
        }
    }

    /* JADX INFO: renamed from: fr */
    public void m16180fr() {
        this.f12985qh = true;
    }

    public void hcw() {
        this.f12999vz = false;
        this.f12976mj.removeCallbacks(this.f12986qt);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f13000xd > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.f13000xd);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            m16186ik("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ig */
    public int m16181ig() {
        return (this.f12980oh == -1 || !this.amj) ? 1 : 2;
    }

    public void igq() {
        if (this.qmx != null) {
            ri riVar = ri.FEED_AWEME;
        }
    }

    public void ihz() {
        AbstractC3548ri abstractC3548ri = this.qmx;
        if (abstractC3548ri != null) {
            abstractC3548ri.mo16240lr();
        }
    }

    /* JADX INFO: renamed from: ik */
    public C3546mj m16182ik(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.f12954de = jSONObject;
            return this;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    /* JADX INFO: renamed from: ik */
    public C3546mj m16183ik(JSONObject jSONObject) {
        this.che = jSONObject;
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public C3546mj m16184ik(boolean z) {
        if (this.mvf != -1 && this.amj != z) {
            this.amj = z;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.amj) {
                    jSONObject.put("playable_background_show_type", this.f12994tw);
                }
            } catch (JSONException unused) {
            }
            m16186ik(this.amj ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.f12980oh == -1 && this.amj) {
                this.f12980oh = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.mvf == 1 ? 1 : 2);
                    int i = this.mvf;
                    if (i != -1) {
                        jSONObject2.put("webview_state", i);
                    }
                } catch (JSONException unused2) {
                }
                m16186ik("PL_sdk_page_show", jSONObject2);
            }
            if (this.f12980oh != -1 && !this.amj && !this.bfa) {
                this.bfa = true;
            }
            if (this.amj) {
                this.hcw = System.currentTimeMillis();
            } else if (this.hcw != -1) {
                this.f12957dw += System.currentTimeMillis() - this.hcw;
                this.hcw = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.amj);
                m16220ri(C11744X3.h.f26280V, jSONObject3);
            } catch (Throwable th) {
                xha.m16308ri("PlayablePlugin", "setViewable error", th);
            }
            if (this.amj) {
                m16205oh();
            } else {
                m16228xd();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ik */
    public JSONObject m16185ik() {
        return this.f12954de;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ik */
    public void m16186ik(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.f12961fe && this.tnn > 0) {
                this.f12961fe = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.cem ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.amj);
            jSONObject.put("playable_session_id", this.f12949ac);
            int i = this.saa;
            if (i == 0) {
                if (this.ajz != ri.LAND_PAGE && !m16142co(this.f12965hd)) {
                    m16152kt();
                }
                jSONObject.put("playable_url", this.f12965hd);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", m16151ka(this.f12992tn, this.tyc));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", m16147ik(this.skk, this.f12971jg));
            }
            jSONObject.put("playable_full_url", this.akr);
            jSONObject.put("playable_replay_count", this.f12991ta);
            jSONObject.put("playable_is_prerender", this.f13002xh);
            jSONObject.put("playable_is_preload", this.f12961fe);
            jSONObject.put("playable_render_type", this.saa);
            jSONObject.put("playable_scenes_type", this.ajz.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.skk) ? "" : this.skk);
            if (!TextUtils.isEmpty(this.f12971jg)) {
                str2 = this.f12971jg;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.f12992tn);
            jSONObject.put("playable_minigamelite_schema", this.tyc);
            jSONObject.put("playable_is_debug", this.f12993tq);
            jSONObject.put("playable_retry_count", this.siy);
            jSONObject.put("playable_enter_from", this.whw);
            jSONObject.put("playable_sequence", this.f13003xm);
            jSONObject.put("playable_current_section", this.rzk);
            jSONObject.put("is_playable_finish", this.f12985qh);
            jSONObject.put("playable_card_session", this.srn);
            jSONObject.put("playable_video_session", this.f12970jc);
            jSONObject.put("playable_network_type", slm());
            jSONObject.put("playable_lynx_version", this.f12964fr);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put(ViewHierarchyConstants.TAG_KEY, this.ihz);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_REFER, "playable");
            jSONObject2.put("value", this.che.opt("cid"));
            jSONObject2.put("log_extra", this.che.opt("log_extra"));
            int i2 = this.saa;
            if (i2 != -1 && i2 != -2) {
                if (this.qmx != null) {
                    List<JSONObject> list = this.tyz;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.tyz.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.saa);
                                jSONObjectOptJSONObject.put("playable_url", this.f12965hd);
                            }
                            this.qmx.mo16244ri(jSONObjectOptJSONObject);
                        }
                        this.tyz.clear();
                    }
                    if (this.saa == 0 && (this.ajz != ri.LAND_PAGE || m16142co(this.f12965hd))) {
                        this.qmx.mo16244ri(jSONObject);
                        return;
                    } else {
                        if (this.saa != 0) {
                            this.qmx.mo16244ri(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.tyz == null) {
                this.tyz = new ArrayList();
            }
            this.tyz.add(jSONObject2);
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void jbs(String str) {
        WebView webView;
        boolean z = this.f12981pc == -1;
        this.f12981pc = 2;
        if (!z) {
            this.sez = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.dzy = jCurrentTimeMillis;
                long j = this.f13000xd;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", m16181ig());
            } catch (Throwable th) {
                xha.m16308ri("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            m16186ik("PL_sdk_html_load_finish", jSONObject);
        }
        this.yjg = false;
        this.f12976mj.removeCallbacks(this.jbs);
        try {
            if (this.saa == 0) {
                if (this.slm && (webView = this.luy) != null) {
                    this.slm = false;
                    webView.evaluateJavascript(m16207qd(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                m16205oh();
            }
        } catch (Throwable th2) {
            xha.m16308ri("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void jbs(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.f12981pc = 3;
                m16205oh();
            } else {
                this.f12981pc = -2;
            }
            if (zOptBoolean || !this.f12996uq) {
                return;
            }
            this.f12996uq = false;
            this.yjg = false;
            this.f12999vz = false;
            this.f12976mj.removeCallbacks(this.jbs);
            this.f12976mj.removeCallbacks(this.f12986qt);
            m16217ri(4, "CaseRenderFail");
        }
    }

    public boolean jbs() {
        return this.amj;
    }

    /* JADX INFO: renamed from: ka */
    public C3546mj m16187ka(String str) {
        this.iph = str;
        return this;
    }

    /* JADX INFO: renamed from: ka */
    public C3546mj m16188ka(boolean z) {
        this.f12963fn = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f12963fn);
            m16220ri("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    /* JADX INFO: renamed from: ka */
    public String m16189ka() {
        return this.f12998vt;
    }

    /* JADX INFO: renamed from: ka */
    public JSONObject m16190ka(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (xha.m16309ri() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectM16109ri = this.hpn.m16109ri(str, jSONObject);
        if (xha.m16309ri()) {
            System.currentTimeMillis();
            if (jSONObjectM16109ri != null) {
                jSONObjectM16109ri.toString();
            }
        }
        return jSONObjectM16109ri;
    }

    /* JADX INFO: renamed from: ka */
    public void m16191ka(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.rzk = jSONObject.optString("section");
        }
    }

    /* JADX INFO: renamed from: lr */
    public C3546mj m16192lr(int i) {
        this.saa = i;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3546mj m16193lr(long j) {
        if (j <= 0) {
            this.igq = 10L;
            return this;
        }
        this.igq = j;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3546mj m16194lr(String str) {
        this.f12998vt = str;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public C3546mj m16195lr(boolean z) {
        this.f13002xh = z;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public Map<String, String> m16196lr() {
        return this.f12982pu;
    }

    /* JADX INFO: renamed from: lr */
    public void m16197lr(int i, String str) {
        this.bnj = i;
        if (this.yjm == null) {
            this.yjm = new JSONObject();
        }
        try {
            this.yjm.put("playable_stuck_type", i);
            this.yjm.put("playable_stuck_reason", str);
            if (this.f12968ig > 0) {
                this.yjm.put("playable_stuck_duration", System.currentTimeMillis() - this.f12968ig);
            } else {
                this.yjm.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        m16186ik("PL_sdk_page_stuck", this.yjm);
        m16228xd();
        if (this.qmx == null || i != 2) {
            return;
        }
        this.yjm = new JSONObject();
    }

    /* JADX INFO: renamed from: lr */
    public void m16198lr(String str, String str2) {
        Bitmap bitmapM16113ri;
        if (TextUtils.isEmpty(str2) || (bitmapM16113ri = C3541fi.m16113ri(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.f13006zk.getContentResolver(), bitmapM16113ri, str, "");
    }

    /* JADX INFO: renamed from: lr */
    protected void m16199lr(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m16145fi(str, jSONObject);
    }

    /* JADX INFO: renamed from: lr */
    public void m16200lr(JSONObject jSONObject) {
        if (this.qmx != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: mj */
    public JSONObject m16201mj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", C3541fi.m16112lr(this.f13006zk, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", C3541fi.m16112lr(this.f13006zk, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", C3541fi.m16114ri(this.f13006zk));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: mj */
    public void m16202mj(String str) {
        this.f12981pc = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f13000xd = jCurrentTimeMillis;
            long j = this.f12980oh;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        m16186ik("PL_sdk_html_load_start", jSONObject);
        this.yjg = true;
        this.f12999vz = true;
        if (this.lau) {
            ory();
            this.yjg = false;
            this.f12999vz = false;
        }
        if (this.f12952bu) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.f12920co)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (C3541fi.m16112lr(this.f13006zk, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.f12929sf)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.f12927qt)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.jbs)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.f12926mj)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (C3541fi.m16112lr(this.f13006zk, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C3541fi.m16115ri(this.f13006zk, C3541fi.xha)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (C3541fi.m16114ri(this.f13006zk)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                m16186ik("PL_sdk_hardware_detect", jSONObject2);
                this.f12952bu = false;
            } catch (Throwable th2) {
                xha.m16308ri("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    /* JADX INFO: renamed from: mj */
    public boolean m16203mj() {
        return this.eqw;
    }

    /* JADX INFO: renamed from: nr */
    public JSONObject m16204nr() {
        if (this.f12978nh.isNull("width")) {
            View view = this.f12995ud.get();
            if (view == null) {
                return this.f12978nh;
            }
            m16154lr(view);
        }
        return this.f12978nh;
    }

    /* JADX INFO: renamed from: oh */
    public void m16205oh() {
        if (this.wjv) {
            this.f12968ig = System.currentTimeMillis();
            if (this.ajz == ri.FEED_AWEME) {
                if (this.amj && this.f12981pc == 3) {
                    C3544lr c3544lr = this.f12997vr;
                    if (c3544lr != null && c3544lr.m16126lr()) {
                        feb();
                        return;
                    } else {
                        if (this.f12997vr == null) {
                            this.f12997vr = new C3544lr(this, this.f13005zf);
                            feb();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.amj && this.f12981pc == 2) {
                C3544lr c3544lr2 = this.f12997vr;
                if (c3544lr2 != null && c3544lr2.m16126lr()) {
                    feb();
                } else if (this.f12997vr == null) {
                    this.f12997vr = new C3544lr(this, this.f13005zf);
                    feb();
                }
            }
        }
    }

    public void ory() {
        int i;
        int i2 = this.saa;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.yjg) {
                this.f12976mj.postDelayed(this.jbs, this.f12989su * 1000);
            }
            if ((this.f12999vz && m16142co(this.f12965hd)) || (i = this.saa) == 1 || i == 2) {
                this.f12976mj.postDelayed(this.f12986qt, this.igq * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: pv */
    public void m16206pv() {
        if (this.klz) {
            return;
        }
        this.klz = true;
        this.ory = 0L;
        this.f12952bu = true;
        dzy();
        try {
            View view = this.f12995ud.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f12966ib);
            }
        } catch (Throwable unused) {
        }
        try {
            this.hpn.m16107lr();
        } catch (Throwable unused2) {
        }
        try {
            C3544lr c3544lr = this.f12997vr;
            if (c3544lr != null) {
                c3544lr.m16127ri();
                this.f12997vr = null;
            }
            Handler handler = this.f12953co;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.f12965hd)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.zyn);
                jSONObject.put("playable_hit_times", this.tnn);
                int i = this.zyn;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.tnn) / (((double) i) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                m16186ik("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.f12965hd)) {
                if (this.hcw != -1) {
                    this.f12957dw += System.currentTimeMillis() - this.hcw;
                    this.hcw = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.f12957dw);
                m16186ik("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.yjg = false;
        this.f12999vz = false;
        this.f12976mj.removeCallbacks(this.jbs);
        this.f12976mj.removeCallbacks(this.f12986qt);
        this.f12976mj.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: qd */
    public String m16207qd() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    /* JADX INFO: renamed from: qt */
    public JSONObject m16208qt() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.f12963fn);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: qt */
    public void m16209qt(String str) {
        this.f12976mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.2
            @Override // java.lang.Runnable
            public void run() {
                C3546mj.m16141co(C3546mj.this);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public Context m16210ri() {
        return this.f13006zk;
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m16211ri(float f) {
        this.zxp = f;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m16212ri(long j) {
        if (j <= 0) {
            this.f12989su = 10L;
            return this;
        }
        this.f12989su = j;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m16213ri(String str) {
        this.f12958eb = str;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m16214ri(String str, String str2) {
        this.f12982pu.put(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public C3546mj m16215ri(boolean z) {
        this.eqw = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.eqw);
            m16220ri("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16216ri(int i) {
        this.mvf = i;
    }

    /* JADX INFO: renamed from: ri */
    protected void m16217ri(int i, String str) {
        m16228xd();
        m16148ik(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "reportRenderFatal error", th);
        }
        m16186ik("PL_sdk_global_faild", jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public void m16218ri(int i, String str, String str2) {
        this.f12981pc = -1;
        this.sez = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", m16181ig());
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "onWebReceivedError error", th);
        }
        m16186ik("PL_sdk_html_load_error", jSONObject);
        if (this.f12996uq) {
            this.f12996uq = false;
            this.yjg = false;
            this.f12999vz = false;
            this.f12976mj.removeCallbacks(this.jbs);
            this.f12976mj.removeCallbacks(this.f12986qt);
            m16217ri(1, "ContainerLoadFail");
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16219ri(View view) {
        if (view == null) {
            return;
        }
        try {
            this.f12995ud = new WeakReference<>(view);
            m16154lr(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f12966ib);
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16220ri(String str, JSONObject jSONObject) {
        if (this.f12956du) {
            if (!xha.m16309ri() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (xha.m16309ri() && jSONObject != null) {
            jSONObject.toString();
        }
        InterfaceC3542ik interfaceC3542ik = this.f12967id;
        if (interfaceC3542ik != null) {
            interfaceC3542ik.mo16117ri(str, jSONObject);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16221ri(JSONObject jSONObject) {
        AbstractC3548ri abstractC3548ri = this.qmx;
        if (abstractC3548ri == null || abstractC3548ri.m16241lr(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            m16198lr(strOptString2, strOptString);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m16222ri(boolean z, String str, int i) {
        if (z) {
            this.f12981pc = -1;
            this.sez = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", m16181ig());
            } catch (Throwable th) {
                xha.m16308ri("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            m16186ik("PL_sdk_html_load_error", jSONObject);
            if (this.f12996uq) {
                this.f12996uq = false;
                this.yjg = false;
                this.f12999vz = false;
                this.f12976mj.removeCallbacks(this.jbs);
                this.f12976mj.removeCallbacks(this.f12986qt);
                m16217ri(1, "ContainerLoadFail");
            }
        }
    }

    /* JADX INFO: renamed from: sf */
    public Set<String> m16223sf() {
        return this.hpn.m16108ri();
    }

    /* JADX INFO: renamed from: sf */
    public void m16224sf(String str) {
        this.f12976mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.3
            @Override // java.lang.Runnable
            public void run() {
                C3546mj.m16140aw(C3546mj.this);
            }
        });
    }

    public String slm() {
        AbstractC3548ri abstractC3548ri;
        if (TextUtils.isEmpty(this.f12974kt) && (abstractC3548ri = this.qmx) != null) {
            this.f12974kt = abstractC3548ri.mo16242ri().toString();
        }
        return this.f12974kt;
    }

    public int srn() {
        return this.mvf;
    }

    /* JADX INFO: renamed from: su */
    public void m16225su() {
        if (this.qmx != null) {
            ri riVar = ri.FEED_AWEME;
        }
    }

    public JSONObject tan() {
        return this.che;
    }

    /* JADX INFO: renamed from: uq */
    public void m16226uq() {
        AbstractC3548ri abstractC3548ri = this.qmx;
        if (abstractC3548ri != null) {
            abstractC3548ri.mo16239ik();
        }
    }

    /* JADX INFO: renamed from: vr */
    public JSONObject m16227vr() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ajz.ordinal());
            jSONObject.put("safe_area_top_height", this.f13007zv);
            jSONObject.put("safe_area_bottom_height", this.xlq);
            jSONObject.put("playable_enter_from", this.whw);
            jSONObject.put("playable_retry_count", this.siy);
            jSONObject.put("playable_card_session", this.srn);
            jSONObject.put("playable_video_session", this.f12970jc);
            jSONObject.put("playable_network_type", slm());
            jSONObject.put("aweme_id", this.feb);
            return jSONObject;
        } catch (Throwable th) {
            xha.m16308ri("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void wjv() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f12983pv > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.f12983pv);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.f13000xd > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f13000xd;
                this.f12984qd = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            m16186ik("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: xd */
    public void m16228xd() {
        try {
            C3544lr c3544lr = this.f12997vr;
            if (c3544lr != null) {
                c3544lr.m16127ri();
            }
            Handler handler = this.f12953co;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public C3546mj xha(String str) {
        int iIndexOf;
        String strDecode;
        this.akr = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                m16192lr(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            } else {
                String host = uri.getHost();
                if (C11744X3.i.f26336K.equalsIgnoreCase(host) || (host != null && host.contains(C11744X3.i.f26336K))) {
                    m16192lr(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                } else if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.saa == -1) {
                        m16192lr(2);
                    } else {
                        m16192lr(1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f12965hd = str;
        return this;
    }

    public String xha() {
        return this.rbz;
    }

    public JSONObject xha(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return m16170co();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : bgr();
        }
        return m16167aw();
    }

    public void xha(boolean z) {
        this.f12956du = z;
    }

    /* JADX INFO: renamed from: zf */
    public void m16229zf() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f12983pv > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.f12983pv);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.f13000xd > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.f13000xd);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            m16186ik("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }
}
