package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.module.listener.impl.C14064f;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* JADX INFO: renamed from: a */
    protected Context f40201a;

    /* JADX INFO: renamed from: b */
    protected CampaignEx f40202b;

    /* JADX INFO: renamed from: c */
    protected LayoutInflater f40203c;

    /* JADX INFO: renamed from: d */
    protected int f40204d;

    /* JADX INFO: renamed from: e */
    protected boolean f40205e;

    /* JADX INFO: renamed from: f */
    protected float f40206f;

    /* JADX INFO: renamed from: g */
    protected float f40207g;

    /* JADX INFO: renamed from: h */
    protected boolean f40208h;

    /* JADX INFO: renamed from: i */
    protected int f40209i;

    /* JADX INFO: renamed from: j */
    protected boolean f40210j;

    /* JADX INFO: renamed from: k */
    protected int f40211k;

    /* JADX INFO: renamed from: l */
    protected int f40212l;
    public InterfaceC14058a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40204d = 1;
        this.notifyListener = new C14064f();
        this.f40205e = false;
        this.f40211k = 1;
        this.f40212l = 0;
        this.f40201a = context;
        this.f40203c = LayoutInflater.from(context);
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet);
        this.f40204d = 1;
        this.notifyListener = new C14064f();
        this.f40205e = false;
        this.f40211k = 1;
        this.f40212l = 0;
        this.f40201a = context;
        this.f40203c = LayoutInflater.from(context);
        this.f40208h = z;
        this.f40209i = i;
        this.f40210j = z2;
        this.f40211k = i2;
        this.f40212l = i3;
        init(context);
    }

    /* JADX INFO: renamed from: a */
    protected JSONObject m41939a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C13088a.f35866h, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f40206f));
                jSONObject2.put(C13088a.f35867i, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f40207g));
                jSONObject2.put(C13088a.f35871m, i);
                try {
                    this.f40204d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C13088a.f35869k, this.f40204d);
                jSONObject2.put(C13088a.f35870l, C13229v0.m37918d(getContext()));
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: c */
    protected String m41940c() {
        return m41939a(0).toString();
    }

    /* JADX INFO: renamed from: d */
    protected void mo41941d() {
    }

    public void defaultShow() {
        C13219q0.m37813a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z, String str) {
        return z ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return C13203i0.m37707a(this.f40201a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C13203i0.m37707a(this.f40201a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return C13203i0.m37707a(this.f40201a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C13203i0.m37707a(this.f40201a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f40202b;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f40201a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            if (viewArr[i] == null) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f40204d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f40206f = motionEvent.getRawX();
        this.f40207g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f40204d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f40202b = campaignEx;
    }

    public void setLayoutCenter(int i, int i2) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i != -999) {
                parentRelativeLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentRelativeLayoutParams.height = i2;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i != -999) {
                parentLinearLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentLinearLayoutParams.height = i2;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i2;
            parentRelativeLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentRelativeLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentRelativeLayoutParams.height = i4;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i2;
            parentLinearLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentLinearLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentLinearLayoutParams.height = i4;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotifyListener(InterfaceC14058a interfaceC14058a) {
        this.notifyListener = interfaceC14058a;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }
}
