package com.bytedance.adsdk.p077ri.p078lr.p079fi.p080ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.fi.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2178fi {
    /* JADX INFO: renamed from: ri */
    private static Object m7235ri(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Double.valueOf(d - ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Double.valueOf(d - number.longValue());
        }
        if (number instanceof Float) {
            return Double.valueOf(d - ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Double.valueOf(d - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7236ri(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Float.valueOf(f - number.intValue());
        }
        if (number instanceof Long) {
            return Float.valueOf(f - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(f - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) f) - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7237ri(int i, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i - number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) i) - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) i) - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    private static Object m7238ri(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Long.valueOf(j - ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Long.valueOf(j - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(j - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(j - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    /* JADX INFO: renamed from: ri */
    public static Object m7239ri(Number number, Number number2) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return m7237ri(number.intValue(), number2);
        }
        if (number instanceof Long) {
            return m7238ri(number.longValue(), number2);
        }
        if (number instanceof Float) {
            return m7236ri(number.floatValue(), number2);
        }
        if (number instanceof Double) {
            return m7235ri(number.doubleValue(), number2);
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}
