package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.p028vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.jbs.C2634di;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.C2957vr;
import com.bytedance.sdk.openadsdk.core.C3197dw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.srn;
import com.bytedance.sdk.openadsdk.core.widget.C3346ri;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3347di;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3349ik;
import com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.C3393aw;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.p259sf.InterfaceC3517ka;
import com.bytedance.sdk.openadsdk.tan.p262ik.C3534ri;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3577ka;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.bytedance.sdk.openadsdk.utils.tan;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements InterfaceC3517ka {

    /* JADX INFO: renamed from: ay */
    protected C3346ri f8173ay;
    protected C3120di bgr;

    /* JADX INFO: renamed from: co */
    protected FrameLayout f8175co;

    /* JADX INFO: renamed from: di */
    protected String f8176di;

    /* JADX INFO: renamed from: dw */
    protected InterfaceC3370ik f8177dw;
    protected String feb;

    /* JADX INFO: renamed from: fi */
    protected Context f8179fi;

    /* JADX INFO: renamed from: fr */
    protected TextView f8180fr;
    protected String hcw;

    /* JADX INFO: renamed from: ig */
    protected int f8181ig;
    protected C2957vr igq;

    /* JADX INFO: renamed from: ik */
    protected ImageView f8182ik;

    /* JADX INFO: renamed from: ka */
    protected TextView f8184ka;

    /* JADX INFO: renamed from: lr */
    protected ImageView f8186lr;

    /* JADX INFO: renamed from: mj */
    protected dzy f8187mj;

    /* JADX INFO: renamed from: qd */
    protected C3534ri f8191qd;

    /* JADX INFO: renamed from: ri */
    protected C2634di f8193ri;
    private int rzk;

    /* JADX INFO: renamed from: sf */
    protected int f8194sf;
    protected wjv slm;
    protected C3393aw srn;

    /* JADX INFO: renamed from: su */
    protected TextView f8195su;

    /* JADX INFO: renamed from: ta */
    private ILoader f8196ta;

    /* JADX INFO: renamed from: uq */
    protected RelativeLayout f8197uq;

    /* JADX INFO: renamed from: vr */
    protected long f8198vr;
    protected TextView wjv;
    protected String xha;

    /* JADX INFO: renamed from: xm */
    private int f8200xm;

    /* JADX INFO: renamed from: zf */
    protected Button f8201zf;
    protected C3347di.ri zyn;

    /* JADX INFO: renamed from: aw */
    protected int f8172aw = -1;

    /* JADX INFO: renamed from: bu */
    protected int f8174bu = 0;

    /* JADX INFO: renamed from: nr */
    protected int f8188nr = 0;
    protected int tan = 0;

    /* JADX INFO: renamed from: ac */
    protected int f8171ac = 0;
    protected String ihz = "ダウンロード";
    protected boolean ory = false;

    /* JADX INFO: renamed from: oh */
    protected boolean f8189oh = false;

    /* JADX INFO: renamed from: xd */
    protected boolean f8199xd = true;
    protected boolean dzy = false;

    /* JADX INFO: renamed from: pv */
    protected String f8190pv = null;

    /* JADX INFO: renamed from: jc */
    protected AtomicBoolean f8183jc = new AtomicBoolean(true);

    /* JADX INFO: renamed from: kt */
    protected JSONArray f8185kt = null;
    private final AtomicInteger bnj = new AtomicInteger(0);
    private final AtomicInteger siy = new AtomicInteger(0);
    private final AtomicInteger whw = new AtomicInteger(0);
    int tnn = -1;

    /* JADX INFO: renamed from: fe */
    protected C3221ri f8178fe = null;

    /* JADX INFO: renamed from: qh */
    private final InterfaceC1999ik.lr f8192qh = new InterfaceC1999ik.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik.lr
        /* JADX INFO: renamed from: ri */
        public void mo6396ri(boolean z) {
            TTVideoLandingPageActivity.this.ory = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (!z) {
                C3583qd.m16612ri((View) TTVideoLandingPageActivity.this.f8193ri, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f8175co.getLayoutParams();
                marginLayoutParams.width = TTVideoLandingPageActivity.this.tan;
                marginLayoutParams.height = TTVideoLandingPageActivity.this.f8171ac;
                marginLayoutParams.leftMargin = TTVideoLandingPageActivity.this.f8188nr;
                marginLayoutParams.topMargin = TTVideoLandingPageActivity.this.f8174bu;
                TTVideoLandingPageActivity.this.f8175co.setLayoutParams(marginLayoutParams);
                return;
            }
            C3583qd.m16612ri((View) TTVideoLandingPageActivity.this.f8193ri, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f8175co.getLayoutParams();
            TTVideoLandingPageActivity.this.f8188nr = marginLayoutParams2.leftMargin;
            TTVideoLandingPageActivity.this.f8174bu = marginLayoutParams2.topMargin;
            TTVideoLandingPageActivity.this.tan = marginLayoutParams2.width;
            TTVideoLandingPageActivity.this.f8171ac = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            TTVideoLandingPageActivity.this.f8175co.setLayoutParams(marginLayoutParams2);
        }
    };
    private final C2728su.ri gcp = new C2728su.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: ri */
        public void m10729ri(int i) {
            if (TTVideoLandingPageActivity.this.f8181ig == 0 && i != 0 && TTVideoLandingPageActivity.this.f8193ri != null && TTVideoLandingPageActivity.this.f8190pv != null) {
                TTVideoLandingPageActivity.this.f8193ri.m9767a_(TTVideoLandingPageActivity.this.f8190pv);
            }
            if (TTVideoLandingPageActivity.this.bgr != null && TTVideoLandingPageActivity.this.bgr.getNativeVideoController() != null && !TTVideoLandingPageActivity.this.f8189oh && TTVideoLandingPageActivity.this.f8181ig != i) {
                TTVideoLandingPageActivity.this.bgr.getNativeVideoController().m12940ik(i);
            }
            TTVideoLandingPageActivity.this.f8181ig = i;
        }

        @Override // com.bytedance.sdk.component.utils.C2728su.ri
        /* JADX INFO: renamed from: ri */
        public void mo10299ri(Context context, Intent intent, boolean z, final int i) {
            com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    m10729ri(i);
                }
            });
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity$ri */
    private static class AsyncTaskC2828ri extends AsyncTask<Void, Void, Drawable> {

        /* JADX INFO: renamed from: lr */
        private final WeakReference<InterfaceC2000lr> f8217lr;

        /* JADX INFO: renamed from: ri */
        private final Bitmap f8218ri;

        private AsyncTaskC2828ri(Bitmap bitmap, InterfaceC2000lr interfaceC2000lr) {
            this.f8218ri = bitmap;
            this.f8217lr = new WeakReference<>(interfaceC2000lr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapM8826ri = C2498ri.m8826ri(C3299nr.m14642ri(), this.f8218ri, 25);
                if (bitmapM8826ri == null) {
                    return null;
                }
                return new BitmapDrawable(C3299nr.m14642ri().getResources(), bitmapM8826ri);
            } catch (Throwable th) {
                C2707ac.m10196ik("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<InterfaceC2000lr> weakReference;
            if (drawable == null || (weakReference = this.f8217lr) == null || weakReference.get() == null) {
                return;
            }
            this.f8217lr.get().mo6404ri(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ac */
    public boolean m10706ac() {
        return !TextUtils.isEmpty(this.f8190pv) && this.f8190pv.contains("__luban_sdk");
    }

    private void bgr() {
        wjv wjvVar = this.slm;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        this.igq.setVisibility(0);
        Button button = (Button) findViewById(slm.hws);
        this.f8201zf = button;
        if (button != null) {
            m10717ri(m10724ka());
            this.f8201zf.setOnClickListener(this.f8178fe);
            this.f8201zf.setOnTouchListener(this.f8178fe);
        }
    }

    /* JADX INFO: renamed from: bu */
    private void m10707bu() {
        C3120di c3120di = this.bgr;
        if (c3120di == null || c3120di.getNativeVideoController() == null || tan()) {
            return;
        }
        this.bgr.bgr();
    }

    private void ihz() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.f8187mj.mo13455ri("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: nr */
    private void m10713nr() {
        if (this.bgr == null || tan()) {
            return;
        }
        this.bgr.bgr();
    }

    /* JADX INFO: renamed from: ri */
    private void m10715ri(final int i) {
        if (this.f8182ik == null || !m10706ac()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                C3583qd.m16612ri((View) TTVideoLandingPageActivity.this.f8182ik, i);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m10716ri(InterfaceC1999ik interfaceC1999ik) {
        this.f8189oh = this.f8189oh || interfaceC1999ik.mo6371aw();
        C3535ri.m16073ri("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.TRUE);
        C3535ri.m16073ri("sp_multi_native_video_data", "key_video_isfromvideodetailpage", Boolean.TRUE);
        C3535ri.m16073ri("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.f8189oh));
        C3535ri.m16075ri("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(interfaceC1999ik.mo6373di()));
        C3535ri.m16075ri("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(interfaceC1999ik.jbs() + interfaceC1999ik.xha()));
        C3535ri.m16075ri("sp_multi_native_video_data", "key_video_duration", Long.valueOf(interfaceC1999ik.jbs()));
    }

    /* JADX INFO: renamed from: ri */
    private void m10717ri(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f8201zf) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (TTVideoLandingPageActivity.this.f8201zf == null || TTVideoLandingPageActivity.this.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f8201zf.setText(str);
            }
        });
    }

    private void slm() {
        C3120di c3120di;
        if (this.ory && (c3120di = this.bgr) != null && c3120di.getNativeVideoController() != null) {
            this.bgr.getNativeVideoController().mo6407fi(null, null);
            this.ory = false;
        } else if (!m10706ac() || this.f8183jc.getAndSet(true)) {
            super.onBackPressed();
        } else {
            ihz();
            m10715ri(0);
        }
    }

    private boolean tan() {
        C3120di c3120di = this.bgr;
        if (c3120di == null || c3120di.getNativeVideoController() == null) {
            return true;
        }
        return this.bgr.getNativeVideoController().mo6371aw();
    }

    /* JADX INFO: renamed from: vr */
    private void m10718vr() {
        dzy dzyVar = new dzy(this);
        this.f8187mj = dzyVar;
        dzyVar.m13422lr(this.f8193ri).m13411ik(this.f8176di).m13416ka(this.xha).m13421lr(this.f8194sf).m13442ri(this.slm).m13432ri(this.slm.m14407hd()).m13435ri(this.f8193ri).m13423lr("landingpage_split_screen").m13408fi(this.slm.m14541uo());
    }

    /* JADX INFO: renamed from: aw */
    protected void m10719aw() {
        try {
            C2728su.m10297ri(this.gcp);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: co */
    protected void m10720co() {
        C2728su.m10298ri(this.gcp, this.f8179fi);
    }

    /* JADX INFO: renamed from: di */
    protected void mo10721di() {
        if (xha()) {
            try {
                C3120di c3120di = new C3120di(this.f8179fi, this.slm, true, null);
                this.bgr = c3120di;
                if (c3120di.getNativeVideoController() != null) {
                    this.bgr.getNativeVideoController().m12987ri(false);
                }
                if (this.f8189oh) {
                    this.f8175co.setVisibility(0);
                    this.f8175co.removeAllViews();
                    this.f8175co.addView(this.bgr);
                    this.bgr.m12809lr(true);
                } else {
                    if (!this.dzy) {
                        this.f8198vr = 0L;
                    }
                    if (this.f8191qd != null && this.bgr.getNativeVideoController() != null) {
                        this.bgr.getNativeVideoController().m12968ik(this.f8191qd.xha);
                        this.bgr.getNativeVideoController().m12970ka(this.f8191qd.f12837fi);
                        this.bgr.m12815ri(C3299nr.m14639ka().m14853ik(String.valueOf(this.slm.m14545ur())), "landingPageInit");
                    }
                    if (this.bgr.m12816ri(this.f8198vr, this.f8199xd, this.f8189oh)) {
                        this.f8175co.setVisibility(0);
                        this.f8175co.removeAllViews();
                        this.f8175co.addView(this.bgr);
                    }
                    if (this.bgr.getNativeVideoController() != null) {
                        this.bgr.getNativeVideoController().m12987ri(false);
                        this.bgr.getNativeVideoController().m12984ri(this.f8192qh);
                    }
                }
                String strM14220ri = this.slm.rbz().get(0).m14220ri();
                C3491ka.m15835ri().mo9680ri(strM14220ri).mo9660ri(this.slm.rbz().get(0).m14217lr()).mo9655lr(this.slm.rbz().get(0).m14215ik()).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(2).mo9659ri(new C3492lr(this.slm, strM14220ri, new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8254ri(int i, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.p145fi.slm
                    /* JADX INFO: renamed from: ri */
                    public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                        try {
                            Object objMo9673lr = interfaceC2630sf.mo9673lr();
                            if (objMo9673lr instanceof Bitmap) {
                                new AsyncTaskC2828ri((Bitmap) objMo9673lr, TTVideoLandingPageActivity.this.bgr.getNativeVideoController().mo6372co()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.bgr.findViewById(520093726).setOnTouchListener(null);
                this.bgr.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e) {
                C2707ac.m10196ik("TTVideoLandingPage", e.getMessage());
                if (this.bgr == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e);
                }
            }
            if (this.f8181ig == 0) {
                try {
                    Toast.makeText(this, C2729uq.m10311ri(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    protected void mo10722fi() {
        this.igq = (C2957vr) findViewById(slm.gcp);
        this.f8193ri = (C2634di) findViewById(slm.f13267fe);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.f8186lr = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f8193ri != null) {
                        if (TTVideoLandingPageActivity.this.zyn != null) {
                            TTVideoLandingPageActivity.this.zyn.mo15059ri();
                        }
                        if (TTVideoLandingPageActivity.this.f8193ri.jbs()) {
                            TTVideoLandingPageActivity.this.f8193ri.m9780qt();
                        } else if (TTVideoLandingPageActivity.this.m10706ac()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                        } else {
                            C3414ik.m15550ri(TTVideoLandingPageActivity.this.slm, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.m10725mj(), TTVideoLandingPageActivity.this.jbs(), (TTVideoLandingPageActivity.this.bgr == null || TTVideoLandingPageActivity.this.bgr.getNativeVideoController() == null) ? null : C3571ig.m16480ri(TTVideoLandingPageActivity.this.slm, TTVideoLandingPageActivity.this.bgr.getNativeVideoController().xha(), TTVideoLandingPageActivity.this.bgr.getNativeVideoController().mo6388sf()), (com.bytedance.sdk.openadsdk.p236ka.xha) null);
                            TTVideoLandingPageActivity.this.finish();
                        }
                    }
                }
            });
        }
        C3120di c3120di = this.bgr;
        if (c3120di != null) {
            c3120di.setIsAutoPlay(this.dzy);
        }
        ImageView imageView2 = (ImageView) findViewById(slm.srn);
        this.f8182ik = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.bgr != null) {
                        C3414ik.m15550ri(TTVideoLandingPageActivity.this.slm, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.m10725mj(), TTVideoLandingPageActivity.this.jbs(), TTVideoLandingPageActivity.this.bgr.getNativeVideoController() != null ? C3571ig.m16480ri(TTVideoLandingPageActivity.this.slm, TTVideoLandingPageActivity.this.bgr.getNativeVideoController().xha(), TTVideoLandingPageActivity.this.bgr.getNativeVideoController().mo6388sf()) : null, (com.bytedance.sdk.openadsdk.p236ka.xha) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f8184ka = (TextView) findViewById(slm.f13288nh);
        this.f8175co = (FrameLayout) findViewById(slm.f13294qd);
        this.f8197uq = (RelativeLayout) findViewById(slm.f13279jc);
        this.wjv = (TextView) findViewById(slm.feb);
        this.f8180fr = (TextView) findViewById(slm.zyn);
        this.f8195su = (TextView) findViewById(slm.tnn);
        this.f8173ay = (C3346ri) findViewById(slm.f13283kt);
        m10726qt();
    }

    /* JADX INFO: renamed from: ik */
    protected abstract View mo10723ik();

    protected int jbs() {
        C3120di c3120di = this.bgr;
        if (c3120di == null || c3120di.getNativeVideoController() == null) {
            return 0;
        }
        return this.bgr.getNativeVideoController().mo6379qt();
    }

    /* JADX INFO: renamed from: ka */
    protected String m10724ka() {
        wjv wjvVar = this.slm;
        if (wjvVar != null && !TextUtils.isEmpty(wjvVar.skk())) {
            this.ihz = this.slm.skk();
        }
        return this.ihz;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: lr */
    protected void mo10489lr() {
        slm();
    }

    /* JADX INFO: renamed from: mj */
    protected long m10725mj() {
        C3120di c3120di = this.bgr;
        if (c3120di == null || c3120di.getNativeVideoController() == null) {
            return 0L;
        }
        return this.bgr.getNativeVideoController().jbs();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        slm();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bgr();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String strM14559xh;
        super.onCreate(bundle);
        if (!C3332vr.m14975fi()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            C3299nr.m14641lr(this);
        } catch (Throwable unused2) {
        }
        this.f8181ig = C2724nr.m10255ik(getApplicationContext());
        try {
            setContentView(mo10723ik());
            this.f8179fi = this;
            Intent intent = getIntent();
            this.dzy = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.f8198vr = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            wjv wjvVarM13350ri = C3197dw.m13337ri().m13350ri(C3197dw.m13336ri(intent));
            this.slm = wjvVarM13350ri;
            if (wjvVarM13350ri != null) {
                this.f8172aw = wjvVarM13350ri.m14552vz();
                this.f8176di = this.slm.m14533tn();
                this.xha = this.slm.yjg();
                strM14559xh = this.slm.m14559xh();
                this.feb = this.slm.mvf();
                this.f8190pv = this.slm.m14519sf();
                this.f8194sf = this.slm.m14360aw();
                this.hcw = this.slm.m14373co();
            } else {
                strM14559xh = null;
            }
            String strM10311ri = strM14559xh;
            if (this.slm == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.feb)) {
                this.f8196ta = C3611lr.m16744ri().m16746lr();
                int iM16747ri = C3611lr.m16744ri().m16747ri(this.f8196ta, this.feb);
                this.f8200xm = iM16747ri;
                this.rzk = iM16747ri > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.f8191qd = C3534ri.m16046ri(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                C3534ri c3534ri = this.f8191qd;
                if (c3534ri != null) {
                    this.f8198vr = c3534ri.xha;
                }
            }
            if (bundle != null) {
                this.slm = C3197dw.m13337ri().m13350ri(bundle.getInt("meta_index", -1));
                long j = bundle.getLong("video_play_position");
                if (j > 0) {
                    this.f8198vr = j;
                }
            }
            mo10722fi();
            mo10728sf();
            m10718vr();
            m10715ri(4);
            if (this.f8193ri != null) {
                C3349ik.m15077ri(this.f8179fi).m15081ri(true).m15080lr(false).m15082ri(this.f8193ri.getWebView());
                C3393aw c3393awM15370lr = new C3393aw(this.slm, this.f8193ri.getWebView(), new InterfaceC3398co() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.p236ka.InterfaceC3398co
                    /* JADX INFO: renamed from: ri */
                    public void mo10656ri(int i) {
                        C3414ik.ri.m15569ri(TTVideoLandingPageActivity.this.f8200xm, TTVideoLandingPageActivity.this.whw.get(), TTVideoLandingPageActivity.this.siy.get(), TTVideoLandingPageActivity.this.bnj.get() - TTVideoLandingPageActivity.this.siy.get(), TTVideoLandingPageActivity.this.slm, "landingpage_split_screen", i);
                    }
                }, this.rzk).m15370lr(true);
                this.srn = c3393awM15370lr;
                this.zyn = c3393awM15370lr.f12084ri;
                this.srn.m15388ri("landingpage_split_screen");
            }
            C2634di c2634di = this.f8193ri;
            if (c2634di != null) {
                c2634di.setLandingPage(true);
                this.f8193ri.setTag("landingpage_split_screen");
                this.f8193ri.setMaterialMeta(this.slm.m14452nb());
                this.f8193ri.setWebViewClient(new C3348fi(this.f8179fi, this.f8187mj, this.f8176di, this.srn, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3348fi, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.feb)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.bnj.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelM16748ri = C3611lr.m16744ri().m16748ri(TTVideoLandingPageActivity.this.f8196ta, TTVideoLandingPageActivity.this.feb, str);
                            if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.siy.incrementAndGet();
                                return webResourceResponseModelM16748ri.getWebResourceResponse();
                            }
                            if (webResourceResponseModelM16748ri != null && webResourceResponseModelM16748ri.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.whw.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            C2707ac.m10206ri("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                C2634di c2634di2 = this.f8193ri;
                c2634di2.setUserAgentString(tan.m16659ri(c2634di2.getWebView(), BuildConfig.VERSION_CODE));
            }
            C2634di c2634di3 = this.f8193ri;
            if (c2634di3 != null) {
                c2634di3.setMixedContentMode(0);
            }
            C3414ik.m15537ri(this.slm, "landingpage_split_screen", this.rzk);
            C3594uq.m16663ri(this.f8193ri, this.f8190pv);
            this.f8193ri.setWebChromeClient(new C3350ka(this.f8187mj, this.srn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.p228ri.C3350ka, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                }
            });
            this.f8193ri.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                    if (TTVideoLandingPageActivity.this.f8177dw != null) {
                        TTVideoLandingPageActivity.this.f8177dw.mo15239ri(TTVideoLandingPageActivity.this.slm);
                    }
                }
            });
            TextView textView = this.f8184ka;
            if (textView != null) {
                if (TextUtils.isEmpty(strM10311ri)) {
                    strM10311ri = C2729uq.m10311ri(this, "tt_web_title_default");
                }
                textView.setText(strM10311ri);
            }
            m10720co();
            mo10721di();
            bgr();
            C3414ik.ri.m15571ri(SystemClock.elapsedRealtime() - jElapsedRealtime, this.slm, "landingpage_split_screen", this.f8196ta, this.feb);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m10719aw();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.slm.bgr(false);
        } catch (Throwable unused) {
        }
        C2634di c2634di = this.f8193ri;
        if (c2634di != null) {
            srn.m14966ri(c2634di.getWebView());
        }
        this.f8193ri = null;
        dzy dzyVar = this.f8187mj;
        if (dzyVar != null) {
            dzyVar.m13403co();
        }
        C3120di c3120di = this.bgr;
        if (c3120di != null && c3120di.getNativeVideoController() != null) {
            this.bgr.getNativeVideoController().mo6374fi();
        }
        this.bgr = null;
        this.slm = null;
        C3393aw c3393aw = this.srn;
        if (c3393aw != null) {
            c3393aw.m15369ka(true);
        }
        if (!TextUtils.isEmpty(this.feb)) {
            C3414ik.ri.m15570ri(this.siy.get(), this.bnj.get(), this.slm);
        }
        C3611lr.m16744ri().m16749ri(this.f8196ta);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        m10713nr();
        C3120di c3120di = this.bgr;
        if (c3120di == null || c3120di.getNativeVideoController() == null) {
            return;
        }
        m10716ri(this.bgr.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f8199xd) {
            m10707bu();
        }
        this.f8199xd = false;
        dzy dzyVar = this.f8187mj;
        if (dzyVar != null) {
            dzyVar.m13459sf();
        }
        C3393aw c3393aw = this.srn;
        if (c3393aw != null) {
            c3393aw.xha();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iM13348ri = this.slm != null ? C3197dw.m13337ri().m13348ri(this.slm) : -1;
        this.tnn = iM13348ri;
        bundle.putInt("meta_index", iM13348ri);
        bundle.putLong("video_play_position", this.f8198vr);
        bundle.putBoolean("is_complete", this.f8189oh);
        long jDi = this.f8198vr;
        C3120di c3120di = this.bgr;
        if (c3120di != null && c3120di.getNativeVideoController() != null) {
            jDi = this.bgr.getNativeVideoController().mo6373di();
        }
        bundle.putLong("video_play_position", jDi);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.tnn >= 0) {
            C3197dw.m13337ri().m13341ik(this.tnn);
            this.tnn = -1;
        }
        C3577ka.m16532ri(this, this.slm);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        C3393aw c3393aw = this.srn;
        if (c3393aw != null) {
            c3393aw.m15375mj();
        }
    }

    /* JADX INFO: renamed from: qt */
    protected void m10726qt() {
        String strTpb;
        wjv wjvVar = this.slm;
        if (wjvVar == null || wjvVar.adz() != 4) {
            return;
        }
        C3583qd.m16612ri((View) this.f8197uq, 0);
        if (!TextUtils.isEmpty(this.slm.m14559xh())) {
            strTpb = this.slm.m14559xh();
        } else if (TextUtils.isEmpty(this.slm.m14535tq())) {
            strTpb = !TextUtils.isEmpty(this.slm.tpb()) ? this.slm.tpb() : "";
        } else {
            strTpb = this.slm.m14535tq();
        }
        if (this.slm.m14391fb() != null && this.slm.m14391fb().m14220ri() != null) {
            C3583qd.m16612ri((View) this.f8173ay, 0);
            C3583qd.m16612ri((View) this.wjv, 4);
            C2751lr.m10463lr().m10470ri(this.slm.m14391fb(), this.f8173ay, this.slm);
        } else if (!TextUtils.isEmpty(strTpb)) {
            C3583qd.m16612ri((View) this.f8173ay, 4);
            C3583qd.m16612ri((View) this.wjv, 0);
            this.wjv.setText(strTpb.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.slm.skk())) {
            this.f8195su.setText(this.slm.skk());
        }
        if (!TextUtils.isEmpty(strTpb)) {
            this.f8180fr.setText(strTpb);
        }
        C3583qd.m16612ri((View) this.f8180fr, 0);
        C3583qd.m16612ri((View) this.f8195su, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.p259sf.InterfaceC3517ka
    /* JADX INFO: renamed from: ri */
    public void mo10727ri(boolean z, JSONArray jSONArray) {
        if (!z || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f8185kt = jSONArray;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    /* JADX INFO: renamed from: ri */
    protected boolean mo10491ri() {
        return true;
    }

    /* JADX INFO: renamed from: sf */
    public void mo10728sf() {
        if (this.slm == null) {
            return;
        }
        this.f8177dw = C3371ka.m15240ri(this, this.hcw);
        C3221ri c3221ri = new C3221ri(this, this.slm, this.hcw, this.f8194sf);
        this.f8178fe = c3221ri;
        c3221ri.m13547ri(false);
        this.f8178fe.m13543ik(true);
        this.f8195su.setOnClickListener(this.f8178fe);
        this.f8195su.setOnTouchListener(this.f8178fe);
        this.f8178fe.m13534ri(this.f8177dw);
    }

    protected abstract boolean xha();
}
