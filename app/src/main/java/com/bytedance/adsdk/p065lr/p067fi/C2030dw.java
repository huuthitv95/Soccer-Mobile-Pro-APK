package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2082qt;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.dw */
/* JADX INFO: loaded from: classes3.dex */
class C2030dw {
    /* JADX INFO: renamed from: ri */
    static C2082qt m6617ri(JsonReader jsonReader, xha xhaVar, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        C2082qt.ri riVarM6873ri = null;
        C2094lr c2094lrM6643ri = null;
        InterfaceC2088aw<PointF, PointF> interfaceC2088awM6659lr = null;
        C2094lr c2094lrM6643ri2 = null;
        C2094lr c2094lrM6642ri = null;
        C2094lr c2094lrM6642ri2 = null;
        C2094lr c2094lrM6643ri3 = null;
        C2094lr c2094lrM6643ri4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "p":
                    interfaceC2088awM6659lr = C2045ri.m6659lr(jsonReader, xhaVar);
                    break;
                case "r":
                    c2094lrM6643ri2 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                    break;
                case "is":
                    c2094lrM6643ri3 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    c2094lrM6642ri2 = C2036ka.m6642ri(jsonReader, xhaVar);
                    break;
                case "os":
                    c2094lrM6643ri4 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "pt":
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "sy":
                    riVarM6873ri = C2082qt.ri.m6873ri(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2082qt(strNextString, riVarM6873ri, c2094lrM6643ri, interfaceC2088awM6659lr, c2094lrM6643ri2, c2094lrM6642ri, c2094lrM6642ri2, c2094lrM6643ri3, c2094lrM6643ri4, zNextBoolean, z);
    }
}
