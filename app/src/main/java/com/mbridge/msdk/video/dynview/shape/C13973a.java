package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.shape.a */
/* JADX INFO: compiled from: BackgroundDrawable.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13973a extends ShapeDrawable {

    /* JADX INFO: renamed from: a */
    private int f40045a;

    /* JADX INFO: renamed from: b */
    private float f40046b;

    /* JADX INFO: renamed from: c */
    private float f40047c;

    /* JADX INFO: renamed from: d */
    private int f40048d;

    /* JADX INFO: renamed from: e */
    private int f40049e;

    /* JADX INFO: renamed from: f */
    private Bitmap f40050f;

    /* JADX INFO: renamed from: g */
    private Bitmap f40051g;

    /* JADX INFO: renamed from: h */
    private boolean f40052h;

    /* JADX INFO: renamed from: i */
    private Paint f40053i;

    /* JADX INFO: renamed from: j */
    private Matrix f40054j;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.shape.a$b */
    /* JADX INFO: compiled from: BackgroundDrawable.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a */
        private RectShape f40055a;

        /* JADX INFO: renamed from: b */
        private Bitmap f40056b;

        /* JADX INFO: renamed from: c */
        private Bitmap f40057c;

        /* JADX INFO: renamed from: d */
        private boolean f40058d;

        /* JADX INFO: renamed from: e */
        private int f40059e;

        /* JADX INFO: renamed from: f */
        private int f40060f;

        /* JADX INFO: renamed from: g */
        private int f40061g;

        /* JADX INFO: renamed from: h */
        private float f40062h;

        /* JADX INFO: renamed from: i */
        private float f40063i;

        private b() {
            this.f40060f = 100;
            this.f40061g = 10;
            this.f40055a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        /* JADX INFO: renamed from: a */
        public c mo41833a(float f) {
            this.f40063i = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        /* JADX INFO: renamed from: a */
        public c mo41834a(int i) {
            this.f40061g = i;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        /* JADX INFO: renamed from: a */
        public c mo41835a(Bitmap bitmap) {
            this.f40057c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        /* JADX INFO: renamed from: a */
        public c mo41836a(boolean z) {
            this.f40058d = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m41837b(float f) {
            this.f40062h = f;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        /* JADX INFO: renamed from: b */
        public c mo41838b(Bitmap bitmap) {
            this.f40056b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        public C13973a build() {
            return new C13973a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.C13973a.c
        public c orientation(int i) {
            this.f40059e = i;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.shape.a$c */
    /* JADX INFO: compiled from: BackgroundDrawable.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        c mo41833a(float f);

        /* JADX INFO: renamed from: a */
        c mo41834a(int i);

        /* JADX INFO: renamed from: a */
        c mo41835a(Bitmap bitmap);

        /* JADX INFO: renamed from: a */
        c mo41836a(boolean z);

        /* JADX INFO: renamed from: b */
        c mo41838b(Bitmap bitmap);

        C13973a build();

        c orientation(int i);
    }

    private C13973a(b bVar) {
        super(bVar.f40055a);
        this.f40052h = false;
        this.f40050f = bVar.f40056b;
        this.f40051g = bVar.f40057c;
        this.f40052h = bVar.f40058d;
        this.f40045a = bVar.f40059e;
        this.f40048d = bVar.f40060f;
        this.f40049e = bVar.f40061g;
        this.f40046b = bVar.f40062h;
        this.f40047c = bVar.f40063i;
        Paint paint = new Paint();
        this.f40053i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f40053i.setAntiAlias(true);
        this.f40054j = new Matrix();
    }

    /* JADX INFO: renamed from: a */
    public static b m41819a() {
        return new b();
    }

    /* JADX INFO: renamed from: a */
    private void m41820a(Canvas canvas) {
        float f = this.f40046b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f40047c);
        path.lineTo((f - this.f40048d) - this.f40049e, this.f40047c);
        path.lineTo((this.f40048d + f) - this.f40049e, 0.0f);
        if (this.f40052h) {
            try {
                m41821a(canvas, path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f40050f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    m41822a(canvas, path, this.f40050f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f40048d + f + this.f40049e, 0.0f);
        path2.lineTo(this.f40046b, 0.0f);
        path2.lineTo(this.f40046b, this.f40047c);
        path2.lineTo((f - this.f40048d) + this.f40049e, this.f40047c);
        if (this.f40052h) {
            try {
                m41821a(canvas, path2);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f40051g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            m41822a(canvas, path2, this.f40051g);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41821a(Canvas canvas, Path path) {
        this.f40053i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f40053i);
    }

    /* JADX INFO: renamed from: a */
    private void m41822a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f40046b / bitmap.getWidth(), this.f40047c / bitmap.getHeight());
            if (this.f40054j == null) {
                this.f40054j = new Matrix();
            }
            this.f40054j.reset();
            this.f40054j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f40054j);
        this.f40053i.setShader(bitmapShader);
        canvas.drawPath(path, this.f40053i);
    }

    /* JADX INFO: renamed from: b */
    private void m41823b(Canvas canvas) {
        float f = this.f40047c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f40048d + f) - this.f40049e);
        path.lineTo(this.f40046b, (f - this.f40048d) - this.f40049e);
        path.lineTo(this.f40046b, 0.0f);
        if (this.f40052h) {
            try {
                m41821a(canvas, path);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f40050f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    m41822a(canvas, path, this.f40050f);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f40048d + f + this.f40049e);
        path2.lineTo(0.0f, this.f40047c);
        path2.lineTo(this.f40046b, this.f40047c);
        path2.lineTo(this.f40046b, (f - this.f40048d) + this.f40049e);
        if (this.f40052h) {
            try {
                m41821a(canvas, path2);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f40051g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            m41822a(canvas, path2, this.f40051g);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f40045a == 1) {
            m41823b(canvas);
        } else {
            m41820a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }
}
