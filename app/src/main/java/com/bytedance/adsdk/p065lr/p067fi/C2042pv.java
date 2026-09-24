package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Path;
import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2086vr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.pv */
/* JADX INFO: loaded from: classes3.dex */
class C2042pv {
    /* JADX INFO: renamed from: ri */
    static C2086vr m6652ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        C2093ka c2093ka = null;
        String strNextString = null;
        C2097ri c2097riXha = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    c2097riXha = C2036ka.xha(jsonReader, xhaVar);
                    break;
                case "o":
                    c2093ka = C2036ka.m6640lr(jsonReader, xhaVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
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
        return new C2086vr(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c2097riXha, c2093ka, zNextBoolean2);
    }
}
