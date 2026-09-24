package com.bytedance.adsdk.ugeno.p101ka;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.InterfaceC2230fi;
import com.bytedance.adsdk.ugeno.core.p088lr.C2239ri;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.AbstractC2296ik;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2293co;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2295fi;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2297ka;
import com.bytedance.adsdk.ugeno.p101ka.p103ka.C2302sf;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements InterfaceC2316sf {

    /* JADX INFO: renamed from: di */
    private InterfaceC2283aw f5790di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2230fi f5791fi;

    /* JADX INFO: renamed from: ik */
    private Map<String, List<AbstractC2296ik>> f5792ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private AbstractViewOnTouchListenerC2318ik f5793ka;

    /* JADX INFO: renamed from: lr */
    private Map<String, List<AbstractC2296ik>> f5794lr;

    /* JADX INFO: renamed from: mj */
    private boolean f5795mj;

    /* JADX INFO: renamed from: qt */
    private boolean f5796qt;

    /* JADX INFO: renamed from: ri */
    private C2291ri f5797ri;
    private C2239ri xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.jbs$ri */
    public static class C2291ri {

        /* JADX INFO: renamed from: ik */
        public Map<String, AbstractC2296ik> f5798ik;

        /* JADX INFO: renamed from: lr */
        public Map<String, List<AbstractC2296ik>> f5799lr;

        /* JADX INFO: renamed from: ri */
        public Map<String, List<AbstractC2296ik>> f5800ri;

        public C2291ri(Map<String, List<AbstractC2296ik>> map, Map<String, AbstractC2296ik> map2, Map<String, List<AbstractC2296ik>> map3) {
            this.f5800ri = map;
            this.f5798ik = map2;
            this.f5799lr = map3;
        }
    }

    public jbs(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, C2291ri c2291ri) {
        this.f5793ka = abstractViewOnTouchListenerC2318ik;
        this.f5797ri = c2291ri;
        if (c2291ri != null) {
            this.f5794lr = c2291ri.f5800ri;
            this.f5792ik = c2291ri.f5799lr;
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik2 = this.f5793ka;
        if (abstractViewOnTouchListenerC2318ik2 != null && abstractViewOnTouchListenerC2318ik2.whw() && this.xha == null) {
            this.xha = new C2239ri();
        }
    }

    /* JADX INFO: renamed from: ri */
    public static jbs m7760ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str) {
        AbstractC2296ik abstractC2296ikM7789ri;
        if (abstractViewOnTouchListenerC2318ik != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                C2291ri c2291ri = new C2291ri(new HashMap(), new HashMap(), new HashMap());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && (abstractC2296ikM7789ri = AbstractC2296ik.ri.m7789ri(abstractViewOnTouchListenerC2318ik.m7879sf().getContext(), abstractViewOnTouchListenerC2318ik, jSONObjectOptJSONObject, abstractViewOnTouchListenerC2318ik.m7834co())) != null) {
                        if (c2291ri.f5800ri.containsKey(abstractC2296ikM7789ri.m7785ka())) {
                            List<AbstractC2296ik> list = c2291ri.f5800ri.get(abstractC2296ikM7789ri.m7785ka());
                            if (list == null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(abstractC2296ikM7789ri);
                                c2291ri.f5800ri.put(abstractC2296ikM7789ri.m7785ka(), arrayList);
                                c2291ri.f5799lr.put(abstractC2296ikM7789ri.m7782di(), arrayList);
                            } else {
                                list.add(abstractC2296ikM7789ri);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(abstractC2296ikM7789ri);
                            c2291ri.f5800ri.put(abstractC2296ikM7789ri.m7785ka(), arrayList2);
                            c2291ri.f5799lr.put(abstractC2296ikM7789ri.m7782di(), arrayList2);
                        }
                        c2291ri.f5798ik.put(abstractC2296ikM7789ri.m7783fi(), abstractC2296ikM7789ri);
                    }
                }
                return new jbs(abstractViewOnTouchListenerC2318ik, c2291ri);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private void m7761ri(String str, List<C2285di.ri> list) {
        AbstractC2308ri abstractC2308riM7802ri;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C2285di.ri riVar : list) {
            if (riVar != null && (abstractC2308riM7802ri = AbstractC2308ri.ri.m7802ri(this.f5793ka, str, riVar)) != null) {
                abstractC2308riM7802ri.mo7759ri();
                abstractC2308riM7802ri.mo7798lr();
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m7762fi() {
        List<AbstractC2296ik> listM7767ri = m7767ri("timer");
        if (listM7767ri == null || listM7767ri.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7767ri) {
            if (abstractC2296ik != null) {
                abstractC2296ik.m7787ri(this);
                abstractC2296ik.mo7777ri(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m7763ik() {
        List<AbstractC2296ik> value;
        C2291ri c2291ri = this.f5797ri;
        if (c2291ri == null) {
            return;
        }
        for (Map.Entry<String, List<AbstractC2296ik>> entry : c2291ri.f5800ri.entrySet()) {
            if (entry != null && (value = entry.getValue()) != null && !value.isEmpty()) {
                for (AbstractC2296ik abstractC2296ik : value) {
                    if (abstractC2296ik instanceof C2297ka) {
                        abstractC2296ik.m7787ri(this);
                        abstractC2296ik.mo7777ri(new Object[0]);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m7764ka() {
        List<AbstractC2296ik> listM7767ri = m7767ri("animateState");
        if (listM7767ri == null || listM7767ri.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7767ri) {
            if (abstractC2296ik != null) {
                abstractC2296ik.m7787ri(this);
                abstractC2296ik.mo7777ri(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public List<AbstractC2296ik> m7765lr(String str) {
        Map<String, List<AbstractC2296ik>> map;
        Map<String, List<AbstractC2296ik>> map2 = this.f5792ik;
        if (map2 == null || map2.isEmpty() || TextUtils.isEmpty(str) || (map = this.f5792ik) == null || !map.containsKey(str)) {
            return null;
        }
        return this.f5792ik.get(str);
    }

    /* JADX INFO: renamed from: lr */
    public void m7766lr() {
        List<AbstractC2296ik> listM7767ri = m7767ri("twist");
        if (listM7767ri == null || listM7767ri.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7767ri) {
            if (abstractC2296ik != null) {
                abstractC2296ik.m7787ri(this);
                abstractC2296ik.mo7777ri(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public List<AbstractC2296ik> m7767ri(String str) {
        Map<String, List<AbstractC2296ik>> map;
        Map<String, List<AbstractC2296ik>> map2 = this.f5794lr;
        if (((map2 == null || map2.isEmpty()) && ((map = this.f5792ik) == null || map.isEmpty())) || TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, List<AbstractC2296ik>> map3 = this.f5794lr;
        if (map3 != null && map3.containsKey(str)) {
            return this.f5794lr.get(str);
        }
        Map<String, List<AbstractC2296ik>> map4 = this.f5792ik;
        if (map4 != null && map4.containsKey(str)) {
            return this.f5792ik.get(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m7768ri() {
        List<AbstractC2296ik> listM7767ri = m7767ri("shake");
        if (listM7767ri == null || listM7767ri.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7767ri) {
            if (abstractC2296ik != null) {
                abstractC2296ik.m7787ri(this);
                abstractC2296ik.mo7777ri(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7769ri(InterfaceC2230fi interfaceC2230fi) {
        this.f5791fi = interfaceC2230fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m7770ri(InterfaceC2283aw interfaceC2283aw) {
        this.f5790di = interfaceC2283aw;
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2316sf
    /* JADX INFO: renamed from: ri */
    public void mo7771ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, List<C2285di.ri> list) {
        InterfaceC2230fi interfaceC2230fi = this.f5791fi;
        if (interfaceC2230fi != null) {
            interfaceC2230fi.mo7357ri(abstractViewOnTouchListenerC2318ik, str, list);
        }
        m7761ri(str, list);
    }

    /* JADX INFO: renamed from: ri */
    public void m7772ri(String str, Object... objArr) {
        List<AbstractC2296ik> listM7765lr = m7765lr(str);
        if (listM7765lr == null || listM7765lr.isEmpty()) {
            return;
        }
        for (AbstractC2296ik abstractC2296ik : listM7765lr) {
            abstractC2296ik.m7787ri(this);
            abstractC2296ik.mo7777ri(objArr);
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7773ri(MotionEvent motionEvent) {
        List<AbstractC2296ik> listM7767ri = m7767ri("touchStart");
        if (listM7767ri != null && !listM7767ri.isEmpty()) {
            for (AbstractC2296ik abstractC2296ik : listM7767ri) {
                if (abstractC2296ik instanceof C2293co) {
                    abstractC2296ik.m7787ri(this);
                    abstractC2296ik.mo7777ri(motionEvent);
                }
            }
        }
        List<AbstractC2296ik> listM7767ri2 = m7767ri("touchEnd");
        List<AbstractC2296ik> listM7767ri3 = m7767ri("tap");
        List<AbstractC2296ik> listM7767ri4 = m7767ri("slide");
        if (listM7767ri != null && !listM7767ri.isEmpty()) {
            for (AbstractC2296ik abstractC2296ik2 : listM7767ri2) {
                if (abstractC2296ik2 instanceof C2302sf) {
                    abstractC2296ik2.m7787ri(this);
                    this.f5796qt = abstractC2296ik2.mo7777ri(motionEvent);
                }
            }
        }
        if ((listM7767ri3 == null || listM7767ri3.isEmpty()) && (listM7767ri4 == null || listM7767ri4.isEmpty())) {
            return this.f5796qt;
        }
        if (this.f5796qt && motionEvent.getAction() == 1) {
            return true;
        }
        C2239ri c2239ri = this.xha;
        if (c2239ri != null) {
            if (c2239ri.m7383ri(motionEvent)) {
                Log.d("GesThrough_UGEveFacade", "mockEvent，skip");
                return false;
            }
            this.xha.m7382ri(this.f5793ka, motionEvent);
        }
        if (listM7767ri3 != null && !listM7767ri3.isEmpty()) {
            for (AbstractC2296ik abstractC2296ik3 : listM7767ri3) {
                if (abstractC2296ik3 instanceof com.bytedance.adsdk.ugeno.p101ka.p103ka.jbs) {
                    ((com.bytedance.adsdk.ugeno.p101ka.p103ka.jbs) abstractC2296ik3).m7790ri(this.f5790di);
                    abstractC2296ik3.m7787ri(this);
                    this.f5795mj = abstractC2296ik3.mo7777ri(motionEvent);
                }
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && this.f5795mj) {
            return true;
        }
        if (listM7767ri4 != null && !listM7767ri4.isEmpty()) {
            for (AbstractC2296ik abstractC2296ik4 : listM7767ri4) {
                if (abstractC2296ik4 instanceof C2295fi) {
                    abstractC2296ik4.m7787ri(this);
                    this.jbs = abstractC2296ik4.mo7777ri(motionEvent);
                }
            }
        }
        if ((action == 1 || action == 3) && !this.f5795mj && !this.jbs && this.xha != null) {
            Log.d("GesThrough_UGEveFacade", "Non-tap event & not satisfy slide requirements, need gesture through");
            this.xha.m7381ri(this.f5793ka);
        }
        return this.f5795mj || this.jbs;
    }
}
