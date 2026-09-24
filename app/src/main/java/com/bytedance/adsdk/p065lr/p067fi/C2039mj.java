package com.bytedance.adsdk.p065lr.p067fi;

import android.util.JsonReader;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik;
import com.bytedance.adsdk.p065lr.xha;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.mj */
/* JADX INFO: loaded from: classes3.dex */
class C2039mj {
    /* JADX INFO: renamed from: ri */
    static InterfaceC2076ik m6648ri(JsonReader jsonReader, xha xhaVar) throws IOException {
        InterfaceC2076ik interfaceC2076ikM6616ri;
        String strNextString;
        jsonReader.beginObject();
        byte b = 2;
        int iNextInt = 2;
        while (true) {
            interfaceC2076ikM6616ri = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (!strNextName.equals("d")) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        strNextString.hashCode();
        switch (strNextString.hashCode()) {
            case 3239:
                b = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b = -1;
                }
                break;
            case 3307:
                b = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b = !strNextString.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT) ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b = !strNextString.equals(AbstractC13068b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b = !strNextString.equals("st") ? (byte) -1 : Ascii.f22503VT;
                break;
            case 3705:
                b = !strNextString.equals("tm") ? (byte) -1 : Ascii.f22492FF;
                break;
            case 3710:
                b = !strNextString.equals("tr") ? (byte) -1 : Ascii.f22490CR;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                interfaceC2076ikM6616ri = C2029di.m6616ri(jsonReader, xhaVar, iNextInt);
                break;
            case 1:
                interfaceC2076ikM6616ri = C2042pv.m6652ri(jsonReader, xhaVar);
                break;
            case 2:
                interfaceC2076ikM6616ri = slm.m6663ri(jsonReader, xhaVar);
                break;
            case 3:
                interfaceC2076ikM6616ri = C2033ig.m6623ri(jsonReader, xhaVar);
                break;
            case 4:
                interfaceC2076ikM6616ri = C2027bu.m6613ri(jsonReader, xhaVar);
                break;
            case 5:
                interfaceC2076ikM6616ri = C2032fr.m6621ri(jsonReader);
                xhaVar.m7197ri("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                interfaceC2076ikM6616ri = ory.m6651ri(jsonReader, xhaVar);
                break;
            case 7:
                interfaceC2076ikM6616ri = C2041oh.m6650ri(jsonReader, xhaVar);
                break;
            case 8:
                interfaceC2076ikM6616ri = hcw.m6622ri(jsonReader, xhaVar);
                break;
            case 9:
                interfaceC2076ikM6616ri = C2043qd.m6653ri(jsonReader, xhaVar);
                break;
            case 10:
                interfaceC2076ikM6616ri = C2030dw.m6617ri(jsonReader, xhaVar, iNextInt);
                break;
            case 11:
                interfaceC2076ikM6616ri = srn.m6664ri(jsonReader, xhaVar);
                break;
            case 12:
                interfaceC2076ikM6616ri = C2035jc.m6635ri(jsonReader, xhaVar);
                break;
            case 13:
                interfaceC2076ikM6616ri = C2034ik.m6629ri(jsonReader, xhaVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return interfaceC2076ikM6616ri;
    }
}
