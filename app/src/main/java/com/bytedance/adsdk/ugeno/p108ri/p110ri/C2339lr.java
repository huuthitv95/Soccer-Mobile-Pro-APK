package com.bytedance.adsdk.ugeno.p108ri.p110ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.C2348ri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2339lr extends AbstractC2340ri {

    /* JADX INFO: renamed from: di */
    private Paint f6086di;

    /* JADX INFO: renamed from: fi */
    private int f6087fi;

    /* JADX INFO: renamed from: ik */
    private int f6088ik;

    /* JADX INFO: renamed from: ka */
    private int f6089ka;

    public C2339lr(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        super(abstractViewOnTouchListenerC2318ik, jSONObject);
        Paint paint = new Paint();
        this.f6086di = paint;
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: ik */
    private void m8021ik(Canvas canvas) {
        try {
            if (this.f6091lr.tnn() > 0.0f) {
                this.f6086di.setColor(this.f6088ik);
                this.f6086di.setAlpha((int) ((1.0f - this.f6091lr.tnn()) * 255.0f));
                ((ViewGroup) this.f6091lr.m7879sf().getParent()).setClipChildren(true);
                int i = this.f6089ka;
                int i2 = this.f6087fi;
                canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * this.f6091lr.tnn(), this.f6086di);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
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
        this.f6088ik = C2348ri.m8055ri(this.f6092ri.optString("backgroundColor"), -1);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8016lr(Canvas canvas) {
        m8021ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8017ri(int i, int i2) {
        this.f6089ka = i / 2;
        this.f6087fi = i2 / 2;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8018ri(Canvas canvas) {
        m8021ik(canvas);
    }
}
