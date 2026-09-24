package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.core.C2228co;
import com.bytedance.adsdk.ugeno.p090di.C2251lr;
import com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p106lr.C2320ri;
import com.bytedance.adsdk.ugeno.xha.C2343ik;
import com.bytedance.adsdk.ugeno.xha.C2346lr;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import com.google.common.base.Ascii;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ik */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C2267ik extends C2320ri<C2251lr> {
    private int adz;
    private String akr;
    private float bzf;

    /* JADX INFO: renamed from: de */
    private boolean f5692de;

    /* JADX INFO: renamed from: eu */
    private String f5693eu;
    private JSONArray evm;
    private float ezp;

    /* JADX INFO: renamed from: fb */
    private float f5694fb;

    /* JADX INFO: renamed from: jm */
    private int f5695jm;
    private float smj;

    /* JADX INFO: renamed from: sz */
    private AbstractViewOnTouchListenerC2318ik f5696sz;
    private boolean tpb;
    private float xlq;

    /* JADX INFO: renamed from: zv */
    private boolean f5697zv;
    private float zxp;

    public C2267ik(Context context) {
        super(context);
        this.f5692de = true;
        this.f5697zv = true;
        this.xlq = 0.0f;
        this.zxp = 2000.0f;
        this.f5693eu = Constants.NORMAL;
        this.tpb = true;
        this.f5695jm = Color.parseColor("#666666");
        this.adz = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri, com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: lr */
    public void mo7550lr() {
        super.mo7550lr();
        JSONArray jSONArray = this.evm;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((C2251lr) this.f5875fi).xha((int) this.f5694fb).m7510mj((int) this.bzf).jbs((int) this.smj).m7499ik(this.tpb).m7493fi(this.adz).m7490di(this.f5695jm).m7498ik(this.f5693eu).m7503ka(this.f5692de).m7492fi(this.ezp).m7516ri(this.f5697zv).m7502ka((int) this.zxp).m7499ik(this.tpb);
        for (int i = 0; i < this.evm.length(); i++) {
            C2228co c2228co = new C2228co(this.f5888lr);
            c2228co.m7349ri(this.f5911vt);
            AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ikM7340lr = c2228co.m7340lr(this.f5696sz.ory(), (AbstractViewOnTouchListenerC2318ik<View>) null);
            c2228co.m7342lr(this.evm.optJSONObject(i));
            ((C2251lr) this.f5875fi).m7514ri(abstractViewOnTouchListenerC2318ikM7340lr);
        }
        if (this.f5697zv) {
            ((C2251lr) this.f5875fi).m7500ik();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public View mo7552ri() {
        this.f5875fi = new C2251lr(this.f5888lr);
        ((C2251lr) this.f5875fi).m7477ri((InterfaceC2282ka) this);
        return this.f5875fi;
    }

    /* JADX INFO: renamed from: ri */
    public void m7659ri(int i) {
        if (this.f5875fi != 0) {
            ((C2251lr) this.f5875fi).m7488aw(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7660ri(InterfaceC2249ik interfaceC2249ik) {
        if (this.f5875fi != 0) {
            ((C2251lr) this.f5875fi).setOnPageChangeListener(interfaceC2249ik);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.C2320ri
    /* JADX INFO: renamed from: ri */
    public void mo7661ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5696sz = abstractViewOnTouchListenerC2318ik;
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
            case -1657957217:
                if (str.equals("delayStart")) {
                    b = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b = 1;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b = 2;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b = 3;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b = 4;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b = 5;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b = 6;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b = 7;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b = 8;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b = 9;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b = 10;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b = Ascii.f22490CR;
                }
                break;
        }
        switch (b) {
            case 0:
                this.xlq = C2343ik.m8029ri(str2, 0.0f);
                break;
            case 1:
                this.f5695jm = C2348ri.m8053ri(str2);
                break;
            case 2:
                this.smj = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 3:
                this.f5693eu = str2;
                break;
            case 4:
                this.akr = str2;
                break;
            case 5:
                this.tpb = C2343ik.m8032ri(str2, true);
                break;
            case 6:
                this.bzf = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 7:
                this.f5692de = C2343ik.m8032ri(str2, true);
                break;
            case 8:
                this.zxp = C2343ik.m8029ri(str2, 500.0f);
                break;
            case 9:
                this.ezp = C2343ik.m8029ri(str2, 1.0f);
                break;
            case 10:
                this.f5694fb = C2347mj.m8043ri(this.f5888lr, C2343ik.m8029ri(str2, 0.0f));
                break;
            case 11:
                this.adz = C2348ri.m8053ri(str2);
                break;
            case 12:
                this.f5697zv = C2343ik.m8032ri(str2, true);
                break;
            case 13:
                this.evm = C2346lr.m8038ri(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik
    /* JADX INFO: renamed from: ri */
    public void mo7662ri(JSONObject jSONObject) {
    }
}
