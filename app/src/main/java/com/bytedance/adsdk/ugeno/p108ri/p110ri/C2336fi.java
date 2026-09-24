package com.bytedance.adsdk.ugeno.p108ri.p110ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2336fi extends AbstractC2340ri {

    /* JADX INFO: renamed from: aw */
    private PorterDuffXfermode f6058aw;

    /* JADX INFO: renamed from: co */
    private Path f6059co;

    /* JADX INFO: renamed from: di */
    private float f6060di;

    /* JADX INFO: renamed from: fi */
    private Paint f6061fi;

    /* JADX INFO: renamed from: ik */
    private float f6062ik;
    private boolean jbs;

    /* JADX INFO: renamed from: ka */
    private float f6063ka;

    /* JADX INFO: renamed from: mj */
    private boolean f6064mj;

    /* JADX INFO: renamed from: qt */
    private Path f6065qt;

    /* JADX INFO: renamed from: sf */
    private Path f6066sf;
    private String xha;

    public C2336fi(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        super(abstractViewOnTouchListenerC2318ik, jSONObject);
        this.f6064mj = true;
        this.jbs = true;
        Paint paint = new Paint();
        this.f6061fi = paint;
        paint.setAntiAlias(true);
        this.f6091lr.m7879sf().setLayerType(2, null);
        this.f6058aw = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f6065qt = new Path();
        this.f6066sf = new Path();
        this.f6059co = new Path();
        this.f6061fi.setXfermode(this.f6058aw);
    }

    /* JADX INFO: renamed from: ik */
    private void m8013ik(Canvas canvas) {
        if (this.f6091lr.m7882ta() <= 0.0f) {
            this.f6061fi.setXfermode(this.f6058aw);
            canvas.drawRect(0.0f, 0.0f, this.f6062ik, this.f6063ka, this.f6061fi);
            return;
        }
        int iM7882ta = (int) (this.f6062ik * this.f6091lr.m7882ta());
        int iM7882ta2 = (int) (this.f6063ka * this.f6091lr.m7882ta());
        this.f6061fi.setXfermode(this.f6058aw);
        String str = this.xha;
        str.hashCode();
        switch (str) {
            case "bottom":
                canvas.drawRect(0.0f, iM7882ta2, this.f6062ik, this.f6063ka, this.f6061fi);
                break;
            case "center":
                this.f6065qt.reset();
                this.f6066sf.reset();
                this.f6059co.reset();
                this.f6065qt.addCircle(this.f6062ik / 2.0f, this.f6063ka / 2.0f, iM7882ta, Path.Direction.CW);
                Path path = this.f6066sf;
                float f = this.f6062ik;
                path.addRect(f / 2.0f, 0.0f, f, this.f6063ka, Path.Direction.CW);
                this.f6066sf.op(this.f6065qt, Path.Op.DIFFERENCE);
                this.f6059co.addRect(0.0f, 0.0f, this.f6062ik / 2.0f, this.f6063ka, Path.Direction.CW);
                this.f6059co.op(this.f6065qt, Path.Op.DIFFERENCE);
                canvas.drawPath(this.f6066sf, this.f6061fi);
                canvas.drawPath(this.f6059co, this.f6061fi);
                break;
            case "top":
                canvas.drawRect(0.0f, 0.0f, this.f6062ik, this.f6063ka - iM7882ta2, this.f6061fi);
                break;
            case "left":
                canvas.drawRect(0.0f, 0.0f, this.f6062ik - iM7882ta, this.f6063ka, this.f6061fi);
                break;
            case "right":
                canvas.drawRect(iM7882ta, 0.0f, this.f6062ik, this.f6063ka, this.f6061fi);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ik */
    public List<PropertyValuesHolder> mo8014ik() {
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(m8022ka(), this.f6060di, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(propertyValuesHolderOfFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8015lr() {
        this.f6060di = (float) this.f6092ri.optDouble("start", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        this.xha = this.f6092ri.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8016lr(Canvas canvas) {
        m8013ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8017ri(int i, int i2) {
        if (i > 0 && this.f6064mj) {
            this.f6062ik = i;
            this.f6064mj = false;
        }
        if (i2 <= 0 || !this.jbs) {
            return;
        }
        this.f6063ka = i2;
        this.jbs = false;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8018ri(Canvas canvas) {
        m8013ik(canvas);
    }
}
