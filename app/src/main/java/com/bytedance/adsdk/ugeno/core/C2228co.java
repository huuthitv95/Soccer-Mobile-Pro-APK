package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.C2260fi;
import com.bytedance.adsdk.ugeno.core.p089ri.AbstractC2244lr;
import com.bytedance.adsdk.ugeno.core.p089ri.InterfaceC2245ri;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p101ka.InterfaceC2283aw;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.C2315ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;
import com.ironsource.C12434q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2228co {

    /* JADX INFO: renamed from: ac */
    private jbs f5499ac;
    private C2315ri bgr;

    /* JADX INFO: renamed from: bu */
    private InterfaceC2230fi f5501bu;

    /* JADX INFO: renamed from: di */
    private InterfaceC2241nr f5503di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2247vr f5504fi;

    /* JADX INFO: renamed from: ik */
    private AbstractViewOnTouchListenerC2318ik<View> f5505ik;
    private xha jbs;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2240mj f5506ka;

    /* JADX INFO: renamed from: lr */
    private JSONObject f5507lr;

    /* JADX INFO: renamed from: mj */
    private InterfaceC2283aw f5508mj;

    /* JADX INFO: renamed from: nr */
    private float f5509nr;

    /* JADX INFO: renamed from: qt */
    private String f5510qt;

    /* JADX INFO: renamed from: ri */
    private Context f5511ri;

    /* JADX INFO: renamed from: sf */
    private C2246sf f5512sf;
    private List<String> slm;
    private float tan;

    /* JADX INFO: renamed from: vr */
    private boolean f5513vr;
    private slm xha;

    /* JADX INFO: renamed from: co */
    private boolean f5502co = true;

    /* JADX INFO: renamed from: aw */
    private boolean f5500aw = false;

    public C2228co(Context context) {
        this.f5511ri = context;
    }

    /* JADX INFO: renamed from: lr */
    private void m7337lr(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        try {
            if (!abstractViewOnTouchListenerC2318ik.hcw() || abstractViewOnTouchListenerC2318ik.ory() == null || abstractViewOnTouchListenerC2318ik.ory().m7459di() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("i18n", abstractViewOnTouchListenerC2318ik.ory().m7459di());
            this.f5507lr.put("xNode", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m7338lr(JSONObject jSONObject, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        List<AbstractViewOnTouchListenerC2318ik<View>> listJbs;
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5507lr = jSONObject;
        abstractViewOnTouchListenerC2318ik.m7852lr(jSONObject);
        abstractViewOnTouchListenerC2318ik.m7868ri(this.f5512sf);
        C2320ri.ri riVarMo7551qt = abstractViewOnTouchListenerC2318ik.m7856oh() instanceof C2320ri ? abstractViewOnTouchListenerC2318ik.m7856oh().mo7551qt() : null;
        Iterator<String> itKeys = abstractViewOnTouchListenerC2318ik.m7881su().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strM7663ri = C2268lr.m7663ri(abstractViewOnTouchListenerC2318ik.m7881su().optString(next), jSONObject);
            abstractViewOnTouchListenerC2318ik.mo7553ri(next, strM7663ri);
            if (riVarMo7551qt != null) {
                riVarMo7551qt.mo7561ri(this.f5511ri, next, strM7663ri);
            }
        }
        if ((abstractViewOnTouchListenerC2318ik instanceof C2320ri) && (listJbs = ((C2320ri) abstractViewOnTouchListenerC2318ik).jbs()) != null && !listJbs.isEmpty()) {
            Iterator<AbstractViewOnTouchListenerC2318ik<View>> it = listJbs.iterator();
            while (it.hasNext()) {
                m7338lr(jSONObject, it.next());
            }
        }
        if (riVarMo7551qt != null) {
            abstractViewOnTouchListenerC2318ik.m7863ri(riVarMo7551qt.mo7560ri());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7339ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
        List<AbstractViewOnTouchListenerC2318ik<View>> listJbs;
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        JSONObject jSONObjectM7881su = abstractViewOnTouchListenerC2318ik.m7881su();
        Iterator<String> itKeys = jSONObjectM7881su.keys();
        C2320ri c2320riM7856oh = abstractViewOnTouchListenerC2318ik.m7856oh();
        C2320ri.ri riVarMo7551qt = c2320riM7856oh != null ? c2320riM7856oh.mo7551qt() : null;
        m7337lr(abstractViewOnTouchListenerC2318ik);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strM7663ri = C2268lr.m7663ri(jSONObjectM7881su.optString(next), this.f5507lr);
            abstractViewOnTouchListenerC2318ik.mo7553ri(next, strM7663ri);
            if (riVarMo7551qt != null) {
                riVarMo7551qt.mo7561ri(this.f5511ri, next, strM7663ri);
            }
        }
        abstractViewOnTouchListenerC2318ik.m7866ri(this.f5506ka);
        abstractViewOnTouchListenerC2318ik.m7870ri(this.f5504fi);
        abstractViewOnTouchListenerC2318ik.m7869ri(this.xha);
        jbs jbsVar = this.f5499ac;
        if (jbsVar != null) {
            abstractViewOnTouchListenerC2318ik.m7864ri(jbsVar);
        }
        InterfaceC2230fi interfaceC2230fi = this.f5501bu;
        if (interfaceC2230fi != null) {
            abstractViewOnTouchListenerC2318ik.m7865ri(interfaceC2230fi);
        }
        InterfaceC2283aw interfaceC2283aw = this.f5508mj;
        if (interfaceC2283aw != null) {
            abstractViewOnTouchListenerC2318ik.m7872ri(interfaceC2283aw);
        }
        if ((abstractViewOnTouchListenerC2318ik instanceof C2320ri) && (listJbs = ((C2320ri) abstractViewOnTouchListenerC2318ik).jbs()) != null && listJbs.size() > 0) {
            Iterator<AbstractViewOnTouchListenerC2318ik<View>> it = listJbs.iterator();
            while (it.hasNext()) {
                m7339ri(it.next());
            }
        }
        if (riVarMo7551qt != null) {
            abstractViewOnTouchListenerC2318ik.m7863ri(riVarMo7551qt.mo7560ri());
        }
        abstractViewOnTouchListenerC2318ik.mo7550lr();
    }

    /* JADX INFO: renamed from: lr */
    public AbstractViewOnTouchListenerC2318ik<View> m7340lr(xha.C2248ri c2248ri, AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
        List<xha.C2248ri> listM7443ik;
        C2320ri.ri riVarMo7551qt = null;
        if (!xha.m7440ka(c2248ri)) {
            return null;
        }
        String strM7461ik = c2248ri.m7461ik();
        C2233lr c2233lrM7359ri = C2232ka.m7359ri(strM7461ik);
        if (c2233lrM7359ri == null) {
            Log.d("UGTemplateEngine", "not found component ".concat(String.valueOf(strM7461ik)));
            this.f5513vr = true;
            if (this.slm == null) {
                this.slm = new ArrayList();
            }
            this.slm.add(strM7461ik);
            return null;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikMo7361ri = c2233lrM7359ri.mo7361ri(this.f5511ri);
        if (abstractViewOnTouchListenerC2318ikMo7361ri == null) {
            return null;
        }
        abstractViewOnTouchListenerC2318ikMo7361ri.jbs(C2268lr.m7663ri(c2248ri.m7466ri(), this.f5507lr));
        abstractViewOnTouchListenerC2318ikMo7361ri.m7859qt(strM7461ik);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7845ik(c2248ri.m7462ka());
        abstractViewOnTouchListenerC2318ikMo7361ri.m7871ri(c2248ri);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7868ri(this.f5512sf);
        if (abstractViewOnTouchListenerC2318ik instanceof C2320ri) {
            C2320ri c2320ri = (C2320ri) abstractViewOnTouchListenerC2318ik;
            abstractViewOnTouchListenerC2318ikMo7361ri.m7874ri(c2320ri);
            riVarMo7551qt = c2320ri.mo7551qt();
        }
        Iterator<String> itKeys = c2248ri.m7462ka().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strM7663ri = C2268lr.m7663ri(c2248ri.m7462ka().optString(next), this.f5507lr);
            abstractViewOnTouchListenerC2318ikMo7361ri.mo7553ri(next, strM7663ri);
            if (riVarMo7551qt != null) {
                riVarMo7551qt.mo7561ri(this.f5511ri, next, strM7663ri);
            }
        }
        if (abstractViewOnTouchListenerC2318ikMo7361ri instanceof C2320ri) {
            List<xha.C2248ri> listM7460fi = c2248ri.m7460fi();
            if (listM7460fi == null || listM7460fi.size() <= 0) {
                if (TextUtils.equals(abstractViewOnTouchListenerC2318ikMo7361ri.dzy(), "RecyclerLayout") && (listM7443ik = this.jbs.m7443ik()) != null && listM7443ik.size() > 0) {
                    Iterator<xha.C2248ri> it = listM7443ik.iterator();
                    while (it.hasNext()) {
                        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7340lr = m7340lr(it.next(), (AbstractViewOnTouchListenerC2318ik<View>) abstractViewOnTouchListenerC2318ikMo7361ri);
                        if (abstractViewOnTouchListenerC2318ikM7340lr != null && abstractViewOnTouchListenerC2318ikM7340lr.m7858qd()) {
                            ((C2320ri) abstractViewOnTouchListenerC2318ikMo7361ri).mo7661ri(abstractViewOnTouchListenerC2318ikM7340lr);
                        }
                    }
                }
                return abstractViewOnTouchListenerC2318ikMo7361ri;
            }
            if (TextUtils.equals(abstractViewOnTouchListenerC2318ikMo7361ri.dzy(), "Swiper") && listM7460fi.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            Iterator<xha.C2248ri> it2 = listM7460fi.iterator();
            while (it2.hasNext()) {
                AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7340lr2 = m7340lr(it2.next(), (AbstractViewOnTouchListenerC2318ik<View>) abstractViewOnTouchListenerC2318ikMo7361ri);
                if (abstractViewOnTouchListenerC2318ikM7340lr2 != null && abstractViewOnTouchListenerC2318ikM7340lr2.m7858qd()) {
                    ((C2320ri) abstractViewOnTouchListenerC2318ikMo7361ri).mo7661ri(abstractViewOnTouchListenerC2318ikM7340lr2);
                }
            }
        }
        if (riVarMo7551qt != null) {
            abstractViewOnTouchListenerC2318ikMo7361ri.m7863ri(riVarMo7551qt.mo7560ri());
        }
        this.f5505ik = abstractViewOnTouchListenerC2318ikMo7361ri;
        return abstractViewOnTouchListenerC2318ikMo7361ri;
    }

    /* JADX INFO: renamed from: lr */
    public List<String> m7341lr() {
        return this.slm;
    }

    /* JADX INFO: renamed from: lr */
    public void m7342lr(JSONObject jSONObject) {
        InterfaceC2241nr interfaceC2241nr = this.f5503di;
        if (interfaceC2241nr != null) {
            interfaceC2241nr.mo7384ik();
        }
        this.f5507lr = jSONObject;
        m7352ri(this.f5505ik, jSONObject);
        m7339ri(this.f5505ik);
        if (this.f5503di != null) {
            C2227bu c2227bu = new C2227bu();
            c2227bu.m7334ri(0);
            c2227bu.m7335ri(this.f5505ik);
            this.f5503di.mo7387ri(c2227bu);
        }
    }

    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik<View> m7343ri(xha.C2248ri c2248ri, AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
        C2233lr c2233lr;
        C2320ri.ri riVarMo7551qt;
        List<xha.C2248ri> listM7443ik;
        if (!xha.m7440ka(c2248ri)) {
            return null;
        }
        String strM7461ik = c2248ri.m7461ik();
        C2233lr c2233lrM7359ri = C2232ka.m7359ri(strM7461ik);
        if (c2233lrM7359ri == null) {
            this.f5513vr = true;
            if (this.slm == null) {
                c2233lr = c2233lrM7359ri;
                this.slm = new ArrayList();
            }
            c2233lr = c2233lrM7359ri;
            this.slm.add(strM7461ik);
            strM7461ik = "View";
            c2248ri.m7469ri("View");
            C2233lr c2233lrM7359ri2 = C2232ka.m7359ri("View");
            Log.d("UGTemplateEngine", "unknown component; use view widget");
            c2233lr = c2233lrM7359ri2;
            if (c2233lrM7359ri2 == null) {
                Log.d("UGTemplateEngine", "not found component ".concat("View"));
                return null;
            }
        }
        c2233lr = c2233lrM7359ri;
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ikMo7361ri = c2233lr.mo7361ri(this.f5511ri);
        if (abstractViewOnTouchListenerC2318ikMo7361ri == null) {
            return null;
        }
        JSONObject jSONObjectM7462ka = c2248ri.m7462ka();
        abstractViewOnTouchListenerC2318ikMo7361ri.jbs(C2268lr.m7663ri(c2248ri.m7466ri(), this.f5507lr));
        abstractViewOnTouchListenerC2318ikMo7361ri.m7859qt(strM7461ik);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7845ik(jSONObjectM7462ka);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7871ri(c2248ri);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7852lr(this.f5507lr);
        xha xhaVar = this.jbs;
        if (xhaVar == null) {
            abstractViewOnTouchListenerC2318ikMo7361ri.m7877ri(true);
        } else {
            abstractViewOnTouchListenerC2318ikMo7361ri.m7877ri(xhaVar.m7445ka());
        }
        abstractViewOnTouchListenerC2318ikMo7361ri.m7868ri(this.f5512sf);
        abstractViewOnTouchListenerC2318ikMo7361ri.m7873ri(this.bgr);
        Iterator<String> itKeys = jSONObjectM7462ka.keys();
        if (abstractViewOnTouchListenerC2318ik instanceof C2320ri) {
            C2320ri c2320ri = (C2320ri) abstractViewOnTouchListenerC2318ik;
            riVarMo7551qt = c2320ri.mo7551qt();
            abstractViewOnTouchListenerC2318ikMo7361ri.m7874ri(c2320ri);
        } else {
            riVarMo7551qt = null;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strM7663ri = C2268lr.m7663ri(jSONObjectM7462ka.optString(next), this.f5507lr);
            abstractViewOnTouchListenerC2318ikMo7361ri.mo7553ri(next, strM7663ri);
            if (this.f5499ac != null) {
                throw null;
            }
            if (riVarMo7551qt != null) {
                riVarMo7551qt.mo7561ri(this.f5511ri, next, strM7663ri);
            }
        }
        if (riVarMo7551qt != null) {
            abstractViewOnTouchListenerC2318ikMo7361ri.m7863ri(riVarMo7551qt.mo7560ri());
        }
        if (abstractViewOnTouchListenerC2318ikMo7361ri instanceof C2320ri) {
            List<xha.C2248ri> listM7460fi = c2248ri.m7460fi();
            if (listM7460fi == null || listM7460fi.size() <= 0) {
                if (TextUtils.equals(abstractViewOnTouchListenerC2318ikMo7361ri.dzy(), "RecyclerLayout") && (listM7443ik = this.jbs.m7443ik()) != null && listM7443ik.size() > 0) {
                    Iterator<xha.C2248ri> it = listM7443ik.iterator();
                    while (it.hasNext()) {
                        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7343ri = m7343ri(it.next(), (AbstractViewOnTouchListenerC2318ik<View>) abstractViewOnTouchListenerC2318ikMo7361ri);
                        if (abstractViewOnTouchListenerC2318ikM7343ri != null && abstractViewOnTouchListenerC2318ikM7343ri.m7858qd()) {
                            ((C2320ri) abstractViewOnTouchListenerC2318ikMo7361ri).mo7661ri(abstractViewOnTouchListenerC2318ikM7343ri);
                        }
                    }
                }
                return abstractViewOnTouchListenerC2318ikMo7361ri;
            }
            if (TextUtils.equals(abstractViewOnTouchListenerC2318ikMo7361ri.dzy(), "Swiper") && listM7460fi.size() != 1) {
                Log.e("UGTemplateEngine", "Swiper must be only one widget");
            }
            try {
                Collections.sort(listM7460fi, new Comparator<xha.C2248ri>() { // from class: com.bytedance.adsdk.ugeno.core.co.1
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                    public int compare(xha.C2248ri c2248ri2, xha.C2248ri c2248ri3) {
                        return c2248ri2.m7462ka().optInt(C12434q2.f31749u, 0) - c2248ri3.m7462ka().optInt(C12434q2.f31749u, 0);
                    }
                });
            } catch (Throwable unused) {
            }
            Iterator<xha.C2248ri> it2 = listM7460fi.iterator();
            while (it2.hasNext()) {
                AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7343ri2 = m7343ri(it2.next(), (AbstractViewOnTouchListenerC2318ik<View>) abstractViewOnTouchListenerC2318ikMo7361ri);
                if (abstractViewOnTouchListenerC2318ikM7343ri2 != null && !abstractViewOnTouchListenerC2318ikM7343ri2.siy()) {
                    ((C2320ri) abstractViewOnTouchListenerC2318ikMo7361ri).mo7822ri(abstractViewOnTouchListenerC2318ikM7343ri2, abstractViewOnTouchListenerC2318ikM7343ri2.m7837dw());
                }
            }
        }
        this.f5505ik = abstractViewOnTouchListenerC2318ikMo7361ri;
        return abstractViewOnTouchListenerC2318ikMo7361ri;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik<View> m7344ri(xha.C2248ri c2248ri, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f5507lr = jSONObject;
        InterfaceC2241nr interfaceC2241nr = this.f5503di;
        if (interfaceC2241nr != null) {
            interfaceC2241nr.mo7386ri();
        }
        this.bgr = new C2315ri();
        if (this.f5504fi instanceof AbstractC2244lr) {
            throw null;
        }
        this.f5505ik = m7343ri(c2248ri, (AbstractViewOnTouchListenerC2318ik<View>) null);
        InterfaceC2241nr interfaceC2241nr2 = this.f5503di;
        if (interfaceC2241nr2 != null) {
            interfaceC2241nr2.mo7385lr();
            this.f5505ik.m7867ri(this.f5503di);
        }
        m7339ri(this.f5505ik);
        return this.f5505ik;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik<View> m7345ri(JSONObject jSONObject) {
        InterfaceC2241nr interfaceC2241nr = this.f5503di;
        if (interfaceC2241nr != null) {
            interfaceC2241nr.mo7386ri();
        }
        xha xhaVar = new xha(jSONObject, this.f5507lr);
        this.jbs = xhaVar;
        if (this.f5504fi instanceof AbstractC2244lr) {
            xhaVar.m7446lr();
            throw null;
        }
        this.f5505ik = m7340lr(xhaVar.m7448ri(), (AbstractViewOnTouchListenerC2318ik<View>) null);
        InterfaceC2241nr interfaceC2241nr2 = this.f5503di;
        if (interfaceC2241nr2 != null) {
            interfaceC2241nr2.mo7385lr();
            this.f5505ik.m7867ri(this.f5503di);
        }
        return this.f5505ik;
    }

    /* JADX INFO: renamed from: ri */
    public AbstractViewOnTouchListenerC2318ik<View> m7346ri(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f5507lr = jSONObject2;
        InterfaceC2241nr interfaceC2241nr = this.f5503di;
        if (interfaceC2241nr != null) {
            interfaceC2241nr.mo7386ri();
        }
        xha xhaVar = new xha(jSONObject, jSONObject2, jSONObject3);
        this.jbs = xhaVar;
        xhaVar.m7449ri(this.f5509nr, this.tan);
        this.bgr = new C2315ri();
        if (this.f5504fi instanceof AbstractC2244lr) {
            this.jbs.m7446lr();
            throw null;
        }
        this.f5505ik = m7343ri(this.jbs.m7448ri(), (AbstractViewOnTouchListenerC2318ik<View>) null);
        if (this.f5499ac != null) {
            throw null;
        }
        InterfaceC2241nr interfaceC2241nr2 = this.f5503di;
        if (interfaceC2241nr2 != null) {
            interfaceC2241nr2.mo7385lr();
            this.f5505ik.m7867ri(this.f5503di);
            this.f5503di.mo7384ik();
        }
        m7339ri(this.f5505ik);
        if (this.f5503di != null) {
            C2227bu c2227bu = new C2227bu();
            c2227bu.m7334ri(0);
            c2227bu.m7335ri(this.f5505ik);
            this.f5503di.mo7387ri(c2227bu);
        }
        return this.f5505ik;
    }

    /* JADX INFO: renamed from: ri */
    public void m7347ri(InterfaceC2230fi interfaceC2230fi) {
        this.f5501bu = interfaceC2230fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m7348ri(slm slmVar) {
        this.xha = slmVar;
    }

    /* JADX INFO: renamed from: ri */
    public void m7349ri(InterfaceC2247vr interfaceC2247vr) {
        InterfaceC2245ri interfaceC2245riM7538fi = C2260fi.m7537ri().m7538fi();
        if (interfaceC2245riM7538fi == null) {
            this.f5504fi = interfaceC2247vr;
        } else {
            if (interfaceC2245riM7538fi.m7428ri(interfaceC2247vr) != null) {
                throw null;
            }
            this.f5504fi = interfaceC2247vr;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7350ri(InterfaceC2283aw interfaceC2283aw) {
        this.f5508mj = interfaceC2283aw;
    }

    /* JADX INFO: renamed from: ri */
    public void m7351ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, Object... objArr) {
        List<AbstractViewOnTouchListenerC2318ik<View>> listJbs;
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        abstractViewOnTouchListenerC2318ik.m7876ri(str, objArr);
        if (!(abstractViewOnTouchListenerC2318ik instanceof C2320ri) || (listJbs = ((C2320ri) abstractViewOnTouchListenerC2318ik).jbs()) == null || listJbs.isEmpty()) {
            return;
        }
        Iterator<AbstractViewOnTouchListenerC2318ik<View>> it = listJbs.iterator();
        while (it.hasNext()) {
            m7351ri(it.next(), str, objArr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7352ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        if (!(abstractViewOnTouchListenerC2318ik instanceof C2320ri)) {
            abstractViewOnTouchListenerC2318ik.mo7662ri(jSONObject);
            return;
        }
        abstractViewOnTouchListenerC2318ik.mo7662ri(jSONObject);
        List<AbstractViewOnTouchListenerC2318ik<View>> listJbs = ((C2320ri) abstractViewOnTouchListenerC2318ik).jbs();
        if (listJbs == null || listJbs.size() <= 0) {
            return;
        }
        Iterator<AbstractViewOnTouchListenerC2318ik<View>> it = listJbs.iterator();
        while (it.hasNext()) {
            m7352ri(it.next(), jSONObject);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7353ri(String str, C2246sf c2246sf) {
        this.f5512sf = c2246sf;
        this.f5510qt = str;
        if (c2246sf != null) {
            this.f5507lr = c2246sf.m7431ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7354ri(JSONObject jSONObject, AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        m7338lr(jSONObject, abstractViewOnTouchListenerC2318ik);
        m7339ri((AbstractViewOnTouchListenerC2318ik<View>) abstractViewOnTouchListenerC2318ik);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7355ri() {
        return this.f5513vr;
    }
}
