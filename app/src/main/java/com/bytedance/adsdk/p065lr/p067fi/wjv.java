package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.C2054di;
import com.bytedance.adsdk.p065lr.p068ik.C2056ik;
import com.bytedance.adsdk.p065lr.p068ik.C2069ka;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2058fi;
import com.bytedance.adsdk.p065lr.xha;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wjv {
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    /* JADX INFO: renamed from: ik */
    private static JSONArray m6680ik(JsonReader jsonReader) {
        byte b;
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("hd")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        jSONObject.put("vid", jsonReader.nextString());
                    } else if (b != 1) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX INFO: renamed from: ka */
    private static List<C2127qt.ri> m6681ka(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                C2127qt.ri riVar = new C2127qt.ri();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    switch (jsonReader.nextName()) {
                        case "l":
                            riVar.f5169ri = jsonReader.nextInt();
                            break;
                        case "le":
                            riVar.f5168lr = jsonReader.nextInt();
                            break;
                        case "s":
                            riVar.f5165fi = jsonReader.nextInt();
                            break;
                        case "c":
                            riVar.f5166ik = jsonReader.nextString();
                            break;
                        case "f":
                            riVar.f5167ka = jsonReader.nextString();
                            break;
                        case "bs":
                            riVar.f5164di = jsonReader.nextInt();
                            break;
                        case "ali":
                            riVar.xha = jsonReader.nextString();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                arrayList.add(riVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    private static Map<String, Object> m6682lr(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("lel")) {
                map.put("lel", m6680ik(jsonReader));
            } else if (strNextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.hashCode();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX INFO: renamed from: lr */
    private static void m6683lr(JsonReader jsonReader, xha.C2164ri c2164ri) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("fr")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    c2164ri.f5388fi = jsonReader.nextInt();
                } else if (b == 1) {
                    c2164ri.f5387di = jsonReader.nextString();
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    c2164ri.xha = m6680ik(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static xha m6684ri(JsonReader jsonReader) throws IOException {
        float f;
        float fM6540ri = C2017di.m6540ri();
        LongSparseArray<C2058fi> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<C2069ka> sparseArray = new SparseArray<>();
        xha.C2162ik c2162ik = new xha.C2162ik();
        xha.C2164ri c2164ri = new xha.C2164ri();
        xha.C2163lr c2163lr = new xha.C2163lr();
        xha xhaVar = new xha();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f2 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b = 0;
                    }
                    break;
                case -1109732030:
                    f = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b = 1;
                    }
                    break;
                case -865448777:
                    f = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b = 2;
                    }
                    break;
                case 104:
                    f = fNextDouble3;
                    if (strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        b = 3;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    f = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b = 4;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    f = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b = 5;
                    }
                    break;
                case 3208:
                    f = fNextDouble3;
                    if (strNextName.equals(CmcdConfiguration.KEY_DEADLINE)) {
                        b = 6;
                    }
                    break;
                case 3276:
                    f = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b = 7;
                    }
                    break;
                case 3292:
                    f = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b = 8;
                    }
                    break;
                case 3367:
                    f = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b = 9;
                    }
                    break;
                case 3553:
                    f = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b = 10;
                    }
                    break;
                case 94623709:
                    f = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 97615364:
                    f = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b = Ascii.f22492FF;
                    }
                    break;
                case 110364485:
                    f = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b = Ascii.f22490CR;
                    }
                    break;
                case 839250809:
                    f = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b = Ascii.f22500SO;
                    }
                    break;
                default:
                    f = fNextDouble3;
                    break;
            }
            switch (b) {
                case 0:
                    m6690ri(jsonReader, xhaVar, map, map2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 1:
                    m6689ri(jsonReader, xhaVar, arrayList, longSparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 2:
                    m6686ri(jsonReader, c2163lr);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!C2017di.m6551ri(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        xhaVar.m7197ri("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 8:
                    m6687ri(jsonReader, c2164ri);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f2;
                    break;
                case 11:
                    m6688ri(jsonReader, xhaVar, sparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 12:
                    m6692ri(jsonReader, map3);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 13:
                    m6685ri(jsonReader, c2162ik);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 14:
                    m6691ri(jsonReader, arrayList2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
            }
        }
        jsonReader.endObject();
        xhaVar.m7196ri(new Rect(0, 0, (int) (iNextInt2 * fM6540ri), (int) (iNextInt * fM6540ri)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, c2162ik, strNextString, c2164ri, c2163lr);
        return xhaVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX INFO: renamed from: ri */
    private static void m6685ri(JsonReader jsonReader, xha.C2162ik c2162ik) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "ke":
                        c2162ik.f5383ri = jsonReader.nextInt();
                        break;
                    case "id":
                        c2162ik.f5382lr = jsonReader.nextString();
                        break;
                    case "tl":
                        c2162ik.f5380ik = jsonReader.nextString();
                        break;
                    case "at":
                        c2162ik.f5381ka = jsonReader.nextString();
                        break;
                    case "inel":
                        c2162ik.f5379fi = new int[]{-1, -1};
                        jsonReader.beginArray();
                        for (int i = 0; i < 2; i++) {
                            if (jsonReader.hasNext()) {
                                c2162ik.f5379fi[i] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                        break;
                    case "el":
                        c2162ik.f5378di = jsonReader.nextString();
                        break;
                    case "lel":
                        c2162ik.xha = m6680ik(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX INFO: renamed from: ri */
    private static void m6686ri(JsonReader jsonReader, xha.C2163lr c2163lr) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("lel")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("el")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    c2163lr.f5385lr = new int[][]{new int[]{-1, -1}};
                    jsonReader.beginArray();
                    if (jsonReader.hasNext()) {
                        jsonReader.beginArray();
                        for (int i = 0; i < 2; i++) {
                            if (jsonReader.hasNext()) {
                                c2163lr.f5385lr[0][i] = jsonReader.nextInt();
                            }
                        }
                        jsonReader.endArray();
                    }
                    jsonReader.endArray();
                } else if (b == 1) {
                    c2163lr.f5386ri = jsonReader.nextString();
                } else if (b != 2) {
                    jsonReader.skipValue();
                } else {
                    c2163lr.f5384ik = m6680ik(jsonReader);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX INFO: renamed from: ri */
    private static void m6687ri(JsonReader jsonReader, xha.C2164ri c2164ri) {
        byte b;
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                            } else if (strNextName.equals("se")) {
                                b = 0;
                            } else {
                                b = -1;
                            }
                        } else if (strNextName.equals("pc")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                    } else if (strNextName.equals("ee")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (strNextName.equals("be")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    c2164ri.f5392ri = jsonReader.nextInt();
                } else if (b == 1) {
                    c2164ri.f5391lr = m6682lr(jsonReader);
                } else if (b == 2) {
                    c2164ri.f5389ik = m6682lr(jsonReader);
                } else if (b == 3) {
                    c2164ri.f5390ka = jsonReader.nextInt();
                } else if (b != 4) {
                    jsonReader.skipValue();
                } else {
                    m6683lr(jsonReader, c2164ri);
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m6688ri(JsonReader jsonReader, xha xhaVar, SparseArray<C2069ka> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C2069ka c2069kaM6610ri = C2025aw.m6610ri(jsonReader, xhaVar);
            sparseArray.put(c2069kaM6610ri.hashCode(), c2069kaM6610ri);
        }
        jsonReader.endArray();
    }

    /* JADX INFO: renamed from: ri */
    private static void m6689ri(JsonReader jsonReader, xha xhaVar, List<C2058fi> list, LongSparseArray<C2058fi> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            C2058fi c2058fiM6673ri = C2049uq.m6673ri(jsonReader, xhaVar);
            c2058fiM6673ri.m6726sf();
            C2058fi.ri riVar = C2058fi.ri.IMAGE;
            list.add(c2058fiM6673ri);
            longSparseArray.put(c2058fiM6673ri.m6717fi(), c2058fiM6673ri);
        }
        jsonReader.endArray();
    }

    /* JADX INFO: renamed from: ri */
    private static void m6690ri(JsonReader jsonReader, xha xhaVar, Map<String, List<C2058fi>> map, Map<String, C2127qt> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<C2127qt.ri> listM6681ka = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayM6680ik = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            C2058fi c2058fiM6673ri = C2049uq.m6673ri(jsonReader, xhaVar);
                            longSparseArray.put(c2058fiM6673ri.m6717fi(), c2058fiM6673ri);
                            arrayList.add(c2058fiM6673ri);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listM6681ka = m6681ka(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayM6680ik = m6680ik(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i = 0; i < 2; i++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                C2127qt c2127qt = new C2127qt(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listM6681ka, strNextString5, iArr, jSONArrayM6680ik);
                map2.put(c2127qt.m7062mj(), c2127qt);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* JADX INFO: renamed from: ri */
    private static void m6691ri(JsonReader jsonReader, List<C2054di> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new C2054di(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }

    /* JADX INFO: renamed from: ri */
    private static void m6692ri(JsonReader jsonReader, Map<String, C2056ik> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C2056ik c2056ikM6612ri = bgr.m6612ri(jsonReader);
                    map.put(c2056ikM6612ri.m6706lr(), c2056ikM6612ri);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
