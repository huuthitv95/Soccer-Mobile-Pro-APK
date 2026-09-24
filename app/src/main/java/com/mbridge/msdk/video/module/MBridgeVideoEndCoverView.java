package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.module.listener.impl.C14068j;
import com.mbridge.msdk.video.signal.factory.C14177b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m */
    private final String f40381m;

    /* JADX INFO: renamed from: n */
    private View f40382n;

    /* JADX INFO: renamed from: o */
    private ImageView f40383o;

    /* JADX INFO: renamed from: p */
    private ImageView f40384p;

    /* JADX INFO: renamed from: q */
    private TextView f40385q;

    /* JADX INFO: renamed from: r */
    private TextView f40386r;

    /* JADX INFO: renamed from: s */
    private TextView f40387s;

    /* JADX INFO: renamed from: t */
    private C14177b f40388t;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView$a */
    class ViewOnClickListenerC14032a implements View.OnClickListener {
        ViewOnClickListenerC14032a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.mo41600a(104, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView$b */
    class ViewOnClickListenerC14033b implements View.OnClickListener {
        ViewOnClickListenerC14033b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.m42046g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView$c */
    class ViewOnClickListenerC14034c implements View.OnClickListener {
        ViewOnClickListenerC14034c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.m42046g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f40381m = "MBridgeVideoEndCoverView";
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40381m = "MBridgeVideoEndCoverView";
    }

    /* JADX INFO: renamed from: a */
    private boolean m42043a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f40383o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f40384p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f40385q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f40386r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f40387s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            C13219q0.m37816b("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m42044e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f40202b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f40383o) != null) {
                C13185b1.m37632a(imageView, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                C13100b.m37152a(this.f40201a.getApplicationContext()).m37155a(this.f40202b.getIconUrl(), new C14068j(this.f40383o, C13229v0.m37876a(C13008c.m36588n().m36542d(), 8.0f)));
            }
            TextView textView = this.f40385q;
            if (textView != null) {
                textView.setText(this.f40202b.getAppName());
            }
            TextView textView2 = this.f40387s;
            if (textView2 != null) {
                C13185b1.m37632a(textView2, this.f40202b.getLocalRequestId(), this.f40202b.getLocalAllowTrackClick());
                this.f40387s.setText(this.f40202b.getAdCall());
            }
            TextView textView3 = this.f40386r;
            if (textView3 != null) {
                textView3.setText(this.f40202b.getAppDesc());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m42045f() {
        View view = this.f40382n;
        if (view == null) {
            init(this.f40201a);
            preLoadData(this.f40388t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f40382n.getParent()).removeView(this.f40382n);
        }
        addView(this.f40382n);
        m42043a(this.f40382n);
        mo41941d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        super.mo41941d();
        this.f40384p.setOnClickListener(new ViewOnClickListenerC14032a());
        this.f40383o.setOnClickListener(new ViewOnClickListenerC14033b());
        this.f40387s.setOnClickListener(new ViewOnClickListenerC14034c());
    }

    /* JADX INFO: renamed from: g */
    protected void m42046g() {
        JSONException e;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e2;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(C13088a.f35866h, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f40206f));
                    jSONObject2.put(C13088a.f35867i, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f40207g));
                    jSONObject2.put(C13088a.f35871m, 0);
                    try {
                        this.f40204d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    jSONObject2.put(C13088a.f35869k, this.f40204d);
                    jSONObject2.put(C13088a.f35870l, C13229v0.m37918d(getContext()));
                } catch (JSONException e4) {
                    e2 = e4;
                    C13219q0.m37816b("MBridgeVideoEndCoverView", e2.getMessage());
                }
            } catch (JSONException e5) {
                jSONObject2 = jSONObject3;
                e2 = e5;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(C13088a.f35868j, jSONObject2);
            } catch (JSONException e6) {
                e = e6;
                e.printStackTrace();
            }
        } catch (JSONException e7) {
            e = e7;
            jSONObject = null;
        }
        this.notifyListener.mo41600a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (C13203i0.m37709a(iFindLayout)) {
            View viewInflate = this.f40203c.inflate(iFindLayout, (ViewGroup) null);
            this.f40382n = viewInflate;
            if (viewInflate != null) {
                this.f40205e = m42043a(viewInflate);
                addView(this.f40382n, -1, -1);
                mo41941d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f40206f = motionEvent.getRawX();
        this.f40207g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f40204d = configuration.orientation;
        removeView(this.f40382n);
        m42045f();
    }

    public void preLoadData(C14177b c14177b) {
        this.f40388t = c14177b;
        try {
            if (this.f40202b == null || !this.f40205e) {
                return;
            }
            m42044e();
        } catch (Throwable th) {
            C13219q0.m37813a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }
}
