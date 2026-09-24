package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.module.listener.impl.C14063e;
import com.mbridge.msdk.video.module.listener.impl.C14068j;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.video.signal.impl.C14191k;
import com.mbridge.msdk.videocommon.setting.C14223c;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {

    /* JADX INFO: renamed from: A */
    private TextView f39832A;

    /* JADX INFO: renamed from: B */
    private StarLevelView f39833B;

    /* JADX INFO: renamed from: C */
    private boolean f39834C;

    /* JADX INFO: renamed from: D */
    private boolean f39835D;

    /* JADX INFO: renamed from: E */
    private int f39836E;

    /* JADX INFO: renamed from: F */
    private Runnable f39837F;

    /* JADX INFO: renamed from: G */
    private boolean f39838G;

    /* JADX INFO: renamed from: H */
    private View f39839H;

    /* JADX INFO: renamed from: I */
    private String f39840I;

    /* JADX INFO: renamed from: J */
    private C14191k f39841J;

    /* JADX INFO: renamed from: K */
    private WebView f39842K;

    /* JADX INFO: renamed from: p */
    private ViewGroup f39843p;

    /* JADX INFO: renamed from: q */
    private ViewGroup f39844q;

    /* JADX INFO: renamed from: r */
    private RelativeLayout f39845r;

    /* JADX INFO: renamed from: s */
    private ImageView f39846s;

    /* JADX INFO: renamed from: t */
    private RoundImageView f39847t;

    /* JADX INFO: renamed from: u */
    private ImageView f39848u;

    /* JADX INFO: renamed from: v */
    private ImageView f39849v;

    /* JADX INFO: renamed from: w */
    private ImageView f39850w;

    /* JADX INFO: renamed from: x */
    private ImageView f39851x;

    /* JADX INFO: renamed from: y */
    private TextView f39852y;

    /* JADX INFO: renamed from: z */
    private TextView f39853z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$a */
    class RunnableC13916a implements Runnable {
        RunnableC13916a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeBTNativeEC.this.f39835D = true;
            if (MBridgeBTNativeEC.this.f39839H != null) {
                MBridgeBTNativeEC.this.f39839H.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$b */
    class ViewOnClickListenerC13917b implements View.OnClickListener {
        ViewOnClickListenerC13917b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.f39834C) {
                MBridgeBTNativeEC.this.m41651a(1, view.getContext());
                MBridgeBTNativeEC.this.m41650a(view.getX(), view.getY());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$c */
    class ViewOnClickListenerC13918c implements View.OnClickListener {
        ViewOnClickListenerC13918c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.f39842K != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", MBridgeBTNativeEC.this.f39714d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", MBridgeBTNativeEC.this.f39840I);
                    jSONObject.put("data", jSONObject2);
                    C13219q0.m37813a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                } catch (JSONException e) {
                    C13219q0.m37813a(BTBaseView.TAG, e.getMessage());
                }
                C13392f.m38726a().m38728a(MBridgeBTNativeEC.this.f39842K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$d */
    class C13919d extends AbstractViewOnClickListenerC14227a {
        C13919d() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            MBridgeBTNativeEC.this.m41651a(0, view.getContext());
            MBridgeBTNativeEC.this.m41650a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$e */
    class C13920e extends AbstractViewOnClickListenerC14227a {
        C13920e() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (!C13884b.m41421a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.m41651a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.m41650a(view.getX(), view.getY());
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC$f */
    class C13921f extends AbstractViewOnClickListenerC14227a {
        C13921f() {
        }

        @Override // com.mbridge.msdk.widget.AbstractViewOnClickListenerC14227a
        /* JADX INFO: renamed from: a */
        protected void mo38475a(View view) {
            if (!C13884b.m41421a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.m41651a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.m41650a(view.getX(), view.getY());
        }
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.f39834C = false;
        this.f39835D = false;
        this.f39836E = 0;
        this.f39838G = false;
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39834C = false;
        this.f39835D = false;
        this.f39836E = 0;
        this.f39838G = false;
    }

    /* JADX INFO: renamed from: a */
    private Bitmap m41648a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41650a(float f, float f2) {
        if (this.f39842K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                jSONObject.put("id", this.f39714d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f));
                jSONObject2.put("y", String.valueOf(f2));
                jSONObject.put("data", jSONObject2);
                C13392f.m38726a().m38728a(this.f39842K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                C13893d.m41513c().m41457a(this.f39842K, "onClicked", this.f39714d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41651a(int i, Context context) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(C13088a.f35868j, m41516a(i));
                } catch (JSONException e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
                return;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        if (this.f39841J != null) {
            if (C13884b.m41421a()) {
                doChinaJumpClick(context, this.f39841J);
            }
            this.f39841J.click(1, jSONObject != null ? jSONObject.toString() : "");
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m41654a(View view) {
        try {
            this.f39845r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f39846s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f39847t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f39848u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f39849v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f39850w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f39852y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f39853z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.f39832A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.f39833B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.f39839H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f39851x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f39846s, this.f39847t, this.f39848u, this.f39852y, this.f39853z, this.f39832A, this.f39833B, this.f39839H, this.ctaView);
        } catch (Throwable th) {
            C13219q0.m37817b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m41656b(View view) {
        if (view == null) {
            init(this.f39711a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        m41654a(view);
        mo41517b();
    }

    /* JADX INFO: renamed from: b */
    private boolean m41657b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f39716f.inflate(i, (ViewGroup) null);
            this.f39844q = viewGroup;
            addView(viewGroup);
            return m41654a(this.f39844q);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f39716f.inflate(i, (ViewGroup) null);
        this.f39843p = viewGroup2;
        addView(viewGroup2);
        return m41654a(this.f39843p);
    }

    /* JADX INFO: renamed from: c */
    private int m41659c() {
        return findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    /* JADX INFO: renamed from: b */
    protected void mo41517b() {
        if (this.f39718h) {
            this.f39845r.setOnClickListener(new ViewOnClickListenerC13917b());
            this.f39839H.setOnClickListener(new ViewOnClickListenerC13918c());
            this.ctaView.setOnClickListener(new C13919d());
            this.f39848u.setOnClickListener(new C13920e());
            this.f39847t.setOnClickListener(new C13921f());
        }
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f39711a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void init(Context context) {
        int iM41659c = m41659c();
        if (C13203i0.m37709a(iM41659c)) {
            this.f39718h = m41657b(iM41659c);
            mo41517b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f39837F == null) {
            this.f39837F = new RunnableC13916a();
        }
        Runnable runnable = this.f39837F;
        if (runnable != null) {
            postDelayed(runnable, this.f39836E * 1000);
        }
        if (!this.f39718h && this.f39842K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f39714d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.f39840I);
                jSONObject.put("data", jSONObject2);
                C13219q0.m37813a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e) {
                C13219q0.m37813a(BTBaseView.TAG, e.getMessage());
            }
            C13392f.m38726a().m38728a(this.f39842K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.f39842K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f39714d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.f39840I);
                jSONObject3.put("data", jSONObject4);
                C13219q0.m37813a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e2) {
                C13219q0.m37813a(BTBaseView.TAG, e2.getMessage());
            }
            C13392f.m38726a().m38728a(this.f39842K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f39837F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.f39717g = i;
        if (i == 2) {
            removeView(this.f39843p);
            m41656b(this.f39844q);
        } else {
            removeView(this.f39844q);
            m41656b(this.f39843p);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            CampaignEx campaignEx = this.f39712b;
            if (campaignEx == null || !this.f39718h) {
                return;
            }
            if (campaignEx.getCbd() > -2) {
                this.f39836E = this.f39712b.getCbd();
            } else {
                C14223c c14223c = this.f39715e;
                if (c14223c != null) {
                    this.f39836E = c14223c.m42728i();
                }
            }
            C13100b.m37152a(this.f39711a.getApplicationContext()).m37155a(this.f39712b.getImageUrl(), new C14063e(this.f39847t, this.f39712b, this.f39840I));
            C13100b.m37152a(this.f39711a.getApplicationContext()).m37155a(this.f39712b.getIconUrl(), new C14068j(this.f39848u, C13229v0.m37876a(C13008c.m36588n().m36542d(), 8.0f)));
            this.f39852y.setText(this.f39712b.getAppName());
            this.f39853z.setText(this.f39712b.getAppDesc());
            this.f39832A.setText(this.f39712b.getNumberRating() + ")");
            this.f39833B.removeAllViews();
            if (C13884b.m41421a()) {
                setChinaCTAData(this.f39712b);
            }
            double rating = this.f39712b.getRating();
            if (rating <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                rating = 5.0d;
            }
            this.f39833B.initScore(rating);
            try {
                Bitmap bitmapM41648a = m41648a(this.f39847t.getDrawable());
                if (bitmapM41648a != null && (bitmapBlurBitmap = blurBitmap(bitmapM41648a)) != null) {
                    this.f39846s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.f39846s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f39712b.getendcard_url()) && this.f39712b.getendcard_url().contains("alecfc=1")) {
                this.f39834C = true;
            }
            if (!TextUtils.isEmpty(this.f39712b.getendcard_url()) && this.f39712b.getendcard_url().contains("wlgo=1")) {
                this.f39838G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f39849v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", C13008c.m36588n().m36550i())));
            } else {
                this.f39849v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", C13008c.m36588n().m36550i())));
            }
            if (!this.f39838G) {
                this.f39849v.setVisibility(4);
                this.f39851x.setVisibility(4);
            }
            C13229v0.m37892a(2, this.f39850w, this.f39712b, this.f39711a, true, null);
            if (this.f39835D) {
                return;
            }
            this.f39839H.setVisibility(8);
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.f39842K = webView;
    }

    public void setJSCommon(C14191k c14191k) {
        this.f39841J = c14191k;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void setUnitId(String str) {
        this.f39840I = str;
    }
}
