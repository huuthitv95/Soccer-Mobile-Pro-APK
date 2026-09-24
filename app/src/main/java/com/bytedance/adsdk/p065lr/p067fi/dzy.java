package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p068ik.C2087ri;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.bgr;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class dzy implements InterfaceC2037kt<bgr> {

    /* JADX INFO: renamed from: ri */
    public static final dzy f4773ri = new dzy();

    private dzy() {
    }

    @Override // com.bytedance.adsdk.p065lr.p067fi.InterfaceC2037kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public bgr mo6614lr(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listM6672ri = null;
        List<PointF> listM6672ri2 = null;
        List<PointF> listM6672ri3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listM6672ri == null || listM6672ri2 == null || listM6672ri3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listM6672ri.isEmpty()) {
                    return new bgr(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listM6672ri.size();
                PointF pointF = listM6672ri.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i = 1; i < size; i++) {
                    PointF pointF2 = listM6672ri.get(i);
                    int i2 = i - 1;
                    arrayList.add(new C2087ri(C2018fi.m6565ri(listM6672ri.get(i2), listM6672ri3.get(i2)), C2018fi.m6565ri(pointF2, listM6672ri2.get(i)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listM6672ri.get(0);
                    int i3 = size - 1;
                    arrayList.add(new C2087ri(C2018fi.m6565ri(listM6672ri.get(i3), listM6672ri3.get(i3)), C2018fi.m6565ri(pointF3, listM6672ri2.get(0)), pointF3));
                }
                return new bgr(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listM6672ri2 = tan.m6672ri(jsonReader, f);
                    break;
                case "o":
                    listM6672ri3 = tan.m6672ri(jsonReader, f);
                    break;
                case "v":
                    listM6672ri = tan.m6672ri(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
