package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2072bu;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2095mj;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.qd */
/* JADX INFO: loaded from: classes3.dex */
class C2043qd {
    /* JADX INFO: renamed from: ri */
    static C2072bu m6653ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        String strNextString = null;
        C2095mj c2095mjM6637fi = null;
        int iNextInt = 0;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ks":
                    c2095mjM6637fi = C2036ka.m6637fi(jsonReader, xhaVar);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "ind":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C2072bu(strNextString, iNextInt, c2095mjM6637fi, zNextBoolean);
    }
}
