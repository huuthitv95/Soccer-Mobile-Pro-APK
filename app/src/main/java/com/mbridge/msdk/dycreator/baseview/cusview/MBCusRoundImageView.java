package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12979b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class MBCusRoundImageView extends ImageView {

    /* JADX INFO: renamed from: a */
    private int f34992a;

    /* JADX INFO: renamed from: b */
    private int f34993b;

    /* JADX INFO: renamed from: c */
    private int f34994c;

    /* JADX INFO: renamed from: d */
    private int f34995d;

    /* JADX INFO: renamed from: e */
    private Xfermode f34996e;

    /* JADX INFO: renamed from: f */
    private int f34997f;

    /* JADX INFO: renamed from: g */
    private int f34998g;

    /* JADX INFO: renamed from: h */
    private int f34999h;

    /* JADX INFO: renamed from: i */
    private int f35000i;

    /* JADX INFO: renamed from: j */
    private int f35001j;

    /* JADX INFO: renamed from: k */
    private int f35002k;

    /* JADX INFO: renamed from: l */
    private int f35003l;

    /* JADX INFO: renamed from: m */
    private int f35004m;

    /* JADX INFO: renamed from: n */
    private int f35005n;

    /* JADX INFO: renamed from: o */
    private float[] f35006o;

    /* JADX INFO: renamed from: p */
    private float[] f35007p;

    /* JADX INFO: renamed from: q */
    private RectF f35008q;

    /* JADX INFO: renamed from: r */
    private RectF f35009r;

    /* JADX INFO: renamed from: s */
    private boolean f35010s;

    /* JADX INFO: renamed from: t */
    private boolean f35011t;

    /* JADX INFO: renamed from: u */
    private Path f35012u;

    /* JADX INFO: renamed from: v */
    private Paint f35013v;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1 */
    static /* synthetic */ class C129261 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35014a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f35014a = iArr;
            try {
                iArr[EnumC12973c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35014a[EnumC12973c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35014a[EnumC12973c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35014a[EnumC12973c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35014a[EnumC12973c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35014a[EnumC12973c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35014a[EnumC12973c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35014a[EnumC12973c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35014a[EnumC12973c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35014a[EnumC12973c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35014a[EnumC12973c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35014a[EnumC12973c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35014a[EnumC12973c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35014a[EnumC12973c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35014a[EnumC12973c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35014a[EnumC12973c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m36224a(Canvas canvas) {
        m36225a(canvas, this.f35004m, this.f35005n, this.f35009r, this.f35006o);
    }

    /* JADX INFO: renamed from: b */
    private void m36226b() {
        int i;
        int i2;
        int i3;
        try {
            if (this.f35006o == null || this.f35007p == null) {
                return;
            }
            int i4 = 0;
            while (true) {
                i = 2;
                if (i4 >= 2) {
                    break;
                }
                float[] fArr = this.f35006o;
                float f = this.f35000i;
                fArr[i4] = f;
                this.f35007p[i4] = f - (this.f35004m / 2.0f);
                i4++;
            }
            while (true) {
                i2 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.f35006o;
                float f2 = this.f35001j;
                fArr2[i] = f2;
                this.f35007p[i] = f2 - (this.f35004m / 2.0f);
                i++;
            }
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                float[] fArr3 = this.f35006o;
                float f3 = this.f35002k;
                fArr3[i2] = f3;
                this.f35007p[i2] = f3 - (this.f35004m / 2.0f);
                i2++;
            }
            for (i3 = 6; i3 < 8; i3++) {
                float[] fArr4 = this.f35006o;
                float f4 = this.f35003l;
                fArr4[i3] = f4;
                this.f35007p[i3] = f4 - (this.f35004m / 2.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m36227c() {
        RectF rectF = this.f35009r;
        if (rectF != null) {
            float f = this.f35004m / 2.0f;
            rectF.set(f, f, this.f34997f - f, this.f34998g - f);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m36228d() {
        RectF rectF = this.f35008q;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f34997f, this.f34998g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129261.f35014a[enumC12973c.ordinal()];
                if (i2 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C12972b.m36361a().m36362a(attributeValue2);
                    }
                } else if (i2 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C12972b.m36361a().m36362a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f35008q, null, 31);
            int i = this.f34997f;
            int i2 = this.f35004m * 2;
            float f = (i - i2) * 1.0f;
            float f2 = i;
            int i3 = this.f34998g;
            float f3 = i3;
            canvas.scale(f / f2, ((i3 - i2) * 1.0f) / f3, f2 / 2.0f, f3 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f35013v;
            if (paint != null) {
                paint.reset();
                this.f35013v.setAntiAlias(true);
                this.f35013v.setStyle(Paint.Style.FILL);
                this.f35013v.setXfermode(this.f34996e);
            }
            Path path = this.f35012u;
            if (path != null) {
                path.reset();
                this.f35012u.addRoundRect(this.f35008q, this.f35007p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f35012u, this.f35013v);
            Paint paint2 = this.f35013v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f35010s) {
                m36224a(canvas);
            }
        } catch (Exception e) {
            C13219q0.m37813a("MBridgeImageView", e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f34997f = i;
            this.f34998g = i2;
            if (this.f35011t) {
                m36226b();
            } else {
                m36222a();
            }
            m36227c();
            m36228d();
        } catch (Exception e) {
            C13219q0.m37816b("MBridgeImageView", e.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                switch (C129261.f35014a[enumC12973c.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        C12972b.m36361a().m36366a(attributeSet.getAttributeValue(i), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                                }
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) C12979b.f35377a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = C12979b.f35377a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f34995d = iM36362a;
                        this.f34994c = iM36362a;
                        this.f34993b = iM36362a;
                        this.f34992a = iM36362a;
                        setPadding(iM36362a, iM36362a, iM36362a, iM36362a);
                        break;
                    case 9:
                        int iM36362a2 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f34993b = iM36362a2;
                        setPadding(this.f34992a, iM36362a2, this.f34994c, this.f34995d);
                        break;
                    case 10:
                        int iM36362a3 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f34995d = iM36362a3;
                        setPadding(this.f34992a, this.f34993b, this.f34994c, iM36362a3);
                        break;
                    case 11:
                        int iM36362a4 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f34992a = iM36362a4;
                        setPadding(iM36362a4, this.f34993b, this.f34994c, this.f34995d);
                        break;
                    case 12:
                        int iM36362a5 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f34994c = iM36362a5;
                        setPadding(this.f34992a, this.f34993b, iM36362a5, this.f34995d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i, int i2, int i3) {
        this.f35010s = true;
        this.f35004m = i2;
        this.f35005n = i3;
        this.f34999h = i;
    }

    public void setCornerRadius(int i) {
        this.f34999h = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f35010s = true;
        this.f35011t = true;
        this.f35004m = i5;
        this.f35005n = i6;
        this.f35000i = i;
        this.f35002k = i3;
        this.f35001j = i2;
        this.f35003l = i4;
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36225a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        try {
            m36223a(i, i2);
            Path path = this.f35012u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f35012u, this.f35013v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35012u = new Path();
        this.f35013v = new Paint();
        this.f35006o = new float[8];
        this.f35007p = new float[8];
        this.f35009r = new RectF();
        this.f35008q = new RectF();
        this.f34996e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* JADX INFO: renamed from: a */
    private void m36223a(int i, int i2) {
        Path path = this.f35012u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f35013v;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.f35013v.setColor(i2);
            this.f35013v.setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36222a() {
        if (this.f35006o == null || this.f35007p == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.f35006o;
                if (i >= fArr.length) {
                    return;
                }
                float f = this.f34999h;
                fArr[i] = f;
                this.f35007p[i] = f - (this.f35004m / 2.0f);
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
