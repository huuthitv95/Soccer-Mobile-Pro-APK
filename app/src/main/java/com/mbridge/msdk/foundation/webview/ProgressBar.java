package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.controller.C13008c;

/* JADX INFO: loaded from: classes6.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: a */
    Runnable f36425a;

    /* JADX INFO: renamed from: b */
    private float f36426b;

    /* JADX INFO: renamed from: c */
    private float f36427c;

    /* JADX INFO: renamed from: d */
    private float f36428d;

    /* JADX INFO: renamed from: e */
    private Drawable f36429e;

    /* JADX INFO: renamed from: f */
    private float f36430f;

    /* JADX INFO: renamed from: g */
    private long f36431g;

    /* JADX INFO: renamed from: h */
    private Handler f36432h;

    /* JADX INFO: renamed from: i */
    private Drawable f36433i;

    /* JADX INFO: renamed from: j */
    private int f36434j;

    /* JADX INFO: renamed from: k */
    private boolean f36435k;

    /* JADX INFO: renamed from: l */
    private boolean f36436l;

    /* JADX INFO: renamed from: m */
    private long f36437m;

    /* JADX INFO: renamed from: n */
    private float f36438n;

    /* JADX INFO: renamed from: o */
    private boolean f36439o;

    /* JADX INFO: renamed from: p */
    private Drawable f36440p;

    /* JADX INFO: renamed from: q */
    private Rect f36441q;

    /* JADX INFO: renamed from: r */
    private Drawable f36442r;

    /* JADX INFO: renamed from: s */
    private float f36443s;

    /* JADX INFO: renamed from: t */
    private boolean f36444t;

    /* JADX INFO: renamed from: u */
    private int f36445u;

    /* JADX INFO: renamed from: v */
    private int f36446v;

    /* JADX INFO: renamed from: w */
    private int f36447w;

    /* JADX INFO: renamed from: x */
    private long f36448x;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.ProgressBar$a */
    class RunnableC13243a implements Runnable {
        RunnableC13243a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.invalidate();
        }
    }

    public ProgressBar(Context context) {
        super(context);
        this.f36425a = new RunnableC13243a();
        this.f36431g = 25L;
        this.f36432h = new Handler(Looper.getMainLooper());
        this.f36435k = false;
        this.f36438n = 0.95f;
        this.f36439o = false;
        this.f36441q = new Rect();
        m37975a(context);
    }

    /* JADX INFO: renamed from: a */
    private void m37975a(Context context) {
        setWillNotDraw(false);
    }

    private float getVelocity() {
        if (this.f36444t) {
            return this.f36436l ? 1.0f : 0.4f;
        }
        if (this.f36448x < 2000) {
            if (this.f36446v == 1) {
                return this.f36436l ? 1.0f : 0.4f;
            }
            if (this.f36445u == 1) {
                return this.f36436l ? 0.4f : 0.2f;
            }
            if (this.f36436l) {
                return 0.2f;
            }
        }
        return 0.05f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f36435k) {
            this.f36435k = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f36439o ? 0L : jCurrentTimeMillis - this.f36437m;
        this.f36428d = Math.abs(j / 1000.0f);
        this.f36437m = jCurrentTimeMillis;
        this.f36448x += j;
        float velocity = getVelocity();
        this.f36427c = velocity;
        float f = this.f36426b + (velocity * this.f36428d);
        this.f36426b = f;
        if (!this.f36444t) {
            float f2 = this.f36438n;
            if (f > f2) {
                this.f36426b = f2;
            }
        }
        this.f36441q.right = (int) (this.f36426b * this.f36443s);
        this.f36432h.removeCallbacksAndMessages(null);
        this.f36432h.postDelayed(this.f36425a, this.f36431g);
        super.draw(canvas);
        m37976a(canvas, this.f36428d);
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    public float getProgress() {
        return this.f36426b;
    }

    public void initResource(boolean z) {
        if (z || (this.f36433i == null && this.f36440p == null && this.f36442r == null && this.f36429e == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", C13008c.m36588n().m36550i()));
            this.f36433i = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f36433i.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", C13008c.m36588n().m36550i()));
            this.f36440p = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f36440p.getIntrinsicHeight());
            }
            this.f36442r = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", C13008c.m36588n().m36550i()));
            this.f36429e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", C13008c.m36588n().m36550i()));
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f36443s = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f36435k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.f36433i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f36440p;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z) {
        this.f36439o = z;
        if (z) {
            return;
        }
        this.f36437m = System.currentTimeMillis();
    }

    public void setProgress(float f, boolean z) {
        if (!z || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    public void setProgressBarListener(InterfaceC13247c interfaceC13247c) {
    }

    public void setProgressState(int i) {
        if (i == 5) {
            this.f36445u = 1;
            this.f36446v = 0;
            this.f36447w = 0;
            this.f36448x = 0L;
            return;
        }
        if (i == 6) {
            this.f36446v = 1;
            if (this.f36447w == 1) {
                startEndAnimation();
            }
            this.f36448x = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.f36447w = 1;
            if (this.f36446v == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setVisible(boolean z) {
        if (!z) {
            setVisibility(4);
            return;
        }
        this.f36436l = true;
        this.f36437m = System.currentTimeMillis();
        this.f36428d = 0.0f;
        this.f36448x = 0L;
        this.f36444t = false;
        this.f36430f = 0.0f;
        this.f36426b = 0.0f;
        this.f36443s = getMeasuredWidth();
        this.f36439o = false;
        this.f36445u = 0;
        this.f36446v = 0;
        this.f36447w = 0;
        Drawable drawable = this.f36433i;
        if (drawable != null) {
            this.f36434j = -drawable.getIntrinsicWidth();
        } else {
            this.f36434j = 0;
        }
        Drawable drawable2 = this.f36442r;
        if (drawable2 != null) {
            drawable2.setAlpha(255);
        }
        Drawable drawable3 = this.f36429e;
        if (drawable3 != null) {
            drawable3.setAlpha(255);
        }
        Drawable drawable4 = this.f36440p;
        if (drawable4 != null) {
            drawable4.setAlpha(255);
        }
        setVisibility(0);
        invalidate();
    }

    public void startEndAnimation() {
        if (this.f36444t) {
            return;
        }
        this.f36444t = true;
        this.f36430f = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    private void m37976a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f36444t) {
            float f2 = this.f36430f;
            float f3 = this.f36443s * 0.5f;
            int i = (int) ((1.0f - (f2 / f3)) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f2 > f3) {
                setVisible(false);
            }
            Drawable drawable3 = this.f36442r;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f36429e;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f36440p;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f36430f, 0.0f);
        }
        if (this.f36442r != null && this.f36440p != null) {
            int iWidth = (int) (this.f36441q.width() - (this.f36440p.getIntrinsicWidth() * 0.05f));
            Drawable drawable6 = this.f36442r;
            drawable6.setBounds(0, 0, iWidth, drawable6.getIntrinsicHeight());
            this.f36442r.draw(canvas);
        }
        if (this.f36444t && (drawable2 = this.f36429e) != null && this.f36440p != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f36429e;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f36429e.draw(canvas);
            canvas.restore();
        }
        if (this.f36440p != null) {
            canvas.save();
            canvas.translate(this.f36441q.width() - getWidth(), 0.0f);
            this.f36440p.draw(canvas);
            canvas.restore();
        }
        if (!this.f36444t && Math.abs(this.f36426b - this.f36438n) < 1.0E-5f && (drawable = this.f36433i) != null) {
            int i2 = (int) (this.f36434j + (f * 0.2f * this.f36443s));
            this.f36434j = i2;
            if (i2 + drawable.getIntrinsicWidth() >= this.f36441q.width()) {
                this.f36434j = -this.f36433i.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f36434j, 0.0f);
            this.f36433i.draw(canvas);
            canvas.restore();
        }
        if (this.f36444t) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36425a = new RunnableC13243a();
        this.f36431g = 25L;
        this.f36432h = new Handler(Looper.getMainLooper());
        this.f36435k = false;
        this.f36438n = 0.95f;
        this.f36439o = false;
        this.f36441q = new Rect();
        m37975a(context);
    }
}
