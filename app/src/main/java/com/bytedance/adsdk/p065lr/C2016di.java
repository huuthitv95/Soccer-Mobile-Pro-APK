package com.bytedance.adsdk.p065lr;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2059ik;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.C2065lr;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2016di extends ImageView {

    /* JADX INFO: renamed from: lr */
    private static final InterfaceC2159sf<Throwable> f4683lr = new InterfaceC2159sf<Throwable>() { // from class: com.bytedance.adsdk.lr.di.1
        @Override // com.bytedance.adsdk.p065lr.InterfaceC2159sf
        /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo6534ri(Throwable th) {
            C2017di.m6552ri(th);
        }
    };

    /* JADX INFO: renamed from: ri */
    private static final String f4684ri = "di";

    /* JADX INFO: renamed from: ac */
    private long f4685ac;

    /* JADX INFO: renamed from: aw */
    private final Set<ka> f4686aw;

    /* JADX INFO: renamed from: ay */
    private int f4687ay;
    private final Set<Object> bgr;

    /* JADX INFO: renamed from: bu */
    private final Handler f4688bu;

    /* JADX INFO: renamed from: co */
    private boolean f4689co;

    /* JADX INFO: renamed from: di */
    private int f4690di;

    /* JADX INFO: renamed from: dw */
    private lr f4691dw;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2159sf<Throwable> f4692fi;

    /* JADX INFO: renamed from: fr */
    private int f4693fr;
    private JSONArray igq;
    private C2059ik ihz;

    /* JADX INFO: renamed from: ik */
    private final InterfaceC2159sf<xha> f4694ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private final InterfaceC2159sf<Throwable> f4695ka;

    /* JADX INFO: renamed from: mj */
    private String f4696mj;

    /* JADX INFO: renamed from: nr */
    private int f4697nr;
    private ri ory;

    /* JADX INFO: renamed from: qt */
    private boolean f4698qt;

    /* JADX INFO: renamed from: sf */
    private boolean f4699sf;
    private xha slm;

    /* JADX INFO: renamed from: su */
    private String f4700su;
    private Handler tan;

    /* JADX INFO: renamed from: uq */
    private int f4701uq;

    /* JADX INFO: renamed from: vr */
    private C2013aw<xha> f4702vr;
    private int wjv;
    private final jbs xha;

    /* JADX INFO: renamed from: zf */
    private final Runnable f4703zf;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f4722ri;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f4722ri = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4722ri[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4722ri[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4722ri[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$ik */
    private static class ik extends View.BaseSavedState {
        public static final Parcelable.Creator<ik> CREATOR = new Parcelable.Creator<ik>() { // from class: com.bytedance.adsdk.lr.di.ik.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ik createFromParcel(Parcel parcel) {
                return new ik(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ik[] newArray(int i) {
                return new ik[i];
            }
        };

        /* JADX INFO: renamed from: di */
        int f4727di;

        /* JADX INFO: renamed from: fi */
        String f4728fi;

        /* JADX INFO: renamed from: ik */
        float f4729ik;

        /* JADX INFO: renamed from: ka */
        boolean f4730ka;

        /* JADX INFO: renamed from: lr */
        int f4731lr;

        /* JADX INFO: renamed from: ri */
        String f4732ri;
        int xha;

        private ik(Parcel parcel) {
            super(parcel);
            this.f4732ri = parcel.readString();
            this.f4729ik = parcel.readFloat();
            this.f4730ka = parcel.readInt() == 1;
            this.f4728fi = parcel.readString();
            this.f4727di = parcel.readInt();
            this.xha = parcel.readInt();
        }

        ik(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f4732ri);
            parcel.writeFloat(this.f4729ik);
            parcel.writeInt(this.f4730ka ? 1 : 0);
            parcel.writeString(this.f4728fi);
            parcel.writeInt(this.f4727di);
            parcel.writeInt(this.xha);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$ka */
    private enum ka {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$lr */
    public interface lr {
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.di$ri */
    public interface ri {
    }

    public C2016di(Context context) {
        super(context);
        this.f4694ik = new InterfaceC2159sf<xha>() { // from class: com.bytedance.adsdk.lr.di.6
            @Override // com.bytedance.adsdk.p065lr.InterfaceC2159sf
            /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo6534ri(xha xhaVar) {
                C2016di.this.setComposition(xhaVar);
            }
        };
        this.f4695ka = new InterfaceC2159sf<Throwable>() { // from class: com.bytedance.adsdk.lr.di.7
            @Override // com.bytedance.adsdk.p065lr.InterfaceC2159sf
            /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo6534ri(Throwable th) {
                if (C2016di.this.f4690di != 0) {
                    C2016di c2016di = C2016di.this;
                    c2016di.setImageResource(c2016di.f4690di);
                }
                (C2016di.this.f4692fi == null ? C2016di.f4683lr : C2016di.this.f4692fi).mo6534ri(th);
            }
        };
        this.f4690di = 0;
        this.xha = new jbs();
        this.f4698qt = false;
        this.f4699sf = false;
        this.f4689co = true;
        this.f4686aw = new HashSet();
        this.bgr = new HashSet();
        this.f4688bu = new Handler(Looper.getMainLooper());
        this.f4697nr = 0;
        this.f4685ac = 0L;
        this.f4703zf = new Runnable() { // from class: com.bytedance.adsdk.lr.di.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + C2016di.this.f4701uq + ", " + C2016di.this.wjv);
                if (C2016di.this.f4701uq > C2016di.this.wjv) {
                    C2016di.m6495nr(C2016di.this);
                    C2059ik c2059ik = C2016di.this.ihz;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C2016di.this.f4701uq);
                    c2059ik.m6734ri(sb.toString());
                    C2016di.this.invalidate();
                    C2016di.this.m6517vr();
                    return;
                }
                if (C2016di.this.f4687ay < 0 || C2016di.this.f4693fr < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + C2016di.this.f4687ay + "," + C2016di.this.f4693fr);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + C2016di.this.f4687ay);
                    C2016di.this.m6527ri();
                    C2016di c2016di = C2016di.this;
                    c2016di.setFrame(c2016di.f4687ay);
                    C2016di.this.m6529ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (C2016di.this.getFrame() < C2016di.this.f4693fr - 1 || C2016di.this.getFrame() >= C2016di.this.f4693fr + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + C2016di.this.f4693fr);
                            C2016di.this.m6525lr(this);
                            C2016di.this.m6519di();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(C2016di.this.f4700su) || (C2016di.this.igq != null && C2016di.this.igq.length() > 0)) && C2016di.this.f4691dw != null) {
                    lr unused = C2016di.this.f4691dw;
                    String unused2 = C2016di.this.f4700su;
                    JSONArray unused3 = C2016di.this.igq;
                }
            }
        };
        m6494mj();
    }

    /* JADX INFO: renamed from: aw */
    private void m6477aw() {
        C2013aw<xha> c2013aw = this.f4702vr;
        if (c2013aw != null) {
            c2013aw.m6464lr(this.f4694ik);
            this.f4702vr.m6463ka(this.f4695ka);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bgr() {
        jbs jbsVar;
        int i;
        int i2;
        final int i3;
        if (this.slm == null || (jbsVar = this.xha) == null) {
            return;
        }
        C2012ac c2012acM6935ay = jbsVar.m6935ay();
        xha.C2162ik c2162ikM7191mj = this.slm.m7191mj();
        if (c2162ikM7191mj == null || c2012acM6935ay == null) {
            return;
        }
        final int i4 = c2162ikM7191mj.f5383ri;
        if (i4 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i4)));
            return;
        }
        final int i5 = -1;
        if (c2162ikM7191mj.f5379fi == null || c2162ikM7191mj.f5379fi.length < 2) {
            i = -1;
            i2 = -1;
        } else {
            i = c2162ikM7191mj.f5379fi[0];
            i2 = c2162ikM7191mj.f5379fi[1];
        }
        String strM6452ri = c2012acM6935ay.m6452ri(c2162ikM7191mj.f5380ik);
        String strM6452ri2 = c2012acM6935ay.m6452ri(c2162ikM7191mj.f5381ka);
        try {
            i3 = Integer.parseInt(strM6452ri);
            try {
                i5 = Integer.parseInt(strM6452ri2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i3 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i3 + ", lenS: " + i5);
        if (TextUtils.isEmpty(c2162ikM7191mj.f5382lr)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + c2162ikM7191mj.f5382lr);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + c2162ikM7191mj.f5382lr);
        C2059ik c2059ikM6484ik = m6484ik(c2162ikM7191mj.f5382lr);
        if (c2059ikM6484ik != null) {
            Log.i("TMe", "--==--- timer success");
            this.f4700su = c2162ikM7191mj.f5378di;
            this.igq = c2162ikM7191mj.xha;
            this.ihz = c2059ikM6484ik;
            this.f4701uq = i3;
            this.wjv = i3 - i5;
            this.f4687ay = i;
            this.f4693fr = i2;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4701uq);
            c2059ikM6484ik.m6734ri(sb.toString());
            m6529ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C2016di.this.getFrame() < i4 - 1 || C2016di.this.getFrame() >= i4 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + C2016di.this.getFrame());
                    C2016di.this.m6525lr(this);
                    if (i3 < 0 || i5 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        C2016di.this.m6517vr();
                    }
                    C2016di.this.m6519di();
                }
            });
        }
    }

    /* JADX INFO: renamed from: bu */
    private void m6479bu() {
        this.slm = null;
        this.xha.m6967qt();
    }

    /* JADX INFO: renamed from: co */
    private void m6481co() {
        m6528ri(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.lr.di.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C2012ac c2012acM6935ay;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - C2016di.this.f4685ac;
                C2016di.this.m6524lr(this);
                String playDelayedELExpressTimeS = C2016di.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (c2012acM6935ay = C2016di.this.xha.m6935ay()) != null) {
                    try {
                        int i = Integer.parseInt(c2012acM6935ay.m6452ri(playDelayedELExpressTimeS)) * 1000;
                        if (C2016di.this.f4685ac > 0) {
                            long jElapsedRealtime2 = (C2016di.this.f4685ac + ((long) i)) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                C2016di.this.m6519di();
                                C2016di.this.setVisibility(8);
                                if (C2016di.this.tan == null) {
                                    C2016di.this.tan = new Handler(Looper.getMainLooper());
                                }
                                C2016di.this.tan.removeCallbacksAndMessages(null);
                                C2016di.this.tan.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.lr.di.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        C2016di.this.setVisibility(0);
                                        C2016di.this.m6527ri();
                                        C2016di.this.m6507ri(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                C2016di.this.m6507ri(jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: renamed from: fi */
    static /* synthetic */ int m6483fi(C2016di c2016di) {
        int i = c2016di.f4697nr;
        c2016di.f4697nr = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xha.C2164ri getGlobalConfig() {
        xha xhaVarM6988su;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarM6988su = jbsVar.m6988su()) == null) {
            return null;
        }
        return xhaVarM6988su.m7200sf();
    }

    private xha.C2163lr getGlobalEvent() {
        xha xhaVarM6988su;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarM6988su = jbsVar.m6988su()) == null) {
            return null;
        }
        return xhaVarM6988su.m7192qt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        xha xhaVarM6988su;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (xhaVarM6988su = jbsVar.m6988su()) == null) {
            return null;
        }
        return xhaVarM6988su.jbs();
    }

    /* JADX INFO: renamed from: ik */
    private C2059ik m6484ik(String str) {
        C2065lr c2065lrM6957lr;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (c2065lrM6957lr = jbsVar.m6957lr()) == null) {
            return null;
        }
        return m6502ri(c2065lrM6957lr, str);
    }

    /* JADX INFO: renamed from: ik */
    private void m6485ik(Matrix matrix, float f, float f2, float f3, float f4) {
        matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
    }

    private void jbs() {
        m6528ri(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.lr.di.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C2016di.this.m6524lr(this);
                C2016di.this.bgr();
                C2016di.this.m6515sf();
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    private void m6487ka(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 >= f || f4 >= f2) {
            if (f3 / f4 >= f / f2) {
                float f5 = f / f3;
                matrix.preScale(f5, f5);
                matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
                return;
            } else {
                float f6 = f2 / f4;
                matrix.preScale(f6, f6);
                matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
                return;
            }
        }
        if (f3 / f4 >= f / f2) {
            float f7 = f / f3;
            matrix.preScale(f7, f7);
            matrix.postTranslate(0.0f, (f2 - (f4 * f7)) / 2.0f);
        } else {
            float f8 = f2 / f4;
            matrix.preScale(f8, f8);
            matrix.postTranslate((f - (f3 * f8)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: lr */
    private C2013aw<xha> m6489lr(final String str) {
        if (isInEditMode()) {
            return new C2013aw<>(new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.di.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public C2015co<xha> call() throws Exception {
                    return C2016di.this.f4689co ? C2125mj.m7024ik(C2016di.this.getContext(), str) : C2125mj.m7025ik(C2016di.this.getContext(), str, null);
                }
            }, true);
        }
        return this.f4689co ? C2125mj.m7027lr(getContext(), str) : C2125mj.m7028lr(getContext(), str, (String) null);
    }

    /* JADX INFO: renamed from: lr */
    private void m6491lr(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 < f && f4 < f2) {
            matrix.postTranslate((f - f3) / 2.0f, (f2 - f4) / 2.0f);
            return;
        }
        if (f3 / f4 >= f / f2) {
            float f5 = f / f3;
            matrix.preScale(f5, f5);
            matrix.postTranslate(0.0f, (f2 - (f4 * f5)) / 2.0f);
        } else {
            float f6 = f2 / f4;
            matrix.preScale(f6, f6);
            matrix.postTranslate((f - (f3 * f6)) / 2.0f, 0.0f);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m6492lr(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.xha.getBounds().width();
        float fHeight = this.xha.getBounds().height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.f4722ri[getScaleType().ordinal()];
        if (i == 1) {
            m6508ri(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            m6491lr(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            m6485ik(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            m6487ka(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    /* JADX INFO: renamed from: mj */
    private void m6494mj() {
        setSaveEnabled(false);
        this.f4689co = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        m6506ri(0.0f, false);
        m6533ri(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.xha.m6981ri(Boolean.valueOf(C2017di.m6541ri(getContext()) != 0.0f));
        jbs();
        m6498qt();
        m6481co();
    }

    /* JADX INFO: renamed from: nr */
    static /* synthetic */ int m6495nr(C2016di c2016di) {
        int i = c2016di.f4701uq;
        c2016di.f4701uq = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: nr */
    private void m6496nr() {
        boolean zM6522ka = m6522ka();
        setImageDrawable(null);
        setImageDrawable(this.xha);
        if (zM6522ka) {
            this.xha.m6934aw();
        }
    }

    /* JADX INFO: renamed from: qt */
    private void m6498qt() {
        m6529ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                C2016di.m6483fi(C2016di.this);
                xha.C2164ri globalConfig = C2016di.this.getGlobalConfig();
                if (globalConfig != null && globalConfig.f5390ka > 0 && globalConfig.f5390ka > C2016di.this.f4697nr) {
                    C2016di.this.bgr();
                    C2016di.this.m6527ri();
                    C2016di.this.setProgress(0.0f);
                } else {
                    C2016di.this.m6525lr(this);
                    if (C2016di.this.ory != null) {
                        ri unused = C2016di.this.ory;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private C2013aw<xha> m6501ri(final int i) {
        if (isInEditMode()) {
            return new C2013aw<>(new Callable<C2015co<xha>>() { // from class: com.bytedance.adsdk.lr.di.13
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                public C2015co<xha> call() throws Exception {
                    return C2016di.this.f4689co ? C2125mj.m7029lr(C2016di.this.getContext(), i) : C2125mj.m7030lr(C2016di.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.f4689co ? C2125mj.m7034ri(getContext(), i) : C2125mj.m7035ri(getContext(), i, (String) null);
    }

    /* JADX INFO: renamed from: ri */
    private C2059ik m6502ri(C2065lr c2065lr, String str) {
        for (AbstractC2068ri abstractC2068ri : c2065lr.m6756co()) {
            if (abstractC2068ri instanceof C2065lr) {
                C2059ik c2059ikM6502ri = m6502ri((C2065lr) abstractC2068ri, str);
                if (c2059ikM6502ri != null) {
                    return c2059ikM6502ri;
                }
            } else if (TextUtils.equals(str, abstractC2068ri.jbs()) && (abstractC2068ri instanceof C2059ik)) {
                return (C2059ik) abstractC2068ri;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private AbstractC2068ri m6503ri(MotionEvent motionEvent) {
        C2065lr c2065lrM6957lr;
        jbs jbsVar = this.xha;
        if (jbsVar == null || (c2065lrM6957lr = jbsVar.m6957lr()) == null) {
            return null;
        }
        return m6504ri(c2065lrM6957lr, motionEvent);
    }

    /* JADX INFO: renamed from: ri */
    private AbstractC2068ri m6504ri(C2065lr c2065lr, MotionEvent motionEvent) {
        AbstractC2068ri abstractC2068riM6504ri;
        for (AbstractC2068ri abstractC2068ri : c2065lr.m6756co()) {
            if (abstractC2068ri instanceof C2065lr) {
                if (abstractC2068ri.m6787mj() && abstractC2068ri.m6780di() > 0.0f) {
                    RectF rectF = new RectF();
                    abstractC2068ri.mo6710ri(rectF, abstractC2068ri.m6783ka(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (abstractC2068riM6504ri = m6504ri((C2065lr) abstractC2068ri, motionEvent)) != null) {
                        return abstractC2068riM6504ri;
                    }
                }
            } else if (abstractC2068ri.m6787mj() && abstractC2068ri.m6780di() > 0.0f) {
                RectF rectF2 = new RectF();
                jbs jbsVar = this.xha;
                if (jbsVar == null || !jbsVar.xha()) {
                    RectF rectF3 = new RectF();
                    abstractC2068ri.mo6710ri(rectF3, abstractC2068ri.m6783ka(), true);
                    m6492lr(rectF2, rectF3);
                } else {
                    abstractC2068ri.mo6710ri(rectF2, abstractC2068ri.m6783ka(), true);
                    RectF rectFOry = this.xha.ory();
                    if (rectFOry != null) {
                        m6509ri(rectF2, rectFOry);
                    }
                }
                if (m6513ri(motionEvent, rectF2)) {
                    return abstractC2068ri;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    private C2127qt m6505ri(String str) {
        jbs jbsVar;
        xha xhaVarM6988su;
        Map<String, C2127qt> mapSlm;
        if (TextUtils.isEmpty(str) || (jbsVar = this.xha) == null || (xhaVarM6988su = jbsVar.m6988su()) == null || (mapSlm = xhaVarM6988su.slm()) == null) {
            return null;
        }
        return mapSlm.get(str);
    }

    /* JADX INFO: renamed from: ri */
    private void m6506ri(float f, boolean z) {
        if (z) {
            this.f4686aw.add(ka.SET_PROGRESS);
        }
        this.xha.m6953ka(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m6507ri(long j) {
        xha.C2164ri globalConfig = getGlobalConfig();
        if (this.ory != null) {
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(j));
            if (globalConfig == null || globalConfig.f5391lr == null || globalConfig.f5391lr.isEmpty()) {
                return;
            }
            map.putAll(globalConfig.f5391lr);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6508ri(Matrix matrix, float f, float f2, float f3, float f4) {
        if (f3 / f4 >= f / f2) {
            float f5 = f2 / f4;
            matrix.preScale(f5, f5);
            matrix.postTranslate(-(((f3 * f5) - f) / 2.0f), 0.0f);
        } else {
            float f6 = f / f3;
            matrix.preScale(f6, f6);
            matrix.postTranslate(0.0f, -(((f4 * f6) - f2) / 2.0f));
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m6509ri(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == 0.0f || height == 0.0f || fWidth == 0.0f || fHeight == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        int i = AnonymousClass5.f4722ri[getScaleType().ordinal()];
        if (i == 1) {
            m6508ri(matrix, width, height, fWidth, fHeight);
        } else if (i == 2) {
            m6491lr(matrix, width, height, fWidth, fHeight);
        } else if (i == 3) {
            m6485ik(matrix, width, height, fWidth, fHeight);
        } else if (i == 4) {
            m6487ka(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    /* JADX INFO: renamed from: ri */
    private void m6511ri(String str, String str2, JSONArray jSONArray) {
        xha.C2163lr globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.f5386ri;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.f5384ik;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    /* JADX INFO: renamed from: ri */
    private void m6512ri(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i = iArr2[0];
            final int i2 = iArr2[1];
            if (i < 0 || i2 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i)));
            slm();
            m6527ri();
            setFrame(i);
            m6529ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (C2016di.this.getFrame() < i2 - 1 || C2016di.this.getFrame() >= i2 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i2 + ", realFrame: " + C2016di.this.getFrame());
                    C2016di.this.m6525lr(this);
                    C2016di.this.m6519di();
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m6513ri(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (x >= rectF.left && x <= rectF.right && y >= rectF.top && y <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void setCompositionTask(C2013aw<xha> c2013aw) {
        this.f4686aw.add(ka.SET_ANIMATION);
        m6479bu();
        m6477aw();
        this.f4702vr = c2013aw.m6465ri(this.f4694ik).m6462ik(this.f4695ka);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sf */
    public void m6515sf() {
        final xha.C2164ri globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.f5388fi <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.f5387di) && globalConfig.xha == null) {
            return;
        }
        int maxFrame = globalConfig.f5388fi;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        m6529ri(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lr.di.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                C2016di.this.m6525lr(this);
                if (C2016di.this.f4691dw != null) {
                    lr unused = C2016di.this.f4691dw;
                }
            }
        });
    }

    private void slm() {
        this.f4688bu.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: vr */
    public void m6517vr() {
        this.f4688bu.postDelayed(this.f4703zf, 1000L);
    }

    /* JADX INFO: renamed from: di */
    public void m6519di() {
        this.f4699sf = false;
        this.xha.m6991zf();
    }

    /* JADX INFO: renamed from: fi */
    public void m6520fi() {
        this.f4686aw.add(ka.PLAY_OPTION);
        this.xha.igq();
    }

    public boolean getClipToCompositionBounds() {
        return this.xha.m6951ik();
    }

    public xha getComposition() {
        return this.slm;
    }

    public long getDuration() {
        xha xhaVar = this.slm;
        if (xhaVar != null) {
            return (long) xhaVar.m7184fi();
        }
        return 0L;
    }

    public int getFrame() {
        return this.xha.tan();
    }

    public String getImageAssetsFolder() {
        return this.xha.m6952ka();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.xha.m6945fi();
    }

    public float getMaxFrame() {
        return this.xha.m6990vr();
    }

    public float getMinFrame() {
        return this.xha.bgr();
    }

    public C2126nr getPerformanceTracker() {
        return this.xha.m6964mj();
    }

    public float getProgress() {
        return this.xha.m6941dw();
    }

    public tan getRenderMode() {
        return this.xha.m6939di();
    }

    public int getRepeatCount() {
        return this.xha.ihz();
    }

    public int getRepeatMode() {
        return this.xha.m6933ac();
    }

    public float getSpeed() {
        return this.xha.slm();
    }

    /* JADX INFO: renamed from: ik */
    public void m6521ik() {
        this.xha.m6966nr();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof jbs) && ((jbs) drawable).m6939di() == tan.SOFTWARE) {
            this.xha.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        jbs jbsVar = this.xha;
        if (drawable2 == jbsVar) {
            super.invalidateDrawable(jbsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: ka */
    public boolean m6522ka() {
        return this.xha.m6989uq();
    }

    /* JADX INFO: renamed from: lr */
    public void m6523lr() {
        this.xha.m6936bu();
    }

    /* JADX INFO: renamed from: lr */
    public void m6524lr(Animator.AnimatorListener animatorListener) {
        this.xha.m6960lr(animatorListener);
    }

    /* JADX INFO: renamed from: lr */
    public void m6525lr(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xha.m6961lr(animatorUpdateListener);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f4699sf) {
            return;
        }
        this.xha.m6987sf();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        slm();
        Handler handler = this.tan;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        m6521ik();
        m6523lr();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof ik)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ik ikVar = (ik) parcelable;
        super.onRestoreInstanceState(ikVar.getSuperState());
        this.f4696mj = ikVar.f4732ri;
        if (!this.f4686aw.contains(ka.SET_ANIMATION) && !TextUtils.isEmpty(this.f4696mj)) {
            setAnimation(this.f4696mj);
        }
        this.jbs = ikVar.f4731lr;
        if (!this.f4686aw.contains(ka.SET_ANIMATION) && (i = this.jbs) != 0) {
            setAnimation(i);
        }
        if (!this.f4686aw.contains(ka.SET_PROGRESS)) {
            m6506ri(ikVar.f4729ik, false);
        }
        if (!this.f4686aw.contains(ka.PLAY_OPTION) && ikVar.f4730ka) {
            m6527ri();
        }
        if (!this.f4686aw.contains(ka.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(ikVar.f4728fi);
        }
        if (!this.f4686aw.contains(ka.SET_REPEAT_MODE)) {
            setRepeatMode(ikVar.f4727di);
        }
        if (this.f4686aw.contains(ka.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(ikVar.xha);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        ik ikVar = new ik(super.onSaveInstanceState());
        ikVar.f4732ri = this.f4696mj;
        ikVar.f4731lr = this.jbs;
        ikVar.f4729ik = this.xha.m6941dw();
        ikVar.f4730ka = this.xha.wjv();
        ikVar.f4728fi = this.xha.m6952ka();
        ikVar.f4727di = this.xha.m6933ac();
        ikVar.xha = this.xha.ihz();
        return ikVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        AbstractC2068ri abstractC2068riM6503ri = m6503ri(motionEvent);
        if (abstractC2068riM6503ri == null) {
            if (getGlobalConfig() == null || getGlobalConfig().f5392ri != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strJbs = abstractC2068riM6503ri.jbs();
        if (abstractC2068riM6503ri instanceof C2065lr) {
            if (getGlobalConfig() == null || getGlobalConfig().f5392ri != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strJbs != null && strJbs.startsWith("CSJCLOSE")) {
            slm();
        }
        C2127qt c2127qtM6505ri = m6505ri(abstractC2068riM6503ri.m6781fi());
        if (c2127qtM6505ri != null && motionEvent.getAction() == 1) {
            m6511ri(strJbs, c2127qtM6505ri.m7058fi(), c2127qtM6505ri.xha());
            int[][] iArrM7057di = c2127qtM6505ri.m7057di();
            if (iArrM7057di != null) {
                m6512ri(iArrM7057di);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f5385lr) != null) {
                m6512ri(iArr);
            }
        }
        if (strJbs == null || !strJbs.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m6526ri(String str, Bitmap bitmap) {
        return this.xha.m6968ri(str, bitmap);
    }

    /* JADX INFO: renamed from: ri */
    public void m6527ri() {
        if (this.f4685ac == 0) {
            this.f4685ac = SystemClock.elapsedRealtime();
        }
        this.f4686aw.add(ka.PLAY_OPTION);
        this.xha.m6987sf();
    }

    /* JADX INFO: renamed from: ri */
    public void m6528ri(Animator.AnimatorListener animatorListener) {
        this.xha.m6974ri(animatorListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m6529ri(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xha.m6975ri(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: ri */
    public void m6530ri(InputStream inputStream, String str) {
        setCompositionTask(C2125mj.m7038ri(inputStream, str));
    }

    /* JADX INFO: renamed from: ri */
    public void m6531ri(String str, String str2) {
        m6530ri(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* JADX INFO: renamed from: ri */
    public void m6532ri(boolean z) {
        this.xha.m6943fi(z ? -1 : 0);
    }

    /* JADX INFO: renamed from: ri */
    public void m6533ri(boolean z, Context context) {
        this.xha.m6985ri(z, context);
    }

    public void setAnimation(int i) {
        this.jbs = i;
        this.f4696mj = null;
        setCompositionTask(m6501ri(i));
    }

    public void setAnimation(String str) {
        this.f4696mj = str;
        this.jbs = 0;
        setCompositionTask(m6489lr(str));
    }

    public void setAnimationFromJson(String str) {
        m6531ri(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f4689co ? C2125mj.m7036ri(getContext(), str) : C2125mj.m7037ri(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.xha.m6944fi(z);
    }

    public void setCacheComposition(boolean z) {
        this.f4689co = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.xha.m6984ri(z);
    }

    public void setComposition(xha xhaVar) {
        if (C2023fi.f4767ri) {
            Log.v(f4684ri, "Set Composition \n".concat(String.valueOf(xhaVar)));
        }
        this.xha.setCallback(this);
        this.slm = xhaVar;
        this.f4698qt = true;
        boolean zM6986ri = this.xha.m6986ri(xhaVar, getContext().getApplicationContext());
        this.f4698qt = false;
        if (getDrawable() != this.xha || zM6986ri) {
            if (!zM6986ri) {
                m6496nr();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.bgr.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.xha.xha(str);
    }

    public void setFailureListener(InterfaceC2159sf<Throwable> interfaceC2159sf) {
        this.f4692fi = interfaceC2159sf;
    }

    public void setFallbackResource(int i) {
        this.f4690di = i;
    }

    public void setFontAssetDelegate(C2053ik c2053ik) {
        this.xha.m6978ri(c2053ik);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.xha.m6983ri(map);
    }

    public void setFrame(int i) {
        this.xha.m6948ik(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.xha.xha(z);
    }

    public void setImageAssetDelegate(InterfaceC2114ka interfaceC2114ka) {
        this.xha.m6979ri(interfaceC2114ka);
    }

    public void setImageAssetsFolder(String str) {
        this.xha.m6982ri(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m6477aw();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m6477aw();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        m6477aw();
        super.setImageResource(i);
    }

    public void setLottieAnimListener(ri riVar) {
        this.ory = riVar;
    }

    public void setLottieClicklistener(lr lrVar) {
        this.f4691dw = lrVar;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.xha.m6963lr(z);
    }

    public void setMaxFrame(int i) {
        this.xha.m6959lr(i);
    }

    public void setMaxFrame(String str) {
        this.xha.m6949ik(str);
    }

    public void setMaxProgress(float f) {
        this.xha.m6958lr(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.xha.m6955ka(str);
    }

    public void setMinFrame(int i) {
        this.xha.m6972ri(i);
    }

    public void setMinFrame(String str) {
        this.xha.m6962lr(str);
    }

    public void setMinProgress(float f) {
        this.xha.m6971ri(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.xha.m6956ka(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.xha.m6950ik(z);
    }

    public void setProgress(float f) {
        m6506ri(f, true);
    }

    public void setRenderMode(tan tanVar) {
        this.xha.m6980ri(tanVar);
    }

    public void setRepeatCount(int i) {
        this.f4686aw.add(ka.SET_REPEAT_COUNT);
        this.xha.m6943fi(i);
    }

    public void setRepeatMode(int i) {
        this.f4686aw.add(ka.SET_REPEAT_MODE);
        this.xha.m6954ka(i);
    }

    public void setSafeMode(boolean z) {
        this.xha.m6940di(z);
    }

    public void setSpeed(float f) {
        this.xha.m6947ik(f);
    }

    public void setTextDelegate(C2012ac c2012ac) {
        this.xha.m6977ri(c2012ac);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.xha.m6965mj(z);
    }

    public void setView(View view) {
        this.xha.m6976ri(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        jbs jbsVar;
        if (!this.f4698qt && drawable == (jbsVar = this.xha) && jbsVar.m6989uq()) {
            m6519di();
        } else if (!this.f4698qt && (drawable instanceof jbs)) {
            jbs jbsVar2 = (jbs) drawable;
            if (jbsVar2.m6989uq()) {
                jbsVar2.m6991zf();
            }
        }
        super.unscheduleDrawable(drawable);
    }
}
