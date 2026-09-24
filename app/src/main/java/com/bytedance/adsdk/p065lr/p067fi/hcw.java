package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2073co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class hcw {
    /* JADX INFO: renamed from: ri */
    static C2073co m6622ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        String strNextString = null;
        C2094lr c2094lrM6643ri = null;
        C2094lr c2094lrM6643ri2 = null;
        C2089co c2089coM6629ri = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "o":
                    c2094lrM6643ri2 = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    c2089coM6629ri = C2034ik.m6629ri(jsonReader, xhaVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2073co(strNextString, c2094lrM6643ri, c2094lrM6643ri2, c2089coM6629ri, zNextBoolean);
    }
}
