package com.bytedance.adsdk.p065lr.p067fi;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p066di.C2021lr;
import com.bytedance.adsdk.p065lr.p068ik.p070lr.C2078ka;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.fi.vr */
/* JADX INFO: loaded from: classes3.dex */
public class C2050vr implements InterfaceC2037kt<C2078ka> {

    /* JADX INFO: renamed from: ri */
    private int f4789ri;

    public C2050vr(int i) {
        this.f4789ri = i;
    }

    /* JADX INFO: renamed from: ri */
    private int m6675ri(float f, int i, float[] fArr, float[] fArr2) {
        float fM6560ri;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fM6560ri = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fM6560ri = C2018fi.m6560ri(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fM6560ri * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX INFO: renamed from: ri */
    private C2078ka m6676ri(C2078ka c2078ka, List<Float> list) {
        int i = this.f4789ri * 4;
        if (list.size() <= i) {
            return c2078ka;
        }
        float[] fArrM6844ri = c2078ka.m6844ri();
        int[] iArrM6841lr = c2078ka.m6841lr();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrM6677ri = m6677ri(c2078ka.m6844ri(), fArr);
        int length = fArrM6677ri.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrM6677ri[i3];
            int iBinarySearch = Arrays.binarySearch(fArrM6844ri, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = m6678ri(f, fArr2[iBinarySearch2], fArrM6844ri, iArrM6841lr);
            } else {
                iArr[i3] = m6675ri(f, iArrM6841lr[iBinarySearch], fArr, fArr2);
            }
        }
        return new C2078ka(fArrM6677ri, iArr);
    }

    /* JADX INFO: renamed from: ri */
    protected static float[] m6677ri(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }

    /* JADX INFO: renamed from: ri */
    int m6678ri(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), C2021lr.m6589ri(f5, Color.red(i4), Color.red(i3)), C2021lr.m6589ri(f5, Color.green(i4), Color.green(i3)), C2021lr.m6589ri(f5, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.p065lr.p067fi.InterfaceC2037kt
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public C2078ka mo6614lr(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f4789ri = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f4789ri == -1) {
            this.f4789ri = arrayList.size() / 4;
        }
        int i = this.f4789ri;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4789ri * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 2) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 3) {
                    iArr[i5] = Color.argb(255, i2, i3, (int) (dFloatValue * 255.0d));
                }
            } else if (i5 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i5 - 1] >= f2) {
                    fArr[i5] = f2 + 0.01f;
                } else {
                    fArr[i5] = (float) dFloatValue;
                }
            } else {
                fArr[i5] = (float) dFloatValue;
            }
        }
        return m6676ri(new C2078ka(fArr, iArr), arrayList);
    }
}
