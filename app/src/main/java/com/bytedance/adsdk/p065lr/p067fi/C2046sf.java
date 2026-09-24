package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2046sf {

    /* JADX INFO: renamed from: fi */
    private C2094lr f4782fi;

    /* JADX INFO: renamed from: ik */
    private C2094lr f4783ik;

    /* JADX INFO: renamed from: ka */
    private C2094lr f4784ka;

    /* JADX INFO: renamed from: lr */
    private C2094lr f4785lr;

    /* JADX INFO: renamed from: ri */
    private C2097ri f4786ri;

    /* JADX INFO: renamed from: lr */
    private void m6661lr(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("v")) {
                strNextString.hashCode();
                switch (strNextString) {
                    case "Distance":
                        this.f4784ka = C2036ka.m6642ri(jsonReader, xhaVar);
                        break;
                    case "Opacity":
                        this.f4785lr = C2036ka.m6643ri(jsonReader, xhaVar, false);
                        break;
                    case "Direction":
                        this.f4783ik = C2036ka.m6643ri(jsonReader, xhaVar, false);
                        break;
                    case "Shadow Color":
                        this.f4786ri = C2036ka.xha(jsonReader, xhaVar);
                        break;
                    case "Softness":
                        this.f4782fi = C2036ka.m6642ri(jsonReader, xhaVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: renamed from: ri */
    C2044qt m6662ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    m6661lr(jsonReader, xhaVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        if (this.f4786ri == null || this.f4785lr == null || this.f4783ik == null || this.f4784ka == null || this.f4782fi == null) {
            return null;
        }
        return new C2044qt(this.f4786ri, this.f4785lr, this.f4783ik, this.f4784ka, this.f4782fi);
    }
}
