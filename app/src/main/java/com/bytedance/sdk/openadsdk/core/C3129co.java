package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2724nr;
import com.bytedance.sdk.component.utils.C2728su;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3438ri;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3529fi;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co */
/* JADX INFO: loaded from: classes3.dex */
public class C3129co {

    /* JADX INFO: renamed from: ri */
    private static final AtomicInteger f10198ri = new AtomicInteger(0);

    /* JADX INFO: renamed from: lr */
    private static final AtomicBoolean f10197lr = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co$ri */
    private static class ri implements C2728su.ri {

        /* JADX INFO: renamed from: ri */
        private static final AtomicBoolean f10208ri = new AtomicBoolean(false);

        /* JADX INFO: renamed from: lr */
        private static volatile long f10207lr = -1;

        private ri() {
        }

        /* JADX INFO: renamed from: ri */
        public static void m13038ri() {
            if (f10208ri.compareAndSet(false, true)) {
                f10207lr = System.currentTimeMillis();
                C2728su.m10298ri(new ri(), C3299nr.m14642ri());
            }
        }

        /* JADX INFO: renamed from: lr */
        public void m13039lr() {
            C2728su.m10297ri(this);
        }

        @Override // com.bytedance.sdk.component.utils.C2728su.ri
        /* JADX INFO: renamed from: ri */
        public void mo10299ri(Context context, Intent intent, boolean z, int i) {
            if (System.currentTimeMillis() - f10207lr >= 2000 && i != 0) {
                C3129co.m13028ik();
                C3129co.m13031lr(C3089aw.m12377ri(C3299nr.m14642ri()));
                m13039lr();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m13028ik() {
        f10198ri.set(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public static void m13029ka() {
        if (f10198ri.getAndIncrement() <= 0) {
            com.bytedance.sdk.openadsdk.utils.dzy.m16408ri().schedule(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.2
                @Override // java.lang.Runnable
                public void run() {
                    C3129co.m13031lr(C3089aw.m12377ri(C3299nr.m14642ri()));
                }
            }, 10000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m13031lr(final String str) {
        if (C3307lr.m14718ri().m14722fi()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.dzy.m16401lr(new AbstractRunnableC2676ik("ipv6") { // from class: com.bytedance.sdk.openadsdk.core.co.1
            @Override // java.lang.Runnable
            public void run() {
                final String strTan = C3571ig.tan();
                C3521ka.m15943ri(0, strTan);
                C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.1
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
                if (TextUtils.isEmpty(strTan)) {
                    C3521ka.m15944ri(-1, strTan, -1, "url is null");
                    C3529fi.m15965ri("ipv6", "", -2, "url is null", null, null);
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.2
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("ipv6");
                            return c3481ri;
                        }
                    });
                    return;
                }
                C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
                try {
                    c2741kaM10412lr.m10365ik(strTan);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("connect_type", C2728su.m10293ri(C3299nr.m14642ri(), 0L));
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("device_id", Long.parseLong(str));
                    }
                    jSONObject.put("header", C3438ri.m15689ri().m15695lr());
                    JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new C3213fr(PangleEncryptConstant.CryptDataScene.DUAL_EVENT));
                    if (jSONObjectEncryptType4 == null || jSONObjectEncryptType4.optInt("cypher") != 4) {
                        C3330su.m14968lr(false);
                    } else {
                        C3330su.m14968lr(true);
                        c2741kaM10412lr.m10372lr("x-pgli18n", "4");
                        c2741kaM10412lr.m10372lr("Content-Type", "application/json; charset=utf-8");
                    }
                    if (C3129co.m13033lr(jSONObjectEncryptType4)) {
                        jSONObject = jSONObjectEncryptType4;
                    }
                    c2741kaM10412lr.m10372lr("Content-Type", "application/json; charset=utf-8");
                    c2741kaM10412lr.m10372lr("User-Agent", C3571ig.m16449ka());
                    c2741kaM10412lr.m10390ri(jSONObject);
                    c2741kaM10412lr.m10373ri(6);
                    c2741kaM10412lr.m10371lr("send_i_p_v6");
                    c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3
                        @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                        /* JADX INFO: renamed from: ri */
                        public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                            if (c2739lr.m10354di()) {
                                C3129co.m13032lr(c2739lr.m10357ka(), strTan);
                                return;
                            }
                            C3521ka.m15944ri(-1, strTan, c2739lr.m10359ri(), c2739lr.m10358lr());
                            C3529fi.m15965ri("ipv6", strTan, c2739lr.m10359ri(), c2739lr.m10358lr(), null, null);
                            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3.1
                                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                /* JADX INFO: renamed from: ri */
                                public C3481ri mo10650ri() {
                                    C3481ri c3481ri = new C3481ri();
                                    c3481ri.m15784lr("ipv6");
                                    return c3481ri;
                                }
                            });
                            C3129co.m13029ka();
                        }

                        @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                        /* JADX INFO: renamed from: ri */
                        public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                            if (iOException != null) {
                                C3521ka.m15944ri(-1, strTan, 1, iOException.getMessage());
                                C3529fi.m15965ri("ipv6", strTan, -1, iOException.getMessage(), null, null);
                                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.3.2
                                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                    /* JADX INFO: renamed from: ri */
                                    public C3481ri mo10650ri() {
                                        C3481ri c3481ri = new C3481ri();
                                        c3481ri.m15784lr("ipv6");
                                        return c3481ri;
                                    }
                                });
                            }
                            C3129co.m13029ka();
                        }
                    });
                } catch (Exception e) {
                    C3521ka.m15944ri(-1, strTan, -2, e.getMessage());
                    C3529fi.m15965ri("ipv6", strTan, -3, e.getMessage(), null, null);
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.1.4
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("ipv6");
                            return c3481ri;
                        }
                    });
                    C2707ac.m10197ik("build ipv6 request failed:" + e.getMessage(), new Object[0]);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX INFO: renamed from: lr */
    public static void m13032lr(String str, String str2) {
        byte b;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("cypher") != 4) {
                C3521ka.m15944ri(-1, str2, 1, "cypher type error");
                C3529fi.m15965ri("ipv6", str2, -4, "cypher type error", null, null);
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.3
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
                return;
            }
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(jSONObject.optString("message"));
            if (pairDecryptType4.second == null) {
                int iIntValue = ((Integer) pairDecryptType4.first).intValue();
                C3521ka.m15944ri(-1, str2, 2, "decrypt failed ".concat(String.valueOf(iIntValue)));
                C3529fi.m15965ri("ipv6", str2, -5, "decrypt failed ".concat(String.valueOf(iIntValue)), null, null);
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.4
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
                return;
            }
            JSONObject jSONObject2 = new JSONObject((String) pairDecryptType4.second);
            String strOptString = jSONObject2.optString("ip_type");
            int iHashCode = strOptString.hashCode();
            if (iHashCode != 3239397) {
                if (iHashCode != 3239399) {
                    if (iHashCode == 1959784951 && strOptString.equals("invalid")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strOptString.equals("ipv6")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (strOptString.equals("ipv4")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                if (!jSONObject2.has("ip")) {
                    C3521ka.m15944ri(-1, str2, 4, "no ip");
                    C3529fi.m15965ri("ipv6", str2, -6, "no ip", null, null);
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.6
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("ipv6");
                            return c3481ri;
                        }
                    });
                    return;
                }
                String strOptString2 = jSONObject2.optString("ip");
                C3535ri.m16077ri("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                C3535ri.m16072ri("ttopenadsdk", "key_ipv4");
                HashMap map = new HashMap();
                map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strOptString2);
                C3324ik.m14919ri(map);
                C3521ka.m15943ri(1, str2);
                C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.5
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
                return;
            }
            if (b != 1) {
                if (b != 2) {
                    C3521ka.m15944ri(-1, str2, 3, "no ip type ");
                    C3529fi.m15965ri("ipv6", str2, -7, "no ip type ", null, null);
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.9
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("ipv6");
                            return c3481ri;
                        }
                    });
                    return;
                }
                return;
            }
            if (!jSONObject2.has("ip")) {
                C3521ka.m15944ri(-1, str2, 4, "no ip");
                C3529fi.m15965ri("ipv6", str2, -6, "no ip", null, null);
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.8
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
            } else {
                C3535ri.m16077ri("ttopenadsdk", "key_ipv4", jSONObject2.optString("ip"));
                C3535ri.m16072ri("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6);
                C3521ka.m15943ri(1, str2);
                C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.7
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("ipv6");
                        return c3481ri;
                    }
                });
            }
        } catch (JSONException unused) {
            C3521ka.m15944ri(-1, str2, 2, "decrypt failed, wrong data ");
            C3529fi.m15965ri("ipv6", str2, -8, "decrypt failed, wrong data ", null, null);
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.co.10
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("ipv6");
                    return c3481ri;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static boolean m13033lr(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: renamed from: ri */
    public static void m13035ri(String str) {
        AtomicBoolean atomicBoolean = f10197lr;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!C2724nr.m10258mj(C3299nr.m14642ri())) {
                atomicBoolean.set(false);
            } else {
                ri.m13038ri();
                m13031lr(str);
            }
        }
    }
}
