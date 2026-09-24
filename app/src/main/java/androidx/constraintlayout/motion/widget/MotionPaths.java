package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11744X3;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {C11744X3.i.f26338L, "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* JADX INFO: renamed from: x */
    float f68x;

    /* JADX INFO: renamed from: y */
    float f69y;

    private static final float xRotate(float sin, float cos, float cx, float cy, float x, float y) {
        return (((x - cx) * cos) - ((y - cy) * sin)) + cx;
    }

    private static final float yRotate(float sin, float cos, float cx, float cy, float x, float y) {
        return ((x - cx) * sin) + ((y - cy) * cos) + cy;
    }

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.mAnimateRelativeTo = Key.UNSET;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    void initCartesian(KeyPosition c, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f = c.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = c.mDrawPath;
        float f2 = Float.isNaN(c.mPercentWidth) ? f : c.mPercentWidth;
        float f3 = Float.isNaN(c.mPercentHeight) ? f : c.mPercentHeight;
        float f4 = endTimePoint.width;
        float f5 = startTimePoint.width;
        float f6 = endTimePoint.height;
        float f7 = startTimePoint.height;
        this.position = this.time;
        float f8 = startTimePoint.f68x;
        float f9 = startTimePoint.f69y;
        float f10 = f;
        float f11 = (endTimePoint.f68x + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f12 = (endTimePoint.f69y + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f13 = (f4 - f5) * f2;
        float f14 = f13 / 2.0f;
        this.f68x = (int) ((f8 + (f11 * f10)) - f14);
        float f15 = (f6 - f7) * f3;
        float f16 = f15 / 2.0f;
        this.f69y = (int) ((f9 + (f12 * f10)) - f16);
        this.width = (int) (f5 + f13);
        this.height = (int) (f7 + f15);
        float f17 = Float.isNaN(c.mPercentX) ? f10 : c.mPercentX;
        float f18 = Float.isNaN(c.mAltPercentY) ? 0.0f : c.mAltPercentY;
        if (!Float.isNaN(c.mPercentY)) {
            f10 = c.mPercentY;
        }
        float f19 = Float.isNaN(c.mAltPercentX) ? 0.0f : c.mAltPercentX;
        this.mMode = 0;
        this.f68x = (int) (((startTimePoint.f68x + (f17 * f11)) + (f19 * f12)) - f14);
        this.f69y = (int) (((startTimePoint.f69y + (f11 * f18)) + (f12 * f10)) - f16);
        this.mKeyFrameEasing = Easing.getInterpolator(c.mTransitionEasing);
        this.mPathMotionArc = c.mPathMotionArc;
    }

    public MotionPaths(int parentWidth, int parentHeight, KeyPosition c, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.mAnimateRelativeTo = Key.UNSET;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (startTimePoint.mAnimateRelativeTo != Key.UNSET) {
            initPolar(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
            return;
        }
        int i = c.mPositionType;
        if (i == 1) {
            initPath(c, startTimePoint, endTimePoint);
        } else if (i == 2) {
            initScreen(parentWidth, parentHeight, c, startTimePoint, endTimePoint);
        } else {
            initCartesian(c, startTimePoint, endTimePoint);
        }
    }

    void initPolar(int parentWidth, int parentHeight, KeyPosition c, MotionPaths s, MotionPaths e) {
        float fMin;
        float f;
        float f2 = c.mFramePosition / 100.0f;
        this.time = f2;
        this.mDrawPath = c.mDrawPath;
        this.mMode = c.mPositionType;
        float f3 = Float.isNaN(c.mPercentWidth) ? f2 : c.mPercentWidth;
        float f4 = Float.isNaN(c.mPercentHeight) ? f2 : c.mPercentHeight;
        float f5 = e.width;
        float f6 = s.width;
        float f7 = e.height;
        float f8 = s.height;
        this.position = this.time;
        this.width = (int) (f6 + ((f5 - f6) * f3));
        this.height = (int) (f8 + ((f7 - f8) * f4));
        int i = c.mPositionType;
        if (i == 1) {
            float f9 = Float.isNaN(c.mPercentX) ? f2 : c.mPercentX;
            float f10 = e.f68x;
            float f11 = s.f68x;
            this.f68x = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(c.mPercentY)) {
                f2 = c.mPercentY;
            }
            float f12 = e.f69y;
            float f13 = s.f69y;
            this.f69y = (f2 * (f12 - f13)) + f13;
        } else if (i == 2) {
            if (Float.isNaN(c.mPercentX)) {
                float f14 = e.f68x;
                float f15 = s.f68x;
                fMin = ((f14 - f15) * f2) + f15;
            } else {
                fMin = Math.min(f4, f3) * c.mPercentX;
            }
            this.f68x = fMin;
            if (Float.isNaN(c.mPercentY)) {
                float f16 = e.f69y;
                float f17 = s.f69y;
                f = (f2 * (f16 - f17)) + f17;
            } else {
                f = c.mPercentY;
            }
            this.f69y = f;
        } else {
            float f18 = Float.isNaN(c.mPercentX) ? f2 : c.mPercentX;
            float f19 = e.f68x;
            float f20 = s.f68x;
            this.f68x = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(c.mPercentY)) {
                f2 = c.mPercentY;
            }
            float f21 = e.f69y;
            float f22 = s.f69y;
            this.f69y = (f2 * (f21 - f22)) + f22;
        }
        this.mAnimateRelativeTo = s.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c.mTransitionEasing);
        this.mPathMotionArc = c.mPathMotionArc;
    }

    public void setupRelative(MotionController mc, MotionPaths relative) {
        double d = ((this.f68x + (this.width / 2.0f)) - relative.f68x) - (relative.width / 2.0f);
        double d2 = ((this.f69y + (this.height / 2.0f)) - relative.f69y) - (relative.height / 2.0f);
        this.mRelativeToController = mc;
        this.f68x = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f69y = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f69y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    void initScreen(int parentWidth, int parentHeight, KeyPosition c, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f = c.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = c.mDrawPath;
        float f2 = Float.isNaN(c.mPercentWidth) ? f : c.mPercentWidth;
        float f3 = Float.isNaN(c.mPercentHeight) ? f : c.mPercentHeight;
        float f4 = endTimePoint.width;
        float f5 = startTimePoint.width;
        float f6 = endTimePoint.height;
        float f7 = startTimePoint.height;
        this.position = this.time;
        float f8 = startTimePoint.f68x;
        float f9 = startTimePoint.f69y;
        float f10 = endTimePoint.f68x + (f4 / 2.0f);
        float f11 = endTimePoint.f69y + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f68x = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f69y = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.width = (int) (f5 + f12);
        this.height = (int) (f7 + f13);
        this.mMode = 2;
        if (!Float.isNaN(c.mPercentX)) {
            this.f68x = (int) (c.mPercentX * ((int) (parentWidth - this.width)));
        }
        if (!Float.isNaN(c.mPercentY)) {
            this.f69y = (int) (c.mPercentY * ((int) (parentHeight - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c.mTransitionEasing);
        this.mPathMotionArc = c.mPathMotionArc;
    }

    void initPath(KeyPosition c, MotionPaths startTimePoint, MotionPaths endTimePoint) {
        float f = c.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = c.mDrawPath;
        float f2 = Float.isNaN(c.mPercentWidth) ? f : c.mPercentWidth;
        float f3 = Float.isNaN(c.mPercentHeight) ? f : c.mPercentHeight;
        float f4 = endTimePoint.width - startTimePoint.width;
        float f5 = endTimePoint.height - startTimePoint.height;
        this.position = this.time;
        if (!Float.isNaN(c.mPercentX)) {
            f = c.mPercentX;
        }
        float f6 = startTimePoint.f68x;
        float f7 = startTimePoint.width;
        float f8 = startTimePoint.f69y;
        float f9 = startTimePoint.height;
        float f10 = f;
        float f11 = (endTimePoint.f68x + (endTimePoint.width / 2.0f)) - ((f7 / 2.0f) + f6);
        float f12 = (endTimePoint.f69y + (endTimePoint.height / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = f11 * f10;
        float f14 = f4 * f2;
        float f15 = f14 / 2.0f;
        this.f68x = (int) ((f6 + f13) - f15);
        float f16 = f12 * f10;
        float f17 = f5 * f3;
        float f18 = f17 / 2.0f;
        this.f69y = (int) ((f8 + f16) - f18);
        this.width = (int) (f7 + f14);
        this.height = (int) (f9 + f17);
        float f19 = Float.isNaN(c.mPercentY) ? 0.0f : c.mPercentY;
        this.mMode = 1;
        float f20 = (int) ((startTimePoint.f68x + f13) - f15);
        this.f68x = f20;
        float f21 = (int) ((startTimePoint.f69y + f16) - f18);
        this.f68x = f20 + ((-f12) * f19);
        this.f69y = f21 + (f11 * f19);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(c.mTransitionEasing);
        this.mPathMotionArc = c.mPathMotionArc;
    }

    private boolean diff(float a2, float b) {
        if (Float.isNaN(a2) || Float.isNaN(b)) {
            return Float.isNaN(a2) != Float.isNaN(b);
        }
        return Math.abs(a2 - b) > 1.0E-6f;
    }

    void different(MotionPaths points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean zDiff = diff(this.f68x, points.f68x);
        boolean zDiff2 = diff(this.f69y, points.f69y);
        mask[0] = mask[0] | diff(this.position, points.position);
        boolean z = zDiff | zDiff2 | arcMode;
        mask[1] = mask[1] | z;
        mask[2] = z | mask[2];
        mask[3] = mask[3] | diff(this.width, points.width);
        mask[4] = diff(this.height, points.height) | mask[4];
    }

    void getCenter(double p, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f68x;
        float fCos = this.f69y;
        float f = this.width;
        float f2 = this.height;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                fSin = f3;
            } else if (i2 == 2) {
                fCos = f3;
            } else if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p, fArr, new float[2]);
            float f4 = fArr[0];
            float f5 = fArr[1];
            double d = f4;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((d + (Math.sin(d3) * d2)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d2 * Math.cos(d3))) - ((double) (f2 / 2.0f)));
        }
        point[offset] = fSin + (f / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    void getCenter(double p, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f;
        float fSin = this.f68x;
        float fCos = this.f69y;
        float f2 = this.width;
        float f3 = this.height;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f8 = (float) data[i];
            float f9 = (float) vdata[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                fSin = f8;
                f4 = f9;
            } else if (i2 == 2) {
                fCos = f8;
                f6 = f9;
            } else if (i2 == 3) {
                f2 = f8;
                f5 = f9;
            } else if (i2 == 4) {
                f3 = f8;
                f7 = f9;
            }
        }
        float f10 = (f5 / 2.0f) + f4;
        float fCos2 = (f7 / 2.0f) + f6;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(p, fArr, fArr2);
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            f = 2.0f;
            double d = fSin;
            double d2 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d2) * d)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (Math.cos(d2) * d)) - ((double) (f3 / 2.0f)));
            double d3 = f4;
            double dSin = ((double) f13) + (Math.sin(d2) * d3);
            double d4 = f6;
            float fCos3 = (float) (dSin + (Math.cos(d2) * d4));
            fCos2 = (float) ((((double) f14) - (d3 * Math.cos(d2))) + (Math.sin(d2) * d4));
            f10 = fCos3;
        } else {
            f = 2.0f;
        }
        point[0] = fSin + (f2 / f) + 0.0f;
        point[1] = fCos + (f3 / f) + 0.0f;
        velocity[0] = f10;
        velocity[1] = fCos2;
    }

    void getCenterVelocity(double p, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f68x;
        float fCos = this.f69y;
        float f = this.width;
        float f2 = this.height;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                fSin = f3;
            } else if (i2 == 2) {
                fCos = f3;
            } else if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            motionController.getCenter(p, fArr, new float[2]);
            float f4 = fArr[0];
            float f5 = fArr[1];
            double d = f4;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((d + (Math.sin(d3) * d2)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d2 * Math.cos(d3))) - ((double) (f2 / 2.0f)));
        }
        point[offset] = fSin + (f / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    void getBounds(int[] toUse, double[] data, float[] point, int offset) {
        float f = this.width;
        float f2 = this.height;
        for (int i = 0; i < toUse.length; i++) {
            float f3 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 3) {
                f = f3;
            } else if (i2 == 4) {
                f2 = f3;
            }
        }
        point[offset] = f;
        point[offset + 1] = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setView(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f;
        float fSin = this.f68x;
        float fCos = this.f69y;
        float f2 = this.width;
        float f3 = this.height;
        if (toUse.length != 0 && this.mTempValue.length <= toUse[toUse.length - 1]) {
            int i = toUse[toUse.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < toUse.length; i2++) {
            double[] dArr = this.mTempValue;
            int i3 = toUse[i2];
            dArr[i3] = data[i2];
            this.mTempDelta[i3] = slope[i2];
        }
        float f4 = Float.NaN;
        int i4 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (true) {
            double[] dArr2 = this.mTempValue;
            if (i4 >= dArr2.length) {
                break;
            }
            boolean zIsNaN = Double.isNaN(dArr2[i4]);
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (zIsNaN && (cycle == null || cycle[i4] == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                f = f4;
            } else {
                if (cycle != null) {
                    d = cycle[i4];
                }
                if (!Double.isNaN(this.mTempValue[i4])) {
                    d = this.mTempValue[i4] + d;
                }
                f = f4;
                float f9 = (float) d;
                float f10 = (float) this.mTempDelta[i4];
                if (i4 == 1) {
                    f4 = f;
                    f5 = f10;
                    fSin = f9;
                } else if (i4 == 2) {
                    f4 = f;
                    f6 = f10;
                    fCos = f9;
                } else if (i4 == 3) {
                    f4 = f;
                    f7 = f10;
                    f2 = f9;
                } else if (i4 == 4) {
                    f4 = f;
                    f8 = f10;
                    f3 = f9;
                } else if (i4 == 5) {
                    f4 = f9;
                }
                i4++;
            }
            f4 = f;
            i4++;
        }
        float f11 = f4;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(position, fArr, fArr2);
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr2[0];
            float f15 = fArr2[1];
            double d2 = f12;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f13) - (Math.cos(d4) * d3)) - ((double) (f3 / 2.0f)));
            double d5 = f14;
            double d6 = f5;
            double dSin = d5 + (Math.sin(d4) * d6);
            double dCos = Math.cos(d4) * d3;
            double d7 = f6;
            float f16 = (float) (dSin + (dCos * d7));
            float fCos2 = (float) ((((double) f15) - (d6 * Math.cos(d4))) + (Math.sin(d4) * d3 * d7));
            if (slope.length >= 2) {
                slope[0] = f16;
                slope[1] = fCos2;
            }
            if (!Float.isNaN(f11)) {
                view.setRotation((float) (((double) f11) + Math.toDegrees(Math.atan2(fCos2, f16))));
            }
        } else if (!Float.isNaN(f11)) {
            view.setRotation((float) (((double) 0.0f) + ((double) f11) + Math.toDegrees(Math.atan2(f6 + (f8 / 2.0f), f5 + (f7 / 2.0f)))));
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(fSin, fCos, f2 + fSin, f3 + fCos);
            return;
        }
        float f17 = fSin + 0.5f;
        int i5 = (int) f17;
        float f18 = fCos + 0.5f;
        int i6 = (int) f18;
        int i7 = (int) (f17 + f2);
        int i8 = (int) (f18 + f3);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    void getRect(int[] toUse, double[] data, float[] path, int offset) {
        float f = this.f68x;
        float fCos = this.f69y;
        float f2 = this.width;
        float f3 = this.height;
        for (int i = 0; i < toUse.length; i++) {
            float f4 = (float) data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f4;
            } else if (i2 == 2) {
                fCos = f4;
            } else if (i2 == 3) {
                f2 = f4;
            } else if (i2 == 4) {
                f3 = f4;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d = f;
            double d2 = fCos;
            float fSin = (float) ((((double) centerX) + (Math.sin(d2) * d)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) centerY) - (d * Math.cos(d2))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        float f5 = f2 + f;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        path[offset] = f + 0.0f;
        path[offset + 1] = fCos + 0.0f;
        path[offset + 2] = f5 + 0.0f;
        path[offset + 3] = fCos + 0.0f;
        path[offset + 4] = f5 + 0.0f;
        path[offset + 5] = f6 + 0.0f;
        path[offset + 6] = f + 0.0f;
        path[offset + 7] = f6 + 0.0f;
    }

    void setDpDt(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for (int i = 0; i < toUse.length; i++) {
            float f5 = (float) deltaData[i];
            double d = data[i];
            int i2 = toUse[i];
            if (i2 == 1) {
                f = f5;
            } else if (i2 == 2) {
                f3 = f5;
            } else if (i2 == 3) {
                f2 = f5;
            } else if (i2 == 4) {
                f4 = f5;
            }
        }
        float f6 = f - ((0.0f * f2) / 2.0f);
        float f7 = f3 - ((0.0f * f4) / 2.0f);
        mAnchorDpDt[0] = (f6 * (1.0f - locationX)) + (((f2 * 1.0f) + f6) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f7 * (1.0f - locationY)) + (((f4 * 1.0f) + f7) * locationY) + 0.0f;
    }

    void fillStandard(double[] data, int[] toUse) {
        float[] fArr = {this.position, this.f68x, this.f69y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 : toUse) {
            if (i2 < 6) {
                data[i] = fArr[i2];
                i++;
            }
        }
    }

    boolean hasCustomData(String name) {
        return this.attributes.containsKey(name);
    }

    int getCustomDataCount(String name) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    int getCustomData(String name, double[] value, int offset) {
        ConstraintAttribute constraintAttribute = this.attributes.get(name);
        int i = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            value[offset] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNumberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[iNumberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i < iNumberOfInterpolatedValues) {
            value[offset] = fArr[i];
            i++;
            offset++;
        }
        return iNumberOfInterpolatedValues;
    }

    void setBounds(float x, float y, float w, float h) {
        this.f68x = x;
        this.f69y = y;
        this.width = w;
        this.height = h;
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths o) {
        return Float.compare(this.position, o.position);
    }

    public void applyParameters(ConstraintSet.Constraint c) {
        this.mKeyFrameEasing = Easing.getInterpolator(c.motion.mTransitionEasing);
        this.mPathMotionArc = c.motion.mPathMotionArc;
        this.mAnimateRelativeTo = c.motion.mAnimateRelativeTo;
        this.mPathRotate = c.motion.mPathRotate;
        this.mDrawPath = c.motion.mDrawPath;
        this.mAnimateCircleAngleTo = c.motion.mAnimateCircleAngleTo;
        this.mProgress = c.propertySet.mProgress;
        this.mRelativeAngle = c.layout.circleAngle;
        for (String str : c.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = c.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController toOrbit) {
        toOrbit.getPos(this.mProgress);
    }
}
