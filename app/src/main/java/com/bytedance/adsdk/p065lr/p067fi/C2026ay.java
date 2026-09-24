package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2080mj;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2095mj;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ay */
/* JADX INFO: loaded from: classes3.dex */
class C2026ay {
    /* JADX INFO: renamed from: ri */
    static C2080mj m6611ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        C2080mj.ri riVar = null;
        C2095mj c2095mjM6637fi = null;
        C2093ka c2093kaM6640lr = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "o":
                    c2093kaM6640lr = C2036ka.m6640lr(jsonReader, xhaVar);
                    break;
                case "pt":
                    c2095mjM6637fi = C2036ka.m6637fi(jsonReader, xhaVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.hashCode();
                    switch (strNextString) {
                        case "a":
                            riVar = C2080mj.ri.MASK_MODE_ADD;
                            break;
                        case "i":
                            xhaVar.m7197ri("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            riVar = C2080mj.ri.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            riVar = C2080mj.ri.MASK_MODE_NONE;
                            break;
                        case "s":
                            riVar = C2080mj.ri.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            riVar = C2080mj.ri.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C2080mj(riVar, c2095mjM6637fi, c2093kaM6640lr, zNextBoolean);
    }
}
