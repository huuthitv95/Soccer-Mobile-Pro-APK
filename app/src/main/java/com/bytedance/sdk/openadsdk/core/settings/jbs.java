package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2009lr;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3112ay;
import com.bytedance.sdk.openadsdk.core.C3129co;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3300oh;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.jbs.C3390ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3529fi;
import com.bytedance.sdk.openadsdk.utils.C3566dw;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractRunnableC2676ik {

    /* JADX INFO: renamed from: ik */
    private final Set<InterfaceC3312fi> f11569ik;

    /* JADX INFO: renamed from: lr */
    private final C3319mj f11570lr;

    /* JADX INFO: renamed from: ri */
    private final InterfaceC3316ri f11571ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.jbs$ri */
    public interface InterfaceC3316ri {
        /* JADX INFO: renamed from: ri */
        void mo14781ri(boolean z);
    }

    public jbs(InterfaceC3316ri interfaceC3316ri, C3319mj c3319mj, InterfaceC3312fi... interfaceC3312fiArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.f11569ik = hashSet;
        this.f11571ri = interfaceC3316ri;
        this.f11570lr = c3319mj;
        hashSet.addAll(Arrays.asList(interfaceC3312fiArr));
    }

    /* JADX INFO: renamed from: lr */
    private JSONObject m14775lr(JSONObject jSONObject) {
        return C3112ay.m12608ri(PangleEncryptConstant.CryptDataScene.SETTINGS, jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m14777ri(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            C3322sf c3322sfM14639ka = C3299nr.m14639ka();
            jSONObject.put(C11540L6.f24899B, Build.MODEL);
            jSONObject.put("device_city", C3571ig.wjv());
            C3369ri.m15224ri().m15232ri(jSONObject);
            if (C3307lr.m14718ri().m14733sf()) {
                jSONObject.put("pa_consent", C3304qt.m14669lr().m14696qt());
            }
            if (c3322sfM14639ka.igq("mcc")) {
                jSONObject.put("mcc", C3566dw.m16385lr());
            }
            Context contextM14642ri = C3299nr.m14642ri();
            jSONObject.put("conn_type", C3571ig.xha(i));
            jSONObject.put(C11540L6.f24911F, 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", C3089aw.m12375lr());
            jSONObject.put("time_zone", C3571ig.m16492su());
            jSONObject.put("package_name", C3571ig.m16435di());
            jSONObject.put(C11744X3.i.f26338L, C3571ig.m16489ri() ? 1 : 2);
            jSONObject.put("app_version", C3571ig.m16461mj());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", C3089aw.m12373ik(contextM14642ri));
            String strM14689ka = C3304qt.m14669lr().m14689ka();
            if (strM14689ka != null) {
                jSONObject.put("app_id", strM14689ka);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", jCurrentTimeMillis);
            jSONObject.put("req_sign", C2717fi.m10220ri(strM14689ka != null ? strM14689ka.concat(String.valueOf(jCurrentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", C3322sf.m14820lr(contextM14642ri));
            jSONObject.put("tcf_gdpr", C3322sf.m14822ri(contextM14642ri));
            jSONObject.put("lmt", DeviceUtils.m16322ik());
            jSONObject.put("locale_language", DeviceUtils.m16328ka());
            jSONObject.put("channel", C11744X3.i.f26354Z);
            JSONObject jSONObjectM14838di = c3322sfM14639ka.m14838di();
            if (jSONObjectM14838di != null) {
                jSONObject.put("digest", jSONObjectM14838di);
            }
            jSONObject.put("data_time", c3322sfM14639ka.xha());
            jSONObject.put("app_set_id_scope", C3317ka.m14784lr());
            jSONObject.put("app_set_id", C3317ka.m14782ik());
            jSONObject.put("installed_source", C3317ka.m14783ka());
            jSONObject.put("did", C3089aw.m12377ri(C3299nr.m14642ri()));
            jSONObject.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
            String strXha = C3304qt.m14669lr().xha();
            if (!TextUtils.isEmpty(strXha)) {
                jSONObject.put("mediation", strXha);
            }
            jSONObject.put(C11744X3.i.f26328G, DeviceUtils.m16344ri(contextM14642ri, true));
            jSONObject.put("adx_id", C3304qt.m14669lr().m14702uq());
            jSONObject.put("user_compliance_status", C3307lr.m14718ri().m14727mj());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m14779ri(String str, Map<String, String> map) {
        int i = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap map2 = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        map2.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                String str2 = (String) map2.get("active-control");
                if (str2 != null) {
                    int i2 = Integer.parseInt(str2);
                    String str3 = (String) map2.get("ts");
                    if (str3 != null) {
                        long j = Long.parseLong(str3);
                        String str4 = (String) map2.get("pst");
                        String strM6445ri = C2009lr.m6445ri(str + i2 + j);
                        if (strM6445ri != null && strM6445ri.equalsIgnoreCase(str4)) {
                            i = i2;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        xha.m14906ri(i);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m14780ri(JSONObject jSONObject) {
        this.f11570lr.mo14756ri(jSONObject);
        for (InterfaceC3312fi interfaceC3312fi : this.f11569ik) {
            if (interfaceC3312fi != null) {
                interfaceC3312fi.mo14756ri(jSONObject);
            }
        }
        return this.f11570lr.f11605ik;
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("TTAD.SdkSettingsFetch", "Start Try");
        int iM10293ri = C2728su.m10293ri(C3299nr.m14642ri(), 0L);
        if (iM10293ri == 0) {
            Log.d("TTAD.SdkSettingsFetch", "No net");
            this.f11571ri.mo14781ri(false);
            return;
        }
        JSONObject jSONObjectM14777ri = m14777ri(iM10293ri);
        C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        try {
            c2741kaM10412lr.m10365ik(C3390ka.m15343ri(c2741kaM10412lr, C3571ig.m16477ri("/api/ad/union/sdk/settings/", false, true)));
            c2741kaM10412lr.m10372lr("User-Agent", C3571ig.m16449ka());
        } catch (Exception unused) {
        }
        String string = m14775lr(jSONObjectM14777ri).toString();
        if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
            C3571ig.m16485ri("Pangle_Debug_Mode", string, C3299nr.m14642ri());
        }
        c2741kaM10412lr.m10388ri(string, C3299nr.m14639ka().m14833bu());
        c2741kaM10412lr.m10373ri(6);
        c2741kaM10412lr.m10371lr("setting");
        C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.1
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("settings_fetch");
                return c3481ri;
            }
        });
        c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                JSONObject jSONObject;
                int iM10359ri = c2739lr.m10359ri();
                String strM10357ka = c2739lr.m10357ka();
                if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
                    C3571ig.m16485ri("Pangle_Debug_Mode", strM10357ka, C3299nr.m14642ri());
                }
                if (c2739lr.m10354di() && !TextUtils.isEmpty(strM10357ka)) {
                    try {
                        jSONObject = new JSONObject(strM10357ka);
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String strM12606ri = C3112ay.m12606ri(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                        if (!TextUtils.isEmpty(strM12606ri)) {
                            try {
                                jSONObject = new JSONObject(strM12606ri);
                            } catch (JSONException unused3) {
                            }
                        }
                        try {
                            jbs.this.m14779ri(strM12606ri, c2739lr.m10356ik());
                        } catch (Throwable unused4) {
                        }
                        try {
                            jbs.this.m14780ri(jSONObject);
                            C3299nr.m14639ka().m14878ri(System.currentTimeMillis());
                            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.1
                                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                /* JADX INFO: renamed from: ri */
                                public C3481ri mo10650ri() {
                                    C3481ri c3481ri = new C3481ri();
                                    c3481ri.m15784lr("settings_fetch");
                                    return c3481ri;
                                }
                            });
                            C3594uq.m16661lr();
                        } catch (Throwable unused5) {
                        }
                        jbs.this.f11571ri.mo14781ri(true);
                        return;
                    }
                } else if (abstractC2740ik != null) {
                    C3594uq.m16664ri(abstractC2740ik.m10363fi());
                }
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.2
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("settings_fetch");
                        return c3481ri;
                    }
                });
                if (!c2739lr.m10354di()) {
                    C3529fi.m15965ri("settings_fetch", abstractC2740ik.m10363fi(), iM10359ri, c2739lr.m10358lr(), null, null);
                }
                jbs.this.f11571ri.mo14781ri(false);
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                jbs.this.f11571ri.mo14781ri(false);
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.jbs.2.3
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("settings_fetch");
                        return c3481ri;
                    }
                });
                if (abstractC2740ik != null) {
                    C3594uq.m16664ri(abstractC2740ik.m10363fi());
                    C3529fi.m15965ri("settings_fetch", abstractC2740ik.m10363fi(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                }
            }
        });
        C3129co.m13031lr(C3089aw.m12377ri(C3299nr.m14642ri()));
        DeviceUtils.m16316co();
    }
}
