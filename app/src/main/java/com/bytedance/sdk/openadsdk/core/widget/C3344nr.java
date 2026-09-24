package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.InterfaceC2488ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3022ri;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.igq;
import com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.C3151ka;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.C3152lr;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3150ik;
import com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3153ri;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p219ik.C3221ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.p175ay.p176lr.C2889fi;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.nr */
/* JADX INFO: loaded from: classes3.dex */
public class C3344nr implements C3151ka.ri, InterfaceC3153ri, igq, InterfaceC3247vr {

    /* JADX INFO: renamed from: di */
    private dzy f11762di;

    /* JADX INFO: renamed from: fi */
    private final C3221ri f11763fi;

    /* JADX INFO: renamed from: ik */
    private final C3152lr f11764ik;

    /* JADX INFO: renamed from: ka */
    private final C3192ik f11765ka;

    /* JADX INFO: renamed from: lr */
    private final ri f11766lr;

    /* JADX INFO: renamed from: mj */
    private int f11767mj;

    /* JADX INFO: renamed from: qt */
    private boolean f11768qt;

    /* JADX INFO: renamed from: ri */
    private final C3022ri f11769ri;

    /* JADX INFO: renamed from: sf */
    private boolean f11770sf;
    private int xha = 0;
    private int jbs = 1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.nr$ri */
    public interface ri {
        /* JADX INFO: renamed from: di */
        void mo11026di();

        /* JADX INFO: renamed from: fi */
        void mo11027fi();

        /* JADX INFO: renamed from: ik */
        void mo11028ik();

        /* JADX INFO: renamed from: ka */
        int mo11029ka();

        /* JADX INFO: renamed from: lr */
        void mo11030lr();

        /* JADX INFO: renamed from: ri */
        void mo11031ri();
    }

    public C3344nr(C3022ri c3022ri, ri riVar) {
        this.f11769ri = c3022ri;
        this.f11766lr = riVar;
        this.f11765ka = new C3192ik(c3022ri.f9384ig) { // from class: com.bytedance.sdk.openadsdk.core.widget.nr.1
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                C3344nr.this.m15025ri(z);
            }
        };
        C3152lr c3152lr = new C3152lr(c3022ri.srn, c3022ri.f9389lr, true);
        this.f11764ik = c3152lr;
        c3152lr.m13163ri((InterfaceC3247vr) this);
        c3152lr.m13162ri((InterfaceC3153ri) this);
        InterfaceC3150ik interfaceC3150ikM13160ri = c3152lr.m13160ri();
        if (interfaceC3150ikM13160ri instanceof C3151ka) {
            C3151ka c3151ka = (C3151ka) interfaceC3150ikM13160ri;
            c3151ka.m13155ri((C3151ka.ri) this);
            dzy dzyVarM13154fi = c3151ka.m13154fi();
            this.f11762di = dzyVarM13154fi;
            if (dzyVarM13154fi != null) {
                dzyVarM13154fi.m13454ri((igq) this);
                this.f11762di.m13423lr(c3022ri.f9389lr.m14394fi());
            }
        }
        C3221ri c3221ri = new C3221ri(c3022ri.srn, c3022ri.f9389lr, c3022ri.f9389lr.m14394fi(), C3571ig.m16454lr(c3022ri.f9389lr));
        this.f11763fi = c3221ri;
        c3221ri.m13534ri(C3371ka.m15240ri(C3299nr.m14642ri(), c3022ri.f9389lr.m14394fi()));
        HashMap map = new HashMap();
        if (C3279dw.m14092lr(c3022ri.f9389lr)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        c3221ri.m13536ri(map);
    }

    /* JADX INFO: renamed from: co */
    private void m15021co() {
        this.f11765ka.setVisibility(8);
    }

    /* JADX INFO: renamed from: lr */
    private boolean m15022lr(Activity activity) {
        if (!this.f11765ka.isAttachedToWindow()) {
            Window window = activity.getWindow();
            if (window == null) {
                this.f11770sf = false;
                return false;
            }
            this.f11770sf = true;
            window.addContentView(this.f11765ka, new WindowManager.LayoutParams(-1, -1));
        }
        this.f11765ka.setVisibility(0);
        return true;
    }

    /* JADX INFO: renamed from: qt */
    private void m15023qt() {
        this.xha++;
        ri riVar = this.f11766lr;
        if (riVar != null) {
            riVar.mo11028ik();
        }
        m15025ri(true);
        dzy dzyVar = this.f11762di;
        if (dzyVar != null) {
            dzyVar.mo13455ri("popupDidShow", (JSONObject) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            ri riVar2 = this.f11766lr;
            if (riVar2 != null) {
                jSONObject2.put("click_countdown_remaining", Math.max(riVar2.mo11029ka(), 0));
            }
            jSONObject2.put("popup_sequence", this.xha);
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException e) {
            C2707ac.m10196ik("UserIdleAskDialog", e.getMessage());
        }
        C3414ik.m15522lr(this.f11769ri.f9389lr, this.f11769ri.f9389lr.m14394fi(), "show_popup", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m15025ri(boolean z) {
        InterfaceC3150ik interfaceC3150ikM13160ri = this.f11764ik.m13160ri();
        if (interfaceC3150ikM13160ri instanceof C3151ka) {
            ((C3151ka) interfaceC3150ikM13160ri).m13156ri(z);
        }
    }

    /* JADX INFO: renamed from: sf */
    private boolean m15026sf() {
        return this.f11765ka.isAttachedToWindow() && this.f11765ka.getVisibility() == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: di */
    public void mo11539di() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: fi */
    public int mo11540fi() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ik */
    public long mo11541ik() {
        return 0L;
    }

    public boolean jbs() {
        if (this.f11768qt || !m15026sf()) {
            return false;
        }
        mo11938n_();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ka */
    public long mo11543ka() {
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11544lr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public void mo11880lr(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: lr */
    public boolean mo11881lr(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: m_ */
    public void mo11937m_() {
    }

    /* JADX INFO: renamed from: mj */
    public void m15027mj() {
        this.f11768qt = true;
        ViewParent parent = this.f11765ka.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11765ka);
        }
        C3152lr c3152lr = this.f11764ik;
        if (c3152lr != null) {
            c3152lr.m13158ka();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: n_ */
    public void mo11938n_() {
        if (this.f11768qt || !m15026sf()) {
            return;
        }
        m15021co();
        ri riVar = this.f11766lr;
        if (riVar != null) {
            riVar.mo11030lr();
        }
        m15025ri(false);
        dzy dzyVar = this.f11762di;
        if (dzyVar != null) {
            dzyVar.mo13455ri("popupDidDismiss", (JSONObject) null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: o_ */
    public int mo11939o_() {
        ri riVar = this.f11766lr;
        if (riVar != null) {
            return riVar.mo11029ka();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: p_ */
    public void mo11940p_() {
        ri riVar = this.f11766lr;
        if (riVar != null) {
            riVar.mo11027fi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: q_ */
    public void mo11941q_() {
        ri riVar = this.f11766lr;
        if (riVar != null) {
            riVar.mo11026di();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.igq
    /* JADX INFO: renamed from: r_ */
    public void mo11942r_() {
        this.jbs = 2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11545ri() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11546ri(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11882ri(int i, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11547ri(int i, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.InterfaceC3153ri
    /* JADX INFO: renamed from: ri */
    public void mo13165ri(View view, int i, InterfaceC2488ik interfaceC2488ik) {
        if (i == 2) {
            com.bytedance.sdk.openadsdk.core.model.slm slmVar = (com.bytedance.sdk.openadsdk.core.model.slm) interfaceC2488ik;
            String str = slmVar.xha;
            if (slmVar.f11346co > 0) {
                C3214ig.m13499ri(true);
            }
            this.f11763fi.m13535ri(str);
            this.f11763fi.mo10681ri(view, slmVar.f11354ri, slmVar.f11351lr, slmVar.f11349ik, slmVar.f11350ka, slmVar.f11353qt, slmVar.f11355sf);
            this.f11769ri.f9397qd.gcp();
            C3214ig.m13499ri(false);
            C2889fi.m11114ri(this.f11769ri.f9389lr, 9);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15028ri(ViewGroup viewGroup) {
        View viewM13157ik = this.f11764ik.m13157ik();
        if (viewM13157ik == null) {
            return;
        }
        viewM13157ik.setVisibility(4);
        viewGroup.addView(viewM13157ik, new ViewGroup.LayoutParams(-1, -1));
        this.f11764ik.m13159lr();
        this.f11767mj = 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11883ri(String str, JSONObject jSONObject) {
        ri riVar;
        if (!"skipToNextAd".equals(str) || (riVar = this.f11766lr) == null) {
            return;
        }
        riVar.mo11031ri();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public void mo11884ri(boolean z, String str) {
    }

    /* JADX INFO: renamed from: ri */
    public boolean m15029ri(Activity activity) {
        if (!this.f11768qt && activity != null && !activity.isFinishing()) {
            if (this.f11767mj == 3 && this.jbs == 2) {
                if (this.f11765ka.isAttachedToWindow() && this.f11765ka.getVisibility() == 0) {
                    return true;
                }
                if (m15022lr(activity)) {
                    m15023qt();
                    return true;
                }
            }
            try {
                HashMap map = new HashMap();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_status", this.f11767mj);
                jSONObject.put("js_finish", this.jbs);
                jSONObject.put("has_window", this.f11770sf ? 1 : 0);
                map.put("pag_json_data", jSONObject.toString());
                C3414ik.m15565ri("show_popup_fail", this.f11769ri.f9389lr, this.f11769ri.f9389lr.m14394fi(), map);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jbs.InterfaceC3247vr
    /* JADX INFO: renamed from: ri */
    public boolean mo11551ri(JSONObject jSONObject) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p206ik.C3151ka.ri
    public void xha() {
        if (this.f11767mj != 1) {
            return;
        }
        this.f11767mj = 3;
        View viewM13157ik = this.f11764ik.m13157ik();
        if (viewM13157ik != null) {
            ViewGroup viewGroup = (ViewGroup) viewM13157ik.getParent();
            if (viewGroup != null) {
                if (viewGroup == this.f11765ka) {
                    return;
                } else {
                    viewGroup.removeView(viewM13157ik);
                }
            }
            if (this.f11765ka != null) {
                viewM13157ik.setVisibility(0);
                this.f11765ka.addView(viewM13157ik, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }
}
