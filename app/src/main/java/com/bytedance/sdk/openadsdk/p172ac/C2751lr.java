package com.bytedance.sdk.openadsdk.p172ac;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.p124ka.C2498ri;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p145fi.InterfaceC2622mj;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p145fi.slm;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2646co;
import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj;
import com.bytedance.sdk.component.p160lr.p161ri.bgr;
import com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.C2670ri;
import com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2664fi;
import com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2669qt;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.xha.C2744ri;
import com.bytedance.sdk.openadsdk.core.C3213fr;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p172ac.p173ri.C2753ik;
import com.bytedance.sdk.openadsdk.p251qt.C3490ik;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2751lr {

    /* JADX INFO: renamed from: ri */
    private static volatile C2751lr f7924ri;

    /* JADX INFO: renamed from: ik */
    private C2753ik f7925ik;

    /* JADX INFO: renamed from: ka */
    private final Map<String, JSONObject> f7926ka = new HashMap();

    /* JADX INFO: renamed from: lr */
    private final C2744ri f7927lr;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.lr$ri */
    public class ri implements InterfaceC2659mj {
        public ri() {
        }

        @Override // com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2659mj
        /* JADX INFO: renamed from: ri */
        public bgr mo9974ri(InterfaceC2659mj.ri riVar) throws IOException {
            JSONObject jSONObjectM10465ri;
            AbstractC2646co abstractC2646coMo9976ri = riVar.mo9976ri();
            if (abstractC2646coMo9976ri.mo9886ka() != null && !abstractC2646coMo9976ri.mo9886ka().m10028ka().isEmpty()) {
                List<String> listM10028ka = abstractC2646coMo9976ri.mo9886ka().m10028ka();
                StringBuilder sb = new StringBuilder();
                for (String str : listM10028ka) {
                    sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                    sb.append(str);
                }
                String string = sb.toString();
                if (!TextUtils.isEmpty(string)) {
                    if (string.equals("/monitor/collect/c/session")) {
                        return riVar.mo9975ri(abstractC2646coMo9976ri);
                    }
                    if (string.equals("/api/ad/union/sdk/register_status/") || string.equals("/api/ad/union/sdk/compliance_status/")) {
                        return riVar.mo9975ri(abstractC2646coMo9976ri);
                    }
                }
            }
            AbstractC2646co.ri riVarM9892sf = abstractC2646coMo9976ri.m9892sf();
            String strM16058lr = C3535ri.m16058lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strM16058lr) && (jSONObjectM10465ri = C2751lr.this.m10465ri(strM16058lr)) != null) {
                riVarM9892sf.m9897lr("transfer-param", jSONObjectM10465ri.optString("message"));
                if (jSONObjectM10465ri.optInt("cypher") == 4) {
                    riVarM9892sf.m9897lr("cypher", "4");
                } else {
                    riVarM9892sf.m9897lr("cypher", ExifInterface.GPS_MEASUREMENT_3D);
                }
            }
            try {
                riVarM9892sf.m9897lr("x-pangle-target-idc", C3322sf.m14819lr().tpb());
            } catch (Throwable unused) {
            }
            return riVar.mo9975ri(riVarM9892sf.m9898lr());
        }
    }

    private C2751lr(Context context) {
        long jM10468ri = m10468ri();
        C2744ri c2744riM10422ri = new C2744ri.ri().m10419ri(jM10468ri, TimeUnit.MILLISECONDS).m10418lr(jM10468ri, TimeUnit.MILLISECONDS).m10417ik(jM10468ri, TimeUnit.MILLISECONDS).m10420ri(new ri()).m10421ri(true).m10422ri();
        this.f7927lr = c2744riM10422ri;
        C2670ri.m10005ri(new InterfaceC2669qt() { // from class: com.bytedance.sdk.openadsdk.ac.lr.1
            @Override // com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2669qt
            /* JADX INFO: renamed from: lr */
            public boolean mo10003lr() {
                return C3322sf.m14819lr().hws();
            }

            @Override // com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2669qt
            /* JADX INFO: renamed from: ri */
            public ExecutorService mo10004ri() {
                if (C3322sf.m14819lr().hws()) {
                    return dzy.m16413sf();
                }
                return null;
            }
        });
        C2744ri.m10408ri(new InterfaceC2664fi() { // from class: com.bytedance.sdk.openadsdk.ac.lr.2
            @Override // com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri.InterfaceC2664fi
            /* JADX INFO: renamed from: ri */
            public boolean mo9980ri() {
                return C3606fi.m16703ri("net_http_protocol", 0) == 1;
            }
        });
        C2744ri.m10409ri(new C2744ri.lr() { // from class: com.bytedance.sdk.openadsdk.ac.lr.3
            @Override // com.bytedance.sdk.component.xha.C2744ri.lr
            /* JADX INFO: renamed from: ri */
            public boolean mo10413ri() {
                return C3578lr.m16537ri();
            }
        });
        AbstractC2650ka abstractC2650kaMo9986ri = c2744riM10422ri.xha().mo9986ri();
        if (abstractC2650kaMo9986ri != null) {
            abstractC2650kaMo9986ri.mo9921ri(32);
        }
    }

    /* JADX INFO: renamed from: fi */
    private void m10462fi() {
        if (this.f7925ik == null) {
            this.f7925ik = new C2753ik();
        }
    }

    /* JADX INFO: renamed from: lr */
    public static C2751lr m10463lr() {
        if (f7924ri == null) {
            synchronized (C2751lr.class) {
                if (f7924ri == null) {
                    f7924ri = new C2751lr(C3299nr.m14642ri());
                }
            }
        }
        return f7924ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public JSONObject m10465ri(String str) {
        JSONObject jSONObject = this.f7926ka.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new C3213fr(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.f7926ka.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    /* JADX INFO: renamed from: ik */
    public C2744ri m10466ik() {
        return this.f7927lr;
    }

    /* JADX INFO: renamed from: ka */
    public C2753ik m10467ka() {
        m10462fi();
        return this.f7925ik;
    }

    /* JADX INFO: renamed from: ri */
    public int m10468ri() {
        try {
            return C3606fi.m16703ri("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10469ri(int i, final ImageView imageView, final wjv wjvVar) {
        if (wjvVar == null || !TextUtils.isEmpty(wjvVar.ihz())) {
            C3491ka.m15834ri(wjvVar.ihz()).mo9660ri(i).mo9655lr(i).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(1).mo9658ri(C3490ik.m15828ri(wjvVar, wjvVar.ihz(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ac.lr.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strM14542uq = wjvVar.m14542uq();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strM14542uq));
                            try {
                                C2722lr.m10241ri(C3299nr.m14642ri(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10470ri(C3286nr c3286nr, ImageView imageView, wjv wjvVar) {
        if (c3286nr == null || TextUtils.isEmpty(c3286nr.m14220ri()) || imageView == null) {
            return;
        }
        C3491ka.m15833ri(c3286nr).mo9652ik(1).mo9658ri(C3490ik.m15828ri(wjvVar, c3286nr.m14220ri(), imageView));
    }

    /* JADX INFO: renamed from: ri */
    public void m10471ri(C3286nr c3286nr, ImageView imageView, wjv wjvVar, slm slmVar) {
        if (c3286nr == null || TextUtils.isEmpty(c3286nr.m14220ri()) || imageView == null) {
            return;
        }
        C3491ka.m15833ri(c3286nr).mo9652ik(1).mo9658ri(C3490ik.m15829ri(wjvVar, c3286nr.m14220ri(), imageView, slmVar));
    }

    /* JADX INFO: renamed from: ri */
    public void m10472ri(String str, int i, int i2, ImageView imageView, wjv wjvVar) {
        C3491ka.m15834ri(str).mo9660ri(i).mo9655lr(i2).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(1).mo9658ri(C3490ik.m15828ri(wjvVar, str, imageView));
    }

    /* JADX INFO: renamed from: ri */
    public void m10473ri(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        C3491ka.m15834ri(str).mo9652ik(2).mo9663ri(new InterfaceC2622mj() { // from class: com.bytedance.sdk.openadsdk.ac.lr.6
            @Override // com.bytedance.sdk.component.p145fi.InterfaceC2622mj
            /* JADX INFO: renamed from: ri */
            public Bitmap mo8253ri(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return C2498ri.m8826ri(view2.getContext(), bitmap, 10);
            }
        }).mo9658ri(new slm() { // from class: com.bytedance.sdk.openadsdk.ac.lr.5
            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8254ri(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
                final View view2;
                if (interfaceC2630sf == null) {
                    return;
                }
                final Object objMo9673lr = interfaceC2630sf.mo9673lr();
                if (!(objMo9673lr instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!dzy.m16391di()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ac.lr.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objMo9673lr));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objMo9673lr));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objMo9673lr));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objMo9673lr));
                }
            }
        });
    }
}
