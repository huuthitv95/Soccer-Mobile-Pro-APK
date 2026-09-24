package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.adsdk.p065lr.C2014bu;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.xha;
import com.bytedance.adsdk.p065lr.xha.C2167ri;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.ac */
/* JADX INFO: loaded from: classes3.dex */
class C2024ac {

    /* JADX INFO: renamed from: lr */
    private static SparseArray<WeakReference<Interpolator>> f4770lr;

    /* JADX INFO: renamed from: ri */
    private static final Interpolator f4771ri = new LinearInterpolator();

    C2024ac() {
    }

    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: lr */
    private static <T> C2167ri<T> m6602lr(xha xhaVar, JsonReader jsonReader, float f, InterfaceC2037kt<T> interfaceC2037kt) throws IOException {
        Interpolator interpolatorM6604ri;
        Interpolator interpolatorM6604ri2;
        T t;
        Interpolator interpolator;
        Interpolator interpolatorM6604ri3;
        PointF pointF;
        C2167ri<T> c2167ri;
        T t2;
        float f2;
        float fNextDouble;
        jsonReader.beginObject();
        boolean z = false;
        PointF pointFM6670lr = null;
        PointF pointFM6670lr2 = null;
        PointF pointF2 = null;
        T tMo6614lr = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointFM6670lr3 = null;
        PointF pointFM6670lr4 = null;
        float fNextDouble2 = 0.0f;
        T tMo6614lr2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case 101:
                    if (strNextName.equals("e")) {
                        b = 0;
                    }
                    break;
                case 104:
                    if (strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        b = 1;
                    }
                    break;
                case 105:
                    if (strNextName.equals(CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                        b = 2;
                    }
                    break;
                case 111:
                    if (strNextName.equals("o")) {
                        b = 3;
                    }
                    break;
                case 115:
                    if (strNextName.equals(CmcdData.Factory.STREAMING_FORMAT_SS)) {
                        b = 4;
                    }
                    break;
                case 116:
                    if (strNextName.equals("t")) {
                        b = 5;
                    }
                    break;
                case 3701:
                    if (strNextName.equals("ti")) {
                        b = 6;
                    }
                    break;
                case 3707:
                    if (strNextName.equals("to")) {
                        b = 7;
                    }
                    break;
            }
            String str = "y";
            switch (b) {
                case 0:
                    tMo6614lr2 = interfaceC2037kt.mo6614lr(jsonReader, f);
                    continue;
                case 1:
                    t2 = tMo6614lr;
                    z = jsonReader.nextInt() == 1;
                    break;
                case 2:
                    boolean z2 = z;
                    t2 = tMo6614lr;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f3 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.hashCode();
                            if (strNextName2.equals("x")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    f3 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    float fNextDouble6 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == JsonToken.NUMBER) {
                                        f2 = fNextDouble6;
                                        fNextDouble = (float) jsonReader.nextDouble();
                                    } else {
                                        f2 = fNextDouble6;
                                        fNextDouble = f2;
                                    }
                                    jsonReader.endArray();
                                    f3 = f2;
                                    fNextDouble4 = fNextDouble;
                                }
                                str = str;
                            } else if (!strNextName2.equals(str)) {
                                jsonReader.skipValue();
                            } else if (jsonReader.peek() == JsonToken.NUMBER) {
                                fNextDouble5 = (float) jsonReader.nextDouble();
                                fNextDouble3 = fNextDouble5;
                            } else {
                                jsonReader.beginArray();
                                fNextDouble3 = (float) jsonReader.nextDouble();
                                fNextDouble5 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble3;
                                jsonReader.endArray();
                            }
                        }
                        PointF pointF6 = new PointF(f3, fNextDouble3);
                        pointF5 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF4 = pointF6;
                    } else {
                        pointFM6670lr2 = tan.m6670lr(jsonReader, f);
                    }
                    z = z2;
                    break;
                case 3:
                    boolean z3 = z;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        float fNextDouble10 = 0.0f;
                        while (jsonReader.hasNext()) {
                            T t3 = tMo6614lr;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.hashCode();
                            if (strNextName3.equals("x")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else if (!strNextName3.equals("y")) {
                                jsonReader.skipValue();
                            } else if (jsonReader.peek() == JsonToken.NUMBER) {
                                fNextDouble10 = (float) jsonReader.nextDouble();
                                fNextDouble8 = fNextDouble10;
                            } else {
                                jsonReader.beginArray();
                                fNextDouble8 = (float) jsonReader.nextDouble();
                                fNextDouble10 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : fNextDouble8;
                                jsonReader.endArray();
                            }
                            tMo6614lr = t3;
                        }
                        PointF pointF7 = new PointF(fNextDouble7, fNextDouble8);
                        PointF pointF8 = new PointF(fNextDouble9, fNextDouble10);
                        jsonReader.endObject();
                        pointF2 = pointF7;
                        pointF3 = pointF8;
                    } else {
                        pointFM6670lr = tan.m6670lr(jsonReader, f);
                    }
                    z = z3;
                    continue;
                case 4:
                    tMo6614lr = interfaceC2037kt.mo6614lr(jsonReader, f);
                    continue;
                case 5:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    continue;
                case 6:
                    pointFM6670lr4 = tan.m6670lr(jsonReader, f);
                    continue;
                case 7:
                    pointFM6670lr3 = tan.m6670lr(jsonReader, f);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            tMo6614lr = t2;
        }
        boolean z4 = z;
        T t4 = tMo6614lr;
        jsonReader.endObject();
        if (!z4) {
            if (pointFM6670lr != null && pointFM6670lr2 != null) {
                interpolatorM6604ri3 = m6604ri(pointFM6670lr, pointFM6670lr2);
                interpolator = interpolatorM6604ri3;
                t = tMo6614lr2;
                interpolatorM6604ri = null;
                interpolatorM6604ri2 = null;
            } else if (pointF2 != null && pointF3 != null && pointF4 != null && pointF5 != null) {
                interpolatorM6604ri = m6604ri(pointF2, pointF4);
                interpolatorM6604ri2 = m6604ri(pointF3, pointF5);
                t = tMo6614lr2;
                interpolator = null;
            }
            if (interpolatorM6604ri != null || interpolatorM6604ri2 == null) {
                pointF = pointFM6670lr4;
                c2167ri = new C2167ri<>(xhaVar, t4, t, interpolator, fNextDouble2, null);
            } else {
                pointF = pointFM6670lr4;
                c2167ri = new C2167ri<>(xhaVar, t4, t, interpolatorM6604ri, interpolatorM6604ri2, fNextDouble2, null);
            }
            c2167ri.f5402mj = pointFM6670lr3;
            c2167ri.jbs = pointF;
            return c2167ri;
        }
        tMo6614lr2 = t4;
        interpolatorM6604ri3 = f4771ri;
        interpolator = interpolatorM6604ri3;
        t = tMo6614lr2;
        interpolatorM6604ri = null;
        interpolatorM6604ri2 = null;
        if (interpolatorM6604ri != null) {
            pointF = pointFM6670lr4;
            c2167ri = new C2167ri<>(xhaVar, t4, t, interpolator, fNextDouble2, null);
        } else {
            pointF = pointFM6670lr4;
            c2167ri = new C2167ri<>(xhaVar, t4, t, interpolator, fNextDouble2, null);
        }
        c2167ri.f5402mj = pointFM6670lr3;
        c2167ri.jbs = pointF;
        return c2167ri;
    }

    /* JADX INFO: renamed from: ri */
    private static SparseArray<WeakReference<Interpolator>> m6603ri() {
        if (f4770lr == null) {
            f4770lr = new SparseArray<>();
        }
        return f4770lr;
    }

    /* JADX INFO: renamed from: ri */
    private static Interpolator m6604ri(PointF pointF, PointF pointF2) {
        Interpolator interpolatorM6472ri;
        pointF.x = C2018fi.m6558lr(pointF.x, -1.0f, 1.0f);
        pointF.y = C2018fi.m6558lr(pointF.y, -100.0f, 100.0f);
        pointF2.x = C2018fi.m6558lr(pointF2.x, -1.0f, 1.0f);
        pointF2.y = C2018fi.m6558lr(pointF2.y, -100.0f, 100.0f);
        int iM6543ri = C2017di.m6543ri(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> weakReferenceM6608ri = C2023fi.m6600ri() ? null : m6608ri(iM6543ri);
        Interpolator interpolator = weakReferenceM6608ri != null ? weakReferenceM6608ri.get() : null;
        if (weakReferenceM6608ri != null && interpolator != null) {
            return interpolator;
        }
        try {
            interpolatorM6472ri = C2014bu.m6472ri(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            interpolatorM6472ri = "The Path cannot loop back on itself.".equals(e.getMessage()) ? C2014bu.m6472ri(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!C2023fi.m6600ri()) {
            try {
                m6609ri(iM6543ri, (WeakReference<Interpolator>) new WeakReference(interpolatorM6472ri));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolatorM6472ri;
    }

    /* JADX INFO: renamed from: ri */
    private static <T> C2167ri<T> m6605ri(JsonReader jsonReader, float f, InterfaceC2037kt<T> interfaceC2037kt) throws IOException {
        return new C2167ri<>(interfaceC2037kt.mo6614lr(jsonReader, f));
    }

    /* JADX INFO: renamed from: ri */
    static <T> C2167ri<T> m6606ri(JsonReader jsonReader, xha xhaVar, float f, InterfaceC2037kt<T> interfaceC2037kt, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m6602lr(xhaVar, jsonReader, f, interfaceC2037kt);
        }
        return z ? m6607ri(xhaVar, jsonReader, f, interfaceC2037kt) : m6605ri(jsonReader, f, interfaceC2037kt);
    }

    /* JADX INFO: renamed from: ri */
    private static <T> C2167ri<T> m6607ri(xha xhaVar, JsonReader jsonReader, float f, InterfaceC2037kt<T> interfaceC2037kt) throws IOException {
        Interpolator interpolatorM6604ri;
        jsonReader.beginObject();
        PointF pointFM6670lr = null;
        T tMo6614lr = null;
        T tMo6614lr2 = null;
        PointF pointFM6670lr2 = null;
        PointF pointFM6670lr3 = null;
        float fNextDouble = 0.0f;
        boolean z = false;
        PointF pointFM6670lr4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tMo6614lr = interfaceC2037kt.mo6614lr(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "i":
                    pointFM6670lr4 = tan.m6670lr(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFM6670lr = tan.m6670lr(jsonReader, 1.0f);
                    break;
                case "s":
                    tMo6614lr2 = interfaceC2037kt.mo6614lr(jsonReader, f);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFM6670lr3 = tan.m6670lr(jsonReader, f);
                    break;
                case "to":
                    pointFM6670lr2 = tan.m6670lr(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z) {
            if (pointFM6670lr != null && pointFM6670lr4 != null) {
                interpolatorM6604ri = m6604ri(pointFM6670lr, pointFM6670lr4);
            }
            C2167ri<T> c2167ri = new C2167ri<>(xhaVar, tMo6614lr2, tMo6614lr, interpolatorM6604ri, fNextDouble, null);
            c2167ri.f5402mj = pointFM6670lr2;
            c2167ri.jbs = pointFM6670lr3;
            return c2167ri;
        }
        tMo6614lr = tMo6614lr2;
        interpolatorM6604ri = f4771ri;
        C2167ri<T> c2167ri2 = new C2167ri<>(xhaVar, tMo6614lr2, tMo6614lr, interpolatorM6604ri, fNextDouble, null);
        c2167ri2.f5402mj = pointFM6670lr2;
        c2167ri2.jbs = pointFM6670lr3;
        return c2167ri2;
    }

    /* JADX INFO: renamed from: ri */
    private static WeakReference<Interpolator> m6608ri(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (C2024ac.class) {
            weakReference = m6603ri().get(i);
        }
        return weakReference;
    }

    /* JADX INFO: renamed from: ri */
    private static void m6609ri(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C2024ac.class) {
            f4770lr.put(i, weakReference);
        }
    }
}
