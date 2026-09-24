package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2091fi;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.jbs;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2045ri {
    /* JADX INFO: renamed from: lr */
    static InterfaceC2088aw<PointF, PointF> m6659lr(JsonReader jsonReader, xha xhaVar) throws IOException {
        jsonReader.beginObject();
        C2091fi c2091fiM6660ri = null;
        C2094lr c2094lrM6642ri = null;
        C2094lr c2094lrM6642ri2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "k":
                    c2091fiM6660ri = m6660ri(jsonReader, xhaVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        c2094lrM6642ri2 = C2036ka.m6642ri(jsonReader, xhaVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            xhaVar.m7197ri("Lottie doesn't support expressions.");
        }
        return c2091fiM6660ri != null ? c2091fiM6660ri : new jbs(c2094lrM6642ri, c2094lrM6642ri2);
    }

    /* JADX INFO: renamed from: ri */
    public static C2091fi m6660ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(C2047su.m6665ri(jsonReader, xhaVar));
            }
            jsonReader.endArray();
            ihz.m6626ri(arrayList);
        } else {
            arrayList.add(new C2167ri(tan.m6670lr(jsonReader, C2017di.m6540ri())));
        }
        return new C2091fi(arrayList);
    }
}
