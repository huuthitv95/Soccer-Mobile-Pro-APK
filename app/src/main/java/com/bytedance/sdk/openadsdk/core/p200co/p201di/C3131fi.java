package com.bytedance.sdk.openadsdk.core.p200co.p201di;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.C2267ik;
import com.bytedance.adsdk.ugeno.core.C2226aw;
import com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik;
import com.bytedance.adsdk.ugeno.p094ik.C2268lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.tan;
import com.bytedance.sdk.openadsdk.core.widget.InterfaceC3338fi;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.di.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3131fi {

    /* JADX INFO: renamed from: aw */
    private boolean f10213aw;
    private boolean bgr;

    /* JADX INFO: renamed from: co */
    private final JSONObject f10214co;

    /* JADX INFO: renamed from: fi */
    private AbstractViewOnTouchListenerC2318ik f10216fi;

    /* JADX INFO: renamed from: ik */
    private AbstractViewOnTouchListenerC2318ik f10217ik;
    private final String jbs;

    /* JADX INFO: renamed from: ka */
    private AbstractViewOnTouchListenerC2318ik f10218ka;

    /* JADX INFO: renamed from: mj */
    private final wjv f10220mj;

    /* JADX INFO: renamed from: qt */
    private InterfaceC3338fi f10221qt;

    /* JADX INFO: renamed from: sf */
    private JSONObject f10223sf;
    private JSONArray slm;

    /* JADX INFO: renamed from: vr */
    private boolean f10224vr;
    private final Context xha;

    /* JADX INFO: renamed from: ri */
    private int f10222ri = -1;

    /* JADX INFO: renamed from: lr */
    private int f10219lr = -1;

    /* JADX INFO: renamed from: di */
    private final String f10215di = "UGenSwiperEvent";

    public C3131fi(Context context, wjv wjvVar, String str, JSONObject jSONObject) {
        this.xha = context;
        this.f10220mj = wjvVar;
        this.jbs = str;
        this.f10214co = jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    private Context m13048ri(View view) {
        Activity activityM10240ri = view != null ? C2722lr.m10240ri(view) : null;
        return activityM10240ri == null ? this.xha : activityM10240ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13049ri(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i);
        } catch (Throwable unused) {
        }
        C3414ik.m15522lr(this.f10220mj, this.jbs, "carousel_show", jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    private void m13050ri(TextView textView, int i) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    /* JADX INFO: renamed from: ri */
    private void m13052ri(JSONObject jSONObject, View view) {
        if (m13055ri(jSONObject.optInt("landingStyle"), jSONObject.optString("url"), jSONObject.optString(MessengerShareContentUtility.FALLBACK_URL))) {
            tan.m14973ri(m13048ri(view), this.xha instanceof Activity, jSONObject, this.f10220mj, this.jbs, C3571ig.m16470ri(this.jbs), null, this.f10221qt);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13053ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.f10223sf = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.f10223sf.putOpt(next, C2268lr.m7663ri((String) this.f10223sf.opt(next), jSONObject2));
                } catch (Throwable unused) {
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.f10223sf);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m13054ri(boolean z, boolean z2, boolean z3) {
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10217ik;
        if (abstractViewOnTouchListenerC2318ik == null || this.f10218ka == null) {
            return;
        }
        View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
        View viewM7879sf2 = this.f10218ka.m7879sf();
        JSONArray jSONArray = this.slm;
        if (jSONArray != null && jSONArray.length() == 1) {
            viewM7879sf.setVisibility(8);
            viewM7879sf2.setVisibility(8);
            return;
        }
        if (z) {
            return;
        }
        if (z2) {
            if (viewM7879sf instanceof TextView) {
                m13050ri((TextView) viewM7879sf, 90);
            }
            if (viewM7879sf2 instanceof TextView) {
                m13050ri((TextView) viewM7879sf2, 255);
                return;
            }
            return;
        }
        if (z3) {
            if (viewM7879sf instanceof TextView) {
                m13050ri((TextView) viewM7879sf, 255);
            }
            if (viewM7879sf2 instanceof TextView) {
                m13050ri((TextView) viewM7879sf2, 90);
                return;
            }
            return;
        }
        if (viewM7879sf instanceof TextView) {
            m13050ri((TextView) viewM7879sf, 255);
        }
        if (viewM7879sf2 instanceof TextView) {
            m13050ri((TextView) viewM7879sf2, 255);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001f  */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[RETURN] */
    /* JADX INFO: renamed from: ri */
    private boolean m13055ri(int i, String str, String str2) {
        if (i == 1) {
            if (!C2724nr.m10260ri(str)) {
                return false;
            }
        } else if (i != 2) {
            if (i == 3) {
                if (!C2724nr.m10260ri(str)) {
                    return false;
                }
            }
        } else if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || !C2724nr.m10260ri(str2)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    public void m13057ik() {
        int i;
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10216fi;
        if (!(abstractViewOnTouchListenerC2318ik instanceof C2267ik) || (i = this.f10222ri) == -1) {
            return;
        }
        ((C2267ik) abstractViewOnTouchListenerC2318ik).m7659ri(i + 1);
    }

    /* JADX INFO: renamed from: ka */
    public JSONObject m13058ka() {
        return this.f10223sf;
    }

    /* JADX INFO: renamed from: lr */
    public void m13059lr() {
        int i;
        AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = this.f10216fi;
        if (!(abstractViewOnTouchListenerC2318ik instanceof C2267ik) || (i = this.f10222ri) == -1) {
            return;
        }
        ((C2267ik) abstractViewOnTouchListenerC2318ik).m7659ri(i - 1);
    }

    /* JADX INFO: renamed from: ri */
    public void m13060ri() {
        m13054ri(this.f10213aw, this.bgr, this.f10224vr);
    }

    /* JADX INFO: renamed from: ri */
    public void m13061ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
        AbstractViewOnTouchListenerC2318ik<T> abstractViewOnTouchListenerC2318ikM7839fi = abstractViewOnTouchListenerC2318ik.m7839fi("swiperLayout");
        this.f10216fi = abstractViewOnTouchListenerC2318ikM7839fi;
        if (abstractViewOnTouchListenerC2318ikM7839fi instanceof C2267ik) {
            this.slm = this.f10214co.optJSONArray("dpa_data");
            this.f10217ik = abstractViewOnTouchListenerC2318ik.m7839fi("swiperLeftArrow");
            this.f10218ka = abstractViewOnTouchListenerC2318ik.m7839fi("swiperRightArrow");
            ((C2267ik) this.f10216fi).m7660ri(new InterfaceC2249ik() { // from class: com.bytedance.sdk.openadsdk.core.co.di.fi.1
                @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
                /* JADX INFO: renamed from: ri */
                public void mo7471ri(boolean z, int i) {
                }

                @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
                /* JADX INFO: renamed from: ri */
                public void mo7472ri(boolean z, int i, float f, int i2) {
                }

                @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
                /* JADX INFO: renamed from: ri */
                public void mo7473ri(boolean z, int i, int i2, boolean z2, boolean z3) {
                    C3131fi.this.f10219lr = i;
                    C3131fi.this.f10222ri = i2;
                    C3131fi.this.f10213aw = z;
                    C3131fi.this.bgr = z2;
                    C3131fi.this.f10224vr = z3;
                    C3131fi.this.m13054ri(z, z2, z3);
                    C3131fi.this.m13049ri(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13062ri(InterfaceC3338fi interfaceC3338fi) {
        this.f10221qt = interfaceC3338fi;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m13063ri(C2226aw c2226aw) {
        JSONObject jSONObjectOptJSONObject;
        this.f10223sf = null;
        int i = this.f10219lr;
        if (i != -1 && i != 0) {
            try {
                JSONObject jSONObjectM7320ik = c2226aw.m7320ik();
                if (jSONObjectM7320ik != null && (jSONObjectOptJSONObject = jSONObjectM7320ik.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.slm != null) {
                            String strM7663ri = C2268lr.m7663ri(jSONObjectOptJSONObject.optString("url"), this.slm.optJSONObject(this.f10219lr));
                            String strM7663ri2 = C2268lr.m7663ri(jSONObjectOptJSONObject.optString(MessengerShareContentUtility.FALLBACK_URL), this.slm.optJSONObject(this.f10219lr));
                            jSONObjectOptJSONObject.put("url", strM7663ri);
                            jSONObjectOptJSONObject.put(MessengerShareContentUtility.FALLBACK_URL, strM7663ri2);
                            m13053ri(jSONObjectOptJSONObject, this.slm.optJSONObject(this.f10219lr));
                        }
                        m13052ri(jSONObjectOptJSONObject, c2226aw.m7324ri().m7879sf());
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("UGenSwiperEvent", th.getMessage());
            }
        }
        return false;
    }
}
