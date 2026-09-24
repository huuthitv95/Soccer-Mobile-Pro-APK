package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class tan {

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.tan$1 */
    static /* synthetic */ class C20481 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4787ri;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f4787ri = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4787ri[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4787ri[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    private static PointF m6666fi(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float fM6669lr = 0.0f;
        float fM6669lr2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("x")) {
                fM6669lr = m6669lr(jsonReader);
            } else if (strNextName.equals("y")) {
                fM6669lr2 = m6669lr(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fM6669lr * f, fM6669lr2 * f);
    }

    /* JADX INFO: renamed from: ik */
    private static PointF m6667ik(JsonReader jsonReader, float f) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    /* JADX INFO: renamed from: ka */
    private static PointF m6668ka(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    /* JADX INFO: renamed from: lr */
    static float m6669lr(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C20481.f4787ri[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(jsonTokenPeek)));
        }
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return fNextDouble;
    }

    /* JADX INFO: renamed from: lr */
    static PointF m6670lr(JsonReader jsonReader, float f) throws IOException {
        int i = C20481.f4787ri[jsonReader.peek().ordinal()];
        if (i == 1) {
            return m6667ik(jsonReader, f);
        }
        if (i == 2) {
            return m6668ka(jsonReader, f);
        }
        if (i == 3) {
            return m6666fi(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    /* JADX INFO: renamed from: ri */
    static int m6671ri(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    /* JADX INFO: renamed from: ri */
    static List<PointF> m6672ri(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m6670lr(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
