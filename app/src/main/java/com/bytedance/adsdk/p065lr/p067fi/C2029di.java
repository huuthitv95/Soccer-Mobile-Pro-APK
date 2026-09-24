package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2079lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.di */
/* JADX INFO: loaded from: classes3.dex */
class C2029di {
    /* JADX INFO: renamed from: ri */
    static C2079lr m6616ri(JsonReader jsonReader, xha xhaVar, int i) throws IOException {
        boolean z = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        InterfaceC2088aw<PointF, PointF> interfaceC2088awM6659lr = null;
        C2090di c2090diM6638ik = null;
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
        return new C2079lr(strNextString, interfaceC2088awM6659lr, c2090diM6638ik, z, zNextBoolean);
    }
}
