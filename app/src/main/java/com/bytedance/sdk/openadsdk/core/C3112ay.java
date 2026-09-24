package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.xha.C2009lr;
import com.bytedance.sdk.component.adexpress.p122fi.C2483fi;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2517lr;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.p145fi.InterfaceC2630sf;
import com.bytedance.sdk.component.p160lr.p161ri.C2660qt;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.C2726ri;
import com.bytedance.sdk.component.utils.C2730vr;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.component.xha.p170lr.C2741ka;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2745lr;
import com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.C2945ik;
import com.bytedance.sdk.openadsdk.core.jbs.C3228co;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.C3297xd;
import com.bytedance.sdk.openadsdk.core.p190aw.p191ik.C3094ka;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3184ri;
import com.bytedance.sdk.openadsdk.core.p218fi.C3212ri;
import com.bytedance.sdk.openadsdk.core.p222lr.C3268ri;
import com.bytedance.sdk.openadsdk.core.p223mj.C3271lr;
import com.bytedance.sdk.openadsdk.core.p224qt.C3307lr;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.jbs.C3390ka;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p236ka.C3400fi;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.p246nr.C3476ik;
import com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;
import com.bytedance.sdk.openadsdk.p251qt.C3491ka;
import com.bytedance.sdk.openadsdk.p251qt.C3492lr;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3529fi;
import com.bytedance.sdk.openadsdk.tan.p263ka.C3535ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3594uq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import com.ironsource.C12538u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ay */
/* JADX INFO: loaded from: classes3.dex */
public class C3112ay implements wjv<C3430ri> {

    /* JADX INFO: renamed from: ri */
    private final Context f9893ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ay$lr */
    public static class lr {

        /* JADX INFO: renamed from: ik */
        public final C3297xd f9936ik;

        /* JADX INFO: renamed from: lr */
        public final boolean f9937lr;

        /* JADX INFO: renamed from: ri */
        public final int f9938ri;

        private lr(int i, boolean z, C3297xd c3297xd) {
            this.f9938ri = i;
            this.f9937lr = z;
            this.f9936ik = c3297xd;
        }

        /* JADX INFO: renamed from: ri */
        public static lr m12644ri(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
            boolean zOptBoolean = jSONObject.optBoolean("verify");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            C3297xd c3297xd = new C3297xd();
            if (jSONObjectOptJSONObject != null) {
                try {
                    c3297xd.m14607ri(jSONObjectOptJSONObject.optInt("reason"));
                    c3297xd.m14605lr(jSONObjectOptJSONObject.optInt("corp_type"));
                    c3297xd.m14603ik(jSONObjectOptJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    c3297xd.m14608ri(jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    C2707ac.m10196ik("NetApiImpl", th.getMessage());
                }
            }
            return new lr(iOptInt, zOptBoolean, c3297xd);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ay$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        final int f9939di;

        /* JADX INFO: renamed from: fi */
        final String f9940fi;

        /* JADX INFO: renamed from: ik */
        final long f9941ik;
        final String jbs;

        /* JADX INFO: renamed from: ka */
        final int f9942ka;

        /* JADX INFO: renamed from: lr */
        final long f9943lr;

        /* JADX INFO: renamed from: mj */
        public final C3289ri f9944mj;

        /* JADX INFO: renamed from: qt */
        final ArrayList<Integer> f9945qt;

        /* JADX INFO: renamed from: ri */
        final int f9946ri;
        final String xha;

        private ri(String str, int i, int i2, String str2, int i3, String str3, C3289ri c3289ri, long j, long j2, ArrayList<Integer> arrayList) {
            this.f9946ri = i;
            this.f9942ka = i2;
            this.f9940fi = str2;
            this.xha = str3;
            this.f9944mj = c3289ri;
            this.jbs = str;
            this.f9939di = i3;
            this.f9943lr = j;
            this.f9941ik = j2;
            this.f9945qt = arrayList;
        }

        /* JADX INFO: renamed from: ri */
        public static ri m12645ri(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
            String strOptString = jSONObject.optString("did");
            int iOptInt = jSONObject.optInt("processing_time_ms");
            long jOptLong = jSONObject.optLong("s_receive_ts");
            long jOptLong2 = jSONObject.optLong("s_send_ts");
            int iOptInt2 = jSONObject.optInt("status_code");
            String strOptString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String strOptString3 = jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            int iOptInt3 = jSONObject.optInt("reason");
            Pair<C3289ri, ArrayList<Integer>> pairM13902ri = C3267lr.m13902ri(jSONObject, adSlot, igqVar);
            return pairM13902ri == null ? new ri(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, null, jOptLong, jOptLong2, null) : new ri(strOptString, iOptInt, iOptInt2, strOptString2, iOptInt3, strOptString3, (C3289ri) pairM13902ri.first, jOptLong, jOptLong2, (ArrayList) pairM13902ri.second);
        }
    }

    C3112ay(Context context) {
        this.f9893ri = context;
    }

    /* JADX INFO: renamed from: di */
    private boolean m12594di(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: fi */
    private Map<String, String> m12595fi(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/json; charset=utf-8");
        if (m12598ik(jSONObject)) {
            map.put(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
        }
        return map;
    }

    /* JADX INFO: renamed from: fi */
    private byte[] m12596fi(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes(C11341A5.f23802O));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e) {
                                C2707ac.m10196ik("NetApiImpl", e.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            gZIPOutputStream = gZIPOutputStream2;
                            C2707ac.m10196ik("NetApiImpl", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e3) {
                                    C2707ac.m10196ik("NetApiImpl", e3.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    C2707ac.m10196ik("NetApiImpl", e4.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                C2707ac.m10196ik("NetApiImpl", e5.toString());
                                throw th;
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e7) {
                C2707ac.m10196ik("NetApiImpl", e7.toString());
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return byteArray;
    }

    /* JADX INFO: renamed from: ik */
    public static JSONArray m12597ik(String str) {
        try {
            Set<C3184ri> setM13309ri = C3183lr.m13301ri().m13309ri(str);
            if (setM13309ri != null && setM13309ri.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (C3184ri c3184ri : setM13309ri) {
                    if (c3184ri != null && !TextUtils.isEmpty(c3184ri.m13315fi())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] strArrSplit = c3184ri.m13324ri().split("_");
                        if (strArrSplit.length == 2) {
                            jSONObject.put("id", strArrSplit[1]);
                            jSONObject.put("md5", c3184ri.m13321lr());
                            jSONArray.put(jSONObject);
                        } else {
                            continue;
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            C2707ac.m10206ri("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ik */
    private boolean m12598ik(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    /* JADX INFO: renamed from: ka */
    private void m12599ka(JSONObject jSONObject) {
        byte[] bArr;
        if (C3304qt.m14669lr().slm()) {
            try {
                jSONObject.getJSONObject("header").put(C12460ra.f31825b, "4562");
            } catch (Exception e) {
                C2707ac.m10197ik("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
            c2741kaM10412lr.m10365ik(C3571ig.ihz());
            Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(m12596fi(jSONObject.toString()));
            if (pairEncryptType4WithoutBase64 == null || pairEncryptType4WithoutBase64.second == null || ((byte[]) pairEncryptType4WithoutBase64.second).length <= 0) {
                int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                C3330su.m14968lr(false);
                C3330su.m14970ri(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                bArr = null;
            } else {
                bArr = (byte[]) pairEncryptType4WithoutBase64.second;
                C3330su.m14968lr(true);
            }
            if (bArr != null) {
                c2741kaM10412lr.m10372lr(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                c2741kaM10412lr.m10372lr("x-pgli18n", "4");
                c2741kaM10412lr.m10389ri("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject jSONObjectM10278ri = C2726ri.m10278ri(jSONObject);
                if (m12598ik(jSONObjectM10278ri)) {
                    jSONObject = jSONObjectM10278ri;
                }
                m12627ri(m12595fi(jSONObject), c2741kaM10412lr);
                c2741kaM10412lr.m10388ri(jSONObject.toString(), C3299nr.m14639ka().m14833bu());
            }
            c2741kaM10412lr.m10373ri(7);
            c2741kaM10412lr.m10371lr("et_applog");
            c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.15
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    if (c2739lr == null || !c2739lr.m10354di()) {
                        return;
                    }
                    c2739lr.m10357ka();
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    iOException.getMessage();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ka */
    private boolean m12600ka(String str) {
        if (C3271lr.m13933ri()) {
            return true;
        }
        if (!C3271lr.m13934ri(str)) {
            return false;
        }
        String strM13932lr = C3271lr.m13932lr();
        if (!TextUtils.isEmpty(strM13932lr)) {
            C3414ik.m15562ri(strM13932lr, System.currentTimeMillis());
        }
        return true;
    }

    /* JADX INFO: renamed from: lr */
    private static String m12601lr(AdSlot adSlot) {
        String strM14681co = C3304qt.m14669lr().m14681co();
        if (adSlot != null) {
            String userData = adSlot.getUserData();
            if (TextUtils.isEmpty(strM14681co)) {
                return userData;
            }
            if (!TextUtils.isEmpty(userData)) {
                HashSet hashSet = new HashSet();
                try {
                    JSONArray jSONArray = new JSONArray(userData);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject != null) {
                            hashSet.add(jSONObject.optString("name", null));
                        }
                    }
                    try {
                        JSONArray jSONArray2 = new JSONArray(strM14681co);
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                                jSONArray.put(jSONObject2);
                            }
                        }
                        return jSONArray.toString();
                    } catch (Throwable unused) {
                        return userData;
                    }
                } catch (Throwable unused2) {
                }
            }
        } else if (TextUtils.isEmpty(strM14681co)) {
            return "";
        }
        return strM14681co;
    }

    /* JADX INFO: renamed from: lr */
    public static JSONArray m12602lr(String str) {
        try {
            Set<String> setM9112lr = C2523lr.m9112lr(str);
            if (setM9112lr != null && setM9112lr.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = setM9112lr.iterator();
                while (it.hasNext()) {
                    C2517lr c2517lrM9115ri = C2523lr.m9115ri(it.next());
                    if (c2517lrM9115ri != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", c2517lrM9115ri.m9030lr());
                        jSONObject.put("md5", c2517lrM9115ri.m9026ik());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            C2707ac.m10206ri("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0081 A[Catch: JSONException -> 0x00b1, TryCatch #0 {JSONException -> 0x00b1, blocks: (B:3:0x0005, B:9:0x0047, B:11:0x0081, B:23:0x00a3, B:8:0x0030, B:5:0x002a), top: B:26:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:15:0x0096  */
    /* JADX WARN: Code duplicated, block: B:17:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
    @DungeonFlag
    /* JADX INFO: renamed from: lr */
    private JSONObject m12603lr() {
        int i;
        int rotation;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", C3304qt.m14669lr().m14689ka());
            jSONObject.put("name", C3304qt.m14669lr().m14693mj());
            xha(jSONObject);
            Context contextM14642ri = C3299nr.m14642ri();
            String packageResourcePath = "";
            if (contextM14642ri != null) {
                try {
                    packageResourcePath = contextM14642ri.getPackageResourcePath();
                } catch (Throwable th) {
                    C2707ac.m10196ik("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
                jSONObject.put("package_install_path", packageResourcePath);
                i = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", C2945ik.xha());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - C3332vr.m14979ri()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.m16339qt());
                jSONObject.put("is_init", C3332vr.m14975fi() ? 1 : 0);
                if (contextM14642ri != null) {
                    rotation = ((WindowManager) contextM14642ri.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            } else {
                jSONObject.put("package_install_path", packageResourcePath);
                i = 0;
                jSONObject.put("is_paid_app", false);
                jSONObject.put("apk_sign", C2945ik.xha());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - C3332vr.m14979ri()) / 1000);
                jSONObject.put("fmwname", DeviceUtils.m16339qt());
                jSONObject.put("is_init", C3332vr.m14975fi() ? 1 : 0);
                if (contextM14642ri != null) {
                    rotation = ((WindowManager) contextM14642ri.getSystemService("window")).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        i = 1;
                    } else if (rotation != 1) {
                        i = 3;
                    } else if (rotation != 2) {
                        i = 2;
                    } else if (rotation != 3) {
                        i = 4;
                    }
                    jSONObject.put("orientation_support", new JSONArray().put(i));
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @DungeonFlag
    /* JADX INFO: renamed from: lr */
    private JSONObject m12604lr(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put(C11540L6.f24947V0, C3369ri.m15224ri().m15229lr());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", m12607ri(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", C2726ri.m10278ri(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m12605lr(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.igq igqVar, final int i, final wjv.InterfaceC3358ri interfaceC3358ri) {
        C3289ri c3289ri;
        if (!C3307lr.m14718ri().m14721di()) {
            interfaceC3358ri.mo10890ri(40060, jbs.m13550ri(40060));
            return;
        }
        if (C3307lr.m14718ri().m14724ka()) {
            interfaceC3358ri.mo10890ri(10007, jbs.m13550ri(10007));
            return;
        }
        if (!C3307lr.m14718ri().jbs()) {
            interfaceC3358ri.mo10890ri(10008, jbs.m13550ri(10008));
            return;
        }
        boolean zM16698ik = C3606fi.m16698ik();
        final C3282ik c3282ik = new C3282ik();
        c3282ik.m14182ri(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri()) {
            if (interfaceC3358ri != null) {
                interfaceC3358ri.mo10890ri(1000, "Ad request is temporarily paused, Please contact your AM");
                c3282ik.m14181ri(1000);
                C3282ik.m14172ri(c3282ik);
                return;
            }
            return;
        }
        if (!C3299nr.m14639ka().siy()) {
            if (interfaceC3358ri != null) {
                interfaceC3358ri.mo10890ri(-16, jbs.m13550ri(-16));
                c3282ik.m14181ri(1001);
                C3282ik.m14172ri(c3282ik);
                return;
            }
            return;
        }
        if (interfaceC3358ri == null) {
            return;
        }
        if (m12600ka(adSlot.getCodeId())) {
            interfaceC3358ri.mo10890ri(-8, jbs.m13550ri(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !igqVar.f11276di) {
            c3282ik.m14178lr(2);
            c3282ik.m14183ri(adSlot.getBidAdm());
            if (C2730vr.m10314ik()) {
                C2009lr.m6445ri(adSlot.getBidAdm());
            }
            if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
                C3571ig.m16485ri("Pangle_Debug_Mode", adSlot.getBidAdm(), this.f9893ri);
            }
            try {
                JSONObject jSONObjectMo12637ri = mo12637ri(new JSONObject(adSlot.getBidAdm()));
                if (jSONObjectMo12637ri == null) {
                    c3282ik.m14175ik(12);
                    m12625ri(interfaceC3358ri, c3282ik);
                    return;
                }
                ri riVarM12645ri = ri.m12645ri(jSONObjectMo12637ri, adSlot, igqVar);
                c3282ik.m14184ri(riVarM12645ri.f9945qt);
                C3089aw.m12379ri(riVarM12645ri.jbs);
                if (riVarM12645ri.f9942ka != 20000) {
                    interfaceC3358ri.mo10890ri(riVarM12645ri.f9942ka, riVarM12645ri.f9940fi);
                    c3282ik.m14181ri(riVarM12645ri.f9942ka);
                    c3282ik.m14175ik(9);
                    C3282ik.m14172ri(c3282ik);
                    return;
                }
                if (riVarM12645ri.f9944mj == null) {
                    c3282ik.m14175ik(13);
                    m12625ri(interfaceC3358ri, c3282ik);
                    return;
                }
                if (riVarM12645ri.f9944mj.m14252ka() != null && !riVarM12645ri.f9944mj.m14252ka().isEmpty()) {
                    C3521ka.m15946ri(riVarM12645ri.f9944mj.m14252ka().get(0));
                }
                m12621ri(riVarM12645ri.f9944mj);
                if (m12633ri(riVarM12645ri.f9944mj, interfaceC3358ri)) {
                    return;
                }
                C3094ka.m12449ri(riVarM12645ri.f9944mj);
                interfaceC3358ri.mo10891ri(riVarM12645ri.f9944mj, c3282ik);
                Map<String, com.bytedance.sdk.openadsdk.core.model.wjv> mapM14246ri = C3289ri.m14246ri(riVarM12645ri.f9944mj);
                if (mapM14246ri != null) {
                    C3611lr.m16744ri().m16750ri(mapM14246ri);
                }
                m12622ri(riVarM12645ri.f9944mj, i);
                C3212ri.m13464ri().m13476ri(riVarM12645ri.f9944mj);
                return;
            } catch (Throwable th) {
                C2707ac.m10206ri("NetApiImpl", "get ad error: ", th);
                c3282ik.m14175ik(14);
                c3282ik.m14179lr(th.getMessage());
                m12625ri(interfaceC3358ri, c3282ik);
                return;
            }
        }
        if (igqVar != null && !TextUtils.isEmpty(igqVar.f11275co)) {
            try {
                JSONObject jSONObjectMo12637ri2 = mo12637ri(new JSONObject(igqVar.f11275co));
                if (jSONObjectMo12637ri2 != null) {
                    ri riVarM12645ri2 = ri.m12645ri(jSONObjectMo12637ri2, adSlot, igqVar);
                    if (igqVar.f11274aw != null && (c3289ri = riVarM12645ri2.f9944mj) != null && igqVar.f11274aw.mo11677ri(c3289ri)) {
                        C3094ka.m12449ri(c3289ri);
                        interfaceC3358ri.mo10891ri(c3289ri, c3282ik);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObjectM12611ri = m12611ri(adSlot, igqVar, i);
        if (jSONObjectM12611ri == null) {
            interfaceC3358ri.mo10890ri(-9, jbs.m13550ri(-9));
            c3282ik.m14181ri(-9);
            C3282ik.m14172ri(c3282ik);
            return;
        }
        if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
            C3571ig.m16485ri("Pangle_Debug_Mode", jSONObjectM12611ri.toString(), this.f9893ri);
        }
        String strM16477ri = C3571ig.m16477ri("/api/ad/union/sdk/get_ads/", true, false);
        final C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        List<String> listM16478ri = null;
        try {
            c2741kaM10412lr.m10365ik(C3390ka.m15343ri(c2741kaM10412lr, strM16477ri));
            if (C3578lr.m16537ri()) {
                listM16478ri = C3571ig.m16478ri("/api/ad/union/sdk/get_ads/", true);
                if (!listM16478ri.isEmpty()) {
                    c2741kaM10412lr.m10377ri(listM16478ri);
                    c2741kaM10412lr.m10374ri(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception unused2) {
        }
        c2741kaM10412lr.m10388ri(jSONObjectM12611ri.toString(), C3299nr.m14639ka().m14833bu());
        Map<String, String> mapM14914ri = C3324ik.m14914ri(strM16477ri, jSONObjectM12611ri.toString());
        if (mapM14914ri != null && mapM14914ri.size() > 0) {
            for (String str : mapM14914ri.keySet()) {
                try {
                    c2741kaM10412lr.m10372lr(str, mapM14914ri.get(str));
                } catch (Exception e) {
                    C2707ac.m10196ik("NetApiImpl", e.getMessage());
                }
            }
        }
        try {
            c2741kaM10412lr.m10372lr("User-Agent", C3571ig.m16449ka());
            m12616ri(c2741kaM10412lr, jSONObjectM12611ri);
        } catch (Exception unused3) {
        }
        final C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
        boolean z = C3304qt.m14669lr().m14703vr() && requestExtraMap != null;
        if (z) {
            requestExtraMap.put("pgad_start", c3582pvM16567lr);
        }
        c2741kaM10412lr.m10373ri(10);
        c2741kaM10412lr.m10371lr("get_ad");
        C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.8
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("get_ad");
                c3481ri.m15777ik(adSlot.getCodeId());
                c3481ri.m15780ka(C3571ig.m16444ik(adSlot.getDurationSlotType()));
                return c3481ri;
            }
        });
        if (C2730vr.m10314ik()) {
            Thread.currentThread().getName();
        }
        if (zM16698ik) {
            List<String> list = listM16478ri;
            try {
                C2739lr c2739lrM10386ri = c2741kaM10412lr.m10386ri();
                C2739lr c2739lr = c2739lrM10386ri == null ? new C2739lr(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L) : c2739lrM10386ri;
                if (c2739lr.m10354di()) {
                    boolean z2 = z;
                    try {
                        m12614ri(c2741kaM10412lr, c2739lr, z2, requestExtraMap, c3582pvM16567lr, adSlot, c3282ik, interfaceC3358ri, igqVar, i, list);
                    } catch (Throwable th2) {
                        th = th2;
                        z = z2;
                        requestExtraMap = requestExtraMap;
                        c3282ik = c3282ik;
                        list = list;
                        m12615ri(c2741kaM10412lr, new IOException(th.getMessage()), new C2739lr(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z, requestExtraMap, interfaceC3358ri, c3282ik, list);
                    }
                } else {
                    m12615ri(c2741kaM10412lr, new IOException(c2739lr.m10358lr()), c2739lr, adSlot, z, requestExtraMap, interfaceC3358ri, c3282ik, list);
                    if (c2741kaM10412lr != null) {
                        C3594uq.m16664ri(c2741kaM10412lr.m10363fi());
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            final boolean z3 = z;
            final List<String> list2 = listM16478ri;
            c2741kaM10412lr.m10387ri(new AbstractC2745lr() { // from class: com.bytedance.sdk.openadsdk.core.ay.9
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr2) {
                    C3112ay.this.m12614ri(abstractC2740ik, c2739lr2, z3, requestExtraMap, c3582pvM16567lr, adSlot, c3282ik, interfaceC3358ri, igqVar, i, list2);
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2745lr
                /* JADX INFO: renamed from: ri */
                public void mo10424ri(AbstractC2740ik abstractC2740ik, IOException iOException, C2739lr c2739lr2) {
                    C3112ay.this.m12615ri(c2741kaM10412lr, iOException, c2739lr2, adSlot, z3, requestExtraMap, interfaceC3358ri, c3282ik, list2);
                    if (abstractC2740ik != null) {
                        C3594uq.m16664ri(abstractC2740ik.m10363fi());
                    }
                }
            });
        }
        C3369ri.m15224ri().m15233ri(false);
    }

    /* JADX INFO: renamed from: ri */
    public static String m12606ri(int i, String str) {
        if (i == 3) {
            return C2726ri.m10270ik(str);
        }
        if (i == 4) {
            Pair<Integer, String> pairDecryptType4 = PangleEncryptManager.decryptType4(str);
            if (pairDecryptType4 != null && pairDecryptType4.second != null) {
                String str2 = (String) pairDecryptType4.second;
                C3330su.m14972ri(true);
                return str2;
            }
            C3330su.m14972ri(false);
            C3330su.m14970ri(2, PangleEncryptConstant.CryptDataScene.GET_ADS, pairDecryptType4 != null ? ((Integer) pairDecryptType4.first).intValue() : 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private JSONArray m12607ri(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m12608ri(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new C3213fr(cryptDataScene));
        C3330su.m14971ri(jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m12609ri(AdSlot adSlot) {
        C3365zf c3365zf;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", C3299nr.m14639ka().whw());
            jSONObject.put("lmt", DeviceUtils.m16322ik());
            if (C3307lr.m14718ri().m14733sf()) {
                jSONObject.put("pa_consent", C3304qt.m14669lr().m14696qt());
            }
            jSONObject.put("user_compliance_status", C3307lr.m14718ri().m14727mj());
            jSONObject.put("tcstring", C3322sf.m14820lr(C3299nr.m14642ri()));
            jSONObject.put("tcf_gdpr", C3322sf.m14822ri(C3299nr.m14642ri()));
            if (adSlot != null && C3365zf.f11896ri.containsKey(Integer.valueOf(adSlot.getCodeId())) && (c3365zf = C3365zf.f11896ri.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", c3365zf.m15151lr());
                jSONObject.put("lastbundle", c3365zf.m15149ik());
                jSONObject.put("lastclick", c3365zf.m15150ka());
                jSONObject.put("lastskip", c3365zf.m15148fi());
            }
            m12631ri(jSONObject, "data", m12601lr(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    private JSONObject m12610ri(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (igqVar != null) {
                jSONObject.put("render_method", igqVar.jbs);
                if (igqVar.jbs == 1) {
                    m12630ri(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (igqVar.jbs == 2) {
                    m12629ri(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                m12630ri(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", m12602lr(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", m12597ik(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", m12597ik(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i == 1 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (igqVar != null && igqVar.xha != null) {
                jSONObject.put("session_params", igqVar.xha);
            }
            if (igqVar != null && igqVar.f11281mj != null) {
                jSONObject.put("common_params", igqVar.f11281mj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (igqVar != null && igqVar.f11277fi != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    private JSONObject m12611ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strM16439fi = (igqVar == null || TextUtils.isEmpty(igqVar.f11283ri)) ? C3571ig.m16439fi() : igqVar.f11283ri;
            if (i == 7) {
                if (igqVar != null && igqVar.f11280lr > 0) {
                    jSONObject2.put("req_type", igqVar.f11280lr);
                }
            } else if (i == 8) {
                if (igqVar != null && igqVar.f11278ik > 0) {
                    jSONObject2.put("req_type", igqVar.f11278ik);
                }
            } else if (i == 3 && igqVar != null && igqVar.f11279ka > 0) {
                jSONObject2.put("req_type", igqVar.f11279ka);
            }
            try {
                String strM14873qt = C3299nr.m14639ka().m14873qt();
                String strM14840dw = C3299nr.m14639ka().m14840dw();
                if (strM14873qt != null && strM14840dw != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("version", strM14873qt);
                    jSONObject3.put("param", strM14840dw);
                    jSONObject2.put("abtest", jSONObject3);
                }
            } catch (Throwable unused) {
            }
            jSONObject2.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, strM16439fi);
            C3571ig.m16487ri(jSONObject2);
            jSONObject2.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject2.put("js_render_ver", C3228co.m13615ik());
            jSONObject2.put("js_render_v3_ver", C3228co.m13616ka());
            jSONObject2.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            jSONObject2.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, m12603lr());
            jSONObject2.put(C11744X3.i.f26328G, DeviceUtils.m16344ri(this.f9893ri, true));
            jSONObject2.put("user", m12609ri(adSlot));
            jSONObject2.put(C11540L6.f24966d0, C3571ig.m16449ka());
            jSONObject2.put("channel", C11744X3.i.f26354Z);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m12610ri(adSlot, i, igqVar));
            jSONObject2.put("adslots", jSONArray);
            m12628ri(jSONObject2, igqVar);
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject2.put("ts", jCurrentTimeMillis);
            String strConcat = "";
            if (adSlot.getCodeId() != null && strM16439fi != null) {
                strConcat = String.valueOf(jCurrentTimeMillis).concat(adSlot.getCodeId()).concat(strM16439fi);
            }
            jSONObject2.put("req_sign", C2717fi.m10220ri(strConcat));
            if (C3324ik.m14909fi() != 0) {
                jSONObject2.put("pglx", String.valueOf(C3324ik.m14909fi()));
            }
            jSONObject2.put("adx_id", C3304qt.m14669lr().m14702uq());
            C3366lr.m15165ri().m15176ri(jSONObject2);
            jSONObject = m12608ri(PangleEncryptConstant.CryptDataScene.GET_ADS, jSONObject2);
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("body data exception", th);
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX INFO: renamed from: ri */
    private void m12612ri(C2660qt c2660qt, com.bytedance.sdk.openadsdk.core.model.igq igqVar, C3582pv c3582pv, C3582pv c3582pv2, int i, C3582pv c3582pv3, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        C3582pv c3582pv4;
        if (C3299nr.m14639ka().m14862nd()) {
            JSONObject jSONObject = new JSONObject();
            long jM16572ri = 0;
            if (igqVar != null) {
                try {
                    if (igqVar.f11282qt.f13204ri > 0) {
                        c3582pv4 = c3582pv3;
                        jM16572ri = c3582pv4.m16572ri(igqVar.f11282qt);
                    } else {
                        c3582pv4 = c3582pv3;
                    }
                } catch (Exception unused) {
                    return;
                }
            } else {
                c3582pv4 = c3582pv3;
            }
            m12613ri(c2660qt, igqVar, c3582pv, c3582pv2, i, c3582pv4, wjvVar, str, jSONObject, false);
            C3414ik.m15551ri(wjvVar, str, "load_ad_time", jM16572ri, jSONObject);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m12613ri(C2660qt c2660qt, com.bytedance.sdk.openadsdk.core.model.igq igqVar, C3582pv c3582pv, C3582pv c3582pv2, int i, C3582pv c3582pv3, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, JSONObject jSONObject, boolean z) throws JSONException {
        if (igqVar != null && igqVar.f11282qt.f13204ri > 0) {
            jSONObject.put("client_start_time", c3582pv.m16572ri(igqVar.f11282qt));
        }
        jSONObject.put("network_time", c3582pv2.m16572ri(c3582pv));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", c3582pv3.m16572ri(c3582pv2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
        }
        if (wjvVar != null) {
            jSONObject.put("render_control_type", wjvVar.ajz());
        }
        jSONObject.put("webview_cache_size", C2483fi.m8762ri().m8764ik());
        jSONObject.put("sync_barrier_open", z ? 1 : 0);
        if (c2660qt.f7570lr > 0) {
            jSONObject.put("enqueue_2_run_ts", c2660qt.f7568ik - c2660qt.f7570lr);
            jSONObject.put("run_2_connect_end_ts", c2660qt.f7567fi - c2660qt.f7570lr);
            jSONObject.put("connect_end_2_response_end_ts", c2660qt.f7566di - c2660qt.f7567fi);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - c2660qt.f7566di);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ri */
    public void m12614ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr, boolean z, Map<String, Object> map, C3582pv c3582pv, final AdSlot adSlot, C3282ik c3282ik, wjv.InterfaceC3358ri interfaceC3358ri, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, List<String> list) {
        C3582pv c3582pv2;
        C3282ik c3282ik2 = c3282ik;
        wjv.InterfaceC3358ri interfaceC3358ri2 = interfaceC3358ri;
        if (z) {
            map.put("pgad_end", c3582pv);
        }
        if (c2739lr == null) {
            return;
        }
        if (!c2739lr.m10354di()) {
            C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.12
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr("get_ad");
                    c3481ri.m15777ik(adSlot.getCodeId());
                    c3481ri.m15780ka(C3571ig.m16444ik(adSlot.getDurationSlotType()));
                    c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                    return c3481ri;
                }
            });
            int iM10359ri = c2739lr.m10359ri();
            String strM10358lr = c2739lr.m10358lr();
            interfaceC3358ri2.mo10890ri(iM10359ri, strM10358lr);
            c3282ik2.m14181ri(iM10359ri);
            c3282ik2.m14175ik(11);
            c3282ik2.m14179lr(strM10358lr);
            C3282ik.m14172ri(c3282ik2);
            C3529fi.m15965ri("get_ad", abstractC2740ik.m10363fi(), iM10359ri, strM10358lr, abstractC2740ik.m10364ik(), list);
            return;
        }
        C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.11
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("get_ad");
                c3481ri.m15777ik(adSlot.getCodeId());
                c3481ri.m15780ka(C3571ig.m16444ik(adSlot.getDurationSlotType()));
                c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                return c3481ri;
            }
        });
        try {
            C3582pv c3582pvM16567lr = C3582pv.m16567lr();
            String strM10357ka = c2739lr.m10357ka();
            c3282ik2.m14183ri(strM10357ka);
            JSONObject jSONObject = new JSONObject(strM10357ka);
            if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
                C3571ig.m16485ri("Pangle_Debug_Mode", jSONObject.toString(), this.f9893ri);
            }
            JSONObject jSONObjectMo12637ri = mo12637ri(jSONObject);
            if (jSONObjectMo12637ri == null) {
                c3282ik2.m14175ik(12);
                m12625ri(interfaceC3358ri2, c3282ik2);
                return;
            }
            ri riVarM12645ri = ri.m12645ri(jSONObjectMo12637ri, adSlot, igqVar);
            c3282ik2.m14184ri(riVarM12645ri.f9945qt);
            C3089aw.m12379ri(riVarM12645ri.jbs);
            if (riVarM12645ri.f9942ka != 20000) {
                c3282ik2.m14181ri(riVarM12645ri.f9942ka);
                if (C3299nr.m14639ka().m14870qd() || riVarM12645ri.f9942ka != 40029) {
                    interfaceC3358ri2.mo10890ri(riVarM12645ri.f9942ka, riVarM12645ri.f9940fi);
                } else {
                    interfaceC3358ri2.mo10890ri(-100, jbs.m13550ri(-100));
                }
                c3282ik2.m14175ik(9);
                C3282ik.m14172ri(c3282ik2);
                return;
            }
            if (riVarM12645ri.f9944mj == null) {
                c3282ik2.m14175ik(13);
                m12625ri(interfaceC3358ri2, c3282ik2);
                return;
            }
            if (m12633ri(riVarM12645ri.f9944mj, interfaceC3358ri2)) {
                return;
            }
            riVarM12645ri.f9944mj.m14251ik(strM10357ka);
            C3582pv c3582pvM16567lr2 = C3582pv.m16567lr();
            if (igqVar != null && igqVar.f11284sf != null) {
                igqVar.f11284sf.m14161ri(c3582pv, c3582pvM16567lr, riVarM12645ri.f9946ri, c3582pvM16567lr2);
            }
            Object[] objArr = C3606fi.m16699ka() && i == 1;
            if (objArr != false) {
                try {
                    if (riVarM12645ri.f9944mj.m14252ka() != null && !riVarM12645ri.f9944mj.m14252ka().isEmpty()) {
                        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = riVarM12645ri.f9944mj.m14252ka().get(0);
                        String strM16444ik = C3571ig.m16444ik(i);
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        long jM16572ri = 0;
                        if (igqVar != null) {
                            try {
                                c3582pv2 = c3582pvM16567lr;
                                try {
                                    if (igqVar.f11282qt.f13204ri > 0) {
                                        jM16572ri = c3582pvM16567lr2.m16572ri(igqVar.f11282qt);
                                    }
                                } catch (Exception unused) {
                                    c3582pvM16567lr = c3582pv2;
                                }
                            } catch (Exception unused2) {
                            }
                        } else {
                            c3582pv2 = c3582pvM16567lr;
                        }
                        if (wjvVar != null) {
                            boolean zNbc = wjvVar.nbc();
                            jSONObject3.put("is_new_engine", zNbc ? 1 : 0);
                            jSONObject3.put("webview_cache_size", zNbc ? C2483fi.m8762ri().m8766ka() : C2483fi.m8762ri().m8764ik());
                        }
                        c3582pvM16567lr = c3582pv2;
                        long j = jM16572ri;
                        m12613ri(c2739lr.xha(), igqVar, c3582pv, c3582pvM16567lr, riVarM12645ri.f9946ri, c3582pvM16567lr2, wjvVar, strM16444ik, jSONObject3, true);
                        jSONObject2.put("duration", j);
                        jSONObject2.put("extra_data", jSONObject3);
                        jSONObject2.put(ViewHierarchyConstants.TAG_KEY, strM16444ik);
                        jSONObject2.put("callback_start", c3582pvM16567lr2.m16571ri());
                        riVarM12645ri.f9944mj.m14266ri(jSONObject2);
                    }
                } catch (Throwable th) {
                    th = th;
                    c3282ik2 = c3282ik;
                    interfaceC3358ri2 = interfaceC3358ri;
                    C2707ac.m10206ri("NetApiImpl", "get ad error: ", th);
                    c3282ik2.m14179lr(th.getMessage());
                    c3282ik2.m14175ik(14);
                    m12625ri(interfaceC3358ri2, c3282ik2);
                    C3529fi.m15965ri("get_ad", abstractC2740ik.m10363fi(), -9, th.getMessage(), abstractC2740ik.m10364ik(), list);
                    ApmHelper.reportCustomError("", "parse_error", th);
                    return;
                }
            }
            C3094ka.m12449ri(riVarM12645ri.f9944mj);
            interfaceC3358ri.mo10891ri(riVarM12645ri.f9944mj, c3282ik);
            m12622ri(riVarM12645ri.f9944mj, i);
            C3212ri.m13464ri().m13476ri(riVarM12645ri.f9944mj);
            Map<String, com.bytedance.sdk.openadsdk.core.model.wjv> mapM14246ri = C3289ri.m14246ri(riVarM12645ri.f9944mj);
            if (mapM14246ri != null) {
                C3611lr.m16744ri().m16750ri(mapM14246ri);
            }
            if (riVarM12645ri.f9944mj.m14252ka() == null || riVarM12645ri.f9944mj.m14252ka().isEmpty() || objArr == true) {
                return;
            }
            m12612ri(c2739lr.xha(), igqVar, c3582pv, c3582pvM16567lr, riVarM12645ri.f9946ri, c3582pvM16567lr2, riVarM12645ri.f9944mj.m14252ka().get(0), C3571ig.m16444ik(i));
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12615ri(C2741ka c2741ka, IOException iOException, C2739lr c2739lr, final AdSlot adSlot, boolean z, Map<String, Object> map, wjv.InterfaceC3358ri interfaceC3358ri, C3282ik c3282ik, List<String> list) {
        String message;
        int iM10359ri;
        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.10
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("get_ad");
                c3481ri.m15777ik(adSlot.getCodeId());
                c3481ri.m15780ka(C3571ig.m16444ik(adSlot.getDurationSlotType()));
                c3481ri.m15790ri(BuildConfig.VERSION_NAME);
                return c3481ri;
            }
        });
        if (c2739lr != null) {
            message = c2739lr.m10358lr();
        } else {
            message = iOException != null ? iOException.getMessage() : "";
        }
        String str = message;
        C3582pv c3582pvM16567lr = C3582pv.m16567lr();
        if (z) {
            map.put("pgad_end", Long.valueOf(c3582pvM16567lr.f13204ri));
        }
        if (C3299nr.m14639ka().m14871qh() && C3300oh.m14646ri().mo13483ka() == 1) {
            C3571ig.m16485ri("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.f9893ri);
        }
        if (c2739lr != null) {
            iM10359ri = c2739lr.m10359ri();
        } else {
            iM10359ri = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : 602;
        }
        int i = iM10359ri;
        if (interfaceC3358ri != null) {
            interfaceC3358ri.mo10890ri(i, str);
        }
        Integer.valueOf(i);
        c3282ik.m14181ri(i);
        c3282ik.m14175ik(10);
        c3282ik.m14179lr(str);
        C3282ik.m14172ri(c3282ik);
        C3529fi.m15965ri("get_ad", c2741ka.m10363fi(), i, str, c2741ka.m10364ik(), list);
    }

    /* JADX INFO: renamed from: ri */
    private void m12616ri(C2741ka c2741ka, JSONObject jSONObject) {
        try {
            if (m12598ik(jSONObject) && jSONObject.optInt("cypher") == 4) {
                c2741ka.m10372lr("x-pgli18n", "4");
                c2741ka.m10372lr("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12621ri(C3289ri c3289ri) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarM14248di;
        if (c3289ri == null || (wjvVarM14248di = c3289ri.m14248di()) == null) {
            return;
        }
        C3322sf.m14813dw(wjvVarM14248di.klz());
    }

    /* JADX INFO: renamed from: ri */
    private void m12622ri(C3289ri c3289ri, int i) {
        List<C3286nr> listRbz;
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listM14252ka = c3289ri.m14252ka();
        if (listM14252ka != null && listM14252ka.size() != 0) {
            for (int i2 = 0; i2 < listM14252ka.size(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = listM14252ka.get(i2);
                if (wjvVar != null && wjvVar.m14560xm() == null) {
                    m12626ri("", 0, 0, wjvVar.m14391fb(), wjvVar);
                    if (i == 3) {
                        m12626ri("", 0, 0, wjvVar.bzf(), wjvVar);
                    }
                    if (wjvVar.m14389eu() != null) {
                        m12626ri(wjvVar.m14389eu().m6357qt(), wjvVar.m14389eu().m6345ik(), wjvVar.m14389eu().m6351lr(), (C3286nr) null, wjvVar);
                    }
                    if ((i != 1 || wjvVar.m14389eu() == null) && (listRbz = wjvVar.rbz()) != null && listRbz.size() > 0) {
                        for (int i3 = 0; i3 < listRbz.size(); i3++) {
                            m12623ri(wjvVar, listRbz.get(i3));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12623ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, C3286nr c3286nr) {
        if (c3286nr == null) {
            return;
        }
        C3491ka.m15833ri(c3286nr).mo9652ik(1).mo9659ri(new C3492lr(wjvVar, c3286nr.m14220ri(), new com.bytedance.sdk.component.p145fi.slm() { // from class: com.bytedance.sdk.openadsdk.core.ay.14
            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8254ri(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.p145fi.slm
            /* JADX INFO: renamed from: ri */
            public void mo8255ri(InterfaceC2630sf interfaceC2630sf) {
            }
        }), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m12624ri(wjv.InterfaceC3357lr interfaceC3357lr) {
        interfaceC3357lr.mo10704ri(-1, jbs.m13550ri(-1));
    }

    /* JADX INFO: renamed from: ri */
    private void m12625ri(wjv.InterfaceC3358ri interfaceC3358ri, C3282ik c3282ik) {
        interfaceC3358ri.mo10890ri(-1, jbs.m13550ri(-1));
        c3282ik.m14181ri(-1);
        C3282ik.m14172ri(c3282ik);
    }

    /* JADX INFO: renamed from: ri */
    private void m12626ri(String str, int i, int i2, C3286nr c3286nr, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        if (!TextUtils.isEmpty(str)) {
            C3491ka.m15834ri(str).mo9660ri(i).mo9655lr(i2).mo9651fi(C3583qd.m16578fi(C3299nr.m14642ri())).mo9654ka(C3583qd.m16580ik(C3299nr.m14642ri())).mo9652ik(1).mo9659ri(new C3492lr(wjvVar, str, null), 4);
        } else {
            if (c3286nr == null) {
                return;
            }
            C3491ka.m15833ri(c3286nr).mo9652ik(1).mo9659ri(new C3492lr(wjvVar, c3286nr.m14220ri(), null), 4);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12627ri(Map<String, String> map, C2741ka c2741ka) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    c2741ka.m10372lr(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    C2707ac.m10197ik("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            c2741ka.m10372lr("User-Agent", C3571ig.m16449ka());
        } catch (Exception e2) {
            C2707ac.m10197ik("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12628ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        if (igqVar == null || igqVar.f11277fi == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", igqVar.f11277fi);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12629ri(JSONObject jSONObject, String str, float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m12630ri(JSONObject jSONObject, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m12631ri(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12632ri(com.bytedance.sdk.openadsdk.core.model.igq igqVar) {
        if (igqVar != null) {
            return igqVar.f11280lr == 2 || igqVar.f11278ik == 2 || igqVar.f11279ka == 2;
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12633ri(C3289ri c3289ri, wjv.InterfaceC3358ri interfaceC3358ri) {
        if (c3289ri == null) {
            interfaceC3358ri.mo10890ri(40053, jbs.m13550ri(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listM14252ka = c3289ri.m14252ka();
        if (listM14252ka.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.wjv wjvVar : listM14252ka) {
            if (TextUtils.isEmpty(wjvVar.ckl().m14196lr()) || TextUtils.isEmpty(wjvVar.ckl().m14194ik())) {
                interfaceC3358ri.mo10890ri(40053, jbs.m13550ri(40053));
                C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, C3571ig.m16476ri(wjvVar), "material_error", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.13
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", wjvVar.ckl().m14192di());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    @DungeonFlag
    private void xha(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", C3571ig.m16435di());
            jSONObject.put("version_code", C3571ig.xha());
            jSONObject.put("version", C3571ig.m16461mj());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: lr */
    public C3400fi mo12634lr(JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2;
        String strOptString;
        List<String> listM16478ri;
        String str = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() || C3307lr.m14718ri().m14722fi() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        boolean z3 = false;
        int iM10359ri = 0;
        try {
            JSONObject jSONObjectM12608ri = m12608ri(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            c2741kaM10412lr.m10388ri(jSONObjectM12608ri.toString(), C3299nr.m14639ka().m14833bu());
            c2741kaM10412lr.m10365ik(C3571ig.m16450ka("/api/ad/union/sdk/stats/batch/"));
            if (C3578lr.m16537ri() && (listM16478ri = C3571ig.m16478ri("/api/ad/union/sdk/stats/batch/", false)) != null && !listM16478ri.isEmpty()) {
                c2741kaM10412lr.m10377ri(listM16478ri);
                c2741kaM10412lr.m10374ri(60L, TimeUnit.SECONDS);
            }
            m12616ri(c2741kaM10412lr, jSONObjectM12608ri);
            c2741kaM10412lr.m10372lr("User-Agent", C3571ig.m16449ka());
            if (C3322sf.m14819lr().m14841eb()) {
                c2741kaM10412lr.m10372lr("_disable_retry", "1");
            }
            C2739lr c2739lrM10386ri = c2741kaM10412lr.m10386ri();
            try {
                if (c2739lrM10386ri == null) {
                    return new C3400fi(false, 0, "error unknown", false);
                }
                if (!c2739lrM10386ri.m10354di() || TextUtils.isEmpty(c2739lrM10386ri.m10357ka())) {
                    strOptString = "error unknown";
                    z2 = false;
                    z = false;
                } else {
                    JSONObject jSONObject2 = new JSONObject(c2739lrM10386ri.m10357ka());
                    int iOptInt = jSONObject2.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    strOptString = jSONObject2.optString("data", "");
                    z = true;
                    z2 = iOptInt == 20000;
                    if (iOptInt != 60005) {
                        z = false;
                    }
                }
                try {
                    iM10359ri = c2739lrM10386ri.m10359ri();
                    if (!c2739lrM10386ri.m10354di()) {
                        String strM10358lr = c2739lrM10386ri.m10358lr();
                        try {
                            C3594uq.m16664ri(c2741kaM10412lr.m10363fi());
                            strOptString = strM10358lr;
                        } catch (Throwable unused) {
                            boolean z4 = z2;
                            str = strM10358lr;
                            i = iM10359ri;
                            z3 = z4;
                            strOptString = str;
                            z2 = z3;
                            iM10359ri = i;
                        }
                    }
                } catch (Throwable unused2) {
                    i = iM10359ri;
                    z3 = z2;
                    str = strOptString;
                }
                return new C3400fi(z2, iM10359ri, strOptString, z);
            } catch (Throwable unused3) {
                i = 0;
                z = false;
            }
        } catch (Throwable unused4) {
            return new C3400fi(false, 0, "error unknown", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public C2518ri mo12635ri() {
        C2518ri c2518riM9035ri = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() || C3307lr.m14718ri().m14722fi()) {
            return null;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - C3535ri.m16065ri("tpl_fetch_model", "date", 0L);
        String strTnn = C3299nr.m14639ka().tnn();
        String strM16058lr = C3535ri.m16058lr("tpl_fetch_model", "last_url", "");
        if (jCurrentTimeMillis <= C3299nr.m14639ka().m14869pv() && jCurrentTimeMillis >= 0 && TextUtils.equals(strTnn, strM16058lr)) {
            String strM16058lr2 = C3535ri.m16058lr("tpl_fetch_model", C11540L6.f24899B, "");
            try {
                if (!TextUtils.isEmpty(strM16058lr2)) {
                    return C2518ri.m9034fi(strM16058lr2);
                }
            } catch (Exception unused) {
            }
        }
        try {
            C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
            String strM15343ri = C3390ka.m15343ri(c2742lrM10410ik, strTnn);
            c2742lrM10410ik.m10365ik(strM15343ri);
            C2739lr c2739lrM10391ri = c2742lrM10410ik.m10391ri();
            if (c2739lrM10391ri == null || !c2739lrM10391ri.m10354di()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c2739lrM10391ri.m10357ka());
            jSONObject.put("template_fetch_url", strM15343ri);
            c2518riM9035ri = C2518ri.m9035ri(jSONObject);
            C3535ri.m16075ri("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            C3535ri.m16077ri("tpl_fetch_model", C11540L6.f24899B, jSONObject.toString());
            C3535ri.m16077ri("tpl_fetch_model", "last_url", strTnn);
            return c2518riM9035ri;
        } catch (Throwable th) {
            C2707ac.m10196ik("NetApiImpl", th.getMessage());
            return c2518riM9035ri;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public C3400fi mo12636ri(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z;
        int i;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() && !C3307lr.m14718ri().m14722fi()) {
                C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
                c2741kaM10412lr.m10365ik(str);
                if (C3578lr.m16537ri() && list != null && !list.isEmpty()) {
                    c2741kaM10412lr.m10377ri(list);
                    c2741kaM10412lr.m10374ri(60L, TimeUnit.SECONDS);
                }
                if (C3322sf.m14819lr().m14863nh()) {
                    c2741kaM10412lr.m10372lr("_disable_retry", "1");
                }
                Pair<Integer, byte[]> pairEncryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(m12596fi(jSONObject.toString()));
                if (pairEncryptType4WithoutBase64 == null || pairEncryptType4WithoutBase64.second == null || ((byte[]) pairEncryptType4WithoutBase64.second).length <= 0) {
                    int iIntValue = pairEncryptType4WithoutBase64 != null ? ((Integer) pairEncryptType4WithoutBase64.first).intValue() : 0;
                    C3330su.m14968lr(false);
                    C3330su.m14970ri(1, PangleEncryptConstant.CryptDataScene.APP_LOG, iIntValue);
                } else {
                    bArr = (byte[]) pairEncryptType4WithoutBase64.second;
                    C3330su.m14968lr(true);
                }
                if (bArr != null) {
                    c2741kaM10412lr.m10372lr(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    c2741kaM10412lr.m10372lr("x-pgli18n", "4");
                    c2741kaM10412lr.m10389ri("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject jSONObjectM10278ri = C2726ri.m10278ri(jSONObject);
                        if (!m12598ik(jSONObjectM10278ri)) {
                            jSONObjectM10278ri = jSONObject;
                        }
                        m12627ri(m12595fi(jSONObjectM10278ri), c2741kaM10412lr);
                        c2741kaM10412lr.m10388ri(jSONObjectM10278ri.toString(), C3299nr.m14639ka().m14833bu());
                    } catch (OutOfMemoryError e) {
                        C2707ac.m10196ik("NetApiImpl", e.toString());
                        return new C3400fi(false, -2, "encrypt_error", false);
                    }
                }
                C2739lr c2739lrM10386ri = c2741kaM10412lr.m10386ri();
                boolean zM12594di = (c2739lrM10386ri == null || !c2739lrM10386ri.m10354di() || TextUtils.isEmpty(c2739lrM10386ri.m10357ka())) ? false : m12594di(new JSONObject(c2739lrM10386ri.m10357ka()));
                String strM10358lr = "error unknown";
                int iM10359ri = c2739lrM10386ri != null ? c2739lrM10386ri.m10359ri() : 0;
                if (zM12594di || iM10359ri != 200) {
                    if (c2739lrM10386ri != null && c2739lrM10386ri.m10358lr() != null) {
                        strM10358lr = c2739lrM10386ri.m10358lr();
                    }
                    str2 = strM10358lr;
                    z = false;
                } else {
                    str2 = "server say not success";
                    z = true;
                }
                if (c2739lrM10386ri != null) {
                    if (!c2739lrM10386ri.m10354di()) {
                        i = iM10359ri;
                        C3529fi.m15965ri("applog", str, i, c2739lrM10386ri.m10358lr(), c2741kaM10412lr.m10364ik(), list);
                    }
                    m12599ka(jSONObject);
                    return new C3400fi(zM12594di, i, str2, z);
                }
                C3529fi.m15965ri("applog", str, -1, "response is null", c2741kaM10412lr.m10364ik(), list);
                i = iM10359ri;
                m12599ka(jSONObject);
                return new C3400fi(zM12594di, i, str2, z);
            }
            return null;
        } catch (Throwable th) {
            C2707ac.m10206ri("NetApiImpl", "uploadEvent error", th);
            return new C3400fi(false, 509, "service_busy", false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public JSONObject mo12637ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString("message");
            String strOptString2 = jSONObject.optString("auction_price", "");
            String strM12606ri = m12606ri(iOptInt, strOptString);
            if (TextUtils.isEmpty(strM12606ri)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(strM12606ri);
            try {
                jSONObject2.put("auction_price", strOptString2);
                return jSONObject2;
            } catch (Throwable unused) {
                return jSONObject2;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public void mo12638ri(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.igq igqVar, int i, ihz ihzVar) {
        if (igqVar.f11276di || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            m12639ri(adSlot, igqVar, i, (wjv.InterfaceC3358ri) ihzVar);
            return;
        }
        if (!m12632ri(igqVar) && ihzVar != null) {
            String strMo11676ri = ihzVar.mo11676ri();
            if (!TextUtils.isEmpty(strMo11676ri)) {
                igqVar.f11275co = strMo11676ri;
                igqVar.f11274aw = ihzVar;
            }
        }
        m12639ri(adSlot, igqVar, i, (wjv.InterfaceC3358ri) ihzVar);
    }

    /* JADX INFO: renamed from: ri */
    public void m12639ri(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.igq igqVar, final int i, wjv.InterfaceC3358ri interfaceC3358ri) {
        if (igqVar != null && (igqVar.f11280lr == 2 || igqVar.f11278ik == 2 || igqVar.f11279ka == 2)) {
            adSlot.setPreload(true);
        }
        final C3268ri c3268ri = new C3268ri(interfaceC3358ri, adSlot, (adSlot.isPreload() || igqVar == null || igqVar.f11276di) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C3332vr.m14978lr().post(new AbstractRunnableC2676ik("getAd") { // from class: com.bytedance.sdk.openadsdk.core.ay.1
                @Override // java.lang.Runnable
                public void run() {
                    C3112ay.this.m12605lr(adSlot, igqVar, i, c3268ri);
                }
            });
        } else {
            m12605lr(adSlot, igqVar, i, c3268ri);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public void mo12640ri(String str) {
        if (C3307lr.m14718ri().m14722fi()) {
            return;
        }
        C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
        c2742lrM10410ik.m10365ik(str);
        c2742lrM10410ik.m10371lr("upload_bidding");
        c2742lrM10410ik.m10373ri(7);
        c2742lrM10410ik.m10392ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.6
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                c2739lr.m10357ka();
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public void mo12641ri(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() || C3307lr.m14718ri().m14722fi()) {
            return;
        }
        JSONObject jSONObjectM12604lr = m12604lr(str, list, jSONObject, str2, str3);
        if (jSONObjectM12604lr == null) {
            return;
        }
        C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        final String strM16450ka = C3571ig.m16450ka("/api/ad/union/dislike_event/");
        JSONObject jSONObjectM12608ri = m12608ri(PangleEncryptConstant.CryptDataScene.DISLIKE, jSONObjectM12604lr);
        String string = jSONObjectM12608ri != null ? jSONObjectM12608ri.toString() : null;
        m12616ri(c2741kaM10412lr, jSONObjectM12608ri);
        c2741kaM10412lr.m10365ik(strM16450ka);
        c2741kaM10412lr.m10385fi(string);
        c2741kaM10412lr.m10373ri(7);
        c2741kaM10412lr.m10371lr("dislike");
        C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.2
            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
            /* JADX INFO: renamed from: ri */
            public C3481ri mo10650ri() {
                C3481ri c3481ri = new C3481ri();
                c3481ri.m15784lr("dislike");
                return c3481ri;
            }
        });
        c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.3
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                if (c2739lr == null) {
                    C3529fi.m15965ri("dislike", strM16450ka, -1, "response is null", null, null);
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.3
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("dislike");
                            return c3481ri;
                        }
                    });
                } else if (c2739lr.m10354di()) {
                    C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.1
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("dislike");
                            return c3481ri;
                        }
                    });
                } else {
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.2
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr("dislike");
                            return c3481ri;
                        }
                    });
                    C3529fi.m15965ri("dislike", strM16450ka, c2739lr.m10359ri(), c2739lr.m10358lr(), null, null);
                }
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                C3529fi.m15965ri("dislike", strM16450ka, -1, iOException != null ? iOException.getMessage() : AbstractJsonLexerKt.NULL, null, null);
                if (abstractC2740ik != null) {
                    C3594uq.m16664ri(abstractC2740ik.m10363fi());
                }
                C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.3.4
                    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                    /* JADX INFO: renamed from: ri */
                    public C3481ri mo10650ri() {
                        C3481ri c3481ri = new C3481ri();
                        c3481ri.m15784lr("dislike");
                        return c3481ri;
                    }
                });
            }
        });
        try {
            String strOptString = new JSONObject(str).optString("cid", "");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            C3366lr.m15165ri().m15175ri("dislike", strOptString, (String) null, (String) null);
        } catch (JSONException e) {
            C2707ac.m10197ik(e.getMessage(), new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public void mo12642ri(JSONObject jSONObject, final wjv.InterfaceC3357lr interfaceC3357lr) {
        if (!com.bytedance.sdk.openadsdk.core.settings.xha.m14907ri() || C3307lr.m14718ri().m14722fi()) {
            if (interfaceC3357lr != null) {
                interfaceC3357lr.mo10704ri(1000, "Ad request is temporarily paused, Please contact your AM");
            }
        } else {
            if (jSONObject == null || interfaceC3357lr == null) {
                return;
            }
            JSONObject jSONObjectM12608ri = m12608ri(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
            C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
            try {
                c2741kaM10412lr.m10365ik(C3390ka.m15343ri(c2741kaM10412lr, C3571ig.m16450ka("/api/ad/union/sdk/reward_video/reward/")));
            } catch (Exception e) {
                C2707ac.m10196ik("NetApiImpl", e.getMessage());
            }
            m12616ri(c2741kaM10412lr, jSONObjectM12608ri);
            c2741kaM10412lr.m10385fi(jSONObjectM12608ri != null ? jSONObjectM12608ri.toString() : "");
            c2741kaM10412lr.m10373ri(10);
            c2741kaM10412lr.m10371lr(C12538u.f32489j);
            C3476ik.m15764ri(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.4
                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                /* JADX INFO: renamed from: ri */
                public C3481ri mo10650ri() {
                    C3481ri c3481ri = new C3481ri();
                    c3481ri.m15784lr(C12538u.f32489j);
                    return c3481ri;
                }
            });
            c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.5
                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                    if (c2739lr == null) {
                        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.3
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr(C12538u.f32489j);
                                return c3481ri;
                            }
                        });
                        C3529fi.m15965ri(C12538u.f32489j, abstractC2740ik.m10363fi(), -1, "response is null", null, null);
                        C3112ay.this.m12624ri(interfaceC3357lr);
                        return;
                    }
                    if (!c2739lr.m10354di() || TextUtils.isEmpty(c2739lr.m10357ka())) {
                        String strM13550ri = jbs.m13550ri(-2);
                        int iM10359ri = c2739lr.m10359ri();
                        if (!c2739lr.m10354di() && !TextUtils.isEmpty(c2739lr.m10358lr())) {
                            strM13550ri = c2739lr.m10358lr();
                        }
                        String str = strM13550ri;
                        interfaceC3357lr.mo10704ri(iM10359ri, str);
                        C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.2
                            @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                            /* JADX INFO: renamed from: ri */
                            public C3481ri mo10650ri() {
                                C3481ri c3481ri = new C3481ri();
                                c3481ri.m15784lr(C12538u.f32489j);
                                return c3481ri;
                            }
                        });
                        if (c2739lr.m10354di()) {
                            return;
                        }
                        C3529fi.m15965ri(C12538u.f32489j, abstractC2740ik.m10363fi(), iM10359ri, str, null, null);
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject(c2739lr.m10357ka());
                        String strM12606ri = C3112ay.m12606ri(jSONObject2.optInt("cypher", -1), jSONObject2.optString("message"));
                        if (!TextUtils.isEmpty(strM12606ri)) {
                            try {
                                jSONObject2 = new JSONObject(strM12606ri);
                            } catch (Throwable unused) {
                            }
                        }
                        lr lrVarM12644ri = lr.m12644ri(jSONObject2);
                        if (lrVarM12644ri.f9938ri != 20000) {
                            interfaceC3357lr.mo10704ri(lrVarM12644ri.f9938ri, jbs.m13550ri(lrVarM12644ri.f9938ri));
                        } else if (lrVarM12644ri.f9936ik == null) {
                            C3112ay.this.m12624ri(interfaceC3357lr);
                        } else {
                            interfaceC3357lr.mo10705ri(lrVarM12644ri);
                            C3476ik.m15761lr(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.1
                                @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                                /* JADX INFO: renamed from: ri */
                                public C3481ri mo10650ri() {
                                    C3481ri c3481ri = new C3481ri();
                                    c3481ri.m15784lr(C12538u.f32489j);
                                    return c3481ri;
                                }
                            });
                        }
                    } catch (JSONException e2) {
                        C2707ac.m10196ik("NetApiImpl", e2.getMessage());
                        C3112ay.this.m12624ri(interfaceC3357lr);
                    }
                }

                @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
                /* JADX INFO: renamed from: ri */
                public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
                    String message = iOException != null ? iOException.getMessage() : "";
                    interfaceC3357lr.mo10704ri(-2, message);
                    if (abstractC2740ik != null) {
                        String strM10363fi = abstractC2740ik.m10363fi();
                        C3594uq.m16664ri(strM10363fi);
                        C3529fi.m15965ri(C12538u.f32489j, strM10363fi, -1, message, null, null);
                    }
                    C3476ik.m15758ik(new InterfaceC3478ka() { // from class: com.bytedance.sdk.openadsdk.core.ay.5.4
                        @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
                        /* JADX INFO: renamed from: ri */
                        public C3481ri mo10650ri() {
                            C3481ri c3481ri = new C3481ri();
                            c3481ri.m15784lr(C12538u.f32489j);
                            return c3481ri;
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wjv
    /* JADX INFO: renamed from: ri */
    public void mo12643ri(JSONObject jSONObject, String str) {
        if (C3307lr.m14718ri().m14722fi()) {
            return;
        }
        C2741ka c2741kaM10412lr = C2751lr.m10463lr().m10466ik().m10412lr();
        c2741kaM10412lr.m10365ik(str);
        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
        c2741kaM10412lr.m10372lr("cypher", (String) pairGenerateRequestHeader.first);
        c2741kaM10412lr.m10372lr("transfer-param", (String) pairGenerateRequestHeader.second);
        c2741kaM10412lr.m10372lr("x-pangle-target-idc", C3299nr.m14639ka().tpb());
        c2741kaM10412lr.m10390ri(jSONObject);
        c2741kaM10412lr.m10373ri(5);
        c2741kaM10412lr.m10371lr("apm_pv");
        c2741kaM10412lr.m10387ri(new AbstractC2746ri() { // from class: com.bytedance.sdk.openadsdk.core.ay.7
            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10425ri(AbstractC2740ik abstractC2740ik, C2739lr c2739lr) {
                c2739lr.m10357ka();
            }

            @Override // com.bytedance.sdk.component.xha.p171ri.AbstractC2746ri
            /* JADX INFO: renamed from: ri */
            public void mo10423ri(AbstractC2740ik abstractC2740ik, IOException iOException) {
            }
        });
    }
}
