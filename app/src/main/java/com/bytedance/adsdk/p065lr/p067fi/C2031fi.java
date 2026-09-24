package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2083ri;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.fi */
/* JADX INFO: loaded from: classes3.dex */
class C2031fi {
    /* JADX INFO: renamed from: lr */
    private static C2083ri m6619lr(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        C2083ri c2083ri = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return c2083ri;
                }
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                if (strNextName.equals("v")) {
                    if (z) {
                        c2083ri = new C2083ri(C2036ka.m6642ri(jsonReader, xhaVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    static C2083ri m6620ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        C2083ri c2083ri = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C2083ri c2083riM6619lr = m6619lr(jsonReader, xhaVar);
                    if (c2083riM6619lr != null) {
                        c2083ri = c2083riM6619lr;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return c2083ri;
    }
}
