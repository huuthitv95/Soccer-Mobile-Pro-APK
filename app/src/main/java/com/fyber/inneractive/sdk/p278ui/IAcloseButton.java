package com.fyber.inneractive.sdk.p278ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.AbstractC9174o;

/* JADX INFO: loaded from: classes4.dex */
public class IAcloseButton extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f21396a;

    /* JADX INFO: renamed from: b */
    public final Path f21397b;

    public IAcloseButton(Context context, int i) {
        super(context);
        int iM21998b = AbstractC9174o.m21998b(10);
        int i2 = ((i - (iM21998b * 2)) / 4) + iM21998b;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.f21397b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point3.x, point3.y);
        path.moveTo(point2.x, point2.y);
        path.lineTo(point4.x, point4.y);
        path.close();
        Paint paint = new Paint(1);
        this.f21396a = paint;
        paint.setStrokeWidth(AbstractC9174o.m21998b(2));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(AbstractC9174o.m21998b(2), -1);
        AbstractC9174o.m21995a(this, gradientDrawable);
        setPadding(iM21998b, iM21998b, iM21998b, iM21998b);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f21397b, this.f21396a);
    }
}
