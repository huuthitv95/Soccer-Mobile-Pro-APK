package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2084sf;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class ory {
    /* JADX INFO: renamed from: ri */
    static C2084sf m6651ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        String strNextString = null;
        InterfaceC2088aw<PointF, PointF> interfaceC2088awM6659lr = null;
        C2090di c2090diM6638ik = null;
        C2094lr c2094lrM6642ri = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "p":
                    interfaceC2088awM6659lr = C2045ri.m6659lr(jsonReader, xhaVar);
                    break;
                case "r":
                    c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                    break;
                case "s":
                    c2090diM6638ik = C2036ka.m6638ik(jsonReader, xhaVar);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2084sf(strNextString, interfaceC2088awM6659lr, c2090diM6638ik, c2094lrM6642ri, zNextBoolean);
    }
}
