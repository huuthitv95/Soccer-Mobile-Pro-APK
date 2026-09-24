package com.bytedance.sdk.component.adexpress.p113di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import com.bytedance.sdk.component.utils.C2729uq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.co */
/* JADX INFO: loaded from: classes3.dex */
public class C2371co extends View {

    /* JADX INFO: renamed from: aw */
    private PorterDuff.Mode f6255aw;
    private LinearGradient bgr;

    /* JADX INFO: renamed from: co */
    private Xfermode f6256co;

    /* JADX INFO: renamed from: di */
    private int f6257di;

    /* JADX INFO: renamed from: fi */
    private int f6258fi;

    /* JADX INFO: renamed from: ik */
    private int f6259ik;
    private int[] jbs;

    /* JADX INFO: renamed from: ka */
    private int f6260ka;

    /* JADX INFO: renamed from: lr */
    Rect f6261lr;

    /* JADX INFO: renamed from: mj */
    private int f6262mj;

    /* JADX INFO: renamed from: qt */
    private Bitmap f6263qt;

    /* JADX INFO: renamed from: ri */
    Rect f6264ri;

    /* JADX INFO: renamed from: sf */
    private Paint f6265sf;

    /* JADX INFO: renamed from: vr */
    private final List<ri> f6266vr;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.di.co$ri */
    public static class ri {

        /* JADX INFO: renamed from: lr */
        private int f6267lr = 0;

        /* JADX INFO: renamed from: ri */
        private final int f6268ri;

        public ri(int i) {
            this.f6268ri = i;
        }

        /* JADX INFO: renamed from: ri */
        public void m8212ri() {
            this.f6267lr += this.f6268ri;
        }
    }

    public C2371co(Context context) {
        super(context);
        this.f6255aw = PorterDuff.Mode.DST_IN;
        this.f6266vr = new ArrayList();
        m8209ri();
    }

    /* JADX INFO: renamed from: ri */
    private void m8209ri() {
        this.f6259ik = C2729uq.m10305ka(getContext(), "tt_splash_unlock_image_arrow");
        this.f6260ka = Color.parseColor("#00ffffff");
        this.f6258fi = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.f6257di = color;
        this.xha = 10;
        this.f6262mj = 40;
        this.jbs = new int[]{this.f6260ka, this.f6258fi, color};
        setLayerType(1, null);
        this.f6265sf = new Paint(1);
        this.f6263qt = BitmapFactory.decodeResource(getResources(), this.f6259ik);
        this.f6256co = new PorterDuffXfermode(this.f6255aw);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f6263qt, this.f6264ri, this.f6261lr, this.f6265sf);
        canvas.save();
        Iterator<ri> it = this.f6266vr.iterator();
        while (it.hasNext()) {
            ri next = it.next();
            this.bgr = new LinearGradient(next.f6267lr, 0.0f, next.f6267lr + this.f6262mj, this.xha, this.jbs, (float[]) null, Shader.TileMode.CLAMP);
            this.f6265sf.setColor(-1);
            this.f6265sf.setShader(this.bgr);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f6265sf);
            this.f6265sf.setShader(null);
            next.m8212ri();
            if (next.f6267lr > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.f6265sf.setXfermode(this.f6256co);
        canvas3.drawBitmap(this.f6263qt, this.f6264ri, this.f6261lr, this.f6265sf);
        this.f6265sf.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f6263qt == null) {
            return;
        }
        this.f6264ri = new Rect(0, 0, this.f6263qt.getWidth(), this.f6263qt.getHeight());
        this.f6261lr = new Rect(0, 0, getWidth(), getHeight());
    }

    /* JADX INFO: renamed from: ri */
    public void m8210ri(int i) {
        this.f6266vr.add(new ri(i));
        postInvalidate();
    }
}
