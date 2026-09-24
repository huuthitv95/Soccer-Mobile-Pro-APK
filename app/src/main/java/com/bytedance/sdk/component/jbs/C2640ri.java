package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.jbs.p158ri.C2642ri;
import com.bytedance.sdk.component.utils.C2716dw;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.jbs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2640ri extends AbstractViewOnTouchListenerC2636ik implements igq.InterfaceC2719ri {

    /* JADX INFO: renamed from: ac */
    private View.OnTouchListener f7473ac;

    /* JADX INFO: renamed from: aw */
    private int f7474aw;

    /* JADX INFO: renamed from: bu */
    private float f7475bu;

    /* JADX INFO: renamed from: co */
    private long f7476co;

    /* JADX INFO: renamed from: di */
    private final Context f7477di;

    /* JADX INFO: renamed from: fi */
    private final int f7478fi;

    /* JADX INFO: renamed from: ik */
    private final int f7479ik;

    /* JADX INFO: renamed from: ka */
    private final List<Integer> f7480ka;

    /* JADX INFO: renamed from: lr */
    private final int f7481lr;

    /* JADX INFO: renamed from: mj */
    private volatile float f7482mj;

    /* JADX INFO: renamed from: nr */
    private float f7483nr;

    /* JADX INFO: renamed from: sf */
    private long f7486sf;
    private boolean slm;
    private String tan;
    private volatile float xha;
    private float jbs = -1.0f;

    /* JADX INFO: renamed from: qt */
    private float f7484qt = -1.0f;

    /* JADX INFO: renamed from: vr */
    private final Handler f7487vr = new igq(jbs.m10235ri().getLooper(), this);

    /* JADX INFO: renamed from: ri */
    ri f7485ri = new ri() { // from class: com.bytedance.sdk.component.jbs.ri.1
        @Override // com.bytedance.sdk.component.jbs.C2640ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo9824ri() {
            if (C2640ri.this.jbs == -1.0f && C2640ri.this.f7484qt == -1.0f && C2640ri.this.f7476co == -1) {
                Float.valueOf(C2640ri.this.jbs);
                Float.valueOf(C2640ri.this.f7484qt);
                C2640ri c2640ri = C2640ri.this;
                c2640ri.jbs = c2640ri.xha;
                C2640ri c2640ri2 = C2640ri.this;
                c2640ri2.f7484qt = c2640ri2.f7482mj;
                C2640ri c2640ri3 = C2640ri.this;
                c2640ri3.f7476co = c2640ri3.f7486sf;
                C2640ri.this.slm = true;
            }
            Float.valueOf(C2640ri.this.jbs);
            Float.valueOf(C2640ri.this.f7484qt);
        }

        @Override // com.bytedance.sdk.component.jbs.C2640ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo9825ri(int i) {
            C2640ri.this.f7474aw = i;
            C2640ri.this.m9814lr();
        }
    };
    private int ihz = -1;
    private final List<Integer> bgr = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ri$ri */
    public interface ri {
        /* JADX INFO: renamed from: ri */
        void mo9824ri();

        /* JADX INFO: renamed from: ri */
        void mo9825ri(int i);
    }

    public C2640ri(Context context, int i, int i2, List<Integer> list, int i3) {
        this.f7477di = context;
        if (i == -1) {
            this.f7481lr = C2716dw.m10217ri(context);
        } else {
            this.f7481lr = C2716dw.m10218ri(context, i);
        }
        this.f7479ik = C2716dw.m10218ri(context, i2);
        this.f7480ka = list;
        this.f7478fi = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public void m9814lr() {
        this.jbs = -1.0f;
        this.f7484qt = -1.0f;
        this.f7476co = -1L;
    }

    /* JADX INFO: renamed from: ri */
    private int m9817ri(float f, float f2, long j) {
        if (this.jbs == -1.0f && this.f7484qt == -1.0f && this.f7476co == -1) {
            return 1;
        }
        Integer.valueOf(this.f7474aw);
        if (!this.f7480ka.contains(Integer.valueOf(this.f7474aw))) {
            return 2;
        }
        if (j - this.f7476co > this.f7478fi) {
            m9814lr();
            return 3;
        }
        float fAbs = Math.abs(f - this.jbs);
        float fAbs2 = Math.abs(f2 - this.f7484qt);
        Float.valueOf(f);
        Float.valueOf(this.jbs);
        Float.valueOf(fAbs);
        Float.valueOf(f2);
        Float.valueOf(this.f7484qt);
        Float.valueOf(fAbs2);
        Integer.valueOf(this.f7481lr);
        Integer.valueOf(this.f7479ik);
        if (fAbs <= this.f7481lr / 2.0f && fAbs2 <= this.f7479ik / 2.0f) {
            return 0;
        }
        m9814lr();
        return 4;
    }

    /* JADX INFO: renamed from: ri */
    private void m9820ri(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        if (i != 0) {
            i2 = 0;
        }
        jSONObject.put("is_interceptor", i2);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.f7474aw);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.f7487vr.sendMessageDelayed(messageObtain, 200L);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2640ri c2640ri;
        int action = motionEvent.getAction();
        Integer.valueOf(action);
        Float.valueOf(motionEvent.getX());
        Float.valueOf(motionEvent.getY());
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.f7486sf = SystemClock.elapsedRealtime();
        this.xha = x;
        this.f7482mj = y;
        if (action == 0) {
            c2640ri = this;
            c2640ri.f7475bu = x;
            c2640ri.f7483nr = y;
            Float.valueOf(x);
            Float.valueOf(c2640ri.f7483nr);
        } else if (action != 1) {
            c2640ri = this;
        } else {
            Float.valueOf(x);
            Float.valueOf(y);
            c2640ri = this;
            if (c2640ri.m9795ri(x, y, this.f7475bu, this.f7483nr, this.f7477di)) {
                int iM9817ri = m9817ri(c2640ri.xha, c2640ri.f7482mj, c2640ri.f7486sf);
                boolean zContains = c2640ri.bgr.contains(Integer.valueOf(c2640ri.f7474aw));
                m9820ri(view, motionEvent, iM9817ri, !zContains);
                if (!zContains) {
                    c2640ri.bgr.add(Integer.valueOf(c2640ri.f7474aw));
                }
                if (iM9817ri == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = c2640ri.f7473ac;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    public ri m9822ri() {
        return this.f7485ri;
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.slm ? 1 : 0);
                    this.slm = false;
                } catch (Throwable unused) {
                }
            }
            if (C2642ri.m9829ri().m9830lr() != null) {
                C2642ri.m9829ri().m9830lr().mo9828ri(this.tan, "arbitrage_click_event", jSONObject);
            }
        }
    }

    @Override // com.bytedance.sdk.component.jbs.AbstractViewOnTouchListenerC2636ik
    /* JADX INFO: renamed from: ri */
    public void mo9794ri(View.OnTouchListener onTouchListener) {
        this.f7473ac = onTouchListener;
    }

    /* JADX INFO: renamed from: ri */
    public void m9823ri(String str) {
        this.tan = str;
    }
}
