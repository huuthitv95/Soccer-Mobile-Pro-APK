package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2081nr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2097ri;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.ironsource.C11341A5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class srn {
    /* JADX INFO: renamed from: ri */
    static C2081nr m6664ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        int i;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        C2093ka c2093ka = null;
        String strNextString = null;
        C2094lr c2094lr = null;
        C2097ri c2097riXha = null;
        C2094lr c2094lrM6642ri = null;
        C2081nr.ri riVar = null;
        C2081nr.lr lrVar = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            int i2 = 1;
            switch (strNextName) {
                case "c":
                    c2097riXha = C2036ka.xha(jsonReader, xhaVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        C2094lr c2094lrM6642ri2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals(C11341A5.f23826q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                c2094lrM6642ri2 = C2036ka.m6642ri(jsonReader, xhaVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.hashCode();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i = 1;
                                xhaVar.m7198ri(true);
                                arrayList.add(c2094lrM6642ri2);
                                i2 = i;
                                break;
                            case "o":
                                c2094lr = c2094lrM6642ri2;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    c2093ka = C2036ka.m6640lr(jsonReader, xhaVar);
                    continue;
                    break;
                case "w":
                    c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    riVar = C2081nr.ri.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    lrVar = C2081nr.lr.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (c2093ka == null) {
            c2093ka = new C2093ka(Collections.singletonList(new C2167ri(100)));
        }
        return new C2081nr(strNextString, c2094lr, arrayList, c2097riXha, c2093ka, c2094lrM6642ri, riVar, lrVar, fNextDouble, zNextBoolean);
    }
}
