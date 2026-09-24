package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: com.unity3d.player.j */
/* JADX INFO: loaded from: classes7.dex */
public final class C14689j extends View {

    /* JADX INFO: renamed from: a */
    final int f41747a;

    /* JADX INFO: renamed from: b */
    final int f41748b;

    /* JADX INFO: renamed from: c */
    Bitmap f41749c;

    /* JADX INFO: renamed from: d */
    Bitmap f41750d;

    /* JADX INFO: renamed from: com.unity3d.player.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f41751a;

        static {
            int[] iArr = new int[a.m43410a().length];
            f41751a = iArr;
            try {
                iArr[a.f41752a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41751a[a.f41753b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41751a[a.f41754c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.unity3d.player.j$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        public static final int f41752a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f41753b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f41754c = 3;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ int[] f41755d = {1, 2, 3};

        /* JADX INFO: renamed from: a */
        public static int[] m43410a() {
            return (int[]) f41755d.clone();
        }
    }

    public C14689j(Context context, int i) {
        super(context);
        this.f41747a = i;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.f41748b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f41749c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f41749c = null;
        }
        Bitmap bitmap2 = this.f41750d;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f41750d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f41748b == 0) {
            return;
        }
        if (this.f41749c == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.f41749c = BitmapFactory.decodeResource(getResources(), this.f41748b, options);
        }
        int width = this.f41749c.getWidth();
        int height = this.f41749c.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f = width / height;
        float f2 = width2;
        float f3 = height2;
        boolean z2 = f2 / f3 <= f;
        int[] iArr = AnonymousClass1.f41751a;
        int i5 = this.f41747a;
        int i6 = iArr[i5 - 1];
        if (i6 == 1) {
            if (width2 < width) {
                height = (int) (f2 / f);
                width = width2;
            }
            if (height2 < height) {
                width = (int) (f3 * f);
                height = height2;
            }
        } else if (i6 == 2 || i6 == 3) {
            if ((i5 == a.f41754c) ^ z2) {
                height = (int) (f2 / f);
                width = width2;
            } else {
                width = (int) (f3 * f);
                height = height2;
            }
        }
        Bitmap bitmap = this.f41750d;
        if (bitmap != null) {
            if (bitmap.getWidth() == width && this.f41750d.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.f41750d;
            if (bitmap2 != this.f41749c) {
                bitmap2.recycle();
                this.f41750d = null;
            }
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f41749c, width, height, true);
        this.f41750d = bitmapCreateScaledBitmap;
        bitmapCreateScaledBitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
        ColorDrawable colorDrawable = new ColorDrawable(ViewCompat.MEASURED_STATE_MASK);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f41750d);
        bitmapDrawable.setGravity(17);
        setBackground(new LayerDrawable(new Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
