package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2071aw;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.oh */
/* JADX INFO: loaded from: classes3.dex */
public class C2041oh {
    /* JADX INFO: renamed from: ri */
    static C2071aw m6650ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        String strNextString = null;
        C2094lr c2094lrM6643ri = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "r":
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new C2071aw(strNextString, c2094lrM6643ri);
    }
}
