package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2708aw;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3220lr;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.InterfaceC3370ik;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p175ay.p177ri.C2897ik;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3506ri;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.InterfaceC3500di;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.p257ri.C3507ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C3128bu {

    /* JADX INFO: renamed from: aw */
    private C3220lr f10176aw;
    private C3221ri bgr;

    /* JADX INFO: renamed from: di */
    private final String f10178di;

    /* JADX INFO: renamed from: ik */
    private final Context f10180ik;

    /* JADX INFO: renamed from: ka */
    private final PAGNativeAd f10181ka;

    /* JADX INFO: renamed from: lr */
    private InterfaceC3370ik f10182lr;

    /* JADX INFO: renamed from: mj */
    private long f10183mj;

    /* JADX INFO: renamed from: qt */
    private final C3506ri f10184qt;

    /* JADX INFO: renamed from: ri */
    private final com.bytedance.sdk.openadsdk.core.model.wjv f10185ri;

    /* JADX INFO: renamed from: sf */
    private InterfaceC1999ik f10186sf;
    private InterfaceC3500di xha;

    /* JADX INFO: renamed from: fi */
    private List<View> f10179fi = new ArrayList();
    private final com.bytedance.sdk.openadsdk.p236ka.xha jbs = new com.bytedance.sdk.openadsdk.p236ka.xha();

    /* JADX INFO: renamed from: co */
    private final AtomicBoolean f10177co = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bu$ri */
    private static class ri implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: lr */
        private final ViewGroup f10195lr;

        /* JADX INFO: renamed from: ri */
        private final com.bytedance.sdk.openadsdk.p236ka.xha f10196ri;

        public ri(com.bytedance.sdk.openadsdk.p236ka.xha xhaVar, ViewGroup viewGroup) {
            this.f10196ri = xhaVar;
            this.f10195lr = viewGroup;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f10196ri.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(this.f10195lr));
        }
    }

    public C3128bu(Context context, PAGNativeAd pAGNativeAd, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, C3506ri c3506ri) {
        this.f10181ka = pAGNativeAd;
        this.f10185ri = wjvVar;
        this.f10180ik = context;
        this.f10178di = str;
        this.f10184qt = c3506ri;
        if (wjvVar.adz() == 4) {
            this.f10182lr = C3371ka.m15240ri(context, str);
        }
    }

    /* JADX INFO: renamed from: fi */
    private C3269mj m12992fi(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C3269mj) {
                return (C3269mj) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    private C3269mj m12993ik(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, InterfaceC3500di interfaceC3500di) {
        this.xha = interfaceC3500di;
        viewGroup.addOnLayoutChangeListener(new ri(this.jbs, viewGroup));
        this.f10179fi = list;
        C3269mj c3269mjM12992fi = m12992fi(viewGroup);
        if (c3269mjM12992fi == null) {
            c3269mjM12992fi = new C3269mj(this.f10180ik, viewGroup, false);
            viewGroup.addView(c3269mjM12992fi);
        }
        c3269mjM12992fi.m13928ri();
        c3269mjM12992fi.setRefClickViews(list2);
        if (list != null) {
            for (View view : this.f10179fi) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        c3269mjM12992fi.setRefCreativeViews(list3);
        return c3269mjM12992fi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m12995ik(ViewGroup viewGroup) {
        this.jbs.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(viewGroup));
    }

    /* JADX INFO: renamed from: ka */
    private void m12996ka(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f10179fi != null) {
                JSONArray jSONArray = new JSONArray();
                for (View view : this.f10179fi) {
                    if (view != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("width", view.getWidth());
                            jSONObject2.put("height", view.getHeight());
                            jSONObject2.put("alpha", view.getAlpha());
                        } catch (Throwable unused) {
                        }
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("image_view", jSONArray.toString());
            }
            if (viewGroup != null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("width", viewGroup.getWidth());
                    jSONObject3.put("height", viewGroup.getHeight());
                    jSONObject3.put("alpha", viewGroup.getAlpha());
                } catch (Throwable unused2) {
                }
                jSONObject.put("root_view", jSONObject3.toString());
            }
            PAGMediaView pAGMediaViewM15888mj = this.f10184qt.m15888mj();
            if (pAGMediaViewM15888mj != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("width", C3583qd.m16581ik(this.f10180ik, pAGMediaViewM15888mj.getWidth()) * 1.0f);
                    jSONObject4.put("height", C3583qd.m16581ik(this.f10180ik, pAGMediaViewM15888mj.getHeight()) * 1.0f);
                } catch (Throwable unused3) {
                }
                jSONObject.put("media_view", jSONObject4.toString());
            }
            C3222ac c3222acM15887lr = this.f10184qt.m15887lr();
            if (c3222acM15887lr != null && (wjvVar = this.f10185ri) != null) {
                jSONObject.put("dynamic_show_type", wjvVar.hpn());
                c3222acM15887lr.m13574ri(jSONObject, this.f10185ri);
            }
            C3414ik.m15558ri(this.f10185ri, this.f10178di, jSONObject, (JSONObject) null);
            C2897ik.m11145ri(this.f10185ri);
        } catch (JSONException e) {
            C2707ac.m10206ri("InteractionManager", "onShowFun json error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12999lr() {
        if (this.f10183mj > 0) {
            C3414ik.m15564ri(String.valueOf(SystemClock.elapsedRealtime() - this.f10183mj), this.f10185ri, this.f10178di, this.jbs);
            this.f10183mj = 0L;
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13000lr(final ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.utils.srn.m16656ri(viewGroup, true, 5, false, new com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr() { // from class: com.bytedance.sdk.openadsdk.core.bu.6
            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: lr */
            public void mo13024lr() {
                C3128bu.this.m12999lr();
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13025ri() {
                C3128bu.this.m12995ik(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13026ri(View view, boolean z) {
                if (!z) {
                    C2897ik.m11146ri(C3128bu.this.f10185ri, 8);
                } else {
                    C2897ik.m11146ri(C3128bu.this.f10185ri, 4);
                    C3128bu.this.m13005ri(viewGroup, view);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.srn.InterfaceC3591lr
            /* JADX INFO: renamed from: ri */
            public void mo13027ri(boolean z) {
                C3128bu.this.m13015ri(z, viewGroup);
            }
        }, null);
    }

    /* JADX INFO: renamed from: lr */
    private void m13001lr(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, InterfaceC3500di interfaceC3500di) {
        this.xha = interfaceC3500di;
        viewGroup.addOnLayoutChangeListener(new ri(this.jbs, viewGroup));
        this.f10179fi = list;
        m13014ri(list2, (AbstractViewOnClickListenerC3218ik) null);
        if (list != null) {
            for (View view : this.f10179fi) {
                if (view != null) {
                    view.setTag(520093762, Boolean.TRUE);
                }
            }
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        m13014ri(list3, (AbstractViewOnClickListenerC3218ik) null);
    }

    /* JADX INFO: renamed from: lr */
    private void m13002lr(C3220lr c3220lr, C3221ri c3221ri) {
        C3506ri c3506ri = this.f10184qt;
        if (c3506ri != null && c3506ri.m15887lr() != null) {
            C3222ac c3222acM15887lr = this.f10184qt.m15887lr();
            if ((c3220lr instanceof com.bytedance.sdk.openadsdk.core.jbs.jbs) && (c3221ri instanceof C3235mj)) {
                c3222acM15887lr.setClickListener((com.bytedance.sdk.openadsdk.core.jbs.jbs) c3220lr);
                c3222acM15887lr.setClickCreativeListener((C3235mj) c3221ri);
            }
            c3222acM15887lr.setJsbLandingPageOpenListener(new InterfaceC3338fi() { // from class: com.bytedance.sdk.openadsdk.core.bu.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi
                /* JADX INFO: renamed from: ri */
                public void mo10615ri() {
                    if (C3128bu.this.xha != null) {
                        C3128bu.this.xha.onAdClicked();
                    }
                }
            });
        }
        C3506ri c3506ri2 = this.f10184qt;
        if (c3506ri2 != null && c3506ri2.m15890ri() != null) {
            this.f10184qt.m15890ri().setOnClickListener(c3221ri);
            this.f10184qt.m15890ri().setOnTouchListener(c3221ri);
        }
        C3506ri c3506ri3 = this.f10184qt;
        if (c3506ri3 != null) {
            c3506ri3.m15895ri(c3221ri);
            this.f10184qt.m15894ri(c3220lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13004ri(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        Context contextM10240ri = viewGroup != null ? C2722lr.m10240ri(viewGroup) : null;
        if (contextM10240ri == null) {
            contextM10240ri = this.f10180ik;
        }
        if (this.f10185ri.ajz() == 2) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10185ri;
            String str = this.f10178di;
            this.f10176aw = new com.bytedance.sdk.openadsdk.core.jbs.jbs(contextM10240ri, wjvVar, str, C3571ig.m16470ri(str));
        } else {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.f10185ri;
            String str2 = this.f10178di;
            this.f10176aw = new C3220lr(contextM10240ri, wjvVar2, str2, C3571ig.m16470ri(str2));
        }
        this.f10176aw.m13528ri(viewGroup);
        this.f10176aw.m13529ri(this.f10186sf);
        this.f10176aw.m13534ri(this.f10182lr);
        this.f10176aw.m13530ri(this.f10181ka);
        this.f10176aw.m13536ri(map);
        this.f10176aw.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.1
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                if (C3128bu.this.xha != null) {
                    C3128bu.this.xha.onAdClicked();
                }
            }
        });
        if (this.f10185ri.ajz() == 2) {
            Context context = this.f10180ik;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar3 = this.f10185ri;
            String str3 = this.f10178di;
            this.bgr = new C3235mj(context, wjvVar3, str3, C3571ig.m16470ri(str3));
        } else {
            Context context2 = this.f10180ik;
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar4 = this.f10185ri;
            String str4 = this.f10178di;
            this.bgr = new C3221ri(context2, wjvVar4, str4, C3571ig.m16470ri(str4));
        }
        this.bgr.m13528ri(viewGroup);
        this.bgr.m13529ri(this.f10186sf);
        this.bgr.m13534ri(this.f10182lr);
        this.bgr.m13530ri(this.f10181ka);
        this.bgr.m13536ri(map);
        this.bgr.m13531ri(new C3220lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.2
            @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo11528ri(View view, int i) {
                if (C3128bu.this.xha != null) {
                    C3128bu.this.xha.onAdClicked();
                }
                C2889fi.m11114ri(C3128bu.this.f10185ri, 9);
                C3128bu.this.f10184qt.m15881aw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13005ri(ViewGroup viewGroup, View view) {
        C3097ka c3097kaM14188ri;
        if (this.f10177co.get()) {
            return;
        }
        this.f10177co.set(true);
        if (this.f10181ka instanceof C3507ik) {
            C3222ac c3222acM15887lr = this.f10184qt.m15887lr();
            if (c3222acM15887lr != null) {
                c3222acM15887lr.m13573nr();
            }
            ((C3507ik) this.f10181ka).m15914ri(true);
        }
        this.jbs.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(viewGroup));
        this.f10183mj = SystemClock.elapsedRealtime();
        m12996ka(viewGroup);
        InterfaceC3500di interfaceC3500di = this.xha;
        if (interfaceC3500di != null) {
            interfaceC3500di.mo15863ri(this.f10181ka);
        }
        if (this.f10185ri.m14384du()) {
            C3571ig.m16481ri(this.f10185ri, view);
        }
        C3283ka c3283kaM14473qc = this.f10185ri.m14473qc();
        if (c3283kaM14473qc == null || (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) == null) {
            return;
        }
        c3097kaM14188ri.m12481ri(0L);
    }

    /* JADX INFO: renamed from: ri */
    private void m13006ri(ViewGroup viewGroup, C3269mj c3269mj, List<View> list, List<View> list2) {
        C3220lr c3220lr = this.f10176aw;
        if (c3220lr == null || this.bgr == null) {
            return;
        }
        c3269mj.m13929ri(list, c3220lr);
        c3269mj.m13929ri(list2, this.bgr);
        m13011ri(this.f10176aw, this.bgr);
        m13013ri(c3269mj, viewGroup);
    }

    /* JADX INFO: renamed from: ri */
    private void m13007ri(ViewGroup viewGroup, List<View> list, List<View> list2) {
        C3220lr c3220lr = this.f10176aw;
        if (c3220lr == null || this.bgr == null) {
            return;
        }
        m13014ri(list, c3220lr);
        m13014ri(list2, this.bgr);
        m13011ri(this.f10176aw, this.bgr);
        m13000lr(viewGroup);
    }

    /* JADX INFO: renamed from: ri */
    private void m13011ri(C3220lr c3220lr, C3221ri c3221ri) {
        if (this.f10185ri.ajz() == 2) {
            m13002lr(c3220lr, c3221ri);
        } else {
            m13012ri(c3221ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13012ri(C3221ri c3221ri) {
        if (C3322sf.m14819lr().m14856ka(String.valueOf(this.f10185ri.m14545ur()))) {
            C3506ri c3506ri = this.f10184qt;
            if (c3506ri != null && c3506ri.m15890ri() != null) {
                this.f10184qt.m15890ri().setOnClickListener(c3221ri);
                this.f10184qt.m15890ri().setOnTouchListener(c3221ri);
            }
            C3506ri c3506ri2 = this.f10184qt;
            if (c3506ri2 != null) {
                c3506ri2.m15895ri(c3221ri);
                return;
            }
            return;
        }
        C3506ri c3506ri3 = this.f10184qt;
        if (c3506ri3 != null && c3506ri3.m15890ri() != null) {
            PAGMediaView pAGMediaViewM15890ri = this.f10184qt.m15890ri();
            AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik = new AbstractViewOnClickListenerC3218ik() { // from class: com.bytedance.sdk.openadsdk.core.bu.4
                @Override // com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
                /* JADX INFO: renamed from: ri */
                protected void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
                    if (view instanceof PAGVideoMediaView) {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    }
                }
            };
            pAGMediaViewM15890ri.setOnClickListener(abstractViewOnClickListenerC3218ik);
            pAGMediaViewM15890ri.setOnTouchListener(abstractViewOnClickListenerC3218ik);
        }
        C3506ri c3506ri4 = this.f10184qt;
        if (c3506ri4 != null) {
            c3506ri4.m15895ri((C3221ri) null);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13013ri(C3269mj c3269mj, final ViewGroup viewGroup) {
        c3269mj.setCallback(new C3269mj.ri() { // from class: com.bytedance.sdk.openadsdk.core.bu.5
            @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
            /* JADX INFO: renamed from: lr */
            public void mo13020lr() {
                C3128bu.this.m12999lr();
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
            /* JADX INFO: renamed from: ri */
            public void mo13021ri() {
                C3128bu.this.m12995ik(viewGroup);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
            /* JADX INFO: renamed from: ri */
            public void mo13022ri(View view) {
                C3128bu.this.m13005ri(viewGroup, view);
            }

            @Override // com.bytedance.sdk.openadsdk.core.C3269mj.ri
            /* JADX INFO: renamed from: ri */
            public void mo13023ri(boolean z) {
                C3128bu.this.m13015ri(z, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private void m13014ri(List<View> list, AbstractViewOnClickListenerC3218ik abstractViewOnClickListenerC3218ik) {
        if (C2708aw.m10208lr(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(abstractViewOnClickListenerC3218ik);
                    view.setOnTouchListener(abstractViewOnClickListenerC3218ik);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13015ri(boolean z, ViewGroup viewGroup) {
        if (z && this.f10185ri.nhl() && !this.f10185ri.igq()) {
            this.f10185ri.xha(true);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10185ri;
            C3414ik.m15548ri(wjvVar, this.f10178di, wjvVar.wzv());
        }
        if (z || this.f10183mj <= 0) {
            this.jbs.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(viewGroup));
            this.f10183mj = SystemClock.elapsedRealtime();
        } else {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.f10183mj);
            this.jbs.m15724ri(System.currentTimeMillis(), C3302pv.m14654ri(viewGroup));
            C3414ik.m15564ri(strValueOf, this.f10185ri, this.f10178di, this.jbs);
            this.f10183mj = 0L;
        }
    }

    /* JADX INFO: renamed from: ri */
    public com.bytedance.sdk.openadsdk.p236ka.xha m13016ri() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: ri */
    public void m13017ri(View view, int i) {
        InterfaceC3500di interfaceC3500di = this.xha;
        if (interfaceC3500di != null) {
            interfaceC3500di.onAdClicked();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13018ri(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, InterfaceC3500di interfaceC3500di) {
        m13001lr(viewGroup, list, list2, list3, interfaceC3500di);
        m13004ri(viewGroup);
        m13007ri(viewGroup, list2, list3);
    }

    /* JADX INFO: renamed from: ri */
    public void m13019ri(InterfaceC1999ik interfaceC1999ik) {
        this.f10186sf = interfaceC1999ik;
        C3220lr c3220lr = this.f10176aw;
        if (c3220lr != null) {
            c3220lr.m13529ri(interfaceC1999ik);
        }
        C3221ri c3221ri = this.bgr;
        if (c3221ri != null) {
            c3221ri.m13529ri(interfaceC1999ik);
        }
    }
}
