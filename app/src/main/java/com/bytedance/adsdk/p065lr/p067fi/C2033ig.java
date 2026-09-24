package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.slm;
import com.bytedance.adsdk.p065lr.xha;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ig */
/* JADX INFO: loaded from: classes3.dex */
class C2033ig {
    /* JADX INFO: renamed from: ri */
    static slm m6623ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC2076ik interfaceC2076ikM6648ri = C2039mj.m6648ri(jsonReader, xhaVar);
                        if (interfaceC2076ikM6648ri != null) {
                            arrayList.add(interfaceC2076ikM6648ri);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new slm(strNextString, arrayList, zNextBoolean);
    }
}
