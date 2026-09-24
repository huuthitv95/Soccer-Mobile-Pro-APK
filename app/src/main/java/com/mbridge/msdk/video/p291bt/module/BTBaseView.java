package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BTBaseView extends FrameLayout {
    public static final String TAG = "BTBaseView";

    /* JADX INFO: renamed from: n */
    protected static int f39709n = 0;

    /* JADX INFO: renamed from: o */
    protected static int f39710o = 1;

    /* JADX INFO: renamed from: a */
    protected Context f39711a;

    /* JADX INFO: renamed from: b */
    protected CampaignEx f39712b;

    /* JADX INFO: renamed from: c */
    protected String f39713c;

    /* JADX INFO: renamed from: d */
    protected String f39714d;

    /* JADX INFO: renamed from: e */
    protected C14223c f39715e;

    /* JADX INFO: renamed from: f */
    protected LayoutInflater f39716f;

    /* JADX INFO: renamed from: g */
    protected int f39717g;

    /* JADX INFO: renamed from: h */
    protected boolean f39718h;

    /* JADX INFO: renamed from: i */
    protected float f39719i;

    /* JADX INFO: renamed from: j */
    protected float f39720j;

    /* JADX INFO: renamed from: k */
    protected Rect f39721k;

    /* JADX INFO: renamed from: l */
    protected int f39722l;

    /* JADX INFO: renamed from: m */
    protected int f39723m;

    public BTBaseView(Context context) {
        this(context, null);
    }

    public BTBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39714d = "";
        this.f39717g = 1;
        this.f39718h = false;
        this.f39711a = context;
        this.f39716f = LayoutInflater.from(context);
        init(context);
    }

    /* JADX INFO: renamed from: a */
    protected static void m41515a(WebView webView, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, f39709n);
            jSONObject.put("id", str2);
            jSONObject.put("data", new JSONObject());
            C13392f.m38726a().m38728a(webView, str, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C13893d.m41513c().m41456a(webView, e.getMessage());
            C13219q0.m37813a(TAG, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    protected JSONObject m41516a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C13088a.f35866h, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f39719i));
                jSONObject2.put(C13088a.f35867i, C13229v0.m37902b(C13008c.m36588n().m36542d(), this.f39720j));
                jSONObject2.put(C13088a.f35871m, i);
                try {
                    this.f39717g = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONObject2.put(C13088a.f35869k, this.f39717g);
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

    /* JADX INFO: renamed from: b */
    protected void mo41517b() {
    }

    public void defaultShow() {
        C13219q0.m37813a(TAG, "defaultShow");
    }

    public int findColor(String str) {
        return C13203i0.m37707a(this.f39711a.getApplicationContext(), str, "color");
    }

    public int findDrawable(String str) {
        return C13203i0.m37707a(this.f39711a.getApplicationContext(), str, "drawable");
    }

    public int findID(String str) {
        return C13203i0.m37707a(this.f39711a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return C13203i0.m37707a(this.f39711a.getApplicationContext(), str, "layout");
    }

    public CampaignEx getCampaign() {
        return this.f39712b;
    }

    public String getInstanceId() {
        return this.f39714d;
    }

    public FrameLayout.LayoutParams getParentFrameLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
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

    public Rect getRect() {
        return this.f39721k;
    }

    public String getUnitId() {
        return this.f39713c;
    }

    public int getViewHeight() {
        return this.f39723m;
    }

    public int getViewWidth() {
        return this.f39722l;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f39711a.getResources().getConfiguration().orientation == 2;
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
        this.f39717g = configuration.orientation;
        super.onConfigurationChanged(configuration);
    }

    public abstract void onDestory();

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f39719i = motionEvent.getRawX();
        this.f39720j = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f39717g = configuration.orientation;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f39712b = campaignEx;
    }

    public void setInstanceId(String str) {
        this.f39714d = str;
    }

    public void setLayout(int i, int i2) {
        this.f39722l = i;
        this.f39723m = i2;
    }

    public void setLayoutCenter(int i, int i2) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
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
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.gravity = 17;
            if (i != -999) {
                parentFrameLayoutParams.width = i;
            }
            if (i2 != -999) {
                parentFrameLayoutParams.height = i2;
            }
            setLayoutParams(parentFrameLayoutParams);
        }
    }

    public void setLayoutParam(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams parentFrameLayoutParams = getParentFrameLayoutParams();
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
            return;
        }
        if (parentFrameLayoutParams != null) {
            parentFrameLayoutParams.topMargin = i2;
            parentFrameLayoutParams.leftMargin = i;
            if (i3 != -999) {
                parentFrameLayoutParams.width = i3;
            }
            if (i4 != -999) {
                parentFrameLayoutParams.height = i4;
            }
            setLayoutParams(parentFrameLayoutParams);
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

    public void setRect(Rect rect) {
        this.f39721k = rect;
    }

    public void setRewardUnitSetting(C14223c c14223c) {
        this.f39715e = c14223c;
    }

    public void setUnitId(String str) {
        this.f39713c = str;
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
