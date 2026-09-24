package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2091fi;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.jbs;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2165ik;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2034ik {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ik */
    private static boolean m6627ik(C2094lr c2094lr) {
        if (c2094lr != null) {
            return c2094lr.mo6902lr() && ((Float) ((C2167ri) c2094lr.mo6901ik().get(0)).f5404ri).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: lr */
    private static boolean m6628lr(C2094lr c2094lr) {
        if (c2094lr != null) {
            return c2094lr.mo6902lr() && ((Float) ((C2167ri) c2094lr.mo6901ik().get(0)).f5404ri).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX INFO: renamed from: ri */
    public static C2089co m6629ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        C2094lr c2094lrM6643ri;
        xha xhaVar2 = xhaVar;
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        C2094lr c2094lr = null;
        C2091fi c2091fiM6660ri = null;
        InterfaceC2088aw<PointF, PointF> interfaceC2088awM6659lr = null;
        com.bytedance.adsdk.p065lr.p068ik.p071ri.xha xhaVarM6639ka = null;
        C2094lr c2094lrM6643ri2 = null;
        C2094lr c2094lrM6643ri3 = null;
        C2093ka c2093kaM6640lr = null;
        C2094lr c2094lrM6643ri4 = null;
        C2094lr c2094lrM6643ri5 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            c2091fiM6660ri = C2045ri.m6660ri(jsonReader, xhaVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    xhaVar2 = xhaVar;
                    break;
                case "o":
                    c2093kaM6640lr = C2036ka.m6640lr(jsonReader, xhaVar);
                    xhaVar2 = xhaVar;
                    break;
                case "p":
                    interfaceC2088awM6659lr = C2045ri.m6659lr(jsonReader, xhaVar);
                    xhaVar2 = xhaVar;
                    break;
                case "r":
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    if (c2094lrM6643ri.mo6901ik().isEmpty()) {
                        if (((C2167ri) c2094lrM6643ri.mo6901ik().get(0)).f5404ri == 0) {
                            c2094lr = c2094lrM6643ri;
                            xhaVar2 = xhaVar;
                        } else {
                            c2094lrM6643ri.mo6901ik().set(0, new C2167ri(xhaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(xhaVar.xha())));
                        }
                        break;
                    } else {
                        c2094lrM6643ri.mo6901ik().add(new C2167ri(xhaVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(xhaVar2.xha())));
                    }
                    xhaVar2 = xhaVar;
                    c2094lr = c2094lrM6643ri;
                    break;
                case "s":
                    xhaVarM6639ka = C2036ka.m6639ka(jsonReader, xhaVar);
                    break;
                case "eo":
                    c2094lrM6643ri5 = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    break;
                case "rz":
                    xhaVar2.m7197ri("Lottie doesn't support 3D layers.");
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    if (c2094lrM6643ri.mo6901ik().isEmpty()) {
                        if (((C2167ri) c2094lrM6643ri.mo6901ik().get(0)).f5404ri == 0) {
                            c2094lr = c2094lrM6643ri;
                            xhaVar2 = xhaVar;
                        } else {
                            c2094lrM6643ri.mo6901ik().set(0, new C2167ri(xhaVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(xhaVar.xha())));
                        }
                        break;
                    } else {
                        c2094lrM6643ri.mo6901ik().add(new C2167ri(xhaVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(xhaVar2.xha())));
                    }
                    xhaVar2 = xhaVar;
                    c2094lr = c2094lrM6643ri;
                    break;
                case "sa":
                    c2094lrM6643ri3 = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    break;
                case "sk":
                    c2094lrM6643ri2 = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    break;
                case "so":
                    c2094lrM6643ri4 = C2036ka.m6643ri(jsonReader, xhaVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    xhaVar2 = xhaVar;
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new C2089co(m6631ri(c2091fiM6660ri) ? null : c2091fiM6660ri, m6630ri(interfaceC2088awM6659lr) ? null : interfaceC2088awM6659lr, m6633ri(xhaVarM6639ka) ? null : xhaVarM6639ka, m6632ri(c2094lr) ? null : c2094lr, c2093kaM6640lr, c2094lrM6643ri4, c2094lrM6643ri5, m6628lr(c2094lrM6643ri2) ? null : c2094lrM6643ri2, m6627ik(c2094lrM6643ri3) ? null : c2094lrM6643ri3);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m6630ri(InterfaceC2088aw<PointF, PointF> interfaceC2088aw) {
        if (interfaceC2088aw != null) {
            return !(interfaceC2088aw instanceof jbs) && interfaceC2088aw.mo6902lr() && interfaceC2088aw.mo6901ik().get(0).f5404ri.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m6631ri(C2091fi c2091fi) {
        if (c2091fi != null) {
            return c2091fi.mo6902lr() && c2091fi.mo6901ik().get(0).f5404ri.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private static boolean m6632ri(C2094lr c2094lr) {
        if (c2094lr != null) {
            return c2094lr.mo6902lr() && ((Float) ((C2167ri) c2094lr.mo6901ik().get(0)).f5404ri).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ri */
    private static boolean m6633ri(com.bytedance.adsdk.p065lr.p068ik.p071ri.xha xhaVar) {
        if (xhaVar != null) {
            return xhaVar.mo6902lr() && ((C2165ik) ((C2167ri) xhaVar.mo6901ik().get(0)).f5404ri).m7203lr(1.0f, 1.0f);
        }
        return true;
    }
}
