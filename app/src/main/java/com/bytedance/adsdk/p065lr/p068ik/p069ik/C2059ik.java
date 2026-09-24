package com.bytedance.adsdk.p065lr.p068ik.p069ik;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.p065lr.C2012ac;
import com.bytedance.adsdk.p065lr.C2127qt;
import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p066di.C2017di;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.ik.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2059ik extends C2064ka {

    /* JADX INFO: renamed from: co */
    private String f4833co;
    private final LinearLayout.LayoutParams jbs;

    /* JADX INFO: renamed from: mj */
    private LinearLayout f4834mj;

    /* JADX INFO: renamed from: qt */
    private final List<String> f4835qt;

    /* JADX INFO: renamed from: sf */
    private final List<TextView> f4836sf;

    public C2059ik(jbs jbsVar, C2058fi c2058fi, Context context) {
        List<C2127qt.ri> listM7059ik;
        super(jbsVar, c2058fi);
        this.jbs = new LinearLayout.LayoutParams(-2, -2);
        this.f4835qt = new ArrayList();
        this.f4836sf = new ArrayList();
        if (this.xha == null || (listM7059ik = this.xha.m7059ik()) == null || listM7059ik.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4834mj = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        m6731lr(listM7059ik.get(0).xha);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.f4834mj.addView(linearLayout2);
        List<String> listM6729co = m6729co();
        while (i < listM7059ik.size()) {
            C2127qt.ri riVar = listM7059ik.get(i);
            TextView textView = new TextView(context);
            m6733ri(textView, riVar, (listM6729co == null || i >= listM6729co.size()) ? "" : listM6729co.get(i));
            if (riVar.f5164di != 0) {
                this.jbs.bottomMargin = (int) (riVar.f5164di * C2017di.m6540ri());
                linearLayout2.addView(textView, this.jbs);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
        }
        float fM6540ri = C2017di.m6540ri();
        m6732ri(this.f4834mj, (int) (this.xha.m7064ri() * fM6540ri), (int) (this.xha.m7061lr() * fM6540ri));
    }

    /* JADX INFO: renamed from: co */
    private List<String> m6729co() {
        C2012ac c2012acM6935ay;
        List<C2127qt.ri> listM7059ik;
        if (this.xha == null || this.f4881lr == null || (c2012acM6935ay = this.f4881lr.m6935ay()) == null) {
            return null;
        }
        String strM7060ka = this.xha.m7060ka();
        if ((!TextUtils.isEmpty(strM7060ka) || !TextUtils.isEmpty(this.f4833co)) && (listM7059ik = this.xha.m7059ik()) != null) {
            String strM6452ri = this.f4833co;
            if (TextUtils.isEmpty(strM6452ri)) {
                strM6452ri = c2012acM6935ay.m6452ri(strM7060ka);
            }
            if (!TextUtils.isEmpty(strM6452ri)) {
                int length = strM6452ri.length();
                this.f4835qt.clear();
                for (int i = 0; i < listM7059ik.size(); i++) {
                    C2127qt.ri riVar = listM7059ik.get(i);
                    int iMax = riVar.f5169ri;
                    int iMax2 = riVar.f5168lr;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.f4835qt.add("");
                    } else {
                        if (listM7059ik.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.f4835qt.add(strM6452ri.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.f4835qt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ik */
    private void m6730ik(float f) {
        List<C2127qt.ri> listM7059ik;
        if (this.xha == null || (listM7059ik = this.xha.m7059ik()) == null || listM7059ik.size() <= 0) {
            return;
        }
        this.f4834mj.setOrientation(0);
        this.f4834mj.setGravity(17);
        if (this.f4834mj.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f4834mj.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.f4834mj.removeAllViews();
        if (linearLayout.getChildCount() != listM7059ik.size()) {
            return;
        }
        List<String> listM6729co = m6729co();
        this.f4836sf.clear();
        int i = 0;
        while (i < listM7059ik.size()) {
            C2127qt.ri riVar = listM7059ik.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.f4836sf.add(textView);
            m6733ri(textView, riVar, (listM6729co == null || i >= listM6729co.size()) ? "" : listM6729co.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i2 = 0; i2 < listM7059ik.size(); i2++) {
            C2127qt.ri riVar2 = listM7059ik.get(i2);
            TextView textView2 = this.f4836sf.get(i2);
            textView2.setAlpha(f);
            linearLayout.setAlpha(f);
            if (riVar2.f5164di != 0) {
                this.jbs.bottomMargin = (int) (riVar2.f5164di * C2017di.m6540ri());
                linearLayout.addView(textView2, this.jbs);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.f4834mj.setAlpha(f);
        this.f4834mj.addView(linearLayout);
        float fM6540ri = C2017di.m6540ri();
        m6732ri(this.f4834mj, (int) (this.xha.m7064ri() * fM6540ri), (int) (this.xha.m7061lr() * fM6540ri));
    }

    /* JADX INFO: renamed from: lr */
    private void m6731lr(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f4834mj.setGravity(17);
            return;
        }
        str.hashCode();
        if (str.equals("left")) {
            this.f4834mj.setGravity(3);
        } else if (str.equals("right")) {
            this.f4834mj.setGravity(5);
        } else {
            this.f4834mj.setGravity(17);
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m6732ri(View view, int i, int i2) {
        view.layout(0, 0, i, i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: ri */
    private void m6733ri(TextView textView, C2127qt.ri riVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(riVar.f5166ik)) {
            textView.setTextColor(Color.parseColor(riVar.f5166ik));
        }
        if (!TextUtils.isEmpty(riVar.f5167ka)) {
            textView.setBackgroundColor(Color.parseColor(riVar.f5167ka));
        }
        textView.setGravity(17);
        textView.setTextSize(riVar.f5165fi);
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p069ik.C2064ka, com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri
    /* JADX INFO: renamed from: lr */
    public void mo6709lr(Canvas canvas, Matrix matrix, int i) {
        if (this.f4834mj == null) {
            super.mo6709lr(canvas, matrix, i);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m6790ri(i);
        m6730ik(m6780di());
        this.f4834mj.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: ri */
    public void m6734ri(String str) {
        this.f4833co = str;
    }
}
