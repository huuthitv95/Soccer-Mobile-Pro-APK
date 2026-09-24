package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.C12654c;
import com.mbridge.msdk.advanced.middle.C12661c;
import com.mbridge.msdk.advanced.middle.C12662d;
import com.mbridge.msdk.advanced.middle.InterfaceC12659a;
import com.mbridge.msdk.advanced.report.C12663a;
import com.mbridge.msdk.advanced.signal.C12675a;
import com.mbridge.msdk.advanced.signal.C12676b;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.click.retry.C12701a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13078l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.same.buffer.C13091b;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13200h;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.omsdk.C13439b;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a */
/* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class C12655a {

    /* JADX INFO: renamed from: b */
    protected CampaignEx f33401b;

    /* JADX INFO: renamed from: c */
    protected MBNativeAdvancedView f33402c;

    /* JADX INFO: renamed from: d */
    protected C12662d f33403d;

    /* JADX INFO: renamed from: e */
    protected C12682a f33404e;

    /* JADX INFO: renamed from: f */
    private C12661c f33405f;

    /* JADX INFO: renamed from: g */
    private boolean f33406g;

    /* JADX INFO: renamed from: i */
    private ImageView f33408i;

    /* JADX INFO: renamed from: j */
    protected String f33409j;

    /* JADX INFO: renamed from: k */
    private String f33410k;

    /* JADX INFO: renamed from: l */
    protected MBridgeIds f33411l;

    /* JADX INFO: renamed from: m */
    private boolean f33412m;

    /* JADX INFO: renamed from: a */
    private String f33400a = "NativeAdvancedShowManager";

    /* JADX INFO: renamed from: h */
    private int f33407h = -1;

    /* JADX INFO: renamed from: n */
    private View.OnClickListener f33413n = new a();

    /* JADX INFO: renamed from: o */
    public Handler f33414o = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: p */
    private InterfaceC12659a f33415p = new c();

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$a */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C12655a.this.f33406g) {
                C12655a.this.m34382a(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$b */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = C12655a.this.f33401b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = C12655a.this.f33402c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                AdSession adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
                    adEventsCreateAdEvents.loaded();
                    adEventsCreateAdEvents.impressionOccurred();
                    C13219q0.m37813a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th) {
                C13219q0.m37813a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = C12655a.this.f33401b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = C12655a.this.f33401b.getRequestIdNotice();
                    String id = C12655a.this.f33401b.getId();
                    new C13146h(advancedNativeWebview.getContext()).m37370a(requestId, requestIdNotice, id, C12655a.this.f33409j, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$c */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class c implements InterfaceC12659a {
        c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        /* JADX INFO: renamed from: a */
        public void mo34407a(int i) {
            C13219q0.m37816b(C12655a.this.f33400a, "resetCountdown" + i);
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        /* JADX INFO: renamed from: a */
        public void mo34408a(CampaignEx campaignEx) {
            C12655a.this.mo34400a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        /* JADX INFO: renamed from: a */
        public void mo34409a(boolean z) {
            C12655a c12655a = C12655a.this;
            if (c12655a.f33403d != null) {
                c12655a.f33412m = z;
                if (z) {
                    C12655a c12655a2 = C12655a.this;
                    c12655a2.f33403d.m34531f(c12655a2.f33411l);
                } else {
                    C12655a c12655a3 = C12655a.this;
                    c12655a3.f33403d.m34525a(c12655a3.f33411l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        /* JADX INFO: renamed from: a */
        public void mo34410a(boolean z, String str) {
            try {
                if (C12655a.this.f33403d != null) {
                    if (TextUtils.isEmpty(str)) {
                        C12655a c12655a = C12655a.this;
                        c12655a.f33403d.m34527b(c12655a.f33411l);
                        C12655a c12655a2 = C12655a.this;
                        c12655a2.f33403d.m34529d(c12655a2.f33411l);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C12655a.this.f33401b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    C12655a.this.mo34400a(campaignWithBackData, z, str);
                }
            } catch (Exception e) {
                C13219q0.m37816b(C12655a.this.f33400a, e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        public void close() {
            C12655a.this.m34382a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        public void toggleCloseBtn(int i) {
            C12655a.this.f33407h = i;
            MBNativeAdvancedView mBNativeAdvancedView = C12655a.this.f33402c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.InterfaceC12659a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = C12655a.this.f33402c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            C12655a.this.m34382a(1);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$d */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class d implements InterfaceC13083a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MBNativeAdvancedView f33419a;

        d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f33419a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34411a() {
            String string;
            C12655a.this.m34404e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(C12655a.this.f33400a, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) this.f33419a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        /* JADX INFO: renamed from: a */
        public void mo34412a(String str) {
            String string;
            C12655a.this.m34405f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(C12655a.this.f33400a, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) this.f33419a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.InterfaceC13083a
        public void close() {
            String string;
            C12655a.this.m34405f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (C13008c.m36588n().m36542d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                C13219q0.m37817b(C12655a.this.f33400a, th.getMessage(), th);
                string = "";
            }
            C13392f.m38726a().m38728a((WebView) this.f33419a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$e */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CampaignEx f33421a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MBNativeAdvancedView f33422b;

        e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f33421a = campaignEx;
            this.f33422b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            C12655a.this.m34399a(this.f33421a, this.f33422b, false);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.advanced.manager.a$f */
    /* JADX INFO: compiled from: BaseNativeAdvancedShowManager.java */
    /* JADX INFO: loaded from: classes4.dex */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f33424a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CampaignEx f33425b;

        f(Context context, CampaignEx campaignEx) {
            this.f33424a = context;
            this.f33425b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13020j.m36706a(C13017g.m36693a(this.f33424a)).m36709b(this.f33425b.getId());
            } catch (Exception unused) {
                C13219q0.m37816b(C12655a.this.f33400a, "campain can't insert db");
            }
        }
    }

    public C12655a(Context context, String str, String str2) {
        this.f33409j = str2;
        this.f33410k = str;
        this.f33411l = new MBridgeIds(str, str2);
        if (this.f33408i == null) {
            ImageView imageView = new ImageView(context);
            this.f33408i = imageView;
            imageView.setPadding(C13229v0.m37876a(context, 2.0f), C13229v0.m37876a(context, 2.0f), C13229v0.m37876a(context, 2.0f), C13229v0.m37876a(context, 2.0f));
            m34393d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34382a(int i) {
        C12662d c12662d = this.f33403d;
        if (c12662d != null) {
            c12662d.m34528c(this.f33411l);
            this.f33403d = null;
            C12663a.m34538a(this.f33409j, this.f33401b);
        }
        C12663a.m34537a(this.f33409j, i, this.f33401b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f33402c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            m34404e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f33402c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f33414o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34383a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f33413n);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34385a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        m34386a(campaignEx, C13008c.m36588n().m36542d(), this.f33409j);
        campaignEx.setReport(true);
        C13091b.m37104a(this.f33409j, campaignEx, "h5_native");
        m34391b(campaignEx, C13008c.m36588n().m36542d(), this.f33409j);
        m34392c(campaignEx, C13008c.m36588n().m36542d(), this.f33409j);
    }

    /* JADX INFO: renamed from: a */
    private void m34386a(CampaignEx campaignEx, Context context, String str) {
        C13008c.m36588n().m36527a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            C12682a.m34606a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C12701a.f33766m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().m36915p() == null) {
            return;
        }
        C12682a.m34607a(context, campaignEx, str, campaignEx.getNativeVideoTracking().m36915p(), false, false);
    }

    /* JADX INFO: renamed from: b */
    private void m34391b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                C12682a.m34606a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C12701a.f33767n);
            } catch (Throwable th) {
                C13219q0.m37816b(this.f33400a, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m34392c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    C12682a.m34605a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                C13219q0.m37816b(this.f33400a, th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m34393d() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        this.f33408i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f33408i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(C13229v0.m37876a(contextM36542d, 29.0f), C13229v0.m37876a(contextM36542d, 16.0f));
        }
        this.f33408i.setLayoutParams(layoutParams);
        this.f33408i.setImageResource(contextM36542d.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", C13008c.m36588n().m36550i()));
    }

    /* JADX INFO: renamed from: h */
    private void m34394h() {
        if (this.f33401b.isReport()) {
            return;
        }
        m34385a(this.f33401b);
        C12663a.m34534a(C13008c.m36588n().m36542d(), this.f33401b, this.f33409j);
        C12662d c12662d = this.f33403d;
        if (c12662d != null) {
            c12662d.m34530e(this.f33411l);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m34395i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f33402c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f33401b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public String m34396a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f33401b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return C13092c.m37122b(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public void m34397a(C12661c c12661c) {
        this.f33405f = c12661c;
    }

    /* JADX INFO: renamed from: a */
    public void m34398a(C12662d c12662d) {
        this.f33403d = c12662d;
    }

    /* JADX INFO: renamed from: a */
    public void m34399a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewM37039a;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f33401b = campaignEx;
        this.f33402c = mBNativeAdvancedView;
        C13084b.m37036b().m37047a(this.f33409j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && C13084b.m37036b().m37050a() && (viewM37039a = C13084b.m37036b().m37039a(this.f33409j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewM37039a.getLayoutParams();
            } catch (Exception e2) {
                e2.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(C13084b.f35792e, C13084b.f35791d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewM37039a.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewM37039a);
            }
            mBNativeAdvancedView.addView(viewM37039a, layoutParams);
        }
        m34401a(this.f33406g);
        C12676b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        List<CampaignEx> arrayList = new ArrayList<>();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new C12676b(mBNativeAdvancedView.getContext(), this.f33410k, this.f33409j);
            advancedNativeSignalCommunicationImpl.m34583a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.m34580a(this.f33406g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.m34581a(this.f33415p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        C13185b1.m37632a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f33406g) {
            this.f33408i.setVisibility(8);
        }
        m34383a(this.f33408i);
        mBNativeAdvancedView.setCloseView(this.f33408i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        C13078l c13078lM37697a = C13200h.m37697a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f33405f == null || !c13078lM37697a.m36937a() || this.f33405f.m34516d() == null || this.f33405f.m34516d().getAlpha() < 0.5f || this.f33405f.m34516d().getVisibility() != 0 || this.f33412m) {
            if (z) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        C13200h.m37698a(arrayList, c13078lM37697a);
        mBNativeAdvancedView.show();
        C13008c.m36588n().m36527a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f33409j);
        C13084b.m37036b().m37046a(this.f33409j, campaignEx);
        CampaignEx campaignEx2 = this.f33401b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                AdSession adSessionM38945a = C13439b.m38945a(C13008c.m36588n().m36542d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f33401b);
                if (adSessionM38945a != null) {
                    advancedNativeWebview.setAdSession(adSessionM38945a);
                    adSessionM38945a.registerAdView(advancedNativeWebview);
                    adSessionM38945a.start();
                    C13219q0.m37813a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th) {
                C13219q0.m37813a("OMSDK", th.getMessage());
                CampaignEx campaignEx3 = this.f33401b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f33401b.getRequestIdNotice();
                    String id = this.f33401b.getId();
                    new C13146h(C13008c.m36588n().m36542d()).m37370a(requestId, requestIdNotice, id, this.f33409j, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        m34394h();
        if (campaignEx.isMraid()) {
            m34395i();
        }
        int i = this.f33407h;
        if (i != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i);
        }
        C12658d.m34482b(this.f33409j);
        C12654c.m34381b(this.f33410k + this.f33409j + campaignEx.getRequestId());
        this.f33414o.sendEmptyMessageDelayed(2, 1000L);
        C12684c.m34654a(C13008c.m36588n().m36542d(), this.f33401b.getMaitve(), this.f33401b.getMaitve_src());
    }

    /* JADX INFO: renamed from: a */
    public void mo34400a(CampaignEx campaignEx, boolean z, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m34401a(boolean z) {
        this.f33406g = z;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12659a m34402b() {
        return this.f33415p;
    }

    /* JADX INFO: renamed from: c */
    public String m34403c() {
        CampaignEx campaignEx = this.f33401b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f33401b.getRequestId();
    }

    /* JADX INFO: renamed from: e */
    public void m34404e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f33402c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        C13392f.m38726a().m38728a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    /* JADX INFO: renamed from: f */
    public void m34405f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f33402c == null || C13084b.f35793f || (advancedNativeWebview = this.f33402c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        C12675a.m34574a(advancedNativeWebview, "onViewAppeared", "");
    }

    /* JADX INFO: renamed from: g */
    public void m34406g() {
        if (this.f33403d != null) {
            this.f33403d = null;
        }
        if (this.f33415p != null) {
            this.f33415p = null;
        }
        if (this.f33413n != null) {
            this.f33413n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f33402c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f33402c.destroy();
        }
        if (this.f33405f != null) {
            this.f33405f = null;
        }
        C13084b.m37036b().m37054d(this.f33409j);
    }
}
