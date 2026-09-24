package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.C2069ka;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.slm;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.aw */
/* JADX INFO: loaded from: classes3.dex */
class C2025aw {
    /* JADX INFO: renamed from: ri */
    static C2069ka m6610ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double dNextDouble = 0.0d;
        String strNextString = null;
        String strNextString2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "fFamily":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "w":
                    dNextDouble = jsonReader.nextDouble();
                    break;
                case "ch":
                    cCharAt = jsonReader.nextString().charAt(0);
                    break;
                case "data":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((slm) C2039mj.m6648ri(jsonReader, xhaVar));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "size":
                    dNextDouble2 = jsonReader.nextDouble();
                    break;
                case "style":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C2069ka(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
    }
}
