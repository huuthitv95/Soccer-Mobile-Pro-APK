package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p065lr.p068ik.C2070lr;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class jbs implements InterfaceC2037kt<C2070lr> {

    /* JADX INFO: renamed from: ri */
    public static final jbs f4775ri = new jbs();

    private jbs() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.p065lr.p067fi.InterfaceC2037kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public C2070lr mo6614lr(JsonReader jsonReader, float f) throws IOException {
        C2070lr.ri riVar = C2070lr.ri.CENTER;
        jsonReader.beginObject();
        C2070lr.ri riVar2 = riVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iM6671ri = 0;
        int iM6671ri2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case 102:
                    if (strNextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                        b = 0;
                    }
                    break;
                case 106:
                    if (strNextName.equals("j")) {
                        b = 1;
                    }
                    break;
                case 115:
                    if (strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        b = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b = 3;
                    }
                    break;
                case 3261:
                    if (strNextName.equals("fc")) {
                        b = 4;
                    }
                    break;
                case 3452:
                    if (strNextName.equals("lh")) {
                        b = 5;
                    }
                    break;
                case 3463:
                    if (strNextName.equals("ls")) {
                        b = 6;
                    }
                    break;
                case 3543:
                    if (strNextName.equals("of")) {
                        b = 7;
                    }
                    break;
                case 3587:
                    if (strNextName.equals("ps")) {
                        b = 8;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        b = 9;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b = 10;
                    }
                    break;
                case 3687:
                    if (strNextName.equals("sz")) {
                        b = Ascii.f22503VT;
                    }
                    break;
                case 3710:
                    if (strNextName.equals("tr")) {
                        b = Ascii.f22492FF;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 1:
                    int iNextInt2 = jsonReader.nextInt();
                    riVar2 = (iNextInt2 <= C2070lr.ri.CENTER.ordinal() && iNextInt2 >= 0) ? C2070lr.ri.values()[iNextInt2] : C2070lr.ri.CENTER;
                    break;
                case 2:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    strNextString = jsonReader.nextString();
                    break;
                case 4:
                    iM6671ri = tan.m6671ri(jsonReader);
                    break;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case 9:
                    iM6671ri2 = tan.m6671ri(jsonReader);
                    break;
                case 10:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case 12:
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C2070lr(strNextString, strNextString2, fNextDouble, riVar2, iNextInt, fNextDouble2, fNextDouble3, iM6671ri, iM6671ri2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
