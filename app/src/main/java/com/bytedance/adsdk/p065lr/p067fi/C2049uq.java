package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2058fi;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2083ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2089co;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2094lr;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2096qt;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.C2098sf;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.uq */
/* JADX INFO: loaded from: classes3.dex */
public class C2049uq {

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.uq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4788ri;

        static {
            int[] iArr = new int[C2058fi.lr.values().length];
            f4788ri = iArr;
            try {
                iArr[C2058fi.lr.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4788ri[C2058fi.lr.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    public static C2058fi m6673ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        C2058fi.lr lrVar = C2058fi.lr.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        C2096qt c2096qtM6636di = null;
        C2098sf c2098sfM6647ri = null;
        C2094lr c2094lrM6643ri = null;
        C2083ri c2083riM6620ri = null;
        C2044qt c2044qtM6662ri = null;
        long jNextInt = 0;
        float fNextDouble = 0.0f;
        float fXha = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        C2058fi.lr lrVar2 = lrVar;
        long jNextInt2 = -1;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        String strNextString = "UNSET";
        String strNextString2 = null;
        String strNextString3 = null;
        C2058fi.ri riVar = null;
        float fNextDouble5 = 1.0f;
        C2089co c2089coM6629ri = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -995424086:
                    if (strNextName.equals("parent")) {
                        b = 0;
                    }
                    break;
                case -903568142:
                    if (strNextName.equals("shapes")) {
                        b = 1;
                    }
                    break;
                case 104:
                    if (strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        b = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b = 3;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (strNextName.equals("w")) {
                        b = 4;
                    }
                    break;
                case 3177:
                    if (strNextName.equals("cl")) {
                        b = 5;
                    }
                    break;
                case 3233:
                    if (strNextName.equals("ef")) {
                        b = 6;
                    }
                    break;
                case 3324:
                    if (strNextName.equals("hd")) {
                        b = 7;
                    }
                    break;
                case 3367:
                    if (strNextName.equals("ip")) {
                        b = 8;
                    }
                    break;
                case 3432:
                    if (strNextName.equals("ks")) {
                        b = 9;
                    }
                    break;
                case 3519:
                    if (strNextName.equals("nm")) {
                        b = 10;
                    }
                    break;
                case 3553:
                    if (strNextName.equals("op")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        b = Ascii.f22492FF;
                    }
                    break;
                case 3669:
                    if (strNextName.equals(AbstractC13068b.JSON_KEY_SH)) {
                        b = Ascii.f22490CR;
                    }
                    break;
                case 3679:
                    if (strNextName.equals("sr")) {
                        b = Ascii.f22500SO;
                    }
                    break;
                case 3681:
                    if (strNextName.equals("st")) {
                        b = Ascii.f22499SI;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b = Ascii.DLE;
                    }
                    break;
                case 3705:
                    if (strNextName.equals("tm")) {
                        b = 17;
                    }
                    break;
                case 3712:
                    if (strNextName.equals("tt")) {
                        b = Ascii.DC2;
                    }
                    break;
                case 3717:
                    if (strNextName.equals("ty")) {
                        b = 19;
                    }
                    break;
                case 104415:
                    if (strNextName.equals("ind")) {
                        b = Ascii.DC4;
                    }
                    break;
                case 108390670:
                    if (strNextName.equals("refId")) {
                        b = Ascii.NAK;
                    }
                    break;
                case 1441620890:
                    if (strNextName.equals("masksProperties")) {
                        b = Ascii.SYN;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        InterfaceC2076ik interfaceC2076ikM6648ri = C2039mj.m6648ri(jsonReader, xhaVar);
                        if (interfaceC2076ikM6648ri != null) {
                            arrayList2.add(interfaceC2076ikM6648ri);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 2:
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) C2017di.m6540ri()));
                    break;
                case 3:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.hashCode();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                c2098sfM6647ri = C2038lr.m6647ri(jsonReader, xhaVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            c2096qtM6636di = C2036ka.m6636di(jsonReader, xhaVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 4:
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) C2017di.m6540ri()));
                    break;
                case 5:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 6:
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (strNextName3.equals("ty")) {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    c2083riM6620ri = C2031fi.m6620ri(jsonReader, xhaVar);
                                } else if (iNextInt3 == 25) {
                                    c2044qtM6662ri = new C2046sf().m6662ri(jsonReader, xhaVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    xhaVar.m7197ri("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 9:
                    c2089coM6629ri = C2034ik.m6629ri(jsonReader, xhaVar);
                    break;
                case 10:
                    strNextString = jsonReader.nextString();
                    break;
                case 11:
                    fXha = (float) jsonReader.nextDouble();
                    break;
                case 12:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 13:
                    iNextInt2 = (int) (jsonReader.nextInt() * C2017di.m6540ri());
                    break;
                case 14:
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    iNextInt = (int) (jsonReader.nextInt() * C2017di.m6540ri());
                    break;
                case 17:
                    c2094lrM6643ri = C2036ka.m6643ri(jsonReader, xhaVar, false);
                    break;
                case 18:
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 < C2058fi.lr.values().length) {
                        lrVar2 = C2058fi.lr.values()[iNextInt4];
                        int i = AnonymousClass1.f4788ri[lrVar2.ordinal()];
                        if (i == 1) {
                            xhaVar.m7197ri("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            xhaVar.m7197ri("Unsupported matte type: Luma Inverted");
                        }
                        xhaVar.m7195ri(1);
                    } else {
                        xhaVar.m7197ri("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                    }
                    break;
                case 19:
                    int iNextInt5 = jsonReader.nextInt();
                    riVar = iNextInt5 >= C2058fi.ri.UNKNOWN.ordinal() ? C2058fi.ri.UNKNOWN : C2058fi.ri.values()[iNextInt5];
                    break;
                case 20:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 21:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 22:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(C2026ay.m6611ri(jsonReader, xhaVar));
                    }
                    xhaVar.m7195ri(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new C2167ri(xhaVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (fXha <= 0.0f) {
            fXha = xhaVar.xha();
        }
        arrayList4.add(new C2167ri(xhaVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fXha)));
        arrayList4.add(new C2167ri(xhaVar, fValueOf, fValueOf, null, fXha, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || "ai".equals(strNextString3)) {
            xhaVar.m7197ri("Convert your Illustrator layers to shape layers.");
        }
        return new C2058fi(arrayList2, xhaVar, strNextString, jNextInt, riVar, jNextInt2, strNextString2, arrayList, c2089coM6629ri, iNextInt, iNextInt2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, c2096qtM6636di, c2098sfM6647ri, arrayList4, lrVar2, c2094lrM6643ri, zNextBoolean, c2083riM6620ri, c2044qtM6662ri);
    }

    /* JADX INFO: renamed from: ri */
    public static C2058fi m6674ri(xha xhaVar) {
        Rect rectM7187ka = xhaVar.m7187ka();
        return new C2058fi(Collections.EMPTY_LIST, xhaVar, "__container", -1L, C2058fi.ri.PRE_COMP, -1L, null, Collections.EMPTY_LIST, new C2089co(), 0, 0, 0, 0.0f, 0.0f, rectM7187ka.width(), rectM7187ka.height(), null, null, Collections.EMPTY_LIST, C2058fi.lr.NONE, null, false, null, null);
    }
}
