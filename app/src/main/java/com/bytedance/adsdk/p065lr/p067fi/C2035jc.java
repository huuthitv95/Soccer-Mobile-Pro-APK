package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.tan;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.jc */
/* JADX INFO: loaded from: classes3.dex */
class C2035jc {
    /* JADX INFO: renamed from: ri */
    static tan m6635ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        String strNextString = null;
        tan.EnumC2085ri enumC2085riM6889ri = null;
        C2094lr c2094lrM6643ri = null;
        C2094lr c2094lrM6643ri2 = null;
        C2094lr c2094lrM6643ri3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    c2094lrM6643ri2 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "m":
                    enumC2085riM6889ri = tan.EnumC2085ri.m6889ri(jsonReader.nextInt());
                    break;
                case "o":
                    c2094lrM6643ri3 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "s":
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar, false);
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
        return new tan(strNextString, enumC2085riM6889ri, c2094lrM6643ri, c2094lrM6643ri2, c2094lrM6643ri3, zNextBoolean);
    }
}
