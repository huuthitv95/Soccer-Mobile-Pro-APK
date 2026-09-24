package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p148lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2598di;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2603lr {

    /* JADX INFO: renamed from: di */
    private final int f7335di;

    /* JADX INFO: renamed from: fi */
    private int f7336fi;

    /* JADX INFO: renamed from: ik */
    private final Bitmap.Config f7337ik;

    /* JADX INFO: renamed from: ka */
    private int f7338ka;

    /* JADX INFO: renamed from: mj */
    private final ImageView.ScaleType f7339mj;
    private final int xha;

    /* JADX INFO: renamed from: ri */
    public static final ImageView.ScaleType f7334ri = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: lr */
    public static final Bitmap.Config f7333lr = Bitmap.Config.ARGB_4444;
    private final int jbs = 1280;

    /* JADX INFO: renamed from: qt */
    private final int f7340qt = 83886080;

    public C2603lr(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.f7337ik = config;
        this.f7338ka = i;
        this.f7336fi = i2;
        this.f7339mj = scaleType;
        this.f7335di = i3;
        this.xha = i4;
        m9686ri(i, i2);
    }

    /* JADX INFO: renamed from: ri */
    private float m9683ri(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        return Math.max(i4 / (i2 / f), i5 / (i3 / f));
    }

    /* JADX INFO: renamed from: ri */
    private static int m9684ri(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (((double) i3) * (((double) i2) / ((double) i4)));
        }
        if (i2 == 0) {
            return i;
        }
        double d = ((double) i4) / ((double) i3);
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    /* JADX INFO: renamed from: ri */
    static int m9685ri(int i, int i2, int i3, int i4, int i5, int i6) {
        double dMin = Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4));
        if (i5 > 0 && i6 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i, i2)) / ((double) Math.max(i5, i6)), ((double) Math.min(i, i2)) / ((double) Math.min(i5, i6))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    /* JADX INFO: renamed from: ri */
    private void m9686ri(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.f7338ka = 1280;
                this.f7336fi = (i2 * 1280) / i;
                return;
            } else {
                this.f7338ka = (i * 1280) / i2;
                this.f7336fi = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.f7338ka = 1280;
            this.f7336fi = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.f7338ka = (i * 1280) / i2;
            this.f7336fi = 1280;
        }
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m9687ri(byte[] bArr, C2598di c2598di) {
        Context contextM9591ri;
        boolean zM9589lr;
        Bitmap bitmapDecodeByteArray;
        if (c2598di != null) {
            contextM9591ri = c2598di.m9591ri();
            zM9589lr = c2598di.m9589lr();
        } else {
            contextM9591ri = null;
            zM9589lr = false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f7338ka == 0 && this.f7336fi == 0) {
            options.inPreferredConfig = this.f7337ik;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int iM9684ri = m9684ri(this.f7338ka, this.f7336fi, i, i2);
            int iM9684ri2 = m9684ri(this.f7336fi, this.f7338ka, i2, i);
            options.inJustDecodeBounds = false;
            int iM9685ri = m9685ri(i, i2, iM9684ri, iM9684ri2, this.f7335di, this.xha);
            options.inSampleSize = iM9685ri;
            float fM9683ri = m9683ri(iM9685ri, i, i2, iM9684ri, iM9684ri2);
            boolean z = fM9683ri > 0.0f && fM9683ri < 1.0f && contextM9591ri != null && zM9589lr;
            if (z) {
                options.inScaled = true;
                options.inDensity = Integer.MAX_VALUE;
                options.inTargetDensity = Math.round(fM9683ri * 2.1474836E9f);
            }
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (z && bitmapDecodeByteArray != null) {
                bitmapDecodeByteArray.setDensity(contextM9591ri.getResources().getDisplayMetrics().densityDpi);
            }
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iM9684ri || bitmapDecodeByteArray.getHeight() > iM9684ri2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iM9684ri, iM9684ri2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }
}
