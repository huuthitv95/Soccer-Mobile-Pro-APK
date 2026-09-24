package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.common.C2949nr;
import com.bytedance.sdk.openadsdk.component.p182fi.C2962ik;
import com.bytedance.sdk.openadsdk.component.p182fi.C2963lr;
import com.bytedance.sdk.openadsdk.component.p182fi.C2964ri;
import com.bytedance.sdk.openadsdk.component.p184ka.C2976ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.jbs;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3094ka;
import com.bytedance.sdk.openadsdk.core.wjv;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2754lr;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class xha implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: di */
    private AdSlot f9674di;

    /* JADX INFO: renamed from: ik */
    private final C2958di f9676ik;

    /* JADX INFO: renamed from: lr */
    private final wjv<C3430ri> f9678lr;

    /* JADX INFO: renamed from: mj */
    private int f9679mj;

    /* JADX INFO: renamed from: ri */
    private final Context f9681ri;

    /* JADX INFO: renamed from: sf */
    private boolean f9682sf;
    private PAGAppOpenAdLoadListener xha;

    /* JADX INFO: renamed from: ka */
    private final AtomicBoolean f9677ka = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fi */
    private int f9675fi = 0;
    private volatile int jbs = 0;

    /* JADX INFO: renamed from: qt */
    private final hcw f9680qt = new hcw();

    public xha(Context context) {
        if (context != null) {
            this.f9681ri = context.getApplicationContext();
        } else {
            this.f9681ri = C3299nr.m14642ri();
        }
        this.f9678lr = C3299nr.m14638ik();
        this.f9676ik = C2958di.m11449ri(this.f9681ri);
    }

    /* JADX INFO: renamed from: ik */
    private void m12331ik(final AdSlot adSlot) {
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
        igqVar.f11284sf = this.f9680qt;
        igqVar.f11279ka = 1;
        igqVar.jbs = 2;
        this.f9678lr.mo12638ri(adSlot, igqVar, 3, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.xha.1
            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                xha.this.jbs = 3;
                xha.this.m12340ri(new C2962ik(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                xha.this.m12343ri(c3289ri, c3282ik, adSlot, c3582pvM16567lr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12333lr() {
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
        igqVar.f11284sf = this.f9680qt;
        igqVar.f11279ka = 1;
        igqVar.jbs = 2;
        this.jbs = 1;
        this.f9678lr.mo12638ri(this.f9674di, igqVar, 3, new C3331uq() { // from class: com.bytedance.sdk.openadsdk.component.xha.4

            /* JADX INFO: renamed from: ri */
            boolean f9692ri = false;

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public String mo11676ri() {
                if (!C3087ri.m12350fi()) {
                    return xha.this.f9676ik.m11455ik(xha.this.f9675fi);
                }
                C2963lr c2963lrM11394ri = C2949nr.m11382ri().m11394ri(xha.this.f9674di);
                if (c2963lrM11394ri == null) {
                    return null;
                }
                xha.this.f9674di.setCacheTime(c2963lrM11394ri.m11502ka());
                return c2963lrM11394ri.m11503lr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10890ri(int i, String str) {
                xha.this.jbs = 3;
                xha.this.m12340ri(new C2962ik(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
            /* JADX INFO: renamed from: ri */
            public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM14248di;
                if (c3289ri == null || (wjvVarM14248di = c3289ri.m14248di()) == null) {
                    return;
                }
                wjvVarM14248di.m14415ik(xha.this.f9680qt.m14156qt());
                if (this.f9692ri) {
                    xha.this.f9676ik.m11464ri(wjvVarM14248di.m14388eb(), wjvVarM14248di.m14424jf());
                    xha.this.m12340ri(new C2962ik(1, 101, wjvVarM14248di, (C3289ri) null));
                } else {
                    xha xhaVar = xha.this;
                    xhaVar.m12343ri(c3289ri, c3282ik, xhaVar.f9674di, c3582pvM16567lr);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.ihz
            /* JADX INFO: renamed from: ri */
            public boolean mo11677ri(C3289ri c3289ri) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM14248di;
                if (c3289ri != null && c3289ri.m14249fi() && (wjvVarM14248di = c3289ri.m14248di()) != null) {
                    boolean zM14332fi = com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVarM14248di);
                    if (wjvVarM14248di.ory() || !zM14332fi || C3087ri.m12349di() || !TextUtils.isEmpty(xha.this.f9676ik.m11459ri(wjvVarM14248di))) {
                        this.f9692ri = !xha.this.f9676ik.m11458lr(wjvVarM14248di.m14388eb());
                    } else {
                        this.f9692ri = false;
                        C2976ri.m11561lr(c3289ri.m14248di());
                    }
                    C3094ka.m12450ri(wjvVarM14248di);
                }
                return this.f9692ri;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    private void m12334lr(AdSlot adSlot) {
        this.jbs = 1;
        m12331ik(adSlot);
    }

    /* JADX INFO: renamed from: ri */
    public static xha m12337ri(Context context) {
        return new xha(context);
    }

    /* JADX INFO: renamed from: ri */
    private void m12339ri() {
        dzy.m16396ik((Runnable) new AbstractRunnableC2676ik("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.xha.3
            @Override // java.lang.Runnable
            public void run() {
                xha.this.m12333lr();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12340ri(C2962ik c2962ik) {
        int iM11495lr = c2962ik.m11495lr();
        int iM11493ik = c2962ik.m11493ik();
        C2976ri.m11564ri(this.f9680qt, iM11493ik, iM11495lr);
        if (!this.f9677ka.compareAndSet(false, true)) {
            if (iM11495lr == 1 && iM11493ik == 100 && !this.f9680qt.f11272ri) {
                C2958di.m11449ri(C3299nr.m14642ri()).m11465ri(new C2964ri(this.f9675fi, c2962ik.m11494ka(), c2962ik.m11496ri()));
                if (this.f9682sf) {
                    return;
                }
                C2976ri.m11568ri(c2962ik.m11494ka(), 1, this.f9680qt);
                return;
            }
            return;
        }
        if (iM11495lr != 1) {
            if (iM11495lr == 2 || iM11495lr == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.xha;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(c2962ik.m11492fi(), c2962ik.m11491di());
                }
                if (iM11495lr == 3) {
                    C2976ri.m11563ri(this.jbs, this.f9679mj, this.f9680qt);
                    return;
                }
                return;
            }
            return;
        }
        if (iM11493ik == 100 && !this.f9680qt.f11272ri) {
            this.f9676ik.m11465ri(new C2964ri(this.f9675fi, c2962ik.m11494ka(), c2962ik.m11496ri()));
        }
        if (this.xha != null) {
            this.xha.onAdLoaded(new C2975ka(this.f9681ri, c2962ik.m11494ka(), iM11493ik == 101, this.f9674di));
        }
        if (iM11493ik == 101) {
            C2976ri.m11569ri(c2962ik.m11494ka(), this.f9680qt.m14157ri().m16570ka());
        } else if (iM11493ik == 100) {
            C2976ri.m11568ri(c2962ik.m11494ka(), 0, this.f9680qt);
            this.f9682sf = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12343ri(final C3289ri c3289ri, C3282ik c3282ik, AdSlot adSlot, C3582pv c3582pv) {
        this.jbs = 2;
        if (c3289ri == null || c3289ri.m14252ka() == null || c3289ri.m14252ka().size() == 0) {
            this.jbs = 3;
            m12340ri(new C2962ik(2, 100, Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE, jbs.m13550ri(Sdk.SDKError.Reason.AD_SERVER_ERROR_VALUE)));
            c3282ik.m14181ri(-3);
            c3282ik.m14175ik(3);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = c3289ri.m14252ka().get(0);
        long jGcp = wjvVar.gcp();
        this.f9680qt.f11269lr = jGcp;
        wjvVar.m14415ik(this.f9680qt.m14156qt());
        boolean zM14331di = com.bytedance.sdk.openadsdk.core.model.wjv.m14331di(wjvVar);
        if (wjvVar.ory()) {
            m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
            return;
        }
        if (zM14331di || wjvVar.m14367bl()) {
            m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
            if (com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar)) {
                m12344ri(wjvVar, adSlot, false, c3289ri);
                return;
            } else {
                m12345ri(wjvVar, false, c3289ri);
                return;
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.model.wjv.m14332fi(wjvVar)) {
            this.f9680qt.f11269lr = -1L;
            this.f9680qt.m14158ri(3);
            m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
            m12345ri(wjvVar, false, c3289ri);
            return;
        }
        if (C3087ri.m12349di()) {
            this.f9680qt.f11269lr = -1L;
            this.f9680qt.m14158ri(3);
            m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
            m12344ri(wjvVar, adSlot, false, c3289ri);
            return;
        }
        m12344ri(wjvVar, adSlot, !this.f9680qt.f11272ri, c3289ri);
        if (this.f9680qt.f11272ri) {
            C3521ka.m15947ri(wjvVar, c3582pv.m16570ka());
            Long.valueOf(jGcp);
            if (jGcp != 0) {
                C3332vr.m14978lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.xha.2
                    @Override // java.lang.Runnable
                    public void run() {
                        xha.this.f9680qt.m14158ri(2);
                        xha.this.m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
                    }
                }, jGcp);
            } else {
                this.f9680qt.m14158ri(2);
                m12340ri(new C2962ik(1, 100, wjvVar, c3289ri));
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12344ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, AdSlot adSlot, final boolean z, final C3289ri c3289ri) {
        this.f9676ik.m11466ri(wjvVar, adSlot, this.f9680qt, new C2958di.lr() { // from class: com.bytedance.sdk.openadsdk.component.xha.5
            @Override // com.bytedance.sdk.openadsdk.component.C2958di.lr
            /* JADX INFO: renamed from: ri */
            public void mo11473ri() {
                if (z) {
                    xha.this.jbs = 4;
                    C2962ik c2962ik = new C2962ik(1, 100, wjvVar, c3289ri);
                    c2962ik.m11497ri(true);
                    xha.this.m12340ri(c2962ik);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.C2958di.lr
            /* JADX INFO: renamed from: ri */
            public void mo11474ri(int i, String str) {
                if (z) {
                    xha.this.jbs = 5;
                    xha.this.m12340ri(new C2962ik(2, 100, GamesActivityResultCodes.RESULT_LICENSE_FAILED, jbs.m13550ri(GamesActivityResultCodes.RESULT_LICENSE_FAILED)));
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m12345ri(final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, final boolean z, final C3289ri c3289ri) {
        this.f9676ik.m11468ri(wjvVar, this.f9680qt, new C2958di.ri() { // from class: com.bytedance.sdk.openadsdk.component.xha.6
            @Override // com.bytedance.sdk.openadsdk.component.C2958di.ri
            /* JADX INFO: renamed from: ri */
            public void mo11475ri() {
                if (z) {
                    xha.this.jbs = 5;
                    xha.this.m12340ri(new C2962ik(2, 100, GamesActivityResultCodes.RESULT_LICENSE_FAILED, jbs.m13550ri(GamesActivityResultCodes.RESULT_LICENSE_FAILED)));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.C2958di.ri
            /* JADX INFO: renamed from: ri */
            public void mo11476ri(C2754lr c2754lr) {
                if (z) {
                    xha.this.jbs = 4;
                    C2962ik c2962ik = new C2962ik(1, 100, wjvVar, c3289ri);
                    c2962ik.m11497ri(true);
                    xha.this.m12340ri(c2962ik);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public int m12346ri(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what != 1 || this.f9677ka.get()) {
            return;
        }
        m12340ri(new C2962ik(3, 102, 10002, jbs.m13550ri(10002)));
    }

    /* JADX INFO: renamed from: ri */
    public void m12347ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.xha xhaVar, int i) {
        if (xhaVar == null) {
            return;
        }
        if (i <= 0) {
            i = C3087ri.xha();
        }
        this.f9674di = adSlot;
        adSlot.setCacheScene(0);
        this.f9680qt.f11272ri = !TextUtils.isEmpty(this.f9674di.getBidAdm());
        if (xhaVar instanceof PAGAppOpenAdLoadListener) {
            this.xha = (PAGAppOpenAdLoadListener) xhaVar;
        }
        this.f9675fi = m12346ri(this.f9674di);
        this.f9679mj = i;
        this.f9680qt.m14160ri(C3582pv.m16567lr());
        if (Build.VERSION.SDK_INT >= 24) {
            this.f9680qt.m14153lr(C3087ri.m12353lr());
            this.f9680qt.m14152lr(C3087ri.m12351ik());
        }
        if (this.f9680qt.f11272ri) {
            m12334lr(this.f9674di);
        } else {
            new igq(C3332vr.m14978lr().getLooper(), this).sendEmptyMessageDelayed(1, i);
            m12339ri();
        }
    }
}
