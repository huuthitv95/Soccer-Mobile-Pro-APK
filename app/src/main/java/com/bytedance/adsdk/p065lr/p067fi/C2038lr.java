package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2098sf;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2038lr {
    /* JADX INFO: renamed from: lr */
    private static C2098sf m6646lr(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        C2097ri c2097riXha = null;
        C2097ri c2097riXha2 = null;
        C2094lr c2094lrM6642ri = null;
        C2094lr c2094lrM6642ri2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "t":
                    c2094lrM6642ri2 = C2036ka.m6642ri(jsonReader, xhaVar);
                    break;
                case "fc":
                    c2097riXha = C2036ka.xha(jsonReader, xhaVar);
                    break;
                case "sc":
                    c2097riXha2 = C2036ka.xha(jsonReader, xhaVar);
                    break;
                case "sw":
                    c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C2098sf(c2097riXha, c2097riXha2, c2094lrM6642ri, c2094lrM6642ri2);
    }

    /* JADX INFO: renamed from: ri */
    public static C2098sf m6647ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        C2098sf c2098sfM6646lr = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("a")) {
                c2098sfM6646lr = m6646lr(jsonReader, xhaVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return c2098sfM6646lr == null ? new C2098sf(null, null, null, null) : c2098sfM6646lr;
    }
}
