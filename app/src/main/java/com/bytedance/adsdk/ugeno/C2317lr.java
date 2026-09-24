package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.core.InterfaceC2230fi;
import com.bytedance.adsdk.ugeno.p090di.C2251lr;
import com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik;
import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.common.base.Ascii;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2317lr extends C2320ri<C2251lr> implements InterfaceC2249ik {
    private float adz;
    private int akr;
    private float amj;
    private float bfa;
    private int bzf;

    /* JADX INFO: renamed from: de */
    private boolean f5851de;
    private JSONArray eqw;

    /* JADX INFO: renamed from: eu */
    private String f5852eu;
    private float evm;
    private float ezp;

    /* JADX INFO: renamed from: fb */
    private int f5853fb;

    /* JADX INFO: renamed from: fn */
    private float f5854fn;

    /* JADX INFO: renamed from: jg */
    private boolean f5855jg;

    /* JADX INFO: renamed from: jm */
    private float f5856jm;
    private int klz;
    private float rbz;
    private boolean skk;
    private String smj;

    /* JADX INFO: renamed from: sz */
    private boolean f5857sz;

    /* JADX INFO: renamed from: tn */
    private boolean f5858tn;
    private String tpb;

    /* JADX INFO: renamed from: tq */
    private int f5859tq;
    private boolean tyc;

    /* JADX INFO: renamed from: xh */
    private int f5860xh;
    private float xlq;

    /* JADX INFO: renamed from: zv */
    private boolean f5861zv;
    private float zxp;

    public C2317lr(Context context) {
        super(context);
        this.akr = 0;
        this.f5851de = true;
        this.f5861zv = true;
        this.xlq = 500.0f;
        this.zxp = 2000.0f;
        this.f5852eu = "slide";
        this.tpb = "dot";
        this.f5856jm = 8.0f;
        this.adz = 8.0f;
        this.ezp = 50.0f;
        this.evm = 90.0f;
        this.f5857sz = false;
        this.f5853fb = Color.parseColor("#666666");
        this.bzf = Color.parseColor("#ffffff");
        this.smj = "row";
        this.rbz = 1.0f;
        this.amj = 0.0f;
        this.bfa = 0.0f;
        this.f5854fn = 0.0f;
        this.f5860xh = 0;
        this.f5859tq = 0;
        this.skk = true;
        this.f5855jg = false;
        this.f5858tn = true;
        float fM8043ri = C2347mj.m8043ri(this.f5888lr, 8.0f);
        this.f5856jm = fM8043ri;
        this.adz = fM8043ri;
    }

    /* JADX INFO: renamed from: mj */
    private void m7813mj(int i) {
        if (this.nbc == null) {
            return;
        }
        this.nbc.m7772ri("SwiperView://slide", Integer.valueOf(this.klz), Integer.valueOf(i), Integer.valueOf(!this.tyc ? 1 : 0));
    }

    /* JADX INFO: renamed from: qh */
    private int m7814qh() {
        if (this.f5860xh == 1) {
            if (this.f5929ri != null) {
                return this.f5929ri.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.eqw;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    private void m7816ri(C2228co c2228co) {
        if (this.f5855jg) {
            c2228co.m7347ri(new InterfaceC2230fi() { // from class: com.bytedance.adsdk.ugeno.lr.1
                @Override // com.bytedance.adsdk.ugeno.core.InterfaceC2230fi
                /* JADX INFO: renamed from: ri */
                public void mo7357ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, List<C2285di.ri> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && C2317lr.this.f5875fi != null) {
                        ((C2251lr) C2317lr.this.f5875fi).m7491di();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7817ri(boolean z, int i, float f) {
        if (this.nbc != null && !z && i == m7814qh() - 1 && f == 0.0f && this.f5858tn) {
            this.nbc.m7772ri("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.f5858tn = false;
        }
    }

    private void rzk() {
        for (int i = 0; i < this.f5929ri.size(); i++) {
            AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f5929ri.get(i);
            if (abstractViewOnTouchListenerC2318ik != null) {
                C2228co c2228co = new C2228co(this.f5888lr);
                m7816ri(c2228co);
                c2228co.m7349ri(this.f5911vt);
                ((C2251lr) this.f5875fi).m7514ri(c2228co.m7344ri(abstractViewOnTouchListenerC2318ik.ory(), this.f5886ka, (JSONObject) null));
            }
        }
    }

    private void xha(int i) {
        if (this.nbc == null) {
            return;
        }
        if (this.klz == 0 && i == m7814qh() - 1) {
            this.nbc.m7772ri("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.klz == m7814qh() - 1 && i == 0) {
            this.nbc.m7772ri("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    /* JADX INFO: renamed from: xm */
    private void m7818xm() {
        if (this.f5929ri == null || this.f5929ri.isEmpty()) {
            return;
        }
        AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik = this.f5929ri.get(0);
        if (this.eqw == null) {
            return;
        }
        for (int i = 0; i < this.eqw.length(); i++) {
            C2228co c2228co = new C2228co(this.f5888lr);
            m7816ri(c2228co);
            c2228co.m7349ri(this.f5911vt);
            try {
                JSONObject jSONObjectOptJSONObject = this.eqw.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.f5886ka.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.f5886ka.put("$item", jSONObjectOptJSONObject);
                    }
                    ((C2251lr) this.f5875fi).m7514ri(c2228co.m7344ri(abstractViewOnTouchListenerC2318ik.ory(), this.f5886ka, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m7819ik() {
        ((C2251lr) this.f5875fi).m7488aw(((C2251lr) this.f5875fi).getCurrentItem() + 1);
    }

    /* JADX INFO: renamed from: ka */
    public void m7820ka() {
        ((C2251lr) this.f5875fi).m7488aw(((C2251lr) this.f5875fi).getCurrentItem() - 1);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        ((C2251lr) this.f5875fi).m7497ik((int) this.xlq).m7494fi(this.f5855jg).m7515ri(this.tpb).m7512ri(this.f5856jm).m7506lr(this.adz).m7496ik(this.ezp).m7501ka(this.evm).m7508lr(this.smj).m7513ri(this.akr).m7505lr().m7503ka(this.f5851de).m7516ri(this.f5861zv).m7507lr((int) this.xlq).m7502ka((int) this.zxp).m7509lr(this.skk).m7499ik(this.f5857sz).m7490di(this.f5853fb).m7493fi(this.bzf).m7510mj((int) this.bfa).jbs((int) this.f5854fn).xha((int) this.amj).m7492fi(this.rbz).m7498ik(this.f5852eu).m7488aw(this.f5859tq);
        ((C2251lr) this.f5875fi).setOnPageChangeListener(this);
        if (this.f5860xh == 1) {
            rzk();
        } else {
            m7818xm();
        }
        ((C2251lr) this.f5875fi).m7500ik();
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public View mo7552ri() {
        this.f5875fi = new C2251lr(this.f5888lr);
        ((C2251lr) this.f5875fi).m7477ri((InterfaceC2282ka) this);
        return this.f5875fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m7821ri(int i) {
        if (((C2251lr) this.f5875fi).getCurrentItem() != i) {
            ((C2251lr) this.f5875fi).m7488aw(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7661ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7822ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, ViewGroup.LayoutParams layoutParams) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f5929ri.add(abstractViewOnTouchListenerC2318ik);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7553ri(String str, String str2) {
        super.mo7553ri(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case -1593646704:
                if (str.equals("startIndex")) {
                    b = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b = 1;
                }
                break;
            case -1560813342:
                if (str.equals("indicatorStyle")) {
                    b = 2;
                }
                break;
            case -1557466889:
                if (str.equals("indicatorWidth")) {
                    b = 3;
                }
                break;
            case -1469828074:
                if (str.equals("indicatorHeight")) {
                    b = 4;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b = 5;
                }
                break;
            case -1367379379:
                if (str.equals("driveMode")) {
                    b = 6;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b = 7;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b = 8;
                }
                break;
            case -855614293:
                if (str.equals("disableOnInteraction")) {
                    b = 9;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b = 10;
                }
                break;
            case -597162967:
                if (str.equals("indicatorX")) {
                    b = Ascii.f22503VT;
                }
                break;
            case -597162966:
                if (str.equals("indicatorY")) {
                    b = Ascii.f22492FF;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 95467907:
                if (str.equals("delay")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b = Ascii.DLE;
                }
                break;
            case 195414576:
                if (str.equals("indicatorDirection")) {
                    b = 17;
                }
                break;
            case 497874535:
                if (str.equals("allowTouchMove")) {
                    b = Ascii.DC2;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b = 19;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b = Ascii.DC4;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b = Ascii.NAK;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b = Ascii.SYN;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b = Ascii.ETB;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f5859tq = C2343ik.m8030ri(str2, 0);
                break;
            case 1:
                this.f5853fb = C2348ri.m8055ri(str2, this.f5853fb);
                break;
            case 2:
                this.tpb = str2;
                break;
            case 3:
                this.f5856jm = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 8.0f));
                break;
            case 4:
                this.adz = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 8.0f));
                break;
            case 5:
                this.f5854fn = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 6:
                this.f5860xh = C2343ik.m8030ri(str2, 0);
                break;
            case 7:
                this.f5852eu = str2;
                break;
            case 8:
                if (!TextUtils.equals(str2, "vertical")) {
                    this.akr = 0;
                } else {
                    this.akr = 1;
                }
                break;
            case 9:
                this.f5855jg = C2343ik.m8032ri(str2, false);
                break;
            case 10:
                this.f5857sz = C2343ik.m8032ri(str2, false);
                break;
            case 11:
                this.ezp = C2343ik.m8029ri(str2, 50.0f);
                break;
            case 12:
                this.evm = C2343ik.m8029ri(str2, 90.0f);
                break;
            case 13:
                this.bfa = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 14:
                this.f5851de = C2343ik.m8032ri(str2, true);
                break;
            case 15:
                this.zxp = C2343ik.m8029ri(str2, 2000.0f);
                break;
            case 16:
                this.xlq = C2343ik.m8029ri(str2, 500.0f);
                break;
            case 17:
                this.smj = str2;
                break;
            case 18:
                this.skk = C2343ik.m8032ri(str2, true);
                break;
            case 19:
                this.rbz = C2343ik.m8029ri(str2, 1.0f);
                break;
            case 20:
                this.amj = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 21:
                this.bzf = C2348ri.m8055ri(str2, this.bzf);
                break;
            case 22:
                this.f5861zv = C2343ik.m8032ri(str2, true);
                break;
            case 23:
                this.eqw = C2346lr.m8038ri(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
    /* JADX INFO: renamed from: ri */
    public void mo7471ri(boolean z, int i) {
        if (i == 0) {
            if (!z) {
                this.f5858tn = true;
            }
            this.tyc = false;
        } else if (i == 1) {
            this.tyc = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z + "; state=" + i);
    }

    @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
    /* JADX INFO: renamed from: ri */
    public void mo7472ri(boolean z, int i, float f, int i2) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z + "; position=" + i + "; positionOffset=" + f + "; positionOffsetPixels=" + i2);
        m7817ri(z, i, f);
    }

    @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
    /* JADX INFO: renamed from: ri */
    public void mo7473ri(boolean z, int i, int i2, boolean z2, boolean z3) {
        if (this.klz != i) {
            xha(i);
            m7813mj(i);
            this.klz = i;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z + "; position=" + i + "; loopPosition=" + i2 + "; isFirst=" + z2 + "; isLast=" + z3);
    }
}
