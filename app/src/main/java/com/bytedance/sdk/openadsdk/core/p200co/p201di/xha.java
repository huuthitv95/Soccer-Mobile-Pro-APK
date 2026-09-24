package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.p007ts.TsExtractor;
import com.bytedance.adsdk.ugeno.core.C2246sf;
import com.bytedance.adsdk.ugeno.core.InterfaceC2247vr;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.component.adexpress.p124ka.C2491di;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p201di.p202ri.C3137di;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3159di;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.C3172lr;
import com.bytedance.sdk.openadsdk.core.p200co.p208lr.p212ka.C3169ik;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends C3133ka {

    /* JADX INFO: renamed from: dw */
    private float f10288dw;

    /* JADX INFO: renamed from: fr */
    private AbstractViewOnTouchListenerC2318ik f10289fr;
    private float hcw;
    private AbstractViewOnTouchListenerC2318ik igq;

    /* JADX INFO: renamed from: oh */
    private boolean f10290oh;
    private boolean ory;

    /* JADX INFO: renamed from: su */
    private AbstractViewOnTouchListenerC2318ik f10291su;

    /* JADX INFO: renamed from: xd */
    private float f10292xd;

    /* JADX INFO: renamed from: zf */
    private InterfaceC3338fi f10293zf;

    public xha(Context context, wjv wjvVar, boolean z, C3136ri c3136ri, ViewGroup viewGroup) {
        super(context, wjvVar, z, c3136ri, viewGroup);
        this.ory = false;
        this.f10290oh = true;
        if (TextUtils.equals(this.f10249uq, "fullscreen_interstitial_ad")) {
            this.f10288dw = this.f10234fi.mhp();
        } else if (TextUtils.equals(this.f10249uq, "rewarded_video")) {
            this.f10288dw = this.f10234fi.plm();
        }
    }

    /* JADX INFO: renamed from: aw */
    private void m13117aw() {
        C2246sf c2246sf = new C2246sf();
        HashMap map = new HashMap();
        map.put("image_info", this.f10232di.m8890sf());
        map.put("cache_dir", this.f10232di.bgr());
        c2246sf.m7433ri(map);
        c2246sf.m7432ri(this.f10239lr);
        c2246sf.m7434ri(this.f10238ka);
        c2246sf.m7430lr(this.f10229ay);
        this.f10246ri.m7353ri("ad", c2246sf);
    }

    private int bgr() {
        m13117aw();
        try {
            this.f10246ri.m7354ri(this.f10229ay, this.f10237ik);
            if (this.f10237ik != null) {
                m13123vr();
                m13118co();
            }
            if (this instanceof C3137di) {
                return 0;
            }
            this.f10232di.m13093oh().mo7385lr();
            this.f10232di.m13093oh().mo7384ik();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
        } catch (Throwable unused3) {
            return ModuleDescriptor.MODULE_VERSION;
        }
    }

    /* JADX INFO: renamed from: co */
    private void m13118co() {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10289fr;
        if (abstractViewOnTouchListenerC2318ik != null) {
            abstractViewOnTouchListenerC2318ik.m7844ik(8);
        }
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik2 = this.f10291su;
        if (abstractViewOnTouchListenerC2318ik2 != null) {
            abstractViewOnTouchListenerC2318ik2.m7844ik(8);
        }
    }

    /* JADX INFO: renamed from: ik */
    private void m13119ik(CharSequence charSequence, boolean z, int i, boolean z2) {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10291su;
        if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ik instanceof C3159di)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            abstractViewOnTouchListenerC2318ik.m7844ik(i2);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13120lr(CharSequence charSequence, boolean z, int i, boolean z2) {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.igq;
        if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ik instanceof C3169ik)) {
            try {
                int i2 = Integer.parseInt((String) charSequence);
                if (this.f10290oh) {
                    this.hcw = i;
                    this.f10290oh = false;
                }
                this.f10292xd = (float) (((double) this.f10292xd) + ((0.5d / ((double) this.hcw)) * 100.0d));
                this.f10246ri.m7351ri(this.f10237ik, "ProgressBar://progress", Float.valueOf(this.f10292xd), Float.valueOf(this.f10288dw));
                if (!z2 && i2 > 0 && !z) {
                    ((C3169ik) this.igq).xha(500);
                    ((C3169ik) this.igq).m13214ri((int) this.f10292xd);
                    return;
                }
                ((C3169ik) this.igq).m7844ik(8);
            } catch (Throwable th) {
                C2707ac.m10196ik("UGenRender", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private Context m13121ri(View view) {
        Activity activityM10240ri = view != null ? C2722lr.m10240ri(view) : null;
        return activityM10240ri == null ? this.f10239lr : activityM10240ri;
    }

    /* JADX INFO: renamed from: ri */
    private void m13122ri(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10289fr;
        if (abstractViewOnTouchListenerC2318ik != null && (abstractViewOnTouchListenerC2318ik instanceof C3172lr)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                C2707ac.m10197ik("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (z2 || i2 <= 0 || this.ory) {
                this.f10289fr.m7844ik(8);
                return;
            }
            this.f10289fr.m7844ik(0);
            if (!z && this.f10232di.m8889ri() && C2491di.m8812lr(this.f10232di.m8884ka())) {
                ((C3172lr) this.f10289fr).mo7668aw(String.valueOf(i));
            } else if ("open_ad".equals(this.f10232di.m8884ka()) || !this.f10232di.m8889ri()) {
                ((C3172lr) this.f10289fr).mo7668aw(String.valueOf(charSequence));
            } else {
                this.ory = true;
                this.f10289fr.m7844ik(8);
            }
        }
    }

    private boolean slm() {
        return this.f10234fi != null && this.f10234fi.akr() == 1;
    }

    /* JADX INFO: renamed from: vr */
    private void m13123vr() {
        if (this.f10237ik == null) {
            return;
        }
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7835di = this.f10237ik.m7835di("RVCountdown");
        this.f10289fr = abstractViewOnTouchListenerC2318ikM7835di;
        if (abstractViewOnTouchListenerC2318ikM7835di == 0) {
            this.f10289fr = this.f10237ik.m7835di("FVCountdown");
        }
        if (this.f10289fr == null) {
            this.f10289fr = this.f10237ik.m7835di("AOCountdown");
        }
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7835di2 = this.f10237ik.m7835di("RVSkipView");
        this.f10291su = abstractViewOnTouchListenerC2318ikM7835di2;
        if (abstractViewOnTouchListenerC2318ikM7835di2 == 0) {
            this.f10291su = this.f10237ik.m7835di("FVSkipView");
        }
        if (this.f10291su == null) {
            this.f10291su = this.f10237ik.m7835di("AOSkipView");
        }
    }

    protected int jbs() {
        m13117aw();
        this.f10246ri.m7349ri((InterfaceC2247vr) this);
        this.f10246ri.m7348ri((slm) this);
        if (slm()) {
            this.f10246ri.m7350ri(new C3132ik());
        }
        C3287oh c3287ohM14575zv = this.f10234fi.m14575zv();
        if (c3287ohM14575zv == null) {
            try {
                if (C3137di.m13108ri(this.f10249uq)) {
                    this.f10237ik = this.f10246ri.m7346ri(this.f10238ka, this.f10229ay, mo13110ri(c3287ohM14575zv));
                } else {
                    this.f10237ik = this.f10246ri.m7346ri(this.f10238ka, this.f10229ay, (JSONObject) null);
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
            } catch (Throwable unused3) {
                return ModuleDescriptor.MODULE_VERSION;
            }
        } else {
            this.f10237ik = this.f10246ri.m7346ri(this.f10238ka, this.f10229ay, mo13110ri(c3287ohM14575zv));
        }
        if (this.f10237ik != null) {
            m13123vr();
            this.igq = this.f10237ik.m7835di("ProgressBar");
            m13118co();
        }
        if (this instanceof C3137di) {
            return 0;
        }
        this.f10232di.m13093oh().mo7385lr();
        this.f10232di.m13093oh().mo7384ik();
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: ka */
    protected int mo13077ka() {
        if (!this.f10232di.m13094xd()) {
            return jbs();
        }
        C2707ac.m10205ri("UGenRender", "renderWidget: only update data");
        return bgr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: lr */
    protected JSONObject mo13078lr() {
        return this.f10232di.m8883ik();
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: mj */
    protected AbstractViewOnTouchListenerC2318ik mo13079mj() {
        if (this.f10237ik == null) {
            return null;
        }
        return this.f10237ik.m7835di("VideoV3");
    }

    /* JADX INFO: renamed from: qt */
    public void m13124qt() {
        if (this.f10246ri != null) {
            this.f10246ri.m7351ri(this.f10237ik, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: ri */
    protected JSONObject mo13080ri() {
        JSONObject jSONObjectIk = this.f10232di.m8883ik();
        if (jSONObjectIk != null) {
            return jSONObjectIk.optJSONObject("xTemplate");
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject mo13110ri(C3287oh c3287oh) {
        if (c3287oh != null) {
            return c3287oh.m14226fi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: ri */
    public void mo13081ri(long j, long j2) {
        super.mo13081ri(j, j2);
        if (this.f10246ri != null) {
            this.f10246ri.m7351ri(this.f10237ik, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka, com.bytedance.adsdk.ugeno.core.InterfaceC2247vr
    /* JADX INFO: renamed from: ri */
    public void mo7437ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        byte b;
        if (this.f10240mj == null || riVar == null) {
            return;
        }
        String strM7751lr = riVar.m7751lr();
        strM7751lr.hashCode();
        int i = 7;
        int i2 = 6;
        int i3 = -1;
        switch (strM7751lr.hashCode()) {
            case -1882810668:
                b = !strM7751lr.equals("sendLogExtra") ? (byte) -1 : (byte) 0;
                break;
            case -1439599355:
                b = !strM7751lr.equals("sendAdExtra") ? (byte) -1 : (byte) 1;
                break;
            case -511324706:
                b = !strM7751lr.equals("openPrivacy") ? (byte) -1 : (byte) 2;
                break;
            case -55818203:
                b = !strM7751lr.equals("pauseVideo") ? (byte) -1 : (byte) 3;
                break;
            case 3532159:
                b = !strM7751lr.equals("skip") ? (byte) -1 : (byte) 4;
                break;
            case 72484600:
                b = !strM7751lr.equals("openPlayable") ? (byte) -1 : (byte) 5;
                break;
            case 804386914:
                b = !strM7751lr.equals("videoControl") ? (byte) -1 : (byte) 6;
                break;
            case 951590323:
                b = !strM7751lr.equals("convert") ? (byte) -1 : (byte) 7;
                break;
            case 1151744482:
                b = !strM7751lr.equals(FyberMediationAdapter.KEY_MUTE_VIDEO) ? (byte) -1 : (byte) 8;
                break;
            case 1528469391:
                b = !strM7751lr.equals("openLinks") ? (byte) -1 : (byte) 9;
                break;
            case 1603466254:
                b = !strM7751lr.equals("speedVideoOrTimer") ? (byte) -1 : (byte) 10;
                break;
            case 1671642405:
                b = !strM7751lr.equals("dislike") ? (byte) -1 : Ascii.f22503VT;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                new C3135mj().m13091ri("sendLogExtra", this.f10234fi, this.f10249uq, riVar.m7747ik());
                break;
            case 1:
                new C3135mj().m13091ri("sendAdExtra", this.f10234fi, this.f10249uq, riVar.m7747ik());
                break;
            case 2:
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 3:
            case 6:
                i = 4;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 4:
                i = i2;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 5:
                if (this.jbs != null) {
                    this.jbs.mo11881lr((JSONObject) null);
                }
                break;
            case 7:
                i = 2;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 8:
                i = 5;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 9:
                new C3130di().m13042ri(m13121ri(abstractViewOnTouchListenerC2318ik.m7879sf()), this.f10239lr instanceof Activity, this.f10234fi, this.f10249uq, riVar.m7747ik(), this.f10293zf);
                break;
            case 10:
                C2707ac.m10200lr("UGenRender", "onUGenEvent: " + riVar.m7747ik());
                i2 = 13;
                if (riVar.m7747ik() != null && !riVar.m7747ik().isEmpty()) {
                    try {
                        i3 = Integer.parseInt(riVar.m7747ik().get("switch"));
                    } catch (Throwable th) {
                        C2707ac.m10197ik("UGenRender", th);
                    }
                }
                i = i2;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            case 11:
                i = 3;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
            default:
                i = 0;
                this.f10240mj.mo9002ri(abstractViewOnTouchListenerC2318ik.m7879sf(), i, new com.bytedance.sdk.openadsdk.core.model.slm.C3292ri().m14281ka(this.bgr).m14279ik(this.f10250vr).m14282lr(this.slm).m14287ri(this.f10230bu).m14284lr(this.f10241nr).m14289ri(this.tan).m14280ik(i3).m14290ri(this.wjv).m14293ri(true).m14291ri(abstractViewOnTouchListenerC2318ik.dzy()).m14286lr(false).m14294ri());
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    /* JADX INFO: renamed from: ri */
    public void mo13085ri(InterfaceC3338fi interfaceC3338fi) {
        this.f10293zf = interfaceC3338fi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka, com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setSoundMute(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka, com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.f10237ik == null) {
            return;
        }
        boolean z2 = i == 1;
        if (TextUtils.equals(this.f10249uq, "open_ad") && this.f10246ri != null) {
            this.f10246ri.m7351ri(this.f10237ik, "countdown", charSequence);
        }
        m13120lr(charSequence, z2, i2, z);
        m13122ri(charSequence, z2, i2, z);
        m13119ik(charSequence, z2, i2, z);
    }

    /* JADX INFO: renamed from: sf */
    public void m13125sf() {
        if (this.f10246ri != null) {
            this.f10246ri.m7351ri(this.f10237ik, "show", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p201di.C3133ka
    public AbstractViewOnTouchListenerC2318ik xha() {
        if (this.f10237ik == null) {
            return null;
        }
        return this.f10237ik.m7835di("Playable");
    }
}
