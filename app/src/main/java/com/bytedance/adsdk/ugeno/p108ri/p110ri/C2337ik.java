package com.bytedance.adsdk.ugeno.p108ri.p110ri;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.p108ri.EnumC2326fi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2337ik extends AbstractC2340ri {

    /* JADX INFO: renamed from: di */
    private View f6067di;

    /* JADX INFO: renamed from: fi */
    private float f6068fi;

    /* JADX INFO: renamed from: ik */
    private String f6069ik;
    private PorterDuffXfermode jbs;

    /* JADX INFO: renamed from: ka */
    private float f6070ka;

    /* JADX INFO: renamed from: mj */
    private Paint f6071mj;

    /* JADX INFO: renamed from: qt */
    private LinearGradient f6072qt;

    /* JADX INFO: renamed from: sf */
    private Matrix f6073sf;
    private Paint xha;

    public C2337ik(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, JSONObject jSONObject) {
        super(abstractViewOnTouchListenerC2318ik, jSONObject);
        this.f6067di = this.f6091lr.m7879sf();
        Paint paint = new Paint();
        this.xha = paint;
        paint.setAntiAlias(true);
        this.f6067di.setLayerType(2, null);
        this.jbs = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f6071mj = new Paint();
        this.f6073sf = new Matrix();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ik */
    private void m8019ik(Canvas canvas) {
        byte b;
        try {
            if (this.f6091lr.bnj() <= 0.0f) {
                this.xha.setXfermode(this.jbs);
                canvas.drawRect(0.0f, 0.0f, this.f6070ka, this.f6068fi, this.xha);
                return;
            }
            int iBnj = (int) (this.f6070ka * this.f6091lr.bnj());
            int iBnj2 = (int) (this.f6068fi * this.f6091lr.bnj());
            this.xha.setXfermode(this.jbs);
            String str = this.f6069ik;
            switch (str.hashCode()) {
                case -1383228885:
                    if (!str.equals("bottom")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 115029:
                    if (!str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 3317767:
                    if (!str.equals("left")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 108511772:
                    if (!str.equals("right")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                float f = iBnj;
                canvas.drawRect(f, 0.0f, this.f6070ka, this.f6068fi, this.xha);
                this.f6073sf.setTranslate(f, this.f6068fi);
                this.f6072qt.setLocalMatrix(this.f6073sf);
                this.f6071mj.setShader(this.f6072qt);
                if (this.f6091lr.bnj() <= 1.0f && this.f6091lr.bnj() > 0.9f) {
                    this.f6071mj.setAlpha((int) (255.0f - (this.f6091lr.bnj() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, f, this.f6068fi, this.f6071mj);
                return;
            }
            if (b == 1) {
                float f2 = iBnj;
                canvas.drawRect(0.0f, 0.0f, this.f6070ka - f2, this.f6068fi, this.xha);
                this.f6073sf.setTranslate(this.f6070ka - f2, 0.0f);
                this.f6072qt.setLocalMatrix(this.f6073sf);
                this.f6071mj.setShader(this.f6072qt);
                if (this.f6091lr.bnj() <= 1.0f && this.f6091lr.bnj() > 0.9f) {
                    this.f6071mj.setAlpha((int) (255.0f - (this.f6091lr.bnj() * 255.0f)));
                }
                float f3 = this.f6070ka;
                canvas.drawRect(f3, this.f6068fi, f3 - f2, 0.0f, this.f6071mj);
                return;
            }
            if (b == 2) {
                float f4 = iBnj2;
                canvas.drawRect(0.0f, f4, this.f6070ka, this.f6068fi, this.xha);
                this.f6073sf.setTranslate(0.0f, f4);
                this.f6072qt.setLocalMatrix(this.f6073sf);
                this.f6071mj.setShader(this.f6072qt);
                if (this.f6091lr.bnj() <= 1.0f && this.f6091lr.bnj() > 0.9f) {
                    this.f6071mj.setAlpha((int) (255.0f - (this.f6091lr.bnj() * 255.0f)));
                }
                canvas.drawRect(0.0f, 0.0f, this.f6070ka, f4, this.f6071mj);
                return;
            }
            if (b != 3) {
                return;
            }
            float f5 = iBnj2;
            canvas.drawRect(0.0f, 0.0f, this.f6070ka, this.f6068fi - f5, this.xha);
            this.f6073sf.setTranslate(0.0f, this.f6068fi - f5);
            this.f6072qt.setLocalMatrix(this.f6073sf);
            this.f6071mj.setShader(this.f6072qt);
            if (this.f6091lr.bnj() <= 1.0f && this.f6091lr.bnj() > 0.9f) {
                this.f6071mj.setAlpha((int) (255.0f - (this.f6091lr.bnj() * 255.0f)));
            }
            float f6 = this.f6070ka;
            float f7 = this.f6068fi;
            canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.f6071mj);
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ik */
    public List<PropertyValuesHolder> mo8014ik() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(EnumC2326fi.ALPHA.m7961lr(), 0.0f, 1.0f));
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8015lr() {
        this.f6069ik = this.f6092ri.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: lr */
    public void mo8016lr(Canvas canvas) {
        m8019ik(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8017ri(int i, int i2) {
        this.f6070ka = i;
        this.f6068fi = i2;
        String str = this.f6069ik;
        str.hashCode();
        switch (str) {
            case "bottom":
                this.f6072qt = new LinearGradient(0.0f, -this.f6068fi, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "top":
                this.f6072qt = new LinearGradient(0.0f, this.f6068fi, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "left":
                this.f6072qt = new LinearGradient(this.f6070ka, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                break;
            case "right":
                this.f6072qt = new LinearGradient(-this.f6070ka, 0.0f, 0.0f, this.f6068fi, 0, -1, Shader.TileMode.CLAMP);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p108ri.p110ri.AbstractC2340ri
    /* JADX INFO: renamed from: ri */
    public void mo8018ri(Canvas canvas) {
        m8019ik(canvas);
    }
}
