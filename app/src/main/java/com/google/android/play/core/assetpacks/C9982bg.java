package com.google.android.play.core.assetpacks;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bg */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9982bg {
    /* JADX INFO: renamed from: a */
    public static boolean m22536a(int i) {
        return i == 1 || i == 7 || i == 2 || i == 9 || i == 3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22537b(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* JADX INFO: renamed from: c */
    static boolean m22538c(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i2 != 6 && i2 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m22539d(int i) {
        return i == 5 || i == 6 || i == 4;
    }
}
