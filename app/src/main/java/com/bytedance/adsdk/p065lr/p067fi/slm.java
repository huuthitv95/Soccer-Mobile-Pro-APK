package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2075fi;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2092ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class slm {
    /* JADX INFO: renamed from: ri */
    static C2075fi m6663ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        C2093ka c2093ka = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.p065lr.p068ik.p070lr.xha xhaVar2 = null;
        C2092ik c2092ikM6641ri = null;
        C2090di c2090diM6638ik = null;
        C2090di c2090diM6638ik2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    c2090diM6638ik2 = C2036ka.m6638ik(jsonReader, xhaVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            c2092ikM6641ri = C2036ka.m6641ri(jsonReader, xhaVar, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    c2093ka = C2036ka.m6640lr(jsonReader, xhaVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    c2090diM6638ik = C2036ka.m6638ik(jsonReader, xhaVar);
                    break;
                case "t":
                    xhaVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.p065lr.p068ik.p070lr.xha.LINEAR : com.bytedance.adsdk.p065lr.p068ik.p070lr.xha.RADIAL;
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
        if (c2093ka == null) {
            c2093ka = new C2093ka(Collections.singletonList(new C2167ri(100)));
        }
        return new C2075fi(strNextString, xhaVar2, fillType, c2092ikM6641ri, c2093ka, c2090diM6638ik, c2090diM6638ik2, null, null, zNextBoolean);
    }
}
