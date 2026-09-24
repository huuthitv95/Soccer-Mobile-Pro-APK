package com.bytedance.adsdk.p065lr.p066di;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.p065lr.C2023fi;
import com.bytedance.adsdk.p065lr.p074ri.p075lr.C2135ka;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.ihz;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di.di */
/* JADX INFO: loaded from: classes3.dex */
public final class C2017di {

    /* JADX INFO: renamed from: ri */
    private static final ThreadLocal<PathMeasure> f4743ri = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lr.di.di.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };

    /* JADX INFO: renamed from: lr */
    private static final ThreadLocal<Path> f4742lr = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lr.di.di.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };

    /* JADX INFO: renamed from: ik */
    private static final ThreadLocal<Path> f4740ik = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lr.di.di.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    };

    /* JADX INFO: renamed from: ka */
    private static final ThreadLocal<float[]> f4741ka = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lr.di.di.4
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    };

    /* JADX INFO: renamed from: fi */
    private static final float f4739fi = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: lr */
    public static boolean m6539lr(Matrix matrix) {
        float[] fArr = f4741ka.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* JADX INFO: renamed from: ri */
    public static float m6540ri() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: ri */
    public static float m6541ri(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: ri */
    public static float m6542ri(Matrix matrix) {
        float[] fArr = f4741ka.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f4739fi;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: ri */
    public static int m6543ri(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* JADX INFO: renamed from: ri */
    public static Bitmap m6544ri(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: ri */
    public static Path m6545ri(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        path.cubicTo(pointF.x + pointF3.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        return path;
    }

    /* JADX INFO: renamed from: ri */
    public static void m6546ri(Canvas canvas, RectF rectF, Paint paint) {
        m6547ri(canvas, rectF, paint, 31);
    }

    /* JADX INFO: renamed from: ri */
    public static void m6547ri(Canvas canvas, RectF rectF, Paint paint, int i) {
        C2023fi.m6599ri("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C2023fi.m6596lr("Utils#saveLayer");
    }

    /* JADX INFO: renamed from: ri */
    public static void m6548ri(Path path, float f, float f2, float f3) {
        C2023fi.m6599ri("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f4743ri.get();
        Path path2 = f4742lr.get();
        Path path3 = f4740ik.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C2023fi.m6596lr("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            C2023fi.m6596lr("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = C2018fi.m6561ri(fMin, length);
            fMax = C2018fi.m6561ri(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = C2018fi.m6561ri(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = C2018fi.m6561ri(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            C2023fi.m6596lr("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        C2023fi.m6596lr("applyTrimPathIfNeeded");
    }

    /* JADX INFO: renamed from: ri */
    public static void m6549ri(Path path, ihz ihzVar) {
        if (ihzVar == null || ihzVar.m7144di()) {
            return;
        }
        m6548ri(path, ((C2135ka) ihzVar.m7146ik()).jbs() / 100.0f, ((C2135ka) ihzVar.m7147ka()).jbs() / 100.0f, ((C2135ka) ihzVar.m7145fi()).jbs() / 360.0f);
    }

    /* JADX INFO: renamed from: ri */
    public static void m6550ri(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m6551ri(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m6552ri(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }
}
