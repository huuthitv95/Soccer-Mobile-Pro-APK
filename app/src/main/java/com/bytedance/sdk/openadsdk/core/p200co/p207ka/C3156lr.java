package com.bytedance.sdk.openadsdk.core.p200co.p207ka;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.core.slm;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.C3214ig;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.InterfaceC3118lr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3187lr;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3188ri;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3371ka;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p234ri.C3372lr;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ka.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3156lr implements slm, C3157ri.ri {

    /* JADX INFO: renamed from: ri */
    protected static int f10370ri = 8;

    /* JADX INFO: renamed from: ac */
    private boolean f10371ac = true;

    /* JADX INFO: renamed from: aw */
    private View f10372aw;
    private float bgr;

    /* JADX INFO: renamed from: bu */
    private float f10373bu;

    /* JADX INFO: renamed from: co */
    private String f10374co;

    /* JADX INFO: renamed from: di */
    private String f10375di;

    /* JADX INFO: renamed from: fi */
    private final C3180ri f10376fi;

    /* JADX INFO: renamed from: ik */
    private final Activity f10377ik;
    private JSONObject jbs;

    /* JADX INFO: renamed from: ka */
    private final wjv f10378ka;

    /* JADX INFO: renamed from: lr */
    private C3157ri f10379lr;

    /* JADX INFO: renamed from: mj */
    private String f10380mj;

    /* JADX INFO: renamed from: nr */
    private long f10381nr;

    /* JADX INFO: renamed from: qt */
    private final InterfaceC3187lr f10382qt;

    /* JADX INFO: renamed from: sf */
    private InterfaceC3188ri f10383sf;
    private float slm;
    private long tan;

    /* JADX INFO: renamed from: vr */
    private float f10384vr;
    private String xha;

    public C3156lr(Activity activity, wjv wjvVar, C3180ri c3180ri, String str, InterfaceC3187lr interfaceC3187lr) {
        this.f10377ik = activity;
        this.f10374co = str;
        this.f10378ka = wjvVar;
        this.f10382qt = interfaceC3187lr;
        this.f10376fi = c3180ri;
    }

    /* JADX INFO: renamed from: lr */
    private void m13173lr() {
        int iAdz = this.f10378ka.adz();
        if (iAdz != 2 && iAdz != 3) {
            if (iAdz == 4) {
                C3371ka.m15240ri(this.f10377ik, this.f10374co).mo15239ri(this.f10378ka);
                return;
            } else {
                if (iAdz != 5) {
                    return;
                }
                C3571ig.m16459lr(this.f10377ik, this.f10378ka.eqw());
                return;
            }
        }
        if (iAdz == 3) {
            String strSmj = this.f10378ka.smj();
            if (!TextUtils.isEmpty(strSmj) && strSmj.contains("play.google.com/store")) {
                if (C3372lr.m15249ri(this.f10377ik, strSmj, strSmj.substring(strSmj.indexOf("?id=") + 4), this.f10374co, this.f10378ka)) {
                    return;
                }
            }
        }
        Activity activity = this.f10377ik;
        wjv wjvVar = this.f10378ka;
        int iM16470ri = C3571ig.m16470ri(this.f10374co);
        String str = this.f10374co;
        C3214ig.m13500ri(activity, wjvVar, iM16470ri, null, null, str, C3371ka.m15240ri(this.f10377ik, str), true, 0);
    }

    /* JADX INFO: renamed from: ri */
    private void m13175ri(C2226aw c2226aw, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.bgr);
            jSONObject.put("down_y", this.f10384vr);
            jSONObject.put("down_time", this.f10381nr);
            jSONObject.put("up_x", this.slm);
            jSONObject.put("up_y", this.f10373bu);
            jSONObject.put("up_time", this.tan);
            View viewM7879sf = c2226aw.m7324ri().m7879sf();
            int i = 1;
            if (viewM7879sf != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = viewM7879sf.getWidth();
                float height = viewM7879sf.getHeight();
                viewM7879sf.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f);
                jSONObject2.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.f10372aw;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.f10372aw.getWidth());
                jSONObject.put("button_height", this.f10372aw.getHeight());
            }
            View viewFindViewById = this.f10377ik.findViewById(R.id.content);
            if (viewFindViewById != null) {
                int[] iArr3 = new int[2];
                viewFindViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", viewFindViewById.getWidth());
                jSONObject.put("height", viewFindViewById.getHeight());
            }
            jSONObject.put("click_area_type", c2226aw.m7324ri().dzy());
            jSONObject.put("brick_id", c2226aw.m7324ri().m7885xd());
            jSONObject.put("endcard_id", this.f10375di);
            jSONObject.put("click_scence", 2);
            if (!this.f10371ac) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            InterfaceC3188ri interfaceC3188ri = this.f10383sf;
            if (interfaceC3188ri != null) {
                jSONObject.put("endcard_type", interfaceC3188ri.mo11839ri());
            }
            C3414ik.m15554ri(wjvVar, this.f10374co, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13177ri(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f10379lr.m13187ri((C3157ri.ri) this);
        this.f10379lr.m13186ri((slm) this);
        this.f10382qt.mo11833ri();
        this.f10379lr.m13188ri(jSONObject, jSONObject2, new InterfaceC3186ka() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.lr.2
            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka
            /* JADX INFO: renamed from: ri */
            public void mo10893ri(int i, String str) {
                if (C3156lr.this.f10382qt != null) {
                    C3156lr.this.f10382qt.mo11834ri(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka
            /* JADX INFO: renamed from: ri */
            public void mo10894ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
                if (C3156lr.this.f10382qt != null) {
                    C3156lr.this.f10382qt.mo11836ri(abstractViewOnTouchListenerC2318ik);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m13178ri() {
        if (this.f10378ka == null) {
            this.f10382qt.mo11835ri(1, "material is null", "net");
            return;
        }
        if (this.f10376fi == null) {
            this.f10382qt.mo11835ri(1, "material ugen template is null", "net");
            return;
        }
        this.f10379lr = new C3157ri(this.f10377ik);
        this.f10380mj = this.f10376fi.m13270ik();
        this.f10375di = this.f10376fi.m13276ri();
        this.xha = this.f10376fi.m13274lr();
        this.jbs = this.f10378ka.m14361aw(true);
        this.f10382qt.mo11837ri(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        C3183lr.m13301ri().m13311ri(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.f10380mj, this.f10375di, this.xha, "", new C3183lr.ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ka.lr.1
            @Override // com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo13182ri(int i, String str, String str2) {
                C3156lr.this.f10382qt.mo11835ri(i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr.ri
            /* JADX INFO: renamed from: ri */
            public void mo13183ri(JSONObject jSONObject, String str) {
                C3156lr c3156lr = C3156lr.this;
                c3156lr.m13177ri(jSONObject, c3156lr.jbs);
                C3156lr.this.f10382qt.mo11832lr(str);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public void m13179ri(View view) {
        this.f10372aw = view;
    }

    @Override // com.bytedance.sdk.openadsdk.core.p200co.p207ka.C3157ri.ri
    /* JADX INFO: renamed from: ri */
    public void mo13180ri(C2226aw c2226aw) {
        String strOptString = c2226aw.m7320ik().optString("type");
        strOptString.hashCode();
        switch (strOptString) {
            case "privacy":
                if (this.f10377ik != null && !TextUtils.isEmpty(C3299nr.m14639ka().feb())) {
                    TTWebsiteActivity.m10758ri(this.f10377ik, this.f10378ka, this.f10374co);
                    break;
                }
                break;
            case "close":
                InterfaceC3188ri interfaceC3188ri = this.f10383sf;
                if (interfaceC3188ri != null) {
                    interfaceC3188ri.mo11838lr();
                    break;
                }
                break;
            case "creative":
                if (this.f10377ik != null && this.f10378ka != null) {
                    m13173lr();
                    ComponentCallbacks2 componentCallbacks2 = this.f10377ik;
                    if (componentCallbacks2 instanceof InterfaceC3118lr) {
                        ((InterfaceC3118lr) componentCallbacks2).gcp();
                    }
                    m13175ri(c2226aw, this.f10378ka);
                    break;
                }
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.slm
    /* JADX INFO: renamed from: ri */
    public void mo7435ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10381nr = System.currentTimeMillis();
            this.bgr = motionEvent.getRawX();
            this.f10384vr = motionEvent.getRawY();
            this.f10371ac = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.bgr) >= f10370ri || Math.abs(motionEvent.getRawY() - this.f10384vr) >= f10370ri) {
                this.f10371ac = false;
                return;
            }
            return;
        }
        this.slm = motionEvent.getRawX();
        this.f10373bu = motionEvent.getRawY();
        if (Math.abs(this.slm - this.bgr) >= f10370ri || Math.abs(this.f10373bu - this.f10384vr) >= f10370ri) {
            this.f10371ac = false;
        }
        this.tan = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ri */
    public void m13181ri(InterfaceC3188ri interfaceC3188ri) {
        this.f10383sf = interfaceC3188ri;
    }
}
