package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.video.signal.factory.C14177b;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m */
    private ViewGroup f40376m;

    /* JADX INFO: renamed from: n */
    private View f40377n;

    /* JADX INFO: renamed from: o */
    private View f40378o;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVastEndCardView$a */
    class ViewOnClickListenerC14030a implements View.OnClickListener {
        ViewOnClickListenerC14030a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVastEndCardView.this.notifyListener.mo41600a(104, "");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeVastEndCardView$b */
    class C14031b extends AbstractViewOnClickListenerC14227a {
        C14031b() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
            mBridgeVastEndCardView.notifyListener.mo41600a(108, mBridgeVastEndCardView.m41940c());
        }
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private boolean m42041e() {
        this.f40376m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
        this.f40377n = findViewById(findID("mbridge_iv_vastclose"));
        View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
        this.f40378o = viewFindViewById;
        return isNotNULL(this.f40376m, this.f40377n, viewFindViewById);
    }

    /* JADX INFO: renamed from: f */
    private void m42042f() {
        if (this.f40205e) {
            setMatchParent();
            setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f40376m.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
        super.mo41941d();
        if (this.f40205e) {
            this.f40377n.setOnClickListener(new ViewOnClickListenerC14030a());
            this.f40378o.setOnClickListener(new C14031b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (C13203i0.m37709a(iFindLayout)) {
            this.f40203c.inflate(iFindLayout, this);
            this.f40205e = m42041e();
            mo41941d();
            m42042f();
        }
    }

    public void notifyShowListener() {
        this.notifyListener.mo41600a(111, "");
    }

    public void preLoadData(C14177b c14177b) {
    }
}
