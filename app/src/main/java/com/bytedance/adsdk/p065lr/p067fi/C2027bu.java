package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2074di;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2081nr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2090di;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2092ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2093ka;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.google.common.base.Ascii;
import com.ironsource.C11341A5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.bu */
/* JADX INFO: loaded from: classes3.dex */
class C2027bu {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[PHI: r17
  0x00dd: PHI (r17v12 int) = 
  (r17v1 int)
  (r17v2 int)
  (r17v3 int)
  (r17v4 int)
  (r17v5 int)
  (r17v6 int)
  (r17v7 int)
  (r17v8 int)
  (r17v9 int)
  (r17v10 int)
  (r17v11 int)
  (r17v13 int)
 binds: [B:53:0x00db, B:49:0x00cf, B:45:0x00c2, B:41:0x00b7, B:37:0x00ac, B:33:0x009f, B:29:0x0092, B:25:0x0085, B:21:0x0075, B:17:0x0065, B:13:0x0055, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ri */
    static C2074di m6613ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        int i;
        byte b;
        C2092ik c2092ik;
        C2090di c2090di;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.p065lr.p068ik.p070lr.xha xhaVar2 = null;
        C2092ik c2092ikM6641ri = null;
        C2090di c2090diM6638ik = null;
        C2090di c2090diM6638ik2 = null;
        C2094lr c2094lrM6642ri = null;
        C2081nr.ri riVar = null;
        C2081nr.lr lrVar = null;
        C2094lr c2094lr = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        C2093ka c2093kaM6640lr = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            String str = strNextString;
            C2093ka c2093ka = c2093kaM6640lr;
            com.bytedance.adsdk.p065lr.p068ik.p070lr.xha xhaVar3 = xhaVar2;
            switch (strNextName.hashCode()) {
                case 100:
                    i = 1;
                    if (!strNextName.equals("d")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 101:
                    i = 1;
                    if (!strNextName.equals("e")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 103:
                    i = 1;
                    if (!strNextName.equals("g")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 111:
                    i = 1;
                    if (!strNextName.equals("o")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 115:
                    i = 1;
                    if (!strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 116:
                    i = 1;
                    if (!strNextName.equals("t")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i = 1;
                    if (!strNextName.equals("w")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 3324:
                    i = 1;
                    if (!strNextName.equals("hd")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 3447:
                    i = 1;
                    if (!strNextName.equals("lc")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 3454:
                    i = 1;
                    if (!strNextName.equals("lj")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 3487:
                    i = 1;
                    if (!strNextName.equals("ml")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 3519:
                    i = 1;
                    if (!strNextName.equals("nm")) {
                        b = -1;
                    } else {
                        b = Ascii.f22503VT;
                    }
                    break;
                default:
                    b = -1;
                    i = 1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader = jsonReader;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        C2094lr c2094lrM6642ri2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            C2092ik c2092ik2 = c2092ikM6641ri;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            C2090di c2090di2 = c2090diM6638ik;
                            if (strNextName2.equals(C11341A5.f23826q)) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                c2094lrM6642ri2 = C2036ka.m6642ri(jsonReader, xhaVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            c2092ikM6641ri = c2092ik2;
                            c2090diM6638ik = c2090di2;
                        }
                        c2092ikM6641ri = c2092ikM6641ri;
                        c2090diM6638ik = c2090diM6638ik;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            c2094lr = c2094lrM6642ri2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            xhaVar.m7198ri(true);
                            arrayList.add(c2094lrM6642ri2);
                        }
                    }
                    c2092ik = c2092ikM6641ri;
                    c2090di = c2090diM6638ik;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    c2092ikM6641ri = c2092ik;
                    xhaVar2 = xhaVar3;
                    c2090diM6638ik = c2090di;
                    break;
                case 1:
                    c2090diM6638ik2 = C2036ka.m6638ik(jsonReader, xhaVar);
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.hashCode();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            c2092ikM6641ri = C2036ka.m6641ri(jsonReader, xhaVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 3:
                    c2093kaM6640lr = C2036ka.m6640lr(jsonReader, xhaVar);
                    strNextString = str;
                    xhaVar2 = xhaVar3;
                    break;
                case 4:
                    c2090diM6638ik = C2036ka.m6638ik(jsonReader, xhaVar);
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 5:
                    xhaVar2 = jsonReader.nextInt() == i ? com.bytedance.adsdk.p065lr.p068ik.p070lr.xha.LINEAR : com.bytedance.adsdk.p065lr.p068ik.p070lr.xha.RADIAL;
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    break;
                case 6:
                    c2094lrM6642ri = C2036ka.m6642ri(jsonReader, xhaVar);
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 8:
                    riVar = C2081nr.ri.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 9:
                    lrVar = C2081nr.lr.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 10:
                    fNextDouble = (float) jsonReader.nextDouble();
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    c2093kaM6640lr = c2093ka;
                    xhaVar2 = xhaVar3;
                    break;
                default:
                    jsonReader.skipValue();
                    c2092ik = c2092ikM6641ri;
                    c2090di = c2090diM6638ik;
                    strNextString = str;
                    c2093kaM6640lr = c2093ka;
                    c2092ikM6641ri = c2092ik;
                    xhaVar2 = xhaVar3;
                    c2090diM6638ik = c2090di;
                    break;
            }
        }
        C2093ka c2093ka2 = c2093kaM6640lr;
        return new C2074di(strNextString, xhaVar2, c2092ikM6641ri, c2093ka2 == null ? new C2093ka(Collections.singletonList(new C2167ri(100))) : c2093ka2, c2090diM6638ik, c2090diM6638ik2, c2094lrM6642ri, riVar, lrVar, fNextDouble, arrayList, c2094lr, zNextBoolean);
    }
}
