package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.jbs;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.fr */
/* JADX INFO: loaded from: classes3.dex */
class C2032fr {
    /* JADX INFO: renamed from: ri */
    static jbs m6621ri(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        jbs.EnumC2077ri enumC2077riM6838ri = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    enumC2077riM6838ri = jbs.EnumC2077ri.m6838ri(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new jbs(strNextString, enumC2077riM6838ri, zNextBoolean);
    }
}
