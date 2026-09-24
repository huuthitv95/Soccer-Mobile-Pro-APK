package com.bytedance.sdk.openadsdk.core.p219ik;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3120di;
import com.bytedance.sdk.openadsdk.core.jbs.C3222ac;
import com.bytedance.sdk.openadsdk.core.jbs.C3235mj;
import com.bytedance.sdk.openadsdk.core.model.C3273ac;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.jbs;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3092ik;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p190aw.C3098lr;
import com.bytedance.sdk.openadsdk.core.p190aw.C3104ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3372lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3221ri extends C3220lr {
    private boolean dzy;

    /* JADX INFO: renamed from: ik */
    private boolean f10706ik;

    /* JADX INFO: renamed from: lr */
    private boolean f10707lr;

    /* JADX INFO: renamed from: pv */
    private int f10708pv;

    /* JADX INFO: renamed from: ri */
    private boolean f10709ri;

    /* JADX INFO: renamed from: xd */
    private WeakReference<ri> f10710xd;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ik.ri$ri */
    public interface ri {
        long getVideoProgress();
    }

    public C3221ri(Context context, wjv wjvVar, String str, int i) {
        super(context, wjvVar, str, i);
        this.f10709ri = true;
        this.f10707lr = false;
        this.f10706ik = false;
        this.dzy = false;
    }

    /* JADX INFO: renamed from: ik */
    private boolean m13540ik(View view) {
        if (view == null) {
            return false;
        }
        if ((view instanceof C3120di) || view.getId() == slm.adz || view.getId() == slm.f13283kt || view.getId() == slm.feb || view.getId() == slm.zyn || view.getId() == slm.tnn || view.getId() == 520093726 || view.getId() == slm.bzf) {
            return true;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                if (m13540ik(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean jbs() {
        wjv wjvVar = this.f10695di;
        if (wjvVar == null || m13542mj()) {
            return false;
        }
        if (wjvVar.m14552vz() != 5 && wjvVar.m14552vz() != 15) {
            return false;
        }
        if (this.f10708pv == 0) {
            this.f10708pv = wjvVar.lji();
        }
        mo12868lr();
        m13548ri();
        mo12867ik();
        if (this.f10708pv == 5 && xha() && m13548ri() && !mo12868lr() && !mo12867ik()) {
            return false;
        }
        int i = this.f10708pv;
        return i == 1 || i == 2 || i == 5;
    }

    /* JADX INFO: renamed from: lr */
    private String m13541lr(String str) {
        str.hashCode();
        switch (str) {
            case "banner_ad":
                return "banner_call";
            case "open_ad":
                return "open_ad";
            case "embeded_ad":
                return "feed_call";
            case "interaction":
                return "interaction_call";
            case "slide_banner_ad":
                return "banner_call";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: mj */
    private boolean m13542mj() {
        return this instanceof C3235mj;
    }

    private boolean xha() {
        wjv wjvVar = this.f10695di;
        return wjv.m14332fi(wjvVar) && wjvVar.m14540ud() == 1;
    }

    /* JADX INFO: renamed from: ik */
    public void m13543ik(boolean z) {
        this.f10706ik = z;
    }

    /* JADX INFO: renamed from: ik */
    public boolean mo12867ik() {
        return false;
    }

    /* JADX INFO: renamed from: ka */
    public void m13544ka(boolean z) {
        this.dzy = z;
    }

    /* JADX INFO: renamed from: lr */
    public void m13545lr(boolean z) {
        this.f10707lr = z;
    }

    /* JADX INFO: renamed from: lr */
    public boolean mo12868lr() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0221  */
    /* JADX WARN: Code duplicated, block: B:166:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0304  */
    /* JADX WARN: Code duplicated, block: B:174:0x0308  */
    /* JADX WARN: Code duplicated, block: B:176:0x0310  */
    /* JADX WARN: Code duplicated, block: B:177:0x0313  */
    /* JADX WARN: Code duplicated, block: B:183:0x0323  */
    /* JADX WARN: Code duplicated, block: B:185:0x032b  */
    /* JADX WARN: Code duplicated, block: B:186:0x032e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0337  */
    /* JADX WARN: Code duplicated, block: B:191:0x0341  */
    /* JADX WARN: Code duplicated, block: B:201:0x0361  */
    /* JADX WARN: Code duplicated, block: B:203:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:0x036b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0379  */
    /* JADX WARN: Code duplicated, block: B:213:0x0399  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:216:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    @Override // com.bytedance.sdk.openadsdk.core.p219ik.C3220lr, com.bytedance.sdk.openadsdk.core.p219ik.AbstractViewOnClickListenerC3218ik
    /* JADX INFO: renamed from: ri */
    public void mo10681ri(View view, float f, float f2, float f3, float f4, SparseArray<AbstractViewOnClickListenerC3218ik.ri> sparseArray, boolean z) {
        String str;
        C3097ka c3097kaM14188ri;
        boolean z2;
        JSONObject jSONObject;
        int i;
        JSONObject jSONObject2;
        int i2;
        View view2;
        Object tag;
        Activity activityM10240ri;
        Context context;
        boolean z3;
        int i3;
        String strSmj;
        int i4;
        if (!m13537ri(view, 2, f, f2, f3, f4, sparseArray, z)) {
            wjv wjvVar = this.f10695di;
            wjvVar.m14549vr(true);
            wjvVar.m14483qx();
            if (!wjvVar.m14356ac()) {
                wjvVar.m14432ka(true);
            }
            if (wjv.m14332fi(wjvVar)) {
                C3414ik.m15521lr(wjvVar, this.xha, wjvVar.m14408hp());
            }
            if (this.f10692aw != null) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                this.slm.put("duration", Long.valueOf(this.f10692aw.mo6373di()));
            }
            int iM14427ju = wjvVar.m14427ju();
            wjvVar.m14531ta(0);
            if (this.f10705vr != null) {
                this.f10705vr.mo15238ri(iM14427ju > 0 ? iM14427ju : 0);
            }
            if (this.slm != null) {
                this.slm.remove("dsp_click_type");
                this.slm.remove("click_probability_jump");
                this.slm.remove("auto_click");
            }
            boolean zM14576zz = wjvVar.m14576zz();
            if (iM14427ju > 0) {
                if (this.slm == null) {
                    this.slm = new HashMap();
                }
                if (zM14576zz && iM14427ju < 11) {
                    this.slm.put("dsp_click_type", Integer.valueOf(iM14427ju));
                }
                if (iM14427ju >= 11 && wjvVar.m14565yv() == 0) {
                    this.slm.put("click_probability_jump", Integer.valueOf(jbs.m14185ri(iM14427ju)));
                }
            }
            C3283ka c3283kaM14473qc = wjvVar.m14473qc();
            if (zM14576zz || c3283kaM14473qc != null) {
                WeakReference<ri> weakReference = this.f10710xd;
                long videoProgress = (weakReference == null || weakReference.get() == null) ? 0L : this.f10710xd.get().getVideoProgress();
                if (!zM14576zz && c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.xha(videoProgress);
                }
                if (zM14576zz) {
                    if (view != null) {
                        Object tag2 = view.getTag(570425345);
                        if (tag2 instanceof String) {
                            str = (String) tag2;
                        } else {
                            str = "VAST_ACTION_BUTTON";
                        }
                    } else {
                        str = "VAST_ACTION_BUTTON";
                    }
                    C3104ri c3104riM14525sr = wjvVar.m14525sr();
                    if (c3104riM14525sr != null) {
                        c3104riM14525sr.m12536fi(str);
                        if (!TextUtils.isEmpty(str)) {
                            m13535ri(str);
                        }
                        if ("VAST_ICON".equals(str)) {
                            C3098lr c3098lrM12541lr = c3104riM14525sr.m12541lr();
                            if (c3098lrM12541lr != null) {
                                c3098lrM12541lr.m12427ri(videoProgress);
                            }
                        } else if ("VAST_END_CARD".equals(str)) {
                            C3092ik c3092ikM12537ik = c3104riM14525sr.m12537ik();
                            if (c3092ikM12537ik != null) {
                                c3092ikM12537ik.m12427ri(videoProgress);
                            }
                        } else {
                            C3097ka c3097kaM12546ri = c3104riM14525sr.m12546ri();
                            if (c3097kaM12546ri != null) {
                                c3097kaM12546ri.xha(videoProgress);
                            }
                        }
                    }
                }
            }
            if (jbs() && m13540ik(view) && !this.f10706ik) {
                super.mo10681ri(view, f, f2, f3, f4, sparseArray, z);
                return;
            }
            if (this.f10698ka == null) {
                this.f10698ka = C3299nr.m14642ri();
            }
            if (this.f10698ka != null && m13538ri(view, z)) {
                JSONObject jSONObjectM13561ri = C3222ac.m13561ri(view);
                if (this.f10696fi != null) {
                    i = this.f10696fi.f11352mj;
                    jSONObject = this.f10696fi.jbs;
                    jSONObject2 = this.f10696fi.f11345aw;
                    z2 = this.f10696fi.bgr;
                } else {
                    z2 = false;
                    jSONObject = jSONObjectM13561ri;
                    i = -1;
                    jSONObject2 = null;
                }
                this.f10702qt = mo13525ri(f, f2, f3, f4, sparseArray, this.f10675ay, this.f10678fr, this.jbs == null ? m13522ka() : this.jbs.get(), m13519fi(), C3583qd.m16598mj(this.f10698ka), C3583qd.m16600qt(this.f10698ka), C3583qd.jbs(this.f10698ka), i, jSONObject, jSONObject2);
                if (z2) {
                    C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, true, this.slm, z ? 1 : 2);
                    return;
                }
                int iAdz = wjvVar.adz();
                if (iAdz == 2 || iAdz == 3) {
                    if (iAdz == 3) {
                        strSmj = wjvVar.smj();
                        if (!TextUtils.isEmpty(strSmj) && strSmj.contains("play.google.com/store")) {
                            if (C3372lr.m15249ri(this.f10698ka, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), this.xha, wjvVar)) {
                                if (this.f10709ri) {
                                    C3277co c3277co = this.f10702qt;
                                    String str2 = this.xha;
                                    Map<String, Object> map = this.slm;
                                    if (z) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    C3414ik.m15563ri("click", wjvVar, c3277co, str2, true, map, i4);
                                }
                                view2 = view;
                            }
                        }
                    }
                    if (this.f10694co == null || this.f10707lr) {
                        C3277co c3277co2 = this.f10702qt;
                        String str3 = this.xha;
                        Map<String, Object> map2 = this.slm;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        C3414ik.m15563ri("click_button", wjvVar, c3277co2, str3, true, map2, i2);
                    }
                    if (view != null) {
                        view2 = view;
                        try {
                            tag = view2.getTag(520093762);
                        } catch (Exception unused) {
                        }
                    } else {
                        view2 = view;
                        tag = null;
                    }
                    if ((view2 == null && (view2.getId() == 520093726 || (view2 instanceof C3120di))) || Boolean.TRUE.equals(tag)) {
                        C3214ig.m13499ri(true);
                    }
                    activityM10240ri = view2 != null ? C2722lr.m10240ri(view2) : null;
                    if (activityM10240ri == null) {
                        context = this.f10698ka;
                    } else {
                        context = activityM10240ri;
                    }
                    if (C3273ac.m13965ik(wjvVar) || !this.dzy) {
                        boolean zM13500ri = C3214ig.m13500ri(context, wjvVar, this.f10700mj, this.f10694co, this.f10693bu, this.xha, this.f10705vr, true, iM14427ju);
                        wjvVar.m14379di(SystemClock.elapsedRealtime());
                        C3214ig.m13499ri(false);
                        z3 = zM13500ri;
                    } else {
                        z3 = false;
                    }
                    if (this.f10709ri) {
                        C3277co c3277co3 = this.f10702qt;
                        String str4 = this.xha;
                        Map<String, Object> map3 = this.slm;
                        if (z) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        C3414ik.m15563ri("click", wjvVar, c3277co3, str4, z3, map3, i3);
                    }
                } else {
                    if (iAdz != 4) {
                        if (iAdz == 5) {
                            String strM13541lr = m13541lr(this.xha);
                            if (!TextUtils.isEmpty(strM13541lr)) {
                                C3414ik.m15563ri("click_call", wjvVar, this.f10702qt, strM13541lr, true, this.slm, z ? 1 : 2);
                            }
                            C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, C3571ig.m16459lr(view.getContext(), wjvVar.eqw()), this.slm, z ? 1 : 2);
                        } else if (iAdz != 8) {
                            view2 = view;
                            iAdz = -1;
                        } else {
                            if (iAdz == 3) {
                                strSmj = wjvVar.smj();
                                if (!TextUtils.isEmpty(strSmj)) {
                                    if (C3372lr.m15249ri(this.f10698ka, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), this.xha, wjvVar)) {
                                        if (this.f10709ri) {
                                            C3277co c3277co4 = this.f10702qt;
                                            String str5 = this.xha;
                                            Map<String, Object> map4 = this.slm;
                                            if (z) {
                                                i4 = 1;
                                            } else {
                                                i4 = 2;
                                            }
                                            C3414ik.m15563ri("click", wjvVar, c3277co4, str5, true, map4, i4);
                                        }
                                    }
                                }
                            }
                            if (this.f10694co == null) {
                                C3277co c3277co5 = this.f10702qt;
                                String str6 = this.xha;
                                Map<String, Object> map5 = this.slm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                C3414ik.m15563ri("click_button", wjvVar, c3277co5, str6, true, map5, i2);
                            } else {
                                C3277co c3277co6 = this.f10702qt;
                                String str7 = this.xha;
                                Map<String, Object> map6 = this.slm;
                                if (z) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                C3414ik.m15563ri("click_button", wjvVar, c3277co6, str7, true, map6, i2);
                            }
                            if (view != null) {
                                view2 = view;
                                tag = view2.getTag(520093762);
                            } else {
                                view2 = view;
                                tag = null;
                            }
                            if (view2 == null) {
                                C3214ig.m13499ri(true);
                            } else {
                                C3214ig.m13499ri(true);
                            }
                            if (view2 != null) {
                            }
                            if (activityM10240ri == null) {
                                context = this.f10698ka;
                            } else {
                                context = activityM10240ri;
                            }
                            if (C3273ac.m13965ik(wjvVar)) {
                                boolean zM13500ri2 = C3214ig.m13500ri(context, wjvVar, this.f10700mj, this.f10694co, this.f10693bu, this.xha, this.f10705vr, true, iM14427ju);
                                wjvVar.m14379di(SystemClock.elapsedRealtime());
                                C3214ig.m13499ri(false);
                                z3 = zM13500ri2;
                            } else {
                                boolean zM13500ri3 = C3214ig.m13500ri(context, wjvVar, this.f10700mj, this.f10694co, this.f10693bu, this.xha, this.f10705vr, true, iM14427ju);
                                wjvVar.m14379di(SystemClock.elapsedRealtime());
                                C3214ig.m13499ri(false);
                                z3 = zM13500ri3;
                            }
                            if (this.f10709ri) {
                                C3277co c3277co7 = this.f10702qt;
                                String str8 = this.xha;
                                Map<String, Object> map7 = this.slm;
                                if (z) {
                                    i3 = 1;
                                } else {
                                    i3 = 2;
                                }
                                C3414ik.m15563ri("click", wjvVar, c3277co7, str8, z3, map7, i3);
                            }
                        }
                    } else if (C3279dw.m14092lr(wjvVar) && (this.f10694co != null || this.f10693bu != null)) {
                        activityM10240ri = view != null ? C2722lr.m10240ri(view) : null;
                        boolean zM13500ri4 = C3214ig.m13500ri(activityM10240ri == null ? this.f10698ka : activityM10240ri, wjvVar, this.f10700mj, this.f10694co, this.f10693bu, this.xha, this.f10705vr, true, iM14427ju);
                        if (this.f10709ri) {
                            C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, zM13500ri4, this.slm, z ? 1 : 2);
                        }
                    } else if (this.f10705vr != null) {
                        this.f10705vr.mo15239ri(wjvVar);
                        Map<String, Object> map8 = this.slm;
                        if (wjvVar.m14356ac() && !wjvVar.tan()) {
                            map8.put("auto_click", Boolean.TRUE);
                            wjvVar.m14399fi(false);
                        }
                        if (this.f10709ri) {
                            C3414ik.m15563ri("click", wjvVar, this.f10702qt, this.xha, true, map8, z ? 1 : 2);
                        }
                    }
                    view2 = view;
                }
                if (this.f10704sf != null) {
                    this.f10704sf.mo11528ri(view2, iAdz);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13546ri(ri riVar) {
        this.f10710xd = new WeakReference<>(riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m13547ri(boolean z) {
        this.f10709ri = z;
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m13548ri() {
        wjv wjvVar = this.f10695di;
        if (wjvVar == null) {
            return true;
        }
        int iM14858lr = C3299nr.m14639ka().m14858lr(wjvVar.m14545ur());
        int iM10255ik = C2724nr.m10255ik(C3299nr.m14642ri());
        if (iM14858lr == 1) {
            return C3571ig.m16451ka(iM10255ik);
        }
        if (iM14858lr == 2) {
            return C3571ig.m16441fi(iM10255ik) || C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik);
        }
        if (iM14858lr != 3) {
            return iM14858lr != 5 || C3571ig.m16451ka(iM10255ik) || C3571ig.m16437di(iM10255ik);
        }
        return false;
    }
}
