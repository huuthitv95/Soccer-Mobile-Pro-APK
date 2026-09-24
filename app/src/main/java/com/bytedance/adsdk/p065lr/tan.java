package com.bytedance.adsdk.p065lr;

/* JADX INFO: loaded from: classes3.dex */
public enum tan {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.tan$1 */
    static /* synthetic */ class C21601 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f5356ri;

        static {
            int[] iArr = new int[tan.values().length];
            f5356ri = iArr;
            try {
                iArr[tan.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5356ri[tan.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5356ri[tan.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public boolean m7172ri(int i, boolean z, int i2) {
        int i3 = C21601.f5356ri[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
