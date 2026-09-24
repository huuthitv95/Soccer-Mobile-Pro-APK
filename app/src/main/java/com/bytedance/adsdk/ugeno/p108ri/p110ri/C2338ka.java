package com.bytedance.adsdk.ugeno.p108ri.p110ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2347mj;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2338ka extends AbstractC2340ri {
    private static final float bgr;

    /* JADX INFO: renamed from: bu */
    private static final float f6074bu;
    private static final float slm;

    /* JADX INFO: renamed from: vr */
    private static final float f6075vr;

    /* JADX INFO: renamed from: aw */
    private Path f6076aw;

    /* JADX INFO: renamed from: co */
    private boolean f6077co;

    /* JADX INFO: renamed from: di */
    private C2348ri.ri f6078di;

    /* JADX INFO: renamed from: fi */
    private Path f6079fi;

    /* JADX INFO: renamed from: ik */
    private int f6080ik;
    private float jbs;

    /* JADX INFO: renamed from: ka */
    private Paint f6081ka;

    /* JADX INFO: renamed from: mj */
    private int f6082mj;

    /* JADX INFO: renamed from: nr */
    private float f6083nr;

    /* JADX INFO: renamed from: qt */
    private int f6084qt;

    /* JADX INFO: renamed from: sf */
    private int f6085sf;
    private int xha;

    static {
        float radians = (float) Math.toRadians(30.0d);
        bgr = radians;
        f6075vr = (float) Math.tan(radians);
        slm = (float) Math.cos(radians);
        f6074bu = (float) Math.sin(radians);
    }

    public C2338ka(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        super(abstractViewOnTouchListenerC2318ik, jSONObject);
        this.f6077co = true;
        Paint paint = new Paint();
        this.f6081ka = paint;
        paint.setAntiAlias(true);
        this.f6079fi = new Path();
        this.jbs = this.f6091lr.wjv();
        this.f6076aw = new Path();
    }

    /* JADX INFO: renamed from: ik */
    private void m8020ik(Canvas canvas) {
        LinearGradient linearGradient;
        try {
            if (this.f6091lr.m7838fe() > 0.0f) {
                int i = this.f6084qt;
                float f = f6075vr;
                float fM7838fe = (i + (i * f)) * this.f6091lr.m7838fe();
                this.f6076aw.reset();
                this.f6076aw.moveTo(fM7838fe, 0.0f);
                int i2 = this.f6085sf;
                float f2 = fM7838fe - (i2 * f);
                this.f6076aw.lineTo(f2, i2);
                this.f6076aw.lineTo(f2 + this.f6080ik, this.f6085sf);
                this.f6076aw.lineTo(this.f6080ik + fM7838fe, 0.0f);
                this.f6076aw.close();
                float f3 = this.f6083nr;
                float f4 = slm * f3;
                float f5 = f3 * f6074bu;
                if (!this.f6077co || this.f6078di == null) {
                    int i3 = this.f6082mj;
                    linearGradient = new LinearGradient(fM7838fe, 0.0f, fM7838fe + f4, f5, new int[]{i3, this.xha, i3}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(fM7838fe, 0.0f, fM7838fe + f4, f5, this.f6078di.f6103lr, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.f6081ka.setShader(linearGradient);
                Path path = this.f6079fi;
                if (path != null) {
                    canvas.clipPath(path, Region.Op.INTERSECT);
                }
                canvas.drawPath(this.f6076aw, this.f6081ka);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ik */
    public List<PropertyValuesHolder> mo8014ik() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(m8022ka(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8015lr() {
        this.f6080ik = (int) C2347mj.m8043ri(this.f6091lr.m7879sf().getContext(), this.f6092ri.optInt("shineWidth", 30));
        String strOptString = this.f6092ri.optString("backgroundColor", "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))");
        String str = TextUtils.isEmpty(strOptString) ? "linear-gradient(90deg, rgba(255, 255, 255, 0), rgba(255, 255, 255, 0.25) 30%, rgba(255, 255, 255, 0.3) 50%, rgba(255, 255, 255, 0.25) 70%, rgba(255, 255, 255, 0))" : strOptString;
        if (str.startsWith("linear")) {
            this.f6078di = C2348ri.m8051lr(str);
        } else {
            int iM8053ri = C2348ri.m8053ri(str);
            this.xha = iM8053ri;
            this.f6082mj = C2348ri.m8052ri(iM8053ri, 32);
            this.f6077co = false;
        }
        this.f6083nr = slm * this.f6080ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8016lr(Canvas canvas) {
        m8020ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8017ri(int i, int i2) {
        this.f6084qt = i;
        this.f6085sf = i2;
        try {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            Path path = this.f6079fi;
            float f = this.jbs;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8018ri(Canvas canvas) {
        m8020ik(canvas);
    }
}
